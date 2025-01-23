package j1;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.i;
import com.bumptech.glide.load.data.n;
import d1.e;
import d1.g;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class w<Data> implements n<Uri, Data> {
  private static final Set<String> b = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(new String[] { "file", "android.resource", "content" })));
  
  private final c<Data> a;
  
  public w(c<Data> paramc) {
    this.a = paramc;
  }
  
  public n.a<Data> c(Uri paramUri, int paramInt1, int paramInt2, g paramg) {
    return new n.a<Data>((e)new w1.d(paramUri), this.a.b(paramUri));
  }
  
  public boolean d(Uri paramUri) {
    return b.contains(paramUri.getScheme());
  }
  
  public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
    private final ContentResolver a;
    
    public a(ContentResolver param1ContentResolver) {
      this.a = param1ContentResolver;
    }
    
    public n<Uri, AssetFileDescriptor> a(r param1r) {
      return new w<AssetFileDescriptor>(this);
    }
    
    public com.bumptech.glide.load.data.d<AssetFileDescriptor> b(Uri param1Uri) {
      return (com.bumptech.glide.load.data.d<AssetFileDescriptor>)new com.bumptech.glide.load.data.a(this.a, param1Uri);
    }
  }
  
  public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
    private final ContentResolver a;
    
    public b(ContentResolver param1ContentResolver) {
      this.a = param1ContentResolver;
    }
    
    public n<Uri, ParcelFileDescriptor> a(r param1r) {
      return new w<ParcelFileDescriptor>(this);
    }
    
    public com.bumptech.glide.load.data.d<ParcelFileDescriptor> b(Uri param1Uri) {
      return (com.bumptech.glide.load.data.d<ParcelFileDescriptor>)new i(this.a, param1Uri);
    }
  }
  
  public static interface c<Data> {
    com.bumptech.glide.load.data.d<Data> b(Uri param1Uri);
  }
  
  public static class d implements o<Uri, InputStream>, c<InputStream> {
    private final ContentResolver a;
    
    public d(ContentResolver param1ContentResolver) {
      this.a = param1ContentResolver;
    }
    
    public n<Uri, InputStream> a(r param1r) {
      return new w<InputStream>(this);
    }
    
    public com.bumptech.glide.load.data.d<InputStream> b(Uri param1Uri) {
      return (com.bumptech.glide.load.data.d<InputStream>)new n(this.a, param1Uri);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */