import java.util.Map;

class C_100081_bdd extends Thread {

   // $FF: synthetic field
   final Map field_105618_a;
   // $FF: synthetic field
   final C_100079_bdb field_105617_b;


   C_100081_bdd(C_100079_bdb var1, Map var2) {
      this.field_105617_b = var1;
      this.field_105618_a = var2;
   }

   public void run() {
      try {
         C_100079_bdb.func_105588_a(this.field_105617_b, this.field_105618_a, C_100079_bdb.func_105591_e(this.field_105617_b), C_100079_bdb.func_105587_f(this.field_105617_b), C_100079_bdb.func_105601_g(this.field_105617_b));
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         C_100079_bdb.func_105585_a(this.field_105617_b, false);
      }

   }
}
