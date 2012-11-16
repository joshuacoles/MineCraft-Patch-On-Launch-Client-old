
public class C_100340_anu implements C_100369_ani {

   private byte[] field_107579_a;
   private C_100369_ani field_107578_b;


   public C_100340_anu(C_100369_ani var1, byte[] var2, int var3, int var4) {
      this.field_107579_a = new byte[var4];
      this.field_107578_b = var1;
      System.arraycopy(var2, var3, this.field_107579_a, 0, var4);
   }

   public byte[] func_107577_a() {
      return this.field_107579_a;
   }

   public C_100369_ani func_107576_b() {
      return this.field_107578_b;
   }
}
