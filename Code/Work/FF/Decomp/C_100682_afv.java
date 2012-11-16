
public class C_100682_afv extends C_100681_afu {

   public C_100682_afv(long var1, C_100681_afu var3) {
      super(var1);
      this.field_107318_a = var3;
   }

   public int[] func_107313_a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.field_107318_a.func_107313_a(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      int[] var6 = C_100657_afs.func_108972_a(var3 * var4);

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            this.func_107312_a((long)(var8 + var1), (long)(var7 + var2));
            int var9 = var5[var8 + 1 + (var7 + 1) * (var3 + 2)];
            if(this.func_107311_a(3) == 0) {
               int var10 = var9;
               if(var9 == C_101324_xz.field_112491_d.field_112478_N) {
                  var10 = C_101324_xz.field_112508_s.field_112478_N;
               } else if(var9 == C_101324_xz.field_112489_f.field_112478_N) {
                  var10 = C_101324_xz.field_112507_t.field_112478_N;
               } else if(var9 == C_101324_xz.field_112490_g.field_112478_N) {
                  var10 = C_101324_xz.field_112506_u.field_112478_N;
               } else if(var9 == C_101324_xz.field_112494_c.field_112478_N) {
                  var10 = C_101324_xz.field_112489_f.field_112478_N;
               } else if(var9 == C_101324_xz.field_112496_n.field_112478_N) {
                  var10 = C_101324_xz.field_112497_o.field_112478_N;
               } else if(var9 == C_101324_xz.field_112504_w.field_112478_N) {
                  var10 = C_101324_xz.field_112514_x.field_112478_N;
               }

               if(var10 == var9) {
                  var6[var8 + var7 * var3] = var9;
               } else {
                  int var11 = var5[var8 + 1 + (var7 + 1 - 1) * (var3 + 2)];
                  int var12 = var5[var8 + 1 + 1 + (var7 + 1) * (var3 + 2)];
                  int var13 = var5[var8 + 1 - 1 + (var7 + 1) * (var3 + 2)];
                  int var14 = var5[var8 + 1 + (var7 + 1 + 1) * (var3 + 2)];
                  if(var11 == var9 && var12 == var9 && var13 == var9 && var14 == var9) {
                     var6[var8 + var7 * var3] = var10;
                  } else {
                     var6[var8 + var7 * var3] = var9;
                  }
               }
            } else {
               var6[var8 + var7 * var3] = var9;
            }
         }
      }

      return var6;
   }
}
