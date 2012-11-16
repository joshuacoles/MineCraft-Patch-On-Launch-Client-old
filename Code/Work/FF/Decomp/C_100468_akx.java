import java.util.Random;

public class C_100468_akx extends C_100253_aht {

   private C_100451_alf field_106385_a;


   protected C_100468_akx(int var1, C_100451_alf var2) {
      super(var1, 111);
      this.field_106385_a = var2;
      this.func_105972_b(true);
      float var3 = 0.125F;
      this.func_106008_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
      this.func_106034_a((C_101040_sq)null);
   }

   protected boolean func_106376_d_(int var1) {
      return var1 == C_100451_alf.field_106196_aD.field_106162_cm;
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      super.func_105996_b(var1, var2, var3, var4, var5);
      if(var1.func_109523_l(var2, var3 + 1, var4) >= 9) {
         float var6 = this.func_106384_n(var1, var2, var3, var4);
         if(var5.nextInt((int)(25.0F / var6) + 1) == 0) {
            int var7 = var1.func_109357_g(var2, var3, var4);
            if(var7 < 7) {
               ++var7;
               var1.func_109488_c(var2, var3, var4, var7);
            } else {
               if(var1.func_109349_a(var2 - 1, var3, var4) == this.field_106385_a.field_106162_cm) {
                  return;
               }

               if(var1.func_109349_a(var2 + 1, var3, var4) == this.field_106385_a.field_106162_cm) {
                  return;
               }

               if(var1.func_109349_a(var2, var3, var4 - 1) == this.field_106385_a.field_106162_cm) {
                  return;
               }

               if(var1.func_109349_a(var2, var3, var4 + 1) == this.field_106385_a.field_106162_cm) {
                  return;
               }

               int var8 = var5.nextInt(4);
               int var9 = var2;
               int var10 = var4;
               if(var8 == 0) {
                  var9 = var2 - 1;
               }

               if(var8 == 1) {
                  ++var9;
               }

               if(var8 == 2) {
                  var10 = var4 - 1;
               }

               if(var8 == 3) {
                  ++var10;
               }

               int var11 = var1.func_109349_a(var9, var3 - 1, var10);
               if(var1.func_109349_a(var9, var3, var10) == 0 && (var11 == C_100451_alf.field_106196_aD.field_106162_cm || var11 == C_100451_alf.field_106120_y.field_106162_cm || var11 == C_100451_alf.field_106121_x.field_106162_cm)) {
                  var1.func_109422_e(var9, var3, var10, this.field_106385_a.field_106162_cm);
               }
            }
         }
      }

   }

   public void func_106383_l(C_100873_xe var1, int var2, int var3, int var4) {
      var1.func_109488_c(var2, var3, var4, 7);
   }

   private float func_106384_n(C_100873_xe var1, int var2, int var3, int var4) {
      float var5 = 1.0F;
      int var6 = var1.func_109349_a(var2, var3, var4 - 1);
      int var7 = var1.func_109349_a(var2, var3, var4 + 1);
      int var8 = var1.func_109349_a(var2 - 1, var3, var4);
      int var9 = var1.func_109349_a(var2 + 1, var3, var4);
      int var10 = var1.func_109349_a(var2 - 1, var3, var4 - 1);
      int var11 = var1.func_109349_a(var2 + 1, var3, var4 - 1);
      int var12 = var1.func_109349_a(var2 + 1, var3, var4 + 1);
      int var13 = var1.func_109349_a(var2 - 1, var3, var4 + 1);
      boolean var14 = var8 == this.field_106162_cm || var9 == this.field_106162_cm;
      boolean var15 = var6 == this.field_106162_cm || var7 == this.field_106162_cm;
      boolean var16 = var10 == this.field_106162_cm || var11 == this.field_106162_cm || var12 == this.field_106162_cm || var13 == this.field_106162_cm;

      for(int var17 = var2 - 1; var17 <= var2 + 1; ++var17) {
         for(int var18 = var4 - 1; var18 <= var4 + 1; ++var18) {
            int var19 = var1.func_109349_a(var17, var3 - 1, var18);
            float var20 = 0.0F;
            if(var19 == C_100451_alf.field_106196_aD.field_106162_cm) {
               var20 = 1.0F;
               if(var1.func_109357_g(var17, var3 - 1, var18) > 0) {
                  var20 = 3.0F;
               }
            }

            if(var17 != var2 || var18 != var4) {
               var20 /= 4.0F;
            }

            var5 += var20;
         }
      }

      if(var16 || var14 && var15) {
         var5 /= 2.0F;
      }

      return var5;
   }

   public int func_106025_g_(int var1) {
      int var2 = var1 * 32;
      int var3 = 255 - var1 * 8;
      int var4 = var1 * 4;
      return var2 << 16 | var3 << 8 | var4;
   }

   public int func_106069_b(C_100837_xo var1, int var2, int var3, int var4) {
      return this.func_106025_g_(var1.func_109357_g(var2, var3, var4));
   }

   public int func_106029_a(int var1, int var2) {
      return this.field_106165_cl;
   }

   public void func_106059_f() {
      float var1 = 0.125F;
      this.func_106008_a(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      this.field_106152_cx = (double)((float)(var1.func_109357_g(var2, var3, var4) * 2 + 2) / 16.0F);
      float var5 = 0.125F;
      this.func_106008_a(0.5F - var5, 0.0F, 0.5F - var5, 0.5F + var5, (float)this.field_106152_cx, 0.5F + var5);
   }

   public int func_106013_d() {
      return 19;
   }

   public int func_106382_d(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      return var5 < 7?-1:(var1.func_109349_a(var2 - 1, var3, var4) == this.field_106385_a.field_106162_cm?0:(var1.func_109349_a(var2 + 1, var3, var4) == this.field_106385_a.field_106162_cm?1:(var1.func_109349_a(var2, var3, var4 - 1) == this.field_106385_a.field_106162_cm?2:(var1.func_109349_a(var2, var3, var4 + 1) == this.field_106385_a.field_106162_cm?3:-1))));
   }

   public void func_105998_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.func_105998_a(var1, var2, var3, var4, var5, var6, var7);
      if(!var1.field_109557_J) {
         C_100992_tt var8 = null;
         if(this.field_106385_a == C_100451_alf.field_106148_bd) {
            var8 = C_100992_tt.field_110877_bg;
         }

         if(this.field_106385_a == C_100451_alf.field_106131_bu) {
            var8 = C_100992_tt.field_110878_bh;
         }

         for(int var9 = 0; var9 < 3; ++var9) {
            if(var1.field_109577_u.nextInt(15) <= var5) {
               this.func_106042_a(var1, var2, var3, var4, new C_100994_tv(var8));
            }
         }

      }
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return -1;
   }

   public int func_106063_a(Random var1) {
      return 1;
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return this.field_106385_a == C_100451_alf.field_106148_bd?C_100992_tt.field_110877_bg.field_110891_cf:(this.field_106385_a == C_100451_alf.field_106131_bu?C_100992_tt.field_110878_bh.field_110891_cf:0);
   }
}
