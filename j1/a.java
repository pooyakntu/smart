package j1;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.h;
import com.bumptech.glide.load.data.m;
import d1.e;
import d1.g;
import java.io.InputStream;
import w1.d;

public class a<Data> implements n<Uri, Data> {
  private static final int c = 22;
  
  private final AssetManager a;
  
  private final a<Data> b;
  
  public a(AssetManager paramAssetManager, a<Data> parama) {
    this.a = paramAssetManager;
    this.b = parama;
  }
  
  public n.a<Data> c(Uri paramUri, int paramInt1, int paramInt2, g paramg) {
    String str = paramUri.toString().substring(c);
    return new n.a<Data>((e)new d(paramUri), this.b.b(this.a, str));
  }
  
  public boolean d(Uri paramUri) {
    boolean bool = "file".equals(paramUri.getScheme());
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (bool) {
      bool1 = bool2;
      if (!paramUri.getPathSegments().isEmpty()) {
        bool1 = bool2;
        if ("android_asset".equals(paramUri.getPathSegments().get(0)))
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public static interface a<Data> {
    d<Data> b(AssetManager param1AssetManager, String param1String);
  }
  
  public static class b implements o<Uri, AssetFileDescriptor>, a<AssetFileDescriptor> {
    private final AssetManager a;
    
    public b(AssetManager param1AssetManager) {
      this.a = param1AssetManager;
    }
    
    public n<Uri, AssetFileDescriptor> a(r param1r) {
      return new a<AssetFileDescriptor>(this.a, this);
    }
    
    public d<AssetFileDescriptor> b(AssetManager param1AssetManager, String param1String) {
      return (d<AssetFileDescriptor>)new h(param1AssetManager, param1String);
    }
  }
  
  public static class c implements o<Uri, InputStream>, a<InputStream> {
    private final AssetManager a;
    
    public c(AssetManager param1AssetManager) {
      this.a = param1AssetManager;
    }
    
    public n<Uri, InputStream> a(r param1r) {
      return new a<InputStream>(this.a, this);
    }
    
    public d<InputStream> b(AssetManager param1AssetManager, String param1String) {
      return (d<InputStream>)new m(param1AssetManager, param1String);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */