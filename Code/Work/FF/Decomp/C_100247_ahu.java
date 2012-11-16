import java.util.List;
import java.util.Random;

public class C_100247_ahu extends C_100451_alf {

   private final boolean field_106374_a;


   protected C_100247_ahu(int var1, int var2, boolean var3) {
      super(var1, var2, C_100664_afg.field_109027_q);
      this.func_105972_b(true);
      this.func_106034_a(C_101040_sq.field_111415_d);
      this.field_106374_a = var3;
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return null;
   }

   public int func_106000_r_() {
      return this.field_106374_a?30:20;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_106038_b_(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      return var5 == 2 && var1.func_109360_s(var2, var3, var4 + 1)?true:(var5 == 3 && var1.func_109360_s(var2, var3, var4 - 1)?true:(var5 == 4 && var1.func_109360_s(var2 + 1, var3, var4)?true:var5 == 5 && var1.func_109360_s(var2 - 1, var3, var4)));
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109360_s(var2 - 1, var3, var4)?true:(var1.func_109360_s(var2 + 1, var3, var4)?true:(var1.func_109360_s(var2, var3, var4 - 1)?true:var1.func_109360_s(var2, var3, var4 + 1)));
   }

   public void func_106065_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      int var9 = var1.func_109357_g(var2, var3, var4);
      int var10 = var9 & 8;
      var9 &= 7;
      if(var5 == 2 && var1.func_109360_s(var2, var3, var4 + 1)) {
         var9 = 4;
      } else if(var5 == 3 && var1.func_109360_s(var2, var3, var4 - 1)) {
         var9 = 3;
      } else if(var5 == 4 && var1.func_109360_s(var2 + 1, var3, var4)) {
         var9 = 2;
      } else if(var5 == 5 && var1.func_109360_s(var2 - 1, var3, var4)) {
         var9 = 1;
      } else {
         var9 = this.func_106369_l(var1, var2, var3, var4);
      }

      var1.func_109488_c(var2, var3, var4, var9 + var10);
   }

   private int func_106369_l(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109360_s(var2 - 1, var3, var4)?1:(var1.func_109360_s(var2 + 1, var3, var4)?2:(var1.func_109360_s(var2, var3, var4 - 1)?3:(var1.func_109360_s(var2, var3, var4 + 1)?4:1)));
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(this.func_106372_n(var1, var2, var3, var4)) {
         int var6 = var1.func_109357_g(var2, var3, var4) & 7;
         boolean var7 = false;
         if(!var1.func_109360_s(var2 - 1, var3, var4) && var6 == 1) {
            var7 = true;
         }

         if(!var1.func_109360_s(var2 + 1, var3, var4) && var6 == 2) {
            var7 = true;
         }

         if(!var1.func_109360_s(var2, var3, var4 - 1) && var6 == 3) {
            var7 = true;
         }

         if(!var1.func_109360_s(var2, var3, var4 + 1) && var6 == 4) {
            var7 = true;
         }

         if(var7) {
            this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
            var1.func_109422_e(var2, var3, var4, 0);
         }
      }

   }

   private boolean func_106372_n(C_100873_xe var1, int var2, int var3, int var4) {
      if(!this.func_106023_b(var1, var2, var3, var4)) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      this.func_106371_e(var5);
   }

   private void func_106371_e(int var1) {
      int var2 = var1 & 7;
      boolean var3 = (var1 & 8) > 0;
      float var4 = 0.375F;
      float var5 = 0.625F;
      float var6 = 0.1875F;
      float var7 = 0.125F;
      if(var3) {
         var7 = 0.0625F;
      }

      if(var2 == 1) {
         this.func_106008_a(0.0F, var4, 0.5F - var6, var7, var5, 0.5F + var6);
      } else if(var2 == 2) {
         this.func_106008_a(1.0F - var7, var4, 0.5F - var6, 1.0F, var5, 0.5F + var6);
      } else if(var2 == 3) {
         this.func_106008_a(0.5F - var6, var4, 0.0F, 0.5F + var6, var5, var7);
      } else if(var2 == 4) {
         this.func_106008_a(0.5F - var6, var4, 1.0F - var7, 0.5F + var6, var5, 1.0F);
      }

   }

