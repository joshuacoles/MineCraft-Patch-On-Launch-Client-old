
public class C_101021_th extends C_101037_sp {

   protected C_101021_th(int var1) {
      super(var1);
      this.func_110802_a(C_101040_sq.field_111413_f);
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      C_100994_tv var4 = new C_100994_tv(C_100992_tt.field_110882_bd, 1, var2.func_109400_b("map"));
      String var5 = "map_" + var4.func_111367_j();
      C_100282_agl var6 = new C_100282_agl(var5);
      var2.func_109468_a(var5, var6);
      var6.field_107294_d = 0;
      int var7 = 128 * (1 << var6.field_107294_d);
      var6.field_107298_a = (int)(Math.round(var3.field_103221_t / (double)var7) * (long)var7);
      var6.field_107296_b = (int)(Math.round(var3.field_103217_v / (double)var7) * (long)var7);
      var6.field_107297_c = (byte)var2.field_109576_v.field_112401_h;
      var6.func_107264_c();
      --var1.field_111398_a;
      if(var1.field_111398_a <= 0) {
         return var4;
      } else {
         if(!var3.field_103857_bK.func_104809_a(var4.func_111360_l())) {
            var3.func_103767_c(var4);
         }

         return var1;
      }
   }
}
