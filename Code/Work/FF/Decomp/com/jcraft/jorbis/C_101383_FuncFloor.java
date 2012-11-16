package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101366_InfoMode;
import com.jcraft.jorbis.C_101372_DspState;
import com.jcraft.jorbis.C_101374_Floor0;
import com.jcraft.jorbis.C_101375_Block;
import com.jcraft.jorbis.C_101376_Floor1;
import com.jcraft.jorbis.C_101390_Info;
import com.jcraft.p_101362_jogg.C_101408_Buffer;

abstract class C_101383_FuncFloor {

   public static C_101383_FuncFloor[] field_101700_floor_P = new C_101383_FuncFloor[]{new C_101374_Floor0(), new C_101376_Floor1()};


   abstract void func_101693_pack(Object var1, C_101408_Buffer var2);

   abstract Object func_101697_unpack(C_101390_Info var1, C_101408_Buffer var2);

   abstract Object func_101691_look(C_101372_DspState var1, C_101366_InfoMode var2, Object var3);

   abstract void func_101698_free_info(Object var1);

   abstract void func_101695_free_look(Object var1);

   abstract void func_101692_free_state(Object var1);

   abstract int func_101696_forward(C_101375_Block var1, Object var2, float[] var3, float[] var4, Object var5);

   abstract Object func_101694_inverse1(C_101375_Block var1, Object var2, Object var3);

   abstract int func_101699_inverse2(C_101375_Block var1, Object var2, Object var3, float[] var4);

}
