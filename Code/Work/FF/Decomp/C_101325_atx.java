import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class C_101325_atx extends C_101133_arl {

   private final boolean field_103933_k;


   public C_101325_atx(int var1, int var2, int var3, boolean var4) {
      super(var1, var2, var3, 23, 13, "");
      this.field_103933_k = var4;
   }

   public void func_103903_a(Minecraft var1, int var2, int var3) {
      if(this.field_103915_h) {
         boolean var4 = var2 >= this.field_103913_c && var3 >= this.field_103910_d && var2 < this.field_103913_c + this.field_103914_a && var3 < this.field_103910_d + this.field_103912_b;
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var1.field_105127_o.func_110368_b(var1.field_105127_o.func_110367_b("/gui/book.png"));
         int var5 = 0;
         int var6 = 192;
         if(var4) {
            var5 += 23;
         }

         if(!this.field_103933_k) {
            var6 += 13;
         }

         this.func_103877_b(this.field_103913_c, this.field_103910_d, var5, var6, 23, 13);
      }
   }
}
