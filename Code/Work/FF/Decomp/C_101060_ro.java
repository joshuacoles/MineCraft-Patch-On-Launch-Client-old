
class C_101060_ro extends C_101048_rz {

   // $FF: synthetic field
   final int field_111478_a;
   // $FF: synthetic field
   final C_101061_rn field_111477_b;


   C_101060_ro(C_101061_rn var1, C_100716_kl var2, int var3, int var4, int var5, int var6) {
      super(var2, var3, var4, var5);
      this.field_111477_b = var1;
      this.field_111478_a = var6;
   }

   public int func_111455_a() {
      return 1;
   }

   public boolean func_111458_a(C_100994_tv var1) {
      return var1 == null?false:(var1.func_111365_b() instanceof C_101042_sc?((C_101042_sc)var1.func_111365_b()).field_111054_a == this.field_111478_a:(var1.func_111365_b().field_110891_cf != C_100451_alf.field_106148_bd.field_106162_cm && var1.func_111365_b().field_110891_cf != C_100992_tt.field_110951_bQ.field_110891_cf?false:this.field_111478_a == 0));
   }

   public int func_111450_b() {
      return 15 + this.field_111478_a * 16;
   }
}
