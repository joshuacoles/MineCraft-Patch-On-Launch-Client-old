import java.util.Random;

public class C_100488_akm extends C_100451_alf {

   private final boolean field_106465_a;


   public C_100488_akm(int var1, boolean var2) {
      super(var1, 211, C_100664_afg.field_109025_s);
      this.field_106465_a = var2;
      if(var2) {
         this.func_106046_a(1.0F);
         ++this.field_106165_cl;
      }

   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      if(!var1.field_109557_J) {
         if(this.field_106465_a && !var1.func_109425_z(var2, var3, var4)) {
            var1.func_109398_a(var2, var3, var4, this.field_106162_cm, 4);
         } else if(!this.field_106465_a && var1.func_109425_z(var2, var3, var4)) {
            var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106231_bP.field_106162_cm);
         }
      }

   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(!var1.field_109557_J) {
         if(this.field_106465_a && !var1.func_109425_z(var2, var3, var4)) {
            var1.func_109398_a(var2, var3, var4, this.field_106162_cm, 4);
         } else if(!this.field_106465_a && var1.func_109425_z(var2, var3, var4)) {
            var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106231_bP.field_106162_cm);
         }
      }

   }

   public void func_105996_b(C_100873_xe var1, int var2, int var3, int var4, Random var5) {
      if(!var1.field_109557_J && this.field_106465_a && !var1.func_109425_z(var2, var3, var4)) {
         var1.func_109422_e(var2, var3, var4, C_100451_alf.field_106237_bO.field_106162_cm);
      }

   }

   public int func_106043_a(int var1, Random var2, int var3) {
      return C_100451_alf.field_106237_bO.field_106162_cm;
   }

   public int func_105979_a(C_100873_xe var1, int var2, int var3, int var4) {
      return C_100451_alf.field_106237_bO.field_106162_cm;
   }
}
