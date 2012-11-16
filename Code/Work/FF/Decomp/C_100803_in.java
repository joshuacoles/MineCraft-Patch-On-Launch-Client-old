import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public abstract class C_100803_in {

   public static Logger field_105779_a = Logger.getLogger("Minecraft");
   private final C_101445_MinecraftServer field_105778_c;
   private final List field_105776_d = Collections.synchronizedList(new ArrayList());
   public volatile boolean field_105777_b = false;


   public C_100803_in(C_101445_MinecraftServer var1) {
      this.field_105778_c = var1;
      this.field_105777_b = true;
   }

   public void func_105772_a(C_100801_im var1) {
      this.field_105776_d.add(var1);
   }

   public void func_105773_a() {
      this.field_105777_b = false;
   }

   public void func_105775_b() {
      for(int var1 = 0; var1 < this.field_105776_d.size(); ++var1) {
         C_100801_im var2 = (C_100801_im)this.field_105776_d.get(var1);

         try {
            var2.func_107014_d();
         } catch (Exception var4) {
            field_105779_a.log(Level.WARNING, "Failed to handle packet: " + var4, var4);
            var2.func_107010_c("Internal server error");
         }

         if(var2.field_107020_c) {
            this.field_105776_d.remove(var1--);
         }

         var2.field_107019_b.func_107417_a();
      }

   }

   public C_101445_MinecraftServer func_105774_d() {
      return this.field_105778_c;
   }

}
