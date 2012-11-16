
public class C_100379_anc extends C_100377_anb {

   String field_107815_a;
   private static C_100375_ana[][] field_107814_b = new C_100375_ana[255][];


   public C_100379_anc(String var1) {
      if(!func_107812_a(var1)) {
         throw new IllegalArgumentException("string " + var1 + " not an OID");
      } else {
         this.field_107815_a = var1;
      }
   }

   public String func_107813_b() {
      return this.field_107815_a;
   }

   public int hashCode() {
      return this.field_107815_a.hashCode();
   }

   boolean func_107811_a(C_100377_anb var1) {
      return !(var1 instanceof C_100379_anc)?false:this.field_107815_a.equals(((C_100379_anc)var1).field_107815_a);
   }

   public String toString() {
      return this.func_107813_b();
   }

   private static boolean func_107812_a(String var0) {
      if(var0.length() >= 3 && var0.charAt(1) == 46) {
         char var1 = var0.charAt(0);
         if(var1 >= 48 && var1 <= 50) {
            boolean var2 = false;

            for(int var3 = var0.length() - 1; var3 >= 2; --var3) {
               char var4 = var0.charAt(var3);
               if(48 <= var4 && var4 <= 57) {
                  var2 = true;
               } else {
                  if(var4 != 46) {
                     return false;
                  }

                  if(!var2) {
                     return false;
                  }

                  var2 = false;
               }
            }

            return var2;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

}
