
public class C_101093_qe {

   public boolean field_111601_a = false;
   public boolean field_111599_b = false;
   public boolean field_111600_c = false;
   public boolean field_111597_d = false;
   public boolean field_111598_e = true;
   private float field_111595_f = 0.05F;
   private float field_111596_g = 0.1F;


   public void func_111589_a(C_100353_bh var1) {
      C_100353_bh var2 = new C_100353_bh();
      var2.func_107509_a("invulnerable", this.field_111601_a);
      var2.func_107509_a("flying", this.field_111599_b);
      var2.func_107509_a("mayfly", this.field_111600_c);
      var2.func_107509_a("instabuild", this.field_111597_d);
      var2.func_107509_a("mayBuild", this.field_111598_e);
      var2.func_107529_a("flySpeed", this.field_111595_f);
      var2.func_107529_a("walkSpeed", this.field_111596_g);
      var1.func_107530_a("abilities", var2);
   }

   public void func_111594_b(C_100353_bh var1) {
      if(var1.func_107516_b("abilities")) {
         C_100353_bh var2 = var1.func_107521_l("abilities");
         this.field_111601_a = var2.func_107519_n("invulnerable");
         this.field_111599_b = var2.func_107519_n("flying");
         this.field_111600_c = var2.func_107519_n("mayfly");
         this.field_111597_d = var2.func_107519_n("instabuild");
         if(var2.func_107516_b("flySpeed")) {
            this.field_111595_f = var2.func_107512_g("flySpeed");
            this.field_111596_g = var2.func_107512_g("walkSpeed");
         }

         if(var2.func_107516_b("mayBuild")) {
            this.field_111598_e = var2.func_107519_n("mayBuild");
         }
      }

   }

   public float func_111591_a() {
      return this.field_111595_f;
   }

   public void func_111590_a(float var1) {
      this.field_111595_f = var1;
   }

   public float func_111592_b() {
      return this.field_111596_g;
   }

   public void func_111593_b(float var1) {
      this.field_111596_g = var1;
   }
}
