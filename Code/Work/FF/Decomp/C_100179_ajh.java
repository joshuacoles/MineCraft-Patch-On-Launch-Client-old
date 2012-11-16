import java.util.Random;

public class C_100179_ajh extends C_100451_alf {

   protected C_100179_ajh(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109027_q);
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      float var6 = 0.125F;
      if(var5 == 2) {
         this.func_106008_a(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
      }

      if(var5 == 3) {
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
      }

      if(var5 == 4) {
         this.func_106008_a(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if(var5 == 5) {
         this.func_106008_a(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
      }

      return super.func_106021_e(var1, var2, var3, var4);
   }

   public C_100412_amr func_106031_b_(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4);
      float var6 = 0.125F;
      if(var5 == 2) {
         this.func_106008_a(0.0F, 0.0F, 1.0F - var6, 1.0F, 1.0F, 1.0F);
      }

      if(var5 == 3) {
         this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, var6);
      }

      if(var5 == 4) {
         this.func_106008_a(1.0F - var6, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

      if(var5 == 5) {
         this.func_106008_a(0.0F, 0.0F, 0.0F, var6, 1.0F, 1.0F);
      }

      return super.func_106031_b_(var1, var2, var3, var4);
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public int func_106013_d() {
      return 8;
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109360_s(var2 - 1, var3, var4)?true:(var1.func_109360_s(var2 + 1, var3, var4)?true:(var1.func_109360_s(var2, var3, var4 - 1)?true:var1.func_109360_s(var2, var3, var4 + 1)));
   }

   public void func_106065_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8) {
      int var9 = var1.func_109357_g(var2, var3, var4);
      if((var9 == 0 || var5 == 2) && var1.func_109360_s(var2, var3, var4 + 1)) {
         var9 = 2;
      }

      if((var9 == 0 || var5 == 3) && var1.func_109360_s(var2, var3, var4 - 1)) {
         var9 = 3;
      }

      if((var9 == 0 || var5 == 4) && var1.func_109360_s(var2 + 1, var3, var4)) {
         var9 = 4;
      }

      if((var9 == 0 || var5 == 5) && var1.func_109360_s(var2 - 1, var3, var4)) {
         var9 = 5;
      }

      var1.func_109488_c(var2, var3, var4, var9);
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.func_109357_g(var2, var3, var4);
      boolean var7 = false;
      if(var6 == 2 && var1.func_109360_s(var2, var3, var4 + 1)) {
         var7 = true;
      }

      if(var6 == 3 && var1.func_109360_s(var2, var3, var4 - 1)) {
         var7 = true;
      }

      if(var6 == 4 && var1.func_109360_s(var2 + 1, var3, var4)) {
         var7 = true;
      }

      if(var6 == 5 && var1.func_109360_s(var2 - 1, var3, var4)) {
         var7 = true;
      }

      if(!var7) {
         this.func_106035_c(var1, var2, var3, var4, var6, 0);
         var1.func_109422_e(var2, var3, var4, 0);
      }

      super.func_106017_a(var1, var2, var3, var4, var5);
   }

   public int func_106063_a(Random var1) {
      return 1;
   }
}
