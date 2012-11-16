import java.util.ArrayList;
import java.util.List;

public class C_100514_ny {

   C_100595_ln field_108283_a;
   List field_108281_b = new ArrayList();
   List field_108282_c = new ArrayList();


   public C_100514_ny(C_100595_ln var1) {
      this.field_108283_a = var1;
   }

   public void func_108279_a() {
      this.field_108281_b.clear();
      this.field_108282_c.clear();
   }

   public boolean func_108280_a(C_100730_lb var1) {
      if(this.field_108281_b.contains(var1)) {
         return true;
      } else if(this.field_108282_c.contains(var1)) {
         return false;
      } else {
         this.field_108283_a.field_103229_p.field_109545_E.func_108901_a("canSee");
         boolean var2 = this.field_108283_a.func_103308_m(var1);
         this.field_108283_a.field_103229_p.field_109545_E.func_108900_b();
         if(var2) {
            this.field_108281_b.add(var1);
         } else {
            this.field_108282_c.add(var1);
         }

         return var2;
      }
   }
}
