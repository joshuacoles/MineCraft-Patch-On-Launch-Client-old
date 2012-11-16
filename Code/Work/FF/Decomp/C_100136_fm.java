import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100136_fm extends C_100457_aq {

   private final C_100457_aq field_105959_c;
   // $FF: synthetic field
   final C_101445_MinecraftServer field_105958_b;


   public C_100136_fm(C_101445_MinecraftServer var1) {
      this.field_105958_b = var1;
      this.field_105959_c = new C_100457_aq();
   }

   public C_100994_tv func_105949_b(C_100471_ao var1, C_100994_tv var2) {
      C_100462_au var3 = C_100462_au.func_107949_a(var1.func_107935_h());
      C_100873_xe var4 = var1.func_107933_k();
      int var5 = var1.func_107938_d() + var3.func_107948_c();
      int var6 = var1.func_107937_e();
      int var7 = var1.func_107936_f() + var3.func_107947_e();
      C_100664_afg var8 = var4.func_109350_f(var5, var6, var7);
      int var9 = var4.func_109357_g(var5, var6, var7);
      C_100992_tt var10;
      if(C_100664_afg.field_109019_h.equals(var8) && var9 == 0) {
         var10 = C_100992_tt.field_110934_ax;
      } else {
         if(!C_100664_afg.field_109020_i.equals(var8) || var9 != 0) {
            return super.func_105949_b(var1, var2);
         }

         var10 = C_100992_tt.field_110923_ay;
      }

      var4.func_109422_e(var5, var6, var7, 0);
      if(--var2.field_111398_a == 0) {
         var2.field_111397_c = var10.field_110891_cf;
         var2.field_111398_a = 1;
      } else if(((C_100420_amd)var1.func_107934_j()).func_103012_a(new C_100994_tv(var10)) < 0) {
         this.field_105959_c.func_105944_a(var1, new C_100994_tv(var10));
      }

      return var2;
   }
}
