package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101364_Util;
import com.jcraft.jorbis.C_101366_InfoMode;
import com.jcraft.jorbis.C_101370_FuncMapping;
import com.jcraft.jorbis.C_101377_Comment;
import com.jcraft.jorbis.C_101378_FuncTime;
import com.jcraft.jorbis.C_101383_FuncFloor;
import com.jcraft.jorbis.C_101384_PsyInfo;
import com.jcraft.jorbis.C_101385_StaticCodeBook;
import com.jcraft.jorbis.C_101387_FuncResidue;
import com.jcraft.p_101362_jogg.C_101406_Packet;
import com.jcraft.p_101362_jogg.C_101408_Buffer;

public class C_101390_Info {

   private static final int field_101993_OV_EBADPACKET = -136;
   private static final int field_101964_OV_ENOTAUDIO = -135;
   private static byte[] field_101990__vorbis = "vorbis".getBytes();
   private static final int field_101989_VI_TIMEB = 1;
   private static final int field_101986_VI_FLOORB = 2;
   private static final int field_101969_VI_RESB = 3;
   private static final int field_101966_VI_MAPB = 1;
   private static final int field_101995_VI_WINDOWB = 1;
   public int field_101967_version;
   public int field_101988_channels;
   public int field_101970_rate;
   int field_101979_bitrate_upper;
   int field_101991_bitrate_nominal;
   int field_101982_bitrate_lower;
   int[] field_101976_blocksizes = new int[2];
   int field_101978_modes;
   int field_101994_maps;
   int field_101972_times;
   int field_101971_floors;
   int field_101961_residues;
   int field_101981_books;
   int field_101992_psys;
   C_101366_InfoMode[] field_101977_mode_param = null;
   int[] field_101974_map_type = null;
   Object[] field_101985_map_param = null;
   int[] field_101968_time_type = null;
   Object[] field_101996_time_param = null;
   int[] field_101963_floor_type = null;
   Object[] field_101973_floor_param = null;
   int[] field_101962_residue_type = null;
   Object[] field_101975_residue_param = null;
   C_101385_StaticCodeBook[] field_101980_book_param = null;
   C_101384_PsyInfo[] field_101983_psy_param = new C_101384_PsyInfo[64];
   int field_101965_envelopesa;
   float field_101987_preecho_thresh;
   float field_101984_preecho_clamp;


   public void func_101954_init() {
      this.field_101970_rate = 0;
   }

   public void func_101956_clear() {
      int var1;
      for(var1 = 0; var1 < this.field_101978_modes; ++var1) {
         this.field_101977_mode_param[var1] = null;
      }

      this.field_101977_mode_param = null;

      for(var1 = 0; var1 < this.field_101994_maps; ++var1) {
         C_101370_FuncMapping.field_101542_mapping_P[this.field_101974_map_type[var1]].func_101541_free_info(this.field_101985_map_param[var1]);
      }

      this.field_101985_map_param = null;

      for(var1 = 0; var1 < this.field_101972_times; ++var1) {
         C_101378_FuncTime.field_101815_time_P[this.field_101968_time_type[var1]].func_101814_free_info(this.field_101996_time_param[var1]);
      }

      this.field_101996_time_param = null;

      for(var1 = 0; var1 < this.field_101971_floors; ++var1) {
         C_101383_FuncFloor.field_101700_floor_P[this.field_101963_floor_type[var1]].func_101698_free_info(this.field_101973_floor_param[var1]);
      }

      this.field_101973_floor_param = null;

      for(var1 = 0; var1 < this.field_101961_residues; ++var1) {
         C_101387_FuncResidue.field_101872_residue_P[this.field_101962_residue_type[var1]].func_101871_free_info(this.field_101975_residue_param[var1]);
      }

      this.field_101975_residue_param = null;

      for(var1 = 0; var1 < this.field_101981_books; ++var1) {
         if(this.field_101980_book_param[var1] != null) {
            this.field_101980_book_param[var1].func_101916_clear();
            this.field_101980_book_param[var1] = null;
         }
      }

      this.field_101980_book_param = null;

      for(var1 = 0; var1 < this.field_101992_psys; ++var1) {
         this.field_101983_psy_param[var1].func_101879_free();
      }

   }

