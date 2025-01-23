package j1;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import d1.g;
import java.io.InputStream;

public class s<Data> implements n<Integer, Data> {
  private final n<Uri, Data> a;
  
  private final Resources b;
  
  public s(Resources paramResources, n<Uri, Data> paramn) {
    this.b = paramResources;
    this.a = paramn;
  }
  
  private Uri d(Integer paramInteger) {
    try {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("android.resource://");
      stringBuilder.append(this.b.getResourcePackageName(paramInteger.intValue()));
      stringBuilder.append('/');
      stringBuilder.append(this.b.getResourceTypeName(paramInteger.intValue()));
      stringBuilder.append('/');
      stringBuilder.append(this.b.getResourceEntryName(paramInteger.intValue()));
      return Uri.parse(stringBuilder.toString());
    } catch (android.content.res.Resources.NotFoundException notFoundException) {
      if (Log.isLoggable("ResourceLoader", 5)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Received invalid resource id: ");
        stringBuilder.append(paramInteger);
      } 
      return null;
    } 
  }
  
  public n.a<Data> c(Integer paramInteger, int paramInt1, int paramInt2, g paramg) {
    Uri uri = d(paramInteger);
    return (uri == null) ? null : this.a.b(uri, paramInt1, paramInt2, paramg);
  }
  
  public boolean e(Integer paramInteger) {
    return true;
  }
  
  public static final class a implements o<Integer, AssetFileDescriptor> {
    private final Resources a;
    
    public a(Resources param1Resources) {
      this.a = param1Resources;
    }
    
    public n<Integer, AssetFileDescriptor> a(r param1r) {
      return new s<AssetFileDescriptor>(this.a, param1r.d(Uri.class, AssetFileDescriptor.class));
    }
  }
  
  public static class b implements o<Integer, ParcelFileDescriptor> {
    private final Resources a;
    
    public b(Resources param1Resources) {
      this.a = param1Resources;
    }
    
    public n<Integer, ParcelFileDescriptor> a(r param1r) {
      return new s<ParcelFileDescriptor>(this.a, param1r.d(Uri.class, ParcelFileDescriptor.class));
    }
  }
  
  public static class c implements o<Integer, InputStream> {
    private final Resources a;
    
    public c(Resources param1Resources) {
      this.a = param1Resources;
    }
    
    public n<Integer, InputStream> a(r param1r) {
      return new s<InputStream>(this.a, param1r.d(Uri.class, InputStream.class));
    }
  }
  
  public static class d implements o<Integer, Uri> {
    private final Resources a;
    
    public d(Resources param1Resources) {
      this.a = param1Resources;
    }
    
    public n<Integer, Uri> a(r param1r) {
      return new s<Uri>(this.a, v.c());
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */