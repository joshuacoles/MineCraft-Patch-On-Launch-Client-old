import java.util.Random;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100128_ga extends C_100457_aq {

   // $FF: synthetic field
   final C_101445_MinecraftServer field_105955_b;


   public C_100128_ga(C_101445_MinecraftServer var1) {
      this.field_105955_b = var1;
   }

   public C_100994_tv func_105949_b(C_100471_ao var1, C_100994_tv var2) {
      C_100462_au var3 = C_100462_au.func_107949_a(var1.func_107935_h());
      C_100459_ax var4 = C_100190_ail.func_106331_a(var1);
      double var5 = var4.func_107930_a() + (double)((float)var3.func_107948_c() * 0.3F);
      double var7 = var4.func_107932_b();
      double var9 = var4.func_107931_c() + (double)((float)var3.func_107947_e() * 0.3F);
      C_100873_xe var11 = var1.func_107933_k();
      Random var12 = var11.field_109577_u;
      double var13 = var12.nextGaussian() * 0.05D + (double)var3.func_107948_c();
      double var15 = var12.nextGaussian() * 0.05D;
      double var17 = var12.nextGaussian() * 0.05D + (double)var3.func_107947_e();
      var11.func_109513_d(new C_101087_qo(var11, var5, var7, var9, var13, var15, var17));
      var2.func_111342_a(1);
      return var2;
   }

   protected void func_105952_a(C_100471_ao var1) {
      var1.func_107933_k().func_109448_f(1009, var1.func_107938_d(), var1.func_107937_e(), var1.func_107936_f(), 0);
   }
}
