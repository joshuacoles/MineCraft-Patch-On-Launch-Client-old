package com.jcraft.p_101362_jogg;

import com.jcraft.p_101362_jogg.C_101405_Page;
import com.jcraft.p_101362_jogg.C_101406_Packet;

public class C_101404_StreamState {

   byte[] field_102024_body_data;
   int field_102015_body_storage;
   int field_102020_body_fill;
   private int field_102025_body_returned;
   int[] field_102014_lacing_vals;
   long[] field_102026_granule_vals;
   int field_102010_lacing_storage;
   int field_102023_lacing_fill;
   int field_102016_lacing_packet;
   int field_102021_lacing_returned;
   byte[] field_102019_header;
   int field_102011_header_fill;
   public int field_102012_e_o_s;
   int field_102017_b_o_s;
   int field_102027_serialno;
   int field_102018_pageno;
   long field_102022_packetno;
   long field_102013_granulepos;


   public C_101404_StreamState() {
      this.field_102019_header = new byte[282];
      this.func_101999_init();
   }

   C_101404_StreamState(int var1) {
      this();
      this.func_102006_init(var1);
   }

   void func_101999_init() {
      this.field_102015_body_storage = 16384;
      this.field_102024_body_data = new byte[this.field_102015_body_storage];
      this.field_102010_lacing_storage = 1024;
      this.field_102014_lacing_vals = new int[this.field_102010_lacing_storage];
      this.field_102026_granule_vals = new long[this.field_102010_lacing_storage];
   }

   public void func_102006_init(int var1) {
      if(this.field_102024_body_data == null) {
         this.func_101999_init();
      } else {
         int var2;
         for(var2 = 0; var2 < this.field_102024_body_data.length; ++var2) {
            this.field_102024_body_data[var2] = 0;
         }

         for(var2 = 0; var2 < this.field_102014_lacing_vals.length; ++var2) {
            this.field_102014_lacing_vals[var2] = 0;
         }

         for(var2 = 0; var2 < this.field_102026_granule_vals.length; ++var2) {
            this.field_102026_granule_vals[var2] = 0L;
         }
      }

      this.field_102027_serialno = var1;
   }

   public void func_102001_clear() {
      this.field_102024_body_data = null;
      this.field_102014_lacing_vals = null;
      this.field_102026_granule_vals = null;
   }

   void func_102002_destroy() {
      this.func_102001_clear();
   }

   void func_102000_body_expand(int var1) {
      if(this.field_102015_body_storage <= this.field_102020_body_fill + var1) {
         this.field_102015_body_storage += var1 + 1024;
         byte[] var2 = new byte[this.field_102015_body_storage];
         System.arraycopy(this.field_102024_body_data, 0, var2, 0, this.field_102024_body_data.length);
         this.field_102024_body_data = var2;
      }

   }

   void func_102004_lacing_expand(int var1) {
      if(this.field_102010_lacing_storage <= this.field_102023_lacing_fill + var1) {
         this.field_102010_lacing_storage += var1 + 32;
         int[] var2 = new int[this.field_102010_lacing_storage];
         System.arraycopy(this.field_102014_lacing_vals, 0, var2, 0, this.field_102014_lacing_vals.length);
         this.field_102014_lacing_vals = var2;
         long[] var3 = new long[this.field_102010_lacing_storage];
         System.arraycopy(this.field_102026_granule_vals, 0, var3, 0, this.field_102026_granule_vals.length);
         this.field_102026_granule_vals = var3;
      }

   }

   public int func_101997_packetin(C_101406_Packet var1) {
      int var2 = var1.field_102048_bytes / 255 + 1;
      if(this.field_102025_body_returned != 0) {
         this.field_102020_body_fill -= this.field_102025_body_returned;
         if(this.field_102020_body_fill != 0) {
            System.arraycopy(this.field_102024_body_data, this.field_102025_body_returned, this.field_102024_body_data, 0, this.field_102020_body_fill);
         }

         this.field_102025_body_returned = 0;
      }

      this.func_102000_body_expand(var1.field_102048_bytes);
      this.func_102004_lacing_expand(var2);
      System.arraycopy(var1.field_102052_packet_base, var1.field_102051_packet, this.field_102024_body_data, this.field_102020_body_fill, var1.field_102048_bytes);
      this.field_102020_body_fill += var1.field_102048_bytes;

      int var3;
      for(var3 = 0; var3 < var2 - 1; ++var3) {
         this.field_102014_lacing_vals[this.field_102023_lacing_fill + var3] = 255;
         this.field_102026_granule_vals[this.field_102023_lacing_fill + var3] = this.field_102013_granulepos;
      }

      this.field_102014_lacing_vals[this.field_102023_lacing_fill + var3] = var1.field_102048_bytes % 255;
      this.field_102013_granulepos = this.field_102026_granule_vals[this.field_102023_lacing_fill + var3] = var1.field_102047_granulepos;
      this.field_102014_lacing_vals[this.field_102023_lacing_fill] |= 256;
      this.field_102023_lacing_fill += var2;
      ++this.field_102022_packetno;
      if(var1.field_102046_e_o_s != 0) {
         this.field_102012_e_o_s = 1;
      }

      return 0;
   }

