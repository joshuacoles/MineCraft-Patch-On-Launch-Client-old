
public enum C_100877_wg {

   field_110574_a("all", 0),
   field_110572_b("armor", 1),
   field_110573_c("armor_feet", 2),
   field_110570_d("armor_legs", 3),
   field_110571_e("armor_torso", 4),
   field_110568_f("armor_head", 5),
   field_110569_g("weapon", 6),
   field_110576_h("digger", 7),
   field_110577_i("bow", 8);
   // $FF: synthetic field
   private static final C_100877_wg[] field_110575_j = new C_100877_wg[]{field_110574_a, field_110572_b, field_110573_c, field_110570_d, field_110571_e, field_110568_f, field_110569_g, field_110576_h, field_110577_i};


   public static C_100877_wg[] func_110567_values() {
      return (C_100877_wg[])field_110575_j.clone();
   }

   private C_100877_wg(String var1, int var2) {}

   public boolean func_110566_a(C_100992_tt var1) {
      if(this == field_110574_a) {
         return true;
      } else if(var1 instanceof C_101042_sc) {
         if(this == field_110572_b) {
            return true;
         } else {
            C_101042_sc var2 = (C_101042_sc)var1;
            return var2.field_111054_a == 0?this == field_110568_f:(var2.field_111054_a == 2?this == field_110570_d:(var2.field_111054_a == 1?this == field_110571_e:(var2.field_111054_a == 3?this == field_110573_c:false)));
         }
      } else {
         return var1 instanceof C_100939_uy?this == field_110569_g:(var1 instanceof C_101017_td?this == field_110576_h:(var1 instanceof C_101047_si?this == field_110577_i:false));
      }
   }

}
