
public class C_100793_ii {

   public C_100873_xe field_109811_a;
   public C_100762_ih field_109809_b;
   private C_100836_xn field_109810_c;
   private boolean field_109807_d;
   private int field_109808_e;
   private int field_109805_f;
   private int field_109806_g;
   private int field_109818_h;
   private int field_109819_i;
   private boolean field_109816_j;
   private int field_109817_k;
   private int field_109814_l;
   private int field_109815_m;
   private int field_109812_n;
   private int field_109813_o;


   public C_100793_ii(C_100873_xe var1) {
      this.field_109810_c = C_100836_xn.field_110100_a;
      this.field_109813_o = -1;
      this.field_109811_a = var1;
   }

   public void func_109795_a(C_100836_xn var1) {
      this.field_109810_c = var1;
      var1.func_110092_a(this.field_109809_b.field_103869_cf);
      this.field_109809_b.func_103805_o();
   }

   public C_100836_xn func_109797_b() {
      return this.field_109810_c;
   }

   public boolean func_109803_d() {
      return this.field_109810_c.func_110089_d();
   }

   public void func_109800_b(C_100836_xn var1) {
      if(this.field_109810_c == C_100836_xn.field_110100_a) {
         this.field_109810_c = var1;
      }

      this.func_109795_a(this.field_109810_c);
   }

   public void func_109794_a() {
      ++this.field_109819_i;
      int var1;
      float var4;
      int var5;
      if(this.field_109816_j) {
         var1 = this.field_109819_i - this.field_109812_n;
         int var2 = this.field_109811_a.func_109349_a(this.field_109817_k, this.field_109814_l, this.field_109815_m);
         if(var2 == 0) {
            this.field_109816_j = false;
         } else {
            C_100451_alf var3 = C_100451_alf.field_106118_p[var2];
            var4 = var3.func_106009_a(this.field_109809_b, this.field_109809_b.field_103229_p, this.field_109817_k, this.field_109814_l, this.field_109815_m) * (float)(var1 + 1);
            var5 = (int)(var4 * 10.0F);
            if(var5 != this.field_109813_o) {
               this.field_109811_a.func_109420_g(this.field_109809_b.field_103212_k, this.field_109817_k, this.field_109814_l, this.field_109815_m, var5);
               this.field_109813_o = var5;
            }

            if(var4 >= 1.0F) {
               this.field_109816_j = false;
               this.func_109804_b(this.field_109817_k, this.field_109814_l, this.field_109815_m);
            }
         }
      } else if(this.field_109807_d) {
         var1 = this.field_109811_a.func_109349_a(this.field_109805_f, this.field_109806_g, this.field_109818_h);
         C_100451_alf var6 = C_100451_alf.field_106118_p[var1];
         if(var6 == null) {
            this.field_109811_a.func_109420_g(this.field_109809_b.field_103212_k, this.field_109805_f, this.field_109806_g, this.field_109818_h, -1);
            this.field_109813_o = -1;
            this.field_109807_d = false;
         } else {
            int var7 = this.field_109819_i - this.field_109808_e;
            var4 = var6.func_106009_a(this.field_109809_b, this.field_109809_b.field_103229_p, this.field_109805_f, this.field_109806_g, this.field_109818_h) * (float)(var7 + 1);
            var5 = (int)(var4 * 10.0F);
            if(var5 != this.field_109813_o) {
               this.field_109811_a.func_109420_g(this.field_109809_b.field_103212_k, this.field_109805_f, this.field_109806_g, this.field_109818_h, var5);
               this.field_109813_o = var5;
            }
         }
      }

   }

   public void func_109793_a(int var1, int var2, int var3, int var4) {
      if(!this.field_109810_c.func_110093_c() || this.field_109809_b.func_103818_f(var1, var2, var3)) {
         if(this.func_109803_d()) {
            if(!this.field_109811_a.func_109417_a((C_101095_qg)null, var1, var2, var3, var4)) {
               this.func_109804_b(var1, var2, var3);
            }

         } else {
            this.field_109811_a.func_109417_a(this.field_109809_b, var1, var2, var3, var4);
            this.field_109808_e = this.field_109819_i;
            float var5 = 1.0F;
            int var6 = this.field_109811_a.func_109349_a(var1, var2, var3);
            if(var6 > 0) {
               C_100451_alf.field_106118_p[var6].func_105993_a(this.field_109811_a, var1, var2, var3, this.field_109809_b);
               var5 = C_100451_alf.field_106118_p[var6].func_106009_a(this.field_109809_b, this.field_109809_b.field_103229_p, var1, var2, var3);
            }

            if(var6 > 0 && var5 >= 1.0F) {
               this.func_109804_b(var1, var2, var3);
            } else {
               this.field_109807_d = true;
               this.field_109805_f = var1;
               this.field_109806_g = var2;
               this.field_109818_h = var3;
               int var7 = (int)(var5 * 10.0F);
               this.field_109811_a.func_109420_g(this.field_109809_b.field_103212_k, var1, var2, var3, var7);
               this.field_109813_o = var7;
            }

         }
      }
   }

