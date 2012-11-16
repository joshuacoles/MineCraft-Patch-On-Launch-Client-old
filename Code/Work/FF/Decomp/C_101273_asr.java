import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class C_101273_asr extends C_101278_asw {

   private static C_100059_bag field_104319_a = new C_100059_bag();
   private static final List field_104315_b = new ArrayList();
   private final C_101143_ars field_104316_c;
   private String field_104314_d;
   private String field_104322_m;
   private String field_104320_n;
   private C_101270_ast field_104321_o;
   private C_101133_arl field_104318_p;
   private C_101146_ary field_104317_q;


   public C_101273_asr(C_101143_ars var1) {
      this.field_104316_c = var1;
   }

   public void func_104037_A_() {
      this.field_104050_h.clear();
      Keyboard.enableRepeatEvents(true);
      this.field_104314_d = C_100359_bd.func_107638_a("createWorld.customize.presets.title");
      this.field_104322_m = C_100359_bd.func_107638_a("createWorld.customize.presets.share");
      this.field_104320_n = C_100359_bd.func_107638_a("createWorld.customize.presets.list");
      this.field_104317_q = new C_101146_ary(this.field_104049_k, 50, 40, this.field_104044_f - 100, 20);
      this.field_104321_o = new C_101270_ast(this);
      this.field_104317_q.func_103963_f(1230);
      this.field_104317_q.func_103940_a(this.field_104316_c.func_104167_e());
      this.field_104050_h.add(this.field_104318_p = new C_101133_arl(0, this.field_104044_f / 2 - 155, this.field_104045_g - 28, 150, 20, C_100359_bd.func_107638_a("createWorld.customize.presets.select")));
      this.field_104050_h.add(new C_101133_arl(1, this.field_104044_f / 2 + 5, this.field_104045_g - 28, 150, 20, C_100359_bd.func_107638_a("gui.cancel")));
      this.func_104311_g();
   }

   public void func_104038_b() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void func_104028_a(int var1, int var2, int var3) {
      this.field_104317_q.func_103952_a(var1, var2, var3);
      super.func_104028_a(var1, var2, var3);
   }

   protected void func_104032_a(char var1, int var2) {
      if(!this.field_104317_q.func_103961_a(var1, var2)) {
         super.func_104032_a(var1, var2);
      }

   }

   protected void func_104040_a(C_101133_arl var1) {
      if(var1.field_103908_f == 0 && this.func_104309_j()) {
         this.field_104316_c.func_104165_a(this.field_104317_q.func_103939_b());
         this.field_104046_e.func_105053_a(this.field_104316_c);
      } else if(var1.field_103908_f == 1) {
         this.field_104046_e.func_105053_a(this.field_104316_c);
      }

   }

   public void func_104027_a(int var1, int var2, float var3) {
      this.func_104035_z_();
      this.field_104321_o.func_105826_a(var1, var2, var3);
      this.func_103879_a(this.field_104049_k, this.field_104314_d, this.field_104044_f / 2, 8, 16777215);
      this.func_103880_b(this.field_104049_k, this.field_104322_m, 50, 30, 10526880);
      this.func_103880_b(this.field_104049_k, this.field_104320_n, 50, 70, 10526880);
      this.field_104317_q.func_103954_f();
      super.func_104027_a(var1, var2, var3);
   }

   public void func_104039_c() {
      this.field_104317_q.func_103938_a();
      super.func_104039_c();
   }

   public void func_104311_g() {
      boolean var1 = this.func_104309_j();
      this.field_104318_p.field_103909_g = var1;
   }

   private boolean func_104309_j() {
      return this.field_104321_o.field_105875_a > -1 && this.field_104321_o.field_105875_a < field_104315_b.size() || this.field_104317_q.func_103939_b().length() > 1;
   }

   private static void func_104312_a(String var0, int var1, C_101324_xz var2, C_100513_abm ... var3) {
      func_104307_a(var0, var1, var2, (List)null, var3);
   }

   private static void func_104307_a(String var0, int var1, C_101324_xz var2, List var3, C_100513_abm ... var4) {
      C_100511_abl var5 = new C_100511_abl();

      for(int var6 = var4.length - 1; var6 >= 0; --var6) {
         var5.func_108259_c().add(var4[var6]);
      }

      var5.func_108257_a(var2.field_112478_N);
      var5.func_108254_d();
      if(var3 != null) {
         Iterator var8 = var3.iterator();

         while(var8.hasNext()) {
            String var7 = (String)var8.next();
            var5.func_108253_b().put(var7, new HashMap());
         }
      }

      field_104315_b.add(new C_101271_ass(var1, var0, var5.toString()));
   }

   // $FF: synthetic method
   static C_100059_bag func_104313_h() {
      return field_104319_a;
   }

   // $FF: synthetic method
   static List func_104310_i() {
      return field_104315_b;
   }

   // $FF: synthetic method
   static C_101270_ast func_104306_a(C_101273_asr var0) {
      return var0.field_104321_o;
   }

   // $FF: synthetic method
   static C_101146_ary func_104308_b(C_101273_asr var0) {
      return var0.field_104317_q;
   }

   static {
      func_104307_a("Classic Flat", C_100451_alf.field_106121_x.field_106162_cm, C_101324_xz.field_112494_c, Arrays.asList(new String[]{"village"}), new C_100513_abm[]{new C_100513_abm(1, C_100451_alf.field_106121_x.field_106162_cm), new C_100513_abm(2, C_100451_alf.field_106120_y.field_106162_cm), new C_100513_abm(1, C_100451_alf.field_106077_C.field_106162_cm)});
      func_104307_a("Tunnelers\' Dream", C_100451_alf.field_106111_w.field_106162_cm, C_101324_xz.field_112492_e, Arrays.asList(new String[]{"biome_1", "dungeon", "decoration", "stronghold", "mineshaft"}), new C_100513_abm[]{new C_100513_abm(1, C_100451_alf.field_106121_x.field_106162_cm), new C_100513_abm(5, C_100451_alf.field_106120_y.field_106162_cm), new C_100513_abm(230, C_100451_alf.field_106111_w.field_106162_cm), new C_100513_abm(1, C_100451_alf.field_106077_C.field_106162_cm)});
      func_104307_a("Water World", C_100451_alf.field_106071_D.field_106162_cm, C_101324_xz.field_112494_c, Arrays.asList(new String[]{"village", "biome_1"}), new C_100513_abm[]{new C_100513_abm(90, C_100451_alf.field_106072_E.field_106162_cm), new C_100513_abm(5, C_100451_alf.field_106082_H.field_106162_cm), new C_100513_abm(5, C_100451_alf.field_106120_y.field_106162_cm), new C_100513_abm(5, C_100451_alf.field_106111_w.field_106162_cm), new C_100513_abm(1, C_100451_alf.field_106077_C.field_106162_cm)});
      func_104307_a("Overworld", C_100451_alf.field_106244_aa.field_106162_cm, C_101324_xz.field_112494_c, Arrays.asList(new String[]{"village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake"}), new C_100513_abm[]{new C_100513_abm(1, C_100451_alf.field_106121_x.field_106162_cm), new C_100513_abm(3, C_100451_alf.field_106120_y.field_106162_cm), new C_100513_abm(59, C_100451_alf.field_106111_w.field_106162_cm), new C_100513_abm(1, C_100451_alf.field_106077_C.field_106162_cm)});
      func_104307_a("Snowy Kingdom", C_100451_alf.field_106181_aV.field_106162_cm, C_101324_xz.field_112496_n, Arrays.asList(new String[]{"village", "biome_1"}), new C_100513_abm[]{new C_100513_abm(1, C_100451_alf.field_106181_aV.field_106162_cm), new C_100513_abm(1, C_100451_alf.field_106121_x.field_106162_cm), new C_100513_abm(3, C_100451_alf.field_106120_y.field_106162_cm), new C_100513_abm(59, C_100451_alf.field_106111_w.field_106162_cm), new C_100513_abm(1, C_100451_alf.field_106077_C.field_106162_cm)});
      func_104307_a("Bottomless Pit", C_100992_tt.field_110812_L.field_110891_cf, C_101324_xz.field_112494_c, Arrays.asList(new String[]{"village", "biome_1"}), new C_100513_abm[]{new C_100513_abm(1, C_100451_alf.field_106121_x.field_106162_cm), new C_100513_abm(3, C_100451_alf.field_106120_y.field_106162_cm), new C_100513_abm(2, C_100451_alf.field_106119_z.field_106162_cm)});
      func_104307_a("Desert", C_100451_alf.field_106082_H.field_106162_cm, C_101324_xz.field_112491_d, Arrays.asList(new String[]{"village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"}), new C_100513_abm[]{new C_100513_abm(8, C_100451_alf.field_106082_H.field_106162_cm), new C_100513_abm(52, C_100451_alf.field_106087_T.field_106162_cm), new C_100513_abm(3, C_100451_alf.field_106111_w.field_106162_cm), new C_100513_abm(1, C_100451_alf.field_106077_C.field_106162_cm)});
      func_104312_a("Redstone Ready", C_100992_tt.field_110915_aC.field_110891_cf, C_101324_xz.field_112491_d, new C_100513_abm[]{new C_100513_abm(52, C_100451_alf.field_106087_T.field_106162_cm), new C_100513_abm(3, C_100451_alf.field_106111_w.field_106162_cm), new C_100513_abm(1, C_100451_alf.field_106077_C.field_106162_cm)});
   }
}
