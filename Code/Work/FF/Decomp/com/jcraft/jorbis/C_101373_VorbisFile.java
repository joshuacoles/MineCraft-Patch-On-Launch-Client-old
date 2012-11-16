package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101372_DspState;
import com.jcraft.jorbis.C_101373_VorbisFile$C_101392_SeekableInputStream;
import com.jcraft.jorbis.C_101375_Block;
import com.jcraft.jorbis.C_101377_Comment;
import com.jcraft.jorbis.C_101389_JOrbisException;
import com.jcraft.jorbis.C_101390_Info;
import com.jcraft.p_101362_jogg.C_101404_StreamState;
import com.jcraft.p_101362_jogg.C_101405_Page;
import com.jcraft.p_101362_jogg.C_101406_Packet;
import com.jcraft.p_101362_jogg.C_101407_SyncState;
import java.io.IOException;
import java.io.InputStream;

public class C_101373_VorbisFile {

   static final int field_101648_CHUNKSIZE = 8500;
   static final int field_101668_SEEK_SET = 0;
   static final int field_101661_SEEK_CUR = 1;
   static final int field_101664_SEEK_END = 2;
   static final int field_101666_OV_FALSE = -1;
   static final int field_101643_OV_EOF = -2;
   static final int field_101657_OV_HOLE = -3;
   static final int field_101662_OV_EREAD = -128;
   static final int field_101636_OV_EFAULT = -129;
   static final int field_101654_OV_EIMPL = -130;
   static final int field_101641_OV_EINVAL = -131;
   static final int field_101633_OV_ENOTVORBIS = -132;
   static final int field_101665_OV_EBADHEADER = -133;
   static final int field_101658_OV_EVERSION = -134;
   static final int field_101637_OV_ENOTAUDIO = -135;
   static final int field_101667_OV_EBADPACKET = -136;
   static final int field_101640_OV_EBADLINK = -137;
   static final int field_101638_OV_ENOSEEK = -138;
   InputStream field_101651_datasource;
   boolean field_101644_seekable = false;
   long field_101650_offset;
   long field_101652_end;
   C_101407_SyncState field_101663_oy = new C_101407_SyncState();
   int field_101660_links;
   long[] field_101659_offsets;
   long[] field_101632_dataoffsets;
   int[] field_101639_serialnos;
   long[] field_101635_pcmlengths;
   C_101390_Info[] field_101634_vi;
   C_101377_Comment[] field_101647_vc;
   long field_101656_pcm_offset;
   boolean field_101646_decode_ready = false;
   int field_101653_current_serialno;
   int field_101642_current_link;
   float field_101670_bittrack;
   float field_101669_samptrack;
   C_101404_StreamState field_101655_os = new C_101404_StreamState();
   C_101372_DspState field_101645_vd = new C_101372_DspState();
   C_101375_Block field_101649_vb;


   public C_101373_VorbisFile(String var1) {
      this.field_101649_vb = new C_101375_Block(this.field_101645_vd);
      C_101373_VorbisFile$C_101392_SeekableInputStream var2 = null;

      try {
         var2 = new C_101373_VorbisFile$C_101392_SeekableInputStream(this, var1);
         int var3 = this.func_101606_open(var2, (byte[])null, 0);
         if(var3 == -1) {
            throw new C_101389_JOrbisException("VorbisFile: open return -1");
         }
      } catch (Exception var11) {
         throw new C_101389_JOrbisException("VorbisFile: " + var11.toString());
      } finally {
         if(var2 != null) {
            try {
               var2.close();
            } catch (IOException var10) {
               var10.printStackTrace();
            }
         }

      }

   }

   public C_101373_VorbisFile(InputStream var1, byte[] var2, int var3) {
      this.field_101649_vb = new C_101375_Block(this.field_101645_vd);
      int var4 = this.func_101606_open(var1, var2, var3);
      if(var4 == -1) {
         ;
      }

   }

   private int func_101624_get_data() {
      int var1 = this.field_101663_oy.func_102056_buffer(8500);
      byte[] var2 = this.field_101663_oy.field_102066_data;
      boolean var3 = false;

      int var6;
      try {
         var6 = this.field_101651_datasource.read(var2, var1, 8500);
      } catch (Exception var5) {
         return -128;
      }

      this.field_101663_oy.func_102060_wrote(var6);
      if(var6 == -1) {
         var6 = 0;
      }

      return var6;
   }

   private void func_101619_seek_helper(long var1) {
      func_101596_fseek(this.field_101651_datasource, var1, 0);
      this.field_101650_offset = var1;
      this.field_101663_oy.func_102053_reset();
   }

   private int func_101613_get_next_page(C_101405_Page var1, long var2) {
      if(var2 > 0L) {
         var2 += this.field_101650_offset;
      }

      while(var2 <= 0L || this.field_101650_offset < var2) {
         int var4 = this.field_101663_oy.func_102059_pageseek(var1);
         if(var4 < 0) {
            this.field_101650_offset -= (long)var4;
         } else {
            int var5;
            if(var4 != 0) {
               var5 = (int)this.field_101650_offset;
               this.field_101650_offset += (long)var4;
               return var5;
            }

            if(var2 == 0L) {
               return -1;
            }

            var5 = this.func_101624_get_data();
            if(var5 == 0) {
               return -2;
            }

            if(var5 < 0) {
               return -128;
            }
         }
      }

      return -1;
   }

   private int func_101612_get_prev_page(C_101405_Page var1) {
      long var2 = this.field_101650_offset;
      int var5 = -1;

      int var4;
      while(var5 == -1) {
         var2 -= 8500L;
         if(var2 < 0L) {
            var2 = 0L;
         }

         this.func_101619_seek_helper(var2);

         while(this.field_101650_offset < var2 + 8500L) {
            var4 = this.func_101613_get_next_page(var1, var2 + 8500L - this.field_101650_offset);
            if(var4 == -128) {
               return -128;
            }

            if(var4 < 0) {
               if(var5 == -1) {
                  throw new C_101389_JOrbisException();
               }
               break;
            }

            var5 = var4;
         }
      }

      this.func_101619_seek_helper((long)var5);
      var4 = this.func_101613_get_next_page(var1, 8500L);
      if(var4 < 0) {
         return -129;
      } else {
         return var5;
      }
   }

   int func_101605_bisect_forward_serialno(long var1, long var3, long var5, int var7, int var8) {
      long var9 = var5;
      long var11 = var5;
      C_101405_Page var13 = new C_101405_Page();

      int var14;
      while(var3 < var9) {
         long var15;
         if(var9 - var3 < 8500L) {
            var15 = var3;
         } else {
            var15 = (var3 + var9) / 2L;
         }

         this.func_101619_seek_helper(var15);
         var14 = this.func_101613_get_next_page(var13, -1L);
         if(var14 == -128) {
            return -128;
         }

         if(var14 >= 0 && var13.func_102033_serialno() == var7) {
            var3 = (long)(var14 + var13.field_102045_header_len + var13.field_102041_body_len);
         } else {
            var9 = var15;
            if(var14 >= 0) {
               var11 = (long)var14;
            }
         }
      }

      this.func_101619_seek_helper(var11);
      var14 = this.func_101613_get_next_page(var13, -1L);
      if(var14 == -128) {
         return -128;
      } else {
         if(var3 < var5 && var14 != -1) {
            var14 = this.func_101605_bisect_forward_serialno(var11, this.field_101650_offset, var5, var13.func_102033_serialno(), var8 + 1);
            if(var14 == -128) {
               return -128;
            }
         } else {
            this.field_101660_links = var8 + 1;
            this.field_101659_offsets = new long[var8 + 2];
            this.field_101659_offsets[var8 + 1] = var3;
         }

         this.field_101659_offsets[var8] = var1;
         return 0;
      }
   }

   int func_101614_fetch_headers(C_101390_Info var1, C_101377_Comment var2, int[] var3, C_101405_Page var4) {
      C_101405_Page var5 = new C_101405_Page();
      C_101406_Packet var6 = new C_101406_Packet();
      if(var4 == null) {
         int var7 = this.func_101613_get_next_page(var5, 8500L);
         if(var7 == -128) {
            return -128;
         }

         if(var7 < 0) {
            return -132;
         }

         var4 = var5;
      }

      if(var3 != null) {
         var3[0] = var4.func_102033_serialno();
      }

      this.field_101655_os.func_102006_init(var4.func_102033_serialno());
      var1.func_101954_init();
      var2.func_101788_init();
      int var8 = 0;

      while(var8 < 3) {
         this.field_101655_os.func_102009_pagein(var4);

         while(true) {
            if(var8 < 3) {
               int var9 = this.field_101655_os.func_102003_packetout(var6);
               if(var9 != 0) {
                  if(var9 == -1) {
                     var1.func_101956_clear();
                     var2.func_101789_clear();
                     this.field_101655_os.func_102001_clear();
                     return -1;
                  }

                  if(var1.func_101953_synthesis_headerin(var2, var6) != 0) {
                     var1.func_101956_clear();
                     var2.func_101789_clear();
                     this.field_101655_os.func_102001_clear();
                     return -1;
                  }

                  ++var8;
                  continue;
               }
            }

            if(var8 < 3 && this.func_101613_get_next_page(var4, 1L) < 0) {
               var1.func_101956_clear();
               var2.func_101789_clear();
               this.field_101655_os.func_102001_clear();
               return -1;
            }
            break;
         }
      }

      return 0;
   }

