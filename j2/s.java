package j2;

import android.content.Context;
import c2.e;
import d8.a;
import e2.b;
import java.util.concurrent.Executor;
import k2.c;
import k2.d;
import l2.a;
import m2.a;

public final class s implements b<r> {
  private final a<Context> a;
  
  private final a<e> b;
  
  private final a<d> c;
  
  private final a<x> d;
  
  private final a<Executor> e;
  
  private final a<a> f;
  
  private final a<a> g;
  
  private final a<a> h;
  
  private final a<c> i;
  
  public s(a<Context> parama, a<e> parama1, a<d> parama2, a<x> parama3, a<Executor> parama4, a<a> parama5, a<a> parama6, a<a> parama7, a<c> parama8) {
    this.a = parama;
    this.b = parama1;
    this.c = parama2;
    this.d = parama3;
    this.e = parama4;
    this.f = parama5;
    this.g = parama6;
    this.h = parama7;
    this.i = parama8;
  }
  
  public static s a(a<Context> parama, a<e> parama1, a<d> parama2, a<x> parama3, a<Executor> parama4, a<a> parama5, a<a> parama6, a<a> parama7, a<c> parama8) {
    return new s(parama, parama1, parama2, parama3, parama4, parama5, parama6, parama7, parama8);
  }
  
  public static r c(Context paramContext, e parame, d paramd, x paramx, Executor paramExecutor, a parama, a parama1, a parama2, c paramc) {
    return new r(paramContext, parame, paramd, paramx, paramExecutor, parama, parama1, parama2, paramc);
  }
  
  public r b() {
    return c((Context)this.a.get(), (e)this.b.get(), (d)this.c.get(), (x)this.d.get(), (Executor)this.e.get(), (a)this.f.get(), (a)this.g.get(), (a)this.h.get(), (c)this.i.get());
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j2\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */