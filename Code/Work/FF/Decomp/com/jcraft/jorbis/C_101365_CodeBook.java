package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101364_Util;
import com.jcraft.jorbis.C_101365_CodeBook$C_101391_DecodeAux;
import com.jcraft.jorbis.C_101385_StaticCodeBook;
import com.jcraft.p_101362_jogg.C_101408_Buffer;

class C_101365_CodeBook {

   int field_101481_dim;
   int field_101487_entries;
   C_101385_StaticCodeBook field_101484_c = new C_101385_StaticCodeBook();
   float[] field_101483_valuelist;
   int[] field_101486_codelist;
   C_101365_CodeBook$C_101391_DecodeAux field_101485_decode_tree;
   private int[] field_101482_t = new int[15];


   int func_101479_encode(int var1, C_101408_Buffer var2) {
      var2.func_102077_write(this.field_101486_codelist[var1], this.field_101484_c.field_101928_lengthlist[var1]);
      return this.field_101484_c.field_101928_lengthlist[var1];
   }

   int func_101480_errorv(float[] var1) {
      int var2 = this.func_101474_best(var1, 1);

      for(int var3 = 0; var3 < this.field_101481_dim; ++var3) {
         var1[var3] = this.field_101483_valuelist[var2 * this.field_101481_dim + var3];
      }

      return var2;
   }

   int func_101468_encodev(int var1, float[] var2, C_101408_Buffer var3) {
      for(int var4 = 0; var4 < this.field_101481_dim; ++var4) {
         var2[var4] = this.field_101483_valuelist[var1 * this.field_101481_dim + var4];
      }

      return this.func_101479_encode(var1, var3);
   }

   int func_101472_encodevs(float[] var1, C_101408_Buffer var2, int var3, int var4) {
      int var5 = this.func_101475_besterror(var1, var3, var4);
      return this.func_101479_encode(var5, var2);
   }

   synchronized int func_101467_decodevs_add(float[] var1, int var2, C_101408_Buffer var3, int var4) {
      int var5 = var4 / this.field_101481_dim;
      if(this.field_101482_t.length < var5) {
         this.field_101482_t = new int[var5];
      }

      int var7;
      for(var7 = 0; var7 < var5; ++var7) {
         int var6 = this.func_101466_decode(var3);
         if(var6 == -1) {
            return -1;
         }

         this.field_101482_t[var7] = var6 * this.field_101481_dim;
      }

      var7 = 0;

      for(int var9 = 0; var7 < this.field_101481_dim; var9 += var5) {
         for(int var8 = 0; var8 < var5; ++var8) {
            var1[var2 + var9 + var8] += this.field_101483_valuelist[this.field_101482_t[var8] + var7];
         }

         ++var7;
      }

      return 0;
   }

   int func_101473_decodev_add(float[] var1, int var2, C_101408_Buffer var3, int var4) {
      int var5;
      int var6;
      int var7;
      int var8;
      int var10002;
      if(this.field_101481_dim > 8) {
         var5 = 0;

         while(var5 < var4) {
            var7 = this.func_101466_decode(var3);
            if(var7 == -1) {
               return -1;
            }

            var8 = var7 * this.field_101481_dim;

            for(var6 = 0; var6 < this.field_101481_dim; var1[var2 + var10002] += this.field_101483_valuelist[var8 + var6++]) {
               var10002 = var5++;
            }
         }
      } else {
         var5 = 0;

         while(var5 < var4) {
            var7 = this.func_101466_decode(var3);
            if(var7 == -1) {
               return -1;
            }

            var8 = var7 * this.field_101481_dim;
            var6 = 0;
            switch(this.field_101481_dim) {
            case 0:
            default:
               break;
            case 8:
               var10002 = var5++;
               var1[var2 + var10002] += this.field_101483_valuelist[var8 + var6++];
            case 7:
               var10002 = var5++;
               var1[var2 + var10002] += this.field_101483_valuelist[var8 + var6++];
            case 6:
               var10002 = var5++;
               var1[var2 + var10002] += this.field_101483_valuelist[var8 + var6++];
            case 5:
               var10002 = var5++;
               var1[var2 + var10002] += this.field_101483_valuelist[var8 + var6++];
            case 4:
               var10002 = var5++;
               var1[var2 + var10002] += this.field_101483_valuelist[var8 + var6++];
            case 3:
               var10002 = var5++;
               var1[var2 + var10002] += this.field_101483_valuelist[var8 + var6++];
            case 2:
               var10002 = var5++;
               var1[var2 + var10002] += this.field_101483_valuelist[var8 + var6++];
            case 1:
               var10002 = var5++;
               var1[var2 + var10002] += this.field_101483_valuelist[var8 + var6++];
            }
         }
      }

      return 0;
   }

