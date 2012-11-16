package com.jcraft.jorbis;

import com.jcraft.p_101362_jogg.C_101406_Packet;
import com.jcraft.p_101362_jogg.C_101408_Buffer;

public class C_101377_Comment {

   private static byte[] field_101803__vorbis = "vorbis".getBytes();
   private static byte[] field_101805__vendor = "Xiphophorus libVorbis I 20000508".getBytes();
   private static final int field_101802_OV_EIMPL = -130;
   public byte[][] field_101806_user_comments;
   public int[] field_101808_comment_lengths;
   public int field_101807_comments;
   public byte[] field_101804_vendor;


   public void func_101788_init() {
      this.field_101806_user_comments = (byte[][])null;
      this.field_101807_comments = 0;
      this.field_101804_vendor = null;
   }

   public void func_101799_add(String var1) {
      this.func_101791_add(var1.getBytes());
   }

   private void func_101791_add(byte[] var1) {
      byte[][] var2 = new byte[this.field_101807_comments + 2][];
      if(this.field_101806_user_comments != null) {
         System.arraycopy(this.field_101806_user_comments, 0, var2, 0, this.field_101807_comments);
      }

      this.field_101806_user_comments = var2;
      int[] var3 = new int[this.field_101807_comments + 2];
      if(this.field_101808_comment_lengths != null) {
         System.arraycopy(this.field_101808_comment_lengths, 0, var3, 0, this.field_101807_comments);
      }

      this.field_101808_comment_lengths = var3;
      byte[] var4 = new byte[var1.length + 1];
      System.arraycopy(var1, 0, var4, 0, var1.length);
      this.field_101806_user_comments[this.field_101807_comments] = var4;
      this.field_101808_comment_lengths[this.field_101807_comments] = var1.length;
      ++this.field_101807_comments;
      this.field_101806_user_comments[this.field_101807_comments] = null;
   }

   public void func_101792_add_tag(String var1, String var2) {
      if(var2 == null) {
         var2 = "";
      }

      this.func_101799_add(var1 + "=" + var2);
   }

   static boolean func_101795_tagcompare(byte[] var0, byte[] var1, int var2) {
      for(int var3 = 0; var3 < var2; ++var3) {
         byte var4 = var0[var3];
         byte var5 = var1[var3];
         if(90 >= var4 && var4 >= 65) {
            var4 = (byte)(var4 - 65 + 97);
         }

         if(90 >= var5 && var5 >= 65) {
            var5 = (byte)(var5 - 65 + 97);
         }

         if(var4 != var5) {
            return false;
         }
      }

      return true;
   }

   public String func_101801_query(String var1) {
      return this.func_101797_query(var1, 0);
   }

   public String func_101797_query(String var1, int var2) {
      int var3 = this.func_101793_query(var1.getBytes(), var2);
      if(var3 == -1) {
         return null;
      } else {
         byte[] var4 = this.field_101806_user_comments[var3];

         for(int var5 = 0; var5 < this.field_101808_comment_lengths[var3]; ++var5) {
            if(var4[var5] == 61) {
               return new String(var4, var5 + 1, this.field_101808_comment_lengths[var3] - (var5 + 1));
            }
         }

         return null;
      }
   }

   private int func_101793_query(byte[] var1, int var2) {
      boolean var3 = false;
      int var4 = 0;
      int var5 = var1.length + 1;
      byte[] var6 = new byte[var5];
      System.arraycopy(var1, 0, var6, 0, var1.length);
      var6[var1.length] = 61;

      for(int var7 = 0; var7 < this.field_101807_comments; ++var7) {
         if(func_101795_tagcompare(this.field_101806_user_comments[var7], var6, var5)) {
            if(var2 == var4) {
               return var7;
            }

            ++var4;
         }
      }

      return -1;
   }

   int func_101800_unpack(C_101408_Buffer var1) {
      int var2 = var1.func_102082_read(32);
      if(var2 < 0) {
         this.func_101789_clear();
         return -1;
      } else {
         this.field_101804_vendor = new byte[var2 + 1];
         var1.func_102076_read(this.field_101804_vendor, var2);
         this.field_101807_comments = var1.func_102082_read(32);
         if(this.field_101807_comments < 0) {
            this.func_101789_clear();
            return -1;
         } else {
            this.field_101806_user_comments = new byte[this.field_101807_comments + 1][];
            this.field_101808_comment_lengths = new int[this.field_101807_comments + 1];

            for(int var3 = 0; var3 < this.field_101807_comments; ++var3) {
               int var4 = var1.func_102082_read(32);
               if(var4 < 0) {
                  this.func_101789_clear();
                  return -1;
               }

               this.field_101808_comment_lengths[var3] = var4;
               this.field_101806_user_comments[var3] = new byte[var4 + 1];
               var1.func_102076_read(this.field_101806_user_comments[var3], var4);
            }

            if(var1.func_102082_read(1) != 1) {
               this.func_101789_clear();
               return -1;
            } else {
               return 0;
            }
         }
      }
   }

   int func_101794_pack(C_101408_Buffer var1) {
      var1.func_102077_write(3, 8);
      var1.func_102080_write(field_101803__vorbis);
      var1.func_102077_write(field_101805__vendor.length, 32);
      var1.func_102080_write(field_101805__vendor);
      var1.func_102077_write(this.field_101807_comments, 32);
      if(this.field_101807_comments != 0) {
         for(int var2 = 0; var2 < this.field_101807_comments; ++var2) {
            if(this.field_101806_user_comments[var2] != null) {
               var1.func_102077_write(this.field_101808_comment_lengths[var2], 32);
               var1.func_102080_write(this.field_101806_user_comments[var2]);
            } else {
               var1.func_102077_write(0, 32);
            }
         }
      }

      var1.func_102077_write(1, 1);
      return 0;
   }

   public int func_101796_header_out(C_101406_Packet var1) {
      C_101408_Buffer var2 = new C_101408_Buffer();
      var2.func_102083_writeinit();
      if(this.func_101794_pack(var2) != 0) {
         return -130;
      } else {
         var1.field_102052_packet_base = new byte[var2.func_102071_bytes()];
         var1.field_102051_packet = 0;
         var1.field_102048_bytes = var2.func_102071_bytes();
         System.arraycopy(var2.func_102073_buffer(), 0, var1.field_102052_packet_base, 0, var1.field_102048_bytes);
         var1.field_102050_b_o_s = 0;
         var1.field_102046_e_o_s = 0;
         var1.field_102047_granulepos = 0L;
         return 0;
      }
   }

   void func_101789_clear() {
      for(int var1 = 0; var1 < this.field_101807_comments; ++var1) {
         this.field_101806_user_comments[var1] = null;
      }

      this.field_101806_user_comments = (byte[][])null;
      this.field_101804_vendor = null;
   }

   public String func_101798_getVendor() {
      return new String(this.field_101804_vendor, 0, this.field_101804_vendor.length - 1);
   }

   public String func_101790_getComment(int var1) {
      return this.field_101807_comments <= var1?null:new String(this.field_101806_user_comments[var1], 0, this.field_101806_user_comments[var1].length - 1);
   }

   public String toString() {
      String var1 = "Vendor: " + new String(this.field_101804_vendor, 0, this.field_101804_vendor.length - 1);

      for(int var2 = 0; var2 < this.field_101807_comments; ++var2) {
         var1 = var1 + "\nComment: " + new String(this.field_101806_user_comments[var2], 0, this.field_101806_user_comments[var2].length - 1);
      }

      var1 = var1 + "\n";
      return var1;
   }

}
