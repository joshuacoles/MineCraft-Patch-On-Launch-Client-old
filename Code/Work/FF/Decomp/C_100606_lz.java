
public class C_100606_lz {

   private C_100595_ln field_108869_a;
   private float field_108867_b;
   private float field_108868_c;
   private boolean field_108865_d = false;
   private double field_108866_e;
   private double field_108863_f;
   private double field_108864_g;


   public C_100606_lz(C_100595_ln var1) {
      this.field_108869_a = var1;
   }

   public void func_108861_a(C_100730_lb var1, float var2, float var3) {
      this.field_108866_e = var1.field_103221_t;
      if(var1 instanceof C_100595_ln) {
         this.field_108863_f = var1.field_103219_u + (double)var1.func_103102_e();
      } else {
         this.field_108863_f = (var1.field_103173_D.field_107915_b + var1.field_103173_D.field_107914_e) / 2.0D;
      }

      this.field_108864_g = var1.field_103217_v;
      this.field_108867_b = var2;
      this.field_108868_c = var3;
      this.field_108865_d = true;
   }

   public void func_108860_a(double var1, double var3, double var5, float var7, float var8) {
      this.field_108866_e = var1;
      this.field_108863_f = var3;
      this.field_108864_g = var5;
      this.field_108867_b = var7;
      this.field_108868_c = var8;
      this.field_108865_d = true;
   }

   public void func_108859_a() {
      this.field_108869_a.field_103177_A = 0.0F;
      if(this.field_108865_d) {
         this.field_108865_d = false;
         double var1 = this.field_108866_e - this.field_108869_a.field_103221_t;
         double var3 = this.field_108863_f - (this.field_108869_a.field_103219_u + (double)this.field_108869_a.func_103102_e());
         double var5 = this.field_108864_g - this.field_108869_a.field_103217_v;
         double var7 = (double)C_100650_jv.func_108915_a(var1 * var1 + var5 * var5);
         float var9 = (float)(Math.atan2(var5, var1) * 180.0D / 3.1415927410125732D) - 90.0F;
         float var10 = (float)(-(Math.atan2(var3, var7) * 180.0D / 3.1415927410125732D));
         this.field_108869_a.field_103177_A = this.func_108862_a(this.field_108869_a.field_103177_A, var10, this.field_108868_c);
         this.field_108869_a.field_103455_ay = this.func_108862_a(this.field_108869_a.field_103455_ay, var9, this.field_108867_b);
      } else {
         this.field_108869_a.field_103455_ay = this.func_108862_a(this.field_108869_a.field_103455_ay, this.field_108869_a.field_103469_aw, 10.0F);
      }

      float var11 = C_100650_jv.func_108920_g(this.field_108869_a.field_103455_ay - this.field_108869_a.field_103469_aw);
      if(!this.field_108869_a.func_103383_ay().func_108300_f()) {
         if(var11 < -75.0F) {
            this.field_108869_a.field_103455_ay = this.field_108869_a.field_103469_aw - 75.0F;
         }

         if(var11 > 75.0F) {
            this.field_108869_a.field_103455_ay = this.field_108869_a.field_103469_aw + 75.0F;
         }
      }

   }

   private float func_108862_a(float var1, float var2, float var3) {
      float var4 = C_100650_jv.func_108920_g(var2 - var1);
      if(var4 > var3) {
         var4 = var3;
      }

      if(var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }
}
