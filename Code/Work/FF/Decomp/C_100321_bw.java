import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C_100321_bw implements C_100323_bv {

   private static final SocketAddress field_107479_a = new InetSocketAddress("127.0.0.1", 0);
   private final List field_107477_b = Collections.synchronizedList(new ArrayList());
   private C_100321_bw field_107478_c;
   private C_100221_dy field_107475_d;
   private boolean field_107476_e = false;
   private String field_107473_f = "";
   private Object[] field_107474_g;
   private boolean field_107480_h = false;


   public C_100321_bw(C_100221_dy var1) {
      this.field_107475_d = var1;
   }

   public void func_107418_a(C_100221_dy var1) {
      this.field_107475_d = var1;
   }

   public void func_107413_a(C_100219_dx var1) {
      if(!this.field_107476_e) {
         this.field_107478_c.func_107468_b(var1);
      }
   }

   public void func_107421_f() {
      this.field_107478_c = null;
      this.field_107475_d = null;
   }

   public boolean func_107469_g() {
      return !this.field_107476_e && this.field_107478_c != null;
   }

   public void func_107417_a() {}

   public void func_107419_b() {
      int var1 = 2500;

      while(var1-- >= 0 && !this.field_107477_b.isEmpty()) {
         C_100219_dx var2 = (C_100219_dx)this.field_107477_b.remove(0);
         var2.func_106539_a(this.field_107475_d);
      }

      if(this.field_107477_b.size() > var1) {
         System.out.println("Memory connection overburdened; after processing 2500 packets, we still have " + this.field_107477_b.size() + " to go!");
      }

      if(this.field_107476_e && this.field_107477_b.isEmpty()) {
         this.field_107475_d.func_106986_a(this.field_107473_f, this.field_107474_g);
      }

   }

   public SocketAddress func_107420_c() {
      return field_107479_a;
   }

   public void func_107414_d() {
      this.field_107476_e = true;
   }

   public void func_107415_a(String var1, Object ... var2) {
      this.field_107476_e = true;
      this.field_107473_f = var1;
      this.field_107474_g = var2;
   }

   public int func_107416_e() {
      return 0;
   }

   public void func_107470_a(C_100321_bw var1) {
      this.field_107478_c = var1;
      var1.field_107478_c = this;
   }

   public boolean func_107467_h() {
      return this.field_107480_h;
   }

   public void func_107471_a(boolean var1) {
      this.field_107480_h = var1;
   }

   public C_100321_bw func_107472_i() {
      return this.field_107478_c;
   }

   public void func_107468_b(C_100219_dx var1) {
      String var2 = this.field_107475_d.func_106958_a()?">":"<";
      if(var1.func_106547_a_() && this.field_107475_d.func_106933_b()) {
         var1.func_106539_a(this.field_107475_d);
      } else {
         this.field_107477_b.add(var1);
      }

   }

}
