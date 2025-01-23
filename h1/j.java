package h1;

import androidx.core.util.e;
import d1.e;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import x1.h;
import x1.k;
import x1.l;
import y1.c;

public class j {
  private final h<e, String> a = new h(1000L);
  
  private final e<b> b = y1.a.d(10, new a(this));
  
  private String a(e parame) {
    b b = (b)k.d(this.b.b());
    try {
      parame.a(b.g);
      return l.v(b.g.digest());
    } finally {
      this.b.a(b);
    } 
  }
  
  public String b(e parame) {
    h<e, String> h1;
    String str;
    synchronized (this.a) {
      String str1 = (String)this.a.g(parame);
      str = str1;
      if (str1 == null)
        str = a(parame); 
      synchronized (this.a) {
        this.a.k(parame, str);
        return str;
      } 
    } 
  }
  
  class a implements y1.a.d<b> {
    a(j this$0) {}
    
    public j.b b() {
      try {
        return new j.b(MessageDigest.getInstance("SHA-256"));
      } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        throw new RuntimeException(noSuchAlgorithmException);
      } 
    }
  }
  
  private static final class b implements y1.a.f {
    final MessageDigest g;
    
    private final c h = c.a();
    
    b(MessageDigest param1MessageDigest) {
      this.g = param1MessageDigest;
    }
    
    public c e() {
      return this.h;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h1\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */