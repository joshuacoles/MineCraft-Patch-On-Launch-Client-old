import java.util.Collection;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public abstract class C_101352_aug extends C_101288_atq {

   private boolean field_104459_o;


   public C_101352_aug(C_101075_qy var1) {
      super(var1);
   }

   public void func_104037_A_() {
      super.func_104037_A_();
      if(!this.field_104046_e.field_105120_g.func_103291_bw().isEmpty()) {
         this.field_104445_m = 160 + (this.field_104044_f - this.field_104440_b - 200) / 2;
         this.field_104459_o = true;
      }

   }

   public void func_104027_a(int var1, int var2, float var3) {
      super.func_104027_a(var1, var2, var3);
      if(this.field_104459_o) {
         this.func_104458_g();
      }

   }

   private void func_104458_g() {
      int var1 = this.field_104445_m - 124;
      int var2 = this.field_104443_n;
      Collection var4 = this.field_104046_e.field_105120_g.func_103291_bw();
      if(!var4.isEmpty()) {
         int var5 = this.field_104046_e.field_105127_o.func_110367_b("/gui/inventory.png");
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(2896);
         int var6 = 33;
         if(var4.size() > 5) {
            var6 = 132 / (var4.size() - 1);
         }

         for(Iterator var7 = this.field_104046_e.field_105120_g.func_103291_bw().iterator(); var7.hasNext(); var2 += var6) {
            C_100692_kx var8 = (C_100692_kx)var7.next();
            C_100690_kw var9 = C_100690_kw.field_109169_a[var8.func_109197_a()];
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.field_104046_e.field_105127_o.func_110368_b(var5);
            this.func_103877_b(var1, var2, 0, 166, 140, 32);
            if(var9.func_109141_d()) {
               int var10 = var9.func_109134_e();
               this.func_103877_b(var1 + 6, var2 + 7, 0 + var10 % 8 * 18, 198 + var10 / 8 * 18, 18, 18);
            }

            String var12 = C_100359_bd.func_107638_a(var9.func_109135_a());
            if(var8.func_109192_c() == 1) {
               var12 = var12 + " II";
            } else if(var8.func_109192_c() == 2) {
               var12 = var12 + " III";
            } else if(var8.func_109192_c() == 3) {
               var12 = var12 + " IV";
            }

            this.field_104049_k.func_111783_a(var12, var1 + 10 + 18, var2 + 6, 16777215);
            String var11 = C_100690_kw.func_109144_a(var8);
            this.field_104049_k.func_111783_a(var11, var1 + 10 + 18, var2 + 6 + 10, 8355711);
         }

      }
   }
}
