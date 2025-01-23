package e9;

import d9.a;
import d9.p;
import e8.q;
import f9.d;
import j8.d;
import j8.g;
import q8.p;

class b<T> extends d<T> {
  private final p<p<? super T>, d<? super q>, Object> j;
  
  public b(p<? super p<? super T>, ? super d<? super q>, ? extends Object> paramp, g paramg, int paramInt, a parama) {
    super(paramg, paramInt, parama);
    this.j = (p)paramp;
  }
  
  protected Object e(p<? super T> paramp, d<? super q> paramd) {
    return j(this, paramp, paramd);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("block[");
    stringBuilder.append(this.j);
    stringBuilder.append("] -> ");
    stringBuilder.append(super.toString());
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e9\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */