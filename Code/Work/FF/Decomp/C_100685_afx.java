
public class C_100685_afx extends C_100681_afu {

   public C_100685_afx(long var1, C_100681_afu var3) {
      super(var1);
      super.field_107318_a = var3;
   }

   public int[] func_107313_a(int var1, int var2, int var3, int var4) {
      int var5 = var1 - 1;
      int var6 = var2 - 1;
      int var7 = var3 + 2;
      int var8 = var4 + 2;
      int[] var9 = this.field_107318_a.func_107313_a(var5, var6, var7, var8);
      int[] var10 = C_100657_afs.func_108972_a(var3 * var4);

      for(int var11 = 0; var11 < var4; ++var11) {
         for(int var12 = 0; var12 < var3; ++var12) {
            int var13 = var9[var12 + 0 + (var11 + 1) * var7];
            int var14 = var9[var12 + 2 + (var11 + 1) * var7];
            int var15 = var9[var12 + 1 + (var11 + 0) * var7];
            int var16 = var9[var12 + 1 + (var11 + 2) * var7];
            int var17 = var9[var12 + 1 + (var11 + 1) * var7];
            if(var17 != 0 && var13 != 0 && var14 != 0 && var15 != 0 && var16 != 0 && var17 == var13 && var17 == var15 && var17 == var14 && var17 == var16) {
               var10[var12 + var11 * var3] = -1;
            } else {
               var10[var12 + var11 * var3] = C_101324_xz.field_112503_i.field_112478_N;
            }
         }
      }

      return var10;
   }
}
