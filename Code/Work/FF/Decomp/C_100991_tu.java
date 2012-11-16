
public enum C_100991_tu {

   field_111331_a("WOOD", 0, 0, 59, 2.0F, 0, 15),
   field_111329_b("STONE", 1, 1, 131, 4.0F, 1, 5),
   field_111330_c("IRON", 2, 2, 250, 6.0F, 2, 14),
   field_111327_d("EMERALD", 3, 3, 1561, 8.0F, 3, 10),
   field_111328_e("GOLD", 4, 0, 32, 12.0F, 0, 22);
   private final int field_111325_f;
   private final int field_111326_g;
   private final float field_111334_h;
   private final int field_111335_i;
   private final int field_111332_j;
   // $FF: synthetic field
   private static final C_100991_tu[] field_111333_k = new C_100991_tu[]{field_111331_a, field_111329_b, field_111330_c, field_111327_d, field_111328_e};


   public static C_100991_tu[] func_111324_values() {
      return (C_100991_tu[])field_111333_k.clone();
   }

   private C_100991_tu(String var1, int var2, int var3, int var4, float var5, int var6, int var7) {
      this.field_111325_f = var3;
      this.field_111326_g = var4;
      this.field_111334_h = var5;
      this.field_111335_i = var6;
      this.field_111332_j = var7;
   }

   public int func_111321_a() {
      return this.field_111326_g;
   }

   public float func_111322_b() {
      return this.field_111334_h;
   }

   public int func_111323_c() {
      return this.field_111335_i;
   }

   public int func_111320_d() {
      return this.field_111325_f;
   }

   public int func_111319_e() {
      return this.field_111332_j;
   }

   public int func_111318_f() {
      return this == field_111331_a?C_100451_alf.field_106075_A.field_106162_cm:(this == field_111329_b?C_100451_alf.field_106119_z.field_106162_cm:(this == field_111328_e?C_100992_tt.field_110853_p.field_110891_cf:(this == field_111330_c?C_100992_tt.field_110839_o.field_110891_cf:(this == field_111327_d?C_100992_tt.field_110838_n.field_110891_cf:0))));
   }

}
