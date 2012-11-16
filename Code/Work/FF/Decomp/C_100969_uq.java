import java.util.List;

public class C_100969_uq extends C_100992_tt {

   private static final String[] field_111002_a = new String[]{"skeleton", "wither", "zombie", "char", "creeper"};
   private static final int[] field_111001_b = new int[]{224, 225, 226, 227, 228};


   public C_100969_uq(int var1) {
      super(var1);
      this.func_110802_a(C_101040_sq.field_111418_c);
      this.func_110804_e(0);
      this.func_110800_a(true);
   }

   public boolean func_110764_a(C_100994_tv var1, C_101095_qg var2, C_100873_xe var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(var7 == 0) {
         return false;
      } else if(!var3.func_109350_f(var4, var5, var6).func_108983_a()) {
         return false;
      } else {
         if(var7 == 1) {
            ++var5;
         }

         if(var7 == 2) {
            --var6;
         }

         if(var7 == 3) {
            ++var6;
         }

         if(var7 == 4) {
            --var4;
         }

         if(var7 == 5) {
            ++var4;
         }

         if(!var2.func_103799_a(var4, var5, var6, var7, var1)) {
            return false;
         } else if(!C_100451_alf.field_106167_cj.func_106023_b(var3, var4, var5, var6)) {
            return false;
         } else {
            var3.func_109394_d(var4, var5, var6, C_100451_alf.field_106167_cj.field_106162_cm, var7);
            int var11 = 0;
            if(var7 == 1) {
               var11 = C_100650_jv.func_108910_c((double)(var2.field_103236_z * 16.0F / 360.0F) + 0.5D) & 15;
            }

            C_100398_amm var12 = var3.func_109353_p(var4, var5, var6);
            if(var12 != null && var12 instanceof C_100415_amk) {
               String var13 = "";
               if(var1.func_111339_o() && var1.func_111352_p().func_107516_b("SkullOwner")) {
                  var13 = var1.func_111352_p().func_107534_i("SkullOwner");
               }

               ((C_100415_amk)var12).func_102966_a(var1.func_111367_j(), var13);
               ((C_100415_amk)var12).func_102964_a(var11);
               ((C_100472_akr)C_100451_alf.field_106167_cj).func_106348_a(var3, var4, var5, var6, (C_100415_amk)var12);
            }

            --var1.field_111398_a;
            return true;
         }
      }
   }

   public void func_110767_a(int var1, C_101040_sq var2, List var3) {
      for(int var4 = 0; var4 < field_111002_a.length; ++var4) {
         var3.add(new C_100994_tv(var1, 1, var4));
      }

   }

   public int func_110787_b(int var1) {
      if(var1 < 0 || var1 >= field_111002_a.length) {
         var1 = 0;
      }

      return field_111001_b[var1];
   }

   public int func_110748_a(int var1) {
      return var1;
   }

   public String func_110791_c_(C_100994_tv var1) {
      int var2 = var1.func_111367_j();
      if(var2 < 0 || var2 >= field_111002_a.length) {
         var2 = 0;
      }

      return super.func_110793_a() + "." + field_111002_a[var2];
   }

   public String func_110750_j(C_100994_tv var1) {
      return var1.func_111367_j() == 3 && var1.func_111339_o() && var1.func_111352_p().func_107516_b("SkullOwner")?C_100359_bd.func_107637_a("item.skull.player.name", new Object[]{var1.func_111352_p().func_107534_i("SkullOwner")}):super.func_110750_j(var1);
   }

}
