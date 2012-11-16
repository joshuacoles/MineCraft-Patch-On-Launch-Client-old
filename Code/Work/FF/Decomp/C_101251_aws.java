import net.minecraft.client.Minecraft;

class C_101251_aws extends C_101278_asw {

   // $FF: synthetic field
   final String field_104239_a;
   // $FF: synthetic field
   final C_101250_awr field_104238_b;


   C_101251_aws(C_101250_awr var1, String var2) {
      this.field_104238_b = var1;
      this.field_104239_a = var2;
   }

   public void func_104042_a(boolean var1, int var2) {
      this.field_104046_e = Minecraft.func_105091_x();
      if(this.field_104046_e.func_105047_z() != null) {
         this.field_104046_e.func_105047_z().func_110702_a(var1);
         C_100907_axh.func_110679_b(this.field_104046_e.func_105047_z());
      }

      if(var1) {
         this.field_104046_e.field_105099_C.func_105663_a(this.field_104239_a);
      }

      this.field_104046_e.func_105053_a((C_101278_asw)null);
   }
}
