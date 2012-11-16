import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class C_101333_aum extends C_101133_arl {

   private final boolean field_103934_k;


   public C_101333_aum(int var1, int var2, int var3, boolean var4) {
      super(var1, var2, var3, 12, 19, "");
      this.field_103934_k = var4;
   }

   public void func_103903_a(Minecraft var1, int var2, int var3) {
      if(this.field_103915_h) {
         GL11.glBindTexture(3553, var1.field_105127_o.func_110367_b("/gui/trading.png"));
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         boolean var4 = var2 >= this.field_103913_c && var3 >= this.field_103910_d && var2 < this.field_103913_c + this.field_103914_a && var3 < this.field_103910_d + this.field_103912_b;
         int var5 = 0;
         int var6 = 176;
         if(!this.field_103909_g) {
            var6 += this.field_103914_a * 2;
         } else if(var4) {
            var6 += this.field_103914_a;
         }

         if(!this.field_103934_k) {
            var5 += this.field_103912_b;
         }

         this.func_103877_b(this.field_103913_c, this.field_103910_d, var6, var5, this.field_103914_a, this.field_103912_b);
      }
   }
}
