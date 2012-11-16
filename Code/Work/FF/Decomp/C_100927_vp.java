
public class C_100927_vp {

   private Object[][] field_110735_a;


   public C_100927_vp() {
      this.field_110735_a = new Object[][]{{C_100451_alf.field_106224_ak, new C_100994_tv(C_100992_tt.field_110853_p, 9)}, {C_100451_alf.field_106226_al, new C_100994_tv(C_100992_tt.field_110839_o, 9)}, {C_100451_alf.field_106193_aA, new C_100994_tv(C_100992_tt.field_110838_n, 9)}, {C_100451_alf.field_106215_bY, new C_100994_tv(C_100992_tt.field_110965_bH, 9)}, {C_100451_alf.field_106093_R, new C_100994_tv(C_100992_tt.field_110904_aW, 9, 4)}};
   }

   public void func_110734_a(C_100929_vq var1) {
      Object[][] var2 = this.field_110735_a;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Object[] var5 = var2[var4];
         C_100451_alf var6 = (C_100451_alf)var5[0];
         C_100994_tv var7 = (C_100994_tv)var5[1];
         var1.func_110739_a(new C_100994_tv(var6), new Object[]{"###", "###", "###", Character.valueOf('#'), var7});
         var1.func_110739_a(var7, new Object[]{"#", Character.valueOf('#'), var6});
      }

      var1.func_110739_a(new C_100994_tv(C_100992_tt.field_110853_p), new Object[]{"###", "###", "###", Character.valueOf('#'), C_100992_tt.field_110871_bq});
      var1.func_110739_a(new C_100994_tv(C_100992_tt.field_110871_bq, 9), new Object[]{"#", Character.valueOf('#'), C_100992_tt.field_110853_p});
   }
}
