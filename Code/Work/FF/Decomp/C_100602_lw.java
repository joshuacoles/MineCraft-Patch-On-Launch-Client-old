
public class C_100602_lw {

   private C_100595_ln field_108825_a;
   private int field_108823_b = 0;
   private float field_108824_c = 0.0F;


   public C_100602_lw(C_100595_ln var1) {
      this.field_108825_a = var1;
   }

   public void func_108821_a() {
      double var1 = this.field_108825_a.field_103221_t - this.field_108825_a.field_103227_q;
      double var3 = this.field_108825_a.field_103217_v - this.field_108825_a.field_103223_s;
      if(var1 * var1 + var3 * var3 > 2.500000277905201E-7D) {
         this.field_108825_a.field_103469_aw = this.field_108825_a.field_103236_z;
         this.field_108825_a.field_103455_ay = this.func_108822_a(this.field_108825_a.field_103469_aw, this.field_108825_a.field_103455_ay, 75.0F);
         this.field_108824_c = this.field_108825_a.field_103455_ay;
         this.field_108823_b = 0;
      } else {
         float var5 = 75.0F;
         if(Math.abs(this.field_108825_a.field_103455_ay - this.field_108824_c) > 15.0F) {
            this.field_108823_b = 0;
            this.field_108824_c = this.field_108825_a.field_103455_ay;
         } else {
            ++this.field_108823_b;
            if(this.field_108823_b > 10) {
               var5 = Math.max(1.0F - (float)(this.field_108823_b - 10) / 10.0F, 0.0F) * 75.0F;
            }
         }

         this.field_108825_a.field_103469_aw = this.func_108822_a(this.field_108825_a.field_103455_ay, this.field_108825_a.field_103469_aw, var5);
      }
   }

   private float func_108822_a(float var1, float var2, float var3) {
      float var4 = C_100650_jv.func_108920_g(var1 - var2);
      if(var4 < -var3) {
         var4 = -var3;
      }

      if(var4 >= var3) {
         var4 = var3;
      }

      return var1 - var4;
   }
}
