
public class C_100698_ks {

   public static C_100698_ks field_109235_a = (new C_100698_ks("inFire")).func_109222_j();
   public static C_100698_ks field_109233_b = (new C_100698_ks("onFire")).func_109208_h().func_109222_j();
   public static C_100698_ks field_109234_c = (new C_100698_ks("lava")).func_109222_j();
   public static C_100698_ks field_109231_d = (new C_100698_ks("inWall")).func_109208_h();
   public static C_100698_ks field_109232_e = (new C_100698_ks("drown")).func_109208_h();
   public static C_100698_ks field_109229_f = (new C_100698_ks("starve")).func_109208_h();
   public static C_100698_ks field_109230_g = new C_100698_ks("cactus");
   public static C_100698_ks field_109242_h = (new C_100698_ks("fall")).func_109208_h();
   public static C_100698_ks field_109243_i = (new C_100698_ks("outOfWorld")).func_109208_h().func_109226_i();
   public static C_100698_ks field_109240_j = (new C_100698_ks("generic")).func_109208_h();
   public static C_100698_ks field_109241_k = (new C_100698_ks("explosion")).func_109221_m();
   public static C_100698_ks field_109238_l = new C_100698_ks("explosion");
   public static C_100698_ks field_109239_m = (new C_100698_ks("magic")).func_109208_h().func_109224_p();
   public static C_100698_ks field_109236_n = (new C_100698_ks("wither")).func_109208_h();
   public static C_100698_ks field_109237_o = new C_100698_ks("anvil");
   public static C_100698_ks field_109251_p = new C_100698_ks("fallingBlock");
   private boolean field_109249_r = false;
   private boolean field_109248_s = false;
   private float field_109247_t = 0.3F;
   private boolean field_109246_u;
   private boolean field_109245_v;
   private boolean field_109244_w;
   private boolean field_109252_x = false;
   public String field_109250_q;


   public static C_100698_ks func_109218_a(C_100595_ln var0) {
      return new C_100700_kt("mob", var0);
   }

   public static C_100698_ks func_109223_a(C_101095_qg var0) {
      return new C_100700_kt("player", var0);
   }

   public static C_100698_ks func_109216_a(C_101089_qi var0, C_100730_lb var1) {
      return (new C_100702_ku("arrow", var0, var1)).func_109227_b();
   }

   public static C_100698_ks func_109213_a(C_101091_qk var0, C_100730_lb var1) {
      return var1 == null?(new C_100702_ku("onFire", var0, var0)).func_109222_j().func_109227_b():(new C_100702_ku("fireball", var0, var1)).func_109222_j().func_109227_b();
   }

   public static C_100698_ks func_109212_a(C_100730_lb var0, C_100730_lb var1) {
      return (new C_100702_ku("thrown", var0, var1)).func_109227_b();
   }

   public static C_100698_ks func_109225_b(C_100730_lb var0, C_100730_lb var1) {
      return (new C_100702_ku("indirectMagic", var0, var1)).func_109208_h().func_109224_p();
   }

   public boolean func_109215_a() {
      return this.field_109245_v;
   }

   public C_100698_ks func_109227_b() {
      this.field_109245_v = true;
      return this;
   }

   public boolean func_109228_c() {
      return this.field_109249_r;
   }

   public float func_109206_d() {
      return this.field_109247_t;
   }

   public boolean func_109220_e() {
      return this.field_109248_s;
   }

   protected C_100698_ks(String var1) {
      this.field_109250_q = var1;
   }

   public C_100730_lb func_109207_f() {
      return this.func_109210_g();
   }

   public C_100730_lb func_109210_g() {
      return null;
   }

   protected C_100698_ks func_109208_h() {
      this.field_109249_r = true;
      this.field_109247_t = 0.0F;
      return this;
   }

   protected C_100698_ks func_109226_i() {
      this.field_109248_s = true;
      return this;
   }

   protected C_100698_ks func_109222_j() {
      this.field_109246_u = true;
      return this;
   }

   public String func_109217_b(C_101095_qg var1) {
      return C_100359_bd.func_107637_a("death." + this.field_109250_q, new Object[]{var1.field_103847_bT});
   }

   public boolean func_109209_k() {
      return this.field_109246_u;
   }

   public String func_109219_l() {
      return this.field_109250_q;
   }

   public C_100698_ks func_109221_m() {
      this.field_109244_w = true;
      return this;
   }

   public boolean func_109214_n() {
      return this.field_109244_w;
   }

   public boolean func_109211_o() {
      return this.field_109252_x;
   }

   public C_100698_ks func_109224_p() {
      this.field_109252_x = true;
      return this;
   }

}
