import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.ARBOcclusionQuery;
import org.lwjgl.opengl.GL11;

public class C_100861_ayy implements C_100831_xk {

   public List field_109758_a = new ArrayList();
   private C_100942_awz field_109765_h;
   private final C_100874_azc field_109766_i;
   private List field_109763_j = new ArrayList();
   private C_100975_ayp[] field_109764_k;
   private C_100975_ayp[] field_109761_l;
   private int field_109762_m;
   private int field_109759_n;
   private int field_109760_o;
   private int field_109774_p;
   private Minecraft field_109773_q;
   private C_100876_azd field_109772_r;
   private IntBuffer field_109771_s;
   private boolean field_109770_t = false;
   private int field_109769_u = 0;
   private int field_109768_v;
   private int field_109767_w;
   private int field_109777_x;
   private int field_109776_y;
   private int field_109775_z;
   private int field_109737_A;
   private int field_109738_B;
   private int field_109739_C;
   private int field_109733_D;
   private Map field_109734_E = new HashMap();
   private int field_109735_F = -1;
   private int field_109736_G = 2;
   private int field_109744_H;
   private int field_109745_I;
   private int field_109746_J;
   int[] field_109756_b = new int['\uc350'];
   IntBuffer field_109757_c = C_101209_aqk.func_112004_f(64);
   private int field_109747_K;
   private int field_109740_L;
   private int field_109741_M;
   private int field_109742_N;
   private int field_109743_O;
   private int field_109749_P;
   private int field_109748_Q;
   private List field_109751_R = new ArrayList();
   private C_100870_aza[] field_109750_S = new C_100870_aza[]{new C_100870_aza(), new C_100870_aza(), new C_100870_aza(), new C_100870_aza()};
   double field_109754_d = -9999.0D;
   double field_109755_e = -9999.0D;
   double field_109752_f = -9999.0D;
   int field_109753_g = 0;


   public C_100861_ayy(Minecraft var1, C_100874_azc var2) {
      this.field_109773_q = var1;
      this.field_109766_i = var2;
      byte var3 = 34;
      byte var4 = 32;
      this.field_109774_p = C_101209_aqk.func_112003_a(var3 * var3 * var4 * 3);
      this.field_109770_t = C_101126_arc.func_111754_a();
      if(this.field_109770_t) {
         this.field_109757_c.clear();
         this.field_109771_s = C_101209_aqk.func_112004_f(var3 * var3 * var4);
         this.field_109771_s.clear();
         this.field_109771_s.position(0);
         this.field_109771_s.limit(var3 * var3 * var4);
         ARBOcclusionQuery.glGenQueriesARB(this.field_109771_s);
      }

      this.field_109768_v = C_101209_aqk.func_112003_a(3);
      GL11.glPushMatrix();
      GL11.glNewList(this.field_109768_v, 4864);
      this.func_109726_g();
      GL11.glEndList();
      GL11.glPopMatrix();
      C_100872_azb var5 = C_100872_azb.field_110346_a;
      this.field_109767_w = this.field_109768_v + 1;
      GL11.glNewList(this.field_109767_w, 4864);
      byte var7 = 64;
      int var8 = 256 / var7 + 2;
      float var6 = 16.0F;

      int var9;
      int var10;
      for(var9 = -var7 * var8; var9 <= var7 * var8; var9 += var7) {
         for(var10 = -var7 * var8; var10 <= var7 * var8; var10 += var7) {
            var5.func_110330_b();
            var5.func_110325_a((double)(var9 + 0), (double)var6, (double)(var10 + 0));
            var5.func_110325_a((double)(var9 + var7), (double)var6, (double)(var10 + 0));
            var5.func_110325_a((double)(var9 + var7), (double)var6, (double)(var10 + var7));
            var5.func_110325_a((double)(var9 + 0), (double)var6, (double)(var10 + var7));
            var5.func_110329_a();
         }
      }

      GL11.glEndList();
      this.field_109777_x = this.field_109768_v + 2;
      GL11.glNewList(this.field_109777_x, 4864);
      var6 = -16.0F;
      var5.func_110330_b();

      for(var9 = -var7 * var8; var9 <= var7 * var8; var9 += var7) {
         for(var10 = -var7 * var8; var10 <= var7 * var8; var10 += var7) {
            var5.func_110325_a((double)(var9 + var7), (double)var6, (double)(var10 + 0));
            var5.func_110325_a((double)(var9 + 0), (double)var6, (double)(var10 + 0));
            var5.func_110325_a((double)(var9 + 0), (double)var6, (double)(var10 + var7));
            var5.func_110325_a((double)(var9 + var7), (double)var6, (double)(var10 + var7));
         }
      }

      var5.func_110329_a();
      GL11.glEndList();
   }

   private void func_109726_g() {
      Random var1 = new Random(10842L);
      C_100872_azb var2 = C_100872_azb.field_110346_a;
      var2.func_110330_b();

      for(int var3 = 0; var3 < 1500; ++var3) {
         double var4 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var8 = (double)(var1.nextFloat() * 2.0F - 1.0F);
         double var10 = (double)(0.15F + var1.nextFloat() * 0.1F);
         double var12 = var4 * var4 + var6 * var6 + var8 * var8;
         if(var12 < 1.0D && var12 > 0.01D) {
            var12 = 1.0D / Math.sqrt(var12);
            var4 *= var12;
            var6 *= var12;
            var8 *= var12;
            double var14 = var4 * 100.0D;
            double var16 = var6 * 100.0D;
            double var18 = var8 * 100.0D;
            double var20 = Math.atan2(var4, var8);
            double var22 = Math.sin(var20);
            double var24 = Math.cos(var20);
            double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
            double var28 = Math.sin(var26);
            double var30 = Math.cos(var26);
            double var32 = var1.nextDouble() * 3.141592653589793D * 2.0D;
            double var34 = Math.sin(var32);
            double var36 = Math.cos(var32);

            for(int var38 = 0; var38 < 4; ++var38) {
               double var39 = 0.0D;
               double var41 = (double)((var38 & 2) - 1) * var10;
               double var43 = (double)((var38 + 1 & 2) - 1) * var10;
               double var47 = var41 * var36 - var43 * var34;
               double var49 = var43 * var36 + var41 * var34;
               double var53 = var47 * var28 + var39 * var30;
               double var55 = var39 * var28 - var47 * var30;
               double var57 = var55 * var22 - var49 * var24;
               double var61 = var49 * var22 + var55 * var24;
               var2.func_110325_a(var14 + var57, var16 + var53, var18 + var61);
            }
         }
      }

      var2.func_110329_a();
   }

   public void func_109728_a(C_100942_awz var1) {
      if(this.field_109765_h != null) {
         this.field_109765_h.func_109379_b(this);
      }

      this.field_109754_d = -9999.0D;
      this.field_109755_e = -9999.0D;
      this.field_109752_f = -9999.0D;
      C_100848_azw.field_110183_a.func_110169_a(var1);
      this.field_109765_h = var1;
      this.field_109772_r = new C_100876_azd(var1);
      if(var1 != null) {
         var1.func_109521_a(this);
         this.func_109708_a();
      }

   }

   public void func_109708_a() {
      if(this.field_109765_h != null) {
         C_100451_alf.field_106080_N.func_106423_a(this.field_109773_q.field_105156_y.field_111726_j);
         this.field_109735_F = this.field_109773_q.field_105156_y.field_111718_e;
         int var2;
         int var3;
         if(this.field_109761_l != null) {
            C_100975_ayp[] var1 = this.field_109761_l;
            var2 = var1.length;

            for(var3 = 0; var3 < var2; ++var3) {
               C_100975_ayp var4 = var1[var3];
               var4.func_111183_c();
            }
         }

         int var7 = 64 << 3 - this.field_109735_F;
         if(var7 > 400) {
            var7 = 400;
         }

         this.field_109762_m = var7 / 16 + 1;
         this.field_109759_n = 16;
         this.field_109760_o = var7 / 16 + 1;
         this.field_109761_l = new C_100975_ayp[this.field_109762_m * this.field_109759_n * this.field_109760_o];
         this.field_109764_k = new C_100975_ayp[this.field_109762_m * this.field_109759_n * this.field_109760_o];
         var2 = 0;
         var3 = 0;
         this.field_109776_y = 0;
         this.field_109775_z = 0;
         this.field_109737_A = 0;
         this.field_109738_B = this.field_109762_m;
         this.field_109739_C = this.field_109759_n;
         this.field_109733_D = this.field_109760_o;

         C_100975_ayp var5;
         for(Iterator var8 = this.field_109763_j.iterator(); var8.hasNext(); var5.field_111211_q = false) {
            var5 = (C_100975_ayp)var8.next();
         }

         this.field_109763_j.clear();
         this.field_109758_a.clear();

         for(int var9 = 0; var9 < this.field_109762_m; ++var9) {
            for(int var11 = 0; var11 < this.field_109759_n; ++var11) {
               for(int var6 = 0; var6 < this.field_109760_o; ++var6) {
                  this.field_109761_l[(var6 * this.field_109759_n + var11) * this.field_109762_m + var9] = new C_100975_ayp(this.field_109765_h, this.field_109758_a, var9 * 16, var11 * 16, var6 * 16, this.field_109774_p + var2);
                  if(this.field_109770_t) {
                     this.field_109761_l[(var6 * this.field_109759_n + var11) * this.field_109762_m + var9].field_111206_v = this.field_109771_s.get(var3);
                  }

                  this.field_109761_l[(var6 * this.field_109759_n + var11) * this.field_109762_m + var9].field_111207_u = false;
                  this.field_109761_l[(var6 * this.field_109759_n + var11) * this.field_109762_m + var9].field_111208_t = true;
                  this.field_109761_l[(var6 * this.field_109759_n + var11) * this.field_109762_m + var9].field_111199_l = true;
                  this.field_109761_l[(var6 * this.field_109759_n + var11) * this.field_109762_m + var9].field_111209_s = var3++;
                  this.field_109761_l[(var6 * this.field_109759_n + var11) * this.field_109762_m + var9].func_111185_f();
                  this.field_109764_k[(var6 * this.field_109759_n + var11) * this.field_109762_m + var9] = this.field_109761_l[(var6 * this.field_109759_n + var11) * this.field_109762_m + var9];
                  this.field_109763_j.add(this.field_109761_l[(var6 * this.field_109759_n + var11) * this.field_109762_m + var9]);
                  var2 += 3;
               }
            }
         }

         if(this.field_109765_h != null) {
            C_100595_ln var10 = this.field_109773_q.field_105132_h;
            if(var10 != null) {
               this.func_109717_c(C_100650_jv.func_108910_c(var10.field_103221_t), C_100650_jv.func_108910_c(var10.field_103219_u), C_100650_jv.func_108910_c(var10.field_103217_v));
               Arrays.sort(this.field_109764_k, new C_100972_ayr(var10));
            }
         }

         this.field_109736_G = 2;
      }
   }

