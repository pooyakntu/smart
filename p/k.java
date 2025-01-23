package p;

import m.d;

public class k {
  static boolean[] a = new boolean[3];
  
  static void a(f paramf, d paramd, e parame) {
    parame.t = -1;
    parame.u = -1;
    e.b b2 = paramf.Z[0];
    e.b b1 = e.b.WRAP_CONTENT;
    if (b2 != b1 && parame.Z[0] == e.b.MATCH_PARENT) {
      int i = parame.O.g;
      int j = paramf.W() - parame.Q.g;
      d d1 = parame.O;
      d1.i = paramd.q(d1);
      d1 = parame.Q;
      d1.i = paramd.q(d1);
      paramd.f(parame.O.i, i);
      paramd.f(parame.Q.i, j);
      parame.t = 2;
      parame.O0(i, j);
    } 
    if (paramf.Z[1] != b1 && parame.Z[1] == e.b.MATCH_PARENT) {
      int i = parame.P.g;
      int j = paramf.x() - parame.R.g;
      d d1 = parame.P;
      d1.i = paramd.q(d1);
      d1 = parame.R;
      d1.i = paramd.q(d1);
      paramd.f(parame.P.i, i);
      paramd.f(parame.R.i, j);
      if (parame.l0 > 0 || parame.V() == 8) {
        d1 = parame.S;
        d1.i = paramd.q(d1);
        paramd.f(parame.S.i, parame.l0 + i);
      } 
      parame.u = 2;
      parame.f1(i, j);
    } 
  }
  
  public static final boolean b(int paramInt1, int paramInt2) {
    return ((paramInt1 & paramInt2) == paramInt2);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */