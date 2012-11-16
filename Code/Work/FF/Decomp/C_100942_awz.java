import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import net.minecraft.client.Minecraft;

public class C_100942_awz extends C_100873_xe {

   private C_101250_awr field_109597_a;
   private C_100938_awx field_109595_b;
   private C_100661_jq field_109596_c = new C_100661_jq();
   private Set field_109601_K = new HashSet();
   private Set field_109598_L = new HashSet();
   private final Minecraft field_109599_M = Minecraft.func_105091_x();
   private final Set field_109600_N = new HashSet();


   public C_100942_awz(C_101250_awr var1, C_100840_xm var2, int var3, int var4, C_100649_jy var5) {
      super(new C_100241_ahi(), "MpServer", C_101289_zr.func_112381_a(var3), var2, var5);
      this.field_109597_a = var1;
      this.field_109578_t = var4;
      this.func_109514_A(8, 64, 8);
      this.field_109549_B = var1.field_107047_b;
   }

   public void func_109397_b() {
      super.func_109397_b();
      this.func_109484_a(this.func_109463_E() + 1L);
      this.func_109436_b(this.func_109433_F() + 1L);
      this.field_109545_E.func_108901_a("reEntryProcessing");

      for(int var1 = 0; var1 < 10 && !this.field_109598_L.isEmpty(); ++var1) {
         C_100730_lb var2 = (C_100730_lb)this.field_109598_L.iterator().next();
         this.field_109598_L.remove(var2);
         if(!this.field_109563_e.contains(var2)) {
            this.func_109513_d(var2);
         }
      }

      this.field_109545_E.func_108899_c("connection");
      this.field_109597_a.func_107041_d();
      this.field_109545_E.func_108899_c("chunkCache");
      this.field_109595_b.func_108664_b();
      this.field_109545_E.func_108899_c("tiles");
      this.func_109454_g();
      this.field_109545_E.func_108900_b();
   }

   public void func_109586_b(int var1, int var2, int var3, int var4, int var5, int var6) {}

   protected C_101331_yx func_109462_j() {
      this.field_109595_b = new C_100938_awx(this);
      return this.field_109595_b;
   }

   protected void func_109454_g() {
      super.func_109454_g();
      this.field_109600_N.retainAll(this.field_109555_H);
      if(this.field_109600_N.size() == this.field_109555_H.size()) {
         this.field_109600_N.clear();
      }

      int var1 = 0;
      Iterator var2 = this.field_109555_H.iterator();

      while(var2.hasNext()) {
         C_100858_wx var3 = (C_100858_wx)var2.next();
         if(!this.field_109600_N.contains(var3)) {
            int var4 = var3.field_110239_a * 16;
            int var5 = var3.field_110238_b * 16;
            this.field_109545_E.func_108901_a("getChunk");
            C_101272_za var6 = this.func_109440_e(var3.field_110239_a, var3.field_110238_b);
            this.func_109458_a(var4, var5, var6);
            this.field_109545_E.func_108900_b();
            this.field_109600_N.add(var3);
            ++var1;
            if(var1 >= 10) {
               return;
            }
         }
      }

   }

   public void func_109591_a(int var1, int var2, boolean var3) {
      if(var3) {
         this.field_109595_b.func_108660_c(var1, var2);
      } else {
         this.field_109595_b.func_108698_b(var1, var2);
      }

      if(!var3) {
         this.func_109511_e(var1 * 16, 0, var2 * 16, var1 * 16 + 15, 256, var2 * 16 + 15);
      }

   }

   public boolean func_109513_d(C_100730_lb var1) {
      boolean var2 = super.func_109513_d(var1);
      this.field_109601_K.add(var1);
      if(!var2) {
         this.field_109598_L.add(var1);
      }

      return var2;
   }

   public void func_109383_e(C_100730_lb var1) {
      super.func_109383_e(var1);
      this.field_109601_K.remove(var1);
   }

   protected void func_109393_a(C_100730_lb var1) {
      super.func_109393_a(var1);
      if(this.field_109598_L.contains(var1)) {
         this.field_109598_L.remove(var1);
      }

   }

   protected void func_109442_b(C_100730_lb var1) {
      super.func_109442_b(var1);
      if(this.field_109601_K.contains(var1)) {
         if(var1.func_103143_S()) {
            this.field_109598_L.add(var1);
         } else {
            this.field_109601_K.remove(var1);
         }
      }

   }

   public void func_109593_a(int var1, C_100730_lb var2) {
      C_100730_lb var3 = this.func_109451_a(var1);
      if(var3 != null) {
         this.func_109383_e(var3);
      }

      this.field_109601_K.add(var2);
      var2.field_103212_k = var1;
      if(!this.func_109513_d(var2)) {
         this.field_109598_L.add(var2);
      }

      this.field_109596_c.func_109035_a(var1, var2);
   }

   public C_100730_lb func_109451_a(int var1) {
      return (C_100730_lb)(var1 == this.field_109599_M.field_105120_g.field_103212_k?this.field_109599_M.field_105120_g:(C_100730_lb)this.field_109596_c.func_109038_a(var1));
   }

   public C_100730_lb func_109594_b(int var1) {
      C_100730_lb var2 = (C_100730_lb)this.field_109596_c.func_109047_d(var1);
      if(var2 != null) {
         this.field_109601_K.remove(var2);
         this.func_109383_e(var2);
      }

      return var2;
   }

