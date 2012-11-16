
public class C_100125_aki extends C_100200_aiq {

   protected C_100125_aki(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109008_d);
      this.func_106034_a(C_101040_sq.field_111418_c);
   }

   public int func_106024_a(int var1) {
      return this.field_106165_cl + (var1 == 1?1:0);
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      if(var1.func_109357_g(var2, var3, var4) == 0) {
         return false;
      } else {
         this.func_106327_j_(var1, var2, var3, var4);
         return true;
      }
   }

   public void func_106328_d(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.field_109557_J) {
         C_100486_akj var6 = (C_100486_akj)var1.func_109353_p(var2, var3, var4);
         if(var6 != null) {
            var6.field_104855_a = var5;
            var6.func_102922_d();
            var1.func_109488_c(var2, var3, var4, 1);
         }
      }
   }

   public void func_106327_j_(C_100873_xe var1, int var2, int var3, int var4) {
      if(!var1.field_109557_J) {
         C_100486_akj var5 = (C_100486_akj)var1.func_109353_p(var2, var3, var4);
         if(var5 != null) {
            int var6 = var5.field_104855_a;
            if(var6 != 0) {
               var1.func_109448_f(1005, var2, var3, var4, 0);
               var1.func_109499_a((String)null, var2, var3, var4);
               var5.field_104855_a = 0;
               var5.func_102922_d();
               var1.func_109488_c(var2, var3, var4, 0);
               float var7 = 0.7F;
               double var8 = (double)(var1.field_109577_u.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
               double var10 = (double)(var1.field_109577_u.nextFloat() * var7) + (double)(1.0F - var7) * 0.2D + 0.6D;
               double var12 = (double)(var1.field_109577_u.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
               C_100576_pg var14 = new C_100576_pg(var1, (double)var2 + var8, (double)var3 + var10, (double)var4 + var12, new C_100994_tv(var6, 1, 0));
               var14.field_103278_c = 10;
               var1.func_109513_d(var14);
            }
         }
      }
   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      this.func_106327_j_(var1, var2, var3, var4);
      super.func_106041_a(var1, var2, var3, var4, var5, var6);
   }

   public void func_105998_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.field_109557_J) {
         super.func_105998_a(var1, var2, var3, var4, var5, var6, 0);
      }
   }

   public C_100398_amm func_106326_a(C_100873_xe var1) {
      return new C_100486_akj();
   }
}
