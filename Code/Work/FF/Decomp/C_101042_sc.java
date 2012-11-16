
public class C_101042_sc extends C_100992_tt {

   private static final int[] field_111052_ck = new int[]{11, 16, 15, 13};
   public final int field_111054_a;
   public final int field_111050_b;
   public final int field_111051_c;
   private final C_101041_sd field_111053_cl;


   public C_101042_sc(int var1, C_101041_sd var2, int var3, int var4) {
      super(var1);
      this.field_111053_cl = var2;
      this.field_111054_a = var4;
      this.field_111051_c = var3;
      this.field_111050_b = var2.func_111431_b(var4);
      this.func_110804_e(var2.func_111433_a(var4));
      this.field_110888_cg = 1;
      this.func_110802_a(C_101040_sq.field_111424_j);
   }

   public int func_110774_a(C_100994_tv var1, int var2) {
      if(var2 > 0) {
         return 16777215;
      } else {
         int var3 = this.func_111049_b(var1);
         if(var3 < 0) {
            var3 = 16777215;
         }

         return var3;
      }
   }

   public boolean func_110758_b() {
      return this.field_111053_cl == C_101041_sd.field_111442_a;
   }

   public int func_110768_c() {
      return this.field_111053_cl.func_111432_a();
   }

   public C_101041_sd func_111046_d() {
      return this.field_111053_cl;
   }

   public boolean func_111045_b_(C_100994_tv var1) {
      return this.field_111053_cl != C_101041_sd.field_111442_a?false:(!var1.func_111339_o()?false:(!var1.func_111352_p().func_107516_b("display")?false:var1.func_111352_p().func_107521_l("display").func_107516_b("color")));
   }

   public int func_111049_b(C_100994_tv var1) {
      if(this.field_111053_cl != C_101041_sd.field_111442_a) {
         return -1;
      } else {
         C_100353_bh var2 = var1.func_111352_p();
         if(var2 == null) {
            return 10511680;
         } else {
            C_100353_bh var3 = var2.func_107521_l("display");
            return var3 == null?10511680:(var3.func_107516_b("color")?var3.func_107514_e("color"):10511680);
         }
      }
   }

   public int func_110751_a(int var1, int var2) {
      return var2 == 1?this.field_110889_ch + 144:super.func_110751_a(var1, var2);
   }

   public void func_111047_c(C_100994_tv var1) {
      if(this.field_111053_cl == C_101041_sd.field_111442_a) {
         C_100353_bh var2 = var1.func_111352_p();
         if(var2 != null) {
            C_100353_bh var3 = var2.func_107521_l("display");
            if(var3.func_107516_b("color")) {
               var3.func_107528_o("color");
            }

         }
      }
   }

   public void func_111048_b(C_100994_tv var1, int var2) {
      if(this.field_111053_cl != C_101041_sd.field_111442_a) {
         throw new UnsupportedOperationException("Can\'t dye non-leather!");
      } else {
         C_100353_bh var3 = var1.func_111352_p();
         if(var3 == null) {
            var3 = new C_100353_bh();
            var1.func_111349_d(var3);
         }

         C_100353_bh var4 = var3.func_107521_l("display");
         if(!var3.func_107516_b("display")) {
            var3.func_107538_a("display", var4);
         }

         var4.func_107520_a("color", var2);
      }
   }

   public boolean func_110790_a(C_100994_tv var1, C_100994_tv var2) {
      return this.field_111053_cl.func_111434_b() == var2.field_111397_c?true:super.func_110790_a(var1, var2);
   }

   // $FF: synthetic method
   static int[] func_111044_e() {
      return field_111052_ck;
   }

}
