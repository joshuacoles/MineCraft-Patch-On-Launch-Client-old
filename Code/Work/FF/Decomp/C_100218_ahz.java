import java.util.Iterator;
import java.util.Random;

public class C_100218_ahz extends C_100200_aiq {

   private Random field_106342_a = new Random();


   protected C_100218_ahz(int var1) {
      super(var1, C_100664_afg.field_109008_d);
      this.field_106165_cl = 26;
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

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      super.func_106054_g(var1, var2, var3, var4);
      this.func_106340_d_(var1, var2, var3, var4);
      int var5 = var1.func_109349_a(var2, var3, var4 - 1);
      int var6 = var1.func_109349_a(var2, var3, var4 + 1);
      int var7 = var1.func_109349_a(var2 - 1, var3, var4);
      int var8 = var1.func_109349_a(var2 + 1, var3, var4);
      if(var5 == this.field_106162_cm) {
         this.func_106340_d_(var1, var2, var3, var4 - 1);
      }

      if(var6 == this.field_106162_cm) {
         this.func_106340_d_(var1, var2, var3, var4 + 1);
      }

      if(var7 == this.field_106162_cm) {
         this.func_106340_d_(var1, var2 - 1, var3, var4);
      }

      if(var8 == this.field_106162_cm) {
         this.func_106340_d_(var1, var2 + 1, var3, var4);
      }

   }

   public void func_106047_a(C_100873_xe var1, int var2, int var3, int var4, C_100595_ln var5) {
      int var6 = var1.func_109349_a(var2, var3, var4 - 1);
      int var7 = var1.func_109349_a(var2, var3, var4 + 1);
      int var8 = var1.func_109349_a(var2 - 1, var3, var4);
      int var9 = var1.func_109349_a(var2 + 1, var3, var4);
      byte var10 = 0;
      int var11 = C_100650_jv.func_108910_c((double)(var5.field_103236_z * 4.0F / 360.0F) + 0.5D) & 3;
      if(var11 == 0) {
         var10 = 2;
      }

      if(var11 == 1) {
         var10 = 5;
      }

      if(var11 == 2) {
         var10 = 3;
      }

      if(var11 == 3) {
         var10 = 4;
      }

      if(var6 != this.field_106162_cm && var7 != this.field_106162_cm && var8 != this.field_106162_cm && var9 != this.field_106162_cm) {
         var1.func_109488_c(var2, var3, var4, var10);
      } else {
         if((var6 == this.field_106162_cm || var7 == this.field_106162_cm) && (var10 == 4 || var10 == 5)) {
            if(var6 == this.field_106162_cm) {
               var1.func_109488_c(var2, var3, var4 - 1, var10);
            } else {
               var1.func_109488_c(var2, var3, var4 + 1, var10);
            }

            var1.func_109488_c(var2, var3, var4, var10);
         }

         if((var8 == this.field_106162_cm || var9 == this.field_106162_cm) && (var10 == 2 || var10 == 3)) {
            if(var8 == this.field_106162_cm) {
               var1.func_109488_c(var2 - 1, var3, var4, var10);
            } else {
               var1.func_109488_c(var2 + 1, var3, var4, var10);
            }

            var1.func_109488_c(var2, var3, var4, var10);
         }
      }

   }

   public void func_106340_d_(C_100873_xe var1, int var2, int var3, int var4) {
      if(!var1.field_109557_J) {
         int var5 = var1.func_109349_a(var2, var3, var4 - 1);
         int var6 = var1.func_109349_a(var2, var3, var4 + 1);
         int var7 = var1.func_109349_a(var2 - 1, var3, var4);
         int var8 = var1.func_109349_a(var2 + 1, var3, var4);
         boolean var9 = true;
         int var10;
         int var11;
         boolean var12;
         byte var13;
         int var14;
         if(var5 != this.field_106162_cm && var6 != this.field_106162_cm) {
            if(var7 != this.field_106162_cm && var8 != this.field_106162_cm) {
               var13 = 3;
               if(C_100451_alf.field_106117_q[var5] && !C_100451_alf.field_106117_q[var6]) {
                  var13 = 3;
               }

               if(C_100451_alf.field_106117_q[var6] && !C_100451_alf.field_106117_q[var5]) {
                  var13 = 2;
               }

               if(C_100451_alf.field_106117_q[var7] && !C_100451_alf.field_106117_q[var8]) {
                  var13 = 5;
               }

               if(C_100451_alf.field_106117_q[var8] && !C_100451_alf.field_106117_q[var7]) {
                  var13 = 4;
               }
            } else {
               var10 = var1.func_109349_a(var7 == this.field_106162_cm?var2 - 1:var2 + 1, var3, var4 - 1);
               var11 = var1.func_109349_a(var7 == this.field_106162_cm?var2 - 1:var2 + 1, var3, var4 + 1);
               var13 = 3;
               var12 = true;
               if(var7 == this.field_106162_cm) {
                  var14 = var1.func_109357_g(var2 - 1, var3, var4);
               } else {
                  var14 = var1.func_109357_g(var2 + 1, var3, var4);
               }

               if(var14 == 2) {
                  var13 = 2;
               }

               if((C_100451_alf.field_106117_q[var5] || C_100451_alf.field_106117_q[var10]) && !C_100451_alf.field_106117_q[var6] && !C_100451_alf.field_106117_q[var11]) {
                  var13 = 3;
               }

               if((C_100451_alf.field_106117_q[var6] || C_100451_alf.field_106117_q[var11]) && !C_100451_alf.field_106117_q[var5] && !C_100451_alf.field_106117_q[var10]) {
                  var13 = 2;
               }
            }
         } else {
            var10 = var1.func_109349_a(var2 - 1, var3, var5 == this.field_106162_cm?var4 - 1:var4 + 1);
            var11 = var1.func_109349_a(var2 + 1, var3, var5 == this.field_106162_cm?var4 - 1:var4 + 1);
            var13 = 5;
            var12 = true;
            if(var5 == this.field_106162_cm) {
               var14 = var1.func_109357_g(var2, var3, var4 - 1);
            } else {
               var14 = var1.func_109357_g(var2, var3, var4 + 1);
            }

            if(var14 == 4) {
               var13 = 4;
            }

            if((C_100451_alf.field_106117_q[var7] || C_100451_alf.field_106117_q[var10]) && !C_100451_alf.field_106117_q[var8] && !C_100451_alf.field_106117_q[var11]) {
               var13 = 5;
            }

            if((C_100451_alf.field_106117_q[var8] || C_100451_alf.field_106117_q[var11]) && !C_100451_alf.field_106117_q[var7] && !C_100451_alf.field_106117_q[var10]) {
               var13 = 4;
            }
         }

         var1.func_109488_c(var2, var3, var4, var13);
      }
   }

   public int func_105988_d(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return 4;
   }

   public int func_106024_a(int var1) {
      return 4;
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = 0;
      if(var1.func_109349_a(var2 - 1, var3, var4) == this.field_106162_cm) {
         ++var5;
      }

      if(var1.func_109349_a(var2 + 1, var3, var4) == this.field_106162_cm) {
         ++var5;
      }

      if(var1.func_109349_a(var2, var3, var4 - 1) == this.field_106162_cm) {
         ++var5;
      }

      if(var1.func_109349_a(var2, var3, var4 + 1) == this.field_106162_cm) {
         ++var5;
      }

      return var5 > 1?false:(this.func_106341_l(var1, var2 - 1, var3, var4)?false:(this.func_106341_l(var1, var2 + 1, var3, var4)?false:(this.func_106341_l(var1, var2, var3, var4 - 1)?false:!this.func_106341_l(var1, var2, var3, var4 + 1))));
   }

   private boolean func_106341_l(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109349_a(var2, var3, var4) != this.field_106162_cm?false:(var1.func_109349_a(var2 - 1, var3, var4) == this.field_106162_cm?true:(var1.func_109349_a(var2 + 1, var3, var4) == this.field_106162_cm?true:(var1.func_109349_a(var2, var3, var4 - 1) == this.field_106162_cm?true:var1.func_109349_a(var2, var3, var4 + 1) == this.field_106162_cm)));
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      super.func_106017_a(var1, var2, var3, var4, var5);
      C_100422_amb var6 = (C_100422_amb)var1.func_109353_p(var2, var3, var4);
      if(var6 != null) {
         var6.func_102931_h();
      }

   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      C_100422_amb var7 = (C_100422_amb)var1.func_109353_p(var2, var3, var4);
      if(var7 != null) {
         for(int var8 = 0; var8 < var7.func_103003_k_(); ++var8) {
            C_100994_tv var9 = var7.func_103007_a(var8);
            if(var9 != null) {
               float var10 = this.field_106342_a.nextFloat() * 0.8F + 0.1F;
               float var11 = this.field_106342_a.nextFloat() * 0.8F + 0.1F;

               C_100576_pg var14;
               for(float var12 = this.field_106342_a.nextFloat() * 0.8F + 0.1F; var9.field_111398_a > 0; var1.func_109513_d(var14)) {
                  int var13 = this.field_106342_a.nextInt(21) + 10;
                  if(var13 > var9.field_111398_a) {
                     var13 = var9.field_111398_a;
                  }

                  var9.field_111398_a -= var13;
                  var14 = new C_100576_pg(var1, (double)((float)var2 + var10), (double)((float)var3 + var11), (double)((float)var4 + var12), new C_100994_tv(var9.field_111397_c, var13, var9.func_111367_j()));
                  float var15 = 0.05F;
                  var14.field_103215_w = (double)((float)this.field_106342_a.nextGaussian() * var15);
                  var14.field_103240_x = (double)((float)this.field_106342_a.nextGaussian() * var15 + 0.2F);
                  var14.field_103238_y = (double)((float)this.field_106342_a.nextGaussian() * var15);
                  if(var9.func_111339_o()) {
                     var14.field_103279_a.func_111349_d((C_100353_bh)var9.func_111352_p().func_107485_b());
                  }
               }
            }
         }
      }

      super.func_106041_a(var1, var2, var3, var4, var5, var6);
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      Object var10 = (C_100422_amb)var1.func_109353_p(var2, var3, var4);
      if(var10 == null) {
         return true;
      } else if(var1.func_109360_s(var2, var3 + 1, var4)) {
         return true;
      } else if(func_106339_n(var1, var2, var3, var4)) {
         return true;
      } else if(var1.func_109349_a(var2 - 1, var3, var4) == this.field_106162_cm && (var1.func_109360_s(var2 - 1, var3 + 1, var4) || func_106339_n(var1, var2 - 1, var3, var4))) {
         return true;
      } else if(var1.func_109349_a(var2 + 1, var3, var4) == this.field_106162_cm && (var1.func_109360_s(var2 + 1, var3 + 1, var4) || func_106339_n(var1, var2 + 1, var3, var4))) {
         return true;
      } else if(var1.func_109349_a(var2, var3, var4 - 1) == this.field_106162_cm && (var1.func_109360_s(var2, var3 + 1, var4 - 1) || func_106339_n(var1, var2, var3, var4 - 1))) {
         return true;
      } else if(var1.func_109349_a(var2, var3, var4 + 1) == this.field_106162_cm && (var1.func_109360_s(var2, var3 + 1, var4 + 1) || func_106339_n(var1, var2, var3, var4 + 1))) {
         return true;
      } else {
         if(var1.func_109349_a(var2 - 1, var3, var4) == this.field_106162_cm) {
            var10 = new C_100714_kk("container.chestDouble", (C_100422_amb)var1.func_109353_p(var2 - 1, var3, var4), (C_100716_kl)var10);
         }

         if(var1.func_109349_a(var2 + 1, var3, var4) == this.field_106162_cm) {
            var10 = new C_100714_kk("container.chestDouble", (C_100716_kl)var10, (C_100422_amb)var1.func_109353_p(var2 + 1, var3, var4));
         }

         if(var1.func_109349_a(var2, var3, var4 - 1) == this.field_106162_cm) {
            var10 = new C_100714_kk("container.chestDouble", (C_100422_amb)var1.func_109353_p(var2, var3, var4 - 1), (C_100716_kl)var10);
         }

         if(var1.func_109349_a(var2, var3, var4 + 1) == this.field_106162_cm) {
            var10 = new C_100714_kk("container.chestDouble", (C_100716_kl)var10, (C_100422_amb)var1.func_109353_p(var2, var3, var4 + 1));
         }

         if(var1.field_109557_J) {
            return true;
         } else {
            var5.func_103785_a((C_100716_kl)var10);
            return true;
         }
      }
   }

   public C_100398_amm func_106326_a(C_100873_xe var1) {
      return new C_100422_amb();
   }

   private static boolean func_106339_n(C_100873_xe var0, int var1, int var2, int var3) {
      Iterator var4 = var0.func_109518_a(C_100535_om.class, C_100412_amr.func_107892_a().func_107844_a((double)var1, (double)(var2 + 1), (double)var3, (double)(var1 + 1), (double)(var2 + 2), (double)(var3 + 1))).iterator();

      C_100535_om var6;
      do {
         if(!var4.hasNext()) {
            return false;
         }

         C_100535_om var5 = (C_100535_om)var4.next();
         var6 = (C_100535_om)var5;
      } while(!var6.func_103553_n());

      return true;
   }
}
