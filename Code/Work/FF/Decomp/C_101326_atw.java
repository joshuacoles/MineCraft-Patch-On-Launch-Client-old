import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class C_101326_atw extends C_101278_asw {

   private final C_101095_qg field_104401_a;
   private final C_100994_tv field_104399_b;
   private final boolean field_104400_c;
   private boolean field_104398_d;
   private boolean field_104404_m;
   private int field_104402_n;
   private int field_104403_o = 192;
   private int field_104412_p = 192;
   private int field_104411_q = 1;
   private int field_104410_r;
   private C_100339_bp field_104409_s;
   private String field_104408_t = "";
   private C_101325_atx field_104407_u;
   private C_101325_atx field_104406_v;
   private C_101133_arl field_104405_w;
   private C_101133_arl field_104415_x;
   private C_101133_arl field_104414_y;
   private C_101133_arl field_104413_z;


   public C_101326_atw(C_101095_qg var1, C_100994_tv var2, boolean var3) {
      this.field_104401_a = var1;
      this.field_104399_b = var2;
      this.field_104400_c = var3;
      if(var2.func_111339_o()) {
         C_100353_bh var4 = var2.func_111352_p();
         this.field_104409_s = var4.func_107513_m("pages");
         if(this.field_104409_s != null) {
            this.field_104409_s = (C_100339_bp)this.field_104409_s.func_107485_b();
            this.field_104411_q = this.field_104409_s.func_107501_c();
            if(this.field_104411_q < 1) {
               this.field_104411_q = 1;
            }
         }
      }

      if(this.field_104409_s == null && var3) {
         this.field_104409_s = new C_100339_bp("pages");
         this.field_104409_s.func_107500_a(new C_100333_bt("1", ""));
         this.field_104411_q = 1;
      }

   }

   public void func_104039_c() {
      super.func_104039_c();
      ++this.field_104402_n;
   }

   public void func_104037_A_() {
      this.field_104050_h.clear();
      Keyboard.enableRepeatEvents(true);
      if(this.field_104400_c) {
         this.field_104050_h.add(this.field_104415_x = new C_101133_arl(3, this.field_104044_f / 2 - 100, 4 + this.field_104412_p, 98, 20, C_100359_bd.func_107638_a("book.signButton")));
         this.field_104050_h.add(this.field_104405_w = new C_101133_arl(0, this.field_104044_f / 2 + 2, 4 + this.field_104412_p, 98, 20, C_100359_bd.func_107638_a("gui.done")));
         this.field_104050_h.add(this.field_104414_y = new C_101133_arl(5, this.field_104044_f / 2 - 100, 4 + this.field_104412_p, 98, 20, C_100359_bd.func_107638_a("book.finalizeButton")));
         this.field_104050_h.add(this.field_104413_z = new C_101133_arl(4, this.field_104044_f / 2 + 2, 4 + this.field_104412_p, 98, 20, C_100359_bd.func_107638_a("gui.cancel")));
      } else {
         this.field_104050_h.add(this.field_104405_w = new C_101133_arl(0, this.field_104044_f / 2 - 100, 4 + this.field_104412_p, 200, 20, C_100359_bd.func_107638_a("gui.done")));
      }

      int var1 = (this.field_104044_f - this.field_104403_o) / 2;
      byte var2 = 2;
      this.field_104050_h.add(this.field_104407_u = new C_101325_atx(1, var1 + 120, var2 + 154, true));
      this.field_104050_h.add(this.field_104406_v = new C_101325_atx(2, var1 + 38, var2 + 154, false));
      this.func_104393_g();
   }

   public void func_104038_b() {
      Keyboard.enableRepeatEvents(false);
   }

   private void func_104393_g() {
      this.field_104407_u.field_103915_h = !this.field_104404_m && (this.field_104410_r < this.field_104411_q - 1 || this.field_104400_c);
      this.field_104406_v.field_103915_h = !this.field_104404_m && this.field_104410_r > 0;
      this.field_104405_w.field_103915_h = !this.field_104400_c || !this.field_104404_m;
      if(this.field_104400_c) {
         this.field_104415_x.field_103915_h = !this.field_104404_m;
         this.field_104413_z.field_103915_h = this.field_104404_m;
         this.field_104414_y.field_103915_h = this.field_104404_m;
         this.field_104414_y.field_103909_g = this.field_104408_t.trim().length() > 0;
      }

   }

   private void func_104395_a(boolean var1) {
      if(this.field_104400_c && this.field_104398_d) {
         if(this.field_104409_s != null) {
            while(this.field_104409_s.func_107501_c() > 1) {
               C_100333_bt var2 = (C_100333_bt)this.field_104409_s.func_107498_b(this.field_104409_s.func_107501_c() - 1);
               if(var2.field_107495_a != null && var2.field_107495_a.length() != 0) {
                  break;
               }

               this.field_104409_s.func_107499_a(this.field_104409_s.func_107501_c() - 1);
            }

            if(this.field_104399_b.func_111339_o()) {
               C_100353_bh var7 = this.field_104399_b.func_111352_p();
               var7.func_107530_a("pages", this.field_104409_s);
            } else {
               this.field_104399_b.func_111359_a("pages", this.field_104409_s);
            }

            String var8 = "MC|BEdit";
            if(var1) {
               var8 = "MC|BSign";
               this.field_104399_b.func_111359_a("author", new C_100333_bt("author", this.field_104401_a.field_103847_bT));
               this.field_104399_b.func_111359_a("title", new C_100333_bt("title", this.field_104408_t.trim()));
               this.field_104399_b.field_111397_c = C_100992_tt.field_110971_bG.field_110891_cf;
            }

            ByteArrayOutputStream var3 = new ByteArrayOutputStream();
            DataOutputStream var4 = new DataOutputStream(var3);

            try {
               C_100219_dx.func_106555_a(this.field_104399_b, var4);
               this.field_104046_e.func_105068_r().func_107034_c(new C_100367_da(var8, var3.toByteArray()));
            } catch (Exception var6) {
               var6.printStackTrace();
            }
         }

      }
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f == 0) {
            this.field_104046_e.func_105053_a((C_101278_asw)null);
            this.func_104395_a(false);
         } else if(var1.field_103908_f == 3 && this.field_104400_c) {
            this.field_104404_m = true;
         } else if(var1.field_103908_f == 1) {
            if(this.field_104410_r < this.field_104411_q - 1) {
               ++this.field_104410_r;
            } else if(this.field_104400_c) {
               this.func_104397_h();
               if(this.field_104410_r < this.field_104411_q - 1) {
                  ++this.field_104410_r;
               }
            }
         } else if(var1.field_103908_f == 2) {
            if(this.field_104410_r > 0) {
               --this.field_104410_r;
            }
         } else if(var1.field_103908_f == 5 && this.field_104404_m) {
            this.func_104395_a(true);
            this.field_104046_e.func_105053_a((C_101278_asw)null);
         } else if(var1.field_103908_f == 4 && this.field_104404_m) {
            this.field_104404_m = false;
         }

         this.func_104393_g();
      }
   }

   private void func_104397_h() {
      if(this.field_104409_s != null && this.field_104409_s.func_107501_c() < 50) {
         this.field_104409_s.func_107500_a(new C_100333_bt("" + (this.field_104411_q + 1), ""));
         ++this.field_104411_q;
         this.field_104398_d = true;
      }
   }

   protected void func_104032_a(char var1, int var2) {
      super.func_104032_a(var1, var2);
      if(this.field_104400_c) {
         if(this.field_104404_m) {
            this.func_104394_c(var1, var2);
         } else {
            this.func_104396_b(var1, var2);
         }

      }
   }

   private void func_104396_b(char var1, int var2) {
      switch(var1) {
      case 22:
         this.func_104392_b(C_101278_asw.func_104033_l());
         return;
      default:
         switch(var2) {
         case 14:
            String var3 = this.func_104390_i();
            if(var3.length() > 0) {
               this.func_104391_a(var3.substring(0, var3.length() - 1));
            }

            return;
         case 28:
            this.func_104392_b("\n");
            return;
         default:
            if(C_100011_m.func_105259_a(var1)) {
               this.func_104392_b(Character.toString(var1));
            }
         }
      }
   }

   private void func_104394_c(char var1, int var2) {
      switch(var2) {
      case 14:
         if(this.field_104408_t.length() > 0) {
            this.field_104408_t = this.field_104408_t.substring(0, this.field_104408_t.length() - 1);
            this.func_104393_g();
         }

         return;
      case 28:
         if(this.field_104408_t.length() > 0) {
            this.func_104395_a(true);
            this.field_104046_e.func_105053_a((C_101278_asw)null);
         }

         return;
      default:
         if(this.field_104408_t.length() < 16 && C_100011_m.func_105259_a(var1)) {
            this.field_104408_t = this.field_104408_t + Character.toString(var1);
            this.func_104393_g();
            this.field_104398_d = true;
         }
      }
   }

   private String func_104390_i() {
      if(this.field_104409_s != null && this.field_104410_r >= 0 && this.field_104410_r < this.field_104409_s.func_107501_c()) {
         C_100333_bt var1 = (C_100333_bt)this.field_104409_s.func_107498_b(this.field_104410_r);
         return var1.toString();
      } else {
         return "";
      }
   }

   private void func_104391_a(String var1) {
      if(this.field_104409_s != null && this.field_104410_r >= 0 && this.field_104410_r < this.field_104409_s.func_107501_c()) {
         C_100333_bt var2 = (C_100333_bt)this.field_104409_s.func_107498_b(this.field_104410_r);
         var2.field_107495_a = var1;
         this.field_104398_d = true;
      }

   }

   private void func_104392_b(String var1) {
      String var2 = this.func_104390_i();
      String var3 = var2 + var1;
      int var4 = this.field_104049_k.func_111789_b(var3 + "§0_", 118);
      if(var4 <= 118 && var3.length() < 256) {
         this.func_104391_a(var3);
      }

   }

   public void func_104027_a(int var1, int var2, float var3) {
      int var4 = this.field_104046_e.field_105127_o.func_110367_b("/gui/book.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(var4);
      int var5 = (this.field_104044_f - this.field_104403_o) / 2;
      byte var6 = 2;
      this.func_103877_b(var5, var6, 0, 0, this.field_104403_o, this.field_104412_p);
      String var7;
      String var8;
      int var9;
      if(this.field_104404_m) {
         var7 = this.field_104408_t;
         if(this.field_104400_c) {
            if(this.field_104402_n / 6 % 2 == 0) {
               var7 = var7 + "§0_";
            } else {
               var7 = var7 + "§7_";
            }
         }

         var8 = C_100359_bd.func_107638_a("book.editTitle");
         var9 = this.field_104049_k.func_111778_a(var8);
         this.field_104049_k.func_111798_b(var8, var5 + 36 + (116 - var9) / 2, var6 + 16 + 16, 0);
         int var10 = this.field_104049_k.func_111778_a(var7);
         this.field_104049_k.func_111798_b(var7, var5 + 36 + (116 - var10) / 2, var6 + 48, 0);
         String var11 = String.format(C_100359_bd.func_107638_a("book.byAuthor"), new Object[]{this.field_104401_a.field_103847_bT});
         int var12 = this.field_104049_k.func_111778_a(var11);
         this.field_104049_k.func_111798_b("§8" + var11, var5 + 36 + (116 - var12) / 2, var6 + 48 + 10, 0);
         String var13 = C_100359_bd.func_107638_a("book.finalizeWarning");
         this.field_104049_k.func_111801_b(var13, var5 + 36, var6 + 80, 116, 0);
      } else {
         var7 = String.format(C_100359_bd.func_107638_a("book.pageIndicator"), new Object[]{Integer.valueOf(this.field_104410_r + 1), Integer.valueOf(this.field_104411_q)});
         var8 = "";
         if(this.field_104409_s != null && this.field_104410_r >= 0 && this.field_104410_r < this.field_104409_s.func_107501_c()) {
            C_100333_bt var14 = (C_100333_bt)this.field_104409_s.func_107498_b(this.field_104410_r);
            var8 = var14.toString();
         }

         if(this.field_104400_c) {
            if(this.field_104049_k.func_111788_b()) {
               var8 = var8 + "_";
            } else if(this.field_104402_n / 6 % 2 == 0) {
               var8 = var8 + "§0_";
            } else {
               var8 = var8 + "§7_";
            }
         }

         var9 = this.field_104049_k.func_111778_a(var7);
         this.field_104049_k.func_111798_b(var7, var5 - var9 + this.field_104403_o - 44, var6 + 16, 0);
         this.field_104049_k.func_111801_b(var8, var5 + 36, var6 + 16 + 16, 116, 0);
      }

      super.func_104027_a(var1, var2, var3);
   }
}
