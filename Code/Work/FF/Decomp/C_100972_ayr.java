import java.util.Comparator;

public class C_100972_ayr implements Comparator {

   private double field_111173_a;
   private double field_111171_b;
   private double field_111172_c;


   public C_100972_ayr(C_100730_lb var1) {
      this.field_111173_a = -var1.field_103221_t;
      this.field_111171_b = -var1.field_103219_u;
      this.field_111172_c = -var1.field_103217_v;
   }

   public int func_111170_a(C_100975_ayp var1, C_100975_ayp var2) {
      double var3 = (double)var1.field_111197_n + this.field_111173_a;
      double var5 = (double)var1.field_111198_o + this.field_111171_b;
      double var7 = (double)var1.field_111212_p + this.field_111172_c;
      double var9 = (double)var2.field_111197_n + this.field_111173_a;
      double var11 = (double)var2.field_111198_o + this.field_111171_b;
      double var13 = (double)var2.field_111212_p + this.field_111172_c;
      return (int)((var3 * var3 + var5 * var5 + var7 * var7 - (var9 * var9 + var11 * var11 + var13 * var13)) * 1024.0D);
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.func_111170_a((C_100975_ayp)var1, (C_100975_ayp)var2);
   }
}
