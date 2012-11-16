import java.util.HashMap;
import java.util.TimerTask;

class C_100710_kq extends TimerTask {

   // $FF: synthetic field
   final C_100708_kp field_109277_a;


   C_100710_kq(C_100708_kp var1) {
      this.field_109277_a = var1;
   }

   public void run() {
      if(C_100708_kp.func_109259_a(this.field_109277_a).func_102906_R()) {
         HashMap var1;
         synchronized(C_100708_kp.func_109262_b(this.field_109277_a)) {
            var1 = new HashMap(C_100708_kp.func_109258_c(this.field_109277_a));
         }

         var1.put("snooper_count", Integer.valueOf(C_100708_kp.func_109268_d(this.field_109277_a)));
         C_100669_jm.func_109084_a(C_100708_kp.func_109266_e(this.field_109277_a), var1, true);
      }
   }
}
