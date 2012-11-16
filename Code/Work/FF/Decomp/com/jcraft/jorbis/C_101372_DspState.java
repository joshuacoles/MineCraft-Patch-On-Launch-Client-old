package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101364_Util;
import com.jcraft.jorbis.C_101365_CodeBook;
import com.jcraft.jorbis.C_101368_Mdct;
import com.jcraft.jorbis.C_101370_FuncMapping;
import com.jcraft.jorbis.C_101375_Block;
import com.jcraft.jorbis.C_101390_Info;

public class C_101372_DspState {

   static final float field_101575_M_PI = 3.1415927F;
   static final int field_101581_VI_TRANSFORMB = 1;
   static final int field_101586_VI_WINDOWB = 1;
   int field_101584_analysisp;
   C_101390_Info field_101558_vi;
   int field_101560_modebits;
   float[][] field_101579_pcm;
   int field_101578_pcm_storage;
   int field_101572_pcm_current;
   int field_101570_pcm_returned;
   float[] field_101562_multipliers;
   int field_101573_envelope_storage;
   int field_101559_envelope_current;
   int field_101561_eofflag;
   int field_101576_lW;
   int field_101567_W;
   int field_101577_nW;
   int field_101568_centerW;
   long field_101557_granulepos;
   long field_101583_sequence;
   long field_101569_glue_bits;
   long field_101587_time_bits;
   long field_101585_floor_bits;
   long field_101571_res_bits;
   float[][][][][] field_101582_window;
   Object[][] field_101566_transform;
   C_101365_CodeBook[] field_101574_fullbooks;
   Object[] field_101565_mode;
   byte[] field_101580_header;
   byte[] field_101564_header1;
   byte[] field_101563_header2;


   public C_101372_DspState() {
      this.field_101566_transform = new Object[2][];
      this.field_101582_window = new float[2][][][][];
      this.field_101582_window[0] = new float[2][][][];
      this.field_101582_window[0][0] = new float[2][][];
      this.field_101582_window[0][1] = new float[2][][];
      this.field_101582_window[0][0][0] = new float[2][];
      this.field_101582_window[0][0][1] = new float[2][];
      this.field_101582_window[0][1][0] = new float[2][];
      this.field_101582_window[0][1][1] = new float[2][];
      this.field_101582_window[1] = new float[2][][][];
      this.field_101582_window[1][0] = new float[2][][];
      this.field_101582_window[1][1] = new float[2][][];
      this.field_101582_window[1][0][0] = new float[2][];
      this.field_101582_window[1][0][1] = new float[2][];
      this.field_101582_window[1][1][0] = new float[2][];
      this.field_101582_window[1][1][1] = new float[2][];
   }

   static float[] func_101550_window(int var0, int var1, int var2, int var3) {
      float[] var4 = new float[var1];
      switch(var0) {
      case 0:
         int var5 = var1 / 4 - var2 / 2;
         int var6 = var1 - var1 / 4 - var3 / 2;

         int var7;
         float var8;
         for(var7 = 0; var7 < var2; ++var7) {
            var8 = (float)(((double)var7 + 0.5D) / (double)var2 * 3.1415927410125732D / 2.0D);
            var8 = (float)Math.sin((double)var8);
            var8 *= var8;
            var8 = (float)((double)var8 * 1.5707963705062866D);
            var8 = (float)Math.sin((double)var8);
            var4[var7 + var5] = var8;
         }

         for(var7 = var5 + var2; var7 < var6; ++var7) {
            var4[var7] = 1.0F;
         }

         for(var7 = 0; var7 < var3; ++var7) {
            var8 = (float)(((double)(var3 - var7) - 0.5D) / (double)var3 * 3.1415927410125732D / 2.0D);
            var8 = (float)Math.sin((double)var8);
            var8 *= var8;
            var8 = (float)((double)var8 * 1.5707963705062866D);
            var8 = (float)Math.sin((double)var8);
            var4[var7 + var6] = var8;
         }

         return var4;
      default:
         return null;
      }
   }

