package j1;

import android.util.Base64;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import d1.g;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import w1.d;

public final class e<Model, Data> implements n<Model, Data> {
  private final a<Data> a;
  
  public e(a<Data> parama) {
    this.a = parama;
  }
  
  public boolean a(Model paramModel) {
    return paramModel.toString().startsWith("data:image");
  }
  
  public n.a<Data> b(Model paramModel, int paramInt1, int paramInt2, g paramg) {
    return new n.a<Data>((d1.e)new d(paramModel), new b<Data>(paramModel.toString(), this.a));
  }
  
  public static interface a<Data> {
    Class<Data> a();
    
    void b(Data param1Data) throws IOException;
    
    Data c(String param1String) throws IllegalArgumentException;
  }
  
  private static final class b<Data> implements d<Data> {
    private final String g;
    
    private final e.a<Data> h;
    
    private Data i;
    
    b(String param1String, e.a<Data> param1a) {
      this.g = param1String;
      this.h = param1a;
    }
    
    public Class<Data> a() {
      return this.h.a();
    }
    
    public void b() {
      try {
        this.h.b(this.i);
        return;
      } catch (IOException iOException) {
        return;
      } 
    }
    
    public void cancel() {}
    
    public d1.a d() {
      return d1.a.LOCAL;
    }
    
    public void e(h param1h, d.a<? super Data> param1a) {
      try {
        param1h = (h)this.h.c(this.g);
        this.i = (Data)param1h;
        param1a.f(param1h);
        return;
      } catch (IllegalArgumentException illegalArgumentException) {
        param1a.c(illegalArgumentException);
        return;
      } 
    }
  }
  
  public static final class c<Model> implements o<Model, InputStream> {
    private final e.a<InputStream> a = new a(this);
    
    public n<Model, InputStream> a(r param1r) {
      return new e<Model, InputStream>(this.a);
    }
    
    class a implements e.a<InputStream> {
      a(e.c this$0) {}
      
      public Class<InputStream> a() {
        return InputStream.class;
      }
      
      public void d(InputStream param2InputStream) throws IOException {
        param2InputStream.close();
      }
      
      public InputStream e(String param2String) {
        if (param2String.startsWith("data:image")) {
          int i = param2String.indexOf(',');
          if (i != -1) {
            if (param2String.substring(0, i).endsWith(";base64"))
              return new ByteArrayInputStream(Base64.decode(param2String.substring(i + 1), 0)); 
            throw new IllegalArgumentException("Not a base64 image data URL.");
          } 
          throw new IllegalArgumentException("Missing comma in data URL.");
        } 
        throw new IllegalArgumentException("Not a valid image data URL.");
      }
    }
  }
  
  class a implements a<InputStream> {
    a(e this$0) {}
    
    public Class<InputStream> a() {
      return InputStream.class;
    }
    
    public void d(InputStream param1InputStream) throws IOException {
      param1InputStream.close();
    }
    
    public InputStream e(String param1String) {
      if (param1String.startsWith("data:image")) {
        int i = param1String.indexOf(',');
        if (i != -1) {
          if (param1String.substring(0, i).endsWith(";base64"))
            return new ByteArrayInputStream(Base64.decode(param1String.substring(i + 1), 0)); 
          throw new IllegalArgumentException("Not a base64 image data URL.");
        } 
        throw new IllegalArgumentException("Missing comma in data URL.");
      } 
      throw new IllegalArgumentException("Not a valid image data URL.");
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */