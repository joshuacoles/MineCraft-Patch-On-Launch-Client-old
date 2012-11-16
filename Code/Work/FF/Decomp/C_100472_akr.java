import java.util.Random;

public class C_100472_akr extends C_100200_aiq {

   protected C_100472_akr(int var1) {
      super(var1, C_100664_afg.field_109027_q);
      this.field_106165_cl = 104;
      this.func_106008_a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
   }

   public int func_106013_d() {
      return -1;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      int var5 = var1.func_109357_g(var2, var3, var4) & 7;
      switch(var5) {
      case 1:
      default:
         this.func_106008_a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
         break;
      case 2:
         this.func_106008_a(0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F);
         break;
      case 3:
         this.func_106008_a(0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);
         break;
      case 4:
         this.func_106008_a(0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F);
         break;
      case 5:
         this.func_106008_a(0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
      }

   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      this.func_106007_a(var1, var2, var3, var4);
      return super.func_106021_e(var1, var2, var3, var4);
   }

   public void func_106047_a(C_100873_xe var1, int var2, int var3, int var4, C_100595_ln var5) {
      int var6 = C_100650_jv.func_108910_c((double)(var5.field_103236_z * 4.0F / 360.0F) + 2.5D) & 3;
      var1.func_109488_c(var2, var3, var4, var6);
   }

   public C_100398_amm func_106326_a(C_100873_xe var1) {
      return new C_100415_amk();
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100992_tt.field_110951_bQ.field_110891_cf;
   }

   public int func_106019_h(C_100873_xe var1, int var2, int var3, int var4) {
      C_100398_amm var5 = var1.func_109353_p(var2, var3, var4);
      return var5 != null && var5 instanceof C_100415_amk?((C_100415_amk)var5).func_102965_a():super.func_106019_h(var1, var2, var3, var4);
   }

   public int func_106004_b(int var1) {
      return var1;
   }

   public void func_105998_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {}

   public void func_106060_a(C_100873_xe var1, int var2, int var3, int var4, int var5, C_101095_qg var6) {
      if(var6.field_103869_cf.field_111597_d) {
         var5 |= 8;
         var1.func_109488_c(var2, var3, var4, var5);
      }

      super.func_106060_a(var1, var2, var3, var4, var5, var6);
   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      if(!var1.field_109557_J) {
         if((var6 & 8) == 0) {
            this.func_106042_a(var1, var2, var3, var4, new C_100994_tv(C_100992_tt.field_110951_bQ.field_110891_cf, 1, this.func_106019_h(var1, var2, var3, var4)));
         }

         super.func_106041_a(var1, var2, var3, var4, var5, var6);
      }
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100992_tt.field_110951_bQ.field_110891_cf;
   }

   public void func_106348_a(C_100873_xe var1, int var2, int var3, int var4, C_100415_amk var5) {
      if(var5.func_102965_a() == 1 && var3 >= 2) {
         int var6 = C_100451_alf.field_106141_bf.field_106162_cm;

         int var7;
         C_100579_pa var8;
         int var9;
         for(var7 = -2; var7 <= 0; ++var7) {
            if(var1.func_109349_a(var2, var3 - 1, var4 + var7) == var6 && var1.func_109349_a(var2, var3 - 1, var4 + var7 + 1) == var6 && var1.func_109349_a(var2, var3 - 2, var4 + var7 + 1) == var6 && var1.func_109349_a(var2, var3 - 1, var4 + var7 + 2) == var6 && this.func_106349_d(var1, var2, var3, var4 + var7, 1) && this.func_106349_d(var1, var2, var3, var4 + var7 + 1, 1) && this.func_106349_d(var1, var2, var3, var4 + var7 + 2, 1)) {
               var1.func_109441_d(var2, var3, var4 + var7, 8);
               var1.func_109441_d(var2, var3, var4 + var7 + 1, 8);
               var1.func_109441_d(var2, var3, var4 + var7 + 2, 8);
               var1.func_109378_b(var2, var3, var4 + var7, 0);
               var1.func_109378_b(var2, var3, var4 + var7 + 1, 0);
               var1.func_109378_b(var2, var3, var4 + var7 + 2, 0);
               var1.func_109378_b(var2, var3 - 1, var4 + var7, 0);
               var1.func_109378_b(var2, var3 - 1, var4 + var7 + 1, 0);
               var1.func_109378_b(var2, var3 - 1, var4 + var7 + 2, 0);
               var1.func_109378_b(var2, var3 - 2, var4 + var7 + 1, 0);
               if(!var1.field_109557_J) {
                  var8 = new C_100579_pa(var1);
                  var8.func_103055_b((double)var2 + 0.5D, (double)var3 - 1.45D, (double)(var4 + var7) + 1.5D, 90.0F, 0.0F);
                  var8.field_103469_aw = 90.0F;
                  var8.func_103697_m();
                  var1.func_109513_d(var8);
               }

               for(var9 = 0; var9 < 120; ++var9) {
                  var1.func_109428_a("snowballpoof", (double)var2 + var1.field_109577_u.nextDouble(), (double)(var3 - 2) + var1.field_109577_u.nextDouble() * 3.9D, (double)(var4 + var7 + 1) + var1.field_109577_u.nextDouble(), 0.0D, 0.0D, 0.0D);
               }

               var1.func_109409_f(var2, var3, var4 + var7, 0);
               var1.func_109409_f(var2, var3, var4 + var7 + 1, 0);
               var1.func_109409_f(var2, var3, var4 + var7 + 2, 0);
               var1.func_109409_f(var2, var3 - 1, var4 + var7, 0);
               var1.func_109409_f(var2, var3 - 1, var4 + var7 + 1, 0);
               var1.func_109409_f(var2, var3 - 1, var4 + var7 + 2, 0);
               var1.func_109409_f(var2, var3 - 2, var4 + var7 + 1, 0);
               return;
            }
         }

         for(var7 = -2; var7 <= 0; ++var7) {
            if(var1.func_109349_a(var2 + var7, var3 - 1, var4) == var6 && var1.func_109349_a(var2 + var7 + 1, var3 - 1, var4) == var6 && var1.func_109349_a(var2 + var7 + 1, var3 - 2, var4) == var6 && var1.func_109349_a(var2 + var7 + 2, var3 - 1, var4) == var6 && this.func_106349_d(var1, var2 + var7, var3, var4, 1) && this.func_106349_d(var1, var2 + var7 + 1, var3, var4, 1) && this.func_106349_d(var1, var2 + var7 + 2, var3, var4, 1)) {
               var1.func_109441_d(var2 + var7, var3, var4, 8);
               var1.func_109441_d(var2 + var7 + 1, var3, var4, 8);
               var1.func_109441_d(var2 + var7 + 2, var3, var4, 8);
               var1.func_109378_b(var2 + var7, var3, var4, 0);
               var1.func_109378_b(var2 + var7 + 1, var3, var4, 0);
               var1.func_109378_b(var2 + var7 + 2, var3, var4, 0);
               var1.func_109378_b(var2 + var7, var3 - 1, var4, 0);
               var1.func_109378_b(var2 + var7 + 1, var3 - 1, var4, 0);
               var1.func_109378_b(var2 + var7 + 2, var3 - 1, var4, 0);
               var1.func_109378_b(var2 + var7 + 1, var3 - 2, var4, 0);
               if(!var1.field_109557_J) {
                  var8 = new C_100579_pa(var1);
                  var8.func_103055_b((double)(var2 + var7) + 1.5D, (double)var3 - 1.45D, (double)var4 + 0.5D, 0.0F, 0.0F);
                  var8.func_103697_m();
                  var1.func_109513_d(var8);
               }

               for(var9 = 0; var9 < 120; ++var9) {
                  var1.func_109428_a("snowballpoof", (double)(var2 + var7 + 1) + var1.field_109577_u.nextDouble(), (double)(var3 - 2) + var1.field_109577_u.nextDouble() * 3.9D, (double)var4 + var1.field_109577_u.nextDouble(), 0.0D, 0.0D, 0.0D);
               }

               var1.func_109409_f(var2 + var7, var3, var4, 0);
               var1.func_109409_f(var2 + var7 + 1, var3, var4, 0);
               var1.func_109409_f(var2 + var7 + 2, var3, var4, 0);
               var1.func_109409_f(var2 + var7, var3 - 1, var4, 0);
               var1.func_109409_f(var2 + var7 + 1, var3 - 1, var4, 0);
               var1.func_109409_f(var2 + var7 + 2, var3 - 1, var4, 0);
               var1.func_109409_f(var2 + var7 + 1, var3 - 2, var4, 0);
               return;
            }
         }
      }

   }

   private boolean func_106349_d(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(var1.func_109349_a(var2, var3, var4) != this.field_106162_cm) {
         return false;
      } else {
         C_100398_amm var6 = var1.func_109353_p(var2, var3, var4);
         return var6 != null && var6 instanceof C_100415_amk?((C_100415_amk)var6).func_102965_a() == var5:false;
      }
   }
}
