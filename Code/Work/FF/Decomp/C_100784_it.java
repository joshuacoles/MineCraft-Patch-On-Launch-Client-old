import java.net.DatagramPacket;
import java.util.Date;
import java.util.Random;

class C_100784_it {

   private long field_109898_b;
   private int field_109899_c;
   private byte[] field_109896_d;
   private byte[] field_109897_e;
   private String field_109895_f;
   // $FF: synthetic field
   final C_100782_is field_109900_a;


   public C_100784_it(C_100782_is var1, DatagramPacket var2) {
      this.field_109900_a = var1;
      this.field_109898_b = (new Date()).getTime();
      byte[] var3 = var2.getData();
      this.field_109896_d = new byte[4];
      this.field_109896_d[0] = var3[3];
      this.field_109896_d[1] = var3[4];
      this.field_109896_d[2] = var3[5];
      this.field_109896_d[3] = var3[6];
      this.field_109895_f = new String(this.field_109896_d);
      this.field_109899_c = (new Random()).nextInt(16777216);
      this.field_109897_e = String.format("\t%s%d ", new Object[]{this.field_109895_f, Integer.valueOf(this.field_109899_c)}).getBytes();
   }

   public Boolean func_109893_a(long var1) {
      return Boolean.valueOf(this.field_109898_b < var1);
   }

   public int func_109892_a() {
      return this.field_109899_c;
   }

   public byte[] func_109894_b() {
      return this.field_109897_e;
   }

   public byte[] func_109891_c() {
      return this.field_109896_d;
   }
}
