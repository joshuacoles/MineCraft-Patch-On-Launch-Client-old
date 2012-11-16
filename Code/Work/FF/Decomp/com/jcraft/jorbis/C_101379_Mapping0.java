package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101364_Util;
import com.jcraft.jorbis.C_101366_InfoMode;
import com.jcraft.jorbis.C_101368_Mdct;
import com.jcraft.jorbis.C_101370_FuncMapping;
import com.jcraft.jorbis.C_101372_DspState;
import com.jcraft.jorbis.C_101375_Block;
import com.jcraft.jorbis.C_101378_FuncTime;
import com.jcraft.jorbis.C_101379_Mapping0$C_101400_InfoMapping0;
import com.jcraft.jorbis.C_101379_Mapping0$C_101401_LookMapping0;
import com.jcraft.jorbis.C_101383_FuncFloor;
import com.jcraft.jorbis.C_101387_FuncResidue;
import com.jcraft.jorbis.C_101390_Info;
import com.jcraft.p_101362_jogg.C_101408_Buffer;

class C_101379_Mapping0 extends C_101370_FuncMapping {

   static int field_101544_seq = 0;
   float[][] field_101547_pcmbundle = (float[][])null;
   int[] field_101545_zerobundle = null;
   int[] field_101546_nonzero = null;
   Object[] field_101543_floormemo = null;


   void func_101541_free_info(Object var1) {}

   void func_101538_free_look(Object var1) {}

   Object func_101536_look(C_101372_DspState var1, C_101366_InfoMode var2, Object var3) {
      C_101390_Info var4 = var1.field_101558_vi;
      C_101379_Mapping0$C_101401_LookMapping0 var5 = new C_101379_Mapping0$C_101401_LookMapping0(this);
      C_101379_Mapping0$C_101400_InfoMapping0 var6 = var5.field_101835_map = (C_101379_Mapping0$C_101400_InfoMapping0)var3;
      var5.field_101832_mode = var2;
      var5.field_101828_time_look = new Object[var6.field_101826_submaps];
      var5.field_101839_floor_look = new Object[var6.field_101826_submaps];
      var5.field_101831_residue_look = new Object[var6.field_101826_submaps];
      var5.field_101827_time_func = new C_101378_FuncTime[var6.field_101826_submaps];
      var5.field_101834_floor_func = new C_101383_FuncFloor[var6.field_101826_submaps];
      var5.field_101836_residue_func = new C_101387_FuncResidue[var6.field_101826_submaps];

      for(int var7 = 0; var7 < var6.field_101826_submaps; ++var7) {
         int var8 = var6.field_101822_timesubmap[var7];
         int var9 = var6.field_101821_floorsubmap[var7];
         int var10 = var6.field_101824_residuesubmap[var7];
         var5.field_101827_time_func[var7] = C_101378_FuncTime.field_101815_time_P[var4.field_101968_time_type[var8]];
         var5.field_101828_time_look[var7] = var5.field_101827_time_func[var7].func_101809_look(var1, var2, var4.field_101996_time_param[var8]);
         var5.field_101834_floor_func[var7] = C_101383_FuncFloor.field_101700_floor_P[var4.field_101963_floor_type[var9]];
         var5.field_101839_floor_look[var7] = var5.field_101834_floor_func[var7].func_101691_look(var1, var2, var4.field_101973_floor_param[var9]);
         var5.field_101836_residue_func[var7] = C_101387_FuncResidue.field_101872_residue_P[var4.field_101962_residue_type[var10]];
         var5.field_101831_residue_look[var7] = var5.field_101836_residue_func[var7].func_101866_look(var1, var2, var4.field_101975_residue_param[var10]);
      }

      if(var4.field_101992_psys != 0 && var1.field_101584_analysisp != 0) {
         ;
      }

      var5.field_101837_ch = var4.field_101988_channels;
      return var5;
   }

   void func_101537_pack(C_101390_Info var1, Object var2, C_101408_Buffer var3) {
      C_101379_Mapping0$C_101400_InfoMapping0 var4 = (C_101379_Mapping0$C_101400_InfoMapping0)var2;
      if(var4.field_101826_submaps > 1) {
         var3.func_102077_write(1, 1);
         var3.func_102077_write(var4.field_101826_submaps - 1, 4);
      } else {
         var3.func_102077_write(0, 1);
      }

      int var5;
      if(var4.field_101818_coupling_steps > 0) {
         var3.func_102077_write(1, 1);
         var3.func_102077_write(var4.field_101818_coupling_steps - 1, 8);

         for(var5 = 0; var5 < var4.field_101818_coupling_steps; ++var5) {
            var3.func_102077_write(var4.field_101819_coupling_mag[var5], C_101364_Util.func_101455_ilog2(var1.field_101988_channels));
            var3.func_102077_write(var4.field_101820_coupling_ang[var5], C_101364_Util.func_101455_ilog2(var1.field_101988_channels));
         }
      } else {
         var3.func_102077_write(0, 1);
      }

      var3.func_102077_write(0, 2);
      if(var4.field_101826_submaps > 1) {
         for(var5 = 0; var5 < var1.field_101988_channels; ++var5) {
            var3.func_102077_write(var4.field_101825_chmuxlist[var5], 4);
         }
      }

      for(var5 = 0; var5 < var4.field_101826_submaps; ++var5) {
         var3.func_102077_write(var4.field_101822_timesubmap[var5], 8);
         var3.func_102077_write(var4.field_101821_floorsubmap[var5], 8);
         var3.func_102077_write(var4.field_101824_residuesubmap[var5], 8);
      }

   }

   Object func_101539_unpack(C_101390_Info var1, C_101408_Buffer var2) {
      C_101379_Mapping0$C_101400_InfoMapping0 var3 = new C_101379_Mapping0$C_101400_InfoMapping0(this);
      if(var2.func_102082_read(1) != 0) {
         var3.field_101826_submaps = var2.func_102082_read(4) + 1;
      } else {
         var3.field_101826_submaps = 1;
      }

      int var4;
      if(var2.func_102082_read(1) != 0) {
         var3.field_101818_coupling_steps = var2.func_102082_read(8) + 1;

         for(var4 = 0; var4 < var3.field_101818_coupling_steps; ++var4) {
            int var5 = var3.field_101819_coupling_mag[var4] = var2.func_102082_read(C_101364_Util.func_101455_ilog2(var1.field_101988_channels));
            int var6 = var3.field_101820_coupling_ang[var4] = var2.func_102082_read(C_101364_Util.func_101455_ilog2(var1.field_101988_channels));
            if(var5 < 0 || var6 < 0 || var5 == var6 || var5 >= var1.field_101988_channels || var6 >= var1.field_101988_channels) {
               var3.func_101816_free();
               return null;
            }
         }
      }

      if(var2.func_102082_read(2) > 0) {
         var3.func_101816_free();
         return null;
      } else {
         if(var3.field_101826_submaps > 1) {
            for(var4 = 0; var4 < var1.field_101988_channels; ++var4) {
               var3.field_101825_chmuxlist[var4] = var2.func_102082_read(4);
               if(var3.field_101825_chmuxlist[var4] >= var3.field_101826_submaps) {
                  var3.func_101816_free();
                  return null;
               }
            }
         }

         for(var4 = 0; var4 < var3.field_101826_submaps; ++var4) {
            var3.field_101822_timesubmap[var4] = var2.func_102082_read(8);
            if(var3.field_101822_timesubmap[var4] >= var1.field_101972_times) {
               var3.func_101816_free();
               return null;
            }

            var3.field_101821_floorsubmap[var4] = var2.func_102082_read(8);
            if(var3.field_101821_floorsubmap[var4] >= var1.field_101971_floors) {
               var3.func_101816_free();
               return null;
            }

            var3.field_101824_residuesubmap[var4] = var2.func_102082_read(8);
            if(var3.field_101824_residuesubmap[var4] >= var1.field_101961_residues) {
               var3.func_101816_free();
               return null;
            }
         }

         return var3;
      }
   }

