import org.lwjgl.opengl.GL11;

public class C_101314_aua extends C_101288_atq {

   private C_100716_kl field_104451_o;
   private C_100716_kl field_104450_p;
   private int field_104449_q = 0;


   public C_101314_aua(C_100716_kl var1, C_100716_kl var2) {
      super(new C_101069_rf(var1, var2));
      this.field_104451_o = var1;
      this.field_104450_p = var2;
      this.field_104051_i = false;
      short var3 = 222;
      int var4 = var3 - 108;
      this.field_104449_q = var2.func_103003_k_() / 9;
      this.field_104441_c = var4 + this.field_104449_q * 18;
   }

   protected void func_104433_b(int var1, int var2) {
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a(this.field_104450_p.func_103005_b()), 8, 6, 4210752);
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a(this.field_104451_o.func_103005_b()), 8, this.field_104441_c - 96 + 2, 4210752);
   }

   protected void func_104430_a(float var1, int var2, int var3) {
      int var4 = this.field_104046_e.field_105127_o.func_110367_b("/gui/container.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(var4);
      int var5 = (this.field_104044_f - this.field_104440_b) / 2;
      int var6 = (this.field_104045_g - this.field_104441_c) / 2;
      this.func_103877_b(var5, var6, 0, 0, this.field_104440_b, this.field_104449_q * 18 + 17);
      this.func_103877_b(var5, var6 + this.field_104449_q * 18 + 17, 0, 126, this.field_104440_b, 96);
   }
}
