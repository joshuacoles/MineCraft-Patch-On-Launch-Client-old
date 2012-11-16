package p_101361_paulscode.p_101409_sound;

import p_101361_paulscode.p_101409_sound.C_101418_SimpleThread$1;

public class C_101418_SimpleThread extends Thread {

   private static final boolean field_102527_GET = false;
   private static final boolean field_102526_SET = true;
   private static final boolean field_102525_XXX = false;
   private boolean field_102529_alive = true;
   private boolean field_102528_kill = false;


   protected void func_102519_cleanup() {
      this.func_102521_kill(true, true);
      this.func_102524_alive(true, false);
   }

   public void run() {
      this.func_102519_cleanup();
   }

   public void func_102518_restart() {
      (new C_101418_SimpleThread$1(this)).start();
   }

   private void func_102517_rerun() {
      this.func_102521_kill(true, true);

      while(this.func_102524_alive(false, false)) {
         this.func_102523_snooze(100L);
      }

      this.func_102524_alive(true, true);
      this.func_102521_kill(true, false);
      this.run();
   }

   public boolean func_102522_alive() {
      return this.func_102524_alive(false, false);
   }

   public void func_102520_kill() {
      this.func_102521_kill(true, true);
   }

   protected boolean func_102515_dying() {
      return this.func_102521_kill(false, false);
   }

   private synchronized boolean func_102524_alive(boolean var1, boolean var2) {
      if(var1) {
         this.field_102529_alive = var2;
      }

      return this.field_102529_alive;
   }

   private synchronized boolean func_102521_kill(boolean var1, boolean var2) {
      if(var1) {
         this.field_102528_kill = var2;
      }

      return this.field_102528_kill;
   }

   protected void func_102523_snooze(long var1) {
      try {
         Thread.sleep(var1);
      } catch (InterruptedException var4) {
         ;
      }

   }

   // $FF: synthetic method
   static void func_102516_access$000(C_101418_SimpleThread var0) {
      var0.func_102517_rerun();
   }
}
