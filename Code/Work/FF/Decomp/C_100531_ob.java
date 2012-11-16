import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class C_100531_ob {

   private C_100873_xe field_108643_a;
   private final List field_108641_b = new ArrayList();
   private final C_100013_k field_108642_c = new C_100013_k(0, 0, 0);
   private final C_100013_k field_108639_d = new C_100013_k(0, 0, 0);
   private int field_108640_e = 0;
   private int field_108637_f = 0;
   private int field_108638_g = 0;
   private int field_108647_h = 0;
   private int field_108648_i;
   private TreeMap field_108645_j = new TreeMap();
   private List field_108646_k = new ArrayList();
   private int field_108644_l = 0;


   public C_100531_ob() {}

   public C_100531_ob(C_100873_xe var1) {
      this.field_108643_a = var1;
   }

   public void func_108618_a(C_100873_xe var1) {
      this.field_108643_a = var1;
   }

   public void func_108610_a(int var1) {
      this.field_108638_g = var1;
      this.func_108615_m();
      this.func_108634_l();
      if(var1 % 20 == 0) {
         this.func_108604_k();
      }

      if(var1 % 30 == 0) {
         this.func_108614_j();
      }

      int var2 = this.field_108647_h / 10;
      if(this.field_108644_l < var2 && this.field_108641_b.size() > 20 && this.field_108643_a.field_109577_u.nextInt(7000) == 0) {
         C_100387_amw var3 = this.func_108629_a(C_100650_jv.func_108933_d((float)this.field_108639_d.field_105273_a), C_100650_jv.func_108933_d((float)this.field_108639_d.field_105271_b), C_100650_jv.func_108933_d((float)this.field_108639_d.field_105272_c), 2, 4, 2);
         if(var3 != null) {
            C_100557_or var4 = new C_100557_or(this.field_108643_a);
            var4.func_103163_b(var3.field_107872_c, var3.field_107869_d, var3.field_107870_e);
            this.field_108643_a.func_109513_d(var4);
            ++this.field_108644_l;
         }
      }

   }

   private C_100387_amw func_108629_a(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < 10; ++var7) {
         int var8 = var1 + this.field_108643_a.field_109577_u.nextInt(16) - 8;
         int var9 = var2 + this.field_108643_a.field_109577_u.nextInt(6) - 3;
         int var10 = var3 + this.field_108643_a.field_109577_u.nextInt(16) - 8;
         if(this.func_108632_a(var8, var9, var10) && this.func_108624_b(var8, var9, var10, var4, var5, var6)) {
            return this.field_108643_a.func_109363_R().func_107878_a((double)var8, (double)var9, (double)var10);
         }
      }

      return null;
   }

   private boolean func_108624_b(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(!this.field_108643_a.func_109348_t(var1, var2 - 1, var3)) {
         return false;
      } else {
         int var7 = var1 - var4 / 2;
         int var8 = var3 - var6 / 2;

         for(int var9 = var7; var9 < var7 + var4; ++var9) {
            for(int var10 = var2; var10 < var2 + var5; ++var10) {
               for(int var11 = var8; var11 < var8 + var6; ++var11) {
                  if(this.field_108643_a.func_109360_s(var9, var10, var11)) {
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   private void func_108614_j() {
      List var1 = this.field_108643_a.func_109518_a(C_100557_or.class, C_100412_amr.func_107892_a().func_107844_a((double)(this.field_108639_d.field_105273_a - this.field_108640_e), (double)(this.field_108639_d.field_105271_b - 4), (double)(this.field_108639_d.field_105272_c - this.field_108640_e), (double)(this.field_108639_d.field_105273_a + this.field_108640_e), (double)(this.field_108639_d.field_105271_b + 4), (double)(this.field_108639_d.field_105272_c + this.field_108640_e)));
      this.field_108644_l = var1.size();
   }

   private void func_108604_k() {
      List var1 = this.field_108643_a.func_109518_a(C_101098_qd.class, C_100412_amr.func_107892_a().func_107844_a((double)(this.field_108639_d.field_105273_a - this.field_108640_e), (double)(this.field_108639_d.field_105271_b - 4), (double)(this.field_108639_d.field_105272_c - this.field_108640_e), (double)(this.field_108639_d.field_105273_a + this.field_108640_e), (double)(this.field_108639_d.field_105271_b + 4), (double)(this.field_108639_d.field_105272_c + this.field_108640_e)));
      this.field_108647_h = var1.size();
      if(this.field_108647_h == 0) {
         this.field_108645_j.clear();
      }

   }

   public C_100013_k func_108609_a() {
      return this.field_108639_d;
   }

   public int func_108616_b() {
      return this.field_108640_e;
   }

   public int func_108626_c() {
      return this.field_108641_b.size();
   }

   public int func_108622_d() {
      return this.field_108638_g - this.field_108637_f;
   }

   public int func_108621_e() {
      return this.field_108647_h;
   }

   public boolean func_108632_a(int var1, int var2, int var3) {
      return this.field_108639_d.func_105268_e(var1, var2, var3) < (float)(this.field_108640_e * this.field_108640_e);
   }

   public List func_108605_f() {
      return this.field_108641_b;
   }

   public C_100529_oa func_108633_b(int var1, int var2, int var3) {
      C_100529_oa var4 = null;
      int var5 = Integer.MAX_VALUE;
      Iterator var6 = this.field_108641_b.iterator();

      while(var6.hasNext()) {
         C_100529_oa var7 = (C_100529_oa)var6.next();
         int var8 = var7.func_108595_b(var1, var2, var3);
         if(var8 < var5) {
            var4 = var7;
            var5 = var8;
         }
      }

      return var4;
   }

   public C_100529_oa func_108617_c(int var1, int var2, int var3) {
      C_100529_oa var4 = null;
      int var5 = Integer.MAX_VALUE;
      Iterator var6 = this.field_108641_b.iterator();

      while(var6.hasNext()) {
         C_100529_oa var7 = (C_100529_oa)var6.next();
         int var8 = var7.func_108595_b(var1, var2, var3);
         if(var8 > 256) {
            var8 *= 1000;
         } else {
            var8 = var7.func_108589_f();
         }

         if(var8 < var5) {
            var4 = var7;
            var5 = var8;
         }
      }

      return var4;
   }

   public C_100529_oa func_108611_e(int var1, int var2, int var3) {
      if(this.field_108639_d.func_105268_e(var1, var2, var3) > (float)(this.field_108640_e * this.field_108640_e)) {
         return null;
      } else {
         Iterator var4 = this.field_108641_b.iterator();

         C_100529_oa var5;
         do {
            if(!var4.hasNext()) {
               return null;
            }

            var5 = (C_100529_oa)var4.next();
         } while(var5.field_108602_a != var1 || var5.field_108601_c != var3 || Math.abs(var5.field_108600_b - var2) > 1);

         return var5;
      }
   }

   public void func_108620_a(C_100529_oa var1) {
      this.field_108641_b.add(var1);
      this.field_108642_c.field_105273_a += var1.field_108602_a;
      this.field_108642_c.field_105271_b += var1.field_108600_b;
      this.field_108642_c.field_105272_c += var1.field_108601_c;
      this.func_108623_n();
      this.field_108637_f = var1.field_108596_f;
   }

   public boolean func_108627_g() {
      return this.field_108641_b.isEmpty();
   }

   public void func_108630_a(C_100595_ln var1) {
      Iterator var2 = this.field_108646_k.iterator();

      C_100525_oc var3;
      do {
         if(!var2.hasNext()) {
            this.field_108646_k.add(new C_100525_oc(this, var1, this.field_108638_g));
            return;
         }

         var3 = (C_100525_oc)var2.next();
      } while(var3.field_108563_a != var1);

      var3.field_108561_b = this.field_108638_g;
   }

   public C_100595_ln func_108607_b(C_100595_ln var1) {
      double var2 = Double.MAX_VALUE;
      C_100525_oc var4 = null;
      Iterator var5 = this.field_108646_k.iterator();

      while(var5.hasNext()) {
         C_100525_oc var6 = (C_100525_oc)var5.next();
         double var7 = var6.field_108563_a.func_103082_e(var1);
         if(var7 <= var2) {
            var4 = var6;
            var2 = var7;
         }
      }

      return var4 != null?var4.field_108563_a:null;
   }

   public C_101095_qg func_108612_c(C_100595_ln var1) {
      double var2 = Double.MAX_VALUE;
      C_101095_qg var4 = null;
      Iterator var5 = this.field_108645_j.keySet().iterator();

      while(var5.hasNext()) {
         String var6 = (String)var5.next();
         if(this.func_108619_d(var6)) {
            C_101095_qg var7 = this.field_108643_a.func_109507_a(var6);
            if(var7 != null) {
               double var8 = var7.func_103082_e(var1);
               if(var8 <= var2) {
                  var4 = var7;
                  var2 = var8;
               }
            }
         }
      }

      return var4;
   }

   private void func_108634_l() {
      Iterator var1 = this.field_108646_k.iterator();

      while(var1.hasNext()) {
         C_100525_oc var2 = (C_100525_oc)var1.next();
         if(!var2.field_108563_a.func_103143_S() || Math.abs(this.field_108638_g - var2.field_108561_b) > 300) {
            var1.remove();
         }
      }

   }

   private void func_108615_m() {
      boolean var1 = false;
      boolean var2 = this.field_108643_a.field_109577_u.nextInt(50) == 0;
      Iterator var3 = this.field_108641_b.iterator();

      while(var3.hasNext()) {
         C_100529_oa var4 = (C_100529_oa)var3.next();
         if(var2) {
            var4.func_108587_d();
         }

         if(!this.func_108635_f(var4.field_108602_a, var4.field_108600_b, var4.field_108601_c) || Math.abs(this.field_108638_g - var4.field_108596_f) > 1200) {
            this.field_108642_c.field_105273_a -= var4.field_108602_a;
            this.field_108642_c.field_105271_b -= var4.field_108600_b;
            this.field_108642_c.field_105272_c -= var4.field_108601_c;
            var1 = true;
            var4.field_108597_g = true;
            var3.remove();
         }
      }

      if(var1) {
         this.func_108623_n();
      }

   }

   private boolean func_108635_f(int var1, int var2, int var3) {
      int var4 = this.field_108643_a.func_109349_a(var1, var2, var3);
      return var4 <= 0?false:var4 == C_100451_alf.field_106200_aH.field_106162_cm;
   }

   private void func_108623_n() {
      int var1 = this.field_108641_b.size();
      if(var1 == 0) {
         this.field_108639_d.func_105270_b(0, 0, 0);
         this.field_108640_e = 0;
      } else {
         this.field_108639_d.func_105270_b(this.field_108642_c.field_105273_a / var1, this.field_108642_c.field_105271_b / var1, this.field_108642_c.field_105272_c / var1);
         int var2 = 0;

         C_100529_oa var4;
         for(Iterator var3 = this.field_108641_b.iterator(); var3.hasNext(); var2 = Math.max(var4.func_108595_b(this.field_108639_d.field_105273_a, this.field_108639_d.field_105271_b, this.field_108639_d.field_105272_c), var2)) {
            var4 = (C_100529_oa)var3.next();
         }

         this.field_108640_e = Math.max(32, (int)Math.sqrt((double)var2) + 1);
      }
   }

   public int func_108608_a(String var1) {
      Integer var2 = (Integer)this.field_108645_j.get(var1);
      return var2 != null?var2.intValue():0;
   }

   public int func_108625_a(String var1, int var2) {
      int var3 = this.func_108608_a(var1);
      int var4 = C_100650_jv.func_108923_a(var3 + var2, -30, 10);
      this.field_108645_j.put(var1, Integer.valueOf(var4));
      return var4;
   }

   public boolean func_108619_d(String var1) {
      return this.func_108608_a(var1) <= -15;
   }

   public void func_108631_a(C_100353_bh var1) {
      this.field_108647_h = var1.func_107514_e("PopSize");
      this.field_108640_e = var1.func_107514_e("Radius");
      this.field_108644_l = var1.func_107514_e("Golems");
      this.field_108637_f = var1.func_107514_e("Stable");
      this.field_108638_g = var1.func_107514_e("Tick");
      this.field_108648_i = var1.func_107514_e("MTick");
      this.field_108639_d.field_105273_a = var1.func_107514_e("CX");
      this.field_108639_d.field_105271_b = var1.func_107514_e("CY");
      this.field_108639_d.field_105272_c = var1.func_107514_e("CZ");
      this.field_108642_c.field_105273_a = var1.func_107514_e("ACX");
      this.field_108642_c.field_105271_b = var1.func_107514_e("ACY");
      this.field_108642_c.field_105272_c = var1.func_107514_e("ACZ");
      C_100339_bp var2 = var1.func_107513_m("Doors");

      for(int var3 = 0; var3 < var2.func_107501_c(); ++var3) {
         C_100353_bh var4 = (C_100353_bh)var2.func_107498_b(var3);
         C_100529_oa var5 = new C_100529_oa(var4.func_107514_e("X"), var4.func_107514_e("Y"), var4.func_107514_e("Z"), var4.func_107514_e("IDX"), var4.func_107514_e("IDZ"), var4.func_107514_e("TS"));
         this.field_108641_b.add(var5);
      }

      C_100339_bp var6 = var1.func_107513_m("Players");

      for(int var7 = 0; var7 < var6.func_107501_c(); ++var7) {
         C_100353_bh var8 = (C_100353_bh)var6.func_107498_b(var7);
         this.field_108645_j.put(var8.func_107534_i("Name"), Integer.valueOf(var8.func_107514_e("S")));
      }

   }

   public void func_108628_b(C_100353_bh var1) {
      var1.func_107520_a("PopSize", this.field_108647_h);
      var1.func_107520_a("Radius", this.field_108640_e);
      var1.func_107520_a("Golems", this.field_108644_l);
      var1.func_107520_a("Stable", this.field_108637_f);
      var1.func_107520_a("Tick", this.field_108638_g);
      var1.func_107520_a("MTick", this.field_108648_i);
      var1.func_107520_a("CX", this.field_108639_d.field_105273_a);
      var1.func_107520_a("CY", this.field_108639_d.field_105271_b);
      var1.func_107520_a("CZ", this.field_108639_d.field_105272_c);
      var1.func_107520_a("ACX", this.field_108642_c.field_105273_a);
      var1.func_107520_a("ACY", this.field_108642_c.field_105271_b);
      var1.func_107520_a("ACZ", this.field_108642_c.field_105272_c);
      C_100339_bp var2 = new C_100339_bp("Doors");
      Iterator var3 = this.field_108641_b.iterator();

      while(var3.hasNext()) {
         C_100529_oa var4 = (C_100529_oa)var3.next();
         C_100353_bh var5 = new C_100353_bh("Door");
         var5.func_107520_a("X", var4.field_108602_a);
         var5.func_107520_a("Y", var4.field_108600_b);
         var5.func_107520_a("Z", var4.field_108601_c);
         var5.func_107520_a("IDX", var4.field_108598_d);
         var5.func_107520_a("IDZ", var4.field_108599_e);
         var5.func_107520_a("TS", var4.field_108596_f);
         var2.func_107500_a(var5);
      }

      var1.func_107530_a("Doors", var2);
      C_100339_bp var7 = new C_100339_bp("Players");
      Iterator var8 = this.field_108645_j.keySet().iterator();

      while(var8.hasNext()) {
         String var9 = (String)var8.next();
         C_100353_bh var6 = new C_100353_bh(var9);
         var6.func_107533_a("Name", var9);
         var6.func_107520_a("S", ((Integer)this.field_108645_j.get(var9)).intValue());
         var7.func_107500_a(var6);
      }

      var1.func_107530_a("Players", var7);
   }

   public void func_108636_h() {
      this.field_108648_i = this.field_108638_g;
   }

   public boolean func_108613_i() {
      return this.field_108648_i == 0 || this.field_108638_g - this.field_108648_i >= 3600;
   }

   public void func_108606_b(int var1) {
      Iterator var2 = this.field_108645_j.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         this.func_108625_a(var3, var1);
      }

   }
}
