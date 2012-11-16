
public class C_100387_amw {

   public static final C_100393_amx field_107873_a = new C_100393_amx(-1, -1);
   public final C_100393_amx field_107871_b;
   public double field_107872_c;
   public double field_107869_d;
   public double field_107870_e;


   public static C_100387_amw func_107858_a(double var0, double var2, double var4) {
      return new C_100387_amw(field_107873_a, var0, var2, var4);
   }

   protected C_100387_amw(C_100393_amx var1, double var2, double var4, double var6) {
      if(var2 == -0.0D) {
         var2 = 0.0D;
      }

      if(var4 == -0.0D) {
         var4 = 0.0D;
      }

      if(var6 == -0.0D) {
         var6 = 0.0D;
      }

      this.field_107872_c = var2;
      this.field_107869_d = var4;
      this.field_107870_e = var6;
      this.field_107871_b = var1;
   }

   protected C_100387_amw func_107861_b(double var1, double var3, double var5) {
      this.field_107872_c = var1;
      this.field_107869_d = var3;
      this.field_107870_e = var5;
      return this;
   }

   public C_100387_amw func_107854_a(C_100387_amw var1) {
      return this.field_107871_b.func_107878_a(var1.field_107872_c - this.field_107872_c, var1.field_107869_d - this.field_107869_d, var1.field_107870_e - this.field_107870_e);
   }

   public C_100387_amw func_107865_a() {
      double var1 = (double)C_100650_jv.func_108915_a(this.field_107872_c * this.field_107872_c + this.field_107869_d * this.field_107869_d + this.field_107870_e * this.field_107870_e);
      return var1 < 1.0E-4D?this.field_107871_b.func_107878_a(0.0D, 0.0D, 0.0D):this.field_107871_b.func_107878_a(this.field_107872_c / var1, this.field_107869_d / var1, this.field_107870_e / var1);
   }

   public double func_107857_b(C_100387_amw var1) {
      return this.field_107872_c * var1.field_107872_c + this.field_107869_d * var1.field_107869_d + this.field_107870_e * var1.field_107870_e;
   }

   public C_100387_amw func_107852_c(C_100387_amw var1) {
      return this.field_107871_b.func_107878_a(this.field_107869_d * var1.field_107870_e - this.field_107870_e * var1.field_107869_d, this.field_107870_e * var1.field_107872_c - this.field_107872_c * var1.field_107870_e, this.field_107872_c * var1.field_107869_d - this.field_107869_d * var1.field_107872_c);
   }

   public C_100387_amw func_107856_c(double var1, double var3, double var5) {
      return this.field_107871_b.func_107878_a(this.field_107872_c + var1, this.field_107869_d + var3, this.field_107870_e + var5);
   }

   public double func_107853_d(C_100387_amw var1) {
      double var2 = var1.field_107872_c - this.field_107872_c;
      double var4 = var1.field_107869_d - this.field_107869_d;
      double var6 = var1.field_107870_e - this.field_107870_e;
      return (double)C_100650_jv.func_108915_a(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double func_107860_e(C_100387_amw var1) {
      double var2 = var1.field_107872_c - this.field_107872_c;
      double var4 = var1.field_107869_d - this.field_107869_d;
      double var6 = var1.field_107870_e - this.field_107870_e;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public double func_107866_d(double var1, double var3, double var5) {
      double var7 = var1 - this.field_107872_c;
      double var9 = var3 - this.field_107869_d;
      double var11 = var5 - this.field_107870_e;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double func_107855_b() {
      return (double)C_100650_jv.func_108915_a(this.field_107872_c * this.field_107872_c + this.field_107869_d * this.field_107869_d + this.field_107870_e * this.field_107870_e);
   }

   public C_100387_amw func_107862_b(C_100387_amw var1, double var2) {
      double var4 = var1.field_107872_c - this.field_107872_c;
      double var6 = var1.field_107869_d - this.field_107869_d;
      double var8 = var1.field_107870_e - this.field_107870_e;
      if(var4 * var4 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.field_107872_c) / var4;
         return var10 >= 0.0D && var10 <= 1.0D?this.field_107871_b.func_107878_a(this.field_107872_c + var4 * var10, this.field_107869_d + var6 * var10, this.field_107870_e + var8 * var10):null;
      }
   }

   public C_100387_amw func_107864_c(C_100387_amw var1, double var2) {
      double var4 = var1.field_107872_c - this.field_107872_c;
      double var6 = var1.field_107869_d - this.field_107869_d;
      double var8 = var1.field_107870_e - this.field_107870_e;
      if(var6 * var6 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.field_107869_d) / var6;
         return var10 >= 0.0D && var10 <= 1.0D?this.field_107871_b.func_107878_a(this.field_107872_c + var4 * var10, this.field_107869_d + var6 * var10, this.field_107870_e + var8 * var10):null;
      }
   }

   public C_100387_amw func_107868_d(C_100387_amw var1, double var2) {
      double var4 = var1.field_107872_c - this.field_107872_c;
      double var6 = var1.field_107869_d - this.field_107869_d;
      double var8 = var1.field_107870_e - this.field_107870_e;
      if(var8 * var8 < 1.0000000116860974E-7D) {
         return null;
      } else {
         double var10 = (var2 - this.field_107870_e) / var8;
         return var10 >= 0.0D && var10 <= 1.0D?this.field_107871_b.func_107878_a(this.field_107872_c + var4 * var10, this.field_107869_d + var6 * var10, this.field_107870_e + var8 * var10):null;
      }
   }

   public String toString() {
      return "(" + this.field_107872_c + ", " + this.field_107869_d + ", " + this.field_107870_e + ")";
   }

   public void func_107859_a(float var1) {
      float var2 = C_100650_jv.func_108928_b(var1);
      float var3 = C_100650_jv.func_108924_a(var1);
      double var4 = this.field_107872_c;
      double var6 = this.field_107869_d * (double)var2 + this.field_107870_e * (double)var3;
      double var8 = this.field_107870_e * (double)var2 - this.field_107869_d * (double)var3;
      this.field_107872_c = var4;
      this.field_107869_d = var6;
      this.field_107870_e = var8;
   }

   public void func_107863_b(float var1) {
      float var2 = C_100650_jv.func_108928_b(var1);
      float var3 = C_100650_jv.func_108924_a(var1);
      double var4 = this.field_107872_c * (double)var2 + this.field_107870_e * (double)var3;
      double var6 = this.field_107869_d;
      double var8 = this.field_107870_e * (double)var2 - this.field_107872_c * (double)var3;
      this.field_107872_c = var4;
      this.field_107869_d = var6;
      this.field_107870_e = var8;
   }

   public void func_107867_c(float var1) {
      float var2 = C_100650_jv.func_108928_b(var1);
      float var3 = C_100650_jv.func_108924_a(var1);
      double var4 = this.field_107872_c * (double)var2 + this.field_107869_d * (double)var3;
      double var6 = this.field_107869_d * (double)var2 - this.field_107872_c * (double)var3;
      double var8 = this.field_107870_e;
      this.field_107872_c = var4;
      this.field_107869_d = var6;
      this.field_107870_e = var8;
   }

}
