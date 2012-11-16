import org.lwjgl.opengl.GL11;

public class C_100930_axs extends C_100988_axw {

   private int field_104642_a = 0;
   private int field_104644_aw = 0;
   private C_100874_azc field_104643_ax;
   private float field_104641_ay;


   public C_100930_axs(C_100874_azc var1, C_100873_xe var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      super(var2, var3, var5, var7, 0.0D, 0.0D, 0.0D);
      this.field_104643_ax = var1;
      this.field_104644_aw = 6 + this.field_103232_aa.nextInt(4);
      this.field_104620_h = this.field_104621_i = this.field_104618_j = this.field_103232_aa.nextFloat() * 0.6F + 0.4F;
      this.field_104641_ay = 1.0F - (float)var9 * 0.5F;
   }

   public void func_104606_a(C_100872_azb var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      int var8 = (int)(((float)this.field_104642_a + var2) * 15.0F / (float)this.field_104644_aw);
      if(var8 <= 15) {
         this.field_104643_ax.func_110368_b(this.field_104643_ax.func_110367_b("/misc/explosion.png"));
         float var9 = (float)(var8 % 4) / 4.0F;
         float var10 = var9 + 0.24975F;
         float var11 = (float)(var8 / 4) / 4.0F;
         float var12 = var11 + 0.24975F;
         float var13 = 2.0F * this.field_104641_ay;
         float var14 = (float)(this.field_103227_q + (this.field_103221_t - this.field_103227_q) * (double)var2 - field_104616_at);
         float var15 = (float)(this.field_103225_r + (this.field_103219_u - this.field_103225_r) * (double)var2 - field_104622_au);
         float var16 = (float)(this.field_103223_s + (this.field_103217_v - this.field_103223_s) * (double)var2 - field_104619_av);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(2896);
         C_101210_aqj.func_112010_a();
         var1.func_110330_b();
         var1.func_110317_a(this.field_104620_h, this.field_104621_i, this.field_104618_j, 1.0F);
         var1.func_110323_b(0.0F, 1.0F, 0.0F);
         var1.func_110328_c(240);
         var1.func_110322_a((double)(var14 - var3 * var13 - var6 * var13), (double)(var15 - var4 * var13), (double)(var16 - var5 * var13 - var7 * var13), (double)var10, (double)var12);
         var1.func_110322_a((double)(var14 - var3 * var13 + var6 * var13), (double)(var15 + var4 * var13), (double)(var16 - var5 * var13 + var7 * var13), (double)var10, (double)var11);
         var1.func_110322_a((double)(var14 + var3 * var13 + var6 * var13), (double)(var15 + var4 * var13), (double)(var16 + var5 * var13 + var7 * var13), (double)var9, (double)var11);
         var1.func_110322_a((double)(var14 + var3 * var13 - var6 * var13), (double)(var15 - var4 * var13), (double)(var16 + var5 * var13 - var7 * var13), (double)var9, (double)var12);
         var1.func_110329_a();
         GL11.glPolygonOffset(0.0F, 0.0F);
         GL11.glEnable(2896);
      }
   }

   public int func_103125_b(float var1) {
      return '\uf0f0';
   }

   public void func_103165_j_() {
      this.field_103227_q = this.field_103221_t;
      this.field_103225_r = this.field_103219_u;
      this.field_103223_s = this.field_103217_v;
      ++this.field_104642_a;
      if(this.field_104642_a == this.field_104644_aw) {
         this.func_103121_x();
      }

   }

   public int func_104602_b() {
      return 3;
   }
}
