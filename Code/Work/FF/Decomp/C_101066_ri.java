import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class C_101066_ri extends C_101075_qy {

   public C_100716_kl field_111545_e = new C_101065_rj(this, "Enchant", 1);
   private C_100873_xe field_111549_h;
   private int field_111550_i;
   private int field_111547_j;
   private int field_111548_k;
   private Random field_111546_l = new Random();
   public long field_111543_f;
   public int[] field_111544_g = new int[3];


   public C_101066_ri(C_101092_qf var1, C_100873_xe var2, int var3, int var4, int var5) {
      this.field_111549_h = var2;
      this.field_111550_i = var3;
      this.field_111547_j = var4;
      this.field_111548_k = var5;
      this.func_111493_a(new C_101064_rk(this, this.field_111545_e, 0, 25, 47));

      int var6;
      for(var6 = 0; var6 < 3; ++var6) {
         for(int var7 = 0; var7 < 9; ++var7) {
            this.func_111493_a(new C_101048_rz(var1, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for(var6 = 0; var6 < 9; ++var6) {
         this.func_111493_a(new C_101048_rz(var1, var6, 8 + var6 * 18, 142));
      }

   }

   public void func_111507_a(C_101070_re var1) {
      super.func_111507_a(var1);
      var1.func_103874_a(this, 0, this.field_111544_g[0]);
      var1.func_103874_a(this, 1, this.field_111544_g[1]);
      var1.func_103874_a(this, 2, this.field_111544_g[2]);
   }

   public void func_111506_b() {
      super.func_111506_b();
      Iterator var1 = this.field_111511_d.iterator();

      while(var1.hasNext()) {
         C_101070_re var2 = (C_101070_re)var1.next();
         var2.func_103874_a(this, 0, this.field_111544_g[0]);
         var2.func_103874_a(this, 1, this.field_111544_g[1]);
         var2.func_103874_a(this, 2, this.field_111544_g[2]);
      }

   }

   public void func_111498_b(int var1, int var2) {
      if(var1 >= 0 && var1 <= 2) {
         this.field_111544_g[var1] = var2;
      } else {
         super.func_111498_b(var1, var2);
      }

   }

   public void func_111497_a(C_100716_kl var1) {
      if(var1 == this.field_111545_e) {
         C_100994_tv var2 = var1.func_103007_a(0);
         int var3;
         if(var2 != null && var2.func_111347_v()) {
            this.field_111543_f = this.field_111546_l.nextLong();
            if(!this.field_111549_h.field_109557_J) {
               var3 = 0;

               int var4;
               for(var4 = -1; var4 <= 1; ++var4) {
                  for(int var5 = -1; var5 <= 1; ++var5) {
                     if((var4 != 0 || var5 != 0) && this.field_111549_h.func_109352_c(this.field_111550_i + var5, this.field_111547_j, this.field_111548_k + var4) && this.field_111549_h.func_109352_c(this.field_111550_i + var5, this.field_111547_j + 1, this.field_111548_k + var4)) {
                        if(this.field_111549_h.func_109349_a(this.field_111550_i + var5 * 2, this.field_111547_j, this.field_111548_k + var4 * 2) == C_100451_alf.field_106214_aq.field_106162_cm) {
                           ++var3;
                        }

                        if(this.field_111549_h.func_109349_a(this.field_111550_i + var5 * 2, this.field_111547_j + 1, this.field_111548_k + var4 * 2) == C_100451_alf.field_106214_aq.field_106162_cm) {
                           ++var3;
                        }

                        if(var5 != 0 && var4 != 0) {
                           if(this.field_111549_h.func_109349_a(this.field_111550_i + var5 * 2, this.field_111547_j, this.field_111548_k + var4) == C_100451_alf.field_106214_aq.field_106162_cm) {
                              ++var3;
                           }

                           if(this.field_111549_h.func_109349_a(this.field_111550_i + var5 * 2, this.field_111547_j + 1, this.field_111548_k + var4) == C_100451_alf.field_106214_aq.field_106162_cm) {
                              ++var3;
                           }

                           if(this.field_111549_h.func_109349_a(this.field_111550_i + var5, this.field_111547_j, this.field_111548_k + var4 * 2) == C_100451_alf.field_106214_aq.field_106162_cm) {
                              ++var3;
                           }

                           if(this.field_111549_h.func_109349_a(this.field_111550_i + var5, this.field_111547_j + 1, this.field_111548_k + var4 * 2) == C_100451_alf.field_106214_aq.field_106162_cm) {
                              ++var3;
                           }
                        }
                     }
                  }
               }

               for(var4 = 0; var4 < 3; ++var4) {
                  this.field_111544_g[var4] = C_100878_wh.func_110582_a(this.field_111546_l, var4, var3, var2);
               }

               this.func_111506_b();
            }
         } else {
            for(var3 = 0; var3 < 3; ++var3) {
               this.field_111544_g[var3] = 0;
            }
         }
      }

   }

   public boolean func_111508_a(C_101095_qg var1, int var2) {
      C_100994_tv var3 = this.field_111545_e.func_103007_a(0);
      if(this.field_111544_g[var2] > 0 && var3 != null && (var1.field_103866_cg >= this.field_111544_g[var2] || var1.field_103869_cf.field_111597_d)) {
         if(!this.field_111549_h.field_109557_J) {
            List var4 = C_100878_wh.func_110578_b(this.field_111546_l, var3, this.field_111544_g[var2]);
            if(var4 != null) {
               var1.func_103804_a(-this.field_111544_g[var2]);
               Iterator var5 = var4.iterator();

               while(var5.hasNext()) {
                  C_100883_wm var6 = (C_100883_wm)var5.next();
                  var3.func_111392_a(var6.field_109100_b, var6.field_109101_c);
               }

               this.func_111497_a(this.field_111545_e);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void func_111501_a(C_101095_qg var1) {
      super.func_111501_a(var1);
      if(!this.field_111549_h.field_109557_J) {
         C_100994_tv var2 = this.field_111545_e.func_103001_a_(0);
         if(var2 != null) {
            var1.func_103767_c(var2);
         }

      }
   }

   public boolean func_111489_c(C_101095_qg var1) {
      return this.field_111549_h.func_109349_a(this.field_111550_i, this.field_111547_j, this.field_111548_k) != C_100451_alf.field_106247_bH.field_106162_cm?false:var1.func_103146_e((double)this.field_111550_i + 0.5D, (double)this.field_111547_j + 0.5D, (double)this.field_111548_k + 0.5D) <= 64.0D;
   }

   public C_100994_tv func_111502_b(C_101095_qg var1, int var2) {
      C_100994_tv var3 = null;
      C_101048_rz var4 = (C_101048_rz)this.field_111513_b.get(var2);
      if(var4 != null && var4.func_111453_d()) {
         C_100994_tv var5 = var4.func_111446_c();
         var3 = var5.func_111360_l();
         if(var2 == 0) {
            if(!this.func_111504_a(var5, 1, 37, true)) {
               return null;
            }
         } else {
            if(((C_101048_rz)this.field_111513_b.get(0)).func_111453_d() || !((C_101048_rz)this.field_111513_b.get(0)).func_111458_a(var5)) {
               return null;
            }

            if(var5.func_111339_o() && var5.field_111398_a == 1) {
               ((C_101048_rz)this.field_111513_b.get(0)).func_111447_c(var5.func_111360_l());
               var5.field_111398_a = 0;
            } else if(var5.field_111398_a >= 1) {
               ((C_101048_rz)this.field_111513_b.get(0)).func_111447_c(new C_100994_tv(var5.field_111397_c, 1, var5.func_111367_j()));
               --var5.field_111398_a;
            }
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
}
