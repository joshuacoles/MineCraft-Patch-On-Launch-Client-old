
public class C_100563_ox extends C_100730_lb {

   public int field_103242_a;
   public int field_103241_b;


   public C_100563_ox(C_100873_xe var1) {
      super(var1);
      this.field_103242_a = 0;
      this.field_103211_m = true;
      this.func_103161_a(2.0F, 2.0F);
      this.field_103181_M = this.field_103183_O / 2.0F;
      this.field_103241_b = 5;
      this.field_103242_a = this.field_103232_aa.nextInt(100000);
   }

   public C_100563_ox(C_100873_xe var1, double var2, double var4, double var6) {
      this(var1);
      this.func_103163_b(var2, var4, var6);
   }

   protected boolean func_103092_f_() {
      return false;
   }

   protected void func_103141_a() {
      this.field_103234_ag.func_108841_a(8, Integer.valueOf(this.field_103241_b));
   }

   public void func_103165_j_() {
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      ++this.field_103242_a;
      this.field_103234_ag.func_108851_b(8, Integer.valueOf(this.field_103241_b));
      int var1 = C_100650_jv.func_108910_c(this.field_103221_t);
      int var2 = C_100650_jv.func_108910_c(this.field_103219_u);
      int var3 = C_100650_jv.func_108910_c(this.field_103217_v);
      if(this.field_103229_p.func_109349_a(var1, var2, var3) != C_100451_alf.field_106222_au.field_106162_cm) {
         this.field_103229_p.func_109422_e(var1, var2, var3, C_100451_alf.field_106222_au.field_106162_cm);
      }

   }

   protected void func_103078_b(C_100353_bh var1) {}

   protected void func_103110_a(C_100353_bh var1) {}

   public float func_103109_R() {
      return 0.0F;
   }

   public boolean func_103123_L() {
      return true;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      if(!this.field_103180_L && !this.field_103229_p.field_109557_J) {
         this.field_103241_b = 0;
         if(this.field_103241_b <= 0) {
            this.func_103121_x();
            if(!this.field_103229_p.field_109557_J) {
               this.field_103229_p.func_109466_a((C_100730_lb)null, this.field_103221_t, this.field_103219_u, this.field_103217_v, 6.0F, true);
            }
         }
      }

      return true;
   }
}
