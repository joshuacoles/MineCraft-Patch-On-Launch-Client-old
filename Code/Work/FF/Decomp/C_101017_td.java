
public class C_101017_td extends C_100992_tt {

   private C_100451_alf[] field_111032_c;
   protected float field_111034_a = 4.0F;
   private int field_111033_ck;
   protected C_100991_tu field_111031_b;


   protected C_101017_td(int var1, int var2, C_100991_tu var3, C_100451_alf[] var4) {
      super(var1);
      this.field_111031_b = var3;
      this.field_111032_c = var4;
      this.field_110888_cg = 1;
      this.func_110804_e(var3.func_111321_a());
      this.field_111034_a = var3.func_111322_b();
      this.field_111033_ck = var2 + var3.func_111323_c();
      this.func_110802_a(C_101040_sq.field_111427_i);
   }

   public float func_110783_a(C_100994_tv var1, C_100451_alf var2) {
      C_100451_alf[] var3 = this.field_111032_c;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         C_100451_alf var6 = var3[var5];
         if(var6 == var2) {
            return this.field_111034_a;
         }
      }

      return 1.0F;
   }

   public boolean func_110779_a(C_100994_tv var1, C_100595_ln var2, C_100595_ln var3) {
      var1.func_111363_a(2, var3);
      return true;
   }

   public boolean func_110757_a(C_100994_tv var1, C_100873_xe var2, int var3, int var4, int var5, int var6, C_100595_ln var7) {
      if((double)C_100451_alf.field_106118_p[var3].func_106018_m(var2, var4, var5, var6) != 0.0D) {
         var1.func_111363_a(1, var7);
      }

      return true;
   }

   public int func_110756_a(C_100730_lb var1) {
      return this.field_111033_ck;
   }

   public boolean func_110763_n_() {
      return true;
   }

   public int func_110768_c() {
      return this.field_111031_b.func_111319_e();
   }

   public String func_111030_g() {
      return this.field_111031_b.toString();
   }

   public boolean func_110790_a(C_100994_tv var1, C_100994_tv var2) {
      return this.field_111031_b.func_111318_f() == var2.field_111397_c?true:super.func_110790_a(var1, var2);
   }
}
