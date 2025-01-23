package b2;

import java.util.Set;
import z1.b;
import z1.e;
import z1.f;
import z1.g;

final class p implements g {
  private final Set<b> a;
  
  private final o b;
  
  private final s c;
  
  p(Set<b> paramSet, o paramo, s params) {
    this.a = paramSet;
    this.b = paramo;
    this.c = params;
  }
  
  public <T> f<T> a(String paramString, Class<T> paramClass, b paramb, e<T, byte[]> parame) {
    if (this.a.contains(paramb))
      return new r<T>(this.b, paramString, paramb, parame, this.c); 
    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[] { paramb, this.a }));
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b2\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */