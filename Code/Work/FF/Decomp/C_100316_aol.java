import java.util.ArrayList;
import java.util.Iterator;

final class C_100316_aol extends ArrayList {

   // $FF: synthetic field
   final Iterable field_107380_a;


   C_100316_aol(Iterable var1) {
      this.field_107380_a = var1;
      Iterator var2 = this.field_107380_a.iterator();

      while(var2.hasNext()) {
         C_101168_aou var3 = (C_101168_aou)var2.next();
         this.add(var3);
      }

   }
}
