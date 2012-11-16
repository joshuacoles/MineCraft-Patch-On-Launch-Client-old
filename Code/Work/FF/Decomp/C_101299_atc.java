import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_101299_atc extends C_101133_arl {

   public float field_103919_k = 1.0F;
   public boolean field_103917_l = false;
   private C_101123_arf field_103918_m = null;


   public C_101299_atc(int var1, int var2, int var3, C_101123_arf var4, String var5, float var6) {
      super(var1, var2, var3, 150, 20, var5);
      this.field_103918_m = var4;
      this.field_103919_k = var6;
   }

   protected int func_103904_a(boolean var1) {
      return 0;
   }

   protected void func_103906_b(Minecraft var1, int var2, int var3) {
      if(this.field_103915_h) {
         if(this.field_103917_l) {
            this.field_103919_k = (float)(var2 - (this.field_103913_c + 4)) / (float)(this.field_103914_a - 8);
            if(this.field_103919_k < 0.0F) {
               this.field_103919_k = 0.0F;
            }

            if(this.field_103919_k > 1.0F) {
               this.field_103919_k = 1.0F;
            }

            var1.field_105156_y.func_111683_a(this.field_103918_m, this.field_103919_k);
            this.field_103911_e = var1.field_105156_y.func_111678_c(this.field_103918_m);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.func_103877_b(this.field_103913_c + (int)(this.field_103919_k * (float)(this.field_103914_a - 8)), this.field_103910_d, 0, 66, 4, 20);
         this.func_103877_b(this.field_103913_c + (int)(this.field_103919_k * (float)(this.field_103914_a - 8)) + 4, this.field_103910_d, 196, 66, 4, 20);
      }
   }

   public boolean func_103902_c(Minecraft var1, int var2, int var3) {
      if(super.func_103902_c(var1, var2, var3)) {
         this.field_103919_k = (float)(var2 - (this.field_103913_c + 4)) / (float)(this.field_103914_a - 8);
         if(this.field_103919_k < 0.0F) {
            this.field_103919_k = 0.0F;
         }

         if(this.field_103919_k > 1.0F) {
            this.field_103919_k = 1.0F;
         }

         var1.field_105156_y.func_111683_a(this.field_103918_m, this.field_103919_k);
         this.field_103911_e = var1.field_105156_y.func_111678_c(this.field_103918_m);
         this.field_103917_l = true;
         return true;
      } else {
         return false;
      }
   }

   public void func_103907_a(int var1, int var2) {
      this.field_103917_l = false;
   }
}
