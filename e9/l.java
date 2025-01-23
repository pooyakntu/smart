package e9;

import b9.n1;
import d9.a;
import f9.i;
import j8.d;
import j8.g;

final class l<T> implements o<T>, c, i<T> {
  private final n1 g;
  
  public l(o<? extends T> paramo, n1 paramn1) {
    this.g = paramn1;
    this.h = (o)paramo;
  }
  
  public Object a(d<? super T> paramd, d<?> paramd1) {
    return this.h.a(paramd, paramd1);
  }
  
  public c<T> b(g paramg, int paramInt, a parama) {
    return q.d(this, paramg, paramInt, parama);
  }
  
  public T getValue() {
    return this.h.getValue();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e9\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */