import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class C_100282_agl extends C_100304_ago {

   public int field_107298_a;
   public int field_107296_b;
   public byte field_107297_c;
   public byte field_107294_d;
   public byte[] field_107295_e = new byte[16384];
   public List field_107292_f = new ArrayList();
   private Map field_107299_i = new HashMap();
   public Map field_107293_g = new LinkedHashMap();


   public C_100282_agl(String var1) {
      super(var1);
   }

   public void func_107261_a(C_100353_bh var1) {
      this.field_107297_c = var1.func_107524_c("dimension");
      this.field_107298_a = var1.func_107514_e("xCenter");
      this.field_107296_b = var1.func_107514_e("zCenter");
      this.field_107294_d = var1.func_107524_c("scale");
      if(this.field_107294_d < 0) {
         this.field_107294_d = 0;
      }

      if(this.field_107294_d > 4) {
         this.field_107294_d = 4;
      }

      short var2 = var1.func_107517_d("width");
      short var3 = var1.func_107517_d("height");
      if(var2 == 128 && var3 == 128) {
         this.field_107295_e = var1.func_107523_j("colors");
      } else {
         byte[] var4 = var1.func_107523_j("colors");
         this.field_107295_e = new byte[16384];
         int var5 = (128 - var2) / 2;
         int var6 = (128 - var3) / 2;

         for(int var7 = 0; var7 < var3; ++var7) {
            int var8 = var7 + var6;
            if(var8 >= 0 || var8 < 128) {
               for(int var9 = 0; var9 < var2; ++var9) {
                  int var10 = var9 + var5;
                  if(var10 >= 0 || var10 < 128) {
                     this.field_107295_e[var10 + var8 * 128] = var4[var9 + var7 * var2];
                  }
               }
            }
         }
      }

   }

   public void func_107265_b(C_100353_bh var1) {
      var1.func_107527_a("dimension", this.field_107297_c);
      var1.func_107520_a("xCenter", this.field_107298_a);
      var1.func_107520_a("zCenter", this.field_107296_b);
      var1.func_107527_a("scale", this.field_107294_d);
      var1.func_107532_a("width", (short)128);
      var1.func_107532_a("height", (short)128);
      var1.func_107526_a("colors", this.field_107295_e);
   }

   public void func_107288_a(C_101095_qg var1, C_100994_tv var2) {
      if(!this.field_107299_i.containsKey(var1)) {
         C_100284_agm var3 = new C_100284_agm(this, var1);
         this.field_107299_i.put(var1, var3);
         this.field_107292_f.add(var3);
      }

      if(!var1.field_103857_bK.func_104806_c(var2)) {
         this.field_107293_g.remove(var1.func_102909_c_());
      }

      for(int var5 = 0; var5 < this.field_107292_f.size(); ++var5) {
         C_100284_agm var4 = (C_100284_agm)this.field_107292_f.get(var5);
         if(!var4.field_107307_a.field_103180_L && (var4.field_107307_a.field_103857_bK.func_104806_c(var2) || var2.func_111377_y())) {
            if(!var2.func_111377_y() && var4.field_107307_a.field_103224_ap == this.field_107297_c) {
               this.func_107287_a(0, var4.field_107307_a.field_103229_p, var4.field_107307_a.func_102909_c_(), var4.field_107307_a.field_103221_t, var4.field_107307_a.field_103217_v, (double)var4.field_107307_a.field_103236_z);
            }
         } else {
            this.field_107299_i.remove(var4.field_107307_a);
            this.field_107292_f.remove(var4);
         }
      }

      if(var2.func_111377_y()) {
         this.func_107287_a(1, var1.field_103229_p, "frame-" + var2.func_111374_z().field_103212_k, (double)var2.func_111374_z().field_104579_b, (double)var2.func_111374_z().field_104577_d, (double)(var2.func_111374_z().field_104581_a * 90));
      }

   }

   private void func_107287_a(int var1, C_100873_xe var2, String var3, double var4, double var6, double var8) {
      int var10 = 1 << this.field_107294_d;
      float var11 = (float)(var4 - (double)this.field_107298_a) / (float)var10;
      float var12 = (float)(var6 - (double)this.field_107296_b) / (float)var10;
      byte var13 = (byte)((int)((double)(var11 * 2.0F) + 0.5D));
      byte var14 = (byte)((int)((double)(var12 * 2.0F) + 0.5D));
      byte var16 = 63;
      byte var15;
      if(var11 >= (float)(-var16) && var12 >= (float)(-var16) && var11 <= (float)var16 && var12 <= (float)var16) {
         var8 += var8 < 0.0D?-8.0D:8.0D;
         var15 = (byte)((int)(var8 * 16.0D / 360.0D));
         if(this.field_107297_c < 0) {
            int var17 = (int)(var2.func_109429_J().func_107166_g() / 10L);
            var15 = (byte)(var17 * var17 * 34187121 + var17 * 121 >> 15 & 15);
         }
      } else {
         if(Math.abs(var11) >= 320.0F || Math.abs(var12) >= 320.0F) {
            this.field_107293_g.remove(var3);
            return;
         }

         var1 = 6;
         var15 = 0;
         if(var11 <= (float)(-var16)) {
            var13 = (byte)((int)((double)(var16 * 2) + 2.5D));
         }

         if(var12 <= (float)(-var16)) {
            var14 = (byte)((int)((double)(var16 * 2) + 2.5D));
         }

         if(var11 >= (float)var16) {
            var13 = (byte)(var16 * 2 + 1);
         }

         if(var12 >= (float)var16) {
            var14 = (byte)(var16 * 2 + 1);
         }
      }

      this.field_107293_g.put(var3, new C_100302_agn(this, (byte)var1, var13, var14, var15));
   }

   public byte[] func_107289_a(C_100994_tv var1, C_100873_xe var2, C_101095_qg var3) {
      C_100284_agm var4 = (C_100284_agm)this.field_107299_i.get(var3);
      return var4 == null?null:var4.func_107300_a(var1);
   }

   public void func_107291_a(int var1, int var2, int var3) {
      super.func_107264_c();

      for(int var4 = 0; var4 < this.field_107292_f.size(); ++var4) {
         C_100284_agm var5 = (C_100284_agm)this.field_107292_f.get(var4);
         if(var5.field_107305_b[var1] < 0 || var5.field_107305_b[var1] > var2) {
            var5.field_107305_b[var1] = var2;
         }

         if(var5.field_107306_c[var1] < 0 || var5.field_107306_c[var1] < var3) {
            var5.field_107306_c[var1] = var3;
         }
      }

   }

   public void func_107290_a(byte[] var1) {
      int var2;
      if(var1[0] == 0) {
         var2 = var1[1] & 255;
         int var3 = var1[2] & 255;

         for(int var4 = 0; var4 < var1.length - 3; ++var4) {
            this.field_107295_e[(var4 + var3) * 128 + var2] = var1[var4 + 3];
         }

         this.func_107264_c();
      } else if(var1[0] == 1) {
         this.field_107293_g.clear();

         for(var2 = 0; var2 < (var1.length - 1) / 3; ++var2) {
            byte var7 = (byte)(var1[var2 * 3 + 1] >> 4);
            byte var8 = var1[var2 * 3 + 2];
            byte var5 = var1[var2 * 3 + 3];
            byte var6 = (byte)(var1[var2 * 3 + 1] & 15);
            this.field_107293_g.put("icon-" + var2, new C_100302_agn(this, var7, var8, var5, var6));
         }
      } else if(var1[0] == 2) {
         this.field_107294_d = var1[1];
      }

   }

   public C_100284_agm func_107286_a(C_101095_qg var1) {
      C_100284_agm var2 = (C_100284_agm)this.field_107299_i.get(var1);
      if(var2 == null) {
         var2 = new C_100284_agm(this, var1);
         this.field_107299_i.put(var1, var2);
         this.field_107292_f.add(var2);
      }

      return var2;
   }
}
