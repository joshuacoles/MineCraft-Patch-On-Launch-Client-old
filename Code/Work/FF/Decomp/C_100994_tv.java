import java.util.ArrayList;
import java.util.List;

public final class C_100994_tv {

   public int field_111398_a;
   public int field_111396_b;
   public int field_111397_c;
   public C_100353_bh field_111394_d;
   private int field_111395_e;
   private C_100596_lm field_111393_f;


   public C_100994_tv(C_100451_alf var1) {
      this(var1, 1);
   }

   public C_100994_tv(C_100451_alf var1, int var2) {
      this(var1.field_106162_cm, var2, 0);
   }

   public C_100994_tv(C_100451_alf var1, int var2, int var3) {
      this(var1.field_106162_cm, var2, var3);
   }

   public C_100994_tv(C_100992_tt var1) {
      this(var1.field_110891_cf, 1, 0);
   }

   public C_100994_tv(C_100992_tt var1, int var2) {
      this(var1.field_110891_cf, var2, 0);
   }

   public C_100994_tv(C_100992_tt var1, int var2, int var3) {
      this(var1.field_110891_cf, var2, var3);
   }

   public C_100994_tv(int var1, int var2, int var3) {
      this.field_111398_a = 0;
      this.field_111393_f = null;
      this.field_111397_c = var1;
      this.field_111398_a = var2;
      this.field_111395_e = var3;
   }

   public static C_100994_tv func_111376_a(C_100353_bh var0) {
      C_100994_tv var1 = new C_100994_tv();
      var1.func_111354_c(var0);
      return var1.func_111365_b() != null?var1:null;
   }

   private C_100994_tv() {
      this.field_111398_a = 0;
      this.field_111393_f = null;
   }

   public C_100994_tv func_111342_a(int var1) {
      C_100994_tv var2 = new C_100994_tv(this.field_111397_c, var1, this.field_111395_e);
      if(this.field_111394_d != null) {
         var2.field_111394_d = (C_100353_bh)this.field_111394_d.func_107485_b();
      }

      this.field_111398_a -= var1;
      return var2;
   }

   public C_100992_tt func_111365_b() {
      return C_100992_tt.field_110834_e[this.field_111397_c];
   }

   public int func_111362_c() {
      return this.func_111365_b().func_110755_f(this);
   }

   public boolean func_111372_a(C_101095_qg var1, C_100873_xe var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9) {
      boolean var10 = this.func_111365_b().func_110764_a(this, var1, var2, var3, var4, var5, var6, var7, var8, var9);
      if(var10) {
         var1.func_103813_a(C_100818_jh.field_110015_E[this.field_111397_c], 1);
      }

      return var10;
   }

   public float func_111369_a(C_100451_alf var1) {
      return this.func_111365_b().func_110783_a(this, var1);
   }

   public C_100994_tv func_111378_a(C_100873_xe var1, C_101095_qg var2) {
      return this.func_111365_b().func_110775_a(this, var1, var2);
   }

   public C_100994_tv func_111373_b(C_100873_xe var1, C_101095_qg var2) {
      return this.func_111365_b().func_110792_b(this, var1, var2);
   }

   public C_100353_bh func_111344_b(C_100353_bh var1) {
      var1.func_107532_a("id", (short)this.field_111397_c);
      var1.func_107527_a("Count", (byte)this.field_111398_a);
      var1.func_107532_a("Damage", (short)this.field_111395_e);
      if(this.field_111394_d != null) {
         var1.func_107530_a("tag", this.field_111394_d);
      }

      return var1;
   }

   public void func_111354_c(C_100353_bh var1) {
      this.field_111397_c = var1.func_107517_d("id");
      this.field_111398_a = var1.func_107524_c("Count");
      this.field_111395_e = var1.func_107517_d("Damage");
      if(var1.func_107516_b("tag")) {
         this.field_111394_d = var1.func_107521_l("tag");
      }

   }

   public int func_111380_d() {
      return this.func_111365_b().func_110771_k();
   }

   public boolean func_111388_e() {
      return this.func_111380_d() > 1 && (!this.func_111387_f() || !this.func_111353_h());
   }

   public boolean func_111387_f() {
      return C_100992_tt.field_110834_e[this.field_111397_c].func_110801_m() > 0;
   }

   public boolean func_111383_g() {
      return C_100992_tt.field_110834_e[this.field_111397_c].func_110803_l();
   }

   public boolean func_111353_h() {
      return this.func_111387_f() && this.field_111395_e > 0;
   }

   public int func_111357_i() {
      return this.field_111395_e;
   }

   public int func_111367_j() {
      return this.field_111395_e;
   }

   public void func_111371_b(int var1) {
      this.field_111395_e = var1;
   }

   public int func_111364_k() {
      return C_100992_tt.field_110834_e[this.field_111397_c].func_110801_m();
   }

   public void func_111363_a(int var1, C_100595_ln var2) {
      if(this.func_111387_f()) {
         if(var1 > 0 && var2 instanceof C_101095_qg) {
            int var3 = C_100878_wh.func_110596_c(var2);
            if(var3 > 0 && var2.field_103229_p.field_109577_u.nextInt(var3 + 1) > 0) {
               return;
            }
         }

         if(!(var2 instanceof C_101095_qg) || !((C_101095_qg)var2).field_103869_cf.field_111597_d) {
            this.field_111395_e += var1;
         }

         if(this.field_111395_e > this.func_111364_k()) {
            var2.func_103296_a(this);
            if(var2 instanceof C_101095_qg) {
               ((C_101095_qg)var2).func_103813_a(C_100818_jh.field_110016_F[this.field_111397_c], 1);
            }

            --this.field_111398_a;
            if(this.field_111398_a < 0) {
               this.field_111398_a = 0;
            }

            this.field_111395_e = 0;
         }

      }
   }

   public void func_111368_a(C_100595_ln var1, C_101095_qg var2) {
      boolean var3 = C_100992_tt.field_110834_e[this.field_111397_c].func_110779_a(this, var1, var2);
      if(var3) {
         var2.func_103813_a(C_100818_jh.field_110015_E[this.field_111397_c], 1);
      }

   }

   public void func_111386_a(C_100873_xe var1, int var2, int var3, int var4, int var5, C_101095_qg var6) {
      boolean var7 = C_100992_tt.field_110834_e[this.field_111397_c].func_110757_a(this, var1, var2, var3, var4, var5, var6);
      if(var7) {
         var6.func_103813_a(C_100818_jh.field_110015_E[this.field_111397_c], 1);
      }

   }

   public int func_111350_a(C_100730_lb var1) {
      return C_100992_tt.field_110834_e[this.field_111397_c].func_110756_a(var1);
   }

   public boolean func_111385_b(C_100451_alf var1) {
      return C_100992_tt.field_110834_e[this.field_111397_c].func_110766_a(var1);
   }

   public boolean func_111361_a(C_100595_ln var1) {
      return C_100992_tt.field_110834_e[this.field_111397_c].func_110798_a(this, var1);
   }

   public C_100994_tv func_111360_l() {
      C_100994_tv var1 = new C_100994_tv(this.field_111397_c, this.field_111398_a, this.field_111395_e);
      if(this.field_111394_d != null) {
         var1.field_111394_d = (C_100353_bh)this.field_111394_d.func_107485_b();
      }

      return var1;
   }

   public static boolean func_111379_a(C_100994_tv var0, C_100994_tv var1) {
      return var0 == null && var1 == null?true:(var0 != null && var1 != null?(var0.field_111394_d == null && var1.field_111394_d != null?false:var0.field_111394_d == null || var0.field_111394_d.equals(var1.field_111394_d)):false);
   }

   public static boolean func_111340_b(C_100994_tv var0, C_100994_tv var1) {
      return var0 == null && var1 == null?true:(var0 != null && var1 != null?var0.func_111337_d(var1):false);
   }

   private boolean func_111337_d(C_100994_tv var1) {
      return this.field_111398_a != var1.field_111398_a?false:(this.field_111397_c != var1.field_111397_c?false:(this.field_111395_e != var1.field_111395_e?false:(this.field_111394_d == null && var1.field_111394_d != null?false:this.field_111394_d == null || this.field_111394_d.equals(var1.field_111394_d))));
   }

   public boolean func_111351_a(C_100994_tv var1) {
      return this.field_111397_c == var1.field_111397_c && this.field_111395_e == var1.field_111395_e;
   }

   public String func_111381_a() {
      return C_100992_tt.field_110834_e[this.field_111397_c].func_110791_c_(this);
   }

   public static C_100994_tv func_111341_b(C_100994_tv var0) {
      return var0 == null?null:var0.func_111360_l();
   }

   public String toString() {
      return this.field_111398_a + "x" + C_100992_tt.field_110834_e[this.field_111397_c].func_110793_a() + "@" + this.field_111395_e;
   }

   public void func_111338_a(C_100873_xe var1, C_100730_lb var2, int var3, boolean var4) {
      if(this.field_111396_b > 0) {
         --this.field_111396_b;
      }

      C_100992_tt.field_110834_e[this.field_111397_c].func_110780_a(this, var1, var2, var3, var4);
   }

   public void func_111366_a(C_100873_xe var1, C_101095_qg var2, int var3) {
      var2.func_103813_a(C_100818_jh.field_110014_D[this.field_111397_c], var3);
      C_100992_tt.field_110834_e[this.field_111397_c].func_110762_d(this, var1, var2);
   }

   public int func_111391_m() {
      return this.func_111365_b().func_110769_a(this);
   }

   public C_100943_uw func_111348_n() {
      return this.func_111365_b().func_110777_d_(this);
   }

   public void func_111346_b(C_100873_xe var1, C_101095_qg var2, int var3) {
      this.func_111365_b().func_110778_a(this, var1, var2, var3);
   }

   public boolean func_111339_o() {
      return this.field_111394_d != null;
   }

   public C_100353_bh func_111352_p() {
      return this.field_111394_d;
   }

   public C_100339_bp func_111384_q() {
      return this.field_111394_d == null?null:(C_100339_bp)this.field_111394_d.func_107518_a("ench");
   }

   public void func_111349_d(C_100353_bh var1) {
      this.field_111394_d = var1;
   }

   public String func_111336_r() {
      String var1 = this.func_111365_b().func_110750_j(this);
      if(this.field_111394_d != null && this.field_111394_d.func_107516_b("display")) {
         C_100353_bh var2 = this.field_111394_d.func_107521_l("display");
         if(var2.func_107516_b("Name")) {
            var1 = var2.func_107534_i("Name");
         }
      }

      return var1;
   }

   public void func_111343_c(String var1) {
      if(this.field_111394_d == null) {
         this.field_111394_d = new C_100353_bh();
      }

      if(!this.field_111394_d.func_107516_b("display")) {
         this.field_111394_d.func_107538_a("display", new C_100353_bh());
      }

      this.field_111394_d.func_107521_l("display").func_107533_a("Name", var1);
   }

   public boolean func_111370_s() {
      return this.field_111394_d == null?false:(!this.field_111394_d.func_107516_b("display")?false:this.field_111394_d.func_107521_l("display").func_107516_b("Name"));
   }

   public List func_111390_a(C_101095_qg var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      C_100992_tt var4 = C_100992_tt.field_110834_e[this.field_111397_c];
      String var5 = this.func_111336_r();
      if(var2) {
         String var6 = "";
         if(var5.length() > 0) {
            var5 = var5 + " (";
            var6 = ")";
         }

         if(this.func_111383_g()) {
            var5 = var5 + String.format("#%04d/%d%s", new Object[]{Integer.valueOf(this.field_111397_c), Integer.valueOf(this.field_111395_e), var6});
         } else {
            var5 = var5 + String.format("#%04d%s", new Object[]{Integer.valueOf(this.field_111397_c), var6});
         }
      } else if(!this.func_111370_s()) {
         if(this.field_111397_c == C_100992_tt.field_110882_bd.field_110891_cf) {
            var5 = var5 + " #" + this.field_111395_e;
         }
      } else {
         var5 = "§o" + var5;
      }

      var3.add(var5);
      var4.func_110784_a(this, var1, var3, var2);
      if(this.func_111339_o()) {
         C_100339_bp var10 = this.func_111384_q();
         if(var10 != null) {
            for(int var7 = 0; var7 < var10.func_107501_c(); ++var7) {
               short var8 = ((C_100353_bh)var10.func_107498_b(var7)).func_107517_d("id");
               short var9 = ((C_100353_bh)var10.func_107498_b(var7)).func_107517_d("lvl");
               if(C_100904_wf.field_110622_b[var8] != null) {
                  var3.add(C_100904_wf.field_110622_b[var8].func_110607_c(var9));
               }
            }
         }

         if(this.field_111394_d.func_107516_b("display")) {
            C_100353_bh var11 = this.field_111394_d.func_107521_l("display");
            if(var11.func_107516_b("color")) {
               if(var2) {
                  var3.add("Color: #" + Integer.toHexString(var11.func_107514_e("color")).toUpperCase());
               } else {
                  var3.add("§o" + C_100359_bd.func_107638_a("item.dyed"));
               }
            }

            if(var11.func_107516_b("Lore")) {
               C_100339_bp var12 = var11.func_107513_m("Lore");
               if(var12.func_107501_c() > 0) {
                  for(int var13 = 0; var13 < var12.func_107501_c(); ++var13) {
                     var3.add("§5§o" + ((C_100333_bt)var12.func_107498_b(var13)).field_107495_a);
                  }
               }
            }
         }
      }

      if(var2 && this.func_111353_h()) {
         var3.add("Durability: " + (this.func_111364_k() - this.func_111357_i()) + " / " + this.func_111364_k());
      }

      return var3;
   }

   public boolean func_111356_t() {
      return this.func_111365_b().func_110747_d(this);
   }

   public C_100963_uf func_111382_u() {
      return this.func_111365_b().func_110794_e(this);
   }

   public boolean func_111347_v() {
      return !this.func_111365_b().func_110786_k(this)?false:!this.func_111358_w();
   }

   public void func_111392_a(C_100904_wf var1, int var2) {
      if(this.field_111394_d == null) {
         this.func_111349_d(new C_100353_bh());
      }

      if(!this.field_111394_d.func_107516_b("ench")) {
         this.field_111394_d.func_107530_a("ench", new C_100339_bp("ench"));
      }

      C_100339_bp var3 = (C_100339_bp)this.field_111394_d.func_107518_a("ench");
      C_100353_bh var4 = new C_100353_bh();
      var4.func_107532_a("id", (short)var1.field_110643_x);
      var4.func_107532_a("lvl", (short)((byte)var2));
      var3.func_107500_a(var4);
   }

   public boolean func_111358_w() {
      return this.field_111394_d != null && this.field_111394_d.func_107516_b("ench");
   }

   public void func_111359_a(String var1, C_100331_bu var2) {
      if(this.field_111394_d == null) {
         this.func_111349_d(new C_100353_bh());
      }

      this.field_111394_d.func_107530_a(var1, var2);
   }

   public boolean func_111345_x() {
      return this.func_111365_b().func_110752_x();
   }

   public boolean func_111377_y() {
      return this.field_111393_f != null;
   }

   public void func_111355_a(C_100596_lm var1) {
      this.field_111393_f = var1;
   }

   public C_100596_lm func_111374_z() {
      return this.field_111393_f;
   }

   public int func_111375_A() {
      return this.func_111339_o() && this.field_111394_d.func_107516_b("RepairCost")?this.field_111394_d.func_107514_e("RepairCost"):0;
   }

   public void func_111389_c(int var1) {
      if(!this.func_111339_o()) {
         this.field_111394_d = new C_100353_bh();
      }

      this.field_111394_d.func_107520_a("RepairCost", var1);
   }
}
