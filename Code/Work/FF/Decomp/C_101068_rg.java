
public class C_101068_rg implements C_100716_kl {

   private C_100994_tv[] field_104797_a;
   private int field_104795_b;
   private C_101075_qy field_104796_c;


   public C_101068_rg(C_101075_qy var1, int var2, int var3) {
      int var4 = var2 * var3;
      this.field_104797_a = new C_100994_tv[var4];
      this.field_104796_c = var1;
      this.field_104795_b = var2;
   }

   public int func_103003_k_() {
      return this.field_104797_a.length;
   }

   public C_100994_tv func_103007_a(int var1) {
      return var1 >= this.func_103003_k_()?null:this.field_104797_a[var1];
   }

   public C_100994_tv func_104794_b(int var1, int var2) {
      if(var1 >= 0 && var1 < this.field_104795_b) {
         int var3 = var1 + var2 * this.field_104795_b;
         return this.func_103007_a(var3);
      } else {
         return null;
      }
   }

   public String func_103005_b() {
      return "container.crafting";
   }

   public C_100994_tv func_103001_a_(int var1) {
      if(this.field_104797_a[var1] != null) {
         C_100994_tv var2 = this.field_104797_a[var1];
         this.field_104797_a[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public C_100994_tv func_103002_a(int var1, int var2) {
      if(this.field_104797_a[var1] != null) {
         C_100994_tv var3;
         if(this.field_104797_a[var1].field_111398_a <= var2) {
            var3 = this.field_104797_a[var1];
            this.field_104797_a[var1] = null;
            this.field_104796_c.func_111497_a(this);
            return var3;
         } else {
            var3 = this.field_104797_a[var1].func_111342_a(var2);
            if(this.field_104797_a[var1].field_111398_a == 0) {
               this.field_104797_a[var1] = null;
            }

            this.field_104796_c.func_111497_a(this);
            return var3;
         }
      } else {
         return null;
      }
   }

   public void func_103006_a(int var1, C_100994_tv var2) {
      this.field_104797_a[var1] = var2;
      this.field_104796_c.func_111497_a(this);
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
