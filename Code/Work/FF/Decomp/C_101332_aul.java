import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import org.lwjgl.opengl.GL11;

public class C_101332_aul extends C_101288_atq {

   private C_100891_wu field_104457_o;
   private C_101333_aum field_104456_p;
   private C_101333_aum field_104455_q;
   private int field_104454_r = 0;


   public C_101332_aul(C_101092_qf var1, C_100891_wu var2, C_100873_xe var3) {
      super(new C_101051_rr(var1, var2, var3));
      this.field_104457_o = var2;
   }

   public void func_104037_A_() {
      super.func_104037_A_();
      int var1 = (this.field_104044_f - this.field_104440_b) / 2;
      int var2 = (this.field_104045_g - this.field_104441_c) / 2;
      this.field_104050_h.add(this.field_104456_p = new C_101333_aum(1, var1 + 120 + 27, var2 + 24 - 1, true));
      this.field_104050_h.add(this.field_104455_q = new C_101333_aum(2, var1 + 36 - 19, var2 + 24 - 1, false));
      this.field_104456_p.field_103909_g = false;
      this.field_104455_q.field_103909_g = false;
   }

   protected void func_104433_b(int var1, int var2) {
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a("entity.Villager.name"), 56, 6, 4210752);
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a("container.inventory"), 8, this.field_104441_c - 96 + 2, 4210752);
   }

   public void func_104039_c() {
      super.func_104039_c();
      C_100859_ww var1 = this.field_104457_o.func_103584_b(this.field_104046_e.field_105120_g);
      if(var1 != null) {
         this.field_104456_p.field_103909_g = this.field_104454_r < var1.size() - 1;
         this.field_104455_q.field_103909_g = this.field_104454_r > 0;
      }

   }

   protected void func_104040_a(C_101133_arl var1) {
      boolean var2 = false;
      if(var1 == this.field_104456_p) {
         ++this.field_104454_r;
         var2 = true;
      } else if(var1 == this.field_104455_q) {
         --this.field_104454_r;
         var2 = true;
      }

      if(var2) {
         ((C_101051_rr)this.field_104439_d).func_111516_b(this.field_104454_r);
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         DataOutputStream var4 = new DataOutputStream(var3);

         try {
            var4.writeInt(this.field_104454_r);
            this.field_104046_e.func_105068_r().func_107034_c(new C_100367_da("MC|TrSel", var3.toByteArray()));
         } catch (Exception var6) {
            var6.printStackTrace();
         }
      }

   }

   protected void func_104430_a(float var1, int var2, int var3) {
      int var4 = this.field_104046_e.field_105127_o.func_110367_b("/gui/trading.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(var4);
      int var5 = (this.field_104044_f - this.field_104440_b) / 2;
      int var6 = (this.field_104045_g - this.field_104441_c) / 2;
      this.func_103877_b(var5, var6, 0, 0, this.field_104440_b, this.field_104441_c);
   }

   public void func_104027_a(int var1, int var2, float var3) {
      super.func_104027_a(var1, var2, var3);
      C_100859_ww var4 = this.field_104457_o.func_103584_b(this.field_104046_e.field_105120_g);
      if(var4 != null && !var4.isEmpty()) {
         int var5 = (this.field_104044_f - this.field_104440_b) / 2;
         int var6 = (this.field_104045_g - this.field_104441_c) / 2;
         int var7 = this.field_104454_r;
         C_100892_wv var8 = (C_100892_wv)var4.get(var7);
         if(var8.func_110661_g()) {
            GL11.glBindTexture(3553, this.field_104046_e.field_105127_o.func_110367_b("/gui/trading.png"));
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(2896);
            this.func_103877_b(this.field_104445_m + 83, this.field_104443_n + 21, 212, 0, 28, 21);
            this.func_103877_b(this.field_104445_m + 83, this.field_104443_n + 51, 212, 0, 28, 21);
         }

         GL11.glPushMatrix();
         C_100994_tv var9 = var8.func_110665_a();
         C_100994_tv var10 = var8.func_110659_b();
         C_100994_tv var11 = var8.func_110654_d();
         C_101210_aqj.func_112012_c();
         GL11.glDisable(2896);
         GL11.glEnable('\u803a');
         GL11.glEnable(2903);
         GL11.glEnable(2896);
         field_104442_a.field_105502_f = 100.0F;
         field_104442_a.func_105501_b(this.field_104049_k, this.field_104046_e.field_105127_o, var9, var5 + 36, var6 + 24);
         field_104442_a.func_105496_c(this.field_104049_k, this.field_104046_e.field_105127_o, var9, var5 + 36, var6 + 24);
         if(var10 != null) {
            field_104442_a.func_105501_b(this.field_104049_k, this.field_104046_e.field_105127_o, var10, var5 + 62, var6 + 24);
            field_104442_a.func_105496_c(this.field_104049_k, this.field_104046_e.field_105127_o, var10, var5 + 62, var6 + 24);
         }

         field_104442_a.func_105501_b(this.field_104049_k, this.field_104046_e.field_105127_o, var11, var5 + 120, var6 + 24);
         field_104442_a.func_105496_c(this.field_104049_k, this.field_104046_e.field_105127_o, var11, var5 + 120, var6 + 24);
         field_104442_a.field_105502_f = 0.0F;
         GL11.glDisable(2896);
         if(this.func_104431_c(36, 24, 16, 16, var1, var2)) {
            this.func_104432_a(var9, var1, var2);
         } else if(var10 != null && this.func_104431_c(62, 24, 16, 16, var1, var2)) {
            this.func_104432_a(var10, var1, var2);
         } else if(this.func_104431_c(120, 24, 16, 16, var1, var2)) {
            this.func_104432_a(var11, var1, var2);
         }

         GL11.glPopMatrix();
         GL11.glEnable(2896);
         GL11.glEnable(2929);
         C_101210_aqj.func_112011_b();
      }

   }

   public C_100891_wu func_104453_g() {
      return this.field_104457_o;
   }
}
