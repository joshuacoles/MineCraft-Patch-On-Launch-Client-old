
public class C_100684_afw extends C_100681_afu {

   public C_100684_afw(long var1, C_100681_afu var3) {
      super(var1);
      this.field_107318_a = var3;
   }

   public int[] func_107313_a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.field_107318_a.func_107313_a(var1, var2, var3, var4);
      int[] var6 = C_100657_afs.func_108972_a(var3 * var4);

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            this.func_107312_a((long)(var8 + var1), (long)(var7 + var2));
            var6[var8 + var7 * var3] = var5[var8 + var7 * var3] > 0?this.func_107311_a(2) + 2:0;
         }
      }

      return var6;
   }
}
