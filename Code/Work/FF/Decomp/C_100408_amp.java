import java.util.Random;

public class C_100408_amp extends C_100200_aiq {

   public C_100408_amp(int var1) {
      super(var1, C_100664_afg.field_108996_F);
      this.func_106006_c(-1.0F);
   }

   public C_100398_amm func_106326_a(C_100873_xe var1) {
      return null;
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {}

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      C_100398_amm var7 = var1.func_109353_p(var2, var3, var4);
      if(var7 instanceof C_100406_amq) {
         ((C_100406_amq)var7).func_102947_f();
      } else {
         super.func_106041_a(var1, var2, var3, var4, var5, var6);
      }

   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return false;
   }

   public boolean func_106038_b_(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public int func_106013_d() {
      return -1;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      if(!var1.field_109557_J && var1.func_109353_p(var2, var3, var4) == null) {
         var1.func_109422_e(var2, var3, var4, 0);
         return true;
      } else {
         return false;
      }
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return 0;
   }

   public void func_105998_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.field_109557_J) {
         C_100406_amq var8 = this.func_106345_d(var1, var2, var3, var4);
         if(var8 != null) {
            C_100451_alf.field_106118_p[var8.func_102949_a()].func_106035_c(var1, var2, var3, var4, var8.func_102919_p(), 0);
         }
      }
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.field_109557_J && var1.func_109353_p(var2, var3, var4) == null) {
         ;
      }

   }

   public static C_100398_amm func_106346_a(int var0, int var1, int var2, boolean var3, boolean var4) {
      return new C_100406_amq(var0, var1, var2, var3, var4);
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      C_100406_amq var5 = this.func_106345_d(var1, var2, var3, var4);
      if(var5 == null) {
         return null;
      } else {
         float var6 = var5.func_102942_a(0.0F);
         if(var5.func_102950_b()) {
            var6 = 1.0F - var6;
         }

         return this.func_106344_b(var1, var2, var3, var4, var5.func_102949_a(), var6, var5.func_102945_c());
      }
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      C_100406_amq var5 = this.func_106345_d(var1, var2, var3, var4);
      if(var5 != null) {
         C_100451_alf var6 = C_100451_alf.field_106118_p[var5.func_102949_a()];
         if(var6 == null || var6 == this) {
            return;
         }

         var6.func_106007_a(var1, var2, var3, var4);
         float var7 = var5.func_102942_a(0.0F);
         if(var5.func_102950_b()) {
            var7 = 1.0F - var7;
         }

         int var8 = var5.func_102945_c();
         this.field_106156_ct = var6.func_106062_v() - (double)((float)C_100012_j.field_105264_b[var8] * var7);
         this.field_106155_cu = var6.func_106032_x() - (double)((float)C_100012_j.field_105265_c[var8] * var7);
         this.field_106154_cv = var6.func_105995_z() - (double)((float)C_100012_j.field_105262_d[var8] * var7);
         this.field_106153_cw = var6.func_106027_w() - (double)((float)C_100012_j.field_105264_b[var8] * var7);
         this.field_106152_cx = var6.func_106068_y() - (double)((float)C_100012_j.field_105265_c[var8] * var7);
         this.field_106151_cy = var6.func_106002_A() - (double)((float)C_100012_j.field_105262_d[var8] * var7);
      }

   }

   public C_100412_amr func_106344_b(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(var5 != 0 && var5 != this.field_106162_cm) {
         C_100412_amr var8 = C_100451_alf.field_106118_p[var5].func_106021_e(var1, var2, var3, var4);
         if(var8 == null) {
            return null;
         } else {
            if(C_100012_j.field_105264_b[var7] < 0) {
               var8.field_107917_a -= (double)((float)C_100012_j.field_105264_b[var7] * var6);
            } else {
               var8.field_107913_d -= (double)((float)C_100012_j.field_105264_b[var7] * var6);
            }

            if(C_100012_j.field_105265_c[var7] < 0) {
               var8.field_107915_b -= (double)((float)C_100012_j.field_105265_c[var7] * var6);
            } else {
               var8.field_107914_e -= (double)((float)C_100012_j.field_105265_c[var7] * var6);
            }

            if(C_100012_j.field_105262_d[var7] < 0) {
               var8.field_107916_c -= (double)((float)C_100012_j.field_105262_d[var7] * var6);
            } else {
               var8.field_107911_f -= (double)((float)C_100012_j.field_105262_d[var7] * var6);
            }

            return var8;
         }
      } else {
         return null;
      }
   }

   private C_100406_amq func_106345_d(C_100837_xo var1, int var2, int var3, int var4) {
      C_100398_amm var5 = var1.func_109353_p(var2, var3, var4);
      return var5 instanceof C_100406_amq?(C_100406_amq)var5:null;
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return 0;
   }
}
