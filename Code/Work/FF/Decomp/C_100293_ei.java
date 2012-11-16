import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.security.PublicKey;

public class C_100293_ei extends C_100219_dx {

   private String field_106751_a;
   private PublicKey field_106749_b;
   private byte[] field_106750_c = new byte[0];


   public C_100293_ei() {}

   public C_100293_ei(String var1, PublicKey var2, byte[] var3) {
      this.field_106751_a = var1;
      this.field_106749_b = var2;
      this.field_106750_c = var3;
   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106751_a = func_106551_a(var1, 20);
      this.field_106749_b = C_100672_jk.func_109096_a(func_106549_b(var1));
      this.field_106750_c = func_106549_b(var1);
   }

   public void func_106544_a(DataOutputStream var1) {
      func_106543_a(this.field_106751_a, var1);
      func_106546_a(var1, this.field_106749_b.getEncoded());
      func_106546_a(var1, this.field_106750_c);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106975_a(this);
   }

   public int func_106552_a() {
      return 2 + this.field_106751_a.length() * 2 + 2 + this.field_106749_b.getEncoded().length + 2 + this.field_106750_c.length;
   }

   public String func_106747_d() {
      return this.field_106751_a;
   }

   public PublicKey func_106746_f() {
      return this.field_106749_b;
   }

   public byte[] func_106748_g() {
      return this.field_106750_c;
   }
}
