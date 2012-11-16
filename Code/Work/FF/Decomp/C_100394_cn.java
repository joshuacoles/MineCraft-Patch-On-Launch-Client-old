import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class C_100394_cn extends C_100219_dx {

   public int field_106842_a;
   public int field_106840_b;
   public byte[] field_106841_c;
   public int field_106838_d;
   private static byte[] field_106839_e = new byte[0];


   public C_100394_cn() {
      this.field_106557_r = true;
   }

   public C_100394_cn(int var1, int var2, short[] var3, int var4, C_100873_xe var5) {
      this.field_106557_r = true;
      this.field_106842_a = var1;
      this.field_106840_b = var2;
      this.field_106838_d = var4;
      int var6 = 4 * var4;
      C_101272_za var7 = var5.func_109440_e(var1, var2);

      try {
         if(var4 >= 64) {
            System.out.println("ChunkTilesUpdatePacket compress " + var4);
            if(field_106839_e.length < var6) {
               field_106839_e = new byte[var6];
            }
         } else {
            ByteArrayOutputStream var8 = new ByteArrayOutputStream(var6);
            DataOutputStream var9 = new DataOutputStream(var8);

            for(int var10 = 0; var10 < var4; ++var10) {
               int var11 = var3[var10] >> 12 & 15;
               int var12 = var3[var10] >> 8 & 15;
               int var13 = var3[var10] & 255;
               var9.writeShort(var3[var10]);
               var9.writeShort((short)((var7.func_112312_a(var11, var13, var12) & 4095) << 4 | var7.func_112327_c(var11, var13, var12) & 15));
            }

            this.field_106841_c = var8.toByteArray();
            if(this.field_106841_c.length != var6) {
               throw new RuntimeException("Expected length " + var6 + " doesn\'t match received length " + this.field_106841_c.length);
            }
         }
      } catch (IOException var14) {
         System.err.println(var14.getMessage());
         this.field_106841_c = null;
      }

   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106842_a = var1.readInt();
      this.field_106840_b = var1.readInt();
      this.field_106838_d = var1.readShort() & '\uffff';
      int var2 = var1.readInt();
      if(var2 > 0) {
         this.field_106841_c = new byte[var2];
         var1.readFully(this.field_106841_c);
      }

   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeInt(this.field_106842_a);
      var1.writeInt(this.field_106840_b);
      var1.writeShort((short)this.field_106838_d);
      if(this.field_106841_c != null) {
         var1.writeInt(this.field_106841_c.length);
         var1.write(this.field_106841_c);
      } else {
         var1.writeInt(0);
      }

   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106924_a(this);
   }

   public int func_106552_a() {
      return 10 + this.field_106838_d * 4;
   }

}
