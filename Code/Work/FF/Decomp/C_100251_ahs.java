import java.util.List;
import java.util.Random;

public class C_100251_ahs extends C_100200_aiq {

   private Random field_106343_a = new Random();


   public C_100251_ahs(int var1) {
      super(var1, C_100664_afg.field_109006_f);
      this.field_106165_cl = 157;
   }

   public boolean func_105994_c() {
      return false;
   }

   public int func_106013_d() {
      return 25;
   }

   public C_100398_amm func_106326_a(C_100873_xe var1) {
      return new C_100424_ama();
   }

   public boolean func_105977_b() {
      return false;
   }

   public void func_105986_a(C_100873_xe var1, int var2, int var3, int var4, C_100412_amr var5, List var6, C_100730_lb var7) {
      this.func_106008_a(0.4375F, 0.0F, 0.4375F, 0.5625F, 0.875F, 0.5625F);
      super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
      this.func_106059_f();
      super.func_105986_a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void func_106059_f() {
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      if(var1.field_109557_J) {
         return true;
      } else {
         C_100424_ama var10 = (C_100424_ama)var1.func_109353_p(var2, var3, var4);
         if(var10 != null) {
            var5.func_103801_a(var10);
         }

         return true;
      }
   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      double var6 = (double)((float)var2 + 0.4F + var5.nextFloat() * 0.2F);
      double var8 = (double)((float)var3 + 0.7F + var5.nextFloat() * 0.3F);
      double var10 = (double)((float)var4 + 0.4F + var5.nextFloat() * 0.2F);
      var1.func_109428_a("smoke", var6, var8, var10, 0.0D, 0.0D, 0.0D);
   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      C_100398_amm var7 = var1.func_109353_p(var2, var3, var4);
      if(var7 instanceof C_100424_ama) {
         C_100424_ama var8 = (C_100424_ama)var7;

         for(int var9 = 0; var9 < var8.func_103003_k_(); ++var9) {
            C_100994_tv var10 = var8.func_103007_a(var9);
            if(var10 != null) {
               float var11 = this.field_106343_a.nextFloat() * 0.8F + 0.1F;
               float var12 = this.field_106343_a.nextFloat() * 0.8F + 0.1F;
               float var13 = this.field_106343_a.nextFloat() * 0.8F + 0.1F;

               while(var10.field_111398_a > 0) {
                  int var14 = this.field_106343_a.nextInt(21) + 10;
                  if(var14 > var10.field_111398_a) {
                     var14 = var10.field_111398_a;
                  }

                  var10.field_111398_a -= var14;
                  C_100576_pg var15 = new C_100576_pg(var1, (double)((float)var2 + var11), (double)((float)var3 + var12), (double)((float)var4 + var13), new C_100994_tv(var10.field_111397_c, var14, var10.func_111367_j()));
                  float var16 = 0.05F;
                  var15.field_103215_w = (double)((float)this.field_106343_a.nextGaussian() * var16);
                  var15.field_103240_x = (double)((float)this.field_106343_a.nextGaussian() * var16 + 0.2F);
                  var15.field_103238_y = (double)((float)this.field_106343_a.nextGaussian() * var16);
                  var1.func_109513_d(var15);
               }
            }
         }
      }

      super.func_106041_a(var1, var2, var3, var4, var5, var6);
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100992_tt.field_110862_by.field_110891_cf;
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100992_tt.field_110862_by.field_110891_cf;
   }
}
