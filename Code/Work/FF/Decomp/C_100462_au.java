
public enum C_100462_au {

   field_107956_a("DOWN", 0, 0, 1, 0, -1, 0),
   field_107954_b("UP", 1, 1, 0, 0, 1, 0),
   field_107955_c("NORTH", 2, 2, 3, 0, 0, -1),
   field_107952_d("SOUTH", 3, 3, 2, 0, 0, 1),
   field_107953_e("EAST", 4, 4, 5, -1, 0, 0),
   field_107950_f("WEST", 5, 5, 4, 1, 0, 0);
   private final int field_107951_g;
   private final int field_107961_h;
   private final int field_107962_i;
   private final int field_107959_j;
   private final int field_107960_k;
   private static final C_100462_au[] field_107957_l = new C_100462_au[6];
   // $FF: synthetic field
   private static final C_100462_au[] field_107958_m = new C_100462_au[]{field_107956_a, field_107954_b, field_107955_c, field_107952_d, field_107953_e, field_107950_f};


   public static C_100462_au[] func_107946_values() {
      return (C_100462_au[])field_107958_m.clone();
   }

   private C_100462_au(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field_107951_g = var3;
      this.field_107961_h = var4;
      this.field_107962_i = var5;
      this.field_107959_j = var6;
      this.field_107960_k = var7;
   }

   public int func_107948_c() {
      return this.field_107962_i;
   }

   public int func_107947_e() {
      return this.field_107960_k;
   }

   public static C_100462_au func_107949_a(int var0) {
      return field_107957_l[var0 % field_107957_l.length];
   }

   static {
      C_100462_au[] var0 = func_107946_values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         C_100462_au var3 = var0[var2];
         field_107957_l[var3.field_107951_g] = var3;
      }

   }
}
