
public class C_100269_agv {

   private long field_107175_a;
   private C_100845_xp field_107173_b;
   private String field_107174_c;
   private int field_107171_d;
   private int field_107172_e;
   private int field_107169_f;
   private long field_107170_g;
   private long field_107182_h;
   private long field_107183_i;
   private long field_107180_j;
   private C_100353_bh field_107181_k;
   private int field_107178_l;
   private String field_107179_m;
   private int field_107176_n;
   private boolean field_107177_o;
   private int field_107191_p;
   private boolean field_107190_q;
   private int field_107189_r;
   private C_100836_xn field_107188_s;
   private boolean field_107187_t;
   private boolean field_107186_u;
   private boolean field_107185_v;
   private boolean field_107184_w;
   private C_100864_xb field_107192_x;


   protected C_100269_agv() {
      this.field_107173_b = C_100845_xp.field_110158_b;
      this.field_107174_c = "";
      this.field_107192_x = new C_100864_xb();
   }

   public C_100269_agv(C_100353_bh var1) {
      this.field_107173_b = C_100845_xp.field_110158_b;
      this.field_107174_c = "";
      this.field_107192_x = new C_100864_xb();
      this.field_107175_a = var1.func_107515_f("RandomSeed");
      if(var1.func_107516_b("generatorName")) {
         String var2 = var1.func_107534_i("generatorName");
         this.field_107173_b = C_100845_xp.func_110145_a(var2);
         if(this.field_107173_b == null) {
            this.field_107173_b = C_100845_xp.field_110158_b;
         } else if(this.field_107173_b.func_110146_e()) {
            int var3 = 0;
            if(var1.func_107516_b("generatorVersion")) {
               var3 = var1.func_107514_e("generatorVersion");
            }

            this.field_107173_b = this.field_107173_b.func_110153_a(var3);
         }

         if(var1.func_107516_b("generatorOptions")) {
            this.field_107174_c = var1.func_107534_i("generatorOptions");
         }
      }

      this.field_107188_s = C_100836_xn.func_110086_a(var1.func_107514_e("GameType"));
      if(var1.func_107516_b("MapFeatures")) {
         this.field_107187_t = var1.func_107519_n("MapFeatures");
      } else {
         this.field_107187_t = true;
      }

      this.field_107171_d = var1.func_107514_e("SpawnX");
      this.field_107172_e = var1.func_107514_e("SpawnY");
      this.field_107169_f = var1.func_107514_e("SpawnZ");
      this.field_107170_g = var1.func_107515_f("Time");
      if(var1.func_107516_b("DayTime")) {
         this.field_107182_h = var1.func_107515_f("DayTime");
      } else {
         this.field_107182_h = this.field_107170_g;
      }

      this.field_107183_i = var1.func_107515_f("LastPlayed");
      this.field_107180_j = var1.func_107515_f("SizeOnDisk");
      this.field_107179_m = var1.func_107534_i("LevelName");
      this.field_107176_n = var1.func_107514_e("version");
      this.field_107191_p = var1.func_107514_e("rainTime");
      this.field_107177_o = var1.func_107519_n("raining");
      this.field_107189_r = var1.func_107514_e("thunderTime");
      this.field_107190_q = var1.func_107519_n("thundering");
      this.field_107186_u = var1.func_107519_n("hardcore");
      if(var1.func_107516_b("initialized")) {
         this.field_107184_w = var1.func_107519_n("initialized");
      } else {
         this.field_107184_w = true;
      }

      if(var1.func_107516_b("allowCommands")) {
         this.field_107185_v = var1.func_107519_n("allowCommands");
      } else {
         this.field_107185_v = this.field_107188_s == C_100836_xn.field_110099_c;
      }

      if(var1.func_107516_b("Player")) {
         this.field_107181_k = var1.func_107521_l("Player");
         this.field_107178_l = this.field_107181_k.func_107514_e("Dimension");
      }

      if(var1.func_107516_b("GameRules")) {
         this.field_107192_x.func_110280_a(var1.func_107521_l("GameRules"));
      }

   }

   public C_100269_agv(C_100840_xm var1, String var2) {
      this.field_107173_b = C_100845_xp.field_110158_b;
      this.field_107174_c = "";
      this.field_107192_x = new C_100864_xb();
      this.field_107175_a = var1.func_110116_d();
      this.field_107188_s = var1.func_110120_e();
      this.field_107187_t = var1.func_110122_g();
      this.field_107179_m = var2;
      this.field_107186_u = var1.func_110114_f();
      this.field_107173_b = var1.func_110119_h();
      this.field_107174_c = var1.func_110115_j();
      this.field_107185_v = var1.func_110121_i();
      this.field_107184_w = false;
   }

   public C_100269_agv(C_100269_agv var1) {
      this.field_107173_b = C_100845_xp.field_110158_b;
      this.field_107174_c = "";
      this.field_107192_x = new C_100864_xb();
      this.field_107175_a = var1.field_107175_a;
      this.field_107173_b = var1.field_107173_b;
      this.field_107174_c = var1.field_107174_c;
      this.field_107188_s = var1.field_107188_s;
      this.field_107187_t = var1.field_107187_t;
      this.field_107171_d = var1.field_107171_d;
      this.field_107172_e = var1.field_107172_e;
      this.field_107169_f = var1.field_107169_f;
      this.field_107170_g = var1.field_107170_g;
      this.field_107182_h = var1.field_107182_h;
      this.field_107183_i = var1.field_107183_i;
      this.field_107180_j = var1.field_107180_j;
      this.field_107181_k = var1.field_107181_k;
      this.field_107178_l = var1.field_107178_l;
      this.field_107179_m = var1.field_107179_m;
      this.field_107176_n = var1.field_107176_n;
      this.field_107191_p = var1.field_107191_p;
      this.field_107177_o = var1.field_107177_o;
      this.field_107189_r = var1.field_107189_r;
      this.field_107190_q = var1.field_107190_q;
      this.field_107186_u = var1.field_107186_u;
      this.field_107185_v = var1.field_107185_v;
      this.field_107184_w = var1.field_107184_w;
      this.field_107192_x = var1.field_107192_x;
   }

   public C_100353_bh func_107158_a() {
      C_100353_bh var1 = new C_100353_bh();
      this.func_107161_a(var1, this.field_107181_k);
      return var1;
   }

   public C_100353_bh func_107168_a(C_100353_bh var1) {
      C_100353_bh var2 = new C_100353_bh();
      this.func_107161_a(var2, var1);
      return var2;
   }

   private void func_107161_a(C_100353_bh var1, C_100353_bh var2) {
      var1.func_107525_a("RandomSeed", this.field_107175_a);
      var1.func_107533_a("generatorName", this.field_107173_b.func_110148_a());
      var1.func_107520_a("generatorVersion", this.field_107173_b.func_110152_c());
      var1.func_107533_a("generatorOptions", this.field_107174_c);
      var1.func_107520_a("GameType", this.field_107188_s.func_110090_a());
      var1.func_107509_a("MapFeatures", this.field_107187_t);
      var1.func_107520_a("SpawnX", this.field_107171_d);
      var1.func_107520_a("SpawnY", this.field_107172_e);
      var1.func_107520_a("SpawnZ", this.field_107169_f);
      var1.func_107525_a("Time", this.field_107170_g);
      var1.func_107525_a("DayTime", this.field_107182_h);
      var1.func_107525_a("SizeOnDisk", this.field_107180_j);
      var1.func_107525_a("LastPlayed", System.currentTimeMillis());
      var1.func_107533_a("LevelName", this.field_107179_m);
      var1.func_107520_a("version", this.field_107176_n);
      var1.func_107520_a("rainTime", this.field_107191_p);
      var1.func_107509_a("raining", this.field_107177_o);
      var1.func_107520_a("thunderTime", this.field_107189_r);
      var1.func_107509_a("thundering", this.field_107190_q);
      var1.func_107509_a("hardcore", this.field_107186_u);
      var1.func_107509_a("allowCommands", this.field_107185_v);
      var1.func_107509_a("initialized", this.field_107184_w);
      var1.func_107538_a("GameRules", this.field_107192_x.func_110282_a());
      if(var2 != null) {
         var1.func_107538_a("Player", var2);
      }

   }

   public long func_107133_b() {
      return this.field_107175_a;
   }

   public int func_107152_c() {
      return this.field_107171_d;
   }

   public int func_107147_d() {
      return this.field_107172_e;
   }

   public int func_107146_e() {
      return this.field_107169_f;
   }

   public long func_107144_f() {
      return this.field_107170_g;
   }

   public long func_107166_g() {
      return this.field_107182_h;
   }

   public long func_107156_h() {
      return this.field_107180_j;
   }

   public C_100353_bh func_107140_i() {
      return this.field_107181_k;
   }

   public int func_107163_j() {
      return this.field_107178_l;
   }

   public void func_107130_a(int var1) {
      this.field_107171_d = var1;
   }

   public void func_107129_b(int var1) {
      this.field_107172_e = var1;
   }

   public void func_107157_c(int var1) {
      this.field_107169_f = var1;
   }

   public void func_107137_b(long var1) {
      this.field_107170_g = var1;
   }

   public void func_107136_c(long var1) {
      this.field_107182_h = var1;
   }

   public void func_107154_a(int var1, int var2, int var3) {
      this.field_107171_d = var1;
      this.field_107172_e = var2;
      this.field_107169_f = var3;
   }

   public String func_107131_k() {
      return this.field_107179_m;
   }

   public void func_107132_a(String var1) {
      this.field_107179_m = var1;
   }

   public int func_107128_l() {
      return this.field_107176_n;
   }

   public void func_107151_e(int var1) {
      this.field_107176_n = var1;
   }

   public long func_107164_m() {
      return this.field_107183_i;
   }

   public boolean func_107150_n() {
      return this.field_107190_q;
   }

   public void func_107138_a(boolean var1) {
      this.field_107190_q = var1;
   }

   public int func_107159_o() {
      return this.field_107189_r;
   }

   public void func_107160_f(int var1) {
      this.field_107189_r = var1;
   }

   public boolean func_107142_p() {
      return this.field_107177_o;
   }

   public void func_107155_b(boolean var1) {
      this.field_107177_o = var1;
   }

   public int func_107162_q() {
      return this.field_107191_p;
   }

   public void func_107153_g(int var1) {
      this.field_107191_p = var1;
   }

   public C_100836_xn func_107135_r() {
      return this.field_107188_s;
   }

   public boolean func_107167_s() {
      return this.field_107187_t;
   }

   public void func_107148_a(C_100836_xn var1) {
      this.field_107188_s = var1;
   }

   public boolean func_107145_t() {
      return this.field_107186_u;
   }

   public C_100845_xp func_107143_u() {
      return this.field_107173_b;
   }

   public void func_107134_a(C_100845_xp var1) {
      this.field_107173_b = var1;
   }

   public String func_107127_y() {
      return this.field_107174_c;
   }

   public boolean func_107139_v() {
      return this.field_107185_v;
   }

   public boolean func_107149_w() {
      return this.field_107184_w;
   }

   public void func_107165_d(boolean var1) {
      this.field_107184_w = var1;
   }

   public C_100864_xb func_107141_x() {
      return this.field_107192_x;
   }
}
