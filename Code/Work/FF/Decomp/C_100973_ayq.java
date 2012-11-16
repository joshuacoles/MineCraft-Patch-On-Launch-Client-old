import java.util.Comparator;

public class C_100973_ayq implements Comparator {

   private C_100595_ln field_111175_a;


   public C_100973_ayq(C_100595_ln var1) {
      this.field_111175_a = var1;
   }

   public int func_111174_a(C_100975_ayp var1, C_100975_ayp var2) {
      if(var1.field_111199_l && !var2.field_111199_l) {
         return 1;
      } else if(var2.field_111199_l && !var1.field_111199_l) {
         return -1;
      } else {
         double var3 = (double)var1.func_111179_a(this.field_111175_a);
         double var5 = (double)var2.func_111179_a(this.field_111175_a);
         return var3 < var5?1:(var3 > var5?-1:(var1.field_111209_s < var2.field_111209_s?1:-1));
      }
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.func_111174_a((C_100975_ayp)var1, (C_100975_ayp)var2);
   }
}
