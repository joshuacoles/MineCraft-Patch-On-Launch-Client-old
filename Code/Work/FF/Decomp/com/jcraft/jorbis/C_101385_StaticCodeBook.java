package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101364_Util;
import com.jcraft.p_101362_jogg.C_101408_Buffer;

class C_101385_StaticCodeBook {

   int field_101923_dim;
   int field_101929_entries;
   int[] field_101928_lengthlist;
   int field_101931_maptype;
   int field_101933_q_min;
   int field_101925_q_delta;
   int field_101930_q_quant;
   int field_101924_q_sequencep;
   int[] field_101927_quantlist;
   static final int field_101922_VQ_FEXP = 10;
   static final int field_101926_VQ_FMAN = 21;
   static final int field_101932_VQ_FEXP_BIAS = 768;


   int func_101919_pack(C_101408_Buffer var1) {
      boolean var3 = false;
      var1.func_102077_write(5653314, 24);
      var1.func_102077_write(this.field_101923_dim, 16);
      var1.func_102077_write(this.field_101929_entries, 24);

      int var2;
      for(var2 = 1; var2 < this.field_101929_entries && this.field_101928_lengthlist[var2] >= this.field_101928_lengthlist[var2 - 1]; ++var2) {
         ;
      }

      if(var2 == this.field_101929_entries) {
         var3 = true;
      }

      int var4;
      if(var3) {
         var4 = 0;
         var1.func_102077_write(1, 1);
         var1.func_102077_write(this.field_101928_lengthlist[0] - 1, 5);

         for(var2 = 1; var2 < this.field_101929_entries; ++var2) {
            int var5 = this.field_101928_lengthlist[var2];
            int var6 = this.field_101928_lengthlist[var2 - 1];
            if(var5 > var6) {
               for(int var7 = var6; var7 < var5; ++var7) {
                  var1.func_102077_write(var2 - var4, C_101364_Util.func_101456_ilog(this.field_101929_entries - var4));
                  var4 = var2;
               }
            }
         }

         var1.func_102077_write(var2 - var4, C_101364_Util.func_101456_ilog(this.field_101929_entries - var4));
      } else {
         var1.func_102077_write(0, 1);

         for(var2 = 0; var2 < this.field_101929_entries && this.field_101928_lengthlist[var2] != 0; ++var2) {
            ;
         }

         if(var2 == this.field_101929_entries) {
            var1.func_102077_write(0, 1);

            for(var2 = 0; var2 < this.field_101929_entries; ++var2) {
               var1.func_102077_write(this.field_101928_lengthlist[var2] - 1, 5);
            }
         } else {
            var1.func_102077_write(1, 1);

            for(var2 = 0; var2 < this.field_101929_entries; ++var2) {
               if(this.field_101928_lengthlist[var2] == 0) {
                  var1.func_102077_write(0, 1);
               } else {
                  var1.func_102077_write(1, 1);
                  var1.func_102077_write(this.field_101928_lengthlist[var2] - 1, 5);
               }
            }
         }
      }

      var1.func_102077_write(this.field_101931_maptype, 4);
      switch(this.field_101931_maptype) {
      case 1:
      case 2:
         if(this.field_101927_quantlist == null) {
            return -1;
         } else {
            var1.func_102077_write(this.field_101933_q_min, 32);
            var1.func_102077_write(this.field_101925_q_delta, 32);
            var1.func_102077_write(this.field_101930_q_quant - 1, 4);
            var1.func_102077_write(this.field_101924_q_sequencep, 1);
            var4 = 0;
            switch(this.field_101931_maptype) {
            case 1:
               var4 = this.func_101915_maptype1_quantvals();
               break;
            case 2:
               var4 = this.field_101929_entries * this.field_101923_dim;
            }

            for(var2 = 0; var2 < var4; ++var2) {
               var1.func_102077_write(Math.abs(this.field_101927_quantlist[var2]), this.field_101930_q_quant);
            }
         }
      case 0:
         return 0;
      default:
         return -1;
      }
   }

