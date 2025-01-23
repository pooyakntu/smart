package p;

import m.d;
import m.i;

public class h extends e {
  protected float L0 = -1.0F;
  
  protected int M0 = -1;
  
  protected int N0 = -1;
  
  protected boolean O0 = true;
  
  private d P0 = this.P;
  
  private int Q0;
  
  private int R0;
  
  private boolean S0;
  
  public h() {
    int i = 0;
    this.Q0 = 0;
    this.R0 = 0;
    this.X.clear();
    this.X.add(this.P0);
    int j = this.W.length;
    while (i < j) {
      this.W[i] = this.P0;
      i++;
    } 
  }
  
  public void A1(int paramInt) {
    if (this.Q0 == paramInt)
      return; 
    this.Q0 = paramInt;
    this.X.clear();
    if (this.Q0 == 1) {
      this.P0 = this.O;
    } else {
      this.P0 = this.P;
    } 
    this.X.add(this.P0);
    int i = this.W.length;
    for (paramInt = 0; paramInt < i; paramInt++)
      this.W[paramInt] = this.P0; 
  }
  
  public void g(d paramd, boolean paramBoolean) {
    boolean bool1;
    i i;
    f f = (f)K();
    if (f == null)
      return; 
    d d1 = f.o(d.b.LEFT);
    d d2 = f.o(d.b.RIGHT);
    e e1 = this.a0;
    boolean bool2 = true;
    if (e1 != null && e1.Z[0] == e.b.WRAP_CONTENT) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (this.Q0 == 0) {
      d1 = f.o(d.b.TOP);
      d2 = f.o(d.b.BOTTOM);
      e e2 = this.a0;
      if (e2 != null && e2.Z[1] == e.b.WRAP_CONTENT) {
        bool1 = bool2;
      } else {
        bool1 = false;
      } 
    } 
    if (this.S0 && this.P0.n()) {
      i i1 = paramd.q(this.P0);
      paramd.f(i1, this.P0.e());
      if (this.M0 != -1) {
        if (bool1)
          paramd.h(paramd.q(d2), i1, 0, 5); 
      } else if (this.N0 != -1 && bool1) {
        i = paramd.q(d2);
        paramd.h(i1, paramd.q(d1), 0, 5);
        paramd.h(i, i1, 0, 5);
      } 
      this.S0 = false;
      return;
    } 
    if (this.M0 != -1) {
      i i1 = paramd.q(this.P0);
      paramd.e(i1, paramd.q(d1), this.M0, 8);
      if (bool1) {
        paramd.h(paramd.q(i), i1, 0, 5);
        return;
      } 
    } else if (this.N0 != -1) {
      i i1 = paramd.q(this.P0);
      i = paramd.q(i);
      paramd.e(i1, i, -this.N0, 8);
      if (bool1) {
        paramd.h(i1, paramd.q(d1), 0, 5);
        paramd.h(i, i1, 0, 5);
        return;
      } 
    } else if (this.L0 != -1.0F) {
      paramd.d(d.s(paramd, paramd.q(this.P0), paramd.q(i), this.L0));
    } 
  }
  
  public boolean h() {
    return true;
  }
  
  public boolean n0() {
    return this.S0;
  }
  
  public d o(d.b paramb) {
    int i = a.a[paramb.ordinal()];
    if (i != 1 && i != 2) {
      if ((i == 3 || i == 4) && this.Q0 == 0)
        return this.P0; 
    } else if (this.Q0 == 1) {
      return this.P0;
    } 
    return null;
  }
  
  public boolean o0() {
    return this.S0;
  }
  
  public void q1(d paramd, boolean paramBoolean) {
    if (K() == null)
      return; 
    int i = paramd.x(this.P0);
    if (this.Q0 == 1) {
      m1(i);
      n1(0);
      L0(K().x());
      k1(0);
      return;
    } 
    m1(0);
    n1(i);
    k1(K().W());
    L0(0);
  }
  
  public d r1() {
    return this.P0;
  }
  
  public int s1() {
    return this.Q0;
  }
  
  public int t1() {
    return this.M0;
  }
  
  public int u1() {
    return this.N0;
  }
  
  public float v1() {
    return this.L0;
  }
  
  public void w1(int paramInt) {
    this.P0.t(paramInt);
    this.S0 = true;
  }
  
  public void x1(int paramInt) {
    if (paramInt > -1) {
      this.L0 = -1.0F;
      this.M0 = paramInt;
      this.N0 = -1;
    } 
  }
  
  public void y1(int paramInt) {
    if (paramInt > -1) {
      this.L0 = -1.0F;
      this.M0 = -1;
      this.N0 = paramInt;
    } 
  }
  
  public void z1(float paramFloat) {
    if (paramFloat > -1.0F) {
      this.L0 = paramFloat;
      this.M0 = -1;
      this.N0 = -1;
    } 
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */