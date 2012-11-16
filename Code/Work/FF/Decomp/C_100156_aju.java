
public class C_100156_aju extends C_100200_aiq {

   public C_100156_aju(int var1) {
      super(var1, 74, C_100664_afg.field_109008_d);
      this.func_106034_a(C_101040_sq.field_111415_d);
   }

   public int func_106024_a(int var1) {
      return this.field_106165_cl;
   }

   public void func_106017_a(C_100873_xe var1, int var2, int var3, int var4, int var5) {
      if(var5 > 0) {
         boolean var6 = var1.func_109425_z(var2, var3, var4);
         C_100417_ami var7 = (C_100417_ami)var1.func_109353_p(var2, var3, var4);
         if(var7 != null && var7.field_102992_b != var6) {
            if(var6) {
               var7.func_102991_a(var1, var2, var3, var4);
            }

            var7.field_102992_b = var6;
         }
      }

   }

   public boolean func_106070_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5, int var6, float var7, float var8, float var9) {
      if(var1.field_109557_J) {
         return true;
      } else {
         C_100417_ami var10 = (C_100417_ami)var1.func_109353_p(var2, var3, var4);
         if(var10 != null) {
            var10.func_102990_a();
            var10.func_102991_a(var1, var2, var3, var4);
         }

         return true;
      }
   }

   public void func_105993_a(C_100873_xe var1, int var2, int var3, int var4, C_101095_qg var5) {
      if(!var1.field_109557_J) {
         C_100417_ami var6 = (C_100417_ami)var1.func_109353_p(var2, var3, var4);
         if(var6 != null) {
            var6.func_102991_a(var1, var2, var3, var4);
         }

      }
   }

   public C_100398_amm func_106326_a(C_100873_xe var1) {
      return new C_100417_ami();
   }

   public void func_105980_b(C_100873_xe var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = (float)Math.pow(2.0D, (double)(var6 - 12) / 12.0D);
      String var8 = "harp";
      if(var5 == 1) {
         var8 = "bd";
      }

      if(var5 == 2) {
         var8 = "snare";
      }

      if(var5 == 3) {
         var8 = "hat";
      }

      if(var5 == 4) {
         var8 = "bassattack";
      }

      var1.func_109476_a((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "note." + var8, 3.0F, var7);
      var1.func_109428_a("note", (double)var2 + 0.5D, (double)var3 + 1.2D, (double)var4 + 0.5D, (double)var6 / 24.0D, 0.0D, 0.0D);
   }
}
