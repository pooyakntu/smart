package e9;

import d9.a;
import f9.k;
import g9.g0;
import j8.g;

public final class q {
  private static final g0 a = new g0("NONE");
  
  private static final g0 b = new g0("PENDING");
  
  public static final <T> k<T> a(T paramT) {
    g0 g01;
    T t = paramT;
    if (paramT == null)
      g01 = k.a; 
    return new p<T>(g01);
  }
  
  public static final <T> c<T> d(o<? extends T> paramo, g paramg, int paramInt, a parama) {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt >= 0) {
      bool1 = bool2;
      if (paramInt < 2)
        bool1 = true; 
    } 
    return (c<T>)(((bool1 || paramInt == -2) && parama == a.DROP_OLDEST) ? paramo : n.a(paramo, paramg, paramInt, parama));
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e9\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */