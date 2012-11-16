import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100093_bca extends C_100122_ge {

   private C_100353_bh field_105762_e = null;


   public C_100093_bca(C_100094_bcb var1) {
      super(var1);
      this.field_105741_d = 10;
   }

   protected void func_105729_b(C_100762_ih var1) {
      if(var1.func_102909_c_().equals(this.func_105761_s().func_104919_H())) {
         this.field_105762_e = new C_100353_bh();
         var1.func_103130_d(this.field_105762_e);
      }

      super.func_105729_b(var1);
   }

   public C_100094_bcb func_105761_s() {
      return (C_100094_bcb)super.func_105722_p();
   }

   public C_100353_bh func_105723_q() {
      return this.field_105762_e;
   }

   // $FF: synthetic method
   public C_101445_MinecraftServer func_105722_p() {
      return this.func_105761_s();
   }
}
