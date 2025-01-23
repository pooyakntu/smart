package d9;

import b9.d0;
import e8.q;
import j8.g;

final class o<E> extends e<E> implements p<E> {
  public o(g paramg, d<E> paramd) {
    super(paramg, paramd, true, true);
  }
  
  protected void G0(Throwable paramThrowable, boolean paramBoolean) {
    if (!J0().g(paramThrowable) && !paramBoolean)
      d0.a(getContext(), paramThrowable); 
  }
  
  protected void K0(q paramq) {
    s.a.a(J0(), null, 1, null);
  }
  
  public boolean c() {
    return super.c();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d9\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */