
public class C_100292_agi {

   public final int field_107346_a;
   public final int field_107344_b;
   public final int field_107345_c;
   private final int field_107347_j;
   int field_107342_d = -1;
   float field_107343_e;
   float field_107340_f;
   float field_107341_g;
   C_100292_agi field_107348_h;
   public boolean field_107349_i = false;


   public C_100292_agi(int var1, int var2, int var3) {
      this.field_107346_a = var1;
      this.field_107344_b = var2;
      this.field_107345_c = var3;
      this.field_107347_j = func_107336_a(var1, var2, var3);
   }

   public static int func_107336_a(int var0, int var1, int var2) {
      return var1 & 255 | (var0 & 32767) << 8 | (var2 & 32767) << 24 | (var0 < 0?Integer.MIN_VALUE:0) | (var2 < 0?'\u8000':0);
   }

   public float func_107339_a(C_100292_agi var1) {
      float var2 = (float)(var1.field_107346_a - this.field_107346_a);
      float var3 = (float)(var1.field_107344_b - this.field_107344_b);
      float var4 = (float)(var1.field_107345_c - this.field_107345_c);
      return C_100650_jv.func_108913_c(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public float func_107338_b(C_100292_agi var1) {
      float var2 = (float)(var1.field_107346_a - this.field_107346_a);
      float var3 = (float)(var1.field_107344_b - this.field_107344_b);
      float var4 = (float)(var1.field_107345_c - this.field_107345_c);
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof C_100292_agi)) {
         return false;
      } else {
         C_100292_agi var2 = (C_100292_agi)var1;
         return this.field_107347_j == var2.field_107347_j && this.field_107346_a == var2.field_107346_a && this.field_107344_b == var2.field_107344_b && this.field_107345_c == var2.field_107345_c;
      }
   }

   public int hashCode() {
      return this.field_107347_j;
   }

   public boolean func_107337_a() {
      return this.field_107342_d >= 0;
   }

   public String toString() {
      return this.field_107346_a + ", " + this.field_107344_b + ", " + this.field_107345_c;
   }
}
