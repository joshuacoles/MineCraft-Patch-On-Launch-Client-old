
public class C_100539_ol extends C_100541_oj {

   public C_100539_ol(C_100873_xe var1) {
      super(var1);
      this.field_103448_aF = "/mob/redcow.png";
      this.func_103161_a(0.9F, 1.3F);
   }

   public boolean func_103134_c(C_101095_qg var1) {
      C_100994_tv var2 = var1.field_103857_bK.func_104808_g();
      if(var2 != null && var2.field_111397_c == C_100992_tt.field_110806_E.field_110891_cf && this.func_103520_b() >= 0) {
         if(var2.field_111398_a == 1) {
            var1.field_103857_bK.func_103006_a(var1.field_103857_bK.field_104831_c, new C_100994_tv(C_100992_tt.field_110807_F));
            return true;
         }

         if(var1.field_103857_bK.func_104809_a(new C_100994_tv(C_100992_tt.field_110807_F)) && !var1.field_103869_cf.field_111597_d) {
            var1.field_103857_bK.func_103002_a(var1.field_103857_bK.field_104831_c, 1);
            return true;
         }
      }

      if(var2 != null && var2.field_111397_c == C_100992_tt.field_110883_be.field_110891_cf && this.func_103520_b() >= 0) {
         this.func_103121_x();
         this.field_103229_p.func_109428_a("largeexplode", this.field_103221_t, this.field_103219_u + (double)(this.field_103183_O / 2.0F), this.field_103217_v, 0.0D, 0.0D, 0.0D);
         if(!this.field_103229_p.field_109557_J) {
            C_100541_oj var3 = new C_100541_oj(this.field_103229_p);
            var3.func_103055_b(this.field_103221_t, this.field_103219_u, this.field_103217_v, this.field_103236_z, this.field_103177_A);
            var3.func_103298_j(this.func_103330_aT());
            var3.field_103469_aw = this.field_103469_aw;
            this.field_103229_p.func_109513_d(var3);

            for(int var4 = 0; var4 < 5; ++var4) {
               this.field_103229_p.func_109513_d(new C_100576_pg(this.field_103229_p, this.field_103221_t, this.field_103219_u + (double)this.field_103183_O, this.field_103217_v, new C_100994_tv(C_100451_alf.field_106230_aj)));
            }
         }

         return true;
      } else {
         return super.func_103134_c(var1);
      }
   }

   public C_100544_oh func_103521_a(C_100544_oh var1) {
      return new C_100539_ol(this.field_103229_p);
   }
}
