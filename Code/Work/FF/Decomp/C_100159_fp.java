import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100159_fp extends Thread {

   // $FF: synthetic field
   final C_101445_MinecraftServer field_106525_a;


   public C_100159_fp(C_101445_MinecraftServer var1, String var2) {
      super(var2);
      this.field_106525_a = var1;
   }

   public void run() {
      this.field_106525_a.run();
   }
}
