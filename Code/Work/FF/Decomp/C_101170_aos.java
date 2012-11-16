
class C_101170_aos implements C_101167_aot {

   // $FF: synthetic field
   final C_101166_aoo field_111868_a;
   // $FF: synthetic field
   final C_101163_aop field_111867_b;


   C_101170_aos(C_101163_aop var1, C_101166_aoo var2) {
      this.field_111867_b = var1;
      this.field_111868_a = var2;
   }

   public void func_111864_a(C_101173_aov var1) {
      this.field_111868_a.func_111871_b(var1);
   }

   public void func_111863_a(C_101166_aoo var1) {
      throw new RuntimeException("Coding failure in Argo:  Attempt to add a field to a field.");
   }
}
