import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100137_fl extends C_100457_aq {

   private final C_100457_aq field_105961_c;
   // $FF: synthetic field
   final C_101445_MinecraftServer field_105960_b;


   public C_100137_fl(C_101445_MinecraftServer var1) {
      this.field_105960_b = var1;
      this.field_105961_c = new C_100457_aq();
   }

   public C_100994_tv func_105949_b(C_100471_ao var1, C_100994_tv var2) {
      C_101034_sk var3 = (C_101034_sk)var2.func_111365_b();
      int var4 = var1.func_107938_d();
      int var5 = var1.func_107937_e();
      int var6 = var1.func_107936_f();
      C_100462_au var7 = C_100462_au.func_107949_a(var1.func_107935_h());
      if(var3.func_111038_a(var1.func_107933_k(), (double)var4, (double)var5, (double)var6, var4 + var7.func_107948_c(), var5, var6 + var7.func_107947_e())) {
         var2.field_111397_c = C_100992_tt.field_110936_aw.field_110891_cf;
         var2.field_111398_a = 1;
         return var2;
      } else {
         return this.field_105961_c.func_105944_a(var1, var2);
      }
   }
}
