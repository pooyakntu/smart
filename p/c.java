package p;

import java.util.ArrayList;

public class c {
  protected e a;
  
  protected e b;
  
  protected e c;
  
  protected e d;
  
  protected e e;
  
  protected e f;
  
  protected e g;
  
  protected ArrayList<e> h;
  
  protected int i;
  
  protected int j;
  
  protected float k = 0.0F;
  
  int l;
  
  int m;
  
  int n;
  
  boolean o;
  
  private int p;
  
  private boolean q;
  
  protected boolean r;
  
  protected boolean s;
  
  protected boolean t;
  
  protected boolean u;
  
  private boolean v;
  
  public c(e parame, int paramInt, boolean paramBoolean) {
    this.a = parame;
    this.p = paramInt;
    this.q = paramBoolean;
  }
  
  private void b() {
    int i = this.p * 2;
    e e1 = this.a;
    boolean bool2 = true;
    this.o = true;
    e e2 = e1;
    boolean bool1 = false;
    while (!bool1) {
      this.i++;
      e[] arrayOfE = e1.F0;
      int j = this.p;
      e e3 = null;
      arrayOfE[j] = null;
      e1.E0[j] = null;
      if (e1.V() != 8) {
        this.l++;
        e.b b2 = e1.u(this.p);
        e.b b1 = e.b.MATCH_CONSTRAINT;
        if (b2 != b1)
          this.m += e1.E(this.p); 
        int k = this.m + e1.W[i].f();
        this.m = k;
        d[] arrayOfD = e1.W;
        j = i + 1;
        this.m = k + arrayOfD[j].f();
        k = this.n + e1.W[i].f();
        this.n = k;
        this.n = k + e1.W[j].f();
        if (this.b == null)
          this.b = e1; 
        this.d = e1;
        e.b[] arrayOfB = e1.Z;
        j = this.p;
        if (arrayOfB[j] == b1) {
          k = e1.y[j];
          if (k == 0 || k == 3 || k == 2) {
            this.j++;
            float f = e1.D0[j];
            if (f > 0.0F)
              this.k += f; 
            if (c(e1, j)) {
              if (f < 0.0F) {
                this.r = true;
              } else {
                this.s = true;
              } 
              if (this.h == null)
                this.h = new ArrayList<e>(); 
              this.h.add(e1);
            } 
            if (this.f == null)
              this.f = e1; 
            e e4 = this.g;
            if (e4 != null)
              e4.E0[this.p] = e1; 
            this.g = e1;
          } 
          if (this.p == 0) {
            if (e1.w != 0) {
              this.o = false;
            } else if (e1.z != 0 || e1.A != 0) {
              this.o = false;
            } 
          } else if (e1.x != 0) {
            this.o = false;
          } else if (e1.C != 0 || e1.D != 0) {
            this.o = false;
          } 
          if (e1.d0 != 0.0F) {
            this.o = false;
            this.u = true;
          } 
        } 
      } 
      if (e2 != e1)
        e2.F0[this.p] = e1; 
      d d = (e1.W[i + 1]).f;
      e2 = e3;
      if (d != null) {
        e e4 = d.d;
        d d1 = (e4.W[i]).f;
        e2 = e3;
        if (d1 != null)
          if (d1.d != e1) {
            e2 = e3;
          } else {
            e2 = e4;
          }  
      } 
      if (e2 == null) {
        e2 = e1;
        bool1 = true;
      } 
      e3 = e1;
      e1 = e2;
      e2 = e3;
    } 
    e2 = this.b;
    if (e2 != null)
      this.m -= e2.W[i].f(); 
    e2 = this.d;
    if (e2 != null)
      this.m -= e2.W[i + 1].f(); 
    this.c = e1;
    if (this.p == 0 && this.q) {
      this.e = e1;
    } else {
      this.e = this.a;
    } 
    if (!this.s || !this.r)
      bool2 = false; 
    this.t = bool2;
  }
  
  private static boolean c(e parame, int paramInt) {
    if (parame.V() != 8 && parame.Z[paramInt] == e.b.MATCH_CONSTRAINT) {
      paramInt = parame.y[paramInt];
      if (paramInt == 0 || paramInt == 3)
        return true; 
    } 
    return false;
  }
  
  public void a() {
    if (!this.v)
      b(); 
    this.v = true;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */