
public class C_100976_um extends C_100992_tt {

   public C_100976_um(int var1) {
      super(var1);
      this.func_110753_d(1);
      this.func_110804_e(238);
      this.func_110802_a(C_101040_sq.field_111427_i);
   }

   public boolean func_110757_a(C_100994_tv var1, C_100873_xe var2, int var3, int var4, int var5, int var6, C_100595_ln var7) {
      if(var3 != C_100451_alf.field_106080_N.field_106162_cm && var3 != C_100451_alf.field_106096_Z.field_106162_cm && var3 != C_100451_alf.field_106244_aa.field_106162_cm && var3 != C_100451_alf.field_106128_bx.field_106162_cm && var3 != C_100451_alf.field_106217_bX.field_106162_cm) {
         return super.func_110757_a(var1, var2, var3, var4, var5, var6, var7);
      } else {
         var1.func_111363_a(1, var7);
         return true;
      }
   }

   public boolean func_110766_a(C_100451_alf var1) {
      return var1.field_106162_cm == C_100451_alf.field_106096_Z.field_106162_cm || var1.field_106162_cm == C_100451_alf.field_106203_ay.field_106162_cm || var1.field_106162_cm == C_100451_alf.field_106217_bX.field_106162_cm;
   }

   public float func_110783_a(C_100994_tv var1, C_100451_alf var2) {
      return var2.field_106162_cm != C_100451_alf.field_106096_Z.field_106162_cm && var2.field_106162_cm != C_100451_alf.field_106080_N.field_106162_cm?(var2.field_106162_cm == C_100451_alf.field_106252_ae.field_106162_cm?5.0F:super.func_110783_a(var1, var2)):15.0F;
   }
}
