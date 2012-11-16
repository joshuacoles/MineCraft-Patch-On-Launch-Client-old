import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class C_100335_bn extends C_100331_bu {

   public int[] field_107496_a;


   public C_100335_bn(String var1) {
      super(var1);
   }

   public C_100335_bn(String var1, int[] var2) {
      super(var1);
      this.field_107496_a = var2;
   }

   void func_107484_a(DataOutput var1) {
      var1.writeInt(this.field_107496_a.length);
      int[] var2 = this.field_107496_a;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var2[var4];
         var1.writeInt(var5);
      }

   }

   void func_107487_a(DataInput var1) {
      int var2 = var1.readInt();
      this.field_107496_a = new int[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.field_107496_a[var3] = var1.readInt();
      }

   }

   public byte func_107483_a() {
      return (byte)11;
   }

   public String toString() {
      return "[" + this.field_107496_a.length + " bytes]";
   }

   public C_100331_bu func_107485_b() {
      int[] var1 = new int[this.field_107496_a.length];
      System.arraycopy(this.field_107496_a, 0, var1, 0, this.field_107496_a.length);
      return new C_100335_bn(this.func_107492_e(), var1);
   }

   public boolean equals(Object var1) {
      if(!super.equals(var1)) {
         return false;
      } else {
         C_100335_bn var2 = (C_100335_bn)var1;
         return this.field_107496_a == null && var2.field_107496_a == null || this.field_107496_a != null && Arrays.equals(this.field_107496_a, var2.field_107496_a);
      }
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.field_107496_a);
   }
}
