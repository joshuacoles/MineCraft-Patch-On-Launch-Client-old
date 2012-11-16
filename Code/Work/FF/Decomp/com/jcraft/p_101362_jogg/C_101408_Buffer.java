package com.jcraft.p_101362_jogg;


public class C_101408_Buffer {

   private static final int field_102093_BUFFER_INCREMENT = 256;
   private static final int[] field_102095_mask = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   int field_102097_ptr = 0;
   byte[] field_102091_buffer = null;
   int field_102092_endbit = 0;
   int field_102094_endbyte = 0;
   int field_102096_storage = 0;


   public void func_102083_writeinit() {
      this.field_102091_buffer = new byte[256];
      this.field_102097_ptr = 0;
      this.field_102091_buffer[0] = 0;
      this.field_102096_storage = 256;
   }

   public void func_102080_write(byte[] var1) {
      for(int var2 = 0; var2 < var1.length && var1[var2] != 0; ++var2) {
         this.func_102077_write(var1[var2], 8);
      }

   }

   public void func_102076_read(byte[] var1, int var2) {
      for(int var3 = 0; var2-- != 0; var1[var3++] = (byte)this.func_102082_read(8)) {
         ;
      }

   }

   void func_102086_reset() {
      this.field_102097_ptr = 0;
      this.field_102091_buffer[0] = 0;
      this.field_102092_endbit = this.field_102094_endbyte = 0;
   }

   public void func_102088_writeclear() {
      this.field_102091_buffer = null;
   }

   public void func_102089_readinit(byte[] var1, int var2) {
      this.func_102072_readinit(var1, 0, var2);
   }

   public void func_102072_readinit(byte[] var1, int var2, int var3) {
      this.field_102097_ptr = var2;
      this.field_102091_buffer = var1;
      this.field_102092_endbit = this.field_102094_endbyte = 0;
      this.field_102096_storage = var3;
   }

   public void func_102077_write(int var1, int var2) {
      if(this.field_102094_endbyte + 4 >= this.field_102096_storage) {
         byte[] var3 = new byte[this.field_102096_storage + 256];
         System.arraycopy(this.field_102091_buffer, 0, var3, 0, this.field_102096_storage);
         this.field_102091_buffer = var3;
         this.field_102096_storage += 256;
      }

      var1 &= field_102095_mask[var2];
      var2 += this.field_102092_endbit;
      this.field_102091_buffer[this.field_102097_ptr] |= (byte)(var1 << this.field_102092_endbit);
      if(var2 >= 8) {
         this.field_102091_buffer[this.field_102097_ptr + 1] = (byte)(var1 >>> 8 - this.field_102092_endbit);
         if(var2 >= 16) {
            this.field_102091_buffer[this.field_102097_ptr + 2] = (byte)(var1 >>> 16 - this.field_102092_endbit);
            if(var2 >= 24) {
               this.field_102091_buffer[this.field_102097_ptr + 3] = (byte)(var1 >>> 24 - this.field_102092_endbit);
               if(var2 >= 32) {
                  if(this.field_102092_endbit > 0) {
                     this.field_102091_buffer[this.field_102097_ptr + 4] = (byte)(var1 >>> 32 - this.field_102092_endbit);
                  } else {
                     this.field_102091_buffer[this.field_102097_ptr + 4] = 0;
                  }
               }
            }
         }
      }

      this.field_102094_endbyte += var2 / 8;
      this.field_102097_ptr += var2 / 8;
      this.field_102092_endbit = var2 & 7;
   }

   public int func_102074_look(int var1) {
      int var3 = field_102095_mask[var1];
      var1 += this.field_102092_endbit;
      if(this.field_102094_endbyte + 4 >= this.field_102096_storage && this.field_102094_endbyte + (var1 - 1) / 8 >= this.field_102096_storage) {
         return -1;
      } else {
         int var2 = (this.field_102091_buffer[this.field_102097_ptr] & 255) >>> this.field_102092_endbit;
         if(var1 > 8) {
            var2 |= (this.field_102091_buffer[this.field_102097_ptr + 1] & 255) << 8 - this.field_102092_endbit;
            if(var1 > 16) {
               var2 |= (this.field_102091_buffer[this.field_102097_ptr + 2] & 255) << 16 - this.field_102092_endbit;
               if(var1 > 24) {
                  var2 |= (this.field_102091_buffer[this.field_102097_ptr + 3] & 255) << 24 - this.field_102092_endbit;
                  if(var1 > 32 && this.field_102092_endbit != 0) {
                     var2 |= (this.field_102091_buffer[this.field_102097_ptr + 4] & 255) << 32 - this.field_102092_endbit;
                  }
               }
            }
         }

         return var3 & var2;
      }
   }

   public int func_102078_look1() {
      return this.field_102094_endbyte >= this.field_102096_storage?-1:this.field_102091_buffer[this.field_102097_ptr] >> this.field_102092_endbit & 1;
   }

