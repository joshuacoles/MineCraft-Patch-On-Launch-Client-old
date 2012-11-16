import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class C_100757_ic {

   private final List field_109666_b;
   private final C_100858_wx field_109667_c;
   private short[] field_109664_d;
   private int field_109665_e;
   private int field_109663_f;
   // $FF: synthetic field
   final C_100759_ib field_109668_a;


   public C_100757_ic(C_100759_ib var1, int var2, int var3) {
      this.field_109668_a = var1;
      this.field_109666_b = new ArrayList();
      this.field_109664_d = new short[64];
      this.field_109665_e = 0;
      this.field_109667_c = new C_100858_wx(var2, var3);
      var1.func_109669_a().field_109620_b.func_108660_c(var2, var3);
   }

   public void func_109660_a(C_100762_ih var1) {
      if(this.field_109666_b.contains(var1)) {
         throw new IllegalStateException("Failed to add player. " + var1 + " already is in chunk " + this.field_109667_c.field_110239_a + ", " + this.field_109667_c.field_110238_b);
      } else {
         this.field_109666_b.add(var1);
         var1.field_104512_f.add(this.field_109667_c);
      }
   }

   public void func_109662_b(C_100762_ih var1) {
      if(this.field_109666_b.contains(var1)) {
         var1.field_104518_a.func_107009_b(new C_100246_dj(C_100759_ib.func_109680_a(this.field_109668_a).func_109440_e(this.field_109667_c.field_110239_a, this.field_109667_c.field_110238_b), true, 0));
         this.field_109666_b.remove(var1);
         var1.field_104512_f.remove(this.field_109667_c);
         if(this.field_109666_b.isEmpty()) {
            long var2 = (long)this.field_109667_c.field_110239_a + 2147483647L | (long)this.field_109667_c.field_110238_b + 2147483647L << 32;
            C_100759_ib.func_109677_b(this.field_109668_a).func_108950_d(var2);
            if(this.field_109665_e > 0) {
               C_100759_ib.func_109670_c(this.field_109668_a).remove(this);
            }

            this.field_109668_a.func_109669_a().field_109620_b.func_108687_b(this.field_109667_c.field_110239_a, this.field_109667_c.field_110238_b);
         }

      }
   }

   public void func_109661_a(int var1, int var2, int var3) {
      if(this.field_109665_e == 0) {
         C_100759_ib.func_109670_c(this.field_109668_a).add(this);
      }

      this.field_109663_f |= 1 << (var2 >> 4);
      if(this.field_109665_e < 64) {
         short var4 = (short)(var1 << 12 | var3 << 8 | var2);

         for(int var5 = 0; var5 < this.field_109665_e; ++var5) {
            if(this.field_109664_d[var5] == var4) {
               return;
            }
         }

         this.field_109664_d[this.field_109665_e++] = var4;
      }

   }

   public void func_109656_a(C_100219_dx var1) {
      Iterator var2 = this.field_109666_b.iterator();

      while(var2.hasNext()) {
         C_100762_ih var3 = (C_100762_ih)var2.next();
         if(!var3.field_104512_f.contains(this.field_109667_c)) {
            var3.field_104518_a.func_107009_b(var1);
         }
      }

   }

   public void func_109658_a() {
      if(this.field_109665_e != 0) {
         int var1;
         int var2;
         int var3;
         if(this.field_109665_e == 1) {
            var1 = this.field_109667_c.field_110239_a * 16 + (this.field_109664_d[0] >> 12 & 15);
            var2 = this.field_109664_d[0] & 255;
            var3 = this.field_109667_c.field_110238_b * 16 + (this.field_109664_d[0] >> 8 & 15);
            this.func_109656_a(new C_100273_fa(var1, var2, var3, C_100759_ib.func_109680_a(this.field_109668_a)));
            if(C_100759_ib.func_109680_a(this.field_109668_a).func_109494_d(var1, var2, var3)) {
               this.func_109657_a(C_100759_ib.func_109680_a(this.field_109668_a).func_109353_p(var1, var2, var3));
            }
         } else {
            int var4;
            if(this.field_109665_e == 64) {
               var1 = this.field_109667_c.field_110239_a * 16;
               var2 = this.field_109667_c.field_110238_b * 16;
               this.func_109656_a(new C_100246_dj(C_100759_ib.func_109680_a(this.field_109668_a).func_109440_e(this.field_109667_c.field_110239_a, this.field_109667_c.field_110238_b), false, this.field_109663_f));

               for(var3 = 0; var3 < 16; ++var3) {
                  if((this.field_109663_f & 1 << var3) != 0) {
                     var4 = var3 << 4;
                     List var5 = C_100759_ib.func_109680_a(this.field_109668_a).func_109613_b(var1, var4, var2, var1 + 16, var4 + 16, var2 + 16);
                     Iterator var6 = var5.iterator();

                     while(var6.hasNext()) {
                        C_100398_amm var7 = (C_100398_amm)var6.next();
                        this.func_109657_a(var7);
                     }
                  }
               }
            } else {
               this.func_109656_a(new C_100394_cn(this.field_109667_c.field_110239_a, this.field_109667_c.field_110238_b, this.field_109664_d, this.field_109665_e, C_100759_ib.func_109680_a(this.field_109668_a)));

               for(var1 = 0; var1 < this.field_109665_e; ++var1) {
                  var2 = this.field_109667_c.field_110239_a * 16 + (this.field_109664_d[var1] >> 12 & 15);
                  var3 = this.field_109664_d[var1] & 255;
                  var4 = this.field_109667_c.field_110238_b * 16 + (this.field_109664_d[var1] >> 8 & 15);
                  if(C_100759_ib.func_109680_a(this.field_109668_a).func_109494_d(var2, var3, var4)) {
                     this.func_109657_a(C_100759_ib.func_109680_a(this.field_109668_a).func_109353_p(var2, var3, var4));
                  }
               }
            }
         }

         this.field_109665_e = 0;
         this.field_109663_f = 0;
      }
   }

   private void func_109657_a(C_100398_amm var1) {
      if(var1 != null) {
         C_100219_dx var2 = var1.func_102924_l();
         if(var2 != null) {
            this.func_109656_a(var2);
         }
      }

   }

   // $FF: synthetic method
   static C_100858_wx func_109659_a(C_100757_ic var0) {
      return var0.field_109667_c;
   }

   // $FF: synthetic method
   static List func_109655_b(C_100757_ic var0) {
      return var0.field_109666_b;
   }
}
