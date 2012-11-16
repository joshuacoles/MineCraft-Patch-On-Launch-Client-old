import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class C_101322_atv extends C_101133_arl {

   private final String field_103927_k;
   private final int field_103925_l;
   private final int field_103926_m;
   private boolean field_103924_n;


   protected C_101322_atv(int var1, int var2, int var3, String var4, int var5, int var6) {
      super(var1, var2, var3, 22, 22, "");
      this.field_103927_k = var4;
      this.field_103925_l = var5;
      this.field_103926_m = var6;
   }

   public void func_103903_a(Minecraft var1, int var2, int var3) {
      if(this.field_103915_h) {
         GL11.glBindTexture(3553, var1.field_105127_o.func_110367_b("/gui/beacon.png"));
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.field_103916_i = var2 >= this.field_103913_c && var3 >= this.field_103910_d && var2 < this.field_103913_c + this.field_103914_a && var3 < this.field_103910_d + this.field_103912_b;
         short var4 = 219;
         int var5 = 0;
         if(!this.field_103909_g) {
            var5 += this.field_103914_a * 2;
         } else if(this.field_103924_n) {
            var5 += this.field_103914_a * 1;
         } else if(this.field_103916_i) {
            var5 += this.field_103914_a * 3;
         }

         this.func_103877_b(this.field_103913_c, this.field_103910_d, var5, var4, this.field_103914_a, this.field_103912_b);
         if(!"/gui/beacon.png".equals(this.field_103927_k)) {
            GL11.glBindTexture(3553, var1.field_105127_o.func_110367_b(this.field_103927_k));
         }

         this.func_103877_b(this.field_103913_c + 2, this.field_103910_d + 2, this.field_103925_l, this.field_103926_m, 18, 18);
      }
   }

   public boolean func_103923_b() {
      return this.field_103924_n;
   }

   public void func_103922_b(boolean var1) {
      this.field_103924_n = var1;
   }
}
