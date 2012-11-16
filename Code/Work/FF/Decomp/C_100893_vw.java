
public class C_100893_vw {

   private String[][] field_110673_a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
   private Object[][] field_110672_b;


   public C_100893_vw() {
      this.field_110672_b = new Object[][]{{C_100451_alf.field_106075_A, C_100451_alf.field_106119_z, C_100992_tt.field_110839_o, C_100992_tt.field_110838_n, C_100992_tt.field_110853_p}, {C_100992_tt.field_110849_t, C_100992_tt.field_110856_x, C_100992_tt.field_110832_g, C_100992_tt.field_110810_B, C_100992_tt.field_110817_I}, {C_100992_tt.field_110850_s, C_100992_tt.field_110846_w, C_100992_tt.field_110831_f, C_100992_tt.field_110809_A, C_100992_tt.field_110816_H}, {C_100992_tt.field_110848_u, C_100992_tt.field_110855_y, C_100992_tt.field_110844_h, C_100992_tt.field_110811_C, C_100992_tt.field_110818_J}, {C_100992_tt.field_110814_N, C_100992_tt.field_110815_O, C_100992_tt.field_110825_P, C_100992_tt.field_110824_Q, C_100992_tt.field_110827_R}};
   }

   public void func_110671_a(C_100929_vq var1) {
      for(int var2 = 0; var2 < this.field_110672_b[0].length; ++var2) {
         Object var3 = this.field_110672_b[0][var2];

         for(int var4 = 0; var4 < this.field_110672_b.length - 1; ++var4) {
            C_100992_tt var5 = (C_100992_tt)this.field_110672_b[var4 + 1][var2];
            var1.func_110739_a(new C_100994_tv(var5), new Object[]{this.field_110673_a[var4], Character.valueOf('#'), C_100992_tt.field_110805_D, Character.valueOf('X'), var3});
         }
      }

      var1.func_110739_a(new C_100994_tv(C_100992_tt.field_110883_be), new Object[]{" #", "# ", Character.valueOf('#'), C_100992_tt.field_110839_o});
   }
}
