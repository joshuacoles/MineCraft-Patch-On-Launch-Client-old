import java.util.Iterator;
import java.util.List;

public class C_100570_pd extends C_100582_pc {

   private int field_103280_b;
   public long field_103282_a = 0L;
   private int field_103281_c;


   public C_100570_pd(C_100873_xe var1, double var2, double var4, double var6) {
      super(var1);
      this.func_103055_b(var2, var4, var6, 0.0F, 0.0F);
      this.field_103280_b = 2;
      this.field_103282_a = this.field_103232_aa.nextLong();
      this.field_103281_c = this.field_103232_aa.nextInt(3) + 1;
      if(var1.field_109578_t >= 2 && var1.func_109432_a(C_100650_jv.func_108910_c(var2), C_100650_jv.func_108910_c(var4), C_100650_jv.func_108910_c(var6), 10)) {
         int var8 = C_100650_jv.func_108910_c(var2);
         int var9 = C_100650_jv.func_108910_c(var4);
         int var10 = C_100650_jv.func_108910_c(var6);
         if(var1.func_109349_a(var8, var9, var10) == 0 && C_100451_alf.field_106222_au.func_106023_b(var1, var8, var9, var10)) {
            var1.func_109422_e(var8, var9, var10, C_100451_alf.field_106222_au.field_106162_cm);
         }

         for(var8 = 0; var8 < 4; ++var8) {
            var9 = C_100650_jv.func_108910_c(var2) + this.field_103232_aa.nextInt(3) - 1;
            var10 = C_100650_jv.func_108910_c(var4) + this.field_103232_aa.nextInt(3) - 1;
            int var11 = C_100650_jv.func_108910_c(var6) + this.field_103232_aa.nextInt(3) - 1;
            if(var1.func_109349_a(var9, var10, var11) == 0 && C_100451_alf.field_106222_au.func_106023_b(var1, var9, var10, var11)) {
               var1.func_109422_e(var9, var10, var11, C_100451_alf.field_106222_au.field_106162_cm);
            }
         }
      }

   }

   public void func_103165_j_() {
      super.func_103165_j_();
      if(this.field_103280_b == 2) {
         this.field_103229_p.func_109476_a(this.field_103221_t, this.field_103219_u, this.field_103217_v, "ambient.weather.thunder", 10000.0F, 0.8F + this.field_103232_aa.nextFloat() * 0.2F);
         this.field_103229_p.func_109476_a(this.field_103221_t, this.field_103219_u, this.field_103217_v, "random.explode", 2.0F, 0.5F + this.field_103232_aa.nextFloat() * 0.2F);
      }

      --this.field_103280_b;
      if(this.field_103280_b < 0) {
         if(this.field_103281_c == 0) {
            this.func_103121_x();
         } else if(this.field_103280_b < -this.field_103232_aa.nextInt(10)) {
            --this.field_103281_c;
            this.field_103280_b = 1;
            this.field_103282_a = this.field_103232_aa.nextLong();
            if(this.field_103229_p.func_109432_a(C_100650_jv.func_108910_c(this.field_103221_t), C_100650_jv.func_108910_c(this.field_103219_u), C_100650_jv.func_108910_c(this.field_103217_v), 10)) {
               int var1 = C_100650_jv.func_108910_c(this.field_103221_t);
               int var2 = C_100650_jv.func_108910_c(this.field_103219_u);
               int var3 = C_100650_jv.func_108910_c(this.field_103217_v);
               if(this.field_103229_p.func_109349_a(var1, var2, var3) == 0 && C_100451_alf.field_106222_au.func_106023_b(this.field_103229_p, var1, var2, var3)) {
                  this.field_103229_p.func_109422_e(var1, var2, var3, C_100451_alf.field_106222_au.field_106162_cm);
               }
            }
         }
      }

      if(this.field_103280_b >= 0) {
         double var6 = 3.0D;
         List var7 = this.field_103229_p.func_109449_b(this, C_100412_amr.func_107892_a().func_107844_a(this.field_103221_t - var6, this.field_103219_u - var6, this.field_103217_v - var6, this.field_103221_t + var6, this.field_103219_u + 6.0D + var6, this.field_103217_v + var6));
         Iterator var4 = var7.iterator();

         while(var4.hasNext()) {
            C_100730_lb var5 = (C_100730_lb)var4.next();
            var5.func_103155_a(this);
         }

         this.field_103229_p.field_109580_r = 2;
      }

   }

   protected void func_103141_a() {}

   protected void func_103110_a(C_100353_bh var1) {}

   protected void func_103078_b(C_100353_bh var1) {}

   public boolean func_103062_a(C_100387_amw var1) {
      return this.field_103280_b >= 0;
   }
}
