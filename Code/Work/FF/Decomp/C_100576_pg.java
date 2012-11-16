import java.util.Iterator;

public class C_100576_pg extends C_100730_lb {

   public C_100994_tv field_103279_a;
   public int field_103277_b = 0;
   public int field_103278_c;
   private int field_103276_e = 5;
   public float field_103275_d = (float)(Math.random() * 3.141592653589793D * 2.0D);


   public C_100576_pg(C_100873_xe var1, double var2, double var4, double var6, C_100994_tv var8) {
      super(var1);
      this.func_103161_a(0.25F, 0.25F);
      this.field_103181_M = this.field_103183_O / 2.0F;
      this.func_103163_b(var2, var4, var6);
      this.field_103279_a = var8;
      this.field_103236_z = (float)(Math.random() * 360.0D);
      this.field_103215_w = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
      this.field_103240_x = 0.20000000298023224D;
      this.field_103238_y = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
   }

   protected boolean func_103092_f_() {
      return false;
   }

   public C_100576_pg(C_100873_xe var1) {
      super(var1);
      this.func_103161_a(0.25F, 0.25F);
      this.field_103181_M = this.field_103183_O / 2.0F;
   }

   protected void func_103141_a() {}

   public void func_103165_j_() {
      super.func_103165_j_();
      if(this.field_103278_c > 0) {
         --this.field_103278_c;
      }

      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      this.field_103240_x -= 0.03999999910593033D;
      this.func_103105_i(this.field_103221_t, (this.field_103173_D.field_107915_b + this.field_103173_D.field_107914_e) / 2.0D, this.field_103217_v);
      this.func_103145_d(this.field_103215_w, this.field_103240_x, this.field_103238_y);
      boolean var1 = (int)this.field_103227_q != (int)this.field_103221_t || (int)this.field_103225_r != (int)this.field_103219_u || (int)this.field_103223_s != (int)this.field_103217_v;
      if(var1) {
         if(this.field_103229_p.func_109350_f(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v)) == C_100664_afg.field_109020_i) {
            this.field_103240_x = 0.20000000298023224D;
            this.field_103215_w = (double)((this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F);
            this.field_103238_y = (double)((this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F);
            this.field_103229_p.func_109412_a(this, "random.fizz", 0.4F, 2.0F + this.field_103232_aa.nextFloat() * 0.4F);
         }

         if(!this.field_103229_p.field_109557_J) {
            Iterator var2 = this.field_103229_p.func_109518_a(C_100576_pg.class, this.field_103173_D.func_107895_b(0.5D, 0.0D, 0.5D)).iterator();

            while(var2.hasNext()) {
               C_100576_pg var3 = (C_100576_pg)var2.next();
               this.func_103273_a(var3);
            }
         }
      }

      float var4 = 0.98F;
      if(this.field_103174_E) {
         var4 = 0.58800006F;
         int var5 = this.field_103229_p.func_109349_a(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103173_D.field_107915_b) - 1, C_100650_jv.func_108910_c(this.field_103217_v));
         if(var5 > 0) {
            var4 = C_100451_alf.field_106118_p[var5].field_106145_cC * 0.98F;
         }
      }

      this.field_103215_w *= (double)var4;
      this.field_103240_x *= 0.9800000190734863D;
      this.field_103238_y *= (double)var4;
      if(this.field_103174_E) {
         this.field_103240_x *= -0.5D;
      }

      ++this.field_103277_b;
      if(!this.field_103229_p.field_109557_J && this.field_103277_b >= 6000) {
         this.func_103121_x();
      }

   }

   public boolean func_103273_a(C_100576_pg var1) {
      if(var1 == this) {
         return false;
      } else if(var1.func_103143_S() && this.func_103143_S()) {
         if(var1.field_103279_a.func_111365_b() != this.field_103279_a.func_111365_b()) {
            return false;
         } else if(!var1.field_103279_a.func_111339_o() && !this.field_103279_a.func_111339_o()) {
            if(var1.field_103279_a.func_111365_b().func_110803_l() && var1.field_103279_a.func_111367_j() != this.field_103279_a.func_111367_j()) {
               return false;
            } else if(var1.field_103279_a.field_111398_a < this.field_103279_a.field_111398_a) {
               return var1.func_103273_a(this);
            } else if(var1.field_103279_a.field_111398_a + this.field_103279_a.field_111398_a > var1.field_103279_a.func_111380_d()) {
               return false;
            } else {
               var1.field_103279_a.field_111398_a += this.field_103279_a.field_111398_a;
               var1.field_103278_c = Math.max(var1.field_103278_c, this.field_103278_c);
               var1.field_103277_b = Math.min(var1.field_103277_b, this.field_103277_b);
               this.func_103121_x();
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void func_103274_c() {
      this.field_103277_b = 4800;
   }

   public boolean func_103126_I() {
      return this.field_103229_p.func_109512_a(this.field_103173_D, C_100664_afg.field_109019_h, this);
   }

   protected void func_103059_d(int var1) {
      this.func_103085_a(C_100698_ks.field_109235_a, var1);
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      this.func_103065_K();
      this.field_103276_e -= var2;
      if(this.field_103276_e <= 0) {
         this.func_103121_x();
      }

      return false;
   }

   public void func_103078_b(C_100353_bh var1) {
      var1.func_107532_a("Health", (short)((byte)this.field_103276_e));
      var1.func_107532_a("Age", (short)this.field_103277_b);
      if(this.field_103279_a != null) {
         var1.func_107538_a("Item", this.field_103279_a.func_111344_b(new C_100353_bh()));
      }

   }

   public void func_103110_a(C_100353_bh var1) {
      this.field_103276_e = var1.func_107517_d("Health") & 255;
      this.field_103277_b = var1.func_107517_d("Age");
      C_100353_bh var2 = var1.func_107521_l("Item");
      this.field_103279_a = C_100994_tv.func_111376_a(var2);
      if(this.field_103279_a == null) {
         this.func_103121_x();
      }

   }

   public void func_103096_b_(C_101095_qg var1) {
      if(!this.field_103229_p.field_109557_J) {
         int var2 = this.field_103279_a.field_111398_a;
         if(this.field_103278_c == 0 && var1.field_103857_bK.func_104809_a(this.field_103279_a)) {
            if(this.field_103279_a.field_111397_c == C_100451_alf.field_106079_M.field_106162_cm) {
               var1.func_103761_a(C_100822_iy.field_110058_g);
            }

            if(this.field_103279_a.field_111397_c == C_100992_tt.field_110918_aF.field_110891_cf) {
               var1.func_103761_a(C_100822_iy.field_110075_t);
            }

            if(this.field_103279_a.field_111397_c == C_100992_tt.field_110838_n.field_110891_cf) {
               var1.func_103761_a(C_100822_iy.field_110072_w);
            }

            if(this.field_103279_a.field_111397_c == C_100992_tt.field_110869_bo.field_110891_cf) {
               var1.func_103761_a(C_100822_iy.field_110080_z);
            }

            this.field_103229_p.func_109412_a(this, "random.pop", 0.2F, ((this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.func_103397_a(this, var2);
            if(this.field_103279_a.field_111398_a <= 0) {
               this.func_103121_x();
            }
         }

      }
   }

   public String func_103139_an() {
      return C_100359_bd.func_107638_a("item." + this.field_103279_a.func_111381_a());
   }

   public boolean func_103099_aq() {
      return false;
   }
}
