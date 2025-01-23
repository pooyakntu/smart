package j1;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import d1.g;
import java.io.File;
import java.io.InputStream;

public class u<Data> implements n<String, Data> {
  private final n<Uri, Data> a;
  
  public u(n<Uri, Data> paramn) {
    this.a = paramn;
  }
  
  private static Uri e(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return null; 
    if (paramString.charAt(0) == '/')
      return f(paramString); 
    Uri uri = Uri.parse(paramString);
    return (uri.getScheme() == null) ? f(paramString) : uri;
  }
  
  private static Uri f(String paramString) {
    return Uri.fromFile(new File(paramString));
  }
  
  public n.a<Data> c(String paramString, int paramInt1, int paramInt2, g paramg) {
    Uri uri = e(paramString);
    return (uri == null || !this.a.a(uri)) ? null : this.a.b(uri, paramInt1, paramInt2, paramg);
  }
  
  public boolean d(String paramString) {
    return true;
  }
  
  public static final class a implements o<String, AssetFileDescriptor> {
    public n<String, AssetFileDescriptor> a(r param1r) {
      return new u<AssetFileDescriptor>(param1r.d(Uri.class, AssetFileDescriptor.class));
    }
  }
  
  public static class b implements o<String, ParcelFileDescriptor> {
    public n<String, ParcelFileDescriptor> a(r param1r) {
      return new u<ParcelFileDescriptor>(param1r.d(Uri.class, ParcelFileDescriptor.class));
    }
  }
  
  public static class c implements o<String, InputStream> {
    public n<String, InputStream> a(r param1r) {
      return new u<InputStream>(param1r.d(Uri.class, InputStream.class));
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j\\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */