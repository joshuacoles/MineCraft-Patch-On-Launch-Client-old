import java.util.Random;

public class C_100144_ajn extends C_100142_ajm {

   int field_106286_a = 0;
   boolean[] field_106284_b = new boolean[4];
   int[] field_106285_c = new int[4];


   protected C_100144_ajn(int var1, C_100664_afg var2) {
      super(var1, var2);
   }

   private void func_106278_l(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      var1.func_109526_c(var2, var3, var4, this.field_106162_cm + 1, var5);
      var1.func_109511_e(var2, var3, var4, var2, var3, var4);
   }

   public boolean func_105982_c(C_100837_xo var1, int var2, int var3, int var4) {
      return this.field_106204_cB != C_100664_afg.field_109020_i;
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      int var6 = this.func_106268_f_(var1, var2, var3, var4);
      byte var7 = 1;
      if(this.field_106204_cB == C_100664_afg.field_109020_i && !var1.field_109576_v.field_112397_e) {
         var7 = 2;
      }

      boolean var8 = true;
      int var10;
      if(var6 > 0) {
         byte var9 = -100;
         this.field_106286_a = 0;
         int var12 = this.func_106281_d(var1, var2 - 1, var3, var4, var9);
         var12 = this.func_106281_d(var1, var2 + 1, var3, var4, var12);
         var12 = this.func_106281_d(var1, var2, var3, var4 - 1, var12);
         var12 = this.func_106281_d(var1, var2, var3, var4 + 1, var12);
         var10 = var12 + var7;
         if(var10 >= 8 || var12 < 0) {
            var10 = -1;
         }

         if(this.func_106268_f_(var1, var2, var3 + 1, var4) >= 0) {
            int var11 = this.func_106268_f_(var1, var2, var3 + 1, var4);
            if(var11 >= 8) {
               var10 = var11;
            } else {
               var10 = var11 + 8;
            }
         }

         if(this.field_106286_a >= 2 && this.field_106204_cB == C_100664_afg.field_109019_h) {
            if(var1.func_109350_f(var2, var3 - 1, var4).func_108983_a()) {
               var10 = 0;
            } else if(var1.func_109350_f(var2, var3 - 1, var4) == this.field_106204_cB && var1.func_109357_g(var2, var3, var4) == 0) {
               var10 = 0;
            }
         }

         if(this.field_106204_cB == C_100664_afg.field_109020_i && var6 < 8 && var10 < 8 && var10 > var6 && var5.nextInt(4) != 0) {
            var10 = var6;
            var8 = false;
         }

         if(var10 == var6) {
            if(var8) {
               this.func_106278_l(var1, var2, var3, var4);
            }
         } else {
            var6 = var10;
            if(var10 < 0) {
               var1.func_109422_e(var2, var3, var4, 0);
            } else {
               var1.func_109488_c(var2, var3, var4, var10);
               var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_());
               var1.func_109460_h(var2, var3, var4, this.field_106162_cm);
            }
         }
      } else {
         this.func_106278_l(var1, var2, var3, var4);
      }

