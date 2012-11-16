
public class C_101267_zc {

   public final byte[] field_112283_a;
   private final int field_112281_b;
   private final int field_112282_c;


   public C_101267_zc(byte[] var1, int var2) {
      this.field_112283_a = var1;
      this.field_112281_b = var2;
      this.field_112282_c = var2 + 4;
   }

   public int func_112280_a(int var1, int var2, int var3) {
      int var4 = var1 << this.field_112282_c | var3 << this.field_112281_b | var2;
      int var5 = var4 >> 1;
      int var6 = var4 & 1;
      return var6 == 0?this.field_112283_a[var5] & 15:this.field_112283_a[var5] >> 4 & 15;
   }
}
