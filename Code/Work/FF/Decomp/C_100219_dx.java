import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class C_100219_dx {

   public static C_100661_jq field_106564_l = new C_100661_jq();
   private static Map field_106561_a = new HashMap();
   private static Set field_106556_b = new HashSet();
   private static Set field_106558_c = new HashSet();
   public final long field_106565_m = System.currentTimeMillis();
   public static long field_106562_n;
   public static long field_106563_o;
   public static long field_106560_p;
   public static long field_106559_q;
   public boolean field_106557_r = false;


   static void func_106553_a(int var0, boolean var1, boolean var2, Class var3) {
      if(field_106564_l.func_109034_b(var0)) {
         throw new IllegalArgumentException("Duplicate packet id:" + var0);
      } else if(field_106561_a.containsKey(var3)) {
         throw new IllegalArgumentException("Duplicate packet class:" + var3);
      } else {
         field_106564_l.func_109035_a(var0, var3);
         field_106561_a.put(var3, Integer.valueOf(var0));
         if(var1) {
            field_106556_b.add(Integer.valueOf(var0));
         }

         if(var2) {
            field_106558_c.add(Integer.valueOf(var0));
         }

      }
   }

   public static C_100219_dx func_106545_d(int var0) {
      try {
         Class var1 = (Class)field_106564_l.func_109038_a(var0);
         return var1 == null?null:(C_100219_dx)var1.newInstance();
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("Skipping packet with id " + var0);
         return null;
      }
   }

   public static void func_106546_a(DataOutputStream var0, byte[] var1) {
      var0.writeShort(var1.length);
      var0.write(var1);
   }

   public static byte[] func_106549_b(DataInputStream var0) {
      short var1 = var0.readShort();
      if(var1 < 0) {
         throw new IOException("Key was smaller than nothing!  Weird key!");
      } else {
         byte[] var2 = new byte[var1];
         var0.read(var2);
         return var2;
      }
   }

   public final int func_106550_k() {
      return ((Integer)field_106561_a.get(this.getClass())).intValue();
   }

   public static C_100219_dx func_106541_a(DataInputStream var0, boolean var1, Socket var2) {
      boolean var3 = false;
      C_100219_dx var4 = null;
      int var5 = var2.getSoTimeout();

      int var8;
      try {
         var8 = var0.read();
         if(var8 == -1) {
            return null;
         }

         if(var1 && !field_106558_c.contains(Integer.valueOf(var8)) || !var1 && !field_106556_b.contains(Integer.valueOf(var8))) {
            throw new IOException("Bad packet id " + var8);
         }

         var4 = func_106545_d(var8);
         if(var4 == null) {
            throw new IOException("Bad packet id " + var8);
         }

         if(var4 instanceof C_100238_dg) {
            var2.setSoTimeout(1500);
         }

         var4.func_106537_a(var0);
         ++field_106562_n;
         field_106563_o += (long)var4.func_106552_a();
      } catch (EOFException var7) {
         System.out.println("Reached end of stream");
         return null;
      }

      C_100651_jw.func_108936_a(var8, (long)var4.func_106552_a());
      ++field_106562_n;
      field_106563_o += (long)var4.func_106552_a();
      var2.setSoTimeout(var5);
      return var4;
   }

   public static void func_106538_a(C_100219_dx var0, DataOutputStream var1) {
      var1.write(var0.func_106550_k());
      var0.func_106544_a(var1);
      ++field_106560_p;
      field_106559_q += (long)var0.func_106552_a();
   }

   public static void func_106543_a(String var0, DataOutputStream var1) {
      if(var0.length() > 32767) {
         throw new IOException("String too big");
      } else {
         var1.writeShort(var0.length());
         var1.writeChars(var0);
      }
   }

   public static String func_106551_a(DataInputStream var0, int var1) {
      short var2 = var0.readShort();
      if(var2 > var1) {
         throw new IOException("Received string length longer than maximum allowed (" + var2 + " > " + var1 + ")");
      } else if(var2 < 0) {
         throw new IOException("Received string length is less than zero! Weird string!");
      } else {
         StringBuilder var3 = new StringBuilder();

         for(int var4 = 0; var4 < var2; ++var4) {
            var3.append(var0.readChar());
         }

         return var3.toString();
      }
   }

   public abstract void func_106537_a(DataInputStream var1);

   public abstract void func_106544_a(DataOutputStream var1);

   public abstract void func_106539_a(C_100221_dy var1);

   public abstract int func_106552_a();

   public boolean func_106548_e() {
      return false;
   }

   public boolean func_106542_a(C_100219_dx var1) {
      return false;
   }

   public boolean func_106547_a_() {
      return false;
   }

   public String toString() {
      String var1 = this.getClass().getSimpleName();
      return var1;
   }

   public static C_100994_tv func_106540_c(DataInputStream var0) {
      C_100994_tv var1 = null;
      short var2 = var0.readShort();
      if(var2 >= 0) {
         byte var3 = var0.readByte();
         short var4 = var0.readShort();
         var1 = new C_100994_tv(var2, var3, var4);
         var1.field_111394_d = func_106536_d(var0);
      }

      return var1;
   }

   public static void func_106555_a(C_100994_tv var0, DataOutputStream var1) {
      if(var0 == null) {
         var1.writeShort(-1);
      } else {
         var1.writeShort(var0.field_111397_c);
         var1.writeByte(var0.field_111398_a);
         var1.writeShort(var0.func_111367_j());
         C_100353_bh var2 = null;
         if(var0.func_111365_b().func_110765_n() || var0.func_111365_b().func_110746_q()) {
            var2 = var0.field_111394_d;
         }

         func_106554_a(var2, var1);
      }

   }

   public static C_100353_bh func_106536_d(DataInputStream var0) {
      short var1 = var0.readShort();
      if(var1 < 0) {
         return null;
      } else {
         byte[] var2 = new byte[var1];
         var0.readFully(var2);
         return C_100329_br.func_107550_a(var2);
      }
   }

   protected static void func_106554_a(C_100353_bh var0, DataOutputStream var1) {
      if(var0 == null) {
         var1.writeShort(-1);
      } else {
         byte[] var2 = C_100329_br.func_107548_a(var0);
         var1.writeShort((short)var2.length);
         var1.write(var2);
      }

   }

   static {
      func_106553_a(0, true, true, C_100242_di.class);
      func_106553_a(1, true, true, C_100252_do.class);
      func_106553_a(2, false, true, C_100384_cq.class);
      func_106553_a(3, true, true, C_100392_cm.class);
      func_106553_a(4, true, false, C_100305_es.class);
      func_106553_a(5, true, false, C_100299_en.class);
      func_106553_a(6, true, false, C_100307_er.class);
      func_106553_a(7, false, true, C_100244_dh.class);
      func_106553_a(8, true, false, C_100295_ep.class);
      func_106553_a(9, true, true, C_100281_eg.class);
      func_106553_a(10, true, true, C_100214_dt.class);
      func_106553_a(11, true, true, C_100215_du.class);
      func_106553_a(12, true, true, C_100217_dw.class);
      func_106553_a(13, true, true, C_100216_dv.class);
      func_106553_a(14, false, true, C_100229_ea.class);
      func_106553_a(15, false, true, C_100277_fc.class);
      func_106553_a(16, false, true, C_100291_ej.class);
      func_106553_a(17, true, false, C_100363_dc.class);
      func_106553_a(18, true, true, C_100401_cj.class);
      func_106553_a(19, false, true, C_100231_eb.class);
      func_106553_a(20, true, false, C_100399_ci.class);
      func_106553_a(21, true, false, C_100409_cf.class);
      func_106553_a(22, true, false, C_100267_ev.class);
      func_106553_a(23, true, false, C_100411_cc.class);
      func_106553_a(24, true, false, C_100403_cg.class);
      func_106553_a(25, true, false, C_100405_ch.class);
      func_106553_a(26, true, false, C_100413_cd.class);
      func_106553_a(28, true, false, C_100301_em.class);
      func_106553_a(29, true, false, C_100285_ee.class);
      func_106553_a(30, true, false, C_100258_dp.class);
      func_106553_a(31, true, false, C_100256_dq.class);
      func_106553_a(32, true, false, C_100260_ds.class);
      func_106553_a(33, true, false, C_100262_dr.class);
      func_106553_a(34, true, false, C_100263_ew.class);
      func_106553_a(35, true, false, C_100279_eh.class);
      func_106553_a(38, true, false, C_100236_dd.class);
      func_106553_a(39, true, false, C_100309_eq.class);
      func_106553_a(40, true, false, C_100287_el.class);
      func_106553_a(41, true, false, C_100276_fb.class);
      func_106553_a(42, true, false, C_100283_ef.class);
      func_106553_a(43, true, false, C_100297_eo.class);
      func_106553_a(51, true, false, C_100246_dj.class);
      func_106553_a(52, true, false, C_100394_cn.class);
      func_106553_a(53, true, false, C_100273_fa.class);
      func_106553_a(54, true, false, C_100272_ez.class);
      func_106553_a(55, true, false, C_100265_ex.class);
      func_106553_a(56, true, false, C_100250_dl.class);
      func_106553_a(60, true, false, C_100235_de.class);
      func_106553_a(61, true, false, C_100248_dm.class);
      func_106553_a(62, true, false, C_100254_dn.class);
      func_106553_a(70, true, false, C_100240_df.class);
      func_106553_a(71, true, false, C_100407_ce.class);
      func_106553_a(100, true, false, C_100374_cw.class);
      func_106553_a(101, true, true, C_100376_cv.class);
      func_106553_a(102, false, true, C_100378_cu.class);
      func_106553_a(103, true, false, C_100371_cz.class);
      func_106553_a(104, true, false, C_100373_cx.class);
      func_106553_a(105, true, false, C_100372_cy.class);
      func_106553_a(106, true, true, C_100382_cs.class);
      func_106553_a(107, true, true, C_100289_ek.class);
      func_106553_a(108, false, true, C_100380_ct.class);
      func_106553_a(130, true, true, C_100266_eu.class);
      func_106553_a(131, true, false, C_100386_cr.class);
      func_106553_a(132, true, false, C_100271_ey.class);
      func_106553_a(200, true, false, C_100395_ck.class);
      func_106553_a(201, true, false, C_100233_ec.class);
      func_106553_a(202, true, true, C_100223_dz.class);
      func_106553_a(203, true, true, C_100397_cl.class);
      func_106553_a(204, false, true, C_100390_cp.class);
      func_106553_a(205, false, true, C_100388_co.class);
      func_106553_a(250, true, true, C_100367_da.class);
      func_106553_a(252, true, true, C_100303_et.class);
      func_106553_a(253, true, false, C_100293_ei.class);
      func_106553_a(254, false, true, C_100238_dg.class);
      func_106553_a(255, true, true, C_100365_db.class);
   }
}
