
public class C_100616_mk extends C_100621_mm {

   private C_100603_lv field_108102_d;
   private C_100595_ln field_108103_e;
   C_100873_xe field_108106_a;
   private float field_108100_f;
   private C_100515_nx field_108101_g;
   private int field_108107_h;
   float field_108104_b;
   float field_108105_c;
   private boolean field_108108_i;


   public C_100616_mk(C_100603_lv var1, float var2, float var3, float var4) {
      this.field_108102_d = var1;
      this.field_108106_a = var1.field_103229_p;
      this.field_108100_f = var2;
      this.field_108101_g = var1.func_103383_ay();
      this.field_108105_c = var3;
      this.field_108104_b = var4;
      this.func_108030_a(3);
   }

   public boolean func_108033_a() {
      C_100595_ln var1 = this.field_108102_d.func_103554_p();
      if(var1 == null) {
         return false;
      } else if(this.field_108102_d.func_103553_n()) {
         return false;
      } else if(this.field_108102_d.func_103082_e(var1) < (double)(this.field_108105_c * this.field_108105_c)) {
         return false;
      } else {
         this.field_108103_e = var1;
         return true;
      }
   }

   public boolean func_108036_b() {
      return !this.field_108101_g.func_108300_f() && this.field_108102_d.func_103082_e(this.field_108103_e) > (double)(this.field_108104_b * this.field_108104_b) && !this.field_108102_d.func_103553_n();
   }

   public void func_108034_c() {
      this.field_108107_h = 0;
      this.field_108108_i = this.field_108102_d.func_103383_ay().func_108287_a();
      this.field_108102_d.func_103383_ay().func_108291_a(false);
   }

   public void func_108029_d() {
      this.field_108103_e = null;
      this.field_108101_g.func_108299_g();
      this.field_108102_d.func_103383_ay().func_108291_a(this.field_108108_i);
   }

   public void func_108031_e() {
      this.field_108102_d.func_103289_av().func_108861_a(this.field_108103_e, 10.0F, (float)this.field_108102_d.func_103290_bm());
      if(!this.field_108102_d.func_103553_n()) {
         if(--this.field_108107_h <= 0) {
            this.field_108107_h = 10;
            if(!this.field_108101_g.func_108295_a(this.field_108103_e, this.field_108100_f)) {
               if(this.field_108102_d.func_103082_e(this.field_108103_e) >= 144.0D) {
                  int var1 = C_100650_jv.func_108910_c(this.field_108103_e.field_103221_t) - 2;
                  int var2 = C_100650_jv.func_108910_c(this.field_108103_e.field_103217_v) - 2;
                  int var3 = C_100650_jv.func_108910_c(this.field_108103_e.field_103173_D.field_107915_b);

                  for(int var4 = 0; var4 <= 4; ++var4) {
                     for(int var5 = 0; var5 <= 4; ++var5) {
                        if((var4 < 1 || var5 < 1 || var4 > 3 || var5 > 3) && this.field_108106_a.func_109348_t(var1 + var4, var3 - 1, var2 + var5) && !this.field_108106_a.func_109360_s(var1 + var4, var3, var2 + var5) && !this.field_108106_a.func_109360_s(var1 + var4, var3 + 1, var2 + var5)) {
                           this.field_108102_d.func_103055_b((double)((float)(var1 + var4) + 0.5F), (double)var3, (double)((float)(var2 + var5) + 0.5F), this.field_108102_d.field_103236_z, this.field_108102_d.field_103177_A);
                           this.field_108101_g.func_108299_g();
                           return;
                        }
                     }
                  }

               }
            }
         }
      }
   }
}
