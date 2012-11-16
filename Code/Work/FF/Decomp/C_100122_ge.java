import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import net.minecraft.p_101443_server.C_101445_MinecraftServer;

public abstract class C_100122_ge {

   private static final SimpleDateFormat field_105742_e = new SimpleDateFormat("yyyy-MM-dd \'at\' HH:mm:ss z");
   public static final Logger field_105745_a = Logger.getLogger("Minecraft");
   private final C_101445_MinecraftServer field_105739_f;
   public final List field_105743_b = new ArrayList();
   private final C_100141_ff field_105740_g = new C_100141_ff(new File("banned-players.txt"));
   private final C_100141_ff field_105752_h = new C_100141_ff(new File("banned-ips.txt"));
   private Set field_105753_i = new HashSet();
   private Set field_105750_j = new HashSet();
   private C_100243_ahj field_105751_k;
   private boolean field_105748_l;
   protected int field_105744_c;
   protected int field_105741_d;
   private C_100836_xn field_105749_m;
   private boolean field_105746_n;
   private int field_105747_o = 0;


   public C_100122_ge(C_101445_MinecraftServer var1) {
      this.field_105739_f = var1;
      this.field_105740_g.func_106507_a(false);
      this.field_105752_h.func_106507_a(false);
      this.field_105744_c = 8;
   }

   public void func_105738_a(C_100323_bv var1, C_100762_ih var2) {
      this.func_105695_a(var2);
      var2.func_103094_a(this.field_105739_f.func_104879_a(var2.field_103224_ap));
      var2.field_104517_c.func_109802_a((C_100765_ie)var2.field_103229_p);
      String var3 = "local";
      if(var1.func_107420_c() != null) {
         var3 = var1.func_107420_c().toString();
      }

      field_105745_a.info(var2.field_103847_bT + "[" + var3 + "] logged in with entity id " + var2.field_103212_k + " at (" + var2.field_103221_t + ", " + var2.field_103219_u + ", " + var2.field_103217_v + ")");
      C_100765_ie var4 = this.field_105739_f.func_104879_a(var2.field_103224_ap);
      C_100013_k var5 = var4.func_109381_G();
      this.func_105697_a(var2, (C_100762_ih)null, var4);
      C_100801_im var6 = new C_100801_im(this.field_105739_f, var1, var2);
      var6.func_107009_b(new C_100252_do(var2.field_103212_k, var4.func_109429_J().func_107143_u(), var2.field_104517_c.func_109797_b(), var4.func_109429_J().func_107145_t(), var4.field_109576_v.field_112401_h, var4.field_109578_t, var4.func_109361_N(), this.func_105691_l()));
      var6.func_107009_b(new C_100307_er(var5.field_105273_a, var5.field_105271_b, var5.field_105272_c));
      var6.func_107009_b(new C_100223_dz(var2.field_103869_cf));
      this.func_105711_b(var2, var4);
      this.func_105733_a(new C_100392_cm("§e" + var2.field_103847_bT + " joined the game."));
      this.func_105702_c(var2);
      var6.func_107013_a(var2.field_103221_t, var2.field_103219_u, var2.field_103217_v, var2.field_103236_z, var2.field_103177_A);
      this.field_105739_f.func_104898_ae().func_105772_a(var6);
      var6.func_107009_b(new C_100305_es(var4.func_109463_E(), var4.func_109433_F()));
      if(this.field_105739_f.func_104874_Q().length() > 0) {
         var2.func_104501_a(this.field_105739_f.func_104874_Q(), this.field_105739_f.func_104937_S());
      }

      Iterator var7 = var2.func_103291_bw().iterator();

      while(var7.hasNext()) {
         C_100692_kx var8 = (C_100692_kx)var7.next();
         var6.func_107009_b(new C_100276_fb(var2.field_103212_k, var8));
      }

      var2.func_104508_d_();
   }

   public void func_105720_a(C_100765_ie[] var1) {
      this.field_105751_k = var1[0].func_109509_I().func_107093_e();
   }

   public void func_105701_a(C_100762_ih var1, C_100765_ie var2) {
      C_100765_ie var3 = var1.func_104506_p();
      if(var2 != null) {
         var2.func_109602_r().func_109678_c(var1);
      }

      var3.func_109602_r().func_109673_a(var1);
      var3.field_109620_b.func_108660_c((int)var1.field_103221_t >> 4, (int)var1.field_103217_v >> 4);
   }

   public int func_105724_a() {
      return C_100759_ib.func_109672_a(this.func_105715_o());
   }

   public void func_105695_a(C_100762_ih var1) {
      C_100353_bh var2 = this.field_105739_f.field_104986_c[0].func_109429_J().func_107140_i();
      if(var1.func_102909_c_().equals(this.field_105739_f.func_104919_H()) && var2 != null) {
         var1.func_103077_e(var2);
      } else {
         this.field_105751_k.func_107097_b(var1);
      }

   }

   protected void func_105729_b(C_100762_ih var1) {
      this.field_105751_k.func_107096_a(var1);
   }

   public void func_105702_c(C_100762_ih var1) {
      this.func_105733_a(new C_100233_ec(var1.field_103847_bT, true, 1000));
      this.field_105743_b.add(var1);
      C_100765_ie var2 = this.field_105739_f.func_104879_a(var1.field_103224_ap);

      while(!var2.func_109508_a(var1, var1.field_103173_D).isEmpty()) {
         var1.func_103163_b(var1.field_103221_t, var1.field_103219_u + 1.0D, var1.field_103217_v);
      }

      var2.func_109513_d(var1);
      this.func_105701_a(var1, (C_100765_ie)null);
      Iterator var3 = this.field_105743_b.iterator();

      while(var3.hasNext()) {
         C_100762_ih var4 = (C_100762_ih)var3.next();
         var1.field_104518_a.func_107009_b(new C_100233_ec(var4.field_103847_bT, true, var4.field_104524_i));
      }

   }

   public void func_105734_d(C_100762_ih var1) {
      var1.func_104506_p().func_109602_r().func_109676_d(var1);
   }

   public void func_105698_e(C_100762_ih var1) {
      this.func_105729_b(var1);
      C_100765_ie var2 = var1.func_104506_p();
      var2.func_109383_e(var1);
      var2.func_109602_r().func_109678_c(var1);
      this.field_105743_b.remove(var1);
      this.func_105733_a(new C_100233_ec(var1.field_103847_bT, false, 9999));
   }

   public String func_105718_a(SocketAddress var1, String var2) {
      if(this.field_105740_g.func_106504_a(var2)) {
         C_100275_fe var6 = (C_100275_fe)this.field_105740_g.func_106511_c().get(var2);
         String var7 = "You are banned from this server!\nReason: " + var6.func_107216_f();
         if(var6.func_107209_d() != null) {
            var7 = var7 + "\nYour ban will be removed on " + field_105742_e.format(var6.func_107209_d());
         }

         return var7;
      } else if(!this.func_105700_d(var2)) {
         return "You are not white-listed on this server!";
      } else {
         String var3 = var1.toString();
         var3 = var3.substring(var3.indexOf("/") + 1);
         var3 = var3.substring(0, var3.indexOf(":"));
         if(this.field_105752_h.func_106504_a(var3)) {
            C_100275_fe var4 = (C_100275_fe)this.field_105752_h.func_106511_c().get(var3);
            String var5 = "Your IP address is banned from this server!\nReason: " + var4.func_107216_f();
            if(var4.func_107209_d() != null) {
               var5 = var5 + "\nYour ban will be removed on " + field_105742_e.format(var4.func_107209_d());
            }

            return var5;
         } else {
            return this.field_105743_b.size() >= this.field_105744_c?"The server is full!":null;
         }
      }
   }

   public C_100762_ih func_105707_a(String var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.field_105743_b.iterator();

      C_100762_ih var4;
      while(var3.hasNext()) {
         var4 = (C_100762_ih)var3.next();
         if(var4.field_103847_bT.equalsIgnoreCase(var1)) {
            var2.add(var4);
         }
      }

      var3 = var2.iterator();

      while(var3.hasNext()) {
         var4 = (C_100762_ih)var3.next();
         var4.field_104518_a.func_107010_c("You logged in from another location");
      }

      Object var5;
      if(this.field_105739_f.func_104955_M()) {
         var5 = new C_100772_hx(this.field_105739_f.func_104879_a(0));
      } else {
         var5 = new C_100793_ii(this.field_105739_f.func_104879_a(0));
      }

      return new C_100762_ih(this.field_105739_f, this.field_105739_f.func_104879_a(0), var1, (C_100793_ii)var5);
   }

   public C_100762_ih func_105689_a(C_100762_ih var1, int var2, boolean var3) {
      var1.func_104506_p().func_109617_p().func_109785_a(var1);
      var1.func_104506_p().func_109617_p().func_109784_b(var1);
      var1.func_104506_p().func_109602_r().func_109678_c(var1);
      this.field_105743_b.remove(var1);
      this.field_105739_f.func_104879_a(var1.field_103224_ap).func_109431_f(var1);
      C_100013_k var4 = var1.func_103802_bW();
      boolean var5 = var1.func_103817_bX();
      var1.field_103224_ap = var2;
      Object var6;
      if(this.field_105739_f.func_104955_M()) {
         var6 = new C_100772_hx(this.field_105739_f.func_104879_a(var1.field_103224_ap));
      } else {
         var6 = new C_100793_ii(this.field_105739_f.func_104879_a(var1.field_103224_ap));
      }

      C_100762_ih var7 = new C_100762_ih(this.field_105739_f, this.field_105739_f.func_104879_a(var1.field_103224_ap), var1.field_103847_bT, (C_100793_ii)var6);
      var7.field_104518_a = var1.field_104518_a;
      var7.func_103760_a(var1, var3);
      var7.field_103212_k = var1.field_103212_k;
      C_100765_ie var8 = this.field_105739_f.func_104879_a(var1.field_103224_ap);
      this.func_105697_a(var7, var1, var8);
      C_100013_k var9;
      if(var4 != null) {
         var9 = C_101095_qg.func_103809_a(this.field_105739_f.func_104879_a(var1.field_103224_ap), var4, var5);
         if(var9 != null) {
            var7.func_103055_b((double)((float)var9.field_105273_a + 0.5F), (double)((float)var9.field_105271_b + 0.1F), (double)((float)var9.field_105272_c + 0.5F), 0.0F, 0.0F);
            var7.func_103831_a(var4, var5);
         } else {
            var7.field_104518_a.func_107009_b(new C_100240_df(0, 0));
         }
      }

      var8.field_109620_b.func_108660_c((int)var7.field_103221_t >> 4, (int)var7.field_103217_v >> 4);

      while(!var8.func_109508_a(var7, var7.field_103173_D).isEmpty()) {
         var7.func_103163_b(var7.field_103221_t, var7.field_103219_u + 1.0D, var7.field_103217_v);
      }

      var7.field_104518_a.func_107009_b(new C_100281_eg(var7.field_103224_ap, (byte)var7.field_103229_p.field_109578_t, var7.field_103229_p.func_109429_J().func_107143_u(), var7.field_103229_p.func_109361_N(), var7.field_104517_c.func_109797_b()));
      var9 = var8.func_109381_G();
      var7.field_104518_a.func_107013_a(var7.field_103221_t, var7.field_103219_u, var7.field_103217_v, var7.field_103236_z, var7.field_103177_A);
      var7.field_104518_a.func_107009_b(new C_100307_er(var9.field_105273_a, var9.field_105271_b, var9.field_105272_c));
      var7.field_104518_a.func_107009_b(new C_100297_eo(var7.field_103864_ci, var7.field_103867_ch, var7.field_103866_cg));
      this.func_105711_b(var7, var8);
      var8.func_109602_r().func_109673_a(var7);
      var8.func_109513_d(var7);
      this.field_105743_b.add(var7);
      var7.func_104508_d_();
      return var7;
   }

   public void func_105716_a(C_100762_ih var1, int var2) {
      int var3 = var1.field_103224_ap;
      C_100765_ie var4 = this.field_105739_f.func_104879_a(var1.field_103224_ap);
      var1.field_103224_ap = var2;
      C_100765_ie var5 = this.field_105739_f.func_104879_a(var1.field_103224_ap);
      var1.field_104518_a.func_107009_b(new C_100281_eg(var1.field_103224_ap, (byte)var1.field_103229_p.field_109578_t, var5.func_109429_J().func_107143_u(), var5.func_109361_N(), var1.field_104517_c.func_109797_b()));
      var4.func_109431_f(var1);
      var1.field_103180_L = false;
      this.func_105704_a(var1, var3, var4, var5);
      this.func_105701_a(var1, var4);
      var1.field_104518_a.func_107013_a(var1.field_103221_t, var1.field_103219_u, var1.field_103217_v, var1.field_103236_z, var1.field_103177_A);
      var1.field_104517_c.func_109802_a(var5);
      this.func_105711_b(var1, var5);
      this.func_105692_f(var1);
      Iterator var6 = var1.func_103291_bw().iterator();

      while(var6.hasNext()) {
         C_100692_kx var7 = (C_100692_kx)var6.next();
         var1.field_104518_a.func_107009_b(new C_100276_fb(var1.field_103212_k, var7));
      }

   }

   public void func_105704_a(C_100730_lb var1, int var2, C_100765_ie var3, C_100765_ie var4) {
      double var5 = var1.field_103221_t;
      double var7 = var1.field_103217_v;
      double var9 = 8.0D;
      double var11 = var1.field_103221_t;
      double var13 = var1.field_103219_u;
      double var15 = var1.field_103217_v;
      float var17 = var1.field_103236_z;
      if(var1.field_103224_ap == -1) {
         var5 /= var9;
         var7 /= var9;
         var1.func_103055_b(var5, var1.field_103219_u, var7, var1.field_103236_z, var1.field_103177_A);
         if(var1.func_103143_S()) {
            var3.func_109434_a(var1, false);
         }
      } else if(var1.field_103224_ap == 0) {
         var5 *= var9;
         var7 *= var9;
         var1.func_103055_b(var5, var1.field_103219_u, var7, var1.field_103236_z, var1.field_103177_A);
         if(var1.func_103143_S()) {
            var3.func_109434_a(var1, false);
         }
      } else {
         C_100013_k var18;
         if(var2 == 1) {
            var18 = var4.func_109381_G();
         } else {
            var18 = var4.func_109615_l();
         }

         var5 = (double)var18.field_105273_a;
         var1.field_103219_u = (double)var18.field_105271_b;
         var7 = (double)var18.field_105272_c;
         var1.func_103055_b(var5, var1.field_103219_u, var7, 90.0F, 0.0F);
         if(var1.func_103143_S()) {
            var3.func_109434_a(var1, false);
         }
      }

      if(var2 != 1) {
         var5 = (double)C_100650_jv.func_108923_a((int)var5, -29999872, 29999872);
         var7 = (double)C_100650_jv.func_108923_a((int)var7, -29999872, 29999872);
         if(var1.func_103143_S()) {
            var4.func_109513_d(var1);
            var1.func_103055_b(var5, var1.field_103219_u, var7, var1.field_103236_z, var1.field_103177_A);
            var4.func_109434_a(var1, false);
            (new C_100843_xs()).func_110142_a(var4, var1, var11, var13, var15, var17);
         }
      }

      var1.func_103094_a(var4);
   }

   public void func_105703_b() {
      if(++this.field_105747_o > 600) {
         this.field_105747_o = 0;
      }

      if(this.field_105747_o < this.field_105743_b.size()) {
         C_100762_ih var1 = (C_100762_ih)this.field_105743_b.get(this.field_105747_o);
         this.func_105733_a(new C_100233_ec(var1.field_103847_bT, true, var1.field_104524_i));
      }

   }

   public void func_105733_a(C_100219_dx var1) {
      for(int var2 = 0; var2 < this.field_105743_b.size(); ++var2) {
         ((C_100762_ih)this.field_105743_b.get(var2)).field_104518_a.func_107009_b(var1);
      }

   }

   public void func_105737_a(C_100219_dx var1, int var2) {
      Iterator var3 = this.field_105743_b.iterator();

      while(var3.hasNext()) {
         C_100762_ih var4 = (C_100762_ih)var3.next();
         if(var4.field_103224_ap == var2) {
            var4.field_104518_a.func_107009_b(var1);
         }
      }

   }

   public String func_105717_c() {
      String var1 = "";

      for(int var2 = 0; var2 < this.field_105743_b.size(); ++var2) {
         if(var2 > 0) {
            var1 = var1 + ", ";
         }

         var1 = var1 + ((C_100762_ih)this.field_105743_b.get(var2)).field_103847_bT;
      }

      return var1;
   }

   public String[] func_105699_d() {
      String[] var1 = new String[this.field_105743_b.size()];

      for(int var2 = 0; var2 < this.field_105743_b.size(); ++var2) {
         var1[var2] = ((C_100762_ih)this.field_105743_b.get(var2)).field_103847_bT;
      }

      return var1;
   }

   public C_100141_ff func_105719_e() {
      return this.field_105740_g;
   }

   public C_100141_ff func_105727_f() {
      return this.field_105752_h;
   }

   public void func_105710_b(String var1) {
      this.field_105753_i.add(var1.toLowerCase());
   }

   public void func_105693_c(String var1) {
      this.field_105753_i.remove(var1.toLowerCase());
   }

   public boolean func_105700_d(String var1) {
      var1 = var1.trim().toLowerCase();
      return !this.field_105748_l || this.field_105753_i.contains(var1) || this.field_105750_j.contains(var1);
   }

   public boolean func_105690_e(String var1) {
      return this.field_105753_i.contains(var1.trim().toLowerCase()) || this.field_105739_f.func_104921_I() && this.field_105739_f.field_104986_c[0].func_109429_J().func_107139_v() && this.field_105739_f.func_104919_H().equalsIgnoreCase(var1) || this.field_105746_n;
   }

   public C_100762_ih func_105705_f(String var1) {
      Iterator var2 = this.field_105743_b.iterator();

      C_100762_ih var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (C_100762_ih)var2.next();
      } while(!var3.field_103847_bT.equalsIgnoreCase(var1));

      return var3;
   }

   public List func_105732_a(C_100013_k var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(this.field_105743_b.isEmpty()) {
         return null;
      } else {
         Object var8 = new ArrayList();
         boolean var9 = var4 < 0;
         int var10 = var2 * var2;
         int var11 = var3 * var3;
         var4 = C_100650_jv.func_108912_a(var4);

         for(int var12 = 0; var12 < this.field_105743_b.size(); ++var12) {
            C_100762_ih var13 = (C_100762_ih)this.field_105743_b.get(var12);
            if(var1 != null && (var2 > 0 || var3 > 0)) {
               float var14 = var1.func_105269_e(var13.func_102911_b());
               if(var2 > 0 && var14 < (float)var10 || var3 > 0 && var14 > (float)var11) {
                  continue;
               }
            }

            if((var5 == C_100836_xn.field_110100_a.func_110090_a() || var5 == var13.field_104517_c.func_109797_b().func_110090_a()) && (var6 <= 0 || var13.field_103866_cg >= var6) && var13.field_103866_cg <= var7) {
               ((List)var8).add(var13);
            }
         }

         if(var1 != null) {
            Collections.sort((List)var8, new C_100120_gd(var1));
         }

         if(var9) {
            Collections.reverse((List)var8);
         }

         if(var4 > 0) {
            var8 = ((List)var8).subList(0, Math.min(var4, ((List)var8).size()));
         }

         return (List)var8;
      }
   }

   public void func_105730_a(double var1, double var3, double var5, double var7, int var9, C_100219_dx var10) {
      this.func_105696_a((C_101095_qg)null, var1, var3, var5, var7, var9, var10);
   }

   public void func_105696_a(C_101095_qg var1, double var2, double var4, double var6, double var8, int var10, C_100219_dx var11) {
      Iterator var12 = this.field_105743_b.iterator();

      while(var12.hasNext()) {
         C_100762_ih var13 = (C_100762_ih)var12.next();
         if(var13 != var1 && var13.field_103224_ap == var10) {
            double var14 = var2 - var13.field_103221_t;
            double var16 = var4 - var13.field_103219_u;
            double var18 = var6 - var13.field_103217_v;
            if(var14 * var14 + var16 * var16 + var18 * var18 < var8 * var8) {
               var13.field_104518_a.func_107009_b(var11);
            }
         }
      }

   }

   public void func_105735_g() {
      Iterator var1 = this.field_105743_b.iterator();

      while(var1.hasNext()) {
         C_100762_ih var2 = (C_100762_ih)var1.next();
         this.func_105729_b(var2);
      }

   }

   public void func_105694_h(String var1) {
      this.field_105750_j.add(var1);
   }

   public void func_105706_i(String var1) {
      this.field_105750_j.remove(var1);
   }

   public Set func_105736_h() {
      return this.field_105750_j;
   }

   public Set func_105728_i() {
      return this.field_105753_i;
   }

   public void func_105721_j() {}

   public void func_105711_b(C_100762_ih var1, C_100765_ie var2) {
      var1.field_104518_a.func_107009_b(new C_100305_es(var2.func_109463_E(), var2.func_109433_F()));
      if(var2.func_109531_M()) {
         var1.field_104518_a.func_107009_b(new C_100240_df(1, 0));
      }

   }

   public void func_105692_f(C_100762_ih var1) {
      var1.func_104510_a(var1.field_103855_bL);
      var1.func_104505_m();
   }

   public int func_105714_k() {
      return this.field_105743_b.size();
   }

   public int func_105691_l() {
      return this.field_105744_c;
   }

   public String[] func_105726_m() {
      return this.field_105739_f.field_104986_c[0].func_109509_I().func_107093_e().func_107098_f();
   }

   public boolean func_105708_n() {
      return this.field_105748_l;
   }

   public void func_105725_a(boolean var1) {
      this.field_105748_l = var1;
   }

   public List func_105709_j(String var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.field_105743_b.iterator();

      while(var3.hasNext()) {
         C_100762_ih var4 = (C_100762_ih)var3.next();
         if(var4.func_104502_q().equals(var1)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public int func_105715_o() {
      return this.field_105741_d;
   }

   public C_101445_MinecraftServer func_105722_p() {
      return this.field_105739_f;
   }

   public C_100353_bh func_105723_q() {
      return null;
   }

   public void func_105731_a(C_100836_xn var1) {
      this.field_105749_m = var1;
   }

   private void func_105697_a(C_100762_ih var1, C_100762_ih var2, C_100873_xe var3) {
      if(var2 != null) {
         var1.field_104517_c.func_109795_a(var2.field_104517_c.func_109797_b());
      } else if(this.field_105749_m != null) {
         var1.field_104517_c.func_109795_a(this.field_105749_m);
      }

      var1.field_104517_c.func_109800_b(var3.func_109429_J().func_107135_r());
   }

   public void func_105712_b(boolean var1) {
      this.field_105746_n = var1;
   }

   public void func_105713_r() {
      while(!this.field_105743_b.isEmpty()) {
         ((C_100762_ih)this.field_105743_b.get(0)).field_104518_a.func_107010_c("Server closed");
      }

   }

}
