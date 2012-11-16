
public class C_100692_kx {

   private int field_109205_a;
   private int field_109203_b;
   private int field_109204_c;
   private boolean field_109201_d;
   private boolean field_109202_e;


   public C_100692_kx(int var1, int var2) {
      this(var1, var2, 0);
   }

   public C_100692_kx(int var1, int var2, int var3) {
      this(var1, var2, var3, false);
   }

   public C_100692_kx(int var1, int var2, int var3, boolean var4) {
      this.field_109205_a = var1;
      this.field_109203_b = var2;
      this.field_109204_c = var3;
      this.field_109202_e = var4;
   }

   public C_100692_kx(C_100692_kx var1) {
      this.field_109205_a = var1.field_109205_a;
      this.field_109203_b = var1.field_109203_b;
      this.field_109204_c = var1.field_109204_c;
   }

   public void func_109190_a(C_100692_kx var1) {
      if(this.field_109205_a != var1.field_109205_a) {
         System.err.println("This method should only be called for matching effects!");
      }

      if(var1.field_109204_c > this.field_109204_c) {
         this.field_109204_c = var1.field_109204_c;
         this.field_109203_b = var1.field_109203_b;
      } else if(var1.field_109204_c == this.field_109204_c && this.field_109203_b < var1.field_109203_b) {
         this.field_109203_b = var1.field_109203_b;
      } else if(!var1.field_109202_e && this.field_109202_e) {
         this.field_109202_e = var1.field_109202_e;
      }

   }

   public int func_109197_a() {
      return this.field_109205_a;
   }

   public int func_109193_b() {
      return this.field_109203_b;
   }

   public int func_109192_c() {
      return this.field_109204_c;
   }

   public void func_109198_a(boolean var1) {
      this.field_109201_d = var1;
   }

   public boolean func_109196_e() {
      return this.field_109202_e;
   }

   public boolean func_109191_a(C_100595_ln var1) {
      if(this.field_109203_b > 0) {
         if(C_100690_kw.field_109169_a[this.field_109205_a].func_109139_a(this.field_109203_b, this.field_109204_c)) {
            this.func_109194_b(var1);
         }

         this.func_109199_g();
      }

      return this.field_109203_b > 0;
   }

   private int func_109199_g() {
      return --this.field_109203_b;
   }

   public void func_109194_b(C_100595_ln var1) {
      if(this.field_109203_b > 0) {
         C_100690_kw.field_109169_a[this.field_109205_a].func_109136_a(var1, this.field_109204_c);
      }

   }

   public String func_109189_f() {
      return C_100690_kw.field_109169_a[this.field_109205_a].func_109135_a();
   }

   public int hashCode() {
      return this.field_109205_a;
   }

   public String toString() {
      String var1 = "";
      if(this.func_109192_c() > 0) {
         var1 = this.func_109189_f() + " x " + (this.func_109192_c() + 1) + ", Duration: " + this.func_109193_b();
      } else {
         var1 = this.func_109189_f() + ", Duration: " + this.func_109193_b();
      }

      if(this.field_109201_d) {
         var1 = var1 + ", Splash: true";
      }

      return C_100690_kw.field_109169_a[this.field_109205_a].func_109137_i()?"(" + var1 + ")":var1;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof C_100692_kx)) {
         return false;
      } else {
         C_100692_kx var2 = (C_100692_kx)var1;
         return this.field_109205_a == var2.field_109205_a && this.field_109204_c == var2.field_109204_c && this.field_109203_b == var2.field_109203_b && this.field_109201_d == var2.field_109201_d && this.field_109202_e == var2.field_109202_e;
      }
   }

   public C_100353_bh func_109200_a(C_100353_bh var1) {
      var1.func_107527_a("Id", (byte)this.func_109197_a());
      var1.func_107527_a("Amplifier", (byte)this.func_109192_c());
      var1.func_107520_a("Duration", this.func_109193_b());
      var1.func_107509_a("Ambient", this.func_109196_e());
      return var1;
   }

   public static C_100692_kx func_109195_b(C_100353_bh var0) {
      byte var1 = var0.func_107524_c("Id");
      byte var2 = var0.func_107524_c("Amplifier");
      int var3 = var0.func_107514_e("Duration");
      boolean var4 = var0.func_107519_n("Ambient");
      return new C_100692_kx(var1, var3, var2, var4);
   }
}
