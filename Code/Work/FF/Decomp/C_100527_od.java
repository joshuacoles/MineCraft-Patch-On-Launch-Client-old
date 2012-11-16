import java.util.Iterator;
import java.util.List;

public class C_100527_od {

   private C_100873_xe field_108574_a;
   private boolean field_108572_b = false;
   private int field_108573_c = -1;
   private int field_108570_d;
   private int field_108571_e;
   private C_100531_ob field_108568_f;
   private int field_108569_g;
   private int field_108575_h;
   private int field_108576_i;


   public C_100527_od(C_100873_xe var1) {
      this.field_108574_a = var1;
   }

   public void func_108564_a() {
      boolean var1 = false;
      if(var1) {
         if(this.field_108573_c == 2) {
            this.field_108570_d = 100;
            return;
         }
      } else {
         if(this.field_108574_a.func_109402_t()) {
            this.field_108573_c = 0;
            return;
         }

         if(this.field_108573_c == 2) {
            return;
         }

         if(this.field_108573_c == 0) {
            float var2 = this.field_108574_a.func_109382_c(0.0F);
            if((double)var2 < 0.5D || (double)var2 > 0.501D) {
               return;
            }

            this.field_108573_c = this.field_108574_a.field_109577_u.nextInt(10) == 0?1:2;
            this.field_108572_b = false;
            if(this.field_108573_c == 2) {
               return;
            }
         }
      }

      if(!this.field_108572_b) {
         if(!this.func_108566_b()) {
            return;
         }

         this.field_108572_b = true;
      }

      if(this.field_108571_e > 0) {
         --this.field_108571_e;
      } else {
         this.field_108571_e = 2;
         if(this.field_108570_d > 0) {
            this.func_108567_c();
            --this.field_108570_d;
         } else {
            this.field_108573_c = 2;
         }

      }
   }

   private boolean func_108566_b() {
      List var1 = this.field_108574_a.field_109573_h;
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         C_101095_qg var3 = (C_101095_qg)var2.next();
         this.field_108568_f = this.field_108574_a.field_109550_C.func_107279_a((int)var3.field_103221_t, (int)var3.field_103219_u, (int)var3.field_103217_v, 1);
         if(this.field_108568_f != null && this.field_108568_f.func_108626_c() >= 10 && this.field_108568_f.func_108622_d() >= 20 && this.field_108568_f.func_108621_e() >= 20) {
            C_100013_k var4 = this.field_108568_f.func_108609_a();
            float var5 = (float)this.field_108568_f.func_108616_b();
            boolean var6 = false;
            int var7 = 0;

            while(true) {
               if(var7 < 10) {
                  this.field_108569_g = var4.field_105273_a + (int)((double)(C_100650_jv.func_108928_b(this.field_108574_a.field_109577_u.nextFloat() * 3.1415927F * 2.0F) * var5) * 0.9D);
                  this.field_108575_h = var4.field_105271_b;
                  this.field_108576_i = var4.field_105272_c + (int)((double)(C_100650_jv.func_108924_a(this.field_108574_a.field_109577_u.nextFloat() * 3.1415927F * 2.0F) * var5) * 0.9D);
                  var6 = false;
                  Iterator var8 = this.field_108574_a.field_109550_C.func_107276_b().iterator();

                  while(var8.hasNext()) {
                     C_100531_ob var9 = (C_100531_ob)var8.next();
                     if(var9 != this.field_108568_f && var9.func_108632_a(this.field_108569_g, this.field_108575_h, this.field_108576_i)) {
                        var6 = true;
                        break;
                     }
                  }

                  if(var6) {
                     ++var7;
                     continue;
                  }
               }

               if(var6) {
                  return false;
               }

               C_100387_amw var10 = this.func_108565_a(this.field_108569_g, this.field_108575_h, this.field_108576_i);
               if(var10 != null) {
                  this.field_108571_e = 0;
                  this.field_108570_d = 20;
                  return true;
               }
               break;
            }
         }
      }

      return false;
   }

   private boolean func_108567_c() {
      C_100387_amw var1 = this.func_108565_a(this.field_108569_g, this.field_108575_h, this.field_108576_i);
      if(var1 == null) {
         return false;
      } else {
         C_101097_qa var2;
         try {
            var2 = new C_101097_qa(this.field_108574_a);
            var2.func_103337_bD();
            var2.func_103744_g(false);
         } catch (Exception var4) {
            var4.printStackTrace();
            return false;
         }

         var2.func_103055_b(var1.field_107872_c, var1.field_107869_d, var1.field_107870_e, this.field_108574_a.field_109577_u.nextFloat() * 360.0F, 0.0F);
         this.field_108574_a.func_109513_d(var2);
         C_100013_k var3 = this.field_108568_f.func_108609_a();
         var2.func_103285_b(var3.field_105273_a, var3.field_105271_b, var3.field_105272_c, this.field_108568_f.func_108616_b());
         return true;
      }
   }

   private C_100387_amw func_108565_a(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < 10; ++var4) {
         int var5 = var1 + this.field_108574_a.field_109577_u.nextInt(16) - 8;
         int var6 = var2 + this.field_108574_a.field_109577_u.nextInt(6) - 3;
         int var7 = var3 + this.field_108574_a.field_109577_u.nextInt(16) - 8;
         if(this.field_108568_f.func_108632_a(var5, var6, var7) && C_100841_xr.func_110136_a(C_100594_lo.field_108778_a, this.field_108574_a, var5, var6, var7)) {
            this.field_108574_a.func_109363_R().func_107878_a((double)var5, (double)var6, (double)var7);
         }
      }

      return null;
   }
}
