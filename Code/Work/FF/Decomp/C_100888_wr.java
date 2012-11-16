
public class C_100888_wr extends C_100904_wf {

   private static final String[] field_110645_A = new String[]{"all", "fire", "fall", "explosion", "projectile"};
   private static final int[] field_110646_B = new int[]{1, 10, 5, 5, 3};
   private static final int[] field_110648_C = new int[]{11, 8, 6, 8, 6};
   private static final int[] field_110644_D = new int[]{20, 12, 10, 12, 15};
   public final int field_110647_a;


   public C_100888_wr(int var1, int var2, int var3) {
      super(var1, var2, C_100877_wg.field_110572_b);
      this.field_110647_a = var3;
      if(var3 == 2) {
         this.field_110642_y = C_100877_wg.field_110573_c;
      }

   }

   public int func_110612_a(int var1) {
      return field_110646_B[this.field_110647_a] + (var1 - 1) * field_110648_C[this.field_110647_a];
   }

   public int func_110608_b(int var1) {
      return this.func_110612_a(var1) + field_110644_D[this.field_110647_a];
   }

   public int func_110617_b() {
      return 4;
   }

   public int func_110616_a(int var1, C_100698_ks var2) {
      if(var2.func_109220_e()) {
         return 0;
      } else {
         int var3 = (6 + var1 * var1) / 2;
         return this.field_110647_a == 0?var3:(this.field_110647_a == 1 && var2.func_109209_k()?var3:(this.field_110647_a == 2 && var2 == C_100698_ks.field_109242_h?var3 * 2:((this.field_110647_a != 3 || var2 != C_100698_ks.field_109241_k) && var2 != C_100698_ks.field_109238_l?(this.field_110647_a == 4 && var2.func_109215_a()?var3:0):var3)));
      }
   }

   public String func_110610_a() {
      return "enchantment.protect." + field_110645_A[this.field_110647_a];
   }

   public boolean func_110615_a(C_100904_wf var1) {
      if(var1 instanceof C_100888_wr) {
         C_100888_wr var2 = (C_100888_wr)var1;
         return var2.field_110647_a == this.field_110647_a?false:this.field_110647_a == 2 || var2.field_110647_a == 2;
      } else {
         return super.func_110615_a(var1);
      }
   }

}
