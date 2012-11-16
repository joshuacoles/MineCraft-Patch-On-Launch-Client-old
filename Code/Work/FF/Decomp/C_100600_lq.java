import java.util.ArrayList;

public class C_100600_lq extends C_100597_ll {

   public C_100599_lr field_104587_e;


   public C_100600_lq(C_100873_xe var1) {
      super(var1);
   }

   public C_100600_lq(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
      ArrayList var6 = new ArrayList();
      C_100599_lr[] var7 = C_100599_lr.func_108782_values();
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         C_100599_lr var10 = var7[var9];
         this.field_104587_e = var10;
         this.func_104571_a(var5);
         if(this.func_104573_c()) {
            var6.add(var10);
         }
      }

      if(!var6.isEmpty()) {
         this.field_104587_e = (C_100599_lr)var6.get(this.field_103232_aa.nextInt(var6.size()));
      }

      this.func_104571_a(var5);
   }

   public C_100600_lq(C_100873_xe var1, int var2, int var3, int var4, int var5, String var6) {
      this(var1, var2, var3, var4, var5);
      C_100599_lr[] var7 = C_100599_lr.func_108782_values();
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         C_100599_lr var10 = var7[var9];
         if(var10.field_108788_B.equals(var6)) {
            this.field_104587_e = var10;
            break;
         }
      }

      this.func_104571_a(var5);
   }

   public void func_103078_b(C_100353_bh var1) {
      var1.func_107533_a("Motive", this.field_104587_e.field_108788_B);
      super.func_103078_b(var1);
   }

   public void func_103110_a(C_100353_bh var1) {
      String var2 = var1.func_107534_i("Motive");
      C_100599_lr[] var3 = C_100599_lr.func_108782_values();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         C_100599_lr var6 = var3[var5];
         if(var6.field_108788_B.equals(var2)) {
            this.field_104587_e = var6;
         }
      }

      if(this.field_104587_e == null) {
         this.field_104587_e = C_100599_lr.field_108796_a;
      }

      super.func_103110_a(var1);
   }

   public int func_104572_d() {
      return this.field_104587_e.field_108789_C;
   }

   public int func_104574_g() {
      return this.field_104587_e.field_108783_D;
   }

   public void func_104575_h() {
      this.func_103140_a(new C_100994_tv(C_100992_tt.field_110928_as), 0.0F);
   }
}
