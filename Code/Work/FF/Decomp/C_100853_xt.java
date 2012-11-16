
public class C_100853_xt implements C_100837_xo {

   private int field_109372_a;
   private int field_109370_b;
   private C_101272_za[][] field_109371_c;
   private boolean field_109368_d;
   private C_100873_xe field_109369_e;


   public C_100853_xt(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field_109369_e = var1;
      this.field_109372_a = var2 >> 4;
      this.field_109370_b = var4 >> 4;
      int var8 = var5 >> 4;
      int var9 = var7 >> 4;
      this.field_109371_c = new C_101272_za[var8 - this.field_109372_a + 1][var9 - this.field_109370_b + 1];
      this.field_109368_d = true;

      for(int var10 = this.field_109372_a; var10 <= var8; ++var10) {
         for(int var11 = this.field_109370_b; var11 <= var9; ++var11) {
            C_101272_za var12 = var1.func_109440_e(var10, var11);
            if(var12 != null) {
               this.field_109371_c[var10 - this.field_109372_a][var11 - this.field_109370_b] = var12;
               if(!var12.func_112307_c(var3, var6)) {
                  this.field_109368_d = false;
               }
            }
         }
      }

   }

   public boolean func_109351_P() {
      return this.field_109368_d;
   }

   public int func_109349_a(int var1, int var2, int var3) {
      if(var2 < 0) {
         return 0;
      } else if(var2 >= 256) {
         return 0;
      } else {
         int var4 = (var1 >> 4) - this.field_109372_a;
         int var5 = (var3 >> 4) - this.field_109370_b;
         if(var4 >= 0 && var4 < this.field_109371_c.length && var5 >= 0 && var5 < this.field_109371_c[var4].length) {
            C_101272_za var6 = this.field_109371_c[var4][var5];
            return var6 == null?0:var6.func_112312_a(var1 & 15, var2, var3 & 15);
         } else {
            return 0;
         }
      }
   }

   public C_100398_amm func_109353_p(int var1, int var2, int var3) {
      int var4 = (var1 >> 4) - this.field_109372_a;
      int var5 = (var3 >> 4) - this.field_109370_b;
      return this.field_109371_c[var4][var5].func_112300_e(var1 & 15, var2, var3 & 15);
   }

   public float func_109358_j(int var1, int var2, int var3, int var4) {
      int var5 = this.func_109366_b(var1, var2, var3);
      if(var5 < var4) {
         var5 = var4;
      }

      return this.field_109369_e.field_109576_v.field_112395_g[var5];
   }

   public int func_109355_i(int var1, int var2, int var3, int var4) {
      int var5 = this.func_109365_a(C_100847_xq.field_110168_a, var1, var2, var3);
      int var6 = this.func_109365_a(C_100847_xq.field_110166_b, var1, var2, var3);
      if(var6 < var4) {
         var6 = var4;
      }

      return var5 << 20 | var6 << 4;
   }

   public float func_109354_o(int var1, int var2, int var3) {
      return this.field_109369_e.field_109576_v.field_112395_g[this.func_109366_b(var1, var2, var3)];
   }

   public int func_109366_b(int var1, int var2, int var3) {
      return this.func_109367_a(var1, var2, var3, true);
   }

