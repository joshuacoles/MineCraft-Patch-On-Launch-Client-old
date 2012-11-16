import java.util.Random;

public class C_101315_yd {

   protected C_100873_xe field_112564_a;
   protected Random field_112562_b;
   protected int field_112563_c;
   protected int field_112560_d;
   protected C_101324_xz field_112561_e;
   protected C_100562_aan field_112558_f = new C_100559_aak(4);
   protected C_100562_aan field_112559_g;
   protected C_100562_aan field_112571_h;
   protected C_100562_aan field_112572_i;
   protected C_100562_aan field_112569_j;
   protected C_100562_aan field_112570_k;
   protected C_100562_aan field_112567_l;
   protected C_100562_aan field_112568_m;
   protected C_100562_aan field_112565_n;
   protected C_100562_aan field_112566_o;
   protected C_100562_aan field_112580_p;
   protected C_100562_aan field_112579_q;
   protected C_100562_aan field_112578_r;
   protected C_100562_aan field_112577_s;
   protected C_100562_aan field_112576_t;
   protected C_100562_aan field_112575_u;
   protected C_100562_aan field_112574_v;
   protected C_100562_aan field_112573_w;
   protected C_100562_aan field_112583_x;
   protected int field_112582_y;
   protected int field_112581_z;
   protected int field_112551_A;
   protected int field_112552_B;
   protected int field_112553_C;
   protected int field_112547_D;
   protected int field_112548_E;
   protected int field_112549_F;
   protected int field_112550_G;
   protected int field_112554_H;
   protected int field_112555_I;
   protected int field_112556_J;
   public boolean field_112557_K;


   public C_101315_yd(C_101324_xz var1) {
      this.field_112559_g = new C_100498_abd(7, C_100451_alf.field_106082_H.field_106162_cm);
      this.field_112571_h = new C_100498_abd(6, C_100451_alf.field_106083_I.field_106162_cm);
      this.field_112572_i = new C_100584_aaz(C_100451_alf.field_106120_y.field_106162_cm, 32);
      this.field_112569_j = new C_100584_aaz(C_100451_alf.field_106083_I.field_106162_cm, 32);
      this.field_112570_k = new C_100584_aaz(C_100451_alf.field_106078_L.field_106162_cm, 16);
      this.field_112567_l = new C_100584_aaz(C_100451_alf.field_106085_K.field_106162_cm, 8);
      this.field_112568_m = new C_100584_aaz(C_100451_alf.field_106084_J.field_106162_cm, 8);
      this.field_112565_n = new C_100584_aaz(C_100451_alf.field_106178_aQ.field_106162_cm, 7);
      this.field_112566_o = new C_100584_aaz(C_100451_alf.field_106201_az.field_106162_cm, 7);
      this.field_112580_p = new C_100584_aaz(C_100451_alf.field_106090_Q.field_106162_cm, 6);
      this.field_112579_q = new C_100564_aao(C_100451_alf.field_106248_ag.field_106162_cm);
      this.field_112578_r = new C_100564_aao(C_100451_alf.field_106250_ah.field_106162_cm);
      this.field_112577_s = new C_100564_aao(C_100451_alf.field_106228_ai.field_106162_cm);
      this.field_112576_t = new C_100564_aao(C_100451_alf.field_106230_aj.field_106162_cm);
      this.field_112575_u = new C_100580_aau();
      this.field_112574_v = new C_100496_abc();
      this.field_112573_w = new C_100561_aai();
      this.field_112583_x = new C_101334_yv();
      this.field_112582_y = 0;
      this.field_112581_z = 0;
      this.field_112551_A = 2;
      this.field_112552_B = 1;
      this.field_112553_C = 0;
      this.field_112547_D = 0;
      this.field_112548_E = 0;
      this.field_112549_F = 0;
      this.field_112550_G = 1;
      this.field_112554_H = 3;
      this.field_112555_I = 1;
      this.field_112556_J = 0;
      this.field_112557_K = true;
      this.field_112561_e = var1;
   }

   public void func_112542_a(C_100873_xe var1, Random var2, int var3, int var4) {
      if(this.field_112564_a != null) {
         throw new RuntimeException("Already decorating!!");
      } else {
         this.field_112564_a = var1;
         this.field_112562_b = var2;
         this.field_112563_c = var3;
         this.field_112560_d = var4;
         this.func_112544_a();
         this.field_112564_a = null;
         this.field_112562_b = null;
      }
   }

   protected void func_112544_a() {
      this.func_112546_b();

      int var1;
      int var2;
      int var3;
      for(var1 = 0; var1 < this.field_112554_H; ++var1) {
         var2 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var3 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         this.field_112559_g.func_107965_a(this.field_112564_a, this.field_112562_b, var2, this.field_112564_a.func_109459_i(var2, var3), var3);
      }

      for(var1 = 0; var1 < this.field_112555_I; ++var1) {
         var2 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var3 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         this.field_112558_f.func_107965_a(this.field_112564_a, this.field_112562_b, var2, this.field_112564_a.func_109459_i(var2, var3), var3);
      }

      for(var1 = 0; var1 < this.field_112550_G; ++var1) {
         var2 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var3 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         this.field_112559_g.func_107965_a(this.field_112564_a, this.field_112562_b, var2, this.field_112564_a.func_109459_i(var2, var3), var3);
      }

      var1 = this.field_112581_z;
      if(this.field_112562_b.nextInt(10) == 0) {
         ++var1;
      }

      int var4;
      for(var2 = 0; var2 < var1; ++var2) {
         var3 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var4 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         C_100562_aan var5 = this.field_112561_e.func_112447_a(this.field_112562_b);
         var5.func_107968_a(1.0D, 1.0D, 1.0D);
         var5.func_107965_a(this.field_112564_a, this.field_112562_b, var3, this.field_112564_a.func_109538_f(var3, var4), var4);
      }

      for(var2 = 0; var2 < this.field_112556_J; ++var2) {
         var3 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var4 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         this.field_112575_u.func_107965_a(this.field_112564_a, this.field_112562_b, var3, this.field_112564_a.func_109538_f(var3, var4), var4);
      }

      int var7;
      for(var2 = 0; var2 < this.field_112551_A; ++var2) {
         var3 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var4 = this.field_112562_b.nextInt(128);
         var7 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         this.field_112579_q.func_107965_a(this.field_112564_a, this.field_112562_b, var3, var4, var7);
         if(this.field_112562_b.nextInt(4) == 0) {
            var3 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
            var4 = this.field_112562_b.nextInt(128);
            var7 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
            this.field_112578_r.func_107965_a(this.field_112564_a, this.field_112562_b, var3, var4, var7);
         }
      }

      for(var2 = 0; var2 < this.field_112552_B; ++var2) {
         var3 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var4 = this.field_112562_b.nextInt(128);
         var7 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         C_100562_aan var6 = this.field_112561_e.func_112458_b(this.field_112562_b);
         var6.func_107965_a(this.field_112564_a, this.field_112562_b, var3, var4, var7);
      }

      for(var2 = 0; var2 < this.field_112553_C; ++var2) {
         var3 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var4 = this.field_112562_b.nextInt(128);
         var7 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         (new C_100566_aal(C_100451_alf.field_106246_ab.field_106162_cm)).func_107965_a(this.field_112564_a, this.field_112562_b, var3, var4, var7);
      }

      for(var2 = 0; var2 < this.field_112582_y; ++var2) {
         var3 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var4 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;

         for(var7 = this.field_112562_b.nextInt(128); var7 > 0 && this.field_112564_a.func_109349_a(var3, var7 - 1, var4) == 0; --var7) {
            ;
         }

         this.field_112583_x.func_107965_a(this.field_112564_a, this.field_112562_b, var3, var7, var4);
      }

      for(var2 = 0; var2 < this.field_112547_D; ++var2) {
         if(this.field_112562_b.nextInt(4) == 0) {
            var3 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
            var4 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
            var7 = this.field_112564_a.func_109538_f(var3, var4);
            this.field_112577_s.func_107965_a(this.field_112564_a, this.field_112562_b, var3, var7, var4);
         }

         if(this.field_112562_b.nextInt(8) == 0) {
            var3 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
            var4 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
            var7 = this.field_112562_b.nextInt(128);
            this.field_112576_t.func_107965_a(this.field_112564_a, this.field_112562_b, var3, var7, var4);
         }
      }

      if(this.field_112562_b.nextInt(4) == 0) {
         var2 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var3 = this.field_112562_b.nextInt(128);
         var4 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         this.field_112577_s.func_107965_a(this.field_112564_a, this.field_112562_b, var2, var3, var4);
      }

      if(this.field_112562_b.nextInt(8) == 0) {
         var2 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var3 = this.field_112562_b.nextInt(128);
         var4 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         this.field_112576_t.func_107965_a(this.field_112564_a, this.field_112562_b, var2, var3, var4);
      }

      for(var2 = 0; var2 < this.field_112548_E; ++var2) {
         var3 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var4 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         var7 = this.field_112562_b.nextInt(128);
         this.field_112574_v.func_107965_a(this.field_112564_a, this.field_112562_b, var3, var7, var4);
      }

      for(var2 = 0; var2 < 10; ++var2) {
         var3 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var4 = this.field_112562_b.nextInt(128);
         var7 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         this.field_112574_v.func_107965_a(this.field_112564_a, this.field_112562_b, var3, var4, var7);
      }

      if(this.field_112562_b.nextInt(32) == 0) {
         var2 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var3 = this.field_112562_b.nextInt(128);
         var4 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         (new C_100494_abb()).func_107965_a(this.field_112564_a, this.field_112562_b, var2, var3, var4);
      }

      for(var2 = 0; var2 < this.field_112549_F; ++var2) {
         var3 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
         var4 = this.field_112562_b.nextInt(128);
         var7 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
         this.field_112573_w.func_107965_a(this.field_112564_a, this.field_112562_b, var3, var4, var7);
      }

      if(this.field_112557_K) {
         for(var2 = 0; var2 < 50; ++var2) {
            var3 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
            var4 = this.field_112562_b.nextInt(this.field_112562_b.nextInt(120) + 8);
            var7 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
            (new C_100502_abf(C_100451_alf.field_106071_D.field_106162_cm)).func_107965_a(this.field_112564_a, this.field_112562_b, var3, var4, var7);
         }

         for(var2 = 0; var2 < 20; ++var2) {
            var3 = this.field_112563_c + this.field_112562_b.nextInt(16) + 8;
            var4 = this.field_112562_b.nextInt(this.field_112562_b.nextInt(this.field_112562_b.nextInt(112) + 8) + 8);
            var7 = this.field_112560_d + this.field_112562_b.nextInt(16) + 8;
            (new C_100502_abf(C_100451_alf.field_106073_F.field_106162_cm)).func_107965_a(this.field_112564_a, this.field_112562_b, var3, var4, var7);
         }
      }

   }

   protected void func_112543_a(int var1, C_100562_aan var2, int var3, int var4) {
      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = this.field_112563_c + this.field_112562_b.nextInt(16);
         int var7 = this.field_112562_b.nextInt(var4 - var3) + var3;
         int var8 = this.field_112560_d + this.field_112562_b.nextInt(16);
         var2.func_107965_a(this.field_112564_a, this.field_112562_b, var6, var7, var8);
      }

   }

   protected void func_112545_b(int var1, C_100562_aan var2, int var3, int var4) {
      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = this.field_112563_c + this.field_112562_b.nextInt(16);
         int var7 = this.field_112562_b.nextInt(var4) + this.field_112562_b.nextInt(var4) + (var3 - var4);
         int var8 = this.field_112560_d + this.field_112562_b.nextInt(16);
         var2.func_107965_a(this.field_112564_a, this.field_112562_b, var6, var7, var8);
      }

   }

   protected void func_112546_b() {
      this.func_112543_a(20, this.field_112572_i, 0, 128);
      this.func_112543_a(10, this.field_112569_j, 0, 128);
      this.func_112543_a(20, this.field_112570_k, 0, 128);
      this.func_112543_a(20, this.field_112567_l, 0, 64);
      this.func_112543_a(2, this.field_112568_m, 0, 32);
      this.func_112543_a(8, this.field_112565_n, 0, 16);
      this.func_112543_a(1, this.field_112566_o, 0, 16);
      this.func_112545_b(1, this.field_112580_p, 16, 16);
   }
}
