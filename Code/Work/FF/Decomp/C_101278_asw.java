import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class C_101278_asw extends C_101155_asd {

   protected Minecraft field_104046_e;
   public int field_104044_f;
   public int field_104045_g;
   protected List field_104050_h = new ArrayList();
   public boolean field_104051_i = false;
   protected C_101153_asb field_104049_k;
   public C_101343_aur field_104048_l;
   private C_101133_arl field_104047_a = null;


   public void func_104027_a(int var1, int var2, float var3) {
      Iterator var4 = this.field_104050_h.iterator();

      while(var4.hasNext()) {
         C_101133_arl var5 = (C_101133_arl)var4.next();
         var5.func_103903_a(this.field_104046_e, var1, var2);
      }

   }

   protected void func_104032_a(char var1, int var2) {
      if(var2 == 1) {
         this.field_104046_e.func_105053_a((C_101278_asw)null);
         this.field_104046_e.func_105057_h();
      }

   }

   public static String func_104033_l() {
      try {
         Transferable var0 = Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object)null);
         if(var0 != null && var0.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            return (String)var0.getTransferData(DataFlavor.stringFlavor);
         }
      } catch (Exception var1) {
         ;
      }

      return "";
   }

   public static void func_104029_d(String var0) {
      try {
         StringSelection var1 = new StringSelection(var0);
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(var1, (ClipboardOwner)null);
      } catch (Exception var2) {
         ;
      }

   }

   protected void func_104028_a(int var1, int var2, int var3) {
      if(var3 == 0) {
         for(int var4 = 0; var4 < this.field_104050_h.size(); ++var4) {
            C_101133_arl var5 = (C_101133_arl)this.field_104050_h.get(var4);
            if(var5.func_103902_c(this.field_104046_e, var1, var2)) {
               this.field_104047_a = var5;
               this.field_104046_e.field_105097_A.func_105895_a("random.click", 1.0F, 1.0F);
               this.func_104040_a(var5);
            }
         }
      }

   }

   protected void func_104043_b(int var1, int var2, int var3) {
      if(this.field_104047_a != null && var3 == 0) {
         this.field_104047_a.func_103907_a(var1, var2);
         this.field_104047_a = null;
      }

   }

   protected void func_104040_a(C_101133_arl var1) {}

   public void func_104036_a(Minecraft var1, int var2, int var3) {
      this.field_104048_l = new C_101343_aur(var1);
      this.field_104046_e = var1;
      this.field_104049_k = var1.field_105148_p;
      this.field_104044_f = var2;
      this.field_104045_g = var3;
      this.field_104050_h.clear();
      this.func_104037_A_();
   }

   public void func_104037_A_() {}

   public void func_104026_m() {
      while(Mouse.next()) {
         this.func_104030_d();
      }

      while(Keyboard.next()) {
         this.func_104024_n();
      }

   }

   public void func_104030_d() {
      int var1;
      int var2;
      if(Mouse.getEventButtonState()) {
         var1 = Mouse.getEventX() * this.field_104044_f / this.field_104046_e.field_105124_c;
         var2 = this.field_104045_g - Mouse.getEventY() * this.field_104045_g / this.field_104046_e.field_105121_d - 1;
         this.func_104028_a(var1, var2, Mouse.getEventButton());
      } else {
         var1 = Mouse.getEventX() * this.field_104044_f / this.field_104046_e.field_105124_c;
         var2 = this.field_104045_g - Mouse.getEventY() * this.field_104045_g / this.field_104046_e.field_105121_d - 1;
         this.func_104043_b(var1, var2, Mouse.getEventButton());
      }

   }

   public void func_104024_n() {
      if(Keyboard.getEventKeyState()) {
         if(Keyboard.getEventKey() == 87) {
            this.field_104046_e.func_105032_k();
            return;
         }

         this.func_104032_a(Keyboard.getEventCharacter(), Keyboard.getEventKey());
      }

   }

   public void func_104039_c() {}

   public void func_104038_b() {}

   public void func_104035_z_() {
      this.func_104023_b(0);
   }

   public void func_104023_b(int var1) {
      if(this.field_104046_e.field_105122_e != null) {
         this.func_103881_a(0, 0, this.field_104044_f, this.field_104045_g, -1072689136, -804253680);
      } else {
         this.func_104034_c(var1);
      }

   }

   public void func_104034_c(int var1) {
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      C_100872_azb var2 = C_100872_azb.field_110346_a;
      GL11.glBindTexture(3553, this.field_104046_e.field_105127_o.func_110367_b("/gui/background.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var3 = 32.0F;
      var2.func_110330_b();
      var2.func_110326_d(4210752);
      var2.func_110322_a(0.0D, (double)this.field_104045_g, 0.0D, 0.0D, (double)((float)this.field_104045_g / var3 + (float)var1));
      var2.func_110322_a((double)this.field_104044_f, (double)this.field_104045_g, 0.0D, (double)((float)this.field_104044_f / var3), (double)((float)this.field_104045_g / var3 + (float)var1));
      var2.func_110322_a((double)this.field_104044_f, 0.0D, 0.0D, (double)((float)this.field_104044_f / var3), (double)var1);
      var2.func_110322_a(0.0D, 0.0D, 0.0D, 0.0D, (double)var1);
      var2.func_110329_a();
   }

   public boolean func_104031_f() {
      return true;
   }

   public void func_104042_a(boolean var1, int var2) {}

   public static boolean func_104025_o() {
      return Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157) || Minecraft.func_105065_c() == C_101120_aqy.field_111624_d && (Keyboard.isKeyDown(219) || Keyboard.isKeyDown(220));
   }

   public static boolean func_104041_p() {
      return Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54);
   }
}
