import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100109_fz extends C_100457_aq {

   // $FF: synthetic field
   final C_101445_MinecraftServer field_105971_b;


   public C_100109_fz(C_101445_MinecraftServer var1) {
      this.field_105971_b = var1;
   }

   public C_100994_tv func_105949_b(C_100471_ao var1, C_100994_tv var2) {
      C_100462_au var3 = C_100462_au.func_107949_a(var1.func_107935_h());
      double var4 = var1.func_107930_a() + (double)var3.func_107948_c();
      double var6 = (double)((float)var1.func_107937_e() + 0.2F);
      double var8 = var1.func_107931_c() + (double)var3.func_107947_e();
      C_100997_ua.func_111004_a(var1.func_107933_k(), var2.func_111367_j(), var4, var6, var8);
      var2.func_111342_a(1);
      return var2;
   }

   protected void func_105952_a(C_100471_ao var1) {
      var1.func_107933_k().func_109448_f(1002, var1.func_107938_d(), var1.func_107937_e(), var1.func_107936_f(), 0);
   }
}
