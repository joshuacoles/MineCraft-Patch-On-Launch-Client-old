import java.awt.BorderLayout;
import java.awt.Canvas;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftApplet;

public class C_101128_ara extends Minecraft {

   // $FF: synthetic field
   final MinecraftApplet field_105160_O;


   public C_101128_ara(MinecraftApplet var1, Canvas var2, MinecraftApplet var3, int var4, int var5, boolean var6) {
      super(var2, var3, var4, var5, var6);
      this.field_105160_O = var1;
   }

   public void func_105062_d(C_100007_a var1) {
      this.field_105160_O.removeAll();
      this.field_105160_O.setLayout(new BorderLayout());
      this.field_105160_O.add(new C_101205_aqd(var1), "Center");
      this.field_105160_O.validate();
   }
}
