import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class C_100250_dl extends C_100219_dx {

   private int[] field_106642_c;
   private int[] field_106639_d;
   public int[] field_106643_a;
   public int[] field_106641_b;
   private byte[] field_106640_e;
   private byte[][] field_106637_f;
   private int field_106638_g;
   private static byte[] field_106644_h = new byte[0];


   public C_100250_dl() {}

   public C_100250_dl(List var1) {
      int var2 = var1.size();
      this.field_106642_c = new int[var2];
      this.field_106639_d = new int[var2];
      this.field_106643_a = new int[var2];
      this.field_106641_b = new int[var2];
      this.field_106637_f = new byte[var2][];
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         C_101272_za var5 = (C_101272_za)var1.get(var4);
         C_100245_dk var6 = C_100246_dj.func_106616_a(var5, true, '\uffff');
         if(field_106644_h.length < var3 + var6.field_107110_a.length) {
            byte[] var7 = new byte[var3 + var6.field_107110_a.length];
            System.arraycopy(field_106644_h, 0, var7, 0, field_106644_h.length);
            field_106644_h = var7;
         }

         System.arraycopy(var6.field_107110_a, 0, field_106644_h, var3, var6.field_107110_a.length);
         var3 += var6.field_107110_a.length;
         this.field_106642_c[var4] = var5.field_112336_g;
         this.field_106639_d[var4] = var5.field_112348_h;
         this.field_106643_a[var4] = var6.field_107108_b;
         this.field_106641_b[var4] = var6.field_107109_c;
         this.field_106637_f[var4] = var6.field_107110_a;
      }

      Deflater var11 = new Deflater(-1);

      try {
         var11.setInput(field_106644_h, 0, var3);
         var11.finish();
         this.field_106640_e = new byte[var3];
         this.field_106638_g = var11.deflate(this.field_106640_e);
      } finally {
         var11.end();
      }

   }

   public void func_106537_a(DataInputStream var1) {
      short var2 = var1.readShort();
      this.field_106638_g = var1.readInt();
      this.field_106642_c = new int[var2];
      this.field_106639_d = new int[var2];
      this.field_106643_a = new int[var2];
      this.field_106641_b = new int[var2];
      this.field_106637_f = new byte[var2][];
      if(field_106644_h.length < this.field_106638_g) {
         field_106644_h = new byte[this.field_106638_g];
      }

      var1.readFully(field_106644_h, 0, this.field_106638_g);
      byte[] var3 = new byte[196864 * var2];
      Inflater var4 = new Inflater();
      var4.setInput(field_106644_h, 0, this.field_106638_g);

      try {
         var4.inflate(var3);
      } catch (DataFormatException var11) {
         throw new IOException("Bad compressed data format");
      } finally {
         var4.end();
      }

      int var5 = 0;

      for(int var6 = 0; var6 < var2; ++var6) {
         this.field_106642_c[var6] = var1.readInt();
         this.field_106639_d[var6] = var1.readInt();
         this.field_106643_a[var6] = var1.readShort();
         this.field_106641_b[var6] = var1.readShort();
         int var7 = 0;

         int var8;
         for(var8 = 0; var8 < 16; ++var8) {
            var7 += this.field_106643_a[var6] >> var8 & 1;
         }

         var8 = 2048 * 5 * var7 + 256;
         this.field_106637_f[var6] = new byte[var8];
         System.arraycopy(var3, var5, this.field_106637_f[var6], 0, var8);
         var5 += var8;
      }

   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeShort(this.field_106642_c.length);
      var1.writeInt(this.field_106638_g);
      var1.write(this.field_106640_e, 0, this.field_106638_g);

      for(int var2 = 0; var2 < this.field_106642_c.length; ++var2) {
         var1.writeInt(this.field_106642_c[var2]);
         var1.writeInt(this.field_106639_d[var2]);
         var1.writeShort((short)(this.field_106643_a[var2] & '\uffff'));
         var1.writeShort((short)(this.field_106641_b[var2] & '\uffff'));
      }

   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106944_a(this);
   }

   public int func_106552_a() {
      return 6 + this.field_106638_g + 12 * this.func_106634_d();
   }

   public int func_106635_a(int var1) {
      return this.field_106642_c[var1];
   }

   public int func_106633_b(int var1) {
      return this.field_106639_d[var1];
   }

   public int func_106634_d() {
      return this.field_106642_c.length;
   }

   public byte[] func_106636_c(int var1) {
      return this.field_106637_f[var1];
   }

}
