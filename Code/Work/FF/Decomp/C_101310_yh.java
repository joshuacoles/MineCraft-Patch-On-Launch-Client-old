import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class C_101310_yh extends C_101311_ye {

   private C_101324_xz field_112532_d;
   private float field_112533_e;
   private float field_112531_f;


   public C_101310_yh(C_101324_xz var1, float var2, float var3) {
      this.field_112532_d = var1;
      this.field_112533_e = var2;
      this.field_112531_f = var3;
   }

   public C_101324_xz func_112524_a(int var1, int var2) {
      return this.field_112532_d;
   }

   public C_101324_xz[] func_112522_a(C_101324_xz[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new C_101324_xz[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.field_112532_d);
      return var1;
   }

   public float[] func_112519_b(float[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.field_112533_e);
      return var1;
   }

   public float[] func_112520_a(float[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.field_112531_f);
      return var1;
   }

   public C_101324_xz[] func_112526_b(C_101324_xz[] var1, int var2, int var3, int var4, int var5) {
      if(var1 == null || var1.length < var4 * var5) {
         var1 = new C_101324_xz[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.field_112532_d);
      return var1;
   }

   public C_101324_xz[] func_112518_a(C_101324_xz[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      return this.func_112526_b(var1, var2, var3, var4, var5);
   }

   public C_100851_xw func_112517_a(int var1, int var2, int var3, List var4, Random var5) {
      return var4.contains(this.field_112532_d)?new C_100851_xw(var1 - var3 + var5.nextInt(var3 * 2 + 1), 0, var2 - var3 + var5.nextInt(var3 * 2 + 1)):null;
   }

   public boolean func_112525_a(int var1, int var2, int var3, List var4) {
      return var4.contains(this.field_112532_d);
   }
}
