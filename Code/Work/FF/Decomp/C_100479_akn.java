import java.util.Random;

public class C_100479_akn extends C_100451_alf {

   protected C_100479_akn(int var1, int var2) {
      super(var1, C_100664_afg.field_109018_k);
      this.field_106165_cl = var2;
      float var3 = 0.375F;
      this.func_106008_a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
      this.func_105972_b(true);
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(var1.func_109352_c(var2, var3 + 1, var4)) {
         int var6;
         for(var6 = 1; var1.func_109349_a(var2, var3 - var6, var4) == this.field_106162_cm; ++var6) {
            ;
         }

         if(var6 < 3) {
            int var7 = var1.func_109357_g(var2, var3, var4);
            if(var7 == 15) {
               var1.func_109422_e(var2, var3 + 1, var4, this.field_106162_cm);
               var1.func_109488_c(var2, var3, var4, 0);
            } else {
               var1.func_109488_c(var2, var3, var4, var7 + 1);
            }
         }
      }

   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109349_a(var2, var3 - 1, var4);
      return var5 == this.field_106162_cm?true:(var5 != C_100451_alf.field_106121_x.field_106162_cm && var5 != C_100451_alf.field_106120_y.field_106162_cm && var5 != C_100451_alf.field_106082_H.field_106162_cm?false:(var1.func_109350_f(var2 - 1, var3 - 1, var4) == C_100664_afg.field_109019_h?true:(var1.func_109350_f(var2 + 1, var3 - 1, var4) == C_100664_afg.field_109019_h?true:(var1.func_109350_f(var2, var3 - 1, var4 - 1) == C_100664_afg.field_109019_h?true:var1.func_109350_f(var2, var3 - 1, var4 + 1) == C_100664_afg.field_109019_h))));
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      this.func_106456_k_(var1, var2, var3, var4);
   }

   protected final void func_106456_k_(C_100873_xe var1, int var2, int var3, int var4) {
      if(!this.func_106001_d(var1, var2, var3, var4)) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
      }

   }

   public boolean func_106001_d(C_100873_xe var1, int var2, int var3, int var4) {
      return this.func_106023_b(var1, var2, var3, var4);
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return null;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100992_tt.field_110906_aJ.field_110891_cf;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public int func_106013_d() {
      return 1;
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100992_tt.field_110906_aJ.field_110891_cf;
   }
}
