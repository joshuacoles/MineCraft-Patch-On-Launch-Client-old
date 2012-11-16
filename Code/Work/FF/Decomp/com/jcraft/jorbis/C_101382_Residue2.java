package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101375_Block;
import com.jcraft.jorbis.C_101380_Residue0;

class C_101382_Residue2 extends C_101380_Residue0 {

   int func_101867_inverse(C_101375_Block var1, Object var2, float[][] var3, int[] var4, int var5) {
      boolean var6 = false;

      int var7;
      for(var7 = 0; var7 < var5 && var4[var7] == 0; ++var7) {
         ;
      }

      return var7 == var5?0:func_101874__2inverse(var1, var2, var3, var5);
   }
}
