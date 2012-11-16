package p_101361_paulscode.p_101409_sound;

import java.net.URL;
import javax.sound.sampled.AudioFormat;
import p_101361_paulscode.p_101409_sound.C_101422_SoundBuffer;

public interface C_101412_ICodec {

   void func_102436_reverseByteOrder(boolean var1);

   boolean func_102439_initialize(URL var1);

   boolean func_102442_initialized();

   C_101422_SoundBuffer func_102441_read();

   C_101422_SoundBuffer func_102440_readAll();

   boolean func_102438_endOfStream();

   void func_102437_cleanup();

   AudioFormat func_102443_getAudioFormat();
}
