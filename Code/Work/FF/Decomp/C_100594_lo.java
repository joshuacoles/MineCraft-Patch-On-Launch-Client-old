
public enum C_100594_lo {

   field_108778_a("monster", 0, C_100587_pn.class, 70, C_100664_afg.field_109012_a, false, false),
   field_108776_b("creature", 1, C_100544_oh.class, 15, C_100664_afg.field_109012_a, true, true),
   field_108777_c("ambient", 2, C_100523_of.class, 15, C_100664_afg.field_109012_a, true, false),
   field_108774_d("waterCreature", 3, C_100548_os.class, 5, C_100664_afg.field_109019_h, true, false);
   private final Class field_108775_e;
   private final int field_108772_f;
   private final C_100664_afg field_108773_g;
   private final boolean field_108780_h;
   private final boolean field_108781_i;
   // $FF: synthetic field
   private static final C_100594_lo[] field_108779_j = new C_100594_lo[]{field_108778_a, field_108776_b, field_108777_c, field_108774_d};


   public static C_100594_lo[] func_108770_values() {
      return (C_100594_lo[])field_108779_j.clone();
   }

   private C_100594_lo(String var1, int var2, Class var3, int var4, C_100664_afg var5, boolean var6, boolean var7) {
      this.field_108775_e = var3;
      this.field_108772_f = var4;
      this.field_108773_g = var5;
      this.field_108780_h = var6;
      this.field_108781_i = var7;
   }

   public Class func_108768_a() {
      return this.field_108775_e;
   }

   public int func_108771_b() {
      return this.field_108772_f;
   }

   public C_100664_afg func_108767_c() {
      return this.field_108773_g;
   }

   public boolean func_108769_d() {
      return this.field_108780_h;
   }

   public boolean func_108766_e() {
      return this.field_108781_i;
   }

}
