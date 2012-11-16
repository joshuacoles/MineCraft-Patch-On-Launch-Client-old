import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class C_101302_ati extends C_101278_asw {

   private static final int field_104349_s = C_100822_iy.field_110063_a * 24 - 112;
   private static final int field_104348_t = C_100822_iy.field_110061_b * 24 - 112;
   private static final int field_104347_u = C_100822_iy.field_110062_c * 24 - 77;
   private static final int field_104346_v = C_100822_iy.field_110059_d * 24 - 77;
   protected int field_104341_a = 256;
   protected int field_104339_b = 202;
   protected int field_104340_c = 0;
   protected int field_104338_d = 0;
   protected double field_104344_m;
   protected double field_104342_n;
   protected double field_104343_o;
   protected double field_104352_p;
   protected double field_104351_q;
   protected double field_104350_r;
   private int field_104345_w = 0;
   private C_100100_bda field_104353_x;


   public C_101302_ati(C_100100_bda var1) {
      this.field_104353_x = var1;
      short var2 = 141;
      short var3 = 141;
      this.field_104344_m = this.field_104343_o = this.field_104351_q = (double)(C_100822_iy.field_110057_f.field_109936_a * 24 - var2 / 2 - 12);
      this.field_104342_n = this.field_104352_p = this.field_104350_r = (double)(C_100822_iy.field_110057_f.field_109934_b * 24 - var3 / 2);
   }

   public void func_104037_A_() {
      this.field_104050_h.clear();
      this.field_104050_h.add(new C_101300_atd(1, this.field_104044_f / 2 + 24, this.field_104045_g / 2 + 74, 80, 20, C_100359_bd.func_107638_a("gui.done")));
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103908_f == 1) {
         this.field_104046_e.func_105053_a((C_101278_asw)null);
         this.field_104046_e.func_105057_h();
      }

      super.func_104040_a(var1);
   }

   protected void func_104032_a(char var1, int var2) {
      if(var2 == this.field_104046_e.field_105156_y.field_111691_F.field_111989_d) {
         this.field_104046_e.func_105053_a((C_101278_asw)null);
         this.field_104046_e.func_105057_h();
      } else {
         super.func_104032_a(var1, var2);
      }

   }

   public void func_104027_a(int var1, int var2, float var3) {
      if(Mouse.isButtonDown(0)) {
         int var4 = (this.field_104044_f - this.field_104341_a) / 2;
         int var5 = (this.field_104045_g - this.field_104339_b) / 2;
         int var6 = var4 + 8;
         int var7 = var5 + 17;
         if((this.field_104345_w == 0 || this.field_104345_w == 1) && var1 >= var6 && var1 < var6 + 224 && var2 >= var7 && var2 < var7 + 155) {
            if(this.field_104345_w == 0) {
               this.field_104345_w = 1;
            } else {
               this.field_104343_o -= (double)(var1 - this.field_104340_c);
               this.field_104352_p -= (double)(var2 - this.field_104338_d);
               this.field_104351_q = this.field_104344_m = this.field_104343_o;
               this.field_104350_r = this.field_104342_n = this.field_104352_p;
            }

            this.field_104340_c = var1;
            this.field_104338_d = var2;
         }

         if(this.field_104351_q < (double)field_104349_s) {
            this.field_104351_q = (double)field_104349_s;
         }

         if(this.field_104350_r < (double)field_104348_t) {
            this.field_104350_r = (double)field_104348_t;
         }

         if(this.field_104351_q >= (double)field_104347_u) {
            this.field_104351_q = (double)(field_104347_u - 1);
         }

         if(this.field_104350_r >= (double)field_104346_v) {
            this.field_104350_r = (double)(field_104346_v - 1);
         }
      } else {
         this.field_104345_w = 0;
      }

      this.func_104035_z_();
      this.func_104337_b(var1, var2, var3);
      GL11.glDisable(2896);
      GL11.glDisable(2929);
      this.func_104336_g();
      GL11.glEnable(2896);
      GL11.glEnable(2929);
   }

   public void func_104039_c() {
      this.field_104344_m = this.field_104343_o;
      this.field_104342_n = this.field_104352_p;
      double var1 = this.field_104351_q - this.field_104343_o;
      double var3 = this.field_104350_r - this.field_104352_p;
      if(var1 * var1 + var3 * var3 < 4.0D) {
         this.field_104343_o += var1;
         this.field_104352_p += var3;
      } else {
         this.field_104343_o += var1 * 0.85D;
         this.field_104352_p += var3 * 0.85D;
      }

   }

   protected void func_104336_g() {
      int var1 = (this.field_104044_f - this.field_104341_a) / 2;
      int var2 = (this.field_104045_g - this.field_104339_b) / 2;
      this.field_104049_k.func_111798_b("Achievements", var1 + 15, var2 + 5, 4210752);
   }

   protected void func_104337_b(int var1, int var2, float var3) {
      int var4 = C_100650_jv.func_108910_c(this.field_104344_m + (this.field_104343_o - this.field_104344_m) * (double)var3);
      int var5 = C_100650_jv.func_108910_c(this.field_104342_n + (this.field_104352_p - this.field_104342_n) * (double)var3);
      if(var4 < field_104349_s) {
         var4 = field_104349_s;
      }

      if(var5 < field_104348_t) {
         var5 = field_104348_t;
      }

      if(var4 >= field_104347_u) {
         var4 = field_104347_u - 1;
      }

      if(var5 >= field_104346_v) {
         var5 = field_104346_v - 1;
      }

      int var6 = this.field_104046_e.field_105127_o.func_110367_b("/terrain.png");
      int var7 = this.field_104046_e.field_105127_o.func_110367_b("/achievement/bg.png");
      int var8 = (this.field_104044_f - this.field_104341_a) / 2;
      int var9 = (this.field_104045_g - this.field_104339_b) / 2;
      int var10 = var8 + 16;
      int var11 = var9 + 17;
      this.field_103883_j = 0.0F;
      GL11.glDepthFunc(518);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 0.0F, -200.0F);
      GL11.glEnable(3553);
      GL11.glDisable(2896);
      GL11.glEnable('\u803a');
      GL11.glEnable(2903);
      this.field_104046_e.field_105127_o.func_110368_b(var6);
      int var12 = var4 + 288 >> 4;
      int var13 = var5 + 288 >> 4;
      int var14 = (var4 + 288) % 16;
      int var15 = (var5 + 288) % 16;
      Random var21 = new Random();

      int var22;
      int var25;
      int var24;
      int var26;
      for(var22 = 0; var22 * 16 - var15 < 155; ++var22) {
         float var23 = 0.6F - (float)(var13 + var22) / 25.0F * 0.3F;
         GL11.glColor4f(var23, var23, var23, 1.0F);

         for(var24 = 0; var24 * 16 - var14 < 224; ++var24) {
            var21.setSeed((long)(1234 + var12 + var24));
            var21.nextInt();
            var25 = var21.nextInt(1 + var13 + var22) + (var13 + var22) / 2;
            var26 = C_100451_alf.field_106082_H.field_106165_cl;
            if(var25 <= 37 && var13 + var22 != 35) {
               if(var25 == 22) {
                  if(var21.nextInt(2) == 0) {
                     var26 = C_100451_alf.field_106201_az.field_106165_cl;
                  } else {
                     var26 = C_100451_alf.field_106178_aQ.field_106165_cl;
                  }
               } else if(var25 == 10) {
                  var26 = C_100451_alf.field_106085_K.field_106165_cl;
               } else if(var25 == 8) {
                  var26 = C_100451_alf.field_106078_L.field_106165_cl;
               } else if(var25 > 4) {
                  var26 = C_100451_alf.field_106111_w.field_106165_cl;
               } else if(var25 > 0) {
                  var26 = C_100451_alf.field_106120_y.field_106165_cl;
               }
            } else {
               var26 = C_100451_alf.field_106077_C.field_106165_cl;
            }

            this.func_103877_b(var10 + var24 * 16 - var14, var11 + var22 * 16 - var15, var26 % 16 << 4, var26 >> 4 << 4, 16, 16);
         }
      }

      GL11.glEnable(2929);
      GL11.glDepthFunc(515);
      GL11.glDisable(3553);

      int var27;
      int var30;
      for(var22 = 0; var22 < C_100822_iy.field_110060_e.size(); ++var22) {
         C_100791_ix var33 = (C_100791_ix)C_100822_iy.field_110060_e.get(var22);
         if(var33.field_109935_c != null) {
            var24 = var33.field_109936_a * 24 - var4 + 11 + var10;
            var25 = var33.field_109934_b * 24 - var5 + 11 + var11;
            var26 = var33.field_109935_c.field_109936_a * 24 - var4 + 11 + var10;
            var27 = var33.field_109935_c.field_109934_b * 24 - var5 + 11 + var11;
            boolean var28 = this.field_104353_x.func_105803_a(var33);
            boolean var29 = this.field_104353_x.func_105807_b(var33);
            var30 = Math.sin((double)(Minecraft.func_105063_F() % 600L) / 600.0D * 3.141592653589793D * 2.0D) > 0.6D?255:130;
            int var31 = -16777216;
            if(var28) {
               var31 = -9408400;
            } else if(var29) {
               var31 = '\uff00' + (var30 << 24);
            }

            this.func_103878_a(var24, var26, var25, var31);
            this.func_103876_b(var26, var25, var27, var31);
         }
      }

      C_100791_ix var32 = null;
      C_100059_bag var37 = new C_100059_bag();
      C_101210_aqj.func_112012_c();
      GL11.glDisable(2896);
      GL11.glEnable('\u803a');
      GL11.glEnable(2903);

      int var42;
      int var41;
      for(var24 = 0; var24 < C_100822_iy.field_110060_e.size(); ++var24) {
         C_100791_ix var35 = (C_100791_ix)C_100822_iy.field_110060_e.get(var24);
         var26 = var35.field_109936_a * 24 - var4;
         var27 = var35.field_109934_b * 24 - var5;
         if(var26 >= -24 && var27 >= -24 && var26 <= 224 && var27 <= 155) {
            float var38;
            if(this.field_104353_x.func_105803_a(var35)) {
               var38 = 1.0F;
               GL11.glColor4f(var38, var38, var38, 1.0F);
            } else if(this.field_104353_x.func_105807_b(var35)) {
               var38 = Math.sin((double)(Minecraft.func_105063_F() % 600L) / 600.0D * 3.141592653589793D * 2.0D) < 0.6D?0.6F:0.8F;
               GL11.glColor4f(var38, var38, var38, 1.0F);
            } else {
               var38 = 0.3F;
               GL11.glColor4f(var38, var38, var38, 1.0F);
            }

            this.field_104046_e.field_105127_o.func_110368_b(var7);
            var42 = var10 + var26;
            var41 = var11 + var27;
            if(var35.func_109927_f()) {
               this.func_103877_b(var42 - 2, var41 - 2, 26, 202, 26, 26);
            } else {
               this.func_103877_b(var42 - 2, var41 - 2, 0, 202, 26, 26);
            }

            if(!this.field_104353_x.func_105807_b(var35)) {
               float var40 = 0.1F;
               GL11.glColor4f(var40, var40, var40, 1.0F);
               var37.field_105504_a = false;
            }

            GL11.glEnable(2896);
            GL11.glEnable(2884);
            var37.func_105501_b(this.field_104046_e.field_105148_p, this.field_104046_e.field_105127_o, var35.field_109933_d, var42 + 3, var41 + 3);
            GL11.glDisable(2896);
            if(!this.field_104353_x.func_105807_b(var35)) {
               var37.field_105504_a = true;
            }

            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            if(var1 >= var10 && var2 >= var11 && var1 < var10 + 224 && var2 < var11 + 155 && var1 >= var42 && var1 <= var42 + 22 && var2 >= var41 && var2 <= var41 + 22) {
               var32 = var35;
            }
         }
      }

      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(var7);
      this.func_103877_b(var8, var9, 0, 0, this.field_104341_a, this.field_104339_b);
      GL11.glPopMatrix();
      this.field_103883_j = 0.0F;
      GL11.glDepthFunc(515);
      GL11.glDisable(2929);
      GL11.glEnable(3553);
      super.func_104027_a(var1, var2, var3);
      if(var32 != null) {
         String var34 = C_100359_bd.func_107638_a(var32.func_109913_i());
         String var36 = var32.func_109932_e();
         var26 = var1 + 12;
         var27 = var2 - 4;
         if(this.field_104353_x.func_105807_b(var32)) {
            var42 = Math.max(this.field_104049_k.func_111778_a(var34), 120);
            var41 = this.field_104049_k.func_111789_b(var36, var42);
            if(this.field_104353_x.func_105803_a(var32)) {
               var41 += 12;
            }

            this.func_103881_a(var26 - 3, var27 - 3, var26 + var42 + 3, var27 + var41 + 3 + 12, -1073741824, -1073741824);
            this.field_104049_k.func_111801_b(var36, var26, var27 + 12, var42, -6250336);
            if(this.field_104353_x.func_105803_a(var32)) {
               this.field_104049_k.func_111783_a(C_100359_bd.func_107638_a("achievement.taken"), var26, var27 + var41 + 4, -7302913);
            }
         } else {
            var42 = Math.max(this.field_104049_k.func_111778_a(var34), 120);
            String var39 = C_100359_bd.func_107637_a("achievement.requires", new Object[]{C_100359_bd.func_107638_a(var32.field_109935_c.func_109913_i())});
            var30 = this.field_104049_k.func_111789_b(var39, var42);
            this.func_103881_a(var26 - 3, var27 - 3, var26 + var42 + 3, var27 + var30 + 12 + 3, -1073741824, -1073741824);
            this.field_104049_k.func_111801_b(var39, var26, var27 + 12, var42, -9416624);
         }

         this.field_104049_k.func_111783_a(var34, var26, var27, this.field_104353_x.func_105807_b(var32)?(var32.func_109927_f()?-128:-1):(var32.func_109927_f()?-8355776:-8355712));
      }

      GL11.glEnable(2929);
      GL11.glEnable(2896);
      C_101210_aqj.func_112010_a();
   }

   public boolean func_104031_f() {
      return true;
   }

}
