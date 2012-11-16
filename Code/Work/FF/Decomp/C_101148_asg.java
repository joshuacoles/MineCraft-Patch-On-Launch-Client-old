import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Collections;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class C_101148_asg extends C_101278_asw {

   private static int field_104210_a = 0;
   private static Object field_104206_b = new Object();
   private C_101278_asw field_104208_c;
   private C_101151_ash field_104205_d;
   private C_100907_axh field_104213_m;
   private int field_104211_n = -1;
   private C_101133_arl field_104212_o;
   private C_101133_arl field_104221_p;
   private C_101133_arl field_104220_q;
   private boolean field_104219_r = false;
   private boolean field_104218_s = false;
   private boolean field_104217_t = false;
   private boolean field_104216_u = false;
   private String field_104215_v = null;
   private C_100909_axg field_104214_w = null;
   private C_100085_bci field_104224_x;
   private C_100096_bch field_104223_y;
   private int field_104222_z;
   private boolean field_104207_A;
   private List field_104209_B = Collections.emptyList();


   public C_101148_asg(C_101278_asw var1) {
      this.field_104208_c = var1;
   }

   public void func_104037_A_() {
      Keyboard.enableRepeatEvents(true);
      this.field_104050_h.clear();
      if(!this.field_104207_A) {
         this.field_104207_A = true;
         this.field_104213_m = new C_100907_axh(this.field_104046_e);
         this.field_104213_m.func_110684_a();
         this.field_104224_x = new C_100085_bci();

         try {
            this.field_104223_y = new C_100096_bch(this.field_104224_x);
            this.field_104223_y.start();
         } catch (Exception var2) {
            System.out.println("Unable to start LAN server detection: " + var2.getMessage());
         }

         this.field_104205_d = new C_101151_ash(this);
      } else {
         this.field_104205_d.func_105818_a(this.field_104044_f, this.field_104045_g, 32, this.field_104045_g - 64);
      }

      this.func_104198_g();
   }

   public void func_104198_g() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      this.field_104050_h.add(this.field_104212_o = new C_101133_arl(7, this.field_104044_f / 2 - 154, this.field_104045_g - 28, 70, 20, var1.func_107651_b("selectServer.edit")));
      this.field_104050_h.add(this.field_104220_q = new C_101133_arl(2, this.field_104044_f / 2 - 74, this.field_104045_g - 28, 70, 20, var1.func_107651_b("selectServer.delete")));
      this.field_104050_h.add(this.field_104221_p = new C_101133_arl(1, this.field_104044_f / 2 - 154, this.field_104045_g - 52, 100, 20, var1.func_107651_b("selectServer.select")));
      this.field_104050_h.add(new C_101133_arl(4, this.field_104044_f / 2 - 50, this.field_104045_g - 52, 100, 20, var1.func_107651_b("selectServer.direct")));
      this.field_104050_h.add(new C_101133_arl(3, this.field_104044_f / 2 + 4 + 50, this.field_104045_g - 52, 100, 20, var1.func_107651_b("selectServer.add")));
      this.field_104050_h.add(new C_101133_arl(8, this.field_104044_f / 2 + 4, this.field_104045_g - 28, 70, 20, var1.func_107651_b("selectServer.refresh")));
      this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 + 4 + 76, this.field_104045_g - 28, 75, 20, var1.func_107651_b("gui.cancel")));
      boolean var2 = this.field_104211_n >= 0 && this.field_104211_n < this.field_104205_d.func_105830_a();
      this.field_104221_p.field_103909_g = var2;
      this.field_104212_o.field_103909_g = var2;
      this.field_104220_q.field_103909_g = var2;
   }

   public void func_104039_c() {
      super.func_104039_c();
      ++this.field_104222_z;
      if(this.field_104224_x.func_105648_a()) {
         this.field_104209_B = this.field_104224_x.func_105649_c();
         this.field_104224_x.func_105647_b();
      }

   }

   public void func_104038_b() {
      Keyboard.enableRepeatEvents(false);
      if(this.field_104223_y != null) {
         this.field_104223_y.interrupt();
         this.field_104223_y = null;
      }

   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f == 2) {
            String var2 = this.field_104213_m.func_110680_a(this.field_104211_n).field_110711_a;
            if(var2 != null) {
               this.field_104219_r = true;
               C_100361_be var3 = C_100361_be.func_107654_a();
               String var4 = var3.func_107651_b("selectServer.deleteQuestion");
               String var5 = "\'" + var2 + "\' " + var3.func_107651_b("selectServer.deleteWarning");
               String var6 = var3.func_107651_b("selectServer.deleteButton");
               String var7 = var3.func_107651_b("gui.cancel");
               C_101141_arq var8 = new C_101141_arq(this, var4, var5, var6, var7, this.field_104211_n);
               this.field_104046_e.func_105053_a(var8);
            }
         } else if(var1.field_103908_f == 1) {
            this.func_104185_a(this.field_104211_n);
         } else if(var1.field_103908_f == 4) {
            this.field_104216_u = true;
            this.field_104046_e.func_105053_a(new C_101140_arx(this, this.field_104214_w = new C_100909_axg(C_100359_bd.func_107638_a("selectServer.defaultName"), "")));
         } else if(var1.field_103908_f == 3) {
            this.field_104218_s = true;
            this.field_104046_e.func_105053_a(new C_101147_arz(this, this.field_104214_w = new C_100909_axg(C_100359_bd.func_107638_a("selectServer.defaultName"), "")));
         } else if(var1.field_103908_f == 7) {
            this.field_104217_t = true;
            C_100909_axg var9 = this.field_104213_m.func_110680_a(this.field_104211_n);
            this.field_104214_w = new C_100909_axg(var9.field_110711_a, var9.field_110709_b);
            this.field_104214_w.func_110698_b(var9.func_110700_d());
            this.field_104046_e.func_105053_a(new C_101147_arz(this, this.field_104214_w));
         } else if(var1.field_103908_f == 0) {
            this.field_104046_e.func_105053_a(this.field_104208_c);
         } else if(var1.field_103908_f == 8) {
            this.field_104046_e.func_105053_a(new C_101148_asg(this.field_104208_c));
         } else {
            this.field_104205_d.func_105834_a(var1);
         }

      }
   }

   public void func_104042_a(boolean var1, int var2) {
      if(this.field_104219_r) {
         this.field_104219_r = false;
         if(var1) {
            this.field_104213_m.func_110681_b(var2);
            this.field_104213_m.func_110685_b();
            this.field_104211_n = -1;
         }

         this.field_104046_e.func_105053_a(this);
      } else if(this.field_104216_u) {
         this.field_104216_u = false;
         if(var1) {
            this.func_104188_b(this.field_104214_w);
         } else {
            this.field_104046_e.func_105053_a(this);
         }
      } else if(this.field_104218_s) {
         this.field_104218_s = false;
         if(var1) {
            this.field_104213_m.func_110682_a(this.field_104214_w);
            this.field_104213_m.func_110685_b();
            this.field_104211_n = -1;
         }

         this.field_104046_e.func_105053_a(this);
      } else if(this.field_104217_t) {
         this.field_104217_t = false;
         if(var1) {
            C_100909_axg var3 = this.field_104213_m.func_110680_a(this.field_104211_n);
            var3.field_110711_a = this.field_104214_w.field_110711_a;
            var3.field_110709_b = this.field_104214_w.field_110709_b;
            var3.func_110698_b(this.field_104214_w.func_110700_d());
            this.field_104213_m.func_110685_b();
         }

         this.field_104046_e.func_105053_a(this);
      }

   }

   protected void func_104032_a(char var1, int var2) {
      int var3 = this.field_104211_n;
      if(var2 == 59) {
         this.field_104046_e.field_105156_y.field_111731_w = !this.field_104046_e.field_105156_y.field_111731_w;
         this.field_104046_e.field_105156_y.func_111684_b();
      } else {
         if(func_104041_p() && var2 == 200) {
            if(var3 > 0 && var3 < this.field_104213_m.func_110686_c()) {
               this.field_104213_m.func_110687_a(var3, var3 - 1);
               --this.field_104211_n;
               if(var3 < this.field_104213_m.func_110686_c() - 1) {
                  this.field_104205_d.func_105819_b(-this.field_104205_d.field_105841_e);
               }
            }
         } else if(func_104041_p() && var2 == 208) {
            if(var3 < this.field_104213_m.func_110686_c() - 1) {
               this.field_104213_m.func_110687_a(var3, var3 + 1);
               ++this.field_104211_n;
               if(var3 > 0) {
                  this.field_104205_d.func_105819_b(this.field_104205_d.field_105841_e);
               }
            }
         } else if(var1 == 13) {
            this.func_104040_a((C_101133_arl)this.field_104050_h.get(2));
         }

      }
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.field_104215_v = null;
      C_100361_be var4 = C_100361_be.func_107654_a();
      this.func_104035_z_();
      this.field_104205_d.func_105826_a(var1, var2, var3);
      this.func_103879_a(this.field_104049_k, var4.func_107651_b("multiplayer.title"), this.field_104044_f / 2, 20, 16777215);
      super.func_104027_a(var1, var2, var3);
      if(this.field_104215_v != null) {
         this.func_104189_a(this.field_104215_v, var1, var2);
      }

   }

   private void func_104185_a(int var1) {
      if(var1 < this.field_104213_m.func_110686_c()) {
         this.func_104188_b(this.field_104213_m.func_110680_a(var1));
      } else {
         var1 -= this.field_104213_m.func_110686_c();
         if(var1 < this.field_104209_B.size()) {
            C_100095_bcg var2 = (C_100095_bcg)this.field_104209_B.get(var1);
            this.func_104188_b(new C_100909_axg(var2.func_105763_a(), var2.func_105764_b()));
         }

      }
   }

   private void func_104188_b(C_100909_axg var1) {
      this.field_104046_e.func_105053_a(new C_101253_awu(this.field_104046_e, var1));
   }

   private static void func_104187_c(C_100909_axg var0) {
      C_100953_axf var1 = C_100953_axf.func_111142_a(var0.field_110709_b);
      Socket var2 = null;
      DataInputStream var3 = null;
      DataOutputStream var4 = null;

      try {
         var2 = new Socket();
         var2.setSoTimeout(3000);
         var2.setTcpNoDelay(true);
         var2.setTrafficClass(18);
         var2.connect(new InetSocketAddress(var1.func_111140_a(), var1.func_111144_b()), 3000);
         var3 = new DataInputStream(var2.getInputStream());
         var4 = new DataOutputStream(var2.getOutputStream());
         var4.write(254);
         var4.write(1);
         if(var3.read() != 255) {
            throw new IOException("Bad message");
         }

         String var5 = C_100219_dx.func_106551_a(var3, 256);
         char[] var6 = var5.toCharArray();

         for(int var7 = 0; var7 < var6.length; ++var7) {
            if(var6[var7] != 167 && var6[var7] != 0 && C_100011_m.field_105261_a.indexOf(var6[var7]) < 0) {
               var6[var7] = 63;
            }
         }

         var5 = new String(var6);
         int var8;
         int var9;
         String[] var26;
         if(var5.startsWith("§") && var5.length() > 1) {
            var26 = var5.substring(1).split(" ");
            if(C_100650_jv.func_108926_a(var26[0], 0) == 1) {
               var0.field_110707_d = var26[3];
               var0.field_110705_f = C_100650_jv.func_108926_a(var26[1], var0.field_110705_f);
               var0.field_110706_g = var26[2];
               var8 = C_100650_jv.func_108926_a(var26[4], 0);
               var9 = C_100650_jv.func_108926_a(var26[5], 0);
               if(var8 >= 0 && var9 >= 0) {
                  var0.field_110710_c = "§7" + var8 + "§8/§7" + var9;
               } else {
                  var0.field_110710_c = "§8???";
               }
            } else {
               var0.field_110706_g = "???";
               var0.field_110707_d = "§8???";
               var0.field_110705_f = 48;
               var0.field_110710_c = "§8???";
            }
         } else {
            var26 = var5.split("§");
            var5 = var26[0];
            var8 = -1;
            var9 = -1;

            try {
               var8 = Integer.parseInt(var26[1]);
               var9 = Integer.parseInt(var26[2]);
            } catch (Exception var24) {
               ;
            }

            var0.field_110707_d = "§7" + var5;
            if(var8 >= 0 && var9 > 0) {
               var0.field_110710_c = "§7" + var8 + "§8/§7" + var9;
            } else {
               var0.field_110710_c = "§8???";
            }

            var0.field_110706_g = "1.3";
            var0.field_110705_f = 46;
         }
      } finally {
         try {
            if(var3 != null) {
               var3.close();
            }
         } catch (Throwable var23) {
            ;
         }

         try {
            if(var4 != null) {
               var4.close();
            }
         } catch (Throwable var22) {
            ;
         }

         try {
            if(var2 != null) {
               var2.close();
            }
         } catch (Throwable var21) {
            ;
         }

      }

   }

   protected void func_104189_a(String var1, int var2, int var3) {
      if(var1 != null) {
         int var4 = var2 + 12;
         int var5 = var3 - 12;
         int var6 = this.field_104049_k.func_111778_a(var1);
         this.func_103881_a(var4 - 3, var5 - 3, var4 + var6 + 3, var5 + 8 + 3, -1073741824, -1073741824);
         this.field_104049_k.func_111783_a(var1, var4, var5, -1);
      }
   }

   // $FF: synthetic method
   static C_100907_axh func_104197_a(C_101148_asg var0) {
      return var0.field_104213_m;
   }

   // $FF: synthetic method
   static List func_104204_b(C_101148_asg var0) {
      return var0.field_104209_B;
   }

   // $FF: synthetic method
   static int func_104199_c(C_101148_asg var0) {
      return var0.field_104211_n;
   }

   // $FF: synthetic method
   static int func_104192_a(C_101148_asg var0, int var1) {
      return var0.field_104211_n = var1;
   }

   // $FF: synthetic method
   static C_101133_arl func_104193_d(C_101148_asg var0) {
      return var0.field_104221_p;
   }

   // $FF: synthetic method
   static C_101133_arl func_104201_e(C_101148_asg var0) {
      return var0.field_104212_o;
   }

   // $FF: synthetic method
   static C_101133_arl func_104191_f(C_101148_asg var0) {
      return var0.field_104220_q;
   }

   // $FF: synthetic method
   static void func_104190_b(C_101148_asg var0, int var1) {
      var0.func_104185_a(var1);
   }

   // $FF: synthetic method
   static int func_104186_g(C_101148_asg var0) {
      return var0.field_104222_z;
   }

   // $FF: synthetic method
   static Object func_104194_h() {
      return field_104206_b;
   }

   // $FF: synthetic method
   static int func_104196_i() {
      return field_104210_a;
   }

   // $FF: synthetic method
   static int func_104202_j() {
      return field_104210_a++;
   }

   // $FF: synthetic method
   static void func_104195_a(C_100909_axg var0) {
      func_104187_c(var0);
   }

   // $FF: synthetic method
   static int func_104200_k() {
      return field_104210_a--;
   }

   // $FF: synthetic method
   static String func_104203_a(C_101148_asg var0, String var1) {
      return var0.field_104215_v = var1;
   }

}
