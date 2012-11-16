import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C_100521_oe extends C_100304_ago {

   private C_100873_xe field_107285_a;
   private final List field_107283_b = new ArrayList();
   private final List field_107284_c = new ArrayList();
   private final List field_107281_d = new ArrayList();
   private int field_107282_e = 0;


   public C_100521_oe(String var1) {
      super(var1);
   }

   public C_100521_oe(C_100873_xe var1) {
      super("villages");
      this.field_107285_a = var1;
      this.func_107264_c();
   }

   public void func_107275_a(C_100873_xe var1) {
      this.field_107285_a = var1;
      Iterator var2 = this.field_107281_d.iterator();

      while(var2.hasNext()) {
         C_100531_ob var3 = (C_100531_ob)var2.next();
         var3.func_108618_a(var1);
      }

   }

   public void func_107273_a(int var1, int var2, int var3) {
      if(this.field_107283_b.size() <= 64) {
         if(!this.func_107272_d(var1, var2, var3)) {
            this.field_107283_b.add(new C_100013_k(var1, var2, var3));
         }

      }
   }

   public void func_107271_a() {
      ++this.field_107282_e;
      Iterator var1 = this.field_107281_d.iterator();

      while(var1.hasNext()) {
         C_100531_ob var2 = (C_100531_ob)var1.next();
         var2.func_108610_a(this.field_107282_e);
      }

      this.func_107280_e();
      this.func_107274_f();
      this.func_107277_g();
      if(this.field_107282_e % 400 == 0) {
         this.func_107264_c();
      }

   }

   private void func_107280_e() {
      Iterator var1 = this.field_107281_d.iterator();

      while(var1.hasNext()) {
         C_100531_ob var2 = (C_100531_ob)var1.next();
         if(var2.func_108627_g()) {
            var1.remove();
            this.func_107264_c();
         }
      }

   }

   public List func_107276_b() {
      return this.field_107281_d;
   }

   public C_100531_ob func_107279_a(int var1, int var2, int var3, int var4) {
      C_100531_ob var5 = null;
      float var6 = Float.MAX_VALUE;
      Iterator var7 = this.field_107281_d.iterator();

      while(var7.hasNext()) {
         C_100531_ob var8 = (C_100531_ob)var7.next();
         float var9 = var8.func_108609_a().func_105268_e(var1, var2, var3);
         if(var9 < var6) {
            int var10 = var4 + var8.func_108616_b();
            if(var9 <= (float)(var10 * var10)) {
               var5 = var8;
               var6 = var9;
            }
         }
      }

      return var5;
   }

   private void func_107274_f() {
      if(!this.field_107283_b.isEmpty()) {
         this.func_107268_a((C_100013_k)this.field_107283_b.remove(0));
      }
   }

   private void func_107277_g() {
      Iterator var1 = this.field_107284_c.iterator();

      while(var1.hasNext()) {
         C_100529_oa var2 = (C_100529_oa)var1.next();
         boolean var3 = false;
         Iterator var4 = this.field_107281_d.iterator();

         while(true) {
            if(var4.hasNext()) {
               C_100531_ob var5 = (C_100531_ob)var4.next();
               int var6 = (int)var5.func_108609_a().func_105268_e(var2.field_108602_a, var2.field_108600_b, var2.field_108601_c);
               int var7 = 32 + var5.func_108616_b();
               if(var6 > var7 * var7) {
                  continue;
               }

               var5.func_108620_a(var2);
               var3 = true;
            }

            if(!var3) {
               C_100531_ob var8 = new C_100531_ob(this.field_107285_a);
               var8.func_108620_a(var2);
               this.field_107281_d.add(var8);
               this.func_107264_c();
            }
            break;
         }
      }

      this.field_107284_c.clear();
   }

   private void func_107268_a(C_100013_k var1) {
      byte var2 = 16;
      byte var3 = 4;
      byte var4 = 16;

      for(int var5 = var1.field_105273_a - var2; var5 < var1.field_105273_a + var2; ++var5) {
         for(int var6 = var1.field_105271_b - var3; var6 < var1.field_105271_b + var3; ++var6) {
            for(int var7 = var1.field_105272_c - var4; var7 < var1.field_105272_c + var4; ++var7) {
               if(this.func_107270_e(var5, var6, var7)) {
                  C_100529_oa var8 = this.func_107278_b(var5, var6, var7);
                  if(var8 == null) {
                     this.func_107269_c(var5, var6, var7);
                  } else {
                     var8.field_108596_f = this.field_107282_e;
                  }
               }
            }
         }
      }

   }

   private C_100529_oa func_107278_b(int var1, int var2, int var3) {
      Iterator var4 = this.field_107284_c.iterator();

      C_100529_oa var5;
      do {
         if(!var4.hasNext()) {
            var4 = this.field_107281_d.iterator();

            C_100529_oa var6;
            do {
               if(!var4.hasNext()) {
                  return null;
               }

               C_100531_ob var7 = (C_100531_ob)var4.next();
               var6 = var7.func_108611_e(var1, var2, var3);
            } while(var6 == null);

            return var6;
         }

         var5 = (C_100529_oa)var4.next();
      } while(var5.field_108602_a != var1 || var5.field_108601_c != var3 || Math.abs(var5.field_108600_b - var2) > 1);

      return var5;
   }

   private void func_107269_c(int var1, int var2, int var3) {
      int var4 = ((C_100192_aim)C_100451_alf.field_106200_aH).func_106322_d(this.field_107285_a, var1, var2, var3);
      int var5;
      int var6;
      if(var4 != 0 && var4 != 2) {
         var5 = 0;

         for(var6 = -5; var6 < 0; ++var6) {
            if(this.field_107285_a.func_109502_j(var1, var2, var3 + var6)) {
               --var5;
            }
         }

         for(var6 = 1; var6 <= 5; ++var6) {
            if(this.field_107285_a.func_109502_j(var1, var2, var3 + var6)) {
               ++var5;
            }
         }

         if(var5 != 0) {
            this.field_107284_c.add(new C_100529_oa(var1, var2, var3, 0, var5 > 0?-2:2, this.field_107282_e));
         }
      } else {
         var5 = 0;

         for(var6 = -5; var6 < 0; ++var6) {
            if(this.field_107285_a.func_109502_j(var1 + var6, var2, var3)) {
               --var5;
            }
         }

         for(var6 = 1; var6 <= 5; ++var6) {
            if(this.field_107285_a.func_109502_j(var1 + var6, var2, var3)) {
               ++var5;
            }
         }

         if(var5 != 0) {
            this.field_107284_c.add(new C_100529_oa(var1, var2, var3, var5 > 0?-2:2, 0, this.field_107282_e));
         }
      }

   }

   private boolean func_107272_d(int var1, int var2, int var3) {
      Iterator var4 = this.field_107283_b.iterator();

      C_100013_k var5;
      do {
         if(!var4.hasNext()) {
            return false;
         }

         var5 = (C_100013_k)var4.next();
      } while(var5.field_105273_a != var1 || var5.field_105271_b != var2 || var5.field_105272_c != var3);

      return true;
   }

   private boolean func_107270_e(int var1, int var2, int var3) {
      int var4 = this.field_107285_a.func_109349_a(var1, var2, var3);
      return var4 == C_100451_alf.field_106200_aH.field_106162_cm;
   }

   public void func_107261_a(C_100353_bh var1) {
      this.field_107282_e = var1.func_107514_e("Tick");
      C_100339_bp var2 = var1.func_107513_m("Villages");

      for(int var3 = 0; var3 < var2.func_107501_c(); ++var3) {
         C_100353_bh var4 = (C_100353_bh)var2.func_107498_b(var3);
         C_100531_ob var5 = new C_100531_ob();
         var5.func_108631_a(var4);
         this.field_107281_d.add(var5);
      }

   }

   public void func_107265_b(C_100353_bh var1) {
      var1.func_107520_a("Tick", this.field_107282_e);
      C_100339_bp var2 = new C_100339_bp("Villages");
      Iterator var3 = this.field_107281_d.iterator();

      while(var3.hasNext()) {
         C_100531_ob var4 = (C_100531_ob)var3.next();
         C_100353_bh var5 = new C_100353_bh("Village");
         var4.func_108628_b(var5);
         var2.func_107500_a(var5);
      }

      var1.func_107530_a("Villages", var2);
   }
}
