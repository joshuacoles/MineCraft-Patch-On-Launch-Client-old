package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101376_Floor1;

class C_101376_Floor1$C_101396_InfoFloor1 {

   static final int field_101744_VIF_POSIT = 63;
   static final int field_101753_VIF_CLASS = 16;
   static final int field_101749_VIF_PARTS = 31;
   int field_101735_partitions;
   int[] field_101745_partitionclass;
   int[] field_101742_class_dim;
   int[] field_101733_class_subs;
   int[] field_101740_class_book;
   int[][] field_101750_class_subbook;
   int field_101734_mult;
   int[] field_101747_postlist;
   float field_101746_maxover;
   float field_101739_maxunder;
   float field_101748_maxerr;
   int field_101737_twofitminsize;
   int field_101743_twofitminused;
   int field_101752_twofitweight;
   float field_101741_twofitatten;
   int field_101754_unusedminsize;
   int field_101751_unusedmin_n;
   int field_101736_n;
   // $FF: synthetic field
   final C_101376_Floor1 field_101738_this$0;


   C_101376_Floor1$C_101396_InfoFloor1(C_101376_Floor1 var1) {
      this.field_101738_this$0 = var1;
      this.field_101745_partitionclass = new int[31];
      this.field_101742_class_dim = new int[16];
      this.field_101733_class_subs = new int[16];
      this.field_101740_class_book = new int[16];
      this.field_101750_class_subbook = new int[16][];
      this.field_101747_postlist = new int[65];

      for(int var2 = 0; var2 < this.field_101750_class_subbook.length; ++var2) {
         this.field_101750_class_subbook[var2] = new int[8];
      }

   }

   void func_101731_free() {
      this.field_101745_partitionclass = null;
      this.field_101742_class_dim = null;
      this.field_101733_class_subs = null;
      this.field_101740_class_book = null;
      this.field_101750_class_subbook = (int[][])null;
      this.field_101747_postlist = null;
   }

   Object func_101732_copy_info() {
      C_101376_Floor1$C_101396_InfoFloor1 var1 = this;
      C_101376_Floor1$C_101396_InfoFloor1 var2 = new C_101376_Floor1$C_101396_InfoFloor1(this.field_101738_this$0);
      var2.field_101735_partitions = this.field_101735_partitions;
      System.arraycopy(this.field_101745_partitionclass, 0, var2.field_101745_partitionclass, 0, 31);
      System.arraycopy(this.field_101742_class_dim, 0, var2.field_101742_class_dim, 0, 16);
      System.arraycopy(this.field_101733_class_subs, 0, var2.field_101733_class_subs, 0, 16);
      System.arraycopy(this.field_101740_class_book, 0, var2.field_101740_class_book, 0, 16);

      for(int var3 = 0; var3 < 16; ++var3) {
         System.arraycopy(var1.field_101750_class_subbook[var3], 0, var2.field_101750_class_subbook[var3], 0, 8);
      }

      var2.field_101734_mult = var1.field_101734_mult;
      System.arraycopy(var1.field_101747_postlist, 0, var2.field_101747_postlist, 0, 65);
      var2.field_101746_maxover = var1.field_101746_maxover;
      var2.field_101739_maxunder = var1.field_101739_maxunder;
      var2.field_101748_maxerr = var1.field_101748_maxerr;
      var2.field_101737_twofitminsize = var1.field_101737_twofitminsize;
      var2.field_101743_twofitminused = var1.field_101743_twofitminused;
      var2.field_101752_twofitweight = var1.field_101752_twofitweight;
      var2.field_101741_twofitatten = var1.field_101741_twofitatten;
      var2.field_101754_unusedminsize = var1.field_101754_unusedminsize;
      var2.field_101751_unusedmin_n = var1.field_101751_unusedmin_n;
      var2.field_101736_n = var1.field_101736_n;
      return var2;
   }
}