   public void func_102081_adv(int var1) {
      var1 += this.field_102092_endbit;
      this.field_102097_ptr += var1 / 8;
      this.field_102094_endbyte += var1 / 8;
      this.field_102092_endbit = var1 & 7;
   }

   public void func_102084_adv1() {
      ++this.field_102092_endbit;
      if(this.field_102092_endbit > 7) {
         this.field_102092_endbit = 0;
         ++this.field_102097_ptr;
         ++this.field_102094_endbyte;
      }

   }

   public int func_102082_read(int var1) {
      int var3 = field_102095_mask[var1];
      var1 += this.field_102092_endbit;
      if(this.field_102094_endbyte + 4 >= this.field_102096_storage) {
         byte var2 = -1;
         if(this.field_102094_endbyte + (var1 - 1) / 8 >= this.field_102096_storage) {
            this.field_102097_ptr += var1 / 8;
            this.field_102094_endbyte += var1 / 8;
            this.field_102092_endbit = var1 & 7;
            return var2;
         }
      }

      int var4 = (this.field_102091_buffer[this.field_102097_ptr] & 255) >>> this.field_102092_endbit;
      if(var1 > 8) {
         var4 |= (this.field_102091_buffer[this.field_102097_ptr + 1] & 255) << 8 - this.field_102092_endbit;
         if(var1 > 16) {
            var4 |= (this.field_102091_buffer[this.field_102097_ptr + 2] & 255) << 16 - this.field_102092_endbit;
            if(var1 > 24) {
               var4 |= (this.field_102091_buffer[this.field_102097_ptr + 3] & 255) << 24 - this.field_102092_endbit;
               if(var1 > 32 && this.field_102092_endbit != 0) {
                  var4 |= (this.field_102091_buffer[this.field_102097_ptr + 4] & 255) << 32 - this.field_102092_endbit;
               }
            }
         }
      }

      var4 &= var3;
      this.field_102097_ptr += var1 / 8;
      this.field_102094_endbyte += var1 / 8;
      this.field_102092_endbit = var1 & 7;
      return var4;
   }

   public int func_102075_readB(int var1) {
      int var3 = 32 - var1;
      var1 += this.field_102092_endbit;
      if(this.field_102094_endbyte + 4 >= this.field_102096_storage) {
         byte var2 = -1;
         if(this.field_102094_endbyte * 8 + var1 > this.field_102096_storage * 8) {
            this.field_102097_ptr += var1 / 8;
            this.field_102094_endbyte += var1 / 8;
            this.field_102092_endbit = var1 & 7;
            return var2;
         }
      }

      int var4 = (this.field_102091_buffer[this.field_102097_ptr] & 255) << 24 + this.field_102092_endbit;
      if(var1 > 8) {
         var4 |= (this.field_102091_buffer[this.field_102097_ptr + 1] & 255) << 16 + this.field_102092_endbit;
         if(var1 > 16) {
            var4 |= (this.field_102091_buffer[this.field_102097_ptr + 2] & 255) << 8 + this.field_102092_endbit;
            if(var1 > 24) {
               var4 |= (this.field_102091_buffer[this.field_102097_ptr + 3] & 255) << this.field_102092_endbit;
               if(var1 > 32 && this.field_102092_endbit != 0) {
                  var4 |= (this.field_102091_buffer[this.field_102097_ptr + 4] & 255) >> 8 - this.field_102092_endbit;
               }
            }
         }
      }

      var4 = var4 >>> (var3 >> 1) >>> (var3 + 1 >> 1);
      this.field_102097_ptr += var1 / 8;
      this.field_102094_endbyte += var1 / 8;
      this.field_102092_endbit = var1 & 7;
      return var4;
   }

   public int func_102090_read1() {
      if(this.field_102094_endbyte >= this.field_102096_storage) {
         byte var2 = -1;
         ++this.field_102092_endbit;
         if(this.field_102092_endbit > 7) {
            this.field_102092_endbit = 0;
            ++this.field_102097_ptr;
            ++this.field_102094_endbyte;
         }

         return var2;
      } else {
         int var1 = this.field_102091_buffer[this.field_102097_ptr] >> this.field_102092_endbit & 1;
         ++this.field_102092_endbit;
         if(this.field_102092_endbit > 7) {
            this.field_102092_endbit = 0;
            ++this.field_102097_ptr;
            ++this.field_102094_endbyte;
         }

         return var1;
      }
   }

   public int func_102071_bytes() {
      return this.field_102094_endbyte + (this.field_102092_endbit + 7) / 8;
   }

   public int func_102087_bits() {
      return this.field_102094_endbyte * 8 + this.field_102092_endbit;
   }

   public byte[] func_102073_buffer() {
      return this.field_102091_buffer;
   }

   public static int func_102079_ilog(int var0) {
      int var1;
      for(var1 = 0; var0 > 0; var0 >>>= 1) {
         ++var1;
      }

      return var1;
   }

   public static void func_102085_report(String var0) {
      System.err.println(var0);
      System.exit(1);
   }

}
