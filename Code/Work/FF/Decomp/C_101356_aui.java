import java.util.Random;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class C_101356_aui extends C_101288_atq {

   private static C_101218_ava field_104482_w = new C_101218_ava();
   private Random field_104492_x = new Random();
   private C_101066_ri field_104491_y;
   public int field_104490_o;
   public float field_104489_p;
   public float field_104488_q;
   public float field_104487_r;
   public float field_104486_s;
   public float field_104485_t;
   public float field_104484_u;
   C_100994_tv field_104483_v;


   public C_101356_aui(C_101092_qf var1, C_100873_xe var2, int var3, int var4, int var5) {
      super(new C_101066_ri(var1, var2, var3, var4, var5));
      this.field_104491_y = (C_101066_ri)this.field_104439_d;
   }

   protected void func_104433_b(int var1, int var2) {
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a("container.enchant"), 12, 6, 4210752);
      this.field_104049_k.func_111798_b(C_100359_bd.func_107638_a("container.inventory"), 8, this.field_104441_c - 96 + 2, 4210752);
   }

   public void func_104039_c() {
      super.func_104039_c();
      this.func_104481_g();
   }

   protected void func_104028_a(int var1, int var2, int var3) {
      super.func_104028_a(var1, var2, var3);
      int var4 = (this.field_104044_f - this.field_104440_b) / 2;
      int var5 = (this.field_104045_g - this.field_104441_c) / 2;

      for(int var6 = 0; var6 < 3; ++var6) {
         int var7 = var1 - (var4 + 60);
         int var8 = var2 - (var5 + 14 + 19 * var6);
         if(var7 >= 0 && var8 >= 0 && var7 < 108 && var8 < 19 && this.field_104491_y.func_111508_a(this.field_104046_e.field_105120_g, var6)) {
            this.field_104046_e.field_105123_b.func_111067_a(this.field_104491_y.field_111514_c, var6);
         }
      }

   }

   protected void func_104430_a(float var1, int var2, int var3) {
      int var4 = this.field_104046_e.field_105127_o.func_110367_b("/gui/enchant.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(var4);
      int var5 = (this.field_104044_f - this.field_104440_b) / 2;
      int var6 = (this.field_104045_g - this.field_104441_c) / 2;
      this.func_103877_b(var5, var6, 0, 0, this.field_104440_b, this.field_104441_c);
      GL11.glPushMatrix();
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      C_101277_asx var7 = new C_101277_asx(this.field_104046_e.field_105156_y, this.field_104046_e.field_105124_c, this.field_104046_e.field_105121_d);
      GL11.glViewport((var7.func_112363_a() - 320) / 2 * var7.func_112362_e(), (var7.func_112365_b() - 240) / 2 * var7.func_112362_e(), 320 * var7.func_112362_e(), 240 * var7.func_112362_e());
      GL11.glTranslatef(-0.34F, 0.23F, 0.0F);
      GLU.gluPerspective(90.0F, 1.3333334F, 9.0F, 80.0F);
      float var8 = 1.0F;
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      C_101210_aqj.func_112011_b();
      GL11.glTranslatef(0.0F, 3.3F, -16.0F);
      GL11.glScalef(var8, var8, var8);
      float var9 = 5.0F;
      GL11.glScalef(var9, var9, var9);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(this.field_104046_e.field_105127_o.func_110367_b("/item/book.png"));
      GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
      float var10 = this.field_104484_u + (this.field_104485_t - this.field_104484_u) * var1;
      GL11.glTranslatef((1.0F - var10) * 0.2F, (1.0F - var10) * 0.1F, (1.0F - var10) * 0.25F);
      GL11.glRotatef(-(1.0F - var10) * 90.0F - 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      float var11 = this.field_104488_q + (this.field_104489_p - this.field_104488_q) * var1 + 0.25F;
      float var12 = this.field_104488_q + (this.field_104489_p - this.field_104488_q) * var1 + 0.75F;
      var11 = (var11 - (float)C_100650_jv.func_108932_b((double)var11)) * 1.6F - 0.3F;
      var12 = (var12 - (float)C_100650_jv.func_108932_b((double)var12)) * 1.6F - 0.3F;
      if(var11 < 0.0F) {
         var11 = 0.0F;
      }

      if(var12 < 0.0F) {
         var12 = 0.0F;
      }

      if(var11 > 1.0F) {
         var11 = 1.0F;
      }

      if(var12 > 1.0F) {
         var12 = 1.0F;
      }

      GL11.glEnable('\u803a');
      field_104482_w.func_112027_a((C_100730_lb)null, 0.0F, var11, var12, var10, 0.0F, 0.0625F);
      GL11.glDisable('\u803a');
      C_101210_aqj.func_112010_a();
      GL11.glMatrixMode(5889);
      GL11.glViewport(0, 0, this.field_104046_e.field_105124_c, this.field_104046_e.field_105121_d);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      C_101210_aqj.func_112010_a();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(var4);
      C_101354_auh.field_112622_a.func_112619_a(this.field_104491_y.field_111543_f);

      for(int var13 = 0; var13 < 3; ++var13) {
         String var14 = C_101354_auh.field_112622_a.func_112618_a();
         this.field_103883_j = 0.0F;
         this.field_104046_e.field_105127_o.func_110368_b(var4);
         int var15 = this.field_104491_y.field_111544_g[var13];
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         if(var15 == 0) {
            this.func_103877_b(var5 + 60, var6 + 14 + 19 * var13, 0, 185, 108, 19);
         } else {
            String var16 = "" + var15;
            C_101153_asb var17 = this.field_104046_e.field_105146_q;
            int var18 = 6839882;
            if(this.field_104046_e.field_105120_g.field_103866_cg < var15 && !this.field_104046_e.field_105120_g.field_103869_cf.field_111597_d) {
               this.func_103877_b(var5 + 60, var6 + 14 + 19 * var13, 0, 185, 108, 19);
               var17.func_111801_b(var14, var5 + 62, var6 + 16 + 19 * var13, 104, (var18 & 16711422) >> 1);
               var17 = this.field_104046_e.field_105148_p;
               var18 = 4226832;
               var17.func_111783_a(var16, var5 + 62 + 104 - var17.func_111778_a(var16), var6 + 16 + 19 * var13 + 7, var18);
            } else {
               int var19 = var2 - (var5 + 60);
               int var20 = var3 - (var6 + 14 + 19 * var13);
               if(var19 >= 0 && var20 >= 0 && var19 < 108 && var20 < 19) {
                  this.func_103877_b(var5 + 60, var6 + 14 + 19 * var13, 0, 204, 108, 19);
                  var18 = 16777088;
               } else {
                  this.func_103877_b(var5 + 60, var6 + 14 + 19 * var13, 0, 166, 108, 19);
               }

               var17.func_111801_b(var14, var5 + 62, var6 + 16 + 19 * var13, 104, var18);
               var17 = this.field_104046_e.field_105148_p;
               var18 = 8453920;
               var17.func_111783_a(var16, var5 + 62 + 104 - var17.func_111778_a(var16), var6 + 16 + 19 * var13 + 7, var18);
            }
         }
      }

   }

   public void func_104481_g() {
      C_100994_tv var1 = this.field_104439_d.func_111503_a(0).func_111446_c();
      if(!C_100994_tv.func_111340_b(var1, this.field_104483_v)) {
         this.field_104483_v = var1;

         do {
            this.field_104487_r += (float)(this.field_104492_x.nextInt(4) - this.field_104492_x.nextInt(4));
         } while(this.field_104489_p <= this.field_104487_r + 1.0F && this.field_104489_p >= this.field_104487_r - 1.0F);
      }

      ++this.field_104490_o;
      this.field_104488_q = this.field_104489_p;
      this.field_104484_u = this.field_104485_t;
      boolean var2 = false;

      for(int var3 = 0; var3 < 3; ++var3) {
         if(this.field_104491_y.field_111544_g[var3] != 0) {
            var2 = true;
         }
      }

      if(var2) {
         this.field_104485_t += 0.2F;
      } else {
         this.field_104485_t -= 0.2F;
      }

      if(this.field_104485_t < 0.0F) {
         this.field_104485_t = 0.0F;
      }

      if(this.field_104485_t > 1.0F) {
         this.field_104485_t = 1.0F;
      }

      float var5 = (this.field_104487_r - this.field_104489_p) * 0.4F;
      float var4 = 0.2F;
      if(var5 < -var4) {
         var5 = -var4;
      }

      if(var5 > var4) {
         var5 = var4;
      }

      this.field_104486_s += (var5 - this.field_104486_s) * 0.9F;
      this.field_104489_p += this.field_104486_s;
   }

}
