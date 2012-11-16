package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101364_Util;
import com.jcraft.jorbis.C_101365_CodeBook;
import com.jcraft.jorbis.C_101366_InfoMode;
import com.jcraft.jorbis.C_101372_DspState;
import com.jcraft.jorbis.C_101375_Block;
import com.jcraft.jorbis.C_101380_Residue0$C_101402_InfoResidue0;
import com.jcraft.jorbis.C_101380_Residue0$C_101403_LookResidue0;
import com.jcraft.jorbis.C_101387_FuncResidue;
import com.jcraft.jorbis.C_101390_Info;
import com.jcraft.p_101362_jogg.C_101408_Buffer;

class C_101380_Residue0 extends C_101387_FuncResidue {

   private static int[][][] field_101876__01inverse_partword = new int[2][][];
   static int[][] field_101875__2inverse_partword = (int[][])null;


   void func_101868_pack(Object var1, C_101408_Buffer var2) {
      C_101380_Residue0$C_101402_InfoResidue0 var3 = (C_101380_Residue0$C_101402_InfoResidue0)var1;
      int var4 = 0;
      var2.func_102077_write(var3.field_101852_begin, 24);
      var2.func_102077_write(var3.field_101851_end, 24);
      var2.func_102077_write(var3.field_101845_grouping - 1, 24);
      var2.func_102077_write(var3.field_101844_partitions - 1, 6);
      var2.func_102077_write(var3.field_101843_groupbook, 8);

      int var5;
      for(var5 = 0; var5 < var3.field_101844_partitions; ++var5) {
         int var6 = var3.field_101842_secondstages[var5];
         if(C_101364_Util.func_101456_ilog(var6) > 3) {
            var2.func_102077_write(var6, 3);
            var2.func_102077_write(1, 1);
            var2.func_102077_write(var6 >>> 3, 5);
         } else {
            var2.func_102077_write(var6, 4);
         }

         var4 += C_101364_Util.func_101454_icount(var6);
      }

      for(var5 = 0; var5 < var4; ++var5) {
         var2.func_102077_write(var3.field_101848_booklist[var5], 8);
      }

   }

   Object func_101870_unpack(C_101390_Info var1, C_101408_Buffer var2) {
      int var3 = 0;
      C_101380_Residue0$C_101402_InfoResidue0 var4 = new C_101380_Residue0$C_101402_InfoResidue0(this);
      var4.field_101852_begin = var2.func_102082_read(24);
      var4.field_101851_end = var2.func_102082_read(24);
      var4.field_101845_grouping = var2.func_102082_read(24) + 1;
      var4.field_101844_partitions = var2.func_102082_read(6) + 1;
      var4.field_101843_groupbook = var2.func_102082_read(8);

      int var5;
      for(var5 = 0; var5 < var4.field_101844_partitions; ++var5) {
         int var6 = var2.func_102082_read(3);
         if(var2.func_102082_read(1) != 0) {
            var6 |= var2.func_102082_read(5) << 3;
         }

         var4.field_101842_secondstages[var5] = var6;
         var3 += C_101364_Util.func_101454_icount(var6);
      }

      for(var5 = 0; var5 < var3; ++var5) {
         var4.field_101848_booklist[var5] = var2.func_102082_read(8);
      }

      if(var4.field_101843_groupbook >= var1.field_101981_books) {
         this.func_101871_free_info(var4);
         return null;
      } else {
         for(var5 = 0; var5 < var3; ++var5) {
            if(var4.field_101848_booklist[var5] >= var1.field_101981_books) {
               this.func_101871_free_info(var4);
               return null;
            }
         }

         return var4;
      }
   }

   Object func_101866_look(C_101372_DspState var1, C_101366_InfoMode var2, Object var3) {
      C_101380_Residue0$C_101402_InfoResidue0 var4 = (C_101380_Residue0$C_101402_InfoResidue0)var3;
      C_101380_Residue0$C_101403_LookResidue0 var5 = new C_101380_Residue0$C_101403_LookResidue0(this);
      int var6 = 0;
      int var8 = 0;
      var5.field_101861_info = var4;
      var5.field_101863_map = var2.field_101490_mapping;
      var5.field_101856_parts = var4.field_101844_partitions;
      var5.field_101855_fullbooks = var1.field_101574_fullbooks;
      var5.field_101853_phrasebook = var1.field_101574_fullbooks[var4.field_101843_groupbook];
      int var7 = var5.field_101853_phrasebook.field_101481_dim;
      var5.field_101864_partbooks = new int[var5.field_101856_parts][];

      int var9;
      int var10;
      int var11;
      int var12;
      for(var9 = 0; var9 < var5.field_101856_parts; ++var9) {
         var10 = var4.field_101842_secondstages[var9];
         var11 = C_101364_Util.func_101456_ilog(var10);
         if(var11 != 0) {
            if(var11 > var8) {
               var8 = var11;
            }

            var5.field_101864_partbooks[var9] = new int[var11];

            for(var12 = 0; var12 < var11; ++var12) {
               if((var10 & 1 << var12) != 0) {
                  var5.field_101864_partbooks[var9][var12] = var4.field_101848_booklist[var6++];
               }
            }
         }
      }

      var5.field_101865_partvals = (int)Math.rint(Math.pow((double)var5.field_101856_parts, (double)var7));
      var5.field_101860_stages = var8;
      var5.field_101854_decodemap = new int[var5.field_101865_partvals][];

      for(var9 = 0; var9 < var5.field_101865_partvals; ++var9) {
         var10 = var9;
         var11 = var5.field_101865_partvals / var5.field_101856_parts;
         var5.field_101854_decodemap[var9] = new int[var7];

         for(var12 = 0; var12 < var7; ++var12) {
            int var13 = var10 / var11;
            var10 -= var13 * var11;
            var11 /= var5.field_101856_parts;
            var5.field_101854_decodemap[var9][var12] = var13;
         }
      }

      return var5;
   }

