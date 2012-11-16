import org.lwjgl.opengl.GL11;

public class C_101358_auj extends C_101288_atq {

   private C_100419_amg field_104493_o;


   public C_101358_auj(C_101092_qf var1, C_100419_amg var2) {
      super(new C_101063_rl(var1, var2));
      this.field_104493_o = var2;
   }

   protected void func_104433_b(int var1, int var2) {
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a("container.furnace"), 60, 6, 4210752);
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a("container.inventory"), 8, this.field_104441_c - 96 + 2, 4210752);
   }

   protected void func_104430_a(float var1, int var2, int var3) {
      int var4 = this.field_104046_e.field_105127_o.func_110367_b("/gui/furnace.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(var4);
      int var5 = (this.field_104044_f - this.field_104440_b) / 2;
      int var6 = (this.field_104045_g - this.field_104441_c) / 2;
      this.func_103877_b(var5, var6, 0, 0, this.field_104440_b, this.field_104441_c);
      int var7;
      if(this.field_104493_o.func_104836_i()) {
         var7 = this.field_104493_o.func_104839_d(12);
         this.func_103877_b(var5 + 56, var6 + 36 + 12 - var7, 176, 12 - var7, 14, var7 + 2);
      }

      var7 = this.field_104493_o.func_104833_c(24);
      this.func_103877_b(var5 + 79, var6 + 34, 176, 14, var7 + 1, 16);
   }
}
