import java.util.Random;
import org.lwjgl.input.Keyboard;

public class C_101137_aru extends C_101278_asw {

   private C_101278_asw field_104125_b;
   private C_101146_ary field_104126_c;
   private C_101146_ary field_104124_d;
   private String field_104130_m;
   private String field_104128_n = "survival";
   private boolean field_104129_o = true;
   private boolean field_104138_p = false;
   private boolean field_104137_q = false;
   private boolean field_104136_r = false;
   private boolean field_104135_s = false;
   private boolean field_104134_t;
   private boolean field_104133_u;
   private C_101133_arl field_104132_v;
   private C_101133_arl field_104131_w;
   private C_101133_arl field_104141_x;
   private C_101133_arl field_104140_y;
   private C_101133_arl field_104139_z;
   private C_101133_arl field_104120_A;
   private C_101133_arl field_104121_B;
   private String field_104122_C;
   private String field_104116_D;
   private String field_104117_E;
   private String field_104118_F;
   private int field_104119_G = 0;
   public String field_104127_a = "";
   private static final String[] field_104123_H = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};


   public C_101137_aru(C_101278_asw var1) {
      this.field_104125_b = var1;
      this.field_104117_E = "";
      this.field_104118_F = C_100359_bd.func_107638_a("selectWorld.newWorld");
   }

   public void func_104039_c() {
      this.field_104126_c.func_103938_a();
      this.field_104124_d.func_103938_a();
   }

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      Keyboard.enableRepeatEvents(true);
      this.field_104050_h.clear();
      this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 - 155, this.field_104045_g - 28, 150, 20, var1.func_107651_b("selectWorld.create")));
      this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 + 5, this.field_104045_g - 28, 150, 20, var1.func_107651_b("gui.cancel")));
      this.field_104050_h.add(this.field_104132_v = new C_101133_arl(2, this.field_104044_f / 2 - 75, 115, 150, 20, var1.func_107651_b("selectWorld.gameMode")));
      this.field_104050_h.add(this.field_104131_w = new C_101133_arl(3, this.field_104044_f / 2 - 75, 187, 150, 20, var1.func_107651_b("selectWorld.moreWorldOptions")));
      this.field_104050_h.add(this.field_104141_x = new C_101133_arl(4, this.field_104044_f / 2 - 155, 100, 150, 20, var1.func_107651_b("selectWorld.mapFeatures")));
      this.field_104141_x.field_103915_h = false;
      this.field_104050_h.add(this.field_104140_y = new C_101133_arl(7, this.field_104044_f / 2 + 5, 151, 150, 20, var1.func_107651_b("selectWorld.bonusItems")));
      this.field_104140_y.field_103915_h = false;
      this.field_104050_h.add(this.field_104139_z = new C_101133_arl(5, this.field_104044_f / 2 + 5, 100, 150, 20, var1.func_107651_b("selectWorld.mapType")));
      this.field_104139_z.field_103915_h = false;
      this.field_104050_h.add(this.field_104120_A = new C_101133_arl(6, this.field_104044_f / 2 - 155, 151, 150, 20, var1.func_107651_b("selectWorld.allowCommands")));
      this.field_104120_A.field_103915_h = false;
      this.field_104050_h.add(this.field_104121_B = new C_101133_arl(8, this.field_104044_f / 2 + 5, 120, 150, 20, var1.func_107651_b("selectWorld.customizeType")));
      this.field_104121_B.field_103915_h = false;
      this.field_104126_c = new C_101146_ary(this.field_104049_k, this.field_104044_f / 2 - 100, 60, 200, 20);
      this.field_104126_c.func_103955_b(true);
      this.field_104126_c.func_103940_a(this.field_104118_F);
      this.field_104124_d = new C_101146_ary(this.field_104049_k, this.field_104044_f / 2 - 100, 60, 200, 20);
      this.field_104124_d.func_103940_a(this.field_104117_E);
      this.func_104114_a(this.field_104133_u);
      this.func_104112_g();
      this.func_104115_h();
   }

   private void func_104112_g() {
      this.field_104130_m = this.field_104126_c.func_103939_b().trim();
      char[] var1 = C_100011_m.field_105260_b;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var4 = var1[var3];
         this.field_104130_m = this.field_104130_m.replace(var4, '_');
      }

      if(C_100650_jv.func_108930_a(this.field_104130_m)) {
         this.field_104130_m = "World";
      }

      this.field_104130_m = func_104110_a(this.field_104046_e.func_105080_d(), this.field_104130_m);
   }

   private void func_104115_h() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      this.field_104132_v.field_103911_e = var1.func_107651_b("selectWorld.gameMode") + " " + var1.func_107651_b("selectWorld.gameMode." + this.field_104128_n);
      this.field_104122_C = var1.func_107651_b("selectWorld.gameMode." + this.field_104128_n + ".line1");
      this.field_104116_D = var1.func_107651_b("selectWorld.gameMode." + this.field_104128_n + ".line2");
      this.field_104141_x.field_103911_e = var1.func_107651_b("selectWorld.mapFeatures") + " ";
      if(this.field_104129_o) {
         this.field_104141_x.field_103911_e = this.field_104141_x.field_103911_e + var1.func_107651_b("options.on");
      } else {
         this.field_104141_x.field_103911_e = this.field_104141_x.field_103911_e + var1.func_107651_b("options.off");
      }

      this.field_104140_y.field_103911_e = var1.func_107651_b("selectWorld.bonusItems") + " ";
      if(this.field_104136_r && !this.field_104135_s) {
         this.field_104140_y.field_103911_e = this.field_104140_y.field_103911_e + var1.func_107651_b("options.on");
      } else {
         this.field_104140_y.field_103911_e = this.field_104140_y.field_103911_e + var1.func_107651_b("options.off");
      }

      this.field_104139_z.field_103911_e = var1.func_107651_b("selectWorld.mapType") + " " + var1.func_107651_b(C_100845_xp.field_110160_a[this.field_104119_G].func_110150_b());
      this.field_104120_A.field_103911_e = var1.func_107651_b("selectWorld.allowCommands") + " ";
      if(this.field_104138_p && !this.field_104135_s) {
         this.field_104120_A.field_103911_e = this.field_104120_A.field_103911_e + var1.func_107651_b("options.on");
      } else {
         this.field_104120_A.field_103911_e = this.field_104120_A.field_103911_e + var1.func_107651_b("options.off");
      }

   }

   public static String func_104110_a(C_100270_agy var0, String var1) {
      var1 = var1.replaceAll("[\\./\"]", "_");
      String[] var2 = field_104123_H;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = var2[var4];
         if(var1.equalsIgnoreCase(var5)) {
            var1 = "_" + var1 + "_";
         }
      }

      while(var0.func_107194_c(var1) != null) {
         var1 = var1 + "-";
      }

      return var1;
   }

   public void func_104038_b() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f == 1) {
            this.field_104046_e.func_105053_a(this.field_104125_b);
         } else if(var1.field_103908_f == 0) {
            this.field_104046_e.func_105053_a((C_101278_asw)null);
            if(this.field_104134_t) {
               return;
            }

            this.field_104134_t = true;
            long var2 = (new Random()).nextLong();
            String var4 = this.field_104124_d.func_103939_b();
            if(!C_100650_jv.func_108930_a(var4)) {
               try {
                  long var5 = Long.parseLong(var4);
                  if(var5 != 0L) {
                     var2 = var5;
                  }
               } catch (NumberFormatException var7) {
                  var2 = (long)var4.hashCode();
               }
            }

            C_100836_xn var8 = C_100836_xn.func_110085_a(this.field_104128_n);
            C_100840_xm var6 = new C_100840_xm(var2, var8, this.field_104129_o, this.field_104135_s, C_100845_xp.field_110160_a[this.field_104119_G]);
            var6.func_110117_a(this.field_104127_a);
            if(this.field_104136_r && !this.field_104135_s) {
               var6.func_110123_a();
            }

            if(this.field_104138_p && !this.field_104135_s) {
               var6.func_110118_b();
            }

            this.field_104046_e.func_105087_a(this.field_104130_m, this.field_104126_c.func_103939_b().trim(), var6);
         } else if(var1.field_103908_f == 3) {
            this.func_104113_i();
         } else if(var1.field_103908_f == 2) {
            if(this.field_104128_n.equals("survival")) {
               if(!this.field_104137_q) {
                  this.field_104138_p = false;
               }

               this.field_104135_s = false;
               this.field_104128_n = "hardcore";
               this.field_104135_s = true;
               this.field_104120_A.field_103909_g = false;
               this.field_104140_y.field_103909_g = false;
               this.func_104115_h();
            } else if(this.field_104128_n.equals("hardcore")) {
               if(!this.field_104137_q) {
                  this.field_104138_p = true;
               }

               this.field_104135_s = false;
               this.field_104128_n = "creative";
               this.func_104115_h();
               this.field_104135_s = false;
               this.field_104120_A.field_103909_g = true;
               this.field_104140_y.field_103909_g = true;
            } else {
               if(!this.field_104137_q) {
                  this.field_104138_p = false;
               }

               this.field_104128_n = "survival";
               this.func_104115_h();
               this.field_104120_A.field_103909_g = true;
               this.field_104140_y.field_103909_g = true;
               this.field_104135_s = false;
            }

            this.func_104115_h();
         } else if(var1.field_103908_f == 4) {
            this.field_104129_o = !this.field_104129_o;
            this.func_104115_h();
         } else if(var1.field_103908_f == 7) {
            this.field_104136_r = !this.field_104136_r;
            this.func_104115_h();
         } else if(var1.field_103908_f == 5) {
            ++this.field_104119_G;
            if(this.field_104119_G >= C_100845_xp.field_110160_a.length) {
               this.field_104119_G = 0;
            }

            while(C_100845_xp.field_110160_a[this.field_104119_G] == null || !C_100845_xp.field_110160_a[this.field_104119_G].func_110147_d()) {
               ++this.field_104119_G;
               if(this.field_104119_G >= C_100845_xp.field_110160_a.length) {
                  this.field_104119_G = 0;
               }
            }

            this.field_104127_a = "";
            this.func_104115_h();
            this.func_104114_a(this.field_104133_u);
         } else if(var1.field_103908_f == 6) {
            this.field_104137_q = true;
            this.field_104138_p = !this.field_104138_p;
            this.func_104115_h();
         } else if(var1.field_103908_f == 8) {
            this.field_104046_e.func_105053_a(new C_101143_ars(this, this.field_104127_a));
         }

      }
   }

   private void func_104113_i() {
      this.func_104114_a(!this.field_104133_u);
   }

   private void func_104114_a(boolean var1) {
      this.field_104133_u = var1;
      this.field_104132_v.field_103915_h = !this.field_104133_u;
      this.field_104141_x.field_103915_h = this.field_104133_u;
      this.field_104140_y.field_103915_h = this.field_104133_u;
      this.field_104139_z.field_103915_h = this.field_104133_u;
      this.field_104120_A.field_103915_h = this.field_104133_u;
      this.field_104121_B.field_103915_h = this.field_104133_u && C_100845_xp.field_110160_a[this.field_104119_G] == C_100845_xp.field_110159_c;
      C_100361_be var2;
      if(this.field_104133_u) {
         var2 = C_100361_be.func_107654_a();
         this.field_104131_w.field_103911_e = var2.func_107651_b("gui.done");
      } else {
         var2 = C_100361_be.func_107654_a();
         this.field_104131_w.field_103911_e = var2.func_107651_b("selectWorld.moreWorldOptions");
      }

   }

   protected void func_104032_a(char var1, int var2) {
      if(this.field_104126_c.func_103966_l() && !this.field_104133_u) {
         this.field_104126_c.func_103961_a(var1, var2);
         this.field_104118_F = this.field_104126_c.func_103939_b();
      } else if(this.field_104124_d.func_103966_l() && this.field_104133_u) {
         this.field_104124_d.func_103961_a(var1, var2);
         this.field_104117_E = this.field_104124_d.func_103939_b();
      }

      if(var1 == 13) {
         this.func_104040_a((C_101133_arl)this.field_104050_h.get(0));
      }

      ((C_101133_arl)this.field_104050_h.get(0)).field_103909_g = this.field_104126_c.func_103939_b().length() > 0;
      this.func_104112_g();
   }

   protected void func_104028_a(int var1, int var2, int var3) {
      super.func_104028_a(var1, var2, var3);
      if(this.field_104133_u) {
         this.field_104124_d.func_103952_a(var1, var2, var3);
      } else {
         this.field_104126_c.func_103952_a(var1, var2, var3);
      }

   }

   public void func_104027_a(int var1, int var2, float var3) {
      C_100361_be var4 = C_100361_be.func_107654_a();
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, var4.func_107651_b("selectWorld.create"), this.field_104044_f / 2, 20, 16777215);
      if(this.field_104133_u) {
         this.func_103880_b(this.field_104049_k, var4.func_107651_b("selectWorld.enterSeed"), this.field_104044_f / 2 - 100, 47, 10526880);
         this.func_103880_b(this.field_104049_k, var4.func_107651_b("selectWorld.seedInfo"), this.field_104044_f / 2 - 100, 85, 10526880);
         this.func_103880_b(this.field_104049_k, var4.func_107651_b("selectWorld.mapFeatures.info"), this.field_104044_f / 2 - 150, 122, 10526880);
         this.func_103880_b(this.field_104049_k, var4.func_107651_b("selectWorld.allowCommands.info"), this.field_104044_f / 2 - 150, 172, 10526880);
         this.field_104124_d.func_103954_f();
      } else {
         this.func_103880_b(this.field_104049_k, var4.func_107651_b("selectWorld.enterName"), this.field_104044_f / 2 - 100, 47, 10526880);
         this.func_103880_b(this.field_104049_k, var4.func_107651_b("selectWorld.resultFolder") + " " + this.field_104130_m, this.field_104044_f / 2 - 100, 85, 10526880);
         this.field_104126_c.func_103954_f();
         this.func_103880_b(this.field_104049_k, this.field_104122_C, this.field_104044_f / 2 - 100, 137, 10526880);
         this.func_103880_b(this.field_104049_k, this.field_104116_D, this.field_104044_f / 2 - 100, 149, 10526880);
      }

      super.func_104027_a(var1, var2, var3);
   }

   public void func_104111_a(C_100269_agv var1) {
      this.field_104118_F = C_100359_bd.func_107637_a("selectWorld.newWorld.copyOf", new Object[]{var1.func_107131_k()});
      this.field_104117_E = var1.func_107133_b() + "";
      this.field_104119_G = var1.func_107143_u().func_110144_f();
      this.field_104127_a = var1.func_107127_y();
      this.field_104129_o = var1.func_107167_s();
      this.field_104138_p = var1.func_107139_v();
      if(var1.func_107145_t()) {
         this.field_104128_n = "hardcore";
      } else if(var1.func_107135_r().func_110087_e()) {
         this.field_104128_n = "survival";
      } else if(var1.func_107135_r().func_110089_d()) {
         this.field_104128_n = "creative";
      }

   }

}
