import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C_100406_amq extends C_100398_amm {

   private int field_102957_a;
   private int field_102955_b;
   private int field_102956_c;
   private boolean field_102953_d;
   private boolean field_102954_e;
   private float field_102951_f;
   private float field_102952_g;
   private List field_102958_h = new ArrayList();


   public C_100406_amq() {}

   public C_100406_amq(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.field_102957_a = var1;
      this.field_102955_b = var2;
      this.field_102956_c = var3;
      this.field_102953_d = var4;
      this.field_102954_e = var5;
   }

   public int func_102949_a() {
      return this.field_102957_a;
   }

   public int func_102919_p() {
      return this.field_102955_b;
   }

   public boolean func_102950_b() {
      return this.field_102953_d;
   }

   public int func_102945_c() {
      return this.field_102956_c;
   }

   public boolean func_102948_e() {
      return this.field_102954_e;
   }

   public float func_102942_a(float var1) {
      if(var1 > 1.0F) {
         var1 = 1.0F;
      }

      return this.field_102952_g + (this.field_102951_f - this.field_102952_g) * var1;
   }

   public float func_102946_b(float var1) {
      return this.field_102953_d?(this.func_102942_a(var1) - 1.0F) * (float)C_100012_j.field_105264_b[this.field_102956_c]:(1.0F - this.func_102942_a(var1)) * (float)C_100012_j.field_105264_b[this.field_102956_c];
   }

   public float func_102943_c(float var1) {
      return this.field_102953_d?(this.func_102942_a(var1) - 1.0F) * (float)C_100012_j.field_105265_c[this.field_102956_c]:(1.0F - this.func_102942_a(var1)) * (float)C_100012_j.field_105265_c[this.field_102956_c];
   }

   public float func_102941_d(float var1) {
      return this.field_102953_d?(this.func_102942_a(var1) - 1.0F) * (float)C_100012_j.field_105262_d[this.field_102956_c]:(1.0F - this.func_102942_a(var1)) * (float)C_100012_j.field_105262_d[this.field_102956_c];
   }

   private void func_102944_a(float var1, float var2) {
      if(this.field_102953_d) {
         var1 = 1.0F - var1;
      } else {
         --var1;
      }

      C_100412_amr var3 = C_100451_alf.field_106254_af.func_106344_b(this.field_102940_k, this.field_102938_l, this.field_102939_m, this.field_102936_n, this.field_102957_a, var1, this.field_102956_c);
      if(var3 != null) {
         List var4 = this.field_102940_k.func_109449_b((C_100730_lb)null, var3);
         if(!var4.isEmpty()) {
            this.field_102958_h.addAll(var4);
            Iterator var5 = this.field_102958_h.iterator();

            while(var5.hasNext()) {
               C_100730_lb var6 = (C_100730_lb)var5.next();
               var6.func_103145_d((double)(var2 * (float)C_100012_j.field_105264_b[this.field_102956_c]), (double)(var2 * (float)C_100012_j.field_105265_c[this.field_102956_c]), (double)(var2 * (float)C_100012_j.field_105262_d[this.field_102956_c]));
            }

            this.field_102958_h.clear();
         }
      }

   }

   public void func_102947_f() {
      if(this.field_102952_g < 1.0F && this.field_102940_k != null) {
         this.field_102952_g = this.field_102951_f = 1.0F;
         this.field_102940_k.func_109498_q(this.field_102938_l, this.field_102939_m, this.field_102936_n);
         this.func_102920_w_();
         if(this.field_102940_k.func_109349_a(this.field_102938_l, this.field_102939_m, this.field_102936_n) == C_100451_alf.field_106254_af.field_106162_cm) {
            this.field_102940_k.func_109394_d(this.field_102938_l, this.field_102939_m, this.field_102936_n, this.field_102957_a, this.field_102955_b);
         }
      }

   }

   public void func_102921_g() {
      this.field_102952_g = this.field_102951_f;
      if(this.field_102952_g >= 1.0F) {
         this.func_102944_a(1.0F, 0.25F);
         this.field_102940_k.func_109498_q(this.field_102938_l, this.field_102939_m, this.field_102936_n);
         this.func_102920_w_();
         if(this.field_102940_k.func_109349_a(this.field_102938_l, this.field_102939_m, this.field_102936_n) == C_100451_alf.field_106254_af.field_106162_cm) {
            this.field_102940_k.func_109394_d(this.field_102938_l, this.field_102939_m, this.field_102936_n, this.field_102957_a, this.field_102955_b);
         }

      } else {
         this.field_102951_f += 0.5F;
         if(this.field_102951_f >= 1.0F) {
            this.field_102951_f = 1.0F;
         }

         if(this.field_102953_d) {
            this.func_102944_a(this.field_102951_f, this.field_102951_f - this.field_102952_g + 0.0625F);
         }

      }
   }

   public void func_102925_a(C_100353_bh var1) {
      super.func_102925_a(var1);
      this.field_102957_a = var1.func_107514_e("blockId");
      this.field_102955_b = var1.func_107514_e("blockData");
      this.field_102956_c = var1.func_107514_e("facing");
      this.field_102952_g = this.field_102951_f = var1.func_107512_g("progress");
      this.field_102953_d = var1.func_107519_n("extending");
   }

   public void func_102915_b(C_100353_bh var1) {
      super.func_102915_b(var1);
      var1.func_107520_a("blockId", this.field_102957_a);
      var1.func_107520_a("blockData", this.field_102955_b);
      var1.func_107520_a("facing", this.field_102956_c);
      var1.func_107529_a("progress", this.field_102952_g);
      var1.func_107509_a("extending", this.field_102953_d);
   }
}
