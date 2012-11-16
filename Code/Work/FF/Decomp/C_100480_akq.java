import java.util.Random;

public class C_100480_akq extends C_100200_aiq {

   private Class field_106351_a;
   private boolean field_106350_b;


   protected C_100480_akq(int var1, Class var2, boolean var3) {
      super(var1, C_100664_afg.field_109008_d);
      this.field_106350_b = var3;
      this.field_106165_cl = 4;
      this.field_106351_a = var2;
      float var4 = 0.25F;
      float var5 = 1.0F;
      this.func_106008_a(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var5, 0.5F + var4);
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return null;
   }

   public C_100412_amr func_106031_b_(C_100873_xe var1, int var2, int var3, int var4) {
      this.func_106007_a(var1, var2, var3, var4);
      return super.func_106031_b_(var1, var2, var3, var4);
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      if(!this.field_106350_b) {
         int var5 = var1.func_109357_g(var2, var3, var4);
         float var6 = 0.28125F;
         float var7 = 0.78125F;
         float var8 = 0.0F;
         float var9 = 1.0F;
         float var10 = 0.125F;
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         if(var5 == 2) {
            this.func_106008_a(var8, var6, 1.0F - var10, var9, var7, 1.0F);
         }

         if(var5 == 3) {
            this.func_106008_a(var8, var6, 0.0F, var9, var7, var10);
         }

         if(var5 == 4) {
            this.func_106008_a(1.0F - var10, var6, var8, 1.0F, var7, var9);
         }

         if(var5 == 5) {
            this.func_106008_a(0.0F, var6, var8, var10, var7, var9);
         }

      }
   }

   public int func_106013_d() {
      return -1;
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_105982_c(C_100837_xo var1, int var2, int var3, int var4) {
      return true;
   }

   public boolean func_105994_c() {
      return false;
   }

   public C_100398_amm func_106326_a(C_100873_xe var1) {
      try {
         return (C_100398_amm)this.field_106351_a.newInstance();
      } catch (Exception var3) {
         throw new RuntimeException(var3);
      }
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100992_tt.field_110940_au.field_110891_cf;
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      boolean var6 = false;
      if(this.field_106350_b) {
         if(!var1.func_109350_f(var2, var3 - 1, var4).func_108983_a()) {
            var6 = true;
         }
      } else {
         int var7 = var1.func_109357_g(var2, var3, var4);
         var6 = true;
         if(var7 == 2 && var1.func_109350_f(var2, var3, var4 + 1).func_108983_a()) {
            var6 = false;
         }

         if(var7 == 3 && var1.func_109350_f(var2, var3, var4 - 1).func_108983_a()) {
            var6 = false;
         }

         if(var7 == 4 && var1.func_109350_f(var2 + 1, var3, var4).func_108983_a()) {
            var6 = false;
         }

         if(var7 == 5 && var1.func_109350_f(var2 - 1, var3, var4).func_108983_a()) {
            var6 = false;
         }
      }

      if(var6) {
         this.func_106035_c(var1, var2, var3, var4, var1.func_109357_g(var2, var3, var4), 0);
         var1.func_109422_e(var2, var3, var4, 0);
      }

      super.func_106017_a(var1, var2, var3, var4, var5);
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100992_tt.field_110940_au.field_110891_cf;
   }
}
