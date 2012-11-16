package com.jcraft.jorbis;

import com.jcraft.jorbis.C_101373_VorbisFile;
import java.io.InputStream;
import java.io.RandomAccessFile;

class C_101373_VorbisFile$C_101392_SeekableInputStream extends InputStream {

   RandomAccessFile field_101592_raf;
   final String field_101593_mode;
   // $FF: synthetic field
   final C_101373_VorbisFile field_101591_this$0;


   C_101373_VorbisFile$C_101392_SeekableInputStream(C_101373_VorbisFile var1, String var2) {
      this.field_101591_this$0 = var1;
      this.field_101592_raf = null;
      this.field_101593_mode = "r";
      this.field_101592_raf = new RandomAccessFile(var2, "r");
   }

   public int read() {
      return this.field_101592_raf.read();
   }

   public int read(byte[] var1) {
      return this.field_101592_raf.read(var1);
   }

   public int read(byte[] var1, int var2, int var3) {
      return this.field_101592_raf.read(var1, var2, var3);
   }

   public long skip(long var1) {
      return (long)this.field_101592_raf.skipBytes((int)var1);
   }

   public long func_101589_getLength() {
      return this.field_101592_raf.length();
   }

   public long func_101590_tell() {
      return this.field_101592_raf.getFilePointer();
   }

   public int available() {
      return this.field_101592_raf.length() == this.field_101592_raf.getFilePointer()?0:1;
   }

   public void close() {
      this.field_101592_raf.close();
   }

   public synchronized void mark(int var1) {}

   public synchronized void reset() {}

   public boolean markSupported() {
      return false;
   }

   public void func_101588_seek(long var1) {
      this.field_101592_raf.seek(var1);
   }
}
