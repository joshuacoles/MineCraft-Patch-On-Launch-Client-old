import java.util.Random;

public class C_100618_mi extends C_100621_mm {

   private C_100598_ls field_108119_a;
   private double field_108117_b;
   private double field_108118_c;
   private double field_108115_d;
   private float field_108116_e;
   private C_100873_xe field_108114_f;


   public C_100618_mi(C_100598_ls var1, float var2) {
      this.field_108119_a = var1;
      this.field_108116_e = var2;
      this.field_108114_f = var1.field_103229_p;
      this.func_108030_a(1);
   }

   public boolean func_108033_a() {
      if(!this.field_108114_f.func_109402_t()) {
         return false;
      } else if(!this.field_108119_a.func_103149_af()) {
         return false;
      } else if(!this.field_108114_f.func_109502_j(C_100650_jv.func_108910_c(this.field_108119_a.field_103221_t), (int)this.field_108119_a.field_103173_D.field_107915_b, C_100650_jv.func_108910_c(this.field_108119_a.field_103217_v))) {
         return false;
      } else {
         C_100387_amw var1 = this.func_108113_f();
         if(var1 == null) {
            return false;
         } else {
            this.field_108117_b = var1.field_107872_c;
            this.field_108118_c = var1.field_107869_d;
            this.field_108115_d = var1.field_107870_e;
            return true;
         }
      }
   }

   public boolean func_108036_b() {
      return !this.field_108119_a.func_103383_ay().func_108300_f();
   }

   public void func_108034_c() {
      this.field_108119_a.func_103383_ay().func_108292_a(this.field_108117_b, this.field_108118_c, this.field_108115_d, this.field_108116_e);
   }

   private C_100387_amw func_108113_f() {
      Random var1 = this.field_108119_a.func_103312_aA();

      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = C_100650_jv.func_108910_c(this.field_108119_a.field_103221_t + (double)var1.nextInt(20) - 10.0D);
         int var4 = C_100650_jv.func_108910_c(this.field_108119_a.field_103173_D.field_107915_b + (double)var1.nextInt(6) - 3.0D);
         int var5 = C_100650_jv.func_108910_c(this.field_108119_a.field_103217_v + (double)var1.nextInt(20) - 10.0D);
         if(!this.field_108114_f.func_109502_j(var3, var4, var5) && this.field_108119_a.func_103499_a(var3, var4, var5) < 0.0F) {
            return this.field_108114_f.func_109363_R().func_107878_a((double)var3, (double)var4, (double)var5);
         }
      }

      return null;
   }
}
