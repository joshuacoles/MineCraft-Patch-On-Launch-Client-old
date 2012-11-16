import java.util.List;
import java.util.Random;

public class C_100744_adg extends C_100775_adu {

   private final int field_108492_a;


   public C_100744_adg(int var1, Random var2, C_100516_abo var3, int var4) {
      super(var1);
      this.field_108402_f = var4;
      this.field_108404_e = var3;
      this.field_108492_a = var4 != 2 && var4 != 0?var3.func_108329_b():var3.func_108325_d();
   }

   public static C_100516_abo func_108491_a(List var0, Random var1, int var2, int var3, int var4, int var5) {
      C_100516_abo var7 = C_100516_abo.func_108324_a(var2, var3, var4, -1, -1, 0, 5, 5, 4, var5);
      C_100767_adx var8 = C_100767_adx.func_108401_a(var0, var7);
      if(var8 == null) {
         return null;
      } else {
         if(var8.func_108381_b().field_108339_b == var7.field_108339_b) {
            for(int var9 = 3; var9 >= 1; --var9) {
               var7 = C_100516_abo.func_108324_a(var2, var3, var4, -1, -1, 0, 5, 5, var9 - 1, var5);
               if(!var8.func_108381_b().func_108333_a(var7)) {
                  return C_100516_abo.func_108324_a(var2, var3, var4, -1, -1, 0, 5, 5, var9, var5);
               }
            }
         }

         return null;
      }
   }

   public boolean func_108387_a(C_100873_xe var1, Random var2, C_100516_abo var3) {
      if(this.func_108399_a(var1, var3)) {
         return false;
      } else {
         for(int var4 = 0; var4 < this.field_108492_a; ++var4) {
            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 0, 0, var4, var3);
            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 1, 0, var4, var3);
            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 2, 0, var4, var3);
            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 3, 0, var4, var3);
            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 4, 0, var4, var3);

            for(int var5 = 1; var5 <= 3; ++var5) {
               this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 0, var5, var4, var3);
               this.func_108400_a(var1, 0, 0, 1, var5, var4, var3);
               this.func_108400_a(var1, 0, 0, 2, var5, var4, var3);
               this.func_108400_a(var1, 0, 0, 3, var5, var4, var3);
               this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 4, var5, var4, var3);
            }

            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 0, 4, var4, var3);
            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 1, 4, var4, var3);
            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 2, 4, var4, var3);
            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 3, 4, var4, var3);
            this.func_108400_a(var1, C_100451_alf.field_106135_bp.field_106162_cm, 0, 4, 4, var4, var3);
         }

         return true;
      }
   }
}
