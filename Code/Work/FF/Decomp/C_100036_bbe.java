import org.lwjgl.opengl.GL11;

public class C_100036_bbe extends C_100056_bal {

   public C_100036_bbe(C_101231_avl var1, C_101231_avl var2, float var3) {
      super(var1, var3);
      this.func_105363_a(var2);
   }

   protected float func_105381_a(C_100546_ot var1, float var2) {
      return var1.func_103563_u();
   }

   protected int func_105382_a(C_100546_ot var1, int var2, float var3) {
      float var4;
      if(var2 == 0 && var1.func_103567_t()) {
         var4 = var1.func_103057_c(var3) * var1.func_103564_j(var3);
         this.func_105351_a(var1.func_103129_O());
         GL11.glColor3f(var4, var4, var4);
         return 1;
      } else if(var2 == 1 && var1.func_103552_m()) {
         this.func_105351_a("/mob/wolf_collar.png");
         var4 = 1.0F;
         int var5 = var1.func_103573_bH();
         GL11.glColor3f(var4 * C_100555_oo.field_103548_d[var5][0], var4 * C_100555_oo.field_103548_d[var5][1], var4 * C_100555_oo.field_103548_d[var5][2]);
         return 1;
      } else {
         return -1;
      }
   }

   // $FF: synthetic method
   protected float func_105374_b(C_100595_ln var1, float var2) {
      return this.func_105381_a((C_100546_ot)var1, var2);
   }
}
