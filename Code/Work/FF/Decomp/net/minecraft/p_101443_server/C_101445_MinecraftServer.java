package net.minecraft.p_101443_server;

import java.awt.GraphicsEnvironment;
import java.io.File;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class C_101445_MinecraftServer implements Runnable, C_100712_kr, C_100020_s {

   public static Logger field_104987_a = Logger.getLogger("Minecraft");
   private static C_101445_MinecraftServer field_104990_l = null;
   private final C_100270_agy field_104991_m;
   private final C_100708_kp field_104988_n = new C_100708_kp("server", this);
   private final File field_104989_o;
   private final List field_105003_p = new ArrayList();
   private final C_100021_r field_105002_q;
   public final C_100649_jy field_104985_b = new C_100649_jy();
   private String field_105001_r;
   private int field_105000_s = -1;
   public C_100765_ie[] field_104986_c;
   private C_100122_ge field_104999_t;
   private boolean field_104998_u = true;
   private boolean field_104997_v = false;
   private int field_104996_w = 0;
   public String field_104983_d;
   public int field_104984_e;
   private boolean field_105006_x;
   private boolean field_105005_y;
   private boolean field_105004_z;
   private boolean field_104965_A;
   private boolean field_104966_B;
   private String field_104967_C;
   private int field_104961_D;
   private long field_104962_E;
   private long field_104963_F;
   private long field_104964_G;
   private long field_104972_H;
   public final long[] field_104981_f = new long[100];
   public final long[] field_104982_g = new long[100];
   public final long[] field_104994_h = new long[100];
   public final long[] field_104995_i = new long[100];
   public final long[] field_104992_j = new long[100];
   public long[][] field_104993_k;
   private KeyPair field_104973_I;
   private String field_104974_J;
   private String field_104975_K;
   private String field_104968_L;
   private boolean field_104969_M;
   private boolean field_104970_N;
   private boolean field_104971_O;
   private String field_104978_P = "";
   private boolean field_104977_Q = false;
   private long field_104980_R;
   private String field_104979_S;
   private boolean field_104976_T;


   public C_101445_MinecraftServer(File var1) {
      field_104990_l = this;
      this.field_104989_o = var1;
      this.field_105002_q = new C_100181_ha();
      this.field_104991_m = new C_100308_agq(var1);
      this.func_104865_al();
   }

   private void func_104865_al() {
      C_100190_ail.field_106333_a.func_107927_a(C_100992_tt.field_110840_l, new C_100132_fk(this));
      C_100190_ail.field_106333_a.func_107927_a(C_100992_tt.field_110912_aP, new C_100150_fu(this));
      C_100190_ail.field_106333_a.func_107927_a(C_100992_tt.field_110916_aD, new C_100113_fv(this));
      C_100190_ail.field_106333_a.func_107927_a(C_100992_tt.field_110957_bD, new C_100114_fw(this));
      C_100190_ail.field_106333_a.func_107927_a(C_100992_tt.field_110864_bs, new C_100115_fx(this));
      C_100190_ail.field_106333_a.func_107927_a(C_100992_tt.field_110963_bC, new C_100109_fz(this));
      C_100190_ail.field_106333_a.func_107927_a(C_100992_tt.field_110959_bE, new C_100128_ga(this));
      C_100130_gb var1 = new C_100130_gb(this);
      C_100190_ail.field_106333_a.func_107927_a(C_100992_tt.field_110921_az, var1);
      C_100190_ail.field_106333_a.func_107927_a(C_100992_tt.field_110910_aN, var1);
      C_100190_ail.field_106333_a.func_107927_a(C_100992_tt.field_110911_aO, var1);
      C_100190_ail.field_106333_a.func_107927_a(C_100992_tt.field_110917_aE, new C_100118_gc(this));
      C_100137_fl var2 = new C_100137_fl(this);
      C_100190_ail.field_106333_a.func_107927_a(C_100992_tt.field_110923_ay, var2);
      C_100190_ail.field_106333_a.func_107927_a(C_100992_tt.field_110934_ax, var2);
      C_100190_ail.field_106333_a.func_107927_a(C_100992_tt.field_110936_aw, new C_100136_fm(this));
   }

   protected abstract boolean func_104887_c();

   protected void func_104880_b(String var1) {
      if(this.func_104896_N().func_107197_b(var1)) {
         field_104987_a.info("Converting map!");
         this.func_104917_c("menu.convertingLevel");
         this.func_104896_N().func_107199_a(var1, new C_100155_fn(this));
      }

   }

   protected synchronized void func_104917_c(String var1) {
      this.field_104979_S = var1;
   }

   public synchronized String func_104900_d() {
      return this.field_104979_S;
   }

   protected void func_104924_a(String var1, String var2, long var3, C_100845_xp var5, String var6) {
      this.func_104880_b(var1);
      this.func_104917_c("menu.loadingLevel");
      this.field_104986_c = new C_100765_ie[3];
      this.field_104993_k = new long[this.field_104986_c.length][100];
      C_100268_agw var7 = this.field_104991_m.func_107200_a(var1, true);
      C_100269_agv var9 = var7.func_107088_d();
      C_100840_xm var8;
      if(var9 == null) {
         var8 = new C_100840_xm(var3, this.func_104947_g(), this.func_104958_f(), this.func_104918_i(), var5);
         var8.func_110117_a(var6);
      } else {
         var8 = new C_100840_xm(var9);
      }

      if(this.field_104970_N) {
         var8.func_110123_a();
      }

      for(int var10 = 0; var10 < this.field_104986_c.length; ++var10) {
         byte var11 = 0;
         if(var10 == 1) {
            var11 = -1;
         }

         if(var10 == 2) {
            var11 = 1;
         }

         if(var10 == 0) {
            if(this.func_104955_M()) {
               this.field_104986_c[var10] = new C_100739_hw(this, var7, var2, var11, this.field_104985_b);
            } else {
               this.field_104986_c[var10] = new C_100765_ie(this, var7, var2, var11, var8, this.field_104985_b);
            }
         } else {
            this.field_104986_c[var10] = new C_100770_hy(this, var7, var2, var11, var8, this.field_104986_c[0], this.field_104985_b);
         }

         this.field_104986_c[var10].func_109521_a(new C_100761_ia(this, this.field_104986_c[var10]));
         if(!this.func_104921_I()) {
            this.field_104986_c[var10].func_109429_J().func_107148_a(this.func_104947_g());
         }

         this.field_104999_t.func_105720_a(this.field_104986_c);
      }

      this.func_104908_c(this.func_104883_h());
      this.func_104910_e();
   }

   protected void func_104910_e() {
      int var5 = 0;
      this.func_104917_c("menu.generatingTerrain");
      byte var6 = 0;
      field_104987_a.info("Preparing start region for level " + var6);
      C_100765_ie var7 = this.field_104986_c[var6];
      C_100013_k var8 = var7.func_109381_G();
      long var9 = System.currentTimeMillis();

      for(int var11 = -192; var11 <= 192 && this.func_104941_m(); var11 += 16) {
         for(int var12 = -192; var12 <= 192 && this.func_104941_m(); var12 += 16) {
            long var13 = System.currentTimeMillis();
            if(var13 - var9 > 1000L) {
               this.func_104893_a_("Preparing spawn area", var5 * 100 / 625);
               var9 = var13;
            }

            ++var5;
            var7.field_109620_b.func_108660_c(var8.field_105273_a + var11 >> 4, var8.field_105272_c + var12 >> 4);
         }
      }

      this.func_104942_j();
   }

   public abstract boolean func_104958_f();

   public abstract C_100836_xn func_104947_g();

   public abstract int func_104883_h();

   public abstract boolean func_104918_i();

   protected void func_104893_a_(String var1, int var2) {
      this.field_104983_d = var1;
      this.field_104984_e = var2;
      field_104987_a.info(var1 + ": " + var2 + "%");
   }

   protected void func_104942_j() {
      this.field_104983_d = null;
      this.field_104984_e = 0;
   }

   protected void func_104949_a(boolean var1) {
      if(!this.field_104971_O) {
         C_100765_ie[] var2 = this.field_104986_c;
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            C_100765_ie var5 = var2[var4];
            if(var5 != null) {
               if(!var1) {
                  field_104987_a.info("Saving chunks for level \'" + var5.func_109429_J().func_107131_k() + "\'/" + var5.field_109576_v.func_112387_l());
               }

               try {
                  var5.func_109605_a(true, (C_100683_ka)null);
               } catch (C_100829_xj var7) {
                  field_104987_a.warning(var7.getMessage());
               }
            }
         }

      }
   }

   public void func_104916_k() {
      if(!this.field_104971_O) {
         field_104987_a.info("Stopping server");
         if(this.func_104898_ae() != null) {
            this.func_104898_ae().func_105773_a();
         }

         if(this.field_104999_t != null) {
            field_104987_a.info("Saving players");
            this.field_104999_t.func_105735_g();
            this.field_104999_t.func_105713_r();
         }

         field_104987_a.info("Saving worlds");
         this.func_104949_a(false);
         C_100765_ie[] var1 = this.field_104986_c;
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            C_100765_ie var4 = var1[var3];
            var4.func_109607_m();
         }

         if(this.field_104988_n != null && this.field_104988_n.func_109261_d()) {
            this.field_104988_n.func_109263_e();
         }

      }
   }

   public String func_104871_l() {
      return this.field_105001_r;
   }

   public void func_104870_d(String var1) {
      this.field_105001_r = var1;
   }

   public boolean func_104941_m() {
      return this.field_104998_u;
   }

   public void func_104930_n() {
      this.field_104998_u = false;
   }

   public void run() {
      try {
         if(this.func_104887_c()) {
            long var1 = System.currentTimeMillis();

            for(long var50 = 0L; this.field_104998_u; this.field_104977_Q = true) {
               long var5 = System.currentTimeMillis();
               long var7 = var5 - var1;
               if(var7 > 2000L && var1 - this.field_104980_R >= 15000L) {
                  field_104987_a.warning("Can\'t keep up! Did the system time change, or is the server overloaded?");
                  var7 = 2000L;
                  this.field_104980_R = var1;
               }

               if(var7 < 0L) {
                  field_104987_a.warning("Time ran backwards! Did the system time change?");
                  var7 = 0L;
               }

               var50 += var7;
               var1 = var5;
               if(this.field_104986_c[0].func_109616_e()) {
                  this.func_104866_q();
                  var50 = 0L;
               } else {
                  while(var50 > 50L) {
                     var50 -= 50L;
                     this.func_104866_q();
                  }
               }

               Thread.sleep(1L);
            }
         } else {
            this.func_104909_a((C_100007_a)null);
         }
      } catch (Throwable var48) {
         var48.printStackTrace();
         field_104987_a.log(Level.SEVERE, "Encountered an unexpected exception " + var48.getClass().getSimpleName(), var48);
         C_100007_a var2 = null;
         if(var48 instanceof C_100010_l) {
            var2 = this.func_104913_b(((C_100010_l)var48).func_105255_a());
         } else {
            var2 = this.func_104913_b(new C_100007_a("Exception in server tick loop", var48));
         }

         File var3 = new File(new File(this.func_104951_o(), "crash-reports"), "crash-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + "-server.txt");
         if(var2.func_105190_a(var3)) {
            field_104987_a.severe("This crash report has been saved to: " + var3.getAbsolutePath());
         } else {
            field_104987_a.severe("We were unable to save this crash report to disk.");
         }

         this.func_104909_a(var2);
      } finally {
         try {
            this.func_104916_k();
            this.field_104997_v = true;
         } catch (Throwable var46) {
            var46.printStackTrace();
         } finally {
            this.func_104894_p();
         }

      }

   }

   protected File func_104951_o() {
      return new File(".");
   }

   protected void func_104909_a(C_100007_a var1) {}

   protected void func_104894_p() {}

   public void func_104866_q() {
      long var1 = System.nanoTime();
      C_100412_amr.func_107892_a().func_107842_a();
      ++this.field_104996_w;
      if(this.field_104976_T) {
         this.field_104976_T = false;
         this.field_104985_b.field_108908_a = true;
         this.field_104985_b.func_108898_a();
      }

      this.field_104985_b.func_108901_a("root");
      this.func_104934_r();
      if(this.field_104996_w % 900 == 0) {
         this.field_104985_b.func_108901_a("save");
         this.field_104999_t.func_105735_g();
         this.func_104949_a(true);
         this.field_104985_b.func_108900_b();
      }

      this.field_104985_b.func_108901_a("tallying");
      this.field_104992_j[this.field_104996_w % 100] = System.nanoTime() - var1;
      this.field_104981_f[this.field_104996_w % 100] = C_100219_dx.field_106560_p - this.field_104962_E;
      this.field_104962_E = C_100219_dx.field_106560_p;
      this.field_104982_g[this.field_104996_w % 100] = C_100219_dx.field_106559_q - this.field_104963_F;
      this.field_104963_F = C_100219_dx.field_106559_q;
      this.field_104994_h[this.field_104996_w % 100] = C_100219_dx.field_106562_n - this.field_104964_G;
      this.field_104964_G = C_100219_dx.field_106562_n;
      this.field_104995_i[this.field_104996_w % 100] = C_100219_dx.field_106563_o - this.field_104972_H;
      this.field_104972_H = C_100219_dx.field_106563_o;
      this.field_104985_b.func_108900_b();
      this.field_104985_b.func_108901_a("snooper");
      if(!this.field_104988_n.func_109261_d() && this.field_104996_w > 100) {
         this.field_104988_n.func_109255_a();
      }

      if(this.field_104996_w % 6000 == 0) {
         this.field_104988_n.func_109264_b();
      }

      this.field_104985_b.func_108900_b();
      this.field_104985_b.func_108900_b();
   }

   public void func_104934_r() {
      this.field_104985_b.func_108901_a("levels");

      for(int var1 = 0; var1 < this.field_104986_c.length; ++var1) {
         long var2 = System.nanoTime();
         if(var1 == 0 || this.func_104936_s()) {
            C_100765_ie var4 = this.field_104986_c[var1];
            this.field_104985_b.func_108901_a(var4.func_109429_J().func_107131_k());
            this.field_104985_b.func_108901_a("pools");
            var4.func_109363_R().func_107881_a();
            this.field_104985_b.func_108900_b();
            if(this.field_104996_w % 20 == 0) {
               this.field_104985_b.func_108901_a("timeSync");
               this.field_104999_t.func_105737_a(new C_100305_es(var4.func_109463_E(), var4.func_109433_F()), var4.field_109576_v.field_112401_h);
               this.field_104985_b.func_108900_b();
            }

            this.field_104985_b.func_108901_a("tick");
            var4.func_109397_b();
            var4.func_109419_h();
            this.field_104985_b.func_108900_b();
            this.field_104985_b.func_108901_a("tracker");
            var4.func_109617_p().func_109782_a();
            this.field_104985_b.func_108900_b();
            this.field_104985_b.func_108900_b();
         }

         this.field_104993_k[var1][this.field_104996_w % 100] = System.nanoTime() - var2;
      }

      this.field_104985_b.func_108899_c("connection");
      this.func_104898_ae().func_105775_b();
      this.field_104985_b.func_108899_c("players");
      this.field_104999_t.func_105703_b();
      this.field_104985_b.func_108899_c("tickables");
      Iterator var5 = this.field_105003_p.iterator();

      while(var5.hasNext()) {
         C_100195_gh var6 = (C_100195_gh)var5.next();
         var6.func_105928_a();
      }

      this.field_104985_b.func_108900_b();
   }

   public boolean func_104936_s() {
      return true;
   }

   public void func_104876_t() {
      (new C_100159_fp(this, "Server thread")).start();
   }

   public File func_104891_e(String var1) {
      return new File(this.func_104951_o(), var1);
   }

   public void func_104940_f(String var1) {
      field_104987_a.info(var1);
   }

   public void func_104922_g(String var1) {
      field_104987_a.warning(var1);
   }

   public C_100765_ie func_104879_a(int var1) {
      return var1 == -1?this.field_104986_c[1]:(var1 == 1?this.field_104986_c[2]:this.field_104986_c[0]);
   }

   public String func_104868_u() {
      return this.field_105001_r;
   }

   public int func_104957_v() {
      return this.field_105000_s;
   }

   public String func_104927_w() {
      return this.field_104967_C;
   }

   public String func_104895_x() {
      return "1.4.2";
   }

   public int func_104960_y() {
      return this.field_104999_t.func_105714_k();
   }

   public int func_104885_z() {
      return this.field_104999_t.func_105691_l();
   }

   public String[] func_104890_A() {
      return this.field_104999_t.func_105699_d();
   }

   public String func_104892_B() {
      return "";
   }

   public String func_104929_h(String var1) {
      C_100778_iq.field_104863_a.func_104861_c();
      this.field_105002_q.func_105197_a(C_100778_iq.field_104863_a, var1);
      return C_100778_iq.field_104863_a.func_104860_d();
   }

   public boolean func_104926_C() {
      return false;
   }

   public void func_104928_i(String var1) {
      field_104987_a.log(Level.SEVERE, var1);
   }

   public void func_104878_j(String var1) {
      if(this.func_104926_C()) {
         field_104987_a.log(Level.INFO, var1);
      }

   }

   public String func_104954_getServerModName() {
      return "vanilla";
   }

   public C_100007_a func_104913_b(C_100007_a var1) {
      var1.func_105182_a("Is Modded", new C_100157_fq(this));
      var1.func_105182_a("Profiler Position", new C_100148_fr(this));
      if(this.field_104986_c != null && this.field_104986_c.length > 0 && this.field_104986_c[0] != null) {
         var1.func_105182_a("Vec3 Pool Size", new C_100146_fs(this));
      }

      if(this.field_104999_t != null) {
         var1.func_105182_a("Player Count", new C_100152_ft(this));
      }

      if(this.field_104986_c != null) {
         C_100765_ie[] var2 = this.field_104986_c;
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            C_100765_ie var5 = var2[var4];
            if(var5 != null) {
               var5.func_109483_a(var1);
            }
         }
      }

      return var1;
   }

   public List func_104932_a(C_100020_s var1, String var2) {
      ArrayList var3 = new ArrayList();
      if(var2.startsWith("/")) {
         var2 = var2.substring(1);
         boolean var10 = !var2.contains(" ");
         List var11 = this.field_105002_q.func_105199_b(var1, var2);
         if(var11 != null) {
            Iterator var12 = var11.iterator();

            while(var12.hasNext()) {
               String var13 = (String)var12.next();
               if(var10) {
                  var3.add("/" + var13);
               } else {
                  var3.add(var13);
               }
            }
         }

         return var3;
      } else {
         String[] var4 = var2.split(" ", -1);
         String var5 = var4[var4.length - 1];
         String[] var6 = this.field_104999_t.func_105699_d();
         int var7 = var6.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            String var9 = var6[var8];
            if(C_100009_o.func_105215_a(var5, var9)) {
               var3.add(var9);
            }
         }

         return var3;
      }
   }

   public static C_101445_MinecraftServer func_104953_D() {
      return field_104990_l;
   }

   public String func_102909_c_() {
      return "Server";
   }

   public void func_102910_a(String var1) {
      field_104987_a.info(C_100679_kd.func_109122_a(var1));
   }

   public boolean func_102912_a(int var1, String var2) {
      return true;
   }

   public String func_102908_a(String var1, Object ... var2) {
      return C_100361_be.func_107654_a().func_107649_a(var1, var2);
   }

   public C_100021_r func_104888_E() {
      return this.field_105002_q;
   }

   public KeyPair func_104899_F() {
      return this.field_104973_I;
   }

   public int func_104884_G() {
      return this.field_105000_s;
   }

   public void func_104889_b(int var1) {
      this.field_105000_s = var1;
   }

   public String func_104919_H() {
      return this.field_104974_J;
   }

   public void func_104875_k(String var1) {
      this.field_104974_J = var1;
   }

   public boolean func_104921_I() {
      return this.field_104974_J != null;
   }

   public String func_104904_J() {
      return this.field_104975_K;
   }

   public void func_104907_l(String var1) {
      this.field_104975_K = var1;
   }

   public void func_104943_m(String var1) {
      this.field_104968_L = var1;
   }

   public String func_104867_K() {
      return this.field_104968_L;
   }

   public void func_104935_a(KeyPair var1) {
      this.field_104973_I = var1;
   }

   public void func_104908_c(int var1) {
      for(int var2 = 0; var2 < this.field_104986_c.length; ++var2) {
         C_100765_ie var3 = this.field_104986_c[var2];
         if(var3 != null) {
            if(var3.func_109429_J().func_107145_t()) {
               var3.field_109578_t = 3;
               var3.func_109452_a(true, true);
            } else if(this.func_104921_I()) {
               var3.field_109578_t = var1;
               var3.func_109452_a(var3.field_109578_t > 0, true);
            } else {
               var3.field_109578_t = var1;
               var3.func_109452_a(this.func_104920_L(), this.field_105005_y);
            }
         }
      }

   }

   protected boolean func_104920_L() {
      return true;
   }

   public boolean func_104955_M() {
      return this.field_104969_M;
   }

   public void func_104882_b(boolean var1) {
      this.field_104969_M = var1;
   }

   public void func_104873_c(boolean var1) {
      this.field_104970_N = var1;
   }

   public C_100270_agy func_104896_N() {
      return this.field_104991_m;
   }

   public void func_104877_P() {
      this.field_104971_O = true;
      this.func_104896_N().func_107196_d();

      for(int var1 = 0; var1 < this.field_104986_c.length; ++var1) {
         C_100765_ie var2 = this.field_104986_c[var1];
         if(var2 != null) {
            var2.func_109607_m();
         }
      }

      this.func_104896_N().func_107198_e(this.field_104986_c[0].func_109509_I().func_107091_g());
      this.func_104930_n();
   }

   public String func_104874_Q() {
      return this.field_104978_P;
   }

   public void func_104925_n(String var1) {
      this.field_104978_P = var1;
   }

   public void func_102905_a(C_100708_kp var1) {
      var1.func_109265_a("whitelist_enabled", Boolean.valueOf(false));
      var1.func_109265_a("whitelist_count", Integer.valueOf(0));
      var1.func_109265_a("players_current", Integer.valueOf(this.func_104960_y()));
      var1.func_109265_a("players_max", Integer.valueOf(this.func_104885_z()));
      var1.func_109265_a("players_seen", Integer.valueOf(this.field_104999_t.func_105726_m().length));
      var1.func_109265_a("uses_auth", Boolean.valueOf(this.field_105006_x));
      var1.func_109265_a("gui_state", this.func_104906_ag()?"enabled":"disabled");
      var1.func_109265_a("avg_tick_ms", Integer.valueOf((int)(C_100650_jv.func_108909_a(this.field_104992_j) * 1.0E-6D)));
      var1.func_109265_a("avg_sent_packet_count", Integer.valueOf((int)C_100650_jv.func_108909_a(this.field_104981_f)));
      var1.func_109265_a("avg_sent_packet_size", Integer.valueOf((int)C_100650_jv.func_108909_a(this.field_104982_g)));
      var1.func_109265_a("avg_rec_packet_count", Integer.valueOf((int)C_100650_jv.func_108909_a(this.field_104994_h)));
      var1.func_109265_a("avg_rec_packet_size", Integer.valueOf((int)C_100650_jv.func_108909_a(this.field_104995_i)));
      int var2 = 0;

      for(int var3 = 0; var3 < this.field_104986_c.length; ++var3) {
         if(this.field_104986_c[var3] != null) {
            C_100765_ie var4 = this.field_104986_c[var3];
            C_100269_agv var5 = var4.func_109429_J();
            var1.func_109265_a("world[" + var2 + "][dimension]", Integer.valueOf(var4.field_109576_v.field_112401_h));
            var1.func_109265_a("world[" + var2 + "][mode]", var5.func_107135_r());
            var1.func_109265_a("world[" + var2 + "][difficulty]", Integer.valueOf(var4.field_109578_t));
            var1.func_109265_a("world[" + var2 + "][hardcore]", Boolean.valueOf(var5.func_107145_t()));
            var1.func_109265_a("world[" + var2 + "][generator_name]", var5.func_107143_u().func_110148_a());
            var1.func_109265_a("world[" + var2 + "][generator_version]", Integer.valueOf(var5.func_107143_u().func_110152_c()));
            var1.func_109265_a("world[" + var2 + "][height]", Integer.valueOf(this.field_104961_D));
            var1.func_109265_a("world[" + var2 + "][chunks_loaded]", Integer.valueOf(var4.func_109479_H().func_108658_e()));
            ++var2;
         }
      }

      var1.func_109265_a("worlds", Integer.valueOf(var2));
   }

   public void func_102907_b(C_100708_kp var1) {
      var1.func_109265_a("singleplayer", Boolean.valueOf(this.func_104921_I()));
      var1.func_109265_a("server_brand", this.func_104954_getServerModName());
      var1.func_109265_a("gui_supported", GraphicsEnvironment.isHeadless()?"headless":"supported");
      var1.func_109265_a("dedicated", Boolean.valueOf(this.func_104948_T()));
   }

   public boolean func_102906_R() {
      return true;
   }

   public int func_104937_S() {
      return 16;
   }

   public abstract boolean func_104948_T();

   public boolean func_104950_U() {
      return this.field_105006_x;
   }

   public void func_104912_d(boolean var1) {
      this.field_105006_x = var1;
   }

   public boolean func_104903_V() {
      return this.field_105005_y;
   }

   public void func_104933_e(boolean var1) {
      this.field_105005_y = var1;
   }

   public boolean func_104897_W() {
      return this.field_105004_z;
   }

   public void func_104939_f(boolean var1) {
      this.field_105004_z = var1;
   }

   public boolean func_104914_X() {
      return this.field_104965_A;
   }

   public void func_104864_g(boolean var1) {
      this.field_104965_A = var1;
   }

   public boolean func_104872_Y() {
      return this.field_104966_B;
   }

   public void func_104923_h(boolean var1) {
      this.field_104966_B = var1;
   }

   public abstract boolean func_104881_Z();

   public String func_104901_aa() {
      return this.field_104967_C;
   }

   public void func_104952_o(String var1) {
      this.field_104967_C = var1;
   }

   public int func_104905_ab() {
      return this.field_104961_D;
   }

   public void func_104869_d(int var1) {
      this.field_104961_D = var1;
   }

   public boolean func_104915_ac() {
      return this.field_104997_v;
   }

   public C_100122_ge func_104931_ad() {
      return this.field_104999_t;
   }

   public void func_104938_a(C_100122_ge var1) {
      this.field_104999_t = var1;
   }

   public void func_104902_a(C_100836_xn var1) {
      for(int var2 = 0; var2 < this.field_104986_c.length; ++var2) {
         func_104953_D().field_104986_c[var2].func_109429_J().func_107148_a(var1);
      }

   }

   public abstract C_100803_in func_104898_ae();

   public boolean func_104946_af() {
      return this.field_104977_Q;
   }

   public boolean func_104906_ag() {
      return false;
   }

   public abstract String func_104911_a(C_100836_xn var1, boolean var2);

   public int func_104956_ah() {
      return this.field_104996_w;
   }

   public void func_104944_ai() {
      this.field_104976_T = true;
   }

   public C_100708_kp func_104959_aj() {
      return this.field_104988_n;
   }

   public C_100013_k func_102911_b() {
      return new C_100013_k(0, 0, 0);
   }

   public int func_104886_ak() {
      return 16;
   }

   // $FF: synthetic method
   public static C_100122_ge func_104945_a(C_101445_MinecraftServer var0) {
      return var0.field_104999_t;
   }

}
