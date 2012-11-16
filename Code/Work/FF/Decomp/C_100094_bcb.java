import java.io.File;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100094_bcb extends C_101445_MinecraftServer {

   private final Minecraft field_105013_l;
   private final C_100840_xm field_105014_m;
   private C_100097_bce field_105011_n;
   private boolean field_105012_o = false;
   private boolean field_105010_p;
   private C_100086_bcj field_105009_q;


   public C_100094_bcb(Minecraft var1, String var2, String var3, C_100840_xm var4) {
      super(new File(Minecraft.func_105056_b(), "saves"));
      this.func_104875_k(var1.field_105130_j.field_111761_b);
      this.func_104907_l(var2);
      this.func_104943_m(var3);
      this.func_104882_b(var1.func_105034_q());
      this.func_104873_c(var4.func_110124_c());
      this.func_104869_d(256);
      this.func_104938_a(new C_100093_bca(this));
      this.field_105013_l = var1;
      this.field_105014_m = var4;

      try {
         this.field_105011_n = new C_100097_bce(this);
      } catch (IOException var6) {
         throw new Error();
      }
   }

   protected void func_104924_a(String var1, String var2, long var3, C_100845_xp var5, String var6) {
      this.func_104880_b(var1);
      this.field_104986_c = new C_100765_ie[3];
      this.field_104993_k = new long[this.field_104986_c.length][100];
      C_100268_agw var7 = this.func_104896_N().func_107200_a(var1, true);

      for(int var8 = 0; var8 < this.field_104986_c.length; ++var8) {
         byte var9 = 0;
         if(var8 == 1) {
            var9 = -1;
         }

         if(var8 == 2) {
            var9 = 1;
         }

         if(var8 == 0) {
            if(this.func_104955_M()) {
               this.field_104986_c[var8] = new C_100739_hw(this, var7, var2, var9, this.field_104985_b);
            } else {
               this.field_104986_c[var8] = new C_100765_ie(this, var7, var2, var9, this.field_105014_m, this.field_104985_b);
            }
         } else {
            this.field_104986_c[var8] = new C_100770_hy(this, var7, var2, var9, this.field_105014_m, this.field_104986_c[0], this.field_104985_b);
         }

         this.field_104986_c[var8].func_109521_a(new C_100761_ia(this, this.field_104986_c[var8]));
         this.func_104931_ad().func_105720_a(this.field_104986_c);
      }

      this.func_104908_c(this.func_104883_h());
      this.func_104910_e();
   }

   protected boolean func_104887_c() {
      field_104987_a.info("Starting integrated minecraft server version 1.4.2");
      this.func_104912_d(false);
      this.func_104933_e(true);
      this.func_104939_f(true);
      this.func_104864_g(true);
      this.func_104923_h(true);
      field_104987_a.info("Generating keypair");
      this.func_104935_a(C_100672_jk.func_109091_b());
      this.func_104924_a(this.func_104904_J(), this.func_104867_K(), this.field_105014_m.func_110116_d(), this.field_105014_m.func_110119_h(), this.field_105014_m.func_110115_j());
      this.func_104952_o(this.func_104919_H() + " - " + this.field_104986_c[0].func_109429_J().func_107131_k());
      return true;
   }

   protected void func_104866_q() {
      boolean var1 = this.field_105012_o;
      this.field_105012_o = this.field_105011_n.func_105783_f();
      if(!var1 && this.field_105012_o) {
         field_104987_a.info("Saving and pausing game...");
         this.func_104931_ad().func_105735_g();
         this.func_104949_a(false);
      }

      if(!this.field_105012_o) {
         super.func_104866_q();
      }

   }

   public boolean func_104958_f() {
      return false;
   }

   public C_100836_xn func_104947_g() {
      return this.field_105014_m.func_110120_e();
   }

   public int func_104883_h() {
      return this.field_105013_l.field_105156_y.field_111708_Q;
   }

   public boolean func_104918_i() {
      return this.field_105014_m.func_110114_f();
   }

   protected File func_104951_o() {
      return this.field_105013_l.field_105093_D;
   }

   public boolean func_104948_T() {
      return false;
   }

   public C_100097_bce func_105008_a() {
      return this.field_105011_n;
   }

   protected void func_104909_a(C_100007_a var1) {
      this.field_105013_l.func_105082_a(var1);
   }

   public C_100007_a func_104913_b(C_100007_a var1) {
      var1 = super.func_104913_b(var1);
      var1.func_105182_a("Type", new C_100091_bcc(this));
      var1.func_105182_a("Is Modded", new C_100092_bcd(this));
      return var1;
   }

   public void func_102905_a(C_100708_kp var1) {
      super.func_102905_a(var1);
      var1.func_109265_a("snooper_partner", this.field_105013_l.func_105069_E().func_109256_f());
   }

   public boolean func_102906_R() {
      return Minecraft.func_105091_x().func_102906_R();
   }

   public String func_104911_a(C_100836_xn var1, boolean var2) {
      try {
         String var3 = this.field_105011_n.func_105786_c();
         System.out.println("Started on " + var3);
         this.field_105010_p = true;
         this.field_105009_q = new C_100086_bcj(this.func_104901_aa(), var3);
         this.field_105009_q.start();
         this.func_104931_ad().func_105731_a(var1);
         this.func_104931_ad().func_105712_b(var2);
         return var3;
      } catch (IOException var4) {
         return null;
      }
   }

   public void func_104916_k() {
      super.func_104916_k();
      if(this.field_105009_q != null) {
         this.field_105009_q.interrupt();
         this.field_105009_q = null;
      }

   }

   public void func_104930_n() {
      super.func_104930_n();
      if(this.field_105009_q != null) {
         this.field_105009_q.interrupt();
         this.field_105009_q = null;
      }

   }

   public boolean func_105007_al() {
      return this.field_105010_p;
   }

   public void func_104902_a(C_100836_xn var1) {
      this.func_104931_ad().func_105731_a(var1);
   }

   public boolean func_104881_Z() {
      return true;
   }

   // $FF: synthetic method
   public C_100803_in func_104898_ae() {
      return this.func_105008_a();
   }
}
