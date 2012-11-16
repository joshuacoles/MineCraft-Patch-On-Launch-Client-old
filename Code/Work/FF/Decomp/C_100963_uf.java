
public enum C_100963_uf {

   field_111165_a("common", 0, 15, "Common"),
   field_111163_b("uncommon", 1, 14, "Uncommon"),
   field_111164_c("rare", 2, 11, "Rare"),
   field_111161_d("epic", 3, 13, "Epic");
   public final int field_111162_e;
   public final String field_111159_f;
   // $FF: synthetic field
   private static final C_100963_uf[] field_111160_g = new C_100963_uf[]{field_111165_a, field_111163_b, field_111164_c, field_111161_d};


   public static C_100963_uf[] func_111158_values() {
      return (C_100963_uf[])field_111160_g.clone();
   }

   private C_100963_uf(String var1, int var2, int var3, String var4) {
      this.field_111162_e = var3;
      this.field_111159_f = var4;
   }

}
