package com.jcraft.jorbis;


class C_101364_Util {

   static int func_101456_ilog(int var0) {
      int var1;
      for(var1 = 0; var0 != 0; var0 >>>= 1) {
         ++var1;
      }

      return var1;
   }

   static int func_101455_ilog2(int var0) {
      int var1;
      for(var1 = 0; var0 > 1; var0 >>>= 1) {
         ++var1;
      }

      return var1;
   }

   static int func_101454_icount(int var0) {
      int var1;
      for(var1 = 0; var0 != 0; var0 >>>= 1) {
         var1 += var0 & 1;
      }

      return var1;
   }
}
