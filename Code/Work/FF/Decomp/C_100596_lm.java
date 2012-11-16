
public class C_100596_lm extends C_100597_ll {

   private float field_104586_e = 1.0F;


   public C_100596_lm(C_100873_xe var1) {
      super(var1);
   }

   public C_100596_lm(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
      this.func_104571_a(var5);
   }

   protected void func_103141_a() {
      this.func_103087_v().func_108853_a(2, 5);
      this.func_103087_v().func_108841_a(3, Byte.valueOf((byte)0));
   }

   public int func_104572_d() {
      return 9;
   }

   public int func_104574_g() {
      return 9;
   }

   public boolean func_103167_a(double var1) {
      double var3 = 16.0D;
      var3 *= 64.0D * this.field_103209_l;
      return var1 < var3 * var3;
   }

   public void func_104575_h() {
      this.func_103140_a(new C_100994_tv(C_100992_tt.field_110967_bI), 0.0F);
      if(this.func_104582_i() != null && this.field_103232_aa.nextFloat() < this.field_104586_e) {
         this.func_104582_i().func_111355_a((C_100596_lm)null);
         this.func_103140_a(this.func_104582_i(), 0.0F);
      }

   }

   public C_100994_tv func_104582_i() {
      return this.func_103087_v().func_108840_f(2);
   }

   public void func_104584_a(C_100994_tv var1) {
      var1 = var1.func_111360_l();
      var1.field_111398_a = 1;
      var1.func_111355_a(this);
      this.func_103087_v().func_108851_b(2, var1);
      this.func_103087_v().func_108852_h(2);
   }

   public int func_104583_j() {
      return this.func_103087_v().func_108842_a(3);
   }

   public void func_104585_g(int var1) {
      this.func_103087_v().func_108851_b(3, Byte.valueOf((byte)(var1 % 4)));
   }

   public void func_103078_b(C_100353_bh var1) {
      if(this.func_104582_i() != null) {
         var1.func_107538_a("Item", this.func_104582_i().func_111344_b(new C_100353_bh()));
         var1.func_107527_a("ItemRotation", (byte)this.func_104583_j());
         var1.func_107529_a("ItemDropChance", this.field_104586_e);
      }

      super.func_103078_b(var1);
   }

   public void func_103110_a(C_100353_bh var1) {
      C_100353_bh var2 = var1.func_107521_l("Item");
      if(var2 != null && !var2.func_107537_d()) {
         this.func_104584_a(C_100994_tv.func_111376_a(var2));
         this.func_104585_g(var1.func_107524_c("ItemRotation"));
         if(var1.func_107516_b("ItemDropChance")) {
            this.field_104586_e = var1.func_107512_g("ItemDropChance");
         }
      }

      super.func_103110_a(var1);
   }

   public boolean func_103134_c(C_101095_qg var1) {
      if(this.func_104582_i() == null) {
         C_100994_tv var2 = var1.func_103328_bA();
         if(var2 != null && !this.field_103229_p.field_109557_J) {
            this.func_104584_a(var2);
            if(!var1.field_103869_cf.field_111597_d && --var2.field_111398_a <= 0) {
               var1.field_103857_bK.func_103006_a(var1.field_103857_bK.field_104831_c, (C_100994_tv)null);
            }
         }
      } else if(!this.field_103229_p.field_109557_J) {
         this.func_104585_g(this.func_104583_j() + 1);
      }

      return true;
   }
}
