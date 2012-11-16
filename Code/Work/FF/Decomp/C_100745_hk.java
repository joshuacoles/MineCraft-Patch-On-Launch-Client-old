import java.net.InetAddress;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100745_hk extends C_100803_in {

   private final C_100753_hl field_105782_c;


   public C_100745_hk(C_101445_MinecraftServer var1, InetAddress var2, int var3) {
      super(var1);
      this.field_105782_c = new C_100753_hl(this, var2, var3);
      this.field_105782_c.start();
   }

   public void func_105773_a() {
      super.func_105773_a();
      this.field_105782_c.func_109643_b();
      this.field_105782_c.interrupt();
   }

   public void func_105775_b() {
      this.field_105782_c.func_109641_a();
      super.func_105775_b();
   }

   public C_100170_hg func_105781_c() {
      return (C_100170_hg)super.func_105774_d();
   }

   public void func_105780_a(InetAddress var1) {
      this.field_105782_c.func_109644_a(var1);
   }

   // $FF: synthetic method
   public C_101445_MinecraftServer func_105774_d() {
      return this.func_105781_c();
   }
}
