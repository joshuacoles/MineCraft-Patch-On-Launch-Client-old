
public class C_100516_abo {

   public int field_108341_a;
   public int field_108339_b;
   public int field_108340_c;
   public int field_108337_d;
   public int field_108338_e;
   public int field_108336_f;


   public C_100516_abo() {}

   public static C_100516_abo func_108332_a() {
      return new C_100516_abo(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
   }

   public static C_100516_abo func_108324_a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      switch(var9) {
      case 0:
         return new C_100516_abo(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
      case 1:
         return new C_100516_abo(var0 - var8 + 1 + var5, var1 + var4, var2 + var3, var0 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
      case 2:
         return new C_100516_abo(var0 + var3, var1 + var4, var2 - var8 + 1 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var5);
      case 3:
         return new C_100516_abo(var0 + var5, var1 + var4, var2 + var3, var0 + var8 - 1 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
      default:
         return new C_100516_abo(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
      }
   }

   public C_100516_abo(C_100516_abo var1) {
      this.field_108341_a = var1.field_108341_a;
      this.field_108339_b = var1.field_108339_b;
      this.field_108340_c = var1.field_108340_c;
      this.field_108337_d = var1.field_108337_d;
      this.field_108338_e = var1.field_108338_e;
      this.field_108336_f = var1.field_108336_f;
   }

   public C_100516_abo(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_108341_a = var1;
      this.field_108339_b = var2;
      this.field_108340_c = var3;
      this.field_108337_d = var4;
      this.field_108338_e = var5;
      this.field_108336_f = var6;
   }

   public C_100516_abo(int var1, int var2, int var3, int var4) {
      this.field_108341_a = var1;
      this.field_108340_c = var2;
      this.field_108337_d = var3;
      this.field_108336_f = var4;
      this.field_108339_b = 1;
      this.field_108338_e = 512;
   }

   public boolean func_108333_a(C_100516_abo var1) {
      return this.field_108337_d >= var1.field_108341_a && this.field_108341_a <= var1.field_108337_d && this.field_108336_f >= var1.field_108340_c && this.field_108340_c <= var1.field_108336_f && this.field_108338_e >= var1.field_108339_b && this.field_108339_b <= var1.field_108338_e;
   }

   public boolean func_108330_a(int var1, int var2, int var3, int var4) {
      return this.field_108337_d >= var1 && this.field_108341_a <= var3 && this.field_108336_f >= var2 && this.field_108340_c <= var4;
   }

   public void func_108327_b(C_100516_abo var1) {
      this.field_108341_a = Math.min(this.field_108341_a, var1.field_108341_a);
      this.field_108339_b = Math.min(this.field_108339_b, var1.field_108339_b);
      this.field_108340_c = Math.min(this.field_108340_c, var1.field_108340_c);
      this.field_108337_d = Math.max(this.field_108337_d, var1.field_108337_d);
      this.field_108338_e = Math.max(this.field_108338_e, var1.field_108338_e);
      this.field_108336_f = Math.max(this.field_108336_f, var1.field_108336_f);
   }

   public void func_108331_a(int var1, int var2, int var3) {
      this.field_108341_a += var1;
      this.field_108339_b += var2;
      this.field_108340_c += var3;
      this.field_108337_d += var1;
      this.field_108338_e += var2;
      this.field_108336_f += var3;
   }

   public boolean func_108334_b(int var1, int var2, int var3) {
      return var1 >= this.field_108341_a && var1 <= this.field_108337_d && var3 >= this.field_108340_c && var3 <= this.field_108336_f && var2 >= this.field_108339_b && var2 <= this.field_108338_e;
   }

   public int func_108329_b() {
      return this.field_108337_d - this.field_108341_a + 1;
   }

   public int func_108328_c() {
      return this.field_108338_e - this.field_108339_b + 1;
   }

   public int func_108325_d() {
      return this.field_108336_f - this.field_108340_c + 1;
   }

   public int func_108326_e() {
      return this.field_108341_a + (this.field_108337_d - this.field_108341_a + 1) / 2;
   }

   public int func_108323_f() {
      return this.field_108339_b + (this.field_108338_e - this.field_108339_b + 1) / 2;
   }

   public int func_108335_g() {
      return this.field_108340_c + (this.field_108336_f - this.field_108340_c + 1) / 2;
   }

   public String toString() {
      return "(" + this.field_108341_a + ", " + this.field_108339_b + ", " + this.field_108340_c + "; " + this.field_108337_d + ", " + this.field_108338_e + ", " + this.field_108336_f + ")";
   }
}
