
public class C_101265_zb {

   private int field_112278_a;
   private int field_112276_b;
   private int field_112277_c;
   private byte[] field_112274_d;
   private C_101274_yy field_112275_e;
   private C_101274_yy field_112272_f;
   private C_101274_yy field_112273_g;
   private C_101274_yy field_112279_h;


   public C_101265_zb(int var1) {
      this.field_112278_a = var1;
      this.field_112274_d = new byte[4096];
      this.field_112272_f = new C_101274_yy(this.field_112274_d.length, 4);
      this.field_112279_h = new C_101274_yy(this.field_112274_d.length, 4);
      this.field_112273_g = new C_101274_yy(this.field_112274_d.length, 4);
   }

   public int func_112252_a(int var1, int var2, int var3) {
      int var4 = this.field_112274_d[var2 << 8 | var3 << 4 | var1] & 255;
      return this.field_112275_e != null?this.field_112275_e.func_112357_a(var1, var2, var3) << 8 | var4:var4;
   }

   public void func_112251_a(int var1, int var2, int var3, int var4) {
      int var5 = this.field_112274_d[var2 << 8 | var3 << 4 | var1] & 255;
      if(this.field_112275_e != null) {
         var5 |= this.field_112275_e.func_112357_a(var1, var2, var3) << 8;
      }

      if(var5 == 0 && var4 != 0) {
         ++this.field_112276_b;
         if(C_100451_alf.field_106118_p[var4] != null && C_100451_alf.field_106118_p[var4].func_105984_t()) {
            ++this.field_112277_c;
         }
      } else if(var5 != 0 && var4 == 0) {
         --this.field_112276_b;
         if(C_100451_alf.field_106118_p[var5] != null && C_100451_alf.field_106118_p[var5].func_105984_t()) {
            --this.field_112277_c;
         }
      } else if(C_100451_alf.field_106118_p[var5] != null && C_100451_alf.field_106118_p[var5].func_105984_t() && (C_100451_alf.field_106118_p[var4] == null || !C_100451_alf.field_106118_p[var4].func_105984_t())) {
         --this.field_112277_c;
      } else if((C_100451_alf.field_106118_p[var5] == null || !C_100451_alf.field_106118_p[var5].func_105984_t()) && C_100451_alf.field_106118_p[var4] != null && C_100451_alf.field_106118_p[var4].func_105984_t()) {
         ++this.field_112277_c;
      }

      this.field_112274_d[var2 << 8 | var3 << 4 | var1] = (byte)(var4 & 255);
      if(var4 > 255) {
         if(this.field_112275_e == null) {
            this.field_112275_e = new C_101274_yy(this.field_112274_d.length, 4);
         }

         this.field_112275_e.func_112356_a(var1, var2, var3, (var4 & 3840) >> 8);
      } else if(this.field_112275_e != null) {
         this.field_112275_e.func_112356_a(var1, var2, var3, 0);
      }

   }

   public int func_112259_b(int var1, int var2, int var3) {
      return this.field_112272_f.func_112357_a(var1, var2, var3);
   }

   public void func_112250_b(int var1, int var2, int var3, int var4) {
      this.field_112272_f.func_112356_a(var1, var2, var3, var4);
   }

   public boolean func_112257_a() {
      return this.field_112276_b == 0;
   }

   public boolean func_112268_b() {
      return this.field_112277_c > 0;
   }

   public int func_112255_d() {
      return this.field_112278_a;
   }

   public void func_112253_c(int var1, int var2, int var3, int var4) {
      this.field_112279_h.func_112356_a(var1, var2, var3, var4);
   }

   public int func_112263_c(int var1, int var2, int var3) {
      return this.field_112279_h.func_112357_a(var1, var2, var3);
   }

   public void func_112271_d(int var1, int var2, int var3, int var4) {
      this.field_112273_g.func_112356_a(var1, var2, var3, var4);
   }

   public int func_112266_d(int var1, int var2, int var3) {
      return this.field_112273_g.func_112357_a(var1, var2, var3);
   }

   public void func_112265_e() {
      this.field_112276_b = 0;
      this.field_112277_c = 0;

      for(int var1 = 0; var1 < 16; ++var1) {
         for(int var2 = 0; var2 < 16; ++var2) {
            for(int var3 = 0; var3 < 16; ++var3) {
               int var4 = this.func_112252_a(var1, var2, var3);
               if(var4 > 0) {
                  if(C_100451_alf.field_106118_p[var4] == null) {
                     this.field_112274_d[var2 << 8 | var3 << 4 | var1] = 0;
                     if(this.field_112275_e != null) {
                        this.field_112275_e.func_112356_a(var1, var2, var3, 0);
                     }
                  } else {
                     ++this.field_112276_b;
                     if(C_100451_alf.field_106118_p[var4].func_105984_t()) {
                        ++this.field_112277_c;
                     }
                  }
               }
            }
         }
      }

   }

   public byte[] func_112254_g() {
      return this.field_112274_d;
   }

   public void func_112270_h() {
      this.field_112275_e = null;
   }

   public C_101274_yy func_112269_i() {
      return this.field_112275_e;
   }

   public C_101274_yy func_112249_j() {
      return this.field_112272_f;
   }

   public C_101274_yy func_112262_k() {
      return this.field_112273_g;
   }

   public C_101274_yy func_112261_l() {
      return this.field_112279_h;
   }

   public void func_112258_a(byte[] var1) {
      this.field_112274_d = var1;
   }

   public void func_112264_a(C_101274_yy var1) {
      this.field_112275_e = var1;
   }

   public void func_112248_b(C_101274_yy var1) {
      this.field_112272_f = var1;
   }

   public void func_112260_c(C_101274_yy var1) {
      this.field_112273_g = var1;
   }

   public void func_112256_d(C_101274_yy var1) {
      this.field_112279_h = var1;
   }

   public C_101274_yy func_112267_m() {
      this.field_112275_e = new C_101274_yy(this.field_112274_d.length, 4);
      return this.field_112275_e;
   }
}
