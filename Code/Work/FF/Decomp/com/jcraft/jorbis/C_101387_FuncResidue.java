package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101366_InfoMode;
import com.jcraft.jorbis.C_101372_DspState;
import com.jcraft.jorbis.C_101375_Block;
import com.jcraft.jorbis.C_101380_Residue0;
import com.jcraft.jorbis.C_101381_Residue1;
import com.jcraft.jorbis.C_101382_Residue2;
import com.jcraft.jorbis.C_101390_Info;
import com.jcraft.p_101362_jogg.C_101408_Buffer;

abstract class C_101387_FuncResidue {

   public static C_101387_FuncResidue[] field_101872_residue_P = new C_101387_FuncResidue[]{new C_101380_Residue0(), new C_101381_Residue1(), new C_101382_Residue2()};


   abstract void func_101868_pack(Object var1, C_101408_Buffer var2);

   abstract Object func_101870_unpack(C_101390_Info var1, C_101408_Buffer var2);

   abstract Object func_101866_look(C_101372_DspState var1, C_101366_InfoMode var2, Object var3);

   abstract void func_101871_free_info(Object var1);

   abstract void func_101869_free_look(Object var1);

   abstract int func_101867_inverse(C_101375_Block var1, Object var2, float[][] var3, int[] var4, int var5);

}