   void func_101871_free_info(Object var1) {}

   void func_101869_free_look(Object var1) {}

   static synchronized int func_101873__01inverse(C_101375_Block var0, Object var1, float[][] var2, int var3, int var4) {
      C_101380_Residue0$C_101403_LookResidue0 var10 = (C_101380_Residue0$C_101403_LookResidue0)var1;
      C_101380_Residue0$C_101402_InfoResidue0 var11 = var10.field_101861_info;
      int var12 = var11.field_101845_grouping;
      int var13 = var10.field_101853_phrasebook.field_101481_dim;
      int var14 = var11.field_101851_end - var11.field_101852_begin;
      int var15 = var14 / var12;
      int var16 = (var15 + var13 - 1) / var13;
      if(field_101876__01inverse_partword.length < var3) {
         field_101876__01inverse_partword = new int[var3][][];
      }

      int var6;
      for(var6 = 0; var6 < var3; ++var6) {
         if(field_101876__01inverse_partword[var6] == null || field_101876__01inverse_partword[var6].length < var16) {
            field_101876__01inverse_partword[var6] = new int[var16][];
         }
      }

      for(int var9 = 0; var9 < var10.field_101860_stages; ++var9) {
         int var5 = 0;

         for(int var8 = 0; var5 < var15; ++var8) {
            int var17;
            if(var9 == 0) {
               for(var6 = 0; var6 < var3; ++var6) {
                  var17 = var10.field_101853_phrasebook.func_101466_decode(var0.field_101721_opb);
                  if(var17 == -1) {
                     return 0;
                  }

                  field_101876__01inverse_partword[var6][var8] = var10.field_101854_decodemap[var17];
                  if(field_101876__01inverse_partword[var6][var8] == null) {
                     return 0;
                  }
               }
            }

            for(int var7 = 0; var7 < var13 && var5 < var15; ++var5) {
               for(var6 = 0; var6 < var3; ++var6) {
                  var17 = var11.field_101852_begin + var5 * var12;
                  int var18 = field_101876__01inverse_partword[var6][var8][var7];
                  if((var11.field_101842_secondstages[var18] & 1 << var9) != 0) {
                     C_101365_CodeBook var19 = var10.field_101855_fullbooks[var10.field_101864_partbooks[var18][var9]];
                     if(var19 != null) {
                        if(var4 == 0) {
                           if(var19.func_101467_decodevs_add(var2[var6], var17, var0.field_101721_opb, var12) == -1) {
                              return 0;
                           }
                        } else if(var4 == 1 && var19.func_101473_decodev_add(var2[var6], var17, var0.field_101721_opb, var12) == -1) {
                           return 0;
                        }
                     }
                  }
               }

               ++var7;
            }
         }
      }

      return 0;
   }

   static synchronized int func_101874__2inverse(C_101375_Block var0, Object var1, float[][] var2, int var3) {
      C_101380_Residue0$C_101403_LookResidue0 var8 = (C_101380_Residue0$C_101403_LookResidue0)var1;
      C_101380_Residue0$C_101402_InfoResidue0 var9 = var8.field_101861_info;
      int var10 = var9.field_101845_grouping;
      int var11 = var8.field_101853_phrasebook.field_101481_dim;
      int var12 = var9.field_101851_end - var9.field_101852_begin;
      int var13 = var12 / var10;
      int var14 = (var13 + var11 - 1) / var11;
      if(field_101875__2inverse_partword == null || field_101875__2inverse_partword.length < var14) {
         field_101875__2inverse_partword = new int[var14][];
      }

      for(int var7 = 0; var7 < var8.field_101860_stages; ++var7) {
         int var4 = 0;

         for(int var6 = 0; var4 < var13; ++var6) {
            int var15;
            if(var7 == 0) {
               var15 = var8.field_101853_phrasebook.func_101466_decode(var0.field_101721_opb);
               if(var15 == -1) {
                  return 0;
               }

               field_101875__2inverse_partword[var6] = var8.field_101854_decodemap[var15];
               if(field_101875__2inverse_partword[var6] == null) {
                  return 0;
               }
            }

            for(int var5 = 0; var5 < var11 && var4 < var13; ++var4) {
               var15 = var9.field_101852_begin + var4 * var10;
               int var16 = field_101875__2inverse_partword[var6][var5];
               if((var9.field_101842_secondstages[var16] & 1 << var7) != 0) {
                  C_101365_CodeBook var17 = var8.field_101855_fullbooks[var8.field_101864_partbooks[var16][var7]];
                  if(var17 != null && var17.func_101476_decodevv_add(var2, var15, var3, var0.field_101721_opb, var10) == -1) {
                     return 0;
                  }
               }

               ++var5;
            }
         }
      }

      return 0;
   }

   int func_101867_inverse(C_101375_Block var1, Object var2, float[][] var3, int[] var4, int var5) {
      int var6 = 0;

      for(int var7 = 0; var7 < var5; ++var7) {
         if(var4[var7] != 0) {
            var3[var6++] = var3[var7];
         }
      }

      if(var6 != 0) {
         return func_101873__01inverse(var1, var2, var3, var6, 0);
      } else {
         return 0;
      }
   }

}