   public void func_109709_a(C_100387_amw var1, C_100865_azf var2, float var3) {
      if(this.field_109736_G > 0) {
         --this.field_109736_G;
      } else {
         this.field_109765_h.field_109545_E.func_108901_a("prepare");
         C_100042_bby.field_105547_a.func_105540_a(this.field_109765_h, this.field_109766_i, this.field_109773_q.field_105148_p, this.field_109773_q.field_105132_h, var3);
         C_100848_azw.field_110183_a.func_110174_a(this.field_109765_h, this.field_109766_i, this.field_109773_q.field_105148_p, this.field_109773_q.field_105132_h, this.field_109773_q.field_105156_y, var3);
         this.field_109744_H = 0;
         this.field_109745_I = 0;
         this.field_109746_J = 0;
         C_100595_ln var4 = this.field_109773_q.field_105132_h;
         C_100848_azw.field_110181_b = var4.field_103189_T + (var4.field_103221_t - var4.field_103189_T) * (double)var3;
         C_100848_azw.field_110182_c = var4.field_103188_U + (var4.field_103219_u - var4.field_103188_U) * (double)var3;
         C_100848_azw.field_110179_d = var4.field_103191_V + (var4.field_103217_v - var4.field_103191_V) * (double)var3;
         C_100042_bby.field_105545_b = var4.field_103189_T + (var4.field_103221_t - var4.field_103189_T) * (double)var3;
         C_100042_bby.field_105546_c = var4.field_103188_U + (var4.field_103219_u - var4.field_103188_U) * (double)var3;
         C_100042_bby.field_105543_d = var4.field_103191_V + (var4.field_103217_v - var4.field_103191_V) * (double)var3;
         this.field_109773_q.field_105141_t.func_111224_b((double)var3);
         this.field_109765_h.field_109545_E.func_108899_c("global");
         List var5 = this.field_109765_h.func_109392_z();
         this.field_109744_H = var5.size();

         int var6;
         C_100730_lb var7;
         for(var6 = 0; var6 < this.field_109765_h.field_109574_i.size(); ++var6) {
            var7 = (C_100730_lb)this.field_109765_h.field_109574_i.get(var6);
            ++this.field_109745_I;
            if(var7.func_103062_a(var1)) {
               C_100848_azw.field_110183_a.func_110176_a(var7, var3);
            }
         }

         this.field_109765_h.field_109545_E.func_108899_c("entities");

         for(var6 = 0; var6 < var5.size(); ++var6) {
            var7 = (C_100730_lb)var5.get(var6);
            if(var7.func_103062_a(var1) && (var7.field_103216_al || var2.func_110286_a(var7.field_103173_D)) && (var7 != this.field_109773_q.field_105132_h || this.field_109773_q.field_105156_y.field_111710_S != 0 || this.field_109773_q.field_105132_h.func_103369_bt()) && this.field_109765_h.func_109461_e(C_100650_jv.func_108910_c(var7.field_103221_t), 0, C_100650_jv.func_108910_c(var7.field_103217_v))) {
               ++this.field_109745_I;
               C_100848_azw.field_110183_a.func_110176_a(var7, var3);
            }
         }

         this.field_109765_h.field_109545_E.func_108899_c("tileentities");
         C_101210_aqj.func_112011_b();
         Iterator var8 = this.field_109758_a.iterator();

         while(var8.hasNext()) {
            C_100398_amm var9 = (C_100398_amm)var8.next();
            C_100042_bby.field_105547_a.func_105534_a(var9, var3);
         }

         this.field_109773_q.field_105141_t.func_111246_a((double)var3);
         this.field_109765_h.field_109545_E.func_108900_b();
      }
   }

   public String func_109731_c() {
      return "C: " + this.field_109742_N + "/" + this.field_109747_K + ". F: " + this.field_109740_L + ", O: " + this.field_109741_M + ", E: " + this.field_109743_O;
   }

   public String func_109718_d() {
      return "E: " + this.field_109745_I + "/" + this.field_109744_H + ". B: " + this.field_109746_J + ", I: " + (this.field_109744_H - this.field_109746_J - this.field_109745_I);
   }

   private void func_109717_c(int var1, int var2, int var3) {
      var1 -= 8;
      var2 -= 8;
      var3 -= 8;
      this.field_109776_y = Integer.MAX_VALUE;
      this.field_109775_z = Integer.MAX_VALUE;
      this.field_109737_A = Integer.MAX_VALUE;
      this.field_109738_B = Integer.MIN_VALUE;
      this.field_109739_C = Integer.MIN_VALUE;
      this.field_109733_D = Integer.MIN_VALUE;
      int var4 = this.field_109762_m * 16;
      int var5 = var4 / 2;

      for(int var6 = 0; var6 < this.field_109762_m; ++var6) {
         int var7 = var6 * 16;
         int var8 = var7 + var5 - var1;
         if(var8 < 0) {
            var8 -= var4 - 1;
         }

         var8 /= var4;
         var7 -= var8 * var4;
         if(var7 < this.field_109776_y) {
            this.field_109776_y = var7;
         }

         if(var7 > this.field_109738_B) {
            this.field_109738_B = var7;
         }

         for(int var9 = 0; var9 < this.field_109760_o; ++var9) {
            int var10 = var9 * 16;
            int var11 = var10 + var5 - var3;
            if(var11 < 0) {
               var11 -= var4 - 1;
            }

            var11 /= var4;
            var10 -= var11 * var4;
            if(var10 < this.field_109737_A) {
               this.field_109737_A = var10;
            }

            if(var10 > this.field_109733_D) {
               this.field_109733_D = var10;
            }

            for(int var12 = 0; var12 < this.field_109759_n; ++var12) {
               int var13 = var12 * 16;
               if(var13 < this.field_109775_z) {
                  this.field_109775_z = var13;
               }

               if(var13 > this.field_109739_C) {
                  this.field_109739_C = var13;
               }

               C_100975_ayp var14 = this.field_109761_l[(var9 * this.field_109759_n + var12) * this.field_109762_m + var6];
               boolean var15 = var14.field_111211_q;
               var14.func_111184_a(var7, var13, var10);
               if(!var15 && var14.field_111211_q) {
                  this.field_109763_j.add(var14);
               }
            }
         }
      }

   }

   public int func_109722_a(C_100595_ln var1, int var2, double var3) {
      this.field_109765_h.field_109545_E.func_108901_a("sortchunks");

      for(int var5 = 0; var5 < 10; ++var5) {
         this.field_109748_Q = (this.field_109748_Q + 1) % this.field_109761_l.length;
         C_100975_ayp var6 = this.field_109761_l[this.field_109748_Q];
         if(var6.field_111211_q && !this.field_109763_j.contains(var6)) {
            this.field_109763_j.add(var6);
         }
      }

      if(this.field_109773_q.field_105156_y.field_111718_e != this.field_109735_F) {
         this.func_109708_a();
      }

      if(var2 == 0) {
         this.field_109747_K = 0;
         this.field_109749_P = 0;
         this.field_109740_L = 0;
         this.field_109741_M = 0;
         this.field_109742_N = 0;
         this.field_109743_O = 0;
      }

      double var33 = var1.field_103189_T + (var1.field_103221_t - var1.field_103189_T) * var3;
      double var7 = var1.field_103188_U + (var1.field_103219_u - var1.field_103188_U) * var3;
      double var9 = var1.field_103191_V + (var1.field_103217_v - var1.field_103191_V) * var3;
      double var11 = var1.field_103221_t - this.field_109754_d;
      double var13 = var1.field_103219_u - this.field_109755_e;
      double var15 = var1.field_103217_v - this.field_109752_f;
      if(var11 * var11 + var13 * var13 + var15 * var15 > 16.0D) {
         this.field_109754_d = var1.field_103221_t;
         this.field_109755_e = var1.field_103219_u;
         this.field_109752_f = var1.field_103217_v;
         this.func_109717_c(C_100650_jv.func_108910_c(var1.field_103221_t), C_100650_jv.func_108910_c(var1.field_103219_u), C_100650_jv.func_108910_c(var1.field_103217_v));
         Arrays.sort(this.field_109764_k, new C_100972_ayr(var1));
      }

      C_101210_aqj.func_112010_a();
      byte var17 = 0;
      int var34;
      if(this.field_109770_t && this.field_109773_q.field_105156_y.field_111728_h && !this.field_109773_q.field_105156_y.field_111716_g && var2 == 0) {
         byte var18 = 0;
         int var19 = 16;
         this.func_109715_a(var18, var19);

         for(int var20 = var18; var20 < var19; ++var20) {
            this.field_109764_k[var20].field_111208_t = true;
         }

         this.field_109765_h.field_109545_E.func_108899_c("render");
         var34 = var17 + this.func_109720_a(var18, var19, var2, var3);

         do {
            this.field_109765_h.field_109545_E.func_108899_c("occ");
            int var35 = var19;
            var19 *= 2;
            if(var19 > this.field_109764_k.length) {
               var19 = this.field_109764_k.length;
            }

            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glDisable(3008);
            GL11.glDisable(2912);
            GL11.glColorMask(false, false, false, false);
            GL11.glDepthMask(false);
            this.field_109765_h.field_109545_E.func_108901_a("check");
            this.func_109715_a(var35, var19);
            this.field_109765_h.field_109545_E.func_108900_b();
            GL11.glPushMatrix();
            float var36 = 0.0F;
            float var21 = 0.0F;
            float var22 = 0.0F;

            for(int var23 = var35; var23 < var19; ++var23) {
               if(this.field_109764_k[var23].func_111178_e()) {
                  this.field_109764_k[var23].field_111199_l = false;
               } else {
                  if(!this.field_109764_k[var23].field_111199_l) {
                     this.field_109764_k[var23].field_111208_t = true;
                  }

                  if(this.field_109764_k[var23].field_111199_l && !this.field_109764_k[var23].field_111207_u) {
                     float var24 = C_100650_jv.func_108913_c(this.field_109764_k[var23].func_111179_a(var1));
                     int var25 = (int)(1.0F + var24 / 128.0F);
                     if(this.field_109769_u % var25 == var23 % var25) {
                        C_100975_ayp var26 = this.field_109764_k[var23];
                        float var27 = (float)((double)var26.field_111190_f - var33);
                        float var28 = (float)((double)var26.field_111191_g - var7);
                        float var29 = (float)((double)var26.field_111203_h - var9);
                        float var30 = var27 - var36;
                        float var31 = var28 - var21;
                        float var32 = var29 - var22;
                        if(var30 != 0.0F || var31 != 0.0F || var32 != 0.0F) {
                           GL11.glTranslatef(var30, var31, var32);
                           var36 += var30;
                           var21 += var31;
                           var22 += var32;
                        }

                        this.field_109765_h.field_109545_E.func_108901_a("bb");
                        ARBOcclusionQuery.glBeginQueryARB('\u8914', this.field_109764_k[var23].field_111206_v);
                        this.field_109764_k[var23].func_111176_d();
                        ARBOcclusionQuery.glEndQueryARB('\u8914');
                        this.field_109765_h.field_109545_E.func_108900_b();
                        this.field_109764_k[var23].field_111207_u = true;
                     }
                  }
               }
            }

            GL11.glPopMatrix();
            if(this.field_109773_q.field_105156_y.field_111716_g) {
               if(C_100983_ayt.field_111277_b == 0) {
                  GL11.glColorMask(false, true, true, true);
               } else {
                  GL11.glColorMask(true, false, false, true);
               }
            } else {
               GL11.glColorMask(true, true, true, true);
            }

            GL11.glDepthMask(true);
            GL11.glEnable(3553);
            GL11.glEnable(3008);
            GL11.glEnable(2912);
            this.field_109765_h.field_109545_E.func_108899_c("render");
            var34 += this.func_109720_a(var35, var19, var2, var3);
         } while(var19 < this.field_109764_k.length);
      } else {
         this.field_109765_h.field_109545_E.func_108899_c("render");
         var34 = var17 + this.func_109720_a(0, this.field_109764_k.length, var2, var3);
      }

      this.field_109765_h.field_109545_E.func_108900_b();
      return var34;
   }