   public void func_105993_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5) {}

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      int var10 = var1.func_109357_g(var2, var3, var4);
      int var11 = var10 & 7;
      int var12 = 8 - (var10 & 8);
      if(var12 == 0) {
         return true;
      } else {
         var1.func_109488_c(var2, var3, var4, var11 + var12);
         var1.func_109511_e(var2, var3, var4, var2, var3, var4);
         var1.func_109476_a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, 0.6F);
         this.func_106373_d(var1, var2, var3, var4, var11);
         var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_());
         return true;
      }
   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      if((var6 & 8) > 0) {
         int var7 = var6 & 7;
         this.func_106373_d(var1, var2, var3, var4, var7);
      }

      super.func_106041_a(var1, var2, var3, var4, var5, var6);
   }

   public boolean func_106030_b(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return (var1.func_109357_g(var2, var3, var4) & 8) > 0;
   }

   public boolean func_105985_c(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.func_109357_g(var2, var3, var4);
      if((var6 & 8) == 0) {
         return false;
      } else {
         int var7 = var6 & 7;
         return var7 == 5 && var5 == 1?true:(var7 == 4 && var5 == 2?true:(var7 == 3 && var5 == 3?true:(var7 == 2 && var5 == 4?true:var7 == 1 && var5 == 5)));
      }
   }

   public boolean func_106028_i() {
      return true;
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(!var1.field_109557_J) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         if((var6 & 8) != 0) {
            if(this.field_106374_a) {
               this.func_106370_o(var1, var2, var3, var4);
            } else {
               var1.func_109488_c(var2, var3, var4, var6 & 7);
               int var7 = var6 & 7;
               this.func_106373_d(var1, var2, var3, var4, var7);
               var1.func_109476_a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, 0.5F);
               var1.func_109511_e(var2, var3, var4, var2, var3, var4);
            }

         }
      }
   }

   public void func_106059_f() {
      float var1 = 0.1875F;
      float var2 = 0.125F;
      float var3 = 0.125F;
      this.func_106008_a(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }

   public void func_106011_a(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5) {
      if(!var1.field_109557_J) {
         if(this.field_106374_a) {
            if((var1.func_109357_g(var2, var3, var4) & 8) == 0) {
               this.func_106370_o(var1, var2, var3, var4);
            }
         }
      }
   }

   private void func_106370_o(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      int var6 = var5 & 7;
      boolean var7 = (var5 & 8) != 0;
      this.func_106371_e(var5);
      List var9 = var1.func_109518_a(C_101089_qi.class, C_100412_amr.func_107892_a().func_107844_a((double)var2 + this.field_106156_ct, (double)var3 + this.field_106155_cu, (double)var4 + this.field_106154_cv, (double)var2 + this.field_106153_cw, (double)var3 + this.field_106152_cx, (double)var4 + this.field_106151_cy));
      boolean var8 = !var9.isEmpty();
      if(var8 && !var7) {
         var1.func_109488_c(var2, var3, var4, var6 | 8);
         this.func_106373_d(var1, var2, var3, var4, var6);
         var1.func_109511_e(var2, var3, var4, var2, var3, var4);
         var1.func_109476_a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, 0.6F);
      }

      if(!var8 && var7) {
         var1.func_109488_c(var2, var3, var4, var6);
         this.func_106373_d(var1, var2, var3, var4, var6);
         var1.func_109511_e(var2, var3, var4, var2, var3, var4);
         var1.func_109476_a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, 0.5F);
      }

      if(var8) {
         var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_());
      }

   }

   private void func_106373_d(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      var1.func_109460_h(var2, var3, var4, this.field_106162_cm);
      if(var5 == 1) {
         var1.func_109460_h(var2 - 1, var3, var4, this.field_106162_cm);
      } else if(var5 == 2) {
         var1.func_109460_h(var2 + 1, var3, var4, this.field_106162_cm);
      } else if(var5 == 3) {
         var1.func_109460_h(var2, var3, var4 - 1, this.field_106162_cm);
      } else if(var5 == 4) {
         var1.func_109460_h(var2, var3, var4 + 1, this.field_106162_cm);
      } else {
         var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
      }

   }
}
