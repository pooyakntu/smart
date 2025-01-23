package j1;

import android.net.Uri;
import android.text.TextUtils;
import d1.e;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import x1.k;

public class g implements e {
  private final h b;
  
  private final URL c = null;
  
  private final String d;
  
  private String e;
  
  private URL f;
  
  private volatile byte[] g;
  
  private int h;
  
  public g(String paramString) {
    this(paramString, h.b);
  }
  
  public g(String paramString, h paramh) {
    this.d = k.b(paramString);
    this.b = (h)k.d(paramh);
  }
  
  public g(URL paramURL) {
    this(paramURL, h.b);
  }
  
  public g(URL paramURL, h paramh) {
    this.d = null;
    this.b = (h)k.d(paramh);
  }
  
  private byte[] d() {
    if (this.g == null)
      this.g = c().getBytes(e.a); 
    return this.g;
  }
  
  private String f() {
    if (TextUtils.isEmpty(this.e)) {
      String str2 = this.d;
      String str1 = str2;
      if (TextUtils.isEmpty(str2))
        str1 = ((URL)k.d(this.c)).toString(); 
      this.e = Uri.encode(str1, "@#&=*+-_.,:!?()/~'%;$");
    } 
    return this.e;
  }
  
  private URL g() throws MalformedURLException {
    if (this.f == null)
      this.f = new URL(f()); 
    return this.f;
  }
  
  public void a(MessageDigest paramMessageDigest) {
    paramMessageDigest.update(d());
  }
  
  public String c() {
    String str = this.d;
    return (str != null) ? str : ((URL)k.d(this.c)).toString();
  }
  
  public Map<String, String> e() {
    return this.b.a();
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof g;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (bool) {
      paramObject = paramObject;
      bool1 = bool2;
      if (c().equals(paramObject.c())) {
        bool1 = bool2;
        if (this.b.equals(((g)paramObject).b))
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public URL h() throws MalformedURLException {
    return g();
  }
  
  public int hashCode() {
    if (this.h == 0) {
      int i = c().hashCode();
      this.h = i;
      this.h = i * 31 + this.b.hashCode();
    } 
    return this.h;
  }
  
  public String toString() {
    return c();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */