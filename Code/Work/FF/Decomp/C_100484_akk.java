import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class C_100484_akk extends C_100451_alf {

   private boolean field_106464_a = true;
   private Set field_106463_b = new HashSet();


   public C_100484_akk(int var1, int var2) {
      super(var1, var2, C_100664_afg.field_109027_q);
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
   }

   public int func_106029_a(int var1, int var2) {
      return this.field_106165_cl;
   }

   public C_100412_amr func_106021_e(C_100873_xe var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean func_105994_c() {
      return false;
   }

   public boolean func_105977_b() {
      return false;
   }

   public int func_106013_d() {
      return 5;
   }

   public int func_106069_b(C_100837_xo var1, int var2, int var3, int var4) {
      return 8388608;
   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      return var1.func_109348_t(var2, var3 - 1, var4) || var1.func_109349_a(var2, var3 - 1, var4) == C_100451_alf.field_106142_bg.field_106162_cm;
   }

   private void func_106461_l(C_100873_xe var1, int var2, int var3, int var4) {
      this.func_106457_a(var1, var2, var3, var4, var2, var3, var4);
      ArrayList var5 = new ArrayList(this.field_106463_b);
      this.field_106463_b.clear();
      Iterator var6 = var5.iterator();

      while(var6.hasNext()) {
         C_100851_xw var7 = (C_100851_xw)var6.next();
         var1.func_109460_h(var7.field_110207_a, var7.field_110205_b, var7.field_110206_c, this.field_106162_cm);
      }

   }

   private void func_106457_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.func_109357_g(var2, var3, var4);
      int var9 = 0;
      this.field_106464_a = false;
      boolean var10 = var1.func_109425_z(var2, var3, var4);
      this.field_106464_a = true;
      int var11;
      int var12;
      int var13;
      if(var10) {
         var9 = 15;
      } else {
         for(var11 = 0; var11 < 4; ++var11) {
            var12 = var2;
            var13 = var4;
            if(var11 == 0) {
               var12 = var2 - 1;
            }

            if(var11 == 1) {
               ++var12;
            }

            if(var11 == 2) {
               var13 = var4 - 1;
            }

            if(var11 == 3) {
               ++var13;
            }

            if(var12 != var5 || var3 != var6 || var13 != var7) {
               var9 = this.func_106460_d(var1, var12, var3, var13, var9);
            }

            if(var1.func_109360_s(var12, var3, var13) && !var1.func_109360_s(var2, var3 + 1, var4)) {
               if(var12 != var5 || var3 + 1 != var6 || var13 != var7) {
                  var9 = this.func_106460_d(var1, var12, var3 + 1, var13, var9);
               }
            } else if(!var1.func_109360_s(var12, var3, var13) && (var12 != var5 || var3 - 1 != var6 || var13 != var7)) {
               var9 = this.func_106460_d(var1, var12, var3 - 1, var13, var9);
            }
         }

         if(var9 > 0) {
            --var9;
         } else {
            var9 = 0;
         }
      }

      if(var8 != var9) {
         var1.field_109579_s = true;
         var1.func_109488_c(var2, var3, var4, var9);
         var1.func_109511_e(var2, var3, var4, var2, var3, var4);
         var1.field_109579_s = false;

         for(var11 = 0; var11 < 4; ++var11) {
            var12 = var2;
            var13 = var4;
            int var14 = var3 - 1;
            if(var11 == 0) {
               var12 = var2 - 1;
            }

            if(var11 == 1) {
               ++var12;
            }

            if(var11 == 2) {
               var13 = var4 - 1;
            }

            if(var11 == 3) {
               ++var13;
            }

            if(var1.func_109360_s(var12, var3, var13)) {
               var14 += 2;
            }

            boolean var15 = false;
            int var16 = this.func_106460_d(var1, var12, var3, var13, -1);
            var9 = var1.func_109357_g(var2, var3, var4);
            if(var9 > 0) {
               --var9;
            }

            if(var16 >= 0 && var16 != var9) {
               this.func_106457_a(var1, var12, var3, var13, var2, var3, var4);
            }

            var16 = this.func_106460_d(var1, var12, var14, var13, -1);
            var9 = var1.func_109357_g(var2, var3, var4);
            if(var9 > 0) {
               --var9;
            }

            if(var16 >= 0 && var16 != var9) {
               this.func_106457_a(var1, var12, var14, var13, var2, var3, var4);
            }
         }

         if(var8 < var9 || var9 == 0) {
            this.field_106463_b.add(new C_100851_xw(var2, var3, var4));
            this.field_106463_b.add(new C_100851_xw(var2 - 1, var3, var4));
            this.field_106463_b.add(new C_100851_xw(var2 + 1, var3, var4));
            this.field_106463_b.add(new C_100851_xw(var2, var3 - 1, var4));
            this.field_106463_b.add(new C_100851_xw(var2, var3 + 1, var4));
            this.field_106463_b.add(new C_100851_xw(var2, var3, var4 - 1));
            this.field_106463_b.add(new C_100851_xw(var2, var3, var4 + 1));
         }
      }

   }

   private void func_106459_n(C_100873_xe var1, int var2, int var3, int var4) {
      if(var1.func_109349_a(var2, var3, var4) == this.field_106162_cm) {
         var1.func_109460_h(var2, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2 - 1, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2 + 1, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3, var4 - 1, this.field_106162_cm);
         var1.func_109460_h(var2, var3, var4 + 1, this.field_106162_cm);
         var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3 + 1, var4, this.field_106162_cm);
      }
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      super.func_106054_g(var1, var2, var3, var4);
      if(!var1.field_109557_J) {
         this.func_106461_l(var1, var2, var3, var4);
         var1.func_109460_h(var2, var3 + 1, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
         this.func_106459_n(var1, var2 - 1, var3, var4);
         this.func_106459_n(var1, var2 + 1, var3, var4);
         this.func_106459_n(var1, var2, var3, var4 - 1);
         this.func_106459_n(var1, var2, var3, var4 + 1);
         if(var1.func_109360_s(var2 - 1, var3, var4)) {
            this.func_106459_n(var1, var2 - 1, var3 + 1, var4);
         } else {
            this.func_106459_n(var1, var2 - 1, var3 - 1, var4);
         }

         if(var1.func_109360_s(var2 + 1, var3, var4)) {
            this.func_106459_n(var1, var2 + 1, var3 + 1, var4);
         } else {
            this.func_106459_n(var1, var2 + 1, var3 - 1, var4);
         }

         if(var1.func_109360_s(var2, var3, var4 - 1)) {
            this.func_106459_n(var1, var2, var3 + 1, var4 - 1);
         } else {
            this.func_106459_n(var1, var2, var3 - 1, var4 - 1);
         }

         if(var1.func_109360_s(var2, var3, var4 + 1)) {
            this.func_106459_n(var1, var2, var3 + 1, var4 + 1);
         } else {
            this.func_106459_n(var1, var2, var3 - 1, var4 + 1);
         }

      }
   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      super.func_106041_a(var1, var2, var3, var4, var5, var6);
      if(!var1.field_109557_J) {
         var1.func_109460_h(var2, var3 + 1, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3 - 1, var4, this.field_106162_cm);
         var1.func_109460_h(var2 + 1, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2 - 1, var3, var4, this.field_106162_cm);
         var1.func_109460_h(var2, var3, var4 + 1, this.field_106162_cm);
         var1.func_109460_h(var2, var3, var4 - 1, this.field_106162_cm);
         this.func_106461_l(var1, var2, var3, var4);
         this.func_106459_n(var1, var2 - 1, var3, var4);
         this.func_106459_n(var1, var2 + 1, var3, var4);
         this.func_106459_n(var1, var2, var3, var4 - 1);
         this.func_106459_n(var1, var2, var3, var4 + 1);
         if(var1.func_109360_s(var2 - 1, var3, var4)) {
            this.func_106459_n(var1, var2 - 1, var3 + 1, var4);
         } else {
            this.func_106459_n(var1, var2 - 1, var3 - 1, var4);
         }

         if(var1.func_109360_s(var2 + 1, var3, var4)) {
            this.func_106459_n(var1, var2 + 1, var3 + 1, var4);
         } else {
            this.func_106459_n(var1, var2 + 1, var3 - 1, var4);
         }

         if(var1.func_109360_s(var2, var3, var4 - 1)) {
            this.func_106459_n(var1, var2, var3 + 1, var4 - 1);
         } else {
            this.func_106459_n(var1, var2, var3 - 1, var4 - 1);
         }

         if(var1.func_109360_s(var2, var3, var4 + 1)) {
            this.func_106459_n(var1, var2, var3 + 1, var4 + 1);
         } else {
            this.func_106459_n(var1, var2, var3 - 1, var4 + 1);
         }

      }
   }

   private int func_106460_d(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(var1.func_109349_a(var2, var3, var4) != this.field_106162_cm) {
         return var5;
      } else {
         int var6 = var1.func_109357_g(var2, var3, var4);
         return var6 > var5?var6:var5;
      }
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.field_109557_J) {
         int var6 = var1.func_109357_g(var2, var3, var4);
         boolean var7 = this.func_106023_b(var1, var2, var3, var4);
         if(var7) {
            this.func_106461_l(var1, var2, var3, var4);
         } else {
            this.func_106035_c(var1, var2, var3, var4, var6, 0);
            var1.func_109422_e(var2, var3, var4, 0);
         }

         super.func_106017_a(var1, var2, var3, var4, var5);
      }
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100992_tt.field_110915_aC.field_110891_cf;
   }

   public boolean func_105985_c(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      return !this.field_106464_a?false:this.func_106030_b(var1, var2, var3, var4, var5);
   }

   public boolean func_106030_b(C_100837_xo var1, int var2, int var3, int var4, int var5) {
      if(!this.field_106464_a) {
         return false;
      } else if(var1.func_109357_g(var2, var3, var4) == 0) {
         return false;
      } else if(var5 == 1) {
         return true;
      } else {
         boolean var6 = func_106458_g(var1, var2 - 1, var3, var4, 1) || !var1.func_109360_s(var2 - 1, var3, var4) && func_106458_g(var1, var2 - 1, var3 - 1, var4, -1);
         boolean var7 = func_106458_g(var1, var2 + 1, var3, var4, 3) || !var1.func_109360_s(var2 + 1, var3, var4) && func_106458_g(var1, var2 + 1, var3 - 1, var4, -1);
         boolean var8 = func_106458_g(var1, var2, var3, var4 - 1, 2) || !var1.func_109360_s(var2, var3, var4 - 1) && func_106458_g(var1, var2, var3 - 1, var4 - 1, -1);
         boolean var9 = func_106458_g(var1, var2, var3, var4 + 1, 0) || !var1.func_109360_s(var2, var3, var4 + 1) && func_106458_g(var1, var2, var3 - 1, var4 + 1, -1);
         if(!var1.func_109360_s(var2, var3 + 1, var4)) {
            if(var1.func_109360_s(var2 - 1, var3, var4) && func_106458_g(var1, var2 - 1, var3 + 1, var4, -1)) {
               var6 = true;
            }

            if(var1.func_109360_s(var2 + 1, var3, var4) && func_106458_g(var1, var2 + 1, var3 + 1, var4, -1)) {
               var7 = true;
            }

            if(var1.func_109360_s(var2, var3, var4 - 1) && func_106458_g(var1, var2, var3 + 1, var4 - 1, -1)) {
               var8 = true;
            }

            if(var1.func_109360_s(var2, var3, var4 + 1) && func_106458_g(var1, var2, var3 + 1, var4 + 1, -1)) {
               var9 = true;
            }
         }

         return !var8 && !var7 && !var6 && !var9 && var5 >= 2 && var5 <= 5?true:(var5 == 2 && var8 && !var6 && !var7?true:(var5 == 3 && var9 && !var6 && !var7?true:(var5 == 4 && var6 && !var8 && !var9?true:var5 == 5 && var7 && !var8 && !var9)));
      }
   }

   public boolean func_106028_i() {
      return this.field_106464_a;
   }

   public void func_105974_a(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      int var6 = var1.func_109357_g(var2, var3, var4);
      if(var6 > 0) {
         double var7 = (double)var2 + 0.5D + ((double)var5.nextFloat() - 0.5D) * 0.2D;
         double var9 = (double)((float)var3 + 0.0625F);
         double var11 = (double)var4 + 0.5D + ((double)var5.nextFloat() - 0.5D) * 0.2D;
         float var13 = (float)var6 / 15.0F;
         float var14 = var13 * 0.6F + 0.4F;
         if(var6 == 0) {
            var14 = 0.0F;
         }

         float var15 = var13 * var13 * 0.7F - 0.5F;
         float var16 = var13 * var13 * 0.6F - 0.7F;
         if(var15 < 0.0F) {
            var15 = 0.0F;
         }

         if(var16 < 0.0F) {
            var16 = 0.0F;
         }

         var1.func_109428_a("reddust", var7, var9, var11, (double)var14, (double)var15, (double)var16);
      }

   }

   public static boolean func_106462_f(C_100837_xo var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.func_109349_a(var1, var2, var3);
      if(var5 == C_100451_alf.field_106203_ay.field_106162_cm) {
         return true;
      } else if(var5 == 0) {
         return false;
      } else if(var5 != C_100451_alf.field_106138_bk.field_106162_cm && var5 != C_100451_alf.field_106139_bl.field_106162_cm) {
         return C_100451_alf.field_106118_p[var5].func_106028_i() && var4 != -1;
      } else {
         int var6 = var0.func_109357_g(var1, var2, var3);
         return var4 == (var6 & 3) || var4 == C_100015_i.field_105277_f[var6 & 3];
      }
   }

   public static boolean func_106458_g(C_100837_xo var0, int var1, int var2, int var3, int var4) {
      if(func_106462_f(var0, var1, var2, var3, var4)) {
         return true;
      } else {
         int var5 = var0.func_109349_a(var1, var2, var3);
         if(var5 == C_100451_alf.field_106139_bl.field_106162_cm) {
            int var6 = var0.func_109357_g(var1, var2, var3);
            return var4 == (var6 & 3);
         } else {
            return false;
         }
      }
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100992_tt.field_110915_aC.field_110891_cf;
   }
}
