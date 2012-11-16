import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class C_100098_bcz extends C_101278_asw {

   private static final Random field_104060_a = new Random();
   private float field_104058_b = 0.0F;
   private String field_104059_c = "missingno";
   private C_101133_arl field_104057_d;
   private int field_104063_m = 0;
   private int field_104061_n;
   private static final String[] field_104062_o = new String[]{"/title/bg/panorama0.png", "/title/bg/panorama1.png", "/title/bg/panorama2.png", "/title/bg/panorama3.png", "/title/bg/panorama4.png", "/title/bg/panorama5.png"};


   public C_100098_bcz() {
      BufferedReader var1 = null;

      try {
         ArrayList var2 = new ArrayList();
         var1 = new BufferedReader(new InputStreamReader(C_100098_bcz.class.getResourceAsStream("/title/splashes.txt"), Charset.forName("UTF-8")));

         String var3;
         while((var3 = var1.readLine()) != null) {
            var3 = var3.trim();
            if(var3.length() > 0) {
               var2.add(var3);
            }
         }

         do {
            this.field_104059_c = (String)var2.get(field_104060_a.nextInt(var2.size()));
         } while(this.field_104059_c.hashCode() == 125780783);
      } catch (IOException var12) {
         ;
      } finally {
         if(var1 != null) {
            try {
               var1.close();
            } catch (IOException var11) {
               ;
            }
         }

      }

      this.field_104058_b = field_104060_a.nextFloat();
   }

   public void func_104039_c() {
      ++this.field_104063_m;
   }

   public boolean func_104031_f() {
      return false;
   }

   protected void func_104032_a(char var1, int var2) {}

   public void func_104037_A_() {
      this.field_104061_n = this.field_104046_e.field_105127_o.func_110383_a(new BufferedImage(256, 256, 2));
      Calendar var1 = Calendar.getInstance();
      var1.setTime(new Date());
      if(var1.get(2) + 1 == 11 && var1.get(5) == 9) {
         this.field_104059_c = "Happy birthday, ez!";
      } else if(var1.get(2) + 1 == 6 && var1.get(5) == 1) {
         this.field_104059_c = "Happy birthday, Notch!";
      } else if(var1.get(2) + 1 == 12 && var1.get(5) == 24) {
         this.field_104059_c = "Merry X-mas!";
      } else if(var1.get(2) + 1 == 1 && var1.get(5) == 1) {
         this.field_104059_c = "Happy new year!";
      } else if(var1.get(2) + 1 == 10 && var1.get(5) == 31) {
         this.field_104059_c = "OOoooOOOoooo! Spooky!";
      }

      C_100361_be var2 = C_100361_be.func_107654_a();
      int var4 = this.field_104045_g / 4 + 48;
      if(this.field_104046_e.func_105034_q()) {
         this.func_104055_b(var4, 24, var2);
      } else {
         this.func_104056_a(var4, 24, var2);
      }

      this.field_104050_h.add(new C_101133_arl(3, this.field_104044_f / 2 - 100, var4 + 48, var2.func_107651_b("menu.mods")));
      if(this.field_104046_e.field_105129_m) {
         this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 - 100, var4 + 72, var2.func_107651_b("menu.options")));
      } else {
         this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 - 100, var4 + 72 + 12, 98, 20, var2.func_107651_b("menu.options")));
         this.field_104050_h.add(new C_101133_arl(4, this.field_104044_f / 2 + 2, var4 + 72 + 12, 98, 20, var2.func_107651_b("menu.quit")));
      }

      this.field_104050_h.add(new C_101161_asj(5, this.field_104044_f / 2 - 124, var4 + 72 + 12));
   }

   private void func_104056_a(int var1, int var2, C_100361_be var3) {
      this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 - 100, var1, var3.func_107651_b("menu.singleplayer")));
      this.field_104050_h.add(new C_101133_arl(2, this.field_104044_f / 2 - 100, var1 + var2 * 1, var3.func_107651_b("menu.multiplayer")));
   }

   private void func_104055_b(int var1, int var2, C_100361_be var3) {
      this.field_104050_h.add(new C_101133_arl(11, this.field_104044_f / 2 - 100, var1, var3.func_107651_b("menu.playdemo")));
      this.field_104050_h.add(this.field_104057_d = new C_101133_arl(12, this.field_104044_f / 2 - 100, var1 + var2 * 1, var3.func_107651_b("menu.resetdemo")));
      C_100270_agy var4 = this.field_104046_e.func_105080_d();
      C_100269_agv var5 = var4.func_107194_c("Demo_World");
      if(var5 == null) {
         this.field_104057_d.field_103909_g = false;
      }

   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103908_f == 0) {
         this.field_104046_e.func_105053_a(new C_101156_aso(this, this.field_104046_e.field_105156_y));
      }

      if(var1.field_103908_f == 5) {
         this.field_104046_e.func_105053_a(new C_101160_ask(this, this.field_104046_e.field_105156_y));
      }

      if(var1.field_103908_f == 1) {
         this.field_104046_e.func_105053_a(new C_101264_asz(this));
      }

      if(var1.field_103908_f == 2) {
         this.field_104046_e.func_105053_a(new C_101148_asg(this));
      }

      if(var1.field_103908_f == 3) {
         this.field_104046_e.func_105053_a(new C_100103_bcr(this));
      }

      if(var1.field_103908_f == 4) {
         this.field_104046_e.func_105079_g();
      }

      if(var1.field_103908_f == 11) {
         this.field_104046_e.func_105087_a("Demo_World", "Demo_World", C_100739_hw.field_109633_a);
      }

      if(var1.field_103908_f == 12) {
         C_100270_agy var2 = this.field_104046_e.func_105080_d();
         C_100269_agv var3 = var2.func_107194_c("Demo_World");
         if(var3 != null) {
            C_101141_arq var4 = C_101264_asz.func_104258_a(this, var3.func_107131_k(), 12);
            this.field_104046_e.func_105053_a(var4);
         }
      }

   }

   public void func_104042_a(boolean var1, int var2) {
      if(var1 && var2 == 12) {
         C_100270_agy var3 = this.field_104046_e.func_105080_d();
         var3.func_107196_d();
         var3.func_107198_e("Demo_World");
         this.field_104046_e.func_105053_a(this);
      }

   }

   private void func_104053_b(int var1, int var2, float var3) {
      C_100872_azb var4 = C_100872_azb.field_110346_a;
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      GLU.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
      GL11.glMatrixMode(5888);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glEnable(3042);
      GL11.glDisable(3008);
      GL11.glDisable(2884);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(770, 771);
      byte var5 = 8;

      for(int var6 = 0; var6 < var5 * var5; ++var6) {
         GL11.glPushMatrix();
         float var7 = ((float)(var6 % var5) / (float)var5 - 0.5F) / 64.0F;
         float var8 = ((float)(var6 / var5) / (float)var5 - 0.5F) / 64.0F;
         float var9 = 0.0F;
         GL11.glTranslatef(var7, var8, var9);
         GL11.glRotatef(C_100650_jv.func_108924_a(((float)this.field_104063_m + var3) / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(-((float)this.field_104063_m + var3) * 0.1F, 0.0F, 1.0F, 0.0F);

         for(int var10 = 0; var10 < 6; ++var10) {
            GL11.glPushMatrix();
            if(var10 == 1) {
               GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
            }

            if(var10 == 2) {
               GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            }

            if(var10 == 3) {
               GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
            }

            if(var10 == 4) {
               GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            }

            if(var10 == 5) {
               GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            }

            GL11.glBindTexture(3553, this.field_104046_e.field_105127_o.func_110367_b(field_104062_o[var10]));
            var4.func_110330_b();
            var4.func_110332_a(16777215, 255 / (var6 + 1));
            float var11 = 0.0F;
            var4.func_110322_a(-1.0D, -1.0D, 1.0D, (double)(0.0F + var11), (double)(0.0F + var11));
            var4.func_110322_a(1.0D, -1.0D, 1.0D, (double)(1.0F - var11), (double)(0.0F + var11));
            var4.func_110322_a(1.0D, 1.0D, 1.0D, (double)(1.0F - var11), (double)(1.0F - var11));
            var4.func_110322_a(-1.0D, 1.0D, 1.0D, (double)(0.0F + var11), (double)(1.0F - var11));
            var4.func_110329_a();
            GL11.glPopMatrix();
         }

         GL11.glPopMatrix();
         GL11.glColorMask(true, true, true, false);
      }

      var4.func_110321_b(0.0D, 0.0D, 0.0D);
      GL11.glColorMask(true, true, true, true);
      GL11.glMatrixMode(5889);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      GL11.glDepthMask(true);
      GL11.glEnable(2884);
      GL11.glEnable(3008);
      GL11.glEnable(2929);
   }

   private void func_104052_a(float var1) {
      GL11.glBindTexture(3553, this.field_104061_n);
      GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glColorMask(true, true, true, false);
      C_100872_azb var2 = C_100872_azb.field_110346_a;
      var2.func_110330_b();
      byte var3 = 3;

      for(int var4 = 0; var4 < var3; ++var4) {
         var2.func_110317_a(1.0F, 1.0F, 1.0F, 1.0F / (float)(var4 + 1));
         int var5 = this.field_104044_f;
         int var6 = this.field_104045_g;
         float var7 = (float)(var4 - var3 / 2) / 256.0F;
         var2.func_110322_a((double)var5, (double)var6, (double)this.field_103883_j, (double)(0.0F + var7), 0.0D);
         var2.func_110322_a((double)var5, 0.0D, (double)this.field_103883_j, (double)(1.0F + var7), 0.0D);
         var2.func_110322_a(0.0D, 0.0D, (double)this.field_103883_j, (double)(1.0F + var7), 1.0D);
         var2.func_110322_a(0.0D, (double)var6, (double)this.field_103883_j, (double)(0.0F + var7), 1.0D);
      }

      var2.func_110329_a();
      GL11.glColorMask(true, true, true, true);
   }

   private void func_104054_c(int var1, int var2, float var3) {
      GL11.glViewport(0, 0, 256, 256);
      this.func_104053_b(var1, var2, var3);
      GL11.glDisable(3553);
      GL11.glEnable(3553);
      this.func_104052_a(var3);
      this.func_104052_a(var3);
      this.func_104052_a(var3);
      this.func_104052_a(var3);
      this.func_104052_a(var3);
      this.func_104052_a(var3);
      this.func_104052_a(var3);
      this.func_104052_a(var3);
      GL11.glViewport(0, 0, this.field_104046_e.field_105124_c, this.field_104046_e.field_105121_d);
      C_100872_azb var4 = C_100872_azb.field_110346_a;
      var4.func_110330_b();
      float var5 = this.field_104044_f > this.field_104045_g?120.0F / (float)this.field_104044_f:120.0F / (float)this.field_104045_g;
      float var6 = (float)this.field_104045_g * var5 / 256.0F;
      float var7 = (float)this.field_104044_f * var5 / 256.0F;
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      var4.func_110317_a(1.0F, 1.0F, 1.0F, 1.0F);
      int var8 = this.field_104044_f;
      int var9 = this.field_104045_g;
      var4.func_110322_a(0.0D, (double)var9, (double)this.field_103883_j, (double)(0.5F - var6), (double)(0.5F + var7));
      var4.func_110322_a((double)var8, (double)var9, (double)this.field_103883_j, (double)(0.5F - var6), (double)(0.5F - var7));
      var4.func_110322_a((double)var8, 0.0D, (double)this.field_103883_j, (double)(0.5F + var6), (double)(0.5F - var7));
      var4.func_110322_a(0.0D, 0.0D, (double)this.field_103883_j, (double)(0.5F + var6), (double)(0.5F + var7));
      var4.func_110329_a();
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104054_c(var1, var2, var3);
      C_100872_azb var4 = C_100872_azb.field_110346_a;
      short var5 = 274;
      int var6 = this.field_104044_f / 2 - var5 / 2;
      byte var7 = 30;
      this.func_103881_a(0, 0, this.field_104044_f, this.field_104045_g, -2130706433, 16777215);
      this.func_103881_a(0, 0, this.field_104044_f, this.field_104045_g, 0, Integer.MIN_VALUE);
      GL11.glBindTexture(3553, this.field_104046_e.field_105127_o.func_110367_b("/title/mclogo.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      if((double)this.field_104058_b < 1.0E-4D) {
         this.func_103877_b(var6 + 0, var7 + 0, 0, 0, 99, 44);
         this.func_103877_b(var6 + 99, var7 + 0, 129, 0, 27, 44);
         this.func_103877_b(var6 + 99 + 26, var7 + 0, 126, 0, 3, 44);
         this.func_103877_b(var6 + 99 + 26 + 3, var7 + 0, 99, 0, 26, 44);
         this.func_103877_b(var6 + 155, var7 + 0, 0, 45, 155, 44);
      } else {
         this.func_103877_b(var6 + 0, var7 + 0, 0, 0, 155, 44);
         this.func_103877_b(var6 + 155, var7 + 0, 0, 45, 155, 44);
      }

      var4.func_110326_d(16777215);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.field_104044_f / 2 + 90), 70.0F, 0.0F);
      GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
      float var8 = 1.8F - C_100650_jv.func_108927_e(C_100650_jv.func_108924_a((float)(Minecraft.func_105063_F() % 1000L) / 1000.0F * 3.1415927F * 2.0F) * 0.1F);
      var8 = var8 * 100.0F / (float)(this.field_104049_k.func_111778_a(this.field_104059_c) + 32);
      GL11.glScalef(var8, var8, var8);
      this.func_103879_a(this.field_104049_k, this.field_104059_c, 0, -8, 16776960);
      GL11.glPopMatrix();
      String var9 = "Minecraft 1.4.2";
      if(this.field_104046_e.func_105034_q()) {
         var9 = var9 + " Demo";
      }

      this.func_103880_b(this.field_104049_k, var9, 2, this.field_104045_g - 10, 16777215);
      String var10 = "Copyright Mojang AB. Do not distribute!";
      this.func_103880_b(this.field_104049_k, var10, this.field_104044_f - this.field_104049_k.func_111778_a(var10) - 2, this.field_104045_g - 10, 16777215);
      super.func_104027_a(var1, var2, var3);
   }

}
