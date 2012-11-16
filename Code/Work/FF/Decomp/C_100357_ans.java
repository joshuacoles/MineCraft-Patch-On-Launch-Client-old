
public class C_100357_ans implements C_100364_anf {

   private byte[] field_107596_a;
   private byte[] field_107594_b;
   private byte[] field_107595_c;
   private int field_107592_d;
   private C_100364_anf field_107593_e = null;
   private boolean field_107591_f;


   public C_100357_ans(C_100364_anf var1, int var2) {
      this.field_107593_e = var1;
      this.field_107592_d = var2 / 8;
      this.field_107596_a = new byte[var1.func_107587_b()];
      this.field_107594_b = new byte[var1.func_107587_b()];
      this.field_107595_c = new byte[var1.func_107587_b()];
   }

   public void func_107585_a(boolean var1, C_100369_ani var2) {
      this.field_107591_f = var1;
      if(var2 instanceof C_100340_anu) {
         C_100340_anu var3 = (C_100340_anu)var2;
         byte[] var4 = var3.func_107577_a();
         if(var4.length < this.field_107596_a.length) {
            System.arraycopy(var4, 0, this.field_107596_a, this.field_107596_a.length - var4.length, var4.length);

            for(int var5 = 0; var5 < this.field_107596_a.length - var4.length; ++var5) {
               this.field_107596_a[var5] = 0;
            }
         } else {
            System.arraycopy(var4, 0, this.field_107596_a, 0, this.field_107596_a.length);
         }

         this.func_107586_c();
         if(var3.func_107576_b() != null) {
            this.field_107593_e.func_107585_a(true, var3.func_107576_b());
         }
      } else {
         this.func_107586_c();
         this.field_107593_e.func_107585_a(true, var2);
      }

   }

   public String func_107584_a() {
      return this.field_107593_e.func_107584_a() + "/CFB" + this.field_107592_d * 8;
   }

   public int func_107587_b() {
      return this.field_107592_d;
   }

   public int func_107588_a(byte[] var1, int var2, byte[] var3, int var4) {
      return this.field_107591_f?this.func_107589_b(var1, var2, var3, var4):this.func_107590_c(var1, var2, var3, var4);
   }

   public int func_107589_b(byte[] var1, int var2, byte[] var3, int var4) {
      if(var2 + this.field_107592_d > var1.length) {
         throw new C_100370_ank("input buffer too short");
      } else if(var4 + this.field_107592_d > var3.length) {
         throw new C_100370_ank("output buffer too short");
      } else {
         this.field_107593_e.func_107588_a(this.field_107594_b, 0, this.field_107595_c, 0);

         for(int var5 = 0; var5 < this.field_107592_d; ++var5) {
            var3[var4 + var5] = (byte)(this.field_107595_c[var5] ^ var1[var2 + var5]);
         }

         System.arraycopy(this.field_107594_b, this.field_107592_d, this.field_107594_b, 0, this.field_107594_b.length - this.field_107592_d);
         System.arraycopy(var3, var4, this.field_107594_b, this.field_107594_b.length - this.field_107592_d, this.field_107592_d);
         return this.field_107592_d;
      }
   }

   public int func_107590_c(byte[] var1, int var2, byte[] var3, int var4) {
      if(var2 + this.field_107592_d > var1.length) {
         throw new C_100370_ank("input buffer too short");
      } else if(var4 + this.field_107592_d > var3.length) {
         throw new C_100370_ank("output buffer too short");
      } else {
         this.field_107593_e.func_107588_a(this.field_107594_b, 0, this.field_107595_c, 0);
         System.arraycopy(this.field_107594_b, this.field_107592_d, this.field_107594_b, 0, this.field_107594_b.length - this.field_107592_d);
         System.arraycopy(var1, var2, this.field_107594_b, this.field_107594_b.length - this.field_107592_d, this.field_107592_d);

         for(int var5 = 0; var5 < this.field_107592_d; ++var5) {
            var3[var4 + var5] = (byte)(this.field_107595_c[var5] ^ var1[var2 + var5]);
         }

         return this.field_107592_d;
      }
   }

   public void func_107586_c() {
      System.arraycopy(this.field_107596_a, 0, this.field_107594_b, 0, this.field_107596_a.length);
      this.field_107593_e.func_107586_c();
   }
}
