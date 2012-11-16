
public class C_100772_hx extends C_100793_ii {

   private boolean field_109824_c = false;
   private boolean field_109822_d = false;
   private int field_109823_e = 0;
   private int field_109821_f = 0;


   public C_100772_hx(C_100873_xe var1) {
      super(var1);
   }

   public void func_109794_a() {
      super.func_109794_a();
      ++this.field_109821_f;
      long var1 = this.field_109811_a.func_109463_E();
      long var3 = var1 / 24000L + 1L;
      if(!this.field_109824_c && this.field_109821_f > 20) {
         this.field_109824_c = true;
         this.field_109809_b.field_104518_a.func_107009_b(new C_100240_df(5, 0));
      }

      this.field_109822_d = var1 > 120500L;
      if(this.field_109822_d) {
         ++this.field_109823_e;
      }

      if(var1 % 24000L == 500L) {
         if(var3 <= 6L) {
            this.field_109809_b.func_102910_a(this.field_109809_b.func_102908_a("demo.day." + var3, new Object[0]));
         }
      } else if(var3 == 1L) {
         if(var1 == 100L) {
            this.field_109809_b.field_104518_a.func_107009_b(new C_100240_df(5, 101));
         } else if(var1 == 175L) {
            this.field_109809_b.field_104518_a.func_107009_b(new C_100240_df(5, 102));
         } else if(var1 == 250L) {
            this.field_109809_b.field_104518_a.func_107009_b(new C_100240_df(5, 103));
         }
      } else if(var3 == 5L && var1 % 24000L == 22000L) {
         this.field_109809_b.func_102910_a(this.field_109809_b.func_102908_a("demo.day.warning", new Object[0]));
      }

   }

   private void func_109820_e() {
      if(this.field_109823_e > 100) {
         this.field_109809_b.func_102910_a(this.field_109809_b.func_102908_a("demo.reminder", new Object[0]));
         this.field_109823_e = 0;
      }

   }

   public void func_109793_a(int var1, int var2, int var3, int var4) {
      if(this.field_109822_d) {
         this.func_109820_e();
      } else {
         super.func_109793_a(var1, var2, var3, var4);
      }
   }

   public void func_109799_a(int var1, int var2, int var3) {
      if(!this.field_109822_d) {
         super.func_109799_a(var1, var2, var3);
      }
   }

   public boolean func_109804_b(int var1, int var2, int var3) {
      return this.field_109822_d?false:super.func_109804_b(var1, var2, var3);
   }

   public boolean func_109801_a(C_101095_qg var1, C_100873_xe var2, C_100994_tv var3) {
      if(this.field_109822_d) {
         this.func_109820_e();
         return false;
      } else {
         return super.func_109801_a(var1, var2, var3);
      }
   }

   public boolean func_109796_a(C_101095_qg var1, C_100873_xe var2, C_100994_tv var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if(this.field_109822_d) {
         this.func_109820_e();
         return false;
      } else {
         return super.func_109796_a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      }
   }
}
