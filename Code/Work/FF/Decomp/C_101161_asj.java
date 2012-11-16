import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_101161_asj extends C_101133_arl {

   public C_101161_asj(int var1, int var2, int var3) {
      super(var1, var2, var3, 20, 20, "");
   }

   public void func_103903_a(Minecraft var1, int var2, int var3) {
      if(this.field_103915_h) {
         GL11.glBindTexture(3553, var1.field_105127_o.func_110367_b("/gui/gui.png"));
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         boolean var4 = var2 >= this.field_103913_c && var3 >= this.field_103910_d && var2 < this.field_103913_c + this.field_103914_a && var3 < this.field_103910_d + this.field_103912_b;
         int var5 = 106;
         if(var4) {
            var5 += this.field_103912_b;
         }

         this.func_103877_b(this.field_103913_c, this.field_103910_d, 0, var5, this.field_103914_a, this.field_103912_b);
      }
   }
}
