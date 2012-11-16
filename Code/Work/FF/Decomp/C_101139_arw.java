import java.net.URI;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class C_101139_arw extends C_101278_asw {

   public void func_104037_A_() {
      this.field_104050_h.clear();
      byte var1 = -16;
      this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 - 116, this.field_104045_g / 4 + 132 + var1, 114, 20, C_100359_bd.func_107638_a("demo.help.buy")));
      this.field_104050_h.add(new C_101133_arl(2, this.field_104044_f / 2 + 2, this.field_104045_g / 4 + 132 + var1, 114, 20, C_100359_bd.func_107638_a("demo.help.later")));
   }

   protected void func_104040_a(C_101133_arl var1) {
      switch(var1.field_103908_f) {
      case 1:
         var1.field_103909_g = false;

         try {
            Class var2 = Class.forName("java.awt.Desktop");
            Object var3 = var2.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
            var2.getMethod("browse", new Class[]{URI.class}).invoke(var3, new Object[]{new URI("http://www.minecraft.net/store?source=demo")});
         } catch (Throwable var4) {
            var4.printStackTrace();
         }
         break;
      case 2:
         this.field_104046_e.func_105053_a((C_101278_asw)null);
         this.field_104046_e.func_105057_h();
      }

   }

   public void func_104039_c() {
      super.func_104039_c();
   }

   public void func_104035_z_() {
      super.func_104035_z_();
      int var1 = this.field_104046_e.field_105127_o.func_110367_b("/gui/demo_bg.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(var1);
      int var2 = (this.field_104044_f - 248) / 2;
      int var3 = (this.field_104045_g - 166) / 2;
      this.func_103877_b(var2, var3, 0, 0, 248, 166);
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      int var4 = (this.field_104044_f - 248) / 2 + 10;
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a("demo.help.title"), var4, 44, 2039583);
      C_101125_ard var6 = this.field_104046_e.field_105156_y;
      byte var7 = 60;
      String var5 = C_100359_bd.func_107638_a("demo.help.movementShort");
      var5 = String.format(var5, new Object[]{Keyboard.getKeyName(var6.field_111693_A.field_111989_d), Keyboard.getKeyName(var6.field_111694_B.field_111989_d), Keyboard.getKeyName(var6.field_111695_C.field_111989_d), Keyboard.getKeyName(var6.field_111689_D.field_111989_d)});
      this.field_104049_k.func_111798_b(var5, var4, var7, 5197647);
      var5 = C_100359_bd.func_107638_a("demo.help.movementMouse");
      this.field_104049_k.func_111798_b(var5, var4, var7 + 12, 5197647);
      var5 = C_100359_bd.func_107638_a("demo.help.jump");
      var5 = String.format(var5, new Object[]{Keyboard.getKeyName(var6.field_111690_E.field_111989_d)});
      this.field_104049_k.func_111798_b(var5, var4, var7 + 24, 5197647);
      var5 = C_100359_bd.func_107638_a("demo.help.inventory");
      var5 = String.format(var5, new Object[]{Keyboard.getKeyName(var6.field_111691_F.field_111989_d)});
      this.field_104049_k.func_111798_b(var5, var4, var7 + 36, 5197647);
      this.field_104049_k.func_111801_b(C_100359_bd.func_107638_a("demo.help.fullWrapped"), var4, var7 + 68, 218, 2039583);
      super.func_104027_a(var1, var2, var3);
   }
}
