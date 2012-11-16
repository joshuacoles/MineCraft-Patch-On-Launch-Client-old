import java.awt.image.BufferedImage;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;

public class C_100983_ayt {

   public static boolean field_111279_a = false;
   public static int field_111277_b;
   private Minecraft field_111293_r;
   private float field_111292_s = 0.0F;
   public C_100860_ayx field_111278_c;
   private int field_111291_t;
   private C_100730_lb field_111290_u = null;
   private C_100680_kc field_111289_v = new C_100680_kc();
   private C_100680_kc field_111288_w = new C_100680_kc();
   private C_100680_kc field_111305_x = new C_100680_kc();
   private C_100680_kc field_111302_y = new C_100680_kc();
   private C_100680_kc field_111301_z = new C_100680_kc();
   private C_100680_kc field_111251_A = new C_100680_kc();
   private float field_111252_B = 4.0F;
   private float field_111253_C = 4.0F;
   private float field_111247_D = 0.0F;
   private float field_111248_E = 0.0F;
   private float field_111249_F = 0.0F;
   private float field_111250_G = 0.0F;
   private float field_111258_H;
   private float field_111259_I;
   private float field_111260_J;
   private float field_111261_K;
   private float field_111254_L;
   private float field_111255_M = 0.0F;
   private float field_111256_N = 0.0F;
   private float field_111257_O = 0.0F;
   private float field_111267_P = 0.0F;
   public int field_111275_d;
   private int[] field_111266_Q;
   private float field_111269_R;
   private float field_111268_S;
   private float field_111263_T;
   private float field_111262_U;
   private float field_111265_V;
   private boolean field_111264_W = false;
   private double field_111271_X = 1.0D;
   private double field_111270_Y = 0.0D;
   private double field_111272_Z = 0.0D;
   private long field_111298_aa = Minecraft.func_105063_F();
   private long field_111299_ab = 0L;
   private boolean field_111296_ac = false;
   float field_111276_e = 0.0F;
   float field_111273_f = 0.0F;
   float field_111274_g = 0.0F;
   float field_111286_h = 0.0F;
   private Random field_111297_ad = new Random();
   private int field_111303_ae = 0;
   float[] field_111287_i;
   float[] field_111284_j;
   volatile int field_111285_k = 0;
   volatile int field_111282_l = 0;
   FloatBuffer field_111283_m = C_101209_aqk.func_112006_h(16);
   float field_111280_n;
   float field_111281_o;
   float field_111295_p;
   private float field_111304_af;
   private float field_111300_ag;
   public int field_111294_q;


   public C_100983_ayt(Minecraft var1) {
      this.field_111293_r = var1;
      this.field_111278_c = new C_100860_ayx(var1);
      this.field_111275_d = var1.field_105127_o.func_110383_a(new BufferedImage(16, 16, 1));
      this.field_111266_Q = new int[256];
   }

   public void func_111225_a() {
      this.func_111240_e();
      this.func_111232_f();
      this.field_111304_af = this.field_111300_ag;
      this.field_111253_C = this.field_111252_B;
      this.field_111248_E = this.field_111247_D;
      this.field_111250_G = this.field_111249_F;
      this.field_111256_N = this.field_111255_M;
      this.field_111267_P = this.field_111257_O;
      float var1;
      float var2;
      if(this.field_111293_r.field_105156_y.field_111713_X) {
         var1 = this.field_111293_r.field_105156_y.field_111720_c * 0.6F + 0.2F;
         var2 = var1 * var1 * var1 * 8.0F;
         this.field_111260_J = this.field_111289_v.func_109124_a(this.field_111258_H, 0.05F * var2);
         this.field_111261_K = this.field_111288_w.func_109124_a(this.field_111259_I, 0.05F * var2);
         this.field_111254_L = 0.0F;
         this.field_111258_H = 0.0F;
         this.field_111259_I = 0.0F;
      }

      if(this.field_111293_r.field_105132_h == null) {
         this.field_111293_r.field_105132_h = this.field_111293_r.field_105120_g;
      }

      var1 = this.field_111293_r.field_105122_e.func_109354_o(C_100650_jv.func_108910_c(this.field_111293_r.field_105132_h.field_103221_t), C_100650_jv.func_108910_c(this.field_111293_r.field_105132_h.field_103219_u), C_100650_jv.func_108910_c(this.field_111293_r.field_105132_h.field_103217_v));
      var2 = (float)(3 - this.field_111293_r.field_105156_y.field_111718_e) / 3.0F;
      float var3 = var1 * (1.0F - var2) + var2;
      this.field_111300_ag += (var3 - this.field_111300_ag) * 0.1F;
      ++this.field_111291_t;
      this.field_111278_c.func_110248_a();
      this.func_111235_g();
      this.field_111265_V = this.field_111262_U;
      if(C_100962_ayo.field_111154_d) {
         this.field_111262_U += 0.05F;
         if(this.field_111262_U > 1.0F) {
            this.field_111262_U = 1.0F;
         }

         C_100962_ayo.field_111154_d = false;
      } else if(this.field_111262_U > 0.0F) {
         this.field_111262_U -= 0.0125F;
      }

   }

   public void func_111236_a(float var1) {
      if(this.field_111293_r.field_105132_h != null) {
         if(this.field_111293_r.field_105122_e != null) {
            double var2 = (double)this.field_111293_r.field_105123_b.func_111069_d();
            this.field_111293_r.field_105158_x = this.field_111293_r.field_105132_h.func_103367_a(var2, var1);
            double var4 = var2;
            C_100387_amw var6 = this.field_111293_r.field_105132_h.func_103348_h(var1);
            if(this.field_111293_r.field_105123_b.func_111058_i()) {
               var2 = 6.0D;
               var4 = 6.0D;
            } else {
               if(var2 > 3.0D) {
                  var4 = 3.0D;
               }

               var2 = var4;
            }

            if(this.field_111293_r.field_105158_x != null) {
               var4 = this.field_111293_r.field_105158_x.field_107834_f.func_107853_d(var6);
            }

            C_100387_amw var7 = this.field_111293_r.field_105132_h.func_103375_i(var1);
            C_100387_amw var8 = var6.func_107856_c(var7.field_107872_c * var2, var7.field_107869_d * var2, var7.field_107870_e * var2);
            this.field_111290_u = null;
            float var9 = 1.0F;
            List var10 = this.field_111293_r.field_105122_e.func_109449_b(this.field_111293_r.field_105132_h, this.field_111293_r.field_105132_h.field_103173_D.func_107903_a(var7.field_107872_c * var2, var7.field_107869_d * var2, var7.field_107870_e * var2).func_107895_b((double)var9, (double)var9, (double)var9));
            double var11 = var4;
            Iterator var13 = var10.iterator();

            while(var13.hasNext()) {
               C_100730_lb var14 = (C_100730_lb)var13.next();
               if(var14.func_103123_L()) {
                  float var15 = var14.func_103166_Y();
                  C_100412_amr var16 = var14.field_103173_D.func_107895_b((double)var15, (double)var15, (double)var15);
                  C_100383_amu var17 = var16.func_107902_a(var6, var8);
                  if(var16.func_107901_a(var6)) {
                     if(0.0D < var11 || var11 == 0.0D) {
                        this.field_111290_u = var14;
                        var11 = 0.0D;
                     }
                  } else if(var17 != null) {
                     double var18 = var6.func_107853_d(var17.field_107834_f);
                     if(var18 < var11 || var11 == 0.0D) {
                        this.field_111290_u = var14;
                        var11 = var18;
                     }
                  }
               }
            }

            if(this.field_111290_u != null && (var11 < var4 || this.field_111293_r.field_105158_x == null)) {
               this.field_111293_r.field_105158_x = new C_100383_amu(this.field_111290_u);
            }

         }
      }
   }

   private void func_111240_e() {
      C_100966_aym var1 = (C_100966_aym)this.field_111293_r.field_105132_h;
      this.field_111263_T = var1.func_104540_f();
      this.field_111268_S = this.field_111269_R;
      this.field_111269_R += (this.field_111263_T - this.field_111269_R) * 0.5F;
   }

