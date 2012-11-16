import java.io.IOException;

class C_100318_bz extends Thread {

   // $FF: synthetic field
   final C_100325_bx field_107392_a;


   C_100318_bz(C_100325_bx var1, String var2) {
      super(var2);
      this.field_107392_a = var1;
   }

   public void run() {
      C_100325_bx.field_107445_b.getAndIncrement();

      try {
         while(C_100325_bx.func_107436_a(this.field_107392_a)) {
            boolean var1;
            for(var1 = false; C_100325_bx.func_107428_d(this.field_107392_a); var1 = true) {
               ;
            }

            try {
               if(var1 && C_100325_bx.func_107422_e(this.field_107392_a) != null) {
                  C_100325_bx.func_107422_e(this.field_107392_a).flush();
               }
            } catch (IOException var8) {
               if(!C_100325_bx.func_107433_f(this.field_107392_a)) {
                  C_100325_bx.func_107429_a(this.field_107392_a, var8);
               }

               var8.printStackTrace();
            }

            try {
               sleep(2L);
            } catch (InterruptedException var7) {
               ;
            }
         }
      } finally {
         C_100325_bx.field_107445_b.getAndDecrement();
      }

   }
}
