import java.util.Random;

public class C_100438_alm extends C_100451_alf {

   protected C_100438_alm(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109027_q);
      this.func_105972_b(true);
      this.func_106034_a(C_101040_sq.field_111418_c);
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

   public int func_106013_d() {
      return 2;
   }

   private boolean func_106428_l(C_100873_xe var1, int var2, int var3, int var4) {
      if(var1.func_109348_t(var2, var3, var4)) {
         return true;
      } else {
         int var5 = var1.func_109349_a(var2, var3, var4);
         return var5 == C_100451_alf.field_106147_bc.field_106162_cm || var5 == C_100451_alf.field_106241_bE.field_106162_cm || var5 == C_100451_alf.field_106091_P.field_106162_cm || var5 == C_100451_alf.field_106170_ce.field_106162_cm;
      }
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109447_b(var2 - 1, var3, var4, true)?true:(var1.func_109447_b(var2 + 1, var3, var4, true)?true:(var1.func_109447_b(var2, var3, var4 - 1, true)?true:(var1.func_109447_b(var2, var3, var4 + 1, true)?true:this.func_106428_l(var1, var2, var3 - 1, var4))));
   }

   public void func_106065_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      int var9 = var1.func_109357_g(var2, var3, var4);
      if(var5 == 1 && this.func_106428_l(var1, var2, var3 - 1, var4)) {
         var9 = 5;
      }

      if(var5 == 2 && var1.func_109447_b(var2, var3, var4 + 1, true)) {
         var9 = 4;
      }

      if(var5 == 3 && var1.func_109447_b(var2, var3, var4 - 1, true)) {
         var9 = 3;
      }

      if(var5 == 4 && var1.func_109447_b(var2 + 1, var3, var4, true)) {
         var9 = 2;
      }

      if(var5 == 5 && var1.func_109447_b(var2 - 1, var3, var4, true)) {
         var9 = 1;
      }

      var1.func_109488_c(var2, var3, var4, var9);
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      super.func_105996_b(var1, var2, var3, var4, var5);
      if(var1.func_109357_g(var2, var3, var4) == 0) {
         this.func_106054_g(var1, var2, var3, var4);
      }

   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      if(var1.func_109447_b(var2 - 1, var3, var4, true)) {
         var1.func_109488_c(var2, var3, var4, 1);
      } else if(var1.func_109447_b(var2 + 1, var3, var4, true)) {
         var1.func_109488_c(var2, var3, var4, 2);
      } else if(var1.func_109447_b(var2, var3, var4 - 1, true)) {
         var1.func_109488_c(var2, var3, var4, 3);
      } else if(var1.func_109447_b(var2, var3, var4 + 1, true)) {
         var1.func_109488_c(var2, var3, var4, 4);
      } else if(this.func_106428_l(var1, var2, var3 - 1, var4)) {
         var1.func_109488_c(var2, var3, var4, 5);
      }

      this.func_106427_n(var1, var2, var3, var4);
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(this.func_106427_n(var1, var2, var3, var4)) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         boolean var7 = false;
         if(!var1.func_109447_b(var2 - 1, var3, var4, true) && var6 == 1) {
            var7 = true;
         }

         if(!var1.func_109447_b(var2 + 1, var3, var4, true) && var6 == 2) {
            var7 = true;
         }

         if(!var1.func_109447_b(var2, var3, var4 - 1, true) && var6 == 3) {
            var7 = true;
         }

         if(!var1.func_109447_b(var2, var3, var4 + 1, true) && var6 == 4) {
            var7 = true;
         }

         if(!this.func_106428_l(var1, var2, var3 - 1, var4) && var6 == 5) {
            var7 = true;
         }

         if(var7) {
            this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
            var1.func_109422_e(var2, var3, var4, 0);
         }
      }

   }

   private boolean func_106427_n(C_100873_xe var1, int var2, int var3, int var4) {
      if(!this.func_106023_b(var1, var2, var3, var4)) {
         if(var1.func_109349_a(var2, var3, var4) == this.field_106162_cm) {
            this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
            var1.func_109422_e(var2, var3, var4, 0);
         }

         return false;
      } else {
         return true;
      }
   }

   public C_100383_amu func_105992_a(C_100873_xe var1, int var2, int var3, int var4, C_100387_amw var5, C_100387_amw var6) {
      int var7 = var1.func_109357_g(var2, var3, var4) & 7;
      float var8 = 0.15F;
      if(var7 == 1) {
         this.func_106008_a(0.0F, 0.2F, 0.5F - var8, var8 * 2.0F, 0.8F, 0.5F + var8);
      } else if(var7 == 2) {
         this.func_106008_a(1.0F - var8 * 2.0F, 0.2F, 0.5F - var8, 1.0F, 0.8F, 0.5F + var8);
      } else if(var7 == 3) {
         this.func_106008_a(0.5F - var8, 0.2F, 0.0F, 0.5F + var8, 0.8F, var8 * 2.0F);
      } else if(var7 == 4) {
         this.func_106008_a(0.5F - var8, 0.2F, 1.0F - var8 * 2.0F, 0.5F + var8, 0.8F, 1.0F);
      } else {
         var8 = 0.1F;
         this.func_106008_a(0.5F - var8, 0.0F, 0.5F - var8, 0.5F + var8, 0.6F, 0.5F + var8);
      }

      return super.func_105992_a(var1, var2, var3, var4, var5, var6);
   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.func_109357_g(var2, var3, var4);
      double var7 = (double)((float)var2 + 0.5F);
      double var9 = (double)((float)var3 + 0.7F);
      double var11 = (double)((float)var4 + 0.5F);
      double var13 = 0.2199999988079071D;
      double var15 = 0.27000001072883606D;
      if(var6 == 1) {
         var1.func_109428_a("smoke", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
         var1.func_109428_a("flame", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
      } else if(var6 == 2) {
         var1.func_109428_a("smoke", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
         var1.func_109428_a("flame", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
      } else if(var6 == 3) {
         var1.func_109428_a("smoke", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
         var1.func_109428_a("flame", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
      } else if(var6 == 4) {
         var1.func_109428_a("smoke", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
         var1.func_109428_a("flame", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
      } else {
         var1.func_109428_a("smoke", var7, var9, var11, 0.0D, 0.0D, 0.0D);
         var1.func_109428_a("flame", var7, var9, var11, 0.0D, 0.0D, 0.0D);
      }

   }
}
