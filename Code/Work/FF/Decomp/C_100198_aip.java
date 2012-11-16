import java.util.Random;

public class C_100198_aip extends C_100200_aiq {

   protected C_100198_aip(int var1) {
      super(var1, C_100664_afg.field_109009_e);
      this.field_106165_cl = 37;
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public int func_106013_d() {
      return 22;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100451_alf.field_106210_as.field_106162_cm;
   }

   public int func_106063_a(Random var1) {
      return 8;
   }

   protected boolean func_106045_s_() {
      return true;
   }

   public void func_106047_a(C_100873_xe var1, int var2, int var3, int var4, C_100595_ln var5) {
      byte var6 = 0;
      int var7 = C_100650_jv.func_108910_c((double)(var5.field_103236_z * 4.0F / 360.0F) + 0.5D) & 3;
      if(var7 == 0) {
         var6 = 2;
      }

      if(var7 == 1) {
         var6 = 5;
      }

      if(var7 == 2) {
         var6 = 3;
      }

      if(var7 == 3) {
         var6 = 4;
      }

      var1.func_109488_c(var2, var3, var4, var6);
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      C_101053_rt var10 = var5.func_103832_cb();
      C_100418_amf var11 = (C_100418_amf)var1.func_109353_p(var2, var3, var4);
      if(var10 != null && var11 != null) {
         if(var1.func_109360_s(var2, var3 + 1, var4)) {
            return true;
         } else if(var1.field_109557_J) {
            return true;
         } else {
            var10.func_104776_a(var11);
            var5.func_103785_a(var10);
            return true;
         }
      } else {
         return true;
      }
   }

   public C_100398_amm func_106326_a(C_100873_xe var1) {
      return new C_100418_amf();
   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      for(int var6 = 0; var6 < 3; ++var6) {
         double var10000 = (double)((float)var2 + var5.nextFloat());
         double var9 = (double)((float)var3 + var5.nextFloat());
         var10000 = (double)((float)var4 + var5.nextFloat());
         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = 0.0D;
         int var19 = var5.nextInt(2) * 2 - 1;
         int var20 = var5.nextInt(2) * 2 - 1;
         var13 = ((double)var5.nextFloat() - 0.5D) * 0.125D;
         var15 = ((double)var5.nextFloat() - 0.5D) * 0.125D;
         var17 = ((double)var5.nextFloat() - 0.5D) * 0.125D;
         double var11 = (double)var4 + 0.5D + 0.25D * (double)var20;
         var17 = (double)(var5.nextFloat() * 1.0F * (float)var20);
         double var7 = (double)var2 + 0.5D + 0.25D * (double)var19;
         var13 = (double)(var5.nextFloat() * 1.0F * (float)var19);
         var1.func_109428_a("portal", var7, var9, var11, var13, var15, var17);
      }

   }
}
