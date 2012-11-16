import java.util.Random;

public class C_100228_aic extends C_100186_aij {

   public C_100228_aic(int var1) {
      super(var1, 168, C_100664_afg.field_109018_k);
      this.func_105972_b(true);
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(!this.func_106001_d(var1, var2, var3, var4)) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
      } else if(var1.field_109577_u.nextInt(5) == 0) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         int var7 = func_106312_c(var6);
         if(var7 < 2) {
            ++var7;
            var1.func_109488_c(var2, var3, var4, var7 << 2 | func_106302_e(var6));
         }
      }

   }

   public boolean func_106001_d(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = func_106302_e(var1.func_109357_g(var2, var3, var4));
      var2 += C_100015_i.field_105283_a[var5];
      var4 += C_100015_i.field_105281_b[var5];
      int var6 = var1.func_109349_a(var2, var3, var4);
      return var6 == C_100451_alf.field_106079_M.field_106162_cm && C_100435_alp.func_106415_e(var1.func_109357_g(var2, var3, var4)) == 3;
   }

   public int func_106013_d() {
      return 28;
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_105994_c() {
      return false;
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      this.func_106007_a(var1, var2, var3, var4);
      return super.func_106021_e(var1, var2, var3, var4);
   }

   public C_100412_amr func_106031_b_(C_100873_xe var1, int var2, int var3, int var4) {
      this.func_106007_a(var1, var2, var3, var4);
      return super.func_106031_b_(var1, var2, var3, var4);
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      int var6 = func_106302_e(var5);
      int var7 = func_106312_c(var5);
      int var8 = 4 + var7 * 2;
      int var9 = 5 + var7 * 2;
      float var10 = (float)var8 / 2.0F;
      switch(var6) {
      case 0:
         this.func_106008_a((8.0F - var10) / 16.0F, (12.0F - (float)var9) / 16.0F, (15.0F - (float)var8) / 16.0F, (8.0F + var10) / 16.0F, 0.75F, 0.9375F);
         break;
      case 1:
         this.func_106008_a(0.0625F, (12.0F - (float)var9) / 16.0F, (8.0F - var10) / 16.0F, (1.0F + (float)var8) / 16.0F, 0.75F, (8.0F + var10) / 16.0F);
         break;
      case 2:
         this.func_106008_a((8.0F - var10) / 16.0F, (12.0F - (float)var9) / 16.0F, 0.0625F, (8.0F + var10) / 16.0F, 0.75F, (1.0F + (float)var8) / 16.0F);
         break;
      case 3:
         this.func_106008_a((15.0F - (float)var8) / 16.0F, (12.0F - (float)var9) / 16.0F, (8.0F - var10) / 16.0F, 0.9375F, 0.75F, (8.0F + var10) / 16.0F);
      }

   }

   public void func_106047_a(C_100873_xe var1, int var2, int var3, int var4, C_100595_ln var5) {
      int var6 = ((C_100650_jv.func_108910_c((double)(var5.field_103236_z * 4.0F / 360.0F) + 0.5D) & 3) + 0) % 4;
      var1.func_109488_c(var2, var3, var4, var6);
   }

   public void func_106065_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      if(var5 == 1 || var5 == 0) {
         var5 = 2;
      }

      int var9 = C_100015_i.field_105277_f[C_100015_i.field_105280_e[var5]];
      var1.func_109488_c(var2, var3, var4, var9);
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!this.func_106001_d(var1, var2, var3, var4)) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
      }

   }

   public static int func_106312_c(int var0) {
      return (var0 & 12) >> 2;
   }

   public void func_105998_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      int var8 = func_106312_c(var5);
      byte var9 = 1;
      if(var8 >= 2) {
         var9 = 3;
      }

      for(int var10 = 0; var10 < var9; ++var10) {
         this.func_106042_a(var1, var2, var3, var4, new C_100994_tv(C_100992_tt.field_110904_aW, 1, 3));
      }

   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100992_tt.field_110904_aW.field_110891_cf;
   }

   public int func_106019_h(C_100873_xe var1, int var2, int var3, int var4) {
      return 3;
   }
}
