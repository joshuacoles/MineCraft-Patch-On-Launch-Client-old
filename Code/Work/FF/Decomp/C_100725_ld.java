
public enum C_100725_ld {

   field_109305_a("SIZE_1", 0),
   field_109303_b("SIZE_2", 1),
   field_109304_c("SIZE_3", 2),
   field_109301_d("SIZE_4", 3),
   field_109302_e("SIZE_5", 4),
   field_109299_f("SIZE_6", 5);
   // $FF: synthetic field
   private static final C_100725_ld[] field_109300_g = new C_100725_ld[]{field_109305_a, field_109303_b, field_109304_c, field_109301_d, field_109302_e, field_109299_f};


   public static C_100725_ld[] func_109297_values() {
      return (C_100725_ld[])field_109300_g.clone();
   }

   private C_100725_ld(String var1, int var2) {}

   public int func_109298_a(double var1) {
      double var3 = var1 - ((double)C_100650_jv.func_108910_c(var1) + 0.5D);
      switch(C_100729_lc.field_109323_a[this.ordinal()]) {
      case 1:
         if(var3 < 0.0D) {
            if(var3 < -0.3125D) {
               return C_100650_jv.func_108934_f(var1 * 32.0D);
            }
         } else if(var3 < 0.3125D) {
            return C_100650_jv.func_108934_f(var1 * 32.0D);
         }

         return C_100650_jv.func_108910_c(var1 * 32.0D);
      case 2:
         if(var3 < 0.0D) {
            if(var3 < -0.3125D) {
               return C_100650_jv.func_108910_c(var1 * 32.0D);
            }
         } else if(var3 < 0.3125D) {
            return C_100650_jv.func_108910_c(var1 * 32.0D);
         }

         return C_100650_jv.func_108934_f(var1 * 32.0D);
      case 3:
         if(var3 > 0.0D) {
            return C_100650_jv.func_108910_c(var1 * 32.0D);
         }

         return C_100650_jv.func_108934_f(var1 * 32.0D);
      case 4:
         if(var3 < 0.0D) {
            if(var3 < -0.1875D) {
               return C_100650_jv.func_108934_f(var1 * 32.0D);
            }
         } else if(var3 < 0.1875D) {
            return C_100650_jv.func_108934_f(var1 * 32.0D);
         }

         return C_100650_jv.func_108910_c(var1 * 32.0D);
      case 5:
         if(var3 < 0.0D) {
            if(var3 < -0.1875D) {
               return C_100650_jv.func_108910_c(var1 * 32.0D);
            }
         } else if(var3 < 0.1875D) {
            return C_100650_jv.func_108910_c(var1 * 32.0D);
         }

         return C_100650_jv.func_108934_f(var1 * 32.0D);
      case 6:
      default:
         if(var3 > 0.0D) {
            return C_100650_jv.func_108934_f(var1 * 32.0D);
         } else {
            return C_100650_jv.func_108910_c(var1 * 32.0D);
         }
      }
   }

}
