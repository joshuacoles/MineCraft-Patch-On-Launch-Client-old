import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

public class C_101125_ard {

   private static final String[] field_111747_ag = new String[]{"options.renderDistance.far", "options.renderDistance.normal", "options.renderDistance.short", "options.renderDistance.tiny"};
   private static final String[] field_111748_ah = new String[]{"options.difficulty.peaceful", "options.difficulty.easy", "options.difficulty.normal", "options.difficulty.hard"};
   private static final String[] field_111734_ai = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
   private static final String[] field_111736_aj = new String[]{"options.chat.visibility.full", "options.chat.visibility.system", "options.chat.visibility.hidden"};
   private static final String[] field_111730_ak = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
   private static final String[] field_111732_al = new String[]{"performance.max", "performance.balanced", "performance.powersaver"};
   public float field_111721_a = 1.0F;
   public float field_111719_b = 1.0F;
   public float field_111720_c = 0.5F;
   public boolean field_111717_d = false;
   public int field_111718_e = 0;
   public boolean field_111715_f = true;
   public boolean field_111716_g = false;
   public boolean field_111728_h = false;
   public int field_111729_i = 1;
   public boolean field_111726_j = true;
   public boolean field_111727_k = true;
   public boolean field_111724_l = true;
   public String field_111725_m = "Default";
   public int field_111722_n = 0;
   public boolean field_111723_o = true;
   public boolean field_111742_p = true;
   public boolean field_111740_q = true;
   public float field_111739_r = 1.0F;
   public boolean field_111738_s = true;
   public boolean field_111737_t = true;
   public boolean field_111735_u = false;
   public boolean field_111733_v = true;
   public boolean field_111731_w = false;
   public boolean field_111753_x = false;
   public boolean field_111751_y = true;
   public boolean field_111749_z = true;
   public C_101207_aqi field_111693_A = new C_101207_aqi("key.forward", 17);
   public C_101207_aqi field_111694_B = new C_101207_aqi("key.left", 30);
   public C_101207_aqi field_111695_C = new C_101207_aqi("key.back", 31);
   public C_101207_aqi field_111689_D = new C_101207_aqi("key.right", 32);
   public C_101207_aqi field_111690_E = new C_101207_aqi("key.jump", 57);
   public C_101207_aqi field_111691_F = new C_101207_aqi("key.inventory", 18);
   public C_101207_aqi field_111692_G = new C_101207_aqi("key.drop", 16);
   public C_101207_aqi field_111700_H = new C_101207_aqi("key.chat", 20);
   public C_101207_aqi field_111701_I = new C_101207_aqi("key.sneak", 42);
   public C_101207_aqi field_111702_J = new C_101207_aqi("key.attack", -100);
   public C_101207_aqi field_111703_K = new C_101207_aqi("key.use", -99);
   public C_101207_aqi field_111696_L = new C_101207_aqi("key.playerlist", 15);
   public C_101207_aqi field_111697_M = new C_101207_aqi("key.pickItem", -98);
   public C_101207_aqi field_111698_N = new C_101207_aqi("key.command", 53);
   public C_101207_aqi[] field_111699_O;
   protected Minecraft field_111709_P;
   private File field_111741_am;
   public int field_111708_Q;
   public boolean field_111711_R;
   public int field_111710_S;
   public boolean field_111705_T;
   public boolean field_111704_U;
   public String field_111707_V;
   public boolean field_111706_W;
   public boolean field_111713_X;
   public boolean field_111712_Y;
   public float field_111714_Z;
   public float field_111745_aa;
   public float field_111746_ab;
   public float field_111743_ac;
   public int field_111744_ad;
   public int field_111750_ae;
   public String field_111752_af;


   public C_101125_ard(Minecraft var1, File var2) {
      this.field_111699_O = new C_101207_aqi[]{this.field_111702_J, this.field_111703_K, this.field_111693_A, this.field_111694_B, this.field_111695_C, this.field_111689_D, this.field_111690_E, this.field_111701_I, this.field_111692_G, this.field_111691_F, this.field_111700_H, this.field_111696_L, this.field_111697_M, this.field_111698_N};
      this.field_111708_Q = 2;
      this.field_111711_R = false;
      this.field_111710_S = 0;
      this.field_111705_T = false;
      this.field_111704_U = false;
      this.field_111707_V = "";
      this.field_111706_W = false;
      this.field_111713_X = false;
      this.field_111712_Y = false;
      this.field_111714_Z = 1.0F;
      this.field_111745_aa = 1.0F;
      this.field_111746_ab = 0.0F;
      this.field_111743_ac = 0.0F;
      this.field_111744_ad = 0;
      this.field_111750_ae = 0;
      this.field_111752_af = "en_US";
      this.field_111709_P = var1;
      this.field_111741_am = new File(var2, "options.txt");
      this.func_111677_a();
   }

   public C_101125_ard() {
      this.field_111699_O = new C_101207_aqi[]{this.field_111702_J, this.field_111703_K, this.field_111693_A, this.field_111694_B, this.field_111695_C, this.field_111689_D, this.field_111690_E, this.field_111701_I, this.field_111692_G, this.field_111691_F, this.field_111700_H, this.field_111696_L, this.field_111697_M, this.field_111698_N};
      this.field_111708_Q = 2;
      this.field_111711_R = false;
      this.field_111710_S = 0;
      this.field_111705_T = false;
      this.field_111704_U = false;
      this.field_111707_V = "";
      this.field_111706_W = false;
      this.field_111713_X = false;
      this.field_111712_Y = false;
      this.field_111714_Z = 1.0F;
      this.field_111745_aa = 1.0F;
      this.field_111746_ab = 0.0F;
      this.field_111743_ac = 0.0F;
      this.field_111744_ad = 0;
      this.field_111750_ae = 0;
      this.field_111752_af = "en_US";
   }

   public String func_111682_a(int var1) {
      C_100361_be var2 = C_100361_be.func_107654_a();
      return var2.func_107651_b(this.field_111699_O[var1].field_111992_c);
   }

   public String func_111680_b(int var1) {
      int var2 = this.field_111699_O[var1].field_111989_d;
      return func_111674_c(var2);
   }

   public static String func_111674_c(int var0) {
      return var0 < 0?C_100359_bd.func_107637_a("key.mouseButton", new Object[]{Integer.valueOf(var0 + 101)}):Keyboard.getKeyName(var0);
   }

   public void func_111688_a(int var1, int var2) {
      this.field_111699_O[var1].field_111989_d = var2;
      this.func_111684_b();
   }

   public void func_111683_a(C_101123_arf var1, float var2) {
      if(var1 == C_101123_arf.field_111653_a) {
         this.field_111721_a = var2;
         this.field_111709_P.field_105097_A.func_105896_a();
      }

      if(var1 == C_101123_arf.field_111651_b) {
         this.field_111719_b = var2;
         this.field_111709_P.field_105097_A.func_105896_a();
      }

      if(var1 == C_101123_arf.field_111649_d) {
         this.field_111720_c = var2;
      }

      if(var1 == C_101123_arf.field_111650_e) {
         this.field_111746_ab = var2;
      }

      if(var1 == C_101123_arf.field_111647_f) {
         this.field_111743_ac = var2;
      }

      if(var1 == C_101123_arf.field_111664_u) {
         this.field_111739_r = var2;
      }

   }

   public void func_111679_a(C_101123_arf var1, int var2) {
      if(var1 == C_101123_arf.field_111652_c) {
         this.field_111717_d = !this.field_111717_d;
      }

      if(var1 == C_101123_arf.field_111648_g) {
         this.field_111718_e = this.field_111718_e + var2 & 3;
      }

      if(var1 == C_101123_arf.field_111655_o) {
         this.field_111744_ad = this.field_111744_ad + var2 & 3;
      }

      if(var1 == C_101123_arf.field_111668_q) {
         this.field_111750_ae = (this.field_111750_ae + var2) % 3;
      }

      if(var1 == C_101123_arf.field_111660_h) {
         this.field_111715_f = !this.field_111715_f;
      }

      if(var1 == C_101123_arf.field_111669_p) {
         this.field_111724_l = !this.field_111724_l;
      }

      if(var1 == C_101123_arf.field_111658_j) {
         this.field_111728_h = !this.field_111728_h;
         this.field_111709_P.field_105119_f.func_109708_a();
      }

      if(var1 == C_101123_arf.field_111661_i) {
         this.field_111716_g = !this.field_111716_g;
         this.field_111709_P.field_105127_o.func_110380_b();
      }

      if(var1 == C_101123_arf.field_111659_k) {
         this.field_111729_i = (this.field_111729_i + var2 + 3) % 3;
      }

      if(var1 == C_101123_arf.field_111656_l) {
         this.field_111708_Q = this.field_111708_Q + var2 & 3;
      }

      if(var1 == C_101123_arf.field_111657_m) {
         this.field_111726_j = !this.field_111726_j;
         this.field_111709_P.field_105119_f.func_109708_a();
      }

      if(var1 == C_101123_arf.field_111654_n) {
         this.field_111727_k = !this.field_111727_k;
         this.field_111709_P.field_105119_f.func_109708_a();
      }

      if(var1 == C_101123_arf.field_111667_r) {
         this.field_111722_n = (this.field_111722_n + var2) % 3;
      }

      if(var1 == C_101123_arf.field_111666_s) {
         this.field_111723_o = !this.field_111723_o;
      }

      if(var1 == C_101123_arf.field_111665_t) {
         this.field_111742_p = !this.field_111742_p;
      }

      if(var1 == C_101123_arf.field_111663_v) {
         this.field_111740_q = !this.field_111740_q;
      }

      if(var1 == C_101123_arf.field_111662_w) {
         this.field_111738_s = !this.field_111738_s;
      }

      if(var1 == C_101123_arf.field_111672_x) {
         this.field_111737_t = !this.field_111737_t;
      }

      if(var1 == C_101123_arf.field_111644_A) {
         this.field_111749_z = !this.field_111749_z;
      }

      if(var1 == C_101123_arf.field_111671_y) {
         this.field_111735_u = !this.field_111735_u;
         if(this.field_111709_P.func_105050_G() != this.field_111735_u) {
            this.field_111709_P.func_105032_k();
         }
      }

      if(var1 == C_101123_arf.field_111670_z) {
         this.field_111733_v = !this.field_111733_v;
         Display.setVSyncEnabled(this.field_111733_v);
      }

      this.func_111684_b();
   }

   public float func_111675_a(C_101123_arf var1) {
      return var1 == C_101123_arf.field_111650_e?this.field_111746_ab:(var1 == C_101123_arf.field_111647_f?this.field_111743_ac:(var1 == C_101123_arf.field_111653_a?this.field_111721_a:(var1 == C_101123_arf.field_111651_b?this.field_111719_b:(var1 == C_101123_arf.field_111649_d?this.field_111720_c:(var1 == C_101123_arf.field_111664_u?this.field_111739_r:0.0F)))));
   }

   public boolean func_111686_b(C_101123_arf var1) {
      switch(C_101124_are.field_111673_a[var1.ordinal()]) {
      case 1:
         return this.field_111717_d;
      case 2:
         return this.field_111715_f;
      case 3:
         return this.field_111716_g;
      case 4:
         return this.field_111728_h;
      case 5:
         return this.field_111727_k;
      case 6:
         return this.field_111724_l;
      case 7:
         return this.field_111723_o;
      case 8:
         return this.field_111742_p;
      case 9:
         return this.field_111740_q;
      case 10:
         return this.field_111738_s;
      case 11:
         return this.field_111737_t;
      case 12:
         return this.field_111735_u;
      case 13:
         return this.field_111733_v;
      case 14:
         return this.field_111749_z;
      default:
         return false;
      }
   }

   private static String func_111676_a(String[] var0, int var1) {
      if(var1 < 0 || var1 >= var0.length) {
         var1 = 0;
      }

      C_100361_be var2 = C_100361_be.func_107654_a();
      return var2.func_107651_b(var0[var1]);
   }

   public String func_111678_c(C_101123_arf var1) {
      C_100361_be var2 = C_100361_be.func_107654_a();
      String var3 = var2.func_107651_b(var1.func_111637_d()) + ": ";
      if(var1.func_111639_a()) {
         float var5 = this.func_111675_a(var1);
         return var1 == C_101123_arf.field_111649_d?(var5 == 0.0F?var3 + var2.func_107651_b("options.sensitivity.min"):(var5 == 1.0F?var3 + var2.func_107651_b("options.sensitivity.max"):var3 + (int)(var5 * 200.0F) + "%")):(var1 == C_101123_arf.field_111650_e?(var5 == 0.0F?var3 + var2.func_107651_b("options.fov.min"):(var5 == 1.0F?var3 + var2.func_107651_b("options.fov.max"):var3 + (int)(70.0F + var5 * 40.0F))):(var1 == C_101123_arf.field_111647_f?(var5 == 0.0F?var3 + var2.func_107651_b("options.gamma.min"):(var5 == 1.0F?var3 + var2.func_107651_b("options.gamma.max"):var3 + "+" + (int)(var5 * 100.0F) + "%")):(var1 == C_101123_arf.field_111664_u?var3 + (int)(var5 * 90.0F + 10.0F) + "%":(var5 == 0.0F?var3 + var2.func_107651_b("options.off"):var3 + (int)(var5 * 100.0F) + "%"))));
      } else if(var1.func_111641_b()) {
         boolean var4 = this.func_111686_b(var1);
         return var4?var3 + var2.func_107651_b("options.on"):var3 + var2.func_107651_b("options.off");
      } else {
         return var1 == C_101123_arf.field_111648_g?var3 + func_111676_a(field_111747_ag, this.field_111718_e):(var1 == C_101123_arf.field_111656_l?var3 + func_111676_a(field_111748_ah, this.field_111708_Q):(var1 == C_101123_arf.field_111655_o?var3 + func_111676_a(field_111734_ai, this.field_111744_ad):(var1 == C_101123_arf.field_111667_r?var3 + func_111676_a(field_111736_aj, this.field_111722_n):(var1 == C_101123_arf.field_111668_q?var3 + func_111676_a(field_111730_ak, this.field_111750_ae):(var1 == C_101123_arf.field_111659_k?var3 + func_111676_a(field_111732_al, this.field_111729_i):(var1 == C_101123_arf.field_111657_m?(this.field_111726_j?var3 + var2.func_107651_b("options.graphics.fancy"):var3 + var2.func_107651_b("options.graphics.fast")):var3))))));
      }
   }

   public void func_111677_a() {
      try {
         if(!this.field_111741_am.exists()) {
            return;
         }

         BufferedReader var1 = new BufferedReader(new FileReader(this.field_111741_am));
         String var2 = "";

         while((var2 = var1.readLine()) != null) {
            try {
               String[] var3 = var2.split(":");
               if(var3[0].equals("music")) {
                  this.field_111721_a = this.func_111687_a(var3[1]);
               }

               if(var3[0].equals("sound")) {
                  this.field_111719_b = this.func_111687_a(var3[1]);
               }

               if(var3[0].equals("mouseSensitivity")) {
                  this.field_111720_c = this.func_111687_a(var3[1]);
               }

               if(var3[0].equals("fov")) {
                  this.field_111746_ab = this.func_111687_a(var3[1]);
               }

               if(var3[0].equals("gamma")) {
                  this.field_111743_ac = this.func_111687_a(var3[1]);
               }

               if(var3[0].equals("invertYMouse")) {
                  this.field_111717_d = var3[1].equals("true");
               }

               if(var3[0].equals("viewDistance")) {
                  this.field_111718_e = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("guiScale")) {
                  this.field_111744_ad = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("particles")) {
                  this.field_111750_ae = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("bobView")) {
                  this.field_111715_f = var3[1].equals("true");
               }

               if(var3[0].equals("anaglyph3d")) {
                  this.field_111716_g = var3[1].equals("true");
               }

               if(var3[0].equals("advancedOpengl")) {
                  this.field_111728_h = var3[1].equals("true");
               }

               if(var3[0].equals("fpsLimit")) {
                  this.field_111729_i = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("difficulty")) {
                  this.field_111708_Q = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("fancyGraphics")) {
                  this.field_111726_j = var3[1].equals("true");
               }

               if(var3[0].equals("ao")) {
                  this.field_111727_k = var3[1].equals("true");
               }

               if(var3[0].equals("clouds")) {
                  this.field_111724_l = var3[1].equals("true");
               }

               if(var3[0].equals("skin")) {
                  this.field_111725_m = var3[1];
               }

               if(var3[0].equals("lastServer") && var3.length >= 2) {
                  this.field_111707_V = var3[1];
               }

               if(var3[0].equals("lang") && var3.length >= 2) {
                  this.field_111752_af = var3[1];
               }

               if(var3[0].equals("chatVisibility")) {
                  this.field_111722_n = Integer.parseInt(var3[1]);
               }

               if(var3[0].equals("chatColors")) {
                  this.field_111723_o = var3[1].equals("true");
               }

               if(var3[0].equals("chatLinks")) {
                  this.field_111742_p = var3[1].equals("true");
               }

               if(var3[0].equals("chatLinksPrompt")) {
                  this.field_111740_q = var3[1].equals("true");
               }

               if(var3[0].equals("chatOpacity")) {
                  this.field_111739_r = this.func_111687_a(var3[1]);
               }

               if(var3[0].equals("serverTextures")) {
                  this.field_111738_s = var3[1].equals("true");
               }

               if(var3[0].equals("snooperEnabled")) {
                  this.field_111737_t = var3[1].equals("true");
               }

               if(var3[0].equals("fullscreen")) {
                  this.field_111735_u = var3[1].equals("true");
               }

               if(var3[0].equals("enableVsync")) {
                  this.field_111733_v = var3[1].equals("true");
               }

               if(var3[0].equals("hideServerAddress")) {
                  this.field_111731_w = var3[1].equals("true");
               }

               if(var3[0].equals("advancedItemTooltips")) {
                  this.field_111753_x = var3[1].equals("true");
               }

               if(var3[0].equals("pauseOnLostFocus")) {
                  this.field_111751_y = var3[1].equals("true");
               }

               if(var3[0].equals("showCape")) {
                  this.field_111749_z = var3[1].equals("true");
               }

               C_101207_aqi[] var4 = this.field_111699_O;
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  C_101207_aqi var7 = var4[var6];
                  if(var3[0].equals("key_" + var7.field_111992_c)) {
                     var7.field_111989_d = Integer.parseInt(var3[1]);
                  }
               }
            } catch (Exception var8) {
               System.out.println("Skipping bad option: " + var2);
            }
         }

         C_101207_aqi.func_111985_b();
         var1.close();
      } catch (Exception var9) {
         System.out.println("Failed to load options");
         var9.printStackTrace();
      }

   }

   private float func_111687_a(String var1) {
      return var1.equals("true")?1.0F:(var1.equals("false")?0.0F:Float.parseFloat(var1));
   }

   public void func_111684_b() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.field_111741_am));
         var1.println("music:" + this.field_111721_a);
         var1.println("sound:" + this.field_111719_b);
         var1.println("invertYMouse:" + this.field_111717_d);
         var1.println("mouseSensitivity:" + this.field_111720_c);
         var1.println("fov:" + this.field_111746_ab);
         var1.println("gamma:" + this.field_111743_ac);
         var1.println("viewDistance:" + this.field_111718_e);
         var1.println("guiScale:" + this.field_111744_ad);
         var1.println("particles:" + this.field_111750_ae);
         var1.println("bobView:" + this.field_111715_f);
         var1.println("anaglyph3d:" + this.field_111716_g);
         var1.println("advancedOpengl:" + this.field_111728_h);
         var1.println("fpsLimit:" + this.field_111729_i);
         var1.println("difficulty:" + this.field_111708_Q);
         var1.println("fancyGraphics:" + this.field_111726_j);
         var1.println("ao:" + this.field_111727_k);
         var1.println("clouds:" + this.field_111724_l);
         var1.println("skin:" + this.field_111725_m);
         var1.println("lastServer:" + this.field_111707_V);
         var1.println("lang:" + this.field_111752_af);
         var1.println("chatVisibility:" + this.field_111722_n);
         var1.println("chatColors:" + this.field_111723_o);
         var1.println("chatLinks:" + this.field_111742_p);
         var1.println("chatLinksPrompt:" + this.field_111740_q);
         var1.println("chatOpacity:" + this.field_111739_r);
         var1.println("serverTextures:" + this.field_111738_s);
         var1.println("snooperEnabled:" + this.field_111737_t);
         var1.println("fullscreen:" + this.field_111735_u);
         var1.println("enableVsync:" + this.field_111733_v);
         var1.println("hideServerAddress:" + this.field_111731_w);
         var1.println("advancedItemTooltips:" + this.field_111753_x);
         var1.println("pauseOnLostFocus:" + this.field_111751_y);
         var1.println("showCape:" + this.field_111749_z);
         C_101207_aqi[] var2 = this.field_111699_O;
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            C_101207_aqi var5 = var2[var4];
            var1.println("key_" + var5.field_111992_c + ":" + var5.field_111989_d);
         }

         var1.close();
      } catch (Exception var6) {
         System.out.println("Failed to save options");
         var6.printStackTrace();
      }

      this.func_111685_c();
   }

   public void func_111685_c() {
      if(this.field_111709_P.field_105120_g != null) {
         this.field_111709_P.field_105120_g.field_104564_a.func_107034_c(new C_100390_cp(this.field_111752_af, this.field_111718_e, this.field_111722_n, this.field_111723_o, this.field_111708_Q, this.field_111749_z));
      }

   }

   public boolean func_111681_d() {
      return this.field_111718_e < 2 && this.field_111724_l;
   }

}