   void func_101628_prefetch_all_headers(C_101390_Info var1, C_101377_Comment var2, int var3) {
      C_101405_Page var4 = new C_101405_Page();
      this.field_101634_vi = new C_101390_Info[this.field_101660_links];
      this.field_101647_vc = new C_101377_Comment[this.field_101660_links];
      this.field_101632_dataoffsets = new long[this.field_101660_links];
      this.field_101635_pcmlengths = new long[this.field_101660_links];
      this.field_101639_serialnos = new int[this.field_101660_links];

      label38:
      for(int var6 = 0; var6 < this.field_101660_links; ++var6) {
         if(var1 != null && var2 != null && var6 == 0) {
            this.field_101634_vi[var6] = var1;
            this.field_101647_vc[var6] = var2;
            this.field_101632_dataoffsets[var6] = (long)var3;
         } else {
            this.func_101619_seek_helper(this.field_101659_offsets[var6]);
            this.field_101634_vi[var6] = new C_101390_Info();
            this.field_101647_vc[var6] = new C_101377_Comment();
            if(this.func_101614_fetch_headers(this.field_101634_vi[var6], this.field_101647_vc[var6], (int[])null, (C_101405_Page)null) == -1) {
               this.field_101632_dataoffsets[var6] = -1L;
            } else {
               this.field_101632_dataoffsets[var6] = this.field_101650_offset;
               this.field_101655_os.func_102001_clear();
            }
         }

         long var7 = this.field_101659_offsets[var6 + 1];
         this.func_101619_seek_helper(var7);

         do {
            int var5 = this.func_101612_get_prev_page(var4);
            if(var5 == -1) {
               this.field_101634_vi[var6].func_101956_clear();
               this.field_101647_vc[var6].func_101789_clear();
               continue label38;
            }
         } while(var4.func_102029_granulepos() == -1L);

         this.field_101639_serialnos[var6] = var4.func_102033_serialno();
         this.field_101635_pcmlengths[var6] = var4.func_102029_granulepos();
      }

   }

   private int func_101618_make_decode_ready() {
      if(this.field_101646_decode_ready) {
         System.exit(1);
      }

      this.field_101645_vd.func_101556_synthesis_init(this.field_101634_vi[0]);
      this.field_101649_vb.func_101714_init(this.field_101645_vd);
      this.field_101646_decode_ready = true;
      return 0;
   }

   int func_101626_open_seekable() {
      C_101390_Info var1 = new C_101390_Info();
      C_101377_Comment var2 = new C_101377_Comment();
      C_101405_Page var8 = new C_101405_Page();
      int[] var9 = new int[1];
      int var6 = this.func_101614_fetch_headers(var1, var2, var9, (C_101405_Page)null);
      int var3 = var9[0];
      int var7 = (int)this.field_101650_offset;
      this.field_101655_os.func_102001_clear();
      if(var6 == -1) {
         return -1;
      } else if(var6 < 0) {
         return var6;
      } else {
         this.field_101644_seekable = true;
         func_101596_fseek(this.field_101651_datasource, 0L, 2);
         this.field_101650_offset = func_101601_ftell(this.field_101651_datasource);
         long var4 = this.field_101650_offset;
         var4 = (long)this.func_101612_get_prev_page(var8);
         if(var8.func_102033_serialno() != var3) {
            if(this.func_101605_bisect_forward_serialno(0L, 0L, var4 + 1L, var3, 0) < 0) {
               this.func_101622_clear();
               return -128;
            }
         } else if(this.func_101605_bisect_forward_serialno(0L, var4, var4 + 1L, var3, 0) < 0) {
            this.func_101622_clear();
            return -128;
         }

         this.func_101628_prefetch_all_headers(var1, var2, var7);
         return 0;
      }
   }

   int func_101617_open_nonseekable() {
      this.field_101660_links = 1;
      this.field_101634_vi = new C_101390_Info[this.field_101660_links];
      this.field_101634_vi[0] = new C_101390_Info();
      this.field_101647_vc = new C_101377_Comment[this.field_101660_links];
      this.field_101647_vc[0] = new C_101377_Comment();
      int[] var1 = new int[1];
      if(this.func_101614_fetch_headers(this.field_101634_vi[0], this.field_101647_vc[0], var1, (C_101405_Page)null) == -1) {
         return -1;
      } else {
         this.field_101653_current_serialno = var1[0];
         this.func_101618_make_decode_ready();
         return 0;
      }
   }

   void func_101602_decode_clear() {
      this.field_101655_os.func_102001_clear();
      this.field_101645_vd.func_101551_clear();
      this.field_101649_vb.func_101715_clear();
      this.field_101646_decode_ready = false;
      this.field_101670_bittrack = 0.0F;
      this.field_101669_samptrack = 0.0F;
   }

   int func_101598_process_packet(int var1) {
      C_101405_Page var2 = new C_101405_Page();

      while(true) {
         if(this.field_101646_decode_ready) {
            C_101406_Packet var3 = new C_101406_Packet();
            int var4 = this.field_101655_os.func_102003_packetout(var3);
            if(var4 > 0) {
               long var5 = var3.field_102047_granulepos;
               if(this.field_101649_vb.func_101713_synthesis(var3) == 0) {
                  int var7 = this.field_101645_vd.func_101554_synthesis_pcmout((float[][][])null, (int[])null);
                  this.field_101645_vd.func_101553_synthesis_blockin(this.field_101649_vb);
                  this.field_101669_samptrack += (float)(this.field_101645_vd.func_101554_synthesis_pcmout((float[][][])null, (int[])null) - var7);
                  this.field_101670_bittrack += (float)(var3.field_102048_bytes * 8);
                  if(var5 != -1L && var3.field_102046_e_o_s == 0) {
                     var7 = this.field_101644_seekable?this.field_101642_current_link:0;
                     int var8 = this.field_101645_vd.func_101554_synthesis_pcmout((float[][][])null, (int[])null);
                     var5 -= (long)var8;

                     for(int var9 = 0; var9 < var7; ++var9) {
                        var5 += this.field_101635_pcmlengths[var9];
                     }

                     this.field_101656_pcm_offset = var5;
                  }

                  return 1;
               }
            }
         }

         if(var1 == 0) {
            return 0;
         }

         if(this.func_101613_get_next_page(var2, -1L) < 0) {
            return 0;
         }

         this.field_101670_bittrack += (float)(var2.field_102045_header_len * 8);
         if(this.field_101646_decode_ready && this.field_101653_current_serialno != var2.func_102033_serialno()) {
            this.func_101602_decode_clear();
         }

         if(!this.field_101646_decode_ready) {
            if(this.field_101644_seekable) {
               this.field_101653_current_serialno = var2.func_102033_serialno();

               int var10;
               for(var10 = 0; var10 < this.field_101660_links && this.field_101639_serialnos[var10] != this.field_101653_current_serialno; ++var10) {
                  ;
               }

               if(var10 == this.field_101660_links) {
                  return -1;
               }

               this.field_101642_current_link = var10;
               this.field_101655_os.func_102006_init(this.field_101653_current_serialno);
               this.field_101655_os.func_101998_reset();
            } else {
               int[] var12 = new int[1];
               int var13 = this.func_101614_fetch_headers(this.field_101634_vi[0], this.field_101647_vc[0], var12, var2);
               this.field_101653_current_serialno = var12[0];
               if(var13 != 0) {
                  return var13;
               }

               ++this.field_101642_current_link;
               boolean var11 = false;
            }

            this.func_101618_make_decode_ready();
         }

         this.field_101655_os.func_102009_pagein(var2);
      }
   }

   int func_101622_clear() {
      this.field_101649_vb.func_101715_clear();
      this.field_101645_vd.func_101551_clear();
      this.field_101655_os.func_102001_clear();
      if(this.field_101634_vi != null && this.field_101660_links != 0) {
         for(int var1 = 0; var1 < this.field_101660_links; ++var1) {
            this.field_101634_vi[var1].func_101956_clear();
            this.field_101647_vc[var1].func_101789_clear();
         }

         this.field_101634_vi = null;
         this.field_101647_vc = null;
      }

      if(this.field_101632_dataoffsets != null) {
         this.field_101632_dataoffsets = null;
      }

      if(this.field_101635_pcmlengths != null) {
         this.field_101635_pcmlengths = null;
      }

      if(this.field_101639_serialnos != null) {
         this.field_101639_serialnos = null;
      }

      if(this.field_101659_offsets != null) {
         this.field_101659_offsets = null;
      }

      this.field_101663_oy.func_102061_clear();
      return 0;
   }

   static int func_101596_fseek(InputStream var0, long var1, int var3) {
      if(var0 instanceof C_101373_VorbisFile$C_101392_SeekableInputStream) {
         C_101373_VorbisFile$C_101392_SeekableInputStream var4 = (C_101373_VorbisFile$C_101392_SeekableInputStream)var0;

         try {
            if(var3 == 0) {
               var4.func_101588_seek(var1);
            } else if(var3 == 2) {
               var4.func_101588_seek(var4.func_101589_getLength() - var1);
            }
         } catch (Exception var6) {
            ;
         }

         return 0;
      } else {
         try {
            if(var3 == 0) {
               var0.reset();
            }

            var0.skip(var1);
            return 0;
         } catch (Exception var7) {
            return -1;
         }
      }
   }

   static long func_101601_ftell(InputStream var0) {
      try {
         if(var0 instanceof C_101373_VorbisFile$C_101392_SeekableInputStream) {
            C_101373_VorbisFile$C_101392_SeekableInputStream var1 = (C_101373_VorbisFile$C_101392_SeekableInputStream)var0;
            return var1.func_101590_tell();
         }
      } catch (Exception var2) {
         ;
      }

      return 0L;
   }

   int func_101606_open(InputStream var1, byte[] var2, int var3) {
      return this.func_101609_open_callbacks(var1, var2, var3);
   }

   int func_101609_open_callbacks(InputStream var1, byte[] var2, int var3) {
      this.field_101651_datasource = var1;
      this.field_101663_oy.func_102055_init();
      if(var2 != null) {
         int var5 = this.field_101663_oy.func_102056_buffer(var3);
         System.arraycopy(var2, 0, this.field_101663_oy.field_102066_data, var5, var3);
         this.field_101663_oy.func_102060_wrote(var3);
      }

      int var4;
      if(var1 instanceof C_101373_VorbisFile$C_101392_SeekableInputStream) {
         var4 = this.func_101626_open_seekable();
      } else {
         var4 = this.func_101617_open_nonseekable();
      }

      if(var4 != 0) {
         this.field_101651_datasource = null;
         this.func_101622_clear();
      }

      return var4;
   }

   public int func_101615_streams() {
      return this.field_101660_links;
   }

   public boolean func_101608_seekable() {
      return this.field_101644_seekable;
   }

   public int func_101630_bitrate(int var1) {
      if(var1 >= this.field_101660_links) {
         return -1;
      } else if(!this.field_101644_seekable && var1 != 0) {
         return this.func_101630_bitrate(0);
      } else if(var1 >= 0) {
         return this.field_101644_seekable?(int)Math.rint((double)((float)((this.field_101659_offsets[var1 + 1] - this.field_101632_dataoffsets[var1]) * 8L) / this.func_101610_time_total(var1))):(this.field_101634_vi[var1].field_101991_bitrate_nominal > 0?this.field_101634_vi[var1].field_101991_bitrate_nominal:(this.field_101634_vi[var1].field_101979_bitrate_upper > 0?(this.field_101634_vi[var1].field_101982_bitrate_lower > 0?(this.field_101634_vi[var1].field_101979_bitrate_upper + this.field_101634_vi[var1].field_101982_bitrate_lower) / 2:this.field_101634_vi[var1].field_101979_bitrate_upper):-1));
      } else {
         long var2 = 0L;

         for(int var4 = 0; var4 < this.field_101660_links; ++var4) {
            var2 += (this.field_101659_offsets[var4 + 1] - this.field_101632_dataoffsets[var4]) * 8L;
         }

         return (int)Math.rint((double)((float)var2 / this.func_101610_time_total(-1)));
      }
   }

