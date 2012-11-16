import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101425_SoundSystem;
import p_101361_paulscode.p_101409_sound.p_101428_libraries.C_101430_LibraryLWJGLOpenAL;
import p_101361_paulscode.p_101409_sound.p_101429_codecs.C_101439_CodecJOrbis;
import p_101361_paulscode.p_101409_sound.p_101429_codecs.C_101440_CodecWav;

public class C_100105_bcx {

   private static C_101425_SoundSystem field_105922_a;
   private C_100099_bcy field_105920_b = new C_100099_bcy();
   private C_100099_bcy field_105921_c = new C_100099_bcy();
   private C_100099_bcy field_105918_d = new C_100099_bcy();
   private int field_105919_e = 0;
   private C_101125_ard field_105916_f;
   private Set field_105917_g = new HashSet();
   private static boolean field_105924_h = false;
   private Random field_105925_i = new Random();
   private int field_105923_j;


   public C_100105_bcx() {
      this.field_105923_j = this.field_105925_i.nextInt(12000);
   }

   public void func_105904_a(C_101125_ard var1) {
      this.field_105921_c.field_105797_b = false;
      this.field_105916_f = var1;
      if(!field_105924_h && (var1 == null || var1.field_111719_b != 0.0F || var1.field_111721_a != 0.0F)) {
         this.func_105905_g();
      }

   }

   private void func_105905_g() {
      try {
         float var1 = this.field_105916_f.field_111719_b;
         float var2 = this.field_105916_f.field_111721_a;
         this.field_105916_f.field_111719_b = 0.0F;
         this.field_105916_f.field_111721_a = 0.0F;
         this.field_105916_f.func_111684_b();
         C_101416_SoundSystemConfig.func_102584_addLibrary(C_101430_LibraryLWJGLOpenAL.class);
         C_101416_SoundSystemConfig.func_102601_setCodec("ogg", C_101439_CodecJOrbis.class);
         C_101416_SoundSystemConfig.func_102601_setCodec("mus", C_100101_bct.class);
         C_101416_SoundSystemConfig.func_102601_setCodec("wav", C_101440_CodecWav.class);
         field_105922_a = new C_101425_SoundSystem();
         this.field_105916_f.field_111719_b = var1;
         this.field_105916_f.field_111721_a = var2;
         this.field_105916_f.func_111684_b();
      } catch (Throwable var3) {
         var3.printStackTrace();
         System.err.println("error linking with the LibraryJavaSound plug-in");
      }

      field_105924_h = true;
   }

   public void func_105896_a() {
      if(!field_105924_h && (this.field_105916_f.field_111719_b != 0.0F || this.field_105916_f.field_111721_a != 0.0F)) {
         this.func_105905_g();
      }

      if(field_105924_h) {
         if(this.field_105916_f.field_111721_a == 0.0F) {
            field_105922_a.func_102751_stop("BgMusic");
         } else {
            field_105922_a.func_102816_setVolume("BgMusic", this.field_105916_f.field_111721_a);
         }
      }

   }

   public void func_105913_b() {
      if(field_105924_h) {
         field_105922_a.func_102746_cleanup();
      }

   }

   public void func_105901_a(String var1, File var2) {
      this.field_105920_b.func_105793_a(var1, var2);
   }

   public void func_105915_b(String var1, File var2) {
      this.field_105921_c.func_105793_a(var1, var2);
   }

   public void func_105908_c(String var1, File var2) {
      this.field_105918_d.func_105793_a(var1, var2);
   }

   public void func_105914_c() {
      if(field_105924_h && this.field_105916_f.field_111721_a != 0.0F) {
         if(!field_105922_a.func_102822_playing("BgMusic") && !field_105922_a.func_102822_playing("streaming")) {
            if(this.field_105923_j > 0) {
               --this.field_105923_j;
               return;
            }

            C_100106_bcw var1 = this.field_105918_d.func_105792_a();
            if(var1 != null) {
               this.field_105923_j = this.field_105925_i.nextInt(12000) + 12000;
               field_105922_a.func_102742_backgroundMusic("BgMusic", var1.field_105926_b, var1.field_105927_a, false);
               field_105922_a.func_102816_setVolume("BgMusic", this.field_105916_f.field_111721_a);
               field_105922_a.func_102813_play("BgMusic");
            }
         }

      }
   }

   public void func_105900_a(C_100595_ln var1, float var2) {
      if(field_105924_h && this.field_105916_f.field_111719_b != 0.0F) {
         if(var1 != null) {
            float var3 = var1.field_103178_B + (var1.field_103236_z - var1.field_103178_B) * var2;
            double var4 = var1.field_103227_q + (var1.field_103221_t - var1.field_103227_q) * (double)var2;
            double var6 = var1.field_103225_r + (var1.field_103219_u - var1.field_103225_r) * (double)var2;
            double var8 = var1.field_103223_s + (var1.field_103217_v - var1.field_103223_s) * (double)var2;
            float var10 = C_100650_jv.func_108928_b(-var3 * 0.017453292F - 3.1415927F);
            float var11 = C_100650_jv.func_108924_a(-var3 * 0.017453292F - 3.1415927F);
            float var12 = -var11;
            float var13 = 0.0F;
            float var14 = -var10;
            float var15 = 0.0F;
            float var16 = 1.0F;
            float var17 = 0.0F;
            field_105922_a.func_102747_setListenerPosition((float)var4, (float)var6, (float)var8);
            field_105922_a.func_102833_setListenerOrientation(var12, var13, var14, var15, var16, var17);
         }
      }
   }

   public void func_105906_d() {
      Iterator var1 = this.field_105917_g.iterator();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         field_105922_a.func_102751_stop(var2);
      }

      this.field_105917_g.clear();
   }

   public void func_105894_a(String var1, float var2, float var3, float var4) {
      if(field_105924_h && (this.field_105916_f.field_111719_b != 0.0F || var1 == null)) {
         String var5 = "streaming";
         if(field_105922_a.func_102822_playing(var5)) {
            field_105922_a.func_102751_stop(var5);
         }

         if(var1 != null) {
            C_100106_bcw var6 = this.field_105921_c.func_105794_a(var1);
            if(var6 != null) {
               if(field_105922_a.func_102822_playing("BgMusic")) {
                  field_105922_a.func_102751_stop("BgMusic");
               }

               float var7 = 16.0F;
               field_105922_a.func_102785_newStreamingSource(true, var5, var6.field_105926_b, var6.field_105927_a, false, var2, var3, var4, 2, var7 * 4.0F);
               field_105922_a.func_102816_setVolume(var5, 0.5F * this.field_105916_f.field_111719_b);
               field_105922_a.func_102813_play(var5);
            }

         }
      }
   }

   public void func_105910_a(C_100730_lb var1) {
      this.func_105912_a(var1, var1);
   }

   public void func_105912_a(C_100730_lb var1, C_100730_lb var2) {
      String var3 = "entity_" + var1.field_103212_k;
      if(this.field_105917_g.contains(var3)) {
         if(field_105922_a.func_102822_playing(var3)) {
            field_105922_a.func_102782_setPosition(var3, (float)var2.field_103221_t, (float)var2.field_103219_u, (float)var2.field_103217_v);
            field_105922_a.func_102740_setVelocity(var3, (float)var2.field_103215_w, (float)var2.field_103240_x, (float)var2.field_103238_y);
         } else {
            this.field_105917_g.remove(var3);
         }
      }

   }

   public boolean func_105897_b(C_100730_lb var1) {
      if(var1 != null && field_105924_h && this.field_105916_f.field_111721_a != 0.0F) {
         String var2 = "entity_" + var1.field_103212_k;
         return field_105922_a.func_102822_playing(var2);
      } else {
         return false;
      }
   }

   public void func_105909_c(C_100730_lb var1) {
      if(var1 != null && field_105924_h && this.field_105916_f.field_111721_a != 0.0F) {
         String var2 = "entity_" + var1.field_103212_k;
         if(this.field_105917_g.contains(var2)) {
            if(field_105922_a.func_102822_playing(var2)) {
               field_105922_a.func_102751_stop(var2);
            }

            this.field_105917_g.remove(var2);
         }

      }
   }

   public void func_105903_a(C_100730_lb var1, float var2) {
      if(var1 != null && field_105924_h && this.field_105916_f.field_111721_a != 0.0F) {
         if(field_105924_h && this.field_105916_f.field_111719_b != 0.0F) {
            String var3 = "entity_" + var1.field_103212_k;
            if(field_105922_a.func_102822_playing(var3)) {
               field_105922_a.func_102816_setVolume(var3, var2 * this.field_105916_f.field_111719_b);
            }
         }
      }
   }

   public void func_105907_b(C_100730_lb var1, float var2) {
      if(var1 != null && field_105924_h && this.field_105916_f.field_111721_a != 0.0F) {
         if(field_105924_h && this.field_105916_f.field_111719_b != 0.0F) {
            String var3 = "entity_" + var1.field_103212_k;
            if(field_105922_a.func_102822_playing(var3)) {
               field_105922_a.func_102765_setPitch(var3, var2);
            }
         }
      }
   }

   public void func_105899_a(String var1, C_100730_lb var2, float var3, float var4, boolean var5) {
      if(var2 != null) {
         if(field_105924_h && (this.field_105916_f.field_111719_b != 0.0F || var1 == null)) {
            String var6 = "entity_" + var2.field_103212_k;
            if(this.field_105917_g.contains(var6)) {
               this.func_105910_a(var2);
            } else {
               if(field_105922_a.func_102822_playing(var6)) {
                  field_105922_a.func_102751_stop(var6);
               }

               if(var1 == null) {
                  return;
               }

               C_100106_bcw var7 = this.field_105920_b.func_105794_a(var1);
               if(var7 != null && var3 > 0.0F) {
                  float var8 = 16.0F;
                  if(var3 > 1.0F) {
                     var8 *= var3;
                  }

                  field_105922_a.func_102793_newSource(var5, var6, var7.field_105926_b, var7.field_105927_a, false, (float)var2.field_103221_t, (float)var2.field_103219_u, (float)var2.field_103217_v, 2, var8);
                  field_105922_a.func_102732_setLooping(var6, true);
                  field_105922_a.func_102765_setPitch(var6, var4);
                  if(var3 > 1.0F) {
                     var3 = 1.0F;
                  }

                  field_105922_a.func_102816_setVolume(var6, var3 * this.field_105916_f.field_111719_b);
                  field_105922_a.func_102740_setVelocity(var6, (float)var2.field_103215_w, (float)var2.field_103240_x, (float)var2.field_103238_y);
                  field_105922_a.func_102813_play(var6);
                  this.field_105917_g.add(var6);
               }
            }

         }
      }
   }

   public void func_105898_a(String var1, float var2, float var3, float var4, float var5, float var6) {
      if(field_105924_h && this.field_105916_f.field_111719_b != 0.0F) {
         C_100106_bcw var7 = this.field_105920_b.func_105794_a(var1);
         if(var7 != null && var5 > 0.0F) {
            this.field_105919_e = (this.field_105919_e + 1) % 256;
            String var8 = "sound_" + this.field_105919_e;
            float var9 = 16.0F;
            if(var5 > 1.0F) {
               var9 *= var5;
            }

            field_105922_a.func_102793_newSource(var5 > 1.0F, var8, var7.field_105926_b, var7.field_105927_a, false, var2, var3, var4, 2, var9);
            field_105922_a.func_102765_setPitch(var8, var6);
            if(var5 > 1.0F) {
               var5 = 1.0F;
            }

            field_105922_a.func_102816_setVolume(var8, var5 * this.field_105916_f.field_111719_b);
            field_105922_a.func_102813_play(var8);
         }

      }
   }

   public void func_105895_a(String var1, float var2, float var3) {
      if(field_105924_h && this.field_105916_f.field_111719_b != 0.0F) {
         C_100106_bcw var4 = this.field_105920_b.func_105794_a(var1);
         if(var4 != null) {
            this.field_105919_e = (this.field_105919_e + 1) % 256;
            String var5 = "sound_" + this.field_105919_e;
            field_105922_a.func_102793_newSource(false, var5, var4.field_105926_b, var4.field_105927_a, false, 0.0F, 0.0F, 0.0F, 0, 0.0F);
            if(var2 > 1.0F) {
               var2 = 1.0F;
            }

            var2 *= 0.25F;
            field_105922_a.func_102765_setPitch(var5, var3);
            field_105922_a.func_102816_setVolume(var5, var2 * this.field_105916_f.field_111719_b);
            field_105922_a.func_102813_play(var5);
         }

      }
   }

   public void func_105911_e() {
      Iterator var1 = this.field_105917_g.iterator();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         field_105922_a.func_102745_pause(var2);
      }

   }

   public void func_105902_f() {
      Iterator var1 = this.field_105917_g.iterator();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         field_105922_a.func_102813_play(var2);
      }

   }

}
