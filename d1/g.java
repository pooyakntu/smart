package d1;

import androidx.collection.a;
import java.security.MessageDigest;
import x1.b;

public final class g implements e {
  private final a<f<?>, Object> b = (a<f<?>, Object>)new b();
  
  private static <T> void f(f<T> paramf, Object paramObject, MessageDigest paramMessageDigest) {
    paramf.g((T)paramObject, paramMessageDigest);
  }
  
  public void a(MessageDigest paramMessageDigest) {
    for (int i = 0; i < this.b.size(); i++)
      f((f)this.b.j(i), this.b.n(i), paramMessageDigest); 
  }
  
  public <T> T c(f<T> paramf) {
    return (T)(this.b.containsKey(paramf) ? this.b.get(paramf) : (Object)paramf.c());
  }
  
  public void d(g paramg) {
    this.b.k((androidx.collection.g)paramg.b);
  }
  
  public <T> g e(f<T> paramf, T paramT) {
    this.b.put(paramf, paramT);
    return this;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof g) {
      paramObject = paramObject;
      return this.b.equals(((g)paramObject).b);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.b.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Options{values=");
    stringBuilder.append(this.b);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d1\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */