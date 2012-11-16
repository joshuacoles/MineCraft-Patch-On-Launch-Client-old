package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101379_Mapping0;

class C_101379_Mapping0$C_101400_InfoMapping0 {

   int field_101826_submaps;
   int[] field_101825_chmuxlist;
   int[] field_101822_timesubmap;
   int[] field_101821_floorsubmap;
   int[] field_101824_residuesubmap;
   int[] field_101817_psysubmap;
   int field_101818_coupling_steps;
   int[] field_101819_coupling_mag;
   int[] field_101820_coupling_ang;
   // $FF: synthetic field
   final C_101379_Mapping0 field_101823_this$0;


   C_101379_Mapping0$C_101400_InfoMapping0(C_101379_Mapping0 var1) {
      this.field_101823_this$0 = var1;
      this.field_101825_chmuxlist = new int[256];
      this.field_101822_timesubmap = new int[16];
      this.field_101821_floorsubmap = new int[16];
      this.field_101824_residuesubmap = new int[16];
      this.field_101817_psysubmap = new int[16];
      this.field_101819_coupling_mag = new int[256];
      this.field_101820_coupling_ang = new int[256];
   }

   void func_101816_free() {
      this.field_101825_chmuxlist = null;
      this.field_101822_timesubmap = null;
      this.field_101821_floorsubmap = null;
      this.field_101824_residuesubmap = null;
      this.field_101817_psysubmap = null;
      this.field_101819_coupling_mag = null;
      this.field_101820_coupling_ang = null;
   }
}
