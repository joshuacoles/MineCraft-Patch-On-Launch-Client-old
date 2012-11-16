
public class C_101079_qv extends C_101091_qk {

   public C_101079_qv(C_100873_xe var1) {
      super(var1);
      this.func_103161_a(0.3125F, 0.3125F);
   }

   public C_101079_qv(C_100873_xe var1, C_100595_ln var2, double var3, double var5, double var7) {
      super(var1, var2, var3, var5, var7);
      this.func_103161_a(0.3125F, 0.3125F);
   }

   protected float func_104729_c() {
      return this.func_104741_d()?0.73F:super.func_104729_c();
   }

   public C_101079_qv(C_100873_xe var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.func_103161_a(0.3125F, 0.3125F);
   }

   public boolean func_103149_af() {
      return false;
   }

   public float func_103058_a(C_100857_wz var1, C_100451_alf var2, int var3, int var4, int var5) {
      float var6 = super.func_103058_a(var1, var2, var3, var4, var5);
      if(this.func_104741_d() && var2 != C_100451_alf.field_106077_C) {
         var6 = Math.min(0.8F, var6);
      }

      return var6;
   }

   protected void func_104728_a(C_100383_amu var1) {
      if(!this.field_103229_p.field_109557_J) {
         if(var1.field_107835_g != null) {
            if(this.field_104736_a != null) {
               if(var1.field_107835_g.func_103085_a(C_100698_ks.func_109218_a(this.field_104736_a), 8) && !var1.field_107835_g.func_103143_S()) {
                  this.field_104736_a.func_103392_i(5);
               }
            } else {
               var1.field_107835_g.func_103085_a(C_100698_ks.field_109239_m, 5);
            }

            if(var1.field_107835_g instanceof C_100595_ln) {
               byte var2 = 0;
               if(this.field_103229_p.field_109578_t > 1) {
                  if(this.field_103229_p.field_109578_t == 2) {
                     var2 = 10;
                  } else if(this.field_103229_p.field_109578_t == 3) {
                     var2 = 40;
                  }
               }

               if(var2 > 0) {
                  ((C_100595_ln)var1.field_107835_g).func_103389_d(new C_100692_kx(C_100690_kw.field_109179_v.field_109159_H, 20 * var2, 1));
               }
            }
         }

         this.field_103229_p.func_109405_a(this, this.field_103221_t, this.field_103219_u, this.field_103217_v, 1.0F, false, this.field_103229_p.func_109389_K().func_110281_b("mobGriefing"));
         this.func_103121_x();
      }

   }

   public boolean func_103123_L() {
      return false;
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      return false;
   }

   protected void func_103141_a() {
      this.field_103234_ag.func_108841_a(10, Byte.valueOf((byte)0));
   }

   public boolean func_104741_d() {
      return this.field_103234_ag.func_108842_a(10) == 1;
   }

   public void func_104742_e(boolean var1) {
      this.field_103234_ag.func_108851_b(10, Byte.valueOf((byte)(var1?1:0)));
   }
}
