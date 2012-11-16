import java.util.List;
import java.util.Random;

public class C_100449_ald extends C_100451_alf {

   public C_100449_ald(int var1) {
      super(var1, 159, C_100664_afg.field_109026_r);
   }

   public int func_106029_a(int var1, int var2) {
      return var1 == 1?this.field_106165_cl - 1:(var1 == 0?this.field_106165_cl + 16:this.field_106165_cl);
   }

   public boolean func_105994_c() {
      return false;
   }

   public int func_106013_d() {
      return 26;
   }

   public void func_106059_f() {
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
   }

   public void func_105986_a(C_100873_xe var1, int var2, int var3, int var4, C_100412_amr var5, List var6, C_100730_lb var7) {
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
      super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      int var8 = var1.func_109357_g(var2, var3, var4);
      if(func_106434_e(var8)) {
         this.func_106008_a(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
         super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      }

      this.func_106059_f();
   }

   public static boolean func_106434_e(int var0) {
      return (var0 & 4) != 0;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return 0;
   }

   public void func_106047_a(C_100873_xe var1, int var2, int var3, int var4, C_100595_ln var5) {
      int var6 = ((C_100650_jv.func_108910_c((double)(var5.field_103236_z * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
      var1.func_109488_c(var2, var3, var4, var6);
   }
}
