import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C_101207_aqi {

   public static List field_111993_a = new ArrayList();
   public static C_100661_jq field_111991_b = new C_100661_jq();
   public String field_111992_c;
   public int field_111989_d;
   public boolean field_111990_e;
   public int field_111988_f = 0;


   public static void func_111984_a(int var0) {
      C_101207_aqi var1 = (C_101207_aqi)field_111991_b.func_109038_a(var0);
      if(var1 != null) {
         ++var1.field_111988_f;
      }

   }

   public static void func_111987_a(int var0, boolean var1) {
      C_101207_aqi var2 = (C_101207_aqi)field_111991_b.func_109038_a(var0);
      if(var2 != null) {
         var2.field_111990_e = var1;
      }

   }

   public static void func_111983_a() {
      Iterator var0 = field_111993_a.iterator();

      while(var0.hasNext()) {
         C_101207_aqi var1 = (C_101207_aqi)var0.next();
         var1.func_111982_d();
      }

   }

   public static void func_111985_b() {
      field_111991_b.func_109044_c();
      Iterator var0 = field_111993_a.iterator();

      while(var0.hasNext()) {
         C_101207_aqi var1 = (C_101207_aqi)var0.next();
         field_111991_b.func_109035_a(var1.field_111989_d, var1);
      }

   }

   public C_101207_aqi(String var1, int var2) {
      this.field_111992_c = var1;
      this.field_111989_d = var2;
      field_111993_a.add(this);
      field_111991_b.func_109035_a(var2, this);
   }

   public boolean func_111986_c() {
      if(this.field_111988_f == 0) {
         return false;
      } else {
         --this.field_111988_f;
         return true;
      }
   }

   private void func_111982_d() {
      this.field_111988_f = 0;
      this.field_111990_e = false;
   }

}
