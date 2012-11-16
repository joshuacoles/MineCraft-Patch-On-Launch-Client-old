package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101366_InfoMode;
import com.jcraft.jorbis.C_101372_DspState;
import com.jcraft.jorbis.C_101375_Block;
import com.jcraft.jorbis.C_101386_Time0;
import com.jcraft.jorbis.C_101390_Info;
import com.jcraft.p_101362_jogg.C_101408_Buffer;

abstract class C_101378_FuncTime {

   public static C_101378_FuncTime[] field_101815_time_P = new C_101378_FuncTime[]{new C_101386_Time0()};


   abstract void func_101811_pack(Object var1, C_101408_Buffer var2);

   abstract Object func_101813_unpack(C_101390_Info var1, C_101408_Buffer var2);

   abstract Object func_101809_look(C_101372_DspState var1, C_101366_InfoMode var2, Object var3);

   abstract void func_101814_free_info(Object var1);

   abstract void func_101812_free_look(Object var1);

   abstract int func_101810_inverse(C_101375_Block var1, Object var2, float[] var3, float[] var4);

}
