
public class C_100845_xp {

   public static final C_100845_xp[] field_110160_a = new C_100845_xp[16];
   public static final C_100845_xp field_110158_b = (new C_100845_xp(0, "default", 1)).func_110151_g();
   public static final C_100845_xp field_110159_c = new C_100845_xp(1, "flat");
   public static final C_100845_xp field_110156_d = new C_100845_xp(2, "largeBiomes");
   public static final C_100845_xp field_110157_e = (new C_100845_xp(8, "default_1_1", 0)).func_110149_a(false);
   private final int field_110154_f;
   private final String field_110155_g;
   private final int field_110162_h;
   private boolean field_110163_i;
   private boolean field_110161_j;


   private C_100845_xp(int var1, String var2) {
      this(var1, var2, 0);
   }

   private C_100845_xp(int var1, String var2, int var3) {
      this.field_110155_g = var2;
      this.field_110162_h = var3;
      this.field_110163_i = true;
      this.field_110154_f = var1;
      field_110160_a[var1] = this;
   }

   public String func_110148_a() {
      return this.field_110155_g;
   }

   public String func_110150_b() {
      return "generator." + this.field_110155_g;
   }

   public int func_110152_c() {
      return this.field_110162_h;
   }

   public C_100845_xp func_110153_a(int var1) {
      return this == field_110158_b && var1 == 0?field_110157_e:this;
   }

   private C_100845_xp func_110149_a(boolean var1) {
      this.field_110163_i = var1;
      return this;
   }

   public boolean func_110147_d() {
      return this.field_110163_i;
   }

   private C_100845_xp func_110151_g() {
      this.field_110161_j = true;
      return this;
   }

   public boolean func_110146_e() {
      return this.field_110161_j;
   }

   public static C_100845_xp func_110145_a(String var0) {
      C_100845_xp[] var1 = field_110160_a;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         C_100845_xp var4 = var1[var3];
         if(var4 != null && var4.field_110155_g.equalsIgnoreCase(var0)) {
            return var4;
         }
      }

      return null;
   }

   public int func_110144_f() {
      return this.field_110154_f;
   }

}
