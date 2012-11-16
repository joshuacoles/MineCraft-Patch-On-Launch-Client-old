import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Logger;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100801_im extends C_100221_dy {

   public static Logger field_107021_a = Logger.getLogger("Minecraft");
   public C_100323_bv field_107019_b;
   public boolean field_107020_c = false;
   private C_101445_MinecraftServer field_107017_d;
   private C_100762_ih field_107018_e;
   private int field_107015_f;
   private int field_107016_g;
   private boolean field_107028_h;
   private int field_107029_i;
   private long field_107026_j;
   private static Random field_107027_k = new Random();
   private long field_107024_l;
   private int field_107025_m = 0;
   private int field_107022_n = 0;
   private double field_107023_o;
   private double field_107033_p;
   private double field_107032_q;
   private boolean field_107031_r = true;
   private C_100661_jq field_107030_s = new C_100661_jq();


   public C_100801_im(C_101445_MinecraftServer var1, C_100323_bv var2, C_100762_ih var3) {
      this.field_107017_d = var1;
      this.field_107019_b = var2;
      var2.func_107418_a(this);
      this.field_107018_e = var3;
      var3.field_104518_a = this;
   }

   public void func_107014_d() {
      this.field_107028_h = false;
      ++this.field_107015_f;
      this.field_107017_d.field_104985_b.func_108901_a("packetflow");
      this.field_107019_b.func_107419_b();
      this.field_107017_d.field_104985_b.func_108899_c("keepAlive");
      if((long)this.field_107015_f - this.field_107024_l > 20L) {
         this.field_107024_l = (long)this.field_107015_f;
         this.field_107026_j = System.nanoTime() / 1000000L;
         this.field_107029_i = field_107027_k.nextInt();
         this.func_107009_b(new C_100242_di(this.field_107029_i));
      }

      if(this.field_107025_m > 0) {
         --this.field_107025_m;
      }

      if(this.field_107022_n > 0) {
         --this.field_107022_n;
      }

      this.field_107017_d.field_104985_b.func_108899_c("playerTick");
      if(!this.field_107028_h && !this.field_107018_e.field_104519_j) {
         this.field_107018_e.func_104509_g();
         if(this.field_107018_e.field_103207_o == null) {
            this.field_107018_e.func_103055_b(this.field_107023_o, this.field_107033_p, this.field_107032_q, this.field_107018_e.field_103236_z, this.field_107018_e.field_103177_A);
         }
      }

      this.field_107017_d.field_104985_b.func_108900_b();
   }

   public void func_107010_c(String var1) {
      if(!this.field_107020_c) {
         this.field_107018_e.func_104511_l();
         this.func_107009_b(new C_100365_db(var1));
         this.field_107019_b.func_107414_d();
         this.field_107017_d.func_104931_ad().func_105733_a(new C_100392_cm("§e" + this.field_107018_e.field_103847_bT + " left the game."));
         this.field_107017_d.func_104931_ad().func_105698_e(this.field_107018_e);
         this.field_107020_c = true;
      }
   }

   public void func_106987_a(C_100214_dt var1) {
      C_100765_ie var2 = this.field_107017_d.func_104879_a(this.field_107018_e.field_103224_ap);
      this.field_107028_h = true;
      if(!this.field_107018_e.field_104519_j) {
         double var3;
         if(!this.field_107031_r) {
            var3 = var1.field_106911_b - this.field_107033_p;
            if(var1.field_106913_a == this.field_107023_o && var3 * var3 < 0.01D && var1.field_106912_c == this.field_107032_q) {
               this.field_107031_r = true;
            }
         }

         if(this.field_107031_r) {
            double var5;
            double var7;
            double var9;
            double var13;
            if(this.field_107018_e.field_103207_o != null) {
               float var34 = this.field_107018_e.field_103236_z;
               float var4 = this.field_107018_e.field_103177_A;
               this.field_107018_e.field_103207_o.func_103098_V();
               var5 = this.field_107018_e.field_103221_t;
               var7 = this.field_107018_e.field_103219_u;
               var9 = this.field_107018_e.field_103217_v;
               double var35 = 0.0D;
               var13 = 0.0D;
               if(var1.field_106915_i) {
                  var34 = var1.field_106910_e;
                  var4 = var1.field_106907_f;
               }

               if(var1.field_106914_h && var1.field_106911_b == -999.0D && var1.field_106909_d == -999.0D) {
                  if(Math.abs(var1.field_106913_a) > 1.0D || Math.abs(var1.field_106912_c) > 1.0D) {
                     System.err.println(this.field_107018_e.field_103847_bT + " was caught trying to crash the server with an invalid position.");
                     this.func_107010_c("Nope!");
                     return;
                  }

                  var35 = var1.field_106913_a;
                  var13 = var1.field_106912_c;
               }

               this.field_107018_e.field_103174_E = var1.field_106908_g;
               this.field_107018_e.func_104509_g();
               this.field_107018_e.func_103145_d(var35, 0.0D, var13);
               this.field_107018_e.func_103135_a(var5, var7, var9, var34, var4);
               this.field_107018_e.field_103215_w = var35;
               this.field_107018_e.field_103238_y = var13;
               if(this.field_107018_e.field_103207_o != null) {
                  var2.func_109610_b(this.field_107018_e.field_103207_o, true);
               }

               if(this.field_107018_e.field_103207_o != null) {
                  this.field_107018_e.field_103207_o.func_103098_V();
               }

               this.field_107017_d.func_104931_ad().func_105734_d(this.field_107018_e);
               this.field_107023_o = this.field_107018_e.field_103221_t;
               this.field_107033_p = this.field_107018_e.field_103219_u;
               this.field_107032_q = this.field_107018_e.field_103217_v;
               var2.func_109506_g(this.field_107018_e);
               return;
            }

            if(this.field_107018_e.func_103369_bt()) {
               this.field_107018_e.func_104509_g();
               this.field_107018_e.func_103135_a(this.field_107023_o, this.field_107033_p, this.field_107032_q, this.field_107018_e.field_103236_z, this.field_107018_e.field_103177_A);
               var2.func_109506_g(this.field_107018_e);
               return;
            }

            var3 = this.field_107018_e.field_103219_u;
            this.field_107023_o = this.field_107018_e.field_103221_t;
            this.field_107033_p = this.field_107018_e.field_103219_u;
            this.field_107032_q = this.field_107018_e.field_103217_v;
            var5 = this.field_107018_e.field_103221_t;
            var7 = this.field_107018_e.field_103219_u;
            var9 = this.field_107018_e.field_103217_v;
            float var11 = this.field_107018_e.field_103236_z;
            float var12 = this.field_107018_e.field_103177_A;
            if(var1.field_106914_h && var1.field_106911_b == -999.0D && var1.field_106909_d == -999.0D) {
               var1.field_106914_h = false;
            }

            if(var1.field_106914_h) {
               var5 = var1.field_106913_a;
               var7 = var1.field_106911_b;
               var9 = var1.field_106912_c;
               var13 = var1.field_106909_d - var1.field_106911_b;
               if(!this.field_107018_e.func_103369_bt() && (var13 > 1.65D || var13 < 0.1D)) {
                  this.func_107010_c("Illegal stance");
                  field_107021_a.warning(this.field_107018_e.field_103847_bT + " had an illegal stance: " + var13);
                  return;
               }

               if(Math.abs(var1.field_106913_a) > 3.2E7D || Math.abs(var1.field_106912_c) > 3.2E7D) {
                  this.func_107010_c("Illegal position");
                  return;
               }
            }

            if(var1.field_106915_i) {
               var11 = var1.field_106910_e;
               var12 = var1.field_106907_f;
            }

            this.field_107018_e.func_104509_g();
            this.field_107018_e.field_103190_W = 0.0F;
            this.field_107018_e.func_103135_a(this.field_107023_o, this.field_107033_p, this.field_107032_q, var11, var12);
            if(!this.field_107031_r) {
               return;
            }

            var13 = var5 - this.field_107018_e.field_103221_t;
            double var15 = var7 - this.field_107018_e.field_103219_u;
            double var17 = var9 - this.field_107018_e.field_103217_v;
            double var19 = Math.min(Math.abs(var13), Math.abs(this.field_107018_e.field_103215_w));
            double var21 = Math.min(Math.abs(var15), Math.abs(this.field_107018_e.field_103240_x));
            double var23 = Math.min(Math.abs(var17), Math.abs(this.field_107018_e.field_103238_y));
            double var25 = var19 * var19 + var21 * var21 + var23 * var23;
            if(var25 > 100.0D && (!this.field_107017_d.func_104921_I() || !this.field_107017_d.func_104919_H().equals(this.field_107018_e.field_103847_bT))) {
               field_107021_a.warning(this.field_107018_e.field_103847_bT + " moved too quickly! " + var13 + "," + var15 + "," + var17 + " (" + var19 + ", " + var21 + ", " + var23 + ")");
               this.func_107013_a(this.field_107023_o, this.field_107033_p, this.field_107032_q, this.field_107018_e.field_103236_z, this.field_107018_e.field_103177_A);
               return;
            }

            float var27 = 0.0625F;
            boolean var28 = var2.func_109508_a(this.field_107018_e, this.field_107018_e.field_103173_D.func_107900_c().func_107910_e((double)var27, (double)var27, (double)var27)).isEmpty();
            if(this.field_107018_e.field_103174_E && !var1.field_106908_g && var15 > 0.0D) {
               this.field_107018_e.func_103792_j(0.2F);
            }

            this.field_107018_e.func_103145_d(var13, var15, var17);
            this.field_107018_e.field_103174_E = var1.field_106908_g;
            this.field_107018_e.func_103769_j(var13, var15, var17);
            double var29 = var15;
            var13 = var5 - this.field_107018_e.field_103221_t;
            var15 = var7 - this.field_107018_e.field_103219_u;
            if(var15 > -0.5D || var15 < 0.5D) {
               var15 = 0.0D;
            }

            var17 = var9 - this.field_107018_e.field_103217_v;
            var25 = var13 * var13 + var15 * var15 + var17 * var17;
            boolean var31 = false;
            if(var25 > 0.0625D && !this.field_107018_e.func_103369_bt() && !this.field_107018_e.field_104517_c.func_109803_d()) {
               var31 = true;
               field_107021_a.warning(this.field_107018_e.field_103847_bT + " moved wrongly!");
            }

            this.field_107018_e.func_103135_a(var5, var7, var9, var11, var12);
            boolean var32 = var2.func_109508_a(this.field_107018_e, this.field_107018_e.field_103173_D.func_107900_c().func_107910_e((double)var27, (double)var27, (double)var27)).isEmpty();
            if(var28 && (var31 || !var32) && !this.field_107018_e.func_103369_bt()) {
               this.func_107013_a(this.field_107023_o, this.field_107033_p, this.field_107032_q, var11, var12);
               return;
            }

            C_100412_amr var33 = this.field_107018_e.field_103173_D.func_107900_c().func_107895_b((double)var27, (double)var27, (double)var27).func_107903_a(0.0D, -0.55D, 0.0D);
            if(!this.field_107017_d.func_104872_Y() && !this.field_107018_e.field_104517_c.func_109803_d() && !var2.func_109482_c(var33)) {
               if(var29 >= -0.03125D) {
                  ++this.field_107016_g;
                  if(this.field_107016_g > 80) {
                     field_107021_a.warning(this.field_107018_e.field_103847_bT + " was kicked for floating too long!");
                     this.func_107010_c("Flying is not enabled on this server");
                     return;
                  }
               }
            } else {
               this.field_107016_g = 0;
            }

            this.field_107018_e.field_103174_E = var1.field_106908_g;
            this.field_107017_d.func_104931_ad().func_105734_d(this.field_107018_e);
            this.field_107018_e.func_104503_b(this.field_107018_e.field_103219_u - var3, var1.field_106908_g);
         }

      }
   }

   public void func_107013_a(double var1, double var3, double var5, float var7, float var8) {
      this.field_107031_r = false;
      this.field_107023_o = var1;
      this.field_107033_p = var3;
      this.field_107032_q = var5;
      this.field_107018_e.func_103135_a(var1, var3, var5, var7, var8);
      this.field_107018_e.field_104518_a.func_107009_b(new C_100216_dv(var1, var3 + 1.6200000047683716D, var3, var5, var7, var8, false));
   }

   public void func_106984_a(C_100229_ea var1) {
      C_100765_ie var2 = this.field_107017_d.func_104879_a(this.field_107018_e.field_103224_ap);
      if(var1.field_106585_e == 4) {
         this.field_107018_e.func_103830_bN();
      } else if(var1.field_106585_e == 5) {
         this.field_107018_e.func_103829_bK();
      } else {
         boolean var3 = var2.field_109576_v.field_112401_h != 0 || this.field_107017_d.func_104931_ad().func_105728_i().isEmpty() || this.field_107017_d.func_104931_ad().func_105690_e(this.field_107018_e.field_103847_bT) || this.field_107017_d.func_104921_I();
         boolean var4 = false;
         if(var1.field_106585_e == 0) {
            var4 = true;
         }

         if(var1.field_106585_e == 2) {
            var4 = true;
         }

         int var5 = var1.field_106588_a;
         int var6 = var1.field_106586_b;
         int var7 = var1.field_106587_c;
         if(var4) {
            double var8 = this.field_107018_e.field_103221_t - ((double)var5 + 0.5D);
            double var10 = this.field_107018_e.field_103219_u - ((double)var6 + 0.5D) + 1.5D;
            double var12 = this.field_107018_e.field_103217_v - ((double)var7 + 0.5D);
            double var14 = var8 * var8 + var10 * var10 + var12 * var12;
            if(var14 > 36.0D) {
               return;
            }

            if(var6 >= this.field_107017_d.func_104905_ab()) {
               return;
            }
         }

         C_100013_k var19 = var2.func_109381_G();
         int var9 = C_100650_jv.func_108912_a(var5 - var19.field_105273_a);
         int var20 = C_100650_jv.func_108912_a(var7 - var19.field_105272_c);
         if(var9 > var20) {
            var20 = var9;
         }

         if(var1.field_106585_e == 0) {
            if(var20 <= this.field_107017_d.func_104886_ak() && !var3) {
               this.field_107018_e.field_104518_a.func_107009_b(new C_100273_fa(var5, var6, var7, var2));
            } else {
               this.field_107018_e.field_104517_c.func_109793_a(var5, var6, var7, var1.field_106584_d);
            }
         } else if(var1.field_106585_e == 2) {
            this.field_107018_e.field_104517_c.func_109799_a(var5, var6, var7);
            if(var2.func_109349_a(var5, var6, var7) != 0) {
               this.field_107018_e.field_104518_a.func_107009_b(new C_100273_fa(var5, var6, var7, var2));
            }
         } else if(var1.field_106585_e == 1) {
            this.field_107018_e.field_104517_c.func_109792_c(var5, var6, var7);
            if(var2.func_109349_a(var5, var6, var7) != 0) {
               this.field_107018_e.field_104518_a.func_107009_b(new C_100273_fa(var5, var6, var7, var2));
            }
         } else if(var1.field_106585_e == 3) {
            double var11 = this.field_107018_e.field_103221_t - ((double)var5 + 0.5D);
            double var13 = this.field_107018_e.field_103219_u - ((double)var6 + 0.5D);
            double var15 = this.field_107018_e.field_103217_v - ((double)var7 + 0.5D);
            double var17 = var11 * var11 + var13 * var13 + var15 * var15;
            if(var17 < 256.0D) {
               this.field_107018_e.field_104518_a.func_107009_b(new C_100273_fa(var5, var6, var7, var2));
            }
         }

      }
   }

   public void func_106953_a(C_100277_fc var1) {
      C_100765_ie var2 = this.field_107017_d.func_104879_a(this.field_107018_e.field_103224_ap);
      C_100994_tv var3 = this.field_107018_e.field_103857_bK.func_104808_g();
      boolean var4 = false;
      int var5 = var1.func_106717_d();
      int var6 = var1.func_106716_f();
      int var7 = var1.func_106720_g();
      int var8 = var1.func_106715_h();
      boolean var9 = var2.field_109576_v.field_112401_h != 0 || this.field_107017_d.func_104931_ad().func_105728_i().isEmpty() || this.field_107017_d.func_104931_ad().func_105690_e(this.field_107018_e.field_103847_bT) || this.field_107017_d.func_104921_I();
      if(var1.func_106715_h() == 255) {
         if(var3 == null) {
            return;
         }

         this.field_107018_e.field_104517_c.func_109801_a(this.field_107018_e, var2, var3);
      } else if(var1.func_106716_f() >= this.field_107017_d.func_104905_ab() - 1 && (var1.func_106715_h() == 1 || var1.func_106716_f() >= this.field_107017_d.func_104905_ab())) {
         this.field_107018_e.field_104518_a.func_107009_b(new C_100392_cm("§7Height limit for building is " + this.field_107017_d.func_104905_ab()));
         var4 = true;
      } else {
         C_100013_k var10 = var2.func_109381_G();
         int var11 = C_100650_jv.func_108912_a(var5 - var10.field_105273_a);
         int var12 = C_100650_jv.func_108912_a(var7 - var10.field_105272_c);
         if(var11 > var12) {
            var12 = var11;
         }

         if(this.field_107031_r && this.field_107018_e.func_103146_e((double)var5 + 0.5D, (double)var6 + 0.5D, (double)var7 + 0.5D) < 64.0D && (var12 > this.field_107017_d.func_104886_ak() || var9)) {
            this.field_107018_e.field_104517_c.func_109796_a(this.field_107018_e, var2, var3, var5, var6, var7, var8, var1.func_106719_j(), var1.func_106718_l(), var1.func_106721_m());
         }

         var4 = true;
      }

      if(var4) {
         this.field_107018_e.field_104518_a.func_107009_b(new C_100273_fa(var5, var6, var7, var2));
         if(var8 == 0) {
            --var6;
         }

         if(var8 == 1) {
            ++var6;
         }

         if(var8 == 2) {
            --var7;
         }

         if(var8 == 3) {
            ++var7;
         }

         if(var8 == 4) {
            --var5;
         }

         if(var8 == 5) {
            ++var5;
         }

         this.field_107018_e.field_104518_a.func_107009_b(new C_100273_fa(var5, var6, var7, var2));
      }

      var3 = this.field_107018_e.field_103857_bK.func_104808_g();
      if(var3 != null && var3.field_111398_a == 0) {
         this.field_107018_e.field_103857_bK.field_104832_a[this.field_107018_e.field_103857_bK.field_104831_c] = null;
         var3 = null;
      }

      if(var3 == null || var3.func_111391_m() == 0) {
         this.field_107018_e.field_104522_h = true;
         this.field_107018_e.field_103857_bK.field_104832_a[this.field_107018_e.field_103857_bK.field_104831_c] = C_100994_tv.func_111341_b(this.field_107018_e.field_103857_bK.field_104832_a[this.field_107018_e.field_103857_bK.field_104831_c]);
         C_101048_rz var13 = this.field_107018_e.field_103856_bM.func_111505_a(this.field_107018_e.field_103857_bK, this.field_107018_e.field_103857_bK.field_104831_c);
         this.field_107018_e.field_103856_bM.func_111506_b();
         this.field_107018_e.field_104522_h = false;
         if(!C_100994_tv.func_111340_b(this.field_107018_e.field_103857_bK.func_104808_g(), var1.func_106714_i())) {
            this.func_107009_b(new C_100371_cz(this.field_107018_e.field_103856_bM.field_111514_c, var13.field_111460_g, this.field_107018_e.field_103857_bK.func_104808_g()));
         }
      }

   }

   public void func_106986_a(String var1, Object[] var2) {
      field_107021_a.info(this.field_107018_e.field_103847_bT + " lost connection: " + var1);
      this.field_107017_d.func_104931_ad().func_105733_a(new C_100392_cm("§e" + this.field_107018_e.field_103847_bT + " left the game."));
      this.field_107017_d.func_104931_ad().func_105698_e(this.field_107018_e);
      this.field_107020_c = true;
      if(this.field_107017_d.func_104921_I() && this.field_107018_e.field_103847_bT.equals(this.field_107017_d.func_104919_H())) {
         field_107021_a.info("Stopping singleplayer server as player logged out");
         this.field_107017_d.func_104930_n();
      }

   }

   public void func_106985_a(C_100219_dx var1) {
      field_107021_a.warning(this.getClass() + " wasn\'t prepared to deal with a " + var1.getClass());
      this.func_107010_c("Protocol error, unexpected packet");
   }

   public void func_107009_b(C_100219_dx var1) {
      if(var1 instanceof C_100392_cm) {
         C_100392_cm var2 = (C_100392_cm)var1;
         int var3 = this.field_107018_e.func_104499_u();
         if(var3 == 2) {
            return;
         }

         if(var3 == 1 && !var2.func_106834_d()) {
            return;
         }
      }

      this.field_107019_b.func_107413_a(var1);
   }

   public void func_106947_a(C_100291_ej var1) {
      if(var1.field_106745_a >= 0 && var1.field_106745_a < C_101092_qf.func_104817_h()) {
         this.field_107018_e.field_103857_bK.field_104831_c = var1.field_106745_a;
      } else {
         field_107021_a.warning(this.field_107018_e.field_103847_bT + " tried to set an invalid carried item");
      }
   }

   public void func_106943_a(C_100392_cm var1) {
      if(this.field_107018_e.func_104499_u() == 2) {
         this.func_107009_b(new C_100392_cm("Cannot send chat message."));
      } else {
         String var2 = var1.field_106835_b;
         if(var2.length() > 100) {
            this.func_107010_c("Chat message too long");
         } else {
            var2 = var2.trim();

            for(int var3 = 0; var3 < var2.length(); ++var3) {
               if(!C_100011_m.func_105259_a(var2.charAt(var3))) {
                  this.func_107010_c("Illegal characters in chat");
                  return;
               }
            }

            if(var2.startsWith("/")) {
               this.func_107011_d(var2);
            } else {
               if(this.field_107018_e.func_104499_u() == 1) {
                  this.func_107009_b(new C_100392_cm("Cannot send chat message."));
                  return;
               }

               var2 = "<" + this.field_107018_e.field_103847_bT + "> " + var2;
               field_107021_a.info(var2);
               this.field_107017_d.func_104931_ad().func_105733_a(new C_100392_cm(var2, false));
            }

            this.field_107025_m += 20;
            if(this.field_107025_m > 200 && !this.field_107017_d.func_104931_ad().func_105690_e(this.field_107018_e.field_103847_bT)) {
               this.func_107010_c("disconnect.spam");
            }

         }
      }
   }

   private void func_107011_d(String var1) {
      this.field_107017_d.func_104888_E().func_105197_a(this.field_107018_e, var1);
   }

   public void func_106957_a(C_100401_cj var1) {
      if(var1.field_106858_b == 1) {
         this.field_107018_e.func_103301_bE();
      }

   }

   public void func_106929_a(C_100231_eb var1) {
      if(var1.field_106589_b == 1) {
         this.field_107018_e.func_103151_a(true);
      } else if(var1.field_106589_b == 2) {
         this.field_107018_e.func_103151_a(false);
      } else if(var1.field_106589_b == 4) {
         this.field_107018_e.func_103080_b(true);
      } else if(var1.field_106589_b == 5) {
         this.field_107018_e.func_103080_b(false);
      } else if(var1.field_106589_b == 3) {
         this.field_107018_e.func_103766_a(false, true, true);
         this.field_107031_r = false;
      }

   }

   public void func_106978_a(C_100365_db var1) {
      this.field_107019_b.func_107415_a("disconnect.quitting", new Object[0]);
   }

   public int func_107012_e() {
      return this.field_107019_b.func_107416_e();
   }

   public void func_106932_a(C_100244_dh var1) {
      C_100765_ie var2 = this.field_107017_d.func_104879_a(this.field_107018_e.field_103224_ap);
      C_100730_lb var3 = var2.func_109451_a(var1.field_106612_b);
      if(var3 != null) {
         boolean var4 = this.field_107018_e.func_103308_m(var3);
         double var5 = 36.0D;
         if(!var4) {
            var5 = 9.0D;
         }

         if(this.field_107018_e.func_103082_e(var3) < var5) {
            if(var1.field_106613_c == 0) {
               this.field_107018_e.func_103794_o(var3);
            } else if(var1.field_106613_c == 1) {
               this.field_107018_e.func_103775_p(var3);
            }
         }
      }

   }

   public void func_106925_a(C_100388_co var1) {
      if(var1.field_106821_a == 1) {
         if(this.field_107018_e.field_104519_j) {
            this.field_107018_e = this.field_107017_d.func_104931_ad().func_105689_a(this.field_107018_e, 0, true);
         } else if(this.field_107018_e.func_104506_p().func_109429_J().func_107145_t()) {
            if(this.field_107017_d.func_104921_I() && this.field_107018_e.field_103847_bT.equals(this.field_107017_d.func_104919_H())) {
               this.field_107018_e.field_104518_a.func_107010_c("You have died. Game over, man, it\'s game over!");
               this.field_107017_d.func_104877_P();
            } else {
               C_100275_fe var2 = new C_100275_fe(this.field_107018_e.field_103847_bT);
               var2.func_107218_b("Death in Hardcore");
               this.field_107017_d.func_104931_ad().func_105719_e().func_106503_a(var2);
               this.field_107018_e.field_104518_a.func_107010_c("You have died. Game over, man, it\'s game over!");
            }
         } else {
            if(this.field_107018_e.func_103330_aT() > 0) {
               return;
            }

            this.field_107018_e = this.field_107017_d.func_104931_ad().func_105689_a(this.field_107018_e, 0, false);
         }
      }

   }

   public boolean func_106933_b() {
      return true;
   }

   public void func_106938_a(C_100281_eg var1) {}

   public void func_106935_a(C_100376_cv var1) {
      this.field_107018_e.func_104497_k();
   }

   public void func_106979_a(C_100378_cu var1) {
      if(this.field_107018_e.field_103856_bM.field_111514_c == var1.field_106806_a && this.field_107018_e.field_103856_bM.func_111495_b(this.field_107018_e)) {
         C_100994_tv var2 = this.field_107018_e.field_103856_bM.func_111496_a(var1.field_106804_b, var1.field_106805_c, var1.field_106801_f, this.field_107018_e);
         if(C_100994_tv.func_111340_b(var1.field_106803_e, var2)) {
            this.field_107018_e.field_104518_a.func_107009_b(new C_100382_cs(var1.field_106806_a, var1.field_106802_d, true));
            this.field_107018_e.field_104522_h = true;
            this.field_107018_e.field_103856_bM.func_111506_b();
            this.field_107018_e.func_104504_j();
            this.field_107018_e.field_104522_h = false;
         } else {
            this.field_107030_s.func_109035_a(this.field_107018_e.field_103856_bM.field_111514_c, Short.valueOf(var1.field_106802_d));
            this.field_107018_e.field_104518_a.func_107009_b(new C_100382_cs(var1.field_106806_a, var1.field_106802_d, false));
            this.field_107018_e.field_103856_bM.func_111490_a(this.field_107018_e, false);
            ArrayList var3 = new ArrayList();

            for(int var4 = 0; var4 < this.field_107018_e.field_103856_bM.field_111513_b.size(); ++var4) {
               var3.add(((C_101048_rz)this.field_107018_e.field_103856_bM.field_111513_b.get(var4)).func_111446_c());
            }

            this.field_107018_e.func_103872_a(this.field_107018_e.field_103856_bM, var3);
         }
      }

   }

   public void func_106948_a(C_100380_ct var1) {
      if(this.field_107018_e.field_103856_bM.field_111514_c == var1.field_106808_a && this.field_107018_e.field_103856_bM.func_111495_b(this.field_107018_e)) {
         this.field_107018_e.field_103856_bM.func_111508_a(this.field_107018_e, var1.field_106807_b);
         this.field_107018_e.field_103856_bM.func_111506_b();
      }

   }

   public void func_106942_a(C_100289_ek var1) {
      if(this.field_107018_e.field_104517_c.func_109803_d()) {
         boolean var2 = var1.field_106744_a < 0;
         C_100994_tv var3 = var1.field_106743_b;
         boolean var4 = var1.field_106744_a >= 1 && var1.field_106744_a < 36 + C_101092_qf.func_104817_h();
         boolean var5 = var3 == null || var3.field_111397_c < C_100992_tt.field_110834_e.length && var3.field_111397_c >= 0 && C_100992_tt.field_110834_e[var3.field_111397_c] != null;
         boolean var6 = var3 == null || var3.func_111367_j() >= 0 && var3.func_111367_j() >= 0 && var3.field_111398_a <= 64 && var3.field_111398_a > 0;
         if(var4 && var5 && var6) {
            if(var3 == null) {
               this.field_107018_e.field_103855_bL.func_111492_a(var1.field_106744_a, (C_100994_tv)null);
            } else {
               this.field_107018_e.field_103855_bL.func_111492_a(var1.field_106744_a, var3);
            }

            this.field_107018_e.field_103855_bL.func_111490_a(this.field_107018_e, true);
         } else if(var2 && var5 && var6 && this.field_107022_n < 200) {
            this.field_107022_n += 20;
            C_100576_pg var7 = this.field_107018_e.func_103767_c(var3);
            if(var7 != null) {
               var7.func_103274_c();
            }
         }
      }

   }

   public void func_106920_a(C_100382_cs var1) {
      Short var2 = (Short)this.field_107030_s.func_109038_a(this.field_107018_e.field_103856_bM.field_111514_c);
      if(var2 != null && var1.field_106809_b == var2.shortValue() && this.field_107018_e.field_103856_bM.field_111514_c == var1.field_106811_a && !this.field_107018_e.field_103856_bM.func_111495_b(this.field_107018_e)) {
         this.field_107018_e.field_103856_bM.func_111490_a(this.field_107018_e, true);
      }

   }

   public void func_106968_a(C_100266_eu var1) {
      C_100765_ie var2 = this.field_107017_d.func_104879_a(this.field_107018_e.field_103224_ap);
      if(var2.func_109461_e(var1.field_106691_a, var1.field_106689_b, var1.field_106690_c)) {
         C_100398_amm var3 = var2.func_109353_p(var1.field_106691_a, var1.field_106689_b, var1.field_106690_c);
         if(var3 instanceof C_100414_amj) {
            C_100414_amj var4 = (C_100414_amj)var3;
            if(!var4.func_102960_a()) {
               this.field_107017_d.func_104922_g("Player " + this.field_107018_e.field_103847_bT + " just tried to change non-editable sign");
               return;
            }
         }

         int var6;
         int var8;
         for(var8 = 0; var8 < 4; ++var8) {
            boolean var5 = true;
            if(var1.field_106688_d[var8].length() > 15) {
               var5 = false;
            } else {
               for(var6 = 0; var6 < var1.field_106688_d[var8].length(); ++var6) {
                  if(C_100011_m.field_105261_a.indexOf(var1.field_106688_d[var8].charAt(var6)) < 0) {
                     var5 = false;
                  }
               }
            }

            if(!var5) {
               var1.field_106688_d[var8] = "!?";
            }
         }

         if(var3 instanceof C_100414_amj) {
            var8 = var1.field_106691_a;
            int var9 = var1.field_106689_b;
            var6 = var1.field_106690_c;
            C_100414_amj var7 = (C_100414_amj)var3;
            System.arraycopy(var1.field_106688_d, 0, var7.field_102963_a, 0, 4);
            var7.func_102922_d();
            var2.func_109404_h(var8, var9, var6);
         }
      }

   }

   public void func_106960_a(C_100242_di var1) {
      if(var1.field_106611_a == this.field_107029_i) {
         int var2 = (int)(System.nanoTime() / 1000000L - this.field_107026_j);
         this.field_107018_e.field_104524_i = (this.field_107018_e.field_104524_i * 3 + var2) / 4;
      }

   }

   public boolean func_106958_a() {
      return true;
   }

   public void func_106941_a(C_100223_dz var1) {
      this.field_107018_e.field_103869_cf.field_111599_b = var1.func_106570_f() && this.field_107018_e.field_103869_cf.field_111600_c;
   }

   public void func_106977_a(C_100397_cl var1) {
      StringBuilder var2 = new StringBuilder();

      String var4;
      for(Iterator var3 = this.field_107017_d.func_104932_a(this.field_107018_e, var1.func_106845_d()).iterator(); var3.hasNext(); var2.append(var4)) {
         var4 = (String)var3.next();
         if(var2.length() > 0) {
            var2.append(" ");
         }
      }

      this.field_107018_e.field_104518_a.func_107009_b(new C_100397_cl(var2.toString()));
   }

   public void func_106918_a(C_100390_cp var1) {
      this.field_107018_e.func_104498_a(var1);
   }

   public void func_106971_a(C_100367_da var1) {
      DataInputStream var2;
      C_100994_tv var3;
      C_100994_tv var4;
      if("MC|BEdit".equals(var1.field_106787_a)) {
         try {
            var2 = new DataInputStream(new ByteArrayInputStream(var1.field_106786_c));
            var3 = C_100219_dx.func_106540_c(var2);
            if(!C_100937_uz.func_111055_a(var3.func_111352_p())) {
               throw new IOException("Invalid book tag!");
            }

            var4 = this.field_107018_e.field_103857_bK.func_104808_g();
            if(var3 != null && var3.field_111397_c == C_100992_tt.field_110969_bF.field_110891_cf && var3.field_111397_c == var4.field_111397_c) {
               var4.func_111349_d(var3.func_111352_p());
            }
         } catch (Exception var12) {
            var12.printStackTrace();
         }
      } else if("MC|BSign".equals(var1.field_106787_a)) {
         try {
            var2 = new DataInputStream(new ByteArrayInputStream(var1.field_106786_c));
            var3 = C_100219_dx.func_106540_c(var2);
            if(!C_100949_va.func_110990_a(var3.func_111352_p())) {
               throw new IOException("Invalid book tag!");
            }

            var4 = this.field_107018_e.field_103857_bK.func_104808_g();
            if(var3 != null && var3.field_111397_c == C_100992_tt.field_110971_bG.field_110891_cf && var4.field_111397_c == C_100992_tt.field_110969_bF.field_110891_cf) {
               var4.func_111349_d(var3.func_111352_p());
               var4.field_111397_c = C_100992_tt.field_110971_bG.field_110891_cf;
            }
         } catch (Exception var11) {
            var11.printStackTrace();
         }
      } else {
         int var14;
         if("MC|TrSel".equals(var1.field_106787_a)) {
            try {
               var2 = new DataInputStream(new ByteArrayInputStream(var1.field_106786_c));
               var14 = var2.readInt();
               C_101075_qy var16 = this.field_107018_e.field_103856_bM;
               if(var16 instanceof C_101051_rr) {
                  ((C_101051_rr)var16).func_111516_b(var14);
               }
            } catch (Exception var10) {
               var10.printStackTrace();
            }
         } else {
            int var18;
            if("MC|AdvCdm".equals(var1.field_106787_a)) {
               if(!this.field_107017_d.func_104881_Z()) {
                  this.field_107018_e.func_102910_a(this.field_107018_e.func_102908_a("advMode.notEnabled", new Object[0]));
               } else if(this.field_107018_e.func_102912_a(2, "") && this.field_107018_e.field_103869_cf.field_111597_d) {
                  try {
                     var2 = new DataInputStream(new ByteArrayInputStream(var1.field_106786_c));
                     var14 = var2.readInt();
                     var18 = var2.readInt();
                     int var5 = var2.readInt();
                     String var6 = C_100219_dx.func_106551_a(var2, 256);
                     C_100398_amm var7 = this.field_107018_e.field_103229_p.func_109353_p(var14, var18, var5);
                     if(var7 != null && var7 instanceof C_100423_amc) {
                        ((C_100423_amc)var7).func_104857_b(var6);
                        this.field_107018_e.field_103229_p.func_109404_h(var14, var18, var5);
                        this.field_107018_e.func_102910_a("Command set: " + var6);
                     }
                  } catch (Exception var9) {
                     var9.printStackTrace();
                  }
               } else {
                  this.field_107018_e.func_102910_a(this.field_107018_e.func_102908_a("advMode.notAllowed", new Object[0]));
               }
            } else if("MC|Beacon".equals(var1.field_106787_a)) {
               if(this.field_107018_e.field_103856_bM instanceof C_101076_qz) {
                  try {
                     var2 = new DataInputStream(new ByteArrayInputStream(var1.field_106786_c));
                     var14 = var2.readInt();
                     var18 = var2.readInt();
                     C_101076_qz var17 = (C_101076_qz)this.field_107018_e.field_103856_bM;
                     C_101048_rz var19 = var17.func_111503_a(0);
                     if(var19.func_111453_d()) {
                        var19.func_111445_a(1);
                        C_100425_alz var20 = var17.func_111562_d();
                        var20.func_103040_d(var14);
                        var20.func_103039_e(var18);
                        var20.func_102922_d();
                     }
                  } catch (Exception var8) {
                     var8.printStackTrace();
                  }
               }
            } else if("MC|ItemName".equals(var1.field_106787_a) && this.field_107018_e.field_103856_bM instanceof C_101054_ru) {
               C_101054_ru var13 = (C_101054_ru)this.field_107018_e.field_103856_bM;
               if(var1.field_106786_c != null && var1.field_106786_c.length >= 1) {
                  String var15 = C_100011_m.func_105258_a(new String(var1.field_106786_c));
                  if(var15.length() <= 30) {
                     var13.func_111524_a(var15);
                  }
               } else {
                  var13.func_111524_a("");
               }
            }
         }
      }

   }

}
