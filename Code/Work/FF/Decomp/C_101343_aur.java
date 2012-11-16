import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_101343_aur extends C_101155_asd {

   private List field_104022_a = new ArrayList();
   private Minecraft field_104021_b;


   public C_101343_aur(Minecraft var1) {
      this.field_104021_b = var1;
   }

   public void func_104020_a() {
      for(int var1 = 0; var1 < this.field_104022_a.size(); ++var1) {
         C_101341_auq var2 = (C_101341_auq)this.field_104022_a.get(var1);
         var2.func_112596_a();
         var2.func_112598_a(this);
         if(var2.field_112612_h) {
            this.field_104022_a.remove(var1--);
         }
      }

   }

   public void func_104019_a(float var1) {
      this.field_104021_b.field_105127_o.func_110368_b(this.field_104021_b.field_105127_o.func_110367_b("/gui/particles.png"));
      Iterator var2 = this.field_104022_a.iterator();

      while(var2.hasNext()) {
         C_101341_auq var3 = (C_101341_auq)var2.next();
         int var4 = (int)(var3.field_112604_c + (var3.field_112605_a - var3.field_112604_c) * (double)var1 - 4.0D);
         int var5 = (int)(var3.field_112601_d + (var3.field_112603_b - var3.field_112601_d) * (double)var1 - 4.0D);
         float var6 = (float)(var3.field_112615_r + (var3.field_112606_n - var3.field_112615_r) * (double)var1);
         float var7 = (float)(var3.field_112607_o + (var3.field_112611_k - var3.field_112607_o) * (double)var1);
         float var8 = (float)(var3.field_112617_p + (var3.field_112608_l - var3.field_112617_p) * (double)var1);
         float var9 = (float)(var3.field_112616_q + (var3.field_112609_m - var3.field_112616_q) * (double)var1);
         GL11.glColor4f(var7, var8, var9, var6);
         this.func_103877_b(var4, var5, 40, 0, 8, 8);
      }

   }
}
