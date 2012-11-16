import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class C_101272_za {

   public static boolean field_112341_a;
   private C_101265_zb[] field_112353_r;
   private byte[] field_112352_s;
   public int[] field_112339_b;
   public boolean[] field_112340_c;
   public boolean field_112337_d;
   public C_100873_xe field_112338_e;
   public int[] field_112335_f;
   public final int field_112336_g;
   public final int field_112348_h;
   private boolean field_112351_t;
   public Map field_112349_i;
   public List[] field_112346_j;
   public boolean field_112347_k;
   public boolean field_112344_l;
   public boolean field_112345_m;
   public long field_112342_n;
   public boolean field_112343_o;
   public int field_112355_p;
   private int field_112350_u;
   boolean field_112354_q;


   public C_101272_za(C_100873_xe var1, int var2, int var3) {
      this.field_112353_r = new C_101265_zb[16];
      this.field_112352_s = new byte[256];
      this.field_112339_b = new int[256];
      this.field_112340_c = new boolean[256];
      this.field_112351_t = false;
      this.field_112349_i = new HashMap();
      this.field_112347_k = false;
      this.field_112344_l = false;
      this.field_112345_m = false;
      this.field_112342_n = 0L;
      this.field_112343_o = false;
      this.field_112355_p = 0;
      this.field_112350_u = 4096;
      this.field_112354_q = false;
      this.field_112346_j = new List[16];
      this.field_112338_e = var1;
      this.field_112336_g = var2;
      this.field_112348_h = var3;
      this.field_112335_f = new int[256];

      for(int var4 = 0; var4 < this.field_112346_j.length; ++var4) {
         this.field_112346_j[var4] = new ArrayList();
      }

      Arrays.fill(this.field_112339_b, -999);
      Arrays.fill(this.field_112352_s, (byte)-1);
   }

   public C_101272_za(C_100873_xe var1, byte[] var2, int var3, int var4) {
      this(var1, var3, var4);
      int var5 = var2.length / 256;

      for(int var6 = 0; var6 < 16; ++var6) {
         for(int var7 = 0; var7 < 16; ++var7) {
            for(int var8 = 0; var8 < var5; ++var8) {
               byte var9 = var2[var6 << 11 | var7 << 7 | var8];
               if(var9 != 0) {
                  int var10 = var8 >> 4;
                  if(this.field_112353_r[var10] == null) {
                     this.field_112353_r[var10] = new C_101265_zb(var10 << 4);
                  }

                  this.field_112353_r[var10].func_112251_a(var6, var8 & 15, var7, var9);
               }
            }
         }
      }

   }

   public boolean func_112301_a(int var1, int var2) {
      return var1 == this.field_112336_g && var2 == this.field_112348_h;
   }

   public int func_112313_b(int var1, int var2) {
      return this.field_112335_f[var2 << 4 | var1];
   }

   public int func_112324_h() {
      for(int var1 = this.field_112353_r.length - 1; var1 >= 0; --var1) {
         if(this.field_112353_r[var1] != null) {
            return this.field_112353_r[var1].func_112255_d();
         }
      }

      return 0;
   }

   public C_101265_zb[] func_112310_i() {
      return this.field_112353_r;
   }

   public void func_112290_a() {
      int var1 = this.func_112324_h();

      for(int var2 = 0; var2 < 16; ++var2) {
         int var3 = 0;

         while(var3 < 16) {
            this.field_112339_b[var2 + (var3 << 4)] = -999;
            int var4 = var1 + 16 - 1;

            while(true) {
               if(var4 > 0) {
                  int var5 = this.func_112312_a(var2, var4 - 1, var3);
                  if(C_100451_alf.field_106116_r[var5] == 0) {
                     --var4;
                     continue;
                  }

                  this.field_112335_f[var3 << 4 | var2] = var4;
               }

               ++var3;
               break;
            }
         }
      }

      this.field_112344_l = true;
   }

   public void func_112305_b() {
      int var1 = this.func_112324_h();
      this.field_112355_p = Integer.MAX_VALUE;

      int var2;
      int var3;
      for(var2 = 0; var2 < 16; ++var2) {
         var3 = 0;

         while(var3 < 16) {
            this.field_112339_b[var2 + (var3 << 4)] = -999;
            int var4 = var1 + 16 - 1;

            while(true) {
               if(var4 > 0) {
                  if(this.func_112296_b(var2, var4 - 1, var3) == 0) {
                     --var4;
                     continue;
                  }

                  this.field_112335_f[var3 << 4 | var2] = var4;
                  if(var4 < this.field_112355_p) {
                     this.field_112355_p = var4;
                  }
               }

               if(!this.field_112338_e.field_109576_v.field_112394_f) {
                  var4 = 15;
                  int var5 = var1 + 16 - 1;

                  do {
                     var4 -= this.func_112296_b(var2, var5, var3);
                     if(var4 > 0) {
                        C_101265_zb var6 = this.field_112353_r[var5 >> 4];
                        if(var6 != null) {
                           var6.func_112253_c(var2, var5 & 15, var3, var4);
                           this.field_112338_e.func_109470_n((this.field_112336_g << 4) + var2, var5, (this.field_112348_h << 4) + var3);
                        }
                     }

                     --var5;
                  } while(var5 > 0 && var4 > 0);
               }

               ++var3;
               break;
            }
         }
      }

      this.field_112344_l = true;

      for(var2 = 0; var2 < 16; ++var2) {
         for(var3 = 0; var3 < 16; ++var3) {
            this.func_112294_e(var2, var3);
         }
      }

   }

   private void func_112294_e(int var1, int var2) {
      this.field_112340_c[var1 + var2 * 16] = true;
      this.field_112351_t = true;
   }

   private void func_112292_q() {
      this.field_112338_e.field_109545_E.func_108901_a("recheckGaps");
      if(this.field_112338_e.func_109432_a(this.field_112336_g * 16 + 8, 0, this.field_112348_h * 16 + 8, 16)) {
         for(int var1 = 0; var1 < 16; ++var1) {
            for(int var2 = 0; var2 < 16; ++var2) {
               if(this.field_112340_c[var1 + var2 * 16]) {
                  this.field_112340_c[var1 + var2 * 16] = false;
                  int var3 = this.func_112313_b(var1, var2);
                  int var4 = this.field_112336_g * 16 + var1;
                  int var5 = this.field_112348_h * 16 + var2;
                  int var6 = this.field_112338_e.func_109435_g(var4 - 1, var5);
                  int var7 = this.field_112338_e.func_109435_g(var4 + 1, var5);
                  int var8 = this.field_112338_e.func_109435_g(var4, var5 - 1);
                  int var9 = this.field_112338_e.func_109435_g(var4, var5 + 1);
                  if(var7 < var6) {
                     var6 = var7;
                  }

                  if(var8 < var6) {
                     var6 = var8;
                  }

                  if(var9 < var6) {
                     var6 = var9;
                  }

                  this.func_112299_g(var4, var5, var6);
                  this.func_112299_g(var4 - 1, var5, var3);
                  this.func_112299_g(var4 + 1, var5, var3);
                  this.func_112299_g(var4, var5 - 1, var3);
                  this.func_112299_g(var4, var5 + 1, var3);
               }
            }
         }

         this.field_112351_t = false;
      }

      this.field_112338_e.field_109545_E.func_108900_b();
   }

   private void func_112299_g(int var1, int var2, int var3) {
      int var4 = this.field_112338_e.func_109538_f(var1, var2);
      if(var4 > var3) {
         this.func_112311_d(var1, var2, var3, var4 + 1);
      } else if(var4 < var3) {
         this.func_112311_d(var1, var2, var4, var3 + 1);
      }

   }

   private void func_112311_d(int var1, int var2, int var3, int var4) {
      if(var4 > var3 && this.field_112338_e.func_109432_a(var1, 0, var2, 16)) {
         for(int var5 = var3; var5 < var4; ++var5) {
            this.field_112338_e.func_109505_c(C_100847_xq.field_110168_a, var1, var5, var2);
         }

         this.field_112344_l = true;
      }

   }

   private void func_112316_h(int var1, int var2, int var3) {
      int var4 = this.field_112335_f[var3 << 4 | var1] & 255;
      int var5 = var4;
      if(var2 > var4) {
         var5 = var2;
      }

      while(var5 > 0 && this.func_112296_b(var1, var5 - 1, var3) == 0) {
         --var5;
      }

      if(var5 != var4) {
         this.field_112338_e.func_109536_g(var1 + this.field_112336_g * 16, var3 + this.field_112348_h * 16, var5, var4);
         this.field_112335_f[var3 << 4 | var1] = var5;
         int var6 = this.field_112336_g * 16 + var1;
         int var7 = this.field_112348_h * 16 + var3;
         int var8;
         int var12;
         if(!this.field_112338_e.field_109576_v.field_112394_f) {
            C_101265_zb var9;
            if(var5 < var4) {
               for(var8 = var5; var8 < var4; ++var8) {
                  var9 = this.field_112353_r[var8 >> 4];
                  if(var9 != null) {
                     var9.func_112253_c(var1, var8 & 15, var3, 15);
                     this.field_112338_e.func_109470_n((this.field_112336_g << 4) + var1, var8, (this.field_112348_h << 4) + var3);
                  }
               }
            } else {
               for(var8 = var4; var8 < var5; ++var8) {
                  var9 = this.field_112353_r[var8 >> 4];
                  if(var9 != null) {
                     var9.func_112253_c(var1, var8 & 15, var3, 0);
                     this.field_112338_e.func_109470_n((this.field_112336_g << 4) + var1, var8, (this.field_112348_h << 4) + var3);
                  }
               }
            }

            var8 = 15;

            while(var5 > 0 && var8 > 0) {
               --var5;
               var12 = this.func_112296_b(var1, var5, var3);
               if(var12 == 0) {
                  var12 = 1;
               }

               var8 -= var12;
               if(var8 < 0) {
                  var8 = 0;
               }

               C_101265_zb var10 = this.field_112353_r[var5 >> 4];
               if(var10 != null) {
                  var10.func_112253_c(var1, var5 & 15, var3, var8);
               }
            }
         }

         var8 = this.field_112335_f[var3 << 4 | var1];
         var12 = var4;
         int var13 = var8;
         if(var8 < var4) {
            var12 = var8;
            var13 = var4;
         }

         if(var8 < this.field_112355_p) {
            this.field_112355_p = var8;
         }

         if(!this.field_112338_e.field_109576_v.field_112394_f) {
            this.func_112311_d(var6 - 1, var7, var12, var13);
            this.func_112311_d(var6 + 1, var7, var12, var13);
            this.func_112311_d(var6, var7 - 1, var12, var13);
            this.func_112311_d(var6, var7 + 1, var12, var13);
            this.func_112311_d(var6, var7, var12, var13);
         }

         this.field_112344_l = true;
      }
   }

   public int func_112296_b(int var1, int var2, int var3) {
      return C_100451_alf.field_106116_r[this.func_112312_a(var1, var2, var3)];
   }

   public int func_112312_a(int var1, int var2, int var3) {
      if(var2 >> 4 >= this.field_112353_r.length) {
         return 0;
      } else {
         C_101265_zb var4 = this.field_112353_r[var2 >> 4];
         return var4 != null?var4.func_112252_a(var1, var2 & 15, var3):0;
      }
   }

   public int func_112327_c(int var1, int var2, int var3) {
      if(var2 >> 4 >= this.field_112353_r.length) {
         return 0;
      } else {
         C_101265_zb var4 = this.field_112353_r[var2 >> 4];
         return var4 != null?var4.func_112259_b(var1, var2 & 15, var3):0;
      }
   }

   public boolean func_112297_a(int var1, int var2, int var3, int var4) {
      return this.func_112291_a(var1, var2, var3, var4, 0);
   }

   public boolean func_112291_a(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var3 << 4 | var1;
      if(var2 >= this.field_112339_b[var6] - 1) {
         this.field_112339_b[var6] = -999;
      }

      int var7 = this.field_112335_f[var6];
      int var8 = this.func_112312_a(var1, var2, var3);
      int var9 = this.func_112327_c(var1, var2, var3);
      if(var8 == var4 && var9 == var5) {
         return false;
      } else {
         C_101265_zb var10 = this.field_112353_r[var2 >> 4];
         boolean var11 = false;
         if(var10 == null) {
            if(var4 == 0) {
               return false;
            }

            var10 = this.field_112353_r[var2 >> 4] = new C_101265_zb(var2 >> 4 << 4);
            var11 = var2 >= var7;
         }

         int var12 = this.field_112336_g * 16 + var1;
         int var13 = this.field_112348_h * 16 + var3;
         if(var8 != 0 && !this.field_112338_e.field_109557_J) {
            C_100451_alf.field_106118_p[var8].func_105989_g(this.field_112338_e, var12, var2, var13, var9);
         }

         var10.func_112251_a(var1, var2 & 15, var3, var4);
         if(var8 != 0) {
            if(!this.field_112338_e.field_109557_J) {
               C_100451_alf.field_106118_p[var8].func_106041_a(this.field_112338_e, var12, var2, var13, var8, var9);
            } else if(C_100451_alf.field_106118_p[var8] instanceof C_100200_aiq && var8 != var4) {
               this.field_112338_e.func_109498_q(var12, var2, var13);
            }
         }

         if(var10.func_112252_a(var1, var2 & 15, var3) != var4) {
            return false;
         } else {
            var10.func_112250_b(var1, var2 & 15, var3, var5);
            if(var11) {
               this.func_112305_b();
            } else {
               if(C_100451_alf.field_106116_r[var4 & 4095] > 0) {
                  if(var2 >= var7) {
                     this.func_112316_h(var1, var2 + 1, var3);
                  }
               } else if(var2 == var7 - 1) {
                  this.func_112316_h(var1, var2, var3);
               }

               this.func_112294_e(var1, var3);
            }

            C_100398_amm var14;
            if(var4 != 0) {
               if(!this.field_112338_e.field_109557_J) {
                  C_100451_alf.field_106118_p[var4].func_106054_g(this.field_112338_e, var12, var2, var13);
               }

               if(C_100451_alf.field_106118_p[var4] instanceof C_100200_aiq) {
                  var14 = this.func_112300_e(var1, var2, var3);
                  if(var14 == null) {
                     var14 = ((C_100200_aiq)C_100451_alf.field_106118_p[var4]).func_106326_a(this.field_112338_e);
                     this.field_112338_e.func_109543_a(var12, var2, var13, var14);
                  }

                  if(var14 != null) {
                     var14.func_102931_h();
                  }
               }
            } else if(var8 > 0 && C_100451_alf.field_106118_p[var8] instanceof C_100200_aiq) {
               var14 = this.func_112300_e(var1, var2, var3);
               if(var14 != null) {
                  var14.func_102931_h();
               }
            }

            this.field_112344_l = true;
            return true;
         }
      }
   }

   public boolean func_112289_b(int var1, int var2, int var3, int var4) {
      C_101265_zb var5 = this.field_112353_r[var2 >> 4];
      if(var5 == null) {
         return false;
      } else {
         int var6 = var5.func_112259_b(var1, var2 & 15, var3);
         if(var6 == var4) {
            return false;
         } else {
            this.field_112344_l = true;
            var5.func_112250_b(var1, var2 & 15, var3, var4);
            int var7 = var5.func_112252_a(var1, var2 & 15, var3);
            if(var7 > 0 && C_100451_alf.field_106118_p[var7] instanceof C_100200_aiq) {
               C_100398_amm var8 = this.func_112300_e(var1, var2, var3);
               if(var8 != null) {
                  var8.func_102931_h();
                  var8.field_102934_p = var4;
               }
            }

            return true;
         }
      }
   }

   public int func_112295_a(C_100847_xq var1, int var2, int var3, int var4) {
      C_101265_zb var5 = this.field_112353_r[var3 >> 4];
      return var5 == null?(this.func_112319_d(var2, var3, var4)?var1.field_110167_c:0):(var1 == C_100847_xq.field_110168_a?var5.func_112263_c(var2, var3 & 15, var4):(var1 == C_100847_xq.field_110166_b?var5.func_112266_d(var2, var3 & 15, var4):var1.field_110167_c));
   }

   public void func_112303_a(C_100847_xq var1, int var2, int var3, int var4, int var5) {
      C_101265_zb var6 = this.field_112353_r[var3 >> 4];
      if(var6 == null) {
         var6 = this.field_112353_r[var3 >> 4] = new C_101265_zb(var3 >> 4 << 4);
         this.func_112305_b();
      }

      this.field_112344_l = true;
      if(var1 == C_100847_xq.field_110168_a) {
         if(!this.field_112338_e.field_109576_v.field_112394_f) {
            var6.func_112253_c(var2, var3 & 15, var4, var5);
         }
      } else if(var1 == C_100847_xq.field_110166_b) {
         var6.func_112271_d(var2, var3 & 15, var4, var5);
      }

   }

   public int func_112328_c(int var1, int var2, int var3, int var4) {
      C_101265_zb var5 = this.field_112353_r[var2 >> 4];
      if(var5 == null) {
         return !this.field_112338_e.field_109576_v.field_112394_f && var4 < C_100847_xq.field_110168_a.field_110167_c?C_100847_xq.field_110168_a.field_110167_c - var4:0;
      } else {
         int var6 = this.field_112338_e.field_109576_v.field_112394_f?0:var5.func_112263_c(var1, var2 & 15, var3);
         if(var6 > 0) {
            field_112341_a = true;
         }

         var6 -= var4;
         int var7 = var5.func_112266_d(var1, var2 & 15, var3);
         if(var7 > var6) {
            var6 = var7;
         }

         return var6;
      }
   }

   public void func_112304_a(C_100730_lb var1) {
      this.field_112345_m = true;
      int var2 = C_100650_jv.func_108910_c(var1.field_103221_t / 16.0D);
      int var3 = C_100650_jv.func_108910_c(var1.field_103217_v / 16.0D);
      if(var2 != this.field_112336_g || var3 != this.field_112348_h) {
         System.out.println("Wrong location! " + var1);
         Thread.dumpStack();
      }

      int var4 = C_100650_jv.func_108910_c(var1.field_103219_u / 16.0D);
      if(var4 < 0) {
         var4 = 0;
      }

      if(var4 >= this.field_112346_j.length) {
         var4 = this.field_112346_j.length - 1;
      }

      var1.field_103235_ah = true;
      var1.field_103218_ai = this.field_112336_g;
      var1.field_103220_aj = var4;
      var1.field_103214_ak = this.field_112348_h;
      this.field_112346_j[var4].add(var1);
   }

   public void func_112308_b(C_100730_lb var1) {
      this.func_112334_a(var1, var1.field_103220_aj);
   }

   public void func_112334_a(C_100730_lb var1, int var2) {
      if(var2 < 0) {
         var2 = 0;
      }

      if(var2 >= this.field_112346_j.length) {
         var2 = this.field_112346_j.length - 1;
      }

      this.field_112346_j[var2].remove(var1);
   }

   public boolean func_112319_d(int var1, int var2, int var3) {
      return var2 >= this.field_112335_f[var3 << 4 | var1];
   }

   public C_100398_amm func_112300_e(int var1, int var2, int var3) {
      C_100851_xw var4 = new C_100851_xw(var1, var2, var3);
      C_100398_amm var5 = (C_100398_amm)this.field_112349_i.get(var4);
      if(var5 == null) {
         int var6 = this.func_112312_a(var1, var2, var3);
         if(var6 <= 0 || !C_100451_alf.field_106118_p[var6].func_106037_u()) {
            return null;
         }

         if(var5 == null) {
            var5 = ((C_100200_aiq)C_100451_alf.field_106118_p[var6]).func_106326_a(this.field_112338_e);
            this.field_112338_e.func_109543_a(this.field_112336_g * 16 + var1, var2, this.field_112348_h * 16 + var3, var5);
         }

         var5 = (C_100398_amm)this.field_112349_i.get(var4);
      }

      if(var5 != null && var5.func_102927_r()) {
         this.field_112349_i.remove(var4);
         return null;
      } else {
         return var5;
      }
   }

   public void func_112315_a(C_100398_amm var1) {
      int var2 = var1.field_102938_l - this.field_112336_g * 16;
      int var3 = var1.field_102939_m;
      int var4 = var1.field_102936_n - this.field_112348_h * 16;
      this.func_112333_a(var2, var3, var4, var1);
      if(this.field_112337_d) {
         this.field_112338_e.field_109561_g.add(var1);
      }

   }

   public void func_112333_a(int var1, int var2, int var3, C_100398_amm var4) {
      C_100851_xw var5 = new C_100851_xw(var1, var2, var3);
      var4.func_102917_b(this.field_112338_e);
      var4.field_102938_l = this.field_112336_g * 16 + var1;
      var4.field_102939_m = var2;
      var4.field_102936_n = this.field_112348_h * 16 + var3;
      if(this.func_112312_a(var1, var2, var3) != 0 && C_100451_alf.field_106118_p[this.func_112312_a(var1, var2, var3)] instanceof C_100200_aiq) {
         var4.func_102929_s();
         this.field_112349_i.put(var5, var4);
      }
   }

   public void func_112326_f(int var1, int var2, int var3) {
      C_100851_xw var4 = new C_100851_xw(var1, var2, var3);
      if(this.field_112337_d) {
         C_100398_amm var5 = (C_100398_amm)this.field_112349_i.remove(var4);
         if(var5 != null) {
            var5.func_102920_w_();
         }
      }

   }

   public void func_112331_c() {
      this.field_112337_d = true;
      this.field_112338_e.func_109411_a(this.field_112349_i.values());
      List[] var1 = this.field_112346_j;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         List var4 = var1[var3];
         this.field_112338_e.func_109427_a(var4);
      }

   }

   public void func_112323_d() {
      this.field_112337_d = false;
      Iterator var1 = this.field_112349_i.values().iterator();

      while(var1.hasNext()) {
         C_100398_amm var2 = (C_100398_amm)var1.next();
         this.field_112338_e.func_109528_a(var2);
      }

      List[] var5 = this.field_112346_j;
      int var6 = var5.length;

      for(int var3 = 0; var3 < var6; ++var3) {
         List var4 = var5[var3];
         this.field_112338_e.func_109387_b(var4);
      }

   }

   public void func_112329_e() {
      this.field_112344_l = true;
   }

   public void func_112298_a(C_100730_lb var1, C_100412_amr var2, List var3) {
      int var4 = C_100650_jv.func_108910_c((var2.field_107915_b - 2.0D) / 16.0D);
      int var5 = C_100650_jv.func_108910_c((var2.field_107914_e + 2.0D) / 16.0D);
      if(var4 < 0) {
         var4 = 0;
      }

      if(var5 >= this.field_112346_j.length) {
         var5 = this.field_112346_j.length - 1;
      }

      for(int var6 = var4; var6 <= var5; ++var6) {
         List var7 = this.field_112346_j[var6];
         Iterator var8 = var7.iterator();

         while(var8.hasNext()) {
            C_100730_lb var9 = (C_100730_lb)var8.next();
            if(var9 != var1 && var9.field_103173_D.func_107898_a(var2)) {
               var3.add(var9);
               C_100730_lb[] var10 = var9.func_103142_ao();
               if(var10 != null) {
                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     var9 = var10[var11];
                     if(var9 != var1 && var9.field_103173_D.func_107898_a(var2)) {
                        var3.add(var9);
                     }
                  }
               }
            }
         }
      }

   }

   public void func_112322_a(Class var1, C_100412_amr var2, List var3, C_100720_li var4) {
      int var5 = C_100650_jv.func_108910_c((var2.field_107915_b - 2.0D) / 16.0D);
      int var6 = C_100650_jv.func_108910_c((var2.field_107914_e + 2.0D) / 16.0D);
      if(var5 < 0) {
         var5 = 0;
      } else if(var5 >= this.field_112346_j.length) {
         var5 = this.field_112346_j.length - 1;
      }

      if(var6 >= this.field_112346_j.length) {
         var6 = this.field_112346_j.length - 1;
      } else if(var6 < 0) {
         var6 = 0;
      }

      for(int var7 = var5; var7 <= var6; ++var7) {
         List var8 = this.field_112346_j[var7];
         Iterator var9 = var8.iterator();

         while(var9.hasNext()) {
            C_100730_lb var10 = (C_100730_lb)var9.next();
            if(var1.isAssignableFrom(var10.getClass()) && var10.field_103173_D.func_107898_a(var2) && (var4 == null || var4.func_108765_a(var10))) {
               var3.add(var10);
            }
         }
      }

   }

   public boolean func_112302_a(boolean var1) {
      if(var1) {
         if(this.field_112345_m && this.field_112338_e.func_109463_E() != this.field_112342_n) {
            return true;
         }
      } else if(this.field_112345_m && this.field_112338_e.func_109463_E() >= this.field_112342_n + 600L) {
         return true;
      }

      return this.field_112344_l;
   }

   public Random func_112318_a(long var1) {
      return new Random(this.field_112338_e.func_109374_D() + (long)(this.field_112336_g * this.field_112336_g * 4987142) + (long)(this.field_112336_g * 5947611) + (long)(this.field_112348_h * this.field_112348_h) * 4392871L + (long)(this.field_112348_h * 389711) ^ var1);
   }

   public boolean func_112320_g() {
      return false;
   }

   public void func_112288_a(C_101331_yx var1, C_101331_yx var2, int var3, int var4) {
      if(!this.field_112347_k && var1.func_108656_a(var3 + 1, var4 + 1) && var1.func_108656_a(var3, var4 + 1) && var1.func_108656_a(var3 + 1, var4)) {
         var1.func_108666_a(var2, var3, var4);
      }

      if(var1.func_108656_a(var3 - 1, var4) && !var1.func_108657_d(var3 - 1, var4).field_112347_k && var1.func_108656_a(var3 - 1, var4 + 1) && var1.func_108656_a(var3, var4 + 1) && var1.func_108656_a(var3 - 1, var4 + 1)) {
         var1.func_108666_a(var2, var3 - 1, var4);
      }

      if(var1.func_108656_a(var3, var4 - 1) && !var1.func_108657_d(var3, var4 - 1).field_112347_k && var1.func_108656_a(var3 + 1, var4 - 1) && var1.func_108656_a(var3 + 1, var4 - 1) && var1.func_108656_a(var3 + 1, var4)) {
         var1.func_108666_a(var2, var3, var4 - 1);
      }

      if(var1.func_108656_a(var3 - 1, var4 - 1) && !var1.func_108657_d(var3 - 1, var4 - 1).field_112347_k && var1.func_108656_a(var3, var4 - 1) && var1.func_108656_a(var3 - 1, var4)) {
         var1.func_108666_a(var2, var3 - 1, var4 - 1);
      }

   }

   public int func_112325_d(int var1, int var2) {
      int var3 = var1 | var2 << 4;
      int var4 = this.field_112339_b[var3];
      if(var4 == -999) {
         int var5 = this.func_112324_h() + 15;
         var4 = -1;

         while(var5 > 0 && var4 == -1) {
            int var6 = this.func_112312_a(var1, var5, var2);
            C_100664_afg var7 = var6 == 0?C_100664_afg.field_109012_a:C_100451_alf.field_106118_p[var6].field_106204_cB;
            if(!var7.func_108992_c() && !var7.func_108986_d()) {
               --var5;
            } else {
               var4 = var5 + 1;
            }
         }

         this.field_112339_b[var3] = var4;
      }

      return var4;
   }

   public void func_112287_k() {
      if(this.field_112351_t && !this.field_112338_e.field_109576_v.field_112394_f) {
         this.func_112292_q();
      }

   }

   public C_100858_wx func_112321_l() {
      return new C_100858_wx(this.field_112336_g, this.field_112348_h);
   }

   public boolean func_112307_c(int var1, int var2) {
      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 >= 256) {
         var2 = 255;
      }

      for(int var3 = var1; var3 <= var2; var3 += 16) {
         C_101265_zb var4 = this.field_112353_r[var3 >> 4];
         if(var4 != null && !var4.func_112257_a()) {
            return false;
         }
      }

      return true;
   }

   public void func_112332_a(C_101265_zb[] var1) {
      this.field_112353_r = var1;
   }

   public void func_112309_a(byte[] var1, int var2, int var3, boolean var4) {
      int var5 = 0;

      int var6;
      for(var6 = 0; var6 < this.field_112353_r.length; ++var6) {
         if((var2 & 1 << var6) != 0) {
            if(this.field_112353_r[var6] == null) {
               this.field_112353_r[var6] = new C_101265_zb(var6 << 4);
            }

            byte[] var7 = this.field_112353_r[var6].func_112254_g();
            System.arraycopy(var1, var5, var7, 0, var7.length);
            var5 += var7.length;
         } else if(var4 && this.field_112353_r[var6] != null) {
            this.field_112353_r[var6] = null;
         }
      }

      C_101274_yy var8;
      for(var6 = 0; var6 < this.field_112353_r.length; ++var6) {
         if((var2 & 1 << var6) != 0 && this.field_112353_r[var6] != null) {
            var8 = this.field_112353_r[var6].func_112249_j();
            System.arraycopy(var1, var5, var8.field_112360_a, 0, var8.field_112360_a.length);
            var5 += var8.field_112360_a.length;
         }
      }

      for(var6 = 0; var6 < this.field_112353_r.length; ++var6) {
         if((var2 & 1 << var6) != 0 && this.field_112353_r[var6] != null) {
            var8 = this.field_112353_r[var6].func_112262_k();
            System.arraycopy(var1, var5, var8.field_112360_a, 0, var8.field_112360_a.length);
            var5 += var8.field_112360_a.length;
         }
      }

      for(var6 = 0; var6 < this.field_112353_r.length; ++var6) {
         if((var2 & 1 << var6) != 0 && this.field_112353_r[var6] != null) {
            var8 = this.field_112353_r[var6].func_112261_l();
            System.arraycopy(var1, var5, var8.field_112360_a, 0, var8.field_112360_a.length);
            var5 += var8.field_112360_a.length;
         }
      }

      for(var6 = 0; var6 < this.field_112353_r.length; ++var6) {
         if((var3 & 1 << var6) != 0) {
            if(this.field_112353_r[var6] == null) {
               var5 += 2048;
            } else {
               var8 = this.field_112353_r[var6].func_112269_i();
               if(var8 == null) {
                  var8 = this.field_112353_r[var6].func_112267_m();
               }

               System.arraycopy(var1, var5, var8.field_112360_a, 0, var8.field_112360_a.length);
               var5 += var8.field_112360_a.length;
            }
         } else if(var4 && this.field_112353_r[var6] != null && this.field_112353_r[var6].func_112269_i() != null) {
            this.field_112353_r[var6].func_112270_h();
         }
      }

      if(var4) {
         System.arraycopy(var1, var5, this.field_112352_s, 0, this.field_112352_s.length);
         int var10000 = var5 + this.field_112352_s.length;
      }

      for(var6 = 0; var6 < this.field_112353_r.length; ++var6) {
         if(this.field_112353_r[var6] != null && (var2 & 1 << var6) != 0) {
            this.field_112353_r[var6].func_112265_e();
         }
      }

      this.func_112290_a();
      Iterator var10 = this.field_112349_i.values().iterator();

      while(var10.hasNext()) {
         C_100398_amm var9 = (C_100398_amm)var10.next();
         var9.func_102931_h();
      }

   }

   public C_101324_xz func_112330_a(int var1, int var2, C_101311_ye var3) {
      int var4 = this.field_112352_s[var2 << 4 | var1] & 255;
      if(var4 == 255) {
         C_101324_xz var5 = var3.func_112524_a((this.field_112336_g << 4) + var1, (this.field_112348_h << 4) + var2);
         var4 = var5.field_112478_N;
         this.field_112352_s[var2 << 4 | var1] = (byte)(var4 & 255);
      }

      return C_101324_xz.field_112495_a[var4] == null?C_101324_xz.field_112494_c:C_101324_xz.field_112495_a[var4];
   }

   public byte[] func_112306_m() {
      return this.field_112352_s;
   }

   public void func_112317_a(byte[] var1) {
      this.field_112352_s = var1;
   }

   public void func_112314_n() {
      this.field_112350_u = 0;
   }

   public void func_112293_o() {
      for(int var1 = 0; var1 < 8; ++var1) {
         if(this.field_112350_u >= 4096) {
            return;
         }

         int var2 = this.field_112350_u % 16;
         int var3 = this.field_112350_u / 16 % 16;
         int var4 = this.field_112350_u / 256;
         ++this.field_112350_u;
         int var5 = (this.field_112336_g << 4) + var3;
         int var6 = (this.field_112348_h << 4) + var4;

         for(int var7 = 0; var7 < 16; ++var7) {
            int var8 = (var2 << 4) + var7;
            if(this.field_112353_r[var2] == null && (var7 == 0 || var7 == 15 || var3 == 0 || var3 == 15 || var4 == 0 || var4 == 15) || this.field_112353_r[var2] != null && this.field_112353_r[var2].func_112252_a(var3, var7, var4) == 0) {
               if(C_100451_alf.field_106114_t[this.field_112338_e.func_109349_a(var5, var8 - 1, var6)] > 0) {
                  this.field_112338_e.func_109532_x(var5, var8 - 1, var6);
               }

               if(C_100451_alf.field_106114_t[this.field_112338_e.func_109349_a(var5, var8 + 1, var6)] > 0) {
                  this.field_112338_e.func_109532_x(var5, var8 + 1, var6);
               }

               if(C_100451_alf.field_106114_t[this.field_112338_e.func_109349_a(var5 - 1, var8, var6)] > 0) {
                  this.field_112338_e.func_109532_x(var5 - 1, var8, var6);
               }

               if(C_100451_alf.field_106114_t[this.field_112338_e.func_109349_a(var5 + 1, var8, var6)] > 0) {
                  this.field_112338_e.func_109532_x(var5 + 1, var8, var6);
               }

               if(C_100451_alf.field_106114_t[this.field_112338_e.func_109349_a(var5, var8, var6 - 1)] > 0) {
                  this.field_112338_e.func_109532_x(var5, var8, var6 - 1);
               }

               if(C_100451_alf.field_106114_t[this.field_112338_e.func_109349_a(var5, var8, var6 + 1)] > 0) {
                  this.field_112338_e.func_109532_x(var5, var8, var6 + 1);
               }

               this.field_112338_e.func_109532_x(var5, var8, var6);
            }
         }
      }

   }
}
