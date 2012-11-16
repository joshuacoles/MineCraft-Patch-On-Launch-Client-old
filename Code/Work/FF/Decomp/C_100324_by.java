
class C_100324_by extends Thread {

   // $FF: synthetic field
   final C_100325_bx field_107482_a;


   C_100324_by(C_100325_bx var1, String var2) {
      super(var2);
      this.field_107482_a = var1;
   }

   public void run() {
      C_100325_bx.field_107447_a.getAndIncrement();

      try {
         while(C_100325_bx.func_107436_a(this.field_107482_a) && !C_100325_bx.func_107427_b(this.field_107482_a)) {
            while(true) {
               if(!C_100325_bx.func_107431_c(this.field_107482_a)) {
                  try {
                     sleep(2L);
                  } catch (InterruptedException var5) {
                     ;
                  }
               }
            }
         }
      } finally {
         C_100325_bx.field_107447_a.getAndDecrement();
      }

   }
}
