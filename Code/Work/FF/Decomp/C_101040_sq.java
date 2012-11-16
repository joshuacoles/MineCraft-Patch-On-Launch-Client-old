import java.util.List;

public class C_101040_sq {

   public static final C_101040_sq[] field_111419_a = new C_101040_sq[12];
   public static final C_101040_sq field_111417_b = new C_101039_sr(0, "buildingBlocks");
   public static final C_101040_sq field_111418_c = new C_101026_sv(1, "decorations");
   public static final C_101040_sq field_111415_d = new C_101031_sw(2, "redstone");
   public static final C_101040_sq field_111416_e = new C_101032_sx(3, "transportation");
   public static final C_101040_sq field_111413_f = new C_101029_sy(4, "misc");
   public static final C_101040_sq field_111414_g = (new C_101030_sz(5, "search")).func_111410_a("search.png");
   public static final C_101040_sq field_111426_h = new C_101024_ta(6, "food");
   public static final C_101040_sq field_111427_i = new C_101022_tb(7, "tools");
   public static final C_101040_sq field_111424_j = new C_101023_tc(8, "combat");
   public static final C_101040_sq field_111425_k = new C_101027_ss(9, "brewing");
   public static final C_101040_sq field_111422_l = new C_101028_st(10, "materials");
   public static final C_101040_sq field_111423_m = (new C_101025_su(11, "inventory")).func_111410_a("survival_inv.png").func_111399_j().func_111404_h();
   private final int field_111420_n;
   private final String field_111421_o;
   private String field_111430_p = "list_items.png";
   private boolean field_111429_q = true;
   private boolean field_111428_r = true;


   public C_101040_sq(int var1, String var2) {
      this.field_111420_n = var1;
      this.field_111421_o = var2;
      field_111419_a[var1] = this;
   }

   public int func_111409_a() {
      return this.field_111420_n;
   }

   public String func_111402_b() {
      return this.field_111421_o;
   }

   public String func_111412_c() {
      return C_100361_be.func_107654_a().func_107651_b("itemGroup." + this.func_111402_b());
   }

   public C_100992_tt func_111400_d() {
      return C_100992_tt.field_110834_e[this.func_111401_e()];
   }

   public int func_111401_e() {
      return 1;
   }

   public String func_111403_f() {
      return this.field_111430_p;
   }

   public C_101040_sq func_111410_a(String var1) {
      this.field_111430_p = var1;
      return this;
   }

   public boolean func_111407_g() {
      return this.field_111428_r;
   }

   public C_101040_sq func_111404_h() {
      this.field_111428_r = false;
      return this;
   }

   public boolean func_111405_i() {
      return this.field_111429_q;
   }

   public C_101040_sq func_111399_j() {
      this.field_111429_q = false;
      return this;
   }

   public int func_111408_k() {
      return this.field_111420_n % 6;
   }

   public boolean func_111411_l() {
      return this.field_111420_n < 6;
   }

   public void func_111406_a(List var1) {
      C_100992_tt[] var2 = C_100992_tt.field_110834_e;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         C_100992_tt var5 = var2[var4];
         if(var5 != null && var5.func_110760_w() == this) {
            var5.func_110767_a(var5.field_110891_cf, this, var1);
         }
      }

   }

}
