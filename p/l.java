package p;

import java.util.HashSet;
import q.b;

public class l extends j {
  private int N0 = 0;
  
  private int O0 = 0;
  
  private int P0 = 0;
  
  private int Q0 = 0;
  
  private int R0 = 0;
  
  private int S0 = 0;
  
  private int T0 = 0;
  
  private int U0 = 0;
  
  private boolean V0 = false;
  
  private int W0 = 0;
  
  private int X0 = 0;
  
  protected b.a Y0 = new b.a();
  
  b.b Z0 = null;
  
  public int A1() {
    return this.U0;
  }
  
  public int B1() {
    return this.N0;
  }
  
  public void C1(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  protected void D1(e parame, e.b paramb1, int paramInt1, e.b paramb2, int paramInt2) {
    while (this.Z0 == null && K() != null)
      this.Z0 = ((f)K()).I1(); 
    b.a a1 = this.Y0;
    a1.a = paramb1;
    a1.b = paramb2;
    a1.c = paramInt1;
    a1.d = paramInt2;
    this.Z0.b(parame, a1);
    parame.k1(this.Y0.e);
    parame.L0(this.Y0.f);
    parame.K0(this.Y0.h);
    parame.A0(this.Y0.g);
  }
  
  protected boolean E1() {
    e e = this.a0;
    if (e != null) {
      b.b b1 = ((f)e).I1();
    } else {
      e = null;
    } 
    if (e == null)
      return false; 
    int i = 0;
    while (true) {
      int k = this.M0;
      boolean bool = true;
      if (i < k) {
        e e1 = this.L0[i];
        if (e1 != null && !(e1 instanceof h)) {
          e.b b1 = e1.u(0);
          e.b b2 = e1.u(1);
          e.b b3 = e.b.MATCH_CONSTRAINT;
          if (b1 != b3 || e1.w == 1 || b2 != b3 || e1.x == 1)
            bool = false; 
          if (!bool) {
            e.b b4 = b1;
            if (b1 == b3)
              b4 = e.b.WRAP_CONTENT; 
            b1 = b2;
            if (b2 == b3)
              b1 = e.b.WRAP_CONTENT; 
            b.a a1 = this.Y0;
            a1.a = b4;
            a1.b = b1;
            a1.c = e1.W();
            this.Y0.d = e1.x();
            e.b(e1, this.Y0);
            e1.k1(this.Y0.e);
            e1.L0(this.Y0.f);
            e1.A0(this.Y0.g);
          } 
        } 
        i++;
        continue;
      } 
      return true;
    } 
  }
  
  public boolean F1() {
    return this.V0;
  }
  
  protected void G1(boolean paramBoolean) {
    this.V0 = paramBoolean;
  }
  
  public void H1(int paramInt1, int paramInt2) {
    this.W0 = paramInt1;
    this.X0 = paramInt2;
  }
  
  public void I1(int paramInt) {
    this.P0 = paramInt;
    this.N0 = paramInt;
    this.Q0 = paramInt;
    this.O0 = paramInt;
    this.R0 = paramInt;
    this.S0 = paramInt;
  }
  
  public void J1(int paramInt) {
    this.O0 = paramInt;
  }
  
  public void K1(int paramInt) {
    this.S0 = paramInt;
  }
  
  public void L1(int paramInt) {
    this.P0 = paramInt;
    this.T0 = paramInt;
  }
  
  public void M1(int paramInt) {
    this.Q0 = paramInt;
    this.U0 = paramInt;
  }
  
  public void N1(int paramInt) {
    this.R0 = paramInt;
    this.T0 = paramInt;
    this.U0 = paramInt;
  }
  
  public void O1(int paramInt) {
    this.N0 = paramInt;
  }
  
  public void c(f paramf) {
    u1();
  }
  
  public void t1(boolean paramBoolean) {
    int i = this.R0;
    if (i > 0 || this.S0 > 0) {
      if (paramBoolean) {
        this.T0 = this.S0;
        this.U0 = i;
        return;
      } 
      this.T0 = i;
      this.U0 = this.S0;
    } 
  }
  
  public void u1() {
    for (int i = 0; i < this.M0; i++) {
      e e = this.L0[i];
      if (e != null)
        e.U0(true); 
    } 
  }
  
  public boolean v1(HashSet<e> paramHashSet) {
    for (int i = 0; i < this.M0; i++) {
      if (paramHashSet.contains(this.L0[i]))
        return true; 
    } 
    return false;
  }
  
  public int w1() {
    return this.X0;
  }
  
  public int x1() {
    return this.W0;
  }
  
  public int y1() {
    return this.O0;
  }
  
  public int z1() {
    return this.T0;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */