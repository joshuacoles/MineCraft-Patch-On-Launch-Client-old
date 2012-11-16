
public class C_100417_ami extends C_100398_amm {

   public byte field_102993_a = 0;
   public boolean field_102992_b = false;


   public void func_102915_b(C_100353_bh var1) {
      super.func_102915_b(var1);
      var1.func_107527_a("note", this.field_102993_a);
   }

   public void func_102925_a(C_100353_bh var1) {
      super.func_102925_a(var1);
      this.field_102993_a = var1.func_107524_c("note");
      if(this.field_102993_a < 0) {
         this.field_102993_a = 0;
      }

      if(this.field_102993_a > 24) {
         this.field_102993_a = 24;
      }

   }

   public void func_102990_a() {
      this.field_102993_a = (byte)((this.field_102993_a + 1) % 25);
      this.func_102922_d();
   }

   public void func_102991_a(C_100873_xe var1, int var2, int var3, int var4) {
      if(var1.func_109350_f(var2, var3 + 1, var4) == C_100664_afg.field_109012_a) {
         C_100664_afg var5 = var1.func_109350_f(var2, var3 - 1, var4);
         byte var6 = 0;
         if(var5 == C_100664_afg.field_109009_e) {
            var6 = 1;
         }

         if(var5 == C_100664_afg.field_109028_p) {
            var6 = 2;
         }

         if(var5 == C_100664_afg.field_109026_r) {
            var6 = 3;
         }

         if(var5 == C_100664_afg.field_109008_d) {
            var6 = 4;
         }

         var1.func_109467_c(var2, var3, var4, C_100451_alf.field_106086_U.field_106162_cm, var6, this.field_102993_a);
      }
   }
}
