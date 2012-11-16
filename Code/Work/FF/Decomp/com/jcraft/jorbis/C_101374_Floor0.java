package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101364_Util;
import com.jcraft.jorbis.C_101365_CodeBook;
import com.jcraft.jorbis.C_101366_InfoMode;
import com.jcraft.jorbis.C_101371_Lsp;
import com.jcraft.jorbis.C_101372_DspState;
import com.jcraft.jorbis.C_101374_Floor0$C_101393_InfoFloor0;
import com.jcraft.jorbis.C_101374_Floor0$C_101394_EchstateFloor0;
import com.jcraft.jorbis.C_101374_Floor0$C_101395_LookFloor0;
import com.jcraft.jorbis.C_101375_Block;
import com.jcraft.jorbis.C_101383_FuncFloor;
import com.jcraft.jorbis.C_101390_Info;
import com.jcraft.p_101362_jogg.C_101408_Buffer;

class C_101374_Floor0 extends C_101383_FuncFloor {

   float[] field_101712_lsp = null;


   void func_101693_pack(Object var1, C_101408_Buffer var2) {
      C_101374_Floor0$C_101393_InfoFloor0 var3 = (C_101374_Floor0$C_101393_InfoFloor0)var1;
      var2.func_102077_write(var3.field_101675_order, 8);
      var2.func_102077_write(var3.field_101674_rate, 16);
      var2.func_102077_write(var3.field_101676_barkmap, 16);
      var2.func_102077_write(var3.field_101673_ampbits, 6);
      var2.func_102077_write(var3.field_101678_ampdB, 8);
      var2.func_102077_write(var3.field_101672_numbooks - 1, 4);

      for(int var4 = 0; var4 < var3.field_101672_numbooks; ++var4) {
         var2.func_102077_write(var3.field_101671_books[var4], 8);
      }

   }

