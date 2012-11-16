import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_101133_arl extends C_101155_asd {

   protected int field_103914_a;
   protected int field_103912_b;
   public int field_103913_c;
   public int field_103910_d;
   public String field_103911_e;
   public int field_103908_f;
   public boolean field_103909_g;
   public boolean field_103915_h;
   protected boolean field_103916_i;


   public C_101133_arl(int var1, int var2, int var3, String var4) {
      this(var1, var2, var3, 200, 20, var4);
   }

   public C_101133_arl(int var1, int var2, int var3, int var4, int var5, String var6) {
      this.field_103914_a = 200;
      this.field_103912_b = 20;
      this.field_103909_g = true;
      this.field_103915_h = true;
      this.field_103908_f = var1;
      this.field_103913_c = var2;
      this.field_103910_d = var3;
      this.field_103914_a = var4;
      this.field_103912_b = var5;
      this.field_103911_e = var6;
   }

   protected int func_103904_a(boolean var1) {
      byte var2 = 1;
      if(!this.field_103909_g) {
         var2 = 0;
      } else if(var1) {
         var2 = 2;
      }

      return var2;
   }

   public void func_103903_a(Minecraft var1, int var2, int var3) {
      if(this.field_103915_h) {
         C_101153_asb var4 = var1.field_105148_p;
         GL11.glBindTexture(3553, var1.field_105127_o.func_110367_b("/gui/gui.png"));
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.field_103916_i = var2 >= this.field_103913_c && var3 >= this.field_103910_d && var2 < this.field_103913_c + this.field_103914_a && var3 < this.field_103910_d + this.field_103912_b;
         int var5 = this.func_103904_a(this.field_103916_i);
         this.func_103877_b(this.field_103913_c, this.field_103910_d, 0, 46 + var5 * 20, this.field_103914_a / 2, this.field_103912_b);
         this.func_103877_b(this.field_103913_c + this.field_103914_a / 2, this.field_103910_d, 200 - this.field_103914_a / 2, 46 + var5 * 20, this.field_103914_a / 2, this.field_103912_b);
         this.func_103906_b(var1, var2, var3);
         int var6 = 14737632;
         if(!this.field_103909_g) {
            var6 = -6250336;
         } else if(this.field_103916_i) {
            var6 = 16777120;
         }

         this.func_103879_a(var4, this.field_103911_e, this.field_103913_c + this.field_103914_a / 2, this.field_103910_d + (this.field_103912_b - 8) / 2, var6);
      }
   }

   protected void func_103906_b(Minecraft var1, int var2, int var3) {}

   public void func_103907_a(int var1, int var2) {}

   public boolean func_103902_c(Minecraft var1, int var2, int var3) {
      return this.field_103909_g && this.field_103915_h && var2 >= this.field_103913_c && var3 >= this.field_103910_d && var2 < this.field_103913_c + this.field_103914_a && var3 < this.field_103910_d + this.field_103912_b;
   }

   public boolean func_103905_a() {
      return this.field_103916_i;
   }

   public void func_103901_b(int var1, int var2) {}
}
