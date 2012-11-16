
class C_100080_bdc extends Thread {

   // $FF: synthetic field
   final C_100079_bdb field_105616_a;


   C_100080_bdc(C_100079_bdb var1) {
      this.field_105616_a = var1;
   }

   public void run() {
      try {
         if(C_100079_bdb.func_105595_a(this.field_105616_a) != null) {
            C_100079_bdb.func_105588_a(this.field_105616_a, C_100079_bdb.func_105595_a(this.field_105616_a), C_100079_bdb.func_105590_b(this.field_105616_a), C_100079_bdb.func_105584_c(this.field_105616_a), C_100079_bdb.func_105600_d(this.field_105616_a));
         } else if(C_100079_bdb.func_105590_b(this.field_105616_a).exists()) {
            C_100079_bdb.func_105599_a(this.field_105616_a, C_100079_bdb.func_105583_a(this.field_105616_a, C_100079_bdb.func_105590_b(this.field_105616_a), C_100079_bdb.func_105584_c(this.field_105616_a), C_100079_bdb.func_105600_d(this.field_105616_a)));
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      } finally {
         C_100079_bdb.func_105585_a(this.field_105616_a, false);
      }

   }
}
