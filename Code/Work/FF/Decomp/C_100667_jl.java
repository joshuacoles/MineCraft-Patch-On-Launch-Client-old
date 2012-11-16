import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class C_100667_jl {

   private String field_109061_a;


   public C_100667_jl(String var1) {
      this.field_109061_a = var1;
   }

   public String func_109060_a(String var1) {
      try {
         String var2 = this.field_109061_a + var1;
         MessageDigest var3 = MessageDigest.getInstance("MD5");
         var3.update(var2.getBytes(), 0, var2.length());
         return (new BigInteger(1, var3.digest())).toString(16);
      } catch (NoSuchAlgorithmException var4) {
         throw new RuntimeException(var4);
      }
   }
}
