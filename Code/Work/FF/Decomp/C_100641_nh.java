
public class C_100641_nh extends C_100621_mm {

   private final C_100595_ln field_108213_a;
   private final C_101104_pu field_108211_b;
   private C_100595_ln field_108212_c;
   private int field_108209_d = 0;
   private float field_108210_e;
   private int field_108207_f = 0;
   private int field_108208_g;
   private float field_108214_h;


   public C_100641_nh(C_101104_pu var1, float var2, int var3, float var4) {
      if(!(var1 instanceof C_100595_ln)) {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      } else {
         this.field_108211_b = var1;
         this.field_108213_a = (C_100595_ln)var1;
         this.field_108210_e = var2;
         this.field_108208_g = var3;
         this.field_108214_h = var4 * var4;
         this.func_108030_a(3);
      }
   }

   public boolean func_108033_a() {
      C_100595_ln var1 = this.field_108213_a.func_103335_aF();
      if(var1 == null) {
         return false;
      } else {
         this.field_108212_c = var1;
         return true;
      }
   }

   public boolean func_108036_b() {
      return this.func_108033_a() || !this.field_108213_a.func_103383_ay().func_108300_f();
   }

   public void func_108029_d() {
      this.field_108212_c = null;
      this.field_108207_f = 0;
   }

   public void func_108031_e() {
      double var1 = this.field_108213_a.func_103146_e(this.field_108212_c.field_103221_t, this.field_108212_c.field_103173_D.field_107915_b, this.field_108212_c.field_103217_v);
      boolean var3 = this.field_108213_a.func_103292_az().func_108280_a(this.field_108212_c);
      if(var3) {
         ++this.field_108207_f;
      } else {
         this.field_108207_f = 0;
      }

      if(var1 <= (double)this.field_108214_h && this.field_108207_f >= 20) {
         this.field_108213_a.func_103383_ay().func_108299_g();
      } else {
         this.field_108213_a.func_103383_ay().func_108295_a(this.field_108212_c, this.field_108210_e);
      }

      this.field_108213_a.func_103289_av().func_108861_a(this.field_108212_c, 30.0F, 30.0F);
      this.field_108209_d = Math.max(this.field_108209_d - 1, 0);
      if(this.field_108209_d <= 0) {
         if(var1 <= (double)this.field_108214_h && var3) {
            this.field_108211_b.func_103677_d(this.field_108212_c);
            this.field_108209_d = this.field_108208_g;
         }
      }
   }
}