   public void func_109799_a(int var1, int var2, int var3) {
      if(var1 == this.field_109805_f && var2 == this.field_109806_g && var3 == this.field_109818_h) {
         int var4 = this.field_109819_i - this.field_109808_e;
         int var5 = this.field_109811_a.func_109349_a(var1, var2, var3);
         if(var5 != 0) {
            C_100451_alf var6 = C_100451_alf.field_106118_p[var5];
            float var7 = var6.func_106009_a(this.field_109809_b, this.field_109809_b.field_103229_p, var1, var2, var3) * (float)(var4 + 1);
            if(var7 >= 0.7F) {
               this.field_109807_d = false;
               this.field_109811_a.func_109420_g(this.field_109809_b.field_103212_k, var1, var2, var3, -1);
               this.func_109804_b(var1, var2, var3);
            } else if(!this.field_109816_j) {
               this.field_109807_d = false;
               this.field_109816_j = true;
               this.field_109817_k = var1;
               this.field_109814_l = var2;
               this.field_109815_m = var3;
               this.field_109812_n = this.field_109808_e;
            }
         }
      }

   }

   public void func_109792_c(int var1, int var2, int var3) {
      this.field_109807_d = false;
      this.field_109811_a.func_109420_g(this.field_109809_b.field_103212_k, this.field_109805_f, this.field_109806_g, this.field_109818_h, -1);
   }

   private boolean func_109798_d(int var1, int var2, int var3) {
      C_100451_alf var4 = C_100451_alf.field_106118_p[this.field_109811_a.func_109349_a(var1, var2, var3)];
      int var5 = this.field_109811_a.func_109357_g(var1, var2, var3);
      if(var4 != null) {
         var4.func_106060_a(this.field_109811_a, var1, var2, var3, var5, this.field_109809_b);
      }

      boolean var6 = this.field_109811_a.func_109422_e(var1, var2, var3, 0);
      if(var4 != null && var6) {
         var4.func_106020_c(this.field_109811_a, var1, var2, var3, var5);
      }

      return var6;
   }

   public boolean func_109804_b(int var1, int var2, int var3) {
      if(this.field_109810_c.func_110093_c() && !this.field_109809_b.func_103818_f(var1, var2, var3)) {
         return false;
      } else {
         int var4 = this.field_109811_a.func_109349_a(var1, var2, var3);
         int var5 = this.field_109811_a.func_109357_g(var1, var2, var3);
         this.field_109811_a.func_109492_a(this.field_109809_b, 2001, var1, var2, var3, var4 + (this.field_109811_a.func_109357_g(var1, var2, var3) << 12));
         boolean var6 = this.func_109798_d(var1, var2, var3);
         if(this.func_109803_d()) {
            this.field_109809_b.field_104518_a.func_107009_b(new C_100273_fa(var1, var2, var3, this.field_109811_a));
         } else {
            C_100994_tv var7 = this.field_109809_b.func_103780_bP();
            boolean var8 = this.field_109809_b.func_103798_b(C_100451_alf.field_106118_p[var4]);
            if(var7 != null) {
               var7.func_111386_a(this.field_109811_a, var4, var1, var2, var3, this.field_109809_b);
               if(var7.field_111398_a == 0) {
                  this.field_109809_b.func_103774_bQ();
               }
            }

            if(var6 && var8) {
               C_100451_alf.field_106118_p[var4].func_106026_a(this.field_109811_a, this.field_109809_b, var1, var2, var3, var5);
            }
         }

         return var6;
      }
   }

   public boolean func_109801_a(C_101095_qg var1, C_100873_xe var2, C_100994_tv var3) {
      int var4 = var3.field_111398_a;
      int var5 = var3.func_111367_j();
      C_100994_tv var6 = var3.func_111378_a(var2, var1);
      if(var6 == var3 && (var6 == null || var6.field_111398_a == var4 && var6.func_111391_m() <= 0 && var6.func_111367_j() == var5)) {
         return false;
      } else {
         var1.field_103857_bK.field_104832_a[var1.field_103857_bK.field_104831_c] = var6;
         if(this.func_109803_d()) {
            var6.field_111398_a = var4;
            if(var6.func_111387_f()) {
               var6.func_111371_b(var5);
            }
         }

         if(var6.field_111398_a == 0) {
            var1.field_103857_bK.field_104832_a[var1.field_103857_bK.field_104831_c] = null;
         }

         if(!var1.func_103833_bI()) {
            ((C_100762_ih)var1).func_104510_a(var1.field_103855_bL);
         }

         return true;
      }
   }

   public boolean func_109796_a(C_101095_qg var1, C_100873_xe var2, C_100994_tv var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      int var11 = var2.func_109349_a(var4, var5, var6);
      if(var11 > 0 && C_100451_alf.field_106118_p[var11].func_106070_a(var2, var4, var5, var6, var1, var7, var8, var9, var10)) {
         return true;
      } else if(var3 == null) {
         return false;
      } else if(this.func_109803_d()) {
         int var12 = var3.func_111367_j();
         int var13 = var3.field_111398_a;
         boolean var14 = var3.func_111372_a(var1, var2, var4, var5, var6, var7, var8, var9, var10);
         var3.func_111371_b(var12);
         var3.field_111398_a = var13;
         return var14;
      } else {
         return var3.func_111372_a(var1, var2, var4, var5, var6, var7, var8, var9, var10);
      }
   }

   public void func_109802_a(C_100765_ie var1) {
      this.field_109811_a = var1;
   }
}
