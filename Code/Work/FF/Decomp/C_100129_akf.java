
public class C_100129_akf extends C_100186_aij {

   private boolean field_106303_a;


   protected C_100129_akf(int var1, int var2, boolean var3) {
      super(var1, C_100664_afg.field_108998_A);
      this.field_106165_cl = var2;
      this.func_105972_b(true);
      this.field_106303_a = var3;
      this.func_106034_a(C_101040_sq.field_111417_b);
   }

   public int func_106029_a(int var1, int var2) {
      if(var1 == 1) {
         return this.field_106165_cl;
      } else if(var1 == 0) {
         return this.field_106165_cl;
      } else {
         int var3 = this.field_106165_cl + 1 + 16;
         if(this.field_106303_a) {
            ++var3;
         }

         return var2 == 2 && var1 == 2?var3:(var2 == 3 && var1 == 5?var3:(var2 == 0 && var1 == 3?var3:(var2 == 1 && var1 == 4?var3:this.field_106165_cl + 16)));
      }
   }

   public int func_106024_a(int var1) {
      return var1 == 1?this.field_106165_cl:(var1 == 0?this.field_106165_cl:(var1 == 3?this.field_106165_cl + 1 + 16:this.field_106165_cl + 16));
   }

   public void func_106054_g(C_100873_xe var1, int var2, int var3, int var4) {
      super.func_106054_g(var1, var2, var3, var4);
      if(var1.func_109349_a(var2, var3 - 1, var4) == C_100451_alf.field_106183_aX.field_106162_cm && var1.func_109349_a(var2, var3 - 2, var4) == C_100451_alf.field_106183_aX.field_106162_cm) {
         if(!var1.field_109557_J) {
            var1.func_109378_b(var2, var3, var4, 0);
            var1.func_109378_b(var2, var3 - 1, var4, 0);
            var1.func_109378_b(var2, var3 - 2, var4, 0);
            C_100553_op var9 = new C_100553_op(var1);
            var9.func_103055_b((double)var2 + 0.5D, (double)var3 - 1.95D, (double)var4 + 0.5D, 0.0F, 0.0F);
            var1.func_109513_d(var9);
            var1.func_109409_f(var2, var3, var4, 0);
            var1.func_109409_f(var2, var3 - 1, var4, 0);
            var1.func_109409_f(var2, var3 - 2, var4, 0);
         }

         for(int var10 = 0; var10 < 120; ++var10) {
            var1.func_109428_a("snowshovel", (double)var2 + var1.field_109577_u.nextDouble(), (double)(var3 - 2) + var1.field_109577_u.nextDouble() * 2.5D, (double)var4 + var1.field_109577_u.nextDouble(), 0.0D, 0.0D, 0.0D);
         }
      } else if(var1.func_109349_a(var2, var3 - 1, var4) == C_100451_alf.field_106226_al.field_106162_cm && var1.func_109349_a(var2, var3 - 2, var4) == C_100451_alf.field_106226_al.field_106162_cm) {
         boolean var5 = var1.func_109349_a(var2 - 1, var3 - 1, var4) == C_100451_alf.field_106226_al.field_106162_cm && var1.func_109349_a(var2 + 1, var3 - 1, var4) == C_100451_alf.field_106226_al.field_106162_cm;
         boolean var6 = var1.func_109349_a(var2, var3 - 1, var4 - 1) == C_100451_alf.field_106226_al.field_106162_cm && var1.func_109349_a(var2, var3 - 1, var4 + 1) == C_100451_alf.field_106226_al.field_106162_cm;
         if(var5 || var6) {
            var1.func_109378_b(var2, var3, var4, 0);
            var1.func_109378_b(var2, var3 - 1, var4, 0);
            var1.func_109378_b(var2, var3 - 2, var4, 0);
            if(var5) {
               var1.func_109378_b(var2 - 1, var3 - 1, var4, 0);
               var1.func_109378_b(var2 + 1, var3 - 1, var4, 0);
            } else {
               var1.func_109378_b(var2, var3 - 1, var4 - 1, 0);
               var1.func_109378_b(var2, var3 - 1, var4 + 1, 0);
            }

            C_100557_or var7 = new C_100557_or(var1);
            var7.func_103679_g(true);
            var7.func_103055_b((double)var2 + 0.5D, (double)var3 - 1.95D, (double)var4 + 0.5D, 0.0F, 0.0F);
            var1.func_109513_d(var7);

            for(int var8 = 0; var8 < 120; ++var8) {
               var1.func_109428_a("snowballpoof", (double)var2 + var1.field_109577_u.nextDouble(), (double)(var3 - 2) + var1.field_109577_u.nextDouble() * 3.9D, (double)var4 + var1.field_109577_u.nextDouble(), 0.0D, 0.0D, 0.0D);
            }

            var1.func_109409_f(var2, var3, var4, 0);
            var1.func_109409_f(var2, var3 - 1, var4, 0);
            var1.func_109409_f(var2, var3 - 2, var4, 0);
            if(var5) {
               var1.func_109409_f(var2 - 1, var3 - 1, var4, 0);
               var1.func_109409_f(var2 + 1, var3 - 1, var4, 0);
            } else {
               var1.func_109409_f(var2, var3 - 1, var4 - 1, 0);
               var1.func_109409_f(var2, var3 - 1, var4 + 1, 0);
            }
         }
      }

   }

   public boolean func_106023_b(C_100873_xe var1, int var2, int var3, int var4) {
      int var5 = var1.func_109349_a(var2, var3, var4);
      return (var5 == 0 || C_100451_alf.field_106118_p[var5].field_106204_cB.func_108984_j()) && var1.func_109348_t(var2, var3 - 1, var4);
   }

   public void func_106047_a(C_100873_xe var1, int var2, int var3, int var4, C_100595_ln var5) {
      int var6 = C_100650_jv.func_108910_c((double)(var5.field_103236_z * 4.0F / 360.0F) + 2.5D) & 3;
      var1.func_109488_c(var2, var3, var4, var6);
   }
}
