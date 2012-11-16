
public class C_100903_wc extends C_100904_wf {

   private static final String[] field_110650_A = new String[]{"all", "undead", "arthropods"};
   private static final int[] field_110651_B = new int[]{1, 5, 5};
   private static final int[] field_110653_C = new int[]{11, 8, 8};
   private static final int[] field_110649_D = new int[]{20, 20, 20};
   public final int field_110652_a;


   public C_100903_wc(int var1, int var2, int var3) {
      super(var1, var2, C_100877_wg.field_110569_g);
      this.field_110652_a = var3;
   }

   public int func_110612_a(int var1) {
      return field_110651_B[this.field_110652_a] + (var1 - 1) * field_110653_C[this.field_110652_a];
   }

   public int func_110608_b(int var1) {
      return this.func_110612_a(var1) + field_110649_D[this.field_110652_a];
   }

   public int func_110617_b() {
      return 5;
   }

   public int func_110613_a(int var1, C_100595_ln var2) {
      return this.field_110652_a == 0?var1 * 3:(this.field_110652_a == 1 && var2.func_103366_bz() == C_100601_lp.field_108818_b?var1 * 4:(this.field_110652_a == 2 && var2.func_103366_bz() == C_100601_lp.field_108819_c?var1 * 4:0));
   }

   public String func_110610_a() {
      return "enchantment.damage." + field_110650_A[this.field_110652_a];
   }

   public boolean func_110615_a(C_100904_wf var1) {
      return !(var1 instanceof C_100903_wc);
   }

}