   private void func_109715_a(int var1, int var2) {
      for(int var3 = var1; var3 < var2; ++var3) {
         if(this.field_109764_k[var3].field_111207_u) {
            this.field_109757_c.clear();
            ARBOcclusionQuery.glGetQueryObjectuARB(this.field_109764_k[var3].field_111206_v, '\u8867', this.field_109757_c);
            if(this.field_109757_c.get(0) != 0) {
               this.field_109764_k[var3].field_111207_u = false;
               this.field_109757_c.clear();
               ARBOcclusionQuery.glGetQueryObjectuARB(this.field_109764_k[var3].field_111206_v, '\u8866', this.field_109757_c);
               this.field_109764_k[var3].field_111208_t = this.field_109757_c.get(0) != 0;
            }
         }
      }

   }

   private int func_109720_a(int var1, int var2, int var3, double var4) {
      this.field_109751_R.clear();
      int var6 = 0;

      for(int var7 = var1; var7 < var2; ++var7) {
         if(var3 == 0) {
            ++this.field_109747_K;
            if(this.field_109764_k[var7].field_111200_m[var3]) {
               ++this.field_109743_O;
            } else if(!this.field_109764_k[var7].field_111199_l) {
               ++this.field_109740_L;
            } else if(this.field_109770_t && !this.field_109764_k[var7].field_111208_t) {
               ++this.field_109741_M;
            } else {
               ++this.field_109742_N;
            }
         }

         if(!this.field_109764_k[var7].field_111200_m[var3] && this.field_109764_k[var7].field_111199_l && (!this.field_109770_t || this.field_109764_k[var7].field_111208_t)) {
            int var8 = this.field_109764_k[var7].func_111181_a(var3);
            if(var8 >= 0) {
               this.field_109751_R.add(this.field_109764_k[var7]);
               ++var6;
            }
         }
      }

      C_100595_ln var19 = this.field_109773_q.field_105132_h;
      double var20 = var19.field_103189_T + (var19.field_103221_t - var19.field_103189_T) * var4;
      double var10 = var19.field_103188_U + (var19.field_103219_u - var19.field_103188_U) * var4;
      double var12 = var19.field_103191_V + (var19.field_103217_v - var19.field_103191_V) * var4;
      int var14 = 0;
      C_100870_aza[] var15 = this.field_109750_S;
      int var16 = var15.length;

      int var17;
      for(var17 = 0; var17 < var16; ++var17) {
         C_100870_aza var18 = var15[var17];
         var18.func_110304_b();
      }

      C_100975_ayp var22;
      for(Iterator var21 = this.field_109751_R.iterator(); var21.hasNext(); this.field_109750_S[var17].func_110303_a(var22.func_111181_a(var3))) {
         var22 = (C_100975_ayp)var21.next();
         var17 = -1;

         for(int var23 = 0; var23 < var14; ++var23) {
            if(this.field_109750_S[var23].func_110301_a(var22.field_111190_f, var22.field_111191_g, var22.field_111203_h)) {
               var17 = var23;
            }
         }

         if(var17 < 0) {
            var17 = var14++;
            this.field_109750_S[var17].func_110305_a(var22.field_111190_f, var22.field_111191_g, var22.field_111203_h, var20, var10, var12);
         }
      }

      this.func_109727_a(var3, var4);
      return var6;
   }

   public void func_109727_a(int var1, double var2) {
      this.field_109773_q.field_105141_t.func_111224_b(var2);
      C_100870_aza[] var4 = this.field_109750_S;
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         C_100870_aza var7 = var4[var6];
         var7.func_110302_a();
      }

