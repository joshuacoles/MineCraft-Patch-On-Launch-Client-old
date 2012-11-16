import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;

public class C_100088_bcp {

   private static final C_100087_bco field_105683_a = new C_100084_bcl();
   private final Minecraft field_105681_b;
   private final File field_105682_c;
   private final File field_105679_d;
   private List field_105680_e = new ArrayList();
   private Map field_105677_f = new HashMap();
   private C_100087_bco field_105678_g;
   private boolean field_105684_h;


   public C_100088_bcp(File var1, Minecraft var2) {
      this.field_105681_b = var2;
      this.field_105682_c = new File(var1, "texturepacks");
      this.field_105679_d = new File(var1, "texturepacks-mp-cache");
      this.func_105676_h();
      this.func_105674_c();
   }

   private void func_105676_h() {
      if(!this.field_105682_c.isDirectory()) {
         this.field_105682_c.delete();
         this.field_105682_c.mkdirs();
      }

      if(!this.field_105679_d.isDirectory()) {
         this.field_105679_d.delete();
         this.field_105679_d.mkdirs();
      }

   }

   public boolean func_105671_a(C_100087_bco var1) {
      if(var1 == this.field_105678_g) {
         return false;
      } else {
         this.field_105684_h = false;
         this.field_105678_g = var1;
         this.field_105681_b.field_105156_y.field_111725_m = var1.func_105632_c();
         this.field_105681_b.field_105156_y.func_111684_b();
         return true;
      }
   }

   public void func_105663_a(String var1) {
      String var2 = var1.substring(var1.lastIndexOf("/") + 1);
      if(var2.contains("?")) {
         var2 = var2.substring(0, var2.indexOf("?"));
      }

      if(var2.endsWith(".zip")) {
         File var3 = new File(this.field_105679_d, var2);
         this.func_105664_a(var1, var3);
      }
   }

   private void func_105664_a(String var1, File var2) {
      HashMap var3 = new HashMap();
      C_101269_asu var4 = new C_101269_asu();
      var3.put("X-Minecraft-Username", this.field_105681_b.field_105130_j.field_111761_b);
      var3.put("X-Minecraft-Version", "1.4.2");
      var3.put("X-Minecraft-Supported-Resolutions", "16");
      this.field_105684_h = true;
      this.field_105681_b.func_105053_a(var4);
      C_100669_jm.func_109079_a(var2, var1, new C_100104_bcq(this), var3, 10000000, var4);
   }

   public boolean func_105662_a() {
      return this.field_105684_h;
   }

   public void func_105673_b() {
      this.field_105684_h = false;
      this.func_105674_c();
      this.field_105681_b.func_105075_y();
   }

   public void func_105674_c() {
      ArrayList var1 = new ArrayList();
      this.field_105678_g = field_105683_a;
      var1.add(field_105683_a);
      Iterator var2 = this.func_105666_i().iterator();

      while(var2.hasNext()) {
         File var3 = (File)var2.next();
         String var4 = this.func_105670_a(var3);
         if(var4 != null) {
            Object var5 = (C_100087_bco)this.field_105677_f.get(var4);
            if(var5 == null) {
               var5 = var3.isDirectory()?new C_100090_bcn(var4, var3):new C_100089_bcm(var4, var3);
               this.field_105677_f.put(var4, var5);
            }

            if(((C_100087_bco)var5).func_105632_c().equals(this.field_105681_b.field_105156_y.field_111725_m)) {
               this.field_105678_g = (C_100087_bco)var5;
            }

            var1.add(var5);
         }
      }

      this.field_105680_e.removeAll(var1);
      var2 = this.field_105680_e.iterator();

      while(var2.hasNext()) {
         C_100087_bco var6 = (C_100087_bco)var2.next();
         var6.func_105630_a(this.field_105681_b.field_105127_o);
         this.field_105677_f.remove(var6.func_105629_b());
      }

      this.field_105680_e = var1;
   }

   private String func_105670_a(File var1) {
      return var1.isFile() && var1.getName().toLowerCase().endsWith(".zip")?var1.getName() + ":" + var1.length() + ":" + var1.lastModified():(var1.isDirectory() && (new File(var1, "pack.txt")).exists()?var1.getName() + ":folder:" + var1.lastModified():null);
   }

   private List func_105666_i() {
      return this.field_105682_c.exists() && this.field_105682_c.isDirectory()?Arrays.asList(this.field_105682_c.listFiles()):Collections.emptyList();
   }

   public List func_105660_d() {
      return Collections.unmodifiableList(this.field_105680_e);
   }

   public C_100087_bco func_105667_e() {
      return this.field_105678_g;
   }

   public boolean func_105669_f() {
      if(!this.field_105681_b.field_105156_y.field_111738_s) {
         return false;
      } else {
         C_100909_axg var1 = this.field_105681_b.func_105047_z();
         return var1 == null?true:var1.func_110704_c();
      }
   }

   public boolean func_105665_g() {
      if(!this.field_105681_b.field_105156_y.field_111738_s) {
         return false;
      } else {
         C_100909_axg var1 = this.field_105681_b.func_105047_z();
         return var1 == null?false:var1.func_110703_b();
      }
   }

   // $FF: synthetic method
   static boolean func_105661_a(C_100088_bcp var0) {
      return var0.field_105684_h;
   }

   // $FF: synthetic method
   static C_100087_bco func_105672_a(C_100088_bcp var0, C_100087_bco var1) {
      return var0.field_105678_g = var1;
   }

   // $FF: synthetic method
   static String func_105675_a(C_100088_bcp var0, File var1) {
      return var0.func_105670_a(var1);
   }

   // $FF: synthetic method
   static Minecraft func_105668_b(C_100088_bcp var0) {
      return var0.field_105681_b;
   }

}
