import java.util.Random;

public class C_101312_yf extends C_101324_xz {

   public C_101312_yf(int var1) {
      super(var1);
      this.field_112483_K.clear();
      this.field_112473_A = (byte)C_100451_alf.field_106082_H.field_106162_cm;
      this.field_112474_B = (byte)C_100451_alf.field_106082_H.field_106162_cm;
      this.field_112481_I.field_112581_z = -999;
      this.field_112481_I.field_112553_C = 2;
      this.field_112481_I.field_112548_E = 50;
      this.field_112481_I.field_112549_F = 10;
   }

   public void func_112456_a(C_100873_xe var1, Random var2, int var3, int var4) {
      super.func_112456_a(var1, var2, var3, var4);
      if(var2.nextInt(1000) == 0) {
         int var5 = var3 + var2.nextInt(16) + 8;
         int var6 = var4 + var2.nextInt(16) + 8;
         C_100567_aam var7 = new C_100567_aam();
         var7.func_107965_a(var1, var2, var5, var1.func_109538_f(var5, var6) + 1, var6);
      }

   }
}
