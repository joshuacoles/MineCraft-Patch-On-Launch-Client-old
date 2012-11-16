package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101364_Util;
import com.jcraft.jorbis.C_101365_CodeBook;
import com.jcraft.jorbis.C_101366_InfoMode;
import com.jcraft.jorbis.C_101372_DspState;
import com.jcraft.jorbis.C_101375_Block;
import com.jcraft.jorbis.C_101376_Floor1$C_101396_InfoFloor1;
import com.jcraft.jorbis.C_101376_Floor1$C_101399_LookFloor1;
import com.jcraft.jorbis.C_101383_FuncFloor;
import com.jcraft.jorbis.C_101390_Info;
import com.jcraft.p_101362_jogg.C_101408_Buffer;

class C_101376_Floor1 extends C_101383_FuncFloor {

   static final int field_101704_floor1_rangedb = 140;
   static final int field_101703_VIF_POSIT = 63;
   private static float[] field_101705_FLOOR_fromdB_LOOKUP = new float[]{1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F};


   void func_101693_pack(Object var1, C_101408_Buffer var2) {
      C_101376_Floor1$C_101396_InfoFloor1 var3 = (C_101376_Floor1$C_101396_InfoFloor1)var1;
      int var4 = 0;
      int var6 = var3.field_101747_postlist[1];
      int var7 = -1;
      var2.func_102077_write(var3.field_101735_partitions, 5);

      int var8;
      for(var8 = 0; var8 < var3.field_101735_partitions; ++var8) {
         var2.func_102077_write(var3.field_101745_partitionclass[var8], 4);
         if(var7 < var3.field_101745_partitionclass[var8]) {
            var7 = var3.field_101745_partitionclass[var8];
         }
      }

      int var9;
      for(var8 = 0; var8 < var7 + 1; ++var8) {
         var2.func_102077_write(var3.field_101742_class_dim[var8] - 1, 3);
         var2.func_102077_write(var3.field_101733_class_subs[var8], 2);
         if(var3.field_101733_class_subs[var8] != 0) {
            var2.func_102077_write(var3.field_101740_class_book[var8], 8);
         }

         for(var9 = 0; var9 < 1 << var3.field_101733_class_subs[var8]; ++var9) {
            var2.func_102077_write(var3.field_101750_class_subbook[var8][var9] + 1, 8);
         }
      }

      var2.func_102077_write(var3.field_101734_mult - 1, 2);
      var2.func_102077_write(C_101364_Util.func_101455_ilog2(var6), 4);
      int var5 = C_101364_Util.func_101455_ilog2(var6);
      var8 = 0;

      for(var9 = 0; var8 < var3.field_101735_partitions; ++var8) {
         for(var4 += var3.field_101742_class_dim[var3.field_101745_partitionclass[var8]]; var9 < var4; ++var9) {
            var2.func_102077_write(var3.field_101747_postlist[var9 + 2], var5);
         }
      }

   }

   Object func_101697_unpack(C_101390_Info var1, C_101408_Buffer var2) {
      int var3 = 0;
      int var4 = -1;
      C_101376_Floor1$C_101396_InfoFloor1 var6 = new C_101376_Floor1$C_101396_InfoFloor1(this);
      var6.field_101735_partitions = var2.func_102082_read(5);

      int var7;
      for(var7 = 0; var7 < var6.field_101735_partitions; ++var7) {
         var6.field_101745_partitionclass[var7] = var2.func_102082_read(4);
         if(var4 < var6.field_101745_partitionclass[var7]) {
            var4 = var6.field_101745_partitionclass[var7];
         }
      }

      int var8;
      for(var7 = 0; var7 < var4 + 1; ++var7) {
         var6.field_101742_class_dim[var7] = var2.func_102082_read(3) + 1;
         var6.field_101733_class_subs[var7] = var2.func_102082_read(2);
         if(var6.field_101733_class_subs[var7] < 0) {
            var6.func_101731_free();
            return null;
         }

         if(var6.field_101733_class_subs[var7] != 0) {
            var6.field_101740_class_book[var7] = var2.func_102082_read(8);
         }

         if(var6.field_101740_class_book[var7] < 0 || var6.field_101740_class_book[var7] >= var1.field_101981_books) {
            var6.func_101731_free();
            return null;
         }

         for(var8 = 0; var8 < 1 << var6.field_101733_class_subs[var7]; ++var8) {
            var6.field_101750_class_subbook[var7][var8] = var2.func_102082_read(8) - 1;
            if(var6.field_101750_class_subbook[var7][var8] < -1 || var6.field_101750_class_subbook[var7][var8] >= var1.field_101981_books) {
               var6.func_101731_free();
               return null;
            }
         }
      }

      var6.field_101734_mult = var2.func_102082_read(2) + 1;
      int var5 = var2.func_102082_read(4);
      var7 = 0;

      for(var8 = 0; var7 < var6.field_101735_partitions; ++var7) {
         for(var3 += var6.field_101742_class_dim[var6.field_101745_partitionclass[var7]]; var8 < var3; ++var8) {
            int var9 = var6.field_101747_postlist[var8 + 2] = var2.func_102082_read(var5);
            if(var9 < 0 || var9 >= 1 << var5) {
               var6.func_101731_free();
               return null;
            }
         }
      }

      var6.field_101747_postlist[0] = 0;
      var6.field_101747_postlist[1] = 1 << var5;
      return var6;
   }

