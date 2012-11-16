package p_101361_paulscode.p_101409_sound;

import java.net.URL;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.sound.sampled.AudioFormat;
import p_101361_paulscode.p_101409_sound.C_101410_Vector3D;
import p_101361_paulscode.p_101409_sound.C_101412_ICodec;
import p_101361_paulscode.p_101409_sound.C_101413_Channel;
import p_101361_paulscode.p_101409_sound.C_101414_FilenameURL;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101420_SoundSystemLogger;
import p_101361_paulscode.p_101409_sound.C_101422_SoundBuffer;
import p_101361_paulscode.p_101409_sound.C_101426_Library;

public class C_101423_Source {

   protected Class field_102350_libraryType = C_101426_Library.class;
   private static final boolean field_102355_GET = false;
   private static final boolean field_102337_SET = true;
   private static final boolean field_102354_XXX = false;
   private C_101420_SoundSystemLogger field_102340_logger = C_101416_SoundSystemConfig.func_102576_getLogger();
   public boolean field_102333_rawDataStream = false;
   public AudioFormat field_102326_rawDataFormat = null;
   public boolean field_102331_temporary = false;
   public boolean field_102338_priority = false;
   public boolean field_102335_toStream = false;
   public boolean field_102349_toLoop = false;
   public boolean field_102342_toPlay = false;
   public String field_102330_sourcename = "";
   public C_101414_FilenameURL field_102347_filenameURL = null;
   public C_101410_Vector3D field_102325_position;
   public int field_102328_attModel = 0;
   public float field_102360_distOrRoll = 0.0F;
   public C_101410_Vector3D field_102341_velocity;
   public float field_102352_gain = 1.0F;
   public float field_102339_sourceVolume = 1.0F;
   protected float field_102358_pitch = 1.0F;
   public float field_102351_distanceFromListener = 0.0F;
   public C_101413_Channel field_102359_channel = null;
   public C_101422_SoundBuffer field_102362_soundBuffer = null;
   private boolean field_102357_active = true;
   private boolean field_102356_stopped = true;
   private boolean field_102348_paused = false;
   protected C_101412_ICodec field_102332_codec = null;
   protected C_101412_ICodec field_102343_nextCodec = null;
   protected LinkedList field_102336_nextBuffers = null;
   protected LinkedList field_102329_soundSequenceQueue = null;
   protected final Object field_102334_soundSequenceLock = new Object();
   public boolean field_102327_preLoad = false;
   protected float field_102345_fadeOutGain = -1.0F;
   protected float field_102344_fadeInGain = 1.0F;
   protected long field_102346_fadeOutMilis = 0L;
   protected long field_102353_fadeInMilis = 0L;
   protected long field_102361_lastFadeCheck = 0L;


   public C_101423_Source(boolean var1, boolean var2, boolean var3, String var4, C_101414_FilenameURL var5, C_101422_SoundBuffer var6, float var7, float var8, float var9, int var10, float var11, boolean var12) {
      this.field_102338_priority = var1;
      this.field_102335_toStream = var2;
      this.field_102349_toLoop = var3;
      this.field_102330_sourcename = var4;
      this.field_102347_filenameURL = var5;
      this.field_102362_soundBuffer = var6;
      this.field_102325_position = new C_101410_Vector3D(var7, var8, var9);
      this.field_102328_attModel = var10;
      this.field_102360_distOrRoll = var11;
      this.field_102341_velocity = new C_101410_Vector3D(0.0F, 0.0F, 0.0F);
      this.field_102331_temporary = var12;
      if(var2 && var5 != null) {
         this.field_102332_codec = C_101416_SoundSystemConfig.func_102578_getCodec(var5.func_102509_getFilename());
      }

   }

   public C_101423_Source(C_101423_Source var1, C_101422_SoundBuffer var2) {
      this.field_102338_priority = var1.field_102338_priority;
      this.field_102335_toStream = var1.field_102335_toStream;
      this.field_102349_toLoop = var1.field_102349_toLoop;
      this.field_102330_sourcename = var1.field_102330_sourcename;
      this.field_102347_filenameURL = var1.field_102347_filenameURL;
      this.field_102325_position = var1.field_102325_position.func_102499_clone();
      this.field_102328_attModel = var1.field_102328_attModel;
      this.field_102360_distOrRoll = var1.field_102360_distOrRoll;
      this.field_102341_velocity = var1.field_102341_velocity.func_102499_clone();
      this.field_102331_temporary = var1.field_102331_temporary;
      this.field_102339_sourceVolume = var1.field_102339_sourceVolume;
      this.field_102333_rawDataStream = var1.field_102333_rawDataStream;
      this.field_102326_rawDataFormat = var1.field_102326_rawDataFormat;
      this.field_102362_soundBuffer = var2;
      if(this.field_102335_toStream && this.field_102347_filenameURL != null) {
         this.field_102332_codec = C_101416_SoundSystemConfig.func_102578_getCodec(this.field_102347_filenameURL.func_102509_getFilename());
      }

   }

   public C_101423_Source(AudioFormat var1, boolean var2, String var3, float var4, float var5, float var6, int var7, float var8) {
      this.field_102338_priority = var2;
      this.field_102335_toStream = true;
      this.field_102349_toLoop = false;
      this.field_102330_sourcename = var3;
      this.field_102347_filenameURL = null;
      this.field_102362_soundBuffer = null;
      this.field_102325_position = new C_101410_Vector3D(var4, var5, var6);
      this.field_102328_attModel = var7;
      this.field_102360_distOrRoll = var8;
      this.field_102341_velocity = new C_101410_Vector3D(0.0F, 0.0F, 0.0F);
      this.field_102331_temporary = false;
      this.field_102333_rawDataStream = true;
      this.field_102326_rawDataFormat = var1;
   }

   public void func_102314_cleanup() {
      if(this.field_102332_codec != null) {
         this.field_102332_codec.func_102437_cleanup();
      }

      Object var1 = this.field_102334_soundSequenceLock;
      synchronized(this.field_102334_soundSequenceLock) {
         if(this.field_102329_soundSequenceQueue != null) {
            this.field_102329_soundSequenceQueue.clear();
         }

         this.field_102329_soundSequenceQueue = null;
      }

      this.field_102330_sourcename = null;
      this.field_102347_filenameURL = null;
      this.field_102325_position = null;
      this.field_102362_soundBuffer = null;
      this.field_102332_codec = null;
   }

   public void func_102308_queueSound(C_101414_FilenameURL var1) {
      if(!this.field_102335_toStream) {
         this.func_102306_errorMessage("Method \'queueSound\' may only be used for streaming and MIDI sources.");
      } else if(var1 == null) {
         this.func_102306_errorMessage("File not specified in method \'queueSound\'");
      } else {
         Object var2 = this.field_102334_soundSequenceLock;
         synchronized(this.field_102334_soundSequenceLock) {
            if(this.field_102329_soundSequenceQueue == null) {
               this.field_102329_soundSequenceQueue = new LinkedList();
            }

            this.field_102329_soundSequenceQueue.add(var1);
         }
      }
   }

   public void func_102281_dequeueSound(String var1) {
      if(!this.field_102335_toStream) {
         this.func_102306_errorMessage("Method \'dequeueSound\' may only be used for streaming and MIDI sources.");
      } else if(var1 != null && !var1.equals("")) {
         Object var2 = this.field_102334_soundSequenceLock;
         synchronized(this.field_102334_soundSequenceLock) {
            if(this.field_102329_soundSequenceQueue != null) {
               ListIterator var3 = this.field_102329_soundSequenceQueue.listIterator();

               while(var3.hasNext()) {
                  if(((C_101414_FilenameURL)var3.next()).func_102509_getFilename().equals(var1)) {
                     var3.remove();
                     break;
                  }
               }
            }

         }
      } else {
         this.func_102306_errorMessage("Filename not specified in method \'dequeueSound\'");
      }
   }

   public void func_102296_fadeOut(C_101414_FilenameURL var1, long var2) {
      if(!this.field_102335_toStream) {
         this.func_102306_errorMessage("Method \'fadeOut\' may only be used for streaming and MIDI sources.");
      } else if(var2 < 0L) {
         this.func_102306_errorMessage("Miliseconds may not be negative in method \'fadeOut\'.");
      } else {
         this.field_102346_fadeOutMilis = var2;
         this.field_102353_fadeInMilis = 0L;
         this.field_102345_fadeOutGain = 1.0F;
         this.field_102361_lastFadeCheck = System.currentTimeMillis();
         Object var4 = this.field_102334_soundSequenceLock;
         synchronized(this.field_102334_soundSequenceLock) {
            if(this.field_102329_soundSequenceQueue != null) {
               this.field_102329_soundSequenceQueue.clear();
            }

            if(var1 != null) {
               if(this.field_102329_soundSequenceQueue == null) {
                  this.field_102329_soundSequenceQueue = new LinkedList();
               }

               this.field_102329_soundSequenceQueue.add(var1);
            }

         }
      }
   }

   public void func_102279_fadeOutIn(C_101414_FilenameURL var1, long var2, long var4) {
      if(!this.field_102335_toStream) {
         this.func_102306_errorMessage("Method \'fadeOutIn\' may only be used for streaming and MIDI sources.");
      } else if(var1 == null) {
         this.func_102306_errorMessage("Filename/URL not specified in method \'fadeOutIn\'.");
      } else if(var2 >= 0L && var4 >= 0L) {
         this.field_102346_fadeOutMilis = var2;
         this.field_102353_fadeInMilis = var4;
         this.field_102345_fadeOutGain = 1.0F;
         this.field_102361_lastFadeCheck = System.currentTimeMillis();
         Object var6 = this.field_102334_soundSequenceLock;
         synchronized(this.field_102334_soundSequenceLock) {
            if(this.field_102329_soundSequenceQueue == null) {
               this.field_102329_soundSequenceQueue = new LinkedList();
            }

            this.field_102329_soundSequenceQueue.clear();
            this.field_102329_soundSequenceQueue.add(var1);
         }
      } else {
         this.func_102306_errorMessage("Miliseconds may not be negative in method \'fadeOutIn\'.");
      }
   }

   public boolean func_102280_checkFadeOut() {
      if(!this.field_102335_toStream) {
         return false;
      } else if(this.field_102345_fadeOutGain == -1.0F && this.field_102344_fadeInGain == 1.0F) {
         return false;
      } else {
         long var1 = System.currentTimeMillis();
         long var3 = var1 - this.field_102361_lastFadeCheck;
         this.field_102361_lastFadeCheck = var1;
         float var5;
         if(this.field_102345_fadeOutGain >= 0.0F) {
            if(this.field_102346_fadeOutMilis == 0L) {
               this.field_102345_fadeOutGain = -1.0F;
               this.field_102344_fadeInGain = 0.0F;
               if(!this.func_102318_incrementSoundSequence()) {
                  this.func_102295_stop();
               }

               this.func_102291_positionChanged();
               this.field_102327_preLoad = true;
               return false;
            } else {
               var5 = (float)var3 / (float)this.field_102346_fadeOutMilis;
               this.field_102345_fadeOutGain -= var5;
               if(this.field_102345_fadeOutGain <= 0.0F) {
                  this.field_102345_fadeOutGain = -1.0F;
                  this.field_102344_fadeInGain = 0.0F;
                  if(!this.func_102318_incrementSoundSequence()) {
                     this.func_102295_stop();
                  }

                  this.func_102291_positionChanged();
                  this.field_102327_preLoad = true;
                  return false;
               } else {
                  this.func_102291_positionChanged();
                  return true;
               }
            }
         } else if(this.field_102344_fadeInGain < 1.0F) {
            this.field_102345_fadeOutGain = -1.0F;
            if(this.field_102353_fadeInMilis == 0L) {
               this.field_102345_fadeOutGain = -1.0F;
               this.field_102344_fadeInGain = 1.0F;
            } else {
               var5 = (float)var3 / (float)this.field_102353_fadeInMilis;
               this.field_102344_fadeInGain += var5;
               if(this.field_102344_fadeInGain >= 1.0F) {
                  this.field_102345_fadeOutGain = -1.0F;
                  this.field_102344_fadeInGain = 1.0F;
               }
            }

            this.func_102291_positionChanged();
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean func_102318_incrementSoundSequence() {
      if(!this.field_102335_toStream) {
         this.func_102306_errorMessage("Method \'incrementSoundSequence\' may only be used for streaming and MIDI sources.");
         return false;
      } else {
         Object var1 = this.field_102334_soundSequenceLock;
         synchronized(this.field_102334_soundSequenceLock) {
            if(this.field_102329_soundSequenceQueue != null && this.field_102329_soundSequenceQueue.size() > 0) {
               this.field_102347_filenameURL = (C_101414_FilenameURL)this.field_102329_soundSequenceQueue.remove(0);
               if(this.field_102332_codec != null) {
                  this.field_102332_codec.func_102437_cleanup();
               }

               this.field_102332_codec = C_101416_SoundSystemConfig.func_102578_getCodec(this.field_102347_filenameURL.func_102509_getFilename());
               return true;
            } else {
               return false;
            }
         }
      }
   }

   public boolean func_102288_readBuffersFromNextSoundInSequence() {
      if(!this.field_102335_toStream) {
         this.func_102306_errorMessage("Method \'readBuffersFromNextSoundInSequence\' may only be used for streaming sources.");
         return false;
      } else {
         Object var1 = this.field_102334_soundSequenceLock;
         synchronized(this.field_102334_soundSequenceLock) {
            if(this.field_102329_soundSequenceQueue != null && this.field_102329_soundSequenceQueue.size() > 0) {
               if(this.field_102343_nextCodec != null) {
                  this.field_102343_nextCodec.func_102437_cleanup();
               }

               this.field_102343_nextCodec = C_101416_SoundSystemConfig.func_102578_getCodec(((C_101414_FilenameURL)this.field_102329_soundSequenceQueue.get(0)).func_102509_getFilename());
               this.field_102343_nextCodec.func_102439_initialize(((C_101414_FilenameURL)this.field_102329_soundSequenceQueue.get(0)).func_102508_getURL());
               C_101422_SoundBuffer var2 = null;

               for(int var3 = 0; var3 < C_101416_SoundSystemConfig.func_102574_getNumberStreamingBuffers() && !this.field_102343_nextCodec.func_102438_endOfStream(); ++var3) {
                  var2 = this.field_102343_nextCodec.func_102441_read();
                  if(var2 != null) {
                     if(this.field_102336_nextBuffers == null) {
                        this.field_102336_nextBuffers = new LinkedList();
                     }

                     this.field_102336_nextBuffers.add(var2);
                  }
               }

               return true;
            } else {
               return false;
            }
         }
      }
   }

   public int func_102278_getSoundSequenceQueueSize() {
      return this.field_102329_soundSequenceQueue == null?0:this.field_102329_soundSequenceQueue.size();
   }

   public void func_102287_setTemporary(boolean var1) {
      this.field_102331_temporary = var1;
   }

   public void func_102304_listenerMoved() {}

   public void func_102319_setPosition(float var1, float var2, float var3) {
      this.field_102325_position.field_102507_x = var1;
      this.field_102325_position.field_102506_y = var2;
      this.field_102325_position.field_102505_z = var3;
   }

   public void func_102291_positionChanged() {}

   public void func_102286_setPriority(boolean var1) {
      this.field_102338_priority = var1;
   }

   public void func_102311_setLooping(boolean var1) {
      this.field_102349_toLoop = var1;
   }

   public void func_102305_setAttenuation(int var1) {
      this.field_102328_attModel = var1;
   }

   public void func_102282_setDistOrRoll(float var1) {
      this.field_102360_distOrRoll = var1;
   }

   public void func_102322_setVelocity(float var1, float var2, float var3) {
      this.field_102341_velocity.field_102507_x = var1;
      this.field_102341_velocity.field_102506_y = var2;
      this.field_102341_velocity.field_102505_z = var3;
   }

   public float func_102297_getDistanceFromListener() {
      return this.field_102351_distanceFromListener;
   }

   public void func_102317_setPitch(float var1) {
      float var2 = var1;
      if(var1 < 0.5F) {
         var2 = 0.5F;
      } else if(var1 > 2.0F) {
         var2 = 2.0F;
      }

      this.field_102358_pitch = var2;
   }

   public float func_102284_getPitch() {
      return this.field_102358_pitch;
   }

   public boolean func_102315_reverseByteOrder() {
      return C_101416_SoundSystemConfig.func_102580_reverseByteOrder(this.field_102350_libraryType);
   }

   public void func_102316_changeSource(boolean var1, boolean var2, boolean var3, String var4, C_101414_FilenameURL var5, C_101422_SoundBuffer var6, float var7, float var8, float var9, int var10, float var11, boolean var12) {
      this.field_102338_priority = var1;
      this.field_102335_toStream = var2;
      this.field_102349_toLoop = var3;
      this.field_102330_sourcename = var4;
      this.field_102347_filenameURL = var5;
      this.field_102362_soundBuffer = var6;
      this.field_102325_position.field_102507_x = var7;
      this.field_102325_position.field_102506_y = var8;
      this.field_102325_position.field_102505_z = var9;
      this.field_102328_attModel = var10;
      this.field_102360_distOrRoll = var11;
      this.field_102331_temporary = var12;
   }

   public int func_102298_feedRawAudioData(C_101413_Channel var1, byte[] var2) {
      if(!this.func_102292_active(false, false)) {
         this.field_102342_toPlay = true;
         return -1;
      } else {
         if(this.field_102359_channel != var1) {
            this.field_102359_channel = var1;
            this.field_102359_channel.func_102395_close();
            this.field_102359_channel.func_102382_setAudioFormat(this.field_102326_rawDataFormat);
            this.func_102291_positionChanged();
         }

         this.func_102300_stopped(true, false);
         this.func_102302_paused(true, false);
         return this.field_102359_channel.func_102385_feedRawAudioData(var2);
      }
   }

   public void func_102307_play(C_101413_Channel var1) {
      if(!this.func_102292_active(false, false)) {
         if(this.field_102349_toLoop) {
            this.field_102342_toPlay = true;
         }

      } else {
         if(this.field_102359_channel != var1) {
            this.field_102359_channel = var1;
            this.field_102359_channel.func_102395_close();
         }

         this.func_102300_stopped(true, false);
         this.func_102302_paused(true, false);
      }
   }

   public boolean func_102313_stream() {
      if(this.field_102359_channel == null) {
         return false;
      } else {
         if(this.field_102327_preLoad) {
            if(!this.field_102333_rawDataStream) {
               return this.func_102310_preLoad();
            }

            this.field_102327_preLoad = false;
         }

         if(this.field_102333_rawDataStream) {
            if(!this.func_102303_stopped() && !this.func_102321_paused()) {
               if(this.field_102359_channel.func_102401_buffersProcessed() > 0) {
                  this.field_102359_channel.func_102396_processBuffer();
               }

               return true;
            } else {
               return true;
            }
         } else if(this.field_102332_codec == null) {
            return false;
         } else if(this.func_102303_stopped()) {
            return false;
         } else if(this.func_102321_paused()) {
            return true;
         } else {
            int var1 = this.field_102359_channel.func_102401_buffersProcessed();
            C_101422_SoundBuffer var2 = null;

            for(int var3 = 0; var3 < var1; ++var3) {
               var2 = this.field_102332_codec.func_102441_read();
               if(var2 != null) {
                  if(var2.field_102656_audioData != null) {
                     this.field_102359_channel.func_102381_queueBuffer(var2.field_102656_audioData);
                  }

                  var2.func_102655_cleanup();
                  var2 = null;
                  return true;
               }

               if(this.field_102332_codec.func_102438_endOfStream()) {
                  Object var4 = this.field_102334_soundSequenceLock;
                  synchronized(this.field_102334_soundSequenceLock) {
                     if(C_101416_SoundSystemConfig.func_102572_getStreamQueueFormatsMatch()) {
                        if(this.field_102329_soundSequenceQueue != null && this.field_102329_soundSequenceQueue.size() > 0) {
                           if(this.field_102332_codec != null) {
                              this.field_102332_codec.func_102437_cleanup();
                           }

                           this.field_102347_filenameURL = (C_101414_FilenameURL)this.field_102329_soundSequenceQueue.remove(0);
                           this.field_102332_codec = C_101416_SoundSystemConfig.func_102578_getCodec(this.field_102347_filenameURL.func_102509_getFilename());
                           this.field_102332_codec.func_102439_initialize(this.field_102347_filenameURL.func_102508_getURL());
                           var2 = this.field_102332_codec.func_102441_read();
                           if(var2 != null) {
                              if(var2.field_102656_audioData != null) {
                                 this.field_102359_channel.func_102381_queueBuffer(var2.field_102656_audioData);
                              }

                              var2.func_102655_cleanup();
                              var2 = null;
                              return true;
                           }
                        } else if(this.field_102349_toLoop) {
                           this.field_102332_codec.func_102439_initialize(this.field_102347_filenameURL.func_102508_getURL());
                           var2 = this.field_102332_codec.func_102441_read();
                           if(var2 != null) {
                              if(var2.field_102656_audioData != null) {
                                 this.field_102359_channel.func_102381_queueBuffer(var2.field_102656_audioData);
                              }

                              var2.func_102655_cleanup();
                              var2 = null;
                              return true;
                           }
                        }
                     }
                  }
               }
            }

            return false;
         }
      }
   }

   public boolean func_102310_preLoad() {
      if(this.field_102359_channel == null) {
         return false;
      } else if(this.field_102332_codec == null) {
         return false;
      } else {
         C_101422_SoundBuffer var1 = null;
         boolean var2 = false;
         Object var3 = this.field_102334_soundSequenceLock;
         synchronized(this.field_102334_soundSequenceLock) {
            if(this.field_102336_nextBuffers == null || this.field_102336_nextBuffers.isEmpty()) {
               var2 = true;
            }
         }

         if(this.field_102343_nextCodec != null && !var2) {
            this.field_102332_codec = this.field_102343_nextCodec;
            this.field_102343_nextCodec = null;
            var3 = this.field_102334_soundSequenceLock;
            synchronized(this.field_102334_soundSequenceLock) {
               while(!this.field_102336_nextBuffers.isEmpty()) {
                  var1 = (C_101422_SoundBuffer)this.field_102336_nextBuffers.remove(0);
                  if(var1 != null) {
                     if(var1.field_102656_audioData != null) {
                        this.field_102359_channel.func_102381_queueBuffer(var1.field_102656_audioData);
                     }

                     var1.func_102655_cleanup();
                     var1 = null;
                  }
               }
            }
         } else {
            this.field_102343_nextCodec = null;
            URL var8 = this.field_102347_filenameURL.func_102508_getURL();
            this.field_102332_codec.func_102439_initialize(var8);

            for(int var4 = 0; var4 < C_101416_SoundSystemConfig.func_102574_getNumberStreamingBuffers(); ++var4) {
               var1 = this.field_102332_codec.func_102441_read();
               if(var1 != null) {
                  if(var1.field_102656_audioData != null) {
                     this.field_102359_channel.func_102381_queueBuffer(var1.field_102656_audioData);
                  }

                  var1.func_102655_cleanup();
                  var1 = null;
               }
            }
         }

         return true;
      }
   }

   public void func_102324_pause() {
      this.field_102342_toPlay = false;
      this.func_102302_paused(true, true);
      if(this.field_102359_channel != null) {
         this.field_102359_channel.func_102400_pause();
      } else {
         this.func_102306_errorMessage("Channel null in method \'pause\'");
      }

   }

   public void func_102295_stop() {
      this.field_102342_toPlay = false;
      this.func_102300_stopped(true, true);
      this.func_102302_paused(true, false);
      if(this.field_102359_channel != null) {
         this.field_102359_channel.func_102390_stop();
      } else {
         this.func_102306_errorMessage("Channel null in method \'stop\'");
      }

   }

   public void func_102283_rewind() {
      if(this.func_102302_paused(false, false)) {
         this.func_102295_stop();
      }

      if(this.field_102359_channel != null) {
         boolean var1 = this.func_102299_playing();
         this.field_102359_channel.func_102383_rewind();
         if(this.field_102335_toStream && var1) {
            this.func_102295_stop();
            this.func_102307_play(this.field_102359_channel);
         }
      } else {
         this.func_102306_errorMessage("Channel null in method \'rewind\'");
      }

   }

   public void func_102293_flush() {
      if(this.field_102359_channel != null) {
         this.field_102359_channel.func_102388_flush();
      } else {
         this.func_102306_errorMessage("Channel null in method \'flush\'");
      }

   }

   public void func_102285_cull() {
      if(this.func_102292_active(false, false)) {
         if(this.func_102299_playing() && this.field_102349_toLoop) {
            this.field_102342_toPlay = true;
         }

         if(this.field_102333_rawDataStream) {
            this.field_102342_toPlay = true;
         }

         this.func_102292_active(true, false);
         if(this.field_102359_channel != null) {
            this.field_102359_channel.func_102395_close();
         }

         this.field_102359_channel = null;
      }
   }

   public void func_102312_activate() {
      this.func_102292_active(true, true);
   }

   public boolean func_102309_active() {
      return this.func_102292_active(false, false);
   }

   public boolean func_102299_playing() {
      return this.field_102359_channel != null && this.field_102359_channel.field_102406_attachedSource == this?(!this.func_102321_paused() && !this.func_102303_stopped()?this.field_102359_channel.func_102392_playing():false):false;
   }

   public boolean func_102303_stopped() {
      return this.func_102300_stopped(false, false);
   }

   public boolean func_102321_paused() {
      return this.func_102302_paused(false, false);
   }

   public float func_102301_millisecondsPlayed() {
      return this.field_102359_channel == null?-1.0F:this.field_102359_channel.func_102394_millisecondsPlayed();
   }

   private synchronized boolean func_102292_active(boolean var1, boolean var2) {
      if(var1) {
         this.field_102357_active = var2;
      }

      return this.field_102357_active;
   }

   private synchronized boolean func_102300_stopped(boolean var1, boolean var2) {
      if(var1) {
         this.field_102356_stopped = var2;
      }

      return this.field_102356_stopped;
   }

   private synchronized boolean func_102302_paused(boolean var1, boolean var2) {
      if(var1) {
         this.field_102348_paused = var2;
      }

      return this.field_102348_paused;
   }

   public String func_102320_getClassName() {
      String var1 = C_101416_SoundSystemConfig.func_102589_getLibraryTitle(this.field_102350_libraryType);
      return var1.equals("No Sound")?"Source":"Source" + var1;
   }

   protected void func_102290_message(String var1) {
      this.field_102340_logger.func_102651_message(var1, 0);
   }

   protected void func_102294_importantMessage(String var1) {
      this.field_102340_logger.func_102653_importantMessage(var1, 0);
   }

   protected boolean func_102289_errorCheck(boolean var1, String var2) {
      return this.field_102340_logger.func_102648_errorCheck(var1, this.func_102320_getClassName(), var2, 0);
   }

   protected void func_102306_errorMessage(String var1) {
      this.field_102340_logger.func_102649_errorMessage(this.func_102320_getClassName(), var1, 0);
   }

   protected void func_102323_printStackTrace(Exception var1) {
      this.field_102340_logger.func_102650_printStackTrace(var1, 1);
   }
}
