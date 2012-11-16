import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class C_100873_xe implements C_100837_xo {

   public boolean field_109562_d = false;
   public List field_109563_e = new ArrayList();
   protected List field_109560_f = new ArrayList();
   public List field_109561_g = new ArrayList();
   private List field_109566_a = new ArrayList();
   private List field_109564_b = new ArrayList();
   public List field_109573_h = new ArrayList();
   public List field_109574_i = new ArrayList();
   private long field_109565_c = 16777215L;
   public int field_109571_j = 0;
   protected int field_109572_k = (new Random()).nextInt();
   protected final int field_109569_l = 1013904223;
   protected float field_109570_m;
   protected float field_109567_n;
   protected float field_109568_o;
   protected float field_109582_p;
   protected int field_109581_q = 0;
   public int field_109580_r = 0;
   public boolean field_109579_s = false;
   public int field_109578_t;
   public Random field_109577_u = new Random();
   public final C_101289_zr field_109576_v;
   protected List field_109575_w = new ArrayList();
   protected C_101331_yx field_109585_x;
   protected final C_100268_agw field_109584_y;
   protected C_100269_agv field_109583_z;
   public boolean field_109548_A;
   public C_100237_ahk field_109549_B;
   public final C_100521_oe field_109550_C;
   protected final C_100527_od field_109544_D = new C_100527_od(this);
   public final C_100649_jy field_109545_E;
   private final C_100393_amx field_109558_K = new C_100393_amx(300, 2000);
   private final Calendar field_109551_L = Calendar.getInstance();
   private ArrayList field_109552_M = new ArrayList();
   private boolean field_109553_N;
   protected boolean field_109546_F = true;
   protected boolean field_109547_G = true;
   protected Set field_109555_H = new HashSet();
   private int field_109554_O;
   int[] field_109556_I;
   private List field_109559_P;
   public boolean field_109557_J;


   public C_101324_xz func_109362_a(int var1, int var2) {
      if(this.func_109461_e(var1, 0, var2)) {
         C_101272_za var3 = this.func_109377_d(var1, var2);
         if(var3 != null) {
            return var3.func_112330_a(var1 & 15, var2 & 15, this.field_109576_v.field_112396_d);
         }
      }

      return this.field_109576_v.field_112396_d.func_112524_a(var1, var2);
   }

   public C_101311_ye func_109465_s() {
      return this.field_109576_v.field_112396_d;
   }

   public C_100873_xe(C_100268_agw var1, String var2, C_101289_zr var3, C_100840_xm var4, C_100649_jy var5) {
      this.field_109554_O = this.field_109577_u.nextInt(12000);
      this.field_109556_I = new int['\u8000'];
      this.field_109559_P = new ArrayList();
      this.field_109557_J = false;
      this.field_109584_y = var1;
      this.field_109545_E = var5;
      this.field_109583_z = new C_100269_agv(var4, var2);
      this.field_109576_v = var3;
      this.field_109549_B = new C_100237_ahk(var1);
      C_100521_oe var6 = (C_100521_oe)this.field_109549_B.func_107070_a(C_100521_oe.class, "villages");
      if(var6 == null) {
         this.field_109550_C = new C_100521_oe(this);
         this.field_109549_B.func_107073_a("villages", this.field_109550_C);
      } else {
         this.field_109550_C = var6;
         this.field_109550_C.func_107275_a(this);
      }

      var3.func_112385_a(this);
      this.field_109585_x = this.func_109462_j();
      this.func_109481_w();
      this.func_109510_a();
   }

   public C_100873_xe(C_100268_agw var1, String var2, C_100840_xm var3, C_101289_zr var4, C_100649_jy var5) {
      this.field_109554_O = this.field_109577_u.nextInt(12000);
      this.field_109556_I = new int['\u8000'];
      this.field_109559_P = new ArrayList();
      this.field_109557_J = false;
      this.field_109584_y = var1;
      this.field_109545_E = var5;
      this.field_109549_B = new C_100237_ahk(var1);
      this.field_109583_z = var1.func_107088_d();
      if(var4 != null) {
         this.field_109576_v = var4;
      } else if(this.field_109583_z != null && this.field_109583_z.func_107163_j() != 0) {
         this.field_109576_v = C_101289_zr.func_112381_a(this.field_109583_z.func_107163_j());
      } else {
         this.field_109576_v = C_101289_zr.func_112381_a(0);
      }

      if(this.field_109583_z == null) {
         this.field_109583_z = new C_100269_agv(var3, var2);
      } else {
         this.field_109583_z.func_107132_a(var2);
      }

      this.field_109576_v.func_112385_a(this);
      this.field_109585_x = this.func_109462_j();
      if(!this.field_109583_z.func_107149_w()) {
         this.func_109418_a(var3);
         this.field_109583_z.func_107165_d(true);
      }

      C_100521_oe var6 = (C_100521_oe)this.field_109549_B.func_107070_a(C_100521_oe.class, "villages");
      if(var6 == null) {
         this.field_109550_C = new C_100521_oe(this);
         this.field_109549_B.func_107073_a("villages", this.field_109550_C);
      } else {
         this.field_109550_C = var6;
         this.field_109550_C.func_107275_a(this);
      }

      this.func_109481_w();
      this.func_109510_a();
   }

   protected abstract C_101331_yx func_109462_j();

   protected void func_109418_a(C_100840_xm var1) {
      this.field_109583_z.func_107165_d(true);
   }

   public void func_109535_f() {
      this.func_109514_A(8, 64, 8);
   }

   public int func_109489_b(int var1, int var2) {
      int var3;
      for(var3 = 63; !this.func_109352_c(var1, var3 + 1, var2); ++var3) {
         ;
      }

      return this.func_109349_a(var1, var3, var2);
   }

   public int func_109349_a(int var1, int var2, int var3) {
      return var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000?(var2 < 0?0:(var2 >= 256?0:this.func_109440_e(var1 >> 4, var3 >> 4).func_112312_a(var1 & 15, var2, var3 & 15))):0;
   }

   public int func_109516_b(int var1, int var2, int var3) {
      return var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000?(var2 < 0?0:(var2 >= 256?0:this.func_109440_e(var1 >> 4, var3 >> 4).func_112296_b(var1 & 15, var2, var3 & 15))):0;
   }

   public boolean func_109352_c(int var1, int var2, int var3) {
      return this.func_109349_a(var1, var2, var3) == 0;
   }

   public boolean func_109494_d(int var1, int var2, int var3) {
      int var4 = this.func_109349_a(var1, var2, var3);
      return C_100451_alf.field_106118_p[var4] != null && C_100451_alf.field_106118_p[var4].func_106037_u();
   }

   public boolean func_109461_e(int var1, int var2, int var3) {
      return var2 >= 0 && var2 < 256?this.func_109486_c(var1 >> 4, var3 >> 4):false;
   }

   public boolean func_109432_a(int var1, int var2, int var3, int var4) {
      return this.func_109480_d(var1 - var4, var2 - var4, var3 - var4, var1 + var4, var2 + var4, var3 + var4);
   }

   public boolean func_109480_d(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var5 >= 0 && var2 < 256) {
         var1 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var6 >>= 4;

         for(int var7 = var1; var7 <= var4; ++var7) {
            for(int var8 = var3; var8 <= var6; ++var8) {
               if(!this.func_109486_c(var7, var8)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean func_109486_c(int var1, int var2) {
      return this.field_109585_x.func_108656_a(var1, var2);
   }

   public C_101272_za func_109377_d(int var1, int var2) {
      return this.func_109440_e(var1 >> 4, var2 >> 4);
   }

   public C_101272_za func_109440_e(int var1, int var2) {
      return this.field_109585_x.func_108657_d(var1, var2);
   }

   public boolean func_109526_c(int var1, int var2, int var3, int var4, int var5) {
      return this.func_109497_a(var1, var2, var3, var4, var5, true);
   }

   public boolean func_109497_a(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 256) {
            return false;
         } else {
            C_101272_za var7 = this.func_109440_e(var1 >> 4, var3 >> 4);
            boolean var8 = var7.func_112291_a(var1 & 15, var2, var3 & 15, var4, var5);
            this.field_109545_E.func_108901_a("checkLight");
            this.func_109532_x(var1, var2, var3);
            this.field_109545_E.func_108900_b();
            if(var6 && var8 && (this.field_109557_J || var7.field_112343_o)) {
               this.func_109404_h(var1, var2, var3);
            }

            return var8;
         }
      } else {
         return false;
      }
   }

   public boolean func_109378_b(int var1, int var2, int var3, int var4) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 256) {
            return false;
         } else {
            C_101272_za var5 = this.func_109440_e(var1 >> 4, var3 >> 4);
            boolean var6 = var5.func_112297_a(var1 & 15, var2, var3 & 15, var4);
            this.field_109545_E.func_108901_a("checkLight");
            this.func_109532_x(var1, var2, var3);
            this.field_109545_E.func_108900_b();
            if(var6 && (this.field_109557_J || var5.field_112343_o)) {
               this.func_109404_h(var1, var2, var3);
            }

            return var6;
         }
      } else {
         return false;
      }
   }

   public C_100664_afg func_109350_f(int var1, int var2, int var3) {
      int var4 = this.func_109349_a(var1, var2, var3);
      return var4 == 0?C_100664_afg.field_109012_a:C_100451_alf.field_106118_p[var4].field_106204_cB;
   }

   public int func_109357_g(int var1, int var2, int var3) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if(var2 < 0) {
            return 0;
         } else if(var2 >= 256) {
            return 0;
         } else {
            C_101272_za var4 = this.func_109440_e(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var4.func_112327_c(var1, var2, var3);
         }
      } else {
         return 0;
      }
   }

   public void func_109488_c(int var1, int var2, int var3, int var4) {
      if(this.func_109441_d(var1, var2, var3, var4)) {
         this.func_109409_f(var1, var2, var3, this.func_109349_a(var1, var2, var3));
      }

   }

   public boolean func_109441_d(int var1, int var2, int var3, int var4) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 256) {
            return false;
         } else {
            C_101272_za var5 = this.func_109440_e(var1 >> 4, var3 >> 4);
            int var6 = var1 & 15;
            int var7 = var3 & 15;
            boolean var8 = var5.func_112289_b(var6, var2, var7, var4);
            if(var8 && (this.field_109557_J || var5.field_112343_o && C_100451_alf.field_106113_u[var5.func_112312_a(var6, var2, var7) & 4095])) {
               this.func_109404_h(var1, var2, var3);
            }

            return var8;
         }
      } else {
         return false;
      }
   }

   public boolean func_109422_e(int var1, int var2, int var3, int var4) {
      if(this.func_109378_b(var1, var2, var3, var4)) {
         this.func_109409_f(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public boolean func_109394_d(int var1, int var2, int var3, int var4, int var5) {
      if(this.func_109526_c(var1, var2, var3, var4, var5)) {
         this.func_109409_f(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public void func_109404_h(int var1, int var2, int var3) {
      Iterator var4 = this.field_109575_w.iterator();

      while(var4.hasNext()) {
         C_100831_xk var5 = (C_100831_xk)var4.next();
         var5.func_109705_a(var1, var2, var3);
      }

   }

   public void func_109409_f(int var1, int var2, int var3, int var4) {
      this.func_109460_h(var1, var2, var3, var4);
   }

   public void func_109536_g(int var1, int var2, int var3, int var4) {
      int var5;
      if(var3 > var4) {
         var5 = var4;
         var4 = var3;
         var3 = var5;
      }

      if(!this.field_109576_v.field_112394_f) {
         for(var5 = var3; var5 <= var4; ++var5) {
            this.func_109505_c(C_100847_xq.field_110168_a, var1, var5, var2);
         }
      }

      this.func_109511_e(var1, var3, var2, var1, var4, var2);
   }

   public void func_109423_i(int var1, int var2, int var3) {
      Iterator var4 = this.field_109575_w.iterator();

      while(var4.hasNext()) {
         C_100831_xk var5 = (C_100831_xk)var4.next();
         var5.func_109702_a(var1, var2, var3, var1, var2, var3);
      }

   }

   public void func_109511_e(int var1, int var2, int var3, int var4, int var5, int var6) {
      Iterator var7 = this.field_109575_w.iterator();

      while(var7.hasNext()) {
         C_100831_xk var8 = (C_100831_xk)var7.next();
         var8.func_109702_a(var1, var2, var3, var4, var5, var6);
      }

   }

   public void func_109460_h(int var1, int var2, int var3, int var4) {
      this.func_109376_m(var1 - 1, var2, var3, var4);
      this.func_109376_m(var1 + 1, var2, var3, var4);
      this.func_109376_m(var1, var2 - 1, var3, var4);
      this.func_109376_m(var1, var2 + 1, var3, var4);
      this.func_109376_m(var1, var2, var3 - 1, var4);
      this.func_109376_m(var1, var2, var3 + 1, var4);
   }

   private void func_109376_m(int var1, int var2, int var3, int var4) {
      if(!this.field_109579_s && !this.field_109557_J) {
         C_100451_alf var5 = C_100451_alf.field_106118_p[this.func_109349_a(var1, var2, var3)];
         if(var5 != null) {
            var5.func_106017_a(this, var1, var2, var3, var4);
         }

      }
   }

   public boolean func_109502_j(int var1, int var2, int var3) {
      return this.func_109440_e(var1 >> 4, var3 >> 4).func_112319_d(var1 & 15, var2, var3 & 15);
   }

   public int func_109445_k(int var1, int var2, int var3) {
      if(var2 < 0) {
         return 0;
      } else {
         if(var2 >= 256) {
            var2 = 255;
         }

         return this.func_109440_e(var1 >> 4, var3 >> 4).func_112328_c(var1 & 15, var2, var3 & 15, 0);
      }
   }

   public int func_109523_l(int var1, int var2, int var3) {
      return this.func_109407_a(var1, var2, var3, true);
   }

   public int func_109407_a(int var1, int var2, int var3, boolean var4) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         if(var4) {
            int var5 = this.func_109349_a(var1, var2, var3);
            if(var5 == C_100451_alf.field_106238_an.field_106162_cm || var5 == C_100451_alf.field_106213_bR.field_106162_cm || var5 == C_100451_alf.field_106196_aD.field_106162_cm || var5 == C_100451_alf.field_106187_aK.field_106162_cm || var5 == C_100451_alf.field_106218_aw.field_106162_cm) {
               int var6 = this.func_109407_a(var1, var2 + 1, var3, false);
               int var7 = this.func_109407_a(var1 + 1, var2, var3, false);
               int var8 = this.func_109407_a(var1 - 1, var2, var3, false);
               int var9 = this.func_109407_a(var1, var2, var3 + 1, false);
               int var10 = this.func_109407_a(var1, var2, var3 - 1, false);
               if(var7 > var6) {
                  var6 = var7;
               }

               if(var8 > var6) {
                  var6 = var8;
               }

               if(var9 > var6) {
                  var6 = var9;
               }

               if(var10 > var6) {
                  var6 = var10;
               }

               return var6;
            }
         }

         if(var2 < 0) {
            return 0;
         } else {
            if(var2 >= 256) {
               var2 = 255;
            }

            C_101272_za var11 = this.func_109440_e(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var11.func_112328_c(var1, var2, var3, this.field_109571_j);
         }
      } else {
         return 15;
      }
   }

   public int func_109538_f(int var1, int var2) {
      if(var1 >= -30000000 && var2 >= -30000000 && var1 < 30000000 && var2 < 30000000) {
         if(!this.func_109486_c(var1 >> 4, var2 >> 4)) {
            return 0;
         } else {
            C_101272_za var3 = this.func_109440_e(var1 >> 4, var2 >> 4);
            return var3.func_112313_b(var1 & 15, var2 & 15);
         }
      } else {
         return 0;
      }
   }

   public int func_109435_g(int var1, int var2) {
      if(var1 >= -30000000 && var2 >= -30000000 && var1 < 30000000 && var2 < 30000000) {
         if(!this.func_109486_c(var1 >> 4, var2 >> 4)) {
            return 0;
         } else {
            C_101272_za var3 = this.func_109440_e(var1 >> 4, var2 >> 4);
            return var3.field_112355_p;
         }
      } else {
         return 0;
      }
   }

   public int func_109469_a(C_100847_xq var1, int var2, int var3, int var4) {
      if(this.field_109576_v.field_112394_f && var1 == C_100847_xq.field_110168_a) {
         return 0;
      } else {
         if(var3 < 0) {
            var3 = 0;
         }

         if(var3 >= 256) {
            return var1.field_110167_c;
         } else if(var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 < 30000000) {
            int var5 = var2 >> 4;
            int var6 = var4 >> 4;
            if(!this.func_109486_c(var5, var6)) {
               return var1.field_110167_c;
            } else if(C_100451_alf.field_106112_v[this.func_109349_a(var2, var3, var4)]) {
               int var12 = this.func_109375_b(var1, var2, var3 + 1, var4);
               int var8 = this.func_109375_b(var1, var2 + 1, var3, var4);
               int var9 = this.func_109375_b(var1, var2 - 1, var3, var4);
               int var10 = this.func_109375_b(var1, var2, var3, var4 + 1);
               int var11 = this.func_109375_b(var1, var2, var3, var4 - 1);
               if(var8 > var12) {
                  var12 = var8;
               }

               if(var9 > var12) {
                  var12 = var9;
               }

               if(var10 > var12) {
                  var12 = var10;
               }

               if(var11 > var12) {
                  var12 = var11;
               }

               return var12;
            } else {
               C_101272_za var7 = this.func_109440_e(var5, var6);
               return var7.func_112295_a(var1, var2 & 15, var3, var4 & 15);
            }
         } else {
            return var1.field_110167_c;
         }
      }
   }

   public int func_109375_b(C_100847_xq var1, int var2, int var3, int var4) {
      if(var3 < 0) {
         var3 = 0;
      }

      if(var3 >= 256) {
         var3 = 255;
      }

      if(var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 < 30000000) {
         int var5 = var2 >> 4;
         int var6 = var4 >> 4;
         if(!this.func_109486_c(var5, var6)) {
            return var1.field_110167_c;
         } else {
            C_101272_za var7 = this.func_109440_e(var5, var6);
            return var7.func_112295_a(var1, var2 & 15, var3, var4 & 15);
         }
      } else {
         return var1.field_110167_c;
      }
   }

   public void func_109444_b(C_100847_xq var1, int var2, int var3, int var4, int var5) {
      if(var2 >= -30000000 && var4 >= -30000000 && var2 < 30000000 && var4 < 30000000) {
         if(var3 >= 0) {
            if(var3 < 256) {
               if(this.func_109486_c(var2 >> 4, var4 >> 4)) {
                  C_101272_za var6 = this.func_109440_e(var2 >> 4, var4 >> 4);
                  var6.func_112303_a(var1, var2 & 15, var3, var4 & 15, var5);
                  Iterator var7 = this.field_109575_w.iterator();

                  while(var7.hasNext()) {
                     C_100831_xk var8 = (C_100831_xk)var7.next();
                     var8.func_109707_b(var2, var3, var4);
                  }

               }
            }
         }
      }
   }

   public void func_109470_n(int var1, int var2, int var3) {
      Iterator var4 = this.field_109575_w.iterator();

      while(var4.hasNext()) {
         C_100831_xk var5 = (C_100831_xk)var4.next();
         var5.func_109707_b(var1, var2, var3);
      }

   }

   public int func_109355_i(int var1, int var2, int var3, int var4) {
      int var5 = this.func_109469_a(C_100847_xq.field_110168_a, var1, var2, var3);
      int var6 = this.func_109469_a(C_100847_xq.field_110166_b, var1, var2, var3);
      if(var6 < var4) {
         var6 = var4;
      }

      return var5 << 20 | var6 << 4;
   }

   public float func_109358_j(int var1, int var2, int var3, int var4) {
      int var5 = this.func_109523_l(var1, var2, var3);
      if(var5 < var4) {
         var5 = var4;
      }

      return this.field_109576_v.field_112395_g[var5];
   }

   public float func_109354_o(int var1, int var2, int var3) {
      return this.field_109576_v.field_112395_g[this.func_109523_l(var1, var2, var3)];
   }

   public boolean func_109402_t() {
      return this.field_109571_j < 4;
   }

   public C_100383_amu func_109522_a(C_100387_amw var1, C_100387_amw var2) {
      return this.func_109439_a(var1, var2, false, false);
   }

   public C_100383_amu func_109390_a(C_100387_amw var1, C_100387_amw var2, boolean var3) {
      return this.func_109439_a(var1, var2, var3, false);
   }

   public C_100383_amu func_109439_a(C_100387_amw var1, C_100387_amw var2, boolean var3, boolean var4) {
      if(!Double.isNaN(var1.field_107872_c) && !Double.isNaN(var1.field_107869_d) && !Double.isNaN(var1.field_107870_e)) {
         if(!Double.isNaN(var2.field_107872_c) && !Double.isNaN(var2.field_107869_d) && !Double.isNaN(var2.field_107870_e)) {
            int var5 = C_100650_jv.func_108910_c(var2.field_107872_c);
            int var6 = C_100650_jv.func_108910_c(var2.field_107869_d);
            int var7 = C_100650_jv.func_108910_c(var2.field_107870_e);
            int var8 = C_100650_jv.func_108910_c(var1.field_107872_c);
            int var9 = C_100650_jv.func_108910_c(var1.field_107869_d);
            int var10 = C_100650_jv.func_108910_c(var1.field_107870_e);
            int var11 = this.func_109349_a(var8, var9, var10);
            int var12 = this.func_109357_g(var8, var9, var10);
            C_100451_alf var13 = C_100451_alf.field_106118_p[var11];
            if((!var4 || var13 == null || var13.func_106021_e(this, var8, var9, var10) != null) && var11 > 0 && var13.func_106010_a(var12, var3)) {
               C_100383_amu var14 = var13.func_105992_a(this, var8, var9, var10, var1, var2);
               if(var14 != null) {
                  return var14;
               }
            }

            var11 = 200;

            while(var11-- >= 0) {
               if(Double.isNaN(var1.field_107872_c) || Double.isNaN(var1.field_107869_d) || Double.isNaN(var1.field_107870_e)) {
                  return null;
               }

               if(var8 == var5 && var9 == var6 && var10 == var7) {
                  return null;
               }

               boolean var39 = true;
               boolean var40 = true;
               boolean var41 = true;
               double var15 = 999.0D;
               double var17 = 999.0D;
               double var19 = 999.0D;
               if(var5 > var8) {
                  var15 = (double)var8 + 1.0D;
               } else if(var5 < var8) {
                  var15 = (double)var8 + 0.0D;
               } else {
                  var39 = false;
               }

               if(var6 > var9) {
                  var17 = (double)var9 + 1.0D;
               } else if(var6 < var9) {
                  var17 = (double)var9 + 0.0D;
               } else {
                  var40 = false;
               }

               if(var7 > var10) {
                  var19 = (double)var10 + 1.0D;
               } else if(var7 < var10) {
                  var19 = (double)var10 + 0.0D;
               } else {
                  var41 = false;
               }

               double var21 = 999.0D;
               double var23 = 999.0D;
               double var25 = 999.0D;
               double var27 = var2.field_107872_c - var1.field_107872_c;
               double var29 = var2.field_107869_d - var1.field_107869_d;
               double var31 = var2.field_107870_e - var1.field_107870_e;
               if(var39) {
                  var21 = (var15 - var1.field_107872_c) / var27;
               }

               if(var40) {
                  var23 = (var17 - var1.field_107869_d) / var29;
               }

               if(var41) {
                  var25 = (var19 - var1.field_107870_e) / var31;
               }

               boolean var33 = false;
               byte var42;
               if(var21 < var23 && var21 < var25) {
                  if(var5 > var8) {
                     var42 = 4;
                  } else {
                     var42 = 5;
                  }

                  var1.field_107872_c = var15;
                  var1.field_107869_d += var29 * var21;
                  var1.field_107870_e += var31 * var21;
               } else if(var23 < var25) {
                  if(var6 > var9) {
                     var42 = 0;
                  } else {
                     var42 = 1;
                  }

                  var1.field_107872_c += var27 * var23;
                  var1.field_107869_d = var17;
                  var1.field_107870_e += var31 * var23;
               } else {
                  if(var7 > var10) {
                     var42 = 2;
                  } else {
                     var42 = 3;
                  }

                  var1.field_107872_c += var27 * var25;
                  var1.field_107869_d += var29 * var25;
                  var1.field_107870_e = var19;
               }

               C_100387_amw var34 = this.func_109363_R().func_107878_a(var1.field_107872_c, var1.field_107869_d, var1.field_107870_e);
               var8 = (int)(var34.field_107872_c = (double)C_100650_jv.func_108910_c(var1.field_107872_c));
               if(var42 == 5) {
                  --var8;
                  ++var34.field_107872_c;
               }

               var9 = (int)(var34.field_107869_d = (double)C_100650_jv.func_108910_c(var1.field_107869_d));
               if(var42 == 1) {
                  --var9;
                  ++var34.field_107869_d;
               }

               var10 = (int)(var34.field_107870_e = (double)C_100650_jv.func_108910_c(var1.field_107870_e));
               if(var42 == 3) {
                  --var10;
                  ++var34.field_107870_e;
               }

               int var35 = this.func_109349_a(var8, var9, var10);
               int var36 = this.func_109357_g(var8, var9, var10);
               C_100451_alf var37 = C_100451_alf.field_106118_p[var35];
               if((!var4 || var37 == null || var37.func_106021_e(this, var8, var9, var10) != null) && var35 > 0 && var37.func_106010_a(var36, var3)) {
                  C_100383_amu var38 = var37.func_105992_a(this, var8, var9, var10, var1, var2);
                  if(var38 != null) {
                     return var38;
                  }
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void func_109412_a(C_100730_lb var1, String var2, float var3, float var4) {
      if(var1 != null && var2 != null) {
         Iterator var5 = this.field_109575_w.iterator();

         while(var5.hasNext()) {
            C_100831_xk var6 = (C_100831_xk)var5.next();
            var6.func_109699_a(var2, var1.field_103221_t, var1.field_103219_u - (double)var1.field_103181_M, var1.field_103217_v, var3, var4);
         }

      }
   }

   public void func_109476_a(double var1, double var3, double var5, String var7, float var8, float var9) {
      if(var7 != null) {
         Iterator var10 = this.field_109575_w.iterator();

         while(var10.hasNext()) {
            C_100831_xk var11 = (C_100831_xk)var10.next();
            var11.func_109699_a(var7, var1, var3, var5, var8, var9);
         }

      }
   }

   public void func_109541_b(double var1, double var3, double var5, String var7, float var8, float var9) {}

   public void func_109499_a(String var1, int var2, int var3, int var4) {
      Iterator var5 = this.field_109575_w.iterator();

      while(var5.hasNext()) {
         C_100831_xk var6 = (C_100831_xk)var5.next();
         var6.func_109697_a(var1, var2, var3, var4);
      }

   }

   public void func_109428_a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      Iterator var14 = this.field_109575_w.iterator();

      while(var14.hasNext()) {
         C_100831_xk var15 = (C_100831_xk)var14.next();
         var15.func_109704_a(var1, var2, var4, var6, var8, var10, var12);
      }

   }

   public boolean func_109477_c(C_100730_lb var1) {
      this.field_109574_i.add(var1);
      return true;
   }

   public boolean func_109513_d(C_100730_lb var1) {
      int var2 = C_100650_jv.func_108910_c(var1.field_103221_t / 16.0D);
      int var3 = C_100650_jv.func_108910_c(var1.field_103217_v / 16.0D);
      boolean var4 = false;
      if(var1 instanceof C_101095_qg) {
         var4 = true;
      }

      if(!var4 && !this.func_109486_c(var2, var3)) {
         return false;
      } else {
         if(var1 instanceof C_101095_qg) {
            C_101095_qg var5 = (C_101095_qg)var1;
            this.field_109573_h.add(var5);
            this.func_109416_c();
         }

         this.func_109440_e(var2, var3).func_112304_a(var1);
         this.field_109563_e.add(var1);
         this.func_109393_a(var1);
         return true;
      }
   }

   protected void func_109393_a(C_100730_lb var1) {
      Iterator var2 = this.field_109575_w.iterator();

      while(var2.hasNext()) {
         C_100831_xk var3 = (C_100831_xk)var2.next();
         var3.func_109698_a(var1);
      }

   }

   protected void func_109442_b(C_100730_lb var1) {
      Iterator var2 = this.field_109575_w.iterator();

      while(var2.hasNext()) {
         C_100831_xk var3 = (C_100831_xk)var2.next();
         var3.func_109703_b(var1);
      }

   }

   public void func_109383_e(C_100730_lb var1) {
      if(var1.field_103206_n != null) {
         var1.field_103206_n.func_103064_a((C_100730_lb)null);
      }

      if(var1.field_103207_o != null) {
         var1.func_103064_a((C_100730_lb)null);
      }

      var1.func_103121_x();
      if(var1 instanceof C_101095_qg) {
         this.field_109573_h.remove(var1);
         this.func_109416_c();
      }

   }

   public void func_109431_f(C_100730_lb var1) {
      var1.func_103121_x();
      if(var1 instanceof C_101095_qg) {
         this.field_109573_h.remove(var1);
         this.func_109416_c();
      }

      int var2 = var1.field_103218_ai;
      int var3 = var1.field_103214_ak;
      if(var1.field_103235_ah && this.func_109486_c(var2, var3)) {
         this.func_109440_e(var2, var3).func_112308_b(var1);
      }

      this.field_109563_e.remove(var1);
      this.func_109442_b(var1);
   }

   public void func_109521_a(C_100831_xk var1) {
      this.field_109575_w.add(var1);
   }

   public void func_109379_b(C_100831_xk var1) {
      this.field_109575_w.remove(var1);
   }

   public List func_109508_a(C_100730_lb var1, C_100412_amr var2) {
      this.field_109552_M.clear();
      int var3 = C_100650_jv.func_108910_c(var2.field_107917_a);
      int var4 = C_100650_jv.func_108910_c(var2.field_107913_d + 1.0D);
      int var5 = C_100650_jv.func_108910_c(var2.field_107915_b);
      int var6 = C_100650_jv.func_108910_c(var2.field_107914_e + 1.0D);
      int var7 = C_100650_jv.func_108910_c(var2.field_107916_c);
      int var8 = C_100650_jv.func_108910_c(var2.field_107911_f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var7; var10 < var8; ++var10) {
            if(this.func_109461_e(var9, 64, var10)) {
               for(int var11 = var5 - 1; var11 < var6; ++var11) {
                  C_100451_alf var12 = C_100451_alf.field_106118_p[this.func_109349_a(var9, var11, var10)];
                  if(var12 != null) {
                     var12.func_105986_a(this, var9, var11, var10, var2, this.field_109552_M, var1);
                  }
               }
            }
         }
      }

      double var15 = 0.25D;
      List var17 = this.func_109449_b(var1, var2.func_107895_b(var15, var15, var15));
      Iterator var16 = var17.iterator();

      while(var16.hasNext()) {
         C_100730_lb var13 = (C_100730_lb)var16.next();
         C_100412_amr var14 = var13.func_103088_E();
         if(var14 != null && var14.func_107898_a(var2)) {
            this.field_109552_M.add(var14);
         }

         var14 = var1.func_103104_g(var13);
         if(var14 != null && var14.func_107898_a(var2)) {
            this.field_109552_M.add(var14);
         }
      }

      return this.field_109552_M;
   }

   public List func_109399_a(C_100412_amr var1) {
      this.field_109552_M.clear();
      int var2 = C_100650_jv.func_108910_c(var1.field_107917_a);
      int var3 = C_100650_jv.func_108910_c(var1.field_107913_d + 1.0D);
      int var4 = C_100650_jv.func_108910_c(var1.field_107915_b);
      int var5 = C_100650_jv.func_108910_c(var1.field_107914_e + 1.0D);
      int var6 = C_100650_jv.func_108910_c(var1.field_107916_c);
      int var7 = C_100650_jv.func_108910_c(var1.field_107911_f + 1.0D);

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var6; var9 < var7; ++var9) {
            if(this.func_109461_e(var8, 64, var9)) {
               for(int var10 = var4 - 1; var10 < var5; ++var10) {
                  C_100451_alf var11 = C_100451_alf.field_106118_p[this.func_109349_a(var8, var10, var9)];
                  if(var11 != null) {
                     var11.func_105986_a(this, var8, var10, var9, var1, this.field_109552_M, (C_100730_lb)null);
                  }
               }
            }
         }
      }

      return this.field_109552_M;
   }

   public int func_109530_a(float var1) {
      float var2 = this.func_109382_c(var1);
      float var3 = 1.0F - (C_100650_jv.func_108928_b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F);
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0D - (double)(this.func_109426_j(var1) * 5.0F) / 16.0D));
      var3 = (float)((double)var3 * (1.0D - (double)(this.func_109373_i(var1) * 5.0F) / 16.0D));
      var3 = 1.0F - var3;
      return (int)(var3 * 11.0F);
   }

   public float func_109534_b(float var1) {
      float var2 = this.func_109382_c(var1);
      float var3 = 1.0F - (C_100650_jv.func_108928_b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.2F);
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0D - (double)(this.func_109426_j(var1) * 5.0F) / 16.0D));
      var3 = (float)((double)var3 * (1.0D - (double)(this.func_109373_i(var1) * 5.0F) / 16.0D));
      return var3 * 0.8F + 0.2F;
   }

   public C_100387_amw func_109478_a(C_100730_lb var1, float var2) {
      float var3 = this.func_109382_c(var2);
      float var4 = C_100650_jv.func_108928_b(var3 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if(var4 < 0.0F) {
         var4 = 0.0F;
      }

      if(var4 > 1.0F) {
         var4 = 1.0F;
      }

      int var5 = C_100650_jv.func_108910_c(var1.field_103221_t);
      int var6 = C_100650_jv.func_108910_c(var1.field_103217_v);
      C_101324_xz var7 = this.func_109362_a(var5, var6);
      float var8 = var7.func_112465_j();
      int var9 = var7.func_112452_a(var8);
      float var10 = (float)(var9 >> 16 & 255) / 255.0F;
      float var11 = (float)(var9 >> 8 & 255) / 255.0F;
      float var12 = (float)(var9 & 255) / 255.0F;
      var10 *= var4;
      var11 *= var4;
      var12 *= var4;
      float var13 = this.func_109426_j(var2);
      float var14;
      float var15;
      if(var13 > 0.0F) {
         var14 = (var10 * 0.3F + var11 * 0.59F + var12 * 0.11F) * 0.6F;
         var15 = 1.0F - var13 * 0.75F;
         var10 = var10 * var15 + var14 * (1.0F - var15);
         var11 = var11 * var15 + var14 * (1.0F - var15);
         var12 = var12 * var15 + var14 * (1.0F - var15);
      }

      var14 = this.func_109373_i(var2);
      if(var14 > 0.0F) {
         var15 = (var10 * 0.3F + var11 * 0.59F + var12 * 0.11F) * 0.2F;
         float var16 = 1.0F - var14 * 0.75F;
         var10 = var10 * var16 + var15 * (1.0F - var16);
         var11 = var11 * var16 + var15 * (1.0F - var16);
         var12 = var12 * var16 + var15 * (1.0F - var16);
      }

      if(this.field_109580_r > 0) {
         var15 = (float)this.field_109580_r - var2;
         if(var15 > 1.0F) {
            var15 = 1.0F;
         }

         var15 *= 0.45F;
         var10 = var10 * (1.0F - var15) + 0.8F * var15;
         var11 = var11 * (1.0F - var15) + 0.8F * var15;
         var12 = var12 * (1.0F - var15) + 1.0F * var15;
      }

      return this.func_109363_R().func_107878_a((double)var10, (double)var11, (double)var12);
   }

   public float func_109382_c(float var1) {
      return this.field_109576_v.func_112382_a(this.field_109583_z.func_107166_g(), var1);
   }

   public int func_109415_d(float var1) {
      return this.field_109576_v.func_112377_b(this.field_109583_z.func_107166_g(), var1);
   }

   public float func_109496_e(float var1) {
      float var2 = this.func_109382_c(var1);
      return var2 * 3.1415927F * 2.0F;
   }

   public C_100387_amw func_109537_f(float var1) {
      float var2 = this.func_109382_c(var1);
      float var3 = C_100650_jv.func_108928_b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = (float)(this.field_109565_c >> 16 & 255L) / 255.0F;
      float var5 = (float)(this.field_109565_c >> 8 & 255L) / 255.0F;
      float var6 = (float)(this.field_109565_c & 255L) / 255.0F;
      float var7 = this.func_109426_j(var1);
      float var8;
      float var9;
      if(var7 > 0.0F) {
         var8 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.6F;
         var9 = 1.0F - var7 * 0.95F;
         var4 = var4 * var9 + var8 * (1.0F - var9);
         var5 = var5 * var9 + var8 * (1.0F - var9);
         var6 = var6 * var9 + var8 * (1.0F - var9);
      }

      var4 *= var3 * 0.9F + 0.1F;
      var5 *= var3 * 0.9F + 0.1F;
      var6 *= var3 * 0.85F + 0.15F;
      var8 = this.func_109373_i(var1);
      if(var8 > 0.0F) {
         var9 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.2F;
         float var10 = 1.0F - var8 * 0.95F;
         var4 = var4 * var10 + var9 * (1.0F - var10);
         var5 = var5 * var10 + var9 * (1.0F - var10);
         var6 = var6 * var10 + var9 * (1.0F - var10);
      }

      return this.func_109363_R().func_107878_a((double)var4, (double)var5, (double)var6);
   }

   public C_100387_amw func_109424_g(float var1) {
      float var2 = this.func_109382_c(var1);
      return this.field_109576_v.func_112379_b(var2, var1);
   }

   public int func_109380_h(int var1, int var2) {
      return this.func_109377_d(var1, var2).func_112325_d(var1 & 15, var2 & 15);
   }

   public int func_109459_i(int var1, int var2) {
      C_101272_za var3 = this.func_109377_d(var1, var2);
      int var4 = var3.func_112324_h() + 15;
      var1 &= 15;

      for(var2 &= 15; var4 > 0; --var4) {
         int var5 = var3.func_112312_a(var1, var4, var2);
         if(var5 != 0 && C_100451_alf.field_106118_p[var5].field_106204_cB.func_108992_c() && C_100451_alf.field_106118_p[var5].field_106204_cB != C_100664_afg.field_109017_j) {
            return var4 + 1;
         }
      }

      return -1;
   }

   public float func_109438_h(float var1) {
      float var2 = this.func_109382_c(var1);
      float var3 = 1.0F - (C_100650_jv.func_108928_b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.25F);
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      return var3 * var3 * 0.5F;
   }

   public void func_109398_a(int var1, int var2, int var3, int var4, int var5) {}

   public void func_109525_a(int var1, int var2, int var3, int var4, int var5, int var6) {}

   public void func_109453_b(int var1, int var2, int var3, int var4, int var5) {}

   public void func_109419_h() {
      this.field_109545_E.func_108901_a("entities");
      this.field_109545_E.func_108901_a("global");

      int var1;
      C_100730_lb var2;
      for(var1 = 0; var1 < this.field_109574_i.size(); ++var1) {
         var2 = (C_100730_lb)this.field_109574_i.get(var1);
         var2.func_103165_j_();
         if(var2.field_103180_L) {
            this.field_109574_i.remove(var1--);
         }
      }

      this.field_109545_E.func_108899_c("remove");
      this.field_109563_e.removeAll(this.field_109560_f);
      Iterator var5 = this.field_109560_f.iterator();

      int var3;
      int var4;
      while(var5.hasNext()) {
         var2 = (C_100730_lb)var5.next();
         var3 = var2.field_103218_ai;
         var4 = var2.field_103214_ak;
         if(var2.field_103235_ah && this.func_109486_c(var3, var4)) {
            this.func_109440_e(var3, var4).func_112308_b(var2);
         }
      }

      var5 = this.field_109560_f.iterator();

      while(var5.hasNext()) {
         var2 = (C_100730_lb)var5.next();
         this.func_109442_b(var2);
      }

      this.field_109560_f.clear();
      this.field_109545_E.func_108899_c("regular");

      for(var1 = 0; var1 < this.field_109563_e.size(); ++var1) {
         var2 = (C_100730_lb)this.field_109563_e.get(var1);
         if(var2.field_103207_o != null) {
            if(!var2.field_103207_o.field_103180_L && var2.field_103207_o.field_103206_n == var2) {
               continue;
            }

            var2.field_103207_o.field_103206_n = null;
            var2.field_103207_o = null;
         }

         this.field_109545_E.func_108901_a("tick");
         if(!var2.field_103180_L) {
            this.func_109506_g(var2);
         }

         this.field_109545_E.func_108900_b();
         this.field_109545_E.func_108901_a("remove");
         if(var2.field_103180_L) {
            var3 = var2.field_103218_ai;
            var4 = var2.field_103214_ak;
            if(var2.field_103235_ah && this.func_109486_c(var3, var4)) {
               this.func_109440_e(var3, var4).func_112308_b(var2);
            }

            this.field_109563_e.remove(var1--);
            this.func_109442_b(var2);
         }

         this.field_109545_E.func_108900_b();
      }

      this.field_109545_E.func_108899_c("tileEntities");
      this.field_109553_N = true;
      var5 = this.field_109561_g.iterator();

      while(var5.hasNext()) {
         C_100398_amm var6 = (C_100398_amm)var5.next();
         if(!var6.func_102927_r() && var6.func_102914_o() && this.func_109461_e(var6.field_102938_l, var6.field_102939_m, var6.field_102936_n)) {
            var6.func_102921_g();
         }

         if(var6.func_102927_r()) {
            var5.remove();
            if(this.func_109486_c(var6.field_102938_l >> 4, var6.field_102936_n >> 4)) {
               C_101272_za var8 = this.func_109440_e(var6.field_102938_l >> 4, var6.field_102936_n >> 4);
               if(var8 != null) {
                  var8.func_112326_f(var6.field_102938_l & 15, var6.field_102939_m, var6.field_102936_n & 15);
               }
            }
         }
      }

      this.field_109553_N = false;
      if(!this.field_109564_b.isEmpty()) {
         this.field_109561_g.removeAll(this.field_109564_b);
         this.field_109564_b.clear();
      }

      this.field_109545_E.func_108899_c("pendingTileEntities");
      if(!this.field_109566_a.isEmpty()) {
         Iterator var7 = this.field_109566_a.iterator();

         while(var7.hasNext()) {
            C_100398_amm var9 = (C_100398_amm)var7.next();
            if(!var9.func_102927_r()) {
               if(!this.field_109561_g.contains(var9)) {
                  this.field_109561_g.add(var9);
               }

               if(this.func_109486_c(var9.field_102938_l >> 4, var9.field_102936_n >> 4)) {
                  C_101272_za var10 = this.func_109440_e(var9.field_102938_l >> 4, var9.field_102936_n >> 4);
                  if(var10 != null) {
                     var10.func_112333_a(var9.field_102938_l & 15, var9.field_102939_m, var9.field_102936_n & 15, var9);
                  }
               }

               this.func_109404_h(var9.field_102938_l, var9.field_102939_m, var9.field_102936_n);
            }
         }

         this.field_109566_a.clear();
      }

      this.field_109545_E.func_108900_b();
      this.field_109545_E.func_108900_b();
   }

   public void func_109411_a(Collection var1) {
      if(this.field_109553_N) {
         this.field_109566_a.addAll(var1);
      } else {
         this.field_109561_g.addAll(var1);
      }

   }

   public void func_109506_g(C_100730_lb var1) {
      this.func_109434_a(var1, true);
   }

   public void func_109434_a(C_100730_lb var1, boolean var2) {
      int var3 = C_100650_jv.func_108910_c(var1.field_103221_t);
      int var4 = C_100650_jv.func_108910_c(var1.field_103217_v);
      byte var5 = 32;
      if(!var2 || this.func_109480_d(var3 - var5, 0, var4 - var5, var3 + var5, 0, var4 + var5)) {
         var1.field_103189_T = var1.field_103221_t;
         var1.field_103188_U = var1.field_103219_u;
         var1.field_103191_V = var1.field_103217_v;
         var1.field_103178_B = var1.field_103236_z;
         var1.field_103179_C = var1.field_103177_A;
         if(var2 && var1.field_103235_ah) {
            if(var1.field_103207_o != null) {
               var1.func_103156_U();
            } else {
               var1.func_103165_j_();
            }
         }

         this.field_109545_E.func_108901_a("chunkCheck");
         if(Double.isNaN(var1.field_103221_t) || Double.isInfinite(var1.field_103221_t)) {
            var1.field_103221_t = var1.field_103189_T;
         }

         if(Double.isNaN(var1.field_103219_u) || Double.isInfinite(var1.field_103219_u)) {
            var1.field_103219_u = var1.field_103188_U;
         }

         if(Double.isNaN(var1.field_103217_v) || Double.isInfinite(var1.field_103217_v)) {
            var1.field_103217_v = var1.field_103191_V;
         }

         if(Double.isNaN((double)var1.field_103177_A) || Double.isInfinite((double)var1.field_103177_A)) {
            var1.field_103177_A = var1.field_103179_C;
         }

         if(Double.isNaN((double)var1.field_103236_z) || Double.isInfinite((double)var1.field_103236_z)) {
            var1.field_103236_z = var1.field_103178_B;
         }

         int var6 = C_100650_jv.func_108910_c(var1.field_103221_t / 16.0D);
         int var7 = C_100650_jv.func_108910_c(var1.field_103219_u / 16.0D);
         int var8 = C_100650_jv.func_108910_c(var1.field_103217_v / 16.0D);
         if(!var1.field_103235_ah || var1.field_103218_ai != var6 || var1.field_103220_aj != var7 || var1.field_103214_ak != var8) {
            if(var1.field_103235_ah && this.func_109486_c(var1.field_103218_ai, var1.field_103214_ak)) {
               this.func_109440_e(var1.field_103218_ai, var1.field_103214_ak).func_112334_a(var1, var1.field_103220_aj);
            }

            if(this.func_109486_c(var6, var8)) {
               var1.field_103235_ah = true;
               this.func_109440_e(var6, var8).func_112304_a(var1);
            } else {
               var1.field_103235_ah = false;
            }
         }

         this.field_109545_E.func_108900_b();
         if(var2 && var1.field_103235_ah && var1.field_103206_n != null) {
            if(!var1.field_103206_n.field_103180_L && var1.field_103206_n.field_103207_o == var1) {
               this.func_109506_g(var1.field_103206_n);
            } else {
               var1.field_103206_n.field_103207_o = null;
               var1.field_103206_n = null;
            }
         }

      }
   }

   public boolean func_109410_b(C_100412_amr var1) {
      return this.func_109490_a(var1, (C_100730_lb)null);
   }

   public boolean func_109490_a(C_100412_amr var1, C_100730_lb var2) {
      List var3 = this.func_109449_b((C_100730_lb)null, var1);
      Iterator var4 = var3.iterator();

      C_100730_lb var5;
      do {
         if(!var4.hasNext()) {
            return true;
         }

         var5 = (C_100730_lb)var4.next();
      } while(var5.field_103180_L || !var5.field_103211_m || var5 == var2);

      return false;
   }

   public boolean func_109482_c(C_100412_amr var1) {
      int var2 = C_100650_jv.func_108910_c(var1.field_107917_a);
      int var3 = C_100650_jv.func_108910_c(var1.field_107913_d + 1.0D);
      int var4 = C_100650_jv.func_108910_c(var1.field_107915_b);
      int var5 = C_100650_jv.func_108910_c(var1.field_107914_e + 1.0D);
      int var6 = C_100650_jv.func_108910_c(var1.field_107916_c);
      int var7 = C_100650_jv.func_108910_c(var1.field_107911_f + 1.0D);
      if(var1.field_107917_a < 0.0D) {
         --var2;
      }

      if(var1.field_107915_b < 0.0D) {
         --var4;
      }

      if(var1.field_107916_c < 0.0D) {
         --var6;
      }

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               C_100451_alf var11 = C_100451_alf.field_106118_p[this.func_109349_a(var8, var9, var10)];
               if(var11 != null) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean func_109413_d(C_100412_amr var1) {
      int var2 = C_100650_jv.func_108910_c(var1.field_107917_a);
      int var3 = C_100650_jv.func_108910_c(var1.field_107913_d + 1.0D);
      int var4 = C_100650_jv.func_108910_c(var1.field_107915_b);
      int var5 = C_100650_jv.func_108910_c(var1.field_107914_e + 1.0D);
      int var6 = C_100650_jv.func_108910_c(var1.field_107916_c);
      int var7 = C_100650_jv.func_108910_c(var1.field_107911_f + 1.0D);
      if(var1.field_107917_a < 0.0D) {
         --var2;
      }

      if(var1.field_107915_b < 0.0D) {
         --var4;
      }

      if(var1.field_107916_c < 0.0D) {
         --var6;
      }

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               C_100451_alf var11 = C_100451_alf.field_106118_p[this.func_109349_a(var8, var9, var10)];
               if(var11 != null && var11.field_106204_cB.func_108986_d()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean func_109403_e(C_100412_amr var1) {
      int var2 = C_100650_jv.func_108910_c(var1.field_107917_a);
      int var3 = C_100650_jv.func_108910_c(var1.field_107913_d + 1.0D);
      int var4 = C_100650_jv.func_108910_c(var1.field_107915_b);
      int var5 = C_100650_jv.func_108910_c(var1.field_107914_e + 1.0D);
      int var6 = C_100650_jv.func_108910_c(var1.field_107916_c);
      int var7 = C_100650_jv.func_108910_c(var1.field_107911_f + 1.0D);
      if(this.func_109480_d(var2, var4, var6, var3, var5, var7)) {
         for(int var8 = var2; var8 < var3; ++var8) {
            for(int var9 = var4; var9 < var5; ++var9) {
               for(int var10 = var6; var10 < var7; ++var10) {
                  int var11 = this.func_109349_a(var8, var9, var10);
                  if(var11 == C_100451_alf.field_106222_au.field_106162_cm || var11 == C_100451_alf.field_106073_F.field_106162_cm || var11 == C_100451_alf.field_106074_G.field_106162_cm) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public boolean func_109512_a(C_100412_amr var1, C_100664_afg var2, C_100730_lb var3) {
      int var4 = C_100650_jv.func_108910_c(var1.field_107917_a);
      int var5 = C_100650_jv.func_108910_c(var1.field_107913_d + 1.0D);
      int var6 = C_100650_jv.func_108910_c(var1.field_107915_b);
      int var7 = C_100650_jv.func_108910_c(var1.field_107914_e + 1.0D);
      int var8 = C_100650_jv.func_108910_c(var1.field_107916_c);
      int var9 = C_100650_jv.func_108910_c(var1.field_107911_f + 1.0D);
      if(!this.func_109480_d(var4, var6, var8, var5, var7, var9)) {
         return false;
      } else {
         boolean var10 = false;
         C_100387_amw var11 = this.func_109363_R().func_107878_a(0.0D, 0.0D, 0.0D);

         for(int var12 = var4; var12 < var5; ++var12) {
            for(int var13 = var6; var13 < var7; ++var13) {
               for(int var14 = var8; var14 < var9; ++var14) {
                  C_100451_alf var15 = C_100451_alf.field_106118_p[this.func_109349_a(var12, var13, var14)];
                  if(var15 != null && var15.field_106204_cB == var2) {
                     double var16 = (double)((float)(var13 + 1) - C_100142_ajm.func_106269_d(this.func_109357_g(var12, var13, var14)));
                     if((double)var7 >= var16) {
                        var10 = true;
                        var15.func_106051_a(this, var12, var13, var14, var3, var11);
                     }
                  }
               }
            }
         }

         if(var11.func_107855_b() > 0.0D) {
            var11 = var11.func_107865_a();
            double var18 = 0.014D;
            var3.field_103215_w += var11.field_107872_c * var18;
            var3.field_103240_x += var11.field_107869_d * var18;
            var3.field_103238_y += var11.field_107870_e * var18;
         }

         return var10;
      }
   }

   public boolean func_109529_a(C_100412_amr var1, C_100664_afg var2) {
      int var3 = C_100650_jv.func_108910_c(var1.field_107917_a);
      int var4 = C_100650_jv.func_108910_c(var1.field_107913_d + 1.0D);
      int var5 = C_100650_jv.func_108910_c(var1.field_107915_b);
      int var6 = C_100650_jv.func_108910_c(var1.field_107914_e + 1.0D);
      int var7 = C_100650_jv.func_108910_c(var1.field_107916_c);
      int var8 = C_100650_jv.func_108910_c(var1.field_107911_f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               C_100451_alf var12 = C_100451_alf.field_106118_p[this.func_109349_a(var9, var10, var11)];
               if(var12 != null && var12.field_106204_cB == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean func_109443_b(C_100412_amr var1, C_100664_afg var2) {
      int var3 = C_100650_jv.func_108910_c(var1.field_107917_a);
      int var4 = C_100650_jv.func_108910_c(var1.field_107913_d + 1.0D);
      int var5 = C_100650_jv.func_108910_c(var1.field_107915_b);
      int var6 = C_100650_jv.func_108910_c(var1.field_107914_e + 1.0D);
      int var7 = C_100650_jv.func_108910_c(var1.field_107916_c);
      int var8 = C_100650_jv.func_108910_c(var1.field_107911_f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               C_100451_alf var12 = C_100451_alf.field_106118_p[this.func_109349_a(var9, var10, var11)];
               if(var12 != null && var12.field_106204_cB == var2) {
                  int var13 = this.func_109357_g(var9, var10, var11);
                  double var14 = (double)(var10 + 1);
                  if(var13 < 8) {
                     var14 = (double)(var10 + 1) - (double)var13 / 8.0D;
                  }

                  if(var14 >= var1.field_107915_b) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public C_100857_wz func_109466_a(C_100730_lb var1, double var2, double var4, double var6, float var8, boolean var9) {
      return this.func_109405_a(var1, var2, var4, var6, var8, false, var9);
   }

   public C_100857_wz func_109405_a(C_100730_lb var1, double var2, double var4, double var6, float var8, boolean var9, boolean var10) {
      C_100857_wz var11 = new C_100857_wz(this, var1, var2, var4, var6, var8);
      var11.field_110228_a = var9;
      var11.field_110226_b = var10;
      var11.func_110220_a();
      var11.func_110221_a(true);
      return var11;
   }

   public float func_109500_a(C_100387_amw var1, C_100412_amr var2) {
      double var3 = 1.0D / ((var2.field_107913_d - var2.field_107917_a) * 2.0D + 1.0D);
      double var5 = 1.0D / ((var2.field_107914_e - var2.field_107915_b) * 2.0D + 1.0D);
      double var7 = 1.0D / ((var2.field_107911_f - var2.field_107916_c) * 2.0D + 1.0D);
      int var9 = 0;
      int var10 = 0;

      for(float var11 = 0.0F; var11 <= 1.0F; var11 = (float)((double)var11 + var3)) {
         for(float var12 = 0.0F; var12 <= 1.0F; var12 = (float)((double)var12 + var5)) {
            for(float var13 = 0.0F; var13 <= 1.0F; var13 = (float)((double)var13 + var7)) {
               double var14 = var2.field_107917_a + (var2.field_107913_d - var2.field_107917_a) * (double)var11;
               double var16 = var2.field_107915_b + (var2.field_107914_e - var2.field_107915_b) * (double)var12;
               double var18 = var2.field_107916_c + (var2.field_107911_f - var2.field_107916_c) * (double)var13;
               if(this.func_109522_a(this.func_109363_R().func_107878_a(var14, var16, var18), var1) == null) {
                  ++var9;
               }

               ++var10;
            }
         }
      }

      return (float)var9 / (float)var10;
   }

   public boolean func_109417_a(C_101095_qg var1, int var2, int var3, int var4, int var5) {
      if(var5 == 0) {
         --var3;
      }

      if(var5 == 1) {
         ++var3;
      }

      if(var5 == 2) {
         --var4;
      }

      if(var5 == 3) {
         ++var4;
      }

      if(var5 == 4) {
         --var2;
      }

      if(var5 == 5) {
         ++var2;
      }

      if(this.func_109349_a(var2, var3, var4) == C_100451_alf.field_106222_au.field_106162_cm) {
         this.func_109492_a(var1, 1004, var2, var3, var4, 0);
         this.func_109422_e(var2, var3, var4, 0);
         return true;
      } else {
         return false;
      }
   }

   public String func_109386_u() {
      return "All: " + this.field_109563_e.size();
   }

   public String func_109539_v() {
      return this.field_109585_x.func_108655_d();
   }

   public C_100398_amm func_109353_p(int var1, int var2, int var3) {
      if(var2 >= 256) {
         return null;
      } else {
         C_101272_za var4 = this.func_109440_e(var1 >> 4, var3 >> 4);
         if(var4 == null) {
            return null;
         } else {
            C_100398_amm var5 = var4.func_112300_e(var1 & 15, var2, var3 & 15);
            if(var5 == null) {
               Iterator var6 = this.field_109566_a.iterator();

               while(var6.hasNext()) {
                  C_100398_amm var7 = (C_100398_amm)var6.next();
                  if(!var7.func_102927_r() && var7.field_102938_l == var1 && var7.field_102939_m == var2 && var7.field_102936_n == var3) {
                     var5 = var7;
                     break;
                  }
               }
            }

            return var5;
         }
      }
   }

   public void func_109543_a(int var1, int var2, int var3, C_100398_amm var4) {
      if(var4 != null && !var4.func_102927_r()) {
         if(this.field_109553_N) {
            var4.field_102938_l = var1;
            var4.field_102939_m = var2;
            var4.field_102936_n = var3;
            this.field_109566_a.add(var4);
         } else {
            this.field_109561_g.add(var4);
            C_101272_za var5 = this.func_109440_e(var1 >> 4, var3 >> 4);
            if(var5 != null) {
               var5.func_112333_a(var1 & 15, var2, var3 & 15, var4);
            }
         }
      }

   }

   public void func_109498_q(int var1, int var2, int var3) {
      C_100398_amm var4 = this.func_109353_p(var1, var2, var3);
      if(var4 != null && this.field_109553_N) {
         var4.func_102920_w_();
         this.field_109566_a.remove(var4);
      } else {
         if(var4 != null) {
            this.field_109566_a.remove(var4);
            this.field_109561_g.remove(var4);
         }

         C_101272_za var5 = this.func_109440_e(var1 >> 4, var3 >> 4);
         if(var5 != null) {
            var5.func_112326_f(var1 & 15, var2, var3 & 15);
         }
      }

   }

   public void func_109528_a(C_100398_amm var1) {
      this.field_109564_b.add(var1);
   }

   public boolean func_109356_r(int var1, int var2, int var3) {
      C_100451_alf var4 = C_100451_alf.field_106118_p[this.func_109349_a(var1, var2, var3)];
      return var4 == null?false:var4.func_105994_c();
   }

   public boolean func_109360_s(int var1, int var2, int var3) {
      return C_100451_alf.func_106066_i(this.func_109349_a(var1, var2, var3));
   }

   public boolean func_109348_t(int var1, int var2, int var3) {
      C_100451_alf var4 = C_100451_alf.field_106118_p[this.func_109349_a(var1, var2, var3)];
      return var4 == null?false:(var4.field_106204_cB.func_108980_k() && var4.func_105977_b()?true:(var4 instanceof C_100463_akw?(this.func_109357_g(var1, var2, var3) & 4) == 4:(var4 instanceof C_100169_aja?(this.func_109357_g(var1, var2, var3) & 8) == 8:false)));
   }

   public boolean func_109447_b(int var1, int var2, int var3, boolean var4) {
      if(var1 >= -30000000 && var3 >= -30000000 && var1 < 30000000 && var3 < 30000000) {
         C_101272_za var5 = this.field_109585_x.func_108657_d(var1 >> 4, var3 >> 4);
         if(var5 != null && !var5.func_112320_g()) {
            C_100451_alf var6 = C_100451_alf.field_106118_p[this.func_109349_a(var1, var2, var3)];
            return var6 == null?false:var6.field_106204_cB.func_108980_k() && var6.func_105977_b();
         } else {
            return var4;
         }
      } else {
         return var4;
      }
   }

   public void func_109481_w() {
      int var1 = this.func_109530_a(1.0F);
      if(var1 != this.field_109571_j) {
         this.field_109571_j = var1;
      }

   }

   public void func_109452_a(boolean var1, boolean var2) {
      this.field_109546_F = var1;
      this.field_109547_G = var2;
   }

   public void func_109397_b() {
      this.func_109491_n();
   }

   private void func_109510_a() {
      if(this.field_109583_z.func_107142_p()) {
         this.field_109567_n = 1.0F;
         if(this.field_109583_z.func_107150_n()) {
            this.field_109582_p = 1.0F;
         }
      }

   }

   protected void func_109491_n() {
      if(!this.field_109576_v.field_112394_f) {
         if(this.field_109581_q > 0) {
            --this.field_109581_q;
         }

         int var1 = this.field_109583_z.func_107159_o();
         if(var1 <= 0) {
            if(this.field_109583_z.func_107150_n()) {
               this.field_109583_z.func_107160_f(this.field_109577_u.nextInt(12000) + 3600);
            } else {
               this.field_109583_z.func_107160_f(this.field_109577_u.nextInt(168000) + 12000);
            }
         } else {
            --var1;
            this.field_109583_z.func_107160_f(var1);
            if(var1 <= 0) {
               this.field_109583_z.func_107138_a(!this.field_109583_z.func_107150_n());
            }
         }

         int var2 = this.field_109583_z.func_107162_q();
         if(var2 <= 0) {
            if(this.field_109583_z.func_107142_p()) {
               this.field_109583_z.func_107153_g(this.field_109577_u.nextInt(12000) + 12000);
            } else {
               this.field_109583_z.func_107153_g(this.field_109577_u.nextInt(168000) + 12000);
            }
         } else {
            --var2;
            this.field_109583_z.func_107153_g(var2);
            if(var2 <= 0) {
               this.field_109583_z.func_107155_b(!this.field_109583_z.func_107142_p());
            }
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

   public void func_109471_x() {
      this.field_109583_z.func_107153_g(1);
   }

   protected void func_109533_y() {
      this.field_109555_H.clear();
      this.field_109545_E.func_108901_a("buildList");

      int var1;
      C_101095_qg var2;
      int var3;
      int var4;
      for(var1 = 0; var1 < this.field_109573_h.size(); ++var1) {
         var2 = (C_101095_qg)this.field_109573_h.get(var1);
         var3 = C_100650_jv.func_108910_c(var2.field_103221_t / 16.0D);
         var4 = C_100650_jv.func_108910_c(var2.field_103217_v / 16.0D);
         byte var5 = 7;

         for(int var6 = -var5; var6 <= var5; ++var6) {
            for(int var7 = -var5; var7 <= var5; ++var7) {
               this.field_109555_H.add(new C_100858_wx(var6 + var3, var7 + var4));
            }
         }
      }

      this.field_109545_E.func_108900_b();
      if(this.field_109554_O > 0) {
         --this.field_109554_O;
      }

      this.field_109545_E.func_108901_a("playerCheckLight");
      if(!this.field_109573_h.isEmpty()) {
         var1 = this.field_109577_u.nextInt(this.field_109573_h.size());
         var2 = (C_101095_qg)this.field_109573_h.get(var1);
         var3 = C_100650_jv.func_108910_c(var2.field_103221_t) + this.field_109577_u.nextInt(11) - 5;
         var4 = C_100650_jv.func_108910_c(var2.field_103219_u) + this.field_109577_u.nextInt(11) - 5;
         int var8 = C_100650_jv.func_108910_c(var2.field_103217_v) + this.field_109577_u.nextInt(11) - 5;
         this.func_109532_x(var3, var4, var8);
      }

      this.field_109545_E.func_108900_b();
   }

   protected void func_109458_a(int var1, int var2, C_101272_za var3) {
      this.field_109545_E.func_108899_c("moodSound");
      if(this.field_109554_O == 0 && !this.field_109557_J) {
         this.field_109572_k = this.field_109572_k * 3 + 1013904223;
         int var4 = this.field_109572_k >> 2;
         int var5 = var4 & 15;
         int var6 = var4 >> 8 & 15;
         int var7 = var4 >> 16 & 127;
         int var8 = var3.func_112312_a(var5, var7, var6);
         var5 += var1;
         var6 += var2;
         if(var8 == 0 && this.func_109445_k(var5, var7, var6) <= this.field_109577_u.nextInt(8) && this.func_109375_b(C_100847_xq.field_110168_a, var5, var7, var6) <= 0) {
            C_101095_qg var9 = this.func_109504_a((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D, 8.0D);
            if(var9 != null && var9.func_103146_e((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D) > 4.0D) {
               this.func_109476_a((double)var5 + 0.5D, (double)var7 + 0.5D, (double)var6 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.field_109577_u.nextFloat() * 0.2F);
               this.field_109554_O = this.field_109577_u.nextInt(12000) + 6000;
            }
         }
      }

      this.field_109545_E.func_108899_c("checkLight");
      var3.func_112293_o();
   }

   protected void func_109454_g() {
      this.func_109533_y();
   }

   public boolean func_109446_u(int var1, int var2, int var3) {
      return this.func_109396_c(var1, var2, var3, false);
   }

   public boolean func_109408_v(int var1, int var2, int var3) {
      return this.func_109396_c(var1, var2, var3, true);
   }

   public boolean func_109396_c(int var1, int var2, int var3, boolean var4) {
      C_101324_xz var5 = this.func_109362_a(var1, var3);
      float var6 = var5.func_112465_j();
      if(var6 > 0.15F) {
         return false;
      } else {
         if(var2 >= 0 && var2 < 256 && this.func_109375_b(C_100847_xq.field_110166_b, var1, var2, var3) < 10) {
            int var7 = this.func_109349_a(var1, var2, var3);
            if((var7 == C_100451_alf.field_106072_E.field_106162_cm || var7 == C_100451_alf.field_106071_D.field_106162_cm) && this.func_109357_g(var1, var2, var3) == 0) {
               if(!var4) {
                  return true;
               }

               boolean var8 = true;
               if(var8 && this.func_109350_f(var1 - 1, var2, var3) != C_100664_afg.field_109019_h) {
                  var8 = false;
               }

               if(var8 && this.func_109350_f(var1 + 1, var2, var3) != C_100664_afg.field_109019_h) {
                  var8 = false;
               }

               if(var8 && this.func_109350_f(var1, var2, var3 - 1) != C_100664_afg.field_109019_h) {
                  var8 = false;
               }

               if(var8 && this.func_109350_f(var1, var2, var3 + 1) != C_100664_afg.field_109019_h) {
                  var8 = false;
               }

               if(!var8) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean func_109421_w(int var1, int var2, int var3) {
      C_101324_xz var4 = this.func_109362_a(var1, var3);
      float var5 = var4.func_112465_j();
      if(var5 > 0.15F) {
         return false;
      } else {
         if(var2 >= 0 && var2 < 256 && this.func_109375_b(C_100847_xq.field_110166_b, var1, var2, var3) < 10) {
            int var6 = this.func_109349_a(var1, var2 - 1, var3);
            int var7 = this.func_109349_a(var1, var2, var3);
            if(var7 == 0 && C_100451_alf.field_106181_aV.func_106023_b(this, var1, var2, var3) && var6 != 0 && var6 != C_100451_alf.field_106184_aW.field_106162_cm && C_100451_alf.field_106118_p[var6].field_106204_cB.func_108992_c()) {
               return true;
            }
         }

         return false;
      }
   }

   public void func_109532_x(int var1, int var2, int var3) {
      if(!this.field_109576_v.field_112394_f) {
         this.func_109505_c(C_100847_xq.field_110168_a, var1, var2, var3);
      }

      this.func_109505_c(C_100847_xq.field_110166_b, var1, var2, var3);
   }

   private int func_109540_b(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      if(this.func_109502_j(var2, var3, var4)) {
         var7 = 15;
      } else {
         if(var6 == 0) {
            var6 = 1;
         }

         int var8 = this.func_109375_b(C_100847_xq.field_110168_a, var2 - 1, var3, var4) - var6;
         int var9 = this.func_109375_b(C_100847_xq.field_110168_a, var2 + 1, var3, var4) - var6;
         int var10 = this.func_109375_b(C_100847_xq.field_110168_a, var2, var3 - 1, var4) - var6;
         int var11 = this.func_109375_b(C_100847_xq.field_110168_a, var2, var3 + 1, var4) - var6;
         int var12 = this.func_109375_b(C_100847_xq.field_110168_a, var2, var3, var4 - 1) - var6;
         int var13 = this.func_109375_b(C_100847_xq.field_110168_a, var2, var3, var4 + 1) - var6;
         if(var8 > var7) {
            var7 = var8;
         }

         if(var9 > var7) {
            var7 = var9;
         }

         if(var10 > var7) {
            var7 = var10;
         }

         if(var11 > var7) {
            var7 = var11;
         }

         if(var12 > var7) {
            var7 = var12;
         }

         if(var13 > var7) {
            var7 = var13;
         }
      }

      return var7;
   }

   private int func_109527_g(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = C_100451_alf.field_106114_t[var5];
      int var8 = this.func_109375_b(C_100847_xq.field_110166_b, var2 - 1, var3, var4) - var6;
      int var9 = this.func_109375_b(C_100847_xq.field_110166_b, var2 + 1, var3, var4) - var6;
      int var10 = this.func_109375_b(C_100847_xq.field_110166_b, var2, var3 - 1, var4) - var6;
      int var11 = this.func_109375_b(C_100847_xq.field_110166_b, var2, var3 + 1, var4) - var6;
      int var12 = this.func_109375_b(C_100847_xq.field_110166_b, var2, var3, var4 - 1) - var6;
      int var13 = this.func_109375_b(C_100847_xq.field_110166_b, var2, var3, var4 + 1) - var6;
      if(var8 > var7) {
         var7 = var8;
      }

      if(var9 > var7) {
         var7 = var9;
      }

      if(var10 > var7) {
         var7 = var10;
      }

      if(var11 > var7) {
         var7 = var11;
      }

      if(var12 > var7) {
         var7 = var12;
      }

      if(var13 > var7) {
         var7 = var13;
      }

      return var7;
   }

   public void func_109505_c(C_100847_xq var1, int var2, int var3, int var4) {
      if(this.func_109432_a(var2, var3, var4, 17)) {
         int var5 = 0;
         int var6 = 0;
         this.field_109545_E.func_108901_a("getBrightness");
         int var7 = this.func_109375_b(var1, var2, var3, var4);
         boolean var8 = false;
         int var9 = this.func_109349_a(var2, var3, var4);
         int var10 = this.func_109516_b(var2, var3, var4);
         if(var10 == 0) {
            var10 = 1;
         }

         boolean var11 = false;
         int var24;
         if(var1 == C_100847_xq.field_110168_a) {
            var24 = this.func_109540_b(var7, var2, var3, var4, var9, var10);
         } else {
            var24 = this.func_109527_g(var7, var2, var3, var4, var9, var10);
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int var17;
         int var16;
         int var19;
         int var18;
         if(var24 > var7) {
            this.field_109556_I[var6++] = 133152;
         } else if(var24 < var7) {
            if(var1 != C_100847_xq.field_110166_b) {
               ;
            }

            this.field_109556_I[var6++] = 133152 + (var7 << 18);

            while(var5 < var6) {
               var9 = this.field_109556_I[var5++];
               var10 = (var9 & 63) - 32 + var2;
               var24 = (var9 >> 6 & 63) - 32 + var3;
               var12 = (var9 >> 12 & 63) - 32 + var4;
               var13 = var9 >> 18 & 15;
               var14 = this.func_109375_b(var1, var10, var24, var12);
               if(var14 == var13) {
                  this.func_109444_b(var1, var10, var24, var12, 0);
                  if(var13 > 0) {
                     var15 = var10 - var2;
                     var16 = var24 - var3;
                     var17 = var12 - var4;
                     if(var15 < 0) {
                        var15 = -var15;
                     }

                     if(var16 < 0) {
                        var16 = -var16;
                     }

                     if(var17 < 0) {
                        var17 = -var17;
                     }

                     if(var15 + var16 + var17 < 17) {
                        for(var18 = 0; var18 < 6; ++var18) {
                           var19 = var18 % 2 * 2 - 1;
                           int var20 = var10 + var18 / 2 % 3 / 2 * var19;
                           int var21 = var24 + (var18 / 2 + 1) % 3 / 2 * var19;
                           int var22 = var12 + (var18 / 2 + 2) % 3 / 2 * var19;
                           var14 = this.func_109375_b(var1, var20, var21, var22);
                           int var23 = C_100451_alf.field_106116_r[this.func_109349_a(var20, var21, var22)];
                           if(var23 == 0) {
                              var23 = 1;
                           }

                           if(var14 == var13 - var23 && var6 < this.field_109556_I.length) {
                              this.field_109556_I[var6++] = var20 - var2 + 32 + (var21 - var3 + 32 << 6) + (var22 - var4 + 32 << 12) + (var13 - var23 << 18);
                           }
                        }
                     }
                  }
               }
            }

            var5 = 0;
         }

         this.field_109545_E.func_108900_b();
         this.field_109545_E.func_108901_a("checkedPosition < toCheckCount");

         while(var5 < var6) {
            var9 = this.field_109556_I[var5++];
            var10 = (var9 & 63) - 32 + var2;
            var24 = (var9 >> 6 & 63) - 32 + var3;
            var12 = (var9 >> 12 & 63) - 32 + var4;
            var13 = this.func_109375_b(var1, var10, var24, var12);
            var14 = this.func_109349_a(var10, var24, var12);
            var15 = C_100451_alf.field_106116_r[var14];
            if(var15 == 0) {
               var15 = 1;
            }

            boolean var25 = false;
            if(var1 == C_100847_xq.field_110168_a) {
               var16 = this.func_109540_b(var13, var10, var24, var12, var14, var15);
            } else {
               var16 = this.func_109527_g(var13, var10, var24, var12, var14, var15);
            }

            if(var16 != var13) {
               this.func_109444_b(var1, var10, var24, var12, var16);
               if(var16 > var13) {
                  var17 = var10 - var2;
                  var18 = var24 - var3;
                  var19 = var12 - var4;
                  if(var17 < 0) {
                     var17 = -var17;
                  }

                  if(var18 < 0) {
                     var18 = -var18;
                  }

                  if(var19 < 0) {
                     var19 = -var19;
                  }

                  if(var17 + var18 + var19 < 17 && var6 < this.field_109556_I.length - 6) {
                     if(this.func_109375_b(var1, var10 - 1, var24, var12) < var16) {
                        this.field_109556_I[var6++] = var10 - 1 - var2 + 32 + (var24 - var3 + 32 << 6) + (var12 - var4 + 32 << 12);
                     }

                     if(this.func_109375_b(var1, var10 + 1, var24, var12) < var16) {
                        this.field_109556_I[var6++] = var10 + 1 - var2 + 32 + (var24 - var3 + 32 << 6) + (var12 - var4 + 32 << 12);
                     }

                     if(this.func_109375_b(var1, var10, var24 - 1, var12) < var16) {
                        this.field_109556_I[var6++] = var10 - var2 + 32 + (var24 - 1 - var3 + 32 << 6) + (var12 - var4 + 32 << 12);
                     }

                     if(this.func_109375_b(var1, var10, var24 + 1, var12) < var16) {
                        this.field_109556_I[var6++] = var10 - var2 + 32 + (var24 + 1 - var3 + 32 << 6) + (var12 - var4 + 32 << 12);
                     }

                     if(this.func_109375_b(var1, var10, var24, var12 - 1) < var16) {
                        this.field_109556_I[var6++] = var10 - var2 + 32 + (var24 - var3 + 32 << 6) + (var12 - 1 - var4 + 32 << 12);
                     }

                     if(this.func_109375_b(var1, var10, var24, var12 + 1) < var16) {
                        this.field_109556_I[var6++] = var10 - var2 + 32 + (var24 - var3 + 32 << 6) + (var12 + 1 - var4 + 32 << 12);
                     }
                  }
               }
            }
         }

         this.field_109545_E.func_108900_b();
      }
   }

   public boolean func_109519_a(boolean var1) {
      return false;
   }

   public List func_109450_a(C_101272_za var1, boolean var2) {
      return null;
   }

   public List func_109449_b(C_100730_lb var1, C_100412_amr var2) {
      this.field_109559_P.clear();
      int var3 = C_100650_jv.func_108910_c((var2.field_107917_a - 2.0D) / 16.0D);
      int var4 = C_100650_jv.func_108910_c((var2.field_107913_d + 2.0D) / 16.0D);
      int var5 = C_100650_jv.func_108910_c((var2.field_107916_c - 2.0D) / 16.0D);
      int var6 = C_100650_jv.func_108910_c((var2.field_107911_f + 2.0D) / 16.0D);

      for(int var7 = var3; var7 <= var4; ++var7) {
         for(int var8 = var5; var8 <= var6; ++var8) {
            if(this.func_109486_c(var7, var8)) {
               this.func_109440_e(var7, var8).func_112298_a(var1, var2, this.field_109559_P);
            }
         }
      }

      return this.field_109559_P;
   }

   public List func_109518_a(Class var1, C_100412_amr var2) {
      return this.func_109456_a(var1, var2, (C_100720_li)null);
   }

   public List func_109456_a(Class var1, C_100412_amr var2, C_100720_li var3) {
      int var4 = C_100650_jv.func_108910_c((var2.field_107917_a - 2.0D) / 16.0D);
      int var5 = C_100650_jv.func_108910_c((var2.field_107913_d + 2.0D) / 16.0D);
      int var6 = C_100650_jv.func_108910_c((var2.field_107916_c - 2.0D) / 16.0D);
      int var7 = C_100650_jv.func_108910_c((var2.field_107911_f + 2.0D) / 16.0D);
      ArrayList var8 = new ArrayList();

      for(int var9 = var4; var9 <= var5; ++var9) {
         for(int var10 = var6; var10 <= var7; ++var10) {
            if(this.func_109486_c(var9, var10)) {
               this.func_109440_e(var9, var10).func_112322_a(var1, var2, var8, var3);
            }
         }
      }

      return var8;
   }

   public C_100730_lb func_109406_a(Class var1, C_100412_amr var2, C_100730_lb var3) {
      List var4 = this.func_109518_a(var1, var2);
      C_100730_lb var5 = null;
      double var6 = Double.MAX_VALUE;
      Iterator var8 = var4.iterator();

      while(var8.hasNext()) {
         C_100730_lb var9 = (C_100730_lb)var8.next();
         if(var9 != var3) {
            double var10 = var3.func_103082_e(var9);
            if(var10 <= var6) {
               var5 = var9;
               var6 = var10;
            }
         }
      }

      return var5;
   }

   public abstract C_100730_lb func_109451_a(int var1);

   public List func_109392_z() {
      return this.field_109563_e;
   }

   public void func_109414_b(int var1, int var2, int var3, C_100398_amm var4) {
      if(this.func_109461_e(var1, var2, var3)) {
         this.func_109377_d(var1, var3).func_112329_e();
      }

   }

   public int func_109474_a(Class var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.field_109563_e.size(); ++var3) {
         C_100730_lb var4 = (C_100730_lb)this.field_109563_e.get(var3);
         if(var1.isAssignableFrom(var4.getClass())) {
            ++var2;
         }
      }

      return var2;
   }

   public void func_109427_a(List var1) {
      this.field_109563_e.addAll(var1);

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.func_109393_a((C_100730_lb)var1.get(var2));
      }

   }

   public void func_109387_b(List var1) {
      this.field_109560_f.addAll(var1);
   }

   public boolean func_109501_a(int var1, int var2, int var3, int var4, boolean var5, int var6, C_100730_lb var7) {
      int var8 = this.func_109349_a(var2, var3, var4);
      C_100451_alf var9 = C_100451_alf.field_106118_p[var8];
      C_100451_alf var10 = C_100451_alf.field_106118_p[var1];
      C_100412_amr var11 = var10.func_106021_e(this, var2, var3, var4);
      if(var5) {
         var11 = null;
      }

      if(var11 != null && !this.func_109490_a(var11, var7)) {
         return false;
      } else {
         if(var9 != null && (var9 == C_100451_alf.field_106071_D || var9 == C_100451_alf.field_106072_E || var9 == C_100451_alf.field_106073_F || var9 == C_100451_alf.field_106074_G || var9 == C_100451_alf.field_106222_au || var9.field_106204_cB.func_108984_j())) {
            var9 = null;
         }

         return var9 != null && var9.field_106204_cB == C_100664_afg.field_109027_q && var10 == C_100451_alf.field_106164_ck?true:var1 > 0 && var9 == null && var10.func_106038_b_(this, var2, var3, var4, var6);
      }
   }

   public C_100278_agj func_109487_a(C_100730_lb var1, C_100730_lb var2, float var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      this.field_109545_E.func_108901_a("pathfind");
      int var8 = C_100650_jv.func_108910_c(var1.field_103221_t);
      int var9 = C_100650_jv.func_108910_c(var1.field_103219_u + 1.0D);
      int var10 = C_100650_jv.func_108910_c(var1.field_103217_v);
      int var11 = (int)(var3 + 16.0F);
      int var12 = var8 - var11;
      int var13 = var9 - var11;
      int var14 = var10 - var11;
      int var15 = var8 + var11;
      int var16 = var9 + var11;
      int var17 = var10 + var11;
      C_100853_xt var18 = new C_100853_xt(this, var12, var13, var14, var15, var16, var17);
      C_100278_agj var19 = (new C_100280_agk(var18, var4, var5, var6, var7)).func_107251_a(var1, var2, var3);
      this.field_109545_E.func_108900_b();
      return var19;
   }

   public C_100278_agj func_109495_a(C_100730_lb var1, int var2, int var3, int var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      this.field_109545_E.func_108901_a("pathfind");
      int var10 = C_100650_jv.func_108910_c(var1.field_103221_t);
      int var11 = C_100650_jv.func_108910_c(var1.field_103219_u);
      int var12 = C_100650_jv.func_108910_c(var1.field_103217_v);
      int var13 = (int)(var5 + 8.0F);
      int var14 = var10 - var13;
      int var15 = var11 - var13;
      int var16 = var12 - var13;
      int var17 = var10 + var13;
      int var18 = var11 + var13;
      int var19 = var12 + var13;
      C_100853_xt var20 = new C_100853_xt(this, var14, var15, var16, var17, var18, var19);
      C_100278_agj var21 = (new C_100280_agk(var20, var6, var7, var8, var9)).func_107244_a(var1, var2, var3, var4, var5);
      this.field_109545_E.func_108900_b();
      return var21;
   }

   public boolean func_109359_k(int var1, int var2, int var3, int var4) {
      int var5 = this.func_109349_a(var1, var2, var3);
      return var5 == 0?false:C_100451_alf.field_106118_p[var5].func_105985_c(this, var1, var2, var3, var4);
   }

   public boolean func_109430_y(int var1, int var2, int var3) {
      return this.func_109359_k(var1, var2 - 1, var3, 0)?true:(this.func_109359_k(var1, var2 + 1, var3, 1)?true:(this.func_109359_k(var1, var2, var3 - 1, 2)?true:(this.func_109359_k(var1, var2, var3 + 1, 3)?true:(this.func_109359_k(var1 - 1, var2, var3, 4)?true:this.func_109359_k(var1 + 1, var2, var3, 5)))));
   }

   public boolean func_109437_l(int var1, int var2, int var3, int var4) {
      if(this.func_109360_s(var1, var2, var3)) {
         return this.func_109430_y(var1, var2, var3);
      } else {
         int var5 = this.func_109349_a(var1, var2, var3);
         return var5 == 0?false:C_100451_alf.field_106118_p[var5].func_106030_b(this, var1, var2, var3, var4);
      }
   }

   public boolean func_109425_z(int var1, int var2, int var3) {
      return this.func_109437_l(var1, var2 - 1, var3, 0)?true:(this.func_109437_l(var1, var2 + 1, var3, 1)?true:(this.func_109437_l(var1, var2, var3 - 1, 2)?true:(this.func_109437_l(var1, var2, var3 + 1, 3)?true:(this.func_109437_l(var1 - 1, var2, var3, 4)?true:this.func_109437_l(var1 + 1, var2, var3, 5)))));
   }

   public C_101095_qg func_109503_a(C_100730_lb var1, double var2) {
      return this.func_109504_a(var1.field_103221_t, var1.field_103219_u, var1.field_103217_v, var2);
   }

   public C_101095_qg func_109504_a(double var1, double var3, double var5, double var7) {
      double var9 = -1.0D;
      C_101095_qg var11 = null;

      for(int var12 = 0; var12 < this.field_109573_h.size(); ++var12) {
         C_101095_qg var13 = (C_101095_qg)this.field_109573_h.get(var12);
         double var14 = var13.func_103146_e(var1, var3, var5);
         if((var7 < 0.0D || var14 < var7 * var7) && (var9 == -1.0D || var14 < var9)) {
            var9 = var14;
            var11 = var13;
         }
      }

      return var11;
   }

   public C_101095_qg func_109455_b(C_100730_lb var1, double var2) {
      return this.func_109391_b(var1.field_103221_t, var1.field_103219_u, var1.field_103217_v, var2);
   }

   public C_101095_qg func_109391_b(double var1, double var3, double var5, double var7) {
      double var9 = -1.0D;
      C_101095_qg var11 = null;

      for(int var12 = 0; var12 < this.field_109573_h.size(); ++var12) {
         C_101095_qg var13 = (C_101095_qg)this.field_109573_h.get(var12);
         if(!var13.field_103869_cf.field_111601_a) {
            double var14 = var13.func_103146_e(var1, var3, var5);
            double var16 = var7;
            if(var13.func_103168_ah()) {
               var16 = var7 * 0.800000011920929D;
            }

            if(var13.func_103164_aj()) {
               float var18 = var13.func_103814_bO();
               if(var18 < 0.1F) {
                  var18 = 0.1F;
               }

               var16 *= (double)(0.7F * var18);
            }

            if((var7 < 0.0D || var14 < var16 * var16) && (var9 == -1.0D || var14 < var9)) {
               var9 = var14;
               var11 = var13;
            }
         }
      }

      return var11;
   }

   public C_101095_qg func_109507_a(String var1) {
      for(int var2 = 0; var2 < this.field_109573_h.size(); ++var2) {
         if(var1.equals(((C_101095_qg)this.field_109573_h.get(var2)).field_103847_bT)) {
            return (C_101095_qg)this.field_109573_h.get(var2);
         }
      }

      return null;
   }

   public void func_109472_B() {}

   public void func_109485_C() {
      this.field_109584_y.func_107092_c();
   }

   public void func_109484_a(long var1) {
      this.field_109583_z.func_107137_b(var1);
   }

   public long func_109374_D() {
      return this.field_109583_z.func_107133_b();
   }

   public long func_109463_E() {
      return this.field_109583_z.func_107144_f();
   }

   public long func_109433_F() {
      return this.field_109583_z.func_107166_g();
   }

   public void func_109436_b(long var1) {
      this.field_109583_z.func_107136_c(var1);
   }

   public C_100013_k func_109381_G() {
      return new C_100013_k(this.field_109583_z.func_107152_c(), this.field_109583_z.func_107147_d(), this.field_109583_z.func_107146_e());
   }

   public void func_109514_A(int var1, int var2, int var3) {
      this.field_109583_z.func_107154_a(var1, var2, var3);
   }

   public void func_109395_h(C_100730_lb var1) {
      int var2 = C_100650_jv.func_108910_c(var1.field_103221_t / 16.0D);
      int var3 = C_100650_jv.func_108910_c(var1.field_103217_v / 16.0D);
      byte var4 = 2;

      for(int var5 = var2 - var4; var5 <= var2 + var4; ++var5) {
         for(int var6 = var3 - var4; var6 <= var3 + var4; ++var6) {
            this.func_109440_e(var5, var6);
         }
      }

      if(!this.field_109563_e.contains(var1)) {
         this.field_109563_e.add(var1);
      }

   }

   public boolean func_109542_a(C_101095_qg var1, int var2, int var3, int var4) {
      return true;
   }

   public void func_109464_a(C_100730_lb var1, byte var2) {}

   public C_101331_yx func_109479_H() {
      return this.field_109585_x;
   }

   public void func_109467_c(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var4 > 0) {
         C_100451_alf.field_106118_p[var4].func_105980_b(this, var1, var2, var3, var5, var6);
      }

   }

   public C_100268_agw func_109509_I() {
      return this.field_109584_y;
   }

   public C_100269_agv func_109429_J() {
      return this.field_109583_z;
   }

   public C_100864_xb func_109389_K() {
      return this.field_109583_z.func_107141_x();
   }

   public void func_109416_c() {}

   public float func_109373_i(float var1) {
      return (this.field_109568_o + (this.field_109582_p - this.field_109568_o) * var1) * this.func_109426_j(var1);
   }

   public float func_109426_j(float var1) {
      return this.field_109570_m + (this.field_109567_n - this.field_109570_m) * var1;
   }

   public void func_109457_k(float var1) {
      this.field_109570_m = var1;
      this.field_109567_n = var1;
   }

   public boolean func_109473_L() {
      return (double)this.func_109373_i(1.0F) > 0.9D;
   }

   public boolean func_109531_M() {
      return (double)this.func_109426_j(1.0F) > 0.2D;
   }

   public boolean func_109515_B(int var1, int var2, int var3) {
      if(!this.func_109531_M()) {
         return false;
      } else if(!this.func_109502_j(var1, var2, var3)) {
         return false;
      } else if(this.func_109380_h(var1, var3) > var2) {
         return false;
      } else {
         C_101324_xz var4 = this.func_109362_a(var1, var3);
         return var4.func_112468_c()?false:var4.func_112462_d();
      }
   }

   public boolean func_109524_C(int var1, int var2, int var3) {
      C_101324_xz var4 = this.func_109362_a(var1, var3);
      return var4.func_112459_e();
   }

   public void func_109468_a(String var1, C_100304_ago var2) {
      this.field_109549_B.func_107073_a(var1, var2);
   }

   public C_100304_ago func_109520_a(Class var1, String var2) {
      return this.field_109549_B.func_107070_a(var1, var2);
   }

   public int func_109400_b(String var1) {
      return this.field_109549_B.func_107069_a(var1);
   }

   public void func_109493_e(int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < this.field_109575_w.size(); ++var6) {
         ((C_100831_xk)this.field_109575_w.get(var6)).func_109701_a(var1, var2, var3, var4, var5);
      }

   }

   public void func_109448_f(int var1, int var2, int var3, int var4, int var5) {
      this.func_109492_a((C_101095_qg)null, var1, var2, var3, var4, var5);
   }

   public void func_109492_a(C_101095_qg var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.field_109575_w.size(); ++var7) {
         ((C_100831_xk)this.field_109575_w.get(var7)).func_109700_a(var1, var2, var3, var4, var5, var6);
      }

   }

   public int func_109361_N() {
      return 256;
   }

   public int func_109475_O() {
      return this.field_109576_v.field_112394_f?128:256;
   }

   public C_100195_gh func_109385_a(C_100590_ph var1) {
      return null;
   }

   public Random func_109401_D(int var1, int var2, int var3) {
      long var4 = (long)var1 * 341873128712L + (long)var2 * 132897987541L + this.func_109429_J().func_107133_b() + (long)var3;
      this.field_109577_u.setSeed(var4);
      return this.field_109577_u;
   }

   public C_100851_xw func_109517_b(String var1, int var2, int var3, int var4) {
      return this.func_109479_H().func_108663_a(this, var1, var2, var3, var4);
   }

   public boolean func_109351_P() {
      return false;
   }

   public double func_109384_Q() {
      return this.field_109583_z.func_107143_u() == C_100845_xp.field_110159_c?0.0D:63.0D;
   }

   public C_100007_a func_109483_a(C_100007_a var1) {
      var1.func_105182_a("World " + this.field_109583_z.func_107131_k() + " Entities", new C_100871_xf(this));
      var1.func_105182_a("World " + this.field_109583_z.func_107131_k() + " Players", new C_100869_xg(this));
      var1.func_105182_a("World " + this.field_109583_z.func_107131_k() + " Chunk Stats", new C_100833_xh(this));
      return var1;
   }

   public void func_109420_g(int var1, int var2, int var3, int var4, int var5) {
      Iterator var6 = this.field_109575_w.iterator();

      while(var6.hasNext()) {
         C_100831_xk var7 = (C_100831_xk)var6.next();
         var7.func_109706_b(var1, var2, var3, var4, var5);
      }

   }

   public C_100393_amx func_109363_R() {
      return this.field_109558_K;
   }

   public Calendar func_109388_S() {
      this.field_109551_L.setTimeInMillis(System.currentTimeMillis());
      return this.field_109551_L;
   }
}
