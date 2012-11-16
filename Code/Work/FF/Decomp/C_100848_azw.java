import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class C_100848_azw {

   private Map field_110185_o = new HashMap();
   public static C_100848_azw field_110183_a = new C_100848_azw();
   private C_101153_asb field_110192_p;
   public static double field_110181_b;
   public static double field_110182_c;
   public static double field_110179_d;
   public C_100874_azc field_110180_e;
   public C_100860_ayx field_110177_f;
   public C_100873_xe field_110178_g;
   public C_100595_ln field_110190_h;
   public float field_110191_i;
   public float field_110188_j;
   public C_101125_ard field_110189_k;
   public double field_110186_l;
   public double field_110187_m;
   public double field_110184_n;


   private C_100848_azw() {
      this.field_110185_o.put(C_101101_py.class, new C_100070_baw());
      this.field_110185_o.put(C_100593_pk.class, new C_100070_baw());
      this.field_110185_o.put(C_100537_on.class, new C_100077_bap(new C_101229_avn(), new C_101229_avn(0.5F), 0.7F));
      this.field_110185_o.put(C_100555_oo.class, new C_100075_bar(new C_101225_avr(), new C_101224_avq(), 0.7F));
      this.field_110185_o.put(C_100541_oj.class, new C_100852_azq(new C_101215_avd(), 0.7F));
      this.field_110185_o.put(C_100539_ol.class, new C_100053_bam(new C_101215_avd(), 0.7F));
      this.field_110185_o.put(C_100546_ot.class, new C_100036_bbe(new C_101259_awg(), new C_101259_awg(), 0.5F));
      this.field_110185_o.put(C_100540_oi.class, new C_100834_azp(new C_101216_avc(), 0.3F));
      this.field_110185_o.put(C_100535_om.class, new C_100054_ban(new C_101228_avm(), 0.4F));
      this.field_110185_o.put(C_101105_pv.class, new C_100074_bas());
      this.field_110185_o.put(C_100583_pl.class, new C_100850_azr());
      this.field_110185_o.put(C_100585_pm.class, new C_100842_azv());
      this.field_110185_o.put(C_100553_op.class, new C_100071_bav());
      this.field_110185_o.put(C_101106_pw.class, new C_100073_bat());
      this.field_110185_o.put(C_101102_pz.class, new C_100040_bbb());
      this.field_110185_o.put(C_100592_pj.class, new C_100830_azn());
      this.field_110185_o.put(C_101097_qa.class, new C_100037_bbf());
      this.field_110185_o.put(C_101100_px.class, new C_100072_bau(new C_101249_avw(16), new C_101249_avw(0), 0.25F));
      this.field_110185_o.put(C_101109_pr.class, new C_100057_bai());
      this.field_110185_o.put(C_101095_qg.class, new C_100076_baq());
      this.field_110185_o.put(C_101108_pq.class, new C_100064_bad(new C_101260_awh(), 0.5F, 6.0F));
      this.field_110185_o.put(C_101107_pp.class, new C_100063_bac());
      this.field_110185_o.put(C_100558_oq.class, new C_100069_bax(new C_101243_avz(), 0.7F));
      this.field_110185_o.put(C_101098_qd.class, new C_100039_bba());
      this.field_110185_o.put(C_100557_or.class, new C_100067_baz());
      this.field_110185_o.put(C_100595_ln.class, new C_100056_bal(new C_101235_avh(), 0.5F));
      this.field_110185_o.put(C_100543_og.class, new C_100832_azm());
      this.field_110185_o.put(C_100568_oy.class, new C_100844_azu());
      this.field_110185_o.put(C_100563_ox.class, new C_100854_azt());
      this.field_110185_o.put(C_100579_pa.class, new C_100041_bbc());
      this.field_110185_o.put(C_100730_lb.class, new C_100856_azs());
      this.field_110185_o.put(C_100600_lq.class, new C_100078_bao());
      this.field_110185_o.put(C_100596_lm.class, new C_100062_baf());
      this.field_110185_o.put(C_101089_qi.class, new C_100839_azl());
      this.field_110185_o.put(C_101086_qp.class, new C_100060_bah(C_100992_tt.field_110916_aD.func_110787_b(0)));
      this.field_110185_o.put(C_101080_qs.class, new C_100060_bah(C_100992_tt.field_110868_bn.func_110787_b(0)));
      this.field_110185_o.put(C_101088_qj.class, new C_100060_bah(C_100992_tt.field_110896_bA.func_110787_b(0)));
      this.field_110185_o.put(C_101083_qr.class, new C_100060_bah(C_100992_tt.field_110912_aP.func_110787_b(0)));
      this.field_110185_o.put(C_101078_qu.class, new C_100060_bah(154));
      this.field_110185_o.put(C_101081_qt.class, new C_100060_bah(C_100992_tt.field_110957_bD.func_110787_b(0)));
      this.field_110185_o.put(C_101085_qm.class, new C_100065_baa(2.0F));
      this.field_110185_o.put(C_101087_qo.class, new C_100065_baa(0.5F));
      this.field_110185_o.put(C_101079_qv.class, new C_100035_bbd());
      this.field_110185_o.put(C_100576_pg.class, new C_100059_bag());
      this.field_110185_o.put(C_100722_lj.class, new C_100898_azy());
      this.field_110185_o.put(C_100591_pi.class, new C_100068_bay());
      this.field_110185_o.put(C_100574_pf.class, new C_100899_azz());
      this.field_110185_o.put(C_100590_ph.class, new C_100055_bak());
      this.field_110185_o.put(C_100572_pe.class, new C_100835_azo());
      this.field_110185_o.put(C_101090_ql.class, new C_100066_bab());
      this.field_110185_o.put(C_100570_pd.class, new C_100058_baj());
      Iterator var1 = this.field_110185_o.values().iterator();

      while(var1.hasNext()) {
         C_100846_azx var2 = (C_100846_azx)var1.next();
         var2.func_105344_a(this);
      }

   }

   public C_100846_azx func_110170_a(Class var1) {
      C_100846_azx var2 = (C_100846_azx)this.field_110185_o.get(var1);
      if(var2 == null && var1 != C_100730_lb.class) {
         var2 = this.func_110170_a(var1.getSuperclass());
         this.field_110185_o.put(var1, var2);
      }

      return var2;
   }

   public C_100846_azx func_110172_a(C_100730_lb var1) {
      return this.func_110170_a(var1.getClass());
   }

   public void func_110174_a(C_100873_xe var1, C_100874_azc var2, C_101153_asb var3, C_100595_ln var4, C_101125_ard var5, float var6) {
      this.field_110178_g = var1;
      this.field_110180_e = var2;
      this.field_110189_k = var5;
      this.field_110190_h = var4;
      this.field_110192_p = var3;
      if(var4.func_103369_bt()) {
         int var7 = var1.func_109349_a(C_100650_jv.func_108910_c(var4.field_103221_t), C_100650_jv.func_108910_c(var4.field_103219_u), C_100650_jv.func_108910_c(var4.field_103217_v));
         if(var7 == C_100451_alf.field_106089_V.field_106162_cm) {
            int var8 = var1.func_109357_g(C_100650_jv.func_108910_c(var4.field_103221_t), C_100650_jv.func_108910_c(var4.field_103219_u), C_100650_jv.func_108910_c(var4.field_103217_v));
            int var9 = var8 & 3;
            this.field_110191_i = (float)(var9 * 90 + 180);
            this.field_110188_j = 0.0F;
         }
      } else {
         this.field_110191_i = var4.field_103178_B + (var4.field_103236_z - var4.field_103178_B) * var6;
         this.field_110188_j = var4.field_103179_C + (var4.field_103177_A - var4.field_103179_C) * var6;
      }

      if(var5.field_111710_S == 2) {
         this.field_110191_i += 180.0F;
      }

      this.field_110186_l = var4.field_103189_T + (var4.field_103221_t - var4.field_103189_T) * (double)var6;
      this.field_110187_m = var4.field_103188_U + (var4.field_103219_u - var4.field_103188_U) * (double)var6;
      this.field_110184_n = var4.field_103191_V + (var4.field_103217_v - var4.field_103191_V) * (double)var6;
   }

   public void func_110176_a(C_100730_lb var1, float var2) {
      double var3 = var1.field_103189_T + (var1.field_103221_t - var1.field_103189_T) * (double)var2;
      double var5 = var1.field_103188_U + (var1.field_103219_u - var1.field_103188_U) * (double)var2;
      double var7 = var1.field_103191_V + (var1.field_103217_v - var1.field_103191_V) * (double)var2;
      float var9 = var1.field_103178_B + (var1.field_103236_z - var1.field_103178_B) * var2;
      int var10 = var1.func_103125_b(var2);
      if(var1.func_103149_af()) {
         var10 = 15728880;
      }

      int var11 = var10 % 65536;
      int var12 = var10 / 65536;
      C_100082_bdf.func_105622_a(C_100082_bdf.field_105623_b, (float)var11 / 1.0F, (float)var12 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.func_110173_a(var1, var3 - field_110181_b, var5 - field_110182_c, var7 - field_110179_d, var9, var2);
   }

   public void func_110173_a(C_100730_lb var1, double var2, double var4, double var6, float var8, float var9) {
      C_100846_azx var10 = this.func_110172_a(var1);
      if(var10 != null && this.field_110180_e != null) {
         var10.func_105350_a(var1, var2, var4, var6, var8, var9);
         var10.func_105346_b(var1, var2, var4, var6, var8, var9);
      }

   }

   public void func_110169_a(C_100873_xe var1) {
      this.field_110178_g = var1;
   }

   public double func_110171_a(double var1, double var3, double var5) {
      double var7 = var1 - this.field_110186_l;
      double var9 = var3 - this.field_110187_m;
      double var11 = var5 - this.field_110184_n;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public C_101153_asb func_110175_a() {
      return this.field_110192_p;
   }

}
