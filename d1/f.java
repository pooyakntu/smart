package d1;

import java.security.MessageDigest;
import x1.k;

public final class f<T> {
  private static final b<Object> e = new a();
  
  private final T a;
  
  private final b<T> b;
  
  private final String c;
  
  private volatile byte[] d;
  
  private f(String paramString, T paramT, b<T> paramb) {
    this.c = k.b(paramString);
    this.a = paramT;
    this.b = (b<T>)k.d(paramb);
  }
  
  public static <T> f<T> a(String paramString, T paramT, b<T> paramb) {
    return new f<T>(paramString, paramT, paramb);
  }
  
  private static <T> b<T> b() {
    return (b)e;
  }
  
  private byte[] d() {
    if (this.d == null)
      this.d = this.c.getBytes(e.a); 
    return this.d;
  }
  
  public static <T> f<T> e(String paramString) {
    return new f<T>(paramString, null, b());
  }
  
  public static <T> f<T> f(String paramString, T paramT) {
    return new f<T>(paramString, paramT, b());
  }
  
  public T c() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof f) {
      paramObject = paramObject;
      return this.c.equals(((f)paramObject).c);
    } 
    return false;
  }
  
  public void g(T paramT, MessageDigest paramMessageDigest) {
    this.b.a(d(), paramT, paramMessageDigest);
  }
  
  public int hashCode() {
    return this.c.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Option{key='");
    stringBuilder.append(this.c);
    stringBuilder.append('\'');
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  class a implements b<Object> {
    public void a(byte[] param1ArrayOfbyte, Object param1Object, MessageDigest param1MessageDigest) {}
  }
  
  public static interface b<T> {
    void a(byte[] param1ArrayOfbyte, T param1T, MessageDigest param1MessageDigest);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d1\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */