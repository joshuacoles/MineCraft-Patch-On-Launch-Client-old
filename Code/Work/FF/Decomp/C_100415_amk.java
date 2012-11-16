
public class C_100415_amk extends C_100398_amm {

   private int field_102971_a;
   private int field_102969_b;
   private String field_102970_c = "";


   public void func_102915_b(C_100353_bh var1) {
      super.func_102915_b(var1);
      var1.func_107527_a("SkullType", (byte)(this.field_102971_a & 255));
      var1.func_107527_a("Rot", (byte)(this.field_102969_b & 255));
      var1.func_107533_a("ExtraType", this.field_102970_c);
   }

   public void func_102925_a(C_100353_bh var1) {
      super.func_102925_a(var1);
      this.field_102971_a = var1.func_107524_c("SkullType");
      this.field_102969_b = var1.func_107524_c("Rot");
      if(var1.func_107516_b("ExtraType")) {
         this.field_102970_c = var1.func_107534_i("ExtraType");
      }

   }

   public C_100219_dx func_102924_l() {
      C_100353_bh var1 = new C_100353_bh();
      this.func_102915_b(var1);
      return new C_100271_ey(this.field_102938_l, this.field_102939_m, this.field_102936_n, 4, var1);
   }

   public void func_102966_a(int var1, String var2) {
      this.field_102971_a = var1;
      this.field_102970_c = var2;
   }

   public int func_102965_a() {
      return this.field_102971_a;
   }

   public int func_102967_b() {
      return this.field_102969_b;
   }

   public void func_102964_a(int var1) {
      this.field_102969_b = var1;
   }

   public String func_102968_c() {
      return this.field_102970_c;
   }
}
