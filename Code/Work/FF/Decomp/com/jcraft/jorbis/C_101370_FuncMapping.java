package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101366_InfoMode;
import com.jcraft.jorbis.C_101372_DspState;
import com.jcraft.jorbis.C_101375_Block;
import com.jcraft.jorbis.C_101379_Mapping0;
import com.jcraft.jorbis.C_101390_Info;
import com.jcraft.p_101362_jogg.C_101408_Buffer;

abstract class C_101370_FuncMapping {

   public static C_101370_FuncMapping[] field_101542_mapping_P = new C_101370_FuncMapping[]{new C_101379_Mapping0()};


   abstract void func_101537_pack(C_101390_Info var1, Object var2, C_101408_Buffer var3);

   abstract Object func_101539_unpack(C_101390_Info var1, C_101408_Buffer var2);

   abstract Object func_101536_look(C_101372_DspState var1, C_101366_InfoMode var2, Object var3);

   abstract void func_101541_free_info(Object var1);

   abstract void func_101538_free_look(Object var1);

   abstract int func_101540_inverse(C_101375_Block var1, Object var2);

}
