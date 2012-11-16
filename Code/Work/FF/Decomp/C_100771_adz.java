import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class C_100771_adz {

   protected LinkedList field_108585_a = new LinkedList();
   protected C_100516_abo field_108584_b;


   public C_100516_abo func_108579_a() {
      return this.field_108584_b;
   }

   public LinkedList func_108582_b() {
      return this.field_108585_a;
   }

   public void func_108578_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      Iterator var4 = this.field_108585_a.iterator();

      while(var4.hasNext()) {
         C_100767_adx var5 = (C_100767_adx)var4.next();
         if(var5.func_108381_b().func_108333_a(var3) && !var5.func_108387_a(var1, var2, var3)) {
            var4.remove();
         }
      }

   }

   protected void func_108581_c() {
      this.field_108584_b = C_100516_abo.func_108332_a();
      Iterator var1 = this.field_108585_a.iterator();

      while(var1.hasNext()) {
         C_100767_adx var2 = (C_100767_adx)var1.next();
         this.field_108584_b.func_108327_b(var2.func_108381_b());
      }

   }

   protected void func_108583_a(C_100873_xe var1, Random var2, int var3) {
      int var4 = 63 - var3;
      int var5 = this.field_108584_b.func_108328_c() + 1;
      if(var5 < var4) {
         var5 += var2.nextInt(var4 - var5);
      }

      int var6 = var5 - this.field_108584_b.field_108338_e;
      this.field_108584_b.func_108331_a(0, var6, 0);
      Iterator var7 = this.field_108585_a.iterator();

      while(var7.hasNext()) {
         C_100767_adx var8 = (C_100767_adx)var7.next();
         var8.func_108381_b().func_108331_a(0, var6, 0);
      }

   }

   protected void func_108577_a(C_100873_xe var1, Random var2, int var3, int var4) {
      int var5 = var4 - var3 + 1 - this.field_108584_b.func_108328_c();
      boolean var6 = true;
      int var10;
      if(var5 > 1) {
         var10 = var3 + var2.nextInt(var5);
      } else {
         var10 = var3;
      }

      int var7 = var10 - this.field_108584_b.field_108339_b;
      this.field_108584_b.func_108331_a(0, var7, 0);
      Iterator var8 = this.field_108585_a.iterator();

      while(var8.hasNext()) {
         C_100767_adx var9 = (C_100767_adx)var8.next();
         var9.func_108381_b().func_108331_a(0, var7, 0);
      }

   }

   public boolean func_108580_d() {
      return true;
   }
}
