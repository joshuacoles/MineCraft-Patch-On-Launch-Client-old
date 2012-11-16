import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100170_hg extends C_101445_MinecraftServer implements C_100124_gf {

   private final List field_105030_l = Collections.synchronizedList(new ArrayList());
   private C_100782_is field_105031_m;
   private C_100789_iw field_105028_n;
   private C_100197_gg field_105029_o;
   private boolean field_105027_p;
   private C_100836_xn field_105026_q;
   private C_100803_in field_105025_r;
   private boolean field_105024_s = false;


   public C_100170_hg(File var1) {
      super(var1);
      new C_100747_hh(this);
   }

   protected boolean func_104887_c() {
      C_100749_hi var1 = new C_100749_hi(this);
      var1.setDaemon(true);
      var1.start();
      C_100143_fi.func_106515_a();
      field_104987_a.info("Starting minecraft server version 1.4.2");
      if(Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         field_104987_a.warning("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      field_104987_a.info("Loading properties");
      this.field_105029_o = new C_100197_gg(new File("server.properties"));
      if(this.func_104921_I()) {
         this.func_104870_d("127.0.0.1");
      } else {
         this.func_104912_d(this.field_105029_o.func_106531_a("online-mode", true));
         this.func_104870_d(this.field_105029_o.func_106532_a("server-ip", ""));
      }

      this.func_104933_e(this.field_105029_o.func_106531_a("spawn-animals", true));
      this.func_104939_f(this.field_105029_o.func_106531_a("spawn-npcs", true));
      this.func_104864_g(this.field_105029_o.func_106531_a("pvp", true));
      this.func_104923_h(this.field_105029_o.func_106531_a("allow-flight", false));
      this.func_104925_n(this.field_105029_o.func_106532_a("texture-pack", ""));
      this.func_104952_o(this.field_105029_o.func_106532_a("motd", "A Minecraft Server"));
      this.field_105027_p = this.field_105029_o.func_106531_a("generate-structures", true);
      int var2 = this.field_105029_o.func_106530_a("gamemode", C_100836_xn.field_110098_b.func_110090_a());
      this.field_105026_q = C_100840_xm.func_110113_a(var2);
      field_104987_a.info("Default game type: " + this.field_105026_q);
      InetAddress var3 = null;
      if(this.func_104871_l().length() > 0) {
         var3 = InetAddress.getByName(this.func_104871_l());
      }

      if(this.func_104884_G() < 0) {
         this.func_104889_b(this.field_105029_o.func_106530_a("server-port", 25565));
      }

      field_104987_a.info("Generating keypair");
      this.func_104935_a(C_100672_jk.func_109091_b());
      field_104987_a.info("Starting Minecraft server on " + (this.func_104871_l().length() == 0?"*":this.func_104871_l()) + ":" + this.func_104884_G());

      try {
         this.field_105025_r = new C_100745_hk(this, var3, this.func_104884_G());
      } catch (IOException var16) {
         field_104987_a.warning("**** FAILED TO BIND TO PORT!");
         field_104987_a.log(Level.WARNING, "The exception was: " + var16.toString());
         field_104987_a.warning("Perhaps a server is already running on that port?");
         return false;
      }

      if(!this.func_104950_U()) {
         field_104987_a.warning("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         field_104987_a.warning("The server will make no attempt to authenticate usernames. Beware.");
         field_104987_a.warning("While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose.");
         field_104987_a.warning("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
      }

      this.func_104938_a(new C_100168_hf(this));
      long var4 = System.nanoTime();
      if(this.func_104904_J() == null) {
         this.func_104907_l(this.field_105029_o.func_106532_a("level-name", "world"));
      }

      String var6 = this.field_105029_o.func_106532_a("level-seed", "");
      String var7 = this.field_105029_o.func_106532_a("level-type", "DEFAULT");
      String var8 = this.field_105029_o.func_106532_a("generator-settings", "");
      long var9 = (new Random()).nextLong();
      if(var6.length() > 0) {
         try {
            long var11 = Long.parseLong(var6);
            if(var11 != 0L) {
               var9 = var11;
            }
         } catch (NumberFormatException var15) {
            var9 = (long)var6.hashCode();
         }
      }

      C_100845_xp var17 = C_100845_xp.func_110145_a(var7);
      if(var17 == null) {
         var17 = C_100845_xp.field_110158_b;
      }

      this.func_104869_d(this.field_105029_o.func_106530_a("max-build-height", 256));
      this.func_104869_d((this.func_104905_ab() + 8) / 16 * 16);
      this.func_104869_d(C_100650_jv.func_108923_a(this.func_104905_ab(), 64, 256));
      this.field_105029_o.func_106528_a("max-build-height", Integer.valueOf(this.func_104905_ab()));
      field_104987_a.info("Preparing level \"" + this.func_104904_J() + "\"");
      this.func_104924_a(this.func_104904_J(), this.func_104904_J(), var9, var17, var8);
      long var12 = System.nanoTime() - var4;
      String var14 = String.format("%.3fs", new Object[]{Double.valueOf((double)var12 / 1.0E9D)});
      field_104987_a.info("Done (" + var14 + ")! For help, type \"help\" or \"?\"");
      if(this.field_105029_o.func_106531_a("enable-query", false)) {
         field_104987_a.info("Starting GS4 status listener");
         this.field_105031_m = new C_100782_is(this);
         this.field_105031_m.func_109832_a();
      }

      if(this.field_105029_o.func_106531_a("enable-rcon", false)) {
         field_104987_a.info("Starting remote control listener");
         this.field_105028_n = new C_100789_iw(this);
         this.field_105028_n.func_109832_a();
      }

      return true;
   }

   public boolean func_104958_f() {
      return this.field_105027_p;
   }

   public C_100836_xn func_104947_g() {
      return this.field_105026_q;
   }

   public int func_104883_h() {
      return this.field_105029_o.func_106530_a("difficulty", 1);
   }

   public boolean func_104918_i() {
      return this.field_105029_o.func_106531_a("hardcore", false);
   }

   protected void func_104909_a(C_100007_a var1) {
      while(this.func_104941_m()) {
         this.func_105020_al();

         try {
            Thread.sleep(10L);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }
      }

   }

   public C_100007_a func_104913_b(C_100007_a var1) {
      var1 = super.func_104913_b(var1);
      var1.func_105182_a("Type", new C_100743_hj(this));
      return var1;
   }

   protected void func_104894_p() {
      System.exit(0);
   }

   protected void func_104934_r() {
      super.func_104934_r();
      this.func_105020_al();
   }

   public boolean func_104936_s() {
      return this.field_105029_o.func_106531_a("allow-nether", true);
   }

   public boolean func_104920_L() {
      return this.field_105029_o.func_106531_a("spawn-monsters", true);
   }

   public void func_102905_a(C_100708_kp var1) {
      var1.func_109265_a("whitelist_enabled", Boolean.valueOf(this.func_105021_am().func_105708_n()));
      var1.func_109265_a("whitelist_count", Integer.valueOf(this.func_105021_am().func_105736_h().size()));
      super.func_102905_a(var1);
   }

   public boolean func_102906_R() {
      return this.field_105029_o.func_106531_a("snooper-enabled", true);
   }

   public void func_105022_a(String var1, C_100020_s var2) {
      this.field_105030_l.add(new C_100139_fg(var1, var2));
   }

   public void func_105020_al() {
      while(!this.field_105030_l.isEmpty()) {
         C_100139_fg var1 = (C_100139_fg)this.field_105030_l.remove(0);
         this.func_104888_E().func_105197_a(var1.field_106500_b, var1.field_106501_a);
      }

   }

   public boolean func_104948_T() {
      return true;
   }

   public C_100168_hf func_105021_am() {
      return (C_100168_hf)super.func_104931_ad();
   }

   public C_100803_in func_104898_ae() {
      return this.field_105025_r;
   }

   public int func_105016_a(String var1, int var2) {
      return this.field_105029_o.func_106530_a(var1, var2);
   }

   public String func_105019_a(String var1, String var2) {
      return this.field_105029_o.func_106532_a(var1, var2);
   }

   public boolean func_105023_a(String var1, boolean var2) {
      return this.field_105029_o.func_106531_a(var1, var2);
   }

   public void func_105017_a(String var1, Object var2) {
      this.field_105029_o.func_106528_a(var1, var2);
   }

   public void func_105015_a() {
      this.field_105029_o.func_106529_b();
   }

   public String func_105018_b_() {
      File var1 = this.field_105029_o.func_106526_c();
      return var1 != null?var1.getAbsolutePath():"No settings file";
   }

   public boolean func_104906_ag() {
      return this.field_105024_s;
   }

   public String func_104911_a(C_100836_xn var1, boolean var2) {
      return "";
   }

   public boolean func_104881_Z() {
      return this.field_105029_o.func_106531_a("enable-command-block", false);
   }

   public int func_104886_ak() {
      return this.field_105029_o.func_106530_a("spawn-protection", super.func_104886_ak());
   }

   // $FF: synthetic method
   public C_100122_ge func_104931_ad() {
      return this.func_105021_am();
   }
}
