import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;

public class C_100907_axh {

   private final Minecraft field_110689_a;
   private final List field_110688_b = new ArrayList();


   public C_100907_axh(Minecraft var1) {
      this.field_110689_a = var1;
      this.func_110684_a();
   }

   public void func_110684_a() {
      try {
         C_100353_bh var1 = C_100329_br.func_107547_a(new File(this.field_110689_a.field_105093_D, "servers.dat"));
         C_100339_bp var2 = var1.func_107513_m("servers");
         this.field_110688_b.clear();

         for(int var3 = 0; var3 < var2.func_107501_c(); ++var3) {
            this.field_110688_b.add(C_100909_axg.func_110699_a((C_100353_bh)var2.func_107498_b(var3)));
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   public void func_110685_b() {
      try {
         C_100339_bp var1 = new C_100339_bp();
         Iterator var2 = this.field_110688_b.iterator();

         while(var2.hasNext()) {
            C_100909_axg var3 = (C_100909_axg)var2.next();
            var1.func_107500_a(var3.func_110701_a());
         }

         C_100353_bh var5 = new C_100353_bh();
         var5.func_107530_a("servers", var1);
         C_100329_br.func_107549_a(var5, new File(this.field_110689_a.field_105093_D, "servers.dat"));
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   public C_100909_axg func_110680_a(int var1) {
      return (C_100909_axg)this.field_110688_b.get(var1);
   }

   public void func_110681_b(int var1) {
      this.field_110688_b.remove(var1);
   }

   public void func_110682_a(C_100909_axg var1) {
      this.field_110688_b.add(var1);
   }

   public int func_110686_c() {
      return this.field_110688_b.size();
   }

   public void func_110687_a(int var1, int var2) {
      C_100909_axg var3 = this.func_110680_a(var1);
      this.field_110688_b.set(var1, this.func_110680_a(var2));
      this.field_110688_b.set(var2, var3);
      this.func_110685_b();
   }

   public void func_110683_a(int var1, C_100909_axg var2) {
      this.field_110688_b.set(var1, var2);
   }

   public static void func_110679_b(C_100909_axg var0) {
      C_100907_axh var1 = new C_100907_axh(Minecraft.func_105091_x());
      var1.func_110684_a();

      for(int var2 = 0; var2 < var1.func_110686_c(); ++var2) {
         C_100909_axg var3 = var1.func_110680_a(var2);
         if(var3.field_110711_a.equals(var0.field_110711_a) && var3.field_110709_b.equals(var0.field_110709_b)) {
            var1.func_110683_a(var2, var0);
            break;
         }
      }

      var1.func_110685_b();
   }
}
