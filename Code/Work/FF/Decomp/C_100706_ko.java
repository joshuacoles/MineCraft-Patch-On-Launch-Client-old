import java.util.Iterator;
import java.util.List;

public class C_100706_ko implements C_100716_kl {

   private String field_104774_a;
   private int field_104772_b;
   private C_100994_tv[] field_104773_c;
   private List field_104771_d;


   public C_100706_ko(String var1, int var2) {
      this.field_104774_a = var1;
      this.field_104772_b = var2;
      this.field_104773_c = new C_100994_tv[var2];
   }

   public C_100994_tv func_103007_a(int var1) {
      return this.field_104773_c[var1];
   }

   public C_100994_tv func_103002_a(int var1, int var2) {
      if(this.field_104773_c[var1] != null) {
         C_100994_tv var3;
         if(this.field_104773_c[var1].field_111398_a <= var2) {
            var3 = this.field_104773_c[var1];
            this.field_104773_c[var1] = null;
            this.func_102922_d();
            return var3;
         } else {
            var3 = this.field_104773_c[var1].func_111342_a(var2);
            if(this.field_104773_c[var1].field_111398_a == 0) {
               this.field_104773_c[var1] = null;
            }

            this.func_102922_d();
            return var3;
         }
      } else {
         return null;
      }
   }

   public C_100994_tv func_103001_a_(int var1) {
      if(this.field_104773_c[var1] != null) {
         C_100994_tv var2 = this.field_104773_c[var1];
         this.field_104773_c[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void func_103006_a(int var1, C_100994_tv var2) {
      this.field_104773_c[var1] = var2;
      if(var2 != null && var2.field_111398_a > this.func_103008_c()) {
         var2.field_111398_a = this.func_103008_c();
      }

      this.func_102922_d();
   }

   public int func_103003_k_() {
      return this.field_104772_b;
   }

   public String func_103005_b() {
      return this.field_104774_a;
   }

   public int func_103008_c() {
      return 64;
   }

   public void func_102922_d() {
      if(this.field_104771_d != null) {
         Iterator var1 = this.field_104771_d.iterator();

         while(var1.hasNext()) {
            C_100718_km var2 = (C_100718_km)var1.next();
            var2.func_109278_a(this);
         }
      }

   }

   public boolean func_103010_a(C_101095_qg var1) {
      return true;
   }

   public void func_103004_l_() {}

   public void func_103009_f() {}
}