   int func_101469_decodev_set(float[] var1, int var2, C_101408_Buffer var3, int var4) {
      int var5 = 0;

      while(var5 < var4) {
         int var7 = this.func_101466_decode(var3);
         if(var7 == -1) {
            return -1;
         }

         int var8 = var7 * this.field_101481_dim;

         for(int var6 = 0; var6 < this.field_101481_dim; var1[var2 + var5++] = this.field_101483_valuelist[var8 + var6++]) {
            ;
         }
      }

      return 0;
   }

   int func_101476_decodevv_add(float[][] var1, int var2, int var3, C_101408_Buffer var4, int var5) {
      int var9 = 0;
      int var6 = var2 / var3;

      while(var6 < (var2 + var5) / var3) {
         int var8 = this.func_101466_decode(var4);
         if(var8 == -1) {
            return -1;
         }

         int var10 = var8 * this.field_101481_dim;

         for(int var7 = 0; var7 < this.field_101481_dim; ++var7) {
            int var10001 = var9++;
            var1[var10001][var6] += this.field_101483_valuelist[var10 + var7];
            if(var9 == var3) {
               var9 = 0;
               ++var6;
            }
         }
      }

      return 0;
   }

   int func_101466_decode(C_101408_Buffer var1) {
      int var2 = 0;
      C_101365_CodeBook$C_101391_DecodeAux var3 = this.field_101485_decode_tree;
      int var4 = var1.func_102074_look(var3.field_101458_tabn);
      if(var4 >= 0) {
         var2 = var3.field_101459_tab[var4];
         var1.func_102081_adv(var3.field_101457_tabl[var4]);
         if(var2 <= 0) {
            return -var2;
         }
      }

      do {
         switch(var1.func_102090_read1()) {
         case -1:
         default:
            return -1;
         case 0:
            var2 = var3.field_101463_ptr0[var2];
            break;
         case 1:
            var2 = var3.field_101462_ptr1[var2];
         }
      } while(var2 > 0);

      return -var2;
   }

   int func_101478_decodevs(float[] var1, int var2, C_101408_Buffer var3, int var4, int var5) {
      int var6 = this.func_101466_decode(var3);
      if(var6 == -1) {
         return -1;
      } else {
         int var7;
         int var8;
         switch(var5) {
         case -1:
            var7 = 0;

            for(var8 = 0; var7 < this.field_101481_dim; var8 += var4) {
               var1[var2 + var8] = this.field_101483_valuelist[var6 * this.field_101481_dim + var7];
               ++var7;
            }

            return var6;
         case 0:
            var7 = 0;

            for(var8 = 0; var7 < this.field_101481_dim; var8 += var4) {
               var1[var2 + var8] += this.field_101483_valuelist[var6 * this.field_101481_dim + var7];
               ++var7;
            }

            return var6;
         case 1:
            var7 = 0;

            for(var8 = 0; var7 < this.field_101481_dim; var8 += var4) {
               var1[var2 + var8] *= this.field_101483_valuelist[var6 * this.field_101481_dim + var7];
               ++var7;
            }
         }

         return var6;
      }
   }

   int func_101474_best(float[] var1, int var2) {
      int var3 = -1;
      float var4 = 0.0F;
      int var5 = 0;

      for(int var6 = 0; var6 < this.field_101487_entries; ++var6) {
         if(this.field_101484_c.field_101928_lengthlist[var6] > 0) {
            float var7 = func_101470_dist(this.field_101481_dim, this.field_101483_valuelist, var5, var1, var2);
            if(var3 == -1 || var7 < var4) {
               var4 = var7;
               var3 = var6;
            }
         }

         var5 += this.field_101481_dim;
      }

      return var3;
   }

   int func_101475_besterror(float[] var1, int var2, int var3) {
      int var4 = this.func_101474_best(var1, var2);
      int var5;
      int var6;
      switch(var3) {
      case 0:
         var5 = 0;

         for(var6 = 0; var5 < this.field_101481_dim; var6 += var2) {
            var1[var6] -= this.field_101483_valuelist[var4 * this.field_101481_dim + var5];
            ++var5;
         }

         return var4;
      case 1:
         var5 = 0;

         for(var6 = 0; var5 < this.field_101481_dim; var6 += var2) {
            float var7 = this.field_101483_valuelist[var4 * this.field_101481_dim + var5];
            if(var7 == 0.0F) {
               var1[var6] = 0.0F;
            } else {
               var1[var6] /= var7;
            }

            ++var5;
         }
      }

      return var4;
   }

