package com.jcraft.p_101362_jogg;


public class C_101405_Page {

   private static int[] field_102043_crc_lookup = new int[256];
   public byte[] field_102039_header_base;
   public int field_102044_header;
   public int field_102045_header_len;
   public byte[] field_102042_body_base;
   public int field_102040_body;
   public int field_102041_body_len;


   private static int func_102030_crc_entry(int var0) {
      int var1 = var0 << 24;

      for(int var2 = 0; var2 < 8; ++var2) {
         if((var1 & Integer.MIN_VALUE) != 0) {
            var1 = var1 << 1 ^ 79764919;
         } else {
            var1 <<= 1;
         }
      }

      return var1 & -1;
   }

   int func_102037_version() {
      return this.field_102039_header_base[this.field_102044_header + 4] & 255;
   }

   int func_102034_continued() {
      return this.field_102039_header_base[this.field_102044_header + 5] & 1;
   }

   public int func_102031_bos() {
      return this.field_102039_header_base[this.field_102044_header + 5] & 2;
   }

   public int func_102036_eos() {
      return this.field_102039_header_base[this.field_102044_header + 5] & 4;
   }

   public long func_102029_granulepos() {
      long var1 = (long)(this.field_102039_header_base[this.field_102044_header + 13] & 255);
      var1 = var1 << 8 | (long)(this.field_102039_header_base[this.field_102044_header + 12] & 255);
      var1 = var1 << 8 | (long)(this.field_102039_header_base[this.field_102044_header + 11] & 255);
      var1 = var1 << 8 | (long)(this.field_102039_header_base[this.field_102044_header + 10] & 255);
      var1 = var1 << 8 | (long)(this.field_102039_header_base[this.field_102044_header + 9] & 255);
      var1 = var1 << 8 | (long)(this.field_102039_header_base[this.field_102044_header + 8] & 255);
      var1 = var1 << 8 | (long)(this.field_102039_header_base[this.field_102044_header + 7] & 255);
      var1 = var1 << 8 | (long)(this.field_102039_header_base[this.field_102044_header + 6] & 255);
      return var1;
   }

   public int func_102033_serialno() {
      return this.field_102039_header_base[this.field_102044_header + 14] & 255 | (this.field_102039_header_base[this.field_102044_header + 15] & 255) << 8 | (this.field_102039_header_base[this.field_102044_header + 16] & 255) << 16 | (this.field_102039_header_base[this.field_102044_header + 17] & 255) << 24;
   }

   int func_102028_pageno() {
      return this.field_102039_header_base[this.field_102044_header + 18] & 255 | (this.field_102039_header_base[this.field_102044_header + 19] & 255) << 8 | (this.field_102039_header_base[this.field_102044_header + 20] & 255) << 16 | (this.field_102039_header_base[this.field_102044_header + 21] & 255) << 24;
   }

   void func_102035_checksum() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < this.field_102045_header_len; ++var2) {
         var1 = var1 << 8 ^ field_102043_crc_lookup[var1 >>> 24 & 255 ^ this.field_102039_header_base[this.field_102044_header + var2] & 255];
      }

      for(var2 = 0; var2 < this.field_102041_body_len; ++var2) {
         var1 = var1 << 8 ^ field_102043_crc_lookup[var1 >>> 24 & 255 ^ this.field_102042_body_base[this.field_102040_body + var2] & 255];
      }

      this.field_102039_header_base[this.field_102044_header + 22] = (byte)var1;
      this.field_102039_header_base[this.field_102044_header + 23] = (byte)(var1 >>> 8);
      this.field_102039_header_base[this.field_102044_header + 24] = (byte)(var1 >>> 16);
      this.field_102039_header_base[this.field_102044_header + 25] = (byte)(var1 >>> 24);
   }

   public C_101405_Page func_102038_copy() {
      return this.func_102032_copy(new C_101405_Page());
   }

   public C_101405_Page func_102032_copy(C_101405_Page var1) {
      byte[] var2 = new byte[this.field_102045_header_len];
      System.arraycopy(this.field_102039_header_base, this.field_102044_header, var2, 0, this.field_102045_header_len);
      var1.field_102045_header_len = this.field_102045_header_len;
      var1.field_102039_header_base = var2;
      var1.field_102044_header = 0;
      var2 = new byte[this.field_102041_body_len];
      System.arraycopy(this.field_102042_body_base, this.field_102040_body, var2, 0, this.field_102041_body_len);
      var1.field_102041_body_len = this.field_102041_body_len;
      var1.field_102042_body_base = var2;
      var1.field_102040_body = 0;
      return var1;
   }

   static {
      for(int var0 = 0; var0 < field_102043_crc_lookup.length; ++var0) {
         field_102043_crc_lookup[var0] = func_102030_crc_entry(var0);
      }

   }
}
