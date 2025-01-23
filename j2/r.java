package j2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import b2.h;
import b2.i;
import b2.o;
import c2.e;
import c2.f;
import c2.g;
import c2.m;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import f2.a;
import f2.c;
import g2.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import k2.c;
import k2.d;
import k2.k;
import l2.a;
import m2.a;
import z1.b;

public class r {
  private final Context a;
  
  private final e b;
  
  private final d c;
  
  private final x d;
  
  private final Executor e;
  
  private final a f;
  
  private final a g;
  
  private final a h;
  
  private final c i;
  
  @Inject
  public r(Context paramContext, e parame, d paramd, x paramx, Executor paramExecutor, a parama, a parama1, a parama2, c paramc) {
    this.a = paramContext;
    this.b = parame;
    this.c = paramd;
    this.d = paramx;
    this.e = paramExecutor;
    this.f = parama;
    this.g = parama1;
    this.h = parama2;
    this.i = paramc;
  }
  
  public i j(m paramm) {
    a a2 = this.f;
    c c1 = this.i;
    Objects.requireNonNull(c1);
    a a1 = (a)a2.d(new h(c1));
    return paramm.a(i.a().i(this.g.a()).k(this.h.a()).j("GDT_CLIENT_METRICS").h(new h(b.b("proto"), a1.f())).d());
  }
  
  boolean k() {
    NetworkInfo networkInfo = ((ConnectivityManager)this.a.getSystemService("connectivity")).getActiveNetworkInfo();
    return (networkInfo != null && networkInfo.isConnected());
  }
  
  g u(o paramo, int paramInt) {
    m m = this.b.a(paramo.b());
    long l = 0L;
    g g = g.e(0L);
    while (((Boolean)this.f.d(new k(this, paramo))).booleanValue()) {
      g g1;
      Iterable iterable = (Iterable)this.f.d(new l(this, paramo));
      if (!iterable.iterator().hasNext())
        return g; 
      if (m == null) {
        a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", paramo);
        g1 = g.a();
      } else {
        ArrayList<i> arrayList = new ArrayList();
        Iterator<k> iterator = iterable.iterator();
        while (iterator.hasNext())
          arrayList.add(((k)iterator.next()).b()); 
        if (paramo.e())
          arrayList.add(j(m)); 
        g1 = m.b(f.a().b(arrayList).c(paramo.c()).a());
      } 
      if (g1.c() == g.a.TRANSIENT_ERROR) {
        this.f.d(new m(this, iterable, paramo, l));
        this.d.a(paramo, paramInt + 1, true);
        return g1;
      } 
      this.f.d(new n(this, iterable));
      if (g1.c() == g.a.OK) {
        long l1 = Math.max(l, g1.b());
        l = l1;
        g = g1;
        if (paramo.e()) {
          this.f.d(new o(this));
          l = l1;
          g = g1;
        } 
        continue;
      } 
      g = g1;
      if (g1.c() == g.a.INVALID_PAYLOAD) {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Iterator<k> iterator = iterable.iterator();
        while (iterator.hasNext()) {
          String str = ((k)iterator.next()).b().j();
          if (!hashMap.containsKey(str)) {
            hashMap.put(str, Integer.valueOf(1));
            continue;
          } 
          hashMap.put(str, Integer.valueOf(((Integer)hashMap.get(str)).intValue() + 1));
        } 
        this.f.d(new p(this, hashMap));
        g = g1;
      } 
    } 
    this.f.d(new q(this, paramo, l));
    return g;
  }
  
  public void v(o paramo, int paramInt, Runnable paramRunnable) {
    this.e.execute(new g(this, paramo, paramInt, paramRunnable));
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j2\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */