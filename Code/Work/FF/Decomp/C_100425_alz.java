import java.util.Iterator;
import java.util.List;

public class C_100425_alz extends C_100398_amm implements C_100716_kl {

   public static final C_100690_kw[][] field_103051_a = new C_100690_kw[][]{{C_100690_kw.field_109168_c, C_100690_kw.field_109166_e}, {C_100690_kw.field_109173_m, C_100690_kw.field_109174_j}, {C_100690_kw.field_109164_g}, {C_100690_kw.field_109172_l}};
   private long field_103049_b;
   private float field_103050_c;
   private boolean field_103047_d;
   private int field_103048_e = -1;
   private int field_103045_f;
   private int field_103046_g;
   private C_100994_tv field_103052_h;


   public void func_102921_g() {
      if(this.field_102940_k.func_109463_E() % 80L == 0L) {
         this.func_103043_u();
         this.func_103036_t();
      }

   }

   private void func_103036_t() {
      if(this.field_103047_d && this.field_103048_e > 0 && !this.field_102940_k.field_109557_J && this.field_103045_f > 0) {
         double var1 = (double)(this.field_103048_e * 8 + 8);
         byte var3 = 0;
         if(this.field_103048_e >= 4 && this.field_103045_f == this.field_103046_g) {
            var3 = 1;
         }

         C_100412_amr var4 = C_100412_amr.func_107892_a().func_107844_a((double)this.field_102938_l, (double)this.field_102939_m, (double)this.field_102936_n, (double)(this.field_102938_l + 1), (double)(this.field_102939_m + 1), (double)(this.field_102936_n + 1)).func_107895_b(var1, var1, var1);
         List var5 = this.field_102940_k.func_109518_a(C_101095_qg.class, var4);
         Iterator var6 = var5.iterator();

         C_101095_qg var7;
         while(var6.hasNext()) {
            var7 = (C_101095_qg)var6.next();
            var7.func_103389_d(new C_100692_kx(this.field_103045_f, 180, var3, true));
         }

         if(this.field_103048_e >= 4 && this.field_103045_f != this.field_103046_g && this.field_103046_g > 0) {
            var6 = var5.iterator();

            while(var6.hasNext()) {
               var7 = (C_101095_qg)var6.next();
               var7.func_103389_d(new C_100692_kx(this.field_103046_g, 180, 0, true));
            }
         }
      }

   }

   private void func_103043_u() {
      if(!this.field_102940_k.func_109502_j(this.field_102938_l, this.field_102939_m + 1, this.field_102936_n)) {
         this.field_103047_d = false;
         this.field_103048_e = 0;
      } else {
         this.field_103047_d = true;
         this.field_103048_e = 0;

         for(int var1 = 1; var1 <= 4; this.field_103048_e = var1++) {
            int var2 = this.field_102939_m - var1;
            if(var2 < 1) {
               break;
            }

            boolean var3 = true;

            for(int var4 = this.field_102938_l - var1; var4 <= this.field_102938_l + var1 && var3; ++var4) {
               for(int var5 = this.field_102936_n - var1; var5 <= this.field_102936_n + var1; ++var5) {
                  int var6 = this.field_102940_k.func_109349_a(var4, var2, var5);
                  if(var6 != C_100451_alf.field_106215_bY.field_106162_cm && var6 != C_100451_alf.field_106224_ak.field_106162_cm && var6 != C_100451_alf.field_106193_aA.field_106162_cm && var6 != C_100451_alf.field_106226_al.field_106162_cm) {
                     var3 = false;
                     break;
                  }
               }
            }

            if(!var3) {
               break;
            }
         }

         if(this.field_103048_e == 0) {
            this.field_103047_d = false;
         }
      }

   }

   public float func_103037_v_() {
      if(!this.field_103047_d) {
         return 0.0F;
      } else {
         int var1 = (int)(this.field_102940_k.func_109463_E() - this.field_103049_b);
         this.field_103049_b = this.field_102940_k.func_109463_E();
         if(var1 > 1) {
            this.field_103050_c -= (float)var1 / 40.0F;
            if(this.field_103050_c < 0.0F) {
               this.field_103050_c = 0.0F;
            }
         }

         this.field_103050_c += 0.025F;
         if(this.field_103050_c > 1.0F) {
            this.field_103050_c = 1.0F;
         }

         return this.field_103050_c;
      }
   }

   public int func_103038_i() {
      return this.field_103045_f;
   }

   public int func_103044_j() {
      return this.field_103046_g;
   }

   public int func_103042_k() {
      return this.field_103048_e;
   }

   public void func_103041_c(int var1) {
      this.field_103048_e = var1;
   }

   public void func_103040_d(int var1) {
      this.field_103045_f = 0;

      for(int var2 = 0; var2 < this.field_103048_e && var2 < 3; ++var2) {
         C_100690_kw[] var3 = field_103051_a[var2];
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            C_100690_kw var6 = var3[var5];
            if(var6.field_109159_H == var1) {
               this.field_103045_f = var1;
               return;
            }
         }
      }

   }

   public void func_103039_e(int var1) {
      this.field_103046_g = 0;
      if(this.field_103048_e >= 4) {
         for(int var2 = 0; var2 < 4; ++var2) {
            C_100690_kw[] var3 = field_103051_a[var2];
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               C_100690_kw var6 = var3[var5];
               if(var6.field_109159_H == var1) {
                  this.field_103046_g = var1;
                  return;
               }
            }
         }
      }

   }

   public C_100219_dx func_102924_l() {
      C_100353_bh var1 = new C_100353_bh();
      this.func_102915_b(var1);
      return new C_100271_ey(this.field_102938_l, this.field_102939_m, this.field_102936_n, 3, var1);
   }

   public double func_102923_m() {
      return 65536.0D;
   }

   public void func_102925_a(C_100353_bh var1) {
      super.func_102925_a(var1);
      this.field_103045_f = var1.func_107514_e("Primary");
      this.field_103046_g = var1.func_107514_e("Secondary");
      this.field_103048_e = var1.func_107514_e("Levels");
   }

   public void func_102915_b(C_100353_bh var1) {
      super.func_102915_b(var1);
      var1.func_107520_a("Primary", this.field_103045_f);
      var1.func_107520_a("Secondary", this.field_103046_g);
      var1.func_107520_a("Levels", this.field_103048_e);
   }

   public int func_103003_k_() {
      return 1;
   }

   public C_100994_tv func_103007_a(int var1) {
      return var1 == 0?this.field_103052_h:null;
   }

   public C_100994_tv func_103002_a(int var1, int var2) {
      if(var1 == 0 && this.field_103052_h != null) {
         if(var2 >= this.field_103052_h.field_111398_a) {
            C_100994_tv var3 = this.field_103052_h;
            this.field_103052_h = null;
            return var3;
         } else {
            this.field_103052_h.field_111398_a -= var2;
            return new C_100994_tv(this.field_103052_h.field_111397_c, var2, this.field_103052_h.func_111367_j());
         }
      } else {
         return null;
      }
   }

   public C_100994_tv func_103001_a_(int var1) {
      if(var1 == 0 && this.field_103052_h != null) {
         C_100994_tv var2 = this.field_103052_h;
         this.field_103052_h = null;
         return var2;
      } else {
         return null;
      }
   }

   public void func_103006_a(int var1, C_100994_tv var2) {
      if(var1 == 0) {
         this.field_103052_h = var2;
      }

   }

   public String func_103005_b() {
      return "container.beacon";
   }

   public int func_103008_c() {
      return 1;
   }

   public boolean func_103010_a(C_101095_qg var1) {
      return this.field_102940_k.func_109353_p(this.field_102938_l, this.field_102939_m, this.field_102936_n) != this?false:var1.func_103146_e((double)this.field_102938_l + 0.5D, (double)this.field_102939_m + 0.5D, (double)this.field_102936_n + 0.5D) <= 64.0D;
   }

   public void func_103004_l_() {}

   public void func_103009_f() {}

}
