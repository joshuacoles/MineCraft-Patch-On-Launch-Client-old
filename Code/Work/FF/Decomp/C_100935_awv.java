import java.net.ConnectException;
import java.net.UnknownHostException;

class C_100935_awv extends Thread {

   // $FF: synthetic field
   final String field_110745_a;
   // $FF: synthetic field
   final int field_110743_b;
   // $FF: synthetic field
   final C_101253_awu field_110744_c;


   C_100935_awv(C_101253_awu var1, String var2, int var3) {
      this.field_110744_c = var1;
      this.field_110745_a = var2;
      this.field_110743_b = var3;
   }

   public void run() {
      try {
         C_101253_awu.func_104248_a(this.field_110744_c, new C_101250_awr(C_101253_awu.func_104240_a(this.field_110744_c), this.field_110745_a, this.field_110743_b));
         if(C_101253_awu.func_104241_b(this.field_110744_c)) {
            return;
         }

         C_101253_awu.func_104242_d(this.field_110744_c).func_107034_c(new C_100384_cq(47, C_101253_awu.func_104243_c(this.field_110744_c).field_105130_j.field_111761_b, this.field_110745_a, this.field_110743_b));
      } catch (UnknownHostException var2) {
         if(C_101253_awu.func_104241_b(this.field_110744_c)) {
            return;
         }

         C_101253_awu.func_104247_e(this.field_110744_c).func_105053_a(new C_100936_aww("connect.failed", "disconnect.genericReason", new Object[]{"Unknown host \'" + this.field_110745_a + "\'"}));
      } catch (ConnectException var3) {
         if(C_101253_awu.func_104241_b(this.field_110744_c)) {
            return;
         }

         C_101253_awu.func_104244_f(this.field_110744_c).func_105053_a(new C_100936_aww("connect.failed", "disconnect.genericReason", new Object[]{var3.getMessage()}));
      } catch (Exception var4) {
         if(C_101253_awu.func_104241_b(this.field_110744_c)) {
            return;
         }

         var4.printStackTrace();
         C_101253_awu.func_104245_g(this.field_110744_c).func_105053_a(new C_100936_aww("connect.failed", "disconnect.genericReason", new Object[]{var4.toString()}));
      }

   }
}
