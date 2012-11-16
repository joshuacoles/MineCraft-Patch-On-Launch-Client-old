import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class C_101122_arg implements C_100683_ka {

   private String field_104301_a = "";
   private Minecraft field_104299_b;
   private String field_104300_c = "";
   private long field_104297_d = Minecraft.func_105063_F();
   private boolean field_104298_e = false;


   public C_101122_arg(Minecraft var1) {
      this.field_104299_b = var1;
   }

   public void func_104293_b(String var1) {
      this.field_104298_e = false;
      this.func_104296_d(var1);
   }

   public void func_104292_a(String var1) {
      this.field_104298_e = true;
      this.func_104296_d(var1);
   }

   public void func_104296_d(String var1) {
      this.field_104300_c = var1;
      if(!this.field_104299_b.field_105106_J) {
         if(!this.field_104298_e) {
            throw new C_101136_ari();
         }
      } else {
         C_101277_asx var2 = new C_101277_asx(this.field_104299_b.field_105156_y, this.field_104299_b.field_105124_c, this.field_104299_b.field_105121_d);
         GL11.glClear(256);
         GL11.glMatrixMode(5889);
         GL11.glLoadIdentity();
         GL11.glOrtho(0.0D, var2.func_112364_c(), var2.func_112361_d(), 0.0D, 100.0D, 300.0D);
         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         GL11.glTranslatef(0.0F, 0.0F, -200.0F);
      }
   }

   public void func_104291_c(String var1) {
      if(!this.field_104299_b.field_105106_J) {
         if(!this.field_104298_e) {
            throw new C_101136_ari();
         }
      } else {
         this.field_104297_d = 0L;
         this.field_104301_a = var1;
         this.func_104290_a(-1);
         this.field_104297_d = 0L;
      }
   }

   public void func_104290_a(int var1) {
      if(!this.field_104299_b.field_105106_J) {
         if(!this.field_104298_e) {
            throw new C_101136_ari();
         }
      } else {
         long var2 = Minecraft.func_105063_F();
         if(var2 - this.field_104297_d >= 100L) {
            this.field_104297_d = var2;
            C_101277_asx var4 = new C_101277_asx(this.field_104299_b.field_105156_y, this.field_104299_b.field_105124_c, this.field_104299_b.field_105121_d);
            int var5 = var4.func_112363_a();
            int var6 = var4.func_112365_b();
            GL11.glClear(256);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glOrtho(0.0D, var4.func_112364_c(), var4.func_112361_d(), 0.0D, 100.0D, 300.0D);
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0F, 0.0F, -200.0F);
            GL11.glClear(16640);
            C_100872_azb var7 = C_100872_azb.field_110346_a;
            int var8 = this.field_104299_b.field_105127_o.func_110367_b("/gui/background.png");
            GL11.glBindTexture(3553, var8);
            float var9 = 32.0F;
            var7.func_110330_b();
            var7.func_110326_d(4210752);
            var7.func_110322_a(0.0D, (double)var6, 0.0D, 0.0D, (double)((float)var6 / var9));
            var7.func_110322_a((double)var5, (double)var6, 0.0D, (double)((float)var5 / var9), (double)((float)var6 / var9));
            var7.func_110322_a((double)var5, 0.0D, 0.0D, (double)((float)var5 / var9), 0.0D);
            var7.func_110322_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
            var7.func_110329_a();
            if(var1 >= 0) {
               byte var10 = 100;
               byte var11 = 2;
               int var12 = var5 / 2 - var10 / 2;
               int var13 = var6 / 2 + 16;
               GL11.glDisable(3553);
               var7.func_110330_b();
               var7.func_110326_d(8421504);
               var7.func_110325_a((double)var12, (double)var13, 0.0D);
               var7.func_110325_a((double)var12, (double)(var13 + var11), 0.0D);
               var7.func_110325_a((double)(var12 + var10), (double)(var13 + var11), 0.0D);
               var7.func_110325_a((double)(var12 + var10), (double)var13, 0.0D);
               var7.func_110326_d(8454016);
               var7.func_110325_a((double)var12, (double)var13, 0.0D);
               var7.func_110325_a((double)var12, (double)(var13 + var11), 0.0D);
               var7.func_110325_a((double)(var12 + var1), (double)(var13 + var11), 0.0D);
               var7.func_110325_a((double)(var12 + var1), (double)var13, 0.0D);
               var7.func_110329_a();
               GL11.glEnable(3553);
            }

            this.field_104299_b.field_105148_p.func_111783_a(this.field_104300_c, (var5 - this.field_104299_b.field_105148_p.func_111778_a(this.field_104300_c)) / 2, var6 / 2 - 4 - 16, 16777215);
            this.field_104299_b.field_105148_p.func_111783_a(this.field_104301_a, (var5 - this.field_104299_b.field_105148_p.func_111778_a(this.field_104301_a)) / 2, var6 / 2 - 4 + 8, 16777215);
            Display.update();

            try {
               Thread.yield();
            } catch (Exception var14) {
               ;
            }

         }
      }
   }

   public void func_104289_a() {}
}
