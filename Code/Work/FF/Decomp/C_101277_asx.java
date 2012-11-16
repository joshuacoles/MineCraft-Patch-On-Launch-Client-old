
public class C_101277_asx {

   private int field_112370_a;
   private int field_112368_b;
   private double field_112369_c;
   private double field_112366_d;
   private int field_112367_e;


   public C_101277_asx(C_101125_ard var1, int var2, int var3) {
      this.field_112370_a = var2;
      this.field_112368_b = var3;
      this.field_112367_e = 1;
      int var4 = var1.field_111744_ad;
      if(var4 == 0) {
         var4 = 1000;
      }

      while(this.field_112367_e < var4 && this.field_112370_a / (this.field_112367_e + 1) >= 320 && this.field_112368_b / (this.field_112367_e + 1) >= 240) {
         ++this.field_112367_e;
      }

      this.field_112369_c = (double)this.field_112370_a / (double)this.field_112367_e;
      this.field_112366_d = (double)this.field_112368_b / (double)this.field_112367_e;
      this.field_112370_a = C_100650_jv.func_108934_f(this.field_112369_c);
      this.field_112368_b = C_100650_jv.func_108934_f(this.field_112366_d);
   }

   public int func_112363_a() {
      return this.field_112370_a;
   }

   public int func_112365_b() {
      return this.field_112368_b;
   }

   public double func_112364_c() {
      return this.field_112369_c;
   }

   public double func_112361_d() {
      return this.field_112366_d;
   }

   public int func_112362_e() {
      return this.field_112367_e;
   }
}
