import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_101114_aqu implements Callable {

   // $FF: synthetic field
   final Minecraft field_111617_a;


   public C_101114_aqu(Minecraft var1) {
      this.field_111617_a = var1;
   }

   public String func_111616_a() {
      return GL11.glGetString(7937) + " GL version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936);
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_111616_a();
   }
}
