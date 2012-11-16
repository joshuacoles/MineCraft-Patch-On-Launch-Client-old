import java.util.Random;

public class C_100584_aaz extends C_100562_aan {

   private int field_108022_a;
   private int field_108021_b;


   public C_100584_aaz(int var1, int var2) {
      this.field_108022_a = var1;
      this.field_108021_b = var2;
   }

   public boolean func_107965_a(C_100873_xe var1, Random var2, int var3, int var4, int var5) {
      float var6 = var2.nextFloat() * 3.1415927F;
      double var7 = (double)((float)(var3 + 8) + C_100650_jv.func_108924_a(var6) * (float)this.field_108021_b / 8.0F);
      double var9 = (double)((float)(var3 + 8) - C_100650_jv.func_108924_a(var6) * (float)this.field_108021_b / 8.0F);
      double var11 = (double)((float)(var5 + 8) + C_100650_jv.func_108928_b(var6) * (float)this.field_108021_b / 8.0F);
      double var13 = (double)((float)(var5 + 8) - C_100650_jv.func_108928_b(var6) * (float)this.field_108021_b / 8.0F);
      double var15 = (double)(var4 + var2.nextInt(3) - 2);
      double var17 = (double)(var4 + var2.nextInt(3) - 2);

      for(int var19 = 0; var19 <= this.field_108021_b; ++var19) {
         double var20 = var7 + (var9 - var7) * (double)var19 / (double)this.field_108021_b;
         double var22 = var15 + (var17 - var15) * (double)var19 / (double)this.field_108021_b;
         double var24 = var11 + (var13 - var11) * (double)var19 / (double)this.field_108021_b;
         double var26 = var2.nextDouble() * (double)this.field_108021_b / 16.0D;
         double var28 = (double)(C_100650_jv.func_108924_a((float)var19 * 3.1415927F / (float)this.field_108021_b) + 1.0F) * var26 + 1.0D;
         double var30 = (double)(C_100650_jv.func_108924_a((float)var19 * 3.1415927F / (float)this.field_108021_b) + 1.0F) * var26 + 1.0D;
         int var32 = C_100650_jv.func_108910_c(var20 - var28 / 2.0D);
         int var33 = C_100650_jv.func_108910_c(var22 - var30 / 2.0D);
         int var34 = C_100650_jv.func_108910_c(var24 - var28 / 2.0D);
         int var35 = C_100650_jv.func_108910_c(var20 + var28 / 2.0D);
         int var36 = C_100650_jv.func_108910_c(var22 + var30 / 2.0D);
         int var37 = C_100650_jv.func_108910_c(var24 + var28 / 2.0D);

         for(int var38 = var32; var38 <= var35; ++var38) {
            double var39 = ((double)var38 + 0.5D - var20) / (var28 / 2.0D);
            if(var39 * var39 < 1.0D) {
               for(int var41 = var33; var41 <= var36; ++var41) {
                  double var42 = ((double)var41 + 0.5D - var22) / (var30 / 2.0D);
                  if(var39 * var39 + var42 * var42 < 1.0D) {
                     for(int var44 = var34; var44 <= var37; ++var44) {
                        double var45 = ((double)var44 + 0.5D - var24) / (var28 / 2.0D);
                        if(var39 * var39 + var42 * var42 + var45 * var45 < 1.0D && var1.func_109349_a(var38, var41, var44) == C_100451_alf.field_106111_w.field_106162_cm) {
                           var1.func_109378_b(var38, var41, var44, this.field_108022_a);
                        }
                     }
                  }
               }
            }
         }
      }

      return true;
   }
}