   private float func_111244_a(float var1, boolean var2) {
      if(this.field_111294_q > 0) {
         return 90.0F;
      } else {
         C_101095_qg var3 = (C_101095_qg)this.field_111293_r.field_105132_h;
         float var4 = 70.0F;
         if(var2) {
            var4 += this.field_111293_r.field_105156_y.field_111746_ab * 40.0F;
            var4 *= this.field_111268_S + (this.field_111269_R - this.field_111268_S) * var1;
         }

         if(var3.func_103330_aT() <= 0) {
            float var5 = (float)var3.field_103433_aX + var1;
            var4 /= (1.0F - 500.0F / (var5 + 500.0F)) * 2.0F + 1.0F;
         }

         int var6 = C_101203_aqb.func_111968_a(this.field_111293_r.field_105122_e, var3, var1);
         if(var6 != 0 && C_100451_alf.field_106118_p[var6].field_106204_cB == C_100664_afg.field_109019_h) {
            var4 = var4 * 60.0F / 70.0F;
         }

         return var4 + this.field_111256_N + (this.field_111255_M - this.field_111256_N) * var1;
      }
   }

   private void func_111245_e(float var1) {
      C_100595_ln var2 = this.field_111293_r.field_105132_h;
      float var3 = (float)var2.field_103432_aU - var1;
      float var4;
      if(var2.func_103330_aT() <= 0) {
         var4 = (float)var2.field_103433_aX + var1;
         GL11.glRotatef(40.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
      }

      if(var3 >= 0.0F) {
         var3 /= (float)var2.field_103431_aV;
         var3 = C_100650_jv.func_108924_a(var3 * var3 * var3 * var3 * 3.1415927F);
         var4 = var2.field_103434_aW;
         GL11.glRotatef(-var4, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(var4, 0.0F, 1.0F, 0.0F);
      }
   }

   private void func_111238_f(float var1) {
      if(this.field_111293_r.field_105132_h instanceof C_101095_qg) {
         C_101095_qg var2 = (C_101095_qg)this.field_111293_r.field_105132_h;
         float var3 = var2.field_103192_Q - var2.field_103193_P;
         float var4 = -(var2.field_103192_Q + var3 * var1);
         float var5 = var2.field_103849_bR + (var2.field_103848_bS - var2.field_103849_bR) * var1;
         float var6 = var2.field_103424_aZ + (var2.field_103458_ba - var2.field_103424_aZ) * var1;
         GL11.glTranslatef(C_100650_jv.func_108924_a(var4 * 3.1415927F) * var5 * 0.5F, -Math.abs(C_100650_jv.func_108928_b(var4 * 3.1415927F) * var5), 0.0F);
         GL11.glRotatef(C_100650_jv.func_108924_a(var4 * 3.1415927F) * var5 * 3.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(Math.abs(C_100650_jv.func_108928_b(var4 * 3.1415927F - 0.2F) * var5) * 5.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var6, 1.0F, 0.0F, 0.0F);
      }
   }

   private void func_111229_g(float var1) {
      C_100595_ln var2 = this.field_111293_r.field_105132_h;
      float var3 = var2.field_103181_M - 1.62F;
      double var4 = var2.field_103227_q + (var2.field_103221_t - var2.field_103227_q) * (double)var1;
      double var6 = var2.field_103225_r + (var2.field_103219_u - var2.field_103225_r) * (double)var1 - (double)var3;
      double var8 = var2.field_103223_s + (var2.field_103217_v - var2.field_103223_s) * (double)var1;
      GL11.glRotatef(this.field_111267_P + (this.field_111257_O - this.field_111267_P) * var1, 0.0F, 0.0F, 1.0F);
      if(var2.func_103369_bt()) {
         var3 = (float)((double)var3 + 1.0D);
         GL11.glTranslatef(0.0F, 0.3F, 0.0F);
         if(!this.field_111293_r.field_105156_y.field_111712_Y) {
            int var10 = this.field_111293_r.field_105122_e.func_109349_a(C_100650_jv.func_108910_c(var2.field_103221_t), C_100650_jv.func_108910_c(var2.field_103219_u), C_100650_jv.func_108910_c(var2.field_103217_v));
            if(var10 == C_100451_alf.field_106089_V.field_106162_cm) {
               int var11 = this.field_111293_r.field_105122_e.func_109357_g(C_100650_jv.func_108910_c(var2.field_103221_t), C_100650_jv.func_108910_c(var2.field_103219_u), C_100650_jv.func_108910_c(var2.field_103217_v));
               int var12 = var11 & 3;
               GL11.glRotatef((float)(var12 * 90), 0.0F, 1.0F, 0.0F);
            }

            GL11.glRotatef(var2.field_103178_B + (var2.field_103236_z - var2.field_103178_B) * var1 + 180.0F, 0.0F, -1.0F, 0.0F);
            GL11.glRotatef(var2.field_103179_C + (var2.field_103177_A - var2.field_103179_C) * var1, -1.0F, 0.0F, 0.0F);
         }
      } else if(this.field_111293_r.field_105156_y.field_111710_S > 0) {
         double var27 = (double)(this.field_111253_C + (this.field_111252_B - this.field_111253_C) * var1);
         float var13;
         float var28;
         if(this.field_111293_r.field_105156_y.field_111712_Y) {
            var28 = this.field_111248_E + (this.field_111247_D - this.field_111248_E) * var1;
            var13 = this.field_111250_G + (this.field_111249_F - this.field_111250_G) * var1;
            GL11.glTranslatef(0.0F, 0.0F, (float)(-var27));
            GL11.glRotatef(var13, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var28, 0.0F, 1.0F, 0.0F);
         } else {
            var28 = var2.field_103236_z;
            var13 = var2.field_103177_A;
            if(this.field_111293_r.field_105156_y.field_111710_S == 2) {
               var13 += 180.0F;
            }

            double var14 = (double)(-C_100650_jv.func_108924_a(var28 / 180.0F * 3.1415927F) * C_100650_jv.func_108928_b(var13 / 180.0F * 3.1415927F)) * var27;
            double var16 = (double)(C_100650_jv.func_108928_b(var28 / 180.0F * 3.1415927F) * C_100650_jv.func_108928_b(var13 / 180.0F * 3.1415927F)) * var27;
            double var18 = (double)(-C_100650_jv.func_108924_a(var13 / 180.0F * 3.1415927F)) * var27;

            for(int var20 = 0; var20 < 8; ++var20) {
               float var21 = (float)((var20 & 1) * 2 - 1);
               float var22 = (float)((var20 >> 1 & 1) * 2 - 1);
               float var23 = (float)((var20 >> 2 & 1) * 2 - 1);
               var21 *= 0.1F;
               var22 *= 0.1F;
               var23 *= 0.1F;
               C_100383_amu var24 = this.field_111293_r.field_105122_e.func_109522_a(this.field_111293_r.field_105122_e.func_109363_R().func_107878_a(var4 + (double)var21, var6 + (double)var22, var8 + (double)var23), this.field_111293_r.field_105122_e.func_109363_R().func_107878_a(var4 - var14 + (double)var21 + (double)var23, var6 - var18 + (double)var22, var8 - var16 + (double)var23));
               if(var24 != null) {
                  double var25 = var24.field_107834_f.func_107853_d(this.field_111293_r.field_105122_e.func_109363_R().func_107878_a(var4, var6, var8));
                  if(var25 < var27) {
                     var27 = var25;
                  }
               }
            }

            if(this.field_111293_r.field_105156_y.field_111710_S == 2) {
               GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            }

            GL11.glRotatef(var2.field_103177_A - var13, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var2.field_103236_z - var28, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, 0.0F, (float)(-var27));
            GL11.glRotatef(var28 - var2.field_103236_z, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var13 - var2.field_103177_A, 1.0F, 0.0F, 0.0F);
         }
      } else {
         GL11.glTranslatef(0.0F, 0.0F, -0.1F);
      }

      if(!this.field_111293_r.field_105156_y.field_111712_Y) {
         GL11.glRotatef(var2.field_103179_C + (var2.field_103177_A - var2.field_103179_C) * var1, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var2.field_103178_B + (var2.field_103236_z - var2.field_103178_B) * var1 + 180.0F, 0.0F, 1.0F, 0.0F);
      }

      GL11.glTranslatef(0.0F, var3, 0.0F);
      var4 = var2.field_103227_q + (var2.field_103221_t - var2.field_103227_q) * (double)var1;
      var6 = var2.field_103225_r + (var2.field_103219_u - var2.field_103225_r) * (double)var1 - (double)var3;
      var8 = var2.field_103223_s + (var2.field_103217_v - var2.field_103223_s) * (double)var1;
      this.field_111264_W = this.field_111293_r.field_105119_f.func_109716_a(var4, var6, var8, var1);
   }

   private void func_111242_a(float var1, int var2) {
      this.field_111292_s = (float)(256 >> this.field_111293_r.field_105156_y.field_111718_e);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      float var3 = 0.07F;
      if(this.field_111293_r.field_105156_y.field_111716_g) {
         GL11.glTranslatef((float)(-(var2 * 2 - 1)) * var3, 0.0F, 0.0F);
      }

      if(this.field_111271_X != 1.0D) {
         GL11.glTranslatef((float)this.field_111270_Y, (float)(-this.field_111272_Z), 0.0F);
         GL11.glScaled(this.field_111271_X, this.field_111271_X, 1.0D);
      }

      GLU.gluPerspective(this.func_111244_a(var1, true), (float)this.field_111293_r.field_105124_c / (float)this.field_111293_r.field_105121_d, 0.05F, this.field_111292_s * 2.0F);
      float var4;
      if(this.field_111293_r.field_105123_b.func_111057_a()) {
         var4 = 0.6666667F;
         GL11.glScalef(1.0F, var4, 1.0F);
      }

      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      if(this.field_111293_r.field_105156_y.field_111716_g) {
         GL11.glTranslatef((float)(var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
      }

      this.func_111245_e(var1);
      if(this.field_111293_r.field_105156_y.field_111715_f) {
         this.func_111238_f(var1);
      }

      var4 = this.field_111293_r.field_105120_g.field_104555_cm + (this.field_111293_r.field_105120_g.field_104549_j - this.field_111293_r.field_105120_g.field_104555_cm) * var1;
      if(var4 > 0.0F) {
         byte var5 = 20;
         if(this.field_111293_r.field_105120_g.func_103300_a(C_100690_kw.field_109175_k)) {
            var5 = 7;
         }

         float var6 = 5.0F / (var4 * var4 + 5.0F) - var4 * 0.04F;
         var6 *= var6;
         GL11.glRotatef(((float)this.field_111291_t + var1) * (float)var5, 0.0F, 1.0F, 1.0F);
         GL11.glScalef(1.0F / var6, 1.0F, 1.0F);
         GL11.glRotatef(-((float)this.field_111291_t + var1) * (float)var5, 0.0F, 1.0F, 1.0F);
      }

      this.func_111229_g(var1);
      if(this.field_111294_q > 0) {
         int var7 = this.field_111294_q - 1;
         if(var7 == 1) {
            GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
         }

         if(var7 == 2) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         }

         if(var7 == 3) {
            GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         }

         if(var7 == 4) {
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
         }

         if(var7 == 5) {
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
         }
      }

   }

   private void func_111239_b(float var1, int var2) {
      if(this.field_111294_q <= 0) {
         GL11.glMatrixMode(5889);
         GL11.glLoadIdentity();
         float var3 = 0.07F;
         if(this.field_111293_r.field_105156_y.field_111716_g) {
            GL11.glTranslatef((float)(-(var2 * 2 - 1)) * var3, 0.0F, 0.0F);
         }

         if(this.field_111271_X != 1.0D) {
            GL11.glTranslatef((float)this.field_111270_Y, (float)(-this.field_111272_Z), 0.0F);
            GL11.glScaled(this.field_111271_X, this.field_111271_X, 1.0D);
         }

         GLU.gluPerspective(this.func_111244_a(var1, false), (float)this.field_111293_r.field_105124_c / (float)this.field_111293_r.field_105121_d, 0.05F, this.field_111292_s * 2.0F);
         if(this.field_111293_r.field_105123_b.func_111057_a()) {
            float var4 = 0.6666667F;
            GL11.glScalef(1.0F, var4, 1.0F);
         }

         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         if(this.field_111293_r.field_105156_y.field_111716_g) {
            GL11.glTranslatef((float)(var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
         }

         GL11.glPushMatrix();
         this.func_111245_e(var1);
         if(this.field_111293_r.field_105156_y.field_111715_f) {
            this.func_111238_f(var1);
         }

         if(this.field_111293_r.field_105156_y.field_111710_S == 0 && !this.field_111293_r.field_105132_h.func_103369_bt() && !this.field_111293_r.field_105156_y.field_111711_R && !this.field_111293_r.field_105123_b.func_111057_a()) {
            this.func_111224_b((double)var1);
            this.field_111278_c.func_110247_a(var1);
            this.func_111246_a((double)var1);
         }

         GL11.glPopMatrix();
         if(this.field_111293_r.field_105156_y.field_111710_S == 0 && !this.field_111293_r.field_105132_h.func_103369_bt()) {
            this.field_111278_c.func_110253_b(var1);
            this.func_111245_e(var1);
         }

         if(this.field_111293_r.field_105156_y.field_111715_f) {
            this.func_111238_f(var1);
         }

      }
   }

   public void func_111246_a(double var1) {
      C_100082_bdf.func_105620_a(C_100082_bdf.field_105623_b);
      GL11.glDisable(3553);
      C_100082_bdf.func_105620_a(C_100082_bdf.field_105625_a);
   }

   public void func_111224_b(double var1) {
      C_100082_bdf.func_105620_a(C_100082_bdf.field_105623_b);
      GL11.glMatrixMode(5890);
      GL11.glLoadIdentity();
      float var3 = 0.00390625F;
      GL11.glScalef(var3, var3, var3);
      GL11.glTranslatef(8.0F, 8.0F, 8.0F);
      GL11.glMatrixMode(5888);
      this.field_111293_r.field_105127_o.func_110368_b(this.field_111275_d);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 10496);
      GL11.glTexParameteri(3553, 10243, 10496);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(3553);
      C_100082_bdf.func_105620_a(C_100082_bdf.field_105625_a);
   }

   private void func_111232_f() {
      this.field_111273_f = (float)((double)this.field_111273_f + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.field_111286_h = (float)((double)this.field_111286_h + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.field_111273_f = (float)((double)this.field_111273_f * 0.9D);
      this.field_111286_h = (float)((double)this.field_111286_h * 0.9D);
      this.field_111276_e += (this.field_111273_f - this.field_111276_e) * 1.0F;
      this.field_111274_g += (this.field_111286_h - this.field_111274_g) * 1.0F;
      this.field_111296_ac = true;
   }

   private void func_111227_h(float var1) {
      C_100942_awz var2 = this.field_111293_r.field_105122_e;
      if(var2 != null) {
         for(int var3 = 0; var3 < 256; ++var3) {
            float var4 = var2.func_109534_b(1.0F) * 0.95F + 0.05F;
            float var5 = var2.field_109576_v.field_112395_g[var3 / 16] * var4;
            float var6 = var2.field_109576_v.field_112395_g[var3 % 16] * (this.field_111276_e * 0.1F + 1.5F);
            if(var2.field_109580_r > 0) {
               var5 = var2.field_109576_v.field_112395_g[var3 / 16];
            }

            float var7 = var5 * (var2.func_109534_b(1.0F) * 0.65F + 0.35F);
            float var8 = var5 * (var2.func_109534_b(1.0F) * 0.65F + 0.35F);
            float var11 = var6 * ((var6 * 0.6F + 0.4F) * 0.6F + 0.4F);
            float var12 = var6 * (var6 * var6 * 0.6F + 0.4F);
            float var13 = var7 + var6;
            float var14 = var8 + var11;
            float var15 = var5 + var12;
            var13 = var13 * 0.96F + 0.03F;
            var14 = var14 * 0.96F + 0.03F;
            var15 = var15 * 0.96F + 0.03F;
            float var16;
            if(this.field_111262_U > 0.0F) {
               var16 = this.field_111265_V + (this.field_111262_U - this.field_111265_V) * var1;
               var13 = var13 * (1.0F - var16) + var13 * 0.7F * var16;
               var14 = var14 * (1.0F - var16) + var14 * 0.6F * var16;
               var15 = var15 * (1.0F - var16) + var15 * 0.6F * var16;
            }

            if(var2.field_109576_v.field_112401_h == 1) {
               var13 = 0.22F + var6 * 0.75F;
               var14 = 0.28F + var11 * 0.75F;
               var15 = 0.25F + var12 * 0.75F;
            }

            float var17;
            if(this.field_111293_r.field_105120_g.func_103300_a(C_100690_kw.field_109183_r)) {
               var16 = this.func_111228_a(this.field_111293_r.field_105120_g, var1);
               var17 = 1.0F / var13;
               if(var17 > 1.0F / var14) {
                  var17 = 1.0F / var14;
               }

               if(var17 > 1.0F / var15) {
                  var17 = 1.0F / var15;
               }

               var13 = var13 * (1.0F - var16) + var13 * var17 * var16;
               var14 = var14 * (1.0F - var16) + var14 * var17 * var16;
               var15 = var15 * (1.0F - var16) + var15 * var17 * var16;
            }

            if(var13 > 1.0F) {
               var13 = 1.0F;
            }

            if(var14 > 1.0F) {
               var14 = 1.0F;
            }

            if(var15 > 1.0F) {
               var15 = 1.0F;
            }

            var16 = this.field_111293_r.field_105156_y.field_111743_ac;
            var17 = 1.0F - var13;
            float var18 = 1.0F - var14;
            float var19 = 1.0F - var15;
            var17 = 1.0F - var17 * var17 * var17 * var17;
            var18 = 1.0F - var18 * var18 * var18 * var18;
            var19 = 1.0F - var19 * var19 * var19 * var19;
            var13 = var13 * (1.0F - var16) + var17 * var16;
            var14 = var14 * (1.0F - var16) + var18 * var16;
            var15 = var15 * (1.0F - var16) + var19 * var16;
            var13 = var13 * 0.96F + 0.03F;
            var14 = var14 * 0.96F + 0.03F;
            var15 = var15 * 0.96F + 0.03F;
            if(var13 > 1.0F) {
               var13 = 1.0F;
            }

            if(var14 > 1.0F) {
               var14 = 1.0F;
            }

            if(var15 > 1.0F) {
               var15 = 1.0F;
            }

            if(var13 < 0.0F) {
               var13 = 0.0F;
            }

            if(var14 < 0.0F) {
               var14 = 0.0F;
            }

            if(var15 < 0.0F) {
               var15 = 0.0F;
            }

            short var20 = 255;
            int var21 = (int)(var13 * 255.0F);
            int var22 = (int)(var14 * 255.0F);
            int var23 = (int)(var15 * 255.0F);
            this.field_111266_Q[var3] = var20 << 24 | var21 << 16 | var22 << 8 | var23;
         }

         this.field_111293_r.field_105127_o.func_110376_a(this.field_111266_Q, 16, 16, this.field_111275_d);
      }
   }

   private float func_111228_a(C_101095_qg var1, float var2) {
      int var3 = var1.func_103390_b(C_100690_kw.field_109183_r).func_109193_b();
      return var3 > 200?1.0F:0.7F + C_100650_jv.func_108924_a(((float)var3 - var2) * 3.1415927F * 0.2F) * 0.3F;
   }

   public void func_111243_b(float var1) {
      this.field_111293_r.field_105105_I.func_108901_a("lightTex");
      if(this.field_111296_ac) {
         this.func_111227_h(var1);
      }

      this.field_111293_r.field_105105_I.func_108900_b();
      boolean var2 = Display.isActive();
      if(!var2 && this.field_111293_r.field_105156_y.field_111751_y) {
         if(Minecraft.func_105063_F() - this.field_111298_aa > 500L) {
            this.field_111293_r.func_105061_j();
         }
      } else {
         this.field_111298_aa = Minecraft.func_105063_F();
      }

      this.field_111293_r.field_105105_I.func_108901_a("mouse");
      if(this.field_111293_r.field_105096_G && var2) {
         this.field_111293_r.field_105098_B.func_111757_c();
         float var3 = this.field_111293_r.field_105156_y.field_111720_c * 0.6F + 0.2F;
         float var4 = var3 * var3 * var3 * 8.0F;
         float var5 = (float)this.field_111293_r.field_105098_B.field_111760_a * var4;
         float var6 = (float)this.field_111293_r.field_105098_B.field_111758_b * var4;
         byte var7 = 1;
         if(this.field_111293_r.field_105156_y.field_111717_d) {
            var7 = -1;
         }

         if(this.field_111293_r.field_105156_y.field_111713_X) {
            this.field_111258_H += var5;
            this.field_111259_I += var6;
            float var8 = var1 - this.field_111254_L;
            this.field_111254_L = var1;
            var5 = this.field_111260_J * var8;
            var6 = this.field_111261_K * var8;
            this.field_111293_r.field_105120_g.func_103137_c(var5, var6 * (float)var7);
         } else {
            this.field_111293_r.field_105120_g.func_103137_c(var5, var6 * (float)var7);
         }
      }

      this.field_111293_r.field_105105_I.func_108900_b();
      if(!this.field_111293_r.field_105135_w) {
         field_111279_a = this.field_111293_r.field_105156_y.field_111716_g;
         C_101277_asx var9 = new C_101277_asx(this.field_111293_r.field_105156_y, this.field_111293_r.field_105124_c, this.field_111293_r.field_105121_d);
         int var10 = var9.func_112363_a();
         int var11 = var9.func_112365_b();
         int var12 = Mouse.getX() * var10 / this.field_111293_r.field_105124_c;
         int var14 = var11 - Mouse.getY() * var11 / this.field_111293_r.field_105121_d - 1;
         int var13 = func_111226_a(this.field_111293_r.field_105156_y.field_111729_i);
         if(this.field_111293_r.field_105122_e != null) {
            this.field_111293_r.field_105105_I.func_108901_a("level");
            if(this.field_111293_r.field_105156_y.field_111729_i == 0) {
               this.func_111234_a(var1, 0L);
            } else {
               this.func_111234_a(var1, this.field_111299_ab + (long)(1000000000 / var13));
            }

            this.field_111299_ab = System.nanoTime();
            this.field_111293_r.field_105105_I.func_108899_c("gui");
            if(!this.field_111293_r.field_105156_y.field_111711_R || this.field_111293_r.field_105144_r != null) {
               this.field_111293_r.field_105137_v.func_103989_a(var1, this.field_111293_r.field_105144_r != null, var12, var14);
            }

            this.field_111293_r.field_105105_I.func_108900_b();
         } else {
            GL11.glViewport(0, 0, this.field_111293_r.field_105124_c, this.field_111293_r.field_105121_d);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            this.func_111241_c();
            this.field_111299_ab = System.nanoTime();
         }

         if(this.field_111293_r.field_105144_r != null) {
            GL11.glClear(256);
            this.field_111293_r.field_105144_r.func_104027_a(var12, var14, var1);
            if(this.field_111293_r.field_105144_r != null && this.field_111293_r.field_105144_r.field_104048_l != null) {
               this.field_111293_r.field_105144_r.field_104048_l.func_104019_a(var1);
            }
         }

      }
   }

   public void func_111234_a(float var1, long var2) {
      this.field_111293_r.field_105105_I.func_108901_a("lightTex");
      if(this.field_111296_ac) {
         this.func_111227_h(var1);
      }

      GL11.glEnable(2884);
      GL11.glEnable(2929);
      if(this.field_111293_r.field_105132_h == null) {
         this.field_111293_r.field_105132_h = this.field_111293_r.field_105120_g;
      }

      this.field_111293_r.field_105105_I.func_108899_c("pick");
      this.func_111236_a(var1);
      C_100595_ln var4 = this.field_111293_r.field_105132_h;
      C_100861_ayy var5 = this.field_111293_r.field_105119_f;
      C_100990_axx var6 = this.field_111293_r.field_105133_i;
      double var7 = var4.field_103189_T + (var4.field_103221_t - var4.field_103189_T) * (double)var1;
      double var9 = var4.field_103188_U + (var4.field_103219_u - var4.field_103188_U) * (double)var1;
      double var11 = var4.field_103191_V + (var4.field_103217_v - var4.field_103191_V) * (double)var1;
      this.field_111293_r.field_105105_I.func_108899_c("center");

      for(int var13 = 0; var13 < 2; ++var13) {
         if(this.field_111293_r.field_105156_y.field_111716_g) {
            field_111277_b = var13;
            if(field_111277_b == 0) {
               GL11.glColorMask(false, true, true, false);
            } else {
               GL11.glColorMask(true, false, false, false);
            }
         }

         this.field_111293_r.field_105105_I.func_108899_c("clear");
         GL11.glViewport(0, 0, this.field_111293_r.field_105124_c, this.field_111293_r.field_105121_d);
         this.func_111233_i(var1);
         GL11.glClear(16640);
         GL11.glEnable(2884);
         this.field_111293_r.field_105105_I.func_108899_c("camera");
         this.func_111242_a(var1, var13);
         C_101203_aqb.func_111966_a(this.field_111293_r.field_105120_g, this.field_111293_r.field_105156_y.field_111710_S == 2);
         this.field_111293_r.field_105105_I.func_108899_c("frustrum");
         C_100867_azg.func_110106_a();
         if(this.field_111293_r.field_105156_y.field_111718_e < 2) {
            this.func_111230_a(-1, var1);
            this.field_111293_r.field_105105_I.func_108899_c("sky");
            var5.func_109710_a(var1);
         }

         GL11.glEnable(2912);
         this.func_111230_a(1, var1);
         if(this.field_111293_r.field_105156_y.field_111727_k) {
            GL11.glShadeModel(7425);
         }

         this.field_111293_r.field_105105_I.func_108899_c("culling");
         C_100868_azh var14 = new C_100868_azh();
         var14.func_110287_a(var7, var9, var11);
         this.field_111293_r.field_105119_f.func_109723_a(var14, var1);
         if(var13 == 0) {
            this.field_111293_r.field_105105_I.func_108899_c("updatechunks");

            while(!this.field_111293_r.field_105119_f.func_109711_a(var4, false) && var2 != 0L) {
               long var15 = var2 - System.nanoTime();
               if(var15 < 0L || var15 > 1000000000L) {
                  break;
               }
            }
         }

         if(var4.field_103219_u < 128.0D) {
            this.func_111223_a(var5, var1);
         }

         this.func_111230_a(0, var1);
         GL11.glEnable(2912);
         GL11.glBindTexture(3553, this.field_111293_r.field_105127_o.func_110367_b("/terrain.png"));
         C_101210_aqj.func_112010_a();
         this.field_111293_r.field_105105_I.func_108899_c("terrain");
         var5.func_109722_a(var4, 0, (double)var1);
         GL11.glShadeModel(7424);
         C_101095_qg var17;
         if(this.field_111294_q == 0) {
            C_101210_aqj.func_112011_b();
            this.field_111293_r.field_105105_I.func_108899_c("entities");
            var5.func_109709_a(var4.func_103348_h(var1), var14, var1);
            this.func_111224_b((double)var1);
            this.field_111293_r.field_105105_I.func_108899_c("litParticles");
            var6.func_111308_b(var4, var1);
            C_101210_aqj.func_112010_a();
            this.func_111230_a(0, var1);
            this.field_111293_r.field_105105_I.func_108899_c("particles");
            var6.func_111313_a(var4, var1);
            this.func_111246_a((double)var1);
            if(this.field_111293_r.field_105158_x != null && var4.func_103132_a(C_100664_afg.field_109019_h) && var4 instanceof C_101095_qg && !this.field_111293_r.field_105156_y.field_111711_R) {
               var17 = (C_101095_qg)var4;
               GL11.glDisable(3008);
               this.field_111293_r.field_105105_I.func_108899_c("outline");
               var5.func_109730_a(var17, this.field_111293_r.field_105158_x, 0, var17.field_103857_bK.func_104808_g(), var1);
               var5.func_109714_b(var17, this.field_111293_r.field_105158_x, 0, var17.field_103857_bK.func_104808_g(), var1);
               GL11.glEnable(3008);
            }
         }

         GL11.glDisable(3042);
         GL11.glEnable(2884);
         GL11.glBlendFunc(770, 771);
         GL11.glDepthMask(true);
         this.func_111230_a(0, var1);
         GL11.glEnable(3042);
         GL11.glDisable(2884);
         GL11.glBindTexture(3553, this.field_111293_r.field_105127_o.func_110367_b("/terrain.png"));
         if(this.field_111293_r.field_105156_y.field_111726_j) {
            this.field_111293_r.field_105105_I.func_108899_c("water");
            if(this.field_111293_r.field_105156_y.field_111727_k) {
               GL11.glShadeModel(7425);
            }

            GL11.glColorMask(false, false, false, false);
            int var18 = var5.func_109722_a(var4, 1, (double)var1);
            if(this.field_111293_r.field_105156_y.field_111716_g) {
               if(field_111277_b == 0) {
                  GL11.glColorMask(false, true, true, true);
               } else {
                  GL11.glColorMask(true, false, false, true);
               }
            } else {
               GL11.glColorMask(true, true, true, true);
            }

            if(var18 > 0) {
               var5.func_109727_a(1, (double)var1);
            }

            GL11.glShadeModel(7424);
         } else {
            this.field_111293_r.field_105105_I.func_108899_c("water");
            var5.func_109722_a(var4, 1, (double)var1);
         }

         GL11.glDepthMask(true);
         GL11.glEnable(2884);
         GL11.glDisable(3042);
         if(this.field_111271_X == 1.0D && var4 instanceof C_101095_qg && !this.field_111293_r.field_105156_y.field_111711_R && this.field_111293_r.field_105158_x != null && !var4.func_103132_a(C_100664_afg.field_109019_h)) {
            var17 = (C_101095_qg)var4;
            GL11.glDisable(3008);
            this.field_111293_r.field_105105_I.func_108899_c("outline");
            var5.func_109730_a(var17, this.field_111293_r.field_105158_x, 0, var17.field_103857_bK.func_104808_g(), var1);
            var5.func_109714_b(var17, this.field_111293_r.field_105158_x, 0, var17.field_103857_bK.func_104808_g(), var1);
            GL11.glEnable(3008);
         }

         this.field_111293_r.field_105105_I.func_108899_c("destroyProgress");
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 1);
         var5.func_109712_a(C_100872_azb.field_110346_a, (C_101095_qg)var4, var1);
         GL11.glDisable(3042);
         this.field_111293_r.field_105105_I.func_108899_c("weather");
         this.func_111237_d(var1);
         GL11.glDisable(2912);
         if(var4.field_103219_u >= 128.0D) {
            this.func_111223_a(var5, var1);
         }

         this.field_111293_r.field_105105_I.func_108899_c("hand");
         if(this.field_111271_X == 1.0D) {
            GL11.glClear(256);
            this.func_111239_b(var1, var13);
         }

         if(!this.field_111293_r.field_105156_y.field_111716_g) {
            this.field_111293_r.field_105105_I.func_108900_b();
            return;
         }
      }

      GL11.glColorMask(true, true, true, false);
      this.field_111293_r.field_105105_I.func_108900_b();
   }

   private void func_111223_a(C_100861_ayy var1, float var2) {
      if(this.field_111293_r.field_105156_y.func_111681_d()) {
         this.field_111293_r.field_105105_I.func_108899_c("clouds");
         GL11.glPushMatrix();
         this.func_111230_a(0, var2);
         GL11.glEnable(2912);
         var1.func_109713_b(var2);
         GL11.glDisable(2912);
         this.func_111230_a(1, var2);
         GL11.glPopMatrix();
      }

   }

   private void func_111235_g() {
      float var1 = this.field_111293_r.field_105122_e.func_109426_j(1.0F);
      if(!this.field_111293_r.field_105156_y.field_111726_j) {
         var1 /= 2.0F;
      }

      if(var1 != 0.0F) {
         this.field_111297_ad.setSeed((long)this.field_111291_t * 312987231L);
         C_100595_ln var2 = this.field_111293_r.field_105132_h;
         C_100942_awz var3 = this.field_111293_r.field_105122_e;
         int var4 = C_100650_jv.func_108910_c(var2.field_103221_t);
         int var5 = C_100650_jv.func_108910_c(var2.field_103219_u);
         int var6 = C_100650_jv.func_108910_c(var2.field_103217_v);
         byte var7 = 10;
         double var8 = 0.0D;
         double var10 = 0.0D;
         double var12 = 0.0D;
         int var14 = 0;
         int var15 = (int)(100.0F * var1 * var1);
         if(this.field_111293_r.field_105156_y.field_111750_ae == 1) {
            var15 >>= 1;
         } else if(this.field_111293_r.field_105156_y.field_111750_ae == 2) {
            var15 = 0;
         }

         for(int var16 = 0; var16 < var15; ++var16) {
            int var17 = var4 + this.field_111297_ad.nextInt(var7) - this.field_111297_ad.nextInt(var7);
            int var18 = var6 + this.field_111297_ad.nextInt(var7) - this.field_111297_ad.nextInt(var7);
            int var19 = var3.func_109380_h(var17, var18);
            int var20 = var3.func_109349_a(var17, var19 - 1, var18);
            C_101324_xz var21 = var3.func_109362_a(var17, var18);
            if(var19 <= var5 + var7 && var19 >= var5 - var7 && var21.func_112462_d() && var21.func_112465_j() >= 0.2F) {
               float var22 = this.field_111297_ad.nextFloat();
               float var23 = this.field_111297_ad.nextFloat();
               if(var20 > 0) {
                  if(C_100451_alf.field_106118_p[var20].field_106204_cB == C_100664_afg.field_109020_i) {
                     this.field_111293_r.field_105133_i.func_111310_a(new C_100996_ayb(var3, (double)((float)var17 + var22), (double)((float)var19 + 0.1F) - C_100451_alf.field_106118_p[var20].func_106032_x(), (double)((float)var18 + var23), 0.0D, 0.0D, 0.0D));
                  } else {
                     ++var14;
                     if(this.field_111297_ad.nextInt(var14) == 0) {
                        var8 = (double)((float)var17 + var22);
                        var10 = (double)((float)var19 + 0.1F) - C_100451_alf.field_106118_p[var20].func_106032_x();
                        var12 = (double)((float)var18 + var23);
                     }

                     this.field_111293_r.field_105133_i.func_111310_a(new C_100956_ayj(var3, (double)((float)var17 + var22), (double)((float)var19 + 0.1F) - C_100451_alf.field_106118_p[var20].func_106032_x(), (double)((float)var18 + var23)));
                  }
               }
            }
         }

         if(var14 > 0 && this.field_111297_ad.nextInt(3) < this.field_111303_ae++) {
            this.field_111303_ae = 0;
            if(var10 > var2.field_103219_u + 1.0D && var3.func_109380_h(C_100650_jv.func_108910_c(var2.field_103221_t), C_100650_jv.func_108910_c(var2.field_103217_v)) > C_100650_jv.func_108910_c(var2.field_103219_u)) {
               this.field_111293_r.field_105122_e.func_109541_b(var8, var10, var12, "ambient.weather.rain", 0.1F, 0.5F);
            } else {
               this.field_111293_r.field_105122_e.func_109541_b(var8, var10, var12, "ambient.weather.rain", 0.2F, 1.0F);
            }
         }

      }
   }

   protected void func_111237_d(float var1) {
      float var2 = this.field_111293_r.field_105122_e.func_109426_j(var1);
      if(var2 > 0.0F) {
         this.func_111224_b((double)var1);
         if(this.field_111287_i == null) {
            this.field_111287_i = new float[1024];
            this.field_111284_j = new float[1024];

            for(int var3 = 0; var3 < 32; ++var3) {
               for(int var4 = 0; var4 < 32; ++var4) {
                  float var5 = (float)(var4 - 16);
                  float var6 = (float)(var3 - 16);
                  float var7 = C_100650_jv.func_108913_c(var5 * var5 + var6 * var6);
                  this.field_111287_i[var3 << 5 | var4] = -var6 / var7;
                  this.field_111284_j[var3 << 5 | var4] = var5 / var7;
               }
            }
         }

         C_100595_ln var41 = this.field_111293_r.field_105132_h;
         C_100942_awz var42 = this.field_111293_r.field_105122_e;
         int var43 = C_100650_jv.func_108910_c(var41.field_103221_t);
         int var44 = C_100650_jv.func_108910_c(var41.field_103219_u);
         int var45 = C_100650_jv.func_108910_c(var41.field_103217_v);
         C_100872_azb var8 = C_100872_azb.field_110346_a;
         GL11.glDisable(2884);
         GL11.glNormal3f(0.0F, 1.0F, 0.0F);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glAlphaFunc(516, 0.01F);
         GL11.glBindTexture(3553, this.field_111293_r.field_105127_o.func_110367_b("/environment/snow.png"));
         double var9 = var41.field_103189_T + (var41.field_103221_t - var41.field_103189_T) * (double)var1;
         double var11 = var41.field_103188_U + (var41.field_103219_u - var41.field_103188_U) * (double)var1;
         double var13 = var41.field_103191_V + (var41.field_103217_v - var41.field_103191_V) * (double)var1;
         int var15 = C_100650_jv.func_108910_c(var11);
         byte var16 = 5;
         if(this.field_111293_r.field_105156_y.field_111726_j) {
            var16 = 10;
         }

         boolean var17 = false;
         byte var18 = -1;
         float var19 = (float)this.field_111291_t + var1;
         if(this.field_111293_r.field_105156_y.field_111726_j) {
            var16 = 10;
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var17 = false;

         for(int var20 = var45 - var16; var20 <= var45 + var16; ++var20) {
            for(int var21 = var43 - var16; var21 <= var43 + var16; ++var21) {
               int var22 = (var20 - var45 + 16) * 32 + var21 - var43 + 16;
               float var23 = this.field_111287_i[var22] * 0.5F;
               float var24 = this.field_111284_j[var22] * 0.5F;
               C_101324_xz var25 = var42.func_109362_a(var21, var20);
               if(var25.func_112462_d() || var25.func_112468_c()) {
                  int var26 = var42.func_109380_h(var21, var20);
                  int var27 = var44 - var16;
                  int var28 = var44 + var16;
                  if(var27 < var26) {
                     var27 = var26;
                  }

                  if(var28 < var26) {
                     var28 = var26;
                  }

                  float var29 = 1.0F;
                  int var30 = var26;
                  if(var26 < var15) {
                     var30 = var15;
                  }

                  if(var27 != var28) {
                     this.field_111297_ad.setSeed((long)(var21 * var21 * 3121 + var21 * 45238971 ^ var20 * var20 * 418711 + var20 * 13761));
                     float var31 = var25.func_112465_j();
                     double var35;
                     float var32;
                     if(var42.func_109465_s().func_112523_a(var31, var26) >= 0.15F) {
                        if(var18 != 0) {
                           if(var18 >= 0) {
                              var8.func_110329_a();
                           }

                           var18 = 0;
                           GL11.glBindTexture(3553, this.field_111293_r.field_105127_o.func_110367_b("/environment/rain.png"));
                           var8.func_110330_b();
                        }

                        var32 = ((float)(this.field_111291_t + var21 * var21 * 3121 + var21 * 45238971 + var20 * var20 * 418711 + var20 * 13761 & 31) + var1) / 32.0F * (3.0F + this.field_111297_ad.nextFloat());
                        double var33 = (double)((float)var21 + 0.5F) - var41.field_103221_t;
                        var35 = (double)((float)var20 + 0.5F) - var41.field_103217_v;
                        float var37 = C_100650_jv.func_108915_a(var33 * var33 + var35 * var35) / (float)var16;
                        float var38 = 1.0F;
                        var8.func_110328_c(var42.func_109355_i(var21, var30, var20, 0));
                        var8.func_110317_a(var38, var38, var38, ((1.0F - var37 * var37) * 0.5F + 0.5F) * var2);
                        var8.func_110321_b(-var9 * 1.0D, -var11 * 1.0D, -var13 * 1.0D);
                        var8.func_110322_a((double)((float)var21 - var23) + 0.5D, (double)var27, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29), (double)((float)var27 * var29 / 4.0F + var32 * var29));
                        var8.func_110322_a((double)((float)var21 + var23) + 0.5D, (double)var27, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29), (double)((float)var27 * var29 / 4.0F + var32 * var29));
                        var8.func_110322_a((double)((float)var21 + var23) + 0.5D, (double)var28, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29), (double)((float)var28 * var29 / 4.0F + var32 * var29));
                        var8.func_110322_a((double)((float)var21 - var23) + 0.5D, (double)var28, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29), (double)((float)var28 * var29 / 4.0F + var32 * var29));
                        var8.func_110321_b(0.0D, 0.0D, 0.0D);
                     } else {
                        if(var18 != 1) {
                           if(var18 >= 0) {
                              var8.func_110329_a();
                           }

                           var18 = 1;
                           GL11.glBindTexture(3553, this.field_111293_r.field_105127_o.func_110367_b("/environment/snow.png"));
                           var8.func_110330_b();
                        }

                        var32 = ((float)(this.field_111291_t & 511) + var1) / 512.0F;
                        float var46 = this.field_111297_ad.nextFloat() + var19 * 0.01F * (float)this.field_111297_ad.nextGaussian();
                        float var34 = this.field_111297_ad.nextFloat() + var19 * (float)this.field_111297_ad.nextGaussian() * 0.0010F;
                        var35 = (double)((float)var21 + 0.5F) - var41.field_103221_t;
                        double var47 = (double)((float)var20 + 0.5F) - var41.field_103217_v;
                        float var39 = C_100650_jv.func_108915_a(var35 * var35 + var47 * var47) / (float)var16;
                        float var40 = 1.0F;
                        var8.func_110328_c((var42.func_109355_i(var21, var30, var20, 0) * 3 + 15728880) / 4);
                        var8.func_110317_a(var40, var40, var40, ((1.0F - var39 * var39) * 0.3F + 0.5F) * var2);
                        var8.func_110321_b(-var9 * 1.0D, -var11 * 1.0D, -var13 * 1.0D);
                        var8.func_110322_a((double)((float)var21 - var23) + 0.5D, (double)var27, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29 + var46), (double)((float)var27 * var29 / 4.0F + var32 * var29 + var34));
                        var8.func_110322_a((double)((float)var21 + var23) + 0.5D, (double)var27, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29 + var46), (double)((float)var27 * var29 / 4.0F + var32 * var29 + var34));
                        var8.func_110322_a((double)((float)var21 + var23) + 0.5D, (double)var28, (double)((float)var20 + var24) + 0.5D, (double)(1.0F * var29 + var46), (double)((float)var28 * var29 / 4.0F + var32 * var29 + var34));
                        var8.func_110322_a((double)((float)var21 - var23) + 0.5D, (double)var28, (double)((float)var20 - var24) + 0.5D, (double)(0.0F * var29 + var46), (double)((float)var28 * var29 / 4.0F + var32 * var29 + var34));
                        var8.func_110321_b(0.0D, 0.0D, 0.0D);
                     }
                  }
               }
            }
         }

         if(var18 >= 0) {
            var8.func_110329_a();
         }

         GL11.glEnable(2884);
         GL11.glDisable(3042);
         GL11.glAlphaFunc(516, 0.1F);
         this.func_111246_a((double)var1);
      }
   }

   public void func_111241_c() {
      C_101277_asx var1 = new C_101277_asx(this.field_111293_r.field_105156_y, this.field_111293_r.field_105124_c, this.field_111293_r.field_105121_d);
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, var1.func_112364_c(), var1.func_112361_d(), 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
   }

   private void func_111233_i(float var1) {
      C_100942_awz var2 = this.field_111293_r.field_105122_e;
      C_100595_ln var3 = this.field_111293_r.field_105132_h;
      float var4 = 1.0F / (float)(4 - this.field_111293_r.field_105156_y.field_111718_e);
      var4 = 1.0F - (float)Math.pow((double)var4, 0.25D);
      C_100387_amw var5 = var2.func_109478_a(this.field_111293_r.field_105132_h, var1);
      float var6 = (float)var5.field_107872_c;
      float var7 = (float)var5.field_107869_d;
      float var8 = (float)var5.field_107870_e;
      C_100387_amw var9 = var2.func_109424_g(var1);
      this.field_111280_n = (float)var9.field_107872_c;
      this.field_111281_o = (float)var9.field_107869_d;
      this.field_111295_p = (float)var9.field_107870_e;
      float var11;
      if(this.field_111293_r.field_105156_y.field_111718_e < 2) {
         C_100387_amw var10 = C_100650_jv.func_108924_a(var2.func_109496_e(var1)) > 0.0F?var2.func_109363_R().func_107878_a(-1.0D, 0.0D, 0.0D):var2.func_109363_R().func_107878_a(1.0D, 0.0D, 0.0D);
         var11 = (float)var3.func_103375_i(var1).func_107857_b(var10);
         if(var11 < 0.0F) {
            var11 = 0.0F;
         }

         if(var11 > 0.0F) {
            float[] var12 = var2.field_109576_v.func_112378_a(var2.func_109382_c(var1), var1);
            if(var12 != null) {
               var11 *= var12[3];
               this.field_111280_n = this.field_111280_n * (1.0F - var11) + var12[0] * var11;
               this.field_111281_o = this.field_111281_o * (1.0F - var11) + var12[1] * var11;
               this.field_111295_p = this.field_111295_p * (1.0F - var11) + var12[2] * var11;
            }
         }
      }

      this.field_111280_n += (var6 - this.field_111280_n) * var4;
      this.field_111281_o += (var7 - this.field_111281_o) * var4;
      this.field_111295_p += (var8 - this.field_111295_p) * var4;
      float var19 = var2.func_109426_j(var1);
      float var20;
      if(var19 > 0.0F) {
         var11 = 1.0F - var19 * 0.5F;
         var20 = 1.0F - var19 * 0.4F;
         this.field_111280_n *= var11;
         this.field_111281_o *= var11;
         this.field_111295_p *= var20;
      }

      var11 = var2.func_109373_i(var1);
      if(var11 > 0.0F) {
         var20 = 1.0F - var11 * 0.5F;
         this.field_111280_n *= var20;
         this.field_111281_o *= var20;
         this.field_111295_p *= var20;
      }

      int var21 = C_101203_aqb.func_111968_a(this.field_111293_r.field_105122_e, var3, var1);
      if(this.field_111264_W) {
         C_100387_amw var13 = var2.func_109537_f(var1);
         this.field_111280_n = (float)var13.field_107872_c;
         this.field_111281_o = (float)var13.field_107869_d;
         this.field_111295_p = (float)var13.field_107870_e;
      } else if(var21 != 0 && C_100451_alf.field_106118_p[var21].field_106204_cB == C_100664_afg.field_109019_h) {
         this.field_111280_n = 0.02F;
         this.field_111281_o = 0.02F;
         this.field_111295_p = 0.2F;
      } else if(var21 != 0 && C_100451_alf.field_106118_p[var21].field_106204_cB == C_100664_afg.field_109020_i) {
         this.field_111280_n = 0.6F;
         this.field_111281_o = 0.1F;
         this.field_111295_p = 0.0F;
      }

      float var22 = this.field_111304_af + (this.field_111300_ag - this.field_111304_af) * var1;
      this.field_111280_n *= var22;
      this.field_111281_o *= var22;
      this.field_111295_p *= var22;
      double var14 = (var3.field_103188_U + (var3.field_103219_u - var3.field_103188_U) * (double)var1) * var2.field_109576_v.func_112384_k();
      if(var3.func_103300_a(C_100690_kw.field_109184_q)) {
         int var16 = var3.func_103390_b(C_100690_kw.field_109184_q).func_109193_b();
         if(var16 < 20) {
            var14 *= (double)(1.0F - (float)var16 / 20.0F);
         } else {
            var14 = 0.0D;
         }
      }

      if(var14 < 1.0D) {
         if(var14 < 0.0D) {
            var14 = 0.0D;
         }

         var14 *= var14;
         this.field_111280_n = (float)((double)this.field_111280_n * var14);
         this.field_111281_o = (float)((double)this.field_111281_o * var14);
         this.field_111295_p = (float)((double)this.field_111295_p * var14);
      }

      float var23;
      if(this.field_111262_U > 0.0F) {
         var23 = this.field_111265_V + (this.field_111262_U - this.field_111265_V) * var1;
         this.field_111280_n = this.field_111280_n * (1.0F - var23) + this.field_111280_n * 0.7F * var23;
         this.field_111281_o = this.field_111281_o * (1.0F - var23) + this.field_111281_o * 0.6F * var23;
         this.field_111295_p = this.field_111295_p * (1.0F - var23) + this.field_111295_p * 0.6F * var23;
      }

      float var17;
      if(var3.func_103300_a(C_100690_kw.field_109183_r)) {
         var23 = this.func_111228_a(this.field_111293_r.field_105120_g, var1);
         var17 = 1.0F / this.field_111280_n;
         if(var17 > 1.0F / this.field_111281_o) {
            var17 = 1.0F / this.field_111281_o;
         }

         if(var17 > 1.0F / this.field_111295_p) {
            var17 = 1.0F / this.field_111295_p;
         }

         this.field_111280_n = this.field_111280_n * (1.0F - var23) + this.field_111280_n * var17 * var23;
         this.field_111281_o = this.field_111281_o * (1.0F - var23) + this.field_111281_o * var17 * var23;
         this.field_111295_p = this.field_111295_p * (1.0F - var23) + this.field_111295_p * var17 * var23;
      }

      if(this.field_111293_r.field_105156_y.field_111716_g) {
         var23 = (this.field_111280_n * 30.0F + this.field_111281_o * 59.0F + this.field_111295_p * 11.0F) / 100.0F;
         var17 = (this.field_111280_n * 30.0F + this.field_111281_o * 70.0F) / 100.0F;
         float var18 = (this.field_111280_n * 30.0F + this.field_111295_p * 70.0F) / 100.0F;
         this.field_111280_n = var23;
         this.field_111281_o = var17;
         this.field_111295_p = var18;
      }

      GL11.glClearColor(this.field_111280_n, this.field_111281_o, this.field_111295_p, 0.0F);
   }

   private void func_111230_a(int var1, float var2) {
      C_100595_ln var3 = this.field_111293_r.field_105132_h;
      boolean var4 = false;
      if(var3 instanceof C_101095_qg) {
         var4 = ((C_101095_qg)var3).field_103869_cf.field_111597_d;
      }

      if(var1 == 999) {
         GL11.glFog(2918, this.func_111231_a(0.0F, 0.0F, 0.0F, 1.0F));
         GL11.glFogi(2917, 9729);
         GL11.glFogf(2915, 0.0F);
         GL11.glFogf(2916, 8.0F);
         if(GLContext.getCapabilities().GL_NV_fog_distance) {
            GL11.glFogi('\u855a', '\u855b');
         }

         GL11.glFogf(2915, 0.0F);
      } else {
         GL11.glFog(2918, this.func_111231_a(this.field_111280_n, this.field_111281_o, this.field_111295_p, 1.0F));
         GL11.glNormal3f(0.0F, -1.0F, 0.0F);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var5 = C_101203_aqb.func_111968_a(this.field_111293_r.field_105122_e, var3, var2);
         float var6;
         if(var3.func_103300_a(C_100690_kw.field_109184_q)) {
            var6 = 5.0F;
            int var7 = var3.func_103390_b(C_100690_kw.field_109184_q).func_109193_b();
            if(var7 < 20) {
               var6 = 5.0F + (this.field_111292_s - 5.0F) * (1.0F - (float)var7 / 20.0F);
            }

            GL11.glFogi(2917, 9729);
            if(var1 < 0) {
               GL11.glFogf(2915, 0.0F);
               GL11.glFogf(2916, var6 * 0.8F);
            } else {
               GL11.glFogf(2915, var6 * 0.25F);
               GL11.glFogf(2916, var6);
            }

            if(GLContext.getCapabilities().GL_NV_fog_distance) {
               GL11.glFogi('\u855a', '\u855b');
            }
         } else {
            float var8;
            float var9;
            float var10;
            float var11;
            float var12;
            if(this.field_111264_W) {
               GL11.glFogi(2917, 2048);
               GL11.glFogf(2914, 0.1F);
               var6 = 1.0F;
               var12 = 1.0F;
               var8 = 1.0F;
               if(this.field_111293_r.field_105156_y.field_111716_g) {
                  var9 = (var6 * 30.0F + var12 * 59.0F + var8 * 11.0F) / 100.0F;
                  var10 = (var6 * 30.0F + var12 * 70.0F) / 100.0F;
                  var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
               }
            } else if(var5 > 0 && C_100451_alf.field_106118_p[var5].field_106204_cB == C_100664_afg.field_109019_h) {
               GL11.glFogi(2917, 2048);
               if(var3.func_103300_a(C_100690_kw.field_109171_o)) {
                  GL11.glFogf(2914, 0.05F);
               } else {
                  GL11.glFogf(2914, 0.1F);
               }

               var6 = 0.4F;
               var12 = 0.4F;
               var8 = 0.9F;
               if(this.field_111293_r.field_105156_y.field_111716_g) {
                  var9 = (var6 * 30.0F + var12 * 59.0F + var8 * 11.0F) / 100.0F;
                  var10 = (var6 * 30.0F + var12 * 70.0F) / 100.0F;
                  var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
               }
            } else if(var5 > 0 && C_100451_alf.field_106118_p[var5].field_106204_cB == C_100664_afg.field_109020_i) {
               GL11.glFogi(2917, 2048);
               GL11.glFogf(2914, 2.0F);
               var6 = 0.4F;
               var12 = 0.3F;
               var8 = 0.3F;
               if(this.field_111293_r.field_105156_y.field_111716_g) {
                  var9 = (var6 * 30.0F + var12 * 59.0F + var8 * 11.0F) / 100.0F;
                  var10 = (var6 * 30.0F + var12 * 70.0F) / 100.0F;
                  var11 = (var6 * 30.0F + var8 * 70.0F) / 100.0F;
               }
            } else {
               var6 = this.field_111292_s;
               if(this.field_111293_r.field_105122_e.field_109576_v.func_112383_j() && !var4) {
                  double var13 = (double)((var3.func_103125_b(var2) & 15728640) >> 20) / 16.0D + (var3.field_103188_U + (var3.field_103219_u - var3.field_103188_U) * (double)var2 + 4.0D) / 32.0D;
                  if(var13 < 1.0D) {
                     if(var13 < 0.0D) {
                        var13 = 0.0D;
                     }

                     var13 *= var13;
                     var9 = 100.0F * (float)var13;
                     if(var9 < 5.0F) {
                        var9 = 5.0F;
                     }

                     if(var6 > var9) {
                        var6 = var9;
                     }
                  }
               }

               GL11.glFogi(2917, 9729);
               if(var1 < 0) {
                  GL11.glFogf(2915, 0.0F);
                  GL11.glFogf(2916, var6 * 0.8F);
               } else {
                  GL11.glFogf(2915, var6 * 0.25F);
                  GL11.glFogf(2916, var6);
               }

               if(GLContext.getCapabilities().GL_NV_fog_distance) {
                  GL11.glFogi('\u855a', '\u855b');
               }

               if(this.field_111293_r.field_105122_e.field_109576_v.func_112389_b((int)var3.field_103221_t, (int)var3.field_103217_v)) {
                  GL11.glFogf(2915, var6 * 0.05F);
                  GL11.glFogf(2916, Math.min(var6, 192.0F) * 0.5F);
               }
            }
         }

         GL11.glEnable(2903);
         GL11.glColorMaterial(1028, 4608);
      }
   }

   private FloatBuffer func_111231_a(float var1, float var2, float var3, float var4) {
      this.field_111283_m.clear();
      this.field_111283_m.put(var1).put(var2).put(var3).put(var4);
      this.field_111283_m.flip();
      return this.field_111283_m;
   }

   public static int func_111226_a(int var0) {
      short var1 = 200;
      if(var0 == 1) {
         var1 = 120;
      }

      if(var0 == 2) {
         var1 = 35;
      }

      return var1;
   }

}
