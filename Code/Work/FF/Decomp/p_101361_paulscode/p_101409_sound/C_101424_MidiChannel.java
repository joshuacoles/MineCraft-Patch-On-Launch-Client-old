package p_101361_paulscode.p_101409_sound;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.MidiDevice.Info;
import p_101361_paulscode.p_101409_sound.C_101411_SoundSystemException;
import p_101361_paulscode.p_101409_sound.C_101414_FilenameURL;
import p_101361_paulscode.p_101409_sound.C_101416_SoundSystemConfig;
import p_101361_paulscode.p_101409_sound.C_101420_SoundSystemLogger;
import p_101361_paulscode.p_101409_sound.C_101424_MidiChannel$1;
import p_101361_paulscode.p_101409_sound.C_101424_MidiChannel$C_101442_FadeThread;
import p_101361_paulscode.p_101409_sound.C_101425_SoundSystem;

public class C_101424_MidiChannel implements MetaEventListener {

   private C_101420_SoundSystemLogger field_102715_logger;
   private C_101414_FilenameURL field_102702_filenameURL;
   private String field_102704_sourcename;
   private static final int field_102717_CHANGE_VOLUME = 7;
   private static final int field_102713_END_OF_TRACK = 47;
   private static final boolean field_102710_GET = false;
   private static final boolean field_102711_SET = true;
   private static final boolean field_102712_XXX = false;
   private Sequencer field_102706_sequencer = null;
   private Synthesizer field_102708_synthesizer = null;
   private MidiDevice field_102701_synthDevice = null;
   private Sequence field_102714_sequence = null;
   private boolean field_102705_toLoop = true;
   private float field_102707_gain = 1.0F;
   private boolean field_102703_loading = true;
   private LinkedList field_102722_sequenceQueue = null;
   private final Object field_102716_sequenceQueueLock = new Object();
   protected float field_102719_fadeOutGain = -1.0F;
   protected float field_102718_fadeInGain = 1.0F;
   protected long field_102700_fadeOutMilis = 0L;
   protected long field_102709_fadeInMilis = 0L;
   protected long field_102721_lastFadeCheck = 0L;
   private C_101424_MidiChannel$C_101442_FadeThread field_102720_fadeThread = null;


   public C_101424_MidiChannel(boolean var1, String var2, String var3) {
      this.func_102682_loading(true, true);
      this.field_102715_logger = C_101416_SoundSystemConfig.func_102576_getLogger();
      this.func_102694_filenameURL(true, new C_101414_FilenameURL(var3));
      this.func_102699_sourcename(true, var2);
      this.func_102680_setLooping(var1);
      this.func_102659_init();
      this.func_102682_loading(true, false);
   }

   public C_101424_MidiChannel(boolean var1, String var2, URL var3, String var4) {
      this.func_102682_loading(true, true);
      this.field_102715_logger = C_101416_SoundSystemConfig.func_102576_getLogger();
      this.func_102694_filenameURL(true, new C_101414_FilenameURL(var3, var4));
      this.func_102699_sourcename(true, var2);
      this.func_102680_setLooping(var1);
      this.func_102659_init();
      this.func_102682_loading(true, false);
   }

   public C_101424_MidiChannel(boolean var1, String var2, C_101414_FilenameURL var3) {
      this.func_102682_loading(true, true);
      this.field_102715_logger = C_101416_SoundSystemConfig.func_102576_getLogger();
      this.func_102694_filenameURL(true, var3);
      this.func_102699_sourcename(true, var2);
      this.func_102680_setLooping(var1);
      this.func_102659_init();
      this.func_102682_loading(true, false);
   }

   private void func_102659_init() {
      this.func_102698_getSequencer();
      this.func_102687_setSequence(this.func_102694_filenameURL(false, (C_101414_FilenameURL)null).func_102508_getURL());
      this.func_102673_getSynthesizer();
      this.func_102658_resetGain();
   }

