import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.TreeSet;

public final class C_100326_aod implements C_100314_aog {

   public String func_107376_a(C_101193_apr var1) {
      StringWriter var2 = new StringWriter();

      try {
         this.func_107377_a(var1, var2);
      } catch (IOException var4) {
         throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", var4);
      }

      return var2.toString();
   }

   public void func_107377_a(C_101193_apr var1, Writer var2) {
      this.func_107378_a(var1, var2);
   }

   private void func_107378_a(C_101168_aou var1, Writer var2) {
      boolean var3 = true;
      Iterator var4;
      switch(C_100328_aoe.field_107542_a[var1.func_107397_a().ordinal()]) {
      case 1:
         var2.append('[');
         var4 = var1.func_107395_b().iterator();

         while(var4.hasNext()) {
            C_101168_aou var6 = (C_101168_aou)var4.next();
            if(!var3) {
               var2.append(',');
            }

            var3 = false;
            this.func_107378_a(var6, var2);
         }

         var2.append(']');
         break;
      case 2:
         var2.append('{');
         var4 = (new TreeSet(var1.func_107399_d().keySet())).iterator();

         while(var4.hasNext()) {
            C_101194_aps var5 = (C_101194_aps)var4.next();
            if(!var3) {
               var2.append(',');
            }

            var3 = false;
            this.func_107378_a(var5, var2);
            var2.append(':');
            this.func_107378_a((C_101168_aou)var1.func_107399_d().get(var5), var2);
         }

         var2.append('}');
         break;
      case 3:
         var2.append('\"').append((new C_100312_aof(var1.func_107400_c())).toString()).append('\"');
         break;
      case 4:
         var2.append(var1.func_107400_c());
         break;
      case 5:
         var2.append("false");
         break;
      case 6:
         var2.append("true");
         break;
      case 7:
         var2.append("null");
         break;
      default:
         throw new RuntimeException("Coding failure in Argo:  Attempt to format a JsonNode of unknown type [" + var1.func_107397_a() + "];");
      }

   }
}
