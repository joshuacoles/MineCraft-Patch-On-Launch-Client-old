import java.util.Stack;

final class C_101163_aop implements C_101198_apw {

   private final Stack field_111862_a = new Stack();
   private C_101173_aov field_111861_b;


   C_101193_apr func_111858_a() {
      return (C_101193_apr)this.field_111861_b.func_107381_b();
   }

   public void func_111855_b() {}

   public void func_111856_c() {}

   public void func_111851_d() {
      C_100317_aom var1 = C_101174_aow.func_111882_e();
      this.func_111859_a(var1);
      this.field_111862_a.push(new C_101164_aoq(this, var1));
   }

   public void func_111854_e() {
      this.field_111862_a.pop();
   }

   public void func_111850_f() {
      C_101191_app var1 = C_101174_aow.func_111878_d();
      this.func_111859_a(var1);
      this.field_111862_a.push(new C_101169_aor(this, var1));
   }

   public void func_111852_g() {
      this.field_111862_a.pop();
   }

   public void func_111847_a(String var1) {
      C_101166_aoo var2 = C_101166_aoo.func_111875_a().func_111872_a(C_101174_aow.func_111883_b(var1));
      ((C_101167_aot)this.field_111862_a.peek()).func_111863_a(var2);
      this.field_111862_a.push(new C_101170_aos(this, var2));
   }

   public void func_111857_h() {
      this.field_111862_a.pop();
   }

   public void func_111849_b(String var1) {
      this.func_111860_b(C_101174_aow.func_111879_a(var1));
   }

   public void func_111853_i() {
      this.func_111860_b(C_101174_aow.func_111884_b());
   }

   public void func_111846_c(String var1) {
      this.func_111860_b(C_101174_aow.func_111883_b(var1));
   }

   public void func_111848_j() {
      this.func_111860_b(C_101174_aow.func_111880_c());
   }

   public void func_111845_k() {
      this.func_111860_b(C_101174_aow.func_111881_a());
   }

   private void func_111859_a(C_101173_aov var1) {
      if(this.field_111861_b == null) {
         this.field_111861_b = var1;
      } else {
         this.func_111860_b(var1);
      }

   }

   private void func_111860_b(C_101173_aov var1) {
      ((C_101167_aot)this.field_111862_a.peek()).func_111864_a(var1);
   }
}
