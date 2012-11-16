
public class C_101058_ry extends C_101048_rz {

   private final C_100716_kl field_111476_a;
   private C_101095_qg field_111474_b;
   private int field_111475_c;


   public C_101058_ry(C_101095_qg var1, C_100716_kl var2, C_100716_kl var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.field_111474_b = var1;
      this.field_111476_a = var2;
   }

   public boolean func_111458_a(C_100994_tv var1) {
      return false;
   }

   public C_100994_tv func_111445_a(int var1) {
      if(this.func_111453_d()) {
         this.field_111475_c += Math.min(var1, this.func_111446_c().field_111398_a);
      }

      return super.func_111445_a(var1);
   }

   protected void func_111448_a(C_100994_tv var1, int var2) {
      this.field_111475_c += var2;
      this.func_111449_b(var1);
   }

   protected void func_111449_b(C_100994_tv var1) {
      var1.func_111366_a(this.field_111474_b.field_103229_p, this.field_111474_b, this.field_111475_c);
      this.field_111475_c = 0;
      if(var1.field_111397_c == C_100451_alf.field_106194_aB.field_106162_cm) {
         this.field_111474_b.func_103813_a(C_100822_iy.field_110070_h, 1);
      } else if(var1.field_111397_c == C_100992_tt.field_110849_t.field_110891_cf) {
         this.field_111474_b.func_103813_a(C_100822_iy.field_110071_i, 1);
      } else if(var1.field_111397_c == C_100451_alf.field_106197_aE.field_106162_cm) {
         this.field_111474_b.func_103813_a(C_100822_iy.field_110068_j, 1);
      } else if(var1.field_111397_c == C_100992_tt.field_110814_N.field_110891_cf) {
         this.field_111474_b.func_103813_a(C_100822_iy.field_110066_l, 1);
      } else if(var1.field_111397_c == C_100992_tt.field_110820_U.field_110891_cf) {
         this.field_111474_b.func_103813_a(C_100822_iy.field_110067_m, 1);
      } else if(var1.field_111397_c == C_100992_tt.field_110894_aZ.field_110891_cf) {
         this.field_111474_b.func_103813_a(C_100822_iy.field_110064_n, 1);
      } else if(var1.field_111397_c == C_100992_tt.field_110856_x.field_110891_cf) {
         this.field_111474_b.func_103813_a(C_100822_iy.field_110065_o, 1);
      } else if(var1.field_111397_c == C_100992_tt.field_110851_r.field_110891_cf) {
         this.field_111474_b.func_103813_a(C_100822_iy.field_110077_r, 1);
      } else if(var1.field_111397_c == C_100451_alf.field_106247_bH.field_106162_cm) {
         this.field_111474_b.func_103813_a(C_100822_iy.field_110051_D, 1);
      } else if(var1.field_111397_c == C_100451_alf.field_106214_aq.field_106162_cm) {
         this.field_111474_b.func_103813_a(C_100822_iy.field_110053_F, 1);
      }

   }

   public void func_111452_a(C_101095_qg var1, C_100994_tv var2) {
      this.func_111449_b(var2);

      for(int var3 = 0; var3 < this.field_111476_a.func_103003_k_(); ++var3) {
         C_100994_tv var4 = this.field_111476_a.func_103007_a(var3);
         if(var4 != null) {
            this.field_111476_a.func_103002_a(var3, 1);
            if(var4.func_111365_b().func_110776_s()) {
               C_100994_tv var5 = new C_100994_tv(var4.func_111365_b().func_110789_r());
               if(!var4.func_111365_b().func_110759_h(var4) || !this.field_111474_b.field_103857_bK.func_104809_a(var5)) {
                  if(this.field_111476_a.func_103007_a(var3) == null) {
                     this.field_111476_a.func_103006_a(var3, var5);
                  } else {
                     this.field_111474_b.func_103767_c(var5);
                  }
               }
            }
         }
      }

   }
}
