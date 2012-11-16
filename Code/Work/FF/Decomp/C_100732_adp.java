import java.util.Random;

class C_100732_adp extends C_100769_ady {

   private C_100732_adp() {}

   public void func_109324_a(Random var1, int var2, int var3, int var4, boolean var5) {
      if(var5) {
         this.field_109328_a = C_100451_alf.field_106135_bp.field_106162_cm;
         float var6 = var1.nextFloat();
         if(var6 < 0.2F) {
            this.field_109327_b = 2;
         } else if(var6 < 0.5F) {
            this.field_109327_b = 1;
         } else if(var6 < 0.55F) {
            this.field_109328_a = C_100451_alf.field_106134_bo.field_106162_cm;
            this.field_109327_b = 2;
         } else {
            this.field_109327_b = 0;
         }
      } else {
         this.field_109328_a = 0;
         this.field_109327_b = 0;
      }

   }

   // $FF: synthetic method
   C_100732_adp(C_100751_adc var1) {
      this();
   }
}