   int func_101918_unpack(C_101408_Buffer var1) {
      if(var1.func_102082_read(24) != 5653314) {
         this.func_101916_clear();
         return -1;
      } else {
         this.field_101923_dim = var1.func_102082_read(16);
         this.field_101929_entries = var1.func_102082_read(24);
         if(this.field_101929_entries == -1) {
            this.func_101916_clear();
            return -1;
         } else {
            int var2;
            int var3;
            label89:
            switch(var1.func_102082_read(1)) {
            case 0:
               this.field_101928_lengthlist = new int[this.field_101929_entries];
               if(var1.func_102082_read(1) != 0) {
                  var2 = 0;

                  while(true) {
                     if(var2 >= this.field_101929_entries) {
                        break label89;
                     }

                     if(var1.func_102082_read(1) != 0) {
                        var3 = var1.func_102082_read(5);
                        if(var3 == -1) {
                           this.func_101916_clear();
                           return -1;
                        }

                        this.field_101928_lengthlist[var2] = var3 + 1;
                     } else {
                        this.field_101928_lengthlist[var2] = 0;
                     }

                     ++var2;
                  }
               } else {
                  var2 = 0;

                  while(true) {
                     if(var2 >= this.field_101929_entries) {
                        break label89;
                     }

                     var3 = var1.func_102082_read(5);
                     if(var3 == -1) {
                        this.func_101916_clear();
                        return -1;
                     }

                     this.field_101928_lengthlist[var2] = var3 + 1;
                     ++var2;
                  }
               }
            case 1:
               var3 = var1.func_102082_read(5) + 1;
               this.field_101928_lengthlist = new int[this.field_101929_entries];
               var2 = 0;

               while(true) {
                  if(var2 >= this.field_101929_entries) {
                     break label89;
                  }

                  int var4 = var1.func_102082_read(C_101364_Util.func_101456_ilog(this.field_101929_entries - var2));
                  if(var4 == -1) {
                     this.func_101916_clear();
                     return -1;
                  }

                  for(int var5 = 0; var5 < var4; ++var2) {
                     this.field_101928_lengthlist[var2] = var3;
                     ++var5;
                  }

                  ++var3;
               }
            default:
               return -1;
            }

            switch(this.field_101931_maptype = var1.func_102082_read(4)) {
            case 1:
            case 2:
               this.field_101933_q_min = var1.func_102082_read(32);
               this.field_101925_q_delta = var1.func_102082_read(32);
               this.field_101930_q_quant = var1.func_102082_read(4) + 1;
               this.field_101924_q_sequencep = var1.func_102082_read(1);
               var3 = 0;
               switch(this.field_101931_maptype) {
               case 1:
                  var3 = this.func_101915_maptype1_quantvals();
                  break;
               case 2:
                  var3 = this.field_101929_entries * this.field_101923_dim;
               }

               this.field_101927_quantlist = new int[var3];

               for(var2 = 0; var2 < var3; ++var2) {
                  this.field_101927_quantlist[var2] = var1.func_102082_read(this.field_101930_q_quant);
               }

               if(this.field_101927_quantlist[var3 - 1] == -1) {
                  this.func_101916_clear();
                  return -1;
               }
            case 0:
               return 0;
            default:
               this.func_101916_clear();
               return -1;
            }
         }
      }
   }

   private int func_101915_maptype1_quantvals() {
      int var1 = (int)Math.floor(Math.pow((double)this.field_101929_entries, 1.0D / (double)this.field_101923_dim));

      while(true) {
         int var2 = 1;
         int var3 = 1;

         for(int var4 = 0; var4 < this.field_101923_dim; ++var4) {
            var2 *= var1;
            var3 *= var1 + 1;
         }

         if(var2 <= this.field_101929_entries && var3 > this.field_101929_entries) {
            return var1;
         }

         if(var2 > this.field_101929_entries) {
            --var1;
         } else {
            ++var1;
         }
      }
   }

   void func_101916_clear() {}

   float[] func_101920_unquantize() {
      if(this.field_101931_maptype != 1 && this.field_101931_maptype != 2) {
         return null;
      } else {
         float var2 = func_101921_float32_unpack(this.field_101933_q_min);
         float var3 = func_101921_float32_unpack(this.field_101925_q_delta);
         float[] var4 = new float[this.field_101929_entries * this.field_101923_dim];
         int var5;
         float var6;
         int var7;
         switch(this.field_101931_maptype) {
         case 1:
            int var1 = this.func_101915_maptype1_quantvals();

            for(var5 = 0; var5 < this.field_101929_entries; ++var5) {
               var6 = 0.0F;
               var7 = 1;

               for(int var11 = 0; var11 < this.field_101923_dim; ++var11) {
                  int var9 = var5 / var7 % var1;
                  float var10 = (float)this.field_101927_quantlist[var9];
                  var10 = Math.abs(var10) * var3 + var2 + var6;
                  if(this.field_101924_q_sequencep != 0) {
                     var6 = var10;
                  }

                  var4[var5 * this.field_101923_dim + var11] = var10;
                  var7 *= var1;
               }
            }

            return var4;
         case 2:
            for(var5 = 0; var5 < this.field_101929_entries; ++var5) {
               var6 = 0.0F;

               for(var7 = 0; var7 < this.field_101923_dim; ++var7) {
                  float var8 = (float)this.field_101927_quantlist[var5 * this.field_101923_dim + var7];
                  var8 = Math.abs(var8) * var3 + var2 + var6;
                  if(this.field_101924_q_sequencep != 0) {
                     var6 = var8;
                  }

                  var4[var5 * this.field_101923_dim + var7] = var8;
               }
            }
         }

         return var4;
      }
   }

   static long func_101914_float32_pack(float var0) {
      int var1 = 0;
      if(var0 < 0.0F) {
         var1 = Integer.MIN_VALUE;
         var0 = -var0;
      }

      int var2 = (int)Math.floor(Math.log((double)var0) / Math.log(2.0D));
      int var3 = (int)Math.rint(Math.pow((double)var0, (double)(20 - var2)));
      var2 = var2 + 768 << 21;
      return (long)(var1 | var2 | var3);
   }

   static float func_101921_float32_unpack(int var0) {
      float var1 = (float)(var0 & 2097151);
      float var2 = (float)((var0 & 2145386496) >>> 21);
      if((var0 & Integer.MIN_VALUE) != 0) {
         var1 = -var1;
      }

      return func_101917_ldexp(var1, (int)var2 - 20 - 768);
   }

   static float func_101917_ldexp(float var0, int var1) {
      return (float)((double)var0 * Math.pow(2.0D, (double)var1));
   }
}
