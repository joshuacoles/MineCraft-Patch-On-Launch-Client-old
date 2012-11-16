import java.util.List;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100172_hd extends C_100009_o {

   public String func_105212_c() {
      return "tp";
   }

   public int func_105221_a() {
      return 2;
   }

   public String func_105211_a(C_100020_s var1) {
      return var1.func_102908_a("commands.tp.usage", new Object[0]);
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      if(var2.length < 1) {
         throw new C_100475_am("commands.tp.usage", new Object[0]);
      } else {
         C_100762_ih var3;
         if(var2.length != 2 && var2.length != 4) {
            var3 = func_105224_c(var1);
         } else {
            var3 = func_105213_c(var1, var2[0]);
            if(var3 == null) {
               throw new C_100464_ak();
            }
         }

         if(var2.length != 3 && var2.length != 4) {
            if(var2.length == 1 || var2.length == 2) {
               C_100762_ih var11 = func_105213_c(var1, var2[var2.length - 1]);
               if(var11 == null) {
                  throw new C_100464_ak();
               }

               var3.field_104518_a.func_107013_a(var11.field_103221_t, var11.field_103219_u, var11.field_103217_v, var11.field_103236_z, var11.field_103177_A);
               func_105226_a(var1, "commands.tp.success", new Object[]{var3.func_103139_an(), var11.func_103139_an()});
            }
         } else if(var3.field_103229_p != null) {
            int var4 = var2.length - 3;
            double var5 = this.func_105239_a(var1, var3.field_103221_t, var2[var4++]);
            double var7 = this.func_105240_a(var1, var3.field_103219_u, var2[var4++], 0, 0);
            double var9 = this.func_105239_a(var1, var3.field_103217_v, var2[var4++]);
            var3.func_103331_a(var5, var7, var9);
            func_105226_a(var1, "commands.tp.success.coordinates", new Object[]{var3.func_103139_an(), Double.valueOf(var5), Double.valueOf(var7), Double.valueOf(var9)});
         }

      }
   }

   private double func_105239_a(C_100020_s var1, double var2, String var4) {
      return this.func_105240_a(var1, var2, var4, -30000000, 30000000);
   }

   private double func_105240_a(C_100020_s var1, double var2, String var4, int var5, int var6) {
      boolean var7 = var4.startsWith("~");
      double var8 = var7?var2:0.0D;
      if(!var7 || var4.length() > 1) {
         boolean var10 = var4.contains(".");
         if(var7) {
            var4 = var4.substring(1);
         }

         var8 += func_105229_b(var1, var4);
         if(!var10 && !var7) {
            var8 += 0.5D;
         }
      }

      if(var5 != 0 || var6 != 0) {
         if(var8 < (double)var5) {
            throw new C_100467_ai("commands.generic.double.tooSmall", new Object[]{Double.valueOf(var8), Integer.valueOf(var5)});
         }

         if(var8 > (double)var6) {
            throw new C_100467_ai("commands.generic.double.tooBig", new Object[]{Double.valueOf(var8), Integer.valueOf(var6)});
         }
      }

      return var8;
   }

   public List func_105208_a(C_100020_s var1, String[] var2) {
      return var2.length != 1 && var2.length != 2?null:func_105225_a(var2, C_101445_MinecraftServer.func_104953_D().func_104890_A());
   }

   public boolean func_105209_a(int var1) {
      return var1 == 0;
   }
}
