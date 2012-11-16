
public class C_100722_lj extends C_100730_lb {

   public int field_104597_a;
   public int field_104595_b = 0;
   public int field_104596_c;
   private int field_104593_d = 5;
   private int field_104594_e;
   private C_101095_qg field_104591_f;
   private int field_104592_g;


   public C_100722_lj(C_100873_xe var1, double var2, double var4, double var6, int var8) {
      super(var1);
      this.func_103161_a(0.5F, 0.5F);
      this.field_103181_M = this.field_103183_O / 2.0F;
      this.func_103163_b(var2, var4, var6);
      this.field_103236_z = (float)(Math.random() * 360.0D);
      this.field_103215_w = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
      this.field_103240_x = (double)((float)(Math.random() * 0.2D) * 2.0F);
      this.field_103238_y = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
      this.field_104594_e = var8;
   }

   protected boolean func_103092_f_() {
      return false;
   }

   public C_100722_lj(C_100873_xe var1) {
      super(var1);
      this.func_103161_a(0.25F, 0.25F);
      this.field_103181_M = this.field_103183_O / 2.0F;
   }

   protected void func_103141_a() {}

   public int func_103125_b(float var1) {
      float var2 = 0.5F;
      if(var2 < 0.0F) {
         var2 = 0.0F;
      }

      if(var2 > 1.0F) {
         var2 = 1.0F;
      }

      int var3 = super.func_103125_b(var1);
      int var4 = var3 & 255;
      int var5 = var3 >> 16 & 255;
      var4 += (int)(var2 * 15.0F * 16.0F);
      if(var4 > 240) {
         var4 = 240;
      }

      return var4 | var5 << 16;
   }

   public void func_103165_j_() {
      super.func_103165_j_();
      if(this.field_104596_c > 0) {
         --this.field_104596_c;
      }

      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      this.field_103240_x -= 0.029999999329447746D;
      if(this.field_103229_p.func_109350_f(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v)) == C_100664_afg.field_109020_i) {
         this.field_103240_x = 0.20000000298023224D;
         this.field_103215_w = (double)((this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F);
         this.field_103238_y = (double)((this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F);
         this.field_103229_p.func_109412_a(this, "random.fizz", 0.4F, 2.0F + this.field_103232_aa.nextFloat() * 0.4F);
      }

      this.func_103105_i(this.field_103221_t, (this.field_103173_D.field_107915_b + this.field_103173_D.field_107914_e) / 2.0D, this.field_103217_v);
      double var1 = 8.0D;
      if(this.field_104592_g < this.field_104597_a - 20 + this.field_103212_k % 100) {
         if(this.field_104591_f == null || this.field_104591_f.func_103082_e(this) > var1 * var1) {
            this.field_104591_f = this.field_103229_p.func_109503_a(this, var1);
         }

         this.field_104592_g = this.field_104597_a;
      }

      if(this.field_104591_f != null) {
         double var3 = (this.field_104591_f.field_103221_t - this.field_103221_t) / var1;
         double var5 = (this.field_104591_f.field_103219_u + (double)this.field_104591_f.func_103102_e() - this.field_103219_u) / var1;
         double var7 = (this.field_104591_f.field_103217_v - this.field_103217_v) / var1;
         double var9 = Math.sqrt(var3 * var3 + var5 * var5 + var7 * var7);
         double var11 = 1.0D - var9;
         if(var11 > 0.0D) {
            var11 *= var11;
            this.field_103215_w += var3 / var9 * var11 * 0.1D;
            this.field_103240_x += var5 / var9 * var11 * 0.1D;
            this.field_103238_y += var7 / var9 * var11 * 0.1D;
         }
      }

      this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
      float var13 = 0.98F;
      if(this.field_103174_E) {
         var13 = 0.58800006F;
         int var4 = this.field_103229_p.func_109349_a(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b) - 1, C_100650_jv.func_108910_c(this.field_103217_v));
         if(var4 > 0) {
            var13 = C_100451_alf.field_106118_p[var4].field_106145_cC * 0.98F;
         }
      }

      this.field_103215_w *= (double)var13;
      this.field_103240_x *= 0.9800000190734863D;
      this.field_103238_y *= (double)var13;
      if(this.field_103174_E) {
         this.field_103240_x *= -0.8999999761581421D;
      }

      ++this.field_104597_a;
      ++this.field_104595_b;
      if(this.field_104595_b >= 6000) {
         this.func_103121_x();
      }

   }

   public boolean func_103126_I() {
      return this.field_103229_p.func_109512_a(this.field_103173_D, C_100664_afg.field_109019_h, this);
   }

   protected void func_103059_d(int var1) {
      this.func_103085_a(C_100698_ks.field_109235_a, var1);
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      this.func_103065_K();
      this.field_104593_d -= var2;
      if(this.field_104593_d <= 0) {
         this.func_103121_x();
      }

      return false;
   }

   public void func_103078_b(C_100353_bh var1) {
      var1.func_107532_a("Health", (short)((byte)this.field_104593_d));
      var1.func_107532_a("Age", (short)this.field_104595_b);
      var1.func_107532_a("Value", (short)this.field_104594_e);
   }

   public void func_103110_a(C_100353_bh var1) {
      this.field_104593_d = var1.func_107517_d("Health") & 255;
      this.field_104595_b = var1.func_107517_d("Age");
      this.field_104594_e = var1.func_107517_d("Value");
   }

   public void func_103096_b_(C_101095_qg var1) {
      if(!this.field_103229_p.field_109557_J) {
         if(this.field_104596_c == 0 && var1.field_103846_bU == 0) {
            var1.field_103846_bU = 2;
            this.field_103229_p.func_109412_a(this, "random.orb", 0.1F, 0.5F * ((this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.7F + 1.8F));
            var1.func_103397_a(this, 1);
            var1.func_103777_t(this.field_104594_e);
            this.func_103121_x();
         }

      }
   }

   public int func_104590_c() {
      return this.field_104594_e;
   }

   public int func_104588_d() {
      return this.field_104594_e >= 2477?10:(this.field_104594_e >= 1237?9:(this.field_104594_e >= 617?8:(this.field_104594_e >= 307?7:(this.field_104594_e >= 149?6:(this.field_104594_e >= 73?5:(this.field_104594_e >= 37?4:(this.field_104594_e >= 17?3:(this.field_104594_e >= 7?2:(this.field_104594_e >= 3?1:0)))))))));
   }

   public static int func_104589_a(int var0) {
      return var0 >= 2477?2477:(var0 >= 1237?1237:(var0 >= 617?617:(var0 >= 307?307:(var0 >= 149?149:(var0 >= 73?73:(var0 >= 37?37:(var0 >= 17?17:(var0 >= 7?7:(var0 >= 3?3:1)))))))));
   }

   public boolean func_103099_aq() {
      return false;
   }
}
