package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101373_VorbisFile;
import com.jcraft.jorbis.C_101377_Comment;
import com.jcraft.jorbis.C_101390_Info;

class ChainingExample {

   public static void main(String[] var0) {
      C_101373_VorbisFile var1 = null;

      try {
         if(var0.length > 0) {
            var1 = new C_101373_VorbisFile(var0[0]);
         } else {
            var1 = new C_101373_VorbisFile(System.in, (byte[])null, -1);
         }
      } catch (Exception var5) {
         System.err.println(var5);
         return;
      }

      if(var1.func_101608_seekable()) {
         System.out.println("Input bitstream contained " + var1.func_101615_streams() + " logical bitstream section(s).");
         System.out.println("Total bitstream playing time: " + var1.func_101610_time_total(-1) + " seconds\n");
      } else {
         System.out.println("Standard input was not seekable.");
         System.out.println("First logical bitstream information:\n");
      }

      for(int var2 = 0; var2 < var1.func_101615_streams(); ++var2) {
         C_101390_Info var3 = var1.func_101616_getInfo(var2);
         System.out.println("\tlogical bitstream section " + (var2 + 1) + " information:");
         System.out.println("\t\t" + var3.field_101970_rate + "Hz " + var3.field_101988_channels + " channels bitrate " + var1.func_101630_bitrate(var2) / 1000 + "kbps serial number=" + var1.func_101623_serialnumber(var2));
         System.out.print("\t\tcompressed length: " + var1.func_101594_raw_total(var2) + " bytes ");
         System.out.println(" play time: " + var1.func_101610_time_total(var2) + "s");
         C_101377_Comment var4 = var1.func_101600_getComment(var2);
         System.out.println(var4);
      }

   }
}
