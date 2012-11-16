
public class C_100928_axt extends C_100988_axw {

   private int field_104639_a = 0;
   private int field_104640_aw = 0;


   public C_100928_axt(C_100873_xe var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.field_104640_aw = 8;
   }

   public void func_104606_a(C_100872_azb var1, float var2, float var3, float var4, float var5, float var6, float var7) {}

   public void func_103165_j_() {
      for(int var1 = 0; var1 < 6; ++var1) {
         double var2 = this.field_103221_t + (this.field_103232_aa.nextDouble() - this.field_103232_aa.nextDouble()) * 4.0D;
         double var4 = this.field_103219_u + (this.field_103232_aa.nextDouble() - this.field_103232_aa.nextDouble()) * 4.0D;
         double var6 = this.field_103217_v + (this.field_103232_aa.nextDouble() - this.field_103232_aa.nextDouble()) * 4.0D;
         this.field_103229_p.func_109428_a("largeexplode", var2, var4, var6, (double)((float)this.field_104639_a / (float)this.field_104640_aw), 0.0D, 0.0D);
      }

      ++this.field_104639_a;
      if(this.field_104639_a == this.field_104640_aw) {
         this.func_103121_x();
      }

   }

   public int func_104602_b() {
      return 1;
   }
}
