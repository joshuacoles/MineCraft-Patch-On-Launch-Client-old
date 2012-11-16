import java.util.Iterator;
import java.util.Random;

public class C_100255_ahq extends C_100186_aij {

   public static final int[][] field_106318_a = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};


   public C_100255_ahq(int var1) {
      super(var1, 134, C_100664_afg.field_109013_n);
      this.func_106314_p();
   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      if(var1.field_109557_J) {
         return true;
      } else {
         int var10 = var1.func_109357_g(var2, var3, var4);
         if(!func_106313_b_(var10)) {
            int var11 = func_106302_e(var10);
            var2 += field_106318_a[var11][0];
            var4 += field_106318_a[var11][1];
            if(var1.func_109349_a(var2, var3, var4) != this.field_106162_cm) {
               return true;
            }

            var10 = var1.func_109357_g(var2, var3, var4);
         }

         if(!var1.field_109576_v.func_112388_e()) {
            double var19 = (double)var2 + 0.5D;
            double var21 = (double)var3 + 0.5D;
            double var15 = (double)var4 + 0.5D;
            var1.func_109422_e(var2, var3, var4, 0);
            int var17 = func_106302_e(var10);
            var2 += field_106318_a[var17][0];
            var4 += field_106318_a[var17][1];
            if(var1.func_109349_a(var2, var3, var4) == this.field_106162_cm) {
               var1.func_109422_e(var2, var3, var4, 0);
               var19 = (var19 + (double)var2 + 0.5D) / 2.0D;
               var21 = (var21 + (double)var3 + 0.5D) / 2.0D;
               var15 = (var15 + (double)var4 + 0.5D) / 2.0D;
            }

            var1.func_109405_a((C_100730_lb)null, (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), 5.0F, true, true);
            return true;
         } else {
            if(func_106315_c_(var10)) {
               C_101095_qg var18 = null;
               Iterator var12 = var1.field_109573_h.iterator();

               while(var12.hasNext()) {
                  C_101095_qg var13 = (C_101095_qg)var12.next();
                  if(var13.func_103369_bt()) {
                     C_100013_k var14 = var13.field_103870_cc;
                     if(var14.field_105273_a == var2 && var14.field_105271_b == var3 && var14.field_105272_c == var4) {
                        var18 = var13;
                     }
                  }
               }

               if(var18 != null) {
                  var5.func_103773_b("tile.bed.occupied");
                  return true;
               }

               func_106316_a(var1, var2, var3, var4, false);
            }

            C_101094_qh var20 = var5.func_103781_a(var2, var3, var4);
            if(var20 == C_101094_qh.field_111609_a) {
               func_106316_a(var1, var2, var3, var4, true);
               return true;
            } else {
               if(var20 == C_101094_qh.field_111608_c) {
                  var5.func_103773_b("tile.bed.noSleep");
               } else if(var20 == C_101094_qh.field_111603_f) {
                  var5.func_103773_b("tile.bed.notSafe");
               }

               return true;
            }
         }
      }
   }

   public int func_106029_a(int var1, int var2) {
      if(var1 == 0) {
         return C_100451_alf.field_106075_A.field_106165_cl;
      } else {
         int var3 = func_106302_e(var2);
         int var4 = C_100015_i.field_105285_i[var3][var1];
         return func_106313_b_(var2)?(var4 == 2?this.field_106165_cl + 2 + 16:(var4 != 5 && var4 != 4?this.field_106165_cl + 1:this.field_106165_cl + 1 + 16)):(var4 == 3?this.field_106165_cl - 1 + 16:(var4 != 5 && var4 != 4?this.field_106165_cl:this.field_106165_cl + 16));
      }
   }

   public int func_106013_d() {
      return 14;
   }

   public boolean func_105977_b() {
      return false;
   }

   public boolean func_105994_c() {
      return false;
   }

   public void func_106007_a(C_100837_xo var1, int var2, int var3, int var4) {
      this.func_106314_p();
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.func_109357_g(var2, var3, var4);
      int var7 = func_106302_e(var6);
      if(func_106313_b_(var6)) {
         if(var1.func_109349_a(var2 - field_106318_a[var7][0], var3, var4 - field_106318_a[var7][1]) != this.field_106162_cm) {
            var1.func_109422_e(var2, var3, var4, 0);
         }
      } else if(var1.func_109349_a(var2 + field_106318_a[var7][0], var3, var4 + field_106318_a[var7][1]) != this.field_106162_cm) {
         var1.func_109422_e(var2, var3, var4, 0);
         if(!var1.field_109557_J) {
            this.func_106035_c(var1, var2, var3, var4, var6, 0);
         }
      }

   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return func_106313_b_(var1)?0:C_100992_tt.field_110924_ba.field_110891_cf;
   }

   private void func_106314_p() {
      this.func_106008_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
   }

   public static boolean func_106313_b_(int var0) {
      return (var0 & 8) != 0;
   }

   public static boolean func_106315_c_(int var0) {
      return (var0 & 4) != 0;
   }

   public static void func_106316_a(C_100873_xe var0, int var1, int var2, int var3, boolean var4) {
      int var5 = var0.func_109357_g(var1, var2, var3);
      if(var4) {
         var5 |= 4;
      } else {
         var5 &= -5;
      }

      var0.func_109488_c(var1, var2, var3, var5);
   }

   public static C_100013_k func_106317_b(C_100873_xe var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.func_109357_g(var1, var2, var3);
      int var6 = C_100186_aij.func_106302_e(var5);

      for(int var7 = 0; var7 <= 1; ++var7) {
         int var8 = var1 - field_106318_a[var6][0] * var7 - 1;
         int var9 = var3 - field_106318_a[var6][1] * var7 - 1;
         int var10 = var8 + 2;
         int var11 = var9 + 2;

         for(int var12 = var8; var12 <= var10; ++var12) {
            for(int var13 = var9; var13 <= var11; ++var13) {
               if(var0.func_109348_t(var12, var2 - 1, var13) && var0.func_109352_c(var12, var2, var13) && var0.func_109352_c(var12, var2 + 1, var13)) {
                  if(var4 <= 0) {
                     return new C_100013_k(var12, var2, var13);
                  }

                  --var4;
               }
            }
         }
      }

      return null;
   }

   public void func_105998_a(C_100873_xe var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!func_106313_b_(var5)) {
         super.func_105998_a(var1, var2, var3, var4, var5, var6, 0);
      }

   }

   public int func_106058_q_() {
      return 1;
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100992_tt.field_110924_ba.field_110891_cf;
   }

}
