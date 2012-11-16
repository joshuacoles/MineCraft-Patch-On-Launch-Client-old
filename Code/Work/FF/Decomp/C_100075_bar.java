import org.lwjgl.opengl.GL11;

public class C_100075_bar extends C_100056_bal {

   public C_100075_bar(C_101231_avl var1, C_101231_avl var2, float var3) {
      super(var1, var3);
      this.func_105363_a(var2);
   }

   protected int func_105449_a(C_100555_oo var1, int var2, float var3) {
      if(var2 == 0 && !var1.func_103543_n()) {
         this.func_105351_a("/mob/sheep_fur.png");
         float var4 = 1.0F;
         int var5 = var1.func_103546_m();
         GL11.glColor3f(var4 * C_100555_oo.field_103548_d[var5][0], var4 * C_100555_oo.field_103548_d[var5][1], var4 * C_100555_oo.field_103548_d[var5][2]);
         return 1;
      } else {
         return -1;
      }
   }
}
