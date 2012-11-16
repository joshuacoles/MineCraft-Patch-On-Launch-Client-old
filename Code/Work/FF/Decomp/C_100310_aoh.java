
final class C_100310_aoh implements C_100311_aoi {

   private final C_101179_ape field_107373_a;
   private final C_101179_ape field_107372_b;


   C_100310_aoh(C_101179_ape var1, C_101179_ape var2) {
      this.field_107373_a = var1;
      this.field_107372_b = var2;
   }

   public boolean func_107358_a(Object var1) {
      return this.field_107373_a.func_111908_a(var1) && this.field_107372_b.func_111908_a(this.field_107373_a.func_111907_b(var1));
   }

   public Object func_107357_b(Object var1) {
      Object var2;
      try {
         var2 = this.field_107373_a.func_111907_b(var1);
      } catch (C_101177_apa var6) {
         throw C_101177_apa.func_111888_b(var6, this.field_107373_a);
      }

      try {
         Object var3 = this.field_107372_b.func_111907_b(var2);
         return var3;
      } catch (C_101177_apa var5) {
         throw C_101177_apa.func_111887_a(var5, this.field_107373_a);
      }
   }

   public String func_107356_a() {
      return this.field_107372_b.func_111906_a();
   }

   public String toString() {
      return this.field_107373_a.toString() + ", with " + this.field_107372_b.toString();
   }
}
