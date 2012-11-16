import java.util.Random;

public class C_100194_ain extends C_100451_alf {

   public C_100194_ain(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_108999_B);
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_());
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      var1.func_109398_a(var2, var3, var4, this.field_106162_cm, this.func_106000_r_());
   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      this.func_106324_l(var1, var2, var3, var4);
   }

   private void func_106324_l(C_100873_xe var1, int var2, int var3, int var4) {
      if(C_100173_ajc.func_106296_a_(var1, var2, var3 - 1, var4) && var3 >= 0) {
         byte var5 = 32;
         if(!C_100173_ajc.field_106298_c && var1.func_109480_d(var2 - var5, var3 - var5, var4 - var5, var2 + var5, var3 + var5, var4 + var5)) {
            C_100574_pf var6 = new C_100574_pf(var1, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), this.field_106162_cm);
            var1.func_109513_d(var6);
         } else {
            var1.func_109422_e(var2, var3, var4, 0);

            while(C_100173_ajc.func_106296_a_(var1, var2, var3 - 1, var4) && var3 > 0) {
               --var3;
            }

            if(var3 > 0) {
               var1.func_109422_e(var2, var3, var4, this.field_106162_cm);
            }
         }
      }

   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      this.func_106325_n(var1, var2, var3, var4);
      return true;
   }

   public void func_105993_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5) {
      this.func_106325_n(var1, var2, var3, var4);
   }

   private void func_106325_n(C_100873_xe var1, int var2, int var3, int var4) {
      if(var1.func_109349_a(var2, var3, var4) == this.field_106162_cm) {
         if(!var1.field_109557_J) {
            for(int var5 = 0; var5 < 1000; ++var5) {
               int var6 = var2 + var1.field_109577_u.nextInt(16) - var1.field_109577_u.nextInt(16);
               int var7 = var3 + var1.field_109577_u.nextInt(8) - var1.field_109577_u.nextInt(8);
               int var8 = var4 + var1.field_109577_u.nextInt(16) - var1.field_109577_u.nextInt(16);
               if(var1.func_109349_a(var6, var7, var8) == 0) {
                  var1.func_109394_d(var6, var7, var8, this.field_106162_cm, var1.func_109357_g(var2, var3, var4));
                  var1.func_109422_e(var2, var3, var4, 0);
                  short var9 = 128;

                  for(int var10 = 0; var10 < var9; ++var10) {
                     double var11 = var1.field_109577_u.nextDouble();
                     float var13 = (var1.field_109577_u.nextFloat() - 0.5F) * 0.2F;
                     float var14 = (var1.field_109577_u.nextFloat() - 0.5F) * 0.2F;
                     float var15 = (var1.field_109577_u.nextFloat() - 0.5F) * 0.2F;
                     double var16 = (double)var6 + (double)(var2 - var6) * var11 + (var1.field_109577_u.nextDouble() - 0.5D) * 1.0D + 0.5D;
                     double var18 = (double)var7 + (double)(var3 - var7) * var11 + var1.field_109577_u.nextDouble() * 1.0D - 0.5D;
                     double var20 = (double)var8 + (double)(var4 - var8) * var11 + (var1.field_109577_u.nextDouble() - 0.5D) * 1.0D + 0.5D;
                     var1.func_109428_a("portal", var16, var18, var20, (double)var13, (double)var14, (double)var15);
                  }

                  return;
               }
            }

         }
      }
   }

   public int func_106000_r_() {
      return 3;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public int func_106013_d() {
      return 27;
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return 0;
   }
}
