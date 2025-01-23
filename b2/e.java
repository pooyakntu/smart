package b2;

import android.content.Context;
import c2.j;
import c2.l;
import e2.c;
import e2.d;
import i2.c;
import i2.d;
import i2.g;
import i2.i;
import j2.f;
import j2.r;
import j2.s;
import j2.v;
import j2.w;
import j2.x;
import java.util.concurrent.Executor;
import k2.d;
import k2.g;
import k2.h;
import k2.i;
import k2.j;
import k2.m0;
import k2.n0;
import k2.u0;
import m2.c;
import m2.d;

final class e extends u {
  private d8.a<Executor> g;
  
  private d8.a<Context> h;
  
  private d8.a i;
  
  private d8.a j;
  
  private d8.a k;
  
  private d8.a<String> l;
  
  private d8.a<m0> m;
  
  private d8.a<f> n;
  
  private d8.a<x> o;
  
  private d8.a<c> p;
  
  private d8.a<r> q;
  
  private d8.a<v> r;
  
  private d8.a<t> s;
  
  private e(Context paramContext) {
    t(paramContext);
  }
  
  public static u.a r() {
    return new b(null);
  }
  
  private void t(Context paramContext) {
    this.g = e2.a.b((d8.a)k.a());
    e2.b b = c.a(paramContext);
    this.h = (d8.a<Context>)b;
    j j = j.a((d8.a)b, (d8.a)c.a(), (d8.a)d.a());
    this.i = (d8.a)j;
    this.j = e2.a.b((d8.a)l.a(this.h, (d8.a)j));
    this.k = (d8.a)u0.a(this.h, (d8.a)g.a(), (d8.a)i.a());
    this.l = (d8.a<String>)h.a(this.h);
    this.m = e2.a.b((d8.a)n0.a((d8.a)c.a(), (d8.a)d.a(), (d8.a)j.a(), this.k, this.l));
    g g = g.b((d8.a)c.a());
    this.n = (d8.a<f>)g;
    i i = i.a(this.h, this.m, (d8.a)g, (d8.a)d.a());
    this.o = (d8.a<x>)i;
    d8.a<Executor> a4 = this.g;
    d8.a<m0> a5 = this.j;
    d8.a<m0> a6 = this.m;
    this.p = (d8.a<c>)d.a(a4, a5, (d8.a)i, a6, a6);
    d8.a<Context> a2 = this.h;
    a4 = this.j;
    a5 = this.m;
    this.q = (d8.a<r>)s.a(a2, a4, a5, this.o, this.g, a5, (d8.a)c.a(), (d8.a)d.a(), this.m);
    d8.a<Executor> a1 = this.g;
    d8.a<m0> a3 = this.m;
    this.r = (d8.a<v>)w.a(a1, a3, this.o, a3);
    this.s = e2.a.b((d8.a)v.a((d8.a<m2.a>)c.a(), (d8.a<m2.a>)d.a(), (d8.a)this.p, this.q, this.r));
  }
  
  d c() {
    return (d)this.m.get();
  }
  
  t d() {
    return (t)this.s.get();
  }
  
  private static final class b implements u.a {
    private Context a;
    
    private b() {}
    
    public b b(Context param1Context) {
      this.a = (Context)d.b(param1Context);
      return this;
    }
    
    public u build() {
      d.a(this.a, Context.class);
      return new e(this.a, null);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b2\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */