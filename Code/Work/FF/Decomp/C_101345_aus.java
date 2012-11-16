import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class C_101345_aus extends C_101278_asw {

   private int field_104428_a = 0;
   private List field_104426_b;
   private int field_104427_c = 0;
   private float field_104425_d = 0.5F;


   public void func_104039_c() {
      ++this.field_104428_a;
      float var1 = (float)(this.field_104427_c + this.field_104045_g + this.field_104045_g + 24) / this.field_104425_d;
      if((float)this.field_104428_a > var1) {
         this.func_104423_g();
      }

   }

   protected void func_104032_a(char var1, int var2) {
      if(var2 == 1) {
         this.func_104423_g();
      }

   }

   private void func_104423_g() {
      this.field_104046_e.field_105120_g.field_104564_a.func_107034_c(new C_100388_co(1));
      this.field_104046_e.func_105053_a((C_101278_asw)null);
   }

   public boolean func_104031_f() {
      return true;
   }

   public void func_104037_A_() {
      if(this.field_104426_b == null) {
         this.field_104426_b = new ArrayList();

         try {
            String var1 = "";
            String var2 = "§f§k§a§b";
            short var3 = 274;
            BufferedReader var4 = new BufferedReader(new InputStreamReader(C_101345_aus.class.getResourceAsStream("/title/win.txt"), Charset.forName("UTF-8")));
            Random var5 = new Random(8124371L);

            int var6;
            while((var1 = var4.readLine()) != null) {
               String var7;
               String var8;
               for(var1 = var1.replaceAll("PLAYERNAME", this.field_104046_e.field_105130_j.field_111761_b); var1.contains(var2); var1 = var7 + "§f§k" + "XXXXXXXX".substring(0, var5.nextInt(4) + 3) + var8) {
                  var6 = var1.indexOf(var2);
                  var7 = var1.substring(0, var6);
                  var8 = var1.substring(var6 + var2.length());
               }

               this.field_104426_b.addAll(this.field_104046_e.field_105148_p.func_111793_c(var1, var3));
               this.field_104426_b.add("");
            }

            for(var6 = 0; var6 < 8; ++var6) {
               this.field_104426_b.add("");
            }

            var4 = new BufferedReader(new InputStreamReader(C_101345_aus.class.getResourceAsStream("/title/credits.txt"), Charset.forName("UTF-8")));

            while((var1 = var4.readLine()) != null) {
               var1 = var1.replaceAll("PLAYERNAME", this.field_104046_e.field_105130_j.field_111761_b);
               var1 = var1.replaceAll("\t", "    ");
               this.field_104426_b.addAll(this.field_104046_e.field_105148_p.func_111793_c(var1, var3));
               this.field_104426_b.add("");
            }

            this.field_104427_c = this.field_104426_b.size() * 12;
         } catch (Exception var9) {
            var9.printStackTrace();
         }

      }
   }

   private void func_104424_b(int var1, int var2, float var3) {
      C_100872_azb var4 = C_100872_azb.field_110346_a;
      GL11.glBindTexture(3553, this.field_104046_e.field_105127_o.func_110367_b("%blur%/gui/background.png"));
      var4.func_110330_b();
      var4.func_110317_a(1.0F, 1.0F, 1.0F, 1.0F);
      int var5 = this.field_104044_f;
      float var6 = 0.0F - ((float)this.field_104428_a + var3) * 0.5F * this.field_104425_d;
      float var7 = (float)this.field_104045_g - ((float)this.field_104428_a + var3) * 0.5F * this.field_104425_d;
      float var8 = 0.015625F;
      float var9 = ((float)this.field_104428_a + var3 - 0.0F) * 0.02F;
      float var10 = (float)(this.field_104427_c + this.field_104045_g + this.field_104045_g + 24) / this.field_104425_d;
      float var11 = (var10 - 20.0F - ((float)this.field_104428_a + var3)) * 0.0050F;
      if(var11 < var9) {
         var9 = var11;
      }

      if(var9 > 1.0F) {
         var9 = 1.0F;
      }

      var9 *= var9;
      var9 = var9 * 96.0F / 255.0F;
      var4.func_110334_a(var9, var9, var9);
      var4.func_110322_a(0.0D, (double)this.field_104045_g, (double)this.field_103883_j, 0.0D, (double)(var6 * var8));
      var4.func_110322_a((double)var5, (double)this.field_104045_g, (double)this.field_103883_j, (double)((float)var5 * var8), (double)(var6 * var8));
      var4.func_110322_a((double)var5, 0.0D, (double)this.field_103883_j, (double)((float)var5 * var8), (double)(var7 * var8));
      var4.func_110322_a(0.0D, 0.0D, (double)this.field_103883_j, 0.0D, (double)(var7 * var8));
      var4.func_110329_a();
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104424_b(var1, var2, var3);
      C_100872_azb var4 = C_100872_azb.field_110346_a;
      short var5 = 274;
      int var6 = this.field_104044_f / 2 - var5 / 2;
      int var7 = this.field_104045_g + 50;
      float var8 = -((float)this.field_104428_a + var3) * this.field_104425_d;
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, var8, 0.0F);
      GL11.glBindTexture(3553, this.field_104046_e.field_105127_o.func_110367_b("/title/mclogo.png"));
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.func_103877_b(var6, var7, 0, 0, 155, 44);
      this.func_103877_b(var6 + 155, var7, 0, 45, 155, 44);
      var4.func_110326_d(16777215);
      int var9 = var7 + 200;

      int var10;
      for(var10 = 0; var10 < this.field_104426_b.size(); ++var10) {
         if(var10 == this.field_104426_b.size() - 1) {
            float var11 = (float)var9 + var8 - (float)(this.field_104045_g / 2 - 6);
            if(var11 < 0.0F) {
               GL11.glTranslatef(0.0F, -var11, 0.0F);
            }
         }

         if((float)var9 + var8 + 12.0F + 8.0F > 0.0F && (float)var9 + var8 < (float)this.field_104045_g) {
            String var12 = (String)this.field_104426_b.get(var10);
            if(var12.startsWith("[C]")) {
               this.field_104049_k.func_111783_a(var12.substring(3), var6 + (var5 - this.field_104049_k.func_111778_a(var12.substring(3))) / 2, var9, 16777215);
            } else {
               this.field_104049_k.field_111812_c.setSeed((long)var10 * 4238972211L + (long)(this.field_104428_a / 4));
               this.field_104049_k.func_111783_a(var12, var6, var9, 16777215);
            }
         }

         var9 += 12;
      }

      GL11.glPopMatrix();
      GL11.glBindTexture(3553, this.field_104046_e.field_105127_o.func_110367_b("%blur%/misc/vignette.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(0, 769);
      var4.func_110330_b();
      var4.func_110317_a(1.0F, 1.0F, 1.0F, 1.0F);
      var10 = this.field_104044_f;
      int var13 = this.field_104045_g;
      var4.func_110322_a(0.0D, (double)var13, (double)this.field_103883_j, 0.0D, 1.0D);
      var4.func_110322_a((double)var10, (double)var13, (double)this.field_103883_j, 1.0D, 1.0D);
      var4.func_110322_a((double)var10, 0.0D, (double)this.field_103883_j, 1.0D, 0.0D);
      var4.func_110322_a(0.0D, 0.0D, (double)this.field_103883_j, 0.0D, 0.0D);
      var4.func_110329_a();
      GL11.glDisable(3042);
      super.func_104027_a(var1, var2, var3);
   }
}
