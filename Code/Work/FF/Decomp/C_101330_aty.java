import org.lwjgl.opengl.GL11;

public class C_101330_aty extends C_101288_atq {

   private C_100424_ama field_104452_o;


   public C_101330_aty(C_101092_qf var1, C_100424_ama var2) {
      super(new C_101073_rb(var1, var2));
      this.field_104452_o = var2;
   }

   protected void func_104433_b(int var1, int var2) {
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a("container.brewing"), 56, 6, 4210752);
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a("container.inventory"), 8, this.field_104441_c - 96 + 2, 4210752);
   }

   protected void func_104430_a(float var1, int var2, int var3) {
      int var4 = this.field_104046_e.field_105127_o.func_110367_b("/gui/alchemy.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(var4);
      int var5 = (this.field_104044_f - this.field_104440_b) / 2;
      int var6 = (this.field_104045_g - this.field_104441_c) / 2;
      this.func_103877_b(var5, var6, 0, 0, this.field_104440_b, this.field_104441_c);
      int var7 = this.field_104452_o.func_103031_x_();
      if(var7 > 0) {
         int var8 = (int)(28.0F * (1.0F - (float)var7 / 400.0F));
         if(var8 > 0) {
            this.func_103877_b(var5 + 97, var6 + 16, 176, 0, 9, var8);
         }

         int var9 = var7 / 2 % 7;
         switch(var9) {
         case 0:
            var8 = 29;
            break;
         case 1:
            var8 = 24;
            break;
         case 2:
            var8 = 20;
            break;
         case 3:
            var8 = 16;
            break;
         case 4:
            var8 = 11;
            break;
         case 5:
            var8 = 6;
            break;
         case 6:
            var8 = 0;
         }

         if(var8 > 0) {
            this.func_103877_b(var5 + 65, var6 + 14 + 29 - var8, 185, 29 - var8, 12, var8);
         }
      }

   }
}
