import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class C_100433_alr extends C_100451_alf {

   public C_100433_alr(int var1) {
      super(var1, 173, C_100664_afg.field_109027_q);
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.15625F, 1.0F);
      this.func_105972_b(true);
   }

   public int func_106000_r_() {
      return 10;
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public int func_106055_n() {
      return 1;
   }

   public int func_106013_d() {
      return 30;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100992_tt.field_110819_K.field_110891_cf;
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100992_tt.field_110819_K.field_110891_cf;
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.func_109357_g(var2, var3, var4);
      boolean var7 = (var6 & 2) == 2;
      boolean var8 = !var1.func_109348_t(var2, var3 - 1, var4);
      if(var7 != var8) {
         this.func_106035_c(var1, var2, var3, var4, var6, 0);
         var1.func_109422_e(var2, var3, var4, 0);
      }

   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      boolean var6 = (var5 & 4) == 4;
      boolean var7 = (var5 & 2) == 2;
      if(!var7) {
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.09375F, 1.0F);
      } else if(!var6) {
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      } else {
         this.func_106008_a(0.0F, 0.0625F, 0.0F, 1.0F, 0.15625F, 1.0F);
      }

   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109348_t(var2, var3 - 1, var4)?0:2;
      var1.func_109488_c(var2, var3, var4, var5);
      this.func_106410_d(var1, var2, var3, var4, var5);
   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      this.func_106410_d(var1, var2, var3, var4, var6 | 1);
   }

   public void func_106060_a(C_100873_xe var1, int var2, int var3, int var4, int var5, C_101095_qg var6) {
      if(!var1.field_109557_J) {
         if(var6.func_103780_bP() != null && var6.func_103780_bP().field_111397_c == C_100992_tt.field_110883_be.field_110891_cf) {
            var1.func_109488_c(var2, var3, var4, var5 | 8);
         }

      }
   }

   private void func_106410_d(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;

      while(var6 < 2) {
         int var7 = 1;

         while(true) {
            if(var7 < 42) {
               int var8 = var2 + C_100015_i.field_105283_a[var6] * var7;
               int var9 = var4 + C_100015_i.field_105281_b[var6] * var7;
               int var10 = var1.func_109349_a(var8, var3, var9);
               if(var10 == C_100451_alf.field_106219_bW.field_106162_cm) {
                  int var11 = var1.func_109357_g(var8, var3, var9) & 3;
                  if(var11 == C_100015_i.field_105277_f[var6]) {
                     C_100451_alf.field_106219_bW.func_106412_a(var1, var8, var3, var9, var10, var1.func_109357_g(var8, var3, var9), true, var7, var5);
                  }
               } else if(var10 == C_100451_alf.field_106217_bX.field_106162_cm) {
                  ++var7;
                  continue;
               }
            }

            ++var6;
            break;
         }
      }

   }

   public void func_106011_a(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5) {
      if(!var1.field_109557_J) {
         if((var1.func_109357_g(var2, var3, var4) & 1) != 1) {
            this.func_106409_l(var1, var2, var3, var4);
         }
      }
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(!var1.field_109557_J) {
         if((var1.func_109357_g(var2, var3, var4) & 1) == 1) {
            this.func_106409_l(var1, var2, var3, var4);
         }
      }
   }

   private void func_106409_l(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      boolean var6 = (var5 & 1) == 1;
      boolean var7 = false;
      List var8 = var1.func_109449_b((C_100730_lb)null, C_100412_amr.func_107892_a().func_107844_a((double)var2 + this.field_106156_ct, (double)var3 + this.field_106155_cu, (double)var4 + this.field_106154_cv, (double)var2 + this.field_106153_cw, (double)var3 + this.field_106152_cx, (double)var4 + this.field_106151_cy));
      if(!var8.isEmpty()) {
         Iterator var9 = var8.iterator();

         while(var9.hasNext()) {
            C_100730_lb var10 = (C_100730_lb)var9.next();
            if(!var10.func_103076_au()) {
               var7 = true;
               break;
            }
         }
      }

      if(var7 && !var6) {
         var5 |= 1;
      }

      if(!var7 && var6) {
         var5 &= -2;
      }

      if(var7 != var6) {
         var1.func_109488_c(var2, var3, var4, var5);
         this.func_106410_d(var1, var2, var3, var4, var5);
      }

      if(var7) {
         var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_());
      }

   }

   public static boolean func_106408_a(C_100837_xo var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + C_100015_i.field_105283_a[var5];
      int var8 = var3 + C_100015_i.field_105281_b[var5];
      int var9 = var0.func_109349_a(var6, var2, var8);
      boolean var10 = (var4 & 2) == 2;
      int var11;
      if(var9 == C_100451_alf.field_106219_bW.field_106162_cm) {
         var11 = var0.func_109357_g(var6, var2, var8);
         int var13 = var11 & 3;
         return var13 == C_100015_i.field_105277_f[var5];
      } else if(var9 == C_100451_alf.field_106217_bX.field_106162_cm) {
         var11 = var0.func_109357_g(var6, var2, var8);
         boolean var12 = (var11 & 2) == 2;
         return var10 == var12;
      } else {
         return false;
      }
   }
}
