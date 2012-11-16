import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class C_101132_arm extends C_101155_asd {

   private final Minecraft field_103900_a;
   private final List field_103898_b = new ArrayList();
   private final List field_103899_c = new ArrayList();
   private int field_103896_d = 0;
   private boolean field_103897_e = false;


   public C_101132_arm(Minecraft var1) {
      this.field_103900_a = var1;
   }

   public void func_103890_a(int var1) {
      if(this.field_103900_a.field_105156_y.field_111722_n != 2) {
         byte var2 = 10;
         boolean var3 = false;
         int var4 = 0;
         int var5 = this.field_103899_c.size();
         float var6 = this.field_103900_a.field_105156_y.field_111739_r * 0.9F + 0.1F;
         if(var5 > 0) {
            if(this.func_103888_d()) {
               var2 = 20;
               var3 = true;
            }

            int var7;
            int var9;
            int var12;
            for(var7 = 0; var7 + this.field_103896_d < this.field_103899_c.size() && var7 < var2; ++var7) {
               C_101208_aqh var8 = (C_101208_aqh)this.field_103899_c.get(var7 + this.field_103896_d);
               if(var8 != null) {
                  var9 = var1 - var8.func_111996_b();
                  if(var9 < 200 || var3) {
                     double var10 = (double)var9 / 200.0D;
                     var10 = 1.0D - var10;
                     var10 *= 10.0D;
                     if(var10 < 0.0D) {
                        var10 = 0.0D;
                     }

                     if(var10 > 1.0D) {
                        var10 = 1.0D;
                     }

                     var10 *= var10;
                     var12 = (int)(255.0D * var10);
                     if(var3) {
                        var12 = 255;
                     }

                     var12 = (int)((float)var12 * var6);
                     ++var4;
                     if(var12 > 3) {
                        byte var13 = 3;
                        int var14 = -var7 * 9;
                        func_103882_a(var13, var14 - 1, var13 + 320 + 4, var14 + 8, var12 / 2 << 24);
                        GL11.glEnable(3042);
                        String var15 = var8.func_111994_a();
                        if(!this.field_103900_a.field_105156_y.field_111723_o) {
                           var15 = C_100679_kd.func_109122_a(var15);
                        }

                        this.field_103900_a.field_105148_p.func_111783_a(var15, var13, var14, 16777215 + (var12 << 24));
                     }
                  }
               }
            }

            if(var3) {
               var7 = this.field_103900_a.field_105148_p.field_111811_b;
               GL11.glTranslatef(0.0F, (float)var7, 0.0F);
               int var16 = var5 * var7 + var5;
               var9 = var4 * var7 + var4;
               int var17 = this.field_103896_d * var9 / var5;
               int var11 = var9 * var9 / var16;
               if(var16 != var9) {
                  var12 = var17 > 0?170:96;
                  int var18 = this.field_103897_e?13382451:3355562;
                  func_103882_a(0, -var17, 2, -var17 - var11, var18 + (var12 << 24));
                  func_103882_a(2, -var17, 1, -var17 - var11, 13421772 + (var12 << 24));
               }
            }

         }
      }
   }

   public void func_103889_a() {
      this.field_103899_c.clear();
      this.field_103898_b.clear();
   }

   public void func_103894_a(String var1) {
      this.func_103892_a(var1, 0);
   }

   public void func_103892_a(String var1, int var2) {
      boolean var3 = this.func_103888_d();
      boolean var4 = true;
      if(var2 != 0) {
         this.func_103887_c(var2);
      }

      Iterator var5 = this.field_103900_a.field_105148_p.func_111793_c(var1, 320).iterator();

      while(var5.hasNext()) {
         String var6 = (String)var5.next();
         if(var3 && this.field_103896_d > 0) {
            this.field_103897_e = true;
            this.func_103886_b(1);
         }

         if(!var4) {
            var6 = " " + var6;
         }

         var4 = false;
         this.field_103899_c.add(0, new C_101208_aqh(this.field_103900_a.field_105137_v.func_103994_c(), var6, var2));
      }

      while(this.field_103899_c.size() > 100) {
         this.field_103899_c.remove(this.field_103899_c.size() - 1);
      }

   }

   public List func_103884_b() {
      return this.field_103898_b;
   }

   public void func_103895_b(String var1) {
      if(this.field_103898_b.isEmpty() || !((String)this.field_103898_b.get(this.field_103898_b.size() - 1)).equals(var1)) {
         this.field_103898_b.add(var1);
      }

   }

   public void func_103893_c() {
      this.field_103896_d = 0;
      this.field_103897_e = false;
   }

   public void func_103886_b(int var1) {
      this.field_103896_d += var1;
      int var2 = this.field_103899_c.size();
      if(this.field_103896_d > var2 - 20) {
         this.field_103896_d = var2 - 20;
      }

      if(this.field_103896_d <= 0) {
         this.field_103896_d = 0;
         this.field_103897_e = false;
      }

   }

   public C_101154_ase func_103891_a(int var1, int var2) {
      if(!this.func_103888_d()) {
         return null;
      } else {
         C_101277_asx var3 = new C_101277_asx(this.field_103900_a.field_105156_y, this.field_103900_a.field_105124_c, this.field_103900_a.field_105121_d);
         int var4 = var3.func_112362_e();
         int var5 = var1 / var4 - 3;
         int var6 = var2 / var4 - 40;
         if(var5 >= 0 && var6 >= 0) {
            int var7 = Math.min(20, this.field_103899_c.size());
            if(var5 <= 320 && var6 < this.field_103900_a.field_105148_p.field_111811_b * var7 + var7) {
               int var8 = var6 / (this.field_103900_a.field_105148_p.field_111811_b + 1) + this.field_103896_d;
               return new C_101154_ase(this.field_103900_a.field_105148_p, (C_101208_aqh)this.field_103899_c.get(var8), var5, var6 - (var8 - this.field_103896_d) * this.field_103900_a.field_105148_p.field_111811_b + var8);
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   public void func_103885_a(String var1, Object ... var2) {
      this.func_103894_a(C_100361_be.func_107654_a().func_107649_a(var1, var2));
   }

   public boolean func_103888_d() {
      return this.field_103900_a.field_105144_r instanceof C_101130_aro;
   }

   public void func_103887_c(int var1) {
      Iterator var2 = this.field_103899_c.iterator();

      C_101208_aqh var3;
      do {
         if(!var2.hasNext()) {
            return;
         }

         var3 = (C_101208_aqh)var2.next();
      } while(var3.func_111995_c() != var1);

      var2.remove();
   }
}
