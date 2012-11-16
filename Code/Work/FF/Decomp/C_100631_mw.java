import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C_100631_mw extends C_100621_mm {

   private C_100598_ls field_108164_a;
   private float field_108162_b;
   private C_100278_agj field_108163_c;
   private C_100529_oa field_108160_d;
   private boolean field_108161_e;
   private List field_108159_f = new ArrayList();


   public C_100631_mw(C_100598_ls var1, float var2, boolean var3) {
      this.field_108164_a = var1;
      this.field_108162_b = var2;
      this.field_108161_e = var3;
      this.func_108030_a(1);
   }

   public boolean func_108033_a() {
      this.func_108158_f();
      if(this.field_108161_e && this.field_108164_a.field_103229_p.func_109402_t()) {
         return false;
      } else {
         C_100531_ob var1 = this.field_108164_a.field_103229_p.field_109550_C.func_107279_a(C_100650_jv.func_108910_c(this.field_108164_a.field_103221_t), C_100650_jv.func_108910_c(this.field_108164_a.field_103219_u), C_100650_jv.func_108910_c(this.field_108164_a.field_103217_v), 0);
         if(var1 == null) {
            return false;
         } else {
            this.field_108160_d = this.func_108156_a(var1);
            if(this.field_108160_d == null) {
               return false;
            } else {
               boolean var2 = this.field_108164_a.func_103383_ay().func_108308_c();
               this.field_108164_a.func_103383_ay().func_108298_b(false);
               this.field_108163_c = this.field_108164_a.func_103383_ay().func_108284_a((double)this.field_108160_d.field_108602_a, (double)this.field_108160_d.field_108600_b, (double)this.field_108160_d.field_108601_c);
               this.field_108164_a.func_103383_ay().func_108298_b(var2);
               if(this.field_108163_c != null) {
                  return true;
               } else {
                  C_100387_amw var3 = C_100512_nz.func_108268_a(this.field_108164_a, 10, 7, this.field_108164_a.field_103229_p.func_109363_R().func_107878_a((double)this.field_108160_d.field_108602_a, (double)this.field_108160_d.field_108600_b, (double)this.field_108160_d.field_108601_c));
                  if(var3 == null) {
                     return false;
                  } else {
                     this.field_108164_a.func_103383_ay().func_108298_b(false);
                     this.field_108163_c = this.field_108164_a.func_103383_ay().func_108284_a(var3.field_107872_c, var3.field_107869_d, var3.field_107870_e);
                     this.field_108164_a.func_103383_ay().func_108298_b(var2);
                     return this.field_108163_c != null;
                  }
               }
            }
         }
      }
   }

   public boolean func_108036_b() {
      if(this.field_108164_a.func_103383_ay().func_108300_f()) {
         return false;
      } else {
         float var1 = this.field_108164_a.field_103182_N + 4.0F;
         return this.field_108164_a.func_103146_e((double)this.field_108160_d.field_108602_a, (double)this.field_108160_d.field_108600_b, (double)this.field_108160_d.field_108601_c) > (double)(var1 * var1);
      }
   }

   public void func_108034_c() {
      this.field_108164_a.func_103383_ay().func_108294_a(this.field_108163_c, this.field_108162_b);
   }

   public void func_108029_d() {
      if(this.field_108164_a.func_103383_ay().func_108300_f() || this.field_108164_a.func_103146_e((double)this.field_108160_d.field_108602_a, (double)this.field_108160_d.field_108600_b, (double)this.field_108160_d.field_108601_c) < 16.0D) {
         this.field_108159_f.add(this.field_108160_d);
      }

   }

   private C_100529_oa func_108156_a(C_100531_ob var1) {
      C_100529_oa var2 = null;
      int var3 = Integer.MAX_VALUE;
      List var4 = var1.func_108605_f();
      Iterator var5 = var4.iterator();

      while(var5.hasNext()) {
         C_100529_oa var6 = (C_100529_oa)var5.next();
         int var7 = var6.func_108595_b(C_100650_jv.func_108910_c(this.field_108164_a.field_103221_t), C_100650_jv.func_108910_c(this.field_108164_a.field_103219_u), C_100650_jv.func_108910_c(this.field_108164_a.field_103217_v));
         if(var7 < var3 && !this.func_108157_a(var6)) {
            var2 = var6;
            var3 = var7;
         }
      }

      return var2;
   }

   private boolean func_108157_a(C_100529_oa var1) {
      Iterator var2 = this.field_108159_f.iterator();

      C_100529_oa var3;
      do {
         if(!var2.hasNext()) {
            return false;
         }

         var3 = (C_100529_oa)var2.next();
      } while(var1.field_108602_a != var3.field_108602_a || var1.field_108600_b != var3.field_108600_b || var1.field_108601_c != var3.field_108601_c);

      return true;
   }

   private void func_108158_f() {
      if(this.field_108159_f.size() > 15) {
         this.field_108159_f.remove(0);
      }

   }
}
