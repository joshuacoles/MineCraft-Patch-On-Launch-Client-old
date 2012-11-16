import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100114_fw extends C_100274_fd {

   // $FF: synthetic field
   final C_101445_MinecraftServer field_105966_b;


   public C_100114_fw(C_101445_MinecraftServer var1) {
      this.field_105966_b = var1;
   }

   protected C_101084_qn func_105963_a(C_100873_xe var1, C_100459_ax var2) {
      return new C_101081_qt(var1, var2.func_107930_a(), var2.func_107932_b(), var2.func_107931_c());
   }

   protected float func_105962_a() {
      return super.func_105962_a() * 0.5F;
   }

   protected float func_105964_b() {
      return super.func_105964_b() * 1.25F;
   }
}
