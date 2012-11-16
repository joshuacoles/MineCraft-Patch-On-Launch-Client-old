import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public final class C_101115_aqr extends WindowAdapter {

   public void windowClosing(WindowEvent var1) {
      System.err.println("Someone is closing me!");
      System.exit(1);
   }
}
