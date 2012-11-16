
public class C_101057_rx implements C_100716_kl {

   private C_100994_tv[] field_104784_a = new C_100994_tv[1];


   public int func_103003_k_() {
      return 1;
   }

   public C_100994_tv func_103007_a(int var1) {
      return this.field_104784_a[0];
   }

   public String func_103005_b() {
      return "Result";
   }

   public C_100994_tv func_103002_a(int var1, int var2) {
      if(this.field_104784_a[0] != null) {
         C_100994_tv var3 = this.field_104784_a[0];
         this.field_104784_a[0] = null;
         return var3;
      } else {
         return null;
      }
   }

   public C_100994_tv func_103001_a_(int var1) {
      if(this.field_104784_a[0] != null) {
         C_100994_tv var2 = this.field_104784_a[0];
         this.field_104784_a[0] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void func_103006_a(int var1, C_100994_tv var2) {
      this.field_104784_a[0] = var2;
   }

   public int func_103008_c() {
      return 64;
   }

   public void func_102922_d() {}

   public boolean func_103010_a(C_101095_qg var1) {
      return true;
   }

   public void func_103004_l_() {}

   public void func_103009_f() {}
}