   public int func_101597_bitrate_instant() {
      int var1 = this.field_101644_seekable?this.field_101642_current_link:0;
      if(this.field_101669_samptrack == 0.0F) {
         return -1;
      } else {
         int var2 = (int)((double)(this.field_101670_bittrack / this.field_101669_samptrack * (float)this.field_101634_vi[var1].field_101970_rate) + 0.5D);
         this.field_101670_bittrack = 0.0F;
         this.field_101669_samptrack = 0.0F;
         return var2;
      }
   }

   public int func_101623_serialnumber(int var1) {
      return var1 >= this.field_101660_links?-1:(!this.field_101644_seekable && var1 >= 0?this.func_101623_serialnumber(-1):(var1 < 0?this.field_101653_current_serialno:this.field_101639_serialnos[var1]));
   }

   public long func_101594_raw_total(int var1) {
      if(this.field_101644_seekable && var1 < this.field_101660_links) {
         if(var1 >= 0) {
            return this.field_101659_offsets[var1 + 1] - this.field_101659_offsets[var1];
         } else {
            long var2 = 0L;

            for(int var4 = 0; var4 < this.field_101660_links; ++var4) {
               var2 += this.func_101594_raw_total(var4);
            }

            return var2;
         }
      } else {
         return -1L;
      }
   }

   public long func_101607_pcm_total(int var1) {
      if(this.field_101644_seekable && var1 < this.field_101660_links) {
         if(var1 >= 0) {
            return this.field_101635_pcmlengths[var1];
         } else {
            long var2 = 0L;

            for(int var4 = 0; var4 < this.field_101660_links; ++var4) {
               var2 += this.func_101607_pcm_total(var4);
            }

            return var2;
         }
      } else {
         return -1L;
      }
   }

   public float func_101610_time_total(int var1) {
      if(this.field_101644_seekable && var1 < this.field_101660_links) {
         if(var1 >= 0) {
            return (float)this.field_101635_pcmlengths[var1] / (float)this.field_101634_vi[var1].field_101970_rate;
         } else {
            float var2 = 0.0F;

            for(int var3 = 0; var3 < this.field_101660_links; ++var3) {
               var2 += this.func_101610_time_total(var3);
            }

            return var2;
         }
      } else {
         return -1.0F;
      }
   }

   public int func_101595_raw_seek(int var1) {
      if(!this.field_101644_seekable) {
         return -1;
      } else if(var1 >= 0 && (long)var1 <= this.field_101659_offsets[this.field_101660_links]) {
         this.field_101656_pcm_offset = -1L;
         this.func_101602_decode_clear();
         this.func_101619_seek_helper((long)var1);
         switch(this.func_101598_process_packet(1)) {
         case -1:
            this.field_101656_pcm_offset = -1L;
            this.func_101602_decode_clear();
            return -1;
         case 0:
            this.field_101656_pcm_offset = this.func_101607_pcm_total(-1);
            return 0;
         default:
            while(true) {
               switch(this.func_101598_process_packet(0)) {
               case -1:
                  this.field_101656_pcm_offset = -1L;
                  this.func_101602_decode_clear();
                  return -1;
               case 0:
                  return 0;
               }
            }
         }
      } else {
         this.field_101656_pcm_offset = -1L;
         this.func_101602_decode_clear();
         return -1;
      }
   }

