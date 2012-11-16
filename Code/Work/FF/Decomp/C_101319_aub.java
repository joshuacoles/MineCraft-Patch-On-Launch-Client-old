import org.lwjgl.opengl.GL11;

public class C_101319_aub extends C_101288_atq {

   public C_101319_aub(C_101092_qf var1, C_100873_xe var2, int var3, int var4, int var5) {
      super(new C_101067_rh(var1, var2, var3, var4, var5));
   }

   protected void func_104433_b(int var1, int var2) {
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a("container.crafting"), 28, 6, 4210752);
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a("container.inventory"), 8, this.field_104441_c - 96 + 2, 4210752);
   }

   protected void func_104430_a(float var1, int var2, int var3) {
      int var4 = this.field_104046_e.field_105127_o.func_110367_b("/gui/crafting.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(var4);
      int var5 = (this.field_104044_f - this.field_104440_b) / 2;
      int var6 = (this.field_104045_g - this.field_104441_c) / 2;
      this.func_103877_b(var5, var6, 0, 0, this.field_104440_b, this.field_104441_c);
   }
}
