import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public class C_101138_arv extends C_101278_asw {

   private int field_104142_a;


   public void func_104037_A_() {
      this.field_104050_h.clear();
      if(this.field_104046_e.field_105122_e.func_109429_J().func_107145_t()) {
         if(this.field_104046_e.func_105064_A()) {
            this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 96, C_100359_bd.func_107638_a("deathScreen.deleteWorld")));
         } else {
            this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 96, C_100359_bd.func_107638_a("deathScreen.leaveServer")));
         }
      } else {
         this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 72, C_100359_bd.func_107638_a("deathScreen.respawn")));
         this.field_104050_h.add(new C_101133_arl(2, this.field_104044_f / 2 - 100, this.field_104045_g / 4 + 96, C_100359_bd.func_107638_a("deathScreen.titleScreen")));
         if(this.field_104046_e.field_105130_j == null) {
            ((C_101133_arl)this.field_104050_h.get(1)).field_103909_g = false;
         }
      }

      C_101133_arl var2;
      for(Iterator var1 = this.field_104050_h.iterator(); var1.hasNext(); var2.field_103909_g = false) {
         var2 = (C_101133_arl)var1.next();
      }

   }

   protected void func_104032_a(char var1, int var2) {}

   protected void func_104040_a(C_101133_arl var1) {
      switch(var1.field_103908_f) {
      case 1:
         this.field_104046_e.field_105120_g.func_103791_bR();
         this.field_104046_e.func_105053_a((C_101278_asw)null);
         break;
      case 2:
         this.field_104046_e.field_105122_e.func_109472_B();
         this.field_104046_e.func_105083_a((C_100942_awz)null);
         this.field_104046_e.func_105053_a(new C_100098_bcz());
      }

   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_103881_a(0, 0, this.field_104044_f, this.field_104045_g, 1615855616, -1602211792);
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      boolean var4 = this.field_104046_e.field_105122_e.func_109429_J().func_107145_t();
      String var5 = var4?C_100359_bd.func_107638_a("deathScreen.title.hardcore"):C_100359_bd.func_107638_a("deathScreen.title");
      this.func_103879_a(this.field_104049_k, var5, this.field_104044_f / 2 / 2, 30, 16777215);
      GL11.glPopMatrix();
      if(var4) {
         this.func_103879_a(this.field_104049_k, C_100359_bd.func_107638_a("deathScreen.hardcoreInfo"), this.field_104044_f / 2, 144, 16777215);
      }

      this.func_103879_a(this.field_104049_k, C_100359_bd.func_107638_a("deathScreen.score") + ": §e" + this.field_104046_e.field_105120_g.func_103776_bM(), this.field_104044_f / 2, 100, 16777215);
      super.func_104027_a(var1, var2, var3);
   }

   public boolean func_104031_f() {
      return false;
   }

   public void func_104039_c() {
      super.func_104039_c();
      ++this.field_104142_a;
      C_101133_arl var2;
      if(this.field_104142_a == 20) {
         for(Iterator var1 = this.field_104050_h.iterator(); var1.hasNext(); var2.field_103909_g = true) {
            var2 = (C_101133_arl)var1.next();
         }
      }

   }
}
