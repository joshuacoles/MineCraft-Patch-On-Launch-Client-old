
public class C_101160_ask extends C_101278_asw {

   protected C_101278_asw field_104236_a;
   private int field_104234_b = -1;
   private C_101162_asl field_104235_c;
   private final C_101125_ard field_104233_d;
   private C_101300_atd field_104237_m;


   public C_101160_ask(C_101278_asw var1, C_101125_ard var2) {
      this.field_104236_a = var1;
      this.field_104233_d = var2;
   }

   public void func_104037_A_() {
      C_100361_be var1 = C_100361_be.func_107654_a();
      this.field_104050_h.add(this.field_104237_m = new C_101300_atd(6, this.field_104044_f / 2 - 75, this.field_104045_g - 38, var1.func_107651_b("gui.done")));
      this.field_104235_c = new C_101162_asl(this);
      this.field_104235_c.func_105832_a(this.field_104050_h, 7, 8);
   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103909_g) {
         switch(var1.field_103908_f) {
         case 5:
            break;
         case 6:
            this.field_104046_e.func_105053_a(this.field_104236_a);
            break;
         default:
            this.field_104235_c.func_105834_a(var1);
         }

      }
   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.field_104235_c.func_105826_a(var1, var2, var3);
      if(this.field_104234_b <= 0) {
         this.field_104046_e.field_105099_C.func_105674_c();
         this.field_104234_b += 20;
      }

      C_100361_be var4 = C_100361_be.func_107654_a();
      this.func_103879_a(this.field_104049_k, var4.func_107651_b("options.language"), this.field_104044_f / 2, 16, 16777215);
      this.func_103879_a(this.field_104049_k, "(" + var4.func_107651_b("options.languageWarning") + ")", this.field_104044_f / 2, this.field_104045_g - 56, 8421504);
      super.func_104027_a(var1, var2, var3);
   }

   public void func_104039_c() {
      super.func_104039_c();
      --this.field_104234_b;
   }

   // $FF: synthetic method
   static C_101125_ard func_104232_a(C_101160_ask var0) {
      return var0.field_104233_d;
   }

   // $FF: synthetic method
   static C_101300_atd func_104231_b(C_101160_ask var0) {
      return var0.field_104237_m;
   }
}
