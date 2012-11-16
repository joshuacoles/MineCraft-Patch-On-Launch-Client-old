import java.io.InputStream;
import java.net.URL;

class C_100108_bcu extends InputStream {

   private int field_105942_c;
   private InputStream field_105940_d;
   byte[] field_105943_a;
   // $FF: synthetic field
   final C_100101_bct field_105941_b;


   public C_100108_bcu(C_100101_bct var1, URL var2, InputStream var3) {
      this.field_105941_b = var1;
      this.field_105943_a = new byte[1];
      this.field_105940_d = var3;
      String var4 = var2.getPath();
      var4 = var4.substring(var4.lastIndexOf("/") + 1);
      this.field_105942_c = var4.hashCode();
   }

   public int read() {
      int var1 = this.read(this.field_105943_a, 0, 1);
      return var1 < 0?var1:this.field_105943_a[0];
   }

   public int read(byte[] var1, int var2, int var3) {
      var3 = this.field_105940_d.read(var1, var2, var3);

      for(int var4 = 0; var4 < var3; ++var4) {
         byte var5 = var1[var2 + var4] = (byte)(var1[var2 + var4] ^ this.field_105942_c >> 8);
         this.field_105942_c = this.field_105942_c * 498729871 + 85731 * var5;
      }

      return var3;
   }
}
