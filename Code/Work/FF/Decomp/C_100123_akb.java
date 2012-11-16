import java.util.Random;

public class C_100123_akb extends C_100167_ajb {

   public C_100123_akb(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109000_C, false);
      this.func_105972_b(true);
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      super.func_105996_b(var1, var2, var3, var4, var5);
      if(var1.field_109576_v.func_112390_d() && var5.nextInt(2000) < var1.field_109578_t) {
         int var6;
         for(var6 = var3; !var1.func_109348_t(var2, var6, var4) && var6 > 0; --var6) {
            ;
         }

         if(var6 > 0 && !var1.func_109360_s(var2, var6 + 1, var4)) {
            C_100730_lb var7 = C_100997_ua.func_111004_a(var1, 57, (double)var2 + 0.5D, (double)var6 + 1.1D, (double)var4 + 0.5D);
            if(var7 != null) {
               var7.field_103228_an = var7.func_103103_ab();
            }
         }
      }

   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return null;
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      float var5;
      float var6;
      if(var1.func_109349_a(var2 - 1, var3, var4) != this.field_106162_cm && var1.func_109349_a(var2 + 1, var3, var4) != this.field_106162_cm) {
         var5 = 0.125F;
         var6 = 0.5F;
         this.func_106008_a(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
      } else {
         var5 = 0.5F;
         var6 = 0.125F;
         this.func_106008_a(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
      }

   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_106288_i_(C_100873_xe var1, int var2, int var3, int var4) {
      byte var5 = 0;
      byte var6 = 0;
      if(var1.func_109349_a(var2 - 1, var3, var4) == C_100451_alf.field_106210_as.field_106162_cm || var1.func_109349_a(var2 + 1, var3, var4) == C_100451_alf.field_106210_as.field_106162_cm) {
         var5 = 1;
      }

      if(var1.func_109349_a(var2, var3, var4 - 1) == C_100451_alf.field_106210_as.field_106162_cm || var1.func_109349_a(var2, var3, var4 + 1) == C_100451_alf.field_106210_as.field_106162_cm) {
         var6 = 1;
      }

      if(var5 == var6) {
         return false;
      } else {
         if(var1.func_109349_a(var2 - var5, var3, var4 - var6) == 0) {
            var2 -= var5;
            var4 -= var6;
         }

         int var7;
         int var8;
         for(var7 = -1; var7 <= 2; ++var7) {
            for(var8 = -1; var8 <= 3; ++var8) {
               boolean var9 = var7 == -1 || var7 == 2 || var8 == -1 || var8 == 3;
               if(var7 != -1 && var7 != 2 || var8 != -1 && var8 != 3) {
                  int var10 = var1.func_109349_a(var2 + var5 * var7, var3 + var8, var4 + var6 * var7);
                  if(var9) {
                     if(var10 != C_100451_alf.field_106210_as.field_106162_cm) {
                        return false;
                     }
                  } else if(var10 != 0 && var10 != C_100451_alf.field_106222_au.field_106162_cm) {
                     return false;
                  }
               }
            }
         }

         var1.field_109579_s = true;

         for(var7 = 0; var7 < 2; ++var7) {
            for(var8 = 0; var8 < 3; ++var8) {
               var1.func_109422_e(var2 + var5 * var7, var3 + var8, var4 + var6 * var7, C_100451_alf.field_106143_bh.field_106162_cm);
            }
         }

         var1.field_109579_s = false;
         return true;
      }
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      byte var6 = 0;
      byte var7 = 1;
      if(var1.func_109349_a(var2 - 1, var3, var4) == this.field_106162_cm || var1.func_109349_a(var2 + 1, var3, var4) == this.field_106162_cm) {
         var6 = 1;
         var7 = 0;
      }

      int var8;
      for(var8 = var3; var1.func_109349_a(var2, var8 - 1, var4) == this.field_106162_cm; --var8) {
         ;
      }

      if(var1.func_109349_a(var2, var8 - 1, var4) != C_100451_alf.field_106210_as.field_106162_cm) {
         var1.func_109422_e(var2, var3, var4, 0);
      } else {
         int var9;
         for(var9 = 1; var9 < 4 && var1.func_109349_a(var2, var8 + var9, var4) == this.field_106162_cm; ++var9) {
            ;
         }

         if(var9 == 3 && var1.func_109349_a(var2, var8 + var9, var4) == C_100451_alf.field_106210_as.field_106162_cm) {
            boolean var10 = var1.func_109349_a(var2 - 1, var3, var4) == this.field_106162_cm || var1.func_109349_a(var2 + 1, var3, var4) == this.field_106162_cm;
            boolean var11 = var1.func_109349_a(var2, var3, var4 - 1) == this.field_106162_cm || var1.func_109349_a(var2, var3, var4 + 1) == this.field_106162_cm;
            if(var10 && var11) {
               var1.func_109422_e(var2, var3, var4, 0);
            } else {
               if((var1.func_109349_a(var2 + var6, var3, var4 + var7) != C_100451_alf.field_106210_as.field_106162_cm || var1.func_109349_a(var2 - var6, var3, var4 - var7) != this.field_106162_cm) && (var1.func_109349_a(var2 - var6, var3, var4 - var7) != C_100451_alf.field_106210_as.field_106162_cm || var1.func_109349_a(var2 + var6, var3, var4 + var7) != this.field_106162_cm)) {
                  var1.func_109422_e(var2, var3, var4, 0);
               }

            }
         } else {
            var1.func_109422_e(var2, var3, var4, 0);
         }
      }
   }

   public boolean func_105976_a(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      if(var1.func_109349_a(var2, var3, var4) == this.field_106162_cm) {
         return false;
      } else {
         boolean var6 = var1.func_109349_a(var2 - 1, var3, var4) == this.field_106162_cm && var1.func_109349_a(var2 - 2, var3, var4) != this.field_106162_cm;
         boolean var7 = var1.func_109349_a(var2 + 1, var3, var4) == this.field_106162_cm && var1.func_109349_a(var2 + 2, var3, var4) != this.field_106162_cm;
         boolean var8 = var1.func_109349_a(var2, var3, var4 - 1) == this.field_106162_cm && var1.func_109349_a(var2, var3, var4 - 2) != this.field_106162_cm;
         boolean var9 = var1.func_109349_a(var2, var3, var4 + 1) == this.field_106162_cm && var1.func_109349_a(var2, var3, var4 + 2) != this.field_106162_cm;
         boolean var10 = var6 || var7;
         boolean var11 = var8 || var9;
         return var10 && var5 == 4?true:(var10 && var5 == 5?true:(var11 && var5 == 2?true:var11 && var5 == 3));
      }
   }

   public int func_106063_a(Random var1) {
      return 0;
   }

   public int func_106055_n() {
      return 1;
   }

   public void func_106011_a(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5) {
      if(var5.field_103207_o == null && var5.field_103206_n == null) {
         var5.func_103119_aa();
      }

   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(var5.nextInt(100) == 0) {
         var1.func_109541_b((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "portal.portal", 0.5F, var5.nextFloat() * 0.4F + 0.8F);
      }

      for(int var6 = 0; var6 < 4; ++var6) {
         double var7 = (double)((float)var2 + var5.nextFloat());
         double var9 = (double)((float)var3 + var5.nextFloat());
         double var11 = (double)((float)var4 + var5.nextFloat());
         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = 0.0D;
         int var19 = var5.nextInt(2) * 2 - 1;
         var13 = ((double)var5.nextFloat() - 0.5D) * 0.5D;
         var15 = ((double)var5.nextFloat() - 0.5D) * 0.5D;
         var17 = ((double)var5.nextFloat() - 0.5D) * 0.5D;
         if(var1.func_109349_a(var2 - 1, var3, var4) != this.field_106162_cm && var1.func_109349_a(var2 + 1, var3, var4) != this.field_106162_cm) {
            var7 = (double)var2 + 0.5D + 0.25D * (double)var19;
            var13 = (double)(var5.nextFloat() * 2.0F * (float)var19);
         } else {
            var11 = (double)var4 + 0.5D + 0.25D * (double)var19;
            var17 = (double)(var5.nextFloat() * 2.0F * (float)var19);
         }

         var1.func_109428_a("portal", var7, var9, var11, var13, var15, var17);
      }

   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return 0;
   }
}
