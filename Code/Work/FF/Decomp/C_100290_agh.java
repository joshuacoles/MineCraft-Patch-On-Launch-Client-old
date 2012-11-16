
public class C_100290_agh {

   private C_100292_agi[] field_107335_a = new C_100292_agi[1024];
   private int field_107334_b = 0;


   public C_100292_agi func_107331_a(C_100292_agi var1) {
      if(var1.field_107342_d >= 0) {
         throw new IllegalStateException("OW KNOWS!");
      } else {
         if(this.field_107334_b == this.field_107335_a.length) {
            C_100292_agi[] var2 = new C_100292_agi[this.field_107334_b << 1];
            System.arraycopy(this.field_107335_a, 0, var2, 0, this.field_107334_b);
            this.field_107335_a = var2;
         }

         this.field_107335_a[this.field_107334_b] = var1;
         var1.field_107342_d = this.field_107334_b;
         this.func_107329_a(this.field_107334_b++);
         return var1;
      }
   }

   public void func_107330_a() {
      this.field_107334_b = 0;
   }

   public C_100292_agi func_107333_c() {
      C_100292_agi var1 = this.field_107335_a[0];
      this.field_107335_a[0] = this.field_107335_a[--this.field_107334_b];
      this.field_107335_a[this.field_107334_b] = null;
      if(this.field_107334_b > 0) {
         this.func_107328_b(0);
      }

      var1.field_107342_d = -1;
      return var1;
   }

   public void func_107332_a(C_100292_agi var1, float var2) {
      float var3 = var1.field_107341_g;
      var1.field_107341_g = var2;
      if(var2 < var3) {
         this.func_107329_a(var1.field_107342_d);
      } else {
         this.func_107328_b(var1.field_107342_d);
      }

   }

   private void func_107329_a(int var1) {
      C_100292_agi var2 = this.field_107335_a[var1];

      int var4;
      for(float var3 = var2.field_107341_g; var1 > 0; var1 = var4) {
         var4 = var1 - 1 >> 1;
         C_100292_agi var5 = this.field_107335_a[var4];
         if(var3 >= var5.field_107341_g) {
            break;
         }

         this.field_107335_a[var1] = var5;
         var5.field_107342_d = var1;
      }

      this.field_107335_a[var1] = var2;
      var2.field_107342_d = var1;
   }

   private void func_107328_b(int var1) {
      C_100292_agi var2 = this.field_107335_a[var1];
      float var3 = var2.field_107341_g;

      while(true) {
         int var4 = 1 + (var1 << 1);
         int var5 = var4 + 1;
         if(var4 >= this.field_107334_b) {
            break;
         }

         C_100292_agi var6 = this.field_107335_a[var4];
         float var7 = var6.field_107341_g;
         C_100292_agi var8;
         float var9;
         if(var5 >= this.field_107334_b) {
            var8 = null;
            var9 = Float.POSITIVE_INFINITY;
         } else {
            var8 = this.field_107335_a[var5];
            var9 = var8.field_107341_g;
         }

         if(var7 < var9) {
            if(var7 >= var3) {
               break;
            }

            this.field_107335_a[var1] = var6;
            var6.field_107342_d = var1;
            var1 = var4;
         } else {
            if(var9 >= var3) {
               break;
            }

            this.field_107335_a[var1] = var8;
            var8.field_107342_d = var1;
            var1 = var5;
         }
      }

      this.field_107335_a[var1] = var2;
      var2.field_107342_d = var1;
   }

   public boolean func_107327_e() {
      return this.field_107334_b == 0;
   }
}
