import java.util.Calendar;

public class C_100543_og extends C_100523_of {

   private C_100013_k field_103759_a;


   public C_100543_og(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/bat.png";
      this.func_103161_a(0.5F, 0.9F);
      this.func_103758_f(true);
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, new Byte((byte)0));
   }

   protected float func_103384_aV() {
      return 0.1F;
   }

   protected String func_103354_aW() {
      return "mob.bat.idle";
   }

   protected String func_103387_aX() {
      return "mob.bat.hurt";
   }

   protected String func_103307_aY() {
      return "mob.bat.death";
   }

   public int func_103378_aS() {
      return 6;
   }

   public boolean func_103757_h() {
      return (this.field_103234_ag.func_108842_a(16) & 1) != 0;
   }

   public void func_103758_f(boolean var1) {
      byte var2 = this.field_103234_ag.func_108842_a(16);
      if(var1) {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 | 1)));
      } else {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 & -2)));
      }

   }

   protected boolean func_103321_bb() {
      return true;
   }

   public void func_103165_j_() {
      super.func_103165_j_();
      if(this.func_103757_h()) {
         this.field_103215_w = this.field_103240_x = this.field_103238_y = 0.0D;
         this.field_103219_u = (double)C_100650_jv.func_108910_c(this.field_103219_u) + 1.0D - (double)this.field_103183_O;
      } else {
         this.field_103240_x *= 0.6000000238418579D;
      }

   }

   protected void func_103295_bi() {
      super.func_103295_bi();
      if(this.func_103757_h()) {
         if(!this.field_103229_p.func_109360_s(C_100650_jv.func_108910_c(this.field_103221_t), (int)this.field_103219_u + 1, C_100650_jv.func_108910_c(this.field_103217_v))) {
            this.func_103758_f(false);
            this.field_103229_p.func_109492_a((C_101095_qg)null, 1015, (int)this.field_103221_t, (int)this.field_103219_u, (int)this.field_103217_v, 0);
         } else {
            if(this.field_103232_aa.nextInt(200) == 0) {
               this.field_103455_ay = (float)this.field_103232_aa.nextInt(360);
            }

            if(this.field_103229_p.func_109503_a(this, 4.0D) != null) {
               this.func_103758_f(false);
               this.field_103229_p.func_109492_a((C_101095_qg)null, 1015, (int)this.field_103221_t, (int)this.field_103219_u, (int)this.field_103217_v, 0);
            }
         }
      } else {
         if(this.field_103759_a != null && (!this.field_103229_p.func_109352_c(this.field_103759_a.field_105273_a, this.field_103759_a.field_105271_b, this.field_103759_a.field_105272_c) || this.field_103759_a.field_105271_b < 1)) {
            this.field_103759_a = null;
         }

         if(this.field_103759_a == null || this.field_103232_aa.nextInt(30) == 0 || this.field_103759_a.func_105268_e((int)this.field_103221_t, (int)this.field_103219_u, (int)this.field_103217_v) < 4.0F) {
            this.field_103759_a = new C_100013_k((int)this.field_103221_t + this.field_103232_aa.nextInt(7) - this.field_103232_aa.nextInt(7), (int)this.field_103219_u + this.field_103232_aa.nextInt(6) - 2, (int)this.field_103217_v + this.field_103232_aa.nextInt(7) - this.field_103232_aa.nextInt(7));
         }

         double var1 = (double)this.field_103759_a.field_105273_a + 0.5D - this.field_103221_t;
         double var3 = (double)this.field_103759_a.field_105271_b + 0.1D - this.field_103219_u;
         double var5 = (double)this.field_103759_a.field_105272_c + 0.5D - this.field_103217_v;
         this.field_103215_w += (Math.signum(var1) * 0.5D - this.field_103215_w) * 0.10000000149011612D;
         this.field_103240_x += (Math.signum(var3) * 0.699999988079071D - this.field_103240_x) * 0.10000000149011612D;
         this.field_103238_y += (Math.signum(var5) * 0.5D - this.field_103238_y) * 0.10000000149011612D;
         float var7 = (float)(Math.atan2(this.field_103238_y, this.field_103215_w) * 180.0D / 3.1415927410125732D) - 90.0F;
         float var8 = C_100650_jv.func_108920_g(var7 - this.field_103236_z);
         this.field_103485_bE = 0.5F;
         this.field_103236_z += var8;
         if(this.field_103232_aa.nextInt(100) == 0 && this.field_103229_p.func_109360_s(C_100650_jv.func_108910_c(this.field_103221_t), (int)this.field_103219_u + 1, C_100650_jv.func_108910_c(this.field_103217_v))) {
            this.func_103758_f(true);
         }
      }

   }

   protected boolean func_103092_f_() {
      return false;
   }

   protected void func_103124_a(float var1) {}

   protected void func_103120_a(double var1, boolean var3) {}

   public boolean func_103076_au() {
      return true;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      if(!this.field_103229_p.field_109557_J && this.func_103757_h()) {
         this.func_103758_f(false);
      }

      return super.func_103085_a(var1, var2);
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.field_103234_ag.func_108851_b(16, Byte.valueOf(var1.func_107524_c("BatFlags")));
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107527_a("BatFlags", this.field_103234_ag.func_108842_a(16));
   }

   public boolean func_103380_bp() {
      int var1 = C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b);
      if(var1 >= 63) {
         return false;
      } else {
         int var2 = C_100650_jv.func_108910_c(this.field_103221_t);
         int var3 = C_100650_jv.func_108910_c(this.field_103217_v);
         int var4 = this.field_103229_p.func_109523_l(var2, var1, var3);
         byte var5 = 4;
         Calendar var6 = this.field_103229_p.func_109388_S();
         if((var6.get(2) + 1 != 10 || var6.get(5) < 20) && (var6.get(2) + 1 != 11 || var6.get(5) > 3)) {
            if(this.field_103232_aa.nextBoolean()) {
               return false;
            }
         } else {
            var5 = 7;
         }

         return var4 > this.field_103232_aa.nextInt(var5)?false:super.func_103380_bp();
      }
   }

   public void func_103337_bD() {}
}
