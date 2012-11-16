import java.awt.Color;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_101152_asc extends C_101155_asd {

   private static final C_100059_bag field_104001_b = new C_100059_bag();
   private final Random field_104002_c = new Random();
   private final Minecraft field_103999_d;
   private final C_101132_arm field_104000_e;
   private int field_103997_f = 0;
   private String field_103998_g = "";
   private int field_104004_h = 0;
   private boolean field_104005_i = false;
   public float field_104003_a = 1.0F;


   public C_101152_asc(Minecraft var1) {
      this.field_103999_d = var1;
      this.field_104000_e = new C_101132_arm(var1);
   }

   public void func_103989_a(float var1, boolean var2, int var3, int var4) {
      C_101277_asx var5 = new C_101277_asx(this.field_103999_d.field_105156_y, this.field_103999_d.field_105124_c, this.field_103999_d.field_105121_d);
      int var6 = var5.func_112363_a();
      int var7 = var5.func_112365_b();
      C_101153_asb var8 = this.field_103999_d.field_105148_p;
      this.field_103999_d.field_105141_t.func_111241_c();
      GL11.glEnable(3042);
      if(Minecraft.func_105052_t()) {
         this.func_103988_a(this.field_103999_d.field_105120_g.func_103057_c(var1), var6, var7);
      } else {
         GL11.glBlendFunc(770, 771);
      }

      C_100994_tv var9 = this.field_103999_d.field_105120_g.field_103857_bK.func_104798_f(3);
      if(this.field_103999_d.field_105156_y.field_111710_S == 0 && var9 != null && var9.field_111397_c == C_100451_alf.field_106148_bd.field_106162_cm) {
         this.func_103996_a(var6, var7);
      }

      if(!this.field_103999_d.field_105120_g.func_103300_a(C_100690_kw.field_109175_k)) {
         float var10 = this.field_103999_d.field_105120_g.field_104555_cm + (this.field_103999_d.field_105120_g.field_104549_j - this.field_103999_d.field_105120_g.field_104555_cm) * var1;
         if(var10 > 0.0F) {
            this.func_103995_b(var10, var6, var7);
         }
      }

      boolean var11;
      int var12;
      int var13;
      int var17;
      int var16;
      int var19;
      int var20;
      int var23;
      int var22;
      int var24;
      int var47;
      if(!this.field_103999_d.field_105123_b.func_111057_a()) {
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glBindTexture(3553, this.field_103999_d.field_105127_o.func_110367_b("/gui/gui.png"));
         C_101092_qf var31 = this.field_103999_d.field_105120_g.field_103857_bK;
         this.field_103883_j = -90.0F;
         this.func_103877_b(var6 / 2 - 91, var7 - 22, 0, 0, 182, 22);
         this.func_103877_b(var6 / 2 - 91 - 1 + var31.field_104831_c * 20, var7 - 22 - 1, 0, 22, 24, 22);
         GL11.glBindTexture(3553, this.field_103999_d.field_105127_o.func_110367_b("/gui/icons.png"));
         GL11.glEnable(3042);
         GL11.glBlendFunc(775, 769);
         this.func_103877_b(var6 / 2 - 7, var7 / 2 - 7, 0, 0, 16, 16);
         GL11.glDisable(3042);
         var11 = this.field_103999_d.field_105120_g.field_103237_ae / 3 % 2 == 1;
         if(this.field_103999_d.field_105120_g.field_103237_ae < 10) {
            var11 = false;
         }

         var12 = this.field_103999_d.field_105120_g.func_103330_aT();
         var13 = this.field_103999_d.field_105120_g.field_103427_aR;
         this.field_104002_c.setSeed((long)(this.field_103997_f * 312871));
         boolean var14 = false;
         C_101077_qx var15 = this.field_103999_d.field_105120_g.func_103819_bZ();
         var16 = var15.func_111578_a();
         var17 = var15.func_111580_b();
         this.field_103999_d.field_105105_I.func_108901_a("bossHealth");
         this.func_103987_d();
         this.field_103999_d.field_105105_I.func_108900_b();
         int var18;
         if(this.field_103999_d.field_105123_b.func_111066_b()) {
            var18 = var6 / 2 - 91;
            var19 = var6 / 2 + 91;
            this.field_103999_d.field_105105_I.func_108901_a("expBar");
            var20 = this.field_103999_d.field_105120_g.func_103816_bY();
            if(var20 > 0) {
               short var21 = 182;
               var22 = (int)(this.field_103999_d.field_105120_g.field_103864_ci * (float)(var21 + 1));
               var23 = var7 - 32 + 3;
               this.func_103877_b(var18, var23, 0, 64, var21, 5);
               if(var22 > 0) {
                  this.func_103877_b(var18, var23, 0, 69, var22, 5);
               }
            }

            var47 = var7 - 39;
            var22 = var47 - 10;
            var23 = this.field_103999_d.field_105120_g.func_103350_aU();
            var24 = -1;
            if(this.field_103999_d.field_105120_g.func_103300_a(C_100690_kw.field_109172_l)) {
               var24 = this.field_103997_f % 25;
            }

            this.field_103999_d.field_105105_I.func_108899_c("healthArmor");

            int var25;
            int var26;
            int var29;
            int var28;
            for(var25 = 0; var25 < 10; ++var25) {
               if(var23 > 0) {
                  var26 = var18 + var25 * 8;
                  if(var25 * 2 + 1 < var23) {
                     this.func_103877_b(var26, var22, 34, 9, 9, 9);
                  }

                  if(var25 * 2 + 1 == var23) {
                     this.func_103877_b(var26, var22, 25, 9, 9, 9);
                  }

                  if(var25 * 2 + 1 > var23) {
                     this.func_103877_b(var26, var22, 16, 9, 9, 9);
                  }
               }

               var26 = 16;
               if(this.field_103999_d.field_105120_g.func_103300_a(C_100690_kw.field_109180_u)) {
                  var26 += 36;
               } else if(this.field_103999_d.field_105120_g.func_103300_a(C_100690_kw.field_109179_v)) {
                  var26 += 72;
               }

               byte var27 = 0;
               if(var11) {
                  var27 = 1;
               }

               var28 = var18 + var25 * 8;
               var29 = var47;
               if(var12 <= 4) {
                  var29 = var47 + this.field_104002_c.nextInt(2);
               }

               if(var25 == var24) {
                  var29 -= 2;
               }

               byte var30 = 0;
               if(this.field_103999_d.field_105122_e.func_109429_J().func_107145_t()) {
                  var30 = 5;
               }

               this.func_103877_b(var28, var29, 16 + var27 * 9, 9 * var30, 9, 9);
               if(var11) {
                  if(var25 * 2 + 1 < var13) {
                     this.func_103877_b(var28, var29, var26 + 54, 9 * var30, 9, 9);
                  }

                  if(var25 * 2 + 1 == var13) {
                     this.func_103877_b(var28, var29, var26 + 63, 9 * var30, 9, 9);
                  }
               }

               if(var25 * 2 + 1 < var12) {
                  this.func_103877_b(var28, var29, var26 + 36, 9 * var30, 9, 9);
               }

               if(var25 * 2 + 1 == var12) {
                  this.func_103877_b(var28, var29, var26 + 45, 9 * var30, 9, 9);
               }
            }

            this.field_103999_d.field_105105_I.func_108899_c("food");

            int var51;
            for(var25 = 0; var25 < 10; ++var25) {
               var26 = var47;
               var51 = 16;
               byte var52 = 0;
               if(this.field_103999_d.field_105120_g.func_103300_a(C_100690_kw.field_109182_s)) {
                  var51 += 36;
                  var52 = 13;
               }

               if(this.field_103999_d.field_105120_g.func_103819_bZ().func_111577_e() <= 0.0F && this.field_103997_f % (var16 * 3 + 1) == 0) {
                  var26 = var47 + (this.field_104002_c.nextInt(3) - 1);
               }

               if(var14) {
                  var52 = 1;
               }

               var29 = var19 - var25 * 8 - 9;
               this.func_103877_b(var29, var26, 16 + var52 * 9, 27, 9, 9);
               if(var14) {
                  if(var25 * 2 + 1 < var17) {
                     this.func_103877_b(var29, var26, var51 + 54, 27, 9, 9);
                  }

                  if(var25 * 2 + 1 == var17) {
                     this.func_103877_b(var29, var26, var51 + 63, 27, 9, 9);
                  }
               }

               if(var25 * 2 + 1 < var16) {
                  this.func_103877_b(var29, var26, var51 + 36, 27, 9, 9);
               }

               if(var25 * 2 + 1 == var16) {
                  this.func_103877_b(var29, var26, var51 + 45, 27, 9, 9);
               }
            }

            this.field_103999_d.field_105105_I.func_108899_c("air");
            if(this.field_103999_d.field_105120_g.func_103132_a(C_100664_afg.field_109019_h)) {
               var25 = this.field_103999_d.field_105120_g.func_103081_al();
               var26 = C_100650_jv.func_108934_f((double)(var25 - 2) * 10.0D / 300.0D);
               var51 = C_100650_jv.func_108934_f((double)var25 * 10.0D / 300.0D) - var26;

               for(var28 = 0; var28 < var26 + var51; ++var28) {
                  if(var28 < var26) {
                     this.func_103877_b(var19 - var28 * 8 - 9, var22, 16, 18, 9, 9);
                  } else {
                     this.func_103877_b(var19 - var28 * 8 - 9, var22, 25, 18, 9, 9);
                  }
               }
            }

            this.field_103999_d.field_105105_I.func_108900_b();
         }

         GL11.glDisable(3042);
         this.field_103999_d.field_105105_I.func_108901_a("actionBar");
         GL11.glEnable('\u803a');
         C_101210_aqj.func_112012_c();

         for(var18 = 0; var18 < 9; ++var18) {
            var19 = var6 / 2 - 90 + var18 * 20 + 2;
            var20 = var7 - 16 - 3;
            this.func_103992_a(var18, var19, var20, var1);
         }

         C_101210_aqj.func_112010_a();
         GL11.glDisable('\u803a');
         this.field_103999_d.field_105105_I.func_108900_b();
      }

      float var33;
      if(this.field_103999_d.field_105120_g.func_103787_bV() > 0) {
         this.field_103999_d.field_105105_I.func_108901_a("sleep");
         GL11.glDisable(2929);
         GL11.glDisable(3008);
         int var32 = this.field_103999_d.field_105120_g.func_103787_bV();
         var33 = (float)var32 / 100.0F;
         if(var33 > 1.0F) {
            var33 = 1.0F - (float)(var32 - 100) / 10.0F;
         }

         var12 = (int)(220.0F * var33) << 24 | 1052704;
         func_103882_a(0, 0, var6, var7, var12);
         GL11.glEnable(3008);
         GL11.glEnable(2929);
         this.field_103999_d.field_105105_I.func_108900_b();
      }

      int var38;
      int var40;
      if(this.field_103999_d.field_105123_b.func_111077_f() && this.field_103999_d.field_105120_g.field_103866_cg > 0) {
         this.field_103999_d.field_105105_I.func_108901_a("expLevel");
         var11 = false;
         var12 = var11?16777215:8453920;
         String var35 = "" + this.field_103999_d.field_105120_g.field_103866_cg;
         var40 = (var6 - var8.func_111778_a(var35)) / 2;
         var38 = var7 - 31 - 4;
         var8.func_111798_b(var35, var40 + 1, var38, 0);
         var8.func_111798_b(var35, var40 - 1, var38, 0);
         var8.func_111798_b(var35, var40, var38 + 1, 0);
         var8.func_111798_b(var35, var40, var38 - 1, 0);
         var8.func_111798_b(var35, var40, var38, var12);
         this.field_103999_d.field_105105_I.func_108900_b();
      }

      if(this.field_103999_d.func_105034_q()) {
         this.field_103999_d.field_105105_I.func_108901_a("demo");
         String var36 = "";
         if(this.field_103999_d.field_105122_e.func_109463_E() >= 120500L) {
            var36 = C_100359_bd.func_107638_a("demo.demoExpired");
         } else {
            var36 = String.format(C_100359_bd.func_107638_a("demo.remainingTime"), new Object[]{C_100679_kd.func_109121_a((int)(120500L - this.field_103999_d.field_105122_e.func_109463_E()))});
         }

         var12 = var8.func_111778_a(var36);
         var8.func_111783_a(var36, var6 - var12 - 10, 5, 16777215);
         this.field_103999_d.field_105105_I.func_108900_b();
      }

      if(this.field_103999_d.field_105156_y.field_111705_T) {
         this.field_103999_d.field_105105_I.func_108901_a("debug");
         GL11.glPushMatrix();
         var8.func_111783_a("Minecraft 1.4.2 (" + this.field_103999_d.field_105107_K + ")", 2, 2, 16777215);
         var8.func_111783_a(this.field_103999_d.func_105072_m(), 2, 12, 16777215);
         var8.func_111783_a(this.field_103999_d.func_105088_n(), 2, 22, 16777215);
         var8.func_111783_a(this.field_103999_d.func_105051_p(), 2, 32, 16777215);
         var8.func_111783_a(this.field_103999_d.func_105066_o(), 2, 42, 16777215);
         long var41 = Runtime.getRuntime().maxMemory();
         long var34 = Runtime.getRuntime().totalMemory();
         long var42 = Runtime.getRuntime().freeMemory();
         long var43 = var34 - var42;
         String var45 = "Used memory: " + var43 * 100L / var41 + "% (" + var43 / 1024L / 1024L + "MB) of " + var41 / 1024L / 1024L + "MB";
         this.func_103880_b(var8, var45, var6 - var8.func_111778_a(var45) - 2, 2, 14737632);
         var45 = "Allocated memory: " + var34 * 100L / var41 + "% (" + var34 / 1024L / 1024L + "MB)";
         this.func_103880_b(var8, var45, var6 - var8.func_111778_a(var45) - 2, 12, 14737632);
         var47 = C_100650_jv.func_108910_c(this.field_103999_d.field_105120_g.field_103221_t);
         var22 = C_100650_jv.func_108910_c(this.field_103999_d.field_105120_g.field_103219_u);
         var23 = C_100650_jv.func_108910_c(this.field_103999_d.field_105120_g.field_103217_v);
         this.func_103880_b(var8, String.format("x: %.5f (%d) // c: %d (%d)", new Object[]{Double.valueOf(this.field_103999_d.field_105120_g.field_103221_t), Integer.valueOf(var47), Integer.valueOf(var47 >> 4), Integer.valueOf(var47 & 15)}), 2, 64, 14737632);
         this.func_103880_b(var8, String.format("y: %.3f (feet pos, %.3f eyes pos)", new Object[]{Double.valueOf(this.field_103999_d.field_105120_g.field_103173_D.field_107915_b), Double.valueOf(this.field_103999_d.field_105120_g.field_103219_u)}), 2, 72, 14737632);
         this.func_103880_b(var8, String.format("z: %.5f (%d) // c: %d (%d)", new Object[]{Double.valueOf(this.field_103999_d.field_105120_g.field_103217_v), Integer.valueOf(var23), Integer.valueOf(var23 >> 4), Integer.valueOf(var23 & 15)}), 2, 80, 14737632);
         var24 = C_100650_jv.func_108910_c((double)(this.field_103999_d.field_105120_g.field_103236_z * 4.0F / 360.0F) + 0.5D) & 3;
         this.func_103880_b(var8, "f: " + var24 + " (" + C_100015_i.field_105282_c[var24] + ") / " + C_100650_jv.func_108920_g(this.field_103999_d.field_105120_g.field_103236_z), 2, 88, 14737632);
         if(this.field_103999_d.field_105122_e != null && this.field_103999_d.field_105122_e.func_109461_e(var47, var22, var23)) {
            C_101272_za var53 = this.field_103999_d.field_105122_e.func_109377_d(var47, var23);
            this.func_103880_b(var8, "lc: " + (var53.func_112324_h() + 15) + " b: " + var53.func_112330_a(var47 & 15, var23 & 15, this.field_103999_d.field_105122_e.func_109465_s()).field_112513_y + " bl: " + var53.func_112295_a(C_100847_xq.field_110166_b, var47 & 15, var22, var23 & 15) + " sl: " + var53.func_112295_a(C_100847_xq.field_110168_a, var47 & 15, var22, var23 & 15) + " rl: " + var53.func_112328_c(var47 & 15, var22, var23 & 15, 0), 2, 96, 14737632);
         }

         this.func_103880_b(var8, String.format("ws: %.3f, fs: %.3f, g: %b, fl: %d", new Object[]{Float.valueOf(this.field_103999_d.field_105120_g.field_103869_cf.func_111592_b()), Float.valueOf(this.field_103999_d.field_105120_g.field_103869_cf.func_111591_a()), Boolean.valueOf(this.field_103999_d.field_105120_g.field_103174_E), Integer.valueOf(this.field_103999_d.field_105122_e.func_109538_f(var47, var23))}), 2, 104, 14737632);
         GL11.glPopMatrix();
         this.field_103999_d.field_105105_I.func_108900_b();
      }

      if(this.field_104004_h > 0) {
         this.field_103999_d.field_105105_I.func_108901_a("overlayMessage");
         var33 = (float)this.field_104004_h - var1;
         var12 = (int)(var33 * 256.0F / 20.0F);
         if(var12 > 255) {
            var12 = 255;
         }

         if(var12 > 0) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(var6 / 2), (float)(var7 - 48), 0.0F);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            var13 = 16777215;
            if(this.field_104005_i) {
               var13 = Color.HSBtoRGB(var33 / 50.0F, 0.7F, 0.6F) & 16777215;
            }

            var8.func_111798_b(this.field_103998_g, -var8.func_111778_a(this.field_103998_g) / 2, -4, var13 + (var12 << 24));
            GL11.glDisable(3042);
            GL11.glPopMatrix();
         }

         this.field_103999_d.field_105105_I.func_108900_b();
      }

      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3008);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, (float)(var7 - 48), 0.0F);
      this.field_103999_d.field_105105_I.func_108901_a("chat");
      this.field_104000_e.func_103890_a(this.field_103997_f);
      this.field_103999_d.field_105105_I.func_108900_b();
      GL11.glPopMatrix();
      if(this.field_103999_d.field_105156_y.field_111696_L.field_111990_e && (!this.field_103999_d.func_105064_A() || this.field_103999_d.field_105120_g.field_104564_a.field_107048_c.size() > 1)) {
         this.field_103999_d.field_105105_I.func_108901_a("playerList");
         C_101250_awr var37 = this.field_103999_d.field_105120_g.field_104564_a;
         List var39 = var37.field_107048_c;
         var13 = var37.field_107045_d;
         var40 = var13;

         for(var38 = 1; var40 > 20; var40 = (var13 + var38 - 1) / var38) {
            ++var38;
         }

         var16 = 300 / var38;
         if(var16 > 150) {
            var16 = 150;
         }

         var17 = (var6 - var38 * var16) / 2;
         byte var44 = 10;
         func_103882_a(var17 - 1, var44 - 1, var17 + var16 * var38, var44 + 9 * var40, Integer.MIN_VALUE);

         for(var19 = 0; var19 < var13; ++var19) {
            var20 = var17 + var19 % var38 * var16;
            var47 = var44 + var19 / var38 * 9;
            func_103882_a(var20, var47, var20 + var16 - 1, var47 + 8, 553648127);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(3008);
            if(var19 < var39.size()) {
               C_100951_axd var46 = (C_100951_axd)var39.get(var19);
               var8.func_111783_a(var46.field_111139_a, var20, var47, 16777215);
               this.field_103999_d.field_105127_o.func_110368_b(this.field_103999_d.field_105127_o.func_110367_b("/gui/icons.png"));
               byte var50 = 0;
               boolean var48 = false;
               byte var49;
               if(var46.field_111137_b < 0) {
                  var49 = 5;
               } else if(var46.field_111137_b < 150) {
                  var49 = 0;
               } else if(var46.field_111137_b < 300) {
                  var49 = 1;
               } else if(var46.field_111137_b < 600) {
                  var49 = 2;
               } else if(var46.field_111137_b < 1000) {
                  var49 = 3;
               } else {
                  var49 = 4;
               }

               this.field_103883_j += 100.0F;
               this.func_103877_b(var20 + var16 - 12, var47, 0 + var50 * 10, 176 + var49 * 8, 10, 8);
               this.field_103883_j -= 100.0F;
            }
         }
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2896);
      GL11.glEnable(3008);
   }

   private void func_103987_d() {
      if(C_100962_ayo.field_111156_c != null && C_100962_ayo.field_111155_b > 0) {
         --C_100962_ayo.field_111155_b;
         C_101153_asb var1 = this.field_103999_d.field_105148_p;
         C_101277_asx var2 = new C_101277_asx(this.field_103999_d.field_105156_y, this.field_103999_d.field_105124_c, this.field_103999_d.field_105121_d);
         int var3 = var2.func_112363_a();
         short var4 = 182;
         int var5 = var3 / 2 - var4 / 2;
         int var6 = (int)(C_100962_ayo.field_111157_a * (float)(var4 + 1));
         byte var7 = 12;
         this.func_103877_b(var5, var7, 0, 74, var4, 5);
         this.func_103877_b(var5, var7, 0, 74, var4, 5);
         if(var6 > 0) {
            this.func_103877_b(var5, var7, 0, 79, var6, 5);
         }

         String var8 = C_100962_ayo.field_111156_c;
         var1.func_111783_a(var8, var3 / 2 - var1.func_111778_a(var8) / 2, var7 - 10, 16777215);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glBindTexture(3553, this.field_103999_d.field_105127_o.func_110367_b("/gui/icons.png"));
      }
   }

   private void func_103996_a(int var1, int var2) {
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3008);
      GL11.glBindTexture(3553, this.field_103999_d.field_105127_o.func_110367_b("%blur%/misc/pumpkinblur.png"));
      C_100872_azb var3 = C_100872_azb.field_110346_a;
      var3.func_110330_b();
      var3.func_110322_a(0.0D, (double)var2, -90.0D, 0.0D, 1.0D);
      var3.func_110322_a((double)var1, (double)var2, -90.0D, 1.0D, 1.0D);
      var3.func_110322_a((double)var1, 0.0D, -90.0D, 1.0D, 0.0D);
      var3.func_110322_a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
      var3.func_110329_a();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glEnable(3008);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void func_103988_a(float var1, int var2, int var3) {
      var1 = 1.0F - var1;
      if(var1 < 0.0F) {
         var1 = 0.0F;
      }

      if(var1 > 1.0F) {
         var1 = 1.0F;
      }

      this.field_104003_a = (float)((double)this.field_104003_a + (double)(var1 - this.field_104003_a) * 0.01D);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(0, 769);
      GL11.glColor4f(this.field_104003_a, this.field_104003_a, this.field_104003_a, 1.0F);
      GL11.glBindTexture(3553, this.field_103999_d.field_105127_o.func_110367_b("%blur%/misc/vignette.png"));
      C_100872_azb var4 = C_100872_azb.field_110346_a;
      var4.func_110330_b();
      var4.func_110322_a(0.0D, (double)var3, -90.0D, 0.0D, 1.0D);
      var4.func_110322_a((double)var2, (double)var3, -90.0D, 1.0D, 1.0D);
      var4.func_110322_a((double)var2, 0.0D, -90.0D, 1.0D, 0.0D);
      var4.func_110322_a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
      var4.func_110329_a();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBlendFunc(770, 771);
   }

   private void func_103995_b(float var1, int var2, int var3) {
      if(var1 < 1.0F) {
         var1 *= var1;
         var1 *= var1;
         var1 = var1 * 0.8F + 0.2F;
      }

      GL11.glDisable(3008);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(770, 771);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, var1);
      GL11.glBindTexture(3553, this.field_103999_d.field_105127_o.func_110367_b("/terrain.png"));
      float var4 = (float)(C_100451_alf.field_106143_bh.field_106165_cl % 16) / 16.0F;
      float var5 = (float)(C_100451_alf.field_106143_bh.field_106165_cl / 16) / 16.0F;
      float var6 = (float)(C_100451_alf.field_106143_bh.field_106165_cl % 16 + 1) / 16.0F;
      float var7 = (float)(C_100451_alf.field_106143_bh.field_106165_cl / 16 + 1) / 16.0F;
      C_100872_azb var8 = C_100872_azb.field_110346_a;
      var8.func_110330_b();
      var8.func_110322_a(0.0D, (double)var3, -90.0D, (double)var4, (double)var7);
      var8.func_110322_a((double)var2, (double)var3, -90.0D, (double)var6, (double)var7);
      var8.func_110322_a((double)var2, 0.0D, -90.0D, (double)var6, (double)var5);
      var8.func_110322_a(0.0D, 0.0D, -90.0D, (double)var4, (double)var5);
      var8.func_110329_a();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glEnable(3008);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void func_103992_a(int var1, int var2, int var3, float var4) {
      C_100994_tv var5 = this.field_103999_d.field_105120_g.field_103857_bK.field_104832_a[var1];
      if(var5 != null) {
         float var6 = (float)var5.field_111396_b - var4;
         if(var6 > 0.0F) {
            GL11.glPushMatrix();
            float var7 = 1.0F + var6 / 5.0F;
            GL11.glTranslatef((float)(var2 + 8), (float)(var3 + 12), 0.0F);
            GL11.glScalef(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
            GL11.glTranslatef((float)(-(var2 + 8)), (float)(-(var3 + 12)), 0.0F);
         }

         field_104001_b.func_105501_b(this.field_103999_d.field_105148_p, this.field_103999_d.field_105127_o, var5, var2, var3);
         if(var6 > 0.0F) {
            GL11.glPopMatrix();
         }

         field_104001_b.func_105496_c(this.field_103999_d.field_105148_p, this.field_103999_d.field_105127_o, var5, var2, var3);
      }
   }

   public void func_103990_a() {
      if(this.field_104004_h > 0) {
         --this.field_104004_h;
      }

      ++this.field_103997_f;
   }

   public void func_103993_a(String var1) {
      this.field_103998_g = "Now playing: " + var1;
      this.field_104004_h = 60;
      this.field_104005_i = true;
   }

   public C_101132_arm func_103991_b() {
      return this.field_104000_e;
   }

   public int func_103994_c() {
      return this.field_103997_f;
   }

}
