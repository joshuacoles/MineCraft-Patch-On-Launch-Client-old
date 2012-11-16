
public class C_100653_jt {

   private transient C_100654_ju[] field_108959_a = new C_100654_ju[16];
   private transient int field_108957_b;
   private int field_108958_c = 12;
   private final float field_108955_d = 0.75F;
   private transient volatile int field_108956_e;


   private static int func_108943_g(long var0) {
      return func_108947_a((int)(var0 ^ var0 >>> 32));
   }

   private static int func_108947_a(int var0) {
      var0 ^= var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   private static int func_108949_a(int var0, int var1) {
      return var0 & var1 - 1;
   }

   public int func_108952_a() {
      return this.field_108957_b;
   }

   public Object func_108954_a(long var1) {
      int var3 = func_108943_g(var1);

      for(C_100654_ju var4 = this.field_108959_a[func_108949_a(var3, this.field_108959_a.length)]; var4 != null; var4 = var4.field_108964_c) {
         if(var4.field_108965_a == var1) {
            return var4.field_108963_b;
         }
      }

      return null;
   }

   public boolean func_108951_b(long var1) {
      return this.func_108946_c(var1) != null;
   }

   final C_100654_ju func_108946_c(long var1) {
      int var3 = func_108943_g(var1);

      for(C_100654_ju var4 = this.field_108959_a[func_108949_a(var3, this.field_108959_a.length)]; var4 != null; var4 = var4.field_108964_c) {
         if(var4.field_108965_a == var1) {
            return var4;
         }
      }

      return null;
   }

   public void func_108953_a(long var1, Object var3) {
      int var4 = func_108943_g(var1);
      int var5 = func_108949_a(var4, this.field_108959_a.length);

      for(C_100654_ju var6 = this.field_108959_a[var5]; var6 != null; var6 = var6.field_108964_c) {
         if(var6.field_108965_a == var1) {
            var6.field_108963_b = var3;
            return;
         }
      }

      ++this.field_108956_e;
      this.func_108944_a(var4, var1, var3, var5);
   }

   private void func_108942_b(int var1) {
      C_100654_ju[] var2 = this.field_108959_a;
      int var3 = var2.length;
      if(var3 == 1073741824) {
         this.field_108958_c = Integer.MAX_VALUE;
      } else {
         C_100654_ju[] var4 = new C_100654_ju[var1];
         this.func_108948_a(var4);
         this.field_108959_a = var4;
         this.field_108958_c = (int)((float)var1 * this.field_108955_d);
      }
   }

   private void func_108948_a(C_100654_ju[] var1) {
      C_100654_ju[] var2 = this.field_108959_a;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         C_100654_ju var5 = var2[var4];
         if(var5 != null) {
            var2[var4] = null;

            C_100654_ju var6;
            do {
               var6 = var5.field_108964_c;
               int var7 = func_108949_a(var5.field_108962_d, var3);
               var5.field_108964_c = var1[var7];
               var1[var7] = var5;
               var5 = var6;
            } while(var6 != null);
         }
      }

   }

   public Object func_108950_d(long var1) {
      C_100654_ju var3 = this.func_108945_e(var1);
      return var3 == null?null:var3.field_108963_b;
   }

   final C_100654_ju func_108945_e(long var1) {
      int var3 = func_108943_g(var1);
      int var4 = func_108949_a(var3, this.field_108959_a.length);
      C_100654_ju var5 = this.field_108959_a[var4];

      C_100654_ju var6;
      C_100654_ju var7;
      for(var6 = var5; var6 != null; var6 = var7) {
         var7 = var6.field_108964_c;
         if(var6.field_108965_a == var1) {
            ++this.field_108956_e;
            --this.field_108957_b;
            if(var5 == var6) {
               this.field_108959_a[var4] = var7;
            } else {
               var5.field_108964_c = var7;
            }

            return var6;
         }

         var5 = var6;
      }

      return var6;
   }

   private void func_108944_a(int var1, long var2, Object var4, int var5) {
      C_100654_ju var6 = this.field_108959_a[var5];
      this.field_108959_a[var5] = new C_100654_ju(var1, var2, var4, var6);
      if(this.field_108957_b++ >= this.field_108958_c) {
         this.func_108942_b(2 * this.field_108959_a.length);
      }

   }

   // $FF: synthetic method
   static int func_108941_f(long var0) {
      return func_108943_g(var0);
   }
}