   Object func_101697_unpack(C_101390_Info var1, C_101408_Buffer var2) {
      C_101374_Floor0$C_101393_InfoFloor0 var3 = new C_101374_Floor0$C_101393_InfoFloor0(this);
      var3.field_101675_order = var2.func_102082_read(8);
      var3.field_101674_rate = var2.func_102082_read(16);
      var3.field_101676_barkmap = var2.func_102082_read(16);
      var3.field_101673_ampbits = var2.func_102082_read(6);
      var3.field_101678_ampdB = var2.func_102082_read(8);
      var3.field_101672_numbooks = var2.func_102082_read(4) + 1;
      if(var3.field_101675_order >= 1 && var3.field_101674_rate >= 1 && var3.field_101676_barkmap >= 1 && var3.field_101672_numbooks >= 1) {
         for(int var4 = 0; var4 < var3.field_101672_numbooks; ++var4) {
            var3.field_101671_books[var4] = var2.func_102082_read(8);
            if(var3.field_101671_books[var4] < 0 || var3.field_101671_books[var4] >= var1.field_101981_books) {
               return null;
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   Object func_101691_look(C_101372_DspState var1, C_101366_InfoMode var2, Object var3) {
      C_101390_Info var5 = var1.field_101558_vi;
      C_101374_Floor0$C_101393_InfoFloor0 var6 = (C_101374_Floor0$C_101393_InfoFloor0)var3;
      C_101374_Floor0$C_101395_LookFloor0 var7 = new C_101374_Floor0$C_101395_LookFloor0(this);
      var7.field_101689_m = var6.field_101675_order;
      var7.field_101688_n = var5.field_101976_blocksizes[var2.field_101489_blockflag] / 2;
      var7.field_101684_ln = var6.field_101676_barkmap;
      var7.field_101685_vi = var6;
      var7.field_101687_lpclook.func_101493_init(var7.field_101684_ln, var7.field_101689_m);
      float var4 = (float)var7.field_101684_ln / func_101706_toBARK((float)((double)var6.field_101674_rate / 2.0D));
      var7.field_101686_linearmap = new int[var7.field_101688_n];

      for(int var8 = 0; var8 < var7.field_101688_n; ++var8) {
         int var9 = (int)Math.floor((double)(func_101706_toBARK((float)((double)var6.field_101674_rate / 2.0D / (double)var7.field_101688_n * (double)var8)) * var4));
         if(var9 >= var7.field_101684_ln) {
            var9 = var7.field_101684_ln;
         }

         var7.field_101686_linearmap[var8] = var9;
      }

      return var7;
   }

   static float func_101706_toBARK(float var0) {
      return (float)(13.1D * Math.atan(7.4E-4D * (double)var0) + 2.24D * Math.atan((double)(var0 * var0) * 1.85E-8D) + 1.0E-4D * (double)var0);
   }

   Object func_101710_state(Object var1) {
      C_101374_Floor0$C_101394_EchstateFloor0 var2 = new C_101374_Floor0$C_101394_EchstateFloor0(this);
      C_101374_Floor0$C_101393_InfoFloor0 var3 = (C_101374_Floor0$C_101393_InfoFloor0)var1;
      var2.field_101683_codewords = new int[var3.field_101675_order];
      var2.field_101679_curve = new float[var3.field_101676_barkmap];
      var2.field_101680_frameno = -1L;
      return var2;
   }

   void func_101698_free_info(Object var1) {}

   void func_101695_free_look(Object var1) {}

   void func_101692_free_state(Object var1) {}

   int func_101696_forward(C_101375_Block var1, Object var2, float[] var3, float[] var4, Object var5) {
      return 0;
   }

   int func_101709_inverse(C_101375_Block var1, Object var2, float[] var3) {
      C_101374_Floor0$C_101395_LookFloor0 var4 = (C_101374_Floor0$C_101395_LookFloor0)var2;
      C_101374_Floor0$C_101393_InfoFloor0 var5 = var4.field_101685_vi;
      int var6 = var1.field_101721_opb.func_102082_read(var5.field_101673_ampbits);
      if(var6 > 0) {
         int var7 = (1 << var5.field_101673_ampbits) - 1;
         float var8 = (float)var6 / (float)var7 * (float)var5.field_101678_ampdB;
         int var9 = var1.field_101721_opb.func_102082_read(C_101364_Util.func_101456_ilog(var5.field_101672_numbooks));
         if(var9 != -1 && var9 < var5.field_101672_numbooks) {
            synchronized(this) {
               if(this.field_101712_lsp != null && this.field_101712_lsp.length >= var4.field_101689_m) {
                  for(int var11 = 0; var11 < var4.field_101689_m; ++var11) {
                     this.field_101712_lsp[var11] = 0.0F;
                  }
               } else {
                  this.field_101712_lsp = new float[var4.field_101689_m];
               }

               C_101365_CodeBook var17 = var1.field_101728_vd.field_101574_fullbooks[var5.field_101671_books[var9]];
               float var12 = 0.0F;

               int var13;
               for(var13 = 0; var13 < var4.field_101689_m; ++var13) {
                  var3[var13] = 0.0F;
               }

               int var14;
               for(var13 = 0; var13 < var4.field_101689_m; var13 += var17.field_101481_dim) {
                  if(var17.func_101478_decodevs(this.field_101712_lsp, var13, var1.field_101721_opb, 1, -1) == -1) {
                     for(var14 = 0; var14 < var4.field_101688_n; ++var14) {
                        var3[var14] = 0.0F;
                     }

                     return 0;
                  }
               }

               for(var13 = 0; var13 < var4.field_101689_m; var12 = this.field_101712_lsp[var13 - 1]) {
                  for(var14 = 0; var14 < var17.field_101481_dim; ++var13) {
                     this.field_101712_lsp[var13] += var12;
                     ++var14;
                  }
               }

               C_101371_Lsp.func_101548_lsp_to_curve(var3, var4.field_101686_linearmap, var4.field_101688_n, var4.field_101684_ln, this.field_101712_lsp, var4.field_101689_m, var8, (float)var5.field_101678_ampdB);
               return 1;
            }
         }
      }

      return 0;
   }

   Object func_101694_inverse1(C_101375_Block var1, Object var2, Object var3) {
      C_101374_Floor0$C_101395_LookFloor0 var4 = (C_101374_Floor0$C_101395_LookFloor0)var2;
      C_101374_Floor0$C_101393_InfoFloor0 var5 = var4.field_101685_vi;
      float[] var6 = null;
      if(var3 instanceof float[]) {
         var6 = (float[])((float[])var3);
      }

      int var7 = var1.field_101721_opb.func_102082_read(var5.field_101673_ampbits);
      if(var7 > 0) {
         int var8 = (1 << var5.field_101673_ampbits) - 1;
         float var9 = (float)var7 / (float)var8 * (float)var5.field_101678_ampdB;
         int var10 = var1.field_101721_opb.func_102082_read(C_101364_Util.func_101456_ilog(var5.field_101672_numbooks));
         if(var10 != -1 && var10 < var5.field_101672_numbooks) {
            C_101365_CodeBook var11 = var1.field_101728_vd.field_101574_fullbooks[var5.field_101671_books[var10]];
            float var12 = 0.0F;
            int var13;
            if(var6 != null && var6.length >= var4.field_101689_m + 1) {
               for(var13 = 0; var13 < var6.length; ++var13) {
                  var6[var13] = 0.0F;
               }
            } else {
               var6 = new float[var4.field_101689_m + 1];
            }

            for(var13 = 0; var13 < var4.field_101689_m; var13 += var11.field_101481_dim) {
               if(var11.func_101469_decodev_set(var6, var13, var1.field_101721_opb, var11.field_101481_dim) == -1) {
                  return null;
               }
            }

            for(var13 = 0; var13 < var4.field_101689_m; var12 = var6[var13 - 1]) {
               for(int var14 = 0; var14 < var11.field_101481_dim; ++var13) {
                  var6[var13] += var12;
                  ++var14;
               }
            }

            var6[var4.field_101689_m] = var9;
            return var6;
         }
      }

      return null;
   }

   int func_101699_inverse2(C_101375_Block var1, Object var2, Object var3, float[] var4) {
      C_101374_Floor0$C_101395_LookFloor0 var5 = (C_101374_Floor0$C_101395_LookFloor0)var2;
      C_101374_Floor0$C_101393_InfoFloor0 var6 = var5.field_101685_vi;
      if(var3 != null) {
         float[] var9 = (float[])((float[])var3);
         float var8 = var9[var5.field_101689_m];
         C_101371_Lsp.func_101548_lsp_to_curve(var4, var5.field_101686_linearmap, var5.field_101688_n, var5.field_101684_ln, var9, var5.field_101689_m, var8, (float)var6.field_101678_ampdB);
         return 1;
      } else {
         for(int var7 = 0; var7 < var5.field_101688_n; ++var7) {
            var4[var7] = 0.0F;
         }

         return 0;
      }
   }

   static float func_101707_fromdB(float var0) {
      return (float)Math.exp((double)var0 * 0.11512925D);
   }

   static void func_101711_lsp_to_lpc(float[] var0, float[] var1, int var2) {
      int var5 = var2 / 2;
      float[] var6 = new float[var5];
      float[] var7 = new float[var5];
      float[] var9 = new float[var5 + 1];
      float[] var10 = new float[var5 + 1];
      float[] var12 = new float[var5];
      float[] var13 = new float[var5];

      int var3;
      for(var3 = 0; var3 < var5; ++var3) {
         var6[var3] = (float)(-2.0D * Math.cos((double)var0[var3 * 2]));
         var7[var3] = (float)(-2.0D * Math.cos((double)var0[var3 * 2 + 1]));
      }

      int var4;
      for(var4 = 0; var4 < var5; ++var4) {
         var9[var4] = 0.0F;
         var10[var4] = 1.0F;
         var12[var4] = 0.0F;
         var13[var4] = 1.0F;
      }

      var10[var4] = 1.0F;
      var9[var4] = 1.0F;

      for(var3 = 1; var3 < var2 + 1; ++var3) {
         float var11 = 0.0F;
         float var8 = 0.0F;

         for(var4 = 0; var4 < var5; ++var4) {
            float var14 = var6[var4] * var10[var4] + var9[var4];
            var9[var4] = var10[var4];
            var10[var4] = var8;
            var8 += var14;
            var14 = var7[var4] * var13[var4] + var12[var4];
            var12[var4] = var13[var4];
            var13[var4] = var11;
            var11 += var14;
         }

         var1[var3 - 1] = (var8 + var10[var4] + var11 - var9[var4]) / 2.0F;
         var10[var4] = var8;
         var9[var4] = var11;
      }

   }

   static void func_101708_lpc_to_curve(float[] var0, float[] var1, float var2, C_101374_Floor0$C_101395_LookFloor0 var3, String var4, int var5) {
      float[] var6 = new float[Math.max(var3.field_101684_ln * 2, var3.field_101689_m * 2 + 2)];
      int var7;
      if(var2 == 0.0F) {
         for(var7 = 0; var7 < var3.field_101688_n; ++var7) {
            var0[var7] = 0.0F;
         }

      } else {
         var3.field_101687_lpclook.func_101495_lpc_to_curve(var6, var1, var2);

         for(var7 = 0; var7 < var3.field_101688_n; ++var7) {
            var0[var7] = var6[var3.field_101686_linearmap[var7]];
         }

      }
   }
}
