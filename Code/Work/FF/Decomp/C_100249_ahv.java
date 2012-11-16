import java.util.Random;

public class C_100249_ahv extends C_100451_alf {

   protected C_100249_ahv(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109030_y);
      this.func_105972_b(true);
      this.func_106034_a(C_101040_sq.field_111418_c);
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

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return C_100412_amr.func_107892_a().func_107844_a((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)((float)(var3 + 1) - var5), (double)((float)(var4 + 1) - var5));
   }

   public C_100412_amr func_106031_b_(C_100873_xe var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      return C_100412_amr.func_107892_a().func_107844_a((double)((float)var2 + var5), (double)var3, (double)((float)var4 + var5), (double)((float)(var2 + 1) - var5), (double)(var3 + 1), (double)((float)(var4 + 1) - var5));
   }

   public int func_106024_a(int var1) {
      return var1 == 1?this.field_106165_cl - 1:(var1 == 0?this.field_106165_cl + 1:this.field_106165_cl);
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_105994_c() {
      return false;
   }

   public int func_106013_d() {
      return 13;
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return !super.func_106023_b(var1, var2, var3, var4)?false:this.func_106001_d(var1, var2, var3, var4);
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!this.func_106001_d(var1, var2, var3, var4)) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
      }

   }

   public boolean func_106001_d(C_100873_xe var1, int var2, int var3, int var4) {
      if(var1.func_109350_f(var2 - 1, var3, var4).func_108983_a()) {
         return false;
      } else if(var1.func_109350_f(var2 + 1, var3, var4).func_108983_a()) {
         return false;
      } else if(var1.func_109350_f(var2, var3, var4 - 1).func_108983_a()) {
         return false;
      } else if(var1.func_109350_f(var2, var3, var4 + 1).func_108983_a()) {
         return false;
      } else {
         int var5 = var1.func_109349_a(var2, var3 - 1, var4);
         return var5 == C_100451_alf.field_106175_aY.field_106162_cm || var5 == C_100451_alf.field_106082_H.field_106162_cm;
      }
   }

   public void func_106011_a(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5) {
      var5.func_103085_a(C_100698_ks.field_109230_g, 1);
   }
}
