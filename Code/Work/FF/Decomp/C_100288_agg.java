
public class C_100288_agg extends C_100681_afu {

   public C_100288_agg(long var1, C_100681_afu var3) {
      super(var1);
      super.field_107318_a = var3;
   }

   public int[] func_107313_a(int var1, int var2, int var3, int var4) {
      int var5 = var1 >> 1;
      int var6 = var2 >> 1;
      int var7 = (var3 >> 1) + 3;
      int var8 = (var4 >> 1) + 3;
      int[] var9 = this.field_107318_a.func_107313_a(var5, var6, var7, var8);
      int[] var10 = C_100657_afs.func_108972_a(var7 * 2 * var8 * 2);
      int var11 = var7 << 1;

      int var13;
      for(int var12 = 0; var12 < var8 - 1; ++var12) {
         var13 = var12 << 1;
         int var14 = var13 * var11;
         int var15 = var9[0 + (var12 + 0) * var7];
         int var16 = var9[0 + (var12 + 1) * var7];

         for(int var17 = 0; var17 < var7 - 1; ++var17) {
            this.func_107312_a((long)(var17 + var5 << 1), (long)(var12 + var6 << 1));
            int var18 = var9[var17 + 1 + (var12 + 0) * var7];
            int var19 = var9[var17 + 1 + (var12 + 1) * var7];
            var10[var14] = var15;
            var10[var14++ + var11] = this.func_107321_a(var15, var16);
            var10[var14] = this.func_107321_a(var15, var18);
            var10[var14++ + var11] = this.func_107319_b(var15, var18, var16, var19);
            var15 = var18;
            var16 = var19;
         }
      }

      int[] var20 = C_100657_afs.func_108972_a(var3 * var4);

      for(var13 = 0; var13 < var4; ++var13) {
         System.arraycopy(var10, (var13 + (var2 & 1)) * (var7 << 1) + (var1 & 1), var20, var13 * var3, var3);
      }

      return var20;
   }

   protected int func_107321_a(int var1, int var2) {
      return this.func_107311_a(2) == 0?var1:var2;
   }

   protected int func_107319_b(int var1, int var2, int var3, int var4) {
      if(var2 == var3 && var3 == var4) {
         return var2;
      } else if(var1 == var2 && var1 == var3) {
         return var1;
      } else if(var1 == var2 && var1 == var4) {
         return var1;
      } else if(var1 == var3 && var1 == var4) {
         return var1;
      } else if(var1 == var2 && var3 != var4) {
         return var1;
      } else if(var1 == var3 && var2 != var4) {
         return var1;
      } else if(var1 == var4 && var2 != var3) {
         return var1;
      } else if(var2 == var1 && var3 != var4) {
         return var2;
      } else if(var2 == var3 && var1 != var4) {
         return var2;
      } else if(var2 == var4 && var1 != var3) {
         return var2;
      } else if(var3 == var1 && var2 != var4) {
         return var3;
      } else if(var3 == var2 && var1 != var4) {
         return var3;
      } else if(var3 == var4 && var1 != var2) {
         return var3;
      } else if(var4 == var1 && var2 != var3) {
         return var3;
      } else if(var4 == var2 && var1 != var3) {
         return var3;
      } else if(var4 == var3 && var1 != var2) {
         return var3;
      } else {
         int var5 = this.func_107311_a(4);
         return var5 == 0?var1:(var5 == 1?var2:(var5 == 2?var3:var4));
      }
   }

   public static C_100681_afu func_107320_a(long var0, C_100681_afu var2, int var3) {
      Object var4 = var2;

      for(int var5 = 0; var5 < var3; ++var5) {
         var4 = new C_100288_agg(var0 + (long)var5, (C_100681_afu)var4);
      }

      return (C_100681_afu)var4;
   }
}
