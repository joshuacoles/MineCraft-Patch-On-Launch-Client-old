
public class C_101274_yy {

   public final byte[] field_112360_a;
   private final int field_112358_b;
   private final int field_112359_c;


   public C_101274_yy(int var1, int var2) {
      this.field_112360_a = new byte[var1 >> 1];
      this.field_112358_b = var2;
      this.field_112359_c = var2 + 4;
   }

   public C_101274_yy(byte[] var1, int var2) {
      this.field_112360_a = var1;
      this.field_112358_b = var2;
      this.field_112359_c = var2 + 4;
   }

   public int func_112357_a(int var1, int var2, int var3) {
      int var4 = var2 << this.field_112359_c | var3 << this.field_112358_b | var1;
      int var5 = var4 >> 1;
      int var6 = var4 & 1;
      return var6 == 0?this.field_112360_a[var5] & 15:this.field_112360_a[var5] >> 4 & 15;
   }

   public void func_112356_a(int var1, int var2, int var3, int var4) {
      int var5 = var2 << this.field_112359_c | var3 << this.field_112358_b | var1;
      int var6 = var5 >> 1;
      int var7 = var5 & 1;
      if(var7 == 0) {
         this.field_112360_a[var6] = (byte)(this.field_112360_a[var6] & 240 | var4 & 15);
      } else {
         this.field_112360_a[var6] = (byte)(this.field_112360_a[var6] & 15 | (var4 & 15) << 4);
      }

   }
}
