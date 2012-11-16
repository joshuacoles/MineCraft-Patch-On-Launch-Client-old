
public class C_100830_azn extends C_100056_bal {

   private int field_105467_a;


   public C_100830_azn() {
      super(new C_101220_auy(), 0.5F);
      this.field_105467_a = ((C_101220_auy)this.field_105380_i).func_112055_a();
   }

   public void func_105466_a(C_100592_pj var1, double var2, double var4, double var6, float var8, float var9) {
      int var10 = ((C_101220_auy)this.field_105380_i).func_112055_a();
      if(var10 != this.field_105467_a) {
         this.field_105467_a = var10;
         this.field_105380_i = new C_101220_auy();
      }

      super.func_105378_a(var1, var2, var4, var6, var8, var9);
   }
}
