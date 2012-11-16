import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public class C_101290_atr extends C_101288_atq {

   private C_100425_alz field_104448_o;
   private C_101320_att field_104447_p;
   private boolean field_104446_q;


   public C_101290_atr(C_101092_qf var1, C_100425_alz var2) {
      super(new C_101076_qz(var1, var2));
      this.field_104448_o = var2;
      this.field_104440_b = 230;
      this.field_104441_c = 219;
   }

   public void func_104037_A_() {
      super.func_104037_A_();
      this.field_104050_h.add(this.field_104447_p = new C_101320_att(this, -1, this.field_104445_m + 164, this.field_104443_n + 107));
      this.field_104050_h.add(new C_101321_ats(this, -2, this.field_104445_m + 190, this.field_104443_n + 107));
      this.field_104446_q = true;
      this.field_104447_p.field_103909_g = false;
   }

   public void func_104039_c() {
      super.func_104039_c();
      if(this.field_104446_q && this.field_104448_o.func_103042_k() >= 0) {
         this.field_104446_q = false;

         int var2;
         int var3;
         int var4;
         int var5;
         C_101323_atu var6;
         for(int var1 = 0; var1 <= 2; ++var1) {
            var2 = C_100425_alz.field_103051_a[var1].length;
            var3 = var2 * 22 + (var2 - 1) * 2;

            for(var4 = 0; var4 < var2; ++var4) {
               var5 = C_100425_alz.field_103051_a[var1][var4].field_109159_H;
               var6 = new C_101323_atu(this, var1 << 8 | var5, this.field_104445_m + 76 + var4 * 24 - var3 / 2, this.field_104443_n + 22 + var1 * 25, var5, var1);
               this.field_104050_h.add(var6);
               if(var1 >= this.field_104448_o.func_103042_k()) {
                  var6.field_103909_g = false;
               } else if(var5 == this.field_104448_o.func_103038_i()) {
                  var6.func_103922_b(true);
               }
            }
         }

         byte var7 = 3;
         var2 = C_100425_alz.field_103051_a[var7].length + 1;
         var3 = var2 * 22 + (var2 - 1) * 2;

         for(var4 = 0; var4 < var2 - 1; ++var4) {
            var5 = C_100425_alz.field_103051_a[var7][var4].field_109159_H;
            var6 = new C_101323_atu(this, var7 << 8 | var5, this.field_104445_m + 167 + var4 * 24 - var3 / 2, this.field_104443_n + 47, var5, var7);
            this.field_104050_h.add(var6);
            if(var7 >= this.field_104448_o.func_103042_k()) {
               var6.field_103909_g = false;
            } else if(var5 == this.field_104448_o.func_103044_j()) {
               var6.func_103922_b(true);
            }
         }

         if(this.field_104448_o.func_103038_i() > 0) {
            C_101323_atu var8 = new C_101323_atu(this, var7 << 8 | this.field_104448_o.func_103038_i(), this.field_104445_m + 167 + (var2 - 1) * 24 - var3 / 2, this.field_104443_n + 47, this.field_104448_o.func_103038_i(), var7);
            this.field_104050_h.add(var8);
            if(var7 >= this.field_104448_o.func_103042_k()) {
               var8.field_103909_g = false;
            } else if(this.field_104448_o.func_103038_i() == this.field_104448_o.func_103044_j()) {
               var8.func_103922_b(true);
            }
         }
      }

      this.field_104447_p.field_103909_g = this.field_104448_o.func_103007_a(0) != null && this.field_104448_o.func_103038_i() > 0;
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103908_f == -2) {
         this.field_104046_e.func_105053_a((C_101278_asw)null);
      } else if(var1.field_103908_f == -1) {
         String var2 = "MC|Beacon";
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         DataOutputStream var4 = new DataOutputStream(var3);

         try {
            var4.writeInt(this.field_104448_o.func_103038_i());
            var4.writeInt(this.field_104448_o.func_103044_j());
            this.field_104046_e.func_105068_r().func_107034_c(new C_100367_da(var2, var3.toByteArray()));
         } catch (Exception var6) {
            var6.printStackTrace();
         }

         this.field_104046_e.func_105053_a((C_101278_asw)null);
      } else if(var1 instanceof C_101323_atu) {
         if(((C_101323_atu)var1).func_103923_b()) {
            return;
         }

         int var7 = var1.field_103908_f;
         int var8 = var7 & 255;
         int var9 = var7 >> 8;
         if(var9 < 3) {
            this.field_104448_o.func_103040_d(var8);
         } else {
            this.field_104448_o.func_103039_e(var8);
         }

         this.field_104050_h.clear();
         this.func_104037_A_();
         this.func_104039_c();
      }

   }

   protected void func_104433_b(int var1, int var2) {
      C_101210_aqj.func_112010_a();
      this.func_103879_a(this.field_104049_k, C_100359_bd.func_107638_a("tile.beacon.primary"), 62, 10, 14737632);
      this.func_103879_a(this.field_104049_k, C_100359_bd.func_107638_a("tile.beacon.secondary"), 169, 10, 14737632);
      Iterator var3 = this.field_104050_h.iterator();

      while(var3.hasNext()) {
         C_101133_arl var4 = (C_101133_arl)var3.next();
         if(var4.func_103905_a()) {
            var4.func_103901_b(var1 - this.field_104445_m, var2 - this.field_104443_n);
            break;
         }
      }

   }

   protected void func_104430_a(float var1, int var2, int var3) {
      int var4 = this.field_104046_e.field_105127_o.func_110367_b("/gui/beacon.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_104046_e.field_105127_o.func_110368_b(var4);
      int var5 = (this.field_104044_f - this.field_104440_b) / 2;
      int var6 = (this.field_104045_g - this.field_104441_c) / 2;
      this.func_103877_b(var5, var6, 0, 0, this.field_104440_b, this.field_104441_c);
      field_104442_a.field_105502_f = 100.0F;
      field_104442_a.func_105501_b(this.field_104049_k, this.field_104046_e.field_105127_o, new C_100994_tv(C_100992_tt.field_110965_bH), var5 + 42, var6 + 109);
      field_104442_a.func_105501_b(this.field_104049_k, this.field_104046_e.field_105127_o, new C_100994_tv(C_100992_tt.field_110838_n), var5 + 42 + 22, var6 + 109);
      field_104442_a.func_105501_b(this.field_104049_k, this.field_104046_e.field_105127_o, new C_100994_tv(C_100992_tt.field_110853_p), var5 + 42 + 44, var6 + 109);
      field_104442_a.func_105501_b(this.field_104049_k, this.field_104046_e.field_105127_o, new C_100994_tv(C_100992_tt.field_110839_o), var5 + 42 + 66, var6 + 109);
   }
}
