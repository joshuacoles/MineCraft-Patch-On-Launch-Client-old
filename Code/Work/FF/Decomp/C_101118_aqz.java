import java.awt.Canvas;
import net.minecraft.client.MinecraftApplet;

public class C_101118_aqz extends Canvas {

   // $FF: synthetic field
   final MinecraftApplet field_111619_a;


   public C_101118_aqz(MinecraftApplet var1) {
      this.field_111619_a = var1;
   }

   public synchronized void addNotify() {
      super.addNotify();
      this.field_111619_a.func_105161_a();
   }

   public synchronized void removeNotify() {
      this.field_111619_a.func_105162_b();
      super.removeNotify();
   }
}
