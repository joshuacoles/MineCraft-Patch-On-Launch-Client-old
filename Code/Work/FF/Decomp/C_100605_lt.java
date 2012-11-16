import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class C_100605_lt {

   private static final HashMap field_108858_a = new HashMap();
   private final Map field_108856_b = new HashMap();
   private boolean field_108857_c;
   private ReadWriteLock field_108855_d = new ReentrantReadWriteLock();


   public void func_108841_a(int var1, Object var2) {
      Integer var3 = (Integer)field_108858_a.get(var2.getClass());
      if(var3 == null) {
         throw new IllegalArgumentException("Unknown data type: " + var2.getClass());
      } else if(var1 > 31) {
         throw new IllegalArgumentException("Data value id is too big with " + var1 + "! (Max is " + 31 + ")");
      } else if(this.field_108856_b.containsKey(Integer.valueOf(var1))) {
         throw new IllegalArgumentException("Duplicate id value for " + var1 + "!");
      } else {
         C_100604_lu var4 = new C_100604_lu(var3.intValue(), var1, var2);
         this.field_108855_d.writeLock().lock();
         this.field_108856_b.put(Integer.valueOf(var1), var4);
         this.field_108855_d.writeLock().unlock();
      }
   }

   public void func_108853_a(int var1, int var2) {
      C_100604_lu var3 = new C_100604_lu(var2, var1, (Object)null);
      this.field_108855_d.writeLock().lock();
      this.field_108856_b.put(Integer.valueOf(var1), var3);
      this.field_108855_d.writeLock().unlock();
   }

   public byte func_108842_a(int var1) {
      return ((Byte)this.func_108850_i(var1).func_108826_b()).byteValue();
   }

   public short func_108854_b(int var1) {
      return ((Short)this.func_108850_i(var1).func_108826_b()).shortValue();
   }

   public int func_108837_c(int var1) {
      return ((Integer)this.func_108850_i(var1).func_108826_b()).intValue();
   }

   public String func_108839_e(int var1) {
      return (String)this.func_108850_i(var1).func_108826_b();
   }

   public C_100994_tv func_108840_f(int var1) {
      return (C_100994_tv)this.func_108850_i(var1).func_108826_b();
   }

   private C_100604_lu func_108850_i(int var1) {
      this.field_108855_d.readLock().lock();

      C_100604_lu var2;
      try {
         var2 = (C_100604_lu)this.field_108856_b.get(Integer.valueOf(var1));
      } catch (Throwable var5) {
         C_100007_a var4 = new C_100007_a("getting synched entity data", var5);
         var4.func_105189_a("EntityData ID", Integer.valueOf(var1));
         throw new C_100010_l(var4);
      }

      this.field_108855_d.readLock().unlock();
      return var2;
   }

   public void func_108851_b(int var1, Object var2) {
      C_100604_lu var3 = this.func_108850_i(var1);
      if(!var2.equals(var3.func_108826_b())) {
         var3.func_108830_a(var2);
         var3.func_108828_a(true);
         this.field_108857_c = true;
      }

   }

   public void func_108852_h(int var1) {
      C_100604_lu.func_108831_a(this.func_108850_i(var1), true);
      this.field_108857_c = true;
   }

   public boolean func_108843_a() {
      return this.field_108857_c;
   }

   public static void func_108838_a(List var0, DataOutputStream var1) {
      if(var0 != null) {
         Iterator var2 = var0.iterator();

         while(var2.hasNext()) {
            C_100604_lu var3 = (C_100604_lu)var2.next();
            func_108849_a(var1, var3);
         }
      }

      var1.writeByte(127);
   }

   public List func_108848_b() {
      ArrayList var1 = null;
      if(this.field_108857_c) {
         this.field_108855_d.readLock().lock();
         Iterator var2 = this.field_108856_b.values().iterator();

         while(var2.hasNext()) {
            C_100604_lu var3 = (C_100604_lu)var2.next();
            if(var3.func_108827_d()) {
               var3.func_108828_a(false);
               if(var1 == null) {
                  var1 = new ArrayList();
               }

               var1.add(var3);
            }
         }

         this.field_108855_d.readLock().unlock();
      }

      this.field_108857_c = false;
      return var1;
   }

   public void func_108847_a(DataOutputStream var1) {
      this.field_108855_d.readLock().lock();
      Iterator var2 = this.field_108856_b.values().iterator();

      while(var2.hasNext()) {
         C_100604_lu var3 = (C_100604_lu)var2.next();
         func_108849_a(var1, var3);
      }

      this.field_108855_d.readLock().unlock();
      var1.writeByte(127);
   }

   public List func_108844_c() {
      ArrayList var1 = null;
      this.field_108855_d.readLock().lock();

      C_100604_lu var3;
      for(Iterator var2 = this.field_108856_b.values().iterator(); var2.hasNext(); var1.add(var3)) {
         var3 = (C_100604_lu)var2.next();
         if(var1 == null) {
            var1 = new ArrayList();
         }
      }

      this.field_108855_d.readLock().unlock();
      return var1;
   }

   private static void func_108849_a(DataOutputStream var0, C_100604_lu var1) {
      int var2 = (var1.func_108832_c() << 5 | var1.func_108829_a() & 31) & 255;
      var0.writeByte(var2);
      switch(var1.func_108832_c()) {
      case 0:
         var0.writeByte(((Byte)var1.func_108826_b()).byteValue());
         break;
      case 1:
         var0.writeShort(((Short)var1.func_108826_b()).shortValue());
         break;
      case 2:
         var0.writeInt(((Integer)var1.func_108826_b()).intValue());
         break;
      case 3:
         var0.writeFloat(((Float)var1.func_108826_b()).floatValue());
         break;
      case 4:
         C_100219_dx.func_106543_a((String)var1.func_108826_b(), var0);
         break;
      case 5:
         C_100994_tv var4 = (C_100994_tv)var1.func_108826_b();
         if(var4 == null) {
            var0.writeShort(-1);
         } else {
            var0.writeShort(var4.func_111365_b().field_110891_cf);
            var0.writeByte(var4.field_111398_a);
            var0.writeShort(var4.func_111367_j());
         }
         break;
      case 6:
         C_100013_k var3 = (C_100013_k)var1.func_108826_b();
         var0.writeInt(var3.field_105273_a);
         var0.writeInt(var3.field_105271_b);
         var0.writeInt(var3.field_105272_c);
      }

   }

   public static List func_108845_a(DataInputStream var0) {
      ArrayList var1 = null;

      for(byte var2 = var0.readByte(); var2 != 127; var2 = var0.readByte()) {
         if(var1 == null) {
            var1 = new ArrayList();
         }

         int var3 = (var2 & 224) >> 5;
         int var4 = var2 & 31;
         C_100604_lu var5 = null;
         switch(var3) {
         case 0:
            var5 = new C_100604_lu(var3, var4, Byte.valueOf(var0.readByte()));
            break;
         case 1:
            var5 = new C_100604_lu(var3, var4, Short.valueOf(var0.readShort()));
            break;
         case 2:
            var5 = new C_100604_lu(var3, var4, Integer.valueOf(var0.readInt()));
            break;
         case 3:
            var5 = new C_100604_lu(var3, var4, Float.valueOf(var0.readFloat()));
            break;
         case 4:
            var5 = new C_100604_lu(var3, var4, C_100219_dx.func_106551_a(var0, 64));
            break;
         case 5:
            short var6 = var0.readShort();
            if(var6 > -1) {
               byte var10 = var0.readByte();
               short var11 = var0.readShort();
               var5 = new C_100604_lu(var3, var4, new C_100994_tv(var6, var10, var11));
            } else {
               var5 = new C_100604_lu(var3, var4, (Object)null);
            }
            break;
         case 6:
            int var7 = var0.readInt();
            int var8 = var0.readInt();
            int var9 = var0.readInt();
            var5 = new C_100604_lu(var3, var4, new C_100013_k(var7, var8, var9));
         }

         var1.add(var5);
      }

      return var1;
   }

   public void func_108846_a(List var1) {
      this.field_108855_d.writeLock().lock();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         C_100604_lu var3 = (C_100604_lu)var2.next();
         C_100604_lu var4 = (C_100604_lu)this.field_108856_b.get(Integer.valueOf(var3.func_108829_a()));
         if(var4 != null) {
            var4.func_108830_a(var3.func_108826_b());
         }
      }

      this.field_108855_d.writeLock().unlock();
   }

   static {
      field_108858_a.put(Byte.class, Integer.valueOf(0));
      field_108858_a.put(Short.class, Integer.valueOf(1));
      field_108858_a.put(Integer.class, Integer.valueOf(2));
      field_108858_a.put(Float.class, Integer.valueOf(3));
      field_108858_a.put(String.class, Integer.valueOf(4));
      field_108858_a.put(C_100994_tv.class, Integer.valueOf(5));
      field_108858_a.put(C_100013_k.class, Integer.valueOf(6));
   }
}
