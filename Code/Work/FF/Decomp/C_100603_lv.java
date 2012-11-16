
public abstract class C_100603_lv extends C_100544_oh {

   protected C_100644_nk field_103559_d = new C_100644_nk(this);


   public C_100603_lv(C_100873_xe var1) {
      super(var1);
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, Byte.valueOf((byte)0));
      this.field_103234_ag.func_108841_a(17, "");
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      if(this.func_103556_o() == null) {
         var1.func_107533_a("Owner", "");
      } else {
         var1.func_107533_a("Owner", this.func_103556_o());
      }

      var1.func_107509_a("Sitting", this.func_103553_n());
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      String var2 = var1.func_107534_i("Owner");
      if(var2.length() > 0) {
         this.func_103555_a(var2);
         this.func_103551_g(true);
      }

      this.field_103559_d.func_108218_a(var1.func_107519_n("Sitting"));
      this.func_103557_h(var1.func_107519_n("Sitting"));
   }

   protected void func_103550_f(boolean var1) {
      String var2 = "heart";
      if(!var1) {
         var2 = "smoke";
      }

      for(int var3 = 0; var3 < 7; ++var3) {
         double var4 = this.field_103232_aa.nextGaussian() * 0.02D;
         double var6 = this.field_103232_aa.nextGaussian() * 0.02D;
         double var8 = this.field_103232_aa.nextGaussian() * 0.02D;
         this.field_103229_p.func_109428_a(var2, this.field_103221_t + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N, this.field_103219_u + 0.5D + (double)(this.field_103232_aa.nextFloat() * this.field_103183_O), this.field_103217_v + (double)(this.field_103232_aa.nextFloat() * this.field_103182_N * 2.0F) - (double)this.field_103182_N, var4, var6, var8);
      }

   }

   public void func_103159_a(byte var1) {
      if(var1 == 7) {
         this.func_103550_f(true);
      } else if(var1 == 6) {
         this.func_103550_f(false);
      } else {
         super.func_103159_a(var1);
      }

   }

   public boolean func_103552_m() {
      return (this.field_103234_ag.func_108842_a(16) & 4) != 0;
   }

   public void func_103551_g(boolean var1) {
      byte var2 = this.field_103234_ag.func_108842_a(16);
      if(var1) {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 | 4)));
      } else {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 & -5)));
      }

   }

   public boolean func_103553_n() {
      return (this.field_103234_ag.func_108842_a(16) & 1) != 0;
   }

   public void func_103557_h(boolean var1) {
      byte var2 = this.field_103234_ag.func_108842_a(16);
      if(var1) {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 | 1)));
      } else {
         this.field_103234_ag.func_108851_b(16, Byte.valueOf((byte)(var2 & -2)));
      }

   }

   public String func_103556_o() {
      return this.field_103234_ag.func_108839_e(17);
   }

   public void func_103555_a(String var1) {
      this.field_103234_ag.func_108851_b(17, var1);
   }

   public C_100595_ln func_103554_p() {
      return this.field_103229_p.func_109507_a(this.func_103556_o());
   }

   public C_100644_nk func_103558_q() {
      return this.field_103559_d;
   }
}
