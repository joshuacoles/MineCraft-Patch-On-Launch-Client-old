
public class C_100909_axg {

   public String field_110711_a;
   public String field_110709_b;
   public String field_110710_c;
   public String field_110707_d;
   public long field_110708_e;
   public int field_110705_f = 47;
   public String field_110706_g = "1.4.2";
   public boolean field_110714_h = false;
   private boolean field_110715_i = true;
   private boolean field_110712_j = false;
   private boolean field_110713_k = false;


   public C_100909_axg(String var1, String var2) {
      this.field_110711_a = var1;
      this.field_110709_b = var2;
   }

   public C_100353_bh func_110701_a() {
      C_100353_bh var1 = new C_100353_bh();
      var1.func_107533_a("name", this.field_110711_a);
      var1.func_107533_a("ip", this.field_110709_b);
      var1.func_107509_a("hideAddress", this.field_110713_k);
      if(!this.field_110715_i) {
         var1.func_107509_a("acceptTextures", this.field_110712_j);
      }

      return var1;
   }

   public boolean func_110703_b() {
      return this.field_110712_j;
   }

   public boolean func_110704_c() {
      return this.field_110715_i;
   }

   public void func_110702_a(boolean var1) {
      this.field_110712_j = var1;
      this.field_110715_i = false;
   }

   public boolean func_110700_d() {
      return this.field_110713_k;
   }

   public void func_110698_b(boolean var1) {
      this.field_110713_k = var1;
   }

   public static C_100909_axg func_110699_a(C_100353_bh var0) {
      C_100909_axg var1 = new C_100909_axg(var0.func_107534_i("name"), var0.func_107534_i("ip"));
      var1.field_110713_k = var0.func_107519_n("hideAddress");
      if(var0.func_107516_b("acceptTextures")) {
         var1.func_110702_a(var0.func_107519_n("acceptTextures"));
      }

      return var1;
   }
}
