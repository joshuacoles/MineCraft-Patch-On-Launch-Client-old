package net.minecraft.client;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import javax.swing.JPanel;
import net.minecraft.client.C_101444_ClientBrandRetriever;
import net.minecraft.client.MinecraftApplet;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public abstract class Minecraft implements Runnable, C_100712_kr {

   public static byte[] field_105125_a = new byte[10485760];
   private C_100909_axg field_105103_O;
   private static Minecraft field_105113_P;
   public C_100940_awy field_105123_b;
   private boolean field_105112_Q = false;
   private boolean field_105115_R = false;
   private C_100007_a field_105114_S;
   public int field_105124_c;
   public int field_105121_d;
   private C_101135_arj field_105109_T = new C_101135_arj(20.0F);
   private C_100708_kp field_105108_U = new C_100708_kp("client", this);
   public C_100942_awz field_105122_e;
   public C_100861_ayy field_105119_f;
   public C_100950_axc field_105120_g;
   public C_100595_ln field_105132_h;
   public C_100990_axx field_105133_i;
   public C_101134_ark field_105130_j = null;
   public String field_105131_k;
   public Canvas field_105128_l;
   public boolean field_105129_m = false;
   public volatile boolean field_105126_n = false;
   public C_100874_azc field_105127_o;
   public C_101153_asb field_105148_p;
   public C_101153_asb field_105146_q;
   public C_101278_asw field_105144_r = null;
   public C_101122_arg field_105143_s;
   public C_100983_ayt field_105141_t;
   private C_101202_aqa field_105111_V;
   private int field_105110_W = 0;
   private int field_105117_X;
   private int field_105116_Y;
   private C_100094_bcb field_105118_Z;
   public C_101308_ath field_105139_u = new C_101308_ath(this);
   public C_101152_asc field_105137_v;
   public boolean field_105135_w = false;
   public C_100383_amu field_105158_x = null;
   public C_101125_ard field_105156_y;
   protected MinecraftApplet field_105155_z;
   public C_100105_bcx field_105097_A = new C_100105_bcx();
   public C_101127_arb field_105098_B;
   public C_100088_bcp field_105099_C;
   public File field_105093_D;
   private C_100270_agy field_105151_aa;
   private static int field_105152_ab;
   private int field_105149_ac = 0;
   private boolean field_105150_ad;
   public C_100100_bda field_105094_E;
   private String field_105157_ae;
   private int field_105159_af;
   private C_100030_bbo field_105153_ag = new C_100030_bbo();
   private C_100027_bbl field_105154_ah = new C_100027_bbl();
   boolean field_105095_F = false;
   public boolean field_105096_G = false;
   long field_105104_H = func_105063_F();
   private int field_105138_ai = 0;
   private boolean field_105140_aj;
   private C_100323_bv field_105134_ak;
   private boolean field_105136_al;
   public final C_100649_jy field_105105_I = new C_100649_jy();
   private long field_105145_am = -1L;
   private static File field_105147_an = null;
   public volatile boolean field_105106_J = true;
   public String field_105107_K = "";
   long field_105100_L = func_105063_F();
   int field_105101_M = 0;
   long field_105102_N = -1L;
   private String field_105142_ao = "root";


   public Minecraft(Canvas var1, MinecraftApplet var2, int var3, int var4, boolean var5) {
      C_100818_jh.func_110007_a();
      this.field_105116_Y = var4;
      this.field_105112_Q = var5;
      this.field_105155_z = var2;
      C_100392_cm.field_106837_a = 32767;
      this.func_105067_H();
      this.field_105128_l = var1;
      this.field_105124_c = var3;
      this.field_105121_d = var4;
      this.field_105112_Q = var5;
      field_105113_P = this;
   }

   private void func_105067_H() {
      C_101212_aql var1 = new C_101212_aql(this, "Timer hack thread");
      var1.setDaemon(true);
      var1.start();
   }

   public void func_105082_a(C_100007_a var1) {
      this.field_105115_R = true;
      this.field_105114_S = var1;
   }

   public void func_105085_c(C_100007_a var1) {
      this.field_105115_R = true;
      this.func_105062_d(var1);
   }

   public abstract void func_105062_d(C_100007_a var1);

   public void func_105045_a(String var1, int var2) {
      this.field_105157_ae = var1;
      this.field_105159_af = var2;
   }

   public void func_105060_a() {
      if(this.field_105128_l != null) {
         Graphics var1 = this.field_105128_l.getGraphics();
         if(var1 != null) {
            var1.setColor(Color.BLACK);
            var1.fillRect(0, 0, this.field_105124_c, this.field_105121_d);
            var1.dispose();
         }

         Display.setParent(this.field_105128_l);
      } else if(this.field_105112_Q) {
         Display.setFullscreen(true);
         this.field_105124_c = Display.getDisplayMode().getWidth();
         this.field_105121_d = Display.getDisplayMode().getHeight();
         if(this.field_105124_c <= 0) {
            this.field_105124_c = 1;
         }

         if(this.field_105121_d <= 0) {
            this.field_105121_d = 1;
         }
      } else {
         Display.setDisplayMode(new DisplayMode(this.field_105124_c, this.field_105121_d));
      }

      Display.setTitle("Minecraft Minecraft 1.4.2");
      System.out.println("LWJGL Version: " + Sys.getVersion());

      try {
         Display.create((new PixelFormat()).withDepthBits(24));
      } catch (LWJGLException var5) {
         var5.printStackTrace();

         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var4) {
            ;
         }

         Display.create();
      }

      C_100082_bdf.func_105621_a();
      this.field_105093_D = func_105056_b();
      this.field_105151_aa = new C_100308_agq(new File(this.field_105093_D, "saves"));
      this.field_105156_y = new C_101125_ard(this, this.field_105093_D);
      this.field_105099_C = new C_100088_bcp(this.field_105093_D, this);
      this.field_105127_o = new C_100874_azc(this.field_105099_C, this.field_105156_y);
      this.func_105036_I();
      this.field_105148_p = new C_101153_asb(this.field_105156_y, "/font/default.png", this.field_105127_o, false);
      this.field_105146_q = new C_101153_asb(this.field_105156_y, "/font/alternate.png", this.field_105127_o, false);
      if(this.field_105156_y.field_111752_af != null) {
         C_100361_be.func_107654_a().func_107656_a(this.field_105156_y.field_111752_af);
         this.field_105148_p.func_111786_a(C_100361_be.func_107654_a().func_107650_d());
         this.field_105148_p.func_111797_b(C_100361_be.func_107648_e(this.field_105156_y.field_111752_af));
      }

      C_101327_xx.func_112594_a(this.field_105127_o.func_110372_a("/misc/watercolor.png"));
      C_100875_xd.func_110397_a(this.field_105127_o.func_110372_a("/misc/grasscolor.png"));
      C_100866_xa.func_110294_a(this.field_105127_o.func_110372_a("/misc/foliagecolor.png"));
      this.field_105141_t = new C_100983_ayt(this);
      C_100848_azw.field_110183_a.field_110177_f = new C_100860_ayx(this);
      this.field_105094_E = new C_100100_bda(this.field_105130_j, this.field_105093_D);
      C_100822_iy.field_110057_f.func_109931_a(new C_101117_aqq(this));
      this.func_105036_I();
      Mouse.create();
      this.field_105098_B = new C_101127_arb(this.field_105128_l);
      this.func_105039_d("Pre startup");
      GL11.glEnable(3553);
      GL11.glShadeModel(7425);
      GL11.glClearDepth(1.0D);
      GL11.glEnable(2929);
      GL11.glDepthFunc(515);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      GL11.glCullFace(1029);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      this.func_105039_d("Startup");
      this.field_105097_A.func_105904_a(this.field_105156_y);
      this.field_105127_o.func_110375_a(this.field_105154_ah);
      this.field_105127_o.func_110375_a(this.field_105153_ag);
      this.field_105127_o.func_110375_a(new C_100028_bbm());
      this.field_105127_o.func_110375_a(new C_100031_bbh(this));
      this.field_105127_o.func_110375_a(new C_100038_bbg(this));
      this.field_105127_o.func_110375_a(new C_100029_bbn());
      this.field_105127_o.func_110375_a(new C_100034_bbk());
      this.field_105127_o.func_110375_a(new C_100033_bbj(0));
      this.field_105127_o.func_110375_a(new C_100033_bbj(1));
      this.field_105119_f = new C_100861_ayy(this, this.field_105127_o);
      GL11.glViewport(0, 0, this.field_105124_c, this.field_105121_d);
      this.field_105133_i = new C_100990_axx(this.field_105122_e, this.field_105127_o);

      try {
         this.field_105111_V = new C_101202_aqa(this.field_105093_D, this);
         this.field_105111_V.start();
      } catch (Exception var3) {
         ;
      }

      this.func_105039_d("Post startup");
      this.field_105137_v = new C_101152_asc(this);
      if(this.field_105157_ae != null) {
         this.func_105053_a(new C_101253_awu(this, this.field_105157_ae, this.field_105159_af));
      } else {
         this.func_105053_a(new C_100098_bcz());
      }

      this.field_105143_s = new C_101122_arg(this);
      if(this.field_105156_y.field_111735_u && !this.field_105112_Q) {
         this.func_105032_k();
      }

   }

   private void func_105036_I() {
      C_101277_asx var1 = new C_101277_asx(this.field_105156_y, this.field_105124_c, this.field_105121_d);
      GL11.glClear(16640);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, var1.func_112364_c(), var1.func_112361_d(), 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glViewport(0, 0, this.field_105124_c, this.field_105121_d);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glDisable(2896);
      GL11.glEnable(3553);
      GL11.glDisable(2912);
      C_100872_azb var2 = C_100872_azb.field_110346_a;
      GL11.glBindTexture(3553, this.field_105127_o.func_110367_b("/title/mojang.png"));
      var2.func_110330_b();
      var2.func_110326_d(16777215);
      var2.func_110322_a(0.0D, (double)this.field_105121_d, 0.0D, 0.0D, 0.0D);
      var2.func_110322_a((double)this.field_105124_c, (double)this.field_105121_d, 0.0D, 0.0D, 0.0D);
      var2.func_110322_a((double)this.field_105124_c, 0.0D, 0.0D, 0.0D, 0.0D);
      var2.func_110322_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
      var2.func_110329_a();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var2.func_110326_d(16777215);
      short var3 = 256;
      short var4 = 256;
      this.func_105071_a((var1.func_112363_a() - var3) / 2, (var1.func_112365_b() - var4) / 2, 0, 0, var3, var4);
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      Display.swapBuffers();
   }

   public void func_105071_a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      C_100872_azb var9 = C_100872_azb.field_110346_a;
      var9.func_110330_b();
      var9.func_110322_a((double)(var1 + 0), (double)(var2 + var6), 0.0D, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.func_110322_a((double)(var1 + var5), (double)(var2 + var6), 0.0D, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.func_110322_a((double)(var1 + var5), (double)(var2 + 0), 0.0D, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.func_110322_a((double)(var1 + 0), (double)(var2 + 0), 0.0D, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.func_110329_a();
   }

   public static File func_105056_b() {
      if(field_105147_an == null) {
         field_105147_an = func_105074_a("minecraft");
      }

      return field_105147_an;
   }

   public static File func_105074_a(String var0) {
      String var1 = System.getProperty("user.home", ".");
      File var2;
      switch(C_101213_aqo.field_112020_a[func_105065_c().ordinal()]) {
      case 1:
      case 2:
         var2 = new File(var1, '.' + var0 + '/');
         break;
      case 3:
         String var3 = System.getenv("APPDATA");
         if(var3 != null) {
            var2 = new File(var3, "." + var0 + '/');
         } else {
            var2 = new File(var1, '.' + var0 + '/');
         }
         break;
      case 4:
         var2 = new File(var1, "Library/Application Support/" + var0);
         break;
      default:
         var2 = new File(var1, var0 + '/');
      }

      if(!var2.exists() && !var2.mkdirs()) {
         throw new RuntimeException("The working directory could not be created: " + var2);
      } else {
         return var2;
      }
   }

   public static C_101120_aqy func_105065_c() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.contains("win")?C_101120_aqy.field_111627_c:(var0.contains("mac")?C_101120_aqy.field_111624_d:(var0.contains("solaris")?C_101120_aqy.field_111626_b:(var0.contains("sunos")?C_101120_aqy.field_111626_b:(var0.contains("linux")?C_101120_aqy.field_111628_a:(var0.contains("unix")?C_101120_aqy.field_111628_a:C_101120_aqy.field_111625_e)))));
   }

   public C_100270_agy func_105080_d() {
      return this.field_105151_aa;
   }

   public void func_105053_a(C_101278_asw var1) {
      if(!(this.field_105144_r instanceof C_101145_asa)) {
         if(this.field_105144_r != null) {
            this.field_105144_r.func_104038_b();
         }

         this.field_105094_E.func_105804_d();
         if(var1 == null && this.field_105122_e == null) {
            var1 = new C_100098_bcz();
         } else if(var1 == null && this.field_105120_g.func_103330_aT() <= 0) {
            var1 = new C_101138_arv();
         }

         if(var1 instanceof C_100098_bcz) {
            this.field_105156_y.field_111705_T = false;
            this.field_105137_v.func_103991_b().func_103889_a();
         }

         this.field_105144_r = (C_101278_asw)var1;
         if(var1 != null) {
            this.func_105041_i();
            C_101277_asx var2 = new C_101277_asx(this.field_105156_y, this.field_105124_c, this.field_105121_d);
            int var3 = var2.func_112363_a();
            int var4 = var2.func_112365_b();
            ((C_101278_asw)var1).func_104036_a(this, var3, var4);
            this.field_105135_w = false;
         } else {
            this.func_105057_h();
         }

      }
   }

   private void func_105039_d(String var1) {
      int var2 = GL11.glGetError();
      if(var2 != 0) {
         String var3 = GLU.gluErrorString(var2);
         System.out.println("########## GL ERROR ##########");
         System.out.println("@ " + var1);
         System.out.println(var2 + ": " + var3);
      }

   }

   public void func_105084_e() {
      try {
         this.field_105094_E.func_105804_d();

         try {
            if(this.field_105111_V != null) {
               this.field_105111_V.func_111960_b();
            }
         } catch (Exception var9) {
            ;
         }

         System.out.println("Stopping!");

         try {
            this.func_105083_a((C_100942_awz)null);
         } catch (Throwable var8) {
            ;
         }

         try {
            C_101209_aqk.func_112002_a();
         } catch (Throwable var7) {
            ;
         }

         this.field_105097_A.func_105913_b();
         Mouse.destroy();
         Keyboard.destroy();
      } finally {
         Display.destroy();
         if(!this.field_105115_R) {
            System.exit(0);
         }

      }

      System.gc();
   }

   public void run() {
      this.field_105106_J = true;

      try {
         this.func_105060_a();
      } catch (Exception var11) {
         var11.printStackTrace();
         this.func_105085_c(this.func_105090_b(new C_100007_a("Failed to start game", var11)));
         return;
      }

      while(true) {
         try {
            if(this.field_105106_J) {
               if(this.field_105115_R && this.field_105114_S != null) {
                  this.func_105085_c(this.field_105114_S);
                  return;
               }

               if(this.field_105150_ad) {
                  this.field_105150_ad = false;
                  this.field_105127_o.func_110380_b();
               }

               try {
                  this.func_105092_J();
               } catch (OutOfMemoryError var10) {
                  this.func_105077_f();
                  this.func_105053_a(new C_101159_asp());
                  System.gc();
               }
               continue;
            }
         } catch (C_101136_ari var12) {
            ;
         } catch (C_100010_l var13) {
            this.func_105090_b(var13.func_105255_a());
            this.func_105077_f();
            var13.printStackTrace();
            this.func_105085_c(var13.func_105255_a());
         } catch (Throwable var14) {
            C_100007_a var2 = this.func_105090_b(new C_100007_a("Unexpected error", var14));
            this.func_105077_f();
            var14.printStackTrace();
            this.func_105085_c(var2);
         } finally {
            this.func_105084_e();
         }

         return;
      }
   }

   private void func_105092_J() {
      if(this.field_105155_z != null && !this.field_105155_z.isActive()) {
         this.field_105106_J = false;
      } else {
         C_100412_amr.func_107892_a().func_107842_a();
         if(this.field_105122_e != null) {
            this.field_105122_e.func_109363_R().func_107881_a();
         }

         this.field_105105_I.func_108901_a("root");
         if(this.field_105128_l == null && Display.isCloseRequested()) {
            this.func_105079_g();
         }

         if(this.field_105126_n && this.field_105122_e != null) {
            float var1 = this.field_105109_T.field_111770_c;
            this.field_105109_T.func_111764_a();
            this.field_105109_T.field_111770_c = var1;
         } else {
            this.field_105109_T.func_111764_a();
         }

         long var6 = System.nanoTime();
         this.field_105105_I.func_108901_a("tick");

         for(int var3 = 0; var3 < this.field_105109_T.field_111769_b; ++var3) {
            this.func_105086_l();
         }

         this.field_105105_I.func_108899_c("preRenderErrors");
         long var7 = System.nanoTime() - var6;
         this.func_105039_d("Pre render");
         C_100876_azd.field_110520_b = this.field_105156_y.field_111726_j;
         this.field_105105_I.func_108899_c("sound");
         this.field_105097_A.func_105900_a(this.field_105120_g, this.field_105109_T.field_111770_c);
         this.field_105105_I.func_108900_b();
         this.field_105105_I.func_108901_a("render");
         this.field_105105_I.func_108901_a("display");
         GL11.glEnable(3553);
         if(!Keyboard.isKeyDown(65)) {
            Display.update();
         }

         if(this.field_105120_g != null && this.field_105120_g.func_103150_T()) {
            this.field_105156_y.field_111710_S = 0;
         }

         this.field_105105_I.func_108900_b();
         if(!this.field_105135_w) {
            this.field_105105_I.func_108899_c("gameRenderer");
            this.field_105141_t.func_111243_b(this.field_105109_T.field_111770_c);
            this.field_105105_I.func_108900_b();
         }

         GL11.glFlush();
         this.field_105105_I.func_108900_b();
         if(!Display.isActive() && this.field_105112_Q) {
            this.func_105032_k();
         }

         if(this.field_105156_y.field_111705_T && this.field_105156_y.field_111704_U) {
            if(!this.field_105105_I.field_108908_a) {
               this.field_105105_I.func_108898_a();
            }

            this.field_105105_I.field_108908_a = true;
            this.func_105044_a(var7);
         } else {
            this.field_105105_I.field_108908_a = false;
            this.field_105102_N = System.nanoTime();
         }

         this.field_105139_u.func_104007_a();
         this.field_105105_I.func_108901_a("root");
         Thread.yield();
         if(Keyboard.isKeyDown(65)) {
            Display.update();
         }

         this.func_105042_K();
         if(this.field_105128_l != null && !this.field_105112_Q && (this.field_105128_l.getWidth() != this.field_105124_c || this.field_105128_l.getHeight() != this.field_105121_d)) {
            this.field_105124_c = this.field_105128_l.getWidth();
            this.field_105121_d = this.field_105128_l.getHeight();
            if(this.field_105124_c <= 0) {
               this.field_105124_c = 1;
            }

            if(this.field_105121_d <= 0) {
               this.field_105121_d = 1;
            }

            this.func_105049_a(this.field_105124_c, this.field_105121_d);
         }

         this.func_105039_d("Post render");
         ++this.field_105101_M;
         boolean var5 = this.field_105126_n;
         this.field_105126_n = this.func_105035_B() && this.field_105144_r != null && this.field_105144_r.func_104031_f() && !this.field_105118_Z.func_105007_al();
         if(this.func_105064_A() && this.field_105120_g != null && this.field_105120_g.field_104564_a != null && this.field_105126_n != var5) {
            ((C_100321_bw)this.field_105120_g.field_104564_a.func_107037_f()).func_107471_a(this.field_105126_n);
         }

         while(func_105063_F() >= this.field_105100_L + 1000L) {
            field_105152_ab = this.field_105101_M;
            this.field_105107_K = field_105152_ab + " fps, " + C_100975_ayp.field_111194_b + " chunk updates";
            C_100975_ayp.field_111194_b = 0;
            this.field_105100_L += 1000L;
            this.field_105101_M = 0;
            this.field_105108_U.func_109264_b();
            if(!this.field_105108_U.func_109261_d()) {
               this.field_105108_U.func_109255_a();
            }
         }

         this.field_105105_I.func_108900_b();
         if(this.field_105156_y.field_111729_i > 0) {
            C_100983_ayt var10000 = this.field_105141_t;
            Display.sync(C_100983_ayt.func_111226_a(this.field_105156_y.field_111729_i));
         }

      }
   }

   public void func_105077_f() {
      try {
         field_105125_a = new byte[0];
         this.field_105119_f.func_109724_f();
      } catch (Throwable var4) {
         ;
      }

      try {
         System.gc();
         C_100412_amr.func_107892_a().func_107843_b();
         this.field_105122_e.func_109363_R().func_107882_b();
      } catch (Throwable var3) {
         ;
      }

      try {
         System.gc();
         this.func_105083_a((C_100942_awz)null);
      } catch (Throwable var2) {
         ;
      }

      System.gc();
   }

   private void func_105042_K() {
      if(Keyboard.isKeyDown(60)) {
         if(!this.field_105095_F) {
            this.field_105095_F = true;
            this.field_105137_v.func_103991_b().func_103894_a(C_101121_arh.func_111631_a(field_105147_an, this.field_105124_c, this.field_105121_d));
         }
      } else {
         this.field_105095_F = false;
      }

   }

   private void func_105059_b(int var1) {
      List var2 = this.field_105105_I.func_108902_b(this.field_105142_ao);
      if(var2 != null && !var2.isEmpty()) {
         C_100688_jz var3 = (C_100688_jz)var2.remove(0);
         if(var1 == 0) {
            if(var3.field_109131_c.length() > 0) {
               int var4 = this.field_105142_ao.lastIndexOf(".");
               if(var4 >= 0) {
                  this.field_105142_ao = this.field_105142_ao.substring(0, var4);
               }
            }
         } else {
            --var1;
            if(var1 < var2.size() && !((C_100688_jz)var2.get(var1)).field_109131_c.equals("unspecified")) {
               if(this.field_105142_ao.length() > 0) {
                  this.field_105142_ao = this.field_105142_ao + ".";
               }

               this.field_105142_ao = this.field_105142_ao + ((C_100688_jz)var2.get(var1)).field_109131_c;
            }
         }

      }
   }

   private void func_105044_a(long var1) {
      if(this.field_105105_I.field_108908_a) {
         List var3 = this.field_105105_I.func_108902_b(this.field_105142_ao);
         C_100688_jz var4 = (C_100688_jz)var3.remove(0);
         GL11.glClear(256);
         GL11.glMatrixMode(5889);
         GL11.glEnable(2903);
         GL11.glLoadIdentity();
         GL11.glOrtho(0.0D, (double)this.field_105124_c, (double)this.field_105121_d, 0.0D, 1000.0D, 3000.0D);
         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
         GL11.glLineWidth(1.0F);
         GL11.glDisable(3553);
         C_100872_azb var5 = C_100872_azb.field_110346_a;
         short var6 = 160;
         int var7 = this.field_105124_c - var6 - 10;
         int var8 = this.field_105121_d - var6 * 2;
         GL11.glEnable(3042);
         var5.func_110330_b();
         var5.func_110332_a(0, 200);
         var5.func_110325_a((double)((float)var7 - (float)var6 * 1.1F), (double)((float)var8 - (float)var6 * 0.6F - 16.0F), 0.0D);
         var5.func_110325_a((double)((float)var7 - (float)var6 * 1.1F), (double)(var8 + var6 * 2), 0.0D);
         var5.func_110325_a((double)((float)var7 + (float)var6 * 1.1F), (double)(var8 + var6 * 2), 0.0D);
         var5.func_110325_a((double)((float)var7 + (float)var6 * 1.1F), (double)((float)var8 - (float)var6 * 0.6F - 16.0F), 0.0D);
         var5.func_110329_a();
         GL11.glDisable(3042);
         double var9 = 0.0D;

         int var13;
         for(int var11 = 0; var11 < var3.size(); ++var11) {
            C_100688_jz var12 = (C_100688_jz)var3.get(var11);
            var13 = C_100650_jv.func_108910_c(var12.field_109132_a / 4.0D) + 1;
            var5.func_110319_b(6);
            var5.func_110326_d(var12.func_109128_a());
            var5.func_110325_a((double)var7, (double)var8, 0.0D);

            int var14;
            float var15;
            float var17;
            float var16;
            for(var14 = var13; var14 >= 0; --var14) {
               var15 = (float)((var9 + var12.field_109132_a * (double)var14 / (double)var13) * 3.1415927410125732D * 2.0D / 100.0D);
               var16 = C_100650_jv.func_108924_a(var15) * (float)var6;
               var17 = C_100650_jv.func_108928_b(var15) * (float)var6 * 0.5F;
               var5.func_110325_a((double)((float)var7 + var16), (double)((float)var8 - var17), 0.0D);
            }

            var5.func_110329_a();
            var5.func_110319_b(5);
            var5.func_110326_d((var12.func_109128_a() & 16711422) >> 1);

            for(var14 = var13; var14 >= 0; --var14) {
               var15 = (float)((var9 + var12.field_109132_a * (double)var14 / (double)var13) * 3.1415927410125732D * 2.0D / 100.0D);
               var16 = C_100650_jv.func_108924_a(var15) * (float)var6;
               var17 = C_100650_jv.func_108928_b(var15) * (float)var6 * 0.5F;
               var5.func_110325_a((double)((float)var7 + var16), (double)((float)var8 - var17), 0.0D);
               var5.func_110325_a((double)((float)var7 + var16), (double)((float)var8 - var17 + 10.0F), 0.0D);
            }

            var5.func_110329_a();
            var9 += var12.field_109132_a;
         }

         DecimalFormat var19 = new DecimalFormat("##0.00");
         GL11.glEnable(3553);
         String var18 = "";
         if(!var4.field_109131_c.equals("unspecified")) {
            var18 = var18 + "[0] ";
         }

         if(var4.field_109131_c.length() == 0) {
            var18 = var18 + "ROOT ";
         } else {
            var18 = var18 + var4.field_109131_c + " ";
         }

         var13 = 16777215;
         this.field_105148_p.func_111783_a(var18, var7 - var6, var8 - var6 / 2 - 16, var13);
         this.field_105148_p.func_111783_a(var18 = var19.format(var4.field_109130_b) + "%", var7 + var6 - this.field_105148_p.func_111778_a(var18), var8 - var6 / 2 - 16, var13);

         for(int var21 = 0; var21 < var3.size(); ++var21) {
            C_100688_jz var20 = (C_100688_jz)var3.get(var21);
            String var22 = "";
            if(var20.field_109131_c.equals("unspecified")) {
               var22 = var22 + "[?] ";
            } else {
               var22 = var22 + "[" + (var21 + 1) + "] ";
            }

            var22 = var22 + var20.field_109131_c;
            this.field_105148_p.func_111783_a(var22, var7 - var6, var8 + var6 / 2 + var21 * 8 + 20, var20.func_109128_a());
            this.field_105148_p.func_111783_a(var22 = var19.format(var20.field_109132_a) + "%", var7 + var6 - 50 - this.field_105148_p.func_111778_a(var22), var8 + var6 / 2 + var21 * 8 + 20, var20.func_109128_a());
            this.field_105148_p.func_111783_a(var22 = var19.format(var20.field_109130_b) + "%", var7 + var6 - this.field_105148_p.func_111778_a(var22), var8 + var6 / 2 + var21 * 8 + 20, var20.func_109128_a());
         }

      }
   }

   public void func_105079_g() {
      this.field_105106_J = false;
   }

   public void func_105057_h() {
      if(Display.isActive()) {
         if(!this.field_105096_G) {
            this.field_105096_G = true;
            this.field_105098_B.func_111755_a();
            this.func_105053_a((C_101278_asw)null);
            this.field_105110_W = 10000;
         }
      }
   }

   public void func_105041_i() {
      if(this.field_105096_G) {
         C_101207_aqi.func_111983_a();
         this.field_105096_G = false;
         this.field_105098_B.func_111756_b();
      }
   }

   public void func_105061_j() {
      if(this.field_105144_r == null) {
         this.func_105053_a(new C_101158_asq());
         if(this.func_105035_B() && !this.field_105118_Z.func_105007_al()) {
            this.field_105097_A.func_105911_e();
         }

      }
   }

   private void func_105078_a(int var1, boolean var2) {
      if(!var2) {
         this.field_105110_W = 0;
      }

      if(var1 != 0 || this.field_105110_W <= 0) {
         if(var2 && this.field_105158_x != null && this.field_105158_x.field_107840_a == C_100389_amv.field_107877_a && var1 == 0) {
            int var3 = this.field_105158_x.field_107838_b;
            int var4 = this.field_105158_x.field_107839_c;
            int var5 = this.field_105158_x.field_107836_d;
            this.field_105123_b.func_111071_c(var3, var4, var5, this.field_105158_x.field_107837_e);
            if(this.field_105120_g.func_103818_f(var3, var4, var5)) {
               this.field_105133_i.func_111307_a(var3, var4, var5, this.field_105158_x.field_107837_e);
               this.field_105120_g.func_103301_bE();
            }
         } else {
            this.field_105123_b.func_111082_c();
         }

      }
   }

   private void func_105081_c(int var1) {
      if(var1 != 0 || this.field_105110_W <= 0) {
         if(var1 == 0) {
            this.field_105120_g.func_103301_bE();
         }

         if(var1 == 1) {
            this.field_105149_ac = 4;
         }

         boolean var2 = true;
         C_100994_tv var3 = this.field_105120_g.field_103857_bK.func_104808_g();
         if(this.field_105158_x == null) {
            if(var1 == 0 && this.field_105123_b.func_111075_g()) {
               this.field_105110_W = 10;
            }
         } else if(this.field_105158_x.field_107840_a == C_100389_amv.field_107875_b) {
            if(var1 == 0) {
               this.field_105123_b.func_111068_a(this.field_105120_g, this.field_105158_x.field_107835_g);
            }

            if(var1 == 1 && this.field_105123_b.func_111080_b(this.field_105120_g, this.field_105158_x.field_107835_g)) {
               var2 = false;
            }
         } else if(this.field_105158_x.field_107840_a == C_100389_amv.field_107877_a) {
            int var4 = this.field_105158_x.field_107838_b;
            int var5 = this.field_105158_x.field_107839_c;
            int var6 = this.field_105158_x.field_107836_d;
            int var7 = this.field_105158_x.field_107837_e;
            if(var1 == 0) {
               this.field_105123_b.func_111056_b(var4, var5, var6, this.field_105158_x.field_107837_e);
            } else {
               int var8 = var3 != null?var3.field_111398_a:0;
               if(this.field_105123_b.func_111074_a(this.field_105120_g, this.field_105122_e, var3, var4, var5, var6, var7, this.field_105158_x.field_107834_f)) {
                  var2 = false;
                  this.field_105120_g.func_103301_bE();
               }

               if(var3 == null) {
                  return;
               }

               if(var3.field_111398_a == 0) {
                  this.field_105120_g.field_103857_bK.field_104832_a[this.field_105120_g.field_103857_bK.field_104831_c] = null;
               } else if(var3.field_111398_a != var8 || this.field_105123_b.func_111070_h()) {
                  this.field_105141_t.field_111278_c.func_110250_b();
               }
            }
         }

         if(var2 && var1 == 1) {
            C_100994_tv var9 = this.field_105120_g.field_103857_bK.func_104808_g();
            if(var9 != null && this.field_105123_b.func_111062_a(this.field_105120_g, this.field_105122_e, var9)) {
               this.field_105141_t.field_111278_c.func_110251_c();
            }
         }

      }
   }

   public void func_105032_k() {
      try {
         this.field_105112_Q = !this.field_105112_Q;
         if(this.field_105112_Q) {
            Display.setDisplayMode(Display.getDesktopDisplayMode());
            this.field_105124_c = Display.getDisplayMode().getWidth();
            this.field_105121_d = Display.getDisplayMode().getHeight();
            if(this.field_105124_c <= 0) {
               this.field_105124_c = 1;
            }

            if(this.field_105121_d <= 0) {
               this.field_105121_d = 1;
            }
         } else {
            if(this.field_105128_l != null) {
               this.field_105124_c = this.field_105128_l.getWidth();
               this.field_105121_d = this.field_105128_l.getHeight();
            } else {
               this.field_105124_c = this.field_105117_X;
               this.field_105121_d = this.field_105116_Y;
            }

            if(this.field_105124_c <= 0) {
               this.field_105124_c = 1;
            }

            if(this.field_105121_d <= 0) {
               this.field_105121_d = 1;
            }
         }

         if(this.field_105144_r != null) {
            this.func_105049_a(this.field_105124_c, this.field_105121_d);
         }

         Display.setFullscreen(this.field_105112_Q);
         Display.setVSyncEnabled(this.field_105156_y.field_111733_v);
         Display.update();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   private void func_105049_a(int var1, int var2) {
      this.field_105124_c = var1 <= 0?1:var1;
      this.field_105121_d = var2 <= 0?1:var2;
      if(this.field_105144_r != null) {
         C_101277_asx var3 = new C_101277_asx(this.field_105156_y, var1, var2);
         int var4 = var3.func_112363_a();
         int var5 = var3.func_112365_b();
         this.field_105144_r.func_104036_a(this, var4, var5);
      }

   }

   public void func_105086_l() {
      if(this.field_105149_ac > 0) {
         --this.field_105149_ac;
      }

      this.field_105105_I.func_108901_a("stats");
      this.field_105094_E.func_105808_e();
      this.field_105105_I.func_108899_c("gui");
      if(!this.field_105126_n) {
         this.field_105137_v.func_103990_a();
      }

      this.field_105105_I.func_108899_c("pick");
      this.field_105141_t.func_111236_a(1.0F);
      this.field_105105_I.func_108899_c("gameMode");
      if(!this.field_105126_n && this.field_105122_e != null) {
         this.field_105123_b.func_111081_e();
      }

      GL11.glBindTexture(3553, this.field_105127_o.func_110367_b("/terrain.png"));
      this.field_105105_I.func_108899_c("textures");
      if(!this.field_105126_n) {
         this.field_105127_o.func_110369_a();
      }

      if(this.field_105144_r == null && this.field_105120_g != null) {
         if(this.field_105120_g.func_103330_aT() <= 0) {
            this.func_105053_a((C_101278_asw)null);
         } else if(this.field_105120_g.func_103369_bt() && this.field_105122_e != null) {
            this.func_105053_a(new C_101149_asf());
         }
      } else if(this.field_105144_r != null && this.field_105144_r instanceof C_101149_asf && !this.field_105120_g.func_103369_bt()) {
         this.func_105053_a((C_101278_asw)null);
      }

      if(this.field_105144_r != null) {
         this.field_105110_W = 10000;
      }

      if(this.field_105144_r != null) {
         this.field_105144_r.func_104026_m();
         if(this.field_105144_r != null) {
            this.field_105144_r.field_104048_l.func_104020_a();
            this.field_105144_r.func_104039_c();
         }
      }

      if(this.field_105144_r == null || this.field_105144_r.field_104051_i) {
         this.field_105105_I.func_108899_c("mouse");

         while(Mouse.next()) {
            C_101207_aqi.func_111987_a(Mouse.getEventButton() - 100, Mouse.getEventButtonState());
            if(Mouse.getEventButtonState()) {
               C_101207_aqi.func_111984_a(Mouse.getEventButton() - 100);
            }

            long var1 = func_105063_F() - this.field_105104_H;
            if(var1 <= 200L) {
               int var3 = Mouse.getEventDWheel();
               if(var3 != 0) {
                  this.field_105120_g.field_103857_bK.func_104818_c(var3);
                  if(this.field_105156_y.field_111706_W) {
                     if(var3 > 0) {
                        var3 = 1;
                     }

                     if(var3 < 0) {
                        var3 = -1;
                     }

                     this.field_105156_y.field_111714_Z += (float)var3 * 0.25F;
                  }
               }

               if(this.field_105144_r == null) {
                  if(!this.field_105096_G && Mouse.getEventButtonState()) {
                     this.func_105057_h();
                  }
               } else if(this.field_105144_r != null) {
                  this.field_105144_r.func_104030_d();
               }
            }
         }

         if(this.field_105110_W > 0) {
            --this.field_105110_W;
         }

         this.field_105105_I.func_108899_c("keyboard");

         boolean var4;
         while(Keyboard.next()) {
            C_101207_aqi.func_111987_a(Keyboard.getEventKey(), Keyboard.getEventKeyState());
            if(Keyboard.getEventKeyState()) {
               C_101207_aqi.func_111984_a(Keyboard.getEventKey());
            }

            if(this.field_105145_am > 0L) {
               if(func_105063_F() - this.field_105145_am >= 6000L) {
                  throw new C_100010_l(new C_100007_a("Manually triggered debug crash", new Throwable()));
               }

               if(!Keyboard.isKeyDown(46) || !Keyboard.isKeyDown(61)) {
                  this.field_105145_am = -1L;
               }
            } else if(Keyboard.isKeyDown(46) && Keyboard.isKeyDown(61)) {
               this.field_105145_am = func_105063_F();
            }

            if(Keyboard.getEventKeyState()) {
               if(Keyboard.getEventKey() == 87) {
                  this.func_105032_k();
               } else {
                  if(this.field_105144_r != null) {
                     this.field_105144_r.func_104024_n();
                  } else {
                     if(Keyboard.getEventKey() == 1) {
                        this.func_105061_j();
                     }

                     if(Keyboard.getEventKey() == 31 && Keyboard.isKeyDown(61)) {
                        this.func_105037_L();
                     }

                     if(Keyboard.getEventKey() == 20 && Keyboard.isKeyDown(61)) {
                        this.field_105127_o.func_110380_b();
                     }

                     if(Keyboard.getEventKey() == 33 && Keyboard.isKeyDown(61)) {
                        var4 = Keyboard.isKeyDown(42) | Keyboard.isKeyDown(54);
                        this.field_105156_y.func_111679_a(C_101123_arf.field_111648_g, var4?-1:1);
                     }

                     if(Keyboard.getEventKey() == 30 && Keyboard.isKeyDown(61)) {
                        this.field_105119_f.func_109708_a();
                     }

                     if(Keyboard.getEventKey() == 35 && Keyboard.isKeyDown(61)) {
                        this.field_105156_y.field_111753_x = !this.field_105156_y.field_111753_x;
                        this.field_105156_y.func_111684_b();
                     }

                     if(Keyboard.getEventKey() == 25 && Keyboard.isKeyDown(61)) {
                        this.field_105156_y.field_111751_y = !this.field_105156_y.field_111751_y;
                        this.field_105156_y.func_111684_b();
                     }

                     if(Keyboard.getEventKey() == 59) {
                        this.field_105156_y.field_111711_R = !this.field_105156_y.field_111711_R;
                     }

                     if(Keyboard.getEventKey() == 61) {
                        this.field_105156_y.field_111705_T = !this.field_105156_y.field_111705_T;
                        this.field_105156_y.field_111704_U = C_101278_asw.func_104041_p();
                     }

                     if(Keyboard.getEventKey() == 63) {
                        ++this.field_105156_y.field_111710_S;
                        if(this.field_105156_y.field_111710_S > 2) {
                           this.field_105156_y.field_111710_S = 0;
                        }
                     }

                     if(Keyboard.getEventKey() == 66) {
                        this.field_105156_y.field_111713_X = !this.field_105156_y.field_111713_X;
                     }
                  }

                  int var5;
                  for(var5 = 0; var5 < 9; ++var5) {
                     if(Keyboard.getEventKey() == 2 + var5) {
                        this.field_105120_g.field_103857_bK.field_104831_c = var5;
                     }
                  }

                  if(this.field_105156_y.field_111705_T && this.field_105156_y.field_111704_U) {
                     if(Keyboard.getEventKey() == 11) {
                        this.func_105059_b(0);
                     }

                     for(var5 = 0; var5 < 9; ++var5) {
                        if(Keyboard.getEventKey() == 2 + var5) {
                           this.func_105059_b(var5 + 1);
                        }
                     }
                  }
               }
            }
         }

         var4 = this.field_105156_y.field_111722_n != 2;

         while(this.field_105156_y.field_111691_F.func_111986_c()) {
            this.func_105053_a(new C_101360_auk(this.field_105120_g));
         }

         while(this.field_105156_y.field_111692_G.func_111986_c()) {
            this.field_105120_g.func_103830_bN();
         }

         while(this.field_105156_y.field_111700_H.func_111986_c() && var4) {
            this.func_105053_a(new C_101130_aro());
         }

         if(this.field_105144_r == null && this.field_105156_y.field_111698_N.func_111986_c() && var4) {
            this.func_105053_a(new C_101130_aro("/"));
         }

         if(this.field_105120_g.func_103833_bI()) {
            if(!this.field_105156_y.field_111703_K.field_111990_e) {
               this.field_105123_b.func_111072_c(this.field_105120_g);
            }

            label338:
            while(true) {
               if(!this.field_105156_y.field_111702_J.func_111986_c()) {
                  while(this.field_105156_y.field_111703_K.func_111986_c()) {
                     ;
                  }

                  while(true) {
                     if(this.field_105156_y.field_111697_M.func_111986_c()) {
                        continue;
                     }
                     break label338;
                  }
               }
            }
         } else {
            while(this.field_105156_y.field_111702_J.func_111986_c()) {
               this.func_105081_c(0);
            }

            while(this.field_105156_y.field_111703_K.func_111986_c()) {
               this.func_105081_c(1);
            }

            while(this.field_105156_y.field_111697_M.func_111986_c()) {
               this.func_105076_M();
            }
         }

         if(this.field_105156_y.field_111703_K.field_111990_e && this.field_105149_ac == 0 && !this.field_105120_g.func_103833_bI()) {
            this.func_105081_c(1);
         }

         this.func_105078_a(0, this.field_105144_r == null && this.field_105156_y.field_111702_J.field_111990_e && this.field_105096_G);
      }

      if(this.field_105122_e != null) {
         if(this.field_105120_g != null) {
            ++this.field_105138_ai;
            if(this.field_105138_ai == 30) {
               this.field_105138_ai = 0;
               this.field_105122_e.func_109395_h(this.field_105120_g);
            }
         }

         this.field_105105_I.func_108899_c("gameRenderer");
         if(!this.field_105126_n) {
            this.field_105141_t.func_111225_a();
         }

         this.field_105105_I.func_108899_c("levelRenderer");
         if(!this.field_105126_n) {
            this.field_105119_f.func_109729_e();
         }

         this.field_105105_I.func_108899_c("level");
         if(!this.field_105126_n) {
            if(this.field_105122_e.field_109580_r > 0) {
               --this.field_105122_e.field_109580_r;
            }

            this.field_105122_e.func_109419_h();
         }

         if(!this.field_105126_n) {
            this.field_105122_e.func_109452_a(this.field_105122_e.field_109578_t > 0, true);
            this.field_105122_e.func_109397_b();
         }

         this.field_105105_I.func_108899_c("animateTick");
         if(!this.field_105126_n && this.field_105122_e != null) {
            this.field_105122_e.func_109592_E(C_100650_jv.func_108910_c(this.field_105120_g.field_103221_t), C_100650_jv.func_108910_c(this.field_105120_g.field_103219_u), C_100650_jv.func_108910_c(this.field_105120_g.field_103217_v));
         }

         this.field_105105_I.func_108899_c("particles");
         if(!this.field_105126_n) {
            this.field_105133_i.func_111309_a();
         }
      } else if(this.field_105134_ak != null) {
         this.field_105105_I.func_108899_c("pendingConnection");
         this.field_105134_ak.func_107419_b();
      }

      this.field_105105_I.func_108900_b();
      this.field_105104_H = func_105063_F();
   }

   private void func_105037_L() {
      System.out.println("FORCING RELOAD!");
      if(this.field_105097_A != null) {
         this.field_105097_A.func_105906_d();
      }

      this.field_105097_A = new C_100105_bcx();
      this.field_105097_A.func_105904_a(this.field_105156_y);
      this.field_105111_V.func_111959_a();
   }

   public void func_105087_a(String var1, String var2, C_100840_xm var3) {
      this.func_105083_a((C_100942_awz)null);
      System.gc();
      C_100268_agw var4 = this.field_105151_aa.func_107200_a(var1, false);
      C_100269_agv var5 = var4.func_107088_d();
      if(var5 == null && var3 != null) {
         this.field_105094_E.func_105801_a(C_100818_jh.field_110023_g, 1);
         var5 = new C_100269_agv(var3, var1);
         var4.func_107095_a(var5);
      }

      if(var3 == null) {
         var3 = new C_100840_xm(var5);
      }

      this.field_105094_E.func_105801_a(C_100818_jh.field_110022_f, 1);
      this.field_105118_Z = new C_100094_bcb(this, var1, var2, var3);
      this.field_105118_Z.func_104876_t();
      this.field_105136_al = true;
      this.field_105143_s.func_104292_a(C_100359_bd.func_107638_a("menu.loadingLevel"));

      while(!this.field_105118_Z.func_104946_af()) {
         String var6 = this.field_105118_Z.func_104900_d();
         if(var6 != null) {
            this.field_105143_s.func_104291_c(C_100359_bd.func_107638_a(var6));
         } else {
            this.field_105143_s.func_104291_c("");
         }

         try {
            Thread.sleep(200L);
         } catch (InterruptedException var9) {
            ;
         }
      }

      this.func_105053_a((C_101278_asw)null);

      try {
         C_101250_awr var10 = new C_101250_awr(this, this.field_105118_Z);
         this.field_105134_ak = var10.func_107037_f();
      } catch (IOException var8) {
         this.func_105085_c(this.func_105090_b(new C_100007_a("Connecting to integrated server", var8)));
      }

   }

   public void func_105083_a(C_100942_awz var1) {
      this.func_105054_a(var1, "");
   }

   public void func_105054_a(C_100942_awz var1, String var2) {
      this.field_105094_E.func_105804_d();
      if(var1 == null) {
         C_101250_awr var3 = this.func_105068_r();
         if(var3 != null) {
            var3.func_107035_c();
         }

         if(this.field_105134_ak != null) {
            this.field_105134_ak.func_107421_f();
         }

         if(this.field_105118_Z != null) {
            this.field_105118_Z.func_104930_n();
         }

         this.field_105118_Z = null;
      }

      this.field_105132_h = null;
      this.field_105134_ak = null;
      if(this.field_105143_s != null) {
         this.field_105143_s.func_104293_b(var2);
         this.field_105143_s.func_104291_c("");
      }

      if(var1 == null && this.field_105122_e != null) {
         if(this.field_105099_C.func_105662_a()) {
            this.field_105099_C.func_105673_b();
         }

         this.func_105073_a((C_100909_axg)null);
         this.field_105136_al = false;
      }

      this.field_105097_A.func_105894_a((String)null, 0.0F, 0.0F, 0.0F);
      this.field_105097_A.func_105906_d();
      this.field_105122_e = var1;
      if(var1 != null) {
         if(this.field_105119_f != null) {
            this.field_105119_f.func_109728_a(var1);
         }

         if(this.field_105133_i != null) {
            this.field_105133_i.func_111306_a(var1);
         }

         if(this.field_105120_g == null) {
            this.field_105120_g = this.field_105123_b.func_111078_a(var1);
            this.field_105123_b.func_111079_b(this.field_105120_g);
         }

         this.field_105120_g.func_103128_w();
         var1.func_109513_d(this.field_105120_g);
         this.field_105120_g.field_104547_b = new C_100968_ayl(this.field_105156_y);
         this.field_105123_b.func_111063_a(this.field_105120_g);
         this.field_105132_h = this.field_105120_g;
      } else {
         this.field_105151_aa.func_107196_d();
         this.field_105120_g = null;
      }

      System.gc();
      this.field_105104_H = 0L;
   }

   public void func_105038_a(String var1, File var2) {
      int var3 = var1.indexOf("/");
      String var4 = var1.substring(0, var3);
      var1 = var1.substring(var3 + 1);
      if(var4.equalsIgnoreCase("sound3")) {
         this.field_105097_A.func_105901_a(var1, var2);
      } else if(var4.equalsIgnoreCase("streaming")) {
         this.field_105097_A.func_105915_b(var1, var2);
      } else if(var4.equalsIgnoreCase("music") || var4.equalsIgnoreCase("newmusic")) {
         this.field_105097_A.func_105908_c(var1, var2);
      }

   }

   public String func_105072_m() {
      return this.field_105119_f.func_109731_c();
   }

   public String func_105088_n() {
      return this.field_105119_f.func_109718_d();
   }

   public String func_105066_o() {
      return this.field_105122_e.func_109539_v();
   }

   public String func_105051_p() {
      return "P: " + this.field_105133_i.func_111311_b() + ". T: " + this.field_105122_e.func_109386_u();
   }

   public void func_105033_a(int var1) {
      this.field_105122_e.func_109535_f();
      this.field_105122_e.func_109587_a();
      int var2 = 0;
      if(this.field_105120_g != null) {
         var2 = this.field_105120_g.field_103212_k;
         this.field_105122_e.func_109383_e(this.field_105120_g);
      }

      this.field_105132_h = null;
      this.field_105120_g = this.field_105123_b.func_111078_a(this.field_105122_e);
      this.field_105120_g.field_103224_ap = var1;
      this.field_105132_h = this.field_105120_g;
      this.field_105120_g.func_103128_w();
      this.field_105122_e.func_109513_d(this.field_105120_g);
      this.field_105123_b.func_111079_b(this.field_105120_g);
      this.field_105120_g.field_104547_b = new C_100968_ayl(this.field_105156_y);
      this.field_105120_g.field_103212_k = var2;
      this.field_105123_b.func_111063_a(this.field_105120_g);
      if(this.field_105144_r instanceof C_101138_arv) {
         this.func_105053_a((C_101278_asw)null);
      }

   }

   void func_105070_a(boolean var1) {
      this.field_105140_aj = var1;
   }

   public final boolean func_105034_q() {
      return this.field_105140_aj;
   }

   public C_101250_awr func_105068_r() {
      return this.field_105120_g != null?this.field_105120_g.field_104564_a:null;
   }

   public static void main(String[] var0) {
      HashMap var1 = new HashMap();
      boolean var2 = false;
      boolean var3 = true;
      boolean var4 = false;
      String var5 = "Player" + func_105063_F() % 1000L;
      if(var0.length > 0) {
         var5 = var0[0];
      }

      String var6 = "-";
      if(var0.length > 1) {
         var6 = var0[1];
      }

      for(int var7 = 2; var7 < var0.length; ++var7) {
         String var8 = var0[var7];
         String var9 = var7 == var0.length - 1?null:var0[var7 + 1];
         boolean var10 = false;
         if(!var8.equals("-demo") && !var8.equals("--demo")) {
            if(var8.equals("--applet")) {
               var3 = false;
            } else if(var8.equals("--password") && var9 != null) {
               String[] var11 = C_100669_jm.func_109083_a(var5, var9);
               if(var11 != null) {
                  var5 = var11[0];
                  var6 = var11[1];
                  System.out.println("Logged in insecurely as " + var5 + " - sessionId is " + var6);
               } else {
                  System.out.println("Could not log in as " + var5 + " with given password");
               }

               var10 = true;
            }
         } else {
            var2 = true;
         }

         if(var10) {
            ++var7;
         }
      }

      var1.put("demo", "" + var2);
      var1.put("stand-alone", "" + var3);
      var1.put("username", var5);
      var1.put("fullscreen", "" + var4);
      var1.put("sessionid", var6);
      Frame var13 = new Frame();
      var13.setTitle("Minecraft");
      var13.setBackground(Color.BLACK);
      JPanel var12 = new JPanel();
      var13.setLayout(new BorderLayout());
      var12.setPreferredSize(new Dimension(854, 480));
      var13.add(var12, "Center");
      var13.pack();
      var13.setLocationRelativeTo((Component)null);
      var13.setVisible(true);
      var13.addWindowListener(new C_101115_aqr());
      aqp var14 = new aqp(var1);
      MinecraftApplet var15 = new MinecraftApplet();
      var15.setStub(var14);
      var14.setLayout(new BorderLayout());
      var14.add(var15, "Center");
      var14.validate();
      var13.removeAll();
      var13.setLayout(new BorderLayout());
      var13.add(var14, "Center");
      var13.validate();
      var15.init();
      var15.start();
      Runtime.getRuntime().addShutdownHook(new C_101116_aqs());
   }

   public static boolean func_105058_s() {
      return field_105113_P == null || !field_105113_P.field_105156_y.field_111711_R;
   }

   public static boolean func_105052_t() {
      return field_105113_P != null && field_105113_P.field_105156_y.field_111726_j;
   }

   public static boolean func_105055_u() {
      return field_105113_P != null && field_105113_P.field_105156_y.field_111727_k;
   }

   public static boolean func_105046_v() {
      return field_105113_P != null && field_105113_P.field_105156_y.field_111705_T;
   }

   public boolean func_105089_c(String var1) {
      return !var1.startsWith("/")?false:false;
   }

   private void func_105076_M() {
      if(this.field_105158_x != null) {
         boolean var1 = this.field_105120_g.field_103869_cf.field_111597_d;
         int var3 = 0;
         boolean var4 = false;
         int var2;
         int var5;
         if(this.field_105158_x.field_107840_a == C_100389_amv.field_107877_a) {
            var5 = this.field_105158_x.field_107838_b;
            int var6 = this.field_105158_x.field_107839_c;
            int var7 = this.field_105158_x.field_107836_d;
            C_100451_alf var8 = C_100451_alf.field_106118_p[this.field_105122_e.func_109349_a(var5, var6, var7)];
            if(var8 == null) {
               return;
            }

            var2 = var8.func_105979_a(this.field_105122_e, var5, var6, var7);
            if(var2 == 0) {
               return;
            }

            var4 = C_100992_tt.field_110834_e[var2].func_110803_l();
            int var9 = var2 < 256 && !C_100451_alf.field_106118_p[var8.field_106162_cm].func_106053_u_()?var2:var8.field_106162_cm;
            var3 = C_100451_alf.field_106118_p[var9].func_106019_h(this.field_105122_e, var5, var6, var7);
         } else {
            if(this.field_105158_x.field_107840_a != C_100389_amv.field_107875_b || this.field_105158_x.field_107835_g == null || !var1) {
               return;
            }

            if(this.field_105158_x.field_107835_g instanceof C_100600_lq) {
               var2 = C_100992_tt.field_110928_as.field_110891_cf;
            } else if(this.field_105158_x.field_107835_g instanceof C_100596_lm) {
               C_100596_lm var10 = (C_100596_lm)this.field_105158_x.field_107835_g;
               if(var10.func_104582_i() == null) {
                  var2 = C_100992_tt.field_110967_bI.field_110891_cf;
               } else {
                  var2 = var10.func_104582_i().field_111397_c;
                  var3 = var10.func_104582_i().func_111367_j();
                  var4 = true;
               }
            } else if(this.field_105158_x.field_107835_g instanceof C_100590_ph) {
               C_100590_ph var11 = (C_100590_ph)this.field_105158_x.field_107835_g;
               if(var11.field_104761_a == 2) {
                  var2 = C_100992_tt.field_110911_aO.field_110891_cf;
               } else if(var11.field_104761_a == 1) {
                  var2 = C_100992_tt.field_110910_aN.field_110891_cf;
               } else {
                  var2 = C_100992_tt.field_110921_az.field_110891_cf;
               }
            } else if(this.field_105158_x.field_107835_g instanceof C_100572_pe) {
               var2 = C_100992_tt.field_110917_aE.field_110891_cf;
            } else {
               var2 = C_100992_tt.field_110963_bC.field_110891_cf;
               var3 = C_100727_lf.func_109315_a(this.field_105158_x.field_107835_g);
               var4 = true;
               if(var3 <= 0 || !C_100727_lf.field_109322_a.containsKey(Integer.valueOf(var3))) {
                  return;
               }
            }
         }

         this.field_105120_g.field_103857_bK.func_104800_a(var2, var3, var4, var1);
         if(var1) {
            var5 = this.field_105120_g.field_103855_bL.field_111513_b.size() - 9 + this.field_105120_g.field_103857_bK.field_104831_c;
            this.field_105123_b.func_111060_a(this.field_105120_g.field_103857_bK.func_103007_a(this.field_105120_g.field_103857_bK.field_104831_c), var5);
         }

      }
   }

   public C_100007_a func_105090_b(C_100007_a var1) {
      var1.func_105182_a("LWJGL", new C_101113_aqt(this));
      var1.func_105182_a("OpenGL", new C_101114_aqu(this));
      var1.func_105182_a("Is Modded", new C_101111_aqv(this));
      var1.func_105182_a("Type", new C_101112_aqw(this));
      var1.func_105182_a("Texture Pack", new C_101119_aqx(this));
      var1.func_105182_a("Profiler Position", new C_101211_aqm(this));
      var1.func_105182_a("Vec3 Pool Size", new C_101214_aqn(this));
      if(this.field_105122_e != null) {
         this.field_105122_e.func_109483_a(var1);
      }

      return var1;
   }

   public static Minecraft func_105091_x() {
      return field_105113_P;
   }

   public void func_105075_y() {
      this.field_105150_ad = true;
   }

   public void func_102905_a(C_100708_kp var1) {
      var1.func_109265_a("fps", Integer.valueOf(field_105152_ab));
      var1.func_109265_a("texpack_name", this.field_105099_C.func_105667_e().func_105632_c());
      var1.func_109265_a("texpack_resolution", Integer.valueOf(this.field_105099_C.func_105667_e().func_105628_f()));
      var1.func_109265_a("vsync_enabled", Boolean.valueOf(this.field_105156_y.field_111733_v));
      var1.func_109265_a("display_frequency", Integer.valueOf(Display.getDisplayMode().getFrequency()));
      var1.func_109265_a("display_type", this.field_105112_Q?"fullscreen":"windowed");
      if(this.field_105118_Z != null && this.field_105118_Z.func_104959_aj() != null) {
         var1.func_109265_a("snooper_partner", this.field_105118_Z.func_104959_aj().func_109256_f());
      }

   }

   public void func_102907_b(C_100708_kp var1) {
      var1.func_109265_a("opengl_version", GL11.glGetString(7938));
      var1.func_109265_a("opengl_vendor", GL11.glGetString(7936));
      var1.func_109265_a("client_brand", C_101444_ClientBrandRetriever.func_105166_getClientModName());
      var1.func_109265_a("applet", Boolean.valueOf(this.field_105129_m));
      ContextCapabilities var2 = GLContext.getCapabilities();
      var1.func_109265_a("gl_caps[ARB_multitexture]", Boolean.valueOf(var2.GL_ARB_multitexture));
      var1.func_109265_a("gl_caps[ARB_multisample]", Boolean.valueOf(var2.GL_ARB_multisample));
      var1.func_109265_a("gl_caps[ARB_texture_cube_map]", Boolean.valueOf(var2.GL_ARB_texture_cube_map));
      var1.func_109265_a("gl_caps[ARB_vertex_blend]", Boolean.valueOf(var2.GL_ARB_vertex_blend));
      var1.func_109265_a("gl_caps[ARB_matrix_palette]", Boolean.valueOf(var2.GL_ARB_matrix_palette));
      var1.func_109265_a("gl_caps[ARB_vertex_program]", Boolean.valueOf(var2.GL_ARB_vertex_program));
      var1.func_109265_a("gl_caps[ARB_vertex_shader]", Boolean.valueOf(var2.GL_ARB_vertex_shader));
      var1.func_109265_a("gl_caps[ARB_fragment_program]", Boolean.valueOf(var2.GL_ARB_fragment_program));
      var1.func_109265_a("gl_caps[ARB_fragment_shader]", Boolean.valueOf(var2.GL_ARB_fragment_shader));
      var1.func_109265_a("gl_caps[ARB_shader_objects]", Boolean.valueOf(var2.GL_ARB_shader_objects));
      var1.func_109265_a("gl_caps[ARB_vertex_buffer_object]", Boolean.valueOf(var2.GL_ARB_vertex_buffer_object));
      var1.func_109265_a("gl_caps[ARB_framebuffer_object]", Boolean.valueOf(var2.GL_ARB_framebuffer_object));
      var1.func_109265_a("gl_caps[ARB_pixel_buffer_object]", Boolean.valueOf(var2.GL_ARB_pixel_buffer_object));
      var1.func_109265_a("gl_caps[ARB_uniform_buffer_object]", Boolean.valueOf(var2.GL_ARB_uniform_buffer_object));
      var1.func_109265_a("gl_caps[ARB_texture_non_power_of_two]", Boolean.valueOf(var2.GL_ARB_texture_non_power_of_two));
      var1.func_109265_a("gl_caps[gl_max_vertex_uniforms]", Integer.valueOf(GL11.glGetInteger('\u8b4a')));
      var1.func_109265_a("gl_caps[gl_max_fragment_uniforms]", Integer.valueOf(GL11.glGetInteger('\u8b49')));
      var1.func_109265_a("gl_max_texture_size", Integer.valueOf(func_105048_N()));
   }

   private static int func_105048_N() {
      for(int var0 = 16384; var0 > 0; var0 >>= 1) {
         GL11.glTexImage2D('\u8064', 0, 6408, var0, var0, 0, 6408, 5121, (ByteBuffer)null);
         int var1 = GL11.glGetTexLevelParameteri('\u8064', 0, 4096);
         if(var1 != 0) {
            return var0;
         }
      }

      return -1;
   }

   public boolean func_102906_R() {
      return this.field_105156_y.field_111737_t;
   }

   public void func_105073_a(C_100909_axg var1) {
      this.field_105103_O = var1;
   }

   public C_100909_axg func_105047_z() {
      return this.field_105103_O;
   }

   public boolean func_105064_A() {
      return this.field_105136_al;
   }

   public boolean func_105035_B() {
      return this.field_105136_al && this.field_105118_Z != null;
   }

   public C_100094_bcb func_105043_C() {
      return this.field_105118_Z;
   }

   public static void func_105040_D() {
      if(field_105113_P != null) {
         C_100094_bcb var0 = field_105113_P.func_105043_C();
         if(var0 != null) {
            var0.func_104916_k();
         }

      }
   }

   public C_100708_kp func_105069_E() {
      return this.field_105108_U;
   }

   public static long func_105063_F() {
      return Sys.getTime() * 1000L / Sys.getTimerResolution();
   }

   public boolean func_105050_G() {
      return this.field_105112_Q;
   }

}
