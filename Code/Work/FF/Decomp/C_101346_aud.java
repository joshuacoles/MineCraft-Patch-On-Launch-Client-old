import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class C_101346_aud extends C_101352_aug {

   private static C_100706_ko field_104476_o = new C_100706_ko("tmp", 45);
   private static int field_104475_p = C_101040_sq.field_111417_b.func_111409_a();
   private float field_104474_q = 0.0F;
   private boolean field_104473_r = false;
   private boolean field_104472_s;
   private C_101146_ary field_104471_t;
   private List field_104470_u;
   private C_101048_rz field_104469_v = null;
   private boolean field_104468_w = false;
   private C_101317_auc field_104477_x;


   public C_101346_aud(C_101095_qg var1) {
      super(new C_101348_aue(var1));
      var1.field_103856_bM = this.field_104439_d;
      this.field_104051_i = true;
      var1.func_103813_a(C_100822_iy.field_110057_f, 1);
      this.field_104441_c = 136;
      this.field_104440_b = 195;
   }

   public void func_104039_c() {
      if(!this.field_104046_e.field_105123_b.func_111070_h()) {
         this.field_104046_e.func_105053_a(new C_101360_auk(this.field_104046_e.field_105120_g));
      }

   }

   protected void func_104434_a(C_101048_rz var1, int var2, int var3, int var4) {
      this.field_104468_w = true;
      boolean var5 = var4 == 1;
      C_101092_qf var6;
      C_100994_tv var7;
      if(var1 != null) {
         if(var1 == this.field_104469_v && var5) {
            for(int var10 = 0; var10 < this.field_104046_e.field_105120_g.field_103855_bL.func_111499_a().size(); ++var10) {
               this.field_104046_e.field_105123_b.func_111060_a((C_100994_tv)null, var10);
            }
         } else if(field_104475_p == C_101040_sq.field_111423_m.func_111409_a()) {
            if(var1 == this.field_104469_v) {
               this.field_104046_e.field_105120_g.field_103857_bK.func_104801_b((C_100994_tv)null);
            } else {
               this.field_104046_e.field_105120_g.field_103855_bL.func_111496_a(C_101350_auf.func_111486_a((C_101350_auf)var1).field_111460_g, var3, var4, this.field_104046_e.field_105120_g);
               this.field_104046_e.field_105120_g.field_103855_bL.func_111506_b();
            }
         } else if(var1.field_111459_f == field_104476_o) {
            var6 = this.field_104046_e.field_105120_g.field_103857_bK;
            var7 = var6.func_104824_n();
            C_100994_tv var8 = var1.func_111446_c();
            C_100994_tv var9;
            if(var4 == 2) {
               if(var8 != null && var3 >= 0 && var3 < 9) {
                  var9 = var8.func_111360_l();
                  var9.field_111398_a = var9.func_111380_d();
                  this.field_104046_e.field_105120_g.field_103857_bK.func_103006_a(var3, var9);
                  this.field_104046_e.field_105120_g.field_103855_bL.func_111506_b();
               }

               return;
            }

            if(var4 == 3) {
               if(var6.func_104824_n() == null && var1.func_111453_d()) {
                  var9 = var1.func_111446_c().func_111360_l();
                  var9.field_111398_a = var9.func_111380_d();
                  var6.func_104801_b(var9);
               }

               return;
            }

            if(var7 != null && var8 != null && var7.func_111351_a(var8)) {
               if(var3 == 0) {
                  if(var5) {
                     var7.field_111398_a = var7.func_111380_d();
                  } else if(var7.field_111398_a < var7.func_111380_d()) {
                     ++var7.field_111398_a;
                  }
               } else if(var7.field_111398_a <= 1) {
                  var6.func_104801_b((C_100994_tv)null);
               } else {
                  --var7.field_111398_a;
               }
            } else if(var8 != null && var7 == null) {
               var6.func_104801_b(C_100994_tv.func_111341_b(var8));
               var7 = var6.func_104824_n();
               if(var5) {
                  var7.field_111398_a = var7.func_111380_d();
               }
            } else {
               var6.func_104801_b((C_100994_tv)null);
            }
         } else {
            this.field_104439_d.func_111496_a(var1.field_111460_g, var3, var4, this.field_104046_e.field_105120_g);
            C_100994_tv var11 = this.field_104439_d.func_111503_a(var1.field_111460_g).func_111446_c();
            this.field_104046_e.field_105123_b.func_111060_a(var11, var1.field_111460_g - this.field_104439_d.field_111513_b.size() + 9 + 36);
         }
      } else {
         var6 = this.field_104046_e.field_105120_g.field_103857_bK;
         if(var6.func_104824_n() != null) {
            if(var3 == 0) {
               this.field_104046_e.field_105120_g.func_103767_c(var6.func_104824_n());
               this.field_104046_e.field_105123_b.func_111065_a(var6.func_104824_n());
               var6.func_104801_b((C_100994_tv)null);
            }

            if(var3 == 1) {
               var7 = var6.func_104824_n().func_111342_a(1);
               this.field_104046_e.field_105120_g.func_103767_c(var7);
               this.field_104046_e.field_105123_b.func_111065_a(var7);
               if(var6.func_104824_n().field_111398_a == 0) {
                  var6.func_104801_b((C_100994_tv)null);
               }
            }
         }
      }

   }

   public void func_104037_A_() {
      if(this.field_104046_e.field_105123_b.func_111070_h()) {
         super.func_104037_A_();
         this.field_104050_h.clear();
         Keyboard.enableRepeatEvents(true);
         this.field_104471_t = new C_101146_ary(this.field_104049_k, this.field_104445_m + 82, this.field_104443_n + 6, 89, this.field_104049_k.field_111811_b);
         this.field_104471_t.func_103963_f(15);
         this.field_104471_t.func_103945_a(false);
         this.field_104471_t.func_103949_e(false);
         this.field_104471_t.func_103953_g(16777215);
         int var1 = field_104475_p;
         field_104475_p = -1;
         this.func_104462_b(C_101040_sq.field_111419_a[var1]);
         this.field_104477_x = new C_101317_auc(this.field_104046_e);
         this.field_104046_e.field_105120_g.field_103855_bL.func_111507_a(this.field_104477_x);
      } else {
         this.field_104046_e.func_105053_a(new C_101360_auk(this.field_104046_e.field_105120_g));
      }

   }

   public void func_104038_b() {
      super.func_104038_b();
      this.field_104046_e.field_105120_g.field_103855_bL.func_111500_b(this.field_104477_x);
      Keyboard.enableRepeatEvents(false);
   }

   protected void func_104032_a(char var1, int var2) {
      if(field_104475_p != C_101040_sq.field_111414_g.func_111409_a()) {
         if(Keyboard.isKeyDown(this.field_104046_e.field_105156_y.field_111700_H.field_111989_d)) {
            this.func_104462_b(C_101040_sq.field_111414_g);
         } else {
            super.func_104032_a(var1, var2);
         }

      } else {
         if(this.field_104468_w) {
            this.field_104468_w = false;
            this.field_104471_t.func_103940_a("");
         }

         if(!this.func_104437_a(var2)) {
            if(this.field_104471_t.func_103961_a(var1, var2)) {
               this.func_104465_i();
            } else {
               super.func_104032_a(var1, var2);
            }

         }
      }
   }

   private void func_104465_i() {
      C_101348_aue var1 = (C_101348_aue)this.field_104439_d;
      var1.field_111570_e.clear();
      C_100992_tt[] var2 = C_100992_tt.field_110834_e;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         C_100992_tt var5 = var2[var4];
         if(var5 != null && var5.func_110760_w() != null) {
            var5.func_110767_a(var5.field_110891_cf, (C_101040_sq)null, var1.field_111570_e);
         }
      }

      Iterator var8 = var1.field_111570_e.iterator();
      String var9 = this.field_104471_t.func_103939_b().toLowerCase();

      while(var8.hasNext()) {
         C_100994_tv var10 = (C_100994_tv)var8.next();
         boolean var11 = false;
         Iterator var6 = var10.func_111390_a(this.field_104046_e.field_105120_g, this.field_104046_e.field_105156_y.field_111753_x).iterator();

         while(true) {
            if(var6.hasNext()) {
               String var7 = (String)var6.next();
               if(!var7.toLowerCase().contains(var9)) {
                  continue;
               }

               var11 = true;
            }

            if(!var11) {
               var8.remove();
            }
            break;
         }
      }

      this.field_104474_q = 0.0F;
      var1.func_111568_a(0.0F);
   }

   protected void func_104433_b(int var1, int var2) {
      C_101040_sq var3 = C_101040_sq.field_111419_a[field_104475_p];
      if(var3.func_111407_g()) {
         this.field_104049_k.func_111798_b(var3.func_111412_c(), 8, 6, 4210752);
      }

   }

   protected void func_104028_a(int var1, int var2, int var3) {
      if(var3 == 0) {
         int var4 = var1 - this.field_104445_m;
         int var5 = var2 - this.field_104443_n;
         C_101040_sq[] var6 = C_101040_sq.field_111419_a;
         int var7 = var6.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            C_101040_sq var9 = var6[var8];
            if(this.func_104460_a(var9, var4, var5)) {
               this.func_104462_b(var9);
               return;
            }
         }
      }

      super.func_104028_a(var1, var2, var3);
   }

   private boolean func_104464_j() {
      return field_104475_p != C_101040_sq.field_111423_m.func_111409_a() && C_101040_sq.field_111419_a[field_104475_p].func_111405_i() && ((C_101348_aue)this.field_104439_d).func_111569_d();
   }

   private void func_104462_b(C_101040_sq var1) {
      int var2 = field_104475_p;
      field_104475_p = var1.func_111409_a();
      C_101348_aue var3 = (C_101348_aue)this.field_104439_d;
      var3.field_111570_e.clear();
      var1.func_111406_a(var3.field_111570_e);
      if(var1 == C_101040_sq.field_111423_m) {
         C_101075_qy var4 = this.field_104046_e.field_105120_g.field_103855_bL;
         if(this.field_104470_u == null) {
            this.field_104470_u = var3.field_111513_b;
         }

         var3.field_111513_b = new ArrayList();

         for(int var5 = 0; var5 < var4.field_111513_b.size(); ++var5) {
            C_101350_auf var6 = new C_101350_auf(this, (C_101048_rz)var4.field_111513_b.get(var5), var5);
            var3.field_111513_b.add(var6);
            int var7;
            int var8;
            int var9;
            if(var5 >= 5 && var5 < 9) {
               var7 = var5 - 5;
               var8 = var7 / 2;
               var9 = var7 % 2;
               var6.field_111462_h = 9 + var8 * 54;
               var6.field_111463_i = 6 + var9 * 27;
            } else if(var5 >= 0 && var5 < 5) {
               var6.field_111463_i = -2000;
               var6.field_111462_h = -2000;
            } else if(var5 < var4.field_111513_b.size()) {
               var7 = var5 - 9;
               var8 = var7 % 9;
               var9 = var7 / 9;
               var6.field_111462_h = 9 + var8 * 18;
               if(var5 >= 36) {
                  var6.field_111463_i = 112;
               } else {
                  var6.field_111463_i = 54 + var9 * 18;
               }
            }
         }

         this.field_104469_v = new C_101048_rz(field_104476_o, 0, 173, 112);
         var3.field_111513_b.add(this.field_104469_v);
      } else if(var2 == C_101040_sq.field_111423_m.func_111409_a()) {
         var3.field_111513_b = this.field_104470_u;
         this.field_104470_u = null;
      }

      if(this.field_104471_t != null) {
         if(var1 == C_101040_sq.field_111414_g) {
            this.field_104471_t.func_103949_e(true);
            this.field_104471_t.func_103965_d(false);
            this.field_104471_t.func_103955_b(true);
            this.field_104471_t.func_103940_a("");
            this.func_104465_i();
         } else {
            this.field_104471_t.func_103949_e(false);
            this.field_104471_t.func_103965_d(true);
            this.field_104471_t.func_103955_b(false);
         }
      }

      this.field_104474_q = 0.0F;
      var3.func_111568_a(0.0F);
   }

   public void func_104030_d() {
      super.func_104030_d();
      int var1 = Mouse.getEventDWheel();
      if(var1 != 0 && this.func_104464_j()) {
         int var2 = ((C_101348_aue)this.field_104439_d).field_111570_e.size() / 9 - 5 + 1;
         if(var1 > 0) {
            var1 = 1;
         }

         if(var1 < 0) {
            var1 = -1;
         }

         this.field_104474_q = (float)((double)this.field_104474_q - (double)var1 / (double)var2);
         if(this.field_104474_q < 0.0F) {
            this.field_104474_q = 0.0F;
         }

         if(this.field_104474_q > 1.0F) {
            this.field_104474_q = 1.0F;
         }

         ((C_101348_aue)this.field_104439_d).func_111568_a(this.field_104474_q);
      }

   }

   public void func_104027_a(int var1, int var2, float var3) {
      boolean var4 = Mouse.isButtonDown(0);
      int var5 = this.field_104445_m;
      int var6 = this.field_104443_n;
      int var7 = var5 + 175;
      int var8 = var6 + 18;
      int var9 = var7 + 14;
      int var10 = var8 + 112;
      if(!this.field_104472_s && var4 && var1 >= var7 && var2 >= var8 && var1 < var9 && var2 < var10) {
         this.field_104473_r = this.func_104464_j();
      }

      if(!var4) {
         this.field_104473_r = false;
      }

      this.field_104472_s = var4;
      if(this.field_104473_r) {
         this.field_104474_q = ((float)(var2 - var8) - 7.5F) / ((float)(var10 - var8) - 15.0F);
         if(this.field_104474_q < 0.0F) {
            this.field_104474_q = 0.0F;
         }

         if(this.field_104474_q > 1.0F) {
            this.field_104474_q = 1.0F;
         }

         ((C_101348_aue)this.field_104439_d).func_111568_a(this.field_104474_q);
      }

      super.func_104027_a(var1, var2, var3);
      C_101040_sq[] var11 = C_101040_sq.field_111419_a;
      int var12 = var11.length;

      for(int var13 = 0; var13 < var12; ++var13) {
         C_101040_sq var14 = var11[var13];
         if(this.func_104466_b(var14, var1, var2)) {
            break;
         }
      }

      if(this.field_104469_v != null && field_104475_p == C_101040_sq.field_111423_m.func_111409_a() && this.func_104431_c(this.field_104469_v.field_111462_h, this.field_104469_v.field_111463_i, 16, 16, var1, var2)) {
         this.func_104435_a(C_100361_be.func_107654_a().func_107651_b("inventory.binSlot"), var1, var2);
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2896);
   }

   protected void func_104430_a(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      C_101210_aqj.func_112012_c();
      int var4 = this.field_104046_e.field_105127_o.func_110367_b("/gui/allitems.png");
      C_101040_sq var5 = C_101040_sq.field_111419_a[field_104475_p];
      int var6 = this.field_104046_e.field_105127_o.func_110367_b("/gui/creative_inv/" + var5.func_111403_f());
      C_101040_sq[] var7 = C_101040_sq.field_111419_a;
      int var8 = var7.length;

      int var9;
      for(var9 = 0; var9 < var8; ++var9) {
         C_101040_sq var10 = var7[var9];
         this.field_104046_e.field_105127_o.func_110368_b(var4);
         if(var10.func_111409_a() != field_104475_p) {
            this.func_104461_a(var10);
         }
      }

      this.field_104046_e.field_105127_o.func_110368_b(var6);
      this.func_103877_b(this.field_104445_m, this.field_104443_n, 0, 0, this.field_104440_b, this.field_104441_c);
      this.field_104471_t.func_103954_f();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      int var11 = this.field_104445_m + 175;
      var8 = this.field_104443_n + 18;
      var9 = var8 + 112;
      this.field_104046_e.field_105127_o.func_110368_b(var4);
      if(var5.func_111405_i()) {
         this.func_103877_b(var11, var8 + (int)((float)(var9 - var8 - 17) * this.field_104474_q), 232 + (this.func_104464_j()?0:12), 0, 12, 15);
      }

      this.func_104461_a(var5);
      if(var5 == C_101040_sq.field_111423_m) {
         C_101360_auk.func_104478_a(this.field_104046_e, this.field_104445_m + 43, this.field_104443_n + 45, 20, (float)(this.field_104445_m + 43 - var2), (float)(this.field_104443_n + 45 - 30 - var3));
      }

   }

   protected boolean func_104460_a(C_101040_sq var1, int var2, int var3) {
      int var4 = var1.func_111408_k();
      int var5 = 28 * var4;
      byte var6 = 0;
      if(var4 == 5) {
         var5 = this.field_104440_b - 28 + 2;
      } else if(var4 > 0) {
         var5 += var4;
      }

      int var7;
      if(var1.func_111411_l()) {
         var7 = var6 - 32;
      } else {
         var7 = var6 + this.field_104441_c;
      }

      return var2 >= var5 && var2 <= var5 + 28 && var3 >= var7 && var3 <= var7 + 32;
   }

   protected boolean func_104466_b(C_101040_sq var1, int var2, int var3) {
      int var4 = var1.func_111408_k();
      int var5 = 28 * var4;
      byte var6 = 0;
      if(var4 == 5) {
         var5 = this.field_104440_b - 28 + 2;
      } else if(var4 > 0) {
         var5 += var4;
      }

      int var7;
      if(var1.func_111411_l()) {
         var7 = var6 - 32;
      } else {
         var7 = var6 + this.field_104441_c;
      }

      if(this.func_104431_c(var5 + 3, var7 + 3, 23, 27, var2, var3)) {
         this.func_104435_a(var1.func_111412_c(), var2, var3);
         return true;
      } else {
         return false;
      }
   }

   protected void func_104461_a(C_101040_sq var1) {
      boolean var2 = var1.func_111409_a() == field_104475_p;
      boolean var3 = var1.func_111411_l();
      int var4 = var1.func_111408_k();
      int var5 = var4 * 28;
      int var6 = 0;
      int var7 = this.field_104445_m + 28 * var4;
      int var8 = this.field_104443_n;
      byte var9 = 32;
      if(var2) {
         var6 += 32;
      }

      if(var4 == 5) {
         var7 = this.field_104445_m + this.field_104440_b - 28;
      } else if(var4 > 0) {
         var7 += var4;
      }

      if(var3) {
         var8 -= 28;
      } else {
         var6 += 64;
         var8 += this.field_104441_c - 4;
      }

      GL11.glDisable(2896);
      this.func_103877_b(var7, var8, var5, var6, 28, var9);
      this.field_103883_j = 100.0F;
      field_104442_a.field_105502_f = 100.0F;
      var7 += 6;
      var8 += 8 + (var3?1:-1);
      GL11.glEnable(2896);
      GL11.glEnable('\u803a');
      C_100994_tv var10 = new C_100994_tv(var1.func_111400_d());
      field_104442_a.func_105501_b(this.field_104049_k, this.field_104046_e.field_105127_o, var10, var7, var8);
      field_104442_a.func_105496_c(this.field_104049_k, this.field_104046_e.field_105127_o, var10, var7, var8);
      GL11.glDisable(2896);
      field_104442_a.field_105502_f = 0.0F;
      this.field_103883_j = 0.0F;
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103908_f == 0) {
         this.field_104046_e.func_105053_a(new C_101302_ati(this.field_104046_e.field_105094_E));
      }

      if(var1.field_103908_f == 1) {
         this.field_104046_e.func_105053_a(new C_101304_atj(this, this.field_104046_e.field_105094_E));
      }

   }

   public int func_104467_g() {
      return field_104475_p;
   }

   // $FF: synthetic method
   static C_100706_ko func_104463_h() {
      return field_104476_o;
   }

}
