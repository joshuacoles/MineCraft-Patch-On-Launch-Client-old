import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class C_101075_qy {

   public List field_111515_a = new ArrayList();
   public List field_111513_b = new ArrayList();
   public int field_111514_c = 0;
   private short field_111512_e = 0;
   protected List field_111511_d = new ArrayList();
   private Set field_111510_f = new HashSet();


   protected C_101048_rz func_111493_a(C_101048_rz var1) {
      var1.field_111460_g = this.field_111513_b.size();
      this.field_111513_b.add(var1);
      this.field_111515_a.add((Object)null);
      return var1;
   }

   public void func_111507_a(C_101070_re var1) {
      if(this.field_111511_d.contains(var1)) {
         throw new IllegalArgumentException("Listener already listening");
      } else {
         this.field_111511_d.add(var1);
         var1.func_103872_a(this, this.func_111499_a());
         this.func_111506_b();
      }
   }

   public void func_111500_b(C_101070_re var1) {
      this.field_111511_d.remove(var1);
   }

   public List func_111499_a() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.field_111513_b.iterator();

      while(var2.hasNext()) {
         C_101048_rz var3 = (C_101048_rz)var2.next();
         var1.add(var3.func_111446_c());
      }

      return var1;
   }

   public void func_111506_b() {
      for(int var1 = 0; var1 < this.field_111513_b.size(); ++var1) {
         C_100994_tv var2 = ((C_101048_rz)this.field_111513_b.get(var1)).func_111446_c();
         C_100994_tv var3 = (C_100994_tv)this.field_111515_a.get(var1);
         if(!C_100994_tv.func_111340_b(var3, var2)) {
            var3 = var2 == null?null:var2.func_111360_l();
            this.field_111515_a.set(var1, var3);
            Iterator var4 = this.field_111511_d.iterator();

            while(var4.hasNext()) {
               C_101070_re var5 = (C_101070_re)var4.next();
               var5.func_103873_a(this, var1, var3);
            }
         }
      }

   }

   public boolean func_111508_a(C_101095_qg var1, int var2) {
      return false;
   }

   public C_101048_rz func_111505_a(C_100716_kl var1, int var2) {
      Iterator var3 = this.field_111513_b.iterator();

      C_101048_rz var4;
      do {
         if(!var3.hasNext()) {
            return null;
         }

         var4 = (C_101048_rz)var3.next();
      } while(!var4.func_111456_a(var1, var2));

      return var4;
   }

   public C_101048_rz func_111503_a(int var1) {
      return (C_101048_rz)this.field_111513_b.get(var1);
   }

   public C_100994_tv func_111502_b(C_101095_qg var1, int var2) {
      C_101048_rz var3 = (C_101048_rz)this.field_111513_b.get(var2);
      return var3 != null?var3.func_111446_c():null;
   }

   public C_100994_tv func_111496_a(int var1, int var2, int var3, C_101095_qg var4) {
      C_100994_tv var5 = null;
      C_101092_qf var6 = var4.field_103857_bK;
      C_101048_rz var7;
      C_100994_tv var8;
      int var10;
      C_100994_tv var11;
      if((var3 == 0 || var3 == 1) && (var2 == 0 || var2 == 1)) {
         if(var1 == -999) {
            if(var6.func_104824_n() != null && var1 == -999) {
               if(var2 == 0) {
                  var4.func_103767_c(var6.func_104824_n());
                  var6.func_104801_b((C_100994_tv)null);
               }

               if(var2 == 1) {
                  var4.func_103767_c(var6.func_104824_n().func_111342_a(1));
                  if(var6.func_104824_n().field_111398_a == 0) {
                     var6.func_104801_b((C_100994_tv)null);
                  }
               }
            }
         } else if(var3 == 1) {
            var7 = (C_101048_rz)this.field_111513_b.get(var1);
            if(var7 != null && var7.func_111451_a(var4)) {
               var8 = this.func_111502_b(var4, var1);
               if(var8 != null) {
                  int var12 = var8.field_111397_c;
                  var5 = var8.func_111360_l();
                  if(var7 != null && var7.func_111446_c() != null && var7.func_111446_c().field_111397_c == var12) {
                     this.func_111494_a(var1, var2, true, var4);
                  }
               }
            }
         } else {
            if(var1 < 0) {
               return null;
            }

            var7 = (C_101048_rz)this.field_111513_b.get(var1);
            if(var7 != null) {
               var8 = var7.func_111446_c();
               C_100994_tv var13 = var6.func_104824_n();
               if(var8 != null) {
                  var5 = var8.func_111360_l();
               }

               if(var8 == null) {
                  if(var13 != null && var7.func_111458_a(var13)) {
                     var10 = var2 == 0?var13.field_111398_a:1;
                     if(var10 > var7.func_111455_a()) {
                        var10 = var7.func_111455_a();
                     }

                     var7.func_111447_c(var13.func_111342_a(var10));
                     if(var13.field_111398_a == 0) {
                        var6.func_104801_b((C_100994_tv)null);
                     }
                  }
               } else if(var7.func_111451_a(var4)) {
                  if(var13 == null) {
                     var10 = var2 == 0?var8.field_111398_a:(var8.field_111398_a + 1) / 2;
                     var11 = var7.func_111445_a(var10);
                     var6.func_104801_b(var11);
                     if(var8.field_111398_a == 0) {
                        var7.func_111447_c((C_100994_tv)null);
                     }

                     var7.func_111452_a(var4, var6.func_104824_n());
                  } else if(var7.func_111458_a(var13)) {
                     if(var8.field_111397_c == var13.field_111397_c && (!var8.func_111383_g() || var8.func_111367_j() == var13.func_111367_j()) && C_100994_tv.func_111379_a(var8, var13)) {
                        var10 = var2 == 0?var13.field_111398_a:1;
                        if(var10 > var7.func_111455_a() - var8.field_111398_a) {
                           var10 = var7.func_111455_a() - var8.field_111398_a;
                        }

                        if(var10 > var13.func_111380_d() - var8.field_111398_a) {
                           var10 = var13.func_111380_d() - var8.field_111398_a;
                        }

                        var13.func_111342_a(var10);
                        if(var13.field_111398_a == 0) {
                           var6.func_104801_b((C_100994_tv)null);
                        }

                        var8.field_111398_a += var10;
                     } else if(var13.field_111398_a <= var7.func_111455_a()) {
                        var7.func_111447_c(var13);
                        var6.func_104801_b(var8);
                     }
                  } else if(var8.field_111397_c == var13.field_111397_c && var13.func_111380_d() > 1 && (!var8.func_111383_g() || var8.func_111367_j() == var13.func_111367_j()) && C_100994_tv.func_111379_a(var8, var13)) {
                     var10 = var8.field_111398_a;
                     if(var10 > 0 && var10 + var13.field_111398_a <= var13.func_111380_d()) {
                        var13.field_111398_a += var10;
                        var8 = var7.func_111445_a(var10);
                        if(var8.field_111398_a == 0) {
                           var7.func_111447_c((C_100994_tv)null);
                        }

                        var7.func_111452_a(var4, var6.func_104824_n());
                     }
                  }
               }

               var7.func_111454_e();
            }
         }
      } else if(var3 == 2 && var2 >= 0 && var2 < 9) {
         var7 = (C_101048_rz)this.field_111513_b.get(var1);
         if(var7.func_111451_a(var4)) {
            var8 = var6.func_103007_a(var2);
            boolean var9 = var8 == null || var7.field_111459_f == var6 && var7.func_111458_a(var8);
            var10 = -1;
            if(!var9) {
               var10 = var6.func_104812_i();
               var9 |= var10 > -1;
            }

            if(var7.func_111453_d() && var9) {
               var11 = var7.func_111446_c();
               var6.func_103006_a(var2, var11);
               if((var7.field_111459_f != var6 || !var7.func_111458_a(var8)) && var8 != null) {
                  if(var10 > -1) {
                     var6.func_104809_a(var8);
                     var7.func_111447_c((C_100994_tv)null);
                     var7.func_111452_a(var4, var11);
                  }
               } else {
                  var7.func_111447_c(var8);
                  var7.func_111452_a(var4, var11);
               }
            } else if(!var7.func_111453_d() && var8 != null && var7.func_111458_a(var8)) {
               var6.func_103006_a(var2, (C_100994_tv)null);
               var7.func_111447_c(var8);
            }
         }
      } else if(var3 == 3 && var4.field_103869_cf.field_111597_d && var6.func_104824_n() == null && var1 > 0) {
         var7 = (C_101048_rz)this.field_111513_b.get(var1);
         if(var7 != null && var7.func_111453_d()) {
            var8 = var7.func_111446_c().func_111360_l();
            var8.field_111398_a = var8.func_111380_d();
            var6.func_104801_b(var8);
         }
      }

      return var5;
   }

   protected void func_111494_a(int var1, int var2, boolean var3, C_101095_qg var4) {
      this.func_111496_a(var1, var2, 1, var4);
   }

   public void func_111501_a(C_101095_qg var1) {
      C_101092_qf var2 = var1.field_103857_bK;
      if(var2.func_104824_n() != null) {
         var1.func_103767_c(var2.func_104824_n());
         var2.func_104801_b((C_100994_tv)null);
      }

   }

   public void func_111497_a(C_100716_kl var1) {
      this.func_111506_b();
   }

   public void func_111492_a(int var1, C_100994_tv var2) {
      this.func_111503_a(var1).func_111447_c(var2);
   }

   public void func_111491_a(C_100994_tv[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.func_111503_a(var2).func_111447_c(var1[var2]);
      }

   }

   public void func_111498_b(int var1, int var2) {}

   public short func_111509_a(C_101092_qf var1) {
      ++this.field_111512_e;
      return this.field_111512_e;
   }

   public boolean func_111495_b(C_101095_qg var1) {
      return !this.field_111510_f.contains(var1);
   }

   public void func_111490_a(C_101095_qg var1, boolean var2) {
      if(var2) {
         this.field_111510_f.remove(var1);
      } else {
         this.field_111510_f.add(var1);
      }

   }

   public abstract boolean func_111489_c(C_101095_qg var1);

   protected boolean func_111504_a(C_100994_tv var1, int var2, int var3, boolean var4) {
      boolean var5 = false;
      int var6 = var2;
      if(var4) {
         var6 = var3 - 1;
      }

      C_101048_rz var7;
      C_100994_tv var8;
      if(var1.func_111388_e()) {
         while(var1.field_111398_a > 0 && (!var4 && var6 < var3 || var4 && var6 >= var2)) {
            var7 = (C_101048_rz)this.field_111513_b.get(var6);
            var8 = var7.func_111446_c();
            if(var8 != null && var8.field_111397_c == var1.field_111397_c && (!var1.func_111383_g() || var1.func_111367_j() == var8.func_111367_j()) && C_100994_tv.func_111379_a(var1, var8)) {
               int var9 = var8.field_111398_a + var1.field_111398_a;
               if(var9 <= var1.func_111380_d()) {
                  var1.field_111398_a = 0;
                  var8.field_111398_a = var9;
                  var7.func_111454_e();
                  var5 = true;
               } else if(var8.field_111398_a < var1.func_111380_d()) {
                  var1.field_111398_a -= var1.func_111380_d() - var8.field_111398_a;
                  var8.field_111398_a = var1.func_111380_d();
                  var7.func_111454_e();
                  var5 = true;
               }
            }

            if(var4) {
               --var6;
            } else {
               ++var6;
            }
         }
      }

      if(var1.field_111398_a > 0) {
         if(var4) {
            var6 = var3 - 1;
         } else {
            var6 = var2;
         }

         while(!var4 && var6 < var3 || var4 && var6 >= var2) {
            var7 = (C_101048_rz)this.field_111513_b.get(var6);
            var8 = var7.func_111446_c();
            if(var8 == null) {
               var7.func_111447_c(var1.func_111360_l());
               var7.func_111454_e();
               var1.field_111398_a = 0;
               var5 = true;
               break;
            }

            if(var4) {
               --var6;
            } else {
               ++var6;
            }
         }
      }

      return var5;
   }
}
