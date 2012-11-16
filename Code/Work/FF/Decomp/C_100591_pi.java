
public class C_100591_pi extends C_100730_lb {

   public int field_103284_a;


   public C_100591_pi(C_100873_xe var1) {
      super(var1);
      this.field_103284_a = 0;
      this.field_103211_m = true;
      this.func_103161_a(0.98F, 0.98F);
      this.field_103181_M = this.field_103183_O / 2.0F;
   }

   public C_100591_pi(C_100873_xe var1, double var2, double var4, double var6) {
      this(var1);
      this.func_103163_b(var2, var4, var6);
      float var8 = (float)(Math.random() * 3.1415927410125732D * 2.0D);
      this.field_103215_w = (double)(-((float)Math.sin((double)var8)) * 0.02F);
      this.field_103240_x = 0.20000000298023224D;
      this.field_103238_y = (double)(-((float)Math.cos((double)var8)) * 0.02F);
      this.field_103284_a = 80;
      this.field_103227_q = var2;
      this.field_103225_r = var4;
      this.field_103223_s = var6;
   }

   protected void func_103141_a() {}

   protected boolean func_103092_f_() {
      return false;
   }

   public boolean func_103123_L() {
      return !this.field_103180_L;
   }

   public void func_103165_j_() {
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      this.field_103240_x -= 0.03999999910593033D;
      this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
      this.field_103215_w *= 0.9800000190734863D;
      this.field_103240_x *= 0.9800000190734863D;
      this.field_103238_y *= 0.9800000190734863D;
      if(this.field_103174_E) {
         this.field_103215_w *= 0.699999988079071D;
         this.field_103238_y *= 0.699999988079071D;
         this.field_103240_x *= -0.5D;
      }

      if(this.field_103284_a-- <= 0) {
         this.func_103121_x();
         if(!this.field_103229_p.field_109557_J) {
            this.func_103283_c();
         }
      } else {
         this.field_103229_p.func_109428_a("smoke", this.field_103221_t, this.field_103219_u + 0.5D, this.field_103217_v, 0.0D, 0.0D, 0.0D);
      }

   }

   private void func_103283_c() {
      float var1 = 4.0F;
      this.field_103229_p.func_109466_a((C_100730_lb)null, this.field_103221_t, this.field_103219_u, this.field_103217_v, var1, true);
   }

   protected void func_103078_b(C_100353_bh var1) {
      var1.func_107527_a("Fuse", (byte)this.field_103284_a);
   }

   protected void func_103110_a(C_100353_bh var1) {
      this.field_103284_a = var1.func_107524_c("Fuse");
   }

   public float func_103109_R() {
      return 0.0F;
   }
}
