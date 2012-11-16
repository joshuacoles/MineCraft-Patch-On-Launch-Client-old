import java.util.Random;

public class C_100432_als extends C_100451_alf {

   public C_100432_als(int var1) {
      super(var1, 143, C_100664_afg.field_109015_l);
      this.func_105972_b(true);
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   public void func_106059_f() {
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public int func_106013_d() {
      return 20;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      int var6 = var1.func_109357_g(var2, var3, var4);
      float var7 = 1.0F;
      float var8 = 1.0F;
      float var9 = 1.0F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      boolean var13 = var6 > 0;
      if((var6 & 2) != 0) {
         var10 = Math.max(var10, 0.0625F);
         var7 = 0.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
         var13 = true;
      }

      if((var6 & 8) != 0) {
         var7 = Math.min(var7, 0.9375F);
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
         var13 = true;
      }

      if((var6 & 4) != 0) {
         var12 = Math.max(var12, 0.0625F);
         var9 = 0.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var13 = true;
      }

      if((var6 & 1) != 0) {
         var9 = Math.min(var9, 0.9375F);
         var12 = 1.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var8 = 0.0F;
         var11 = 1.0F;
         var13 = true;
      }

      if(!var13 && this.func_106406_e(var1.func_109349_a(var2, var3 + 1, var4))) {
         var8 = Math.min(var8, 0.9375F);
         var11 = 1.0F;
         var7 = 0.0F;
         var10 = 1.0F;
         var9 = 0.0F;
         var12 = 1.0F;
      }

      this.func_106008_a(var7, var8, var9, var10, var11, var12);
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean func_106038_b_(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      switch(var5) {
      case 1:
         return this.func_106406_e(var1.func_109349_a(var2, var3 + 1, var4));
      case 2:
         return this.func_106406_e(var1.func_109349_a(var2, var3, var4 + 1));
      case 3:
         return this.func_106406_e(var1.func_109349_a(var2, var3, var4 - 1));
      case 4:
         return this.func_106406_e(var1.func_109349_a(var2 + 1, var3, var4));
      case 5:
         return this.func_106406_e(var1.func_109349_a(var2 - 1, var3, var4));
      default:
         return false;
      }
   }

   private boolean func_106406_e(int var1) {
      if(var1 == 0) {
         return false;
      } else {
         C_100451_alf var2 = C_100451_alf.field_106118_p[var1];
         return var2.func_105977_b() && var2.field_106204_cB.func_108992_c();
      }
   }

   private boolean func_106407_l(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      int var6 = var5;
      if(var5 > 0) {
         for(int var7 = 0; var7 <= 3; ++var7) {
            int var8 = 1 << var7;
            if((var5 & var8) != 0 && !this.func_106406_e(var1.func_109349_a(var2 + C_100015_i.field_105283_a[var7], var3, var4 + C_100015_i.field_105281_b[var7])) && (var1.func_109349_a(var2, var3 + 1, var4) != this.field_106162_cm || (var1.func_109357_g(var2, var3 + 1, var4) & var8) == 0)) {
               var6 &= ~var8;
            }
         }
      }

      if(var6 == 0 && !this.func_106406_e(var1.func_109349_a(var2, var3 + 1, var4))) {
         return false;
      } else {
         if(var6 != var5) {
            var1.func_109488_c(var2, var3, var4, var6);
         }

         return true;
      }
   }

   public int func_106039_o() {
      return C_100866_xa.func_110295_c();
   }

   public int func_106025_g_(int var1) {
      return C_100866_xa.func_110295_c();
   }

   public int func_106069_b(C_100837_xo var1, int var2, int var3, int var4) {
      return var1.func_109362_a(var2, var4).func_112446_l();
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.field_109557_J && !this.func_106407_l(var1, var2, var3, var4)) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
      }

   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(!var1.field_109557_J && var1.field_109577_u.nextInt(4) == 0) {
         byte var6 = 4;
         int var7 = 5;
         boolean var8 = false;

         int var9;
         int var10;
         int var11;
         label138:
         for(var9 = var2 - var6; var9 <= var2 + var6; ++var9) {
            for(var10 = var4 - var6; var10 <= var4 + var6; ++var10) {
               for(var11 = var3 - 1; var11 <= var3 + 1; ++var11) {
                  if(var1.func_109349_a(var9, var11, var10) == this.field_106162_cm) {
                     --var7;
                     if(var7 <= 0) {
                        var8 = true;
                        break label138;
                     }
                  }
               }
            }
         }

         var9 = var1.func_109357_g(var2, var3, var4);
         var10 = var1.field_109577_u.nextInt(6);
         var11 = C_100015_i.field_105280_e[var10];
         int var12;
         int var13;
         if(var10 == 1 && var3 < 255 && var1.func_109352_c(var2, var3 + 1, var4)) {
            if(var8) {
               return;
            }

            var12 = var1.field_109577_u.nextInt(16) & var9;
            if(var12 > 0) {
               for(var13 = 0; var13 <= 3; ++var13) {
                  if(!this.func_106406_e(var1.func_109349_a(var2 + C_100015_i.field_105283_a[var13], var3 + 1, var4 + C_100015_i.field_105281_b[var13]))) {
                     var12 &= ~(1 << var13);
                  }
               }

               if(var12 > 0) {
                  var1.func_109394_d(var2, var3 + 1, var4, this.field_106162_cm, var12);
               }
            }
         } else {
            int var14;
            if(var10 >= 2 && var10 <= 5 && (var9 & 1 << var11) == 0) {
               if(var8) {
                  return;
               }

               var12 = var1.func_109349_a(var2 + C_100015_i.field_105283_a[var11], var3, var4 + C_100015_i.field_105281_b[var11]);
               if(var12 != 0 && C_100451_alf.field_106118_p[var12] != null) {
                  if(C_100451_alf.field_106118_p[var12].field_106204_cB.func_108980_k() && C_100451_alf.field_106118_p[var12].func_105977_b()) {
                     var1.func_109488_c(var2, var3, var4, var9 | 1 << var11);
                  }
               } else {
                  var13 = var11 + 1 & 3;
                  var14 = var11 + 3 & 3;
                  if((var9 & 1 << var13) != 0 && this.func_106406_e(var1.func_109349_a(var2 + C_100015_i.field_105283_a[var11] + C_100015_i.field_105283_a[var13], var3, var4 + C_100015_i.field_105281_b[var11] + C_100015_i.field_105281_b[var13]))) {
                     var1.func_109394_d(var2 + C_100015_i.field_105283_a[var11], var3, var4 + C_100015_i.field_105281_b[var11], this.field_106162_cm, 1 << var13);
                  } else if((var9 & 1 << var14) != 0 && this.func_106406_e(var1.func_109349_a(var2 + C_100015_i.field_105283_a[var11] + C_100015_i.field_105283_a[var14], var3, var4 + C_100015_i.field_105281_b[var11] + C_100015_i.field_105281_b[var14]))) {
                     var1.func_109394_d(var2 + C_100015_i.field_105283_a[var11], var3, var4 + C_100015_i.field_105281_b[var11], this.field_106162_cm, 1 << var14);
                  } else if((var9 & 1 << var13) != 0 && var1.func_109352_c(var2 + C_100015_i.field_105283_a[var11] + C_100015_i.field_105283_a[var13], var3, var4 + C_100015_i.field_105281_b[var11] + C_100015_i.field_105281_b[var13]) && this.func_106406_e(var1.func_109349_a(var2 + C_100015_i.field_105283_a[var13], var3, var4 + C_100015_i.field_105281_b[var13]))) {
                     var1.func_109394_d(var2 + C_100015_i.field_105283_a[var11] + C_100015_i.field_105283_a[var13], var3, var4 + C_100015_i.field_105281_b[var11] + C_100015_i.field_105281_b[var13], this.field_106162_cm, 1 << (var11 + 2 & 3));
                  } else if((var9 & 1 << var14) != 0 && var1.func_109352_c(var2 + C_100015_i.field_105283_a[var11] + C_100015_i.field_105283_a[var14], var3, var4 + C_100015_i.field_105281_b[var11] + C_100015_i.field_105281_b[var14]) && this.func_106406_e(var1.func_109349_a(var2 + C_100015_i.field_105283_a[var14], var3, var4 + C_100015_i.field_105281_b[var14]))) {
                     var1.func_109394_d(var2 + C_100015_i.field_105283_a[var11] + C_100015_i.field_105283_a[var14], var3, var4 + C_100015_i.field_105281_b[var11] + C_100015_i.field_105281_b[var14], this.field_106162_cm, 1 << (var11 + 2 & 3));
                  } else if(this.func_106406_e(var1.func_109349_a(var2 + C_100015_i.field_105283_a[var11], var3 + 1, var4 + C_100015_i.field_105281_b[var11]))) {
                     var1.func_109394_d(var2 + C_100015_i.field_105283_a[var11], var3, var4 + C_100015_i.field_105281_b[var11], this.field_106162_cm, 0);
                  }
               }
            } else if(var3 > 1) {
               var12 = var1.func_109349_a(var2, var3 - 1, var4);
               if(var12 == 0) {
                  var13 = var1.field_109577_u.nextInt(16) & var9;
                  if(var13 > 0) {
                     var1.func_109394_d(var2, var3 - 1, var4, this.field_106162_cm, var13);
                  }
               } else if(var12 == this.field_106162_cm) {
                  var13 = var1.field_109577_u.nextInt(16) & var9;
                  var14 = var1.func_109357_g(var2, var3 - 1, var4);
                  if(var14 != (var14 | var13)) {
                     var1.func_109488_c(var2, var3 - 1, var4, var14 | var13);
                  }
               }
            }
         }
      }

   }

   public void func_106065_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      byte var9 = 0;
      switch(var5) {
      case 2:
         var9 = 1;
         break;
      case 3:
         var9 = 4;
         break;
      case 4:
         var9 = 8;
         break;
      case 5:
         var9 = 2;
      }

      if(var9 != 0) {
         var1.func_109488_c(var2, var3, var4, var9);
      }

   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return 0;
   }

   public int func_106063_a(Random var1) {
      return 0;
   }

   public void func_106026_a(C_100873_xe var1, C_101095_qg var2, int var3, int var4, int var5, int var6) {
      if(!var1.field_109557_J && var2.func_103780_bP() != null && var2.func_103780_bP().field_111397_c == C_100992_tt.field_110883_be.field_110891_cf) {
         var2.func_103813_a(C_100818_jh.field_110020_C[this.field_106162_cm], 1);
         this.func_106042_a(var1, var3, var4, var5, new C_100994_tv(C_100451_alf.field_106128_bx, 1, 0));
      } else {
         super.func_106026_a(var1, var2, var3, var4, var5, var6);
      }

   }
}
