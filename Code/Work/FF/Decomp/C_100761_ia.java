import java.util.Iterator;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100761_ia implements C_100831_xk {

   private C_101445_MinecraftServer field_109779_a;
   private C_100765_ie field_109778_b;


   public C_100761_ia(C_101445_MinecraftServer var1, C_100765_ie var2) {
      this.field_109779_a = var1;
      this.field_109778_b = var2;
   }

   public void func_109704_a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {}

   public void func_109698_a(C_100730_lb var1) {
      this.field_109778_b.func_109617_p().func_109783_a(var1);
   }

   public void func_109703_b(C_100730_lb var1) {
      this.field_109778_b.func_109617_p().func_109784_b(var1);
   }

   public void func_109699_a(String var1, double var2, double var4, double var6, float var8, float var9) {
      this.field_109779_a.func_104931_ad().func_105730_a(var2, var4, var6, var8 > 1.0F?(double)(16.0F * var8):16.0D, this.field_109778_b.field_109576_v.field_112401_h, new C_100254_dn(var1, var2, var4, var6, var8, var9));
   }

   public void func_109702_a(int var1, int var2, int var3, int var4, int var5, int var6) {}

   public void func_109705_a(int var1, int var2, int var3) {
      this.field_109778_b.func_109602_r().func_109674_a(var1, var2, var3);
   }

   public void func_109707_b(int var1, int var2, int var3) {}

   public void func_109697_a(String var1, int var2, int var3, int var4) {}

   public void func_109700_a(C_101095_qg var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_109779_a.func_104931_ad().func_105696_a(var1, (double)var3, (double)var4, (double)var5, 64.0D, this.field_109778_b.field_109576_v.field_112401_h, new C_100248_dm(var2, var3, var4, var5, var6, false));
   }

   public void func_109701_a(int var1, int var2, int var3, int var4, int var5) {
      this.field_109779_a.func_104931_ad().func_105733_a(new C_100248_dm(var1, var2, var3, var4, var5, true));
   }

   public void func_109706_b(int var1, int var2, int var3, int var4, int var5) {
      Iterator var6 = this.field_109779_a.func_104931_ad().field_105743_b.iterator();

      while(var6.hasNext()) {
         C_100762_ih var7 = (C_100762_ih)var6.next();
         if(var7 != null && var7.field_103229_p == this.field_109778_b && var7.field_103212_k != var1) {
            double var8 = (double)var2 - var7.field_103221_t;
            double var10 = (double)var3 - var7.field_103219_u;
            double var12 = (double)var4 - var7.field_103217_v;
            if(var8 * var8 + var10 * var10 + var12 * var12 < 1024.0D) {
               var7.field_104518_a.func_107009_b(new C_100265_ex(var1, var2, var3, var4, var5));
            }
         }
      }

   }
}
