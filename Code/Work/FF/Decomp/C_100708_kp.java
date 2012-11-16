import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.UUID;
import java.util.Map.Entry;

public class C_100708_kp {

   private Map field_109275_a = new HashMap();
   private final String field_109273_b = UUID.randomUUID().toString();
   private final URL field_109274_c;
   private final C_100712_kr field_109271_d;
   private final Timer field_109272_e = new Timer("Snooper Timer", true);
   private final Object field_109269_f = new Object();
   private boolean field_109270_g = false;
   private int field_109276_h = 0;


   public C_100708_kp(String var1, C_100712_kr var2) {
      try {
         this.field_109274_c = new URL("http://snoop.minecraft.net/" + var1 + "?version=" + 1);
      } catch (MalformedURLException var4) {
         throw new IllegalArgumentException();
      }

      this.field_109271_d = var2;
   }

   public void func_109255_a() {
      if(!this.field_109270_g) {
         this.field_109270_g = true;
         this.func_109260_g();
         this.field_109272_e.schedule(new C_100710_kq(this), 0L, 900000L);
      }
   }

   private void func_109260_g() {
      this.func_109267_h();
      this.func_109265_a("snooper_token", this.field_109273_b);
      this.func_109265_a("os_name", System.getProperty("os.name"));
      this.func_109265_a("os_version", System.getProperty("os.version"));
      this.func_109265_a("os_architecture", System.getProperty("os.arch"));
      this.func_109265_a("java_version", System.getProperty("java.version"));
      this.func_109265_a("version", "1.4.2");
      this.field_109271_d.func_102907_b(this);
   }

   private void func_109267_h() {
      RuntimeMXBean var1 = ManagementFactory.getRuntimeMXBean();
      List var2 = var1.getInputArguments();
      int var3 = 0;
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         if(var5.startsWith("-X")) {
            this.func_109265_a("jvm_arg[" + var3++ + "]", var5);
         }
      }

      this.func_109265_a("jvm_args", Integer.valueOf(var3));
   }

   public void func_109264_b() {
      this.func_109265_a("memory_total", Long.valueOf(Runtime.getRuntime().totalMemory()));
      this.func_109265_a("memory_max", Long.valueOf(Runtime.getRuntime().maxMemory()));
      this.func_109265_a("memory_free", Long.valueOf(Runtime.getRuntime().freeMemory()));
      this.func_109265_a("cpu_cores", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
      this.field_109271_d.func_102905_a(this);
   }

   public void func_109265_a(String var1, Object var2) {
      Object var3 = this.field_109269_f;
      synchronized(this.field_109269_f) {
         this.field_109275_a.put(var1, var2);
      }
   }

   public Map func_109257_c() {
      LinkedHashMap var1 = new LinkedHashMap();
      Object var2 = this.field_109269_f;
      synchronized(this.field_109269_f) {
         this.func_109264_b();
         Iterator var3 = this.field_109275_a.entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            var1.put(var4.getKey(), var4.getValue().toString());
         }

         return var1;
      }
   }

   public boolean func_109261_d() {
      return this.field_109270_g;
   }

   public void func_109263_e() {
      this.field_109272_e.cancel();
   }

   public String func_109256_f() {
      return this.field_109273_b;
   }

   // $FF: synthetic method
   static C_100712_kr func_109259_a(C_100708_kp var0) {
      return var0.field_109271_d;
   }

   // $FF: synthetic method
   static Object func_109262_b(C_100708_kp var0) {
      return var0.field_109269_f;
   }

   // $FF: synthetic method
   static Map func_109258_c(C_100708_kp var0) {
      return var0.field_109275_a;
   }

   // $FF: synthetic method
   static int func_109268_d(C_100708_kp var0) {
      return var0.field_109276_h++;
   }

   // $FF: synthetic method
   static URL func_109266_e(C_100708_kp var0) {
      return var0.field_109274_c;
   }
}
