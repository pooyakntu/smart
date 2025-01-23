package j1;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.h;
import d1.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class f<Data> implements n<File, Data> {
  private final d<Data> a;
  
  public f(d<Data> paramd) {
    this.a = paramd;
  }
  
  public n.a<Data> c(File paramFile, int paramInt1, int paramInt2, g paramg) {
    return new n.a<Data>((d1.e)new w1.d(paramFile), new c<Data>(paramFile, this.a));
  }
  
  public boolean d(File paramFile) {
    return true;
  }
  
  public static class a<Data> implements o<File, Data> {
    private final f.d<Data> a;
    
    public a(f.d<Data> param1d) {
      this.a = param1d;
    }
    
    public final n<File, Data> a(r param1r) {
      return new f<Data>(this.a);
    }
  }
  
  public static class b extends a<ParcelFileDescriptor> {
    public b() {
      super(new a());
    }
    
    class a implements f.d<ParcelFileDescriptor> {
      public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
      }
      
      public void d(ParcelFileDescriptor param2ParcelFileDescriptor) throws IOException {
        param2ParcelFileDescriptor.close();
      }
      
      public ParcelFileDescriptor e(File param2File) throws FileNotFoundException {
        return ParcelFileDescriptor.open(param2File, 268435456);
      }
    }
  }
  
  class a implements d<ParcelFileDescriptor> {
    public Class<ParcelFileDescriptor> a() {
      return ParcelFileDescriptor.class;
    }
    
    public void d(ParcelFileDescriptor param1ParcelFileDescriptor) throws IOException {
      param1ParcelFileDescriptor.close();
    }
    
    public ParcelFileDescriptor e(File param1File) throws FileNotFoundException {
      return ParcelFileDescriptor.open(param1File, 268435456);
    }
  }
  
  private static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {
    private final File g;
    
    private final f.d<Data> h;
    
    private Data i;
    
    c(File param1File, f.d<Data> param1d) {
      this.g = param1File;
      this.h = param1d;
    }
    
    public Class<Data> a() {
      return this.h.a();
    }
    
    public void b() {
      Data data = this.i;
      if (data != null)
        try {
          this.h.b(data);
          return;
        } catch (IOException iOException) {
          return;
        }  
    }
    
    public void cancel() {}
    
    public d1.a d() {
      return d1.a.LOCAL;
    }
    
    public void e(h param1h, com.bumptech.glide.load.data.d.a<? super Data> param1a) {
      try {
        param1h = (h)this.h.c(this.g);
        this.i = (Data)param1h;
        param1a.f(param1h);
        return;
      } catch (FileNotFoundException fileNotFoundException) {
        param1a.c(fileNotFoundException);
        return;
      } 
    }
  }
  
  public static interface d<Data> {
    Class<Data> a();
    
    void b(Data param1Data) throws IOException;
    
    Data c(File param1File) throws FileNotFoundException;
  }
  
  public static class e extends a<InputStream> {
    public e() {
      super(new a());
    }
    
    class a implements f.d<InputStream> {
      public Class<InputStream> a() {
        return InputStream.class;
      }
      
      public void d(InputStream param2InputStream) throws IOException {
        param2InputStream.close();
      }
      
      public InputStream e(File param2File) throws FileNotFoundException {
        return new FileInputStream(param2File);
      }
    }
  }
  
  class a implements d<InputStream> {
    public Class<InputStream> a() {
      return InputStream.class;
    }
    
    public void d(InputStream param1InputStream) throws IOException {
      param1InputStream.close();
    }
    
    public InputStream e(File param1File) throws FileNotFoundException {
      return new FileInputStream(param1File);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */