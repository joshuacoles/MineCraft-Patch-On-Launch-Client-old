import java.util.ArrayList;
import java.util.Iterator;

public class C_100574_pf extends C_100730_lb {

   public int field_103271_a;
   public int field_103269_b;
   public int field_103270_c;
   public boolean field_103267_d;
   private boolean field_103268_e;
   private boolean field_103265_f;
   private int field_103266_g;
   private float field_103272_h;


   public C_100574_pf(C_100873_xe var1) {
      super(var1);
      this.field_103270_c = 0;
      this.field_103267_d = true;
      this.field_103268_e = false;
      this.field_103265_f = false;
      this.field_103266_g = 20;
      this.field_103272_h = 2.0F;
   }

   public C_100574_pf(C_100873_xe var1, double var2, double var4, double var6, int var8) {
      this(var1, var2, var4, var6, var8, 0);
   }

   public C_100574_pf(C_100873_xe var1, double var2, double var4, double var6, int var8, int var9) {
      super(var1);
      this.field_103270_c = 0;
      this.field_103267_d = true;
      this.field_103268_e = false;
      this.field_103265_f = false;
      this.field_103266_g = 20;
      this.field_103272_h = 2.0F;
      this.field_103271_a = var8;
      this.field_103269_b = var9;
      this.field_103211_m = true;
      this.func_103161_a(0.98F, 0.98F);
      this.field_103181_M = this.field_103183_O / 2.0F;
      this.func_103163_b(var2, var4, var6);
      this.field_103215_w = 0.0D;
      this.field_103240_x = 0.0D;
      this.field_103238_y = 0.0D;
      this.field_103227_q = var2;
      this.field_103225_r = var4;
      this.field_103223_s = var6;
   }

   protected boolean func_103092_f_() {
      return false;
   }

   protected void func_103141_a() {}

   public boolean func_103123_L() {
      return !this.field_103180_L;
   }

   public void func_103165_j_() {
      if(this.field_103271_a == 0) {
         this.func_103121_x();
      } else {
         this.field_103227_q = this.field_103221_t;
         this.field_103225_r = this.field_103219_u;
         this.field_103223_s = this.field_103217_v;
         ++this.field_103270_c;
         this.field_103240_x -= 0.03999999910593033D;
         this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
         this.field_103215_w *= 0.9800000190734863D;
         this.field_103240_x *= 0.9800000190734863D;
         this.field_103238_y *= 0.9800000190734863D;
         if(!this.field_103229_p.field_109557_J) {
            int var1 = C_100650_jv.func_108910_c(this.field_103221_t);
            int var2 = C_100650_jv.func_108910_c(this.field_103219_u);
            int var3 = C_100650_jv.func_108910_c(this.field_103217_v);
            if(this.field_103270_c == 1) {
               if(this.field_103270_c == 1 && this.field_103229_p.func_109349_a(var1, var2, var3) == this.field_103271_a) {
                  this.field_103229_p.func_109422_e(var1, var2, var3, 0);
               } else {
                  this.func_103121_x();
               }
            }

            if(this.field_103174_E) {
               this.field_103215_w *= 0.699999988079071D;
               this.field_103238_y *= 0.699999988079071D;
               this.field_103240_x *= -0.5D;
               if(this.field_103229_p.func_109349_a(var1, var2, var3) != C_100451_alf.field_106254_af.field_106162_cm) {
                  this.func_103121_x();
                  if(!this.field_103268_e && this.field_103229_p.func_109501_a(this.field_103271_a, var1, var2, var3, true, 1, (C_100730_lb)null) && !C_100173_ajc.func_106296_a_(this.field_103229_p, var1, var2 - 1, var3) && this.field_103229_p.func_109394_d(var1, var2, var3, this.field_103271_a, this.field_103269_b)) {
                     if(C_100451_alf.field_106118_p[this.field_103271_a] instanceof C_100173_ajc) {
                        ((C_100173_ajc)C_100451_alf.field_106118_p[this.field_103271_a]).func_106297_a_(this.field_103229_p, var1, var2, var3, this.field_103269_b);
                     }
                  } else if(this.field_103267_d && !this.field_103268_e) {
                     this.func_103140_a(new C_100994_tv(this.field_103271_a, 1, C_100451_alf.field_106118_p[this.field_103271_a].func_106004_b(this.field_103269_b)), 0.0F);
                  }
               }
            } else if(this.field_103270_c > 100 && !this.field_103229_p.field_109557_J && (var2 < 1 || var2 > 256) || this.field_103270_c > 600) {
               if(this.field_103267_d) {
                  this.func_103140_a(new C_100994_tv(this.field_103271_a, 1, C_100451_alf.field_106118_p[this.field_103271_a].func_106004_b(this.field_103269_b)), 0.0F);
               }

               this.func_103121_x();
            }
         }

      }
   }

   protected void func_103124_a(float var1) {
      if(this.field_103265_f) {
         int var2 = C_100650_jv.func_108921_f(var1 - 1.0F);
         if(var2 > 0) {
            ArrayList var3 = new ArrayList(this.field_103229_p.func_109449_b(this, this.field_103173_D));
            C_100698_ks var4 = this.field_103271_a == C_100451_alf.field_106164_ck.field_106162_cm?C_100698_ks.field_109237_o:C_100698_ks.field_109251_p;
            Iterator var5 = var3.iterator();

            while(var5.hasNext()) {
               C_100730_lb var6 = (C_100730_lb)var5.next();
               var6.func_103085_a(var4, Math.min(C_100650_jv.func_108933_d((float)var2 * this.field_103272_h), this.field_103266_g));
            }

            if(this.field_103271_a == C_100451_alf.field_106164_ck.field_106162_cm && (double)this.field_103232_aa.nextFloat() < 0.05000000074505806D + (double)var2 * 0.05D) {
               int var7 = this.field_103269_b >> 2;
               int var8 = this.field_103269_b & 3;
               ++var7;
               if(var7 > 2) {
                  this.field_103268_e = true;
               } else {
                  this.field_103269_b = var8 | var7 << 2;
               }
            }
         }
      }

   }

   protected void func_103078_b(C_100353_bh var1) {
      var1.func_107527_a("Tile", (byte)this.field_103271_a);
      var1.func_107527_a("Data", (byte)this.field_103269_b);
      var1.func_107527_a("Time", (byte)this.field_103270_c);
      var1.func_107509_a("DropItem", this.field_103267_d);
      var1.func_107509_a("HurtEntities", this.field_103265_f);
      var1.func_107529_a("FallHurtAmount", this.field_103272_h);
      var1.func_107520_a("FallHurtMax", this.field_103266_g);
   }

   protected void func_103110_a(C_100353_bh var1) {
      this.field_103271_a = var1.func_107524_c("Tile") & 255;
      this.field_103269_b = var1.func_107524_c("Data") & 255;
      this.field_103270_c = var1.func_107524_c("Time") & 255;
      if(var1.func_107516_b("HurtEntities")) {
         this.field_103265_f = var1.func_107519_n("HurtEntities");
         this.field_103272_h = var1.func_107512_g("FallHurtAmount");
         this.field_103266_g = var1.func_107514_e("FallHurtMax");
      } else if(this.field_103271_a == C_100451_alf.field_106164_ck.field_106162_cm) {
         this.field_103265_f = true;
      }

      if(var1.func_107516_b("DropItem")) {
         this.field_103267_d = var1.func_107519_n("DropItem");
      }

      if(this.field_103271_a == 0) {
         this.field_103271_a = C_100451_alf.field_106082_H.field_106162_cm;
      }

   }

   public float func_103109_R() {
      return 0.0F;
   }

   public C_100873_xe func_103263_c() {
      return this.field_103229_p;
   }

   public void func_103264_e(boolean var1) {
      this.field_103265_f = var1;
   }
}
