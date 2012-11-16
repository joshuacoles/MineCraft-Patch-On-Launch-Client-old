import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

class C_101150_asi extends Thread {

   // $FF: synthetic field
   final C_100909_axg field_111776_a;
   // $FF: synthetic field
   final C_101151_ash field_111775_b;


   C_101150_asi(C_101151_ash var1, C_100909_axg var2) {
      this.field_111775_b = var1;
      this.field_111776_a = var2;
   }

   public void run() {
      boolean var27 = false;

      label183: {
         label184: {
            label185: {
               label186: {
                  label187: {
                     try {
                        var27 = true;
                        this.field_111776_a.field_110707_d = "§8Polling..";
                        long var1 = System.nanoTime();
                        C_101148_asg.func_104195_a(this.field_111776_a);
                        long var3 = System.nanoTime();
                        this.field_111776_a.field_110708_e = (var3 - var1) / 1000000L;
                        var27 = false;
                        break label183;
                     } catch (UnknownHostException var35) {
                        this.field_111776_a.field_110708_e = -1L;
                        this.field_111776_a.field_110707_d = "§4Can\'t resolve hostname";
                        var27 = false;
                     } catch (SocketTimeoutException var36) {
                        this.field_111776_a.field_110708_e = -1L;
                        this.field_111776_a.field_110707_d = "§4Can\'t reach server";
                        var27 = false;
                        break label187;
                     } catch (ConnectException var37) {
                        this.field_111776_a.field_110708_e = -1L;
                        this.field_111776_a.field_110707_d = "§4Can\'t reach server";
                        var27 = false;
                        break label186;
                     } catch (IOException var38) {
                        this.field_111776_a.field_110708_e = -1L;
                        this.field_111776_a.field_110707_d = "§4Communication error";
                        var27 = false;
                        break label185;
                     } catch (Exception var39) {
                        this.field_111776_a.field_110708_e = -1L;
                        this.field_111776_a.field_110707_d = "ERROR: " + var39.getClass();
                        var27 = false;
                        break label184;
                     } finally {
                        if(var27) {
                           synchronized(C_101148_asg.func_104194_h()) {
                              C_101148_asg.func_104200_k();
                           }
                        }
                     }

                     synchronized(C_101148_asg.func_104194_h()) {
                        C_101148_asg.func_104200_k();
                        return;
                     }
                  }

                  synchronized(C_101148_asg.func_104194_h()) {
                     C_101148_asg.func_104200_k();
                     return;
                  }
               }

               synchronized(C_101148_asg.func_104194_h()) {
                  C_101148_asg.func_104200_k();
                  return;
               }
            }

            synchronized(C_101148_asg.func_104194_h()) {
               C_101148_asg.func_104200_k();
               return;
            }
         }

         synchronized(C_101148_asg.func_104194_h()) {
            C_101148_asg.func_104200_k();
            return;
         }
      }

      synchronized(C_101148_asg.func_104194_h()) {
         C_101148_asg.func_104200_k();
      }

   }
}
