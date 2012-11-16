import java.util.Random;

public class C_101340_ys extends C_101324_xz {

   public C_101340_ys(int var1) {
      super(var1);
      this.field_112483_K.add(new C_101316_ya(C_100546_ot.class, 8, 4, 4));
      this.field_112481_I.field_112581_z = 10;
      this.field_112481_I.field_112552_B = 1;
   }

   public C_100562_aan func_112447_a(Random var1) {
      return (C_100562_aan)(var1.nextInt(3) == 0?new C_100492_aba():new C_100504_abg(false));
   }
}
