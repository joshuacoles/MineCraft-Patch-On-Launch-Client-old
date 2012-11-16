import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C_100759_ib {

   private final C_100765_ie field_109688_a;
   private final List field_109686_b = new ArrayList();
   private final C_100653_jt field_109687_c = new C_100653_jt();
   private final List field_109684_d = new ArrayList();
   private final int field_109685_e;
   private final int[][] field_109683_f = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};


   public C_100759_ib(C_100765_ie var1, int var2) {
      if(var2 > 15) {
         throw new IllegalArgumentException("Too big view radius!");
      } else if(var2 < 3) {
         throw new IllegalArgumentException("Too small view radius!");
      } else {
         this.field_109685_e = var2;
         this.field_109688_a = var1;
      }
   }

   public C_100765_ie func_109669_a() {
      return this.field_109688_a;
   }

   public void func_109679_b() {
      Iterator var1 = this.field_109684_d.iterator();

      while(var1.hasNext()) {
         C_100757_ic var2 = (C_100757_ic)var1.next();
         var2.func_109658_a();
      }

      this.field_109684_d.clear();
      if(this.field_109686_b.isEmpty()) {
         C_101289_zr var3 = this.field_109688_a.field_109576_v;
         if(!var3.func_112388_e()) {
            this.field_109688_a.field_109620_b.func_108685_a();
         }
      }

   }

   private C_100757_ic func_109675_a(int var1, int var2, boolean var3) {
      long var4 = (long)var1 + 2147483647L | (long)var2 + 2147483647L << 32;
      C_100757_ic var6 = (C_100757_ic)this.field_109687_c.func_108954_a(var4);
      if(var6 == null && var3) {
         var6 = new C_100757_ic(this, var1, var2);
         this.field_109687_c.func_108953_a(var4, var6);
      }

      return var6;
   }

   public void func_109674_a(int var1, int var2, int var3) {
      int var4 = var1 >> 4;
      int var5 = var3 >> 4;
      C_100757_ic var6 = this.func_109675_a(var4, var5, false);
      if(var6 != null) {
         var6.func_109661_a(var1 & 15, var2, var3 & 15);
      }

   }

   public void func_109673_a(C_100762_ih var1) {
      int var2 = (int)var1.field_103221_t >> 4;
      int var3 = (int)var1.field_103217_v >> 4;
      var1.field_104514_d = var1.field_103221_t;
      var1.field_104515_e = var1.field_103217_v;

      for(int var4 = var2 - this.field_109685_e; var4 <= var2 + this.field_109685_e; ++var4) {
         for(int var5 = var3 - this.field_109685_e; var5 <= var3 + this.field_109685_e; ++var5) {
            this.func_109675_a(var4, var5, true).func_109660_a(var1);
         }
      }

      this.field_109686_b.add(var1);
      this.func_109682_b(var1);
   }

   public void func_109682_b(C_100762_ih var1) {
      ArrayList var2 = new ArrayList(var1.field_104512_f);
      int var3 = 0;
      int var4 = this.field_109685_e;
      int var5 = (int)var1.field_103221_t >> 4;
      int var6 = (int)var1.field_103217_v >> 4;
      int var7 = 0;
      int var8 = 0;
      C_100858_wx var9 = C_100757_ic.func_109659_a(this.func_109675_a(var5, var6, true));
      var1.field_104512_f.clear();
      if(var2.contains(var9)) {
         var1.field_104512_f.add(var9);
      }

      int var10;
      for(var10 = 1; var10 <= var4 * 2; ++var10) {
         for(int var11 = 0; var11 < 2; ++var11) {
            int[] var12 = this.field_109683_f[var3++ % 4];

            for(int var13 = 0; var13 < var10; ++var13) {
               var7 += var12[0];
               var8 += var12[1];
               var9 = C_100757_ic.func_109659_a(this.func_109675_a(var5 + var7, var6 + var8, true));
               if(var2.contains(var9)) {
                  var1.field_104512_f.add(var9);
               }
            }
         }
      }

      var3 %= 4;

      for(var10 = 0; var10 < var4 * 2; ++var10) {
         var7 += this.field_109683_f[var3][0];
         var8 += this.field_109683_f[var3][1];
         var9 = C_100757_ic.func_109659_a(this.func_109675_a(var5 + var7, var6 + var8, true));
         if(var2.contains(var9)) {
            var1.field_104512_f.add(var9);
         }
      }

   }

   public void func_109678_c(C_100762_ih var1) {
      int var2 = (int)var1.field_104514_d >> 4;
      int var3 = (int)var1.field_104515_e >> 4;

      for(int var4 = var2 - this.field_109685_e; var4 <= var2 + this.field_109685_e; ++var4) {
         for(int var5 = var3 - this.field_109685_e; var5 <= var3 + this.field_109685_e; ++var5) {
            C_100757_ic var6 = this.func_109675_a(var4, var5, false);
            if(var6 != null) {
               var6.func_109662_b(var1);
            }
         }
      }

      this.field_109686_b.remove(var1);
   }

   private boolean func_109671_a(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 - var3;
      int var7 = var2 - var4;
      return var6 >= -var5 && var6 <= var5?var7 >= -var5 && var7 <= var5:false;
   }

   public void func_109676_d(C_100762_ih var1) {
      int var2 = (int)var1.field_103221_t >> 4;
      int var3 = (int)var1.field_103217_v >> 4;
      double var4 = var1.field_104514_d - var1.field_103221_t;
      double var6 = var1.field_104515_e - var1.field_103217_v;
      double var8 = var4 * var4 + var6 * var6;
      if(var8 >= 64.0D) {
         int var10 = (int)var1.field_104514_d >> 4;
         int var11 = (int)var1.field_104515_e >> 4;
         int var12 = this.field_109685_e;
         int var13 = var2 - var10;
         int var14 = var3 - var11;
         if(var13 != 0 || var14 != 0) {
            for(int var15 = var2 - var12; var15 <= var2 + var12; ++var15) {
               for(int var16 = var3 - var12; var16 <= var3 + var12; ++var16) {
                  if(!this.func_109671_a(var15, var16, var10, var11, var12)) {
                     this.func_109675_a(var15, var16, true).func_109660_a(var1);
                  }

                  if(!this.func_109671_a(var15 - var13, var16 - var14, var2, var3, var12)) {
                     C_100757_ic var17 = this.func_109675_a(var15 - var13, var16 - var14, false);
                     if(var17 != null) {
                        var17.func_109662_b(var1);
                     }
                  }
               }
            }

            this.func_109682_b(var1);
            var1.field_104514_d = var1.field_103221_t;
            var1.field_104515_e = var1.field_103217_v;
         }
      }
   }

   public boolean func_109681_a(C_100762_ih var1, int var2, int var3) {
      C_100757_ic var4 = this.func_109675_a(var2, var3, false);
      return var4 == null?false:C_100757_ic.func_109655_b(var4).contains(var1) && !var1.field_104512_f.contains(C_100757_ic.func_109659_a(var4));
   }

   public static int func_109672_a(int var0) {
      return var0 * 16 - 16;
   }

   // $FF: synthetic method
   static C_100765_ie func_109680_a(C_100759_ib var0) {
      return var0.field_109688_a;
   }

   // $FF: synthetic method
   static C_100653_jt func_109677_b(C_100759_ib var0) {
      return var0.field_109687_c;
   }

   // $FF: synthetic method
   static List func_109670_c(C_100759_ib var0) {
      return var0.field_109684_d;
   }
}
