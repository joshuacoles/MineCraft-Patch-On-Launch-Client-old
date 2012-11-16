package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101370_FuncMapping;
import com.jcraft.jorbis.C_101372_DspState;
import com.jcraft.jorbis.C_101390_Info;
import com.jcraft.p_101362_jogg.C_101406_Packet;
import com.jcraft.p_101362_jogg.C_101408_Buffer;

public class C_101375_Block {

   float[][] field_101720_pcm = new float[0][];
   C_101408_Buffer field_101721_opb = new C_101408_Buffer();
   int field_101717_lW;
   int field_101723_W;
   int field_101718_nW;
   int field_101730_pcmend;
   int field_101722_mode;
   int field_101719_eofflag;
   long field_101716_granulepos;
   long field_101725_sequence;
   C_101372_DspState field_101728_vd;
   int field_101724_glue_bits;
   int field_101729_time_bits;
   int field_101726_floor_bits;
   int field_101727_res_bits;


   public C_101375_Block(C_101372_DspState var1) {
      this.field_101728_vd = var1;
      if(var1.field_101584_analysisp != 0) {
         this.field_101721_opb.func_102083_writeinit();
      }

   }

   public void func_101714_init(C_101372_DspState var1) {
      this.field_101728_vd = var1;
   }

   public int func_101715_clear() {
      if(this.field_101728_vd != null && this.field_101728_vd.field_101584_analysisp != 0) {
         this.field_101721_opb.func_102088_writeclear();
      }

      return 0;
   }

   public int func_101713_synthesis(C_101406_Packet var1) {
      C_101390_Info var2 = this.field_101728_vd.field_101558_vi;
      this.field_101721_opb.func_102072_readinit(var1.field_102052_packet_base, var1.field_102051_packet, var1.field_102048_bytes);
      if(this.field_101721_opb.func_102082_read(1) != 0) {
         return -1;
      } else {
         int var3 = this.field_101721_opb.func_102082_read(this.field_101728_vd.field_101560_modebits);
         if(var3 == -1) {
            return -1;
         } else {
            this.field_101722_mode = var3;
            this.field_101723_W = var2.field_101977_mode_param[this.field_101722_mode].field_101489_blockflag;
            if(this.field_101723_W != 0) {
               this.field_101717_lW = this.field_101721_opb.func_102082_read(1);
               this.field_101718_nW = this.field_101721_opb.func_102082_read(1);
               if(this.field_101718_nW == -1) {
                  return -1;
               }
            } else {
               this.field_101717_lW = 0;
               this.field_101718_nW = 0;
            }

            this.field_101716_granulepos = var1.field_102047_granulepos;
            this.field_101725_sequence = var1.field_102049_packetno - 3L;
            this.field_101719_eofflag = var1.field_102046_e_o_s;
            this.field_101730_pcmend = var2.field_101976_blocksizes[this.field_101723_W];
            if(this.field_101720_pcm.length < var2.field_101988_channels) {
               this.field_101720_pcm = new float[var2.field_101988_channels][];
            }

            int var4;
            for(var4 = 0; var4 < var2.field_101988_channels; ++var4) {
               if(this.field_101720_pcm[var4] != null && this.field_101720_pcm[var4].length >= this.field_101730_pcmend) {
                  for(int var5 = 0; var5 < this.field_101730_pcmend; ++var5) {
                     this.field_101720_pcm[var4][var5] = 0.0F;
                  }
               } else {
                  this.field_101720_pcm[var4] = new float[this.field_101730_pcmend];
               }
            }

            var4 = var2.field_101974_map_type[var2.field_101977_mode_param[this.field_101722_mode].field_101490_mapping];
            return C_101370_FuncMapping.field_101542_mapping_P[var4].func_101540_inverse(this, this.field_101728_vd.field_101565_mode[this.field_101722_mode]);
         }
      }
   }
}