   public void func_102683_cleanup() {
      this.func_102682_loading(true, true);
      this.func_102680_setLooping(true);
      if(this.field_102706_sequencer != null) {
         try {
            this.field_102706_sequencer.stop();
            this.field_102706_sequencer.close();
            this.field_102706_sequencer.removeMetaEventListener(this);
         } catch (Exception var6) {
            ;
         }
      }

      this.field_102715_logger = null;
      this.field_102706_sequencer = null;
      this.field_102708_synthesizer = null;
      this.field_102714_sequence = null;
      Object var1 = this.field_102716_sequenceQueueLock;
      synchronized(this.field_102716_sequenceQueueLock) {
         if(this.field_102722_sequenceQueue != null) {
            this.field_102722_sequenceQueue.clear();
         }

         this.field_102722_sequenceQueue = null;
      }

      if(this.field_102720_fadeThread != null) {
         boolean var8 = false;

         try {
            this.field_102720_fadeThread.func_102520_kill();
            this.field_102720_fadeThread.interrupt();
         } catch (Exception var5) {
            var8 = true;
         }

         if(!var8) {
            for(int var2 = 0; var2 < 50 && this.field_102720_fadeThread.func_102522_alive(); ++var2) {
               try {
                  Thread.sleep(100L);
               } catch (InterruptedException var4) {
                  ;
               }
            }
         }

         if(var8 || this.field_102720_fadeThread.func_102522_alive()) {
            this.func_102677_errorMessage("MIDI fade effects thread did not die!");
            this.func_102670_message("Ignoring errors... continuing clean-up.");
         }
      }

      this.field_102720_fadeThread = null;
      this.func_102682_loading(true, false);
   }

   public void func_102679_queueSound(C_101414_FilenameURL var1) {
      if(var1 == null) {
         this.func_102677_errorMessage("Filename/URL not specified in method \'queueSound\'");
      } else {
         Object var2 = this.field_102716_sequenceQueueLock;
         synchronized(this.field_102716_sequenceQueueLock) {
            if(this.field_102722_sequenceQueue == null) {
               this.field_102722_sequenceQueue = new LinkedList();
            }

            this.field_102722_sequenceQueue.add(var1);
         }
      }
   }

   public void func_102663_dequeueSound(String var1) {
      if(var1 != null && !var1.equals("")) {
         Object var2 = this.field_102716_sequenceQueueLock;
         synchronized(this.field_102716_sequenceQueueLock) {
            if(this.field_102722_sequenceQueue != null) {
               ListIterator var3 = this.field_102722_sequenceQueue.listIterator();

               while(var3.hasNext()) {
                  if(((C_101414_FilenameURL)var3.next()).func_102509_getFilename().equals(var1)) {
                     var3.remove();
                     break;
                  }
               }
            }

         }
      } else {
         this.func_102677_errorMessage("Filename not specified in method \'dequeueSound\'");
      }
   }

   public void func_102674_fadeOut(C_101414_FilenameURL var1, long var2) {
      if(var2 < 0L) {
         this.func_102677_errorMessage("Miliseconds may not be negative in method \'fadeOut\'.");
      } else {
         this.field_102700_fadeOutMilis = var2;
         this.field_102709_fadeInMilis = 0L;
         this.field_102719_fadeOutGain = 1.0F;
         this.field_102721_lastFadeCheck = System.currentTimeMillis();
         Object var4 = this.field_102716_sequenceQueueLock;
         synchronized(this.field_102716_sequenceQueueLock) {
            if(this.field_102722_sequenceQueue != null) {
               this.field_102722_sequenceQueue.clear();
            }

            if(var1 != null) {
               if(this.field_102722_sequenceQueue == null) {
                  this.field_102722_sequenceQueue = new LinkedList();
               }

               this.field_102722_sequenceQueue.add(var1);
            }
         }

         if(this.field_102720_fadeThread == null) {
            this.field_102720_fadeThread = new C_101424_MidiChannel$C_101442_FadeThread(this, (C_101424_MidiChannel$1)null);
            this.field_102720_fadeThread.start();
         }

         this.field_102720_fadeThread.interrupt();
      }
   }

   public void func_102661_fadeOutIn(C_101414_FilenameURL var1, long var2, long var4) {
      if(var1 == null) {
         this.func_102677_errorMessage("Filename/URL not specified in method \'fadeOutIn\'.");
      } else if(var2 >= 0L && var4 >= 0L) {
         this.field_102700_fadeOutMilis = var2;
         this.field_102709_fadeInMilis = var4;
         this.field_102719_fadeOutGain = 1.0F;
         this.field_102721_lastFadeCheck = System.currentTimeMillis();
         Object var6 = this.field_102716_sequenceQueueLock;
         synchronized(this.field_102716_sequenceQueueLock) {
            if(this.field_102722_sequenceQueue == null) {
               this.field_102722_sequenceQueue = new LinkedList();
            }

            this.field_102722_sequenceQueue.clear();
            this.field_102722_sequenceQueue.add(var1);
         }

         if(this.field_102720_fadeThread == null) {
            this.field_102720_fadeThread = new C_101424_MidiChannel$C_101442_FadeThread(this, (C_101424_MidiChannel$1)null);
            this.field_102720_fadeThread.start();
         }

         this.field_102720_fadeThread.interrupt();
      } else {
         this.func_102677_errorMessage("Miliseconds may not be negative in method \'fadeOutIn\'.");
      }
   }

   private synchronized boolean func_102662_checkFadeOut() {
      if(this.field_102719_fadeOutGain == -1.0F && this.field_102718_fadeInGain == 1.0F) {
         return false;
      } else {
         long var1 = System.currentTimeMillis();
         long var3 = var1 - this.field_102721_lastFadeCheck;
         this.field_102721_lastFadeCheck = var1;
         float var5;
         if(this.field_102719_fadeOutGain >= 0.0F) {
            if(this.field_102700_fadeOutMilis == 0L) {
               this.field_102719_fadeOutGain = 0.0F;
               this.field_102718_fadeInGain = 0.0F;
               if(!this.func_102691_incrementSequence()) {
                  this.func_102672_stop();
               }

               this.func_102666_rewind();
               this.func_102658_resetGain();
               return false;
            } else {
               var5 = (float)var3 / (float)this.field_102700_fadeOutMilis;
               this.field_102719_fadeOutGain -= var5;
               if(this.field_102719_fadeOutGain <= 0.0F) {
                  this.field_102719_fadeOutGain = -1.0F;
                  this.field_102718_fadeInGain = 0.0F;
                  if(!this.func_102691_incrementSequence()) {
                     this.func_102672_stop();
                  }

                  this.func_102666_rewind();
                  this.func_102658_resetGain();
                  return false;
               } else {
                  this.func_102658_resetGain();
                  return true;
               }
            }
         } else {
            if(this.field_102718_fadeInGain < 1.0F) {
               this.field_102719_fadeOutGain = -1.0F;
               if(this.field_102709_fadeInMilis == 0L) {
                  this.field_102719_fadeOutGain = -1.0F;
                  this.field_102718_fadeInGain = 1.0F;
               } else {
                  var5 = (float)var3 / (float)this.field_102709_fadeInMilis;
                  this.field_102718_fadeInGain += var5;
                  if(this.field_102718_fadeInGain >= 1.0F) {
                     this.field_102719_fadeOutGain = -1.0F;
                     this.field_102718_fadeInGain = 1.0F;
                  }
               }

               this.func_102658_resetGain();
            }

            return false;
         }
      }
   }

   private boolean func_102691_incrementSequence() {
      Object var1 = this.field_102716_sequenceQueueLock;
      synchronized(this.field_102716_sequenceQueueLock) {
         if(this.field_102722_sequenceQueue != null && this.field_102722_sequenceQueue.size() > 0) {
            this.func_102694_filenameURL(true, (C_101414_FilenameURL)this.field_102722_sequenceQueue.remove(0));
            this.func_102682_loading(true, true);
            if(this.field_102706_sequencer == null) {
               this.func_102698_getSequencer();
            } else {
               this.field_102706_sequencer.stop();
               this.field_102706_sequencer.setMicrosecondPosition(0L);
               this.field_102706_sequencer.removeMetaEventListener(this);

               try {
                  Thread.sleep(100L);
               } catch (InterruptedException var4) {
                  ;
               }
            }

            if(this.field_102706_sequencer == null) {
               this.func_102677_errorMessage("Unable to set the sequence in method \'incrementSequence\', because there wasn\'t a sequencer to use.");
               this.func_102682_loading(true, false);
               return false;
            } else {
               this.func_102687_setSequence(this.func_102694_filenameURL(false, (C_101414_FilenameURL)null).func_102508_getURL());
               this.field_102706_sequencer.start();
               this.func_102658_resetGain();
               this.field_102706_sequencer.addMetaEventListener(this);
               this.func_102682_loading(true, false);
               return true;
            }
         } else {
            return false;
         }
      }
   }

   public void func_102690_play() {
      if(!this.func_102665_loading()) {
         if(this.field_102706_sequencer == null) {
            return;
         }

         try {
            this.field_102706_sequencer.start();
            this.field_102706_sequencer.addMetaEventListener(this);
         } catch (Exception var3) {
            this.func_102677_errorMessage("Exception in method \'play\'");
            this.func_102695_printStackTrace(var3);
            C_101411_SoundSystemException var2 = new C_101411_SoundSystemException(var3.getMessage());
            C_101425_SoundSystem.func_102744_setException(var2);
         }
      }

   }

   public void func_102672_stop() {
      if(!this.func_102665_loading()) {
         if(this.field_102706_sequencer == null) {
            return;
         }

         try {
            this.field_102706_sequencer.stop();
            this.field_102706_sequencer.setMicrosecondPosition(0L);
            this.field_102706_sequencer.removeMetaEventListener(this);
         } catch (Exception var3) {
            this.func_102677_errorMessage("Exception in method \'stop\'");
            this.func_102695_printStackTrace(var3);
            C_101411_SoundSystemException var2 = new C_101411_SoundSystemException(var3.getMessage());
            C_101425_SoundSystem.func_102744_setException(var2);
         }
      }

   }

   public void func_102696_pause() {
      if(!this.func_102665_loading()) {
         if(this.field_102706_sequencer == null) {
            return;
         }

         try {
            this.field_102706_sequencer.stop();
         } catch (Exception var3) {
            this.func_102677_errorMessage("Exception in method \'pause\'");
            this.func_102695_printStackTrace(var3);
            C_101411_SoundSystemException var2 = new C_101411_SoundSystemException(var3.getMessage());
            C_101425_SoundSystem.func_102744_setException(var2);
         }
      }

   }

   public void func_102666_rewind() {
      if(!this.func_102665_loading()) {
         if(this.field_102706_sequencer == null) {
            return;
         }

         try {
            this.field_102706_sequencer.setMicrosecondPosition(0L);
         } catch (Exception var3) {
            this.func_102677_errorMessage("Exception in method \'rewind\'");
            this.func_102695_printStackTrace(var3);
            C_101411_SoundSystemException var2 = new C_101411_SoundSystemException(var3.getMessage());
            C_101425_SoundSystem.func_102744_setException(var2);
         }
      }

   }

   public void func_102685_setVolume(float var1) {
      this.field_102707_gain = var1;
      this.func_102658_resetGain();
   }

   public float func_102668_getVolume() {
      return this.field_102707_gain;
   }

   public void func_102686_switchSource(boolean var1, String var2, String var3) {
      this.func_102682_loading(true, true);
      this.func_102694_filenameURL(true, new C_101414_FilenameURL(var3));
      this.func_102699_sourcename(true, var2);
      this.func_102680_setLooping(var1);
      this.func_102676_reset();
      this.func_102682_loading(true, false);
   }

   public void func_102664_switchSource(boolean var1, String var2, URL var3, String var4) {
      this.func_102682_loading(true, true);
      this.func_102694_filenameURL(true, new C_101414_FilenameURL(var3, var4));
      this.func_102699_sourcename(true, var2);
      this.func_102680_setLooping(var1);
      this.func_102676_reset();
      this.func_102682_loading(true, false);
   }