   public int func_101611_pcm_seek(long var1) {
      boolean var3 = true;
      long var4 = this.func_101607_pcm_total(-1);
      if(!this.field_101644_seekable) {
         return -1;
      } else if(var1 >= 0L && var1 <= var4) {
         int var19;
         for(var19 = this.field_101660_links - 1; var19 >= 0; --var19) {
            var4 -= this.field_101635_pcmlengths[var19];
            if(var1 >= var4) {
               break;
            }
         }

         long var6 = var1 - var4;
         long var8 = this.field_101659_offsets[var19 + 1];
         long var10 = this.field_101659_offsets[var19];
         int var12 = (int)var10;
         C_101405_Page var13 = new C_101405_Page();

         while(var10 < var8) {
            long var14;
            if(var8 - var10 < 8500L) {
               var14 = var10;
            } else {
               var14 = (var8 + var10) / 2L;
            }

            this.func_101619_seek_helper(var14);
            int var16 = this.func_101613_get_next_page(var13, var8 - var14);
            if(var16 == -1) {
               var8 = var14;
            } else {
               long var17 = var13.func_102029_granulepos();
               if(var17 < var6) {
                  var12 = var16;
                  var10 = this.field_101650_offset;
               } else {
                  var8 = var14;
               }
            }
         }

         if(this.func_101595_raw_seek(var12) != 0) {
            this.field_101656_pcm_offset = -1L;
            this.func_101602_decode_clear();
            return -1;
         } else if(this.field_101656_pcm_offset >= var1) {
            this.field_101656_pcm_offset = -1L;
            this.func_101602_decode_clear();
            return -1;
         } else if(var1 > this.func_101607_pcm_total(-1)) {
            this.field_101656_pcm_offset = -1L;
            this.func_101602_decode_clear();
            return -1;
         } else {
            while(this.field_101656_pcm_offset < var1) {
               int var20 = (int)(var1 - this.field_101656_pcm_offset);
               float[][][] var7 = new float[1][][];
               int[] var21 = new int[this.func_101616_getInfo(-1).field_101988_channels];
               int var9 = this.field_101645_vd.func_101554_synthesis_pcmout(var7, var21);
               if(var9 > var20) {
                  var9 = var20;
               }

               this.field_101645_vd.func_101552_synthesis_read(var9);
               this.field_101656_pcm_offset += (long)var9;
               if(var9 < var20 && this.func_101598_process_packet(1) == 0) {
                  this.field_101656_pcm_offset = this.func_101607_pcm_total(-1);
               }
            }

            return 0;
         }
      } else {
         this.field_101656_pcm_offset = -1L;
         this.func_101602_decode_clear();
         return -1;
      }
   }

   int func_101629_time_seek(float var1) {
      boolean var2 = true;
      long var3 = this.func_101607_pcm_total(-1);
      float var5 = this.func_101610_time_total(-1);
      if(!this.field_101644_seekable) {
         return -1;
      } else if(var1 >= 0.0F && var1 <= var5) {
         int var8;
         for(var8 = this.field_101660_links - 1; var8 >= 0; --var8) {
            var3 -= this.field_101635_pcmlengths[var8];
            var5 -= this.func_101610_time_total(var8);
            if(var1 >= var5) {
               break;
            }
         }

         long var6 = (long)((float)var3 + (var1 - var5) * (float)this.field_101634_vi[var8].field_101970_rate);
         return this.func_101611_pcm_seek(var6);
      } else {
         this.field_101656_pcm_offset = -1L;
         this.func_101602_decode_clear();
         return -1;
      }
   }

   public long func_101631_raw_tell() {
      return this.field_101650_offset;
   }

   public long func_101621_pcm_tell() {
      return this.field_101656_pcm_offset;
   }

   public float func_101620_time_tell() {
      int var1 = -1;
      long var2 = 0L;
      float var4 = 0.0F;
      if(this.field_101644_seekable) {
         var2 = this.func_101607_pcm_total(-1);
         var4 = this.func_101610_time_total(-1);

         for(var1 = this.field_101660_links - 1; var1 >= 0; --var1) {
            var2 -= this.field_101635_pcmlengths[var1];
            var4 -= this.func_101610_time_total(var1);
            if(this.field_101656_pcm_offset >= var2) {
               break;
            }
         }
      }

      return var4 + (float)(this.field_101656_pcm_offset - var2) / (float)this.field_101634_vi[var1].field_101970_rate;
   }

   public C_101390_Info func_101616_getInfo(int var1) {
      return this.field_101644_seekable?(var1 < 0?(this.field_101646_decode_ready?this.field_101634_vi[this.field_101642_current_link]:null):(var1 >= this.field_101660_links?null:this.field_101634_vi[var1])):(this.field_101646_decode_ready?this.field_101634_vi[0]:null);
   }

   public C_101377_Comment func_101600_getComment(int var1) {
      return this.field_101644_seekable?(var1 < 0?(this.field_101646_decode_ready?this.field_101647_vc[this.field_101642_current_link]:null):(var1 >= this.field_101660_links?null:this.field_101647_vc[var1])):(this.field_101646_decode_ready?this.field_101647_vc[0]:null);
   }

   int func_101604_host_is_big_endian() {
      return 1;
   }

   int func_101625_read(byte[] var1, int var2, int var3, int var4, int var5, int[] var6) {
      int var7 = this.func_101604_host_is_big_endian();
      int var8 = 0;

      while(true) {
         if(this.field_101646_decode_ready) {
            float[][][] var10 = new float[1][][];
            int[] var11 = new int[this.func_101616_getInfo(-1).field_101988_channels];
            int var12 = this.field_101645_vd.func_101554_synthesis_pcmout(var10, var11);
            float[][] var9 = var10[0];
            if(var12 != 0) {
               int var13 = this.func_101616_getInfo(-1).field_101988_channels;
               int var14 = var4 * var13;
               if(var12 > var2 / var14) {
                  var12 = var2 / var14;
               }

               int var15;
               int var17;
               int var16;
               int var18;
               if(var4 == 1) {
                  var16 = var5 != 0?0:128;

                  for(var17 = 0; var17 < var12; ++var17) {
                     for(var18 = 0; var18 < var13; ++var18) {
                        var15 = (int)((double)var9[var18][var11[var18] + var17] * 128.0D + 0.5D);
                        if(var15 > 127) {
                           var15 = 127;
                        } else if(var15 < -128) {
                           var15 = -128;
                        }

                        var1[var8++] = (byte)(var15 + var16);
                     }
                  }
               } else {
                  var16 = var5 != 0?0:'\u8000';
                  if(var7 == var3) {
                     int var19;
                     int var20;
                     if(var5 != 0) {
                        for(var17 = 0; var17 < var13; ++var17) {
                           var18 = var11[var17];
                           var19 = var17;

                           for(var20 = 0; var20 < var12; ++var20) {
                              var15 = (int)((double)var9[var17][var18 + var20] * 32768.0D + 0.5D);
                              if(var15 > 32767) {
                                 var15 = 32767;
                              } else if(var15 < -32768) {
                                 var15 = -32768;
                              }

                              var1[var19] = (byte)(var15 >>> 8);
                              var1[var19 + 1] = (byte)var15;
                              var19 += var13 * 2;
                           }
                        }
                     } else {
                        for(var17 = 0; var17 < var13; ++var17) {
                           float[] var21 = var9[var17];
                           var19 = var17;

                           for(var20 = 0; var20 < var12; ++var20) {
                              var15 = (int)((double)var21[var20] * 32768.0D + 0.5D);
                              if(var15 > 32767) {
                                 var15 = 32767;
                              } else if(var15 < -32768) {
                                 var15 = -32768;
                              }

                              var1[var19] = (byte)(var15 + var16 >>> 8);
                              var1[var19 + 1] = (byte)(var15 + var16);
                              var19 += var13 * 2;
                           }
                        }
                     }
                  } else if(var3 != 0) {
                     for(var17 = 0; var17 < var12; ++var17) {
                        for(var18 = 0; var18 < var13; ++var18) {
                           var15 = (int)((double)var9[var18][var17] * 32768.0D + 0.5D);
                           if(var15 > 32767) {
                              var15 = 32767;
                           } else if(var15 < -32768) {
                              var15 = -32768;
                           }

                           var15 += var16;
                           var1[var8++] = (byte)(var15 >>> 8);
                           var1[var8++] = (byte)var15;
                        }
                     }
                  } else {
                     for(var17 = 0; var17 < var12; ++var17) {
                        for(var18 = 0; var18 < var13; ++var18) {
                           var15 = (int)((double)var9[var18][var17] * 32768.0D + 0.5D);
                           if(var15 > 32767) {
                              var15 = 32767;
                           } else if(var15 < -32768) {
                              var15 = -32768;
                           }

                           var15 += var16;
                           var1[var8++] = (byte)var15;
                           var1[var8++] = (byte)(var15 >>> 8);
                        }
                     }
                  }
               }

               this.field_101645_vd.func_101552_synthesis_read(var12);
               this.field_101656_pcm_offset += (long)var12;
               if(var6 != null) {
                  var6[0] = this.field_101642_current_link;
               }

               return var12 * var14;
            }
         }

         switch(this.func_101598_process_packet(1)) {
         case -1:
            return -1;
         case 0:
            return 0;
         }
      }
   }

   public C_101390_Info[] func_101599_getInfo() {
      return this.field_101634_vi;
   }

   public C_101377_Comment[] func_101627_getComment() {
      return this.field_101647_vc;
   }

   public void func_101603_close() {
      this.field_101651_datasource.close();
   }
}