   public int func_109367_a(int var1, int var2, int var3, boolean var4) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 <= 30000000) {
         int var5;
         int var6;
         if(var4) {
            var5 = this.func_109349_a(var1, var2, var3);
            if(var5 == C_100451_alf.field_106238_an.field_106162_cm || var5 == C_100451_alf.field_106213_bR.field_106162_cm || var5 == C_100451_alf.field_106196_aD.field_106162_cm || var5 == C_100451_alf.field_106218_aw.field_106162_cm || var5 == C_100451_alf.field_106187_aK.field_106162_cm) {
               var6 = this.func_109367_a(var1, var2 + 1, var3, false);
               int var7 = this.func_109367_a(var1 + 1, var2, var3, false);
               int var8 = this.func_109367_a(var1 - 1, var2, var3, false);
               int var9 = this.func_109367_a(var1, var2, var3 + 1, false);
               int var10 = this.func_109367_a(var1, var2, var3 - 1, false);
               if(var7 > var6) {
                  var6 = var7;
               }

               if(var8 > var6) {
                  var6 = var8;
               }

               if(var9 > var6) {
                  var6 = var9;
               }

               if(var10 > var6) {
                  var6 = var10;
               }

               return var6;
            }
         }

         if(var2 < 0) {
            return 0;
         } else if(var2 >= 256) {
            var5 = 15 - this.field_109369_e.field_109571_j;
            if(var5 < 0) {
               var5 = 0;
            }

            return var5;
         } else {
            var5 = (var1 >> 4) - this.field_109372_a;
            var6 = (var3 >> 4) - this.field_109370_b;
            return this.field_109371_c[var5][var6].func_112328_c(var1 & 15, var2, var3 & 15, this.field_109369_e.field_109571_j);
         }
      } else {
         return 15;
      }
   }

   public int func_109357_g(int var1, int var2, int var3) {
      if(var2 < 0) {
         return 0;
      } else if(var2 >= 256) {
         return 0;
      } else {
         int var4 = (var1 >> 4) - this.field_109372_a;
         int var5 = (var3 >> 4) - this.field_109370_b;
         return this.field_109371_c[var4][var5].func_112327_c(var1 & 15, var2, var3 & 15);
      }
   }

   public C_100664_afg func_109350_f(int var1, int var2, int var3) {
      int var4 = this.func_109349_a(var1, var2, var3);
      return var4 == 0?C_100664_afg.field_109012_a:C_100451_alf.field_106118_p[var4].field_106204_cB;
   }

   public C_101324_xz func_109362_a(int var1, int var2) {
      return this.field_109369_e.func_109362_a(var1, var2);
   }

   public boolean func_109356_r(int var1, int var2, int var3) {
      C_100451_alf var4 = C_100451_alf.field_106118_p[this.func_109349_a(var1, var2, var3)];
      return var4 == null?false:var4.func_105994_c();
   }

   public boolean func_109360_s(int var1, int var2, int var3) {
      C_100451_alf var4 = C_100451_alf.field_106118_p[this.func_109349_a(var1, var2, var3)];
      return var4 == null?false:var4.field_106204_cB.func_108992_c() && var4.func_105977_b();
   }

   public boolean func_109348_t(int var1, int var2, int var3) {
      C_100451_alf var4 = C_100451_alf.field_106118_p[this.func_109349_a(var1, var2, var3)];
      return var4 == null?false:(var4.field_106204_cB.func_108980_k() && var4.func_105977_b()?true:(var4 instanceof C_100463_akw?(this.func_109357_g(var1, var2, var3) & 4) == 4:(var4 instanceof C_100169_aja?(this.func_109357_g(var1, var2, var3) & 8) == 8:false)));
   }

   public C_100393_amx func_109363_R() {
      return this.field_109369_e.func_109363_R();
   }

   public boolean func_109352_c(int var1, int var2, int var3) {
      C_100451_alf var4 = C_100451_alf.field_106118_p[this.func_109349_a(var1, var2, var3)];
      return var4 == null;
   }

   public int func_109365_a(C_100847_xq var1, int var2, int var3, int var4) {
      if(var3 < 0) {
         var3 = 0;
      }

      if(var3 >= 256) {
         var3 = 255;
      }

      if(var3 >= 0 && var3 < 256 && var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 <= 30000000) {
         int var5;
         int var6;
         if(C_100451_alf.field_106112_v[this.func_109349_a(var2, var3, var4)]) {
            var5 = this.func_109364_b(var1, var2, var3 + 1, var4);
            var6 = this.func_109364_b(var1, var2 + 1, var3, var4);
            int var7 = this.func_109364_b(var1, var2 - 1, var3, var4);
            int var8 = this.func_109364_b(var1, var2, var3, var4 + 1);
            int var9 = this.func_109364_b(var1, var2, var3, var4 - 1);
            if(var6 > var5) {
               var5 = var6;
            }

            if(var7 > var5) {
               var5 = var7;
            }

            if(var8 > var5) {
               var5 = var8;
            }

            if(var9 > var5) {
               var5 = var9;
            }

            return var5;
         } else {
            var5 = (var2 >> 4) - this.field_109372_a;
            var6 = (var4 >> 4) - this.field_109370_b;
            return this.field_109371_c[var5][var6].func_112295_a(var1, var2 & 15, var3, var4 & 15);
         }
      } else {
         return var1.field_110167_c;
      }
   }

   public int func_109364_b(C_100847_xq var1, int var2, int var3, int var4) {
      if(var3 < 0) {
         var3 = 0;
      }

      if(var3 >= 256) {
         var3 = 255;
      }

      if(var3 >= 0 && var3 < 256 && var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 <= 30000000) {
         int var5 = (var2 >> 4) - this.field_109372_a;
         int var6 = (var4 >> 4) - this.field_109370_b;
         return this.field_109371_c[var5][var6].func_112295_a(var1, var2 & 15, var3, var4 & 15);
      } else {
         return var1.field_110167_c;
      }
   }

   public int func_109361_N() {
      return 256;
   }

   public boolean func_109359_k(int var1, int var2, int var3, int var4) {
      int var5 = this.func_109349_a(var1, var2, var3);
      return var5 == 0?false:C_100451_alf.field_106118_p[var5].func_105985_c(this, var1, var2, var3, var4);
   }
}
