import java.util.Iterator;
import java.util.List;

public class C_100936_aww extends C_101278_asw {

   private String field_104085_a;
   private String field_104083_b;
   private Object[] field_104084_c;
   private List field_104082_d;


   public C_100936_aww(String var1, String var2, Object ... var3) {
      C_100361_be var4 = C_100361_be.func_107654_a();
      this.field_104085_a = var4.func_107651_b(var1);
      this.field_104083_b = var2;
      this.field_104084_c = var3;
   }

   protected void func_104032_a(char var1, int var2) {}

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      this.field_104050_h.clear();
      this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 120 + 12, var1.func_107651_b("gui.toMenu")));
      if(this.field_104084_c != null) {
         this.field_104082_d = this.field_104049_k.func_111793_c(var1.func_107649_a(this.field_104083_b, this.field_104084_c), this.field_104044_f - 50);
      } else {
         this.field_104082_d = this.field_104049_k.func_111793_c(var1.func_107651_b(this.field_104083_b), this.field_104044_f - 50);
      }

   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103908_f == 0) {
         this.field_104046_e.func_105053_a(new C_100098_bcz());
      }

   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      this.func_103879_a(this.field_104049_k, this.field_104085_a, this.field_104044_f / 2, this.field_104045_g / 2 - 50, 11184810);
      int var4 = this.field_104045_g / 2 - 30;

      for(Iterator var5 = this.field_104082_d.iterator(); var5.hasNext(); var4 += this.field_104049_k.field_111811_b) {
         String var6 = (String)var5.next();
         this.func_103879_a(this.field_104049_k, var6, this.field_104044_f / 2, var4, 16777215);
      }

      super.func_104027_a(var1, var2, var3);
   }
}
