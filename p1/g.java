package p1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.j;
import com.bumptech.glide.k;
import d1.e;
import d1.k;
import g1.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import w1.d;
import x1.k;
import x1.l;

class g {
  private final c1.a a;
  
  private final Handler b;
  
  private final List<b> c = new ArrayList<b>();
  
  final k d;
  
  private final d e;
  
  private boolean f;
  
  private boolean g;
  
  private boolean h;
  
  private j<Bitmap> i;
  
  private a j;
  
  private boolean k;
  
  private a l;
  
  private Bitmap m;
  
  private k<Bitmap> n;
  
  private a o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  g(com.bumptech.glide.c paramc, c1.a parama, int paramInt1, int paramInt2, k<Bitmap> paramk, Bitmap paramBitmap) {
    this(paramc.f(), com.bumptech.glide.c.t(paramc.h()), parama, null, i(com.bumptech.glide.c.t(paramc.h()), paramInt1, paramInt2), paramk, paramBitmap);
  }
  
  g(d paramd, k paramk, c1.a parama, Handler paramHandler, j<Bitmap> paramj, k<Bitmap> paramk1, Bitmap paramBitmap) {
    this.d = paramk;
    Handler handler = paramHandler;
    if (paramHandler == null)
      handler = new Handler(Looper.getMainLooper(), new c(this)); 
    this.e = paramd;
    this.b = handler;
    this.i = paramj;
    this.a = parama;
    o(paramk1, paramBitmap);
  }
  
  private static e g() {
    return (e)new d(Double.valueOf(Math.random()));
  }
  
  private static j<Bitmap> i(k paramk, int paramInt1, int paramInt2) {
    return paramk.j().X(((com.bumptech.glide.request.g)((com.bumptech.glide.request.g)com.bumptech.glide.request.g.X(f1.a.b).V(true)).R(true)).K(paramInt1, paramInt2));
  }
  
  private void l() {
    if (this.f) {
      if (this.g)
        return; 
      if (this.h) {
        boolean bool;
        if (this.o == null) {
          bool = true;
        } else {
          bool = false;
        } 
        k.a(bool, "Pending target must be null when starting from the first frame");
        this.a.g();
        this.h = false;
      } 
      a a1 = this.o;
      if (a1 != null) {
        this.o = null;
        m(a1);
        return;
      } 
      this.g = true;
      int i = this.a.d();
      long l1 = SystemClock.uptimeMillis();
      long l2 = i;
      this.a.b();
      this.l = new a(this.b, this.a.h(), l1 + l2);
      this.i.X((com.bumptech.glide.request.a)com.bumptech.glide.request.g.Y(g())).j0(this.a).e0((u1.g)this.l);
    } 
  }
  
  private void n() {
    Bitmap bitmap = this.m;
    if (bitmap != null) {
      this.e.c(bitmap);
      this.m = null;
    } 
  }
  
  private void p() {
    if (this.f)
      return; 
    this.f = true;
    this.k = false;
    l();
  }
  
  private void q() {
    this.f = false;
  }
  
  void a() {
    this.c.clear();
    n();
    q();
    a a1 = this.j;
    if (a1 != null) {
      this.d.l((u1.g)a1);
      this.j = null;
    } 
    a1 = this.l;
    if (a1 != null) {
      this.d.l((u1.g)a1);
      this.l = null;
    } 
    a1 = this.o;
    if (a1 != null) {
      this.d.l((u1.g)a1);
      this.o = null;
    } 
    this.a.clear();
    this.k = true;
  }
  
  ByteBuffer b() {
    return this.a.f().asReadOnlyBuffer();
  }
  
  Bitmap c() {
    a a1 = this.j;
    return (a1 != null) ? a1.i() : this.m;
  }
  
  int d() {
    a a1 = this.j;
    return (a1 != null) ? a1.k : -1;
  }
  
  Bitmap e() {
    return this.m;
  }
  
  int f() {
    return this.a.c();
  }
  
  int h() {
    return this.r;
  }
  
  int j() {
    return this.a.i() + this.p;
  }
  
  int k() {
    return this.q;
  }
  
  void m(a parama) {
    this.g = false;
    if (this.k) {
      this.b.obtainMessage(2, parama).sendToTarget();
      return;
    } 
    if (!this.f) {
      if (this.h) {
        this.b.obtainMessage(2, parama).sendToTarget();
        return;
      } 
      this.o = parama;
      return;
    } 
    if (parama.i() != null) {
      n();
      a a1 = this.j;
      this.j = parama;
      for (int i = this.c.size() - 1; i >= 0; i--)
        ((b)this.c.get(i)).a(); 
      if (a1 != null)
        this.b.obtainMessage(2, a1).sendToTarget(); 
    } 
    l();
  }
  
  void o(k<Bitmap> paramk, Bitmap paramBitmap) {
    this.n = (k<Bitmap>)k.d(paramk);
    this.m = (Bitmap)k.d(paramBitmap);
    this.i = this.i.X((new com.bumptech.glide.request.g()).S(paramk));
    this.p = l.g(paramBitmap);
    this.q = paramBitmap.getWidth();
    this.r = paramBitmap.getHeight();
  }
  
  void r(b paramb) {
    if (!this.k) {
      if (!this.c.contains(paramb)) {
        boolean bool = this.c.isEmpty();
        this.c.add(paramb);
        if (bool)
          p(); 
        return;
      } 
      throw new IllegalStateException("Cannot subscribe twice in a row");
    } 
    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
  }
  
  void s(b paramb) {
    this.c.remove(paramb);
    if (this.c.isEmpty())
      q(); 
  }
  
  static class a extends u1.b<Bitmap> {
    private final Handler j;
    
    final int k;
    
    private final long l;
    
    private Bitmap m;
    
    a(Handler param1Handler, int param1Int, long param1Long) {
      this.j = param1Handler;
      this.k = param1Int;
      this.l = param1Long;
    }
    
    public void h(Drawable param1Drawable) {
      this.m = null;
    }
    
    Bitmap i() {
      return this.m;
    }
    
    public void j(Bitmap param1Bitmap, v1.b<? super Bitmap> param1b) {
      this.m = param1Bitmap;
      Message message = this.j.obtainMessage(1, this);
      this.j.sendMessageAtTime(message, this.l);
    }
  }
  
  public static interface b {
    void a();
  }
  
  private class c implements Handler.Callback {
    c(g this$0) {}
    
    public boolean handleMessage(Message param1Message) {
      g.a a;
      int i = param1Message.what;
      if (i == 1) {
        a = (g.a)param1Message.obj;
        this.a.m(a);
        return true;
      } 
      if (i == 2) {
        a = (g.a)((Message)a).obj;
        this.a.d.l((u1.g)a);
      } 
      return false;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p1\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */