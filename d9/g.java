package d9;

import e8.q;
import q8.l;

public final class g {
  public static final <E> d<E> a(int paramInt, a parama, l<? super E, q> paraml) {
    if (paramInt != -2) {
      boolean bool = false;
      if (paramInt != -1) {
        if (paramInt != 0)
          return (paramInt != Integer.MAX_VALUE) ? ((parama == a.SUSPEND) ? new b<E>(paramInt, paraml) : new m<E>(paramInt, parama, paraml)) : new b<E>(2147483647, paraml); 
        if (parama == a.SUSPEND) {
          null = new b<E>(0, paraml);
        } else {
          null = new m<E>(1, (a)null, paraml);
        } 
        return null;
      } 
      paramInt = bool;
      if (null == a.SUSPEND)
        paramInt = 1; 
      if (paramInt != 0)
        return new m<E>(1, a.DROP_OLDEST, paraml); 
      throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
    } 
    return (null == a.SUSPEND) ? new b<E>(d.e.a(), paraml) : new m<E>(1, (a)null, paraml);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d9\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */