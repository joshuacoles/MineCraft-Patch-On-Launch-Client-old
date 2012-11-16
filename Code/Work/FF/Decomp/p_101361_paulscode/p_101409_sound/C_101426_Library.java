package p_101361_paulscode.p_101409_sound;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import p_101361_paulscode.p_101409_sound.C_101413_Channel;
import p_101361_paulscode.p_101409_sound.C_101414_FilenameURL;
import p_101361_paulscode.p_101409_sound.C_101415_StreamThread;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101419_ListenerData;
import p_101361_paulscode.p_101409_sound.C_101420_SoundSystemLogger;
import p_101361_paulscode.p_101409_sound.C_101422_SoundBuffer;
import p_101361_paulscode.p_101409_sound.C_101423_Source;
import p_101361_paulscode.p_101409_sound.C_101424_MidiChannel;

public class C_101426_Library {

   private C_101420_SoundSystemLogger field_102195_logger = C_101416_SoundSystemConfig.func_102576_getLogger();
   protected C_101419_ListenerData field_102196_listener;
   protected HashMap field_102194_bufferMap = null;
   protected HashMap field_102197_sourceMap;
   private C_101424_MidiChannel field_102191_midiChannel;
   protected List field_102189_streamingChannels;
   protected List field_102192_normalChannels;
   private String[] field_102190_streamingChannelSourceNames;
   private String[] field_102199_normalChannelSourceNames;
   private int field_102188_nextStreamingChannel = 0;
   private int field_102193_nextNormalChannel = 0;
   protected C_101415_StreamThread field_102187_streamThread;
   protected boolean field_102198_reverseByteOrder = false;


   public C_101426_Library() {
      this.field_102194_bufferMap = new HashMap();
      this.field_102197_sourceMap = new HashMap();
      this.field_102196_listener = new C_101419_ListenerData(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F);
      this.field_102189_streamingChannels = new LinkedList();
      this.field_102192_normalChannels = new LinkedList();
      this.field_102190_streamingChannelSourceNames = new String[C_101416_SoundSystemConfig.func_102598_getNumberStreamingChannels()];
      this.field_102199_normalChannelSourceNames = new String[C_101416_SoundSystemConfig.func_102552_getNumberNormalChannels()];
      this.field_102187_streamThread = new C_101415_StreamThread();
      this.field_102187_streamThread.start();
   }

   public void func_102138_cleanup() {
      this.field_102187_streamThread.func_102520_kill();
      this.field_102187_streamThread.interrupt();

      for(int var1 = 0; var1 < 50 && this.field_102187_streamThread.func_102522_alive(); ++var1) {
         try {
            Thread.sleep(100L);
         } catch (Exception var6) {
            ;
         }
      }

      if(this.field_102187_streamThread.func_102522_alive()) {
         this.func_102165_errorMessage("Stream thread did not die!");
         this.func_102123_message("Ignoring errors... continuing clean-up.");
      }

      if(this.field_102191_midiChannel != null) {
         this.field_102191_midiChannel.func_102683_cleanup();
         this.field_102191_midiChannel = null;
      }

      C_101413_Channel var7 = null;
      if(this.field_102189_streamingChannels != null) {
         while(!this.field_102189_streamingChannels.isEmpty()) {
            var7 = (C_101413_Channel)this.field_102189_streamingChannels.remove(0);
            var7.func_102395_close();
            var7.func_102384_cleanup();
            var7 = null;
         }

         this.field_102189_streamingChannels.clear();
         this.field_102189_streamingChannels = null;
      }

      if(this.field_102192_normalChannels != null) {
         while(!this.field_102192_normalChannels.isEmpty()) {
            var7 = (C_101413_Channel)this.field_102192_normalChannels.remove(0);
            var7.func_102395_close();
            var7.func_102384_cleanup();
            var7 = null;
         }

         this.field_102192_normalChannels.clear();
         this.field_102192_normalChannels = null;
      }

      Set var2 = this.field_102197_sourceMap.keySet();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         C_101423_Source var5 = (C_101423_Source)this.field_102197_sourceMap.get(var4);
         if(var5 != null) {
            var5.func_102314_cleanup();
         }
      }

      this.field_102197_sourceMap.clear();
      this.field_102197_sourceMap = null;
      this.field_102196_listener = null;
      this.field_102187_streamThread = null;
   }

   public void func_102118_init() {
      C_101413_Channel var1 = null;

      int var2;
      for(var2 = 0; var2 < C_101416_SoundSystemConfig.func_102598_getNumberStreamingChannels(); ++var2) {
         var1 = this.func_102120_createChannel(1);
         if(var1 == null) {
            break;
         }

         this.field_102189_streamingChannels.add(var1);
      }

      for(var2 = 0; var2 < C_101416_SoundSystemConfig.func_102552_getNumberNormalChannels(); ++var2) {
         var1 = this.func_102120_createChannel(0);
         if(var1 == null) {
            break;
         }

         this.field_102192_normalChannels.add(var1);
      }

   }

   public static boolean func_102170_libraryCompatible() {
      return true;
   }

   protected C_101413_Channel func_102120_createChannel(int var1) {
      return new C_101413_Channel(var1);
   }

   public boolean func_102185_loadSound(C_101414_FilenameURL var1) {
      return true;
   }

   public boolean func_102155_loadSound(C_101422_SoundBuffer var1, String var2) {
      return true;
   }

   public LinkedList func_102128_getAllLoadedFilenames() {
      LinkedList var1 = new LinkedList();
      Set var2 = this.field_102194_bufferMap.keySet();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         var1.add(var3.next());
      }

      return var1;
   }

   public LinkedList func_102145_getAllSourcenames() {
      LinkedList var1 = new LinkedList();
      Set var2 = this.field_102197_sourceMap.keySet();
      Iterator var3 = var2.iterator();
      if(this.field_102191_midiChannel != null) {
         var1.add(this.field_102191_midiChannel.func_102684_getSourcename());
      }

      while(var3.hasNext()) {
         var1.add(var3.next());
      }

      return var1;
   }

   public void func_102171_unloadSound(String var1) {
      this.field_102194_bufferMap.remove(var1);
   }

   public void func_102146_rawDataStream(AudioFormat var1, boolean var2, String var3, float var4, float var5, float var6, int var7, float var8) {
      this.field_102197_sourceMap.put(var3, new C_101423_Source(var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public void func_102124_newSource(boolean var1, boolean var2, boolean var3, String var4, C_101414_FilenameURL var5, float var6, float var7, float var8, int var9, float var10) {
      this.field_102197_sourceMap.put(var4, new C_101423_Source(var1, var2, var3, var4, var5, (C_101422_SoundBuffer)null, var6, var7, var8, var9, var10, false));
   }

   public void func_102149_quickPlay(boolean var1, boolean var2, boolean var3, String var4, C_101414_FilenameURL var5, float var6, float var7, float var8, int var9, float var10, boolean var11) {
      this.field_102197_sourceMap.put(var4, new C_101423_Source(var1, var2, var3, var4, var5, (C_101422_SoundBuffer)null, var6, var7, var8, var9, var10, var11));
   }

   public void func_102167_setTemporary(String var1, boolean var2) {
      C_101423_Source var3 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
      if(var3 != null) {
         var3.func_102287_setTemporary(var2);
      }

   }

   public void func_102122_setPosition(String var1, float var2, float var3, float var4) {
      C_101423_Source var5 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
      if(var5 != null) {
         var5.func_102319_setPosition(var2, var3, var4);
      }

   }

   public void func_102173_setPriority(String var1, boolean var2) {
      C_101423_Source var3 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
      if(var3 != null) {
         var3.func_102286_setPriority(var2);
      }

   }

   public void func_102127_setLooping(String var1, boolean var2) {
      C_101423_Source var3 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
      if(var3 != null) {
         var3.func_102311_setLooping(var2);
      }

   }

   public void func_102142_setAttenuation(String var1, int var2) {
      C_101423_Source var3 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
      if(var3 != null) {
         var3.func_102305_setAttenuation(var2);
      }

   }

   public void func_102181_setDistOrRoll(String var1, float var2) {
      C_101423_Source var3 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
      if(var3 != null) {
         var3.func_102282_setDistOrRoll(var2);
      }

   }

   public void func_102133_setVelocity(String var1, float var2, float var3, float var4) {
      C_101423_Source var5 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
      if(var5 != null) {
         var5.func_102322_setVelocity(var2, var3, var4);
      }

   }

   public void func_102161_setListenerVelocity(float var1, float var2, float var3) {
      this.field_102196_listener.func_102639_setVelocity(var1, var2, var3);
   }

   public void func_102156_dopplerChanged() {}

   public float func_102154_millisecondsPlayed(String var1) {
      if(var1 != null && !var1.equals("")) {
         if(this.func_102176_midiSourcename(var1)) {
            this.func_102165_errorMessage("Unable to calculate milliseconds for MIDI source.");
            return -1.0F;
         } else {
            C_101423_Source var2 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
            if(var2 == null) {
               this.func_102165_errorMessage("Source \'" + var1 + "\' not found in " + "method \'millisecondsPlayed\'");
            }

            return var2.func_102301_millisecondsPlayed();
         }
      } else {
         this.func_102165_errorMessage("Sourcename not specified in method \'millisecondsPlayed\'");
         return -1.0F;
      }
   }

   public int func_102169_feedRawAudioData(String var1, byte[] var2) {
      if(var1 != null && !var1.equals("")) {
         if(this.func_102176_midiSourcename(var1)) {
            this.func_102165_errorMessage("Raw audio data can not be fed to the MIDI channel.");
            return -1;
         } else {
            C_101423_Source var3 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
            if(var3 == null) {
               this.func_102165_errorMessage("Source \'" + var1 + "\' not found in " + "method \'feedRawAudioData\'");
            }

            return this.func_102148_feedRawAudioData(var3, var2);
         }
      } else {
         this.func_102165_errorMessage("Sourcename not specified in method \'feedRawAudioData\'");
         return -1;
      }
   }

   public int func_102148_feedRawAudioData(C_101423_Source var1, byte[] var2) {
      if(var1 == null) {
         this.func_102165_errorMessage("Source parameter null in method \'feedRawAudioData\'");
         return -1;
      } else if(!var1.field_102335_toStream) {
         this.func_102165_errorMessage("Only a streaming source may be specified in method \'feedRawAudioData\'");
         return -1;
      } else if(!var1.field_102333_rawDataStream) {
         this.func_102165_errorMessage("Streaming source already associated with a file or URL in method\'feedRawAudioData\'");
         return -1;
      } else if(var1.func_102299_playing() && var1.field_102359_channel != null) {
         return var1.func_102298_feedRawAudioData(var1.field_102359_channel, var2);
      } else {
         C_101413_Channel var3;
         if(var1.field_102359_channel != null && var1.field_102359_channel.field_102406_attachedSource == var1) {
            var3 = var1.field_102359_channel;
         } else {
            var3 = this.func_102182_getNextChannel(var1);
         }

         int var4 = var1.func_102298_feedRawAudioData(var3, var2);
         var3.field_102406_attachedSource = var1;
         this.field_102187_streamThread.func_102539_watch(var1);
         this.field_102187_streamThread.interrupt();
         return var4;
      }
   }

   public void func_102158_play(String var1) {
      if(var1 != null && !var1.equals("")) {
         if(this.func_102176_midiSourcename(var1)) {
            this.field_102191_midiChannel.func_102690_play();
         } else {
            C_101423_Source var2 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
            if(var2 == null) {
               this.func_102165_errorMessage("Source \'" + var1 + "\' not found in " + "method \'play\'");
            }

            this.func_102166_play(var2);
         }

      } else {
         this.func_102165_errorMessage("Sourcename not specified in method \'play\'");
      }
   }

   public void func_102166_play(C_101423_Source var1) {
      if(var1 != null) {
         if(!var1.field_102333_rawDataStream) {
            if(var1.func_102309_active()) {
               if(!var1.func_102299_playing()) {
                  C_101413_Channel var2 = this.func_102182_getNextChannel(var1);
                  if(var1 != null && var2 != null) {
                     if(var1.field_102359_channel != null && var1.field_102359_channel.field_102406_attachedSource != var1) {
                        var1.field_102359_channel = null;
                     }

                     var2.field_102406_attachedSource = var1;
                     var1.func_102307_play(var2);
                     if(var1.field_102335_toStream) {
                        this.field_102187_streamThread.func_102539_watch(var1);
                        this.field_102187_streamThread.interrupt();
                     }
                  }
               }

            }
         }
      }
   }

   public void func_102144_stop(String var1) {
      if(var1 != null && !var1.equals("")) {
         if(this.func_102176_midiSourcename(var1)) {
            this.field_102191_midiChannel.func_102672_stop();
         } else {
            C_101423_Source var2 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
            if(var2 != null) {
               var2.func_102295_stop();
            }
         }

      } else {
         this.func_102165_errorMessage("Sourcename not specified in method \'stop\'");
      }
   }

   public void func_102137_pause(String var1) {
      if(var1 != null && !var1.equals("")) {
         if(this.func_102176_midiSourcename(var1)) {
            this.field_102191_midiChannel.func_102696_pause();
         } else {
            C_101423_Source var2 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
            if(var2 != null) {
               var2.func_102324_pause();
            }
         }

      } else {
         this.func_102165_errorMessage("Sourcename not specified in method \'stop\'");
      }
   }

   public void func_102119_rewind(String var1) {
      if(this.func_102176_midiSourcename(var1)) {
         this.field_102191_midiChannel.func_102666_rewind();
      } else {
         C_101423_Source var2 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
         if(var2 != null) {
            var2.func_102283_rewind();
         }
      }

   }

   public void func_102141_flush(String var1) {
      if(this.func_102176_midiSourcename(var1)) {
         this.func_102165_errorMessage("You can not flush the MIDI channel");
      } else {
         C_101423_Source var2 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
         if(var2 != null) {
            var2.func_102293_flush();
         }
      }

   }

   public void func_102157_cull(String var1) {
      C_101423_Source var2 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
      if(var2 != null) {
         var2.func_102285_cull();
      }

   }

   public void func_102121_activate(String var1) {
      C_101423_Source var2 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
      if(var2 != null) {
         var2.func_102312_activate();
         if(var2.field_102342_toPlay) {
            this.func_102166_play(var2);
         }
      }

   }

   public void func_102147_setMasterVolume(float var1) {
      C_101416_SoundSystemConfig.func_102559_setMasterGain(var1);
      if(this.field_102191_midiChannel != null) {
         this.field_102191_midiChannel.func_102658_resetGain();
      }

   }

   public void func_102159_setVolume(String var1, float var2) {
      if(this.func_102176_midiSourcename(var1)) {
         this.field_102191_midiChannel.func_102685_setVolume(var2);
      } else {
         C_101423_Source var3 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
         if(var3 != null) {
            float var4 = var2;
            if(var2 < 0.0F) {
               var4 = 0.0F;
            } else if(var2 > 1.0F) {
               var4 = 1.0F;
            }

            var3.field_102339_sourceVolume = var4;
            var3.func_102291_positionChanged();
         }
      }

   }

   public float func_102151_getVolume(String var1) {
      if(this.func_102176_midiSourcename(var1)) {
         return this.field_102191_midiChannel.func_102668_getVolume();
      } else {
         C_101423_Source var2 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
         return var2 != null?var2.field_102339_sourceVolume:0.0F;
      }
   }

   public void func_102162_setPitch(String var1, float var2) {
      if(!this.func_102176_midiSourcename(var1)) {
         C_101423_Source var3 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
         if(var3 != null) {
            float var4 = var2;
            if(var2 < 0.5F) {
               var4 = 0.5F;
            } else if(var2 > 2.0F) {
               var4 = 2.0F;
            }

            var3.func_102317_setPitch(var4);
            var3.func_102291_positionChanged();
         }
      }

   }

   public float func_102172_getPitch(String var1) {
      if(!this.func_102176_midiSourcename(var1)) {
         C_101423_Source var2 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
         if(var2 != null) {
            return var2.func_102284_getPitch();
         }
      }

      return 1.0F;
   }

   public void func_102183_moveListener(float var1, float var2, float var3) {
      this.func_102139_setListenerPosition(this.field_102196_listener.field_102643_position.field_102507_x + var1, this.field_102196_listener.field_102643_position.field_102506_y + var2, this.field_102196_listener.field_102643_position.field_102505_z + var3);
   }

   public void func_102139_setListenerPosition(float var1, float var2, float var3) {
      this.field_102196_listener.func_102633_setPosition(var1, var2, var3);
      Set var4 = this.field_102197_sourceMap.keySet();
      Iterator var5 = var4.iterator();

      while(var5.hasNext()) {
         String var6 = (String)var5.next();
         C_101423_Source var7 = (C_101423_Source)this.field_102197_sourceMap.get(var6);
         if(var7 != null) {
            var7.func_102291_positionChanged();
         }
      }

   }

   public void func_102116_turnListener(float var1) {
      this.func_102117_setListenerAngle(this.field_102196_listener.field_102646_angle + var1);
      Set var2 = this.field_102197_sourceMap.keySet();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         C_101423_Source var5 = (C_101423_Source)this.field_102197_sourceMap.get(var4);
         if(var5 != null) {
            var5.func_102291_positionChanged();
         }
      }

   }

   public void func_102117_setListenerAngle(float var1) {
      this.field_102196_listener.func_102634_setAngle(var1);
      Set var2 = this.field_102197_sourceMap.keySet();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         String var4 = (String)var3.next();
         C_101423_Source var5 = (C_101423_Source)this.field_102197_sourceMap.get(var4);
         if(var5 != null) {
            var5.func_102291_positionChanged();
         }
      }

   }

   public void func_102177_setListenerOrientation(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_102196_listener.func_102640_setOrientation(var1, var2, var3, var4, var5, var6);
      Set var7 = this.field_102197_sourceMap.keySet();
      Iterator var8 = var7.iterator();

      while(var8.hasNext()) {
         String var9 = (String)var8.next();
         C_101423_Source var10 = (C_101423_Source)this.field_102197_sourceMap.get(var9);
         if(var10 != null) {
            var10.func_102291_positionChanged();
         }
      }

   }

   public void func_102150_setListenerData(C_101419_ListenerData var1) {
      this.field_102196_listener.func_102638_setData(var1);
   }

   public void func_102186_copySources(HashMap var1) {
      if(var1 != null) {
         Set var2 = var1.keySet();
         Iterator var3 = var2.iterator();
         this.field_102197_sourceMap.clear();

         while(var3.hasNext()) {
            String var4 = (String)var3.next();
            C_101423_Source var5 = (C_101423_Source)var1.get(var4);
            if(var5 != null) {
               this.func_102185_loadSound(var5.field_102347_filenameURL);
               this.field_102197_sourceMap.put(var4, new C_101423_Source(var5, (C_101422_SoundBuffer)null));
            }
         }

      }
   }

   public void func_102174_removeSource(String var1) {
      C_101423_Source var2 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
      if(var2 != null) {
         var2.func_102314_cleanup();
      }

      this.field_102197_sourceMap.remove(var1);
   }

   public void func_102178_removeTemporarySources() {
      Set var1 = this.field_102197_sourceMap.keySet();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         C_101423_Source var4 = (C_101423_Source)this.field_102197_sourceMap.get(var3);
         if(var4 != null && var4.field_102331_temporary && !var4.func_102299_playing()) {
            var4.func_102314_cleanup();
            var2.remove();
         }
      }

   }

   private C_101413_Channel func_102182_getNextChannel(C_101423_Source var1) {
      if(var1 == null) {
         return null;
      } else {
         String var2 = var1.field_102330_sourcename;
         if(var2 == null) {
            return null;
         } else {
            int var5;
            List var6;
            String[] var7;
            if(var1.field_102335_toStream) {
               var5 = this.field_102188_nextStreamingChannel;
               var6 = this.field_102189_streamingChannels;
               var7 = this.field_102190_streamingChannelSourceNames;
            } else {
               var5 = this.field_102193_nextNormalChannel;
               var6 = this.field_102192_normalChannels;
               var7 = this.field_102199_normalChannelSourceNames;
            }

            int var4 = var6.size();

            int var3;
            for(var3 = 0; var3 < var4; ++var3) {
               if(var2.equals(var7[var3])) {
                  return (C_101413_Channel)var6.get(var3);
               }
            }

            int var9 = var5;
            var3 = 0;

            while(true) {
               String var8;
               C_101423_Source var10;
               if(var3 < var4) {
                  var8 = var7[var9];
                  if(var8 == null) {
                     var10 = null;
                  } else {
                     var10 = (C_101423_Source)this.field_102197_sourceMap.get(var8);
                  }

                  if(var10 != null && var10.func_102299_playing()) {
                     ++var9;
                     if(var9 >= var4) {
                        var9 = 0;
                     }

                     ++var3;
                     continue;
                  }

                  if(var1.field_102335_toStream) {
                     this.field_102188_nextStreamingChannel = var9 + 1;
                     if(this.field_102188_nextStreamingChannel >= var4) {
                        this.field_102188_nextStreamingChannel = 0;
                     }
                  } else {
                     this.field_102193_nextNormalChannel = var9 + 1;
                     if(this.field_102193_nextNormalChannel >= var4) {
                        this.field_102193_nextNormalChannel = 0;
                     }
                  }

                  var7[var9] = var2;
                  return (C_101413_Channel)var6.get(var9);
               }

               var9 = var5;

               for(var3 = 0; var3 < var4; ++var3) {
                  var8 = var7[var9];
                  if(var8 == null) {
                     var10 = null;
                  } else {
                     var10 = (C_101423_Source)this.field_102197_sourceMap.get(var8);
                  }

                  if(var10 == null || !var10.func_102299_playing() || !var10.field_102338_priority) {
                     if(var1.field_102335_toStream) {
                        this.field_102188_nextStreamingChannel = var9 + 1;
                        if(this.field_102188_nextStreamingChannel >= var4) {
                           this.field_102188_nextStreamingChannel = 0;
                        }
                     } else {
                        this.field_102193_nextNormalChannel = var9 + 1;
                        if(this.field_102193_nextNormalChannel >= var4) {
                           this.field_102193_nextNormalChannel = 0;
                        }
                     }

                     var7[var9] = var2;
                     return (C_101413_Channel)var6.get(var9);
                  }

                  ++var9;
                  if(var9 >= var4) {
                     var9 = 0;
                  }
               }

               return null;
            }
         }
      }
   }

   public void func_102134_replaySources() {
      Set var1 = this.field_102197_sourceMap.keySet();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         C_101423_Source var4 = (C_101423_Source)this.field_102197_sourceMap.get(var3);
         if(var4 != null && var4.field_102342_toPlay && !var4.func_102299_playing()) {
            this.func_102158_play(var3);
            var4.field_102342_toPlay = false;
         }
      }

   }

   public void func_102168_queueSound(String var1, C_101414_FilenameURL var2) {
      if(this.func_102176_midiSourcename(var1)) {
         this.field_102191_midiChannel.func_102679_queueSound(var2);
      } else {
         C_101423_Source var3 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
         if(var3 != null) {
            var3.func_102308_queueSound(var2);
         }
      }

   }

   public void func_102163_dequeueSound(String var1, String var2) {
      if(this.func_102176_midiSourcename(var1)) {
         this.field_102191_midiChannel.func_102663_dequeueSound(var2);
      } else {
         C_101423_Source var3 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
         if(var3 != null) {
            var3.func_102281_dequeueSound(var2);
         }
      }

   }

   public void func_102135_fadeOut(String var1, C_101414_FilenameURL var2, long var3) {
      if(this.func_102176_midiSourcename(var1)) {
         this.field_102191_midiChannel.func_102674_fadeOut(var2, var3);
      } else {
         C_101423_Source var5 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
         if(var5 != null) {
            var5.func_102296_fadeOut(var2, var3);
         }
      }

   }

   public void func_102140_fadeOutIn(String var1, C_101414_FilenameURL var2, long var3, long var5) {
      if(this.func_102176_midiSourcename(var1)) {
         this.field_102191_midiChannel.func_102661_fadeOutIn(var2, var3, var5);
      } else {
         C_101423_Source var7 = (C_101423_Source)this.field_102197_sourceMap.get(var1);
         if(var7 != null) {
            var7.func_102279_fadeOutIn(var2, var3, var5);
         }
      }

   }

   public void func_102130_checkFadeVolumes() {
      if(this.field_102191_midiChannel != null) {
         this.field_102191_midiChannel.func_102658_resetGain();
      }

      C_101413_Channel var1;
      C_101423_Source var2;
      for(int var3 = 0; var3 < this.field_102189_streamingChannels.size(); ++var3) {
         var1 = (C_101413_Channel)this.field_102189_streamingChannels.get(var3);
         if(var1 != null) {
            var2 = var1.field_102406_attachedSource;
            if(var2 != null) {
               var2.func_102280_checkFadeOut();
            }
         }
      }

      var1 = null;
      var2 = null;
   }

   public void func_102143_loadMidi(boolean var1, String var2, C_101414_FilenameURL var3) {
      if(var3 == null) {
         this.func_102165_errorMessage("Filename/URL not specified in method \'loadMidi\'.");
      } else if(!var3.func_102509_getFilename().matches(C_101416_SoundSystemConfig.field_102608_EXTENSION_MIDI)) {
         this.func_102165_errorMessage("Filename/identifier doesn\'t end in \'.mid\' or\'.midi\' in method loadMidi.");
      } else {
         if(this.field_102191_midiChannel == null) {
            this.field_102191_midiChannel = new C_101424_MidiChannel(var1, var2, var3);
         } else {
            this.field_102191_midiChannel.func_102678_switchSource(var1, var2, var3);
         }

      }
   }

   public void func_102164_unloadMidi() {
      if(this.field_102191_midiChannel != null) {
         this.field_102191_midiChannel.func_102683_cleanup();
      }

      this.field_102191_midiChannel = null;
   }

   public boolean func_102176_midiSourcename(String var1) {
      return this.field_102191_midiChannel != null && var1 != null?(this.field_102191_midiChannel.func_102684_getSourcename() != null && !var1.equals("")?var1.equals(this.field_102191_midiChannel.func_102684_getSourcename()):false):false;
   }

   public C_101423_Source func_102184_getSource(String var1) {
      return (C_101423_Source)this.field_102197_sourceMap.get(var1);
   }

   public C_101424_MidiChannel func_102126_getMidiChannel() {
      return this.field_102191_midiChannel;
   }

   public void func_102179_setMidiChannel(C_101424_MidiChannel var1) {
      if(this.field_102191_midiChannel != null && this.field_102191_midiChannel != var1) {
         this.field_102191_midiChannel.func_102683_cleanup();
      }

      this.field_102191_midiChannel = var1;
   }

   public void func_102131_listenerMoved() {
      Set var1 = this.field_102197_sourceMap.keySet();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         C_101423_Source var4 = (C_101423_Source)this.field_102197_sourceMap.get(var3);
         if(var4 != null) {
            var4.func_102304_listenerMoved();
         }
      }

   }

   public HashMap func_102153_getSources() {
      return this.field_102197_sourceMap;
   }

   public C_101419_ListenerData func_102129_getListenerData() {
      return this.field_102196_listener;
   }

   public boolean func_102175_reverseByteOrder() {
      return this.field_102198_reverseByteOrder;
   }

   public static String func_102132_getTitle() {
      return "No Sound";
   }

   public static String func_102136_getDescription() {
      return "Silent Mode";
   }

   public String func_102180_getClassName() {
      return "Library";
   }

   protected void func_102123_message(String var1) {
      this.field_102195_logger.func_102651_message(var1, 0);
   }

   protected void func_102125_importantMessage(String var1) {
      this.field_102195_logger.func_102653_importantMessage(var1, 0);
   }

   protected boolean func_102160_errorCheck(boolean var1, String var2) {
      return this.field_102195_logger.func_102648_errorCheck(var1, this.func_102180_getClassName(), var2, 0);
   }

   protected void func_102165_errorMessage(String var1) {
      this.field_102195_logger.func_102649_errorMessage(this.func_102180_getClassName(), var1, 0);
   }

   protected void func_102152_printStackTrace(Exception var1) {
      this.field_102195_logger.func_102650_printStackTrace(var1, 1);
   }
}
