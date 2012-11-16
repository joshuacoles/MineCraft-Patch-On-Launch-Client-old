import java.util.ArrayList;
import java.util.List;

public class C_100657_afs {

   private static int field_108978_a = 256;
   private static List field_108976_b = new ArrayList();
   private static List field_108977_c = new ArrayList();
   private static List field_108974_d = new ArrayList();
   private static List field_108975_e = new ArrayList();


   public static synchronized int[] func_108972_a(int var0) {
      int[] var1;
      if(var0 <= 256) {
         if(field_108976_b.isEmpty()) {
            var1 = new int[256];
            field_108977_c.add(var1);
            return var1;
         } else {
            var1 = (int[])field_108976_b.remove(field_108976_b.size() - 1);
            field_108977_c.add(var1);
            return var1;
         }
      } else if(var0 > field_108978_a) {
         field_108978_a = var0;
         field_108974_d.clear();
         field_108975_e.clear();
         var1 = new int[field_108978_a];
         field_108975_e.add(var1);
         return var1;
      } else if(field_108974_d.isEmpty()) {
         var1 = new int[field_108978_a];
         field_108975_e.add(var1);
         return var1;
      } else {
         var1 = (int[])field_108974_d.remove(field_108974_d.size() - 1);
         field_108975_e.add(var1);
         return var1;
      }
   }

   public static synchronized void func_108973_a() {
      if(!field_108974_d.isEmpty()) {
         field_108974_d.remove(field_108974_d.size() - 1);
      }

      if(!field_108976_b.isEmpty()) {
         field_108976_b.remove(field_108976_b.size() - 1);
      }

      field_108974_d.addAll(field_108975_e);
      field_108976_b.addAll(field_108977_c);
      field_108975_e.clear();
      field_108977_c.clear();
   }

}
