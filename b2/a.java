package b2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import v3.a;

public final class a implements a {
  public static final a a = new a();
  
  public void a(v3.b<?> paramb) {
    paramb.a(l.class, e.a);
    paramb.a(f2.a.class, a.a);
    paramb.a(f2.f.class, g.a);
    paramb.a(f2.d.class, d.a);
    paramb.a(f2.c.class, c.a);
    paramb.a(f2.b.class, b.a);
    paramb.a(f2.e.class, f.a);
  }
  
  private static final class a implements u3.c<f2.a> {
    static final a a = new a();
    
    private static final u3.b b = u3.b.a("window").b((Annotation)x3.a.b().c(1).a()).a();
    
    private static final u3.b c = u3.b.a("logSourceMetrics").b((Annotation)x3.a.b().c(2).a()).a();
    
    private static final u3.b d = u3.b.a("globalMetrics").b((Annotation)x3.a.b().c(3).a()).a();
    
    private static final u3.b e = u3.b.a("appNamespace").b((Annotation)x3.a.b().c(4).a()).a();
    
    public void b(f2.a param1a, u3.d param1d) throws IOException {
      param1d.a(b, param1a.d());
      param1d.a(c, param1a.c());
      param1d.a(d, param1a.b());
      param1d.a(e, param1a.a());
    }
  }
  
  private static final class b implements u3.c<f2.b> {
    static final b a = new b();
    
    private static final u3.b b = u3.b.a("storageMetrics").b((Annotation)x3.a.b().c(1).a()).a();
    
    public void b(f2.b param1b, u3.d param1d) throws IOException {
      param1d.a(b, param1b.a());
    }
  }
  
  private static final class c implements u3.c<f2.c> {
    static final c a = new c();
    
    private static final u3.b b = u3.b.a("eventsDroppedCount").b((Annotation)x3.a.b().c(1).a()).a();
    
    private static final u3.b c = u3.b.a("reason").b((Annotation)x3.a.b().c(3).a()).a();
    
    public void b(f2.c param1c, u3.d param1d) throws IOException {
      param1d.b(b, param1c.a());
      param1d.a(c, param1c.b());
    }
  }
  
  private static final class d implements u3.c<f2.d> {
    static final d a = new d();
    
    private static final u3.b b = u3.b.a("logSource").b((Annotation)x3.a.b().c(1).a()).a();
    
    private static final u3.b c = u3.b.a("logEventDropped").b((Annotation)x3.a.b().c(2).a()).a();
    
    public void b(f2.d param1d, u3.d param1d1) throws IOException {
      param1d1.a(b, param1d.b());
      param1d1.a(c, param1d.a());
    }
  }
  
  private static final class e implements u3.c<l> {
    static final e a = new e();
    
    private static final u3.b b = u3.b.d("clientMetrics");
    
    public void b(l param1l, u3.d param1d) throws IOException {
      param1d.a(b, param1l.b());
    }
  }
  
  private static final class f implements u3.c<f2.e> {
    static final f a = new f();
    
    private static final u3.b b = u3.b.a("currentCacheSizeBytes").b((Annotation)x3.a.b().c(1).a()).a();
    
    private static final u3.b c = u3.b.a("maxCacheSizeBytes").b((Annotation)x3.a.b().c(2).a()).a();
    
    public void b(f2.e param1e, u3.d param1d) throws IOException {
      param1d.b(b, param1e.a());
      param1d.b(c, param1e.b());
    }
  }
  
  private static final class g implements u3.c<f2.f> {
    static final g a = new g();
    
    private static final u3.b b = u3.b.a("startMs").b((Annotation)x3.a.b().c(1).a()).a();
    
    private static final u3.b c = u3.b.a("endMs").b((Annotation)x3.a.b().c(2).a()).a();
    
    public void b(f2.f param1f, u3.d param1d) throws IOException {
      param1d.b(b, param1f.b());
      param1d.b(c, param1f.a());
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b2\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */