
public class C_100639_nf extends C_100621_mm {

   private C_100595_ln field_108201_a;
   private double field_108199_b;
   private double field_108200_c;
   private int field_108198_d = 0;


   public C_100639_nf(C_100595_ln var1) {
      this.field_108201_a = var1;
      this.func_108030_a(3);
   }

   public boolean func_108033_a() {
      return this.field_108201_a.func_103312_aA().nextFloat() < 0.02F;
   }

   public boolean func_108036_b() {
      return this.field_108198_d >= 0;
   }

   public void func_108034_c() {
      double var1 = 6.283185307179586D * this.field_108201_a.func_103312_aA().nextDouble();
      this.field_108199_b = Math.cos(var1);
      this.field_108200_c = Math.sin(var1);
      this.field_108198_d = 20 + this.field_108201_a.func_103312_aA().nextInt(20);
   }

   public void func_108031_e() {
      --this.field_108198_d;
      this.field_108201_a.func_103289_av().func_108860_a(this.field_108201_a.field_103221_t + this.field_108199_b, this.field_108201_a.field_103219_u + (double)this.field_108201_a.func_103102_e(), this.field_108201_a.field_103217_v + this.field_108200_c, 10.0F, (float)this.field_108201_a.func_103290_bm());
   }
}
