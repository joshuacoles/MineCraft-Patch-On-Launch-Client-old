
public class C_100791_ix extends C_100809_jc {

   public final int field_109936_a;
   public final int field_109934_b;
   public final C_100791_ix field_109935_c;
   private final String field_109939_k;
   private C_100820_iz field_109937_l;
   public final C_100994_tv field_109933_d;
   private boolean field_109938_m;


   public C_100791_ix(int var1, String var2, int var3, int var4, C_100992_tt var5, C_100791_ix var6) {
      this(var1, var2, var3, var4, new C_100994_tv(var5), var6);
   }

   public C_100791_ix(int var1, String var2, int var3, int var4, C_100451_alf var5, C_100791_ix var6) {
      this(var1, var2, var3, var4, new C_100994_tv(var5), var6);
   }

   public C_100791_ix(int var1, String var2, int var3, int var4, C_100994_tv var5, C_100791_ix var6) {
      super(5242880 + var1, "achievement." + var2);
      this.field_109933_d = var5;
      this.field_109939_k = "achievement." + var2 + ".desc";
      this.field_109936_a = var3;
      this.field_109934_b = var4;
      if(var3 < C_100822_iy.field_110063_a) {
         C_100822_iy.field_110063_a = var3;
      }

      if(var4 < C_100822_iy.field_110061_b) {
         C_100822_iy.field_110061_b = var4;
      }

      if(var3 > C_100822_iy.field_110062_c) {
         C_100822_iy.field_110062_c = var3;
      }

      if(var4 > C_100822_iy.field_110059_d) {
         C_100822_iy.field_110059_d = var4;
      }

      this.field_109935_c = var6;
   }

   public C_100791_ix func_109928_a() {
      this.field_109915_f = true;
      return this;
   }

   public C_100791_ix func_109930_b() {
      this.field_109938_m = true;
      return this;
   }

   public C_100791_ix func_109929_c() {
      super.func_109909_g();
      C_100822_iy.field_110060_e.add(this);
      return this;
   }

   public boolean func_109910_d() {
      return true;
   }

   public String func_109932_e() {
      return this.field_109937_l != null?this.field_109937_l.func_110048_a(C_100359_bd.func_107638_a(this.field_109939_k)):C_100359_bd.func_107638_a(this.field_109939_k);
   }

   public C_100791_ix func_109931_a(C_100820_iz var1) {
      this.field_109937_l = var1;
      return this;
   }

   public boolean func_109927_f() {
      return this.field_109938_m;
   }

   // $FF: synthetic method
   public C_100809_jc func_109909_g() {
      return this.func_109929_c();
   }

   // $FF: synthetic method
   public C_100809_jc func_109914_h() {
      return this.func_109928_a();
   }
}
