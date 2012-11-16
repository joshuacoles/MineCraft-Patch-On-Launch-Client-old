
public abstract class C_100517_nw extends C_100621_mm {

   protected C_100595_ln field_108231_d;
   protected float field_108232_e;
   protected boolean field_108229_f;
   private boolean field_108235_a;
   private int field_108233_b;
   private int field_108234_c;
   private int field_108230_g;


   public C_100517_nw(C_100595_ln var1, float var2, boolean var3) {
      this(var1, var2, var3, false);
   }

   public C_100517_nw(C_100595_ln var1, float var2, boolean var3, boolean var4) {
      this.field_108233_b = 0;
      this.field_108234_c = 0;
      this.field_108230_g = 0;
      this.field_108231_d = var1;
      this.field_108232_e = var2;
      this.field_108229_f = var3;
      this.field_108235_a = var4;
   }

   public boolean func_108036_b() {
      C_100595_ln var1 = this.field_108231_d.func_103335_aF();
      if(var1 == null) {
         return false;
      } else if(!var1.func_103143_S()) {
         return false;
      } else if(this.field_108231_d.func_103082_e(var1) > (double)(this.field_108232_e * this.field_108232_e)) {
         return false;
      } else {
         if(this.field_108229_f) {
            if(this.field_108231_d.func_103292_az().func_108280_a(var1)) {
               this.field_108230_g = 0;
            } else if(++this.field_108230_g > 60) {
               return false;
            }
         }

         return true;
      }
   }

   public void func_108034_c() {
      this.field_108233_b = 0;
      this.field_108234_c = 0;
      this.field_108230_g = 0;
   }

   public void func_108029_d() {
      this.field_108231_d.func_103347_b((C_100595_ln)null);
   }

   protected boolean func_108227_a(C_100595_ln var1, boolean var2) {
      if(var1 == null) {
         return false;
      } else if(var1 == this.field_108231_d) {
         return false;
      } else if(!var1.func_103143_S()) {
         return false;
      } else if(!this.field_108231_d.func_103386_a(var1.getClass())) {
         return false;
      } else {
         if(this.field_108231_d instanceof C_100603_lv && ((C_100603_lv)this.field_108231_d).func_103552_m()) {
            if(var1 instanceof C_100603_lv && ((C_100603_lv)var1).func_103552_m()) {
               return false;
            }

            if(var1 == ((C_100603_lv)this.field_108231_d).func_103554_p()) {
               return false;
            }
         } else if(var1 instanceof C_101095_qg && !var2 && ((C_101095_qg)var1).field_103869_cf.field_111601_a) {
            return false;
         }

         if(!this.field_108231_d.func_103340_e(C_100650_jv.func_108910_c(var1.field_103221_t), C_100650_jv.func_108910_c(var1.field_103219_u), C_100650_jv.func_108910_c(var1.field_103217_v))) {
            return false;
         } else if(this.field_108229_f && !this.field_108231_d.func_103292_az().func_108280_a(var1)) {
            return false;
         } else {
            if(this.field_108235_a) {
               if(--this.field_108234_c <= 0) {
                  this.field_108233_b = 0;
               }

               if(this.field_108233_b == 0) {
                  this.field_108233_b = this.func_108228_a(var1)?1:2;
               }

               if(this.field_108233_b == 2) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private boolean func_108228_a(C_100595_ln var1) {
      this.field_108234_c = 10 + this.field_108231_d.func_103312_aA().nextInt(5);
      C_100278_agj var2 = this.field_108231_d.func_103383_ay().func_108306_a(var1);
      if(var2 == null) {
         return false;
      } else {
         C_100292_agi var3 = var2.func_107236_c();
         if(var3 == null) {
            return false;
         } else {
            int var4 = var3.field_107346_a - C_100650_jv.func_108910_c(var1.field_103221_t);
            int var5 = var3.field_107345_c - C_100650_jv.func_108910_c(var1.field_103217_v);
            return (double)(var4 * var4 + var5 * var5) <= 2.25D;
         }
      }
   }
}
