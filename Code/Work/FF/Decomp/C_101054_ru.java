import java.util.Iterator;
import java.util.Map;

public class C_101054_ru extends C_101075_qy {

   private C_100716_kl field_111525_f = new C_101057_rx();
   private C_100716_kl field_111526_g = new C_101055_rv(this, "Repair", 2);
   private C_100873_xe field_111533_h;
   private int field_111534_i;
   private int field_111531_j;
   private int field_111532_k;
   public int field_111527_e = 0;
   private int field_111529_l = 0;
   private String field_111530_m;
   private final C_101095_qg field_111528_n;


   public C_101054_ru(C_101092_qf var1, C_100873_xe var2, int var3, int var4, int var5, C_101095_qg var6) {
      this.field_111533_h = var2;
      this.field_111534_i = var3;
      this.field_111531_j = var4;
      this.field_111532_k = var5;
      this.field_111528_n = var6;
      this.func_111493_a(new C_101048_rz(this.field_111526_g, 0, 27, 47));
      this.func_111493_a(new C_101048_rz(this.field_111526_g, 1, 76, 47));
      this.func_111493_a(new C_101056_rw(this, this.field_111525_f, 2, 134, 47, var2, var3, var4, var5));

      int var7;
      for(var7 = 0; var7 < 3; ++var7) {
         for(int var8 = 0; var8 < 9; ++var8) {
            this.func_111493_a(new C_101048_rz(var1, var8 + var7 * 9 + 9, 8 + var8 * 18, 84 + var7 * 18));
         }
      }

      for(var7 = 0; var7 < 9; ++var7) {
         this.func_111493_a(new C_101048_rz(var1, var7, 8 + var7 * 18, 142));
      }

   }

   public void func_111497_a(C_100716_kl var1) {
      super.func_111497_a(var1);
      if(var1 == this.field_111526_g) {
         this.func_111521_d();
      }

   }

   public void func_111521_d() {
      C_100994_tv var1 = this.field_111526_g.func_103007_a(0);
      this.field_111527_e = 0;
      int var2 = 0;
      byte var3 = 0;
      int var4 = 0;
      if(var1 == null) {
         this.field_111525_f.func_103006_a(0, (C_100994_tv)null);
         this.field_111527_e = 0;
      } else {
         C_100994_tv var5 = var1.func_111360_l();
         C_100994_tv var6 = this.field_111526_g.func_103007_a(1);
         Map var7 = C_100878_wh.func_110589_a(var5);
         int var18 = var3 + var1.func_111375_A() + (var6 == null?0:var6.func_111375_A());
         this.field_111529_l = 0;
         int var8;
         int var9;
         int var10;
         int var12;
         C_100904_wf var21;
         Iterator var20;
         if(var6 != null) {
            if(var5.func_111387_f() && C_100992_tt.field_110834_e[var5.field_111397_c].func_110790_a(var1, var6)) {
               var8 = Math.min(var5.func_111357_i(), var5.func_111364_k() / 4);
               if(var8 <= 0) {
                  this.field_111525_f.func_103006_a(0, (C_100994_tv)null);
                  this.field_111527_e = 0;
                  return;
               }

               for(var9 = 0; var8 > 0 && var9 < var6.field_111398_a; ++var9) {
                  var10 = var5.func_111357_i() - var8;
                  var5.func_111371_b(var10);
                  var2 += Math.max(1, var8 / 100) + var7.size();
                  var8 = Math.min(var5.func_111357_i(), var5.func_111364_k() / 4);
               }

               this.field_111529_l = var9;
            } else {
               if(var5.field_111397_c != var6.field_111397_c || !var5.func_111387_f()) {
                  this.field_111525_f.func_103006_a(0, (C_100994_tv)null);
                  this.field_111527_e = 0;
                  return;
               }

               if(var5.func_111387_f()) {
                  var8 = var1.func_111364_k() - var1.func_111357_i();
                  var9 = var6.func_111364_k() - var6.func_111357_i();
                  var10 = var9 + var5.func_111364_k() * 12 / 100;
                  int var11 = var8 + var10;
                  var12 = var5.func_111364_k() - var11;
                  if(var12 < 0) {
                     var12 = 0;
                  }

                  if(var12 < var5.func_111367_j()) {
                     var5.func_111371_b(var12);
                     var2 += Math.max(1, var10 / 100);
                  }
               }

               Map var19 = C_100878_wh.func_110589_a(var6);
               var20 = var19.keySet().iterator();

               while(var20.hasNext()) {
                  var10 = ((Integer)var20.next()).intValue();
                  var21 = C_100904_wf.field_110622_b[var10];
                  var12 = var7.containsKey(Integer.valueOf(var10))?((Integer)var7.get(Integer.valueOf(var10))).intValue():0;
                  int var13 = ((Integer)var19.get(Integer.valueOf(var10))).intValue();
                  int var10000;
                  if(var12 == var13) {
                     ++var13;
                     var10000 = var13;
                  } else {
                     var10000 = Math.max(var13, var12);
                  }

                  var13 = var10000;
                  int var14 = var13 - var12;
                  boolean var15 = true;
                  Iterator var16 = var7.keySet().iterator();

                  while(var16.hasNext()) {
                     int var17 = ((Integer)var16.next()).intValue();
                     if(var17 != var10 && !var21.func_110615_a(C_100904_wf.field_110622_b[var17])) {
                        var15 = false;
                        var2 += var14;
                     }
                  }

                  if(var15) {
                     if(var13 > var21.func_110617_b()) {
                        var13 = var21.func_110617_b();
                     }

                     var7.put(Integer.valueOf(var10), Integer.valueOf(var13));
                     byte var23 = 0;
                     switch(var21.func_110614_c()) {
                     case 1:
                        var23 = 8;
                        break;
                     case 2:
                        var23 = 4;
                     case 3:
                     case 4:
                     case 6:
                     case 7:
                     case 8:
                     case 9:
                     default:
                        break;
                     case 5:
                        var23 = 2;
                        break;
                     case 10:
                        var23 = 1;
                     }

                     var2 += var23 * var14;
                  }
               }
            }
         }

         if(this.field_111530_m != null && !this.field_111530_m.equalsIgnoreCase(var1.func_111336_r()) && this.field_111530_m.length() > 0) {
            var4 = var1.func_111387_f()?7:var1.field_111398_a * 5;
            var2 += var4;
            if(var1.func_111370_s()) {
               var18 += var4 / 2;
            }

            var5.func_111343_c(this.field_111530_m);
         }

         var8 = 0;

         byte var22;
         for(var20 = var7.keySet().iterator(); var20.hasNext(); var18 += var8 + var12 * var22) {
            var10 = ((Integer)var20.next()).intValue();
            var21 = C_100904_wf.field_110622_b[var10];
            var12 = ((Integer)var7.get(Integer.valueOf(var10))).intValue();
            var22 = 0;
            ++var8;
            switch(var21.func_110614_c()) {
            case 1:
               var22 = 8;
               break;
            case 2:
               var22 = 4;
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
               break;
            case 5:
               var22 = 2;
               break;
            case 10:
               var22 = 1;
            }
         }

         this.field_111527_e = var18 + var2;
         if(var2 <= 0) {
            var5 = null;
         }

         if(var4 == var2 && var4 > 0 && this.field_111527_e >= 40) {
            System.out.println("Naming an item only, cost too high; giving discount to cap cost to 39 levels");
            this.field_111527_e = 39;
         }

         if(this.field_111527_e >= 40 && !this.field_111528_n.field_103869_cf.field_111597_d) {
            var5 = null;
         }

         if(var5 != null) {
            var9 = var5.func_111375_A();
            if(var6 != null && var9 < var6.func_111375_A()) {
               var9 = var6.func_111375_A();
            }

            if(var5.func_111370_s()) {
               var9 -= 5;
            }

            if(var9 < 0) {
               var9 = 0;
            }

            var9 += 2;
            var5.func_111389_c(var9);
            C_100878_wh.func_110590_a(var7, var5);
         }

         this.field_111525_f.func_103006_a(0, var5);
         this.func_111506_b();
      }
   }

   public void func_111507_a(C_101070_re var1) {
      super.func_111507_a(var1);
      var1.func_103874_a(this, 0, this.field_111527_e);
   }

   public void func_111498_b(int var1, int var2) {
      if(var1 == 0) {
         this.field_111527_e = var2;
      }

   }

   public void func_111501_a(C_101095_qg var1) {
      super.func_111501_a(var1);
      if(!this.field_111533_h.field_109557_J) {
         for(int var2 = 0; var2 < this.field_111526_g.func_103003_k_(); ++var2) {
            C_100994_tv var3 = this.field_111526_g.func_103001_a_(var2);
            if(var3 != null) {
               var1.func_103767_c(var3);
            }
         }

      }
   }

   public boolean func_111489_c(C_101095_qg var1) {
      return this.field_111533_h.func_109349_a(this.field_111534_i, this.field_111531_j, this.field_111532_k) != C_100451_alf.field_106164_ck.field_106162_cm?false:var1.func_103146_e((double)this.field_111534_i + 0.5D, (double)this.field_111531_j + 0.5D, (double)this.field_111532_k + 0.5D) <= 64.0D;
   }

   public C_100994_tv func_111502_b(C_101095_qg var1, int var2) {
      C_100994_tv var3 = null;
      C_101048_rz var4 = (C_101048_rz)this.field_111513_b.get(var2);
      if(var4 != null && var4.func_111453_d()) {
         C_100994_tv var5 = var4.func_111446_c();
         var3 = var5.func_111360_l();
         if(var2 == 2) {
            if(!this.func_111504_a(var5, 3, 39, true)) {
               return null;
            }

            var4.func_111457_a(var5, var3);
         } else if(var2 != 0 && var2 != 1) {
            if(var2 >= 3 && var2 < 39 && !this.func_111504_a(var5, 0, 2, false)) {
               return null;
            }
         } else if(!this.func_111504_a(var5, 3, 39, false)) {
            return null;
         }

         if(var5.field_111398_a == 0) {
            var4.func_111447_c((C_100994_tv)null);
         } else {
            var4.func_111454_e();
         }

         if(var5.field_111398_a == var3.field_111398_a) {
            return null;
         }

         var4.func_111452_a(var1, var5);
      }

      return var3;
   }

   public void func_111524_a(String var1) {
      this.field_111530_m = var1;
      if(this.func_111503_a(2).func_111453_d()) {
         this.func_111503_a(2).func_111446_c().func_111343_c(this.field_111530_m);
      }

      this.func_111521_d();
   }

   // $FF: synthetic method
   static C_100716_kl func_111523_a(C_101054_ru var0) {
      return var0.field_111526_g;
   }

   // $FF: synthetic method
   static int func_111522_b(C_101054_ru var0) {
      return var0.field_111529_l;
   }
}
