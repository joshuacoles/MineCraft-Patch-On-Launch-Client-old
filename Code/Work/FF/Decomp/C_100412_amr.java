
public class C_100412_amr {

   private static final ThreadLocal field_107912_g = new C_100410_ams();
   public double field_107917_a;
   public double field_107915_b;
   public double field_107916_c;
   public double field_107913_d;
   public double field_107914_e;
   public double field_107911_f;


   public static C_100412_amr func_107894_a(double var0, double var2, double var4, double var6, double var8, double var10) {
      return new C_100412_amr(var0, var2, var4, var6, var8, var10);
   }

   public static C_100385_amt func_107892_a() {
      return (C_100385_amt)field_107912_g.get();
   }

   protected C_100412_amr(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.field_107917_a = var1;
      this.field_107915_b = var3;
      this.field_107916_c = var5;
      this.field_107913_d = var7;
      this.field_107914_e = var9;
      this.field_107911_f = var11;
   }

   public C_100412_amr func_107907_b(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.field_107917_a = var1;
      this.field_107915_b = var3;
      this.field_107916_c = var5;
      this.field_107913_d = var7;
      this.field_107914_e = var9;
      this.field_107911_f = var11;
      return this;
   }

   public C_100412_amr func_107903_a(double var1, double var3, double var5) {
      double var7 = this.field_107917_a;
      double var9 = this.field_107915_b;
      double var11 = this.field_107916_c;
      double var13 = this.field_107913_d;
      double var15 = this.field_107914_e;
      double var17 = this.field_107911_f;
      if(var1 < 0.0D) {
         var7 += var1;
      }

      if(var1 > 0.0D) {
         var13 += var1;
      }

      if(var3 < 0.0D) {
         var9 += var3;
      }

      if(var3 > 0.0D) {
         var15 += var3;
      }

      if(var5 < 0.0D) {
         var11 += var5;
      }

      if(var5 > 0.0D) {
         var17 += var5;
      }

      return func_107892_a().func_107844_a(var7, var9, var11, var13, var15, var17);
   }

   public C_100412_amr func_107895_b(double var1, double var3, double var5) {
      double var7 = this.field_107917_a - var1;
      double var9 = this.field_107915_b - var3;
      double var11 = this.field_107916_c - var5;
      double var13 = this.field_107913_d + var1;
      double var15 = this.field_107914_e + var3;
      double var17 = this.field_107911_f + var5;
      return func_107892_a().func_107844_a(var7, var9, var11, var13, var15, var17);
   }

   public C_100412_amr func_107891_c(double var1, double var3, double var5) {
      return func_107892_a().func_107844_a(this.field_107917_a + var1, this.field_107915_b + var3, this.field_107916_c + var5, this.field_107913_d + var1, this.field_107914_e + var3, this.field_107911_f + var5);
   }

   public double func_107897_a(C_100412_amr var1, double var2) {
      if(var1.field_107914_e > this.field_107915_b && var1.field_107915_b < this.field_107914_e) {
         if(var1.field_107911_f > this.field_107916_c && var1.field_107916_c < this.field_107911_f) {
            double var4;
            if(var2 > 0.0D && var1.field_107913_d <= this.field_107917_a) {
               var4 = this.field_107917_a - var1.field_107913_d;
               if(var4 < var2) {
                  var2 = var4;
               }
            }

            if(var2 < 0.0D && var1.field_107917_a >= this.field_107913_d) {
               var4 = this.field_107913_d - var1.field_107917_a;
               if(var4 > var2) {
                  var2 = var4;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public double func_107904_b(C_100412_amr var1, double var2) {
      if(var1.field_107913_d > this.field_107917_a && var1.field_107917_a < this.field_107913_d) {
         if(var1.field_107911_f > this.field_107916_c && var1.field_107916_c < this.field_107911_f) {
            double var4;
            if(var2 > 0.0D && var1.field_107914_e <= this.field_107915_b) {
               var4 = this.field_107915_b - var1.field_107914_e;
               if(var4 < var2) {
                  var2 = var4;
               }
            }

            if(var2 < 0.0D && var1.field_107915_b >= this.field_107914_e) {
               var4 = this.field_107914_e - var1.field_107915_b;
               if(var4 > var2) {
                  var2 = var4;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public double func_107905_c(C_100412_amr var1, double var2) {
      if(var1.field_107913_d > this.field_107917_a && var1.field_107917_a < this.field_107913_d) {
         if(var1.field_107914_e > this.field_107915_b && var1.field_107915_b < this.field_107914_e) {
            double var4;
            if(var2 > 0.0D && var1.field_107911_f <= this.field_107916_c) {
               var4 = this.field_107916_c - var1.field_107911_f;
               if(var4 < var2) {
                  var2 = var4;
               }
            }

            if(var2 < 0.0D && var1.field_107916_c >= this.field_107911_f) {
               var4 = this.field_107911_f - var1.field_107916_c;
               if(var4 > var2) {
                  var2 = var4;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public boolean func_107898_a(C_100412_amr var1) {
      return var1.field_107913_d > this.field_107917_a && var1.field_107917_a < this.field_107913_d?(var1.field_107914_e > this.field_107915_b && var1.field_107915_b < this.field_107914_e?var1.field_107911_f > this.field_107916_c && var1.field_107916_c < this.field_107911_f:false):false;
   }

   public C_100412_amr func_107899_d(double var1, double var3, double var5) {
      this.field_107917_a += var1;
      this.field_107915_b += var3;
      this.field_107916_c += var5;
      this.field_107913_d += var1;
      this.field_107914_e += var3;
      this.field_107911_f += var5;
      return this;
   }

   public boolean func_107901_a(C_100387_amw var1) {
      return var1.field_107872_c > this.field_107917_a && var1.field_107872_c < this.field_107913_d?(var1.field_107869_d > this.field_107915_b && var1.field_107869_d < this.field_107914_e?var1.field_107870_e > this.field_107916_c && var1.field_107870_e < this.field_107911_f:false):false;
   }

   public double func_107896_b() {
      double var1 = this.field_107913_d - this.field_107917_a;
      double var3 = this.field_107914_e - this.field_107915_b;
      double var5 = this.field_107911_f - this.field_107916_c;
      return (var1 + var3 + var5) / 3.0D;
   }

   public C_100412_amr func_107910_e(double var1, double var3, double var5) {
      double var7 = this.field_107917_a + var1;
      double var9 = this.field_107915_b + var3;
      double var11 = this.field_107916_c + var5;
      double var13 = this.field_107913_d - var1;
      double var15 = this.field_107914_e - var3;
      double var17 = this.field_107911_f - var5;
      return func_107892_a().func_107844_a(var7, var9, var11, var13, var15, var17);
   }

   public C_100412_amr func_107900_c() {
      return func_107892_a().func_107844_a(this.field_107917_a, this.field_107915_b, this.field_107916_c, this.field_107913_d, this.field_107914_e, this.field_107911_f);
   }

   public C_100383_amu func_107902_a(C_100387_amw var1, C_100387_amw var2) {
      C_100387_amw var3 = var1.func_107862_b(var2, this.field_107917_a);
      C_100387_amw var4 = var1.func_107862_b(var2, this.field_107913_d);
      C_100387_amw var5 = var1.func_107864_c(var2, this.field_107915_b);
      C_100387_amw var6 = var1.func_107864_c(var2, this.field_107914_e);
      C_100387_amw var7 = var1.func_107868_d(var2, this.field_107916_c);
      C_100387_amw var8 = var1.func_107868_d(var2, this.field_107911_f);
      if(!this.func_107906_b(var3)) {
         var3 = null;
      }

      if(!this.func_107906_b(var4)) {
         var4 = null;
      }

      if(!this.func_107893_c(var5)) {
         var5 = null;
      }

      if(!this.func_107893_c(var6)) {
         var6 = null;
      }

      if(!this.func_107908_d(var7)) {
         var7 = null;
      }

      if(!this.func_107908_d(var8)) {
         var8 = null;
      }

      C_100387_amw var9 = null;
      if(var3 != null && (var9 == null || var1.func_107860_e(var3) < var1.func_107860_e(var9))) {
         var9 = var3;
      }

      if(var4 != null && (var9 == null || var1.func_107860_e(var4) < var1.func_107860_e(var9))) {
         var9 = var4;
      }

      if(var5 != null && (var9 == null || var1.func_107860_e(var5) < var1.func_107860_e(var9))) {
         var9 = var5;
      }

      if(var6 != null && (var9 == null || var1.func_107860_e(var6) < var1.func_107860_e(var9))) {
         var9 = var6;
      }

      if(var7 != null && (var9 == null || var1.func_107860_e(var7) < var1.func_107860_e(var9))) {
         var9 = var7;
      }

      if(var8 != null && (var9 == null || var1.func_107860_e(var8) < var1.func_107860_e(var9))) {
         var9 = var8;
      }

      if(var9 == null) {
         return null;
      } else {
         byte var10 = -1;
         if(var9 == var3) {
            var10 = 4;
         }

         if(var9 == var4) {
            var10 = 5;
         }

         if(var9 == var5) {
            var10 = 0;
         }

         if(var9 == var6) {
            var10 = 1;
         }

         if(var9 == var7) {
            var10 = 2;
         }

         if(var9 == var8) {
            var10 = 3;
         }

         return new C_100383_amu(0, 0, 0, var10, var9);
      }
   }

   private boolean func_107906_b(C_100387_amw var1) {
      return var1 == null?false:var1.field_107869_d >= this.field_107915_b && var1.field_107869_d <= this.field_107914_e && var1.field_107870_e >= this.field_107916_c && var1.field_107870_e <= this.field_107911_f;
   }

   private boolean func_107893_c(C_100387_amw var1) {
      return var1 == null?false:var1.field_107872_c >= this.field_107917_a && var1.field_107872_c <= this.field_107913_d && var1.field_107870_e >= this.field_107916_c && var1.field_107870_e <= this.field_107911_f;
   }

   private boolean func_107908_d(C_100387_amw var1) {
      return var1 == null?false:var1.field_107872_c >= this.field_107917_a && var1.field_107872_c <= this.field_107913_d && var1.field_107869_d >= this.field_107915_b && var1.field_107869_d <= this.field_107914_e;
   }

   public void func_107909_c(C_100412_amr var1) {
      this.field_107917_a = var1.field_107917_a;
      this.field_107915_b = var1.field_107915_b;
      this.field_107916_c = var1.field_107916_c;
      this.field_107913_d = var1.field_107913_d;
      this.field_107914_e = var1.field_107914_e;
      this.field_107911_f = var1.field_107911_f;
   }

   public String toString() {
      return "box[" + this.field_107917_a + ", " + this.field_107915_b + ", " + this.field_107916_c + " -> " + this.field_107913_d + ", " + this.field_107914_e + ", " + this.field_107911_f + "]";
   }

}
