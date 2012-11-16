
public class C_100131_ajk extends C_100451_alf {

   protected C_100131_ajk(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109027_q);
      this.func_106034_a(C_101040_sq.field_111415_d);
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
      return 12;
   }

   public boolean func_106038_b_(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      return var5 == 0 && var1.func_109360_s(var2, var3 + 1, var4)?true:(var5 == 1 && var1.func_109348_t(var2, var3 - 1, var4)?true:(var5 == 2 && var1.func_109360_s(var2, var3, var4 + 1)?true:(var5 == 3 && var1.func_109360_s(var2, var3, var4 - 1)?true:(var5 == 4 && var1.func_109360_s(var2 + 1, var3, var4)?true:var5 == 5 && var1.func_109360_s(var2 - 1, var3, var4)))));
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109360_s(var2 - 1, var3, var4)?true:(var1.func_109360_s(var2 + 1, var3, var4)?true:(var1.func_109360_s(var2, var3, var4 - 1)?true:(var1.func_109360_s(var2, var3, var4 + 1)?true:(var1.func_109348_t(var2, var3 - 1, var4)?true:var1.func_109360_s(var2, var3 + 1, var4)))));
   }

   public void func_106065_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      int var9 = var1.func_109357_g(var2, var3, var4);
      int var10 = var9 & 8;
      var9 &= 7;
      var9 = -1;
      if(var5 == 0 && var1.func_109360_s(var2, var3 + 1, var4)) {
         var9 = var1.field_109577_u.nextBoolean()?0:7;
      }

      if(var5 == 1 && var1.func_109348_t(var2, var3 - 1, var4)) {
         var9 = 5 + var1.field_109577_u.nextInt(2);
      }

      if(var5 == 2 && var1.func_109360_s(var2, var3, var4 + 1)) {
         var9 = 4;
      }

      if(var5 == 3 && var1.func_109360_s(var2, var3, var4 - 1)) {
         var9 = 3;
      }

      if(var5 == 4 && var1.func_109360_s(var2 + 1, var3, var4)) {
         var9 = 2;
      }

      if(var5 == 5 && var1.func_109360_s(var2 - 1, var3, var4)) {
         var9 = 1;
      }

      if(var9 == -1) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
      } else {
         var1.func_109488_c(var2, var3, var4, var9 + var10);
      }
   }

   public static int func_106267_d(int var0) {
      switch(var0) {
      case 0:
         return 0;
      case 1:
         return 5;
      case 2:
         return 4;
      case 3:
         return 3;
      case 4:
         return 2;
      case 5:
         return 1;
      default:
         return -1;
      }
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(this.func_106266_l(var1, var2, var3, var4)) {
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

         if(!var1.func_109348_t(var2, var3 - 1, var4) && var6 == 5) {
            var7 = true;
         }

         if(!var1.func_109348_t(var2, var3 - 1, var4) && var6 == 6) {
            var7 = true;
         }

         if(!var1.func_109360_s(var2, var3 + 1, var4) && var6 == 0) {
            var7 = true;
         }

         if(!var1.func_109360_s(var2, var3 + 1, var4) && var6 == 7) {
            var7 = true;
         }

         if(var7) {
            this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
            var1.func_109422_e(var2, var3, var4, 0);
         }
      }

   }

   private boolean func_106266_l(C_100873_xe var1, int var2, int var3, int var4) {
      if(!this.func_106023_b(var1, var2, var3, var4)) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4) & 7;
      float var6 = 0.1875F;
      if(var5 == 1) {
         this.func_106008_a(0.0F, 0.2F, 0.5F - var6, var6 * 2.0F, 0.8F, 0.5F + var6);
      } else if(var5 == 2) {
         this.func_106008_a(1.0F - var6 * 2.0F, 0.2F, 0.5F - var6, 1.0F, 0.8F, 0.5F + var6);
      } else if(var5 == 3) {
         this.func_106008_a(0.5F - var6, 0.2F, 0.0F, 0.5F + var6, 0.8F, var6 * 2.0F);
      } else if(var5 == 4) {
         this.func_106008_a(0.5F - var6, 0.2F, 1.0F - var6 * 2.0F, 0.5F + var6, 0.8F, 1.0F);
      } else if(var5 != 5 && var5 != 6) {
         if(var5 == 0 || var5 == 7) {
            var6 = 0.25F;
            this.func_106008_a(0.5F - var6, 0.4F, 0.5F - var6, 0.5F + var6, 1.0F, 0.5F + var6);
         }
      } else {
         var6 = 0.25F;
         this.func_106008_a(0.5F - var6, 0.0F, 0.5F - var6, 0.5F + var6, 0.6F, 0.5F + var6);
      }

   }

   public void func_105993_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5) {}

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      if(var1.field_109557_J) {
         return true;
      } else {
         int var10 = var1.func_109357_g(var2, var3, var4);
         int var11 = var10 & 7;
         int var12 = 8 - (var10 & 8);
         var1.func_109488_c(var2, var3, var4, var11 + var12);
         var1.func_109511_e(var2, var3, var4, var2, var3, var4);
         var1.func_109476_a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, var12 > 0?0.6F:0.5F);
         var1.func_109460_h(var2, var3, var4, this.field_106162_cm);
         if(var11 == 1) {
            var1.func_109460_h(var2 - 1, var3, var4, this.field_106162_cm);
         } else if(var11 == 2) {
            var1.func_109460_h(var2 + 1, var3, var4, this.field_106162_cm);
         } else if(var11 == 3) {
            var1.func_109460_h(var2, var3, var4 - 1, this.field_106162_cm);
         } else if(var11 == 4) {
            var1.func_109460_h(var2, var3, var4 + 1, this.field_106162_cm);
         } else if(var11 != 5 && var11 != 6) {
            if(var11 == 0 || var11 == 7) {
               var1.func_109460_h(var2, var3 + 1, var4, this.field_106162_cm);
            }
         } else {
            var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
         }

         return true;
      }
   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      if((var6 & 8) > 0) {
         var1.func_109460_h(var2, var3, var4, this.field_106162_cm);
         int var7 = var6 & 7;
         if(var7 == 1) {
            var1.func_109460_h(var2 - 1, var3, var4, this.field_106162_cm);
         } else if(var7 == 2) {
            var1.func_109460_h(var2 + 1, var3, var4, this.field_106162_cm);
         } else if(var7 == 3) {
            var1.func_109460_h(var2, var3, var4 - 1, this.field_106162_cm);
         } else if(var7 == 4) {
            var1.func_109460_h(var2, var3, var4 + 1, this.field_106162_cm);
         } else if(var7 != 5 && var7 != 6) {
            if(var7 == 0 || var7 == 7) {
               var1.func_109460_h(var2, var3 + 1, var4, this.field_106162_cm);
            }
         } else {
            var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
         }
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
         return var7 == 0 && var5 == 0?true:(var7 == 7 && var5 == 0?true:(var7 == 6 && var5 == 1?true:(var7 == 5 && var5 == 1?true:(var7 == 4 && var5 == 2?true:(var7 == 3 && var5 == 3?true:(var7 == 2 && var5 == 4?true:var7 == 1 && var5 == 5))))));
      }
   }

   public boolean func_106028_i() {
      return true;
   }
}
