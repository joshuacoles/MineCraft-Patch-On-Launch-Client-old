
public class C_100680_kc {

   private float field_109127_a;
   private float field_109125_b;
   private float field_109126_c;


   public float func_109124_a(float var1, float var2) {
      this.field_109127_a += var1;
      var1 = (this.field_109127_a - this.field_109125_b) * var2;
      this.field_109126_c += (var1 - this.field_109126_c) * 0.5F;
      if(var1 > 0.0F && var1 > this.field_109126_c || var1 < 0.0F && var1 < this.field_109126_c) {
         var1 = this.field_109126_c;
      }

      this.field_109125_b += var1;
      return var1;
   }
}
