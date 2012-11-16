
public class C_100540_oi extends C_100544_oh {

   public boolean field_103535_d = false;
   public float field_103536_e = 0.0F;
   public float field_103533_f = 0.0F;
   public float field_103534_g;
   public float field_103538_h;
   public float field_103539_i = 1.0F;
   public int field_103537_j;


   public C_100540_oi(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/chicken.png";
      this.func_103161_a(0.3F, 0.7F);
      this.field_103537_j = this.field_103232_aa.nextInt(6000) + 6000;
      float var2 = 0.25F;
      this.field_103408_bn.func_108888_a(0, new C_100619_mj(this));
      this.field_103408_bn.func_108888_a(1, new C_100637_nd(this, 0.38F));
      this.field_103408_bn.func_108888_a(2, new C_100614_me(this, var2));
      this.field_103408_bn.func_108888_a(3, new C_100507_nn(this, 0.25F, C_100992_tt.field_110826_S.field_110891_cf, false));
      this.field_103408_bn.func_108888_a(4, new C_100617_ml(this, 0.28F));
      this.field_103408_bn.func_108888_a(5, new C_100640_ng(this, var2));
      this.field_103408_bn.func_108888_a(6, new C_100624_mr(this, C_101095_qg.class, 6.0F));
      this.field_103408_bn.func_108888_a(7, new C_100639_nf(this));
   }

   public boolean func_103321_bb() {
      return true;
   }

   public int func_103378_aS() {
      return 4;
   }

   public void func_103313_c() {
      super.func_103313_c();
      this.field_103538_h = this.field_103536_e;
      this.field_103534_g = this.field_103533_f;
      this.field_103533_f = (float)((double)this.field_103533_f + (double)(this.field_103174_E?-1:4) * 0.3D);
      if(this.field_103533_f < 0.0F) {
         this.field_103533_f = 0.0F;
      }

      if(this.field_103533_f > 1.0F) {
         this.field_103533_f = 1.0F;
      }

      if(!this.field_103174_E && this.field_103539_i < 1.0F) {
         this.field_103539_i = 1.0F;
      }

      this.field_103539_i = (float)((double)this.field_103539_i * 0.9D);
      if(!this.field_103174_E && this.field_103240_x < 0.0D) {
         this.field_103240_x *= 0.6D;
      }

      this.field_103536_e += this.field_103539_i * 2.0F;
      if(!this.func_103357_h_() && !this.field_103229_p.field_109557_J && --this.field_103537_j <= 0) {
         this.field_103229_p.func_109412_a(this, "mob.chicken.plop", 1.0F, (this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F + 1.0F);
         this.func_103111_b(C_100992_tt.field_110912_aP.field_110891_cf, 1);
         this.field_103537_j = this.field_103232_aa.nextInt(6000) + 6000;
      }

   }

   protected void func_103124_a(float var1) {}

   protected String func_103354_aW() {
      return "mob.chicken.say";
   }

   protected String func_103387_aX() {
      return "mob.chicken.hurt";
   }

   protected String func_103307_aY() {
      return "mob.chicken.hurt";
   }

   protected void func_103089_a(int var1, int var2, int var3, int var4) {
      this.field_103229_p.func_109412_a(this, "mob.chicken.step", 0.15F, 1.0F);
   }

   protected int func_103377_aZ() {
      return C_100992_tt.field_110812_L.field_110891_cf;
   }

   protected void func_103323_a(boolean var1, int var2) {
      int var3 = this.field_103232_aa.nextInt(3) + this.field_103232_aa.nextInt(1 + var2);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.func_103111_b(C_100992_tt.field_110812_L.field_110891_cf, 1);
      }

      if(this.func_103149_af()) {
         this.func_103111_b(C_100992_tt.field_110874_bl.field_110891_cf, 1);
      } else {
         this.func_103111_b(C_100992_tt.field_110873_bk.field_110891_cf, 1);
      }

   }

   public C_100544_oh func_103521_a(C_100544_oh var1) {
      return new C_100540_oi(this.field_103229_p);
   }

   public boolean func_103524_c(C_100994_tv var1) {
      return var1 != null && var1.func_111365_b() instanceof C_100959_ul;
   }
}
