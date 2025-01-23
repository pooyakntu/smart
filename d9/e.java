package d9;

import b9.a;
import b9.n1;
import b9.u1;
import e8.q;
import j8.d;
import j8.g;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;
import q8.l;

public class e<E> extends a<q> implements d<E> {
  private final d<E> j;
  
  public e(g paramg, d<E> paramd, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramg, paramBoolean1, paramBoolean2);
    this.j = paramd;
  }
  
  protected final d<E> J0() {
    return this.j;
  }
  
  public Object b(E paramE, d<? super q> paramd) {
    return this.j.b(paramE, paramd);
  }
  
  public final void d(CancellationException paramCancellationException) {
    JobCancellationException jobCancellationException;
    if (b0())
      return; 
    CancellationException cancellationException = paramCancellationException;
    if (paramCancellationException == null)
      jobCancellationException = new JobCancellationException(u1.k((u1)this), null, (n1)this); 
    y((Throwable)jobCancellationException);
  }
  
  public void f(l<? super Throwable, q> paraml) {
    this.j.f(paraml);
  }
  
  public boolean g(Throwable paramThrowable) {
    return this.j.g(paramThrowable);
  }
  
  public Object h(E paramE) {
    return this.j.h(paramE);
  }
  
  public boolean i() {
    return this.j.i();
  }
  
  public f<E> iterator() {
    return this.j.iterator();
  }
  
  public void y(Throwable paramThrowable) {
    paramThrowable = u1.y0((u1)this, paramThrowable, null, 1, null);
    this.j.d((CancellationException)paramThrowable);
    v(paramThrowable);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\d9\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */