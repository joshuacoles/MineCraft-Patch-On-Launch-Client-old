import java.util.List;
import java.util.Random;

public class C_100220_ahy extends C_100451_alf {

   public C_100220_ahy(int var1) {
      super(var1, C_100664_afg.field_109006_f);
      this.field_106165_cl = 154;
   }

   public int func_106029_a(int var1, int var2) {
      return var1 == 1?138:(var1 == 0?155:154);
   }

   public void func_105986_a(C_100873_xe var1, int var2, int var3, int var4, C_100412_amr var5, List var6, C_100730_lb var7) {
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
      super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      float var8 = 0.125F;
      this.func_106008_a(0.0F, 0.0F, 0.0F, var8, 1.0F, 1.0F);
      super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var8);
      super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      this.func_106008_a(1.0F - var8, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      this.func_106008_a(0.0F, 0.0F, 1.0F - var8, 1.0F, 1.0F, 1.0F);
      super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      this.func_106059_f();
   }

   public void func_106059_f() {
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public boolean func_105994_c() {
      return false;
   }

   public int func_106013_d() {
      return 24;
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      if(var1.field_109557_J) {
         return true;
      } else {
         C_100994_tv var10 = var5.field_103857_bK.func_104808_g();
         if(var10 == null) {
            return true;
         } else {
            int var11 = var1.func_109357_g(var2, var3, var4);
            if(var10.field_111397_c == C_100992_tt.field_110934_ax.field_110891_cf) {
               if(var11 < 3) {
                  if(!var5.field_103869_cf.field_111597_d) {
                     var5.field_103857_bK.func_103006_a(var5.field_103857_bK.field_104831_c, new C_100994_tv(C_100992_tt.field_110936_aw));
                  }

                  var1.func_109488_c(var2, var3, var4, 3);
               }

               return true;
            } else {
               if(var10.field_111397_c == C_100992_tt.field_110867_bt.field_110891_cf) {
                  if(var11 > 0) {
                     C_100994_tv var12 = new C_100994_tv(C_100992_tt.field_110864_bs, 1, 0);
                     if(!var5.field_103857_bK.func_104809_a(var12)) {
                        var1.func_109513_d(new C_100576_pg(var1, (double)var2 + 0.5D, (double)var3 + 1.5D, (double)var4 + 0.5D, var12));
                     } else if(var5 instanceof C_100762_ih) {
                        ((C_100762_ih)var5).func_104510_a(var5.field_103855_bL);
                     }

                     --var10.field_111398_a;
                     if(var10.field_111398_a <= 0) {
                        var5.field_103857_bK.func_103006_a(var5.field_103857_bK.field_104831_c, (C_100994_tv)null);
                     }

                     var1.func_109488_c(var2, var3, var4, var11 - 1);
                  }
               } else if(var11 > 0 && var10.func_111365_b() instanceof C_101042_sc && ((C_101042_sc)var10.func_111365_b()).func_111046_d() == C_101041_sd.field_111442_a) {
                  C_101042_sc var13 = (C_101042_sc)var10.func_111365_b();
                  var13.func_111047_c(var10);
                  var1.func_109488_c(var2, var3, var4, var11 - 1);
                  return true;
               }

               return true;
            }
         }
      }
   }

   public void func_106056_f(C_100873_xe var1, int var2, int var3, int var4) {
      if(var1.field_109577_u.nextInt(20) == 1) {
         int var5 = var1.func_109357_g(var2, var3, var4);
         if(var5 < 3) {
            var1.func_109488_c(var2, var3, var4, var5 + 1);
         }

      }
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100992_tt.field_110859_bz.field_110891_cf;
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100992_tt.field_110859_bz.field_110891_cf;
   }
}
