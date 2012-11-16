import java.util.HashSet;
import java.util.Set;

public class C_100661_jq {

   private transient C_100656_jr[] field_109053_a = new C_100656_jr[16];
   private transient int field_109051_b;
   private int field_109052_c = 12;
   private final float field_109049_d = 0.75F;
   private transient volatile int field_109050_e;
   private Set field_109048_f = new HashSet();


   private static int func_109042_g(int var0) {
      var0 ^= var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   private static int func_109040_a(int var0, int var1) {
      return var0 & var1 - 1;
   }

   public Object func_109038_a(int var1) {
      int var2 = func_109042_g(var1);

      for(C_100656_jr var3 = this.field_109053_a[func_109040_a(var2, this.field_109053_a.length)]; var3 != null; var3 = var3.field_108970_c) {
         if(var3.field_108971_a == var1) {
            return var3.field_108969_b;
         }
      }

      return null;
   }

   public boolean func_109034_b(int var1) {
      return this.func_109046_c(var1) != null;
   }

   final C_100656_jr func_109046_c(int var1) {
      int var2 = func_109042_g(var1);

      for(C_100656_jr var3 = this.field_109053_a[func_109040_a(var2, this.field_109053_a.length)]; var3 != null; var3 = var3.field_108970_c) {
         if(var3.field_108971_a == var1) {
            return var3;
         }
      }

      return null;
   }

   public void func_109035_a(int var1, Object var2) {
      this.field_109048_f.add(Integer.valueOf(var1));
      int var3 = func_109042_g(var1);
      int var4 = func_109040_a(var3, this.field_109053_a.length);

      for(C_100656_jr var5 = this.field_109053_a[var4]; var5 != null; var5 = var5.field_108970_c) {
         if(var5.field_108971_a == var1) {
            var5.field_108969_b = var2;
            return;
         }
      }

      ++this.field_109050_e;
      this.func_109037_a(var3, var1, var2, var4);
   }

   private void func_109045_h(int var1) {
      C_100656_jr[] var2 = this.field_109053_a;
      int var3 = var2.length;
      if(var3 == 1073741824) {
         this.field_109052_c = Integer.MAX_VALUE;
      } else {
         C_100656_jr[] var4 = new C_100656_jr[var1];
         this.func_109043_a(var4);
         this.field_109053_a = var4;
         this.field_109052_c = (int)((float)var1 * this.field_109049_d);
      }
   }

   private void func_109043_a(C_100656_jr[] var1) {
      C_100656_jr[] var2 = this.field_109053_a;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         C_100656_jr var5 = var2[var4];
         if(var5 != null) {
            var2[var4] = null;

            C_100656_jr var6;
            do {
               var6 = var5.field_108970_c;
               int var7 = func_109040_a(var5.field_108968_d, var3);
               var5.field_108970_c = var1[var7];
               var1[var7] = var5;
               var5 = var6;
            } while(var6 != null);
         }
      }

   }

   public Object func_109047_d(int var1) {
      this.field_109048_f.remove(Integer.valueOf(var1));
      C_100656_jr var2 = this.func_109041_e(var1);
      return var2 == null?null:var2.field_108969_b;
   }

   final C_100656_jr func_109041_e(int var1) {
      int var2 = func_109042_g(var1);
      int var3 = func_109040_a(var2, this.field_109053_a.length);
      C_100656_jr var4 = this.field_109053_a[var3];

      C_100656_jr var5;
      C_100656_jr var6;
      for(var5 = var4; var5 != null; var5 = var6) {
         var6 = var5.field_108970_c;
         if(var5.field_108971_a == var1) {
            ++this.field_109050_e;
            --this.field_109051_b;
            if(var4 == var5) {
               this.field_109053_a[var3] = var6;
            } else {
               var4.field_108970_c = var6;
            }

            return var5;
         }

         var4 = var5;
      }

      return var5;
   }

   public void func_109044_c() {
      ++this.field_109050_e;
      C_100656_jr[] var1 = this.field_109053_a;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = null;
      }

      this.field_109051_b = 0;
   }

   private void func_109037_a(int var1, int var2, Object var3, int var4) {
      C_100656_jr var5 = this.field_109053_a[var4];
      this.field_109053_a[var4] = new C_100656_jr(var1, var2, var3, var5);
      if(this.field_109051_b++ >= this.field_109052_c) {
         this.func_109045_h(2 * this.field_109053_a.length);
      }

   }

   public Set func_109036_d() {
      return this.field_109048_f;
   }

   // $FF: synthetic method
   static int func_109039_f(int var0) {
      return func_109042_g(var0);
   }
}
