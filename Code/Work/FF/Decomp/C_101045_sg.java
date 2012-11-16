import java.util.Iterator;
import java.util.List;

public class C_101045_sg extends C_100992_tt {

   public C_101045_sg(int var1) {
      super(var1);
      this.field_110888_cg = 1;
      this.func_110802_a(C_101040_sq.field_111416_e);
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      float var4 = 1.0F;
      float var5 = var3.field_103179_C + (var3.field_103177_A - var3.field_103179_C) * var4;
      float var6 = var3.field_103178_B + (var3.field_103236_z - var3.field_103178_B) * var4;
      double var7 = var3.field_103227_q + (var3.field_103221_t - var3.field_103227_q) * (double)var4;
      double var9 = var3.field_103225_r + (var3.field_103219_u - var3.field_103225_r) * (double)var4 + 1.62D - (double)var3.field_103181_M;
      double var11 = var3.field_103223_s + (var3.field_103217_v - var3.field_103223_s) * (double)var4;
      C_100387_amw var13 = var2.func_109363_R().func_107878_a(var7, var9, var11);
      float var14 = C_100650_jv.func_108928_b(-var6 * 0.017453292F - 3.1415927F);
      float var15 = C_100650_jv.func_108924_a(-var6 * 0.017453292F - 3.1415927F);
      float var16 = -C_100650_jv.func_108928_b(-var5 * 0.017453292F);
      float var17 = C_100650_jv.func_108924_a(-var5 * 0.017453292F);
      float var18 = var15 * var16;
      float var20 = var14 * var16;
      double var21 = 5.0D;
      C_100387_amw var23 = var13.func_107856_c((double)var18 * var21, (double)var17 * var21, (double)var20 * var21);
      C_100383_amu var24 = var2.func_109390_a(var13, var23, true);
      if(var24 == null) {
         return var1;
      } else {
         C_100387_amw var25 = var3.func_103375_i(var4);
         boolean var26 = false;
         float var27 = 1.0F;
         List var28 = var2.func_109449_b(var3, var3.field_103173_D.func_107903_a(var25.field_107872_c * var21, var25.field_107869_d * var21, var25.field_107870_e * var21).func_107895_b((double)var27, (double)var27, (double)var27));
         Iterator var29 = var28.iterator();

         while(var29.hasNext()) {
            C_100730_lb var30 = (C_100730_lb)var29.next();
            if(var30.func_103123_L()) {
               float var31 = var30.func_103166_Y();
               C_100412_amr var32 = var30.field_103173_D.func_107895_b((double)var31, (double)var31, (double)var31);
               if(var32.func_107901_a(var13)) {
                  var26 = true;
               }
            }
         }

         if(var26) {
            return var1;
         } else {
            if(var24.field_107840_a == C_100389_amv.field_107877_a) {
               int var35 = var24.field_107838_b;
               int var33 = var24.field_107839_c;
               int var34 = var24.field_107836_d;
               if(!var2.field_109557_J) {
                  if(var2.func_109349_a(var35, var33, var34) == C_100451_alf.field_106181_aV.field_106162_cm) {
                     --var33;
                  }

                  var2.func_109513_d(new C_100572_pe(var2, (double)((float)var35 + 0.5F), (double)((float)var33 + 1.0F), (double)((float)var34 + 0.5F)));
               }

               if(!var3.field_103869_cf.field_111597_d) {
                  --var1.field_111398_a;
               }
            }

            return var1;
         }
      }
   }
}
