import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100118_gc extends C_100457_aq {

   private final C_100457_aq field_105954_c;
   // $FF: synthetic field
   final C_101445_MinecraftServer field_105953_b;


   public C_100118_gc(C_101445_MinecraftServer var1) {
      this.field_105953_b = var1;
      this.field_105954_c = new C_100457_aq();
   }

   public C_100994_tv func_105949_b(C_100471_ao var1, C_100994_tv var2) {
      C_100462_au var3 = C_100462_au.func_107949_a(var1.func_107935_h());
      C_100873_xe var4 = var1.func_107933_k();
      double var5 = var1.func_107930_a() + (double)((float)var3.func_107948_c() * 1.125F);
      double var7 = var1.func_107932_b();
      double var9 = var1.func_107931_c() + (double)((float)var3.func_107947_e() * 1.125F);
      int var11 = var1.func_107938_d() + var3.func_107948_c();
      int var12 = var1.func_107937_e();
      int var13 = var1.func_107936_f() + var3.func_107947_e();
      C_100664_afg var14 = var4.func_109350_f(var11, var12, var13);
      double var15;
      if(C_100664_afg.field_109019_h.equals(var14)) {
         var15 = 1.0D;
      } else {
         if(!C_100664_afg.field_109012_a.equals(var14) || !C_100664_afg.field_109019_h.equals(var4.func_109350_f(var11, var12 - 1, var13))) {
            return this.field_105954_c.func_105944_a(var1, var2);
         }

         var15 = 0.0D;
      }

      C_100572_pe var17 = new C_100572_pe(var4, var5, var7 + var15, var9);
      var4.func_109513_d(var17);
      var2.func_111342_a(1);
      return var2;
   }

   protected void func_105952_a(C_100471_ao var1) {
      var1.func_107933_k().func_109448_f(1000, var1.func_107938_d(), var1.func_107937_e(), var1.func_107936_f(), 0);
   }
}
