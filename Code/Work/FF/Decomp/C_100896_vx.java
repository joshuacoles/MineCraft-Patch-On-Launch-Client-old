
public class C_100896_vx {

   private String[][] field_110677_a = new String[][]{{"X", "X", "#"}};
   private Object[][] field_110676_b;


   public C_100896_vx() {
      this.field_110676_b = new Object[][]{{C_100451_alf.field_106075_A, C_100451_alf.field_106119_z, C_100992_tt.field_110839_o, C_100992_tt.field_110838_n, C_100992_tt.field_110853_p}, {C_100992_tt.field_110851_r, C_100992_tt.field_110847_v, C_100992_tt.field_110852_q, C_100992_tt.field_110854_z, C_100992_tt.field_110808_G}};
   }

   public void func_110675_a(C_100929_vq var1) {
      for(int var2 = 0; var2 < this.field_110676_b[0].length; ++var2) {
         Object var3 = this.field_110676_b[0][var2];

         for(int var4 = 0; var4 < this.field_110676_b.length - 1; ++var4) {
            C_100992_tt var5 = (C_100992_tt)this.field_110676_b[var4 + 1][var2];
            var1.func_110739_a(new C_100994_tv(var5), new Object[]{this.field_110677_a[var4], Character.valueOf('#'), C_100992_tt.field_110805_D, Character.valueOf('X'), var3});
         }
      }

      var1.func_110739_a(new C_100994_tv(C_100992_tt.field_110843_k, 1), new Object[]{" #X", "# X", " #X", Character.valueOf('X'), C_100992_tt.field_110819_K, Character.valueOf('#'), C_100992_tt.field_110805_D});
      var1.func_110739_a(new C_100994_tv(C_100992_tt.field_110840_l, 4), new Object[]{"X", "#", "Y", Character.valueOf('Y'), C_100992_tt.field_110812_L, Character.valueOf('X'), C_100992_tt.field_110952_ap, Character.valueOf('#'), C_100992_tt.field_110805_D});
   }
}
