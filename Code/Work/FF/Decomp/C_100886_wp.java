
public class C_100886_wp extends C_100904_wf {

   protected C_100886_wp(int var1, int var2, C_100877_wg var3) {
      super(var1, var2, var3);
      this.func_110611_b("lootBonus");
      if(var3 == C_100877_wg.field_110576_h) {
         this.func_110611_b("lootBonusDigger");
      }

   }

   public int func_110612_a(int var1) {
      return 15 + (var1 - 1) * 9;
   }

   public int func_110608_b(int var1) {
      return super.func_110612_a(var1) + 50;
   }

   public int func_110617_b() {
      return 3;
   }

   public boolean func_110615_a(C_100904_wf var1) {
      return super.func_110615_a(var1) && var1.field_110643_x != field_110639_q.field_110643_x;
   }
}
