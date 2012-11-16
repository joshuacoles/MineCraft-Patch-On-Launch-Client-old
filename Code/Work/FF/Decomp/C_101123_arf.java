
public enum C_101123_arf {

   field_111653_a("MUSIC", 0, "options.music", true, false),
   field_111651_b("SOUND", 1, "options.sound", true, false),
   field_111652_c("INVERT_MOUSE", 2, "options.invertMouse", false, true),
   field_111649_d("SENSITIVITY", 3, "options.sensitivity", true, false),
   field_111650_e("FOV", 4, "options.fov", true, false),
   field_111647_f("GAMMA", 5, "options.gamma", true, false),
   field_111648_g("RENDER_DISTANCE", 6, "options.renderDistance", false, false),
   field_111660_h("VIEW_BOBBING", 7, "options.viewBobbing", false, true),
   field_111661_i("ANAGLYPH", 8, "options.anaglyph", false, true),
   field_111658_j("ADVANCED_OPENGL", 9, "options.advancedOpengl", false, true),
   field_111659_k("FRAMERATE_LIMIT", 10, "options.framerateLimit", false, false),
   field_111656_l("DIFFICULTY", 11, "options.difficulty", false, false),
   field_111657_m("GRAPHICS", 12, "options.graphics", false, false),
   field_111654_n("AMBIENT_OCCLUSION", 13, "options.ao", false, true),
   field_111655_o("GUI_SCALE", 14, "options.guiScale", false, false),
   field_111669_p("RENDER_CLOUDS", 15, "options.renderClouds", false, true),
   field_111668_q("PARTICLES", 16, "options.particles", false, false),
   field_111667_r("CHAT_VISIBILITY", 17, "options.chat.visibility", false, false),
   field_111666_s("CHAT_COLOR", 18, "options.chat.color", false, true),
   field_111665_t("CHAT_LINKS", 19, "options.chat.links", false, true),
   field_111664_u("CHAT_OPACITY", 20, "options.chat.opacity", true, false),
   field_111663_v("CHAT_LINKS_PROMPT", 21, "options.chat.links.prompt", false, true),
   field_111662_w("USE_SERVER_TEXTURES", 22, "options.serverTextures", false, true),
   field_111672_x("SNOOPER_ENABLED", 23, "options.snooper", false, true),
   field_111671_y("USE_FULLSCREEN", 24, "options.fullscreen", false, true),
   field_111670_z("ENABLE_VSYNC", 25, "options.vsync", false, true),
   field_111644_A("SHOW_CAPE", 26, "options.showCape", false, true);
   private final boolean field_111645_B;
   private final boolean field_111646_C;
   private final String field_111642_D;
   // $FF: synthetic field
   private static final C_101123_arf[] field_111643_E = new C_101123_arf[]{field_111653_a, field_111651_b, field_111652_c, field_111649_d, field_111650_e, field_111647_f, field_111648_g, field_111660_h, field_111661_i, field_111658_j, field_111659_k, field_111656_l, field_111657_m, field_111654_n, field_111655_o, field_111669_p, field_111668_q, field_111667_r, field_111666_s, field_111665_t, field_111664_u, field_111663_v, field_111662_w, field_111672_x, field_111671_y, field_111670_z, field_111644_A};


   public static C_101123_arf[] func_111638_values() {
      return (C_101123_arf[])field_111643_E.clone();
   }

   public static C_101123_arf func_111636_a(int var0) {
      C_101123_arf[] var1 = func_111638_values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         C_101123_arf var4 = var1[var3];
         if(var4.func_111640_c() == var0) {
            return var4;
         }
      }

      return null;
   }

   private C_101123_arf(String var1, int var2, String var3, boolean var4, boolean var5) {
      this.field_111642_D = var3;
      this.field_111645_B = var4;
      this.field_111646_C = var5;
   }

   public boolean func_111639_a() {
      return this.field_111645_B;
   }

   public boolean func_111641_b() {
      return this.field_111646_C;
   }

   public int func_111640_c() {
      return this.ordinal();
   }

   public String func_111637_d() {
      return this.field_111642_D;
   }

}
