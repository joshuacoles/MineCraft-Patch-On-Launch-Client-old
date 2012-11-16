
public class C_100592_pj extends C_101110_ps {

   private float field_103740_d = 0.5F;
   private int field_103741_e;
   private int field_103739_f;


   public C_100592_pj(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/fire.png";
      this.field_103239_af = true;
      this.field_103421_bc = 10;
   }

   public int func_103378_aS() {
      return 20;
   }

   protected void func_103141_a() {
      super.func_103141_a();
      this.field_103234_ag.func_108841_a(16, new Byte((byte)0));
   }

   protected String func_103354_aW() {
      return "mob.blaze.breathe";
   }

   protected String func_103387_aX() {
      return "mob.blaze.hit";
   }

   protected String func_103307_aY() {
      return "mob.blaze.death";
   }

   public int func_103125_b(float var1) {
      return 15728880;
   }

   public float func_103057_c(float var1) {
      return 1.0F;
   }

   public void func_103313_c() {
      if(!this.field_103229_p.field_109557_J) {
         if(this.func_103073_G()) {
            this.func_103085_a(C_100698_ks.field_109232_e, 1);
         }

         --this.field_103741_e;
         if(this.field_103741_e <= 0) {
            this.field_103741_e = 100;
            this.field_103740_d = 0.5F + (float)this.field_103232_aa.nextGaussian() * 3.0F;
         }

         if(this.func_103498_l() != null && this.func_103498_l().field_103219_u + (double)this.func_103498_l().func_103102_e() > this.field_103219_u + (double)this.func_103102_e() + (double)this.field_103740_d) {
            this.field_103240_x += (0.30000001192092896D - this.field_103240_x) * 0.30000001192092896D;
         }
      }

      if(this.field_103232_aa.nextInt(24) == 0) {
         this.field_103229_p.func_109476_a(this.field_103221_t + 0.5D, this.field_103219_u + 0.5D, this.field_103217_v + 0.5D, "fire.fire", 1.0F + this.field_103232_aa.nextFloat(), this.field_103232_aa.nextFloat() * 0.7F + 0.3F);
      }

      if(!this.field_103174_E && this.field_103240_x < 0.0D) {
         this.field_103240_x *= 0.6D;
      }

      for(int var1 = 0; var1 < 2; ++var1) {
         this.field_103229_p.func_109428_a("largesmoke", this.field_103221_t + (this.field_103232_aa.nextDouble() - 0.5D) * (double)this.field_103182_N, this.field_103219_u + this.field_103232_aa.nextDouble() * (double)this.field_103183_O, this.field_103217_v + (this.field_103232_aa.nextDouble() - 0.5D) * (double)this.field_103182_N, 0.0D, 0.0D, 0.0D);
      }

      super.func_103313_c();
   }

   protected void func_103500_a(C_100730_lb var1, float var2) {
      if(this.field_103425_aY <= 0 && var2 < 2.0F && var1.field_103173_D.field_107914_e > this.field_103173_D.field_107915_b && var1.field_103173_D.field_107915_b < this.field_103173_D.field_107914_e) {
         this.field_103425_aY = 20;
         this.func_103303_l(var1);
      } else if(var2 < 30.0F) {
         double var3 = var1.field_103221_t - this.field_103221_t;
         double var5 = var1.field_103173_D.field_107915_b + (double)(var1.field_103183_O / 2.0F) - (this.field_103219_u + (double)(this.field_103183_O / 2.0F));
         double var7 = var1.field_103217_v - this.field_103217_v;
         if(this.field_103425_aY == 0) {
            ++this.field_103739_f;
            if(this.field_103739_f == 1) {
               this.field_103425_aY = 60;
               this.func_103737_f(true);
            } else if(this.field_103739_f <= 4) {
               this.field_103425_aY = 6;
            } else {
               this.field_103425_aY = 100;
               this.field_103739_f = 0;
               this.func_103737_f(false);
            }

            if(this.field_103739_f > 1) {
               float var9 = C_100650_jv.func_108913_c(var2) * 0.5F;
               this.field_103229_p.func_109492_a((C_101095_qg)null, 1009, (int)this.field_103221_t, (int)this.field_103219_u, (int)this.field_103217_v, 0);

               for(int var10 = 0; var10 < 1; ++var10) {
                  C_101087_qo var11 = new C_101087_qo(this.field_103229_p, this, var3 + this.field_103232_aa.nextGaussian() * (double)var9, var5, var7 + this.field_103232_aa.nextGaussian() * (double)var9);
                  var11.field_103219_u = this.field_103219_u + (double)(this.field_103183_O / 2.0F) + 0.5D;
                  this.field_103229_p.func_109513_d(var11);
               }
            }
         }

         this.field_103236_z = (float)(Math.atan2(var7, var3) * 180.0D / 3.1415927410125732D) - 90.0F;
         this.field_103502_b = true;
      }

   }

   protected void func_103124_a(float var1) {}

   protected int func_103377_aZ() {
      return C_100992_tt.field_110869_bo.field_110891_cf;
   }

   public boolean func_103149_af() {
      return this.func_103738_m();
   }

   protected void func_103323_a(boolean var1, int var2) {
      if(var1) {
         int var3 = this.field_103232_aa.nextInt(2 + var2);

         for(int var4 = 0; var4 < var3; ++var4) {
            this.func_103111_b(C_100992_tt.field_110869_bo.field_110891_cf, 1);
         }
      }

   }

   public boolean func_103738_m() {
      return (this.field_103234_ag.func_108842_a(16) & 1) != 0;
   }

   public void func_103737_f(boolean var1) {
      byte var2 = this.field_103234_ag.func_108842_a(16);
      if(var1) {
         var2 = (byte)(var2 | 1);
      } else {
         var2 &= -2;
      }

      this.field_103234_ag.func_108851_b(16, Byte.valueOf(var2));
   }

   protected boolean func_103644_i_() {
      return true;
   }

   public int func_103643_c(C_100730_lb var1) {
      return 6;
   }
}
