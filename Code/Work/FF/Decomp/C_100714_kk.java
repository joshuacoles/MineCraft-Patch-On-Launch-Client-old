
public class C_100714_kk implements C_100716_kl {

   private String field_104783_a;
   private C_100716_kl field_104781_b;
   private C_100716_kl field_104782_c;


   public C_100714_kk(String var1, C_100716_kl var2, C_100716_kl var3) {
      this.field_104783_a = var1;
      if(var2 == null) {
         var2 = var3;
      }

      if(var3 == null) {
         var3 = var2;
      }

      this.field_104781_b = var2;
      this.field_104782_c = var3;
   }

   public int func_103003_k_() {
      return this.field_104781_b.func_103003_k_() + this.field_104782_c.func_103003_k_();
   }

   public String func_103005_b() {
      return this.field_104783_a;
   }

   public C_100994_tv func_103007_a(int var1) {
      return var1 >= this.field_104781_b.func_103003_k_()?this.field_104782_c.func_103007_a(var1 - this.field_104781_b.func_103003_k_()):this.field_104781_b.func_103007_a(var1);
   }

   public C_100994_tv func_103002_a(int var1, int var2) {
      return var1 >= this.field_104781_b.func_103003_k_()?this.field_104782_c.func_103002_a(var1 - this.field_104781_b.func_103003_k_(), var2):this.field_104781_b.func_103002_a(var1, var2);
   }

   public C_100994_tv func_103001_a_(int var1) {
      return var1 >= this.field_104781_b.func_103003_k_()?this.field_104782_c.func_103001_a_(var1 - this.field_104781_b.func_103003_k_()):this.field_104781_b.func_103001_a_(var1);
   }

   public void func_103006_a(int var1, C_100994_tv var2) {
      if(var1 >= this.field_104781_b.func_103003_k_()) {
         this.field_104782_c.func_103006_a(var1 - this.field_104781_b.func_103003_k_(), var2);
      } else {
         this.field_104781_b.func_103006_a(var1, var2);
      }

   }

   public int func_103008_c() {
      return this.field_104781_b.func_103008_c();
   }

   public void func_102922_d() {
      this.field_104781_b.func_102922_d();
      this.field_104782_c.func_102922_d();
   }

   public boolean func_103010_a(C_101095_qg var1) {
      return this.field_104781_b.func_103010_a(var1) && this.field_104782_c.func_103010_a(var1);
   }

   public void func_103004_l_() {
      this.field_104781_b.func_103004_l_();
      this.field_104782_c.func_103004_l_();
   }

   public void func_103009_f() {
      this.field_104781_b.func_103009_f();
      this.field_104782_c.func_103009_f();
   }
}
