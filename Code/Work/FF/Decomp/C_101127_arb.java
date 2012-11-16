import java.awt.Component;
import org.lwjgl.input.Mouse;

public class C_101127_arb {

   private Component field_111759_c;
   public int field_111760_a;
   public int field_111758_b;


   public C_101127_arb(Component var1) {
      this.field_111759_c = var1;
   }

   public void func_111755_a() {
      Mouse.setGrabbed(true);
      this.field_111760_a = 0;
      this.field_111758_b = 0;
   }

   public void func_111756_b() {
      Mouse.setCursorPosition(this.field_111759_c.getWidth() / 2, this.field_111759_c.getHeight() / 2);
      Mouse.setGrabbed(false);
   }

   public void func_111757_c() {
      this.field_111760_a = Mouse.getDX();
      this.field_111758_b = Mouse.getDY();
   }
}
