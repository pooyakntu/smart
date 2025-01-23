package a2;

import java.io.IOException;
import v3.a;

public final class b implements a {
  public static final a a = new b();
  
  public void a(v3.b<?> paramb) {
    b b1 = b.a;
    paramb.a(j.class, b1);
    paramb.a(d.class, b1);
    e e = e.a;
    paramb.a(m.class, e);
    paramb.a(g.class, e);
    c c = c.a;
    paramb.a(k.class, c);
    paramb.a(e.class, c);
    a a1 = a.a;
    paramb.a(a.class, a1);
    paramb.a(c.class, a1);
    d d = d.a;
    paramb.a(l.class, d);
    paramb.a(f.class, d);
    f f = f.a;
    paramb.a(o.class, f);
    paramb.a(i.class, f);
  }
  
  private static final class a implements u3.c<a> {
    static final a a = new a();
    
    private static final u3.b b = u3.b.d("sdkVersion");
    
    private static final u3.b c = u3.b.d("model");
    
    private static final u3.b d = u3.b.d("hardware");
    
    private static final u3.b e = u3.b.d("device");
    
    private static final u3.b f = u3.b.d("product");
    
    private static final u3.b g = u3.b.d("osBuild");
    
    private static final u3.b h = u3.b.d("manufacturer");
    
    private static final u3.b i = u3.b.d("fingerprint");
    
    private static final u3.b j = u3.b.d("locale");
    
    private static final u3.b k = u3.b.d("country");
    
    private static final u3.b l = u3.b.d("mccMnc");
    
    private static final u3.b m = u3.b.d("applicationBuild");
    
    public void b(a param1a, u3.d param1d) throws IOException {
      param1d.a(b, param1a.m());
      param1d.a(c, param1a.j());
      param1d.a(d, param1a.f());
      param1d.a(e, param1a.d());
      param1d.a(f, param1a.l());
      param1d.a(g, param1a.k());
      param1d.a(h, param1a.h());
      param1d.a(i, param1a.e());
      param1d.a(j, param1a.g());
      param1d.a(k, param1a.c());
      param1d.a(l, param1a.i());
      param1d.a(m, param1a.b());
    }
  }
  
  private static final class b implements u3.c<j> {
    static final b a = new b();
    
    private static final u3.b b = u3.b.d("logRequest");
    
    public void b(j param1j, u3.d param1d) throws IOException {
      param1d.a(b, param1j.c());
    }
  }
  
  private static final class c implements u3.c<k> {
    static final c a = new c();
    
    private static final u3.b b = u3.b.d("clientType");
    
    private static final u3.b c = u3.b.d("androidClientInfo");
    
    public void b(k param1k, u3.d param1d) throws IOException {
      param1d.a(b, param1k.c());
      param1d.a(c, param1k.b());
    }
  }
  
  private static final class d implements u3.c<l> {
    static final d a = new d();
    
    private static final u3.b b = u3.b.d("eventTimeMs");
    
    private static final u3.b c = u3.b.d("eventCode");
    
    private static final u3.b d = u3.b.d("eventUptimeMs");
    
    private static final u3.b e = u3.b.d("sourceExtension");
    
    private static final u3.b f = u3.b.d("sourceExtensionJsonProto3");
    
    private static final u3.b g = u3.b.d("timezoneOffsetSeconds");
    
    private static final u3.b h = u3.b.d("networkConnectionInfo");
    
    public void b(l param1l, u3.d param1d) throws IOException {
      param1d.b(b, param1l.c());
      param1d.a(c, param1l.b());
      param1d.b(d, param1l.d());
      param1d.a(e, param1l.f());
      param1d.a(f, param1l.g());
      param1d.b(g, param1l.h());
      param1d.a(h, param1l.e());
    }
  }
  
  private static final class e implements u3.c<m> {
    static final e a = new e();
    
    private static final u3.b b = u3.b.d("requestTimeMs");
    
    private static final u3.b c = u3.b.d("requestUptimeMs");
    
    private static final u3.b d = u3.b.d("clientInfo");
    
    private static final u3.b e = u3.b.d("logSource");
    
    private static final u3.b f = u3.b.d("logSourceName");
    
    private static final u3.b g = u3.b.d("logEvent");
    
    private static final u3.b h = u3.b.d("qosTier");
    
    public void b(m param1m, u3.d param1d) throws IOException {
      param1d.b(b, param1m.g());
      param1d.b(c, param1m.h());
      param1d.a(d, param1m.b());
      param1d.a(e, param1m.d());
      param1d.a(f, param1m.e());
      param1d.a(g, param1m.c());
      param1d.a(h, param1m.f());
    }
  }
  
  private static final class f implements u3.c<o> {
    static final f a = new f();
    
    private static final u3.b b = u3.b.d("networkType");
    
    private static final u3.b c = u3.b.d("mobileSubtype");
    
    public void b(o param1o, u3.d param1d) throws IOException {
      param1d.a(b, param1o.c());
      param1d.a(c, param1o.b());
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a2\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */