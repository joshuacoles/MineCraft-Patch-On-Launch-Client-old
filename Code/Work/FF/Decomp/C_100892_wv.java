
public class C_100892_wv {

   private C_100994_tv field_110670_a;
   private C_100994_tv field_110668_b;
   private C_100994_tv field_110669_c;
   private int field_110666_d;
   private int field_110667_e;


   public C_100892_wv(C_100353_bh var1) {
      this.func_110655_a(var1);
   }

   public C_100892_wv(C_100994_tv var1, C_100994_tv var2, C_100994_tv var3) {
      this.field_110670_a = var1;
      this.field_110668_b = var2;
      this.field_110669_c = var3;
      this.field_110667_e = 7;
   }

   public C_100892_wv(C_100994_tv var1, C_100994_tv var2) {
      this(var1, (C_100994_tv)null, var2);
   }

   public C_100892_wv(C_100994_tv var1, C_100992_tt var2) {
      this(var1, new C_100994_tv(var2));
   }

   public C_100994_tv func_110665_a() {
      return this.field_110670_a;
   }

   public C_100994_tv func_110659_b() {
      return this.field_110668_b;
   }

   public boolean func_110662_c() {
      return this.field_110668_b != null;
   }

   public C_100994_tv func_110654_d() {
      return this.field_110669_c;
   }

   public boolean func_110658_a(C_100892_wv var1) {
      return this.field_110670_a.field_111397_c == var1.field_110670_a.field_111397_c && this.field_110669_c.field_111397_c == var1.field_110669_c.field_111397_c?this.field_110668_b == null && var1.field_110668_b == null || this.field_110668_b != null && var1.field_110668_b != null && this.field_110668_b.field_111397_c == var1.field_110668_b.field_111397_c:false;
   }

   public boolean func_110657_b(C_100892_wv var1) {
      return this.func_110658_a(var1) && (this.field_110670_a.field_111398_a < var1.field_110670_a.field_111398_a || this.field_110668_b != null && this.field_110668_b.field_111398_a < var1.field_110668_b.field_111398_a);
   }

   public void func_110664_f() {
      ++this.field_110666_d;
   }

   public void func_110656_a(int var1) {
      this.field_110667_e += var1;
   }

   public boolean func_110661_g() {
      return this.field_110666_d >= this.field_110667_e;
   }

   public void func_110663_h() {
      this.field_110666_d = this.field_110667_e;
   }

   public void func_110655_a(C_100353_bh var1) {
      C_100353_bh var2 = var1.func_107521_l("buy");
      this.field_110670_a = C_100994_tv.func_111376_a(var2);
      C_100353_bh var3 = var1.func_107521_l("sell");
      this.field_110669_c = C_100994_tv.func_111376_a(var3);
      if(var1.func_107516_b("buyB")) {
         this.field_110668_b = C_100994_tv.func_111376_a(var1.func_107521_l("buyB"));
      }

      if(var1.func_107516_b("uses")) {
         this.field_110666_d = var1.func_107514_e("uses");
      }

      if(var1.func_107516_b("maxUses")) {
         this.field_110667_e = var1.func_107514_e("maxUses");
      } else {
         this.field_110667_e = 7;
      }

   }

   public C_100353_bh func_110660_i() {
      C_100353_bh var1 = new C_100353_bh();
      var1.func_107538_a("buy", this.field_110670_a.func_111344_b(new C_100353_bh("buy")));
      var1.func_107538_a("sell", this.field_110669_c.func_111344_b(new C_100353_bh("sell")));
      if(this.field_110668_b != null) {
         var1.func_107538_a("buyB", this.field_110668_b.func_111344_b(new C_100353_bh("buyB")));
      }

      var1.func_107520_a("uses", this.field_110666_d);
      var1.func_107520_a("maxUses", this.field_110667_e);
      return var1;
   }
}
