import java.util.List;
import org.lwjgl.opengl.GL11;

class C_100102_bcs extends C_101275_asy {

   // $FF: synthetic field
   final C_100103_bcr field_105891_a;


   public C_100102_bcs(C_100103_bcr var1) {
      super(C_100103_bcr.func_104075_a(var1), var1.field_104044_f, var1.field_104045_g, 32, var1.field_104045_g - 55 + 4, 36);
      this.field_105891_a = var1;
   }

   protected int func_105830_a() {
      return C_100103_bcr.func_104065_b(this.field_105891_a).field_105099_C.func_105660_d().size();
   }

   protected void func_105827_a(int var1, boolean var2) {
      List var3 = C_100103_bcr.func_104069_c(this.field_105891_a).field_105099_C.func_105660_d();

      try {
         C_100103_bcr.func_104076_d(this.field_105891_a).field_105099_C.func_105671_a((C_100087_bco)var3.get(var1));
         C_100103_bcr.func_104074_e(this.field_105891_a).field_105127_o.func_110380_b();
      } catch (Exception var5) {
         C_100103_bcr.func_104077_f(this.field_105891_a).field_105099_C.func_105671_a((C_100087_bco)var3.get(0));
         C_100103_bcr.func_104072_g(this.field_105891_a).field_105127_o.func_110380_b();
      }

   }

   protected boolean func_105831_a(int var1) {
      List var2 = C_100103_bcr.func_104064_h(this.field_105891_a).field_105099_C.func_105660_d();
      return C_100103_bcr.func_104066_i(this.field_105891_a).field_105099_C.func_105667_e() == var2.get(var1);
   }

   protected int func_105822_d() {
      return this.func_105830_a() * 36;
   }

   protected void func_105833_b() {
      this.field_105891_a.func_104035_z_();
   }

   protected void func_105820_a(int var1, int var2, int var3, int var4, C_100872_azb var5) {
      C_100087_bco var6 = (C_100087_bco)C_100103_bcr.func_104070_j(this.field_105891_a).field_105099_C.func_105660_d().get(var1);
      var6.func_105633_b(C_100103_bcr.func_104073_k(this.field_105891_a).field_105127_o);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var5.func_110330_b();
      var5.func_110326_d(16777215);
      var5.func_110322_a((double)var2, (double)(var3 + var4), 0.0D, 0.0D, 1.0D);
      var5.func_110322_a((double)(var2 + 32), (double)(var3 + var4), 0.0D, 1.0D, 1.0D);
      var5.func_110322_a((double)(var2 + 32), (double)var3, 0.0D, 1.0D, 0.0D);
      var5.func_110322_a((double)var2, (double)var3, 0.0D, 0.0D, 0.0D);
      var5.func_110329_a();
      this.field_105891_a.func_103880_b(C_100103_bcr.func_104068_l(this.field_105891_a), var6.func_105632_c(), var2 + 32 + 2, var3 + 1, 16777215);
      this.field_105891_a.func_103880_b(C_100103_bcr.func_104071_m(this.field_105891_a), var6.func_105626_d(), var2 + 32 + 2, var3 + 12, 8421504);
      this.field_105891_a.func_103880_b(C_100103_bcr.func_104067_n(this.field_105891_a), var6.func_105631_e(), var2 + 32 + 2, var3 + 12 + 10, 8421504);
   }
}