      this.field_109773_q.field_105141_t.func_111246_a(var2);
   }

   public void func_109729_e() {
      ++this.field_109769_u;
      if(this.field_109769_u % 20 == 0) {
         Iterator var1 = this.field_109734_E.values().iterator();

         while(var1.hasNext()) {
            C_100737_hv var2 = (C_100737_hv)var1.next();
            int var3 = var2.func_109329_f();
            if(this.field_109769_u - var3 > 400) {
               var1.remove();
            }
         }
      }

   }

   public void func_109710_a(float var1) {
      if(this.field_109773_q.field_105122_e.field_109576_v.field_112401_h == 1) {
         GL11.glDisable(2912);
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         C_101210_aqj.func_112010_a();
         GL11.glDepthMask(false);
         this.field_109766_i.func_110368_b(this.field_109766_i.func_110367_b("/misc/tunnel.png"));
         C_100872_azb var21 = C_100872_azb.field_110346_a;

         for(int var22 = 0; var22 < 6; ++var22) {
            GL11.glPushMatrix();
            if(var22 == 1) {
               GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            }

            if(var22 == 2) {
               GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            }

            if(var22 == 3) {
               GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            }

            if(var22 == 4) {
               GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
            }

            if(var22 == 5) {
               GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
            }

            var21.func_110330_b();
            var21.func_110326_d(2631720);
            var21.func_110322_a(-100.0D, -100.0D, -100.0D, 0.0D, 0.0D);
            var21.func_110322_a(-100.0D, -100.0D, 100.0D, 0.0D, 16.0D);
            var21.func_110322_a(100.0D, -100.0D, 100.0D, 16.0D, 16.0D);
            var21.func_110322_a(100.0D, -100.0D, -100.0D, 16.0D, 0.0D);
            var21.func_110329_a();
            GL11.glPopMatrix();
         }

         GL11.glDepthMask(true);
         GL11.glEnable(3553);
         GL11.glEnable(3008);
      } else if(this.field_109773_q.field_105122_e.field_109576_v.func_112390_d()) {
         GL11.glDisable(3553);
         C_100387_amw var2 = this.field_109765_h.func_109478_a(this.field_109773_q.field_105132_h, var1);
         float var3 = (float)var2.field_107872_c;
         float var4 = (float)var2.field_107869_d;
         float var5 = (float)var2.field_107870_e;
         float var8;
         if(this.field_109773_q.field_105156_y.field_111716_g) {
            float var6 = (var3 * 30.0F + var4 * 59.0F + var5 * 11.0F) / 100.0F;
            float var7 = (var3 * 30.0F + var4 * 70.0F) / 100.0F;
            var8 = (var3 * 30.0F + var5 * 70.0F) / 100.0F;
            var3 = var6;
            var4 = var7;
            var5 = var8;
         }

         GL11.glColor3f(var3, var4, var5);
         C_100872_azb var23 = C_100872_azb.field_110346_a;
         GL11.glDepthMask(false);
         GL11.glEnable(2912);
         GL11.glColor3f(var3, var4, var5);
         GL11.glCallList(this.field_109767_w);
         GL11.glDisable(2912);
         GL11.glDisable(3008);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         C_101210_aqj.func_112010_a();
         float[] var24 = this.field_109765_h.field_109576_v.func_112378_a(this.field_109765_h.func_109382_c(var1), var1);
         float var9;
         float var10;
         float var11;
         float var12;
         if(var24 != null) {
            GL11.glDisable(3553);
            GL11.glShadeModel(7425);
            GL11.glPushMatrix();
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(C_100650_jv.func_108924_a(this.field_109765_h.func_109496_e(var1)) < 0.0F?180.0F:0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
            var8 = var24[0];
            var9 = var24[1];
            var10 = var24[2];
            float var13;
            if(this.field_109773_q.field_105156_y.field_111716_g) {
               var11 = (var8 * 30.0F + var9 * 59.0F + var10 * 11.0F) / 100.0F;
               var12 = (var8 * 30.0F + var9 * 70.0F) / 100.0F;
               var13 = (var8 * 30.0F + var10 * 70.0F) / 100.0F;
               var8 = var11;
               var9 = var12;
               var10 = var13;
            }

            var23.func_110319_b(6);
            var23.func_110317_a(var8, var9, var10, var24[3]);
            var23.func_110325_a(0.0D, 100.0D, 0.0D);
            byte var26 = 16;
            var23.func_110317_a(var24[0], var24[1], var24[2], 0.0F);

            for(int var27 = 0; var27 <= var26; ++var27) {
               var13 = (float)var27 * 3.1415927F * 2.0F / (float)var26;
               float var14 = C_100650_jv.func_108924_a(var13);
               float var15 = C_100650_jv.func_108928_b(var13);
               var23.func_110325_a((double)(var14 * 120.0F), (double)(var15 * 120.0F), (double)(-var15 * 40.0F * var24[3]));
            }

            var23.func_110329_a();
            GL11.glPopMatrix();
            GL11.glShadeModel(7424);
         }

         GL11.glEnable(3553);
         GL11.glBlendFunc(770, 1);
         GL11.glPushMatrix();
         var8 = 1.0F - this.field_109765_h.func_109426_j(var1);
         var9 = 0.0F;
         var10 = 0.0F;
         var11 = 0.0F;
         GL11.glColor4f(1.0F, 1.0F, 1.0F, var8);
         GL11.glTranslatef(var9, var10, var11);
         GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.field_109765_h.func_109382_c(var1) * 360.0F, 1.0F, 0.0F, 0.0F);
         var12 = 30.0F;
         GL11.glBindTexture(3553, this.field_109766_i.func_110367_b("/terrain/sun.png"));
         var23.func_110330_b();
         var23.func_110322_a((double)(-var12), 100.0D, (double)(-var12), 0.0D, 0.0D);
         var23.func_110322_a((double)var12, 100.0D, (double)(-var12), 1.0D, 0.0D);
         var23.func_110322_a((double)var12, 100.0D, (double)var12, 1.0D, 1.0D);
         var23.func_110322_a((double)(-var12), 100.0D, (double)var12, 0.0D, 1.0D);
         var23.func_110329_a();
         var12 = 20.0F;
         GL11.glBindTexture(3553, this.field_109766_i.func_110367_b("/terrain/moon_phases.png"));
         int var28 = this.field_109765_h.func_109415_d(var1);
         int var30 = var28 % 4;
         int var29 = var28 / 4 % 2;
         float var16 = (float)(var30 + 0) / 4.0F;
         float var17 = (float)(var29 + 0) / 2.0F;
         float var18 = (float)(var30 + 1) / 4.0F;
         float var19 = (float)(var29 + 1) / 2.0F;
         var23.func_110330_b();
         var23.func_110322_a((double)(-var12), -100.0D, (double)var12, (double)var18, (double)var19);
         var23.func_110322_a((double)var12, -100.0D, (double)var12, (double)var16, (double)var19);
         var23.func_110322_a((double)var12, -100.0D, (double)(-var12), (double)var16, (double)var17);
         var23.func_110322_a((double)(-var12), -100.0D, (double)(-var12), (double)var18, (double)var17);
         var23.func_110329_a();
         GL11.glDisable(3553);
         float var20 = this.field_109765_h.func_109438_h(var1) * var8;
         if(var20 > 0.0F) {
            GL11.glColor4f(var20, var20, var20, var20);
            GL11.glCallList(this.field_109768_v);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(3042);
         GL11.glEnable(3008);
         GL11.glEnable(2912);
         GL11.glPopMatrix();
         GL11.glDisable(3553);
         GL11.glColor3f(0.0F, 0.0F, 0.0F);
         double var25 = this.field_109773_q.field_105120_g.func_103348_h(var1).field_107869_d - this.field_109765_h.func_109384_Q();
         if(var25 < 0.0D) {
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, 12.0F, 0.0F);
            GL11.glCallList(this.field_109777_x);
            GL11.glPopMatrix();
            var10 = 1.0F;
            var11 = -((float)(var25 + 65.0D));
            var12 = -var10;
            var23.func_110330_b();
            var23.func_110332_a(0, 255);
            var23.func_110325_a((double)(-var10), (double)var11, (double)var10);
            var23.func_110325_a((double)var10, (double)var11, (double)var10);
            var23.func_110325_a((double)var10, (double)var12, (double)var10);
            var23.func_110325_a((double)(-var10), (double)var12, (double)var10);
            var23.func_110325_a((double)(-var10), (double)var12, (double)(-var10));
            var23.func_110325_a((double)var10, (double)var12, (double)(-var10));
            var23.func_110325_a((double)var10, (double)var11, (double)(-var10));
            var23.func_110325_a((double)(-var10), (double)var11, (double)(-var10));
            var23.func_110325_a((double)var10, (double)var12, (double)(-var10));
            var23.func_110325_a((double)var10, (double)var12, (double)var10);
            var23.func_110325_a((double)var10, (double)var11, (double)var10);
            var23.func_110325_a((double)var10, (double)var11, (double)(-var10));
            var23.func_110325_a((double)(-var10), (double)var11, (double)(-var10));
            var23.func_110325_a((double)(-var10), (double)var11, (double)var10);
            var23.func_110325_a((double)(-var10), (double)var12, (double)var10);
            var23.func_110325_a((double)(-var10), (double)var12, (double)(-var10));
            var23.func_110325_a((double)(-var10), (double)var12, (double)(-var10));
            var23.func_110325_a((double)(-var10), (double)var12, (double)var10);
            var23.func_110325_a((double)var10, (double)var12, (double)var10);
            var23.func_110325_a((double)var10, (double)var12, (double)(-var10));
            var23.func_110329_a();
         }

         if(this.field_109765_h.field_109576_v.func_112380_g()) {
            GL11.glColor3f(var3 * 0.2F + 0.04F, var4 * 0.2F + 0.04F, var5 * 0.6F + 0.1F);
         } else {
            GL11.glColor3f(var3, var4, var5);
         }

         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, -((float)(var25 - 16.0D)), 0.0F);
         GL11.glCallList(this.field_109777_x);
         GL11.glPopMatrix();
         GL11.glEnable(3553);
         GL11.glDepthMask(true);
      }
   }

   public void func_109713_b(float var1) {
      if(this.field_109773_q.field_105122_e.field_109576_v.func_112390_d()) {
         if(this.field_109773_q.field_105156_y.field_111726_j) {
            this.func_109732_c(var1);
         } else {
            GL11.glDisable(2884);
            float var2 = (float)(this.field_109773_q.field_105132_h.field_103188_U + (this.field_109773_q.field_105132_h.field_103219_u - this.field_109773_q.field_105132_h.field_103188_U) * (double)var1);
            byte var3 = 32;
            int var4 = 256 / var3;
            C_100872_azb var5 = C_100872_azb.field_110346_a;
            GL11.glBindTexture(3553, this.field_109766_i.func_110367_b("/environment/clouds.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            C_100387_amw var6 = this.field_109765_h.func_109537_f(var1);
            float var7 = (float)var6.field_107872_c;
            float var8 = (float)var6.field_107869_d;
            float var9 = (float)var6.field_107870_e;
            float var10;
            if(this.field_109773_q.field_105156_y.field_111716_g) {
               var10 = (var7 * 30.0F + var8 * 59.0F + var9 * 11.0F) / 100.0F;
               float var11 = (var7 * 30.0F + var8 * 70.0F) / 100.0F;
               float var12 = (var7 * 30.0F + var9 * 70.0F) / 100.0F;
               var7 = var10;
               var8 = var11;
               var9 = var12;
            }

            var10 = 4.8828125E-4F;
            double var24 = (double)((float)this.field_109769_u + var1);
            double var13 = this.field_109773_q.field_105132_h.field_103227_q + (this.field_109773_q.field_105132_h.field_103221_t - this.field_109773_q.field_105132_h.field_103227_q) * (double)var1 + var24 * 0.029999999329447746D;
            double var15 = this.field_109773_q.field_105132_h.field_103223_s + (this.field_109773_q.field_105132_h.field_103217_v - this.field_109773_q.field_105132_h.field_103223_s) * (double)var1;
            int var17 = C_100650_jv.func_108910_c(var13 / 2048.0D);
            int var18 = C_100650_jv.func_108910_c(var15 / 2048.0D);
            var13 -= (double)(var17 * 2048);
            var15 -= (double)(var18 * 2048);
            float var19 = this.field_109765_h.field_109576_v.func_112391_f() - var2 + 0.33F;
            float var20 = (float)(var13 * (double)var10);
            float var21 = (float)(var15 * (double)var10);
            var5.func_110330_b();
            var5.func_110317_a(var7, var8, var9, 0.8F);

            for(int var22 = -var3 * var4; var22 < var3 * var4; var22 += var3) {
               for(int var23 = -var3 * var4; var23 < var3 * var4; var23 += var3) {
                  var5.func_110322_a((double)(var22 + 0), (double)var19, (double)(var23 + var3), (double)((float)(var22 + 0) * var10 + var20), (double)((float)(var23 + var3) * var10 + var21));
                  var5.func_110322_a((double)(var22 + var3), (double)var19, (double)(var23 + var3), (double)((float)(var22 + var3) * var10 + var20), (double)((float)(var23 + var3) * var10 + var21));
                  var5.func_110322_a((double)(var22 + var3), (double)var19, (double)(var23 + 0), (double)((float)(var22 + var3) * var10 + var20), (double)((float)(var23 + 0) * var10 + var21));
                  var5.func_110322_a((double)(var22 + 0), (double)var19, (double)(var23 + 0), (double)((float)(var22 + 0) * var10 + var20), (double)((float)(var23 + 0) * var10 + var21));
               }
            }

            var5.func_110329_a();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(3042);
            GL11.glEnable(2884);
         }
      }
   }

   public boolean func_109716_a(double var1, double var3, double var5, float var7) {
      return false;
   }

   public void func_109732_c(float var1) {
      GL11.glDisable(2884);
      float var2 = (float)(this.field_109773_q.field_105132_h.field_103188_U + (this.field_109773_q.field_105132_h.field_103219_u - this.field_109773_q.field_105132_h.field_103188_U) * (double)var1);
      C_100872_azb var3 = C_100872_azb.field_110346_a;
      float var4 = 12.0F;
      float var5 = 4.0F;
      double var6 = (double)((float)this.field_109769_u + var1);
      double var8 = (this.field_109773_q.field_105132_h.field_103227_q + (this.field_109773_q.field_105132_h.field_103221_t - this.field_109773_q.field_105132_h.field_103227_q) * (double)var1 + var6 * 0.029999999329447746D) / (double)var4;
      double var10 = (this.field_109773_q.field_105132_h.field_103223_s + (this.field_109773_q.field_105132_h.field_103217_v - this.field_109773_q.field_105132_h.field_103223_s) * (double)var1) / (double)var4 + 0.33000001311302185D;
      float var12 = this.field_109765_h.field_109576_v.func_112391_f() - var2 + 0.33F;
      int var13 = C_100650_jv.func_108910_c(var8 / 2048.0D);
      int var14 = C_100650_jv.func_108910_c(var10 / 2048.0D);
      var8 -= (double)(var13 * 2048);
      var10 -= (double)(var14 * 2048);
      GL11.glBindTexture(3553, this.field_109766_i.func_110367_b("/environment/clouds.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      C_100387_amw var15 = this.field_109765_h.func_109537_f(var1);
      float var16 = (float)var15.field_107872_c;
      float var17 = (float)var15.field_107869_d;
      float var18 = (float)var15.field_107870_e;
      float var19;
      float var21;
      float var20;
      if(this.field_109773_q.field_105156_y.field_111716_g) {
         var19 = (var16 * 30.0F + var17 * 59.0F + var18 * 11.0F) / 100.0F;
         var20 = (var16 * 30.0F + var17 * 70.0F) / 100.0F;
         var21 = (var16 * 30.0F + var18 * 70.0F) / 100.0F;
         var16 = var19;
         var17 = var20;
         var18 = var21;
      }

      var19 = (float)(var8 * 0.0D);
      var20 = (float)(var10 * 0.0D);
      var21 = 0.00390625F;
      var19 = (float)C_100650_jv.func_108910_c(var8) * var21;
      var20 = (float)C_100650_jv.func_108910_c(var10) * var21;
      float var22 = (float)(var8 - (double)C_100650_jv.func_108910_c(var8));
      float var23 = (float)(var10 - (double)C_100650_jv.func_108910_c(var10));
      byte var24 = 8;
      byte var25 = 4;
      float var26 = 9.765625E-4F;
      GL11.glScalef(var4, 1.0F, var4);

      for(int var27 = 0; var27 < 2; ++var27) {
         if(var27 == 0) {
            GL11.glColorMask(false, false, false, false);
         } else if(this.field_109773_q.field_105156_y.field_111716_g) {
            if(C_100983_ayt.field_111277_b == 0) {
               GL11.glColorMask(false, true, true, true);
            } else {
               GL11.glColorMask(true, false, false, true);
            }
         } else {
            GL11.glColorMask(true, true, true, true);
         }

         for(int var28 = -var25 + 1; var28 <= var25; ++var28) {
            for(int var29 = -var25 + 1; var29 <= var25; ++var29) {
               var3.func_110330_b();
               float var30 = (float)(var28 * var24);
               float var31 = (float)(var29 * var24);
               float var32 = var30 - var22;
               float var33 = var31 - var23;
               if(var12 > -var5 - 1.0F) {
                  var3.func_110317_a(var16 * 0.7F, var17 * 0.7F, var18 * 0.7F, 0.8F);
                  var3.func_110323_b(0.0F, -1.0F, 0.0F);
                  var3.func_110322_a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                  var3.func_110322_a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                  var3.func_110322_a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                  var3.func_110322_a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
               }

               if(var12 <= var5 + 1.0F) {
                  var3.func_110317_a(var16, var17, var18, 0.8F);
                  var3.func_110323_b(0.0F, 1.0F, 0.0F);
                  var3.func_110322_a((double)(var32 + 0.0F), (double)(var12 + var5 - var26), (double)(var33 + (float)var24), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                  var3.func_110322_a((double)(var32 + (float)var24), (double)(var12 + var5 - var26), (double)(var33 + (float)var24), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                  var3.func_110322_a((double)(var32 + (float)var24), (double)(var12 + var5 - var26), (double)(var33 + 0.0F), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                  var3.func_110322_a((double)(var32 + 0.0F), (double)(var12 + var5 - var26), (double)(var33 + 0.0F), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
               }

               var3.func_110317_a(var16 * 0.9F, var17 * 0.9F, var18 * 0.9F, 0.8F);
               int var34;
               if(var28 > -1) {
                  var3.func_110323_b(-1.0F, 0.0F, 0.0F);

                  for(var34 = 0; var34 < var24; ++var34) {
                     var3.func_110322_a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                     var3.func_110322_a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + var5), (double)(var33 + (float)var24), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                     var3.func_110322_a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + var5), (double)(var33 + 0.0F), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                     var3.func_110322_a((double)(var32 + (float)var34 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                  }
               }

               if(var28 <= 1) {
                  var3.func_110323_b(1.0F, 0.0F, 0.0F);

                  for(var34 = 0; var34 < var24; ++var34) {
                     var3.func_110322_a((double)(var32 + (float)var34 + 1.0F - var26), (double)(var12 + 0.0F), (double)(var33 + (float)var24), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                     var3.func_110322_a((double)(var32 + (float)var34 + 1.0F - var26), (double)(var12 + var5), (double)(var33 + (float)var24), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + (float)var24) * var21 + var20));
                     var3.func_110322_a((double)(var32 + (float)var34 + 1.0F - var26), (double)(var12 + var5), (double)(var33 + 0.0F), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                     var3.func_110322_a((double)(var32 + (float)var34 + 1.0F - var26), (double)(var12 + 0.0F), (double)(var33 + 0.0F), (double)((var30 + (float)var34 + 0.5F) * var21 + var19), (double)((var31 + 0.0F) * var21 + var20));
                  }
               }

               var3.func_110317_a(var16 * 0.8F, var17 * 0.8F, var18 * 0.8F, 0.8F);
               if(var29 > -1) {
                  var3.func_110323_b(0.0F, 0.0F, -1.0F);

                  for(var34 = 0; var34 < var24; ++var34) {
                     var3.func_110322_a((double)(var32 + 0.0F), (double)(var12 + var5), (double)(var33 + (float)var34 + 0.0F), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.func_110322_a((double)(var32 + (float)var24), (double)(var12 + var5), (double)(var33 + (float)var34 + 0.0F), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.func_110322_a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + (float)var34 + 0.0F), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.func_110322_a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var34 + 0.0F), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                  }
               }

               if(var29 <= 1) {
                  var3.func_110323_b(0.0F, 0.0F, 1.0F);

                  for(var34 = 0; var34 < var24; ++var34) {
                     var3.func_110322_a((double)(var32 + 0.0F), (double)(var12 + var5), (double)(var33 + (float)var34 + 1.0F - var26), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.func_110322_a((double)(var32 + (float)var24), (double)(var12 + var5), (double)(var33 + (float)var34 + 1.0F - var26), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.func_110322_a((double)(var32 + (float)var24), (double)(var12 + 0.0F), (double)(var33 + (float)var34 + 1.0F - var26), (double)((var30 + (float)var24) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                     var3.func_110322_a((double)(var32 + 0.0F), (double)(var12 + 0.0F), (double)(var33 + (float)var34 + 1.0F - var26), (double)((var30 + 0.0F) * var21 + var19), (double)((var31 + (float)var34 + 0.5F) * var21 + var20));
                  }
               }

               var3.func_110329_a();
            }
         }
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glEnable(2884);
   }

   public boolean func_109711_a(C_100595_ln var1, boolean var2) {
      byte var3 = 2;
      C_100973_ayq var4 = new C_100973_ayq(var1);
      C_100975_ayp[] var5 = new C_100975_ayp[var3];
      ArrayList var6 = null;
      int var7 = this.field_109763_j.size();
      int var8 = 0;
      this.field_109765_h.field_109545_E.func_108901_a("nearChunksSearch");

      int var9;
      C_100975_ayp var10;
      int var11;
      int var12;
      label136:
      for(var9 = 0; var9 < var7; ++var9) {
         var10 = (C_100975_ayp)this.field_109763_j.get(var9);
         if(var10 != null) {
            if(!var2) {
               if(var10.func_111179_a(var1) > 256.0F) {
                  for(var11 = 0; var11 < var3 && (var5[var11] == null || var4.func_111174_a(var5[var11], var10) <= 0); ++var11) {
                     ;
                  }

                  --var11;
                  if(var11 > 0) {
                     var12 = var11;

                     while(true) {
                        --var12;
                        if(var12 == 0) {
                           var5[var11] = var10;
                           continue label136;
                        }

                        var5[var12 - 1] = var5[var12];
                     }
                  }
                  continue;
               }
            } else if(!var10.field_111199_l) {
               continue;
            }

            if(var6 == null) {
               var6 = new ArrayList();
            }

            ++var8;
            var6.add(var10);
            this.field_109763_j.set(var9, (Object)null);
         }
      }

      this.field_109765_h.field_109545_E.func_108900_b();
      this.field_109765_h.field_109545_E.func_108901_a("sort");
      if(var6 != null) {
         if(var6.size() > 1) {
            Collections.sort(var6, var4);
         }

         for(var9 = var6.size() - 1; var9 >= 0; --var9) {
            var10 = (C_100975_ayp)var6.get(var9);
            var10.func_111180_a();
            var10.field_111211_q = false;
         }
      }

      this.field_109765_h.field_109545_E.func_108900_b();
      var9 = 0;
      this.field_109765_h.field_109545_E.func_108901_a("rebuild");

      int var16;
      for(var16 = var3 - 1; var16 >= 0; --var16) {
         C_100975_ayp var17 = var5[var16];
         if(var17 != null) {
            if(!var17.field_111199_l && var16 != var3 - 1) {
               var5[var16] = null;
               var5[0] = null;
               break;
            }

            var5[var16].func_111180_a();
            var5[var16].field_111211_q = false;
            ++var9;
         }
      }

      this.field_109765_h.field_109545_E.func_108900_b();
      this.field_109765_h.field_109545_E.func_108901_a("cleanup");
      var16 = 0;
      var11 = 0;

      for(var12 = this.field_109763_j.size(); var16 != var12; ++var16) {
         C_100975_ayp var13 = (C_100975_ayp)this.field_109763_j.get(var16);
         if(var13 != null) {
            boolean var14 = false;

            for(int var15 = 0; var15 < var3 && !var14; ++var15) {
               if(var13 == var5[var15]) {
                  var14 = true;
               }
            }

            if(!var14) {
               if(var11 != var16) {
                  this.field_109763_j.set(var11, var13);
               }

               ++var11;
            }
         }
      }

      this.field_109765_h.field_109545_E.func_108900_b();
      this.field_109765_h.field_109545_E.func_108901_a("trim");

      while(true) {
         --var16;
         if(var16 < var11) {
            this.field_109765_h.field_109545_E.func_108900_b();
            return var7 == var8 + var9;
         }

         this.field_109763_j.remove(var16);
      }
   }

   public void func_109730_a(C_101095_qg var1, C_100383_amu var2, int var3, C_100994_tv var4, float var5) {
      C_100872_azb var6 = C_100872_azb.field_110346_a;
      GL11.glEnable(3042);
      GL11.glEnable(3008);
      GL11.glBlendFunc(770, 1);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, (C_100650_jv.func_108924_a((float)Minecraft.func_105063_F() / 100.0F) * 0.2F + 0.4F) * 0.5F);
      if(var3 != 0 && var4 != null) {
         GL11.glBlendFunc(770, 771);
         float var7 = C_100650_jv.func_108924_a((float)Minecraft.func_105063_F() / 100.0F) * 0.2F + 0.8F;
         GL11.glColor4f(var7, var7, var7, C_100650_jv.func_108924_a((float)Minecraft.func_105063_F() / 200.0F) * 0.2F + 0.5F);
         int var8 = this.field_109766_i.func_110367_b("/terrain.png");
         GL11.glBindTexture(3553, var8);
      }

      GL11.glDisable(3042);
      GL11.glDisable(3008);
   }

   public void func_109712_a(C_100872_azb var1, C_101095_qg var2, float var3) {
      double var4 = var2.field_103189_T + (var2.field_103221_t - var2.field_103189_T) * (double)var3;
      double var6 = var2.field_103188_U + (var2.field_103219_u - var2.field_103188_U) * (double)var3;
      double var8 = var2.field_103191_V + (var2.field_103217_v - var2.field_103191_V) * (double)var3;
      if(!this.field_109734_E.isEmpty()) {
         GL11.glBlendFunc(774, 768);
         int var10 = this.field_109766_i.func_110367_b("/terrain.png");
         GL11.glBindTexture(3553, var10);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
         GL11.glPushMatrix();
         GL11.glDisable(3008);
         GL11.glPolygonOffset(-3.0F, -3.0F);
         GL11.glEnable('\u8037');
         GL11.glEnable(3008);
         var1.func_110330_b();
         var1.func_110321_b(-var4, -var6, -var8);
         var1.func_110331_c();
         Iterator var11 = this.field_109734_E.values().iterator();

         while(var11.hasNext()) {
            C_100737_hv var12 = (C_100737_hv)var11.next();
            double var13 = (double)var12.func_109335_b() - var4;
            double var15 = (double)var12.func_109334_c() - var6;
            double var17 = (double)var12.func_109333_d() - var8;
            if(var13 * var13 + var15 * var15 + var17 * var17 > 1024.0D) {
               var11.remove();
            } else {
               int var19 = this.field_109765_h.func_109349_a(var12.func_109335_b(), var12.func_109334_c(), var12.func_109333_d());
               C_100451_alf var20 = var19 > 0?C_100451_alf.field_106118_p[var19]:null;
               if(var20 == null) {
                  var20 = C_100451_alf.field_106111_w;
               }

               this.field_109772_r.func_110468_a(var20, var12.func_109335_b(), var12.func_109334_c(), var12.func_109333_d(), 240 + var12.func_109331_e());
            }
         }

         var1.func_110329_a();
         var1.func_110321_b(0.0D, 0.0D, 0.0D);
         GL11.glDisable(3008);
         GL11.glPolygonOffset(0.0F, 0.0F);
         GL11.glDisable('\u8037');
         GL11.glEnable(3008);
         GL11.glDepthMask(true);
         GL11.glPopMatrix();
      }

   }

   public void func_109714_b(C_101095_qg var1, C_100383_amu var2, int var3, C_100994_tv var4, float var5) {
      if(var3 == 0 && var2.field_107840_a == C_100389_amv.field_107877_a) {
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.4F);
         GL11.glLineWidth(2.0F);
         GL11.glDisable(3553);
         GL11.glDepthMask(false);
         float var6 = 0.0020F;
         int var7 = this.field_109765_h.func_109349_a(var2.field_107838_b, var2.field_107839_c, var2.field_107836_d);
         if(var7 > 0) {
            C_100451_alf.field_106118_p[var7].func_106007_a(this.field_109765_h, var2.field_107838_b, var2.field_107839_c, var2.field_107836_d);
            double var8 = var1.field_103189_T + (var1.field_103221_t - var1.field_103189_T) * (double)var5;
            double var10 = var1.field_103188_U + (var1.field_103219_u - var1.field_103188_U) * (double)var5;
            double var12 = var1.field_103191_V + (var1.field_103217_v - var1.field_103191_V) * (double)var5;
            this.func_109719_a(C_100451_alf.field_106118_p[var7].func_106031_b_(this.field_109765_h, var2.field_107838_b, var2.field_107839_c, var2.field_107836_d).func_107895_b((double)var6, (double)var6, (double)var6).func_107891_c(-var8, -var10, -var12));
         }

         GL11.glDepthMask(true);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
      }

   }

   private void func_109719_a(C_100412_amr var1) {
      C_100872_azb var2 = C_100872_azb.field_110346_a;
      var2.func_110319_b(3);
      var2.func_110325_a(var1.field_107917_a, var1.field_107915_b, var1.field_107916_c);
      var2.func_110325_a(var1.field_107913_d, var1.field_107915_b, var1.field_107916_c);
      var2.func_110325_a(var1.field_107913_d, var1.field_107915_b, var1.field_107911_f);
      var2.func_110325_a(var1.field_107917_a, var1.field_107915_b, var1.field_107911_f);
      var2.func_110325_a(var1.field_107917_a, var1.field_107915_b, var1.field_107916_c);
      var2.func_110329_a();
      var2.func_110319_b(3);
      var2.func_110325_a(var1.field_107917_a, var1.field_107914_e, var1.field_107916_c);
      var2.func_110325_a(var1.field_107913_d, var1.field_107914_e, var1.field_107916_c);
      var2.func_110325_a(var1.field_107913_d, var1.field_107914_e, var1.field_107911_f);
      var2.func_110325_a(var1.field_107917_a, var1.field_107914_e, var1.field_107911_f);
      var2.func_110325_a(var1.field_107917_a, var1.field_107914_e, var1.field_107916_c);
      var2.func_110329_a();
      var2.func_110319_b(1);
      var2.func_110325_a(var1.field_107917_a, var1.field_107915_b, var1.field_107916_c);
      var2.func_110325_a(var1.field_107917_a, var1.field_107914_e, var1.field_107916_c);
      var2.func_110325_a(var1.field_107913_d, var1.field_107915_b, var1.field_107916_c);
      var2.func_110325_a(var1.field_107913_d, var1.field_107914_e, var1.field_107916_c);
      var2.func_110325_a(var1.field_107913_d, var1.field_107915_b, var1.field_107911_f);
      var2.func_110325_a(var1.field_107913_d, var1.field_107914_e, var1.field_107911_f);
      var2.func_110325_a(var1.field_107917_a, var1.field_107915_b, var1.field_107911_f);
      var2.func_110325_a(var1.field_107917_a, var1.field_107914_e, var1.field_107911_f);
      var2.func_110329_a();
   }

   public void func_109721_b(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = C_100650_jv.func_108917_a(var1, 16);
      int var8 = C_100650_jv.func_108917_a(var2, 16);
      int var9 = C_100650_jv.func_108917_a(var3, 16);
      int var10 = C_100650_jv.func_108917_a(var4, 16);
      int var11 = C_100650_jv.func_108917_a(var5, 16);
      int var12 = C_100650_jv.func_108917_a(var6, 16);

      for(int var13 = var7; var13 <= var10; ++var13) {
         int var14 = var13 % this.field_109762_m;
         if(var14 < 0) {
            var14 += this.field_109762_m;
         }

         for(int var15 = var8; var15 <= var11; ++var15) {
            int var16 = var15 % this.field_109759_n;
            if(var16 < 0) {
               var16 += this.field_109759_n;
            }

            for(int var17 = var9; var17 <= var12; ++var17) {
               int var18 = var17 % this.field_109760_o;
               if(var18 < 0) {
                  var18 += this.field_109760_o;
               }

               int var19 = (var18 * this.field_109759_n + var16) * this.field_109762_m + var14;
               C_100975_ayp var20 = this.field_109761_l[var19];
               if(var20 != null && !var20.field_111211_q) {
                  this.field_109763_j.add(var20);
                  var20.func_111185_f();
               }
            }
         }
      }

   }

   public void func_109705_a(int var1, int var2, int var3) {
      this.func_109721_b(var1 - 1, var2 - 1, var3 - 1, var1 + 1, var2 + 1, var3 + 1);
   }

   public void func_109707_b(int var1, int var2, int var3) {
      this.func_109721_b(var1 - 1, var2 - 1, var3 - 1, var1 + 1, var2 + 1, var3 + 1);
   }

   public void func_109702_a(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.func_109721_b(var1 - 1, var2 - 1, var3 - 1, var4 + 1, var5 + 1, var6 + 1);
   }

   public void func_109723_a(C_100865_azf var1, float var2) {
      for(int var3 = 0; var3 < this.field_109761_l.length; ++var3) {
         if(!this.field_109761_l[var3].func_111178_e() && (!this.field_109761_l[var3].field_111199_l || (var3 + this.field_109753_g & 15) == 0)) {
            this.field_109761_l[var3].func_111186_a(var1);
         }
      }

      ++this.field_109753_g;
   }

   public void func_109697_a(String var1, int var2, int var3, int var4) {
      if(var1 != null) {
         this.field_109773_q.field_105137_v.func_103993_a("C418 - " + var1);
      }

      this.field_109773_q.field_105097_A.func_105894_a(var1, (float)var2, (float)var3, (float)var4);
   }

   public void func_109699_a(String var1, double var2, double var4, double var6, float var8, float var9) {}

   public void func_109704_a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.func_109725_b(var1, var2, var4, var6, var8, var10, var12);
   }

   public C_100988_axw func_109725_b(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      if(this.field_109773_q != null && this.field_109773_q.field_105132_h != null && this.field_109773_q.field_105133_i != null) {
         int var14 = this.field_109773_q.field_105156_y.field_111750_ae;
         if(var14 == 1 && this.field_109765_h.field_109577_u.nextInt(3) == 0) {
            var14 = 2;
         }

         double var15 = this.field_109773_q.field_105132_h.field_103221_t - var2;
         double var17 = this.field_109773_q.field_105132_h.field_103219_u - var4;
         double var19 = this.field_109773_q.field_105132_h.field_103217_v - var6;
         Object var21 = null;
         if(var1.equals("hugeexplosion")) {
            this.field_109773_q.field_105133_i.func_111310_a(var21 = new C_100928_axt(this.field_109765_h, var2, var4, var6, var8, var10, var12));
         } else if(var1.equals("largeexplode")) {
            this.field_109773_q.field_105133_i.func_111310_a(var21 = new C_100930_axs(this.field_109766_i, this.field_109765_h, var2, var4, var6, var8, var10, var12));
         }

         if(var21 != null) {
            return (C_100988_axw)var21;
         } else {
            double var22 = 16.0D;
            if(var15 * var15 + var17 * var17 + var19 * var19 > var22 * var22) {
               return null;
            } else if(var14 > 1) {
               return null;
            } else {
               if(var1.equals("bubble")) {
                  var21 = new C_100911_axj(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("suspended")) {
                  var21 = new C_101002_ayf(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("depthsuspend")) {
                  var21 = new C_101003_ayg(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("townaura")) {
                  var21 = new C_101003_ayg(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("crit")) {
                  var21 = new C_100914_axl(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("magicCrit")) {
                  var21 = new C_100914_axl(this.field_109765_h, var2, var4, var6, var8, var10, var12);
                  ((C_100988_axw)var21).func_104603_b(((C_100988_axw)var21).func_104600_c() * 0.3F, ((C_100988_axw)var21).func_104598_d() * 0.8F, ((C_100988_axw)var21).func_104607_f());
                  ((C_100988_axw)var21).func_104599_a(((C_100988_axw)var21).func_104605_h() + 1);
               } else if(var1.equals("smoke")) {
                  var21 = new C_100996_ayb(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("mobSpell")) {
                  var21 = new C_101004_ayd(this.field_109765_h, var2, var4, var6, 0.0D, 0.0D, 0.0D);
                  ((C_100988_axw)var21).func_104603_b((float)var8, (float)var10, (float)var12);
               } else if(var1.equals("mobSpellAmbient")) {
                  var21 = new C_101004_ayd(this.field_109765_h, var2, var4, var6, 0.0D, 0.0D, 0.0D);
                  ((C_100988_axw)var21).func_104601_g(0.15F);
                  ((C_100988_axw)var21).func_104603_b((float)var8, (float)var10, (float)var12);
               } else if(var1.equals("spell")) {
                  var21 = new C_101004_ayd(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("instantSpell")) {
                  var21 = new C_101004_ayd(this.field_109765_h, var2, var4, var6, var8, var10, var12);
                  ((C_101004_ayd)var21).func_104662_g(144);
               } else if(var1.equals("witchMagic")) {
                  var21 = new C_101004_ayd(this.field_109765_h, var2, var4, var6, var8, var10, var12);
                  ((C_101004_ayd)var21).func_104662_g(144);
                  float var24 = this.field_109765_h.field_109577_u.nextFloat() * 0.5F + 0.35F;
                  ((C_100988_axw)var21).func_104603_b(1.0F * var24, 0.0F * var24, 1.0F * var24);
               } else if(var1.equals("note")) {
                  var21 = new C_100932_axv(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("portal")) {
                  var21 = new C_100987_axz(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("enchantmenttable")) {
                  var21 = new C_100917_axn(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("explode")) {
                  var21 = new C_100922_axo(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("flame")) {
                  var21 = new C_100920_axp(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("lava")) {
                  var21 = new C_100934_axu(this.field_109765_h, var2, var4, var6);
               } else if(var1.equals("footstep")) {
                  var21 = new C_100926_axq(this.field_109766_i, this.field_109765_h, var2, var4, var6);
               } else if(var1.equals("splash")) {
                  var21 = new C_101005_aye(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("largesmoke")) {
                  var21 = new C_100996_ayb(this.field_109765_h, var2, var4, var6, var8, var10, var12, 2.5F);
               } else if(var1.equals("cloud")) {
                  var21 = new C_100985_axy(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("reddust")) {
                  var21 = new C_101001_aya(this.field_109765_h, var2, var4, var6, (float)var8, (float)var10, (float)var12);
               } else if(var1.equals("snowballpoof")) {
                  var21 = new C_100913_axi(this.field_109765_h, var2, var4, var6, C_100992_tt.field_110916_aD);
               } else if(var1.equals("dripWater")) {
                  var21 = new C_100918_axm(this.field_109765_h, var2, var4, var6, C_100664_afg.field_109019_h);
               } else if(var1.equals("dripLava")) {
                  var21 = new C_100918_axm(this.field_109765_h, var2, var4, var6, C_100664_afg.field_109020_i);
               } else if(var1.equals("snowshovel")) {
                  var21 = new C_100998_ayc(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("slime")) {
                  var21 = new C_100913_axi(this.field_109765_h, var2, var4, var6, C_100992_tt.field_110909_aM);
               } else if(var1.equals("heart")) {
                  var21 = new C_100924_axr(this.field_109765_h, var2, var4, var6, var8, var10, var12);
               } else if(var1.equals("angryVillager")) {
                  var21 = new C_100924_axr(this.field_109765_h, var2, var4 + 0.5D, var6, var8, var10, var12);
                  ((C_100988_axw)var21).func_104599_a(81);
                  ((C_100988_axw)var21).func_104603_b(1.0F, 1.0F, 1.0F);
               } else if(var1.equals("happyVillager")) {
                  var21 = new C_101003_ayg(this.field_109765_h, var2, var4, var6, var8, var10, var12);
                  ((C_100988_axw)var21).func_104599_a(82);
                  ((C_100988_axw)var21).func_104603_b(1.0F, 1.0F, 1.0F);
               } else {
                  int var25;
                  if(var1.startsWith("iconcrack_")) {
                     var25 = Integer.parseInt(var1.substring(var1.indexOf("_") + 1));
                     var21 = new C_100913_axi(this.field_109765_h, var2, var4, var6, var8, var10, var12, C_100992_tt.field_110834_e[var25]);
                  } else if(var1.startsWith("tilecrack_")) {
                     var25 = Integer.parseInt(var1.substring(var1.indexOf("_") + 1));
                     var21 = new C_100958_ayi(this.field_109765_h, var2, var4, var6, var8, var10, var12, C_100451_alf.field_106118_p[var25], 0, 0);
                  }
               }

               if(var21 != null) {
                  this.field_109773_q.field_105133_i.func_111310_a((C_100988_axw)var21);
               }

               return (C_100988_axw)var21;
            }
         }
      } else {
         return null;
      }
   }

   public void func_109698_a(C_100730_lb var1) {
      var1.func_103072_ad();
      if(var1.field_103172_cw != null) {
         this.field_109766_i.func_110373_a(var1.field_103172_cw, new C_100862_ayz());
      }

      if(var1.field_103171_cx != null) {
         this.field_109766_i.func_110373_a(var1.field_103171_cx, new C_100862_ayz());
      }

   }

   public void func_109703_b(C_100730_lb var1) {
      if(var1.field_103172_cw != null) {
         this.field_109766_i.func_110377_d(var1.field_103172_cw);
      }

      if(var1.field_103171_cx != null) {
         this.field_109766_i.func_110377_d(var1.field_103171_cx);
      }

   }

   public void func_109724_f() {
      C_101209_aqk.func_112000_b(this.field_109774_p);
   }

   public void func_109701_a(int var1, int var2, int var3, int var4, int var5) {
      Random var6 = this.field_109765_h.field_109577_u;
      switch(var1) {
      case 1013:
      case 1018:
         if(this.field_109773_q.field_105132_h != null) {
            double var7 = (double)var2 - this.field_109773_q.field_105132_h.field_103221_t;
            double var9 = (double)var3 - this.field_109773_q.field_105132_h.field_103219_u;
            double var11 = (double)var4 - this.field_109773_q.field_105132_h.field_103217_v;
            double var13 = Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
            double var15 = this.field_109773_q.field_105132_h.field_103221_t;
            double var17 = this.field_109773_q.field_105132_h.field_103219_u;
            double var19 = this.field_109773_q.field_105132_h.field_103217_v;
            if(var13 > 0.0D) {
               var15 += var7 / var13 * 2.0D;
               var17 += var9 / var13 * 2.0D;
               var19 += var11 / var13 * 2.0D;
            }

            if(var1 == 1013) {
               this.field_109765_h.func_109541_b(var15, var17, var19, "mob.wither.spawn", 1.0F, 1.0F);
            } else if(var1 == 1018) {
               this.field_109765_h.func_109541_b(var15, var17, var19, "mob.enderdragon.end", 5.0F, 1.0F);
            }
         }
      default:
      }
   }

   public void func_109700_a(C_101095_qg var1, int var2, int var3, int var4, int var5, int var6) {
      Random var7 = this.field_109765_h.field_109577_u;
      double var8;
      double var10;
      double var12;
      String var14;
      int var15;
      int var20;
      double var23;
      double var25;
      double var27;
      double var29;
      double var39;
      switch(var2) {
      case 1000:
         this.field_109765_h.func_109541_b((double)var3, (double)var4, (double)var5, "random.click", 1.0F, 1.0F);
         break;
      case 1001:
         this.field_109765_h.func_109541_b((double)var3, (double)var4, (double)var5, "random.click", 1.0F, 1.2F);
         break;
      case 1002:
         this.field_109765_h.func_109541_b((double)var3, (double)var4, (double)var5, "random.bow", 1.0F, 1.2F);
         break;
      case 1003:
         if(Math.random() < 0.5D) {
            this.field_109765_h.func_109541_b((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "random.door_open", 1.0F, this.field_109765_h.field_109577_u.nextFloat() * 0.1F + 0.9F);
         } else {
            this.field_109765_h.func_109541_b((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "random.door_close", 1.0F, this.field_109765_h.field_109577_u.nextFloat() * 0.1F + 0.9F);
         }
         break;
      case 1004:
         this.field_109765_h.func_109541_b((double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), "random.fizz", 0.5F, 2.6F + (var7.nextFloat() - var7.nextFloat()) * 0.8F);
         break;
      case 1005:
         if(C_100992_tt.field_110834_e[var6] instanceof C_100965_ug) {
            this.field_109765_h.func_109499_a(((C_100965_ug)C_100992_tt.field_110834_e[var6]).field_111000_a, var3, var4, var5);
         } else {
            this.field_109765_h.func_109499_a((String)null, var3, var4, var5);
         }
         break;
      case 1007:
         this.field_109765_h.func_109541_b((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.ghast.charge", 10.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 1008:
         this.field_109765_h.func_109541_b((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.ghast.fireball", 10.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 1009:
         this.field_109765_h.func_109541_b((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.ghast.fireball", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 1010:
         this.field_109765_h.func_109541_b((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.zombie.wood", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 1011:
         this.field_109765_h.func_109541_b((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.zombie.metal", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 1012:
         this.field_109765_h.func_109541_b((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.zombie.woodbreak", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 1014:
         this.field_109765_h.func_109541_b((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.wither.shoot", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 1015:
         this.field_109765_h.func_109541_b((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.bat.takeoff", 0.05F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 1016:
         this.field_109765_h.func_109541_b((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.zombie.infect", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 1017:
         this.field_109765_h.func_109541_b((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "mob.zombie.unfect", 2.0F, (var7.nextFloat() - var7.nextFloat()) * 0.2F + 1.0F);
         break;
      case 1020:
         this.field_109765_h.func_109541_b((double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), "random.anvil_break", 1.0F, this.field_109765_h.field_109577_u.nextFloat() * 0.1F + 0.9F);
         break;
      case 1021:
         this.field_109765_h.func_109541_b((double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), "random.anvil_use", 1.0F, this.field_109765_h.field_109577_u.nextFloat() * 0.1F + 0.9F);
         break;
      case 1022:
         this.field_109765_h.func_109541_b((double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), "random.anvil_land", 0.3F, this.field_109765_h.field_109577_u.nextFloat() * 0.1F + 0.9F);
         break;
      case 2000:
         int var33 = var6 % 3 - 1;
         int var9 = var6 / 3 % 3 - 1;
         var10 = (double)var3 + (double)var33 * 0.6D + 0.5D;
         var12 = (double)var4 + 0.5D;
         double var34 = (double)var5 + (double)var9 * 0.6D + 0.5D;

         for(int var35 = 0; var35 < 10; ++var35) {
            double var37 = var7.nextDouble() * 0.2D + 0.01D;
            double var38 = var10 + (double)var33 * 0.01D + (var7.nextDouble() - 0.5D) * (double)var9 * 0.5D;
            var39 = var12 + (var7.nextDouble() - 0.5D) * 0.5D;
            var23 = var34 + (double)var9 * 0.01D + (var7.nextDouble() - 0.5D) * (double)var33 * 0.5D;
            var25 = (double)var33 * var37 + var7.nextGaussian() * 0.01D;
            var27 = -0.03D + var7.nextGaussian() * 0.01D;
            var29 = (double)var9 * var37 + var7.nextGaussian() * 0.01D;
            this.func_109704_a("smoke", var38, var39, var23, var25, var27, var29);
         }

         return;
      case 2001:
         var20 = var6 & 4095;
         if(var20 > 0) {
            C_100451_alf var40 = C_100451_alf.field_106118_p[var20];
            this.field_109773_q.field_105097_A.func_105898_a(var40.field_106150_cz.func_107919_a(), (float)var3 + 0.5F, (float)var4 + 0.5F, (float)var5 + 0.5F, (var40.field_106150_cz.func_107921_c() + 1.0F) / 2.0F, var40.field_106150_cz.func_107918_d() * 0.8F);
         }

         this.field_109773_q.field_105133_i.func_111312_a(var3, var4, var5, var6 & 4095, var6 >> 12 & 255);
         break;
      case 2002:
         var8 = (double)var3;
         var10 = (double)var4;
         var12 = (double)var5;
         var14 = "iconcrack_" + C_100992_tt.field_110864_bs.field_110891_cf;

         for(var15 = 0; var15 < 8; ++var15) {
            this.func_109704_a(var14, var8, var10, var12, var7.nextGaussian() * 0.15D, var7.nextDouble() * 0.2D, var7.nextGaussian() * 0.15D);
         }

         var15 = C_100992_tt.field_110864_bs.func_110995_h(var6);
         float var16 = (float)(var15 >> 16 & 255) / 255.0F;
         float var17 = (float)(var15 >> 8 & 255) / 255.0F;
         float var18 = (float)(var15 >> 0 & 255) / 255.0F;
         String var19 = "spell";
         if(C_100992_tt.field_110864_bs.func_110996_i(var6)) {
            var19 = "instantSpell";
         }

         for(var20 = 0; var20 < 100; ++var20) {
            var39 = var7.nextDouble() * 4.0D;
            var23 = var7.nextDouble() * 3.141592653589793D * 2.0D;
            var25 = Math.cos(var23) * var39;
            var27 = 0.01D + var7.nextDouble() * 0.5D;
            var29 = Math.sin(var23) * var39;
            C_100988_axw var31 = this.func_109725_b(var19, var8 + var25 * 0.1D, var10 + 0.3D, var12 + var29 * 0.1D, var25, var27, var29);
            if(var31 != null) {
               float var32 = 0.75F + var7.nextFloat() * 0.25F;
               var31.func_104603_b(var16 * var32, var17 * var32, var18 * var32);
               var31.func_104604_e((float)var39);
            }
         }

         this.field_109765_h.func_109541_b((double)var3 + 0.5D, (double)var4 + 0.5D, (double)var5 + 0.5D, "random.glass", 1.0F, this.field_109765_h.field_109577_u.nextFloat() * 0.1F + 0.9F);
         break;
      case 2003:
         var8 = (double)var3 + 0.5D;
         var10 = (double)var4;
         var12 = (double)var5 + 0.5D;
         var14 = "iconcrack_" + C_100992_tt.field_110896_bA.field_110891_cf;

         for(var15 = 0; var15 < 8; ++var15) {
            this.func_109704_a(var14, var8, var10, var12, var7.nextGaussian() * 0.15D, var7.nextDouble() * 0.2D, var7.nextGaussian() * 0.15D);
         }

         for(double var36 = 0.0D; var36 < 6.283185307179586D; var36 += 0.15707963267948966D) {
            this.func_109704_a("portal", var8 + Math.cos(var36) * 5.0D, var10 - 0.4D, var12 + Math.sin(var36) * 5.0D, Math.cos(var36) * -5.0D, 0.0D, Math.sin(var36) * -5.0D);
            this.func_109704_a("portal", var8 + Math.cos(var36) * 5.0D, var10 - 0.4D, var12 + Math.sin(var36) * 5.0D, Math.cos(var36) * -7.0D, 0.0D, Math.sin(var36) * -7.0D);
         }

         return;
      case 2004:
         for(int var21 = 0; var21 < 20; ++var21) {
            double var22 = (double)var3 + 0.5D + ((double)this.field_109765_h.field_109577_u.nextFloat() - 0.5D) * 2.0D;
            double var24 = (double)var4 + 0.5D + ((double)this.field_109765_h.field_109577_u.nextFloat() - 0.5D) * 2.0D;
            double var26 = (double)var5 + 0.5D + ((double)this.field_109765_h.field_109577_u.nextFloat() - 0.5D) * 2.0D;
            this.field_109765_h.func_109428_a("smoke", var22, var24, var26, 0.0D, 0.0D, 0.0D);
            this.field_109765_h.func_109428_a("flame", var22, var24, var26, 0.0D, 0.0D, 0.0D);
         }
      }

   }

   public void func_109706_b(int var1, int var2, int var3, int var4, int var5) {
      if(var5 >= 0 && var5 < 10) {
         C_100737_hv var6 = (C_100737_hv)this.field_109734_E.get(Integer.valueOf(var1));
         if(var6 == null || var6.func_109335_b() != var2 || var6.func_109334_c() != var3 || var6.func_109333_d() != var4) {
            var6 = new C_100737_hv(var1, var2, var3, var4);
            this.field_109734_E.put(Integer.valueOf(var1), var6);
         }

         var6.func_109332_a(var5);
         var6.func_109330_b(this.field_109769_u);
      } else {
         this.field_109734_E.remove(Integer.valueOf(var1));
      }

   }
}
