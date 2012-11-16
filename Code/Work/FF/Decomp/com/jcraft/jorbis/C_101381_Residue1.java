package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101375_Block;
import com.jcraft.jorbis.C_101380_Residue0;

class C_101381_Residue1 extends C_101380_Residue0 {

   int func_101867_inverse(C_101375_Block var1, Object var2, float[][] var3, int[] var4, int var5) {
      int var6 = 0;

      for(int var7 = 0; var7 < var5; ++var7) {
         if(var4[var7] != 0) {
            var3[var6++] = var3[var7];
         }
      }

      if(var6 != 0) {
         return func_101873__01inverse(var1, var2, var3, var6, 1);
      } else {
         return 0;
      }
   }
}
