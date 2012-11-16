import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public class C_100765_ie extends C_100873_xe {

   private final C_101445_MinecraftServer field_109622_a;
   private final C_100768_hz field_109627_K;
   private final C_100759_ib field_109623_L;
   private Set field_109624_M;
   private TreeSet field_109625_N;
   public C_100755_id field_109620_b;
   public boolean field_109621_c;
   private boolean field_109626_O;
   private int field_109630_P = 0;
   private C_100763_ig[] field_109629_Q = new C_100763_ig[]{new C_100763_ig((C_100764_if)null), new C_100763_ig((C_100764_if)null)};
   private int field_109632_R = 0;
   private static final C_100673_kh[] field_109631_S = new C_100673_kh[]{new C_100673_kh(C_100992_tt.field_110805_D.field_110891_cf, 0, 1, 3, 10), new C_100673_kh(C_100451_alf.field_106075_A.field_106162_cm, 0, 1, 3, 10), new C_100673_kh(C_100451_alf.field_106079_M.field_106162_cm, 0, 1, 3, 10), new C_100673_kh(C_100992_tt.field_110855_y.field_110891_cf, 0, 1, 1, 3), new C_100673_kh(C_100992_tt.field_110848_u.field_110891_cf, 0, 1, 1, 5), new C_100673_kh(C_100992_tt.field_110856_x.field_110891_cf, 0, 1, 1, 3), new C_100673_kh(C_100992_tt.field_110849_t.field_110891_cf, 0, 1, 1, 5), new C_100673_kh(C_100992_tt.field_110842_j.field_110891_cf, 0, 2, 3, 5), new C_100673_kh(C_100992_tt.field_110820_U.field_110891_cf, 0, 2, 3, 3)};
   private C_100661_jq field_109628_T;


   public C_100765_ie(C_101445_MinecraftServer var1, C_100268_agw var2, String var3, int var4, C_100840_xm var5, C_100649_jy var6) {
      super(var2, var3, var5, C_101289_zr.func_112381_a(var4), var6);
      this.field_109622_a = var1;
      this.field_109627_K = new C_100768_hz(this);
      this.field_109623_L = new C_100759_ib(this, var1.func_104931_ad().func_105715_o());
      if(this.field_109628_T == null) {
         this.field_109628_T = new C_100661_jq();
      }

      if(this.field_109624_M == null) {
         this.field_109624_M = new HashSet();
      }

      if(this.field_109625_N == null) {
         this.field_109625_N = new TreeSet();
      }

   }

   public void func_109397_b() {
      super.func_109397_b();
      if(this.func_109429_J().func_107145_t() && this.field_109578_t < 3) {
         this.field_109578_t = 3;
      }

      this.field_109576_v.field_112396_d.func_112521_b();
      if(this.func_109616_e()) {
         boolean var1 = false;
         if(this.field_109546_F && this.field_109578_t >= 1) {
            ;
         }

         if(!var1) {
            long var2 = this.field_109583_z.func_107166_g() + 24000L;
            this.field_109583_z.func_107136_c(var2 - var2 % 24000L);
            this.func_109614_d();
         }
      }

      this.field_109545_E.func_108901_a("mobSpawner");
      if(this.func_109389_K().func_110281_b("doMobSpawning")) {
         C_100841_xr.func_110137_a(this, this.field_109546_F, this.field_109547_G, this.field_109583_z.func_107144_f() % 400L == 0L);
      }

      this.field_109545_E.func_108899_c("chunkSource");
      this.field_109585_x.func_108664_b();
      int var4 = this.func_109530_a(1.0F);
      if(var4 != this.field_109571_j) {
         this.field_109571_j = var4;
      }

      this.func_109612_U();
      this.field_109583_z.func_107137_b(this.field_109583_z.func_107144_f() + 1L);
      this.field_109583_z.func_107136_c(this.field_109583_z.func_107166_g() + 1L);
      this.field_109545_E.func_108899_c("tickPending");
      this.func_109519_a(false);
      this.field_109545_E.func_108899_c("tickTiles");
      this.func_109454_g();
      this.field_109545_E.func_108899_c("chunkMap");
      this.field_109623_L.func_109679_b();
      this.field_109545_E.func_108899_c("village");
      this.field_109550_C.func_107271_a();
      this.field_109544_D.func_108564_a();
      this.field_109545_E.func_108900_b();
      this.func_109612_U();
   }

   public C_101316_ya func_109604_a(C_100594_lo var1, int var2, int var3, int var4) {
      List var5 = this.func_109479_H().func_108659_a(var1, var2, var3, var4);
      return var5 != null && !var5.isEmpty()?(C_101316_ya)C_100676_kf.func_109113_a(this.field_109577_u, var5):null;
   }

   public void func_109416_c() {
      this.field_109626_O = !this.field_109573_h.isEmpty();
      Iterator var1 = this.field_109573_h.iterator();

      while(var1.hasNext()) {
         C_101095_qg var2 = (C_101095_qg)var1.next();
         if(!var2.func_103369_bt()) {
            this.field_109626_O = false;
            break;
         }
      }

   }

   protected void func_109614_d() {
      this.field_109626_O = false;
      Iterator var1 = this.field_109573_h.iterator();

      while(var1.hasNext()) {
         C_101095_qg var2 = (C_101095_qg)var1.next();
         if(var2.func_103369_bt()) {
            var2.func_103766_a(false, false, true);
         }
      }

      this.func_109608_T();
   }

   private void func_109608_T() {
      this.field_109583_z.func_107153_g(0);
      this.field_109583_z.func_107155_b(false);
      this.field_109583_z.func_107160_f(0);
      this.field_109583_z.func_107138_a(false);
   }

   public boolean func_109616_e() {
      if(this.field_109626_O && !this.field_109557_J) {
         Iterator var1 = this.field_109573_h.iterator();

         C_101095_qg var2;
         do {
            if(!var1.hasNext()) {
               return true;
            }

            var2 = (C_101095_qg)var1.next();
         } while(var2.func_103795_bU());

         return false;
      } else {
         return false;
      }
   }

   public void func_109535_f() {
      if(this.field_109583_z.func_107147_d() <= 0) {
         this.field_109583_z.func_107129_b(64);
      }

      int var1 = this.field_109583_z.func_107152_c();
      int var2 = this.field_109583_z.func_107146_e();
      int var3 = 0;

      while(this.func_109489_b(var1, var2) == 0) {
         var1 += this.field_109577_u.nextInt(8) - this.field_109577_u.nextInt(8);
         var2 += this.field_109577_u.nextInt(8) - this.field_109577_u.nextInt(8);
         ++var3;
         if(var3 == 10000) {
            break;
         }
      }

      this.field_109583_z.func_107130_a(var1);
      this.field_109583_z.func_107157_c(var2);
   }

   protected void func_109454_g() {
      super.func_109454_g();
      int var1 = 0;
      int var2 = 0;
      Iterator var3 = this.field_109555_H.iterator();

      while(var3.hasNext()) {
         C_100858_wx var4 = (C_100858_wx)var3.next();
         int var5 = var4.field_110239_a * 16;
         int var6 = var4.field_110238_b * 16;
         this.field_109545_E.func_108901_a("getChunk");
         C_101272_za var7 = this.func_109440_e(var4.field_110239_a, var4.field_110238_b);
         this.func_109458_a(var5, var6, var7);
         this.field_109545_E.func_108899_c("tickChunk");
         var7.func_112287_k();
         this.field_109545_E.func_108899_c("thunder");
         int var8;
         int var9;
         int var10;
         int var11;
         if(this.field_109577_u.nextInt(100000) == 0 && this.func_109531_M() && this.func_109473_L()) {
            this.field_109572_k = this.field_109572_k * 3 + 1013904223;
            var8 = this.field_109572_k >> 2;
            var9 = var5 + (var8 & 15);
            var10 = var6 + (var8 >> 8 & 15);
            var11 = this.func_109380_h(var9, var10);
            if(this.func_109515_B(var9, var11, var10)) {
               this.func_109477_c(new C_100570_pd(this, (double)var9, (double)var11, (double)var10));
               this.field_109581_q = 2;
            }
         }

         this.field_109545_E.func_108899_c("iceandsnow");
         int var13;
         if(this.field_109577_u.nextInt(16) == 0) {
            this.field_109572_k = this.field_109572_k * 3 + 1013904223;
            var8 = this.field_109572_k >> 2;
            var9 = var8 & 15;
            var10 = var8 >> 8 & 15;
            var11 = this.func_109380_h(var9 + var5, var10 + var6);
            if(this.func_109408_v(var9 + var5, var11 - 1, var10 + var6)) {
               this.func_109422_e(var9 + var5, var11 - 1, var10 + var6, C_100451_alf.field_106184_aW.field_106162_cm);
            }

            if(this.func_109531_M() && this.func_109421_w(var9 + var5, var11, var10 + var6)) {
               this.func_109422_e(var9 + var5, var11, var10 + var6, C_100451_alf.field_106181_aV.field_106162_cm);
            }

            if(this.func_109531_M()) {
               C_101324_xz var12 = this.func_109362_a(var9 + var5, var10 + var6);
               if(var12.func_112462_d()) {
                  var13 = this.func_109349_a(var9 + var5, var11 - 1, var10 + var6);
                  if(var13 != 0) {
                     C_100451_alf.field_106118_p[var13].func_106056_f(this, var9 + var5, var11 - 1, var10 + var6);
                  }
               }
            }
         }

         this.field_109545_E.func_108899_c("tickTiles");
         C_101265_zb[] var19 = var7.func_112310_i();
         var9 = var19.length;

         for(var10 = 0; var10 < var9; ++var10) {
            C_101265_zb var21 = var19[var10];
            if(var21 != null && var21.func_112268_b()) {
               for(int var20 = 0; var20 < 3; ++var20) {
                  this.field_109572_k = this.field_109572_k * 3 + 1013904223;
                  var13 = this.field_109572_k >> 2;
                  int var14 = var13 & 15;
                  int var15 = var13 >> 8 & 15;
                  int var16 = var13 >> 16 & 15;
                  int var17 = var21.func_112252_a(var14, var16, var15);
                  ++var2;
                  C_100451_alf var18 = C_100451_alf.field_106118_p[var17];
                  if(var18 != null && var18.func_105984_t()) {
                     ++var1;
                     var18.func_105996_b(this, var14 + var5, var16 + var21.func_112255_d(), var15 + var6, this.field_109577_u);
                  }
               }
            }
         }

         this.field_109545_E.func_108900_b();
      }

   }

   public void func_109398_a(int var1, int var2, int var3, int var4, int var5) {
      this.func_109525_a(var1, var2, var3, var4, var5, 0);
   }

   public void func_109525_a(int var1, int var2, int var3, int var4, int var5, int var6) {
      C_100855_xu var7 = new C_100855_xu(var1, var2, var3, var4);
      byte var8 = 8;
      if(this.field_109562_d && var4 > 0) {
         if(C_100451_alf.field_106118_p[var4].func_106067_l()) {
            if(this.func_109480_d(var7.field_110217_a - var8, var7.field_110215_b - var8, var7.field_110216_c - var8, var7.field_110217_a + var8, var7.field_110215_b + var8, var7.field_110216_c + var8)) {
               int var9 = this.func_109349_a(var7.field_110217_a, var7.field_110215_b, var7.field_110216_c);
               if(var9 == var7.field_110213_d && var9 > 0) {
                  C_100451_alf.field_106118_p[var9].func_105996_b(this, var7.field_110217_a, var7.field_110215_b, var7.field_110216_c, this.field_109577_u);
               }
            }

            return;
         }

         var5 = 1;
      }

      if(this.func_109480_d(var1 - var8, var2 - var8, var3 - var8, var1 + var8, var2 + var8, var3 + var8)) {
         if(var4 > 0) {
            var7.func_110209_a((long)var5 + this.field_109583_z.func_107144_f());
            var7.func_110210_a(var6);
         }

         if(!this.field_109624_M.contains(var7)) {
            this.field_109624_M.add(var7);
            this.field_109625_N.add(var7);
         }
      }

   }

   public void func_109453_b(int var1, int var2, int var3, int var4, int var5) {
      C_100855_xu var6 = new C_100855_xu(var1, var2, var3, var4);
      if(var4 > 0) {
         var6.func_110209_a((long)var5 + this.field_109583_z.func_107144_f());
      }

      if(!this.field_109624_M.contains(var6)) {
         this.field_109624_M.add(var6);
         this.field_109625_N.add(var6);
      }

   }

   public void func_109419_h() {
      if(this.field_109573_h.isEmpty()) {
         if(this.field_109630_P++ >= 1200) {
            return;
         }
      } else {
         this.func_109609_i();
      }

      super.func_109419_h();
   }

   public void func_109609_i() {
      this.field_109630_P = 0;
   }

   public boolean func_109519_a(boolean var1) {
      int var2 = this.field_109625_N.size();
      if(var2 != this.field_109624_M.size()) {
         throw new IllegalStateException("TickNextTick list out of synch");
      } else {
         if(var2 > 1000) {
            var2 = 1000;
         }

         for(int var3 = 0; var3 < var2; ++var3) {
            C_100855_xu var4 = (C_100855_xu)this.field_109625_N.first();
            if(!var1 && var4.field_110214_e > this.field_109583_z.func_107144_f()) {
               break;
            }

            this.field_109625_N.remove(var4);
            this.field_109624_M.remove(var4);
            byte var5 = 8;
            if(this.func_109480_d(var4.field_110217_a - var5, var4.field_110215_b - var5, var4.field_110216_c - var5, var4.field_110217_a + var5, var4.field_110215_b + var5, var4.field_110216_c + var5)) {
               int var6 = this.func_109349_a(var4.field_110217_a, var4.field_110215_b, var4.field_110216_c);
               if(var6 == var4.field_110213_d && var6 > 0) {
                  C_100451_alf.field_106118_p[var6].func_105996_b(this, var4.field_110217_a, var4.field_110215_b, var4.field_110216_c, this.field_109577_u);
               }
            }
         }

         return !this.field_109625_N.isEmpty();
      }
   }

   public List func_109450_a(C_101272_za var1, boolean var2) {
      ArrayList var3 = null;
      C_100858_wx var4 = var1.func_112321_l();
      int var5 = var4.field_110239_a << 4;
      int var6 = var5 + 16;
      int var7 = var4.field_110238_b << 4;
      int var8 = var7 + 16;
      Iterator var9 = this.field_109625_N.iterator();

      while(var9.hasNext()) {
         C_100855_xu var10 = (C_100855_xu)var9.next();
         if(var10.field_110217_a >= var5 && var10.field_110217_a < var6 && var10.field_110216_c >= var7 && var10.field_110216_c < var8) {
            if(var2) {
               this.field_109624_M.remove(var10);
               var9.remove();
            }

            if(var3 == null) {
               var3 = new ArrayList();
            }

            var3.add(var10);
         }
      }

      return var3;
   }

   public void func_109434_a(C_100730_lb var1, boolean var2) {
      if(!this.field_109622_a.func_104903_V() && (var1 instanceof C_100544_oh || var1 instanceof C_100548_os)) {
         var1.func_103121_x();
      }

      if(!this.field_109622_a.func_104897_W() && var1 instanceof C_101099_qc) {
         var1.func_103121_x();
      }

      if(!(var1.field_103206_n instanceof C_101095_qg)) {
         super.func_109434_a(var1, var2);
      }

   }

   public void func_109610_b(C_100730_lb var1, boolean var2) {
      super.func_109434_a(var1, var2);
   }

   protected C_101331_yx func_109462_j() {
      C_101262_zf var1 = this.field_109584_y.func_107094_a(this.field_109576_v);
      this.field_109620_b = new C_100755_id(this, var1, this.field_109576_v.func_112393_c());
      return this.field_109620_b;
   }

   public List func_109613_b(int var1, int var2, int var3, int var4, int var5, int var6) {
      ArrayList var7 = new ArrayList();
      Iterator var8 = this.field_109561_g.iterator();

      while(var8.hasNext()) {
         C_100398_amm var9 = (C_100398_amm)var8.next();
         if(var9.field_102938_l >= var1 && var9.field_102939_m >= var2 && var9.field_102936_n >= var3 && var9.field_102938_l < var4 && var9.field_102939_m < var5 && var9.field_102936_n < var6) {
            var7.add(var9);
         }
      }

      return var7;
   }

   public boolean func_109542_a(C_101095_qg var1, int var2, int var3, int var4) {
      int var5 = C_100650_jv.func_108912_a(var2 - this.field_109583_z.func_107152_c());
      int var6 = C_100650_jv.func_108912_a(var4 - this.field_109583_z.func_107146_e());
      if(var5 > var6) {
         var6 = var5;
      }

      return var6 > 16 || this.field_109622_a.func_104931_ad().func_105690_e(var1.field_103847_bT) || this.field_109622_a.func_104921_I();
   }

   protected void func_109418_a(C_100840_xm var1) {
      if(this.field_109628_T == null) {
         this.field_109628_T = new C_100661_jq();
      }

      if(this.field_109624_M == null) {
         this.field_109624_M = new HashSet();
      }

      if(this.field_109625_N == null) {
         this.field_109625_N = new TreeSet();
      }

      this.func_109619_b(var1);
      super.func_109418_a(var1);
   }

   protected void func_109619_b(C_100840_xm var1) {
      if(!this.field_109576_v.func_112388_e()) {
         this.field_109583_z.func_107154_a(0, this.field_109576_v.func_112376_i(), 0);
      } else {
         this.field_109548_A = true;
         C_101311_ye var2 = this.field_109576_v.field_112396_d;
         List var3 = var2.func_112516_a();
         Random var4 = new Random(this.func_109374_D());
         C_100851_xw var5 = var2.func_112517_a(0, 0, 256, var3, var4);
         int var6 = 0;
         int var7 = this.field_109576_v.func_112376_i();
         int var8 = 0;
         if(var5 != null) {
            var6 = var5.field_110207_a;
            var8 = var5.field_110206_c;
         } else {
            System.out.println("Unable to find spawn biome");
         }

         int var9 = 0;

         while(!this.field_109576_v.func_112386_a(var6, var8)) {
            var6 += var4.nextInt(64) - var4.nextInt(64);
            var8 += var4.nextInt(64) - var4.nextInt(64);
            ++var9;
            if(var9 == 1000) {
               break;
            }
         }

         this.field_109583_z.func_107154_a(var6, var7, var8);
         this.field_109548_A = false;
         if(var1.func_110124_c()) {
            this.func_109603_k();
         }

      }
   }

   protected void func_109603_k() {
      C_100560_aah var1 = new C_100560_aah(field_109631_S, 10);

      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = this.field_109583_z.func_107152_c() + this.field_109577_u.nextInt(6) - this.field_109577_u.nextInt(6);
         int var4 = this.field_109583_z.func_107146_e() + this.field_109577_u.nextInt(6) - this.field_109577_u.nextInt(6);
         int var5 = this.func_109459_i(var3, var4) + 1;
         if(var1.func_107965_a(this, this.field_109577_u, var3, var5, var4)) {
            break;
         }
      }

   }

   public C_100013_k func_109615_l() {
      return this.field_109576_v.func_112374_h();
   }

   public void func_109605_a(boolean var1, C_100683_ka var2) {
      if(this.field_109585_x.func_108665_c()) {
         if(var2 != null) {
            var2.func_104292_a("Saving level");
         }

         this.func_109606_a();
         if(var2 != null) {
            var2.func_104291_c("Saving chunks");
         }

         this.field_109585_x.func_108661_a(var1, var2);
      }
   }

   protected void func_109606_a() {
      this.func_109485_C();
      this.field_109584_y.func_107087_a(this.field_109583_z, this.field_109622_a.func_104931_ad().func_105723_q());
      this.field_109549_B.func_107071_a();
   }

   protected void func_109393_a(C_100730_lb var1) {
      super.func_109393_a(var1);
      this.field_109628_T.func_109035_a(var1.field_103212_k, var1);
      C_100730_lb[] var2 = var1.func_103142_ao();
      if(var2 != null) {
         C_100730_lb[] var3 = var2;
         int var4 = var2.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            C_100730_lb var6 = var3[var5];
            this.field_109628_T.func_109035_a(var6.field_103212_k, var6);
         }
      }

   }

   protected void func_109442_b(C_100730_lb var1) {
      super.func_109442_b(var1);
      this.field_109628_T.func_109047_d(var1.field_103212_k);
      C_100730_lb[] var2 = var1.func_103142_ao();
      if(var2 != null) {
         C_100730_lb[] var3 = var2;
         int var4 = var2.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            C_100730_lb var6 = var3[var5];
            this.field_109628_T.func_109047_d(var6.field_103212_k);
         }
      }

   }

   public C_100730_lb func_109451_a(int var1) {
      return (C_100730_lb)this.field_109628_T.func_109038_a(var1);
   }

   public boolean func_109477_c(C_100730_lb var1) {
      if(super.func_109477_c(var1)) {
         this.field_109622_a.func_104931_ad().func_105730_a(var1.field_103221_t, var1.field_103219_u, var1.field_103217_v, 512.0D, this.field_109576_v.field_112401_h, new C_100407_ce(var1));
         return true;
      } else {
         return false;
      }
   }

   public void func_109464_a(C_100730_lb var1, byte var2) {
      C_100236_dd var3 = new C_100236_dd(var1.field_103212_k, var2);
      this.func_109617_p().func_109786_b(var1, var3);
   }

   public C_100857_wz func_109405_a(C_100730_lb var1, double var2, double var4, double var6, float var8, boolean var9, boolean var10) {
      C_100857_wz var11 = new C_100857_wz(this, var1, var2, var4, var6, var8);
      var11.field_110228_a = var9;
      var11.field_110226_b = var10;
      var11.func_110220_a();
      var11.func_110221_a(false);
      if(!var10) {
         var11.field_110232_h.clear();
      }

      Iterator var12 = this.field_109573_h.iterator();

      while(var12.hasNext()) {
         C_101095_qg var13 = (C_101095_qg)var12.next();
         if(var13.func_103146_e(var2, var4, var6) < 4096.0D) {
            ((C_100762_ih)var13).field_104518_a.func_107009_b(new C_100235_de(var2, var4, var6, var8, var11.field_110232_h, (C_100387_amw)var11.func_110219_b().get(var13)));
         }
      }

      return var11;
   }

   public void func_109467_c(int var1, int var2, int var3, int var4, int var5, int var6) {
      C_100849_xv var7 = new C_100849_xv(var1, var2, var3, var4, var5, var6);
      Iterator var8 = this.field_109629_Q[this.field_109632_R].iterator();

      C_100849_xv var9;
      do {
         if(!var8.hasNext()) {
            this.field_109629_Q[this.field_109632_R].add(var7);
            return;
         }

         var9 = (C_100849_xv)var8.next();
      } while(!var9.equals(var7));

   }

   private void func_109612_U() {
      while(!this.field_109629_Q[this.field_109632_R].isEmpty()) {
         int var1 = this.field_109632_R;
         this.field_109632_R ^= 1;
         Iterator var2 = this.field_109629_Q[var1].iterator();

         while(var2.hasNext()) {
            C_100849_xv var3 = (C_100849_xv)var2.next();
            if(this.func_109618_a(var3)) {
               this.field_109622_a.func_104931_ad().func_105730_a((double)var3.func_110196_a(), (double)var3.func_110198_b(), (double)var3.func_110197_c(), 64.0D, this.field_109576_v.field_112401_h, new C_100272_ez(var3.func_110196_a(), var3.func_110198_b(), var3.func_110197_c(), var3.func_110193_f(), var3.func_110195_d(), var3.func_110194_e()));
            }
         }

         this.field_109629_Q[var1].clear();
      }

   }

   private boolean func_109618_a(C_100849_xv var1) {
      int var2 = this.func_109349_a(var1.func_110196_a(), var1.func_110198_b(), var1.func_110197_c());
      if(var2 == var1.func_110193_f()) {
         C_100451_alf.field_106118_p[var2].func_105980_b(this, var1.func_110196_a(), var1.func_110198_b(), var1.func_110197_c(), var1.func_110195_d(), var1.func_110194_e());
         return true;
      } else {
         return false;
      }
   }

   public void func_109607_m() {
      this.field_109584_y.func_107090_a();
   }

   protected void func_109491_n() {
      boolean var1 = this.func_109531_M();
      super.func_109491_n();
      if(var1 != this.func_109531_M()) {
         if(var1) {
            this.field_109622_a.func_104931_ad().func_105733_a(new C_100240_df(2, 0));
         } else {
            this.field_109622_a.func_104931_ad().func_105733_a(new C_100240_df(1, 0));
         }
      }

   }

   public C_101445_MinecraftServer func_109611_o() {
      return this.field_109622_a;
   }

   public C_100768_hz func_109617_p() {
      return this.field_109627_K;
   }

   public C_100759_ib func_109602_r() {
      return this.field_109623_L;
   }

}
