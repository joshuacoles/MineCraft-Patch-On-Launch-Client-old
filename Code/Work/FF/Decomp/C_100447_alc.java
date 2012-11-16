import java.util.List;
import java.util.Random;

public class C_100447_alc extends C_100200_aiq {

   public static boolean field_106347_a = false;


   protected C_100447_alc(int var1, C_100664_afg var2) {
      super(var1, 0, var2);
      this.func_106046_a(1.0F);
   }

   public C_100398_amm func_106326_a(C_100873_xe var1) {
      return new C_100400_aml();
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, var5, 1.0F);
   }

   public boolean func_105976_a(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return var5 != 0?false:super.func_105976_a(var1, var2, var3, var4, var5);
   }

   public void func_105986_a(C_100873_xe var1, int var2, int var3, int var4, C_100412_amr var5, List var6, C_100730_lb var7) {}

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public int func_106063_a(Random var1) {
      return 0;
   }

   public void func_106011_a(C_100873_xe var1, int var2, int var3, int var4, C_100730_lb var5) {
      if(var5.field_103207_o == null && var5.field_103206_n == null && !var1.field_109557_J) {
         var5.func_103090_b(1);
      }

   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      double var6 = (double)((float)var2 + var5.nextFloat());
      double var8 = (double)((float)var3 + 0.8F);
      double var10 = (double)((float)var4 + var5.nextFloat());
      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = 0.0D;
      var1.func_109428_a("smoke", var6, var8, var10, var12, var14, var16);
   }

   public int func_106013_d() {
      return -1;
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      if(!field_106347_a) {
         if(var1.field_109576_v.field_112401_h != 0) {
            var1.func_109422_e(var2, var3, var4, 0);
         }

      }
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return 0;
   }

}
