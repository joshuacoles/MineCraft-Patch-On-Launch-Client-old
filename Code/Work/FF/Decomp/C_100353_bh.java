import java.io.DataInput;
import java.io.DataOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C_100353_bh extends C_100331_bu {

   private Map field_107540_a = new HashMap();


   public C_100353_bh() {
      super("");
   }

   public C_100353_bh(String var1) {
      super(var1);
   }

   void func_107484_a(DataOutput var1) {
      Iterator var2 = this.field_107540_a.values().iterator();

      while(var2.hasNext()) {
         C_100331_bu var3 = (C_100331_bu)var2.next();
         C_100331_bu.func_107491_a(var3, var1);
      }

      var1.writeByte(0);
   }

   void func_107487_a(DataInput var1) {
      this.field_107540_a.clear();

      C_100331_bu var2;
      while((var2 = C_100331_bu.func_107486_b(var1)).func_107483_a() != 0) {
         this.field_107540_a.put(var2.func_107492_e(), var2);
      }

   }

   public Collection func_107510_c() {
      return this.field_107540_a.values();
   }

   public byte func_107483_a() {
      return (byte)10;
   }

   public void func_107530_a(String var1, C_100331_bu var2) {
      this.field_107540_a.put(var1, var2.func_107489_p(var1));
   }

   public void func_107527_a(String var1, byte var2) {
      this.field_107540_a.put(var1, new C_100351_bg(var1, var2));
   }

   public void func_107532_a(String var1, short var2) {
      this.field_107540_a.put(var1, new C_100327_bs(var1, var2));
   }

   public void func_107520_a(String var1, int var2) {
      this.field_107540_a.put(var1, new C_100337_bo(var1, var2));
   }

   public void func_107525_a(String var1, long var2) {
      this.field_107540_a.put(var1, new C_100341_bq(var1, var2));
   }

   public void func_107529_a(String var1, float var2) {
      this.field_107540_a.put(var1, new C_100347_bm(var1, var2));
   }

   public void func_107535_a(String var1, double var2) {
      this.field_107540_a.put(var1, new C_100343_bk(var1, var2));
   }

   public void func_107533_a(String var1, String var2) {
      this.field_107540_a.put(var1, new C_100333_bt(var1, var2));
   }

   public void func_107526_a(String var1, byte[] var2) {
      this.field_107540_a.put(var1, new C_100349_bf(var1, var2));
   }

   public void func_107539_a(String var1, int[] var2) {
      this.field_107540_a.put(var1, new C_100335_bn(var1, var2));
   }

   public void func_107538_a(String var1, C_100353_bh var2) {
      this.field_107540_a.put(var1, var2.func_107489_p(var1));
   }

   public void func_107509_a(String var1, boolean var2) {
      this.func_107527_a(var1, (byte)(var2?1:0));
   }

   public C_100331_bu func_107518_a(String var1) {
      return (C_100331_bu)this.field_107540_a.get(var1);
   }

   public boolean func_107516_b(String var1) {
      return this.field_107540_a.containsKey(var1);
   }

   public byte func_107524_c(String var1) {
      try {
         return !this.field_107540_a.containsKey(var1)?0:((C_100351_bg)this.field_107540_a.get(var1)).field_107508_a;
      } catch (ClassCastException var3) {
         throw new C_100010_l(this.func_107531_a(var1, 1, var3));
      }
   }

   public short func_107517_d(String var1) {
      try {
         return !this.field_107540_a.containsKey(var1)?0:((C_100327_bs)this.field_107540_a.get(var1)).field_107541_a;
      } catch (ClassCastException var3) {
         throw new C_100010_l(this.func_107531_a(var1, 2, var3));
      }
   }

   public int func_107514_e(String var1) {
      try {
         return !this.field_107540_a.containsKey(var1)?0:((C_100337_bo)this.field_107540_a.get(var1)).field_107497_a;
      } catch (ClassCastException var3) {
         throw new C_100010_l(this.func_107531_a(var1, 3, var3));
      }
   }

   public long func_107515_f(String var1) {
      try {
         return !this.field_107540_a.containsKey(var1)?0L:((C_100341_bq)this.field_107540_a.get(var1)).field_107504_a;
      } catch (ClassCastException var3) {
         throw new C_100010_l(this.func_107531_a(var1, 4, var3));
      }
   }

   public float func_107512_g(String var1) {
      try {
         return !this.field_107540_a.containsKey(var1)?0.0F:((C_100347_bm)this.field_107540_a.get(var1)).field_107506_a;
      } catch (ClassCastException var3) {
         throw new C_100010_l(this.func_107531_a(var1, 5, var3));
      }
   }

   public double func_107522_h(String var1) {
      try {
         return !this.field_107540_a.containsKey(var1)?0.0D:((C_100343_bk)this.field_107540_a.get(var1)).field_107505_a;
      } catch (ClassCastException var3) {
         throw new C_100010_l(this.func_107531_a(var1, 6, var3));
      }
   }

   public String func_107534_i(String var1) {
      try {
         return !this.field_107540_a.containsKey(var1)?"":((C_100333_bt)this.field_107540_a.get(var1)).field_107495_a;
      } catch (ClassCastException var3) {
         throw new C_100010_l(this.func_107531_a(var1, 8, var3));
      }
   }

   public byte[] func_107523_j(String var1) {
      try {
         return !this.field_107540_a.containsKey(var1)?new byte[0]:((C_100349_bf)this.field_107540_a.get(var1)).field_107507_a;
      } catch (ClassCastException var3) {
         throw new C_100010_l(this.func_107531_a(var1, 7, var3));
      }
   }

   public int[] func_107511_k(String var1) {
      try {
         return !this.field_107540_a.containsKey(var1)?new int[0]:((C_100335_bn)this.field_107540_a.get(var1)).field_107496_a;
      } catch (ClassCastException var3) {
         throw new C_100010_l(this.func_107531_a(var1, 11, var3));
      }
   }

   public C_100353_bh func_107521_l(String var1) {
      try {
         return !this.field_107540_a.containsKey(var1)?new C_100353_bh(var1):(C_100353_bh)this.field_107540_a.get(var1);
      } catch (ClassCastException var3) {
         throw new C_100010_l(this.func_107531_a(var1, 10, var3));
      }
   }

   public C_100339_bp func_107513_m(String var1) {
      try {
         return !this.field_107540_a.containsKey(var1)?new C_100339_bp(var1):(C_100339_bp)this.field_107540_a.get(var1);
      } catch (ClassCastException var3) {
         throw new C_100010_l(this.func_107531_a(var1, 9, var3));
      }
   }

   public boolean func_107519_n(String var1) {
      return this.func_107524_c(var1) != 0;
   }

   public void func_107528_o(String var1) {
      this.field_107540_a.remove(var1);
   }

   public String toString() {
      return "" + this.field_107540_a.size() + " entries";
   }

   public boolean func_107537_d() {
      return this.field_107540_a.isEmpty();
   }

   private C_100007_a func_107531_a(String var1, int var2, ClassCastException var3) {
      C_100007_a var4 = new C_100007_a("Reading NBT data", var3);
      var4.func_105182_a("Corrupt tag type found", new C_100355_bi(this, var1));
      var4.func_105182_a("Corrupt tag type expected", new C_100342_bj(this, var2));
      var4.func_105189_a("Corrupt tag name", var1);
      return var4;
   }

   public C_100331_bu func_107485_b() {
      C_100353_bh var1 = new C_100353_bh(this.func_107492_e());
      Iterator var2 = this.field_107540_a.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var1.func_107530_a(var3, ((C_100331_bu)this.field_107540_a.get(var3)).func_107485_b());
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if(super.equals(var1)) {
         C_100353_bh var2 = (C_100353_bh)var1;
         return this.field_107540_a.entrySet().equals(var2.field_107540_a.entrySet());
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.field_107540_a.hashCode();
   }

   // $FF: synthetic method
   static Map func_107536_a(C_100353_bh var0) {
      return var0.field_107540_a;
   }
}
