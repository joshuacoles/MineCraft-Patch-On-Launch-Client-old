import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C_100768_hz {

   private final C_100765_ie field_109791_a;
   private Set field_109789_b = new HashSet();
   private C_100661_jq field_109790_c = new C_100661_jq();
   private int field_109788_d;


   public C_100768_hz(C_100765_ie var1) {
      this.field_109791_a = var1;
      this.field_109788_d = var1.func_109611_o().func_104931_ad().func_105724_a();
   }

   public void func_109783_a(C_100730_lb var1) {
      if(var1 instanceof C_100762_ih) {
         this.func_109787_a(var1, 512, 2);
         C_100762_ih var2 = (C_100762_ih)var1;
         Iterator var3 = this.field_109789_b.iterator();

         while(var3.hasNext()) {
            C_100795_ij var4 = (C_100795_ij)var3.next();
            if(var4.field_109956_a != var2) {
               var4.func_109948_b(var2);
            }
         }
      } else if(var1 instanceof C_101090_ql) {
         this.func_109781_a(var1, 64, 5, true);
      } else if(var1 instanceof C_101089_qi) {
         this.func_109781_a(var1, 64, 20, false);
      } else if(var1 instanceof C_101087_qo) {
         this.func_109781_a(var1, 64, 10, false);
      } else if(var1 instanceof C_101091_qk) {
         this.func_109781_a(var1, 64, 10, false);
      } else if(var1 instanceof C_101086_qp) {
         this.func_109781_a(var1, 64, 10, true);
      } else if(var1 instanceof C_101080_qs) {
         this.func_109781_a(var1, 64, 10, true);
      } else if(var1 instanceof C_101088_qj) {
         this.func_109781_a(var1, 64, 4, true);
      } else if(var1 instanceof C_101083_qr) {
         this.func_109781_a(var1, 64, 10, true);
      } else if(var1 instanceof C_101078_qu) {
         this.func_109781_a(var1, 64, 10, true);
      } else if(var1 instanceof C_101081_qt) {
         this.func_109781_a(var1, 64, 10, true);
      } else if(var1 instanceof C_100576_pg) {
         this.func_109781_a(var1, 64, 20, true);
      } else if(var1 instanceof C_100590_ph) {
         this.func_109781_a(var1, 80, 3, true);
      } else if(var1 instanceof C_100572_pe) {
         this.func_109781_a(var1, 80, 3, true);
      } else if(var1 instanceof C_100558_oq) {
         this.func_109781_a(var1, 64, 3, true);
      } else if(var1 instanceof C_100579_pa) {
         this.func_109781_a(var1, 80, 3, false);
      } else if(var1 instanceof C_100543_og) {
         this.func_109781_a(var1, 80, 3, false);
      } else if(var1 instanceof C_100696_kz) {
         this.func_109781_a(var1, 80, 3, true);
      } else if(var1 instanceof C_100568_oy) {
         this.func_109781_a(var1, 160, 3, true);
      } else if(var1 instanceof C_100591_pi) {
         this.func_109781_a(var1, 160, 10, true);
      } else if(var1 instanceof C_100574_pf) {
         this.func_109781_a(var1, 160, 20, true);
      } else if(var1 instanceof C_100600_lq) {
         this.func_109781_a(var1, 160, Integer.MAX_VALUE, false);
      } else if(var1 instanceof C_100722_lj) {
         this.func_109781_a(var1, 160, 20, true);
      } else if(var1 instanceof C_100563_ox) {
         this.func_109781_a(var1, 256, Integer.MAX_VALUE, false);
      } else if(var1 instanceof C_100596_lm) {
         this.func_109781_a(var1, 160, Integer.MAX_VALUE, false);
      }

   }

   public void func_109787_a(C_100730_lb var1, int var2, int var3) {
      this.func_109781_a(var1, var2, var3, false);
   }

   public void func_109781_a(C_100730_lb var1, int var2, int var3, boolean var4) {
      if(var2 > this.field_109788_d) {
         var2 = this.field_109788_d;
      }

      if(this.field_109790_c.func_109034_b(var1.field_103212_k)) {
         throw new IllegalStateException("Entity is already tracked!");
      } else {
         C_100795_ij var5 = new C_100795_ij(var1, var2, var3, var4);
         this.field_109789_b.add(var5);
         this.field_109790_c.func_109035_a(var1.field_103212_k, var5);
         var5.func_109949_b(this.field_109791_a.field_109573_h);
      }
   }

   public void func_109784_b(C_100730_lb var1) {
      if(var1 instanceof C_100762_ih) {
         C_100762_ih var2 = (C_100762_ih)var1;
         Iterator var3 = this.field_109789_b.iterator();

         while(var3.hasNext()) {
            C_100795_ij var4 = (C_100795_ij)var3.next();
            var4.func_109946_a(var2);
         }
      }

      C_100795_ij var5 = (C_100795_ij)this.field_109790_c.func_109047_d(var1.field_103212_k);
      if(var5 != null) {
         this.field_109789_b.remove(var5);
         var5.func_109943_a();
      }

   }

   public void func_109782_a() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.field_109789_b.iterator();

      while(var2.hasNext()) {
         C_100795_ij var3 = (C_100795_ij)var2.next();
         var3.func_109947_a(this.field_109791_a.field_109573_h);
         if(var3.field_109957_n && var3.field_109956_a instanceof C_100762_ih) {
            var1.add((C_100762_ih)var3.field_109956_a);
         }
      }

      var2 = var1.iterator();

      while(var2.hasNext()) {
         C_100762_ih var7 = (C_100762_ih)var2.next();
         C_100762_ih var4 = var7;
         Iterator var5 = this.field_109789_b.iterator();

         while(var5.hasNext()) {
            C_100795_ij var6 = (C_100795_ij)var5.next();
            if(var6.field_109956_a != var4) {
               var6.func_109948_b(var4);
            }
         }
      }

   }

   public void func_109780_a(C_100730_lb var1, C_100219_dx var2) {
      C_100795_ij var3 = (C_100795_ij)this.field_109790_c.func_109038_a(var1.field_103212_k);
      if(var3 != null) {
         var3.func_109940_a(var2);
      }

   }

   public void func_109786_b(C_100730_lb var1, C_100219_dx var2) {
      C_100795_ij var3 = (C_100795_ij)this.field_109790_c.func_109038_a(var1.field_103212_k);
      if(var3 != null) {
         var3.func_109944_b(var2);
      }

   }

   public void func_109785_a(C_100762_ih var1) {
      Iterator var2 = this.field_109789_b.iterator();

      while(var2.hasNext()) {
         C_100795_ij var3 = (C_100795_ij)var2.next();
         var3.func_109945_c(var1);
      }

   }
}
