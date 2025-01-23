package j1;

import android.net.Uri;
import d1.g;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class x<Data> implements n<Uri, Data> {
  private static final Set<String> b = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(new String[] { "http", "https" })));
  
  private final n<g, Data> a;
  
  public x(n<g, Data> paramn) {
    this.a = paramn;
  }
  
  public n.a<Data> c(Uri paramUri, int paramInt1, int paramInt2, g paramg) {
    g g1 = new g(paramUri.toString());
    return this.a.b(g1, paramInt1, paramInt2, paramg);
  }
  
  public boolean d(Uri paramUri) {
    return b.contains(paramUri.getScheme());
  }
  
  public static class a implements o<Uri, InputStream> {
    public n<Uri, InputStream> a(r param1r) {
      return new x<InputStream>(param1r.d(g.class, InputStream.class));
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */