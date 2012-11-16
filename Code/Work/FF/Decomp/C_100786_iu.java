import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class C_100786_iu extends C_100780_ir {

   private boolean field_109879_g = false;
   private Socket field_109881_h;
   private byte[] field_109882_i = new byte[1460];
   private String field_109880_j;


   C_100786_iu(C_100124_gf var1, Socket var2) {
      super(var1);
      this.field_109881_h = var2;

      try {
         this.field_109881_h.setSoTimeout(0);
      } catch (Exception var4) {
         this.field_109849_a = false;
      }

      this.field_109880_j = var1.func_105019_a("rcon.password", "");
      this.func_109839_b("Rcon connection from: " + var2.getInetAddress());
   }

   public void run() {
      while(true) {
         try {
            if(!this.field_109849_a) {
               break;
            }

            BufferedInputStream var1 = new BufferedInputStream(this.field_109881_h.getInputStream());
            int var2 = var1.read(this.field_109882_i, 0, 1460);
            if(10 <= var2) {
               byte var3 = 0;
               int var4 = C_100807_ip.func_109985_b(this.field_109882_i, 0, var2);
               if(var4 != var2 - 4) {
                  return;
               }

               int var21 = var3 + 4;
               int var5 = C_100807_ip.func_109985_b(this.field_109882_i, var21, var2);
               var21 += 4;
               int var6 = C_100807_ip.func_109982_b(this.field_109882_i, var21);
               var21 += 4;
               switch(var6) {
               case 2:
                  if(this.field_109879_g) {
                     String var8 = C_100807_ip.func_109981_a(this.field_109882_i, var21, var2);

                     try {
                        this.func_109877_a(var5, this.field_109847_b.func_104929_h(var8));
                     } catch (Exception var16) {
                        this.func_109877_a(var5, "Error executing: " + var8 + " (" + var16.getMessage() + ")");
                     }
                     continue;
                  }

                  this.func_109878_f();
                  continue;
               case 3:
                  String var7 = C_100807_ip.func_109981_a(this.field_109882_i, var21, var2);
                  int var10000 = var21 + var7.length();
                  if(0 != var7.length() && var7.equals(this.field_109880_j)) {
                     this.field_109879_g = true;
                     this.func_109876_a(var5, 2, "");
                     continue;
                  }

                  this.field_109879_g = false;
                  this.func_109878_f();
                  continue;
               default:
                  this.func_109877_a(var5, String.format("Unknown request %s", new Object[]{Integer.toHexString(var6)}));
                  continue;
               }
            }
         } catch (SocketTimeoutException var17) {
            break;
         } catch (IOException var18) {
            break;
         } catch (Exception var19) {
            System.out.println(var19);
            break;
         } finally {
            this.func_109875_g();
         }

         return;
      }

   }

   private void func_109876_a(int var1, int var2, String var3) {
      ByteArrayOutputStream var4 = new ByteArrayOutputStream(1248);
      DataOutputStream var5 = new DataOutputStream(var4);
      var5.writeInt(Integer.reverseBytes(var3.length() + 10));
      var5.writeInt(Integer.reverseBytes(var1));
      var5.writeInt(Integer.reverseBytes(var2));
      var5.writeBytes(var3);
      var5.write(0);
      var5.write(0);
      this.field_109881_h.getOutputStream().write(var4.toByteArray());
   }

   private void func_109878_f() {
      this.func_109876_a(-1, 2, "");
   }

   private void func_109877_a(int var1, String var2) {
      int var3 = var2.length();

      do {
         int var4 = 4096 <= var3?4096:var3;
         this.func_109876_a(var1, 0, var2.substring(0, var4));
         var2 = var2.substring(var4);
         var3 = var2.length();
      } while(0 != var3);

   }

   private void func_109875_g() {
      if(null != this.field_109881_h) {
         try {
            this.field_109881_h.close();
         } catch (IOException var2) {
            this.func_109836_c("IO: " + var2.getMessage());
         }

         this.field_109881_h = null;
      }
   }
}
