
class C_100747_hh extends Thread {

   // $FF: synthetic field
   final C_100170_hg field_109637_a;


   C_100747_hh(C_100170_hg var1) {
      this.field_109637_a = var1;
      this.setDaemon(true);
      this.start();
   }

   public void run() {
      while(true) {
         try {
            while(true) {
               Thread.sleep(2147483647L);
            }
         } catch (InterruptedException var2) {
            ;
         }
      }
   }
}
