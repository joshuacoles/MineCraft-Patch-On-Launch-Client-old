import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C_100358_anr extends FilterOutputStream {

   private C_100366_ang field_107636_a;
   private C_100350_ano field_107634_b;
   private byte[] field_107635_c = new byte[1];
   private byte[] field_107633_d;


   public C_100358_anr(OutputStream var1, C_100366_ang var2) {
      super(var1);
      this.field_107636_a = var2;
      this.field_107633_d = new byte[var2.func_107796_a()];
   }

   public void write(int var1) {
      this.field_107635_c[0] = (byte)var1;
      if(this.field_107636_a != null) {
         int var2 = this.field_107636_a.func_107795_a(this.field_107635_c, 0, 1, this.field_107633_d, 0);
         if(var2 != 0) {
            this.out.write(this.field_107633_d, 0, var2);
         }
      } else {
         this.out.write(this.field_107634_b.func_107625_a((byte)var1));
      }

   }

   public void write(byte[] var1) {
      this.write(var1, 0, var1.length);
   }

   public void write(byte[] var1, int var2, int var3) {
      byte[] var4;
      if(this.field_107636_a != null) {
         var4 = new byte[this.field_107636_a.func_107793_b(var3)];
         int var5 = this.field_107636_a.func_107795_a(var1, var2, var3, var4, 0);
         if(var5 != 0) {
            this.out.write(var4, 0, var5);
         }
      } else {
         var4 = new byte[var3];
         this.field_107634_b.func_107624_a(var1, var2, var3, var4, 0);
         this.out.write(var4, 0, var3);
      }

   }

   public void flush() {
      super.flush();
   }

   public void close() {
      try {
         if(this.field_107636_a != null) {
            byte[] var1 = new byte[this.field_107636_a.func_107793_b(0)];
            int var2 = this.field_107636_a.func_107794_a(var1, 0);
            if(var2 != 0) {
               this.out.write(var1, 0, var2);
            }
         }
      } catch (Exception var3) {
         throw new IOException("Error closing stream: " + var3.toString());
      }

      this.flush();
      super.close();
   }
}
