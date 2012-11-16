
public class C_100632_mz extends C_100621_mm {

   C_100873_xe field_108168_a;
   C_100595_ln field_108166_b;
   C_100595_ln field_108167_c;
   int field_108165_d = 0;


   public C_100632_mz(C_100595_ln var1) {
      this.field_108166_b = var1;
      this.field_108168_a = var1.field_103229_p;
      this.func_108030_a(3);
   }

   public boolean func_108033_a() {
      C_100595_ln var1 = this.field_108166_b.func_103335_aF();
      if(var1 == null) {
         return false;
      } else {
         this.field_108167_c = var1;
         return true;
      }
   }

   public boolean func_108036_b() {
      return !this.field_108167_c.func_103143_S()?false:(this.field_108166_b.func_103082_e(this.field_108167_c) > 225.0D?false:!this.field_108166_b.func_103383_ay().func_108300_f() || this.func_108033_a());
   }

   public void func_108029_d() {
      this.field_108167_c = null;
      this.field_108166_b.func_103383_ay().func_108299_g();
   }

   public void func_108031_e() {
      this.field_108166_b.func_103289_av().func_108861_a(this.field_108167_c, 30.0F, 30.0F);
      double var1 = (double)(this.field_108166_b.field_103182_N * 2.0F * this.field_108166_b.field_103182_N * 2.0F);
      double var3 = this.field_108166_b.func_103146_e(this.field_108167_c.field_103221_t, this.field_108167_c.field_103173_D.field_107915_b, this.field_108167_c.field_103217_v);
      float var5 = 0.23F;
      if(var3 > var1 && var3 < 16.0D) {
         var5 = 0.4F;
      } else if(var3 < 225.0D) {
         var5 = 0.18F;
      }

      this.field_108166_b.func_103383_ay().func_108295_a(this.field_108167_c, var5);
      this.field_108165_d = Math.max(this.field_108165_d - 1, 0);
      if(var3 <= var1) {
         if(this.field_108165_d <= 0) {
            this.field_108165_d = 20;
            this.field_108166_b.func_103303_l(this.field_108167_c);
         }
      }
   }
}