   int func_101960_unpack_info(C_101408_Buffer var1) {
      this.field_101967_version = var1.func_102082_read(32);
      if(this.field_101967_version != 0) {
         return -1;
      } else {
         this.field_101988_channels = var1.func_102082_read(8);
         this.field_101970_rate = var1.func_102082_read(32);
         this.field_101979_bitrate_upper = var1.func_102082_read(32);
         this.field_101991_bitrate_nominal = var1.func_102082_read(32);
         this.field_101982_bitrate_lower = var1.func_102082_read(32);
         this.field_101976_blocksizes[0] = 1 << var1.func_102082_read(4);
         this.field_101976_blocksizes[1] = 1 << var1.func_102082_read(4);
         if(this.field_101970_rate >= 1 && this.field_101988_channels >= 1 && this.field_101976_blocksizes[0] >= 8 && this.field_101976_blocksizes[1] >= this.field_101976_blocksizes[0] && var1.func_102082_read(1) == 1) {
            return 0;
         } else {
            this.func_101956_clear();
            return -1;
         }
      }
   }

   int func_101959_unpack_books(C_101408_Buffer var1) {
      this.field_101981_books = var1.func_102082_read(8) + 1;
      if(this.field_101980_book_param == null || this.field_101980_book_param.length != this.field_101981_books) {
         this.field_101980_book_param = new C_101385_StaticCodeBook[this.field_101981_books];
      }

      int var2;
      for(var2 = 0; var2 < this.field_101981_books; ++var2) {
         this.field_101980_book_param[var2] = new C_101385_StaticCodeBook();
         if(this.field_101980_book_param[var2].func_101918_unpack(var1) != 0) {
            this.func_101956_clear();
            return -1;
         }
      }

      this.field_101972_times = var1.func_102082_read(6) + 1;
      if(this.field_101968_time_type == null || this.field_101968_time_type.length != this.field_101972_times) {
         this.field_101968_time_type = new int[this.field_101972_times];
      }

      if(this.field_101996_time_param == null || this.field_101996_time_param.length != this.field_101972_times) {
         this.field_101996_time_param = new Object[this.field_101972_times];
      }

      for(var2 = 0; var2 < this.field_101972_times; ++var2) {
         this.field_101968_time_type[var2] = var1.func_102082_read(16);
         if(this.field_101968_time_type[var2] < 0 || this.field_101968_time_type[var2] >= 1) {
            this.func_101956_clear();
            return -1;
         }

         this.field_101996_time_param[var2] = C_101378_FuncTime.field_101815_time_P[this.field_101968_time_type[var2]].func_101813_unpack(this, var1);
         if(this.field_101996_time_param[var2] == null) {
            this.func_101956_clear();
            return -1;
         }
      }

      this.field_101971_floors = var1.func_102082_read(6) + 1;
      if(this.field_101963_floor_type == null || this.field_101963_floor_type.length != this.field_101971_floors) {
         this.field_101963_floor_type = new int[this.field_101971_floors];
      }

      if(this.field_101973_floor_param == null || this.field_101973_floor_param.length != this.field_101971_floors) {
         this.field_101973_floor_param = new Object[this.field_101971_floors];
      }

      for(var2 = 0; var2 < this.field_101971_floors; ++var2) {
         this.field_101963_floor_type[var2] = var1.func_102082_read(16);
         if(this.field_101963_floor_type[var2] < 0 || this.field_101963_floor_type[var2] >= 2) {
            this.func_101956_clear();
            return -1;
         }

         this.field_101973_floor_param[var2] = C_101383_FuncFloor.field_101700_floor_P[this.field_101963_floor_type[var2]].func_101697_unpack(this, var1);
         if(this.field_101973_floor_param[var2] == null) {
            this.func_101956_clear();
            return -1;
         }
      }

      this.field_101961_residues = var1.func_102082_read(6) + 1;
      if(this.field_101962_residue_type == null || this.field_101962_residue_type.length != this.field_101961_residues) {
         this.field_101962_residue_type = new int[this.field_101961_residues];
      }

      if(this.field_101975_residue_param == null || this.field_101975_residue_param.length != this.field_101961_residues) {
         this.field_101975_residue_param = new Object[this.field_101961_residues];
      }

      for(var2 = 0; var2 < this.field_101961_residues; ++var2) {
         this.field_101962_residue_type[var2] = var1.func_102082_read(16);
         if(this.field_101962_residue_type[var2] < 0 || this.field_101962_residue_type[var2] >= 3) {
            this.func_101956_clear();
            return -1;
         }

         this.field_101975_residue_param[var2] = C_101387_FuncResidue.field_101872_residue_P[this.field_101962_residue_type[var2]].func_101870_unpack(this, var1);
         if(this.field_101975_residue_param[var2] == null) {
            this.func_101956_clear();
            return -1;
         }
      }

      this.field_101994_maps = var1.func_102082_read(6) + 1;
      if(this.field_101974_map_type == null || this.field_101974_map_type.length != this.field_101994_maps) {
         this.field_101974_map_type = new int[this.field_101994_maps];
      }

      if(this.field_101985_map_param == null || this.field_101985_map_param.length != this.field_101994_maps) {
         this.field_101985_map_param = new Object[this.field_101994_maps];
      }

      for(var2 = 0; var2 < this.field_101994_maps; ++var2) {
         this.field_101974_map_type[var2] = var1.func_102082_read(16);
         if(this.field_101974_map_type[var2] < 0 || this.field_101974_map_type[var2] >= 1) {
            this.func_101956_clear();
            return -1;
         }

         this.field_101985_map_param[var2] = C_101370_FuncMapping.field_101542_mapping_P[this.field_101974_map_type[var2]].func_101539_unpack(this, var1);
         if(this.field_101985_map_param[var2] == null) {
            this.func_101956_clear();
            return -1;
         }
      }

      this.field_101978_modes = var1.func_102082_read(6) + 1;
      if(this.field_101977_mode_param == null || this.field_101977_mode_param.length != this.field_101978_modes) {
         this.field_101977_mode_param = new C_101366_InfoMode[this.field_101978_modes];
      }

      for(var2 = 0; var2 < this.field_101978_modes; ++var2) {
         this.field_101977_mode_param[var2] = new C_101366_InfoMode();
         this.field_101977_mode_param[var2].field_101489_blockflag = var1.func_102082_read(1);
         this.field_101977_mode_param[var2].field_101488_windowtype = var1.func_102082_read(16);
         this.field_101977_mode_param[var2].field_101491_transformtype = var1.func_102082_read(16);
         this.field_101977_mode_param[var2].field_101490_mapping = var1.func_102082_read(8);
         if(this.field_101977_mode_param[var2].field_101488_windowtype >= 1 || this.field_101977_mode_param[var2].field_101491_transformtype >= 1 || this.field_101977_mode_param[var2].field_101490_mapping >= this.field_101994_maps) {
            this.func_101956_clear();
            return -1;
         }
      }

      if(var1.func_102082_read(1) != 1) {
         this.func_101956_clear();
         return -1;
      } else {
         return 0;
      }
   }

