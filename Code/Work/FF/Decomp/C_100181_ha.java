import java.util.Iterator;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100181_ha extends C_100023_p implements C_100008_n {

   public C_100181_ha() {
      this.func_105201_a(new C_100489_ae());
      this.func_105201_a(new C_100026_x());
      this.func_105201_a(new C_100016_w());
      this.func_105201_a(new C_100018_u());
      this.func_105201_a(new C_100483_ab());
      this.func_105201_a(new C_100491_af());
      this.func_105201_a(new C_100485_ag());
      this.func_105201_a(new C_100017_v());
      this.func_105201_a(new C_100172_hd());
      this.func_105201_a(new C_100024_z());
      this.func_105201_a(new C_100213_go());
      this.func_105201_a(new C_100478_ac());
      this.func_105201_a(new C_100481_aa());
      this.func_105201_a(new C_100183_gn());
      this.func_105201_a(new C_100205_gs());
      this.func_105201_a(new C_100189_gk());
      this.func_105201_a(new C_100176_hb());
      this.func_105201_a(new C_100025_y());
      this.func_105201_a(new C_100187_gl());
      if(C_101445_MinecraftServer.func_104953_D().func_104948_T()) {
         this.func_105201_a(new C_100203_gt());
         this.func_105201_a(new C_100185_gm());
         this.func_105201_a(new C_100178_hc());
         this.func_105201_a(new C_100166_gx());
         this.func_105201_a(new C_100163_gy());
         this.func_105201_a(new C_100164_gz());
         this.func_105201_a(new C_100193_gi());
         this.func_105201_a(new C_100201_gu());
         this.func_105201_a(new C_100191_gj());
         this.func_105201_a(new C_100209_gq());
         this.func_105201_a(new C_100199_gv());
         this.func_105201_a(new C_100211_gp());
         this.func_105201_a(new C_100207_gr());
         this.func_105201_a(new C_100174_he());
      } else {
         this.func_105201_a(new C_100165_gw());
      }

      C_100009_o.func_105220_a(this);
   }

   public void func_105196_a(C_100020_s var1, int var2, String var3, Object ... var4) {
      boolean var5 = true;
      if(var1 instanceof C_100423_amc && !C_101445_MinecraftServer.func_104953_D().field_104986_c[0].func_109389_K().func_110281_b("commandBlockOutput")) {
         var5 = false;
      }

      if(var5) {
         Iterator var6 = C_101445_MinecraftServer.func_104953_D().func_104931_ad().field_105743_b.iterator();

         while(var6.hasNext()) {
            C_100762_ih var7 = (C_100762_ih)var6.next();
            if(var7 != var1 && C_101445_MinecraftServer.func_104953_D().func_104931_ad().func_105690_e(var7.field_103847_bT)) {
               var7.func_102910_a("§7§o[" + var1.func_102909_c_() + ": " + var7.func_102908_a(var3, var4) + "]");
            }
         }
      }

      if(var1 != C_101445_MinecraftServer.func_104953_D()) {
         C_101445_MinecraftServer.field_104987_a.info("[" + var1.func_102909_c_() + ": " + C_101445_MinecraftServer.func_104953_D().func_102908_a(var3, var4) + "]");
      }

      if((var2 & 1) != 1) {
         var1.func_102910_a(var1.func_102908_a(var3, var4));
      }

   }
}
