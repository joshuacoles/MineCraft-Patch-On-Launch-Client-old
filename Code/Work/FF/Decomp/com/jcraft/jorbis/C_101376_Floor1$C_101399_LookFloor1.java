package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101376_Floor1;
import com.jcraft.jorbis.C_101376_Floor1$C_101396_InfoFloor1;

class C_101376_Floor1$C_101399_LookFloor1 {

   static final int field_101784_VIF_POSIT = 63;
   int[] field_101777_sorted_index;
   int[] field_101783_forward_index;
   int[] field_101786_reverse_index;
   int[] field_101787_hineighbor;
   int[] field_101779_loneighbor;
   int field_101775_posts;
   int field_101776_n;
   int field_101780_quant_q;
   C_101376_Floor1$C_101396_InfoFloor1 field_101774_vi;
   int field_101782_phrasebits;
   int field_101778_postbits;
   int field_101785_frames;
   // $FF: synthetic field
   final C_101376_Floor1 field_101781_this$0;


   C_101376_Floor1$C_101399_LookFloor1(C_101376_Floor1 var1) {
      this.field_101781_this$0 = var1;
      this.field_101777_sorted_index = new int[65];
      this.field_101783_forward_index = new int[65];
      this.field_101786_reverse_index = new int[65];
      this.field_101787_hineighbor = new int[63];
      this.field_101779_loneighbor = new int[63];
   }

   void func_101773_free() {
      this.field_101777_sorted_index = null;
      this.field_101783_forward_index = null;
      this.field_101786_reverse_index = null;
      this.field_101787_hineighbor = null;
      this.field_101779_loneighbor = null;
   }
}
