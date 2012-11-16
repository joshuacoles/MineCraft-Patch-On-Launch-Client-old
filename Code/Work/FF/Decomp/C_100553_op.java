
public class C_100553_op extends C_100538_ok implements C_101104_pu {

   public C_100553_op(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/snowman.png";
      this.func_103161_a(0.4F, 1.8F);
      this.func_103383_ay().func_108291_a(true);
      this.field_103408_bn.func_108888_a(1, new C_100641_nh(this, 0.25F, 20, 10.0F));
      this.field_103408_bn.func_108888_a(2, new C_100640_ng(this, 0.2F));
      this.field_103408_bn.func_108888_a(3, new C_100624_mr(this, C_101095_qg.class, 6.0F));
      this.field_103408_bn.func_108888_a(4, new C_100639_nf(this));
      this.field_103409_bo.func_108888_a(1, new C_100499_nr(this, C_100595_ln.class, 16.0F, 0, true, false, C_100587_pn.field_103618_a));
   }

   public boolean func_103321_bb() {
      return true;
   }

   public int func_103378_aS() {
      return 4;
   }

   public void func_103313_c() {
      super.func_103313_c();
      if(this.func_103073_G()) {
         this.func_103085_a(C_100698_ks.field_109232_e, 1);
      }

      int var1 = C_100650_jv.func_108910_c(this.field_103221_t);
      int var2 = C_100650_jv.func_108910_c(this.field_103217_v);
      if(this.field_103229_p.func_109362_a(var1, var2).func_112465_j() > 1.0F) {
         this.func_103085_a(C_100698_ks.field_109233_b, 1);
      }

      for(var1 = 0; var1 < 4; ++var1) {
         var2 = C_100650_jv.func_108910_c(this.field_103221_t + (double)((float)(var1 % 2 * 2 - 1) * 0.25F));
         int var3 = C_100650_jv.func_108910_c(this.field_103219_u);
         int var4 = C_100650_jv.func_108910_c(this.field_103217_v + (double)((float)(var1 / 2 % 2 * 2 - 1) * 0.25F));
         if(this.field_103229_p.func_109349_a(var2, var3, var4) == 0 && this.field_103229_p.func_109362_a(var2, var4).func_112465_j() < 0.8F && C_100451_alf.field_106181_aV.func_106023_b(this.field_103229_p, var2, var3, var4)) {
            this.field_103229_p.func_109422_e(var2, var3, var4, C_100451_alf.field_106181_aV.field_106162_cm);
         }
      }

   }

   protected int func_103377_aZ() {
      return C_100992_tt.field_110916_aD.field_110891_cf;
   }

   protected void func_103323_a(boolean var1, int var2) {
      int var3 = this.field_103232_aa.nextInt(16);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.func_103111_b(C_100992_tt.field_110916_aD.field_110891_cf, 1);
      }

   }

   public void func_103677_d(C_100595_ln var1) {
      C_101086_qp var2 = new C_101086_qp(this.field_103229_p, this);
      double var3 = var1.field_103221_t - this.field_103221_t;
      double var5 = var1.field_103219_u + (double)var1.func_103102_e() - 1.100000023841858D - var2.field_103219_u;
      double var7 = var1.field_103217_v - this.field_103217_v;
      float var9 = C_100650_jv.func_108915_a(var3 * var3 + var7 * var7) * 0.2F;
      var2.func_104664_c(var3, var5 + (double)var9, var7, 1.6F, 12.0F);
      this.field_103229_p.func_109412_a(this, "random.bow", 1.0F, 1.0F / (this.func_103312_aA().nextFloat() * 0.4F + 0.8F));
      this.field_103229_p.func_109513_d(var2);
   }
}