   public int func_101953_synthesis_headerin(C_101377_Comment var1, C_101406_Packet var2) {
      C_101408_Buffer var3 = new C_101408_Buffer();
      if(var2 != null) {
         var3.func_102072_readinit(var2.field_102052_packet_base, var2.field_102051_packet, var2.field_102048_bytes);
         byte[] var4 = new byte[6];
         int var5 = var3.func_102082_read(8);
         var3.func_102076_read(var4, 6);
         if(var4[0] != 118 || var4[1] != 111 || var4[2] != 114 || var4[3] != 98 || var4[4] != 105 || var4[5] != 115) {
            return -1;
         }

         switch(var5) {
         case 1:
            if(var2.field_102050_b_o_s == 0) {
               return -1;
            }

            if(this.field_101970_rate != 0) {
               return -1;
            }

            return this.func_101960_unpack_info(var3);
         case 2:
         case 4:
         default:
            break;
         case 3:
            if(this.field_101970_rate == 0) {
               return -1;
            }

            return var1.func_101800_unpack(var3);
         case 5:
            if(this.field_101970_rate != 0 && var1.field_101804_vendor != null) {
               return this.func_101959_unpack_books(var3);
            }

            return -1;
         }
      }

      return -1;
   }

   int func_101955_pack_info(C_101408_Buffer var1) {
      var1.func_102077_write(1, 8);
      var1.func_102080_write(field_101990__vorbis);
      var1.func_102077_write(0, 32);
      var1.func_102077_write(this.field_101988_channels, 8);
      var1.func_102077_write(this.field_101970_rate, 32);
      var1.func_102077_write(this.field_101979_bitrate_upper, 32);
      var1.func_102077_write(this.field_101991_bitrate_nominal, 32);
      var1.func_102077_write(this.field_101982_bitrate_lower, 32);
      var1.func_102077_write(C_101364_Util.func_101455_ilog2(this.field_101976_blocksizes[0]), 4);
      var1.func_102077_write(C_101364_Util.func_101455_ilog2(this.field_101976_blocksizes[1]), 4);
      var1.func_102077_write(1, 1);
      return 0;
   }

