import java.util.ArrayList;
import java.util.List;

public class C_100533_abw extends C_100766_adw {

   private List field_108361_e = new ArrayList();


   public C_100533_abw() {
      this.field_108361_e.add(new C_101316_ya(C_100592_pj.class, 10, 2, 3));
      this.field_108361_e.add(new C_101316_ya(C_101103_pt.class, 5, 4, 4));
      this.field_108361_e.add(new C_101316_ya(C_101106_pw.class, 10, 4, 4));
      this.field_108361_e.add(new C_101316_ya(C_101109_pr.class, 3, 4, 4));
   }

   public List func_108360_a() {
      return this.field_108361_e;
   }

   protected boolean func_108354_a(int var1, int var2) {
      int var3 = var1 >> 4;
      int var4 = var2 >> 4;
      this.field_108344_b.setSeed((long)(var3 ^ var4 << 4) ^ this.field_108345_c.func_109374_D());
      this.field_108344_b.nextInt();
      return this.field_108344_b.nextInt(3) != 0?false:(var1 != (var3 << 4) + 4 + this.field_108344_b.nextInt(8)?false:var2 == (var4 << 4) + 4 + this.field_108344_b.nextInt(8));
   }

   protected C_100771_adz func_108357_b(int var1, int var2) {
      return new C_100532_abx(this.field_108345_c, this.field_108344_b, var1, var2);
   }
}
