
public class C_100626_mt extends C_100621_mm {

   private C_101098_qd field_108135_b;
   private C_101098_qd field_108136_c;
   private C_100873_xe field_108133_d;
   private int field_108134_e = 0;
   C_100531_ob field_108137_a;


   public C_100626_mt(C_101098_qd var1) {
      this.field_108135_b = var1;
      this.field_108133_d = var1.field_103229_p;
      this.func_108030_a(3);
   }

   public boolean func_108033_a() {
      if(this.field_108135_b.func_103520_b() != 0) {
         return false;
      } else if(this.field_108135_b.func_103312_aA().nextInt(500) != 0) {
         return false;
      } else {
         this.field_108137_a = this.field_108133_d.field_109550_C.func_107279_a(C_100650_jv.func_108910_c(this.field_108135_b.field_103221_t), C_100650_jv.func_108910_c(this.field_108135_b.field_103219_u), C_100650_jv.func_108910_c(this.field_108135_b.field_103217_v), 0);
         if(this.field_108137_a == null) {
            return false;
         } else if(!this.func_108132_f()) {
            return false;
         } else {
            C_100730_lb var1 = this.field_108133_d.func_109406_a(C_101098_qd.class, this.field_108135_b.field_103173_D.func_107895_b(8.0D, 3.0D, 8.0D), this.field_108135_b);
            if(var1 == null) {
               return false;
            } else {
               this.field_108136_c = (C_101098_qd)var1;
               return this.field_108136_c.func_103520_b() == 0;
            }
         }
      }
   }

   public void func_108034_c() {
      this.field_108134_e = 300;
      this.field_108135_b.func_103589_f(true);
   }

   public void func_108029_d() {
      this.field_108137_a = null;
      this.field_108136_c = null;
      this.field_108135_b.func_103589_f(false);
   }

   public boolean func_108036_b() {
      return this.field_108134_e >= 0 && this.func_108132_f() && this.field_108135_b.func_103520_b() == 0;
   }

   public void func_108031_e() {
      --this.field_108134_e;
      this.field_108135_b.func_103289_av().func_108861_a(this.field_108136_c, 10.0F, 30.0F);
      if(this.field_108135_b.func_103082_e(this.field_108136_c) > 2.25D) {
         this.field_108135_b.func_103383_ay().func_108295_a(this.field_108136_c, 0.25F);
      } else if(this.field_108134_e == 0 && this.field_108136_c.func_103600_n()) {
         this.func_108131_g();
      }

      if(this.field_108135_b.func_103312_aA().nextInt(35) == 0) {
         this.field_108133_d.func_109464_a(this.field_108135_b, (byte)12);
      }

   }

   private boolean func_108132_f() {
      if(!this.field_108137_a.func_108613_i()) {
         return false;
      } else {
         int var1 = (int)((double)((float)this.field_108137_a.func_108626_c()) * 0.35D);
         return this.field_108137_a.func_108621_e() < var1;
      }
   }

   private void func_108131_g() {
      C_101098_qd var1 = new C_101098_qd(this.field_108133_d);
      this.field_108136_c.func_103519_a(6000);
      this.field_108135_b.func_103519_a(6000);
      var1.func_103519_a(-24000);
      var1.func_103601_r(this.field_108135_b.func_103312_aA().nextInt(5));
      var1.func_103055_b(this.field_108135_b.field_103221_t, this.field_108135_b.field_103219_u, this.field_108135_b.field_103217_v, 0.0F, 0.0F);
      this.field_108133_d.func_109513_d(var1);
      this.field_108133_d.func_109464_a(var1, (byte)12);
   }
}
