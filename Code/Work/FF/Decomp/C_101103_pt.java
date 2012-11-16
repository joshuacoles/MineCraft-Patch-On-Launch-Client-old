import java.util.Iterator;
import java.util.List;

public class C_101103_pt extends C_101097_qa {

   private int field_103751_d = 0;
   private int field_103752_e = 0;


   public C_101103_pt(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/pigzombie.png";
      this.field_103489_bI = 0.5F;
      this.field_103239_af = true;
   }

   protected boolean func_103321_bb() {
      return false;
   }

   public void func_103165_j_() {
      this.field_103489_bI = this.field_103504_a_ != null?0.95F:0.5F;
      if(this.field_103752_e > 0 && --this.field_103752_e == 0) {
         this.field_103229_p.func_109412_a(this, "mob.zombiepig.zpigangry", this.func_103384_aV() * 2.0F, ((this.field_103232_aa.nextFloat() - this.field_103232_aa.nextFloat()) * 0.2F + 1.0F) * 1.8F);
      }

      super.func_103165_j_();
   }

   public String func_103129_O() {
      return "/mob/pigzombie.png";
   }

   public boolean func_103380_bp() {
      return this.field_103229_p.field_109578_t > 0 && this.field_103229_p.func_109410_b(this.field_103173_D) && this.field_103229_p.func_109508_a(this, this.field_103173_D).isEmpty() && !this.field_103229_p.func_109413_d(this.field_103173_D);
   }

   public void func_103078_b(C_100353_bh var1) {
      super.func_103078_b(var1);
      var1.func_107532_a("Anger", (short)this.field_103751_d);
   }

   public void func_103110_a(C_100353_bh var1) {
      super.func_103110_a(var1);
      this.field_103751_d = var1.func_107517_d("Anger");
   }

   protected C_100730_lb func_103492_j() {
      return this.field_103751_d == 0?null:super.func_103492_j();
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      C_100730_lb var3 = var1.func_109210_g();
      if(var3 instanceof C_101095_qg) {
         List var4 = this.field_103229_p.func_109449_b(this, this.field_103173_D.func_107895_b(32.0D, 32.0D, 32.0D));
         Iterator var5 = var4.iterator();

         while(var5.hasNext()) {
            C_100730_lb var6 = (C_100730_lb)var5.next();
            if(var6 instanceof C_101103_pt) {
               C_101103_pt var7 = (C_101103_pt)var6;
               var7.func_103750_o(var3);
            }
         }

         this.func_103750_o(var3);
      }

      return super.func_103085_a(var1, var2);
   }

   private void func_103750_o(C_100730_lb var1) {
      this.field_103504_a_ = var1;
      this.field_103751_d = 400 + this.field_103232_aa.nextInt(400);
      this.field_103752_e = this.field_103232_aa.nextInt(40);
   }

   protected String func_103354_aW() {
      return "mob.zombiepig.zpig";
   }

   protected String func_103387_aX() {
      return "mob.zombiepig.zpighurt";
   }

   protected String func_103307_aY() {
      return "mob.zombiepig.zpigdeath";
   }

   protected void func_103323_a(boolean var1, int var2) {
      int var3 = this.field_103232_aa.nextInt(2 + var2);

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         this.func_103111_b(C_100992_tt.field_110875_bm.field_110891_cf, 1);
      }

      var3 = this.field_103232_aa.nextInt(2 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         this.func_103111_b(C_100992_tt.field_110871_bq.field_110891_cf, 1);
      }

   }

   public boolean func_103134_c(C_101095_qg var1) {
      return false;
   }

   protected void func_103287_l(int var1) {
      this.func_103111_b(C_100992_tt.field_110853_p.field_110891_cf, 1);
   }

   protected int func_103377_aZ() {
      return C_100992_tt.field_110875_bm.field_110891_cf;
   }

   protected void func_103339_bB() {
      this.func_103060_b(0, new C_100994_tv(C_100992_tt.field_110808_G));
   }

   public void func_103337_bD() {
      super.func_103337_bD();
      this.func_103744_g(false);
   }

   public int func_103643_c(C_100730_lb var1) {
      C_100994_tv var2 = this.func_103328_bA();
      int var3 = 5;
      if(var2 != null) {
         var3 += var2.func_111350_a(this);
      }

      return var3;
   }
}
