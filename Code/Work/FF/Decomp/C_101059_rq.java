
public class C_101059_rq implements C_100716_kl {

   private final C_100891_wu field_104793_a;
   private C_100994_tv[] field_104791_b = new C_100994_tv[3];
   private final C_101095_qg field_104792_c;
   private C_100892_wv field_104789_d;
   private int field_104790_e;


   public C_101059_rq(C_101095_qg var1, C_100891_wu var2) {
      this.field_104792_c = var1;
      this.field_104793_a = var2;
   }

   public int func_103003_k_() {
      return this.field_104791_b.length;
   }

   public C_100994_tv func_103007_a(int var1) {
      return this.field_104791_b[var1];
   }

   public C_100994_tv func_103002_a(int var1, int var2) {
      if(this.field_104791_b[var1] != null) {
         C_100994_tv var3;
         if(var1 == 2) {
            var3 = this.field_104791_b[var1];
            this.field_104791_b[var1] = null;
            return var3;
         } else if(this.field_104791_b[var1].field_111398_a <= var2) {
            var3 = this.field_104791_b[var1];
            this.field_104791_b[var1] = null;
            if(this.func_104786_d(var1)) {
               this.func_104787_g();
            }

            return var3;
         } else {
            var3 = this.field_104791_b[var1].func_111342_a(var2);
            if(this.field_104791_b[var1].field_111398_a == 0) {
               this.field_104791_b[var1] = null;
            }

            if(this.func_104786_d(var1)) {
               this.func_104787_g();
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   private boolean func_104786_d(int var1) {
      return var1 == 0 || var1 == 1;
   }

   public C_100994_tv func_103001_a_(int var1) {
      if(this.field_104791_b[var1] != null) {
         C_100994_tv var2 = this.field_104791_b[var1];
         this.field_104791_b[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void func_103006_a(int var1, C_100994_tv var2) {
      this.field_104791_b[var1] = var2;
      if(var2 != null && var2.field_111398_a > this.func_103008_c()) {
         var2.field_111398_a = this.func_103008_c();
      }

      if(this.func_104786_d(var1)) {
         this.func_104787_g();
      }

   }

   public String func_103005_b() {
      return "mob.villager";
   }

   public int func_103008_c() {
      return 64;
   }

   public boolean func_103010_a(C_101095_qg var1) {
      return this.field_104793_a.func_103580_m_() == var1;
   }

   public void func_103004_l_() {}

   public void func_103009_f() {}

   public void func_102922_d() {
      this.func_104787_g();
   }

   public void func_104787_g() {
      this.field_104789_d = null;
      C_100994_tv var1 = this.field_104791_b[0];
      C_100994_tv var2 = this.field_104791_b[1];
      if(var1 == null) {
         var1 = var2;
         var2 = null;
      }

      if(var1 == null) {
         this.func_103006_a(2, (C_100994_tv)null);
      } else {
         C_100859_ww var3 = this.field_104793_a.func_103584_b(this.field_104792_c);
         if(var3 != null) {
            C_100892_wv var4 = var3.func_110245_a(var1, var2, this.field_104790_e);
            if(var4 != null && !var4.func_110661_g()) {
               this.field_104789_d = var4;
               this.func_103006_a(2, var4.func_110654_d().func_111360_l());
            } else if(var2 != null) {
               var4 = var3.func_110245_a(var2, var1, this.field_104790_e);
               if(var4 != null && !var4.func_110661_g()) {
                  this.field_104789_d = var4;
                  this.func_103006_a(2, var4.func_110654_d().func_111360_l());
               } else {
                  this.func_103006_a(2, (C_100994_tv)null);
               }
            } else {
               this.func_103006_a(2, (C_100994_tv)null);
            }
         }
      }

   }

   public C_100892_wv func_104785_h() {
      return this.field_104789_d;
   }

   public void func_104788_c(int var1) {
      this.field_104790_e = var1;
      this.func_104787_g();
   }
}
