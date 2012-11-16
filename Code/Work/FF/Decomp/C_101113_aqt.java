import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;
import org.lwjgl.Sys;

public class C_101113_aqt implements Callable {

   // $FF: synthetic field
   final Minecraft field_111615_a;


   public C_101113_aqt(Minecraft var1) {
      this.field_111615_a = var1;
   }

   public String func_111614_a() {
      return Sys.getVersion();
   }

   // $FF: synthetic method
   public Object call() {
      return this.func_111614_a();
   }
}
