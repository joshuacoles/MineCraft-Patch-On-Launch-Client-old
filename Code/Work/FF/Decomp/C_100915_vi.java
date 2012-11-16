import java.util.ArrayList;

public class C_100915_vi implements C_100925_vs {

   public boolean func_110720_a(C_101068_rg var1, C_100873_xe var2) {
      C_100994_tv var3 = null;
      ArrayList var4 = new ArrayList();

      for(int var5 = 0; var5 < var1.func_103003_k_(); ++var5) {
         C_100994_tv var6 = var1.func_103007_a(var5);
         if(var6 != null) {
            if(var6.func_111365_b() instanceof C_101042_sc) {
               C_101042_sc var7 = (C_101042_sc)var6.func_111365_b();
               if(var7.func_111046_d() != C_101041_sd.field_111442_a || var3 != null) {
                  return false;
               }

               var3 = var6;
            } else {
               if(var6.field_111397_c != C_100992_tt.field_110904_aW.field_110891_cf) {
                  return false;
               }

               var4.add(var6);
            }
         }
      }

      return var3 != null && !var4.isEmpty();
   }

   public C_100994_tv func_110721_a(C_101068_rg var1) {
      C_100994_tv var2 = null;
      int[] var3 = new int[3];
      int var4 = 0;
      int var5 = 0;
      C_101042_sc var6 = null;

      int var7;
      int var9;
      float var10;
      float var11;
      int var17;
      for(var7 = 0; var7 < var1.func_103003_k_(); ++var7) {
         C_100994_tv var8 = var1.func_103007_a(var7);
         if(var8 != null) {
            if(var8.func_111365_b() instanceof C_101042_sc) {
               var6 = (C_101042_sc)var8.func_111365_b();
               if(var6.func_111046_d() != C_101041_sd.field_111442_a || var2 != null) {
                  return null;
               }

               var2 = var8.func_111360_l();
               if(var6.func_111045_b_(var8)) {
                  var9 = var6.func_111049_b(var2);
                  var10 = (float)(var9 >> 16 & 255) / 255.0F;
                  var11 = (float)(var9 >> 8 & 255) / 255.0F;
                  float var12 = (float)(var9 & 255) / 255.0F;
                  var4 = (int)((float)var4 + Math.max(var10, Math.max(var11, var12)) * 255.0F);
                  var3[0] = (int)((float)var3[0] + var10 * 255.0F);
                  var3[1] = (int)((float)var3[1] + var11 * 255.0F);
                  var3[2] = (int)((float)var3[2] + var12 * 255.0F);
                  ++var5;
               }
            } else {
               if(var8.field_111397_c != C_100992_tt.field_110904_aW.field_110891_cf) {
                  return null;
               }

               float[] var14 = C_100555_oo.field_103548_d[C_100230_aib.func_106367_e_(var8.func_111367_j())];
               int var16 = (int)(var14[0] * 255.0F);
               int var15 = (int)(var14[1] * 255.0F);
               var17 = (int)(var14[2] * 255.0F);
               var4 += Math.max(var16, Math.max(var15, var17));
               var3[0] += var16;
               var3[1] += var15;
               var3[2] += var17;
               ++var5;
            }
         }
      }

      if(var6 == null) {
         return null;
      } else {
         var7 = var3[0] / var5;
         int var13 = var3[1] / var5;
         var9 = var3[2] / var5;
         var10 = (float)var4 / (float)var5;
         var11 = (float)Math.max(var7, Math.max(var13, var9));
         var7 = (int)((float)var7 * var10 / var11);
         var13 = (int)((float)var13 * var10 / var11);
         var9 = (int)((float)var9 * var10 / var11);
         var17 = (var7 << 8) + var13;
         var17 = (var17 << 8) + var9;
         var6.func_111048_b(var2, var17);
         return var2;
      }
   }

   public int func_110722_a() {
      return 10;
   }

   public C_100994_tv func_110723_b() {
      return null;
   }
}
