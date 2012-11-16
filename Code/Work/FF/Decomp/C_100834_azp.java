
public class C_100834_azp extends C_100056_bal {

   public C_100834_azp(C_101231_avl var1, float var2) {
      super(var1, var2);
   }

   public void func_105473_a(C_100540_oi var1, double var2, double var4, double var6, float var8, float var9) {
      super.func_105378_a(var1, var2, var4, var6, var8, var9);
   }

   protected float func_105474_a(C_100540_oi var1, float var2) {
      float var3 = var1.field_103538_h + (var1.field_103536_e - var1.field_103538_h) * var2;
      float var4 = var1.field_103534_g + (var1.field_103533_f - var1.field_103534_g) * var2;
      return (C_100650_jv.func_108924_a(var3) + 1.0F) * var4;
   }

   // $FF: synthetic method
   protected float func_105374_b(C_100595_ln var1, float var2) {
      return this.func_105474_a((C_100540_oi)var1, var2);
   }
}
