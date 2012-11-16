package com.jcraft.p_101362_jogg;

import com.jcraft.p_101362_jogg.C_101405_Page;

public class C_101407_SyncState {

   public byte[] field_102066_data;
   int field_102070_storage;
   int field_102065_fill;
   int field_102069_returned;
   int field_102063_unsynced;
   int field_102064_headerbytes;
   int field_102068_bodybytes;
   private C_101405_Page field_102067_pageseek = new C_101405_Page();
   private byte[] field_102062_chksum = new byte[4];


   public int func_102061_clear() {
      this.field_102066_data = null;
      return 0;
   }

   public int func_102056_buffer(int var1) {
      if(this.field_102069_returned != 0) {
         this.field_102065_fill -= this.field_102069_returned;
         if(this.field_102065_fill > 0) {
            System.arraycopy(this.field_102066_data, this.field_102069_returned, this.field_102066_data, 0, this.field_102065_fill);
         }

         this.field_102069_returned = 0;
      }

      if(var1 > this.field_102070_storage - this.field_102065_fill) {
         int var2 = var1 + this.field_102065_fill + 4096;
         if(this.field_102066_data != null) {
            byte[] var3 = new byte[var2];
            System.arraycopy(this.field_102066_data, 0, var3, 0, this.field_102066_data.length);
            this.field_102066_data = var3;
         } else {
            this.field_102066_data = new byte[var2];
         }

         this.field_102070_storage = var2;
      }

      return this.field_102065_fill;
   }

   public int func_102060_wrote(int var1) {
      if(this.field_102065_fill + var1 > this.field_102070_storage) {
         return -1;
      } else {
         this.field_102065_fill += var1;
         return 0;
      }
   }

   public int func_102059_pageseek(C_101405_Page var1) {
      int var2 = this.field_102069_returned;
      int var4 = this.field_102065_fill - this.field_102069_returned;
      int var3;
      int var7;
      if(this.field_102064_headerbytes == 0) {
         if(var4 < 27) {
            return 0;
         }

         if(this.field_102066_data[var2] != 79 || this.field_102066_data[var2 + 1] != 103 || this.field_102066_data[var2 + 2] != 103 || this.field_102066_data[var2 + 3] != 83) {
            this.field_102064_headerbytes = 0;
            this.field_102068_bodybytes = 0;
            var3 = 0;

            for(var7 = 0; var7 < var4 - 1; ++var7) {
               if(this.field_102066_data[var2 + 1 + var7] == 79) {
                  var3 = var2 + 1 + var7;
                  break;
               }
            }

            if(var3 == 0) {
               var3 = this.field_102065_fill;
            }

            this.field_102069_returned = var3;
            return -(var3 - var2);
         }

         int var5 = (this.field_102066_data[var2 + 26] & 255) + 27;
         if(var4 < var5) {
            return 0;
         }

         for(int var6 = 0; var6 < (this.field_102066_data[var2 + 26] & 255); ++var6) {
            this.field_102068_bodybytes += this.field_102066_data[var2 + 27 + var6] & 255;
         }

         this.field_102064_headerbytes = var5;
      }

      if(this.field_102068_bodybytes + this.field_102064_headerbytes > var4) {
         return 0;
      } else {
         byte[] var10 = this.field_102062_chksum;
         synchronized(this.field_102062_chksum) {
            System.arraycopy(this.field_102066_data, var2 + 22, this.field_102062_chksum, 0, 4);
            this.field_102066_data[var2 + 22] = 0;
            this.field_102066_data[var2 + 23] = 0;
            this.field_102066_data[var2 + 24] = 0;
            this.field_102066_data[var2 + 25] = 0;
            C_101405_Page var11 = this.field_102067_pageseek;
            var11.field_102039_header_base = this.field_102066_data;
            var11.field_102044_header = var2;
            var11.field_102045_header_len = this.field_102064_headerbytes;
            var11.field_102042_body_base = this.field_102066_data;
            var11.field_102040_body = var2 + this.field_102064_headerbytes;
            var11.field_102041_body_len = this.field_102068_bodybytes;
            var11.func_102035_checksum();
            if(this.field_102062_chksum[0] != this.field_102066_data[var2 + 22] || this.field_102062_chksum[1] != this.field_102066_data[var2 + 23] || this.field_102062_chksum[2] != this.field_102066_data[var2 + 24] || this.field_102062_chksum[3] != this.field_102066_data[var2 + 25]) {
               System.arraycopy(this.field_102062_chksum, 0, this.field_102066_data, var2 + 22, 4);
               this.field_102064_headerbytes = 0;
               this.field_102068_bodybytes = 0;
               var3 = 0;

               for(var7 = 0; var7 < var4 - 1; ++var7) {
                  if(this.field_102066_data[var2 + 1 + var7] == 79) {
                     var3 = var2 + 1 + var7;
                     break;
                  }
               }

               if(var3 == 0) {
                  var3 = this.field_102065_fill;
               }

               this.field_102069_returned = var3;
               return -(var3 - var2);
            }
         }

         var2 = this.field_102069_returned;
         if(var1 != null) {
            var1.field_102039_header_base = this.field_102066_data;
            var1.field_102044_header = var2;
            var1.field_102045_header_len = this.field_102064_headerbytes;
            var1.field_102042_body_base = this.field_102066_data;
            var1.field_102040_body = var2 + this.field_102064_headerbytes;
            var1.field_102041_body_len = this.field_102068_bodybytes;
         }

         this.field_102063_unsynced = 0;
         this.field_102069_returned += var4 = this.field_102064_headerbytes + this.field_102068_bodybytes;
         this.field_102064_headerbytes = 0;
         this.field_102068_bodybytes = 0;
         return var4;
      }
   }

   public int func_102058_pageout(C_101405_Page var1) {
      do {
         int var2 = this.func_102059_pageseek(var1);
         if(var2 > 0) {
            return 1;
         }

         if(var2 == 0) {
            return 0;
         }
      } while(this.field_102063_unsynced != 0);

      this.field_102063_unsynced = 1;
      return -1;
   }

   public int func_102053_reset() {
      this.field_102065_fill = 0;
      this.field_102069_returned = 0;
      this.field_102063_unsynced = 0;
      this.field_102064_headerbytes = 0;
      this.field_102068_bodybytes = 0;
      return 0;
   }

   public void func_102055_init() {}

   public int func_102054_getDataOffset() {
      return this.field_102069_returned;
   }

   public int func_102057_getBufferOffset() {
      return this.field_102065_fill;
   }
}
