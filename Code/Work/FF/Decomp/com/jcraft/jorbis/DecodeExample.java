package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101372_DspState;
import com.jcraft.jorbis.C_101375_Block;
import com.jcraft.jorbis.C_101377_Comment;
import com.jcraft.jorbis.C_101390_Info;
import com.jcraft.p_101362_jogg.C_101404_StreamState;
import com.jcraft.p_101362_jogg.C_101405_Page;
import com.jcraft.p_101362_jogg.C_101406_Packet;
import com.jcraft.p_101362_jogg.C_101407_SyncState;
import java.io.FileInputStream;
import java.io.InputStream;

class DecodeExample {

   static int field_101877_convsize = 8192;
   static byte[] field_101878_convbuffer = new byte[field_101877_convsize];


   public static void main(String[] var0) {
      Object var1 = System.in;
      if(var0.length > 0) {
         try {
            var1 = new FileInputStream(var0[0]);
         } catch (Exception var28) {
            System.err.println(var28);
         }
      }

      C_101407_SyncState var2 = new C_101407_SyncState();
      C_101404_StreamState var3 = new C_101404_StreamState();
      C_101405_Page var4 = new C_101405_Page();
      C_101406_Packet var5 = new C_101406_Packet();
      C_101390_Info var6 = new C_101390_Info();
      C_101377_Comment var7 = new C_101377_Comment();
      C_101372_DspState var8 = new C_101372_DspState();
      C_101375_Block var9 = new C_101375_Block(var8);
      int var11 = 0;
      var2.func_102055_init();

      while(true) {
         boolean var12 = false;
         int var13 = var2.func_102056_buffer(4096);
         byte[] var10 = var2.field_102066_data;

         try {
            var11 = ((InputStream)var1).read(var10, var13, 4096);
         } catch (Exception var26) {
            System.err.println(var26);
            System.exit(-1);
         }

         var2.func_102060_wrote(var11);
         if(var2.func_102058_pageout(var4) != 1) {
            if(var11 < 4096) {
               var2.func_102061_clear();
               System.err.println("Done.");
               return;
            }

            System.err.println("Input does not appear to be an Ogg bitstream.");
            System.exit(1);
         }

         var3.func_102006_init(var4.func_102033_serialno());
         var6.func_101954_init();
         var7.func_101788_init();
         if(var3.func_102009_pagein(var4) < 0) {
            System.err.println("Error reading first page of Ogg bitstream data.");
            System.exit(1);
         }

         if(var3.func_102003_packetout(var5) != 1) {
            System.err.println("Error reading initial header packet.");
            System.exit(1);
         }

         if(var6.func_101953_synthesis_headerin(var7, var5) < 0) {
            System.err.println("This Ogg bitstream does not contain Vorbis audio data.");
            System.exit(1);
         }

         int var14 = 0;

         while(var14 < 2) {
            label150:
            while(true) {
               if(var14 < 2) {
                  int var15 = var2.func_102058_pageout(var4);
                  if(var15 != 0) {
                     if(var15 == 1) {
                        var3.func_102009_pagein(var4);

                        while(var14 < 2) {
                           var15 = var3.func_102003_packetout(var5);
                           if(var15 == 0) {
                              continue label150;
                           }

                           if(var15 == -1) {
                              System.err.println("Corrupt secondary header.  Exiting.");
                              System.exit(1);
                           }

                           var6.func_101953_synthesis_headerin(var7, var5);
                           ++var14;
                        }
                     }
                     continue;
                  }
               }

               var13 = var2.func_102056_buffer(4096);
               var10 = var2.field_102066_data;

               try {
                  var11 = ((InputStream)var1).read(var10, var13, 4096);
               } catch (Exception var25) {
                  System.err.println(var25);
                  System.exit(1);
               }

               if(var11 == 0 && var14 < 2) {
                  System.err.println("End of file before finding all Vorbis headers!");
                  System.exit(1);
               }

               var2.func_102060_wrote(var11);
               break;
            }
         }

         byte[][] var31 = var7.field_101806_user_comments;

         for(int var16 = 0; var16 < var31.length && var31[var16] != null; ++var16) {
            System.err.println(new String(var31[var16], 0, var31[var16].length - 1));
         }

         System.err.println("\nBitstream is " + var6.field_101988_channels + " channel, " + var6.field_101970_rate + "Hz");
         System.err.println("Encoded by: " + new String(var7.field_101804_vendor, 0, var7.field_101804_vendor.length - 1) + "\n");
         field_101877_convsize = 4096 / var6.field_101988_channels;
         var8.func_101556_synthesis_init(var6);
         var9.func_101714_init(var8);
         float[][][] var30 = new float[1][][];
         int[] var29 = new int[var6.field_101988_channels];

         while(!var12) {
            label182:
            while(true) {
               if(!var12) {
                  int var17 = var2.func_102058_pageout(var4);
                  if(var17 != 0) {
                     if(var17 != -1) {
                        var3.func_102009_pagein(var4);

                        while(true) {
                           var17 = var3.func_102003_packetout(var5);
                           if(var17 == 0) {
                              if(var4.func_102036_eos() != 0) {
                                 var12 = true;
                              }
                              continue label182;
                           }

                           if(var17 != -1) {
                              if(var9.func_101713_synthesis(var5) == 0) {
                                 var8.func_101553_synthesis_blockin(var9);
                              }

                              int var18;
                              while((var18 = var8.func_101554_synthesis_pcmout(var30, var29)) > 0) {
                                 float[][] var19 = var30[0];
                                 int var20 = var18 < field_101877_convsize?var18:field_101877_convsize;

                                 for(var14 = 0; var14 < var6.field_101988_channels; ++var14) {
                                    int var21 = var14 * 2;
                                    int var22 = var29[var14];

                                    for(int var23 = 0; var23 < var20; ++var23) {
                                       int var24 = (int)((double)var19[var14][var22 + var23] * 32767.0D);
                                       if(var24 > 32767) {
                                          var24 = 32767;
                                       }

                                       if(var24 < -32768) {
                                          var24 = -32768;
                                       }

                                       if(var24 < 0) {
                                          var24 |= '\u8000';
                                       }

                                       field_101878_convbuffer[var21] = (byte)var24;
                                       field_101878_convbuffer[var21 + 1] = (byte)(var24 >>> 8);
                                       var21 += 2 * var6.field_101988_channels;
                                    }
                                 }

                                 System.out.write(field_101878_convbuffer, 0, 2 * var6.field_101988_channels * var20);
                                 var8.func_101552_synthesis_read(var20);
                              }
                           }
                        }
                     }

                     System.err.println("Corrupt or missing data in bitstream; continuing...");
                     continue;
                  }
               }

               if(!var12) {
                  var13 = var2.func_102056_buffer(4096);
                  var10 = var2.field_102066_data;

                  try {
                     var11 = ((InputStream)var1).read(var10, var13, 4096);
                  } catch (Exception var27) {
                     System.err.println(var27);
                     System.exit(1);
                  }

                  var2.func_102060_wrote(var11);
                  if(var11 == 0) {
                     var12 = true;
                  }
               }
               break;
            }
         }

         var3.func_102001_clear();
         var9.func_101715_clear();
         var8.func_101551_clear();
         var6.func_101956_clear();
      }
   }

}
