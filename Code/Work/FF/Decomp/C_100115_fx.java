import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100115_fx implements C_100453_as {

   private final C_100457_aq field_105947_c;
   // $FF: synthetic field
   final C_101445_MinecraftServer field_105946_b;


   public C_100115_fx(C_101445_MinecraftServer var1) {
      this.field_105946_b = var1;
      this.field_105947_c = new C_100457_aq();
   }

   public C_100994_tv func_105944_a(C_100471_ao var1, C_100994_tv var2) {
      return C_100961_ue.func_110994_g(var2.func_111367_j())?(new C_100116_fy(this, var2)).func_105944_a(var1, var2):this.field_105947_c.func_105944_a(var1, var2);
   }
}
