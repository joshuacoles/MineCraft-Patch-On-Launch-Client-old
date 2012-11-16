import net.minecraft.client.Minecraft;

public class C_100966_aym extends C_101095_qg {

   public C_100955_ayk field_104547_b;
   protected Minecraft field_104548_c;
   protected int field_104545_d = 0;
   public int field_104546_e = 0;
   public float field_104543_f;
   public float field_104544_g;
   public float field_104550_h;
   public float field_104551_i;
   private C_100680_kc field_104554_cp = new C_100680_kc();
   private C_100680_kc field_104552_cq = new C_100680_kc();
   private C_100680_kc field_104553_cr = new C_100680_kc();
   public float field_104549_j;
   public float field_104555_cm;


   public C_100966_aym(Minecraft var1, C_100873_xe var2, C_101134_ark var3, int var4) {
      super(var2);
      this.field_104548_c = var1;
      this.field_103224_ap = var4;
      if(var3 != null && var3.field_111761_b != null && var3.field_111761_b.length() > 0) {
         this.field_103172_cw = "http://skins.minecraft.net/MinecraftSkins/" + C_100679_kd.func_109122_a(var3.field_111761_b) + ".png";
      }

      this.field_103847_bT = var3.field_111761_b;
   }

   public void func_103145_d(double var1, double var3, double var5) {
      super.func_103145_d(var1, var3, var5);
   }

   public void func_103288_bk() {
      super.func_103288_bk();
      this.field_103484_bD = this.field_104547_b.field_111151_a;
      this.field_103485_bE = this.field_104547_b.field_111149_b;
      this.field_103491_bG = this.field_104547_b.field_111150_c;
      this.field_104550_h = this.field_104543_f;
      this.field_104551_i = this.field_104544_g;
      this.field_104544_g = (float)((double)this.field_104544_g + (double)(this.field_103177_A - this.field_104544_g) * 0.5D);
      this.field_104543_f = (float)((double)this.field_104543_f + (double)(this.field_103236_z - this.field_104543_f) * 0.5D);
   }

   protected boolean func_103315_bc() {
      return true;
   }

