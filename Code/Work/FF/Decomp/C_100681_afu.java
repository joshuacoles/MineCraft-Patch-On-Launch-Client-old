
public abstract class C_100681_afu {

   private long field_107316_b;
   protected C_100681_afu field_107318_a;
   private long field_107317_c;
   private long field_107315_d;


   public static C_100681_afu[] func_107310_a(long var0, C_100845_xp var2) {
      C_100655_aft var3 = new C_100655_aft(1L);
      C_100652_afr var9 = new C_100652_afr(2000L, var3);
      C_100671_afk var10 = new C_100671_afk(1L, var9);
      C_100288_agg var11 = new C_100288_agg(2001L, var10);
      var10 = new C_100671_afk(2L, var11);
      C_100648_afm var12 = new C_100648_afm(2L, var10);
      var11 = new C_100288_agg(2002L, var12);
      var10 = new C_100671_afk(3L, var11);
      var11 = new C_100288_agg(2003L, var10);
      var10 = new C_100671_afk(4L, var11);
      C_100670_afl var16 = new C_100670_afl(5L, var10);
      byte var4 = 4;
      if(var2 == C_100845_xp.field_110156_d) {
         var4 = 6;
      }

      C_100681_afu var5 = C_100288_agg.func_107320_a(1000L, var16, 0);
      C_100684_afw var13 = new C_100684_afw(100L, var5);
      var5 = C_100288_agg.func_107320_a(1000L, var13, var4 + 2);
      C_100685_afx var14 = new C_100685_afx(1L, var5);
      C_100674_aga var15 = new C_100674_aga(1000L, var14);
      C_100681_afu var6 = C_100288_agg.func_107320_a(1000L, var16, 0);
      C_100647_afn var17 = new C_100647_afn(200L, var6, var2);
      var6 = C_100288_agg.func_107320_a(1000L, var17, 2);
      Object var18 = new C_100682_afv(1000L, var6);

      for(int var7 = 0; var7 < var4; ++var7) {
         var18 = new C_100288_agg((long)(1000 + var7), (C_100681_afu)var18);
         if(var7 == 0) {
            var18 = new C_100671_afk(3L, (C_100681_afu)var18);
         }

         if(var7 == 1) {
            var18 = new C_100687_afz(1000L, (C_100681_afu)var18);
         }

         if(var7 == 1) {
            var18 = new C_100677_agc(1000L, (C_100681_afu)var18);
         }
      }

      C_100674_aga var19 = new C_100674_aga(1000L, (C_100681_afu)var18);
      C_100686_afy var20 = new C_100686_afy(100L, var19, var15);
      C_100286_agf var8 = new C_100286_agf(10L, var20);
      var20.func_107314_a(var0);
      var8.func_107314_a(var0);
      return new C_100681_afu[]{var20, var8, var20};
   }

   public C_100681_afu(long var1) {
      this.field_107315_d = var1;
      this.field_107315_d *= this.field_107315_d * 6364136223846793005L + 1442695040888963407L;
      this.field_107315_d += var1;
      this.field_107315_d *= this.field_107315_d * 6364136223846793005L + 1442695040888963407L;
      this.field_107315_d += var1;
      this.field_107315_d *= this.field_107315_d * 6364136223846793005L + 1442695040888963407L;
      this.field_107315_d += var1;
   }

   public void func_107314_a(long var1) {
      this.field_107316_b = var1;
      if(this.field_107318_a != null) {
         this.field_107318_a.func_107314_a(var1);
      }

      this.field_107316_b *= this.field_107316_b * 6364136223846793005L + 1442695040888963407L;
      this.field_107316_b += this.field_107315_d;
      this.field_107316_b *= this.field_107316_b * 6364136223846793005L + 1442695040888963407L;
      this.field_107316_b += this.field_107315_d;
      this.field_107316_b *= this.field_107316_b * 6364136223846793005L + 1442695040888963407L;
      this.field_107316_b += this.field_107315_d;
   }

   public void func_107312_a(long var1, long var3) {
      this.field_107317_c = this.field_107316_b;
      this.field_107317_c *= this.field_107317_c * 6364136223846793005L + 1442695040888963407L;
      this.field_107317_c += var1;
      this.field_107317_c *= this.field_107317_c * 6364136223846793005L + 1442695040888963407L;
      this.field_107317_c += var3;
      this.field_107317_c *= this.field_107317_c * 6364136223846793005L + 1442695040888963407L;
      this.field_107317_c += var1;
      this.field_107317_c *= this.field_107317_c * 6364136223846793005L + 1442695040888963407L;
      this.field_107317_c += var3;
   }

   protected int func_107311_a(int var1) {
      int var2 = (int)((this.field_107317_c >> 24) % (long)var1);
      if(var2 < 0) {
         var2 += var1;
      }

      this.field_107317_c *= this.field_107317_c * 6364136223846793005L + 1442695040888963407L;
      this.field_107317_c += this.field_107316_b;
      return var2;
   }

   public abstract int[] func_107313_a(int var1, int var2, int var3, int var4);
}
