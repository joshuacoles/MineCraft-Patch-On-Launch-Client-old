
public class C_100356_ant implements C_100369_ani {

   private byte[] field_107575_a;


   public C_100356_ant(byte[] var1) {
      this(var1, 0, var1.length);
   }

   public C_100356_ant(byte[] var1, int var2, int var3) {
      this.field_107575_a = new byte[var3];
      System.arraycopy(var1, var2, this.field_107575_a, 0, var3);
   }

   public byte[] func_107574_a() {
      return this.field_107575_a;
   }
}
