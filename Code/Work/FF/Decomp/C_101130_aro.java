import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class C_101130_aro extends C_101278_asw {

   private String field_104094_b = "";
   private int field_104095_c = -1;
   private boolean field_104093_d = false;
   private boolean field_104101_m = false;
   private int field_104099_n = 0;
   private List field_104100_o = new ArrayList();
   private URI field_104098_p = null;
   protected C_101146_ary field_104097_a;
   private String field_104096_q = "";


   public C_101130_aro() {}

   public C_101130_aro(String var1) {
      this.field_104096_q = var1;
   }

   public void func_104037_A_() {
      Keyboard.enableRepeatEvents(true);
      this.field_104095_c = this.field_104046_e.field_105137_v.func_103991_b().func_103884_b().size();
      this.field_104097_a = new C_101146_ary(this.field_104049_k, 4, this.field_104045_g - 12, this.field_104044_f - 4, 12);
      this.field_104097_a.func_103963_f(100);
      this.field_104097_a.func_103945_a(false);
      this.field_104097_a.func_103955_b(true);
      this.field_104097_a.func_103940_a(this.field_104096_q);
      this.field_104097_a.func_103965_d(false);
   }

   public void func_104038_b() {
      Keyboard.enableRepeatEvents(false);
      this.field_104046_e.field_105137_v.func_103991_b().func_103893_c();
   }

   public void func_104039_c() {
      this.field_104097_a.func_103938_a();
   }

   protected void func_104032_a(char var1, int var2) {
      this.field_104101_m = false;
      if(var2 == 15) {
         this.func_104088_y_();
      } else {
         this.field_104093_d = false;
      }

      if(var2 == 1) {
         this.field_104046_e.func_105053_a((C_101278_asw)null);
      } else if(var2 == 28) {
         String var3 = this.field_104097_a.func_103939_b().trim();
         if(var3.length() > 0) {
            this.field_104046_e.field_105137_v.func_103991_b().func_103895_b(var3);
            if(!this.field_104046_e.func_105089_c(var3)) {
               this.field_104046_e.field_105120_g.func_104556_c(var3);
            }
         }

         this.field_104046_e.func_105053_a((C_101278_asw)null);
      } else if(var2 == 200) {
         this.func_104089_a(-1);
      } else if(var2 == 208) {
         this.func_104089_a(1);
      } else if(var2 == 201) {
         this.field_104046_e.field_105137_v.func_103991_b().func_103886_b(19);
      } else if(var2 == 209) {
         this.field_104046_e.field_105137_v.func_103991_b().func_103886_b(-19);
      } else {
         this.field_104097_a.func_103961_a(var1, var2);
      }

   }

   public void func_104030_d() {
      super.func_104030_d();
      int var1 = Mouse.getEventDWheel();
      if(var1 != 0) {
         if(var1 > 1) {
            var1 = 1;
         }

         if(var1 < -1) {
            var1 = -1;
         }

         if(!func_104041_p()) {
            var1 *= 7;
         }

         this.field_104046_e.field_105137_v.func_103991_b().func_103886_b(var1);
      }

   }

   protected void func_104028_a(int var1, int var2, int var3) {
      if(var3 == 0 && this.field_104046_e.field_105156_y.field_111742_p) {
         C_101154_ase var4 = this.field_104046_e.field_105137_v.func_103991_b().func_103891_a(Mouse.getX(), Mouse.getY());
         if(var4 != null) {
            URI var5 = var4.func_111831_g();
            if(var5 != null) {
               if(this.field_104046_e.field_105156_y.field_111740_q) {
                  this.field_104098_p = var5;
                  this.field_104046_e.func_105053_a(new C_101129_arp(this, this, var4.func_111832_f(), 0, var4));
               } else {
                  this.func_104092_a(var5);
               }

               return;
            }
         }
      }

      this.field_104097_a.func_103952_a(var1, var2, var3);
      super.func_104028_a(var1, var2, var3);
   }

   public void func_104042_a(boolean var1, int var2) {
      if(var2 == 0) {
         if(var1) {
            this.func_104092_a(this.field_104098_p);
         }

         this.field_104098_p = null;
         this.field_104046_e.func_105053_a(this);
      }

   }

   private void func_104092_a(URI var1) {
      try {
         Class var2 = Class.forName("java.awt.Desktop");
         Object var3 = var2.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
         var2.getMethod("browse", new Class[]{URI.class}).invoke(var3, new Object[]{var1});
      } catch (Throwable var4) {
         var4.printStackTrace();
      }

   }

   public void func_104088_y_() {
      String var3;
      if(this.field_104093_d) {
         this.field_104097_a.func_103935_b(this.field_104097_a.func_103957_a(-1, this.field_104097_a.func_103958_h(), false) - this.field_104097_a.func_103958_h());
         if(this.field_104099_n >= this.field_104100_o.size()) {
            this.field_104099_n = 0;
         }
      } else {
         int var1 = this.field_104097_a.func_103957_a(-1, this.field_104097_a.func_103958_h(), false);
         this.field_104100_o.clear();
         this.field_104099_n = 0;
         String var2 = this.field_104097_a.func_103939_b().substring(var1).toLowerCase();
         var3 = this.field_104097_a.func_103939_b().substring(0, this.field_104097_a.func_103958_h());
         this.func_104090_a(var3, var2);
         if(this.field_104100_o.isEmpty()) {
            return;
         }

         this.field_104093_d = true;
         this.field_104097_a.func_103935_b(var1 - this.field_104097_a.func_103958_h());
      }

      if(this.field_104100_o.size() > 1) {
         StringBuilder var4 = new StringBuilder();

         for(Iterator var5 = this.field_104100_o.iterator(); var5.hasNext(); var4.append(var3)) {
            var3 = (String)var5.next();
            if(var4.length() > 0) {
               var4.append(", ");
            }
         }

         this.field_104046_e.field_105137_v.func_103991_b().func_103892_a(var4.toString(), 1);
      }

      this.field_104097_a.func_103951_b((String)this.field_104100_o.get(this.field_104099_n++));
   }

   private void func_104090_a(String var1, String var2) {
      if(var1.length() >= 1) {
         this.field_104046_e.field_105120_g.field_104564_a.func_107034_c(new C_100397_cl(var1));
         this.field_104101_m = true;
      }
   }

   public void func_104089_a(int var1) {
      int var2 = this.field_104095_c + var1;
      int var3 = this.field_104046_e.field_105137_v.func_103991_b().func_103884_b().size();
      if(var2 < 0) {
         var2 = 0;
      }

      if(var2 > var3) {
         var2 = var3;
      }

      if(var2 != this.field_104095_c) {
         if(var2 == var3) {
            this.field_104095_c = var3;
            this.field_104097_a.func_103940_a(this.field_104094_b);
         } else {
            if(this.field_104095_c == var3) {
               this.field_104094_b = this.field_104097_a.func_103939_b();
            }

            this.field_104097_a.func_103940_a((String)this.field_104046_e.field_105137_v.func_103991_b().func_103884_b().get(var2));
            this.field_104095_c = var2;
         }
      }
   }

   public void func_104027_a(int var1, int var2, float var3) {
      func_103882_a(2, this.field_104045_g - 14, this.field_104044_f - 2, this.field_104045_g - 2, Integer.MIN_VALUE);
      this.field_104097_a.func_103954_f();
      super.func_104027_a(var1, var2, var3);
   }

   public void func_104091_a(String[] var1) {
      if(this.field_104101_m) {
         this.field_104100_o.clear();
         String[] var2 = var1;
         int var3 = var1.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = var2[var4];
            if(var5.length() > 0) {
               this.field_104100_o.add(var5);
            }
         }

         if(this.field_104100_o.size() > 0) {
            this.field_104093_d = true;
            this.func_104088_y_();
         }
      }

   }

   public boolean func_104031_f() {
      return false;
   }
}
