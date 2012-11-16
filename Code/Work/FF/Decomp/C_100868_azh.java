
public class C_100868_azh implements C_100865_azf {

   private C_100838_azi field_110292_a = C_100867_azg.func_110106_a();
   private double field_110290_b;
   private double field_110291_c;
   private double field_110289_d;


   public void func_110287_a(double var1, double var3, double var5) {
      this.field_110290_b = var1;
      this.field_110291_c = var3;
      this.field_110289_d = var5;
   }

   public boolean func_110288_b(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.field_110292_a.func_110101_b(var1 - this.field_110290_b, var3 - this.field_110291_c, var5 - this.field_110289_d, var7 - this.field_110290_b, var9 - this.field_110291_c, var11 - this.field_110289_d);
   }

   public boolean func_110286_a(C_100412_amr var1) {
      return this.func_110288_b(var1.field_107917_a, var1.field_107915_b, var1.field_107916_c, var1.field_107913_d, var1.field_107914_e, var1.field_107911_f);
   }
}