   int func_101555_init(C_101390_Info var1, boolean var2) {
      this.field_101558_vi = var1;
      this.field_101560_modebits = C_101364_Util.func_101455_ilog2(var1.field_101978_modes);
      this.field_101566_transform[0] = new Object[1];
      this.field_101566_transform[1] = new Object[1];
      this.field_101566_transform[0][0] = new C_101368_Mdct();
      this.field_101566_transform[1][0] = new C_101368_Mdct();
      ((C_101368_Mdct)this.field_101566_transform[0][0]).func_101503_init(var1.field_101976_blocksizes[0]);
      ((C_101368_Mdct)this.field_101566_transform[1][0]).func_101503_init(var1.field_101976_blocksizes[1]);
      this.field_101582_window[0][0][0] = new float[1][];
      this.field_101582_window[0][0][1] = this.field_101582_window[0][0][0];
      this.field_101582_window[0][1][0] = this.field_101582_window[0][0][0];
      this.field_101582_window[0][1][1] = this.field_101582_window[0][0][0];
      this.field_101582_window[1][0][0] = new float[1][];
      this.field_101582_window[1][0][1] = new float[1][];
      this.field_101582_window[1][1][0] = new float[1][];
      this.field_101582_window[1][1][1] = new float[1][];

      int var3;
      for(var3 = 0; var3 < 1; ++var3) {
         this.field_101582_window[0][0][0][var3] = func_101550_window(var3, var1.field_101976_blocksizes[0], var1.field_101976_blocksizes[0] / 2, var1.field_101976_blocksizes[0] / 2);
         this.field_101582_window[1][0][0][var3] = func_101550_window(var3, var1.field_101976_blocksizes[1], var1.field_101976_blocksizes[0] / 2, var1.field_101976_blocksizes[0] / 2);
         this.field_101582_window[1][0][1][var3] = func_101550_window(var3, var1.field_101976_blocksizes[1], var1.field_101976_blocksizes[0] / 2, var1.field_101976_blocksizes[1] / 2);
         this.field_101582_window[1][1][0][var3] = func_101550_window(var3, var1.field_101976_blocksizes[1], var1.field_101976_blocksizes[1] / 2, var1.field_101976_blocksizes[0] / 2);
         this.field_101582_window[1][1][1][var3] = func_101550_window(var3, var1.field_101976_blocksizes[1], var1.field_101976_blocksizes[1] / 2, var1.field_101976_blocksizes[1] / 2);
      }

      this.field_101574_fullbooks = new C_101365_CodeBook[var1.field_101981_books];

      for(var3 = 0; var3 < var1.field_101981_books; ++var3) {
         this.field_101574_fullbooks[var3] = new C_101365_CodeBook();
         this.field_101574_fullbooks[var3].func_101464_init_decode(var1.field_101980_book_param[var3]);
      }

      this.field_101578_pcm_storage = 8192;
      this.field_101579_pcm = new float[var1.field_101988_channels][];

      for(var3 = 0; var3 < var1.field_101988_channels; ++var3) {
         this.field_101579_pcm[var3] = new float[this.field_101578_pcm_storage];
      }

      this.field_101576_lW = 0;
      this.field_101567_W = 0;
      this.field_101568_centerW = var1.field_101976_blocksizes[1] / 2;
      this.field_101572_pcm_current = this.field_101568_centerW;
      this.field_101565_mode = new Object[var1.field_101978_modes];

      for(var3 = 0; var3 < var1.field_101978_modes; ++var3) {
         int var4 = var1.field_101977_mode_param[var3].field_101490_mapping;
         int var5 = var1.field_101974_map_type[var4];
         this.field_101565_mode[var3] = C_101370_FuncMapping.field_101542_mapping_P[var5].func_101536_look(this, var1.field_101977_mode_param[var3], var1.field_101985_map_param[var4]);
      }

      return 0;
   }

   public int func_101556_synthesis_init(C_101390_Info var1) {
      this.func_101555_init(var1, false);
      this.field_101570_pcm_returned = this.field_101568_centerW;
      this.field_101568_centerW -= var1.field_101976_blocksizes[this.field_101567_W] / 4 + var1.field_101976_blocksizes[this.field_101576_lW] / 4;
      this.field_101557_granulepos = -1L;
      this.field_101583_sequence = -1L;
      return 0;
   }

   C_101372_DspState(C_101390_Info var1) {
      this();
      this.func_101555_init(var1, false);
      this.field_101570_pcm_returned = this.field_101568_centerW;
      this.field_101568_centerW -= var1.field_101976_blocksizes[this.field_101567_W] / 4 + var1.field_101976_blocksizes[this.field_101576_lW] / 4;
      this.field_101557_granulepos = -1L;
      this.field_101583_sequence = -1L;
   }

