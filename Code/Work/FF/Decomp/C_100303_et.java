import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class C_100303_et extends C_100219_dx {

   private byte[] field_106771_a = new byte[0];
   private byte[] field_106769_b = new byte[0];
   private SecretKey field_106770_c;


   public C_100303_et() {}

   public C_100303_et(SecretKey var1, PublicKey var2, byte[] var3) {
      this.field_106770_c = var1;
      this.field_106771_a = C_100672_jk.func_109094_a(var2, var1.getEncoded());
      this.field_106769_b = C_100672_jk.func_109094_a(var2, var3);
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106771_a = func_106549_b(var1);
      this.field_106769_b = func_106549_b(var1);
   }

   public void func_106544_a(DataOutputStream var1) {
      func_106546_a(var1, this.field_106771_a);
      func_106546_a(var1, this.field_106769_b);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106956_a(this);
   }

   public int func_106552_a() {
      return 2 + this.field_106771_a.length + 2 + this.field_106769_b.length;
   }

   public SecretKey func_106767_a(PrivateKey var1) {
      return var1 == null?this.field_106770_c:(this.field_106770_c = C_100672_jk.func_109087_a(var1, this.field_106771_a));
   }

   public SecretKey func_106768_d() {
      return this.func_106767_a((PrivateKey)null);
   }

   public byte[] func_106766_b(PrivateKey var1) {
      return var1 == null?this.field_106769_b:C_100672_jk.func_109089_b(var1, this.field_106769_b);
   }
}
