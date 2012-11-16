
class C_100313_cb extends Thread {

   // $FF: synthetic field
   final C_100325_bx field_107375_a;


   C_100313_cb(C_100325_bx var1) {
      this.field_107375_a = var1;
   }

   public void run() {
      try {
         Thread.sleep(2000L);
         if(C_100325_bx.func_107436_a(this.field_107375_a)) {
            C_100325_bx.func_107437_h(this.field_107375_a).interrupt();
            this.field_107375_a.func_107415_a("disconnect.closed", new Object[0]);
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }
}