   public boolean func_109588_h(int var1, int var2, int var3, int var4, int var5) {
      this.func_109586_b(var1, var2, var3, var1, var2, var3);
      return super.func_109394_d(var1, var2, var3, var4, var5);
   }

   public void func_109472_B() {
      this.field_109597_a.func_107036_b(new C_100365_db("Quitting"));
   }

   public C_100195_gh func_109385_a(C_100590_ph var1) {
      return new C_100107_bcv(this.field_109599_M.field_105097_A, var1, this.field_109599_M.field_105120_g);
   }

   protected void func_109491_n() {
      if(!this.field_109576_v.field_112394_f) {
         if(this.field_109581_q > 0) {
            --this.field_109581_q;
         }

         this.field_109570_m = this.field_109567_n;
         if(this.field_109583_z.func_107142_p()) {
            this.field_109567_n = (float)((double)this.field_109567_n + 0.01D);
         } else {
            this.field_109567_n = (float)((double)this.field_109567_n - 0.01D);
         }

         if(this.field_109567_n < 0.0F) {
            this.field_109567_n = 0.0F;
         }

         if(this.field_109567_n > 1.0F) {
            this.field_109567_n = 1.0F;
         }

         this.field_109568_o = this.field_109582_p;
         if(this.field_109583_z.func_107150_n()) {
            this.field_109582_p = (float)((double)this.field_109582_p + 0.01D);
         } else {
            this.field_109582_p = (float)((double)this.field_109582_p - 0.01D);
         }

         if(this.field_109582_p < 0.0F) {
            this.field_109582_p = 0.0F;
         }

         if(this.field_109582_p > 1.0F) {
            this.field_109582_p = 1.0F;
         }

      }
   }

   public void func_109592_E(int var1, int var2, int var3) {
      byte var4 = 16;
      Random var5 = new Random();

      for(int var6 = 0; var6 < 1000; ++var6) {
         int var7 = var1 + this.field_109577_u.nextInt(var4) - this.field_109577_u.nextInt(var4);
         int var8 = var2 + this.field_109577_u.nextInt(var4) - this.field_109577_u.nextInt(var4);
         int var9 = var3 + this.field_109577_u.nextInt(var4) - this.field_109577_u.nextInt(var4);
         int var10 = this.func_109349_a(var7, var8, var9);
         if(var10 == 0 && this.field_109577_u.nextInt(8) > var8 && this.field_109576_v.func_112383_j()) {
            this.func_109428_a("depthsuspend", (double)((float)var7 + this.field_109577_u.nextFloat()), (double)((float)var8 + this.field_109577_u.nextFloat()), (double)((float)var9 + this.field_109577_u.nextFloat()), 0.0D, 0.0D, 0.0D);
         } else if(var10 > 0) {
            C_100451_alf.field_106118_p[var10].func_105974_a(this, var7, var8, var9, var5);
         }
      }

   }

   public void func_109587_a() {
      this.field_109563_e.removeAll(this.field_109560_f);

      int var1;
      C_100730_lb var2;
      int var3;
      int var4;
      for(var1 = 0; var1 < this.field_109560_f.size(); ++var1) {
         var2 = (C_100730_lb)this.field_109560_f.get(var1);
         var3 = var2.field_103218_ai;
         var4 = var2.field_103214_ak;
         if(var2.field_103235_ah && this.func_109486_c(var3, var4)) {
            this.func_109440_e(var3, var4).func_112308_b(var2);
         }
      }

      for(var1 = 0; var1 < this.field_109560_f.size(); ++var1) {
         this.func_109442_b((C_100730_lb)this.field_109560_f.get(var1));
      }

      this.field_109560_f.clear();

      for(var1 = 0; var1 < this.field_109563_e.size(); ++var1) {
         var2 = (C_100730_lb)this.field_109563_e.get(var1);
         if(var2.field_103207_o != null) {
            if(!var2.field_103207_o.field_103180_L && var2.field_103207_o.field_103206_n == var2) {
               continue;
            }

            var2.field_103207_o.field_103206_n = null;
            var2.field_103207_o = null;
         }

         if(var2.field_103180_L) {
            var3 = var2.field_103218_ai;
            var4 = var2.field_103214_ak;
            if(var2.field_103235_ah && this.func_109486_c(var3, var4)) {
               this.func_109440_e(var3, var4).func_112308_b(var2);
            }

            this.field_109563_e.remove(var1--);
            this.func_109442_b(var2);
         }
      }

   }

   public C_100007_a func_109483_a(C_100007_a var1) {
      var1 = super.func_109483_a(var1);
      var1.func_105182_a("Forced Entities", new C_100946_axa(this));
      var1.func_105182_a("Retry Entities", new C_100948_axb(this));
      return var1;
   }

   public void func_109541_b(double var1, double var3, double var5, String var7, float var8, float var9) {
      float var10 = 16.0F;
      if(var8 > 1.0F) {
         var10 *= var8;
      }

      if(this.field_109599_M.field_105132_h.func_103146_e(var1, var3, var5) < (double)(var10 * var10)) {
         this.field_109599_M.field_105097_A.func_105898_a(var7, (float)var1, (float)var3, (float)var5, var8, var9);
      }

   }

   // $FF: synthetic method
   static Set func_109590_a(C_100942_awz var0) {
      return var0.field_109601_K;
   }

   // $FF: synthetic method
   static Set func_109589_b(C_100942_awz var0) {
      return var0.field_109598_L;
   }
}
