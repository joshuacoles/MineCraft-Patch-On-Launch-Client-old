package net.minecraft.client;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;
import net.minecraft.client.Minecraft;

public class MinecraftApplet extends Applet {

   private Canvas field_105165_a;
   private Minecraft field_105163_b;
   private Thread field_105164_c = null;


   public void init() {
      this.field_105165_a = new C_101118_aqz(this);
      boolean var1 = "true".equalsIgnoreCase(this.getParameter("fullscreen"));
      this.field_105163_b = new C_101128_ara(this, this.field_105165_a, this, this.getWidth(), this.getHeight(), var1);
      this.field_105163_b.field_105131_k = this.getDocumentBase().getHost();
      if(this.getDocumentBase().getPort() > 0) {
         this.field_105163_b.field_105131_k = this.field_105163_b.field_105131_k + ":" + this.getDocumentBase().getPort();
      }

      if(this.getParameter("username") != null && this.getParameter("sessionid") != null) {
         this.field_105163_b.field_105130_j = new C_101134_ark(this.getParameter("username"), this.getParameter("sessionid"));
         System.out.println("Setting user: " + this.field_105163_b.field_105130_j.field_111761_b + ", " + this.field_105163_b.field_105130_j.field_111762_c);
      } else {
         this.field_105163_b.field_105130_j = new C_101134_ark("Player", "");
      }

      this.field_105163_b.func_105070_a("true".equals(this.getParameter("demo")));
      if(this.getParameter("server") != null && this.getParameter("port") != null) {
         this.field_105163_b.func_105045_a(this.getParameter("server"), Integer.parseInt(this.getParameter("port")));
      }

      this.field_105163_b.field_105129_m = !"true".equals(this.getParameter("stand-alone"));
      this.setLayout(new BorderLayout());
      this.add(this.field_105165_a, "Center");
      this.field_105165_a.setFocusable(true);
      this.validate();
   }

   public void func_105161_a() {
      if(this.field_105164_c == null) {
         this.field_105164_c = new Thread(this.field_105163_b, "Minecraft main thread");
         this.field_105164_c.start();
      }
   }

   public void start() {
      if(this.field_105163_b != null) {
         this.field_105163_b.field_105126_n = false;
      }

   }

   public void stop() {
      if(this.field_105163_b != null) {
         this.field_105163_b.field_105126_n = true;
      }

   }

   public void destroy() {
      this.func_105162_b();
   }

   public void func_105162_b() {
      if(this.field_105164_c != null) {
         this.field_105163_b.func_105079_g();

         try {
            this.field_105164_c.join(10000L);
         } catch (InterruptedException var4) {
            try {
               this.field_105163_b.func_105084_e();
            } catch (Exception var3) {
               var3.printStackTrace();
            }
         }

         this.field_105164_c = null;
      }
   }
}
