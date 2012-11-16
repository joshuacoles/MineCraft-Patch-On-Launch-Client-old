
public abstract class C_100694_ky extends C_100598_ls {

   public C_100694_ky(C_100873_xe var1) {
      super(var1);
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(12, new Integer(0));
   }

   public int func_103520_b() {
      return this.field_103234_ag.func_108837_c(12);
   }

   public void func_103519_a(int var1) {
      this.field_103234_ag.func_108851_b(12, Integer.valueOf(var1));
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107520_a("Age", this.func_103520_b());
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.func_103519_a(var1.func_107514_e("Age"));
   }

   public void func_103313_c() {
      super.func_103313_c();
      int var1 = this.func_103520_b();
      if(var1 < 0) {
         ++var1;
         this.func_103519_a(var1);
      } else if(var1 > 0) {
         --var1;
         this.func_103519_a(var1);
      }

   }

   public boolean func_103357_h_() {
      return this.func_103520_b() < 0;
   }
}
