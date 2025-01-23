package j1;

import com.bumptech.glide.h;
import d1.e;
import d1.g;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class b<Data> implements n<byte[], Data> {
  private final b<Data> a;
  
  public b(b<Data> paramb) {
    this.a = paramb;
  }
  
  public n.a<Data> c(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, g paramg) {
    return new n.a<Data>((e)new w1.d(paramArrayOfbyte), new c<Data>(paramArrayOfbyte, this.a));
  }
  
  public boolean d(byte[] paramArrayOfbyte) {
    return true;
  }
  
  public static class a implements o<byte[], ByteBuffer> {
    public n<byte[], ByteBuffer> a(r param1r) {
      return new b<ByteBuffer>(new a(this));
    }
    
    class a implements b.b<ByteBuffer> {
      a(b.a this$0) {}
      
      public Class<ByteBuffer> a() {
        return ByteBuffer.class;
      }
      
      public ByteBuffer c(byte[] param2ArrayOfbyte) {
        return ByteBuffer.wrap(param2ArrayOfbyte);
      }
    }
  }
  
  class a implements b<ByteBuffer> {
    a(b this$0) {}
    
    public Class<ByteBuffer> a() {
      return ByteBuffer.class;
    }
    
    public ByteBuffer c(byte[] param1ArrayOfbyte) {
      return ByteBuffer.wrap(param1ArrayOfbyte);
    }
  }
  
  public static interface b<Data> {
    Class<Data> a();
    
    Data b(byte[] param1ArrayOfbyte);
  }
  
  private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {
    private final byte[] g;
    
    private final b.b<Data> h;
    
    c(byte[] param1ArrayOfbyte, b.b<Data> param1b) {
      this.g = param1ArrayOfbyte;
      this.h = param1b;
    }
    
    public Class<Data> a() {
      return this.h.a();
    }
    
    public void b() {}
    
    public void cancel() {}
    
    public d1.a d() {
      return d1.a.LOCAL;
    }
    
    public void e(h param1h, com.bumptech.glide.load.data.d.a<? super Data> param1a) {
      param1a.f(this.h.b(this.g));
    }
  }
  
  public static class d implements o<byte[], InputStream> {
    public n<byte[], InputStream> a(r param1r) {
      return new b<InputStream>(new a(this));
    }
    
    class a implements b.b<InputStream> {
      a(b.d this$0) {}
      
      public Class<InputStream> a() {
        return InputStream.class;
      }
      
      public InputStream c(byte[] param2ArrayOfbyte) {
        return new ByteArrayInputStream(param2ArrayOfbyte);
      }
    }
  }
  
  class a implements b<InputStream> {
    a(b this$0) {}
    
    public Class<InputStream> a() {
      return InputStream.class;
    }
    
    public InputStream c(byte[] param1ArrayOfbyte) {
      return new ByteArrayInputStream(param1ArrayOfbyte);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */