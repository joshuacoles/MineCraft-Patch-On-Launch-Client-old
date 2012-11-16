
class C_100315_ca extends Thread {

   // $FF: synthetic field
   final C_100325_bx field_107379_a;


   C_100315_ca(C_100325_bx var1) {
      this.field_107379_a = var1;
   }

   public void run() {
      try {
         Thread.sleep(5000L);
         if(C_100325_bx.func_107435_g(this.field_107379_a).isAlive()) {
            try {
               C_100325_bx.func_107435_g(this.field_107379_a).stop();
            } catch (Throwable var3) {
               ;
            }
         }

         if(C_100325_bx.func_107437_h(this.field_107379_a).isAlive()) {
            try {
               C_100325_bx.func_107437_h(this.field_107379_a).stop();
            } catch (Throwable var2) {
               ;
            }
         }
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }

   }
}
