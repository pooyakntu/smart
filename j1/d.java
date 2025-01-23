package j1;

import com.bumptech.glide.h;
import d1.e;
import d1.g;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class d implements n<File, ByteBuffer> {
  public n.a<ByteBuffer> c(File paramFile, int paramInt1, int paramInt2, g paramg) {
    return new n.a<ByteBuffer>((e)new w1.d(paramFile), new a(paramFile));
  }
  
  public boolean d(File paramFile) {
    return true;
  }
  
  private static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {
    private final File g;
    
    a(File param1File) {
      this.g = param1File;
    }
    
    public Class<ByteBuffer> a() {
      return ByteBuffer.class;
    }
    
    public void b() {}
    
    public void cancel() {}
    
    public d1.a d() {
      return d1.a.LOCAL;
    }
    
    public void e(h param1h, com.bumptech.glide.load.data.d.a<? super ByteBuffer> param1a) {
      try {
        param1a.f(x1.a.a(this.g));
        return;
      } catch (IOException iOException) {
        param1a.c(iOException);
        return;
      } 
    }
  }
  
  public static class b implements o<File, ByteBuffer> {
    public n<File, ByteBuffer> a(r param1r) {
      return new d();
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */