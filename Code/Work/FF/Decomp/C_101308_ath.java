import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_101308_ath extends C_101155_asd {

   private Minecraft field_104016_a;
   private int field_104014_b;
   private int field_104015_c;
   private String field_104012_d;
   private String field_104013_e;
   private C_100791_ix field_104010_f;
   private long field_104011_g;
   private C_100059_bag field_104017_h;
   private boolean field_104018_i;


   public C_101308_ath(Minecraft var1) {
      this.field_104016_a = var1;
      this.field_104017_h = new C_100059_bag();
   }

   public void func_104009_a(C_100791_ix var1) {
      this.field_104012_d = C_100359_bd.func_107638_a("achievement.get");
      this.field_104013_e = C_100359_bd.func_107638_a(var1.func_109913_i());
      this.field_104011_g = Minecraft.func_105063_F();
      this.field_104010_f = var1;
      this.field_104018_i = false;
   }

   public void func_104006_b(C_100791_ix var1) {
      this.field_104012_d = C_100359_bd.func_107638_a(var1.func_109913_i());
      this.field_104013_e = var1.func_109932_e();
      this.field_104011_g = Minecraft.func_105063_F() - 2500L;
      this.field_104010_f = var1;
      this.field_104018_i = true;
   }

   private void func_104008_b() {
      GL11.glViewport(0, 0, this.field_104016_a.field_105124_c, this.field_104016_a.field_105121_d);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      this.field_104014_b = this.field_104016_a.field_105124_c;
      this.field_104015_c = this.field_104016_a.field_105121_d;
      C_101277_asx var1 = new C_101277_asx(this.field_104016_a.field_105156_y, this.field_104016_a.field_105124_c, this.field_104016_a.field_105121_d);
      this.field_104014_b = var1.func_112363_a();
      this.field_104015_c = var1.func_112365_b();
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)this.field_104014_b, (double)this.field_104015_c, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
   }

   public void func_104007_a() {
      if(this.field_104010_f != null && this.field_104011_g != 0L) {
         double var1 = (double)(Minecraft.func_105063_F() - this.field_104011_g) / 3000.0D;
         if(!this.field_104018_i && (var1 < 0.0D || var1 > 1.0D)) {
            this.field_104011_g = 0L;
         } else {
            this.func_104008_b();
            GL11.glDisable(2929);
            GL11.glDepthMask(false);
            double var3 = var1 * 2.0D;
            if(var3 > 1.0D) {
               var3 = 2.0D - var3;
            }

            var3 *= 4.0D;
            var3 = 1.0D - var3;
            if(var3 < 0.0D) {
               var3 = 0.0D;
            }

            var3 *= var3;
            var3 *= var3;
            int var5 = this.field_104014_b - 160;
            int var6 = 0 - (int)(var3 * 36.0D);
            int var7 = this.field_104016_a.field_105127_o.func_110367_b("/achievement/bg.png");
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(3553);
            GL11.glBindTexture(3553, var7);
            GL11.glDisable(2896);
            this.func_103877_b(var5, var6, 96, 202, 160, 32);
            if(this.field_104018_i) {
               this.field_104016_a.field_105148_p.func_111801_b(this.field_104013_e, var5 + 30, var6 + 7, 120, -1);
            } else {
               this.field_104016_a.field_105148_p.func_111798_b(this.field_104012_d, var5 + 30, var6 + 7, -256);
               this.field_104016_a.field_105148_p.func_111798_b(this.field_104013_e, var5 + 30, var6 + 18, -1);
            }

            C_101210_aqj.func_112012_c();
            GL11.glDisable(2896);
            GL11.glEnable('\u803a');
            GL11.glEnable(2903);
            GL11.glEnable(2896);
            this.field_104017_h.func_105501_b(this.field_104016_a.field_105148_p, this.field_104016_a.field_105127_o, this.field_104010_f.field_109933_d, var5 + 8, var6 + 8);
            GL11.glDisable(2896);
            GL11.glDepthMask(true);
            GL11.glEnable(2929);
         }
      }
   }
}
