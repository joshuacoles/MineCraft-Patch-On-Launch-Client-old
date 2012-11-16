import java.util.Random;

public class C_100210_aiv extends C_100451_alf {

   public C_100210_aiv(int var1) {
      super(var1, C_100664_afg.field_109027_q);
      this.field_106165_cl = 186;
      this.func_106059_f();
      this.func_105983_r();
   }

   public void func_106059_f() {
      float var1 = 0.375F;
      float var2 = var1 / 2.0F;
      this.func_106008_a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, var1, 0.5F + var2);
   }

   public boolean func_105994_c() {
      return false;
   }

   public int func_106013_d() {
      return 33;
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      C_100994_tv var10 = var5.field_103857_bK.func_104808_g();
      if(var10 == null) {
         return false;
      } else if(var1.func_109357_g(var2, var3, var4) != 0) {
         return false;
      } else {
         int var11 = func_106364_a(var10);
         if(var11 > 0) {
            var1.func_109488_c(var2, var3, var4, var11);
            if(!var5.field_103869_cf.field_111597_d && --var10.field_111398_a <= 0) {
               var5.field_103857_bK.func_103006_a(var5.field_103857_bK.field_104831_c, (C_100994_tv)null);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      C_100994_tv var5 = func_106365_c(var1.func_109357_g(var2, var3, var4));
      return var5 == null?C_100992_tt.field_110945_bJ.field_110891_cf:var5.field_111397_c;
   }

   public int func_106019_h(C_100873_xe var1, int var2, int var3, int var4) {
      C_100994_tv var5 = func_106365_c(var1.func_109357_g(var2, var3, var4));
      return var5 == null?C_100992_tt.field_110945_bJ.field_110891_cf:var5.func_111367_j();
   }

   public boolean func_106053_u_() {
      return true;
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return super.func_106023_b(var1, var2, var3, var4) && var1.func_109348_t(var2, var3 - 1, var4);
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.func_109348_t(var2, var3 - 1, var4)) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
      }

   }

   public void func_105998_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.func_105998_a(var1, var2, var3, var4, var5, var6, var7);
      if(var5 > 0) {
         C_100994_tv var8 = func_106365_c(var5);
         if(var8 != null) {
            this.func_106042_a(var1, var2, var3, var4, var8);
         }
      }

   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100992_tt.field_110945_bJ.field_110891_cf;
   }

   public static C_100994_tv func_106365_c(int var0) {
      switch(var0) {
      case 1:
         return new C_100994_tv(C_100451_alf.field_106250_ah);
      case 2:
         return new C_100994_tv(C_100451_alf.field_106248_ag);
      case 3:
         return new C_100994_tv(C_100451_alf.field_106076_B, 1, 0);
      case 4:
         return new C_100994_tv(C_100451_alf.field_106076_B, 1, 1);
      case 5:
         return new C_100994_tv(C_100451_alf.field_106076_B, 1, 2);
      case 6:
         return new C_100994_tv(C_100451_alf.field_106076_B, 1, 3);
      case 7:
         return new C_100994_tv(C_100451_alf.field_106230_aj);
      case 8:
         return new C_100994_tv(C_100451_alf.field_106228_ai);
      case 9:
         return new C_100994_tv(C_100451_alf.field_106175_aY);
      case 10:
         return new C_100994_tv(C_100451_alf.field_106246_ab);
      case 11:
         return new C_100994_tv(C_100451_alf.field_106244_aa, 1, 2);
      default:
         return null;
      }
   }

   public static int func_106364_a(C_100994_tv var0) {
      int var1 = var0.func_111365_b().field_110891_cf;
      if(var1 == C_100451_alf.field_106250_ah.field_106162_cm) {
         return 1;
      } else if(var1 == C_100451_alf.field_106248_ag.field_106162_cm) {
         return 2;
      } else if(var1 == C_100451_alf.field_106175_aY.field_106162_cm) {
         return 9;
      } else if(var1 == C_100451_alf.field_106228_ai.field_106162_cm) {
         return 8;
      } else if(var1 == C_100451_alf.field_106230_aj.field_106162_cm) {
         return 7;
      } else if(var1 == C_100451_alf.field_106246_ab.field_106162_cm) {
         return 10;
      } else {
         if(var1 == C_100451_alf.field_106076_B.field_106162_cm) {
            switch(var0.func_111367_j()) {
            case 0:
               return 3;
            case 1:
               return 4;
            case 2:
               return 5;
            case 3:
               return 6;
            }
         }

         if(var1 == C_100451_alf.field_106244_aa.field_106162_cm) {
            switch(var0.func_111367_j()) {
            case 2:
               return 11;
            }
         }

         return 0;
      }
   }
}