   public int func_102003_packetout(C_101406_Packet var1) {
      int var2 = this.field_102021_lacing_returned;
      if(this.field_102016_lacing_packet <= var2) {
         return 0;
      } else if((this.field_102014_lacing_vals[var2] & 1024) != 0) {
         ++this.field_102021_lacing_returned;
         ++this.field_102022_packetno;
         return -1;
      } else {
         int var3 = this.field_102014_lacing_vals[var2] & 255;
         byte var4 = 0;
         var1.field_102052_packet_base = this.field_102024_body_data;
         var1.field_102051_packet = this.field_102025_body_returned;
         var1.field_102046_e_o_s = this.field_102014_lacing_vals[var2] & 512;
         var1.field_102050_b_o_s = this.field_102014_lacing_vals[var2] & 256;

         int var6;
         for(var6 = var4 + var3; var3 == 255; var6 += var3) {
            ++var2;
            int var5 = this.field_102014_lacing_vals[var2];
            var3 = var5 & 255;
            if((var5 & 512) != 0) {
               var1.field_102046_e_o_s = 512;
            }
         }

         var1.field_102049_packetno = this.field_102022_packetno;
         var1.field_102047_granulepos = this.field_102026_granule_vals[var2];
         var1.field_102048_bytes = var6;
         this.field_102025_body_returned += var6;
         this.field_102021_lacing_returned = var2 + 1;
         ++this.field_102022_packetno;
         return 1;
      }
   }

   public int func_102009_pagein(C_101405_Page var1) {
      byte[] var2 = var1.field_102039_header_base;
      int var3 = var1.field_102044_header;
      byte[] var4 = var1.field_102042_body_base;
      int var5 = var1.field_102040_body;
      int var6 = var1.field_102041_body_len;
      int var7 = 0;
      int var8 = var1.func_102037_version();
      int var9 = var1.func_102034_continued();
      int var10 = var1.func_102031_bos();
      int var11 = var1.func_102036_eos();
      long var12 = var1.func_102029_granulepos();
      int var14 = var1.func_102033_serialno();
      int var15 = var1.func_102028_pageno();
      int var16 = var2[var3 + 26] & 255;
      int var17 = this.field_102021_lacing_returned;
      int var18 = this.field_102025_body_returned;
      if(var18 != 0) {
         this.field_102020_body_fill -= var18;
         if(this.field_102020_body_fill != 0) {
            System.arraycopy(this.field_102024_body_data, var18, this.field_102024_body_data, 0, this.field_102020_body_fill);
         }

         this.field_102025_body_returned = 0;
      }

      if(var17 != 0) {
         if(this.field_102023_lacing_fill - var17 != 0) {
            System.arraycopy(this.field_102014_lacing_vals, var17, this.field_102014_lacing_vals, 0, this.field_102023_lacing_fill - var17);
            System.arraycopy(this.field_102026_granule_vals, var17, this.field_102026_granule_vals, 0, this.field_102023_lacing_fill - var17);
         }

         this.field_102023_lacing_fill -= var17;
         this.field_102016_lacing_packet -= var17;
         this.field_102021_lacing_returned = 0;
      }

      if(var14 != this.field_102027_serialno) {
         return -1;
      } else if(var8 > 0) {
         return -1;
      } else {
         this.func_102004_lacing_expand(var16 + 1);
         if(var15 != this.field_102018_pageno) {
            for(var17 = this.field_102016_lacing_packet; var17 < this.field_102023_lacing_fill; ++var17) {
               this.field_102020_body_fill -= this.field_102014_lacing_vals[var17] & 255;
            }

            this.field_102023_lacing_fill = this.field_102016_lacing_packet;
            if(this.field_102018_pageno != -1) {
               this.field_102014_lacing_vals[this.field_102023_lacing_fill++] = 1024;
               ++this.field_102016_lacing_packet;
            }

            if(var9 != 0) {
               for(var10 = 0; var7 < var16; ++var7) {
                  var18 = var2[var3 + 27 + var7] & 255;
                  var5 += var18;
                  var6 -= var18;
                  if(var18 < 255) {
                     ++var7;
                     break;
                  }
               }
            }
         }

         if(var6 != 0) {
            this.func_102000_body_expand(var6);
            System.arraycopy(var4, var5, this.field_102024_body_data, this.field_102020_body_fill, var6);
            this.field_102020_body_fill += var6;
         }

         var17 = -1;

         while(var7 < var16) {
            var18 = var2[var3 + 27 + var7] & 255;
            this.field_102014_lacing_vals[this.field_102023_lacing_fill] = var18;
            this.field_102026_granule_vals[this.field_102023_lacing_fill] = -1L;
            if(var10 != 0) {
               this.field_102014_lacing_vals[this.field_102023_lacing_fill] |= 256;
               var10 = 0;
            }

            if(var18 < 255) {
               var17 = this.field_102023_lacing_fill;
            }

            ++this.field_102023_lacing_fill;
            ++var7;
            if(var18 < 255) {
               this.field_102016_lacing_packet = this.field_102023_lacing_fill;
            }
         }

         if(var17 != -1) {
            this.field_102026_granule_vals[var17] = var12;
         }

         if(var11 != 0) {
            this.field_102012_e_o_s = 1;
            if(this.field_102023_lacing_fill > 0) {
               this.field_102014_lacing_vals[this.field_102023_lacing_fill - 1] |= 512;
            }
         }

         this.field_102018_pageno = var15 + 1;
         return 0;
      }
   }

   public int func_102005_flush(C_101405_Page var1) {
      boolean var3 = false;
      int var4 = this.field_102023_lacing_fill > 255?255:this.field_102023_lacing_fill;
      int var5 = 0;
      int var6 = 0;
      long var7 = this.field_102026_granule_vals[0];
      if(var4 == 0) {
         return 0;
      } else {
         int var10;
         if(this.field_102017_b_o_s == 0) {
            var7 = 0L;

            for(var10 = 0; var10 < var4; ++var10) {
               if((this.field_102014_lacing_vals[var10] & 255) < 255) {
                  ++var10;
                  break;
               }
            }
         } else {
            for(var10 = 0; var10 < var4 && var6 <= 4096; ++var10) {
               var6 += this.field_102014_lacing_vals[var10] & 255;
               var7 = this.field_102026_granule_vals[var10];
            }
         }

         System.arraycopy("OggS".getBytes(), 0, this.field_102019_header, 0, 4);
         this.field_102019_header[4] = 0;
         this.field_102019_header[5] = 0;
         if((this.field_102014_lacing_vals[0] & 256) == 0) {
            this.field_102019_header[5] = (byte)(this.field_102019_header[5] | 1);
         }

         if(this.field_102017_b_o_s == 0) {
            this.field_102019_header[5] = (byte)(this.field_102019_header[5] | 2);
         }

         if(this.field_102012_e_o_s != 0 && this.field_102023_lacing_fill == var10) {
            this.field_102019_header[5] = (byte)(this.field_102019_header[5] | 4);
         }

         this.field_102017_b_o_s = 1;

         int var2;
         for(var2 = 6; var2 < 14; ++var2) {
            this.field_102019_header[var2] = (byte)((int)var7);
            var7 >>>= 8;
         }

         int var9 = this.field_102027_serialno;

         for(var2 = 14; var2 < 18; ++var2) {
            this.field_102019_header[var2] = (byte)var9;
            var9 >>>= 8;
         }

         if(this.field_102018_pageno == -1) {
            this.field_102018_pageno = 0;
         }

         var9 = this.field_102018_pageno++;

         for(var2 = 18; var2 < 22; ++var2) {
            this.field_102019_header[var2] = (byte)var9;
            var9 >>>= 8;
         }

         this.field_102019_header[22] = 0;
         this.field_102019_header[23] = 0;
         this.field_102019_header[24] = 0;
         this.field_102019_header[25] = 0;
         this.field_102019_header[26] = (byte)var10;

         for(var2 = 0; var2 < var10; ++var2) {
            this.field_102019_header[var2 + 27] = (byte)this.field_102014_lacing_vals[var2];
            var5 += this.field_102019_header[var2 + 27] & 255;
         }

         var1.field_102039_header_base = this.field_102019_header;
         var1.field_102044_header = 0;
         var1.field_102045_header_len = this.field_102011_header_fill = var10 + 27;
         var1.field_102042_body_base = this.field_102024_body_data;
         var1.field_102040_body = this.field_102025_body_returned;
         var1.field_102041_body_len = var5;
         this.field_102023_lacing_fill -= var10;
         System.arraycopy(this.field_102014_lacing_vals, var10, this.field_102014_lacing_vals, 0, this.field_102023_lacing_fill * 4);
         System.arraycopy(this.field_102026_granule_vals, var10, this.field_102026_granule_vals, 0, this.field_102023_lacing_fill * 8);
         this.field_102025_body_returned += var5;
         var1.func_102035_checksum();
         return 1;
      }
   }

   public int func_102007_pageout(C_101405_Page var1) {
      return (this.field_102012_e_o_s == 0 || this.field_102023_lacing_fill == 0) && this.field_102020_body_fill - this.field_102025_body_returned <= 4096 && this.field_102023_lacing_fill < 255 && (this.field_102023_lacing_fill == 0 || this.field_102017_b_o_s != 0)?0:this.func_102005_flush(var1);
   }

   public int func_102008_eof() {
      return this.field_102012_e_o_s;
   }

   public int func_101998_reset() {
      this.field_102020_body_fill = 0;
      this.field_102025_body_returned = 0;
      this.field_102023_lacing_fill = 0;
      this.field_102016_lacing_packet = 0;
      this.field_102021_lacing_returned = 0;
      this.field_102011_header_fill = 0;
      this.field_102012_e_o_s = 0;
      this.field_102017_b_o_s = 0;
      this.field_102018_pageno = -1;
      this.field_102022_packetno = 0L;
      this.field_102013_granulepos = 0L;
      return 0;
   }
}
