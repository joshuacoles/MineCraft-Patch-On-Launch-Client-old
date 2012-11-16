import net.minecraft.client.Minecraft;

public class C_100950_axc extends C_100966_aym {

   public C_101250_awr field_104564_a;
   private double field_104563_cn;
   private double field_104561_co;
   private double field_104562_cp;
   private double field_104559_cq;
   private float field_104560_cr;
   private float field_104570_cs;
   private boolean field_104569_ct = false;
   private boolean field_104567_cu = false;
   private boolean field_104565_cv = false;
   private int field_104566_cD = 0;
   private boolean field_104568_cE = false;


   public C_100950_axc(Minecraft var1, C_100873_xe var2, C_101134_ark var3, C_101250_awr var4) {
      super(var1, var2, var3, 0);
      this.field_104564_a = var4;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      return false;
   }

   public void func_103392_i(int var1) {}

   public void func_103165_j_() {
      if(this.field_103229_p.func_109461_e(C_100650_jv.func_108910_c(this.field_103221_t), 0, C_100650_jv.func_108910_c(this.field_103217_v))) {
         super.func_103165_j_();
         this.func_104557_d();
      }
   }

   public void func_104557_d() {
      boolean var1 = this.func_103147_ai();
      if(var1 != this.field_104565_cv) {
         if(var1) {
            this.field_104564_a.func_107034_c(new C_100231_eb(this, 4));
         } else {
            this.field_104564_a.func_107034_c(new C_100231_eb(this, 5));
         }

         this.field_104565_cv = var1;
      }

      boolean var2 = this.func_103168_ah();
      if(var2 != this.field_104567_cu) {
         if(var2) {
            this.field_104564_a.func_107034_c(new C_100231_eb(this, 1));
         } else {
            this.field_104564_a.func_107034_c(new C_100231_eb(this, 2));
         }

         this.field_104567_cu = var2;
      }

      double var3 = this.field_103221_t - this.field_104563_cn;
      double var5 = this.field_103173_D.field_107915_b - this.field_104561_co;
      double var7 = this.field_103217_v - this.field_104559_cq;
      double var9 = (double)(this.field_103236_z - this.field_104560_cr);
      double var11 = (double)(this.field_103177_A - this.field_104570_cs);
      boolean var13 = var3 * var3 + var5 * var5 + var7 * var7 > 9.0E-4D || this.field_104566_cD >= 20;
      boolean var14 = var9 != 0.0D || var11 != 0.0D;
      if(this.field_103207_o != null) {
         this.field_104564_a.func_107034_c(new C_100216_dv(this.field_103215_w, -999.0D, -999.0D, this.field_103238_y, this.field_103236_z, this.field_103177_A, this.field_103174_E));
         var13 = false;
      } else if(var13 && var14) {
         this.field_104564_a.func_107034_c(new C_100216_dv(this.field_103221_t, this.field_103173_D.field_107915_b, this.field_103219_u, this.field_103217_v, this.field_103236_z, this.field_103177_A, this.field_103174_E));
      } else if(var13) {
         this.field_104564_a.func_107034_c(new C_100215_du(this.field_103221_t, this.field_103173_D.field_107915_b, this.field_103219_u, this.field_103217_v, this.field_103174_E));
      } else if(var14) {
         this.field_104564_a.func_107034_c(new C_100217_dw(this.field_103236_z, this.field_103177_A, this.field_103174_E));
      } else {
         this.field_104564_a.func_107034_c(new C_100214_dt(this.field_103174_E));
      }

      ++this.field_104566_cD;
      this.field_104569_ct = this.field_103174_E;
      if(var13) {
         this.field_104563_cn = this.field_103221_t;
         this.field_104561_co = this.field_103173_D.field_107915_b;
         this.field_104562_cp = this.field_103219_u;
         this.field_104559_cq = this.field_103217_v;
         this.field_104566_cD = 0;
      }

      if(var14) {
         this.field_104560_cr = this.field_103236_z;
         this.field_104570_cs = this.field_103177_A;
      }

   }

   public C_100576_pg func_103830_bN() {
      this.field_104564_a.func_107034_c(new C_100229_ea(4, 0, 0, 0, 0));
      return null;
   }

   protected void func_103762_a(C_100576_pg var1) {}

   public void func_104556_c(String var1) {
      this.field_104564_a.func_107034_c(new C_100392_cm(var1));
   }

   public void func_103301_bE() {
      super.func_103301_bE();
      this.field_104564_a.func_107034_c(new C_100401_cj(this, 1));
   }

   public void func_103791_bR() {
      this.field_104564_a.func_107034_c(new C_100388_co(1));
   }

   protected void func_103363_d(C_100698_ks var1, int var2) {
      if(!this.field_103407_bt) {
         this.func_103298_j(this.func_103330_aT() - var2);
      }
   }

   public void func_103808_i() {
      this.field_104564_a.func_107034_c(new C_100376_cv(this.field_103856_bM.field_111514_c));
      this.field_103857_bK.func_104801_b((C_100994_tv)null);
      super.func_103808_i();
   }

   public void func_104539_u(int var1) {
      if(this.field_104568_cE) {
         super.func_104539_u(var1);
      } else {
         this.func_103298_j(var1);
         this.field_104568_cE = true;
      }

   }

   public void func_103813_a(C_100809_jc var1, int var2) {
      if(var1 != null) {
         if(var1.field_109915_f) {
            super.func_103813_a(var1, var2);
         }

      }
   }

   public void func_104558_b(C_100809_jc var1, int var2) {
      if(var1 != null) {
         if(!var1.field_109915_f) {
            super.func_103813_a(var1, var2);
         }

      }
   }

   public void func_103805_o() {
      this.field_104564_a.func_107034_c(new C_100223_dz(this.field_103869_cf));
   }

   public boolean func_103806_bS() {
      return true;
   }
}