   public int func_101553_synthesis_blockin(C_101375_Block var1) {
      int var2;
      int var3;
      if(this.field_101568_centerW > this.field_101558_vi.field_101976_blocksizes[1] / 2 && this.field_101570_pcm_returned > 8192) {
         var2 = this.field_101568_centerW - this.field_101558_vi.field_101976_blocksizes[1] / 2;
         var2 = this.field_101570_pcm_returned < var2?this.field_101570_pcm_returned:var2;
         this.field_101572_pcm_current -= var2;
         this.field_101568_centerW -= var2;
         this.field_101570_pcm_returned -= var2;
         if(var2 != 0) {
            for(var3 = 0; var3 < this.field_101558_vi.field_101988_channels; ++var3) {
               System.arraycopy(this.field_101579_pcm[var3], var2, this.field_101579_pcm[var3], 0, this.field_101572_pcm_current);
            }
         }
      }

      this.field_101576_lW = this.field_101567_W;
      this.field_101567_W = var1.field_101723_W;
      this.field_101577_nW = -1;
      this.field_101569_glue_bits += (long)var1.field_101724_glue_bits;
      this.field_101587_time_bits += (long)var1.field_101729_time_bits;
      this.field_101585_floor_bits += (long)var1.field_101726_floor_bits;
      this.field_101571_res_bits += (long)var1.field_101727_res_bits;
      if(this.field_101583_sequence + 1L != var1.field_101725_sequence) {
         this.field_101557_granulepos = -1L;
      }

      this.field_101583_sequence = var1.field_101725_sequence;
      var2 = this.field_101558_vi.field_101976_blocksizes[this.field_101567_W];
      var3 = this.field_101568_centerW + this.field_101558_vi.field_101976_blocksizes[this.field_101576_lW] / 4 + var2 / 4;
      int var4 = var3 - var2 / 2;
      int var5 = var4 + var2;
      int var6 = 0;
      int var7 = 0;
      int var8;
      if(var5 > this.field_101578_pcm_storage) {
         this.field_101578_pcm_storage = var5 + this.field_101558_vi.field_101976_blocksizes[1];

         for(var8 = 0; var8 < this.field_101558_vi.field_101988_channels; ++var8) {
            float[] var9 = new float[this.field_101578_pcm_storage];
            System.arraycopy(this.field_101579_pcm[var8], 0, var9, 0, this.field_101579_pcm[var8].length);
            this.field_101579_pcm[var8] = var9;
         }
      }

      switch(this.field_101567_W) {
      case 0:
         var6 = 0;
         var7 = this.field_101558_vi.field_101976_blocksizes[0] / 2;
         break;
      case 1:
         var6 = this.field_101558_vi.field_101976_blocksizes[1] / 4 - this.field_101558_vi.field_101976_blocksizes[this.field_101576_lW] / 4;
         var7 = var6 + this.field_101558_vi.field_101976_blocksizes[this.field_101576_lW] / 2;
      }

      for(var8 = 0; var8 < this.field_101558_vi.field_101988_channels; ++var8) {
         int var11 = var4;
         boolean var10 = false;

         int var12;
         for(var12 = var6; var12 < var7; ++var12) {
            this.field_101579_pcm[var8][var11 + var12] += var1.field_101720_pcm[var8][var12];
         }

         while(var12 < var2) {
            this.field_101579_pcm[var8][var11 + var12] = var1.field_101720_pcm[var8][var12];
            ++var12;
         }
      }

      if(this.field_101557_granulepos == -1L) {
         this.field_101557_granulepos = var1.field_101716_granulepos;
      } else {
         this.field_101557_granulepos += (long)(var3 - this.field_101568_centerW);
         if(var1.field_101716_granulepos != -1L && this.field_101557_granulepos != var1.field_101716_granulepos) {
            if(this.field_101557_granulepos > var1.field_101716_granulepos && var1.field_101719_eofflag != 0) {
               var3 = (int)((long)var3 - (this.field_101557_granulepos - var1.field_101716_granulepos));
            }

            this.field_101557_granulepos = var1.field_101716_granulepos;
         }
      }

      this.field_101568_centerW = var3;
      this.field_101572_pcm_current = var5;
      if(var1.field_101719_eofflag != 0) {
         this.field_101561_eofflag = 1;
      }

      return 0;
   }

   public int func_101554_synthesis_pcmout(float[][][] var1, int[] var2) {
      if(this.field_101570_pcm_returned >= this.field_101568_centerW) {
         return 0;
      } else {
         if(var1 != null) {
            for(int var3 = 0; var3 < this.field_101558_vi.field_101988_channels; ++var3) {
               var2[var3] = this.field_101570_pcm_returned;
            }

            var1[0] = this.field_101579_pcm;
         }

         return this.field_101568_centerW - this.field_101570_pcm_returned;
      }
   }

   public int func_101552_synthesis_read(int var1) {
      if(var1 != 0 && this.field_101570_pcm_returned + var1 > this.field_101568_centerW) {
         return -1;
      } else {
         this.field_101570_pcm_returned += var1;
         return 0;
      }
   }

   public void func_101551_clear() {}
}
