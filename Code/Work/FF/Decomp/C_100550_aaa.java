import java.util.Random;

public class C_100550_aaa {

   protected int field_108346_a = 8;
   protected Random field_108344_b = new Random();
   protected C_100873_xe field_108345_c;


   public void func_108342_a(C_101331_yx var1, C_100873_xe var2, int var3, int var4, byte[] var5) {
      int var6 = this.field_108346_a;
      this.field_108345_c = var2;
      this.field_108344_b.setSeed(var2.func_109374_D());
      long var7 = this.field_108344_b.nextLong();
      long var9 = this.field_108344_b.nextLong();

      for(int var11 = var3 - var6; var11 <= var3 + var6; ++var11) {
         for(int var12 = var4 - var6; var12 <= var4 + var6; ++var12) {
            long var13 = (long)var11 * var7;
            long var15 = (long)var12 * var9;
            this.field_108344_b.setSeed(var13 ^ var15 ^ var2.func_109374_D());
            this.func_108343_a(var2, var11, var12, var3, var4, var5);
         }
      }

   }

   protected void func_108343_a(C_100873_xe var1, int var2, int var3, int var4, int var5, byte[] var6) {}
}
