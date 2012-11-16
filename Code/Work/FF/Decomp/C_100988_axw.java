
public class C_100988_axw extends C_100730_lb {

   private int field_104615_a;
   protected float field_104613_b;
   protected float field_104614_c;
   protected int field_104611_d = 0;
   protected int field_104612_e = 0;
   protected float field_104609_f;
   protected float field_104610_g;
   protected float field_104620_h;
   protected float field_104621_i;
   protected float field_104618_j;
   protected float field_104617_as = 1.0F;
   public static double field_104616_at;
   public static double field_104622_au;
   public static double field_104619_av;


   public C_100988_axw(C_100873_xe var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.func_103161_a(0.2F, 0.2F);
      this.field_103181_M = this.field_103183_O / 2.0F;
      this.func_103163_b(var2, var4, var6);
      this.field_104620_h = this.field_104621_i = this.field_104618_j = 1.0F;
      this.field_103215_w = var8 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      this.field_103240_x = var10 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      this.field_103238_y = var12 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      float var14 = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
      float var15 = C_100650_jv.func_108915_a(this.field_103215_w * this.field_103215_w + this.field_103240_x * this.field_103240_x + this.field_103238_y * this.field_103238_y);
      this.field_103215_w = this.field_103215_w / (double)var15 * (double)var14 * 0.4000000059604645D;
      this.field_103240_x = this.field_103240_x / (double)var15 * (double)var14 * 0.4000000059604645D + 0.10000000149011612D;
      this.field_103238_y = this.field_103238_y / (double)var15 * (double)var14 * 0.4000000059604645D;
      this.field_104613_b = this.field_103232_aa.nextFloat() * 3.0F;
      this.field_104614_c = this.field_103232_aa.nextFloat() * 3.0F;
      this.field_104609_f = (this.field_103232_aa.nextFloat() * 0.5F + 0.5F) * 2.0F;
      this.field_104612_e = (int)(4.0F / (this.field_103232_aa.nextFloat() * 0.9F + 0.1F));
      this.field_104611_d = 0;
   }

   public C_100988_axw func_104604_e(float var1) {
      this.field_103215_w *= (double)var1;
      this.field_103240_x = (this.field_103240_x - 0.10000000149011612D) * (double)var1 + 0.10000000149011612D;
      this.field_103238_y *= (double)var1;
      return this;
   }

   public C_100988_axw func_104608_f(float var1) {
      this.func_103161_a(0.2F * var1, 0.2F * var1);
      this.field_104609_f *= var1;
      return this;
   }

   public void func_104603_b(float var1, float var2, float var3) {
      this.field_104620_h = var1;
      this.field_104621_i = var2;
      this.field_104618_j = var3;
   }

   public void func_104601_g(float var1) {
      this.field_104617_as = var1;
   }

   public float func_104600_c() {
      return this.field_104620_h;
   }

   public float func_104598_d() {
      return this.field_104621_i;
   }

   public float func_104607_f() {
      return this.field_104618_j;
   }

   protected boolean func_103092_f_() {
      return false;
   }

   protected void func_103141_a() {}

   public void func_103165_j_() {
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      if(this.field_104611_d++ >= this.field_104612_e) {
         this.func_103121_x();
      }

      this.field_103240_x -= 0.04D * (double)this.field_104610_g;
      this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
      this.field_103215_w *= 0.9800000190734863D;
      this.field_103240_x *= 0.9800000190734863D;
      this.field_103238_y *= 0.9800000190734863D;
      if(this.field_103174_E) {
         this.field_103215_w *= 0.699999988079071D;
         this.field_103238_y *= 0.699999988079071D;
      }

   }

   public void func_104606_a(C_100872_azb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (float)(this.field_104615_a % 16) / 16.0F;
      float var9 = var8 + 0.0624375F;
      float var10 = (float)(this.field_104615_a / 16) / 16.0F;
      float var11 = var10 + 0.0624375F;
      float var12 = 0.1F * this.field_104609_f;
      float var13 = (float)(this.field_103227_q + (this.field_103221_t - this.field_103227_q) * (double)var2 - field_104616_at);
      float var14 = (float)(this.field_103225_r + (this.field_103219_u - this.field_103225_r) * (double)var2 - field_104622_au);
      float var15 = (float)(this.field_103223_s + (this.field_103217_v - this.field_103223_s) * (double)var2 - field_104619_av);
      float var16 = 1.0F;
      var1.func_110317_a(this.field_104620_h * var16, this.field_104621_i * var16, this.field_104618_j * var16, this.field_104617_as);
      var1.func_110322_a((double)(var13 - var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 - var5 * var12 - var7 * var12), (double)var9, (double)var11);
      var1.func_110322_a((double)(var13 - var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 - var5 * var12 + var7 * var12), (double)var9, (double)var10);
      var1.func_110322_a((double)(var13 + var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 + var5 * var12 + var7 * var12), (double)var8, (double)var10);
      var1.func_110322_a((double)(var13 + var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 + var5 * var12 - var7 * var12), (double)var8, (double)var11);
   }

   public int func_104602_b() {
      return 0;
   }

   public void func_103078_b(C_100353_bh var1) {}

   public void func_103110_a(C_100353_bh var1) {}

   public void func_104599_a(int var1) {
      this.field_104615_a = var1;
   }

   public int func_104605_h() {
      return this.field_104615_a;
   }

   public boolean func_103099_aq() {
      return false;
   }
}
