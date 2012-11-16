import java.util.ArrayList;
import java.util.Random;

public class C_100691_aen extends C_100697_aes {

   public final C_101311_ye field_108432_a;
   public final boolean field_108430_b;
   public final int field_108431_c;
   public C_100719_aeh field_108429_d;
   public ArrayList field_108434_h;
   public ArrayList field_108435_i = new ArrayList();
   public ArrayList field_108433_j = new ArrayList();


   public C_100691_aen(C_101311_ye var1, int var2, Random var3, int var4, int var5, ArrayList var6, int var7) {
      super((C_100691_aen)null, 0, var3, var4, var5);
      this.field_108432_a = var1;
      this.field_108434_h = var6;
      this.field_108431_c = var7;
      C_101324_xz var8 = var1.func_112524_a(var4, var5);
      this.field_108430_b = var8 == C_101324_xz.field_112491_d || var8 == C_101324_xz.field_112508_s;
      this.field_108419_k = this;
   }

   public C_101311_ye func_108428_d() {
      return this.field_108432_a;
   }
}
