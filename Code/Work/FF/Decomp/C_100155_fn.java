import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100155_fn implements C_100683_ka {

   private long field_104294_b;
   // $FF: synthetic field
   final C_101445_MinecraftServer field_104295_a;


   public C_100155_fn(C_101445_MinecraftServer var1) {
      this.field_104295_a = var1;
      this.field_104294_b = System.currentTimeMillis();
   }

   public void func_104292_a(String var1) {}

   public void func_104293_b(String var1) {}

   public void func_104290_a(int var1) {
      if(System.currentTimeMillis() - this.field_104294_b >= 1000L) {
         this.field_104294_b = System.currentTimeMillis();
         C_101445_MinecraftServer.field_104987_a.info("Converting... " + var1 + "%");
      }

   }

   public void func_104289_a() {}

   public void func_104291_c(String var1) {}
}
