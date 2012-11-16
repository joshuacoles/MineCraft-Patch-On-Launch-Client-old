
public class C_100647_afn extends C_100681_afu {

   private C_101324_xz[] field_107322_b;


   public C_100647_afn(long var1, C_100681_afu var3, C_100845_xp var4) {
      super(var1);
      this.field_107322_b = new C_101324_xz[]{C_101324_xz.field_112491_d, C_101324_xz.field_112489_f, C_101324_xz.field_112492_e, C_101324_xz.field_112502_h, C_101324_xz.field_112494_c, C_101324_xz.field_112490_g, C_101324_xz.field_112504_w};
      this.field_107318_a = var3;
      if(var4 == C_100845_xp.field_110157_e) {
         this.field_107322_b = new C_101324_xz[]{C_101324_xz.field_112491_d, C_101324_xz.field_112489_f, C_101324_xz.field_112492_e, C_101324_xz.field_112502_h, C_101324_xz.field_112494_c, C_101324_xz.field_112490_g};
      }

   }

   public int[] func_107313_a(int var1, int var2, int var3, int var4) {
      int[] var5 = this.field_107318_a.func_107313_a(var1, var2, var3, var4);
      int[] var6 = C_100657_afs.func_108972_a(var3 * var4);

      for(int var7 = 0; var7 < var4; ++var7) {
         for(int var8 = 0; var8 < var3; ++var8) {
            this.func_107312_a((long)(var8 + var1), (long)(var7 + var2));
            int var9 = var5[var8 + var7 * var3];
            if(var9 == 0) {
               var6[var8 + var7 * var3] = 0;
            } else if(var9 == C_101324_xz.field_112511_p.field_112478_N) {
               var6[var8 + var7 * var3] = var9;
            } else if(var9 == 1) {
               var6[var8 + var7 * var3] = this.field_107322_b[this.func_107311_a(this.field_107322_b.length)].field_112478_N;
            } else {
               int var10 = this.field_107322_b[this.func_107311_a(this.field_107322_b.length)].field_112478_N;
               if(var10 == C_101324_xz.field_112490_g.field_112478_N) {
                  var6[var8 + var7 * var3] = var10;
               } else {
                  var6[var8 + var7 * var3] = C_101324_xz.field_112496_n.field_112478_N;
               }
            }
         }
      }

      return var6;
   }
}
