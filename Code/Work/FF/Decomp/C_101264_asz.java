import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;

public class C_101264_asz extends C_101278_asw {

   private final DateFormat field_104270_c = new SimpleDateFormat();
   protected C_101278_asw field_104271_a;
   protected String field_104269_b = "Select world";
   private boolean field_104268_d = false;
   private int field_104274_m;
   private List field_104272_n;
   private C_101268_ata field_104273_o;
   private String field_104282_p;
   private String field_104281_q;
   private String[] field_104280_r = new String[3];
   private boolean field_104279_s;
   private C_101133_arl field_104278_t;
   private C_101133_arl field_104277_u;
   private C_101133_arl field_104276_v;
   private C_101133_arl field_104275_w;


   public C_101264_asz(C_101278_asw var1) {
      this.field_104271_a = var1;
   }

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      this.field_104269_b = var1.func_107651_b("selectWorld.title");
      this.field_104282_p = var1.func_107651_b("selectWorld.world");
      this.field_104281_q = var1.func_107651_b("selectWorld.conversion");
      this.field_104280_r[C_100836_xn.field_110098_b.func_110090_a()] = var1.func_107651_b("gameMode.survival");
      this.field_104280_r[C_100836_xn.field_110099_c.func_110090_a()] = var1.func_107651_b("gameMode.creative");
      this.field_104280_r[C_100836_xn.field_110096_d.func_110090_a()] = var1.func_107651_b("gameMode.adventure");
      this.func_104267_h();
      this.field_104273_o = new C_101268_ata(this);
      this.field_104273_o.func_105832_a(this.field_104050_h, 4, 5);
      this.func_104260_g();
   }

   private void func_104267_h() {
      C_100270_agy var1 = this.field_104046_e.func_105080_d();
      this.field_104272_n = var1.func_107195_b();
      Collections.sort(this.field_104272_n);
      this.field_104274_m = -1;
   }

   protected String func_104263_a(int var1) {
      return ((C_100264_agz)this.field_104272_n.get(var1)).func_107115_a();
   }

   protected String func_104255_d(int var1) {
      String var2 = ((C_100264_agz)this.field_104272_n.get(var1)).func_107117_b();
      if(var2 == null || C_100650_jv.func_108930_a(var2)) {
         C_100361_be var3 = C_100361_be.func_107654_a();
         var2 = var3.func_107651_b("selectWorld.world") + " " + (var1 + 1);
      }

      return var2;
   }

   public void func_104260_g() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      this.field_104050_h.add(this.field_104277_u = new C_101133_arl(1, this.field_104044_f / 2 - 154, this.field_104045_g - 52, 150, 20, var1.func_107651_b("selectWorld.select")));
      this.field_104050_h.add(new C_101133_arl(3, this.field_104044_f / 2 + 4, this.field_104045_g - 52, 150, 20, var1.func_107651_b("selectWorld.create")));
      this.field_104050_h.add(this.field_104276_v = new C_101133_arl(6, this.field_104044_f / 2 - 154, this.field_104045_g - 28, 72, 20, var1.func_107651_b("selectWorld.rename")));
      this.field_104050_h.add(this.field_104278_t = new C_101133_arl(2, this.field_104044_f / 2 - 76, this.field_104045_g - 28, 72, 20, var1.func_107651_b("selectWorld.delete")));
      this.field_104050_h.add(this.field_104275_w = new C_101133_arl(7, this.field_104044_f / 2 + 4, this.field_104045_g - 28, 72, 20, var1.func_107651_b("selectWorld.recreate")));
      this.field_104050_h.add(new C_101133_arl(0, this.field_104044_f / 2 + 82, this.field_104045_g - 28, 72, 20, var1.func_107651_b("gui.cancel")));
      this.field_104277_u.field_103909_g = false;
      this.field_104278_t.field_103909_g = false;
      this.field_104276_v.field_103909_g = false;
      this.field_104275_w.field_103909_g = false;
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         if(var1.field_103908_f == 2) {
            String var2 = this.func_104255_d(this.field_104274_m);
            if(var2 != null) {
               this.field_104279_s = true;
               C_101141_arq var3 = func_104258_a(this, var2, this.field_104274_m);
               this.field_104046_e.func_105053_a(var3);
            }
         } else if(var1.field_103908_f == 1) {
            this.func_104256_e(this.field_104274_m);
         } else if(var1.field_103908_f == 3) {
            this.field_104046_e.func_105053_a(new C_101137_aru(this));
         } else if(var1.field_103908_f == 6) {
            this.field_104046_e.func_105053_a(new C_101279_asv(this, this.func_104263_a(this.field_104274_m)));
         } else if(var1.field_103908_f == 0) {
            this.field_104046_e.func_105053_a(this.field_104271_a);
         } else if(var1.field_103908_f == 7) {
            C_101137_aru var5 = new C_101137_aru(this);
            C_100268_agw var6 = this.field_104046_e.func_105080_d().func_107200_a(this.func_104263_a(this.field_104274_m), false);
            C_100269_agv var4 = var6.func_107088_d();
            var6.func_107090_a();
            var5.func_104111_a(var4);
            this.field_104046_e.func_105053_a(var5);
         } else {
            this.field_104273_o.func_105834_a(var1);
         }

      }
   }

   public void func_104256_e(int var1) {
      this.field_104046_e.func_105053_a((C_101278_asw)null);
      if(!this.field_104268_d) {
         this.field_104268_d = true;
         String var2 = this.func_104263_a(var1);
         if(var2 == null) {
            var2 = "World" + var1;
         }

         String var3 = this.func_104255_d(var1);
         if(var3 == null) {
            var3 = "World" + var1;
         }

         this.field_104046_e.func_105087_a(var2, var3, (C_100840_xm)null);
      }
   }

   public void func_104042_a(boolean var1, int var2) {
      if(this.field_104279_s) {
         this.field_104279_s = false;
         if(var1) {
            C_100270_agy var3 = this.field_104046_e.func_105080_d();
            var3.func_107196_d();
            var3.func_107198_e(this.func_104263_a(var2));
            this.func_104267_h();
         }

         this.field_104046_e.func_105053_a(this);
      }

   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.field_104273_o.func_105826_a(var1, var2, var3);
      this.func_103879_a(this.field_104049_k, this.field_104269_b, this.field_104044_f / 2, 20, 16777215);
      super.func_104027_a(var1, var2, var3);
   }

   public static C_101141_arq func_104258_a(C_101278_asw var0, String var1, int var2) {
      C_100361_be var3 = C_100361_be.func_107654_a();
      String var4 = var3.func_107651_b("selectWorld.deleteQuestion");
      String var5 = "\'" + var1 + "\' " + var3.func_107651_b("selectWorld.deleteWarning");
      String var6 = var3.func_107651_b("selectWorld.deleteButton");
      String var7 = var3.func_107651_b("gui.cancel");
      C_101141_arq var8 = new C_101141_arq(var0, var4, var5, var6, var7, var2);
      return var8;
   }

   // $FF: synthetic method
   static List func_104266_a(C_101264_asz var0) {
      return var0.field_104272_n;
   }

   // $FF: synthetic method
   static int func_104253_a(C_101264_asz var0, int var1) {
      return var0.field_104274_m = var1;
   }

   // $FF: synthetic method
   static int func_104264_b(C_101264_asz var0) {
      return var0.field_104274_m;
   }

   // $FF: synthetic method
   static C_101133_arl func_104262_c(C_101264_asz var0) {
      return var0.field_104277_u;
   }

   // $FF: synthetic method
   static C_101133_arl func_104254_d(C_101264_asz var0) {
      return var0.field_104278_t;
   }

   // $FF: synthetic method
   static C_101133_arl func_104265_e(C_101264_asz var0) {
      return var0.field_104276_v;
   }

   // $FF: synthetic method
   static C_101133_arl func_104252_f(C_101264_asz var0) {
      return var0.field_104275_w;
   }

   // $FF: synthetic method
   static String func_104257_g(C_101264_asz var0) {
      return var0.field_104282_p;
   }

   // $FF: synthetic method
   static DateFormat func_104251_h(C_101264_asz var0) {
      return var0.field_104270_c;
   }

   // $FF: synthetic method
   static String func_104261_i(C_101264_asz var0) {
      return var0.field_104281_q;
   }

   // $FF: synthetic method
   static String[] func_104259_j(C_101264_asz var0) {
      return var0.field_104280_r;
   }
}
