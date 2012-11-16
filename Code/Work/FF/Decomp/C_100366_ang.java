
public class C_100366_ang {

   protected byte[] field_107805_a;
   protected int field_107803_b;
   protected boolean field_107804_c;
   protected C_100364_anf field_107801_d;
   protected boolean field_107802_e;
   protected boolean field_107800_f;


   protected C_100366_ang() {}

   public C_100366_ang(C_100364_anf var1) {
      this.field_107801_d = var1;
      this.field_107805_a = new byte[var1.func_107587_b()];
      this.field_107803_b = 0;
      String var2 = var1.func_107584_a();
      int var3 = var2.indexOf(47) + 1;
      this.field_107800_f = var3 > 0 && var2.startsWith("PGP", var3);
      if(this.field_107800_f) {
         this.field_107802_e = true;
      } else {
         this.field_107802_e = var3 > 0 && (var2.startsWith("CFB", var3) || var2.startsWith("OFB", var3) || var2.startsWith("OpenPGP", var3) || var2.startsWith("SIC", var3) || var2.startsWith("GCTR", var3));
      }

   }

   public void func_107798_a(boolean var1, C_100369_ani var2) {
      this.field_107804_c = var1;
      this.func_107799_b();
      this.field_107801_d.func_107585_a(var1, var2);
   }

   public int func_107796_a() {
      return this.field_107801_d.func_107587_b();
   }

   public int func_107797_a(int var1) {
      int var2 = var1 + this.field_107803_b;
      int var3;
      if(this.field_107800_f) {
         var3 = var2 % this.field_107805_a.length - (this.field_107801_d.func_107587_b() + 2);
      } else {
         var3 = var2 % this.field_107805_a.length;
      }

      return var2 - var3;
   }

   public int func_107793_b(int var1) {
      return var1 + this.field_107803_b;
   }

   public int func_107795_a(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      if(var3 < 0) {
         throw new IllegalArgumentException("Can\'t have a negative input length!");
      } else {
         int var6 = this.func_107796_a();
         int var7 = this.func_107797_a(var3);
         if(var7 > 0 && var5 + var7 > var4.length) {
            throw new C_100370_ank("output buffer too short");
         } else {
            int var8 = 0;
            int var9 = this.field_107805_a.length - this.field_107803_b;
            if(var3 > var9) {
               System.arraycopy(var1, var2, this.field_107805_a, this.field_107803_b, var9);
               var8 += this.field_107801_d.func_107588_a(this.field_107805_a, 0, var4, var5);
               this.field_107803_b = 0;
               var3 -= var9;

               for(var2 += var9; var3 > this.field_107805_a.length; var2 += var6) {
                  var8 += this.field_107801_d.func_107588_a(var1, var2, var4, var5 + var8);
                  var3 -= var6;
               }
            }

            System.arraycopy(var1, var2, this.field_107805_a, this.field_107803_b, var3);
            this.field_107803_b += var3;
            if(this.field_107803_b == this.field_107805_a.length) {
               var8 += this.field_107801_d.func_107588_a(this.field_107805_a, 0, var4, var5 + var8);
               this.field_107803_b = 0;
            }

            return var8;
         }
      }
   }

   public int func_107794_a(byte[] var1, int var2) {
      int var4;
      try {
         int var3 = 0;
         if(var2 + this.field_107803_b > var1.length) {
            throw new C_100370_ank("output buffer too short for doFinal()");
         }

         if(this.field_107803_b != 0) {
            if(!this.field_107802_e) {
               throw new C_100370_ank("data not block size aligned");
            }

            this.field_107801_d.func_107588_a(this.field_107805_a, 0, this.field_107805_a, 0);
            var3 = this.field_107803_b;
            this.field_107803_b = 0;
            System.arraycopy(this.field_107805_a, 0, var1, var2, var3);
         }

         var4 = var3;
      } finally {
         this.func_107799_b();
      }

      return var4;
   }

   public void func_107799_b() {
      for(int var1 = 0; var1 < this.field_107805_a.length; ++var1) {
         this.field_107805_a[var1] = 0;
      }

      this.field_107803_b = 0;
      this.field_107801_d.func_107586_c();
   }
}