   Object func_101691_look(C_101372_DspState var1, C_101366_InfoMode var2, Object var3) {
      int var4 = 0;
      int[] var5 = new int[65];
      C_101376_Floor1$C_101396_InfoFloor1 var6 = (C_101376_Floor1$C_101396_InfoFloor1)var3;
      C_101376_Floor1$C_101399_LookFloor1 var7 = new C_101376_Floor1$C_101399_LookFloor1(this);
      var7.field_101774_vi = var6;
      var7.field_101776_n = var6.field_101747_postlist[1];

      int var8;
      for(var8 = 0; var8 < var6.field_101735_partitions; ++var8) {
         var4 += var6.field_101742_class_dim[var6.field_101745_partitionclass[var8]];
      }

      var4 += 2;
      var7.field_101775_posts = var4;

      for(var8 = 0; var8 < var4; var5[var8] = var8++) {
         ;
      }

      int var9;
      int var10;
      for(var9 = 0; var9 < var4 - 1; ++var9) {
         for(var10 = var9; var10 < var4; ++var10) {
            if(var6.field_101747_postlist[var5[var9]] > var6.field_101747_postlist[var5[var10]]) {
               var8 = var5[var10];
               var5[var10] = var5[var9];
               var5[var9] = var8;
            }
         }
      }

      for(var9 = 0; var9 < var4; ++var9) {
         var7.field_101783_forward_index[var9] = var5[var9];
      }

      for(var9 = 0; var9 < var4; var7.field_101786_reverse_index[var7.field_101783_forward_index[var9]] = var9++) {
         ;
      }

      for(var9 = 0; var9 < var4; ++var9) {
         var7.field_101777_sorted_index[var9] = var6.field_101747_postlist[var7.field_101783_forward_index[var9]];
      }

      switch(var6.field_101734_mult) {
      case 1:
         var7.field_101780_quant_q = 256;
         break;
      case 2:
         var7.field_101780_quant_q = 128;
         break;
      case 3:
         var7.field_101780_quant_q = 86;
         break;
      case 4:
         var7.field_101780_quant_q = 64;
         break;
      default:
         var7.field_101780_quant_q = -1;
      }

      for(var9 = 0; var9 < var4 - 2; ++var9) {
         var10 = 0;
         int var11 = 1;
         int var12 = 0;
         int var13 = var7.field_101776_n;
         int var14 = var6.field_101747_postlist[var9 + 2];

         for(int var15 = 0; var15 < var9 + 2; ++var15) {
            int var16 = var6.field_101747_postlist[var15];
            if(var16 > var12 && var16 < var14) {
               var10 = var15;
               var12 = var16;
            }

            if(var16 < var13 && var16 > var14) {
               var11 = var15;
               var13 = var16;
            }
         }

         var7.field_101779_loneighbor[var9] = var10;
         var7.field_101787_hineighbor[var9] = var11;
      }

      return var7;
   }

   void func_101698_free_info(Object var1) {}

   void func_101695_free_look(Object var1) {}

   void func_101692_free_state(Object var1) {}

   int func_101696_forward(C_101375_Block var1, Object var2, float[] var3, float[] var4, Object var5) {
      return 0;
   }

