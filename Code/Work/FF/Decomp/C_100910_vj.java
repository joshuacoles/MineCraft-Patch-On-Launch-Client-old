
public class C_100910_vj {

   private String[][] field_110718_a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
   private Object[][] field_110717_b;


   public C_100910_vj() {
      this.field_110717_b = new Object[][]{{C_100992_tt.field_110918_aF, C_100451_alf.field_106222_au, C_100992_tt.field_110839_o, C_100992_tt.field_110838_n, C_100992_tt.field_110853_p}, {C_100992_tt.field_110823_V, C_100992_tt.field_110830_Z, C_100992_tt.field_110960_ad, C_100992_tt.field_110968_ah, C_100992_tt.field_110944_al}, {C_100992_tt.field_110822_W, C_100992_tt.field_110962_aa, C_100992_tt.field_110970_ae, C_100992_tt.field_110946_ai, C_100992_tt.field_110954_am}, {C_100992_tt.field_110829_X, C_100992_tt.field_110964_ab, C_100992_tt.field_110972_af, C_100992_tt.field_110948_aj, C_100992_tt.field_110956_an}, {C_100992_tt.field_110828_Y, C_100992_tt.field_110958_ac, C_100992_tt.field_110966_ag, C_100992_tt.field_110942_ak, C_100992_tt.field_110950_ao}};
   }

   public void func_110716_a(C_100929_vq var1) {
      for(int var2 = 0; var2 < this.field_110717_b[0].length; ++var2) {
         Object var3 = this.field_110717_b[0][var2];

         for(int var4 = 0; var4 < this.field_110717_b.length - 1; ++var4) {
            C_100992_tt var5 = (C_100992_tt)this.field_110717_b[var4 + 1][var2];
            var1.func_110739_a(new C_100994_tv(var5), new Object[]{this.field_110718_a[var4], Character.valueOf('X'), var3});
         }
      }

   }
}
