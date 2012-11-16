import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class C_100331_bu {

   public static final String[] field_107493_b = new String[]{"END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]"};
   private String field_107494_a;


   abstract void func_107484_a(DataOutput var1);

   abstract void func_107487_a(DataInput var1);

   public abstract byte func_107483_a();

   protected C_100331_bu(String var1) {
      if(var1 == null) {
         this.field_107494_a = "";
      } else {
         this.field_107494_a = var1;
      }

   }

   public C_100331_bu func_107489_p(String var1) {
      if(var1 == null) {
         this.field_107494_a = "";
      } else {
         this.field_107494_a = var1;
      }

      return this;
   }

   public String func_107492_e() {
      return this.field_107494_a == null?"":this.field_107494_a;
   }

   public static C_100331_bu func_107486_b(DataInput var0) {
      byte var1 = var0.readByte();
      if(var1 == 0) {
         return new C_100345_bl();
      } else {
         String var2 = var0.readUTF();
         C_100331_bu var3 = func_107490_a(var1, var2);

         try {
            var3.func_107487_a(var0);
            return var3;
         } catch (IOException var6) {
            C_100007_a var5 = new C_100007_a("loading nbt data", var6);
            var5.func_105189_a("Tag name", var2);
            var5.func_105189_a("Tag type", Byte.valueOf(var1));
            throw new C_100010_l(var5);
         }
      }
   }

   public static void func_107491_a(C_100331_bu var0, DataOutput var1) {
      var1.writeByte(var0.func_107483_a());
      if(var0.func_107483_a() != 0) {
         var1.writeUTF(var0.func_107492_e());
         var0.func_107484_a(var1);
      }
   }

   public static C_100331_bu func_107490_a(byte var0, String var1) {
      switch(var0) {
      case 0:
         return new C_100345_bl();
      case 1:
         return new C_100351_bg(var1);
      case 2:
         return new C_100327_bs(var1);
      case 3:
         return new C_100337_bo(var1);
      case 4:
         return new C_100341_bq(var1);
      case 5:
         return new C_100347_bm(var1);
      case 6:
         return new C_100343_bk(var1);
      case 7:
         return new C_100349_bf(var1);
      case 8:
         return new C_100333_bt(var1);
      case 9:
         return new C_100339_bp(var1);
      case 10:
         return new C_100353_bh(var1);
      case 11:
         return new C_100335_bn(var1);
      default:
         return null;
      }
   }

   public static String func_107488_a(byte var0) {
      switch(var0) {
      case 0:
         return "TAG_End";
      case 1:
         return "TAG_Byte";
      case 2:
         return "TAG_Short";
      case 3:
         return "TAG_Int";
      case 4:
         return "TAG_Long";
      case 5:
         return "TAG_Float";
      case 6:
         return "TAG_Double";
      case 7:
         return "TAG_Byte_Array";
      case 8:
         return "TAG_String";
      case 9:
         return "TAG_List";
      case 10:
         return "TAG_Compound";
      case 11:
         return "TAG_Int_Array";
      default:
         return "UNKNOWN";
      }
   }

   public abstract C_100331_bu func_107485_b();

   public boolean equals(Object var1) {
      if(!(var1 instanceof C_100331_bu)) {
         return false;
      } else {
         C_100331_bu var2 = (C_100331_bu)var1;
         return this.func_107483_a() != var2.func_107483_a()?false:((this.field_107494_a != null || var2.field_107494_a == null) && (this.field_107494_a == null || var2.field_107494_a != null)?this.field_107494_a == null || this.field_107494_a.equals(var2.field_107494_a):false);
      }
   }

   public int hashCode() {
      return this.field_107494_a.hashCode() ^ this.func_107483_a();
   }

}
