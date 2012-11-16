import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_101304_atj extends C_101278_asw {

   private static C_100059_bag field_104379_c = new C_100059_bag();
   protected C_101278_asw field_104381_a;
   protected String field_104378_b = "Select world";
   private C_101280_atm field_104377_d;
   private C_101282_atn field_104384_m;
   private C_101284_atk field_104382_n;
   private C_100100_bda field_104383_o;
   private C_101275_asy field_104380_p = null;


   public C_101304_atj(C_101278_asw var1, C_100100_bda var2) {
      this.field_104381_a = var1;
      this.field_104383_o = var2;
   }

   public void func_104037_A_() {
      this.field_104378_b = C_100359_bd.func_107638_a("gui.stats");
      this.field_104377_d = new C_101280_atm(this);
      this.field_104377_d.func_105832_a(this.field_104050_h, 1, 1);
      this.field_104384_m = new C_101282_atn(this);
      this.field_104384_m.func_105832_a(this.field_104050_h, 1, 1);
      this.field_104382_n = new C_101284_atk(this);
      this.field_104382_n.func_105832_a(this.field_104050_h, 1, 1);
      this.field_104380_p = this.field_104377_d;
      this.func_104372_g();
   }

   public void func_104372_g() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 + 4, this.field_104045_g - 28, 150, 20, var1.func_107651_b("gui.done")));
      this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 - 154, this.field_104045_g - 52, 100, 20, var1.func_107651_b("stat.generalButton")));
      C_101133_arl var2;
      this.field_104050_h.add(var2 = new C_101133_arl(2, this.field_104044_f / 2 - 46, this.field_104045_g - 52, 100, 20, var1.func_107651_b("stat.blocksButton")));
      C_101133_arl var3;
      this.field_104050_h.add(var3 = new C_101133_arl(3, this.field_104044_f / 2 + 62, this.field_104045_g - 52, 100, 20, var1.func_107651_b("stat.itemsButton")));
      if(this.field_104382_n.func_105830_a() == 0) {
         var2.field_103909_g = false;
      }

      if(this.field_104384_m.func_105830_a() == 0) {
         var3.field_103909_g = false;
      }

   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f == 0) {
            this.field_104046_e.func_105053_a(this.field_104381_a);
         } else if(var1.field_103908_f == 1) {
            this.field_104380_p = this.field_104377_d;
         } else if(var1.field_103908_f == 3) {
            this.field_104380_p = this.field_104384_m;
         } else if(var1.field_103908_f == 2) {
            this.field_104380_p = this.field_104382_n;
         } else {
            this.field_104380_p.func_105834_a(var1);
         }

      }
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.field_104380_p.func_105826_a(var1, var2, var3);
      this.func_103879_a(this.field_104049_k, this.field_104378_b, this.field_104044_f / 2, 20, 16777215);
      super.func_104027_a(var1, var2, var3);
   }

   private void func_104362_c(int var1, int var2, int var3) {
      this.func_104369_b(var1 + 1, var2 + 1);
      GL11.glEnable('\u803a');
      C_101210_aqj.func_112012_c();
      field_104379_c.func_105499_a(this.field_104049_k, this.field_104046_e.field_105127_o, new C_100994_tv(var3, 1, 0), var1 + 2, var2 + 2);
      C_101210_aqj.func_112010_a();
      GL11.glDisable('\u803a');
   }

   private void func_104369_b(int var1, int var2) {
      this.func_104363_c(var1, var2, 0, 0);
   }

   private void func_104363_c(int var1, int var2, int var3, int var4) {
      int var5 = this.field_104046_e.field_105127_o.func_110367_b("/gui/slot.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(var5);
      C_100872_azb var10 = C_100872_azb.field_110346_a;
      var10.func_110330_b();
      var10.func_110322_a((double)(var1 + 0), (double)(var2 + 18), (double)this.field_103883_j, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var10.func_110322_a((double)(var1 + 18), (double)(var2 + 18), (double)this.field_103883_j, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var10.func_110322_a((double)(var1 + 18), (double)(var2 + 0), (double)this.field_103883_j, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var10.func_110322_a((double)(var1 + 0), (double)(var2 + 0), (double)this.field_103883_j, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var10.func_110329_a();
   }

   // $FF: synthetic method
   static Minecraft func_104358_a(C_101304_atj var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static C_101153_asb func_104355_b(C_101304_atj var0) {
      return var0.field_104049_k;
   }

   // $FF: synthetic method
   static C_100100_bda func_104360_c(C_101304_atj var0) {
      return var0.field_104383_o;
   }

   // $FF: synthetic method
   static C_101153_asb func_104376_d(C_101304_atj var0) {
      return var0.field_104049_k;
   }

   // $FF: synthetic method
   static C_101153_asb func_104371_e(C_101304_atj var0) {
      return var0.field_104049_k;
   }

   // $FF: synthetic method
   static Minecraft func_104365_f(C_101304_atj var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static void func_104366_a(C_101304_atj var0, int var1, int var2, int var3, int var4) {
      var0.func_104363_c(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   static Minecraft func_104361_g(C_101304_atj var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static C_101153_asb func_104370_h(C_101304_atj var0) {
      return var0.field_104049_k;
   }

   // $FF: synthetic method
   static C_101153_asb func_104374_i(C_101304_atj var0) {
      return var0.field_104049_k;
   }

   // $FF: synthetic method
   static C_101153_asb func_104356_j(C_101304_atj var0) {
      return var0.field_104049_k;
   }

   // $FF: synthetic method
   static C_101153_asb func_104367_k(C_101304_atj var0) {
      return var0.field_104049_k;
   }

   // $FF: synthetic method
   static C_101153_asb func_104357_l(C_101304_atj var0) {
      return var0.field_104049_k;
   }

   // $FF: synthetic method
   static void func_104359_a(C_101304_atj var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.func_103881_a(var1, var2, var3, var4, var5, var6);
   }

   // $FF: synthetic method
   static C_101153_asb func_104368_m(C_101304_atj var0) {
      return var0.field_104049_k;
   }

   // $FF: synthetic method
   static C_101153_asb func_104373_n(C_101304_atj var0) {
      return var0.field_104049_k;
   }

   // $FF: synthetic method
   static void func_104375_b(C_101304_atj var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.func_103881_a(var1, var2, var3, var4, var5, var6);
   }

   // $FF: synthetic method
   static C_101153_asb func_104354_o(C_101304_atj var0) {
      return var0.field_104049_k;
   }

   // $FF: synthetic method
   static void func_104364_a(C_101304_atj var0, int var1, int var2, int var3) {
      var0.func_104362_c(var1, var2, var3);
   }

}