   public void func_103313_c() {
      if(this.field_104546_e > 0) {
         --this.field_104546_e;
         if(this.field_104546_e == 0) {
            this.func_103080_b(false);
         }
      }

      if(this.field_104545_d > 0) {
         --this.field_104545_d;
      }

      if(this.field_104548_c.field_105123_b.func_111057_a()) {
         this.field_103221_t = this.field_103217_v = 0.5D;
         this.field_103221_t = 0.0D;
         this.field_103217_v = 0.0D;
         this.field_103236_z = (float)this.field_103233_ab / 12.0F;
         this.field_103177_A = 10.0F;
         this.field_103219_u = 68.5D;
      } else {
         if(!this.field_104548_c.field_105094_E.func_105803_a(C_100822_iy.field_110057_f)) {
            this.field_104548_c.field_105139_u.func_104006_b(C_100822_iy.field_110057_f);
         }

         this.field_104555_cm = this.field_104549_j;
         if(this.field_103222_ao) {
            if(this.field_104548_c.field_105144_r != null) {
               this.field_104548_c.func_105053_a((C_101278_asw)null);
            }

            if(this.field_104549_j == 0.0F) {
               this.field_104548_c.field_105097_A.func_105895_a("portal.trigger", 1.0F, this.field_103232_aa.nextFloat() * 0.4F + 0.8F);
            }

            this.field_104549_j += 0.0125F;
            if(this.field_104549_j >= 1.0F) {
               this.field_104549_j = 1.0F;
            }

            this.field_103222_ao = false;
         } else if(this.func_103300_a(C_100690_kw.field_109175_k) && this.func_103390_b(C_100690_kw.field_109175_k).func_109193_b() > 60) {
            this.field_104549_j += 0.006666667F;
            if(this.field_104549_j > 1.0F) {
               this.field_104549_j = 1.0F;
            }
         } else {
            if(this.field_104549_j > 0.0F) {
               this.field_104549_j -= 0.05F;
            }

            if(this.field_104549_j < 0.0F) {
               this.field_104549_j = 0.0F;
            }
         }

         if(this.field_103228_an > 0) {
            --this.field_103228_an;
         }

         boolean var1 = this.field_104547_b.field_111150_c;
         float var2 = 0.8F;
         boolean var3 = this.field_104547_b.field_111149_b >= var2;
         this.field_104547_b.func_111147_a();
         if(this.func_103833_bI()) {
            this.field_104547_b.field_111151_a *= 0.2F;
            this.field_104547_b.field_111149_b *= 0.2F;
            this.field_104545_d = 0;
         }

         if(this.field_104547_b.field_111148_d && this.field_103190_W < 0.2F) {
            this.field_103190_W = 0.2F;
         }

         this.func_103105_i(this.field_103221_t - (double)this.field_103182_N * 0.35D, this.field_103173_D.field_107915_b + 0.5D, this.field_103217_v + (double)this.field_103182_N * 0.35D);
         this.func_103105_i(this.field_103221_t - (double)this.field_103182_N * 0.35D, this.field_103173_D.field_107915_b + 0.5D, this.field_103217_v - (double)this.field_103182_N * 0.35D);
         this.func_103105_i(this.field_103221_t + (double)this.field_103182_N * 0.35D, this.field_103173_D.field_107915_b + 0.5D, this.field_103217_v - (double)this.field_103182_N * 0.35D);
         this.func_103105_i(this.field_103221_t + (double)this.field_103182_N * 0.35D, this.field_103173_D.field_107915_b + 0.5D, this.field_103217_v + (double)this.field_103182_N * 0.35D);
         boolean var4 = (float)this.func_103819_bZ().func_111578_a() > 6.0F || this.field_103869_cf.field_111600_c;
         if(this.field_103174_E && !var3 && this.field_104547_b.field_111149_b >= var2 && !this.func_103147_ai() && var4 && !this.func_103833_bI() && !this.func_103300_a(C_100690_kw.field_109184_q)) {
            if(this.field_104545_d == 0) {
               this.field_104545_d = 7;
            } else {
               this.func_103080_b(true);
               this.field_104545_d = 0;
            }
         }

         if(this.func_103168_ah()) {
            this.field_104545_d = 0;
         }

         if(this.func_103147_ai() && (this.field_104547_b.field_111149_b < var2 || this.field_103175_F || !var4)) {
            this.func_103080_b(false);
         }

         if(this.field_103869_cf.field_111600_c && !var1 && this.field_104547_b.field_111150_c) {
            if(this.field_103863_bO == 0) {
               this.field_103863_bO = 7;
            } else {
               this.field_103869_cf.field_111599_b = !this.field_103869_cf.field_111599_b;
               this.func_103805_o();
               this.field_103863_bO = 0;
            }
         }

         if(this.field_103869_cf.field_111599_b) {
            if(this.field_104547_b.field_111148_d) {
               this.field_103240_x -= 0.15D;
            }

            if(this.field_104547_b.field_111150_c) {
               this.field_103240_x += 0.15D;
            }
         }

         super.func_103313_c();
         if(this.field_103174_E && this.field_103869_cf.field_111599_b) {
            this.field_103869_cf.field_111599_b = false;
            this.func_103805_o();
         }

      }
   }

   public float func_104540_f() {
      float var1 = 1.0F;
      if(this.field_103869_cf.field_111599_b) {
         var1 *= 1.1F;
      }

      var1 *= (this.field_103439_aM * this.func_103353_by() / this.field_103865_cj + 1.0F) / 2.0F;
      if(this.func_103833_bI() && this.func_103811_bG().field_111397_c == C_100992_tt.field_110843_k.field_110891_cf) {
         int var2 = this.func_103820_bJ();
         float var3 = (float)var2 / 20.0F;
         if(var3 > 1.0F) {
            var3 = 1.0F;
         } else {
            var3 *= var3;
         }

         var1 *= 1.0F - var3 * 0.15F;
      }

      return var1;
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107520_a("Score", this.field_103859_bQ);
   }

   public void func_103072_ad() {
      this.field_103842_cB = "http://skins.minecraft.net/MinecraftCloaks/" + C_100679_kd.func_109122_a(this.field_103847_bT) + ".png";
      this.field_103171_cx = this.field_103842_cB;
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.field_103859_bQ = var1.func_107514_e("Score");
   }

   public void func_103808_i() {
      super.func_103808_i();
      this.field_104548_c.func_105053_a((C_101278_asw)null);
   }

   public void func_103826_a(C_100398_amm var1) {
      if(var1 instanceof C_100414_amj) {
         this.field_104548_c.func_105053_a(new C_101337_auo((C_100414_amj)var1));
      } else if(var1 instanceof C_100423_amc) {
         this.field_104548_c.func_105053_a(new C_101328_atz((C_100423_amc)var1));
      }

   }

   public void func_103800_d(C_100994_tv var1) {
      C_100992_tt var2 = var1.func_111365_b();
      if(var2 == C_100992_tt.field_110971_bG) {
         this.field_104548_c.func_105053_a(new C_101326_atw(this, var1, false));
      } else if(var2 == C_100992_tt.field_110969_bF) {
         this.field_104548_c.func_105053_a(new C_101326_atw(this, var1, true));
      }

   }

   public void func_103785_a(C_100716_kl var1) {
      this.field_104548_c.func_105053_a(new C_101314_aua(this.field_103857_bK, var1));
   }

   public void func_103825_b(int var1, int var2, int var3) {
      this.field_104548_c.func_105053_a(new C_101319_aub(this.field_103857_bK, this.field_103229_p, var1, var2, var3));
   }

   public void func_103770_c(int var1, int var2, int var3) {
      this.field_104548_c.func_105053_a(new C_101356_aui(this.field_103857_bK, this.field_103229_p, var1, var2, var3));
   }

   public void func_103815_d(int var1, int var2, int var3) {
      this.field_104548_c.func_105053_a(new C_101335_aun(this.field_103857_bK, this.field_103229_p, var1, var2, var3));
   }

   public void func_103810_a(C_100419_amg var1) {
      this.field_104548_c.func_105053_a(new C_101358_auj(this.field_103857_bK, var1));
   }

   public void func_103801_a(C_100424_ama var1) {
      this.field_104548_c.func_105053_a(new C_101330_aty(this.field_103857_bK, var1));
   }

   public void func_103763_a(C_100425_alz var1) {
      this.field_104548_c.func_105053_a(new C_101290_atr(this.field_103857_bK, var1));
   }

   public void func_103778_a(C_100420_amd var1) {
      this.field_104548_c.func_105053_a(new C_101339_aup(this.field_103857_bK, var1));
   }

   public void func_103823_a(C_100891_wu var1) {
      this.field_104548_c.func_105053_a(new C_101332_aul(this.field_103857_bK, var1, this.field_103229_p));
   }

   public void func_103790_b(C_100730_lb var1) {
      this.field_104548_c.field_105133_i.func_111310_a(new C_100916_axk(this.field_104548_c.field_105122_e, var1));
   }

   public void func_103807_c(C_100730_lb var1) {
      C_100916_axk var2 = new C_100916_axk(this.field_104548_c.field_105122_e, var1, "magicCrit");
      this.field_104548_c.field_105133_i.func_111310_a(var2);
   }

   public void func_103397_a(C_100730_lb var1, int var2) {
      this.field_104548_c.field_105133_i.func_111310_a(new C_100960_ayh(this.field_104548_c.field_105122_e, var1, this, -0.5F));
   }

   public boolean func_103168_ah() {
      return this.field_104547_b.field_111148_d && !this.field_103834_cb;
   }

   public void func_104539_u(int var1) {
      int var2 = this.func_103330_aT() - var1;
      if(var2 <= 0) {
         this.func_103298_j(var1);
         if(var2 < 0) {
            this.field_103237_ae = this.field_103461_at / 2;
         }
      } else {
         this.field_103486_bB = var2;
         this.func_103298_j(this.func_103330_aT());
         this.field_103237_ae = this.field_103461_at;
         this.func_103363_d(C_100698_ks.field_109240_j, var2);
         this.field_103432_aU = this.field_103431_aV = 10;
      }

   }

