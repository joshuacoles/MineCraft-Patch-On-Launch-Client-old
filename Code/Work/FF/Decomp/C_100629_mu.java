
public class C_100629_mu extends C_100621_mm {

   C_100873_xe field_108148_a;
   C_100595_ln field_108146_b;
   C_100595_ln field_108147_c;
   int field_108144_d;
   float field_108145_e;
   boolean field_108142_f;
   C_100278_agj field_108143_g;
   Class field_108149_h;
   private int field_108150_i;


   public C_100629_mu(C_100595_ln var1, Class var2, float var3, boolean var4) {
      this(var1, var3, var4);
      this.field_108149_h = var2;
   }

   public C_100629_mu(C_100595_ln var1, float var2, boolean var3) {
      this.field_108144_d = 0;
      this.field_108146_b = var1;
      this.field_108148_a = var1.field_103229_p;
      this.field_108145_e = var2;
      this.field_108142_f = var3;
      this.func_108030_a(3);
   }

   public boolean func_108033_a() {
      C_100595_ln var1 = this.field_108146_b.func_103335_aF();
      if(var1 == null) {
         return false;
      } else if(this.field_108149_h != null && !this.field_108149_h.isAssignableFrom(var1.getClass())) {
         return false;
      } else {
         this.field_108147_c = var1;
         this.field_108143_g = this.field_108146_b.func_103383_ay().func_108306_a(this.field_108147_c);
         return this.field_108143_g != null;
      }
   }

   public boolean func_108036_b() {
      C_100595_ln var1 = this.field_108146_b.func_103335_aF();
      return var1 == null?false:(!this.field_108147_c.func_103143_S()?false:(!this.field_108142_f?!this.field_108146_b.func_103383_ay().func_108300_f():this.field_108146_b.func_103340_e(C_100650_jv.func_108910_c(this.field_108147_c.field_103221_t), C_100650_jv.func_108910_c(this.field_108147_c.field_103219_u), C_100650_jv.func_108910_c(this.field_108147_c.field_103217_v))));
   }

   public void func_108034_c() {
      this.field_108146_b.func_103383_ay().func_108294_a(this.field_108143_g, this.field_108145_e);
      this.field_108150_i = 0;
   }

   public void func_108029_d() {
      this.field_108147_c = null;
      this.field_108146_b.func_103383_ay().func_108299_g();
   }

   public void func_108031_e() {
      this.field_108146_b.func_103289_av().func_108861_a(this.field_108147_c, 30.0F, 30.0F);
      if((this.field_108142_f || this.field_108146_b.func_103292_az().func_108280_a(this.field_108147_c)) && --this.field_108150_i <= 0) {
         this.field_108150_i = 4 + this.field_108146_b.func_103312_aA().nextInt(7);
         this.field_108146_b.func_103383_ay().func_108295_a(this.field_108147_c, this.field_108145_e);
      }

      this.field_108144_d = Math.max(this.field_108144_d - 1, 0);
      double var1 = (double)(this.field_108146_b.field_103182_N * 2.0F * this.field_108146_b.field_103182_N * 2.0F);
      if(this.field_108146_b.func_103146_e(this.field_108147_c.field_103221_t, this.field_108147_c.field_103173_D.field_107915_b, this.field_108147_c.field_103217_v) <= var1) {
         if(this.field_108144_d <= 0) {
            this.field_108144_d = 20;
            if(this.field_108146_b.func_103328_bA() != null) {
               this.field_108146_b.func_103301_bE();
            }

            this.field_108146_b.func_103303_l(this.field_108147_c);
         }
      }
   }
}
