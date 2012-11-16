import java.util.Random;

public class C_100153_ajw extends C_100253_aht {

   protected C_100153_ajw(int var1) {
      super(var1, 226);
      this.func_105972_b(true);
      float var2 = 0.5F;
      this.func_106008_a(0.5F - var2, 0.0F, 0.5F - var2, 0.5F + var2, 0.25F, 0.5F + var2);
      this.func_106034_a((C_101040_sq)null);
   }

   protected boolean func_106376_d_(int var1) {
      return var1 == C_100451_alf.field_106141_bf.field_106162_cm;
   }

   public boolean func_106001_d(C_100873_xe var1, int var2, int var3, int var4) {
      return this.func_106376_d_(var1.func_109349_a(var2, var3 - 1, var4));
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.func_109357_g(var2, var3, var4);
      if(var6 < 3 && var5.nextInt(10) == 0) {
         ++var6;
         var1.func_109488_c(var2, var3, var4, var6);
      }

      super.func_105996_b(var1, var2, var3, var4, var5);
   }

   public int func_106029_a(int var1, int var2) {
      return var2 >= 3?this.field_106165_cl + 2:(var2 > 0?this.field_106165_cl + 1:this.field_106165_cl);
   }

   public int func_106013_d() {
      return 6;
   }

   public void func_105998_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.field_109557_J) {
         int var8 = 1;
         if(var5 >= 3) {
            var8 = 2 + var1.field_109577_u.nextInt(3);
            if(var7 > 0) {
               var8 += var1.field_109577_u.nextInt(var7 + 1);
            }
         }

         for(int var9 = 0; var9 < var8; ++var9) {
            this.func_106042_a(var1, var2, var3, var4, new C_100994_tv(C_100992_tt.field_110865_br));
         }

      }
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return 0;
   }

   public int func_106063_a(Random var1) {
      return 0;
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100992_tt.field_110865_br.field_110891_cf;
   }
}
