package e8;

import java.io.Serializable;
import q8.a;
import r8.g;

final class m<T> implements f<T>, Serializable {
  private a<? extends T> g;
  
  private volatile Object h;
  
  private final Object i;
  
  public m(a<? extends T> parama, Object paramObject) {
    this.g = parama;
    this.h = p.a;
    Object object = paramObject;
    if (paramObject == null)
      object = this; 
    this.i = object;
  }
  
  public T getValue() {
    null = (Object<? extends T>)this.h;
    p p = p.a;
    if (null != p)
      return (T)null; 
    synchronized (this.i) {
      null = (Object<? extends T>)this.h;
      if (null == p) {
        null = (Object<? extends T>)this.g;
        r8.m.g(null);
        null = (Object<? extends T>)null.invoke();
        this.h = null;
        this.g = null;
      } 
      return (T)null;
    } 
  }
  
  public boolean isInitialized() {
    return (this.h != p.a);
  }
  
  public String toString() {
    return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e8\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */