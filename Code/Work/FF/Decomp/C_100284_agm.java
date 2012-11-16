import java.util.Iterator;

public class C_100284_agm {

   public final C_101095_qg field_107307_a;
   public int[] field_107305_b;
   public int[] field_107306_c;
   private int field_107301_f;
   private int field_107302_g;
   private byte[] field_107308_h;
   public int field_107303_d;
   private boolean field_107309_i;
   // $FF: synthetic field
   final C_100282_agl field_107304_e;


   public C_100284_agm(C_100282_agl var1, C_101095_qg var2) {
      this.field_107304_e = var1;
      this.field_107305_b = new int[128];
      this.field_107306_c = new int[128];
      this.field_107301_f = 0;
      this.field_107302_g = 0;
      this.field_107309_i = false;
      this.field_107307_a = var2;

      for(int var3 = 0; var3 < this.field_107305_b.length; ++var3) {
         this.field_107305_b[var3] = 0;
         this.field_107306_c[var3] = 127;
      }

   }

   public byte[] func_107300_a(C_100994_tv var1) {
      byte[] var2;
      if(!this.field_107309_i) {
         var2 = new byte[]{(byte)2, this.field_107304_e.field_107294_d};
         this.field_107309_i = true;
         return var2;
      } else {
         int var3;
         int var10;
         if(--this.field_107302_g < 0) {
            this.field_107302_g = 4;
            var2 = new byte[this.field_107304_e.field_107293_g.size() * 3 + 1];
            var2[0] = 1;
            var3 = 0;

            for(Iterator var4 = this.field_107304_e.field_107293_g.values().iterator(); var4.hasNext(); ++var3) {
               C_100302_agn var5 = (C_100302_agn)var4.next();
               var2[var3 * 3 + 1] = (byte)(var5.field_107355_a << 4 | var5.field_107351_d & 15);
               var2[var3 * 3 + 2] = var5.field_107353_b;
               var2[var3 * 3 + 3] = var5.field_107354_c;
            }

            boolean var9 = !var1.func_111377_y();
            if(this.field_107308_h != null && this.field_107308_h.length == var2.length) {
               for(var10 = 0; var10 < var2.length; ++var10) {
                  if(var2[var10] != this.field_107308_h[var10]) {
                     var9 = false;
                     break;
                  }
               }
            } else {
               var9 = false;
            }

            if(!var9) {
               this.field_107308_h = var2;
               return var2;
            }
         }

         for(int var8 = 0; var8 < 1; ++var8) {
            var3 = this.field_107301_f++ * 11 % 128;
            if(this.field_107305_b[var3] >= 0) {
               int var11 = this.field_107306_c[var3] - this.field_107305_b[var3] + 1;
               var10 = this.field_107305_b[var3];
               byte[] var6 = new byte[var11 + 3];
               var6[0] = 0;
               var6[1] = (byte)var3;
               var6[2] = (byte)var10;

               for(int var7 = 0; var7 < var6.length - 3; ++var7) {
                  var6[var7 + 3] = this.field_107304_e.field_107295_e[(var7 + var10) * 128 + var3];
               }

               this.field_107306_c[var3] = -1;
               this.field_107305_b[var3] = -1;
               return var6;
            }
         }

         return null;
      }
   }
}
