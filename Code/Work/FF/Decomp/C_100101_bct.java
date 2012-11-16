import java.io.InputStream;
import p_101361_paulscode.p_101409_sound.p_101429_codecs.C_101439_CodecJOrbis;

public class C_100101_bct extends C_101439_CodecJOrbis {

   protected InputStream func_102459_openInputStream() {
      return new C_100108_bcu(this, this.field_102488_url, this.field_102480_urlConnection.getInputStream());
   }
}
