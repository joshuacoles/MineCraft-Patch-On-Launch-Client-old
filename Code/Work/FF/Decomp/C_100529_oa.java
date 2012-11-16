
public class C_100529_oa {

   public final int field_108602_a;
   public final int field_108600_b;
   public final int field_108601_c;
   public final int field_108598_d;
   public final int field_108599_e;
   public int field_108596_f;
   public boolean field_108597_g = false;
   private int field_108603_h = 0;


   public C_100529_oa(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_108602_a = var1;
      this.field_108600_b = var2;
      this.field_108601_c = var3;
      this.field_108598_d = var4;
      this.field_108599_e = var5;
      this.field_108596_f = var6;
   }

   public int func_108595_b(int var1, int var2, int var3) {
      int var4 = var1 - this.field_108602_a;
      int var5 = var2 - this.field_108600_b;
      int var6 = var3 - this.field_108601_c;
      return var4 * var4 + var5 * var5 + var6 * var6;
   }

   public int func_108590_c(int var1, int var2, int var3) {
      int var4 = var1 - this.field_108602_a - this.field_108598_d;
      int var5 = var2 - this.field_108600_b;
      int var6 = var3 - this.field_108601_c - this.field_108599_e;
      return var4 * var4 + var5 * var5 + var6 * var6;
   }

   public int func_108592_a() {
      return this.field_108602_a + this.field_108598_d;
   }

   public int func_108594_b() {
      return this.field_108600_b;
   }

   public int func_108593_c() {
      return this.field_108601_c + this.field_108599_e;
   }

   public boolean func_108588_a(int var1, int var2) {
      int var3 = var1 - this.field_108602_a;
      int var4 = var2 - this.field_108601_c;
      return var3 * this.field_108598_d + var4 * this.field_108599_e >= 0;
   }

   public void func_108587_d() {
      this.field_108603_h = 0;
   }

   public void func_108591_e() {
      ++this.field_108603_h;
   }

   public int func_108589_f() {
      return this.field_108603_h;
   }
}
