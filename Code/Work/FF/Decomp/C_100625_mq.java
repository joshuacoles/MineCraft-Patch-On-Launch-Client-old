
public class C_100625_mq extends C_100621_mm {

   C_100595_ln field_108130_a;
   C_100595_ln field_108128_b;
   float field_108129_c;


   public C_100625_mq(C_100595_ln var1, float var2) {
      this.field_108130_a = var1;
      this.field_108129_c = var2;
      this.func_108030_a(5);
   }

   public boolean func_108033_a() {
      this.field_108128_b = this.field_108130_a.func_103335_aF();
      if(this.field_108128_b == null) {
         return false;
      } else {
         double var1 = this.field_108130_a.func_103082_e(this.field_108128_b);
         return var1 >= 4.0D && var1 <= 16.0D?(!this.field_108130_a.field_103174_E?false:this.field_108130_a.func_103312_aA().nextInt(5) == 0):false;
      }
   }

   public boolean func_108036_b() {
      return !this.field_108130_a.field_103174_E;
   }

   public void func_108034_c() {
      double var1 = this.field_108128_b.field_103221_t - this.field_108130_a.field_103221_t;
      double var3 = this.field_108128_b.field_103217_v - this.field_108130_a.field_103217_v;
      float var5 = C_100650_jv.func_108915_a(var1 * var1 + var3 * var3);
      this.field_108130_a.field_103215_w += var1 / (double)var5 * 0.5D * 0.800000011920929D + this.field_108130_a.field_103215_w * 0.20000000298023224D;
      this.field_108130_a.field_103238_y += var3 / (double)var5 * 0.5D * 0.800000011920929D + this.field_108130_a.field_103238_y * 0.20000000298023224D;
      this.field_108130_a.field_103240_x = (double)this.field_108129_c;
   }
}
