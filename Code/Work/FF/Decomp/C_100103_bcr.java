import java.io.File;
import java.io.IOException;
import java.net.URI;
import net.minecraft.client.Minecraft;
import org.lwjgl.Sys;

public class C_100103_bcr extends C_101278_asw {

   protected C_101278_asw field_104081_a;
   private int field_104079_b = -1;
   private String field_104080_c = "";
   private C_100102_bcs field_104078_d;


   public C_100103_bcr(C_101278_asw var1) {
      this.field_104081_a = var1;
   }

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      this.field_104050_h.add(new C_101300_atd(5, this.field_104044_f / 2 - 154, this.field_104045_g - 48, var1.func_107651_b("texturePack.openFolder")));
      this.field_104050_h.add(new C_101300_atd(6, this.field_104044_f / 2 + 4, this.field_104045_g - 48, var1.func_107651_b("gui.done")));
      this.field_104046_e.field_105099_C.func_105674_c();
      this.field_104080_c = (new File(Minecraft.func_105056_b(), "texturepacks")).getAbsolutePath();
      this.field_104078_d = new C_100102_bcs(this);
      this.field_104078_d.func_105832_a(this.field_104050_h, 7, 8);
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f == 5) {
            if(Minecraft.func_105065_c() == C_101120_aqy.field_111624_d) {
               try {
                  System.out.println(this.field_104080_c);
                  Runtime.getRuntime().exec(new String[]{"/usr/bin/open", this.field_104080_c});
                  return;
               } catch (IOException var7) {
                  var7.printStackTrace();
               }
            } else if(Minecraft.func_105065_c() == C_101120_aqy.field_111627_c) {
               String var2 = String.format("cmd.exe /C start \"Open file\" \"%s\"", new Object[]{this.field_104080_c});

               try {
                  Runtime.getRuntime().exec(var2);
                  return;
               } catch (IOException var6) {
                  var6.printStackTrace();
               }
            }

            boolean var8 = false;

            try {
               Class var3 = Class.forName("java.awt.Desktop");
               Object var4 = var3.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
               var3.getMethod("browse", new Class[]{URI.class}).invoke(var4, new Object[]{(new File(Minecraft.func_105056_b(), "texturepacks")).toURI()});
            } catch (Throwable var5) {
               var5.printStackTrace();
               var8 = true;
            }

            if(var8) {
               System.out.println("Opening via system class!");
               Sys.openURL("file://" + this.field_104080_c);
            }
         } else if(var1.field_103908_f == 6) {
            this.field_104046_e.field_105127_o.func_110380_b();
            this.field_104046_e.func_105053_a(this.field_104081_a);
         } else {
            this.field_104078_d.func_105834_a(var1);
         }

      }
   }

   protected void func_104028_a(int var1, int var2, int var3) {
      super.func_104028_a(var1, var2, var3);
   }

   protected void func_104043_b(int var1, int var2, int var3) {
      super.func_104043_b(var1, var2, var3);
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.field_104078_d.func_105826_a(var1, var2, var3);
      if(this.field_104079_b <= 0) {
         this.field_104046_e.field_105099_C.func_105674_c();
         this.field_104079_b += 20;
      }

      C_100361_be var4 = C_100361_be.func_107654_a();
      this.func_103879_a(this.field_104049_k, var4.func_107651_b("texturePack.title"), this.field_104044_f / 2, 16, 16777215);
      this.func_103879_a(this.field_104049_k, var4.func_107651_b("texturePack.folderInfo"), this.field_104044_f / 2 - 77, this.field_104045_g - 26, 8421504);
      super.func_104027_a(var1, var2, var3);
   }

   public void func_104039_c() {
      super.func_104039_c();
      --this.field_104079_b;
   }

   // $FF: synthetic method
   static Minecraft func_104075_a(C_100103_bcr var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static Minecraft func_104065_b(C_100103_bcr var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static Minecraft func_104069_c(C_100103_bcr var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static Minecraft func_104076_d(C_100103_bcr var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static Minecraft func_104074_e(C_100103_bcr var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static Minecraft func_104077_f(C_100103_bcr var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static Minecraft func_104072_g(C_100103_bcr var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static Minecraft func_104064_h(C_100103_bcr var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static Minecraft func_104066_i(C_100103_bcr var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static Minecraft func_104070_j(C_100103_bcr var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static Minecraft func_104073_k(C_100103_bcr var0) {
      return var0.field_104046_e;
   }

   // $FF: synthetic method
   static C_101153_asb func_104068_l(C_100103_bcr var0) {
      return var0.field_104049_k;
   }

   // $FF: synthetic method
   static C_101153_asb func_104071_m(C_100103_bcr var0) {
      return var0.field_104049_k;
   }

   // $FF: synthetic method
   static C_101153_asb func_104067_n(C_100103_bcr var0) {
      return var0.field_104049_k;
   }
}
