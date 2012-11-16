
public class C_100624_mr extends C_100621_mm {

   private C_100595_ln field_108124_b;
   protected C_100730_lb field_108126_a;
   private float field_108125_c;
   private int field_108122_d;
   private float field_108123_e;
   private Class field_108121_f;


   public C_100624_mr(C_100595_ln var1, Class var2, float var3) {
      this.field_108124_b = var1;
      this.field_108121_f = var2;
      this.field_108125_c = var3;
      this.field_108123_e = 0.02F;
      this.func_108030_a(2);
   }

   public C_100624_mr(C_100595_ln var1, Class var2, float var3, float var4) {
      this.field_108124_b = var1;
      this.field_108121_f = var2;
      this.field_108125_c = var3;
      this.field_108123_e = var4;
      this.func_108030_a(2);
   }

   public boolean func_108033_a() {
      if(this.field_108124_b.func_103312_aA().nextFloat() >= this.field_108123_e) {
         return false;
      } else {
         if(this.field_108121_f == C_101095_qg.class) {
            this.field_108126_a = this.field_108124_b.field_103229_p.func_109503_a(this.field_108124_b, (double)this.field_108125_c);
         } else {
            this.field_108126_a = this.field_108124_b.field_103229_p.func_109406_a(this.field_108121_f, this.field_108124_b.field_103173_D.func_107895_b((double)this.field_108125_c, 3.0D, (double)this.field_108125_c), this.field_108124_b);
         }

         return this.field_108126_a != null;
      }
   }

   public boolean func_108036_b() {
      return !this.field_108126_a.func_103143_S()?false:(this.field_108124_b.func_103082_e(this.field_108126_a) > (double)(this.field_108125_c * this.field_108125_c)?false:this.field_108122_d > 0);
   }

   public void func_108034_c() {
      this.field_108122_d = 40 + this.field_108124_b.func_103312_aA().nextInt(40);
   }

   public void func_108029_d() {
      this.field_108126_a = null;
   }

   public void func_108031_e() {
      this.field_108124_b.func_103289_av().func_108860_a(this.field_108126_a.field_103221_t, this.field_108126_a.field_103219_u + (double)this.field_108126_a.func_103102_e(), this.field_108126_a.field_103217_v, 10.0F, (float)this.field_108124_b.func_103290_bm());
      --this.field_108122_d;
   }
}