   synchronized int func_101540_inverse(C_101375_Block var1, Object var2) {
      C_101372_DspState var3 = var1.field_101728_vd;
      C_101390_Info var4 = var3.field_101558_vi;
      C_101379_Mapping0$C_101401_LookMapping0 var5 = (C_101379_Mapping0$C_101401_LookMapping0)var2;
      C_101379_Mapping0$C_101400_InfoMapping0 var6 = var5.field_101835_map;
      C_101366_InfoMode var7 = var5.field_101832_mode;
      int var8 = var1.field_101730_pcmend = var4.field_101976_blocksizes[var1.field_101723_W];
      float[] var9 = var3.field_101582_window[var1.field_101723_W][var1.field_101717_lW][var1.field_101718_nW][var7.field_101488_windowtype];
      if(this.field_101547_pcmbundle == null || this.field_101547_pcmbundle.length < var4.field_101988_channels) {
         this.field_101547_pcmbundle = new float[var4.field_101988_channels][];
         this.field_101546_nonzero = new int[var4.field_101988_channels];
         this.field_101545_zerobundle = new int[var4.field_101988_channels];
         this.field_101543_floormemo = new Object[var4.field_101988_channels];
      }

      int var10;
      float[] var11;
      int var12;
      int var13;
      for(var10 = 0; var10 < var4.field_101988_channels; ++var10) {
         var11 = var1.field_101720_pcm[var10];
         var12 = var6.field_101825_chmuxlist[var10];
         this.field_101543_floormemo[var10] = var5.field_101834_floor_func[var12].func_101694_inverse1(var1, var5.field_101839_floor_look[var12], this.field_101543_floormemo[var10]);
         if(this.field_101543_floormemo[var10] != null) {
            this.field_101546_nonzero[var10] = 1;
         } else {
            this.field_101546_nonzero[var10] = 0;
         }

         for(var13 = 0; var13 < var8 / 2; ++var13) {
            var11[var13] = 0.0F;
         }
      }

      for(var10 = 0; var10 < var6.field_101818_coupling_steps; ++var10) {
         if(this.field_101546_nonzero[var6.field_101819_coupling_mag[var10]] != 0 || this.field_101546_nonzero[var6.field_101820_coupling_ang[var10]] != 0) {
            this.field_101546_nonzero[var6.field_101819_coupling_mag[var10]] = 1;
            this.field_101546_nonzero[var6.field_101820_coupling_ang[var10]] = 1;
         }
      }

      for(var10 = 0; var10 < var6.field_101826_submaps; ++var10) {
         int var16 = 0;

         for(var12 = 0; var12 < var4.field_101988_channels; ++var12) {
            if(var6.field_101825_chmuxlist[var12] == var10) {
               if(this.field_101546_nonzero[var12] != 0) {
                  this.field_101545_zerobundle[var16] = 1;
               } else {
                  this.field_101545_zerobundle[var16] = 0;
               }

               this.field_101547_pcmbundle[var16++] = var1.field_101720_pcm[var12];
            }
         }

         var5.field_101836_residue_func[var10].func_101867_inverse(var1, var5.field_101831_residue_look[var10], this.field_101547_pcmbundle, this.field_101545_zerobundle, var16);
      }

      for(var10 = var6.field_101818_coupling_steps - 1; var10 >= 0; --var10) {
         var11 = var1.field_101720_pcm[var6.field_101819_coupling_mag[var10]];
         float[] var17 = var1.field_101720_pcm[var6.field_101820_coupling_ang[var10]];

         for(var13 = 0; var13 < var8 / 2; ++var13) {
            float var14 = var11[var13];
            float var15 = var17[var13];
            if(var14 > 0.0F) {
               if(var15 > 0.0F) {
                  var11[var13] = var14;
                  var17[var13] = var14 - var15;
               } else {
                  var17[var13] = var14;
                  var11[var13] = var14 + var15;
               }
            } else if(var15 > 0.0F) {
               var11[var13] = var14;
               var17[var13] = var14 + var15;
            } else {
               var17[var13] = var14;
               var11[var13] = var14 - var15;
            }
         }
      }

      for(var10 = 0; var10 < var4.field_101988_channels; ++var10) {
         var11 = var1.field_101720_pcm[var10];
         var12 = var6.field_101825_chmuxlist[var10];
         var5.field_101834_floor_func[var12].func_101699_inverse2(var1, var5.field_101839_floor_look[var12], this.field_101543_floormemo[var10], var11);
      }

      for(var10 = 0; var10 < var4.field_101988_channels; ++var10) {
         var11 = var1.field_101720_pcm[var10];
         ((C_101368_Mdct)var3.field_101566_transform[var1.field_101723_W][0]).func_101502_backward(var11, var11);
      }

      for(var10 = 0; var10 < var4.field_101988_channels; ++var10) {
         var11 = var1.field_101720_pcm[var10];
         if(this.field_101546_nonzero[var10] != 0) {
            for(var12 = 0; var12 < var8; ++var12) {
               var11[var12] *= var9[var12];
            }
         } else {
            for(var12 = 0; var12 < var8; ++var12) {
               var11[var12] = 0.0F;
            }
         }
      }

      return 0;
   }

}
