import java.util.Iterator;
import java.util.List;

public class C_101102_pz extends C_101110_ps implements C_101104_pu {

   private static final int[] field_103690_d = new int[]{C_100992_tt.field_110899_aT.field_110891_cf, C_100992_tt.field_110895_aY.field_110891_cf, C_100992_tt.field_110915_aC.field_110891_cf, C_100992_tt.field_110866_bu.field_110891_cf, C_100992_tt.field_110867_bt.field_110891_cf, C_100992_tt.field_110813_M.field_110891_cf, C_100992_tt.field_110805_D.field_110891_cf, C_100992_tt.field_110805_D.field_110891_cf};
   private int field_103691_e = 0;


   public C_101102_pz(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/villager/witch.png";
      this.field_103489_bI = 0.25F;
      this.field_103408_bn.func_108888_a(1, new C_100619_mj(this));
      this.field_103408_bn.func_108888_a(2, new C_100641_nh(this, this.field_103489_bI, 60, 10.0F));
      this.field_103408_bn.func_108888_a(2, new C_100640_ng(this, this.field_103489_bI));
      this.field_103408_bn.func_108888_a(3, new C_100624_mr(this, C_101095_qg.class, 8.0F));
      this.field_103408_bn.func_108888_a(3, new C_100639_nf(this));
      this.field_103409_bo.func_108888_a(1, new C_100501_nq(this, false));
      this.field_103409_bo.func_108888_a(2, new C_100499_nr(this, C_101095_qg.class, 16.0F, 0, true));
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.func_103087_v().func_108841_a(21, Byte.valueOf((byte)0));
   }

   protected String func_103354_aW() {
      return "mob.witch.idle";
   }

   protected String func_103387_aX() {
      return "mob.witch.hurt";
   }

   protected String func_103307_aY() {
      return "mob.witch.death";
   }

   public void func_103688_f(boolean var1) {
      this.func_103087_v().func_108851_b(21, Byte.valueOf((byte)(var1?1:0)));
   }

   public boolean func_103689_m() {
      return this.func_103087_v().func_108842_a(21) == 1;
   }

   public int func_103378_aS() {
      return 26;
   }

   public boolean func_103321_bb() {
      return true;
   }

   public void func_103313_c() {
      if(!this.field_103229_p.field_109557_J) {
         if(this.func_103689_m()) {
            if(this.field_103691_e-- <= 0) {
               this.func_103688_f(false);
               C_100994_tv var1 = this.func_103328_bA();
               this.func_103060_b(0, (C_100994_tv)null);
               if(var1 != null && var1.field_111397_c == C_100992_tt.field_110864_bs.field_110891_cf) {
                  List var2 = C_100992_tt.field_110864_bs.func_110993_l(var1);
                  if(var2 != null) {
                     Iterator var3 = var2.iterator();

                     while(var3.hasNext()) {
                        C_100692_kx var4 = (C_100692_kx)var3.next();
                        this.func_103389_d(new C_100692_kx(var4));
                     }
                  }
               }
            }
         } else {
            short var5 = -1;
            if(this.field_103232_aa.nextFloat() < 0.15F && this.func_103149_af() && !this.func_103300_a(C_100690_kw.field_109170_n)) {
               var5 = 16307;
            } else if(this.field_103232_aa.nextFloat() < 0.05F && this.field_103428_aQ < this.func_103378_aS()) {
               var5 = 16341;
            } else if(this.field_103232_aa.nextFloat() < 0.25F && this.func_103335_aF() != null && !this.func_103300_a(C_100690_kw.field_109168_c) && this.func_103335_aF().func_103082_e(this) > 121.0D) {
               var5 = 16274;
            } else if(this.field_103232_aa.nextFloat() < 0.25F && this.func_103335_aF() != null && !this.func_103300_a(C_100690_kw.field_109168_c) && this.func_103335_aF().func_103082_e(this) > 121.0D) {
               var5 = 16274;
            }

            if(var5 > -1) {
               this.func_103060_b(0, new C_100994_tv(C_100992_tt.field_110864_bs, 1, var5));
               this.field_103691_e = this.func_103328_bA().func_111391_m();
               this.func_103688_f(true);
            }
         }

         if(this.field_103232_aa.nextFloat() < 7.5E-4F) {
            this.field_103229_p.func_109464_a(this, (byte)15);
         }
      }

      super.func_103313_c();
   }

   public void func_103159_a(byte var1) {
      if(var1 == 15) {
         for(int var2 = 0; var2 < this.field_103232_aa.nextInt(35) + 10; ++var2) {
            this.field_103229_p.func_109428_a("witchMagic", this.field_103221_t + this.field_103232_aa.nextGaussian() * 0.12999999523162842D, this.field_103173_D.field_107914_e + 0.5D + this.field_103232_aa.nextGaussian() * 0.12999999523162842D, this.field_103217_v + this.field_103232_aa.nextGaussian() * 0.12999999523162842D, 0.0D, 0.0D, 0.0D);
         }
      } else {
         super.func_103159_a(var1);
      }

   }

   protected int func_103351_c(C_100698_ks var1, int var2) {
      var2 = super.func_103351_c(var1, var2);
      if(var1.func_109210_g() == this) {
         var2 = 0;
      }

      if(var1.func_109211_o()) {
         var2 = (int)((double)var2 * 0.15D);
      }

      return var2;
   }

   public float func_103353_by() {
      float var1 = super.func_103353_by();
      if(this.func_103689_m()) {
         var1 *= 0.75F;
      }

      return var1;
   }

   protected void func_103323_a(boolean var1, int var2) {
      int var3 = this.field_103232_aa.nextInt(3) + 1;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.field_103232_aa.nextInt(3);
         int var6 = field_103690_d[this.field_103232_aa.nextInt(field_103690_d.length)];
         if(var2 > 0) {
            var5 += this.field_103232_aa.nextInt(var2 + 1);
         }

         for(int var7 = 0; var7 < var5; ++var7) {
            this.func_103111_b(var6, 1);
         }
      }

   }

   public void func_103677_d(C_100595_ln var1) {
      if(!this.func_103689_m()) {
         C_101078_qu var2 = new C_101078_qu(this.field_103229_p, this, 32732);
         var2.field_103177_A -= -20.0F;
         double var3 = var1.field_103221_t + var1.field_103215_w - this.field_103221_t;
         double var5 = var1.field_103219_u + (double)var1.func_103102_e() - 1.100000023841858D - this.field_103219_u;
         double var7 = var1.field_103217_v + var1.field_103238_y - this.field_103217_v;
         float var9 = C_100650_jv.func_108915_a(var3 * var3 + var7 * var7);
         if(var9 >= 8.0F && !var1.func_103300_a(C_100690_kw.field_109165_d)) {
            var2.func_104697_a(32698);
         } else if(var1.func_103330_aT() >= 8 && !var1.func_103300_a(C_100690_kw.field_109180_u)) {
            var2.func_104697_a(32660);
         } else if(var9 <= 3.0F && !var1.func_103300_a(C_100690_kw.field_109181_t) && this.field_103232_aa.nextFloat() < 0.25F) {
            var2.func_104697_a(32696);
         }

         var2.func_104664_c(var3, var5 + (double)(var9 * 0.2F), var7, 0.75F, 8.0F);
         this.field_103229_p.func_109513_d(var2);
      }
   }

}
