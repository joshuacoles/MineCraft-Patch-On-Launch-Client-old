import java.util.Comparator;

public class C_100120_gd implements Comparator {

   private final C_100013_k field_106479_a;


   public C_100120_gd(C_100013_k var1) {
      this.field_106479_a = var1;
   }

   public int func_106478_a(C_100762_ih var1, C_100762_ih var2) {
      double var3 = var1.func_103146_e((double)this.field_106479_a.field_105273_a, (double)this.field_106479_a.field_105271_b, (double)this.field_106479_a.field_105272_c);
      double var5 = var2.func_103146_e((double)this.field_106479_a.field_105273_a, (double)this.field_106479_a.field_105271_b, (double)this.field_106479_a.field_105272_c);
      return var3 < var5?-1:(var3 > var5?1:0);
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.func_106478_a((C_100762_ih)var1, (C_100762_ih)var2);
   }
}
