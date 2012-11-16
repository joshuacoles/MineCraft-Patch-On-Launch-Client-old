import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C_100235_de extends C_100219_dx {

   public double field_106603_a;
   public double field_106601_b;
   public double field_106602_c;
   public float field_106599_d;
   public List field_106600_e;
   private float field_106597_f;
   private float field_106598_g;
   private float field_106604_h;


   public C_100235_de() {}

   public C_100235_de(double var1, double var3, double var5, float var7, List var8, C_100387_amw var9) {
      this.field_106603_a = var1;
      this.field_106601_b = var3;
      this.field_106602_c = var5;
      this.field_106599_d = var7;
      this.field_106600_e = new ArrayList(var8);
      if(var9 != null) {
         this.field_106597_f = (float)var9.field_107872_c;
         this.field_106598_g = (float)var9.field_107869_d;
         this.field_106604_h = (float)var9.field_107870_e;
      }

   }

   public void func_106537_a(DataInputStream var1) {
      this.field_106603_a = var1.readDouble();
      this.field_106601_b = var1.readDouble();
      this.field_106602_c = var1.readDouble();
      this.field_106599_d = var1.readFloat();
      int var2 = var1.readInt();
      this.field_106600_e = new ArrayList(var2);
      int var3 = (int)this.field_106603_a;
      int var4 = (int)this.field_106601_b;
      int var5 = (int)this.field_106602_c;

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7 = var1.readByte() + var3;
         int var8 = var1.readByte() + var4;
         int var9 = var1.readByte() + var5;
         this.field_106600_e.add(new C_100851_xw(var7, var8, var9));
      }

      this.field_106597_f = var1.readFloat();
      this.field_106598_g = var1.readFloat();
      this.field_106604_h = var1.readFloat();
   }

   public void func_106544_a(DataOutputStream var1) {
      var1.writeDouble(this.field_106603_a);
      var1.writeDouble(this.field_106601_b);
      var1.writeDouble(this.field_106602_c);
      var1.writeFloat(this.field_106599_d);
      var1.writeInt(this.field_106600_e.size());
      int var2 = (int)this.field_106603_a;
      int var3 = (int)this.field_106601_b;
      int var4 = (int)this.field_106602_c;
      Iterator var5 = this.field_106600_e.iterator();

      while(var5.hasNext()) {
         C_100851_xw var6 = (C_100851_xw)var5.next();
         int var7 = var6.field_110207_a - var2;
         int var8 = var6.field_110205_b - var3;
         int var9 = var6.field_110206_c - var4;
         var1.writeByte(var7);
         var1.writeByte(var8);
         var1.writeByte(var9);
      }

      var1.writeFloat(this.field_106597_f);
      var1.writeFloat(this.field_106598_g);
      var1.writeFloat(this.field_106604_h);
   }

   public void func_106539_a(C_100221_dy var1) {
      var1.func_106982_a(this);
   }

   public int func_106552_a() {
      return 32 + this.field_106600_e.size() * 3 + 3;
   }

   public float func_106594_d() {
      return this.field_106597_f;
   }

   public float func_106596_f() {
      return this.field_106598_g;
   }

   public float func_106595_g() {
      return this.field_106604_h;
   }
}
