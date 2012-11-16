import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLEncoder;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.SecretKey;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class C_101250_awr extends C_100221_dy {

   private boolean field_107043_f = false;
   private C_100323_bv field_107044_g;
   public String field_107049_a;
   private Minecraft field_107052_h;
   private C_100942_awz field_107053_i;
   private boolean field_107050_j = false;
   public C_100237_ahk field_107047_b = new C_100237_ahk((C_100268_agw)null);
   private Map field_107051_k = new HashMap();
   public List field_107048_c = new ArrayList();
   public int field_107045_d = 20;
   Random field_107046_e = new Random();


   public C_101250_awr(Minecraft var1, String var2, int var3) {
      this.field_107052_h = var1;
      Socket var4 = new Socket(InetAddress.getByName(var2), var3);
      this.field_107044_g = new C_100325_bx(var4, "Client", this);
   }

   public C_101250_awr(Minecraft var1, C_100094_bcb var2) {
      this.field_107052_h = var1;
      this.field_107044_g = new C_100321_bw(this);
      var2.func_105008_a().func_105784_a((C_100321_bw)this.field_107044_g, var1.field_105130_j.field_111761_b);
   }

   public void func_107035_c() {
      if(this.field_107044_g != null) {
         this.field_107044_g.func_107417_a();
      }

      this.field_107044_g = null;
      this.field_107053_i = null;
   }

   public void func_107041_d() {
      if(!this.field_107043_f && this.field_107044_g != null) {
         this.field_107044_g.func_107419_b();
      }

      if(this.field_107044_g != null) {
         this.field_107044_g.func_107417_a();
      }

   }

   public void func_106975_a(C_100293_ei var1) {
      String var2 = var1.func_106747_d().trim();
      PublicKey var3 = var1.func_106746_f();
      SecretKey var4 = C_100672_jk.func_109090_a();
      if(!"-".equals(var2)) {
         String var5 = (new BigInteger(C_100672_jk.func_109095_a(var2, var3, var4))).toString(16);
         String var6 = this.func_107040_a(this.field_107052_h.field_105130_j.field_111761_b, this.field_107052_h.field_105130_j.field_111762_c, var5);
         if(!"ok".equalsIgnoreCase(var6)) {
            this.field_107044_g.func_107415_a("disconnect.loginFailedInfo", new Object[]{var6});
            return;
         }
      }

      this.func_107034_c(new C_100303_et(var4, var3, var1.func_106748_g()));
   }

   private String func_107040_a(String var1, String var2, String var3) {
      try {
         URL var4 = new URL("http://session.minecraft.net/game/joinserver.jsp?user=" + func_107039_a(var1) + "&sessionId=" + func_107039_a(var2) + "&serverId=" + func_107039_a(var3));
         BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.openStream()));
         String var6 = var5.readLine();
         var5.close();
         return var6;
      } catch (IOException var7) {
         return var7.toString();
      }
   }

   private static String func_107039_a(String var0) {
      return URLEncoder.encode(var0, "UTF-8");
   }

   public void func_106956_a(C_100303_et var1) {
      this.func_107034_c(new C_100388_co(0));
   }

   public void func_106928_a(C_100252_do var1) {
      this.field_107052_h.field_105123_b = new C_100940_awy(this.field_107052_h, this);
      this.field_107052_h.field_105094_E.func_105801_a(C_100818_jh.field_110036_i, 1);
      this.field_107053_i = new C_100942_awz(this, new C_100840_xm(0L, var1.field_106647_d, false, var1.field_106650_c, var1.field_106649_b), var1.field_106648_e, var1.field_106645_f, this.field_107052_h.field_105105_I);
      this.field_107053_i.field_109557_J = true;
      this.field_107052_h.func_105083_a(this.field_107053_i);
      this.field_107052_h.field_105120_g.field_103224_ap = var1.field_106648_e;
      this.field_107052_h.func_105053_a(new C_100952_axe(this));
      this.field_107052_h.field_105120_g.field_103212_k = var1.field_106651_a;
      this.field_107045_d = var1.field_106652_h;
      this.field_107052_h.field_105123_b.func_111073_a(var1.field_106647_d);
      this.field_107052_h.field_105156_y.func_111685_c();
   }

   public void func_106961_a(C_100409_cf var1) {
      double var2 = (double)var1.field_106889_b / 32.0D;
      double var4 = (double)var1.field_106890_c / 32.0D;
      double var6 = (double)var1.field_106887_d / 32.0D;
      C_100576_pg var8 = new C_100576_pg(this.field_107053_i, var2, var4, var6, var1.field_106892_h);
      var8.field_103215_w = (double)var1.field_106888_e / 128.0D;
      var8.field_103240_x = (double)var1.field_106885_f / 128.0D;
      var8.field_103238_y = (double)var1.field_106886_g / 128.0D;
      var8.field_103170_cy = var1.field_106889_b;
      var8.field_103169_cz = var1.field_106890_c;
      var8.field_103204_cA = var1.field_106887_d;
      this.field_107053_i.func_109593_a(var1.field_106891_a, var8);
   }

   public void func_106976_a(C_100411_cc var1) {
      double var2 = (double)var1.field_106897_b / 32.0D;
      double var4 = (double)var1.field_106898_c / 32.0D;
      double var6 = (double)var1.field_106895_d / 32.0D;
      Object var8 = null;
      boolean var9 = true;
      if(var1.field_106900_h == 10) {
         var8 = new C_100590_ph(this.field_107053_i, var2, var4, var6, 0);
      } else if(var1.field_106900_h == 11) {
         var8 = new C_100590_ph(this.field_107053_i, var2, var4, var6, 1);
      } else if(var1.field_106900_h == 12) {
         var8 = new C_100590_ph(this.field_107053_i, var2, var4, var6, 2);
      } else if(var1.field_106900_h == 90) {
         C_100730_lb var10 = this.func_107038_a(var1.field_106901_i);
         if(var10 instanceof C_101095_qg) {
            var8 = new C_101090_ql(this.field_107053_i, var2, var4, var6, (C_101095_qg)var10);
         }

         var1.field_106901_i = 0;
      } else if(var1.field_106900_h == 60) {
         var8 = new C_101089_qi(this.field_107053_i, var2, var4, var6);
      } else if(var1.field_106900_h == 61) {
         var8 = new C_101086_qp(this.field_107053_i, var2, var4, var6);
      } else if(var1.field_106900_h == 71) {
         var8 = new C_100596_lm(this.field_107053_i, (int)var2, (int)var4, (int)var6, var1.field_106901_i);
         var1.field_106901_i = 0;
         var9 = false;
      } else if(var1.field_106900_h == 65) {
         var8 = new C_101080_qs(this.field_107053_i, var2, var4, var6);
      } else if(var1.field_106900_h == 72) {
         var8 = new C_101088_qj(this.field_107053_i, var2, var4, var6);
      } else if(var1.field_106900_h == 63) {
         var8 = new C_101085_qm(this.field_107053_i, var2, var4, var6, (double)var1.field_106896_e / 8000.0D, (double)var1.field_106893_f / 8000.0D, (double)var1.field_106894_g / 8000.0D);
         var1.field_106901_i = 0;
      } else if(var1.field_106900_h == 64) {
         var8 = new C_101087_qo(this.field_107053_i, var2, var4, var6, (double)var1.field_106896_e / 8000.0D, (double)var1.field_106893_f / 8000.0D, (double)var1.field_106894_g / 8000.0D);
         var1.field_106901_i = 0;
      } else if(var1.field_106900_h == 66) {
         var8 = new C_101079_qv(this.field_107053_i, var2, var4, var6, (double)var1.field_106896_e / 8000.0D, (double)var1.field_106893_f / 8000.0D, (double)var1.field_106894_g / 8000.0D);
         var1.field_106901_i = 0;
      } else if(var1.field_106900_h == 62) {
         var8 = new C_101083_qr(this.field_107053_i, var2, var4, var6);
      } else if(var1.field_106900_h == 73) {
         var8 = new C_101078_qu(this.field_107053_i, var2, var4, var6, var1.field_106901_i);
         var1.field_106901_i = 0;
      } else if(var1.field_106900_h == 75) {
         var8 = new C_101081_qt(this.field_107053_i, var2, var4, var6);
         var1.field_106901_i = 0;
      } else if(var1.field_106900_h == 1) {
         var8 = new C_100572_pe(this.field_107053_i, var2, var4, var6);
      } else if(var1.field_106900_h == 50) {
         var8 = new C_100591_pi(this.field_107053_i, var2, var4, var6);
      } else if(var1.field_106900_h == 51) {
         var8 = new C_100563_ox(this.field_107053_i, var2, var4, var6);
      } else if(var1.field_106900_h == 70) {
         var8 = new C_100574_pf(this.field_107053_i, var2, var4, var6, var1.field_106901_i & '\uffff', var1.field_106901_i >> 16);
         var1.field_106901_i = 0;
      }

      if(var8 != null) {
         ((C_100730_lb)var8).field_103170_cy = var1.field_106897_b;
         ((C_100730_lb)var8).field_103169_cz = var1.field_106898_c;
         ((C_100730_lb)var8).field_103204_cA = var1.field_106895_d;
         if(var9) {
            ((C_100730_lb)var8).field_103236_z = 0.0F;
            ((C_100730_lb)var8).field_103177_A = 0.0F;
         }

         C_100730_lb[] var17 = ((C_100730_lb)var8).func_103142_ao();
         if(var17 != null) {
            int var11 = var1.field_106899_a - ((C_100730_lb)var8).field_103212_k;
            C_100730_lb[] var12 = var17;
            int var13 = var17.length;

            for(int var14 = 0; var14 < var13; ++var14) {
               C_100730_lb var15 = var12[var14];
               var15.field_103212_k += var11;
            }
         }

         ((C_100730_lb)var8).field_103212_k = var1.field_106899_a;
         this.field_107053_i.func_109593_a(var1.field_106899_a, (C_100730_lb)var8);
         if(var1.field_106901_i > 0) {
            if(var1.field_106900_h == 60) {
               C_100730_lb var16 = this.func_107038_a(var1.field_106901_i);
               if(var16 instanceof C_100595_ln) {
                  C_101089_qi var18 = (C_101089_qi)var8;
                  var18.field_104675_c = var16;
               }
            }

            ((C_100730_lb)var8).func_103061_h((double)var1.field_106896_e / 8000.0D, (double)var1.field_106893_f / 8000.0D, (double)var1.field_106894_g / 8000.0D);
         }
      }

   }

   public void func_106959_a(C_100413_cd var1) {
      C_100722_lj var2 = new C_100722_lj(this.field_107053_i, (double)var1.field_106904_b, (double)var1.field_106905_c, (double)var1.field_106902_d, var1.field_106903_e);
      var2.field_103170_cy = var1.field_106904_b;
      var2.field_103169_cz = var1.field_106905_c;
      var2.field_103204_cA = var1.field_106902_d;
      var2.field_103236_z = 0.0F;
      var2.field_103177_A = 0.0F;
      var2.field_103212_k = var1.field_106906_a;
      this.field_107053_i.func_109593_a(var1.field_106906_a, var2);
   }

   public void func_106969_a(C_100407_ce var1) {
      double var2 = (double)var1.field_106882_b / 32.0D;
      double var4 = (double)var1.field_106883_c / 32.0D;
      double var6 = (double)var1.field_106880_d / 32.0D;
      C_100570_pd var8 = null;
      if(var1.field_106881_e == 1) {
         var8 = new C_100570_pd(this.field_107053_i, var2, var4, var6);
      }

      if(var8 != null) {
         var8.field_103170_cy = var1.field_106882_b;
         var8.field_103169_cz = var1.field_106883_c;
         var8.field_103204_cA = var1.field_106880_d;
         var8.field_103236_z = 0.0F;
         var8.field_103177_A = 0.0F;
         var8.field_103212_k = var1.field_106884_a;
         this.field_107053_i.func_109477_c(var8);
      }

   }

   public void func_106952_a(C_100405_ch var1) {
      C_100600_lq var2 = new C_100600_lq(this.field_107053_i, var1.field_106877_b, var1.field_106878_c, var1.field_106875_d, var1.field_106876_e, var1.field_106874_f);
      this.field_107053_i.func_109593_a(var1.field_106879_a, var2);
   }

   public void func_106972_a(C_100301_em var1) {
      C_100730_lb var2 = this.func_107038_a(var1.field_106765_a);
      if(var2 != null) {
         var2.func_103061_h((double)var1.field_106763_b / 8000.0D, (double)var1.field_106764_c / 8000.0D, (double)var1.field_106762_d / 8000.0D);
      }
   }

   public void func_106962_a(C_100287_el var1) {
      C_100730_lb var2 = this.func_107038_a(var1.field_106742_a);
      if(var2 != null && var1.func_106740_d() != null) {
         var2.func_103087_v().func_108846_a(var1.func_106740_d());
      }

   }

   public void func_106966_a(C_100399_ci var1) {
      double var2 = (double)var1.field_106853_c / 32.0D;
      double var4 = (double)var1.field_106850_d / 32.0D;
      double var6 = (double)var1.field_106851_e / 32.0D;
      float var8 = (float)(var1.field_106848_f * 360) / 256.0F;
      float var9 = (float)(var1.field_106849_g * 360) / 256.0F;
      C_100964_ayn var10 = new C_100964_ayn(this.field_107052_h.field_105122_e, var1.field_106852_b);
      var10.field_103227_q = var10.field_103189_T = (double)(var10.field_103170_cy = var1.field_106853_c);
      var10.field_103225_r = var10.field_103188_U = (double)(var10.field_103169_cz = var1.field_106850_d);
      var10.field_103223_s = var10.field_103191_V = (double)(var10.field_103204_cA = var1.field_106851_e);
      int var11 = var1.field_106856_h;
      if(var11 == 0) {
         var10.field_103857_bK.field_104832_a[var10.field_103857_bK.field_104831_c] = null;
      } else {
         var10.field_103857_bK.field_104832_a[var10.field_103857_bK.field_104831_c] = new C_100994_tv(var11, 1, 0);
      }

      var10.func_103135_a(var2, var4, var6, var8, var9);
      this.field_107053_i.func_109593_a(var1.field_106854_a, var10);
      List var12 = var1.func_106847_c();
      if(var12 != null) {
         var10.func_103087_v().func_108846_a(var12);
      }

   }

   public void func_106955_a(C_100263_ew var1) {
      C_100730_lb var2 = this.func_107038_a(var1.field_106677_a);
      if(var2 != null) {
         var2.field_103170_cy = var1.field_106675_b;
         var2.field_103169_cz = var1.field_106676_c;
         var2.field_103204_cA = var1.field_106673_d;
         double var3 = (double)var2.field_103170_cy / 32.0D;
         double var5 = (double)var2.field_103169_cz / 32.0D + 0.015625D;
         double var7 = (double)var2.field_103204_cA / 32.0D;
         float var9 = (float)(var1.field_106674_e * 360) / 256.0F;
         float var10 = (float)(var1.field_106672_f * 360) / 256.0F;
         var2.func_103114_a(var3, var5, var7, var9, var10, 3);
      }
   }

   public void func_106965_a(C_100258_dp var1) {
      C_100730_lb var2 = this.func_107038_a(var1.field_106671_a);
      if(var2 != null) {
         var2.field_103170_cy += var1.field_106669_b;
         var2.field_103169_cz += var1.field_106670_c;
         var2.field_103204_cA += var1.field_106667_d;
         double var3 = (double)var2.field_103170_cy / 32.0D;
         double var5 = (double)var2.field_103169_cz / 32.0D;
         double var7 = (double)var2.field_103204_cA / 32.0D;
         float var9 = var1.field_106666_g?(float)(var1.field_106668_e * 360) / 256.0F:var2.field_103236_z;
         float var10 = var1.field_106666_g?(float)(var1.field_106665_f * 360) / 256.0F:var2.field_103177_A;
         var2.func_103114_a(var3, var5, var7, var9, var10, 3);
      }
   }

   public void func_106927_a(C_100279_eh var1) {
      C_100730_lb var2 = this.func_107038_a(var1.field_106731_a);
      if(var2 != null) {
         float var3 = (float)(var1.field_106730_b * 360) / 256.0F;
         var2.func_103084_d(var3);
      }
   }

   public void func_106919_a(C_100285_ee var1) {
      for(int var2 = 0; var2 < var1.field_106739_a.length; ++var2) {
         this.field_107053_i.func_109594_b(var1.field_106739_a[var2]);
      }

   }

   public void func_106987_a(C_100214_dt var1) {
      C_100950_axc var2 = this.field_107052_h.field_105120_g;
      double var3 = var2.field_103221_t;
      double var5 = var2.field_103219_u;
      double var7 = var2.field_103217_v;
      float var9 = var2.field_103236_z;
      float var10 = var2.field_103177_A;
      if(var1.field_106914_h) {
         var3 = var1.field_106913_a;
         var5 = var1.field_106911_b;
         var7 = var1.field_106912_c;
      }

      if(var1.field_106915_i) {
         var9 = var1.field_106910_e;
         var10 = var1.field_106907_f;
      }

      var2.field_103190_W = 0.0F;
      var2.field_103215_w = var2.field_103240_x = var2.field_103238_y = 0.0D;
      var2.func_103135_a(var3, var5, var7, var9, var10);
      var1.field_106913_a = var2.field_103221_t;
      var1.field_106911_b = var2.field_103173_D.field_107915_b;
      var1.field_106912_c = var2.field_103217_v;
      var1.field_106909_d = var2.field_103219_u;
      this.field_107044_g.func_107413_a(var1);
      if(!this.field_107050_j) {
         this.field_107052_h.field_105120_g.field_103227_q = this.field_107052_h.field_105120_g.field_103221_t;
         this.field_107052_h.field_105120_g.field_103225_r = this.field_107052_h.field_105120_g.field_103219_u;
         this.field_107052_h.field_105120_g.field_103223_s = this.field_107052_h.field_105120_g.field_103217_v;
         this.field_107050_j = true;
         this.field_107052_h.func_105053_a((C_101278_asw)null);
      }

   }

   public void func_106924_a(C_100394_cn var1) {
      int var2 = var1.field_106842_a * 16;
      int var3 = var1.field_106840_b * 16;
      if(var1.field_106841_c != null) {
         DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var1.field_106841_c));

         try {
            for(int var5 = 0; var5 < var1.field_106838_d; ++var5) {
               short var6 = var4.readShort();
               short var7 = var4.readShort();
               int var8 = var7 >> 4 & 4095;
               int var9 = var7 & 15;
               int var10 = var6 >> 12 & 15;
               int var11 = var6 >> 8 & 15;
               int var12 = var6 & 255;
               this.field_107053_i.func_109588_h(var10 + var2, var12, var11 + var3, var8, var9);
            }
         } catch (IOException var13) {
            ;
         }

      }
   }

   public void func_106916_a(C_100246_dj var1) {
      if(var1.field_106620_e) {
         if(var1.field_106622_c == 0) {
            this.field_107053_i.func_109591_a(var1.field_106623_a, var1.field_106621_b, false);
            return;
         }

         this.field_107053_i.func_109591_a(var1.field_106623_a, var1.field_106621_b, true);
      }

      this.field_107053_i.func_109586_b(var1.field_106623_a << 4, 0, var1.field_106621_b << 4, (var1.field_106623_a << 4) + 15, 256, (var1.field_106621_b << 4) + 15);
      C_101272_za var2 = this.field_107053_i.func_109440_e(var1.field_106623_a, var1.field_106621_b);
      if(var1.field_106620_e && var2 == null) {
         this.field_107053_i.func_109591_a(var1.field_106623_a, var1.field_106621_b, true);
         var2 = this.field_107053_i.func_109440_e(var1.field_106623_a, var1.field_106621_b);
      }

      if(var2 != null) {
         var2.func_112309_a(var1.func_106615_d(), var1.field_106622_c, var1.field_106619_d, var1.field_106620_e);
         this.field_107053_i.func_109511_e(var1.field_106623_a << 4, 0, var1.field_106621_b << 4, (var1.field_106623_a << 4) + 15, 256, (var1.field_106621_b << 4) + 15);
         if(!var1.field_106620_e || !(this.field_107053_i.field_109576_v instanceof C_101293_zt)) {
            var2.func_112314_n();
         }
      }

   }

   public void func_106951_a(C_100273_fa var1) {
      this.field_107053_i.func_109588_h(var1.field_106709_a, var1.field_106707_b, var1.field_106708_c, var1.field_106705_d, var1.field_106706_e);
   }

   public void func_106978_a(C_100365_db var1) {
      this.field_107044_g.func_107415_a("disconnect.kicked", new Object[0]);
      this.field_107043_f = true;
      this.field_107052_h.func_105083_a((C_100942_awz)null);
      this.field_107052_h.func_105053_a(new C_100936_aww("disconnect.disconnected", "disconnect.genericReason", new Object[]{var1.field_106784_a}));
   }

   public void func_106986_a(String var1, Object[] var2) {
      if(!this.field_107043_f) {
         this.field_107043_f = true;
         this.field_107052_h.func_105083_a((C_100942_awz)null);
         this.field_107052_h.func_105053_a(new C_100936_aww("disconnect.lost", var1, var2));
      }
   }

   public void func_107036_b(C_100219_dx var1) {
      if(!this.field_107043_f) {
         this.field_107044_g.func_107413_a(var1);
         this.field_107044_g.func_107414_d();
      }
   }

   public void func_107034_c(C_100219_dx var1) {
      if(!this.field_107043_f) {
         this.field_107044_g.func_107413_a(var1);
      }
   }

   public void func_106988_a(C_100267_ev var1) {
      C_100730_lb var2 = this.func_107038_a(var1.field_106693_a);
      Object var3 = (C_100595_ln)this.func_107038_a(var1.field_106692_b);
      if(var3 == null) {
         var3 = this.field_107052_h.field_105120_g;
      }

      if(var2 != null) {
         if(var2 instanceof C_100722_lj) {
            this.field_107053_i.func_109412_a(var2, "random.orb", 0.2F, ((this.field_107046_e.nextFloat() - this.field_107046_e.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         } else {
            this.field_107053_i.func_109412_a(var2, "random.pop", 0.2F, ((this.field_107046_e.nextFloat() - this.field_107046_e.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         }

         this.field_107052_h.field_105133_i.func_111310_a(new C_100960_ayh(this.field_107052_h.field_105122_e, var2, (C_100730_lb)var3, -0.5F));
         this.field_107053_i.func_109594_b(var1.field_106693_a);
      }

   }

   public void func_106943_a(C_100392_cm var1) {
      this.field_107052_h.field_105137_v.func_103991_b().func_103894_a(var1.field_106835_b);
   }

   public void func_106957_a(C_100401_cj var1) {
      C_100730_lb var2 = this.func_107038_a(var1.field_106859_a);
      if(var2 != null) {
         if(var1.field_106858_b == 1) {
            C_100595_ln var3 = (C_100595_ln)var2;
            var3.func_103301_bE();
         } else if(var1.field_106858_b == 2) {
            var2.func_103116_ac();
         } else if(var1.field_106858_b == 3) {
            C_101095_qg var4 = (C_101095_qg)var2;
            var4.func_103766_a(false, false, false);
         } else if(var1.field_106858_b != 4) {
            if(var1.field_106858_b == 6) {
               this.field_107052_h.field_105133_i.func_111310_a(new C_100916_axk(this.field_107052_h.field_105122_e, var2));
            } else if(var1.field_106858_b == 7) {
               C_100916_axk var5 = new C_100916_axk(this.field_107052_h.field_105122_e, var2, "magicCrit");
               this.field_107052_h.field_105133_i.func_111310_a(var5);
            } else if(var1.field_106858_b == 5 && var2 instanceof C_100964_ayn) {
               ;
            }
         }

      }
   }

   public void func_106926_a(C_100363_dc var1) {
      C_100730_lb var2 = this.func_107038_a(var1.field_106783_a);
      if(var2 != null) {
         if(var1.field_106780_e == 0) {
            C_101095_qg var3 = (C_101095_qg)var2;
            var3.func_103781_a(var1.field_106781_b, var1.field_106782_c, var1.field_106779_d);
         }

      }
   }

   public void func_107042_e() {
      this.field_107043_f = true;
      this.field_107044_g.func_107417_a();
      this.field_107044_g.func_107415_a("disconnect.closed", new Object[0]);
   }

   public void func_106922_a(C_100403_cg var1) {
      double var2 = (double)var1.field_106866_c / 32.0D;
      double var4 = (double)var1.field_106863_d / 32.0D;
      double var6 = (double)var1.field_106864_e / 32.0D;
      float var8 = (float)(var1.field_106871_i * 360) / 256.0F;
      float var9 = (float)(var1.field_106868_j * 360) / 256.0F;
      C_100595_ln var10 = (C_100595_ln)C_100727_lf.func_109314_a(var1.field_106865_b, this.field_107052_h.field_105122_e);
      var10.field_103170_cy = var1.field_106866_c;
      var10.field_103169_cz = var1.field_106863_d;
      var10.field_103204_cA = var1.field_106864_e;
      var10.field_103455_ay = (float)(var1.field_106869_k * 360) / 256.0F;
      C_100730_lb[] var11 = var10.func_103142_ao();
      if(var11 != null) {
         int var12 = var1.field_106867_a - var10.field_103212_k;
         C_100730_lb[] var13 = var11;
         int var14 = var11.length;

         for(int var15 = 0; var15 < var14; ++var15) {
            C_100730_lb var16 = var13[var15];
            var16.field_103212_k += var12;
         }
      }

      var10.field_103212_k = var1.field_106867_a;
      var10.func_103135_a(var2, var4, var6, var8, var9);
      var10.field_103215_w = (double)((float)var1.field_106861_f / 8000.0F);
      var10.field_103240_x = (double)((float)var1.field_106862_g / 8000.0F);
      var10.field_103238_y = (double)((float)var1.field_106870_h / 8000.0F);
      this.field_107053_i.func_109593_a(var1.field_106867_a, var10);
      List var17 = var1.func_106860_c();
      if(var17 != null) {
         var10.func_103087_v().func_108846_a(var17);
      }

   }

   public void func_106954_a(C_100305_es var1) {
      this.field_107052_h.field_105122_e.func_109484_a(var1.field_106773_a);
      this.field_107052_h.field_105122_e.func_109436_b(var1.field_106772_b);
   }

   public void func_106980_a(C_100307_er var1) {
      this.field_107052_h.field_105120_g.func_103831_a(new C_100013_k(var1.field_106776_a, var1.field_106774_b, var1.field_106775_c), true);
      this.field_107052_h.field_105122_e.func_109429_J().func_107154_a(var1.field_106776_a, var1.field_106774_b, var1.field_106775_c);
   }

   public void func_106934_a(C_100309_eq var1) {
      Object var2 = this.func_107038_a(var1.field_106778_a);
      C_100730_lb var3 = this.func_107038_a(var1.field_106777_b);
      if(var1.field_106778_a == this.field_107052_h.field_105120_g.field_103212_k) {
         var2 = this.field_107052_h.field_105120_g;
         if(var3 instanceof C_100572_pe) {
            ((C_100572_pe)var3).func_103247_e(false);
         }
      } else if(var3 instanceof C_100572_pe) {
         ((C_100572_pe)var3).func_103247_e(true);
      }

      if(var2 != null) {
         ((C_100730_lb)var2).func_103064_a(var3);
      }
   }

   public void func_106937_a(C_100236_dd var1) {
      C_100730_lb var2 = this.func_107038_a(var1.field_106606_a);
      if(var2 != null) {
         var2.func_103159_a(var1.field_106605_b);
      }

   }

   private C_100730_lb func_107038_a(int var1) {
      return (C_100730_lb)(var1 == this.field_107052_h.field_105120_g.field_103212_k?this.field_107052_h.field_105120_g:this.field_107053_i.func_109451_a(var1));
   }

   public void func_106981_a(C_100295_ep var1) {
      this.field_107052_h.field_105120_g.func_104539_u(var1.field_106754_a);
      this.field_107052_h.field_105120_g.func_103819_bZ().func_111576_a(var1.field_106752_b);
      this.field_107052_h.field_105120_g.func_103819_bZ().func_111579_b(var1.field_106753_c);
   }

   public void func_106983_a(C_100297_eo var1) {
      this.field_107052_h.field_105120_g.func_104542_a(var1.field_106757_a, var1.field_106755_b, var1.field_106756_c);
   }

   public void func_106938_a(C_100281_eg var1) {
      if(var1.field_106736_a != this.field_107052_h.field_105120_g.field_103224_ap) {
         this.field_107050_j = false;
         this.field_107053_i = new C_100942_awz(this, new C_100840_xm(0L, var1.field_106732_d, false, this.field_107052_h.field_105122_e.func_109429_J().func_107145_t(), var1.field_106733_e), var1.field_106736_a, var1.field_106734_b, this.field_107052_h.field_105105_I);
         this.field_107053_i.field_109557_J = true;
         this.field_107052_h.func_105083_a(this.field_107053_i);
         this.field_107052_h.field_105120_g.field_103224_ap = var1.field_106736_a;
         this.field_107052_h.func_105053_a(new C_100952_axe(this));
      }

      this.field_107052_h.func_105033_a(var1.field_106736_a);
      this.field_107052_h.field_105123_b.func_111073_a(var1.field_106732_d);
   }

   public void func_106982_a(C_100235_de var1) {
      C_100857_wz var2 = new C_100857_wz(this.field_107052_h.field_105122_e, (C_100730_lb)null, var1.field_106603_a, var1.field_106601_b, var1.field_106602_c, var1.field_106599_d);
      var2.field_110232_h = var1.field_106600_e;
      var2.func_110221_a(true);
      this.field_107052_h.field_105120_g.field_103215_w += (double)var1.func_106594_d();
      this.field_107052_h.field_105120_g.field_103240_x += (double)var1.func_106596_f();
      this.field_107052_h.field_105120_g.field_103238_y += (double)var1.func_106595_g();
   }

   public void func_106917_a(C_100374_cw var1) {
      C_100950_axc var2 = this.field_107052_h.field_105120_g;
      switch(var1.field_106797_b) {
      case 0:
         var2.func_103785_a(new C_100706_ko(var1.field_106798_c, var1.field_106796_d));
         var2.field_103856_bM.field_111514_c = var1.field_106799_a;
         break;
      case 1:
         var2.func_103825_b(C_100650_jv.func_108910_c(var2.field_103221_t), C_100650_jv.func_108910_c(var2.field_103219_u), C_100650_jv.func_108910_c(var2.field_103217_v));
         var2.field_103856_bM.field_111514_c = var1.field_106799_a;
         break;
      case 2:
         var2.func_103810_a(new C_100419_amg());
         var2.field_103856_bM.field_111514_c = var1.field_106799_a;
         break;
      case 3:
         var2.func_103778_a(new C_100420_amd());
         var2.field_103856_bM.field_111514_c = var1.field_106799_a;
         break;
      case 4:
         var2.func_103770_c(C_100650_jv.func_108910_c(var2.field_103221_t), C_100650_jv.func_108910_c(var2.field_103219_u), C_100650_jv.func_108910_c(var2.field_103217_v));
         var2.field_103856_bM.field_111514_c = var1.field_106799_a;
         break;
      case 5:
         var2.func_103801_a(new C_100424_ama());
         var2.field_103856_bM.field_111514_c = var1.field_106799_a;
         break;
      case 6:
         var2.func_103823_a(new C_101096_qb(var2));
         var2.field_103856_bM.field_111514_c = var1.field_106799_a;
         break;
      case 7:
         var2.func_103763_a(new C_100425_alz());
         var2.field_103856_bM.field_111514_c = var1.field_106799_a;
         break;
      case 8:
         var2.func_103815_d(C_100650_jv.func_108910_c(var2.field_103221_t), C_100650_jv.func_108910_c(var2.field_103219_u), C_100650_jv.func_108910_c(var2.field_103217_v));
         var2.field_103856_bM.field_111514_c = var1.field_106799_a;
      }

   }

   public void func_106949_a(C_100371_cz var1) {
      C_100950_axc var2 = this.field_107052_h.field_105120_g;
      if(var1.field_106790_a == -1) {
         var2.field_103857_bK.func_104801_b(var1.field_106789_c);
      } else {
         boolean var3 = false;
         if(this.field_107052_h.field_105144_r instanceof C_101346_aud) {
            C_101346_aud var4 = (C_101346_aud)this.field_107052_h.field_105144_r;
            var3 = var4.func_104467_g() != C_101040_sq.field_111423_m.func_111409_a();
         }

         if(var1.field_106790_a == 0 && var1.field_106788_b >= 36 && var1.field_106788_b < 45) {
            C_100994_tv var5 = var2.field_103855_bL.func_111503_a(var1.field_106788_b).func_111446_c();
            if(var1.field_106789_c != null && (var5 == null || var5.field_111398_a < var1.field_106789_c.field_111398_a)) {
               var1.field_106789_c.field_111396_b = 5;
            }

            var2.field_103855_bL.func_111492_a(var1.field_106788_b, var1.field_106789_c);
         } else if(var1.field_106790_a == var2.field_103856_bM.field_111514_c && (var1.field_106790_a != 0 || !var3)) {
            var2.field_103856_bM.func_111492_a(var1.field_106788_b, var1.field_106789_c);
         }
      }

   }

   public void func_106920_a(C_100382_cs var1) {
      C_101075_qy var2 = null;
      C_100950_axc var3 = this.field_107052_h.field_105120_g;
      if(var1.field_106811_a == 0) {
         var2 = var3.field_103855_bL;
      } else if(var1.field_106811_a == var3.field_103856_bM.field_111514_c) {
         var2 = var3.field_103856_bM;
      }

      if(var2 != null && !var1.field_106810_c) {
         this.func_107034_c(new C_100382_cs(var1.field_106811_a, var1.field_106809_b, true));
      }

   }

   public void func_106967_a(C_100373_cx var1) {
      C_100950_axc var2 = this.field_107052_h.field_105120_g;
      if(var1.field_106795_a == 0) {
         var2.field_103855_bL.func_111491_a(var1.field_106794_b);
      } else if(var1.field_106795_a == var2.field_103856_bM.field_111514_c) {
         var2.field_103856_bM.func_111491_a(var1.field_106794_b);
      }

   }

   public void func_106968_a(C_100266_eu var1) {
      if(this.field_107052_h.field_105122_e.func_109461_e(var1.field_106691_a, var1.field_106689_b, var1.field_106690_c)) {
         C_100398_amm var2 = this.field_107052_h.field_105122_e.func_109353_p(var1.field_106691_a, var1.field_106689_b, var1.field_106690_c);
         if(var2 instanceof C_100414_amj) {
            C_100414_amj var3 = (C_100414_amj)var2;
            if(var3.func_102960_a()) {
               for(int var4 = 0; var4 < 4; ++var4) {
                  var3.field_102963_a[var4] = var1.field_106688_d[var4];
               }

               var3.func_102922_d();
            }
         }
      }

   }

   public void func_106974_a(C_100271_ey var1) {
      if(this.field_107052_h.field_105122_e.func_109461_e(var1.field_106698_a, var1.field_106696_b, var1.field_106697_c)) {
         C_100398_amm var2 = this.field_107052_h.field_105122_e.func_109353_p(var1.field_106698_a, var1.field_106696_b, var1.field_106697_c);
         if(var2 != null) {
            if(var1.field_106694_d == 1 && var2 instanceof C_100416_amh) {
               var2.func_102925_a(var1.field_106695_e);
            } else if(var1.field_106694_d == 2 && var2 instanceof C_100423_amc) {
               var2.func_102925_a(var1.field_106695_e);
            } else if(var1.field_106694_d == 3 && var2 instanceof C_100425_alz) {
               var2.func_102925_a(var1.field_106695_e);
            } else if(var1.field_106694_d == 4 && var2 instanceof C_100415_amk) {
               var2.func_102925_a(var1.field_106695_e);
            }
         }
      }

   }

   public void func_106963_a(C_100372_cy var1) {
      C_100950_axc var2 = this.field_107052_h.field_105120_g;
      this.func_106985_a(var1);
      if(var2.field_103856_bM != null && var2.field_103856_bM.field_111514_c == var1.field_106793_a) {
         var2.field_103856_bM.func_111498_b(var1.field_106791_b, var1.field_106792_c);
      }

   }

   public void func_106964_a(C_100299_en var1) {
      C_100730_lb var2 = this.func_107038_a(var1.field_106761_a);
      if(var2 != null) {
         var2.func_103060_b(var1.field_106759_b, var1.func_106758_d());
      }

   }

   public void func_106935_a(C_100376_cv var1) {
      this.field_107052_h.field_105120_g.func_103808_i();
   }

   public void func_106950_a(C_100272_ez var1) {
      this.field_107052_h.field_105122_e.func_109467_c(var1.field_106704_a, var1.field_106702_b, var1.field_106703_c, var1.field_106699_f, var1.field_106700_d, var1.field_106701_e);
   }

   public void func_106939_a(C_100265_ex var1) {
      this.field_107052_h.field_105122_e.func_109420_g(var1.func_106680_d(), var1.func_106679_f(), var1.func_106682_g(), var1.func_106678_h(), var1.func_106681_i());
   }

   public void func_106944_a(C_100250_dl var1) {
      for(int var2 = 0; var2 < var1.func_106634_d(); ++var2) {
         int var3 = var1.func_106635_a(var2);
         int var4 = var1.func_106633_b(var2);
         this.field_107053_i.func_109591_a(var3, var4, true);
         this.field_107053_i.func_109586_b(var3 << 4, 0, var4 << 4, (var3 << 4) + 15, 256, (var4 << 4) + 15);
         C_101272_za var5 = this.field_107053_i.func_109440_e(var3, var4);
         if(var5 == null) {
            this.field_107053_i.func_109591_a(var3, var4, true);
            var5 = this.field_107053_i.func_109440_e(var3, var4);
         }

         if(var5 != null) {
            var5.func_112309_a(var1.func_106636_c(var2), var1.field_106643_a[var2], var1.field_106641_b[var2], true);
            this.field_107053_i.func_109511_e(var3 << 4, 0, var4 << 4, (var3 << 4) + 15, 256, (var4 << 4) + 15);
            if(!(this.field_107053_i.field_109576_v instanceof C_101293_zt)) {
               var5.func_112314_n();
            }
         }
      }

   }

   public boolean func_106933_b() {
      return this.field_107052_h != null && this.field_107052_h.field_105122_e != null && this.field_107052_h.field_105120_g != null && this.field_107053_i != null;
   }

   public void func_106940_a(C_100240_df var1) {
      C_100950_axc var2 = this.field_107052_h.field_105120_g;
      int var3 = var1.field_106608_b;
      int var4 = var1.field_106609_c;
      if(var3 >= 0 && var3 < C_100240_df.field_106610_a.length && C_100240_df.field_106610_a[var3] != null) {
         var2.func_103773_b(C_100240_df.field_106610_a[var3]);
      }

      if(var3 == 1) {
         this.field_107053_i.func_109429_J().func_107155_b(true);
         this.field_107053_i.func_109457_k(0.0F);
      } else if(var3 == 2) {
         this.field_107053_i.func_109429_J().func_107155_b(false);
         this.field_107053_i.func_109457_k(1.0F);
      } else if(var3 == 3) {
         this.field_107052_h.field_105123_b.func_111073_a(C_100836_xn.func_110086_a(var4));
      } else if(var3 == 4) {
         this.field_107052_h.func_105053_a(new C_101345_aus());
      } else if(var3 == 5) {
         C_101125_ard var5 = this.field_107052_h.field_105156_y;
         if(var4 == 0) {
            this.field_107052_h.func_105053_a(new C_101139_arw());
         } else if(var4 == 101) {
            this.field_107052_h.field_105137_v.func_103991_b().func_103885_a("demo.help.movement", new Object[]{Keyboard.getKeyName(var5.field_111693_A.field_111989_d), Keyboard.getKeyName(var5.field_111694_B.field_111989_d), Keyboard.getKeyName(var5.field_111695_C.field_111989_d), Keyboard.getKeyName(var5.field_111689_D.field_111989_d)});
         } else if(var4 == 102) {
            this.field_107052_h.field_105137_v.func_103991_b().func_103885_a("demo.help.jump", new Object[]{Keyboard.getKeyName(var5.field_111690_E.field_111989_d)});
         } else if(var4 == 103) {
            this.field_107052_h.field_105137_v.func_103991_b().func_103885_a("demo.help.inventory", new Object[]{Keyboard.getKeyName(var5.field_111691_F.field_111989_d)});
         }
      }

   }

   public void func_106921_a(C_100386_cr var1) {
      if(var1.field_106820_a == C_100992_tt.field_110882_bd.field_110891_cf) {
         C_100986_tx.func_111041_a(var1.field_106818_b, this.field_107052_h.field_105122_e).func_107290_a(var1.field_106819_c);
      } else {
         System.out.println("Unknown itemid: " + var1.field_106818_b);
      }

   }

   public void func_106936_a(C_100248_dm var1) {
      if(var1.func_106626_d()) {
         this.field_107052_h.field_105122_e.func_109493_e(var1.field_106632_a, var1.field_106631_c, var1.field_106628_d, var1.field_106629_e, var1.field_106630_b);
      } else {
         this.field_107052_h.field_105122_e.func_109448_f(var1.field_106632_a, var1.field_106631_c, var1.field_106628_d, var1.field_106629_e, var1.field_106630_b);
      }

   }

   public void func_106930_a(C_100395_ck var1) {
      this.field_107052_h.field_105120_g.func_104558_b(C_100818_jh.func_110011_a(var1.field_106844_a), var1.field_106843_b);
   }

   public void func_106945_a(C_100276_fb var1) {
      C_100730_lb var2 = this.func_107038_a(var1.field_106713_a);
      if(var2 instanceof C_100595_ln) {
         ((C_100595_ln)var2).func_103389_d(new C_100692_kx(var1.field_106711_b, var1.field_106710_d, var1.field_106712_c));
      }
   }

   public void func_106973_a(C_100283_ef var1) {
      C_100730_lb var2 = this.func_107038_a(var1.field_106738_a);
      if(var2 instanceof C_100595_ln) {
         ((C_100595_ln)var2).func_103318_n(var1.field_106737_b);
      }
   }

   public boolean func_106958_a() {
      return false;
   }

   public void func_106931_a(C_100233_ec var1) {
      C_100951_axd var2 = (C_100951_axd)this.field_107051_k.get(var1.field_106593_a);
      if(var2 == null && var1.field_106591_b) {
         var2 = new C_100951_axd(var1.field_106593_a);
         this.field_107051_k.put(var1.field_106593_a, var2);
         this.field_107048_c.add(var2);
      }

      if(var2 != null && !var1.field_106591_b) {
         this.field_107051_k.remove(var1.field_106593_a);
         this.field_107048_c.remove(var2);
      }

      if(var1.field_106591_b && var2 != null) {
         var2.field_111137_b = var1.field_106592_c;
      }

   }

   public void func_106960_a(C_100242_di var1) {
      this.func_107034_c(new C_100242_di(var1.field_106611_a));
   }

   public void func_106941_a(C_100223_dz var1) {
      C_100950_axc var2 = this.field_107052_h.field_105120_g;
      var2.field_103869_cf.field_111599_b = var1.func_106570_f();
      var2.field_103869_cf.field_111597_d = var1.func_106566_h();
      var2.field_103869_cf.field_111601_a = var1.func_106572_d();
      var2.field_103869_cf.field_111600_c = var1.func_106568_g();
      var2.field_103869_cf.func_111590_a(var1.func_106567_i());
      var2.field_103869_cf.func_111593_b(var1.func_106576_j());
   }

   public void func_106977_a(C_100397_cl var1) {
      String[] var2 = var1.func_106845_d().split(" ");
      if(this.field_107052_h.field_105144_r instanceof C_101130_aro) {
         C_101130_aro var3 = (C_101130_aro)this.field_107052_h.field_105144_r;
         var3.func_104091_a(var2);
      }

   }

   public void func_106970_a(C_100254_dn var1) {
      this.field_107052_h.field_105122_e.func_109541_b(var1.func_106657_f(), var1.func_106653_g(), var1.func_106654_h(), var1.func_106655_d(), var1.func_106656_i(), var1.func_106658_j());
   }

   public void func_106971_a(C_100367_da var1) {
      if("MC|TPack".equals(var1.field_106787_a)) {
         String[] var2 = (new String(var1.field_106786_c)).split(" ");
         String var3 = var2[0];
         if(var2[1].equals("16")) {
            if(this.field_107052_h.field_105099_C.func_105665_g()) {
               this.field_107052_h.field_105099_C.func_105663_a(var3);
            } else if(this.field_107052_h.field_105099_C.func_105669_f()) {
               this.field_107052_h.func_105053_a(new C_101141_arq(new C_101251_aws(this, var3), C_100361_be.func_107654_a().func_107651_b("multiplayer.texturePrompt.line1"), C_100361_be.func_107654_a().func_107651_b("multiplayer.texturePrompt.line2"), 0));
            }
         }
      } else if("MC|TrList".equals(var1.field_106787_a)) {
         DataInputStream var8 = new DataInputStream(new ByteArrayInputStream(var1.field_106786_c));

         try {
            int var9 = var8.readInt();
            C_101278_asw var4 = this.field_107052_h.field_105144_r;
            if(var4 != null && var4 instanceof C_101332_aul && var9 == this.field_107052_h.field_105120_g.field_103856_bM.field_111514_c) {
               C_100891_wu var5 = ((C_101332_aul)var4).func_104453_g();
               C_100859_ww var6 = C_100859_ww.func_110242_a(var8);
               var5.func_103581_a(var6);
            }
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      }

   }

   public C_100323_bv func_107037_f() {
      return this.field_107044_g;
   }
}