   void func_101465_clear() {}

   private static float func_101470_dist(int var0, float[] var1, int var2, float[] var3, int var4) {
      float var5 = 0.0F;

      for(int var6 = 0; var6 < var0; ++var6) {
         float var7 = var1[var2 + var6] - var3[var6 * var4];
         var5 += var7 * var7;
      }

      return var5;
   }

   int func_101464_init_decode(C_101385_StaticCodeBook var1) {
      this.field_101484_c = var1;
      this.field_101487_entries = var1.field_101929_entries;
      this.field_101481_dim = var1.field_101923_dim;
      this.field_101483_valuelist = var1.func_101920_unquantize();
      this.field_101485_decode_tree = this.func_101471_make_decode_tree();
      if(this.field_101485_decode_tree == null) {
         this.func_101465_clear();
         return -1;
      } else {
         return 0;
      }
   }

   static int[] func_101477_make_words(int[] var0, int var1) {
      int[] var2 = new int[33];
      int[] var3 = new int[var1];

      int var4;
      int var5;
      int var6;
      for(var4 = 0; var4 < var1; ++var4) {
         var5 = var0[var4];
         if(var5 > 0) {
            var6 = var2[var5];
            if(var5 < 32 && var6 >>> var5 != 0) {
               return null;
            }

            var3[var4] = var6;

            int var7;
            for(var7 = var5; var7 > 0; --var7) {
               if((var2[var7] & 1) != 0) {
                  if(var7 == 1) {
                     ++var2[1];
                  } else {
                     var2[var7] = var2[var7 - 1] << 1;
                  }
                  break;
               }

               ++var2[var7];
            }

            for(var7 = var5 + 1; var7 < 33 && var2[var7] >>> 1 == var6; ++var7) {
               var6 = var2[var7];
               var2[var7] = var2[var7 - 1] << 1;
            }
         }
      }

      for(var4 = 0; var4 < var1; ++var4) {
         var5 = 0;

         for(var6 = 0; var6 < var0[var4]; ++var6) {
            var5 <<= 1;
            var5 |= var3[var4] >>> var6 & 1;
         }

         var3[var4] = var5;
      }

      return var3;
   }

   C_101365_CodeBook$C_101391_DecodeAux func_101471_make_decode_tree() {
      int var1 = 0;
      C_101365_CodeBook$C_101391_DecodeAux var2 = new C_101365_CodeBook$C_101391_DecodeAux(this);
      int[] var3 = var2.field_101463_ptr0 = new int[this.field_101487_entries * 2];
      int[] var4 = var2.field_101462_ptr1 = new int[this.field_101487_entries * 2];
      int[] var5 = func_101477_make_words(this.field_101484_c.field_101928_lengthlist, this.field_101484_c.field_101929_entries);
      if(var5 == null) {
         return null;
      } else {
         var2.field_101460_aux = this.field_101487_entries * 2;

         int var6;
         int var7;
         int var8;
         int var9;
         for(var6 = 0; var6 < this.field_101487_entries; ++var6) {
            if(this.field_101484_c.field_101928_lengthlist[var6] > 0) {
               var7 = 0;

               for(var8 = 0; var8 < this.field_101484_c.field_101928_lengthlist[var6] - 1; ++var8) {
                  var9 = var5[var6] >>> var8 & 1;
                  if(var9 == 0) {
                     if(var3[var7] == 0) {
                        ++var1;
                        var3[var7] = var1;
                     }

                     var7 = var3[var7];
                  } else {
                     if(var4[var7] == 0) {
                        ++var1;
                        var4[var7] = var1;
                     }

                     var7 = var4[var7];
                  }
               }

               if((var5[var6] >>> var8 & 1) == 0) {
                  var3[var7] = -var6;
               } else {
                  var4[var7] = -var6;
               }
            }
         }

         var2.field_101458_tabn = C_101364_Util.func_101456_ilog(this.field_101487_entries) - 4;
         if(var2.field_101458_tabn < 5) {
            var2.field_101458_tabn = 5;
         }

         var6 = 1 << var2.field_101458_tabn;
         var2.field_101459_tab = new int[var6];
         var2.field_101457_tabl = new int[var6];

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = 0;
            boolean var10 = false;

            for(var9 = 0; var9 < var2.field_101458_tabn && (var8 > 0 || var9 == 0); ++var9) {
               if((var7 & 1 << var9) != 0) {
                  var8 = var4[var8];
               } else {
                  var8 = var3[var8];
               }
            }

            var2.field_101459_tab[var7] = var8;
            var2.field_101457_tabl[var7] = var9;
         }

         return var2;
      }
   }
}
