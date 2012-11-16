import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class C_100317_aom implements C_101173_aov {

   private final List field_107391_a = new LinkedList();


   public C_100317_aom func_107390_a(C_101173_aov var1) {
      this.field_107391_a.add(var1);
      return this;
   }

   public C_101193_apr func_107389_a() {
      LinkedList var1 = new LinkedList();
      Iterator var2 = this.field_107391_a.iterator();

      while(var2.hasNext()) {
         C_101173_aov var3 = (C_101173_aov)var2.next();
         var1.add(var3.func_107381_b());
      }

      return C_101180_apd.func_111910_a(var1);
   }

   // $FF: synthetic method
   public C_101168_aou func_107381_b() {
      return this.func_107389_a();
   }
}
