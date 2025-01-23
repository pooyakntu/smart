package e8;

import java.io.Serializable;
import r8.m;

public final class j<A, B> implements Serializable {
  private final A g;
  
  private final B h;
  
  public j(A paramA, B paramB) {
    this.g = paramA;
    this.h = paramB;
  }
  
  public final A a() {
    return this.g;
  }
  
  public final B c() {
    return this.h;
  }
  
  public final A d() {
    return this.g;
  }
  
  public final B e() {
    return this.h;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof j))
      return false; 
    paramObject = paramObject;
    return !m.e(this.g, ((j)paramObject).g) ? false : (!!m.e(this.h, ((j)paramObject).h));
  }
  
  public int hashCode() {
    int i;
    A a = this.g;
    int k = 0;
    if (a == null) {
      i = 0;
    } else {
      i = a.hashCode();
    } 
    B b = this.h;
    if (b != null)
      k = b.hashCode(); 
    return i * 31 + k;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('(');
    stringBuilder.append(this.g);
    stringBuilder.append(", ");
    stringBuilder.append(this.h);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e8\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */