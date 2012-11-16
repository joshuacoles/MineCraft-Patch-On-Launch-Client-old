
public class C_100610_ma {

   private C_100595_ln field_108884_a;
   private double field_108882_b;
   private double field_108883_c;
   private double field_108880_d;
   private float field_108881_e;
   private boolean field_108879_f = false;


   public C_100610_ma(C_100595_ln var1) {
      this.field_108884_a = var1;
      this.field_108882_b = var1.field_103221_t;
      this.field_108883_c = var1.field_103219_u;
      this.field_108880_d = var1.field_103217_v;
   }

   public boolean func_108876_a() {
      return this.field_108879_f;
   }

   public float func_108874_b() {
      return this.field_108881_e;
   }

   public void func_108878_a(double var1, double var3, double var5, float var7) {
      this.field_108882_b = var1;
      this.field_108883_c = var3;
      this.field_108880_d = var5;
      this.field_108881_e = var7;
      this.field_108879_f = true;
   }

   public void func_108877_c() {
      this.field_108884_a.func_103362_f(0.0F);
      if(this.field_108879_f) {
         this.field_108879_f = false;
         int var1 = C_100650_jv.func_108910_c(this.field_108884_a.field_103173_D.field_107915_b + 0.5D);
         double var2 = this.field_108882_b - this.field_108884_a.field_103221_t;
         double var4 = this.field_108880_d - this.field_108884_a.field_103217_v;
         double var6 = this.field_108883_c - (double)var1;
         double var8 = var2 * var2 + var6 * var6 + var4 * var4;
         if(var8 >= 2.500000277905201E-7D) {
            float var10 = (float)(Math.atan2(var4, var2) * 180.0D / 3.1415927410125732D) - 90.0F;
            this.field_108884_a.field_103236_z = this.func_108875_a(this.field_108884_a.field_103236_z, var10, 30.0F);
            this.field_108884_a.func_103365_e(this.field_108881_e * this.field_108884_a.func_103353_by());
            if(var6 > 0.0D && var2 * var2 + var4 * var4 < 1.0D) {
               this.field_108884_a.func_103293_ax().func_108870_a();
            }

         }
      }
   }

   private float func_108875_a(float var1, float var2, float var3) {
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
