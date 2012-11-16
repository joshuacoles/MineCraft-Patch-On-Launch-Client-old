
public abstract class C_100200_aiq extends C_100451_alf {

   protected C_100200_aiq(int var1, C_100664_afg var2) {
      super(var1, var2);
      this.field_106157_cs = true;
   }

   protected C_100200_aiq(int var1, int var2, C_100664_afg var3) {
      super(var1, var2, var3);
      this.field_106157_cs = true;
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      super.func_106054_g(var1, var2, var3, var4);
      var1.func_109543_a(var2, var3, var4, this.func_106326_a(var1));
   }

   public void func_106041_a(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      super.func_106041_a(var1, var2, var3, var4, var5, var6);
      var1.func_109498_q(var2, var3, var4);
   }

   public abstract C_100398_amm func_106326_a(C_100873_xe var1);

   public void func_105980_b(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      super.func_105980_b(var1, var2, var3, var4, var5, var6);
      C_100398_amm var7 = var1.func_109353_p(var2, var3, var4);
      if(var7 != null) {
         var7.func_102918_b(var5, var6);
      }

   }
}
