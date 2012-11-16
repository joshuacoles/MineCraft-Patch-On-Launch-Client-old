
public class C_100457_aq implements C_100453_as {

   public final C_100994_tv func_105944_a(C_100471_ao var1, C_100994_tv var2) {
      C_100994_tv var3 = this.func_105949_b(var1, var2);
      this.func_105952_a(var1);
      this.func_105950_a(var1, C_100462_au.func_107949_a(var1.func_107935_h()));
      return var3;
   }

   protected C_100994_tv func_105949_b(C_100471_ao var1, C_100994_tv var2) {
      C_100462_au var3 = C_100462_au.func_107949_a(var1.func_107935_h());
      C_100459_ax var4 = C_100190_ail.func_106331_a(var1);
      C_100994_tv var5 = var2.func_111342_a(1);
      func_105951_a(var1.func_107933_k(), var5, 6, var3, var4);
      return var2;
   }

   public static void func_105951_a(C_100873_xe var0, C_100994_tv var1, int var2, C_100462_au var3, C_100459_ax var4) {
      double var5 = var4.func_107930_a();
      double var7 = var4.func_107932_b();
      double var9 = var4.func_107931_c();
      C_100576_pg var11 = new C_100576_pg(var0, var5, var7 - 0.3D, var9, var1);
      double var12 = var0.field_109577_u.nextDouble() * 0.1D + 0.2D;
      var11.field_103215_w = (double)var3.func_107948_c() * var12;
      var11.field_103240_x = 0.20000000298023224D;
      var11.field_103238_y = (double)var3.func_107947_e() * var12;
      var11.field_103215_w += var0.field_109577_u.nextGaussian() * 0.007499999832361937D * (double)var2;
      var11.field_103240_x += var0.field_109577_u.nextGaussian() * 0.007499999832361937D * (double)var2;
      var11.field_103238_y += var0.field_109577_u.nextGaussian() * 0.007499999832361937D * (double)var2;
      var0.func_109513_d(var11);
   }

   protected void func_105952_a(C_100471_ao var1) {
      var1.func_107933_k().func_109448_f(1000, var1.func_107938_d(), var1.func_107937_e(), var1.func_107936_f(), 0);
   }

   protected void func_105950_a(C_100471_ao var1, C_100462_au var2) {
      var1.func_107933_k().func_109448_f(2000, var1.func_107938_d(), var1.func_107937_e(), var1.func_107936_f(), this.func_105948_a(var2));
   }

   private int func_105948_a(C_100462_au var1) {
      return var1.func_107948_c() + 1 + (var1.func_107947_e() + 1) * 3;
   }
}
