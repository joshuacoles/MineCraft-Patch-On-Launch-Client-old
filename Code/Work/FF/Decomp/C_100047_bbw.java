import org.lwjgl.opengl.GL11;

public class C_100047_bbw extends C_100044_bbz {

   public static C_100047_bbw field_105569_a;
   private C_101247_avu field_105568_c = new C_101247_avu(0, 0, 64, 32);
   private C_101247_avu field_105567_d = new C_101247_avu(0, 0, 64, 64);


   public void func_105566_a(C_100415_amk var1, double var2, double var4, double var6, float var8) {
      this.func_105565_a((float)var2, (float)var4, (float)var6, var1.func_102919_p() & 7, (float)(var1.func_102967_b() * 360) / 16.0F, var1.func_102965_a(), var1.func_102968_c());
   }

   public void func_105556_a(C_100042_bby var1) {
      super.func_105556_a(var1);
      field_105569_a = this;
   }

   public void func_105565_a(float var1, float var2, float var3, int var4, float var5, int var6, String var7) {
      C_101247_avu var8 = this.field_105568_c;
      switch(var6) {
      case 0:
      default:
         this.func_105558_a("/mob/skeleton.png");
         break;
      case 1:
         this.func_105558_a("/mob/skeleton_wither.png");
         break;
      case 2:
         this.func_105558_a("/mob/zombie.png");
         var8 = this.field_105567_d;
         break;
      case 3:
         if(var7 != null && var7.length() > 0) {
            String var9 = "http://skins.minecraft.net/MinecraftSkins/" + C_100679_kd.func_109122_a(var7) + ".png";
            if(!field_105569_a.field_105561_b.field_105544_e.func_110381_c(var9)) {
               field_105569_a.field_105561_b.field_105544_e.func_110373_a(var9, new C_100862_ayz());
            }

            this.func_105559_a(var9, "/mob/char.png");
         } else {
            this.func_105558_a("/mob/char.png");
         }
         break;
      case 4:
         this.func_105558_a("/mob/creeper.png");
      }

      GL11.glPushMatrix();
      GL11.glDisable(2884);
      if(var4 != 1) {
         switch(var4) {
         case 2:
            GL11.glTranslatef(var1 + 0.5F, var2 + 0.25F, var3 + 0.74F);
            break;
         case 3:
            GL11.glTranslatef(var1 + 0.5F, var2 + 0.25F, var3 + 0.26F);
            var5 = 180.0F;
            break;
         case 4:
            GL11.glTranslatef(var1 + 0.74F, var2 + 0.25F, var3 + 0.5F);
            var5 = 270.0F;
            break;
         case 5:
         default:
            GL11.glTranslatef(var1 + 0.26F, var2 + 0.25F, var3 + 0.5F);
            var5 = 90.0F;
         }
      } else {
         GL11.glTranslatef(var1 + 0.5F, var2, var3 + 0.5F);
      }

      float var10 = 0.0625F;
      GL11.glEnable('\u803a');
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      GL11.glEnable(3008);
      var8.func_112027_a((C_100730_lb)null, 0.0F, 0.0F, 0.0F, var5, 0.0F, var10);
      GL11.glPopMatrix();
   }
}
