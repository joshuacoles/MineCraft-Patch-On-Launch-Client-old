import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import javax.imageio.ImageIO;

class C_101206_aqf extends Canvas {

   private BufferedImage field_111981_a;


   public C_101206_aqf() {
      try {
         this.field_111981_a = ImageIO.read(C_101205_aqd.class.getResource("/gui/crash_logo.png"));
      } catch (IOException var2) {
         ;
      }

      byte var1 = 100;
      this.setPreferredSize(new Dimension(var1, var1));
      this.setMinimumSize(new Dimension(var1, var1));
   }

   public void paint(Graphics var1) {
      super.paint(var1);
      var1.drawImage(this.field_111981_a, this.getWidth() / 2 - this.field_111981_a.getWidth() / 2, 32, (ImageObserver)null);
   }
}
