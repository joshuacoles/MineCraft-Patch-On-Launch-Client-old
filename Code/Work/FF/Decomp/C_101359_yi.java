import java.util.Random;

public class C_101359_yi extends C_101324_xz {

   public C_101359_yi(int var1) {
      super(var1);
      this.field_112483_K.add(new C_101316_ya(C_100546_ot.class, 5, 4, 4));
      this.field_112481_I.field_112581_z = 10;
      this.field_112481_I.field_112552_B = 2;
   }

   public C_100562_aan func_112447_a(Random var1) {
      return (C_100562_aan)(var1.nextInt(5) == 0?this.field_112485_Q:(var1.nextInt(10) == 0?this.field_112486_P:this.field_112479_O));
   }
}