   Object func_101694_inverse1(C_101375_Block var1, Object var2, Object var3) {
      C_101376_Floor1$C_101399_LookFloor1 var4 = (C_101376_Floor1$C_101399_LookFloor1)var2;
      C_101376_Floor1$C_101396_InfoFloor1 var5 = var4.field_101774_vi;
      C_101365_CodeBook[] var6 = var1.field_101728_vd.field_101574_fullbooks;
      if(var1.field_101721_opb.func_102082_read(1) == 1) {
         int[] var7 = null;
         if(var3 instanceof int[]) {
            var7 = (int[])((int[])var3);
         }

         int var8;
         if(var7 != null && var7.length >= var4.field_101775_posts) {
            for(var8 = 0; var8 < var7.length; ++var8) {
               var7[var8] = 0;
            }
         } else {
            var7 = new int[var4.field_101775_posts];
         }

         var7[0] = var1.field_101721_opb.func_102082_read(C_101364_Util.func_101456_ilog(var4.field_101780_quant_q - 1));
         var7[1] = var1.field_101721_opb.func_102082_read(C_101364_Util.func_101456_ilog(var4.field_101780_quant_q - 1));
         var8 = 0;

         int var9;
         int var10;
         int var12;
         int var13;
         for(var9 = 2; var8 < var5.field_101735_partitions; ++var8) {
            var10 = var5.field_101745_partitionclass[var8];
            int var11 = var5.field_101742_class_dim[var10];
            var12 = var5.field_101733_class_subs[var10];
            var13 = 1 << var12;
            int var14 = 0;
            if(var12 != 0) {
               var14 = var6[var5.field_101740_class_book[var10]].func_101466_decode(var1.field_101721_opb);
               if(var14 == -1) {
                  return null;
               }
            }

            for(int var15 = 0; var15 < var11; ++var15) {
               int var16 = var5.field_101750_class_subbook[var10][var14 & var13 - 1];
               var14 >>>= var12;
               if(var16 >= 0) {
                  if((var7[var9 + var15] = var6[var16].func_101466_decode(var1.field_101721_opb)) == -1) {
                     return null;
                  }
               } else {
                  var7[var9 + var15] = 0;
               }
            }

            var9 += var11;
         }

         for(var8 = 2; var8 < var4.field_101775_posts; ++var8) {
            var9 = func_101701_render_point(var5.field_101747_postlist[var4.field_101779_loneighbor[var8 - 2]], var5.field_101747_postlist[var4.field_101787_hineighbor[var8 - 2]], var7[var4.field_101779_loneighbor[var8 - 2]], var7[var4.field_101787_hineighbor[var8 - 2]], var5.field_101747_postlist[var8]);
            var10 = var4.field_101780_quant_q - var9;
            var12 = (var10 < var9?var10:var9) << 1;
            var13 = var7[var8];
            if(var13 != 0) {
               if(var13 >= var12) {
                  if(var10 > var9) {
                     var13 -= var9;
                  } else {
                     var13 = -1 - (var13 - var10);
                  }
               } else if((var13 & 1) != 0) {
                  var13 = -(var13 + 1 >>> 1);
               } else {
                  var13 >>= 1;
               }

               var7[var8] = var13 + var9;
               var7[var4.field_101779_loneighbor[var8 - 2]] &= 32767;
               var7[var4.field_101787_hineighbor[var8 - 2]] &= 32767;
            } else {
               var7[var8] = var9 | '\u8000';
            }
         }

         return var7;
      } else {
         return null;
      }
   }

   private static int func_101701_render_point(int var0, int var1, int var2, int var3, int var4) {
      var2 &= 32767;
      var3 &= 32767;
      int var5 = var3 - var2;
      int var6 = var1 - var0;
      int var7 = Math.abs(var5);
      int var8 = var7 * (var4 - var0);
      int var9 = var8 / var6;
      return var5 < 0?var2 - var9:var2 + var9;
   }

   int func_101699_inverse2(C_101375_Block var1, Object var2, Object var3, float[] var4) {
      C_101376_Floor1$C_101399_LookFloor1 var5 = (C_101376_Floor1$C_101399_LookFloor1)var2;
      C_101376_Floor1$C_101396_InfoFloor1 var6 = var5.field_101774_vi;
      int var7 = var1.field_101728_vd.field_101558_vi.field_101976_blocksizes[var1.field_101722_mode] / 2;
      if(var3 != null) {
         int[] var15 = (int[])((int[])var3);
         int var9 = 0;
         int var10 = 0;
         int var11 = var15[0] * var6.field_101734_mult;

         int var12;
         for(var12 = 1; var12 < var5.field_101775_posts; ++var12) {
            int var13 = var5.field_101783_forward_index[var12];
            int var14 = var15[var13] & 32767;
            if(var14 == var15[var13]) {
               var14 *= var6.field_101734_mult;
               var9 = var6.field_101747_postlist[var13];
               func_101702_render_line(var10, var9, var11, var14, var4);
               var10 = var9;
               var11 = var14;
            }
         }

         for(var12 = var9; var12 < var7; ++var12) {
            var4[var12] *= var4[var12 - 1];
         }

         return 1;
      } else {
         for(int var8 = 0; var8 < var7; ++var8) {
            var4[var8] = 0.0F;
         }

         return 0;
      }
   }

   private static void func_101702_render_line(int var0, int var1, int var2, int var3, float[] var4) {
      int var5 = var3 - var2;
      int var6 = var1 - var0;
      int var7 = Math.abs(var5);
      int var8 = var5 / var6;
      int var9 = var5 < 0?var8 - 1:var8 + 1;
      int var10 = var0;
      int var11 = var2;
      int var12 = 0;
      var7 -= Math.abs(var8 * var6);
      var4[var0] *= field_101705_FLOOR_fromdB_LOOKUP[var2];

      while(true) {
         ++var10;
         if(var10 >= var1) {
            return;
         }

         var12 += var7;
         if(var12 >= var6) {
            var12 -= var6;
            var11 += var9;
         } else {
            var11 += var8;
         }

         var4[var10] *= field_101705_FLOOR_fromdB_LOOKUP[var11];
      }
   }

}
