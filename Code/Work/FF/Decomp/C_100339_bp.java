import java.io.DataInput;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C_100339_bp extends C_100331_bu {

   private List field_107503_a = new ArrayList();
   private byte field_107502_c;


   public C_100339_bp() {
      super("");
   }

   public C_100339_bp(String var1) {
      super(var1);
   }

   void func_107484_a(DataOutput var1) {
      if(!this.field_107503_a.isEmpty()) {
         this.field_107502_c = ((C_100331_bu)this.field_107503_a.get(0)).func_107483_a();
      } else {
         this.field_107502_c = 1;
      }

      var1.writeByte(this.field_107502_c);
      var1.writeInt(this.field_107503_a.size());
      Iterator var2 = this.field_107503_a.iterator();

      while(var2.hasNext()) {
         C_100331_bu var3 = (C_100331_bu)var2.next();
         var3.func_107484_a(var1);
      }

   }

   void func_107487_a(DataInput var1) {
      this.field_107502_c = var1.readByte();
      int var2 = var1.readInt();
      this.field_107503_a = new ArrayList();

      for(int var3 = 0; var3 < var2; ++var3) {
         C_100331_bu var4 = C_100331_bu.func_107490_a(this.field_107502_c, (String)null);
         var4.func_107487_a(var1);
         this.field_107503_a.add(var4);
      }

   }

   public byte func_107483_a() {
      return (byte)9;
   }

   public String toString() {
      return "" + this.field_107503_a.size() + " entries of type " + C_100331_bu.func_107488_a(this.field_107502_c);
   }

   public void func_107500_a(C_100331_bu var1) {
      this.field_107502_c = var1.func_107483_a();
      this.field_107503_a.add(var1);
   }

   public C_100331_bu func_107499_a(int var1) {
      return (C_100331_bu)this.field_107503_a.remove(var1);
   }

   public C_100331_bu func_107498_b(int var1) {
      return (C_100331_bu)this.field_107503_a.get(var1);
   }

   public int func_107501_c() {
      return this.field_107503_a.size();
   }

   public C_100331_bu func_107485_b() {
      C_100339_bp var1 = new C_100339_bp(this.func_107492_e());
      var1.field_107502_c = this.field_107502_c;
      Iterator var2 = this.field_107503_a.iterator();

      while(var2.hasNext()) {
         C_100331_bu var3 = (C_100331_bu)var2.next();
         C_100331_bu var4 = var3.func_107485_b();
         var1.field_107503_a.add(var4);
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         C_100339_bp var2 = (C_100339_bp)var1;
         if(this.field_107502_c == var2.field_107502_c) {
            return this.field_107503_a.equals(var2.field_107503_a);
         }
      }

      return false;
   }

   public int hashCode() {
      return super.hashCode() ^ this.field_107503_a.hashCode();
   }
}
