
public class C_100851_xw {

   public final int field_110207_a;
   public final int field_110205_b;
   public final int field_110206_c;


   public C_100851_xw(int var1, int var2, int var3) {
      this.field_110207_a = var1;
      this.field_110205_b = var2;
      this.field_110206_c = var3;
   }

   public C_100851_xw(C_100387_amw var1) {
      this(C_100650_jv.func_108910_c(var1.field_107872_c), C_100650_jv.func_108910_c(var1.field_107869_d), C_100650_jv.func_108910_c(var1.field_107870_e));
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof C_100851_xw)) {
         return false;
      } else {
         C_100851_xw var2 = (C_100851_xw)var1;
         return var2.field_110207_a == this.field_110207_a && var2.field_110205_b == this.field_110205_b && var2.field_110206_c == this.field_110206_c;
      }
   }

   public int hashCode() {
      return this.field_110207_a * 8976890 + this.field_110205_b * 981131 + this.field_110206_c;
   }
}