   public void func_102678_switchSource(boolean var1, String var2, C_101414_FilenameURL var3) {
      this.func_102682_loading(true, true);
      this.func_102694_filenameURL(true, var3);
      this.func_102699_sourcename(true, var2);
      this.func_102680_setLooping(var1);
      this.func_102676_reset();
      this.func_102682_loading(true, false);
   }

   private void func_102676_reset() {
      Object var1 = this.field_102716_sequenceQueueLock;
      synchronized(this.field_102716_sequenceQueueLock) {
         if(this.field_102722_sequenceQueue != null) {
            this.field_102722_sequenceQueue.clear();
         }
      }

      if(this.field_102706_sequencer == null) {
         this.func_102698_getSequencer();
      } else {
         this.field_102706_sequencer.stop();
         this.field_102706_sequencer.setMicrosecondPosition(0L);
         this.field_102706_sequencer.removeMetaEventListener(this);

         try {
            Thread.sleep(100L);
         } catch (InterruptedException var3) {
            ;
         }
      }

      if(this.field_102706_sequencer == null) {
         this.func_102677_errorMessage("Unable to set the sequence in method \'reset\', because there wasn\'t a sequencer to use.");
      } else {
         this.func_102687_setSequence(this.func_102694_filenameURL(false, (C_101414_FilenameURL)null).func_102508_getURL());
         this.field_102706_sequencer.start();
         this.func_102658_resetGain();
         this.field_102706_sequencer.addMetaEventListener(this);
      }
   }

   public void func_102680_setLooping(boolean var1) {
      this.func_102692_toLoop(true, var1);
   }

   public boolean func_102675_getLooping() {
      return this.func_102692_toLoop(false, false);
   }

   private synchronized boolean func_102692_toLoop(boolean var1, boolean var2) {
      if(var1) {
         this.field_102705_toLoop = var2;
      }

      return this.field_102705_toLoop;
   }

   public boolean func_102665_loading() {
      return this.func_102682_loading(false, false);
   }

   private synchronized boolean func_102682_loading(boolean var1, boolean var2) {
      if(var1) {
         this.field_102703_loading = var2;
      }

      return this.field_102703_loading;
   }

   public void func_102667_setSourcename(String var1) {
      this.func_102699_sourcename(true, var1);
   }

   public String func_102684_getSourcename() {
      return this.func_102699_sourcename(false, (String)null);
   }

   private synchronized String func_102699_sourcename(boolean var1, String var2) {
      if(var1) {
         this.field_102704_sourcename = var2;
      }

      return this.field_102704_sourcename;
   }

   public void func_102688_setFilenameURL(C_101414_FilenameURL var1) {
      this.func_102694_filenameURL(true, var1);
   }

   public String func_102693_getFilename() {
      return this.func_102694_filenameURL(false, (C_101414_FilenameURL)null).func_102509_getFilename();
   }

   public C_101414_FilenameURL func_102660_getFilenameURL() {
      return this.func_102694_filenameURL(false, (C_101414_FilenameURL)null);
   }

   private synchronized C_101414_FilenameURL func_102694_filenameURL(boolean var1, C_101414_FilenameURL var2) {
      if(var1) {
         this.field_102702_filenameURL = var2;
      }

      return this.field_102702_filenameURL;
   }

   public void meta(MetaMessage var1) {
      if(var1.getType() == 47) {
         C_101416_SoundSystemConfig.func_102555_notifyEOS(this.field_102704_sourcename, this.field_102722_sequenceQueue.size());
         if(this.field_102705_toLoop) {
            if(!this.func_102662_checkFadeOut()) {
               if(!this.func_102691_incrementSequence()) {
                  try {
                     this.field_102706_sequencer.setMicrosecondPosition(0L);
                     this.field_102706_sequencer.start();
                     this.func_102658_resetGain();
                  } catch (Exception var6) {
                     ;
                  }
               }
            } else if(this.field_102706_sequencer != null) {
               try {
                  this.field_102706_sequencer.setMicrosecondPosition(0L);
                  this.field_102706_sequencer.start();
                  this.func_102658_resetGain();
               } catch (Exception var5) {
                  ;
               }
            }
         } else if(!this.func_102662_checkFadeOut()) {
            if(!this.func_102691_incrementSequence()) {
               try {
                  this.field_102706_sequencer.stop();
                  this.field_102706_sequencer.setMicrosecondPosition(0L);
                  this.field_102706_sequencer.removeMetaEventListener(this);
               } catch (Exception var4) {
                  ;
               }
            }
         } else {
            try {
               this.field_102706_sequencer.stop();
               this.field_102706_sequencer.setMicrosecondPosition(0L);
               this.field_102706_sequencer.removeMetaEventListener(this);
            } catch (Exception var3) {
               ;
            }
         }
      }

   }

   public void func_102658_resetGain() {
      if(this.field_102707_gain < 0.0F) {
         this.field_102707_gain = 0.0F;
      }

      if(this.field_102707_gain > 1.0F) {
         this.field_102707_gain = 1.0F;
      }

      int var1 = (int)(this.field_102707_gain * C_101416_SoundSystemConfig.func_102597_getMasterGain() * Math.abs(this.field_102719_fadeOutGain) * this.field_102718_fadeInGain * 127.0F);
      MidiChannel[] var2;
      int var3;
      if(this.field_102708_synthesizer != null) {
         var2 = this.field_102708_synthesizer.getChannels();

         for(var3 = 0; var2 != null && var3 < var2.length; ++var3) {
            var2[var3].controlChange(7, var1);
         }
      } else if(this.field_102701_synthDevice != null) {
         try {
            ShortMessage var7 = new ShortMessage();

            for(var3 = 0; var3 < 16; ++var3) {
               var7.setMessage(176, var3, 7, var1);
               this.field_102701_synthDevice.getReceiver().send(var7, -1L);
            }
         } catch (Exception var6) {
            this.func_102677_errorMessage("Error resetting gain on MIDI device");
            this.func_102695_printStackTrace(var6);
         }
      } else if(this.field_102706_sequencer != null && this.field_102706_sequencer instanceof Synthesizer) {
         this.field_102708_synthesizer = (Synthesizer)this.field_102706_sequencer;
         var2 = this.field_102708_synthesizer.getChannels();

         for(var3 = 0; var2 != null && var3 < var2.length; ++var3) {
            var2[var3].controlChange(7, var1);
         }
      } else {
         try {
            Receiver var8 = MidiSystem.getReceiver();
            ShortMessage var9 = new ShortMessage();

            for(int var4 = 0; var4 < 16; ++var4) {
               var9.setMessage(176, var4, 7, var1);
               var8.send(var9, -1L);
            }
         } catch (Exception var5) {
            this.func_102677_errorMessage("Error resetting gain on default receiver");
            this.func_102695_printStackTrace(var5);
         }
      }

   }

   private void func_102698_getSequencer() {
      try {
         this.field_102706_sequencer = MidiSystem.getSequencer();
         if(this.field_102706_sequencer != null) {
            try {
               this.field_102706_sequencer.getTransmitter();
            } catch (MidiUnavailableException var6) {
               this.func_102670_message("Unable to get a transmitter from the default MIDI sequencer");
            }

            this.field_102706_sequencer.open();
         }
      } catch (MidiUnavailableException var7) {
         this.func_102670_message("Unable to open the default MIDI sequencer");
         this.field_102706_sequencer = null;
      } catch (Exception var8) {
         if(var8 instanceof InterruptedException) {
            this.func_102670_message("Caught InterruptedException while attempting to open the default MIDI sequencer.  Trying again.");
            this.field_102706_sequencer = null;
         }

         try {
            this.field_102706_sequencer = MidiSystem.getSequencer();
            if(this.field_102706_sequencer != null) {
               try {
                  this.field_102706_sequencer.getTransmitter();
               } catch (MidiUnavailableException var3) {
                  this.func_102670_message("Unable to get a transmitter from the default MIDI sequencer");
               }

               this.field_102706_sequencer.open();
            }
         } catch (MidiUnavailableException var4) {
            this.func_102670_message("Unable to open the default MIDI sequencer");
            this.field_102706_sequencer = null;
         } catch (Exception var5) {
            this.func_102670_message("Unknown error opening the default MIDI sequencer");
            this.field_102706_sequencer = null;
         }
      }

      if(this.field_102706_sequencer == null) {
         this.field_102706_sequencer = this.func_102689_openSequencer("Real Time Sequencer");
      }

      if(this.field_102706_sequencer == null) {
         this.field_102706_sequencer = this.func_102689_openSequencer("Java Sound Sequencer");
      }

      if(this.field_102706_sequencer == null) {
         this.func_102677_errorMessage("Failed to find an available MIDI sequencer");
      }
   }

   private void func_102687_setSequence(URL var1) {
      if(this.field_102706_sequencer == null) {
         this.func_102677_errorMessage("Unable to update the sequence in method \'setSequence\', because variable \'sequencer\' is null");
      } else if(var1 == null) {
         this.func_102677_errorMessage("Unable to load Midi file in method \'setSequence\'.");
      } else {
         try {
            this.field_102714_sequence = MidiSystem.getSequence(var1);
         } catch (IOException var5) {
            this.func_102677_errorMessage("Input failed while reading from MIDI file in method \'setSequence\'.");
            this.func_102695_printStackTrace(var5);
            return;
         } catch (InvalidMidiDataException var6) {
            this.func_102677_errorMessage("Invalid MIDI data encountered, or not a MIDI file in method \'setSequence\' (1).");
            this.func_102695_printStackTrace(var6);
            return;
         }

         if(this.field_102714_sequence == null) {
            this.func_102677_errorMessage("MidiSystem \'getSequence\' method returned null in method \'setSequence\'.");
         } else {
            try {
               this.field_102706_sequencer.setSequence(this.field_102714_sequence);
            } catch (InvalidMidiDataException var3) {
               this.func_102677_errorMessage("Invalid MIDI data encountered, or not a MIDI file in method \'setSequence\' (2).");
               this.func_102695_printStackTrace(var3);
               return;
            } catch (Exception var4) {
               this.func_102677_errorMessage("Problem setting sequence from MIDI file in method \'setSequence\'.");
               this.func_102695_printStackTrace(var4);
               return;
            }
         }

      }
   }

   private void func_102673_getSynthesizer() {
      if(this.field_102706_sequencer == null) {
         this.func_102677_errorMessage("Unable to load a Synthesizer in method \'getSynthesizer\', because variable \'sequencer\' is null");
      } else {
         String var1 = C_101416_SoundSystemConfig.func_102594_getOverrideMIDISynthesizer();
         if(var1 != null && !var1.equals("")) {
            this.field_102701_synthDevice = this.func_102681_openMidiDevice(var1);
            if(this.field_102701_synthDevice != null) {
               try {
                  this.field_102706_sequencer.getTransmitter().setReceiver(this.field_102701_synthDevice.getReceiver());
                  return;
               } catch (MidiUnavailableException var7) {
                  this.func_102677_errorMessage("Unable to link sequencer transmitter with receiver for MIDI device \'" + var1 + "\'");
               }
            }
         }

         if(this.field_102706_sequencer instanceof Synthesizer) {
            this.field_102708_synthesizer = (Synthesizer)this.field_102706_sequencer;
         } else {
            try {
               this.field_102708_synthesizer = MidiSystem.getSynthesizer();
               this.field_102708_synthesizer.open();
            } catch (MidiUnavailableException var6) {
               this.func_102670_message("Unable to open the default synthesizer");
               this.field_102708_synthesizer = null;
            }

            if(this.field_102708_synthesizer == null) {
               this.field_102701_synthDevice = this.func_102681_openMidiDevice("Java Sound Synthesizer");
               if(this.field_102701_synthDevice == null) {
                  this.field_102701_synthDevice = this.func_102681_openMidiDevice("Microsoft GS Wavetable");
               }

               if(this.field_102701_synthDevice == null) {
                  this.field_102701_synthDevice = this.func_102681_openMidiDevice("Gervill");
               }

               if(this.field_102701_synthDevice == null) {
                  this.func_102677_errorMessage("Failed to find an available MIDI synthesizer");
                  return;
               }
            }

            if(this.field_102708_synthesizer == null) {
               try {
                  this.field_102706_sequencer.getTransmitter().setReceiver(this.field_102701_synthDevice.getReceiver());
               } catch (MidiUnavailableException var5) {
                  this.func_102677_errorMessage("Unable to link sequencer transmitter with MIDI device receiver");
               }
            } else if(this.field_102708_synthesizer.getDefaultSoundbank() == null) {
               try {
                  this.field_102706_sequencer.getTransmitter().setReceiver(MidiSystem.getReceiver());
               } catch (MidiUnavailableException var4) {
                  this.func_102677_errorMessage("Unable to link sequencer transmitter with default receiver");
               }
            } else {
               try {
                  this.field_102706_sequencer.getTransmitter().setReceiver(this.field_102708_synthesizer.getReceiver());
               } catch (MidiUnavailableException var3) {
                  this.func_102677_errorMessage("Unable to link sequencer transmitter with synthesizer receiver");
               }
            }
         }

      }
   }

   private Sequencer func_102689_openSequencer(String var1) {
      Sequencer var2 = null;
      var2 = (Sequencer)this.func_102681_openMidiDevice(var1);
      if(var2 == null) {
         return null;
      } else {
         try {
            var2.getTransmitter();
            return var2;
         } catch (MidiUnavailableException var4) {
            this.func_102670_message("    Unable to get a transmitter from this sequencer");
            var2 = null;
            return null;
         }
      }
   }

   private MidiDevice func_102681_openMidiDevice(String var1) {
      this.func_102670_message("Searching for MIDI device with name containing \'" + var1 + "\'");
      MidiDevice var2 = null;
      Info[] var3 = MidiSystem.getMidiDeviceInfo();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         var2 = null;

         try {
            var2 = MidiSystem.getMidiDevice(var3[var4]);
         } catch (MidiUnavailableException var7) {
            this.func_102670_message("    Problem in method \'getMidiDevice\':  MIDIUnavailableException was thrown");
            var2 = null;
         }

         if(var2 != null && var3[var4].getName().contains(var1)) {
            this.func_102670_message("    Found MIDI device named \'" + var3[var4].getName() + "\'");
            if(var2 instanceof Synthesizer) {
               this.func_102670_message("        *this is a Synthesizer instance");
            }

            if(var2 instanceof Sequencer) {
               this.func_102670_message("        *this is a Sequencer instance");
            }

            try {
               var2.open();
            } catch (MidiUnavailableException var6) {
               this.func_102670_message("    Unable to open this MIDI device");
               var2 = null;
            }

            return var2;
         }
      }

      this.func_102670_message("    MIDI device not found");
      return null;
   }

   protected void func_102670_message(String var1) {
      this.field_102715_logger.func_102651_message(var1, 0);
   }

   protected void func_102671_importantMessage(String var1) {
      this.field_102715_logger.func_102653_importantMessage(var1, 0);
   }

   protected boolean func_102669_errorCheck(boolean var1, String var2) {
      return this.field_102715_logger.func_102648_errorCheck(var1, "MidiChannel", var2, 0);
   }

   protected void func_102677_errorMessage(String var1) {
      this.field_102715_logger.func_102649_errorMessage("MidiChannel", var1, 0);
   }

   protected void func_102695_printStackTrace(Exception var1) {
      this.field_102715_logger.func_102650_printStackTrace(var1, 1);
   }

   // $FF: synthetic method
   static boolean func_102697_access$100(C_101424_MidiChannel var0) {
      return var0.func_102662_checkFadeOut();
   }
}
