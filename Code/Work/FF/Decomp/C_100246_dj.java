import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class C_100246_dj extends C_100219_dx {

   public int field_106623_a;
   public int field_106621_b;
   public int field_106622_c;
   public int field_106619_d;
   private byte[] field_106617_f;
   private byte[] field_106618_g;
   public boolean field_106620_e;
   private int field_106624_h;
   private static byte[] field_106625_i = new byte[196864];


   public C_100246_dj() {
      this.field_106557_r = true;
   }

   public C_100246_dj(C_101272_za var1, boolean var2, int var3) {
      this.field_106557_r = true;
      this.field_106623_a = var1.field_112336_g;
      this.field_106621_b = var1.field_112348_h;
      this.field_106620_e = var2;
      C_100245_dk var4 = func_106616_a(var1, var2, var3);
      Deflater var5 = new Deflater(-1);
      this.field_106619_d = var4.field_107109_c;
      this.field_106622_c = var4.field_107108_b;

      try {
         this.field_106618_g = var4.field_107110_a;
         var5.setInput(var4.field_107110_a, 0, var4.field_107110_a.length);
         var5.finish();
         this.field_106617_f = new byte[var4.field_107110_a.length];
         this.field_106624_h = var5.deflate(this.field_106617_f);
      } finally {
         var5.end();
      }

   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106623_a = var1.readInt();
      this.field_106621_b = var1.readInt();
      this.field_106620_e = var1.readBoolean();
      this.field_106622_c = var1.readShort();
      this.field_106619_d = var1.readShort();
      this.field_106624_h = var1.readInt();
      if(field_106625_i.length < this.field_106624_h) {
         field_106625_i = new byte[this.field_106624_h];
      }

      var1.readFully(field_106625_i, 0, this.field_106624_h);
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < 16; ++var3) {
         var2 += this.field_106622_c >> var3 & 1;
      }

      var3 = 12288 * var2;
      if(this.field_106620_e) {
         var3 += 256;
      }

      this.field_106618_g = new byte[var3];
      Inflater var4 = new Inflater();
      var4.setInput(field_106625_i, 0, this.field_106624_h);

      try {
         var4.inflate(this.field_106618_g);
      } catch (DataFormatException var9) {
         throw new IOException("Bad compressed data format");
      } finally {
         var4.end();
      }

   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106623_a);
      var1.writeInt(this.field_106621_b);
      var1.writeBoolean(this.field_106620_e);
      var1.writeShort((short)(this.field_106622_c & '\uffff'));
      var1.writeShort((short)(this.field_106619_d & '\uffff'));
      var1.writeInt(this.field_106624_h);
      var1.write(this.field_106617_f, 0, this.field_106624_h);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106916_a(this);
   }

   public int func_106552_a() {
      return 17 + this.field_106624_h;
   }

   public byte[] func_106615_d() {
      return this.field_106618_g;
   }

   public static C_100245_dk func_106616_a(C_101272_za var0, boolean var1, int var2) {
      int var3 = 0;
      C_101265_zb[] var4 = var0.func_112310_i();
      int var5 = 0;
      C_100245_dk var6 = new C_100245_dk();
      byte[] var7 = field_106625_i;
      if(var1) {
         var0.field_112343_o = true;
      }

      int var8;
      for(var8 = 0; var8 < var4.length; ++var8) {
         if(var4[var8] != null && (!var1 || !var4[var8].func_112257_a()) && (var2 & 1 << var8) != 0) {
            var6.field_107108_b |= 1 << var8;
            if(var4[var8].func_112269_i() != null) {
               var6.field_107109_c |= 1 << var8;
               ++var5;
            }
         }
      }

      for(var8 = 0; var8 < var4.length; ++var8) {
         if(var4[var8] != null && (!var1 || !var4[var8].func_112257_a()) && (var2 & 1 << var8) != 0) {
            byte[] var9 = var4[var8].func_112254_g();
            System.arraycopy(var9, 0, var7, var3, var9.length);
            var3 += var9.length;
         }
      }

      C_101274_yy var10;
      for(var8 = 0; var8 < var4.length; ++var8) {
         if(var4[var8] != null && (!var1 || !var4[var8].func_112257_a()) && (var2 & 1 << var8) != 0) {
            var10 = var4[var8].func_112249_j();
            System.arraycopy(var10.field_112360_a, 0, var7, var3, var10.field_112360_a.length);
            var3 += var10.field_112360_a.length;
         }
      }

      for(var8 = 0; var8 < var4.length; ++var8) {
         if(var4[var8] != null && (!var1 || !var4[var8].func_112257_a()) && (var2 & 1 << var8) != 0) {
            var10 = var4[var8].func_112262_k();
            System.arraycopy(var10.field_112360_a, 0, var7, var3, var10.field_112360_a.length);
            var3 += var10.field_112360_a.length;
         }
      }

      for(var8 = 0; var8 < var4.length; ++var8) {
         if(var4[var8] != null && (!var1 || !var4[var8].func_112257_a()) && (var2 & 1 << var8) != 0) {
            var10 = var4[var8].func_112261_l();
            System.arraycopy(var10.field_112360_a, 0, var7, var3, var10.field_112360_a.length);
            var3 += var10.field_112360_a.length;
         }
      }

      if(var5 > 0) {
         for(var8 = 0; var8 < var4.length; ++var8) {
            if(var4[var8] != null && (!var1 || !var4[var8].func_112257_a()) && var4[var8].func_112269_i() != null && (var2 & 1 << var8) != 0) {
               var10 = var4[var8].func_112269_i();
               System.arraycopy(var10.field_112360_a, 0, var7, var3, var10.field_112360_a.length);
               var3 += var10.field_112360_a.length;
            }
         }
      }

      if(var1) {
         byte[] var11 = var0.func_112306_m();
         System.arraycopy(var11, 0, var7, var3, var11.length);
         var3 += var11.length;
      }

      var6.field_107110_a = new byte[var3];
      System.arraycopy(var7, 0, var6.field_107110_a, 0, var3);
      return var6;
   }

}
