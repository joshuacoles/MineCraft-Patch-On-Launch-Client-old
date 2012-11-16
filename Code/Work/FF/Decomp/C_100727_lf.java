import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class C_100727_lf {

   private static Map field_109320_b = new HashMap();
   private static Map field_109321_c = new HashMap();
   private static Map field_109318_d = new HashMap();
   private static Map field_109319_e = new HashMap();
   private static Map field_109317_f = new HashMap();
   public static HashMap field_109322_a = new LinkedHashMap();


   private static void func_109312_a(Class var0, String var1, int var2) {
      field_109320_b.put(var1, var0);
      field_109321_c.put(var0, var1);
      field_109318_d.put(Integer.valueOf(var2), var0);
      field_109319_e.put(var0, Integer.valueOf(var2));
      field_109317_f.put(var1, Integer.valueOf(var2));
   }

   private static void func_109310_a(Class var0, String var1, int var2, int var3, int var4) {
      func_109312_a(var0, var1, var2);
      field_109322_a.put(Integer.valueOf(var2), new C_100726_lg(var2, var3, var4));
   }

   public static C_100730_lb func_109316_a(String var0, C_100873_xe var1) {
      C_100730_lb var2 = null;

      try {
         Class var3 = (Class)field_109320_b.get(var0);
         if(var3 != null) {
            var2 = (C_100730_lb)var3.getConstructor(new Class[]{C_100873_xe.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static C_100730_lb func_109309_a(C_100353_bh var0, C_100873_xe var1) {
      C_100730_lb var2 = null;

      try {
         Class var3 = (Class)field_109320_b.get(var0.func_107534_i("id"));
         if(var3 != null) {
            var2 = (C_100730_lb)var3.getConstructor(new Class[]{C_100873_xe.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if(var2 != null) {
         var2.func_103077_e(var0);
      } else {
         System.out.println("Skipping Entity with id " + var0.func_107534_i("id"));
      }

      return var2;
   }

   public static C_100730_lb func_109314_a(int var0, C_100873_xe var1) {
      C_100730_lb var2 = null;

      try {
         Class var3 = (Class)field_109318_d.get(Integer.valueOf(var0));
         if(var3 != null) {
            var2 = (C_100730_lb)var3.getConstructor(new Class[]{C_100873_xe.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if(var2 == null) {
         System.out.println("Skipping Entity with id " + var0);
      }

      return var2;
   }

   public static int func_109315_a(C_100730_lb var0) {
      Class var1 = var0.getClass();
      return field_109319_e.containsKey(var1)?((Integer)field_109319_e.get(var1)).intValue():0;
   }

   public static String func_109313_b(C_100730_lb var0) {
      return (String)field_109321_c.get(var0.getClass());
   }

   public static String func_109311_a(int var0) {
      Class var1 = (Class)field_109318_d.get(Integer.valueOf(var0));
      return var1 != null?(String)field_109321_c.get(var1):null;
   }

   static {
      func_109312_a(C_100576_pg.class, "Item", 1);
      func_109312_a(C_100722_lj.class, "XPOrb", 2);
      func_109312_a(C_100600_lq.class, "Painting", 9);
      func_109312_a(C_101089_qi.class, "Arrow", 10);
      func_109312_a(C_101086_qp.class, "Snowball", 11);
      func_109312_a(C_101085_qm.class, "Fireball", 12);
      func_109312_a(C_101087_qo.class, "SmallFireball", 13);
      func_109312_a(C_101080_qs.class, "ThrownEnderpearl", 14);
      func_109312_a(C_101088_qj.class, "EyeOfEnderSignal", 15);
      func_109312_a(C_101078_qu.class, "ThrownPotion", 16);
      func_109312_a(C_101081_qt.class, "ThrownExpBottle", 17);
      func_109312_a(C_100596_lm.class, "ItemFrame", 18);
      func_109312_a(C_101079_qv.class, "WitherSkull", 19);
      func_109312_a(C_100591_pi.class, "PrimedTnt", 20);
      func_109312_a(C_100574_pf.class, "FallingSand", 21);
      func_109312_a(C_100590_ph.class, "Minecart", 40);
      func_109312_a(C_100572_pe.class, "Boat", 41);
      func_109312_a(C_100595_ln.class, "Mob", 48);
      func_109312_a(C_101110_ps.class, "Monster", 49);
      func_109310_a(C_100583_pl.class, "Creeper", 50, 894731, 0);
      func_109310_a(C_101106_pw.class, "Skeleton", 51, 12698049, 4802889);
      func_109310_a(C_101101_py.class, "Spider", 52, 3419431, 11013646);
      func_109312_a(C_101108_pq.class, "Giant", 53);
      func_109310_a(C_101097_qa.class, "Zombie", 54, '\uafaf', 7969893);
      func_109310_a(C_101100_px.class, "Slime", 55, 5349438, 8306542);
      func_109310_a(C_101107_pp.class, "Ghast", 56, 16382457, 12369084);
      func_109310_a(C_101103_pt.class, "PigZombie", 57, 15373203, 5009705);
      func_109310_a(C_100585_pm.class, "Enderman", 58, 1447446, 0);
      func_109310_a(C_100593_pk.class, "CaveSpider", 59, 803406, 11013646);
      func_109310_a(C_101105_pv.class, "Silverfish", 60, 7237230, 3158064);
      func_109310_a(C_100592_pj.class, "Blaze", 61, 16167425, 16775294);
      func_109310_a(C_101109_pr.class, "LavaSlime", 62, 3407872, 16579584);
      func_109312_a(C_100568_oy.class, "EnderDragon", 63);
      func_109312_a(C_100579_pa.class, "WitherBoss", 64);
      func_109310_a(C_100543_og.class, "Bat", 65, 4996656, 986895);
      func_109310_a(C_101102_pz.class, "Witch", 66, 3407872, 5349438);
      func_109310_a(C_100537_on.class, "Pig", 90, 15771042, 14377823);
      func_109310_a(C_100555_oo.class, "Sheep", 91, 15198183, 16758197);
      func_109310_a(C_100541_oj.class, "Cow", 92, 4470310, 10592673);
      func_109310_a(C_100540_oi.class, "Chicken", 93, 10592673, 16711680);
      func_109310_a(C_100558_oq.class, "Squid", 94, 2243405, 7375001);
      func_109310_a(C_100546_ot.class, "Wolf", 95, 14144467, 13545366);
      func_109310_a(C_100539_ol.class, "MushroomCow", 96, 10489616, 12040119);
      func_109312_a(C_100553_op.class, "SnowMan", 97);
      func_109310_a(C_100535_om.class, "Ozelot", 98, 15720061, 5653556);
      func_109312_a(C_100557_or.class, "VillagerGolem", 99);
      func_109310_a(C_101098_qd.class, "Villager", 120, 5651507, 12422002);
      func_109312_a(C_100563_ox.class, "EnderCrystal", 200);
   }
}
