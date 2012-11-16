
public class C_100278_agj {

   private final C_100292_agi[] field_107242_a;
   private int field_107240_b;
   private int field_107241_c;


   public C_100278_agj(C_100292_agi[] var1) {
      this.field_107242_a = var1;
      this.field_107241_c = var1.length;
   }

   public void func_107233_a() {
      ++this.field_107240_b;
   }

   public boolean func_107239_b() {
      return this.field_107240_b >= this.field_107241_c;
   }

   public C_100292_agi func_107236_c() {
      return this.field_107241_c > 0?this.field_107242_a[this.field_107241_c - 1]:null;
   }

   public C_100292_agi func_107235_a(int var1) {
      return this.field_107242_a[var1];
   }

   public int func_107232_d() {
      return this.field_107241_c;
   }

   public void func_107229_b(int var1) {
      this.field_107241_c = var1;
   }

   public int func_107231_e() {
      return this.field_107240_b;
   }

   public void func_107230_c(int var1) {
      this.field_107240_b = var1;
   }

   public C_100387_amw func_107238_a(C_100730_lb var1, int var2) {
      double var3 = (double)this.field_107242_a[var2].field_107346_a + (double)((int)(var1.field_103182_N + 1.0F)) * 0.5D;
      double var5 = (double)this.field_107242_a[var2].field_107344_b;
      double var7 = (double)this.field_107242_a[var2].field_107345_c + (double)((int)(var1.field_103182_N + 1.0F)) * 0.5D;
      return var1.field_103229_p.func_109363_R().func_107878_a(var3, var5, var7);
   }

   public C_100387_amw func_107237_a(C_100730_lb var1) {
      return this.func_107238_a(var1, this.field_107240_b);
   }

   public boolean func_107228_a(C_100278_agj var1) {
      if(var1 == null) {
         return false;
      } else if(var1.field_107242_a.length != this.field_107242_a.length) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.field_107242_a.length; ++var2) {
            if(this.field_107242_a[var2].field_107346_a != var1.field_107242_a[var2].field_107346_a || this.field_107242_a[var2].field_107344_b != var1.field_107242_a[var2].field_107344_b || this.field_107242_a[var2].field_107345_c != var1.field_107242_a[var2].field_107345_c) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean func_107234_b(C_100387_amw var1) {
      C_100292_agi var2 = this.func_107236_c();
      return var2 == null?false:var2.field_107346_a == (int)var1.field_107872_c && var2.field_107345_c == (int)var1.field_107870_e;
   }
}
