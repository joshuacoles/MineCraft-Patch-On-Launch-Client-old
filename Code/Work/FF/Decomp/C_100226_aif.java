import java.util.Random;

public class C_100226_aif extends C_100253_aht {

   protected C_100226_aif(int var1, int var2) {
      super(var1, var2);
      this.field_106165_cl = var2;
      this.func_105972_b(true);
      float var3 = 0.5F;
      this.func_106008_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
      this.func_106034_a((C_101040_sq)null);
      this.func_106006_c(0.0F);
      this.func_106014_a(field_106098_g);
      this.func_106015_D();
      this.func_105983_r();
   }

   protected boolean func_106376_d_(int var1) {
      return var1 == C_100451_alf.field_106196_aD.field_106162_cm;
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      super.func_105996_b(var1, var2, var3, var4, var5);
      if(var1.func_109523_l(var2, var3 + 1, var4) >= 9) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         if(var6 < 7) {
            float var7 = this.func_106380_l(var1, var2, var3, var4);
            if(var5.nextInt((int)(25.0F / var7) + 1) == 0) {
               ++var6;
               var1.func_109488_c(var2, var3, var4, var6);
            }
         }
      }

   }

   public void func_106378_c_(C_100873_xe var1, int var2, int var3, int var4) {
      var1.func_109488_c(var2, var3, var4, 7);
   }

   private float func_106380_l(C_100873_xe var1, int var2, int var3, int var4) {
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

   public int func_106029_a(int var1, int var2) {
      if(var2 < 0) {
         var2 = 7;
      }

      return this.field_106165_cl + var2;
   }

   public int func_106013_d() {
      return 6;
   }

   protected int func_106379_h() {
      return C_100992_tt.field_110826_S.field_110891_cf;
   }

   protected int func_106381_j() {
      return C_100992_tt.field_110821_T.field_110891_cf;
   }

   public void func_105998_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.func_105998_a(var1, var2, var3, var4, var5, var6, 0);
      if(!var1.field_109557_J) {
         if(var5 >= 7) {
            int var8 = 3 + var7;

            for(int var9 = 0; var9 < var8; ++var9) {
               if(var1.field_109577_u.nextInt(15) <= var5) {
                  this.func_106042_a(var1, var2, var3, var4, new C_100994_tv(this.func_106379_h(), 1, 0));
               }
            }
         }

      }
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return var1 == 7?this.func_106381_j():this.func_106379_h();
   }

   public int func_106063_a(Random var1) {
      return 1;
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return this.func_106379_h();
   }
}
