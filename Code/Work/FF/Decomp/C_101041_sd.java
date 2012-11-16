
public enum C_101041_sd {

   field_111442_a("CLOTH", 0, 5, new int[]{1, 3, 2, 1}, 15),
   field_111440_b("CHAIN", 1, 15, new int[]{2, 5, 4, 1}, 12),
   field_111441_c("IRON", 2, 15, new int[]{2, 6, 5, 2}, 9),
   field_111438_d("GOLD", 3, 7, new int[]{2, 5, 3, 1}, 25),
   field_111439_e("DIAMOND", 4, 33, new int[]{3, 8, 6, 3}, 10);
   private int field_111436_f;
   private int[] field_111437_g;
   private int field_111443_h;
   // $FF: synthetic field
   private static final C_101041_sd[] field_111444_i = new C_101041_sd[]{field_111442_a, field_111440_b, field_111441_c, field_111438_d, field_111439_e};


   public static C_101041_sd[] func_111435_values() {
      return (C_101041_sd[])field_111444_i.clone();
   }

   private C_101041_sd(String var1, int var2, int var3, int[] var4, int var5) {
      this.field_111436_f = var3;
      this.field_111437_g = var4;
      this.field_111443_h = var5;
   }

   public int func_111433_a(int var1) {
      return C_101042_sc.func_111044_e()[var1] * this.field_111436_f;
   }

   public int func_111431_b(int var1) {
      return this.field_111437_g[var1];
   }

   public int func_111432_a() {
      return this.field_111443_h;
   }

   public int func_111434_b() {
      return this == field_111442_a?C_100992_tt.field_110918_aF.field_110891_cf:(this == field_111440_b?C_100992_tt.field_110839_o.field_110891_cf:(this == field_111438_d?C_100992_tt.field_110853_p.field_110891_cf:(this == field_111441_c?C_100992_tt.field_110839_o.field_110891_cf:(this == field_111439_e?C_100992_tt.field_110838_n.field_110891_cf:0))));
   }

}
