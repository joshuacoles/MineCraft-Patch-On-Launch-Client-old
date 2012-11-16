import java.util.Comparator;

public class C_100497_ns implements Comparator {

   private C_100730_lb field_108251_b;
   // $FF: synthetic field
   final C_100499_nr field_108252_a;


   public C_100497_ns(C_100499_nr var1, C_100730_lb var2) {
      this.field_108252_a = var1;
      this.field_108251_b = var2;
   }

   public int func_108250_a(C_100730_lb var1, C_100730_lb var2) {
      double var3 = this.field_108251_b.func_103082_e(var1);
      double var5 = this.field_108251_b.func_103082_e(var2);
      return var3 < var5?-1:(var3 > var5?1:0);
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.func_108250_a((C_100730_lb)var1, (C_100730_lb)var2);
   }
}
