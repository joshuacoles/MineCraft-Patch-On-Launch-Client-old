import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100423_amc extends C_100398_amm implements C_100020_s {

   private String field_104859_a = "";


   public void func_104857_b(String var1) {
      this.field_104859_a = var1;
      this.func_102922_d();
   }

   public String func_104858_c() {
      return this.field_104859_a;
   }

   public void func_104856_a(C_100873_xe var1) {
      if(!var1.field_109557_J) {
         C_101445_MinecraftServer var2 = C_101445_MinecraftServer.func_104953_D();
         if(var2 != null && var2.func_104881_Z()) {
            C_100021_r var3 = var2.func_104888_E();
            var3.func_105197_a(this, this.field_104859_a);
         }

      }
   }

   public String func_102909_c_() {
      return "@";
   }

   public void func_102910_a(String var1) {}

   public boolean func_102912_a(int var1, String var2) {
      return var1 <= 2;
   }

   public String func_102908_a(String var1, Object ... var2) {
      return var1;
   }

   public void func_102915_b(C_100353_bh var1) {
      super.func_102915_b(var1);
      var1.func_107533_a("Command", this.field_104859_a);
   }

   public void func_102925_a(C_100353_bh var1) {
      super.func_102925_a(var1);
      this.field_104859_a = var1.func_107534_i("Command");
   }

   public C_100013_k func_102911_b() {
      return new C_100013_k(this.field_102938_l, this.field_102939_m, this.field_102936_n);
   }

   public C_100219_dx func_102924_l() {
      C_100353_bh var1 = new C_100353_bh();
      this.func_102915_b(var1);
      return new C_100271_ey(this.field_102938_l, this.field_102939_m, this.field_102936_n, 2, var1);
   }
}
