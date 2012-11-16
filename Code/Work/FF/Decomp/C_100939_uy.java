
public class C_100939_uy extends C_100992_tt {

   private int field_110976_a;
   private final C_100991_tu field_110975_b;


   public C_100939_uy(int var1, C_100991_tu var2) {
      super(var1);
      this.field_110975_b = var2;
      this.field_110888_cg = 1;
      this.func_110804_e(var2.func_111321_a());
      this.func_110802_a(C_101040_sq.field_111424_j);
      this.field_110976_a = 4 + var2.func_111323_c();
   }

   public int func_110974_g() {
      return this.field_110975_b.func_111323_c();
   }

   public float func_110783_a(C_100994_tv var1, C_100451_alf var2) {
      if(var2.field_106162_cm == C_100451_alf.field_106096_Z.field_106162_cm) {
         return 15.0F;
      } else {
         C_100664_afg var3 = var2.field_106204_cB;
         return var3 != C_100664_afg.field_109018_k && var3 != C_100664_afg.field_109015_l && var3 != C_100664_afg.field_109023_u && var3 != C_100664_afg.field_109017_j && var3 != C_100664_afg.field_108998_A?1.0F:1.5F;
      }
   }

   public boolean func_110779_a(C_100994_tv var1, C_100595_ln var2, C_100595_ln var3) {
      var1.func_111363_a(1, var3);
      return true;
   }

   public boolean func_110757_a(C_100994_tv var1, C_100873_xe var2, int var3, int var4, int var5, int var6, C_100595_ln var7) {
      if((double)C_100451_alf.field_106118_p[var3].func_106018_m(var2, var4, var5, var6) != 0.0D) {
         var1.func_111363_a(2, var7);
      }

      return true;
   }

   public int func_110756_a(C_100730_lb var1) {
      return this.field_110976_a;
   }

   public boolean func_110763_n_() {
      return true;
   }

   public C_100943_uw func_110777_d_(C_100994_tv var1) {
      return C_100943_uw.field_111097_d;
   }

   public int func_110769_a(C_100994_tv var1) {
      return 72000;
   }

   public C_100994_tv func_110775_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      var3.func_103784_a(var1, this.func_110769_a(var1));
      return var1;
   }

   public boolean func_110766_a(C_100451_alf var1) {
      return var1.field_106162_cm == C_100451_alf.field_106096_Z.field_106162_cm;
   }

   public int func_110768_c() {
      return this.field_110975_b.func_111319_e();
   }

   public String func_110973_h() {
      return this.field_110975_b.toString();
   }

   public boolean func_110790_a(C_100994_tv var1, C_100994_tv var2) {
      return this.field_110975_b.func_111318_f() == var2.field_111397_c?true:super.func_110790_a(var1, var2);
   }
}