   public void func_103773_b(String var1) {
      this.field_104548_c.field_105137_v.func_103991_b().func_103885_a(var1, new Object[0]);
   }

   public void func_103813_a(C_100809_jc var1, int var2) {
      if(var1 != null) {
         if(var1.func_109910_d()) {
            C_100791_ix var3 = (C_100791_ix)var1;
            if(var3.field_109935_c == null || this.field_104548_c.field_105094_E.func_105803_a(var3.field_109935_c)) {
               if(!this.field_104548_c.field_105094_E.func_105803_a(var3)) {
                  this.field_104548_c.field_105139_u.func_104009_a(var3);
               }

               this.field_104548_c.field_105094_E.func_105801_a(var1, var2);
            }
         } else {
            this.field_104548_c.field_105094_E.func_105801_a(var1, var2);
         }

      }
   }

   private boolean func_104541_g(int var1, int var2, int var3) {
      return this.field_103229_p.func_109360_s(var1, var2, var3);
   }

   protected boolean func_103105_i(double var1, double var3, double var5) {
      int var7 = C_100650_jv.func_108910_c(var1);
      int var8 = C_100650_jv.func_108910_c(var3);
      int var9 = C_100650_jv.func_108910_c(var5);
      double var10 = var1 - (double)var7;
      double var12 = var5 - (double)var9;
      if(this.func_104541_g(var7, var8, var9) || this.func_104541_g(var7, var8 + 1, var9)) {
         boolean var14 = !this.func_104541_g(var7 - 1, var8, var9) && !this.func_104541_g(var7 - 1, var8 + 1, var9);
         boolean var15 = !this.func_104541_g(var7 + 1, var8, var9) && !this.func_104541_g(var7 + 1, var8 + 1, var9);
         boolean var16 = !this.func_104541_g(var7, var8, var9 - 1) && !this.func_104541_g(var7, var8 + 1, var9 - 1);
         boolean var17 = !this.func_104541_g(var7, var8, var9 + 1) && !this.func_104541_g(var7, var8 + 1, var9 + 1);
         byte var18 = -1;
         double var19 = 9999.0D;
         if(var14 && var10 < var19) {
            var19 = var10;
            var18 = 0;
         }

         if(var15 && 1.0D - var10 < var19) {
            var19 = 1.0D - var10;
            var18 = 1;
         }

         if(var16 && var12 < var19) {
            var19 = var12;
            var18 = 4;
         }

         if(var17 && 1.0D - var12 < var19) {
            var19 = 1.0D - var12;
            var18 = 5;
         }

         float var21 = 0.1F;
         if(var18 == 0) {
            this.field_103215_w = (double)(-var21);
         }

         if(var18 == 1) {
            this.field_103215_w = (double)var21;
         }

         if(var18 == 4) {
            this.field_103238_y = (double)(-var21);
         }

         if(var18 == 5) {
            this.field_103238_y = (double)var21;
         }
      }

      return false;
   }

   public void func_103080_b(boolean var1) {
      super.func_103080_b(var1);
      this.field_104546_e = var1?600:0;
   }

   public void func_104542_a(float var1, int var2, int var3) {
      this.field_103864_ci = var1;
      this.field_103867_ch = var2;
      this.field_103866_cg = var3;
   }

   public void func_102910_a(String var1) {
      this.field_104548_c.field_105137_v.func_103991_b().func_103894_a(var1);
   }

   public boolean func_102912_a(int var1, String var2) {
      return var1 <= 0;
   }

   public C_100013_k func_102911_b() {
      return new C_100013_k(C_100650_jv.func_108910_c(this.field_103221_t + 0.5D), C_100650_jv.func_108910_c(this.field_103219_u + 0.5D), C_100650_jv.func_108910_c(this.field_103217_v + 0.5D));
   }

   public C_100994_tv func_103328_bA() {
      return this.field_103857_bK.func_104808_g();
   }
}
