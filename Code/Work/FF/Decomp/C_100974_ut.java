
public class C_100974_ut extends C_100945_uu {

   private final boolean field_110984_a;
   private final C_100169_aja field_110982_b;
   private final C_100169_aja field_110983_c;


   public C_100974_ut(int var1, C_100169_aja var2, C_100169_aja var3, boolean var4) {
      super(var1);
      this.field_110982_b = var2;
      this.field_110983_c = var3;
      this.field_110984_a = var4;
      this.func_110804_e(0);
      this.func_110800_a(true);
   }

   public int func_110787_b(int var1) {
      return C_100451_alf.field_106118_p[this.field_110891_cf].func_106029_a(2, var1);
   }

   public int func_110748_a(int var1) {
      return var1;
   }

   public String func_110791_c_(C_100994_tv var1) {
      return this.field_110982_b.func_106289_d(var1.func_111367_j());
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(this.field_110984_a) {
         return super.func_110764_a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      } else if(var1.field_111398_a == 0) {
         return false;
      } else if(!var2.func_103799_a(var4, var5, var6, var7, var1)) {
         return false;
      } else {
         int var11 = var3.func_109349_a(var4, var5, var6);
         int var12 = var3.func_109357_g(var4, var5, var6);
         int var13 = var12 & 7;
         boolean var14 = (var12 & 8) != 0;
         if((var7 == 1 && !var14 || var7 == 0 && var14) && var11 == this.field_110982_b.field_106162_cm && var13 == var1.func_111367_j()) {
            if(var3.func_109410_b(this.field_110983_c.func_106021_e(var3, var4, var5, var6)) && var3.func_109394_d(var4, var5, var6, this.field_110983_c.field_106162_cm, var13)) {
               var3.func_109476_a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.field_110983_c.field_106150_cz.func_107922_e(), (this.field_110983_c.field_106150_cz.func_107921_c() + 1.0F) / 2.0F, this.field_110983_c.field_106150_cz.func_107918_d() * 0.8F);
               --var1.field_111398_a;
            }

            return true;
         } else {
            return this.func_110981_a(var1, var2, var3, var4, var5, var6, var7)?true:super.func_110764_a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
         }
      }
   }

   public boolean func_110978_a(C_100873_xe var1, int var2, int var3, int var4, int var5, C_101095_qg var6, C_100994_tv var7) {
      int var8 = var2;
      int var9 = var3;
      int var10 = var4;
      int var11 = var1.func_109349_a(var2, var3, var4);
      int var12 = var1.func_109357_g(var2, var3, var4);
      int var13 = var12 & 7;
      boolean var14 = (var12 & 8) != 0;
      if((var5 == 1 && !var14 || var5 == 0 && var14) && var11 == this.field_110982_b.field_106162_cm && var13 == var7.func_111367_j()) {
         return true;
      } else {
         if(var5 == 0) {
            --var3;
         }

         if(var5 == 1) {
            ++var3;
         }

         if(var5 == 2) {
            --var4;
         }

         if(var5 == 3) {
            ++var4;
         }

         if(var5 == 4) {
            --var2;
         }

         if(var5 == 5) {
            ++var2;
         }

         var11 = var1.func_109349_a(var2, var3, var4);
         var12 = var1.func_109357_g(var2, var3, var4);
         var13 = var12 & 7;
         var14 = (var12 & 8) != 0;
         return var11 == this.field_110982_b.field_106162_cm && var13 == var7.func_111367_j()?true:super.func_110978_a(var1, var8, var9, var10, var5, var6, var7);
      }
   }

   private boolean func_110981_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7) {
      if(var7 == 0) {
         --var5;
      }

      if(var7 == 1) {
         ++var5;
      }

      if(var7 == 2) {
         --var6;
      }

      if(var7 == 3) {
         ++var6;
      }

      if(var7 == 4) {
         --var4;
      }

      if(var7 == 5) {
         ++var4;
      }

      int var8 = var3.func_109349_a(var4, var5, var6);
      int var9 = var3.func_109357_g(var4, var5, var6);
      int var10 = var9 & 7;
      if(var8 == this.field_110982_b.field_106162_cm && var10 == var1.func_111367_j()) {
         if(var3.func_109410_b(this.field_110983_c.func_106021_e(var3, var4, var5, var6)) && var3.func_109394_d(var4, var5, var6, this.field_110983_c.field_106162_cm, var10)) {
            var3.func_109476_a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.field_110983_c.field_106150_cz.func_107922_e(), (this.field_110983_c.field_106150_cz.func_107921_c() + 1.0F) / 2.0F, this.field_110983_c.field_106150_cz.func_107918_d() * 0.8F);
            --var1.field_111398_a;
         }

         return true;
      } else {
         return false;
      }
   }
}
