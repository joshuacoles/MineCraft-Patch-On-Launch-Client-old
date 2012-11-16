
public class C_101105_pv extends C_101110_ps {

   private int field_103756_d;


   public C_101105_pv(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/silverfish.png";
      this.func_103161_a(0.3F, 0.7F);
      this.field_103489_bI = 0.6F;
   }

   public int func_103378_aS() {
      return 8;
   }

   protected boolean func_103092_f_() {
      return false;
   }

   protected C_100730_lb func_103492_j() {
      double var1 = 8.0D;
      return this.field_103229_p.func_109455_b(this, var1);
   }

   protected String func_103354_aW() {
      return "mob.silverfish.say";
   }

   protected String func_103387_aX() {
      return "mob.silverfish.hit";
   }

   protected String func_103307_aY() {
      return "mob.silverfish.kill";
   }

   public boolean func_103085_a(C_100698_ks var1, int var2) {
      if(this.field_103756_d <= 0 && (var1 instanceof C_100700_kt || var1 == C_100698_ks.field_109239_m)) {
         this.field_103756_d = 20;
      }

      return super.func_103085_a(var1, var2);
   }

   protected void func_103500_a(C_100730_lb var1, float var2) {
      if(this.field_103425_aY <= 0 && var2 < 1.2F && var1.field_103173_D.field_107914_e > this.field_103173_D.field_107915_b && var1.field_103173_D.field_107915_b < this.field_103173_D.field_107914_e) {
         this.field_103425_aY = 20;
         var1.func_103085_a(C_100698_ks.func_109218_a(this), this.func_103643_c(var1));
      }

   }

   protected void func_103089_a(int var1, int var2, int var3, int var4) {
      this.field_103229_p.func_109412_a(this, "mob.silverfish.step", 0.15F, 1.0F);
   }

   protected int func_103377_aZ() {
      return 0;
   }

   public void func_103165_j_() {
      this.field_103469_aw = this.field_103236_z;
      super.func_103165_j_();
   }

   protected void func_103288_bk() {
      super.func_103288_bk();
      if(!this.field_103229_p.field_109557_J) {
         int var1;
         int var2;
         int var3;
         int var5;
         if(this.field_103756_d > 0) {
            --this.field_103756_d;
            if(this.field_103756_d == 0) {
               var1 = C_100650_jv.func_108910_c(this.field_103221_t);
               var2 = C_100650_jv.func_108910_c(this.field_103219_u);
               var3 = C_100650_jv.func_108910_c(this.field_103217_v);
               boolean var4 = false;

               for(var5 = 0; !var4 && var5 <= 5 && var5 >= -5; var5 = var5 <= 0?1 - var5:0 - var5) {
                  for(int var6 = 0; !var4 && var6 <= 10 && var6 >= -10; var6 = var6 <= 0?1 - var6:0 - var6) {
                     for(int var7 = 0; !var4 && var7 <= 10 && var7 >= -10; var7 = var7 <= 0?1 - var7:0 - var7) {
                        int var8 = this.field_103229_p.func_109349_a(var1 + var6, var2 + var5, var3 + var7);
                        if(var8 == C_100451_alf.field_106134_bo.field_106162_cm) {
                           this.field_103229_p.func_109448_f(2001, var1 + var6, var2 + var5, var3 + var7, C_100451_alf.field_106134_bo.field_106162_cm + (this.field_103229_p.func_109357_g(var1 + var6, var2 + var5, var3 + var7) << 12));
                           this.field_103229_p.func_109422_e(var1 + var6, var2 + var5, var3 + var7, 0);
                           C_100451_alf.field_106134_bo.func_106020_c(this.field_103229_p, var1 + var6, var2 + var5, var3 + var7, 0);
                           if(this.field_103232_aa.nextBoolean()) {
                              var4 = true;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

         if(this.field_103504_a_ == null && !this.func_103494_k()) {
            var1 = C_100650_jv.func_108910_c(this.field_103221_t);
            var2 = C_100650_jv.func_108910_c(this.field_103219_u + 0.5D);
            var3 = C_100650_jv.func_108910_c(this.field_103217_v);
            int var9 = this.field_103232_aa.nextInt(6);
            var5 = this.field_103229_p.func_109349_a(var1 + C_100012_j.field_105264_b[var9], var2 + C_100012_j.field_105265_c[var9], var3 + C_100012_j.field_105262_d[var9]);
            if(C_100466_aky.func_106452_e(var5)) {
               this.field_103229_p.func_109394_d(var1 + C_100012_j.field_105264_b[var9], var2 + C_100012_j.field_105265_c[var9], var3 + C_100012_j.field_105262_d[var9], C_100451_alf.field_106134_bo.field_106162_cm, C_100466_aky.func_106451_f(var5));
               this.func_103382_aQ();
               this.func_103121_x();
            } else {
               this.func_103496_i();
            }
         } else if(this.field_103504_a_ != null && !this.func_103494_k()) {
            this.field_103504_a_ = null;
         }

      }
   }

   public float func_103499_a(int var1, int var2, int var3) {
      return this.field_103229_p.func_109349_a(var1, var2 - 1, var3) == C_100451_alf.field_106111_w.field_106162_cm?10.0F:super.func_103499_a(var1, var2, var3);
   }

   protected boolean func_103644_i_() {
      return true;
   }

   public boolean func_103380_bp() {
      if(super.func_103380_bp()) {
         C_101095_qg var1 = this.field_103229_p.func_109503_a(this, 5.0D);
         return var1 == null;
      } else {
         return false;
      }
   }

   public int func_103643_c(C_100730_lb var1) {
      return 1;
   }

   public C_100601_lp func_103366_bz() {
      return C_100601_lp.field_108819_c;
   }
}
