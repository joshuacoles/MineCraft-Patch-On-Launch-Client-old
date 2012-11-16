import java.util.Random;

public class C_100175_ajf extends C_100451_alf {

   private int field_106301_a;


   public C_100175_ajf(int var1, C_100664_afg var2, int var3, int var4) {
      super(var1, var3, var2);
      this.field_106301_a = var4;
   }

   public int func_106029_a(int var1, int var2) {
      return var2 == 10 && var1 > 1?this.field_106165_cl - 1:(var2 >= 1 && var2 <= 9 && var1 == 1?this.field_106165_cl - 16 - this.field_106301_a:(var2 >= 1 && var2 <= 3 && var1 == 2?this.field_106165_cl - 16 - this.field_106301_a:(var2 >= 7 && var2 <= 9 && var1 == 3?this.field_106165_cl - 16 - this.field_106301_a:((var2 == 1 || var2 == 4 || var2 == 7) && var1 == 4?this.field_106165_cl - 16 - this.field_106301_a:((var2 == 3 || var2 == 6 || var2 == 9) && var1 == 5?this.field_106165_cl - 16 - this.field_106301_a:(var2 == 14?this.field_106165_cl - 16 - this.field_106301_a:(var2 == 15?this.field_106165_cl - 1:this.field_106165_cl)))))));
   }

   public int func_106063_a(Random var1) {
      int var2 = var1.nextInt(10) - 7;
      if(var2 < 0) {
         var2 = 0;
      }

      return var2;
   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100451_alf.field_106228_ai.field_106162_cm + this.field_106301_a;
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100451_alf.field_106228_ai.field_106162_cm + this.field_106301_a;
   }
}
