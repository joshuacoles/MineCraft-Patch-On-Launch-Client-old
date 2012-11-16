import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public final class C_100319_aoj {

   public C_101193_apr func_107393_a(Reader var1) {
      C_101163_aop var2 = new C_101163_aop();
      (new C_101200_apy()).func_111949_a(var1, var2);
      return var2.func_111858_a();
   }

   public C_101193_apr func_107394_a(String var1) {
      try {
         C_101193_apr var2 = this.func_107393_a(new StringReader(var1));
         return var2;
      } catch (IOException var4) {
         throw new RuntimeException("Coding failure in Argo:  StringWriter gave an IOException", var4);
      }
   }
}
