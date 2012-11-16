import java.security.SecureRandom;

public class C_100368_anh {

   protected SecureRandom field_107809_a;
   protected int field_107808_b;


   public void func_107806_a(C_100354_anm var1) {
      this.field_107809_a = var1.func_107627_a();
      this.field_107808_b = (var1.func_107626_b() + 7) / 8;
   }

   public byte[] func_107807_a() {
      byte[] var1 = new byte[this.field_107808_b];
      this.field_107809_a.nextBytes(var1);
      return var1;
   }
}
