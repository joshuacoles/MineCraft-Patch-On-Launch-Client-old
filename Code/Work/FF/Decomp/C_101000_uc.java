
public class C_101000_uc extends C_101017_td {

   private static C_100451_alf[] field_111036_c = new C_100451_alf[]{C_100451_alf.field_106119_z, C_100451_alf.field_106236_am, C_100451_alf.field_106238_an, C_100451_alf.field_106111_w, C_100451_alf.field_106087_T, C_100451_alf.field_106212_ar, C_100451_alf.field_106085_K, C_100451_alf.field_106226_al, C_100451_alf.field_106078_L, C_100451_alf.field_106224_ak, C_100451_alf.field_106084_J, C_100451_alf.field_106201_az, C_100451_alf.field_106193_aA, C_100451_alf.field_106184_aW, C_100451_alf.field_106149_be, C_100451_alf.field_106090_Q, C_100451_alf.field_106093_R, C_100451_alf.field_106178_aQ, C_100451_alf.field_106177_aR, C_100451_alf.field_106186_aJ, C_100451_alf.field_106095_X, C_100451_alf.field_106088_W};


   protected C_101000_uc(int var1, C_100991_tu var2) {
      super(var1, 2, var2, field_111036_c);
   }

   public boolean func_110766_a(C_100451_alf var1) {
      return var1 == C_100451_alf.field_106210_as?this.field_111031_b.func_111320_d() == 3:(var1 != C_100451_alf.field_106193_aA && var1 != C_100451_alf.field_106201_az?(var1 == C_100451_alf.field_106207_bU?this.field_111031_b.func_111320_d() >= 2:(var1 != C_100451_alf.field_106224_ak && var1 != C_100451_alf.field_106084_J?(var1 != C_100451_alf.field_106226_al && var1 != C_100451_alf.field_106085_K?(var1 != C_100451_alf.field_106093_R && var1 != C_100451_alf.field_106090_Q?(var1 != C_100451_alf.field_106178_aQ && var1 != C_100451_alf.field_106177_aR?(var1.field_106204_cB == C_100664_afg.field_109009_e?true:(var1.field_106204_cB == C_100664_afg.field_109006_f?true:var1.field_106204_cB == C_100664_afg.field_109007_g)):this.field_111031_b.func_111320_d() >= 2):this.field_111031_b.func_111320_d() >= 1):this.field_111031_b.func_111320_d() >= 1):this.field_111031_b.func_111320_d() >= 2)):this.field_111031_b.func_111320_d() >= 2);
   }

   public float func_110783_a(C_100994_tv var1, C_100451_alf var2) {
      return var2 != null && (var2.field_106204_cB == C_100664_afg.field_109006_f || var2.field_106204_cB == C_100664_afg.field_109007_g || var2.field_106204_cB == C_100664_afg.field_109009_e)?this.field_111034_a:super.func_110783_a(var1, var2);
   }

}
