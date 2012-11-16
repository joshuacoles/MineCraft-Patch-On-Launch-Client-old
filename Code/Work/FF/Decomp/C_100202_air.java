import java.util.Random;

public class C_100202_air extends C_100451_alf {

   protected C_100202_air(int var1) {
      super(var1, C_100664_afg.field_109011_c);
      this.field_106165_cl = 87;
      this.func_105972_b(true);
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
      this.func_106048_h(255);
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100412_amr.func_107892_a().func_107844_a((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 0), (double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1));
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public int func_106029_a(int var1, int var2) {
      return var1 == 1 && var2 > 0?this.field_106165_cl - 1:(var1 == 1?this.field_106165_cl:2);
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(!this.func_106353_n(var1, var2, var3, var4) && !var1.func_109515_B(var2, var3 + 1, var4)) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         if(var6 > 0) {
            var1.func_109488_c(var2, var3, var4, var6 - 1);
         } else if(!this.func_106352_l(var1, var2, var3, var4)) {
            var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106120_y.field_106162_cm);
         }
      } else {
         var1.func_109488_c(var2, var3, var4, 7);
      }

   }

   public void func_105978_a(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5, float var6) {
      if(!var1.field_109557_J && var1.field_109577_u.nextFloat() < var6 - 0.5F) {
         var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106120_y.field_106162_cm);
      }

   }

   private boolean func_106352_l(C_100873_xe var1, int var2, int var3, int var4) {
      byte var5 = 0;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var4 - var5; var7 <= var4 + var5; ++var7) {
            int var8 = var1.func_109349_a(var6, var3 + 1, var7);
            if(var8 == C_100451_alf.field_106195_aC.field_106162_cm || var8 == C_100451_alf.field_106125_bw.field_106162_cm || var8 == C_100451_alf.field_106126_bv.field_106162_cm) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean func_106353_n(C_100873_xe var1, int var2, int var3, int var4) {
      for(int var5 = var2 - 4; var5 <= var2 + 4; ++var5) {
         for(int var6 = var3; var6 <= var3 + 1; ++var6) {
            for(int var7 = var4 - 4; var7 <= var4 + 4; ++var7) {
               if(var1.func_109350_f(var5, var6, var7) == C_100664_afg.field_109019_h) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      super.func_106017_a(var1, var2, var3, var4, var5);
      C_100664_afg var6 = var1.func_109350_f(var2, var3 + 1, var4);
      if(var6.func_108983_a()) {
         var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106120_y.field_106162_cm);
      }

   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100451_alf.field_106120_y.func_106043_a(0, var2, var3);
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100451_alf.field_106120_y.field_106162_cm;
   }
}