      if(this.func_106280_p(var1, var2, var3 - 1, var4)) {
         if(this.field_106204_cB == C_100664_afg.field_109020_i && var1.func_109350_f(var2, var3 - 1, var4) == C_100664_afg.field_109019_h) {
            var1.func_109422_e(var2, var3 - 1, var4, C_100451_alf.field_106111_w.field_106162_cm);
            this.func_106274_j(var1, var2, var3 - 1, var4);
            return;
         }

         if(var6 >= 8) {
            this.func_106283_h(var1, var2, var3 - 1, var4, var6);
         } else {
            this.func_106283_h(var1, var2, var3 - 1, var4, var6 + 8);
         }
      } else if(var6 >= 0 && (var6 == 0 || this.func_106279_o(var1, var2, var3 - 1, var4))) {
         boolean[] var13 = this.func_106277_n(var1, var2, var3, var4);
         var10 = var6 + var7;
         if(var6 >= 8) {
            var10 = 1;
         }

         if(var10 >= 8) {
            return;
         }

         if(var13[0]) {
            this.func_106283_h(var1, var2 - 1, var3, var4, var10);
         }

         if(var13[1]) {
            this.func_106283_h(var1, var2 + 1, var3, var4, var10);
         }

         if(var13[2]) {
            this.func_106283_h(var1, var2, var3, var4 - 1, var10);
         }

         if(var13[3]) {
            this.func_106283_h(var1, var2, var3, var4 + 1, var10);
         }
      }

   }

   private void func_106283_h(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(this.func_106280_p(var1, var2, var3, var4)) {
         int var6 = var1.func_109349_a(var2, var3, var4);
         if(var6 > 0) {
            if(this.field_106204_cB == C_100664_afg.field_109020_i) {
               this.func_106274_j(var1, var2, var3, var4);
            } else {
               C_100451_alf.field_106118_p[var6].func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
            }
         }

         var1.func_109394_d(var2, var3, var4, this.field_106162_cm, var5);
      }

   }

   private int func_106282_d(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 1000;

      for(int var8 = 0; var8 < 4; ++var8) {
         if((var8 != 0 || var6 != 1) && (var8 != 1 || var6 != 0) && (var8 != 2 || var6 != 3) && (var8 != 3 || var6 != 2)) {
            int var9 = var2;
            int var11 = var4;
            if(var8 == 0) {
               var9 = var2 - 1;
            }

            if(var8 == 1) {
               ++var9;
            }

            if(var8 == 2) {
               var11 = var4 - 1;
            }

            if(var8 == 3) {
               ++var11;
            }

            if(!this.func_106279_o(var1, var9, var3, var11) && (var1.func_109350_f(var9, var3, var11) != this.field_106204_cB || var1.func_109357_g(var9, var3, var11) != 0)) {
               if(!this.func_106279_o(var1, var9, var3 - 1, var11)) {
                  return var5;
               }

               if(var5 < 4) {
                  int var12 = this.func_106282_d(var1, var9, var3, var11, var5 + 1, var8);
                  if(var12 < var7) {
                     var7 = var12;
                  }
               }
            }
         }
      }

      return var7;
   }

   private boolean[] func_106277_n(C_100873_xe var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      for(var5 = 0; var5 < 4; ++var5) {
         this.field_106285_c[var5] = 1000;
         var6 = var2;
         int var8 = var4;
         if(var5 == 0) {
            var6 = var2 - 1;
         }

         if(var5 == 1) {
            ++var6;
         }

         if(var5 == 2) {
            var8 = var4 - 1;
         }

         if(var5 == 3) {
            ++var8;
         }

         if(!this.func_106279_o(var1, var6, var3, var8) && (var1.func_109350_f(var6, var3, var8) != this.field_106204_cB || var1.func_109357_g(var6, var3, var8) != 0)) {
            if(this.func_106279_o(var1, var6, var3 - 1, var8)) {
               this.field_106285_c[var5] = this.func_106282_d(var1, var6, var3, var8, 1, var5);
            } else {
               this.field_106285_c[var5] = 0;
            }
         }
      }

      var5 = this.field_106285_c[0];

      for(var6 = 1; var6 < 4; ++var6) {
         if(this.field_106285_c[var6] < var5) {
            var5 = this.field_106285_c[var6];
         }
      }

      for(var6 = 0; var6 < 4; ++var6) {
         this.field_106284_b[var6] = this.field_106285_c[var6] == var5;
      }

      return this.field_106284_b;
   }

   private boolean func_106279_o(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109349_a(var2, var3, var4);
      if(var5 != C_100451_alf.field_106200_aH.field_106162_cm && var5 != C_100451_alf.field_106191_aO.field_106162_cm && var5 != C_100451_alf.field_106199_aG.field_106162_cm && var5 != C_100451_alf.field_106185_aI.field_106162_cm && var5 != C_100451_alf.field_106205_ba.field_106162_cm) {
         if(var5 == 0) {
            return false;
         } else {
            C_100664_afg var6 = C_100451_alf.field_106118_p[var5].field_106204_cB;
            return var6 == C_100664_afg.field_109000_C?true:var6.func_108992_c();
         }
      } else {
         return true;
      }
   }

   protected int func_106281_d(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      int var6 = this.func_106268_f_(var1, var2, var3, var4);
      if(var6 < 0) {
         return var5;
      } else {
         if(var6 == 0) {
            ++this.field_106286_a;
         }

         if(var6 >= 8) {
            var6 = 0;
         }

         return var5 >= 0 && var6 >= var5?var5:var6;
      }
   }

   private boolean func_106280_p(C_100873_xe var1, int var2, int var3, int var4) {
      C_100664_afg var5 = var1.func_109350_f(var2, var3, var4);
      return var5 == this.field_106204_cB?false:(var5 == C_100664_afg.field_109020_i?false:!this.func_106279_o(var1, var2, var3, var4));
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      super.func_106054_g(var1, var2, var3, var4);
      if(var1.func_109349_a(var2, var3, var4) == this.field_106162_cm) {
         var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_());
      }

   }

   public boolean func_106067_l() {
      return false;
   }
}
