package b1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class c implements Closeable {
  private final InputStream g;
  
  private final Charset h;
  
  private byte[] i;
  
  private int j;
  
  private int k;
  
  public c(InputStream paramInputStream, int paramInt, Charset paramCharset) {
    if (paramInputStream != null && paramCharset != null) {
      if (paramInt >= 0) {
        if (paramCharset.equals(d.a)) {
          this.g = paramInputStream;
          this.h = paramCharset;
          this.i = new byte[paramInt];
          return;
        } 
        throw new IllegalArgumentException("Unsupported encoding");
      } 
      throw new IllegalArgumentException("capacity <= 0");
    } 
    throw null;
  }
  
  public c(InputStream paramInputStream, Charset paramCharset) {
    this(paramInputStream, 8192, paramCharset);
  }
  
  private void d() throws IOException {
    InputStream inputStream = this.g;
    byte[] arrayOfByte = this.i;
    int i = inputStream.read(arrayOfByte, 0, arrayOfByte.length);
    if (i != -1) {
      this.j = 0;
      this.k = i;
      return;
    } 
    throw new EOFException();
  }
  
  public void close() throws IOException {
    synchronized (this.g) {
      if (this.i != null) {
        this.i = null;
        this.g.close();
      } 
      return;
    } 
  }
  
  public boolean r() {
    return (this.k == -1);
  }
  
  public String t() throws IOException {
    synchronized (this.g) {
      if (this.i != null) {
        if (this.j >= this.k)
          d(); 
        for (int i = this.j;; i++) {
          if (i != this.k) {
            byte[] arrayOfByte = this.i;
            if (arrayOfByte[i] == 10) {
              int k = this.j;
              if (i != k) {
                int m = i - 1;
                if (arrayOfByte[m] == 13) {
                  str = new String(arrayOfByte, k, m - k, this.h.name());
                  this.j = i + 1;
                  return str;
                } 
              } 
              int j = i;
              String str = new String((byte[])str, k, j - k, this.h.name());
              this.j = i + 1;
              return str;
            } 
          } else {
            a a = new a(this, this.k - this.j + 80);
            while (true) {
              byte[] arrayOfByte = this.i;
              i = this.j;
              a.write(arrayOfByte, i, this.k - i);
              this.k = -1;
              d();
              for (i = this.j; i != this.k; i++) {
                arrayOfByte = this.i;
                if (arrayOfByte[i] == 10) {
                  int j = this.j;
                  if (i != j)
                    a.write(arrayOfByte, j, i - j); 
                  this.j = i + 1;
                  return a.toString();
                } 
              } 
            } 
            break;
          } 
        } 
      } 
      throw new IOException("LineReader is closed");
    } 
  }
  
  class a extends ByteArrayOutputStream {
    a(c this$0, int param1Int) {
      super(param1Int);
    }
    
    public String toString() {
      int j = this.count;
      int i = j;
      if (j > 0) {
        i = j;
        if (this.buf[j - 1] == 13)
          i = j - 1; 
      } 
      try {
        return new String(this.buf, 0, i, c.c(this.g).name());
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        throw new AssertionError(unsupportedEncodingException);
      } 
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b1\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */