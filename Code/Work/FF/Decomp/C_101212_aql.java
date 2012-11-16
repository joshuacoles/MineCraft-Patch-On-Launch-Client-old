import net.minecraft.client.Minecraft;

public class C_101212_aql extends Thread {

   // $FF: synthetic field
   final Minecraft field_112019_a;


   public C_101212_aql(Minecraft var1, String var2) {
      super(var2);
      this.field_112019_a = var1;
   }

   public void run() {
      while(this.field_112019_a.field_105106_J) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException var2) {
            ;
         }
      }

   }
}
