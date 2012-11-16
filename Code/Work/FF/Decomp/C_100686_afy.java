
public class C_100686_afy extends C_100681_afu {

   private C_100681_afu field_107325_b;
   private C_100681_afu field_107326_c;


   public C_100686_afy(long var1, C_100681_afu var3, C_100681_afu var4) {
      super(var1);
      this.field_107325_b = var3;
      this.field_107326_c = var4;
   }

   public void func_107314_a(long var1) {
      this.field_107325_b.func_107314_a(var1);
      this.field_107326_c.func_107314_a(var1);
      super.func_107314_a(var1);
   }

   public int[] func_107313_a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.field_107325_b.func_107313_a(var1, var2, var3, var4);
      int[] var6 = this.field_107326_c.func_107313_a(var1, var2, var3, var4);
      int[] var7 = C_100657_afs.func_108972_a(var3 * var4);

      for(int var8 = 0; var8 < var3 * var4; ++var8) {
         if(var5[var8] == C_101324_xz.field_112493_b.field_112478_N) {
            var7[var8] = var5[var8];
         } else if(var6[var8] >= 0) {
            if(var5[var8] == C_101324_xz.field_112496_n.field_112478_N) {
               var7[var8] = C_101324_xz.field_112499_m.field_112478_N;
            } else if(var5[var8] != C_101324_xz.field_112511_p.field_112478_N && var5[var8] != C_101324_xz.field_112510_q.field_112478_N) {
               var7[var8] = var6[var8];
            } else {
               var7[var8] = C_101324_xz.field_112510_q.field_112478_N;
            }
         } else {
            var7[var8] = var5[var8];
         }
      }

      return var7;
   }
}
