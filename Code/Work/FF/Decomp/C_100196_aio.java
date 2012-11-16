import java.util.Random;

public class C_100196_aio extends C_100200_aiq {

   protected C_100196_aio(int var1) {
      super(var1, 166, C_100664_afg.field_109009_e);
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
      this.func_106048_h(0);
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   public boolean func_105977_b() {
      return false;
   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      super.func_105974_a(var1, var2, var3, var4, var5);

      for(int var6 = var2 - 2; var6 <= var2 + 2; ++var6) {
         for(int var7 = var4 - 2; var7 <= var4 + 2; ++var7) {
            if(var6 > var2 - 2 && var6 < var2 + 2 && var7 == var4 - 1) {
               var7 = var4 + 2;
            }

            if(var5.nextInt(16) == 0) {
               for(int var8 = var3; var8 <= var3 + 1; ++var8) {
                  if(var1.func_109349_a(var6, var8, var7) == C_100451_alf.field_106214_aq.field_106162_cm) {
                     if(!var1.func_109352_c((var6 - var2) / 2 + var2, var8, (var7 - var4) / 2 + var4)) {
                        break;
                     }

                     var1.func_109428_a("enchantmenttable", (double)var2 + 0.5D, (double)var3 + 2.0D, (double)var4 + 0.5D, (double)((float)(var6 - var2) + var5.nextFloat()) - 0.5D, (double)((float)(var8 - var3) - var5.nextFloat() - 1.0F), (double)((float)(var7 - var4) + var5.nextFloat()) - 0.5D);
                  }
               }
            }
         }
      }

   }

   public boolean func_105994_c() {
      return false;
   }

   public int func_106029_a(int var1, int var2) {
      return this.func_106024_a(var1);
   }

   public int func_106024_a(int var1) {
      return var1 == 0?this.field_106165_cl + 17:(var1 == 1?this.field_106165_cl:this.field_106165_cl + 16);
   }

   public C_100398_amm func_106326_a(C_100873_xe var1) {
      return new C_100421_ame();
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      if(var1.field_109557_J) {
         return true;
      } else {
         var5.func_103770_c(var2, var3, var4);
         return true;
      }
   }
}
