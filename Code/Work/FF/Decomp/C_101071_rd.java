
class C_101071_rd extends C_101048_rz {

   private C_101095_qg field_111483_a;


   public C_101071_rd(C_101095_qg var1, C_100716_kl var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field_111483_a = var1;
   }

   public boolean func_111458_a(C_100994_tv var1) {
      return func_111482_a_(var1);
   }

   public int func_111455_a() {
      return 1;
   }

   public void func_111452_a(C_101095_qg var1, C_100994_tv var2) {
      if(var2.field_111397_c == C_100992_tt.field_110864_bs.field_110891_cf && var2.func_111367_j() > 0) {
         this.field_111483_a.func_103813_a(C_100822_iy.field_110054_A, 1);
      }

      super.func_111452_a(var1, var2);
   }

   public static boolean func_111482_a_(C_100994_tv var0) {
      return var0 != null && (var0.field_111397_c == C_100992_tt.field_110864_bs.field_110891_cf || var0.field_111397_c == C_100992_tt.field_110867_bt.field_110891_cf);
   }
}
