import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100478_ac extends C_100009_o {

   public boolean func_105206_b(C_100020_s var1) {
      return C_101445_MinecraftServer.func_104953_D().func_104921_I() || super.func_105206_b(var1);
   }

   public String func_105212_c() {
      return "seed";
   }

   public int func_105221_a() {
      return 2;
   }

   public void func_105210_b(C_100020_s var1, String[] var2) {
      C_100762_ih var3 = func_105224_c(var1);
      var1.func_102910_a("Seed: " + var3.field_103229_p.func_109374_D());
   }
}
