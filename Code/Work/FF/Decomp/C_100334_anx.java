import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

public class C_100334_anx extends BasicPermission {

   private final String field_107561_a;
   private final int field_107560_b;


   public C_100334_anx(String var1) {
      super(var1);
      this.field_107561_a = "all";
      this.field_107560_b = 15;
   }

   public C_100334_anx(String var1, String var2) {
      super(var1, var2);
      this.field_107561_a = var2;
      this.field_107560_b = this.func_107559_a(var2);
   }

   private int func_107559_a(String var1) {
      StringTokenizer var2 = new StringTokenizer(C_100332_aoc.func_107558_a(var1), " ,");
      int var3 = 0;

      while(var2.hasMoreTokens()) {
         String var4 = var2.nextToken();
         if(var4.equals("threadlocalecimplicitlyca")) {
            var3 |= 1;
         } else if(var4.equals("ecimplicitlyca")) {
            var3 |= 2;
         } else if(var4.equals("threadlocaldhdefaultparams")) {
            var3 |= 4;
         } else if(var4.equals("dhdefaultparams")) {
            var3 |= 8;
         } else if(var4.equals("all")) {
            var3 |= 15;
         }
      }

      if(var3 == 0) {
         throw new IllegalArgumentException("unknown permissions passed to mask");
      } else {
         return var3;
      }
   }

   public String getActions() {
      return this.field_107561_a;
   }

   public boolean implies(Permission var1) {
      if(!(var1 instanceof C_100334_anx)) {
         return false;
      } else if(!this.getName().equals(var1.getName())) {
         return false;
      } else {
         C_100334_anx var2 = (C_100334_anx)var1;
         return (this.field_107560_b & var2.field_107560_b) == var2.field_107560_b;
      }
   }

   public boolean equals(Object var1) {
      if(var1 == this) {
         return true;
      } else if(!(var1 instanceof C_100334_anx)) {
         return false;
      } else {
         C_100334_anx var2 = (C_100334_anx)var1;
         return this.field_107560_b == var2.field_107560_b && this.getName().equals(var2.getName());
      }
   }

   public int hashCode() {
      return this.getName().hashCode() + this.field_107560_b;
   }
}