   int func_101957_pack_books(C_101408_Buffer var1) {
      var1.func_102077_write(5, 8);
      var1.func_102080_write(field_101990__vorbis);
      var1.func_102077_write(this.field_101981_books - 1, 8);

      int var2;
      for(var2 = 0; var2 < this.field_101981_books; ++var2) {
         if(this.field_101980_book_param[var2].func_101919_pack(var1) != 0) {
            return -1;
         }
      }

      var1.func_102077_write(this.field_101972_times - 1, 6);

      for(var2 = 0; var2 < this.field_101972_times; ++var2) {
         var1.func_102077_write(this.field_101968_time_type[var2], 16);
         C_101378_FuncTime.field_101815_time_P[this.field_101968_time_type[var2]].func_101811_pack(this.field_101996_time_param[var2], var1);
      }

      var1.func_102077_write(this.field_101971_floors - 1, 6);

      for(var2 = 0; var2 < this.field_101971_floors; ++var2) {
         var1.func_102077_write(this.field_101963_floor_type[var2], 16);
         C_101383_FuncFloor.field_101700_floor_P[this.field_101963_floor_type[var2]].func_101693_pack(this.field_101973_floor_param[var2], var1);
      }

      var1.func_102077_write(this.field_101961_residues - 1, 6);

      for(var2 = 0; var2 < this.field_101961_residues; ++var2) {
         var1.func_102077_write(this.field_101962_residue_type[var2], 16);
         C_101387_FuncResidue.field_101872_residue_P[this.field_101962_residue_type[var2]].func_101868_pack(this.field_101975_residue_param[var2], var1);
      }

      var1.func_102077_write(this.field_101994_maps - 1, 6);

      for(var2 = 0; var2 < this.field_101994_maps; ++var2) {
         var1.func_102077_write(this.field_101974_map_type[var2], 16);
         C_101370_FuncMapping.field_101542_mapping_P[this.field_101974_map_type[var2]].func_101537_pack(this, this.field_101985_map_param[var2], var1);
      }

      var1.func_102077_write(this.field_101978_modes - 1, 6);

      for(var2 = 0; var2 < this.field_101978_modes; ++var2) {
         var1.func_102077_write(this.field_101977_mode_param[var2].field_101489_blockflag, 1);
         var1.func_102077_write(this.field_101977_mode_param[var2].field_101488_windowtype, 16);
         var1.func_102077_write(this.field_101977_mode_param[var2].field_101491_transformtype, 16);
         var1.func_102077_write(this.field_101977_mode_param[var2].field_101490_mapping, 8);
      }

      var1.func_102077_write(1, 1);
      return 0;
   }

   public int func_101958_blocksize(C_101406_Packet var1) {
      C_101408_Buffer var2 = new C_101408_Buffer();
      var2.func_102072_readinit(var1.field_102052_packet_base, var1.field_102051_packet, var1.field_102048_bytes);
      if(var2.func_102082_read(1) != 0) {
         return -135;
      } else {
         int var4 = 0;

         for(int var5 = this.field_101978_modes; var5 > 1; var5 >>>= 1) {
            ++var4;
         }

         int var3 = var2.func_102082_read(var4);
         return var3 == -1?-136:this.field_101976_blocksizes[this.field_101977_mode_param[var3].field_101489_blockflag];
      }
   }

   public String toString() {
      return "version:" + new Integer(this.field_101967_version) + ", channels:" + new Integer(this.field_101988_channels) + ", rate:" + new Integer(this.field_101970_rate) + ", bitrate:" + new Integer(this.field_101979_bitrate_upper) + "," + new Integer(this.field_101991_bitrate_nominal) + "," + new Integer(this.field_101982_bitrate_lower);
   }

}
