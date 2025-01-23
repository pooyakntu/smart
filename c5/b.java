package c5;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.e;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.ui.customviews.PowerButton;
import com.smartpek.ui.customviews.c;
import e8.q;
import q8.l;
import q8.p;
import q8.r;
import r8.m;

public interface b extends d, g, i, h {
  public static final class a {
    public static void a(b param1b, Context param1Context, Device param1Device, String param1String) {
      m.j(param1Context, "activity");
      m.j(param1String, "url");
      h.b.b(param1b, param1Context, param1Device, param1String);
    }
    
    public static void b(b param1b, e param1e, Device param1Device, PowerButton param1PowerButton) {
      i.a.a(param1b, param1e, param1Device, param1PowerButton);
    }
    
    public static boolean c(b param1b, Activity param1Activity, b5.b.a param1a, Device param1Device, boolean param1Boolean, c param1c, q8.a<q> param1a1, q8.a<q> param1a2, l<? super String, q> param1l) {
      m.j(param1a, "tab");
      m.j(param1c, "commandFrom");
      m.j(param1a1, "onProgress");
      m.j(param1a2, "onError");
      m.j(param1l, "onResponse");
      return h.b.e(param1b, param1Activity, param1a, param1Device, param1Boolean, param1c, param1a1, param1a2, param1l);
    }
    
    public static boolean d(b param1b, Context param1Context, b5.b.a param1a, Device param1Device, boolean param1Boolean, c param1c, q8.a<q> param1a1, q8.a<q> param1a2, l<? super String, q> param1l) {
      m.j(param1a, "tab");
      m.j(param1c, "commandFrom");
      m.j(param1a1, "onProgress");
      m.j(param1a2, "onError");
      m.j(param1l, "onResponse");
      return h.b.f(param1b, param1Context, param1a, param1Device, param1Boolean, param1c, param1a1, param1a2, param1l);
    }
    
    public static void e(b param1b, Context param1Context, b5.b.a param1a, int param1Int, Integer param1Integer, Device param1Device, c param1c, c param1c1, q8.a<q> param1a1, q8.a<q> param1a2, r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, q> param1r) {
      m.j(param1a, "tab");
      m.j(param1c1, "commandFrom");
      m.j(param1a1, "onProgress");
      m.j(param1a2, "onError");
      m.j(param1r, "onResponse");
      d.b.f(param1b, param1Context, param1a, param1Int, param1Integer, param1Device, param1c, param1c1, param1a1, param1a2, param1r);
    }
    
    public static void f(b param1b, e param1e, b5.b.a param1a, int param1Int, Integer param1Integer, Device param1Device, c param1c, c param1c1, q8.a<q> param1a1, q8.a<q> param1a2, r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, q> param1r) {
      m.j(param1a, "tab");
      m.j(param1c1, "commandFrom");
      m.j(param1a1, "onProgress");
      m.j(param1a2, "onError");
      m.j(param1r, "onResponse");
      d.b.h(param1b, param1e, param1a, param1Int, param1Integer, param1Device, param1c, param1c1, param1a1, param1a2, param1r);
    }
    
    public static void g(b param1b, e param1e, b5.b.a param1a, Device param1Device, PowerButton param1PowerButton, c param1c) {
      m.j(param1a, "tab");
      g.a.c(param1b, param1e, param1a, param1Device, param1PowerButton, param1c);
    }
    
    public static void h(b param1b, e param1e, b5.b.a param1a, Device param1Device, PowerButton param1PowerButton, c param1c) {
      m.j(param1a, "tab");
      i.a.b(param1b, param1e, param1a, param1Device, param1PowerButton, param1c);
    }
    
    public static void i(b param1b, e param1e, b5.b.a param1a, int param1Int, Device param1Device, PowerButton param1PowerButton, c param1c, q8.a<q> param1a1, q8.a<q> param1a2, p<? super String, ? super com.smartpek.data.local.models.b, q> param1p) {
      m.j(param1a, "tab");
      m.j(param1c, "commandFrom");
      m.j(param1a1, "onProgress");
      m.j(param1a2, "onError");
      m.j(param1p, "onResponse");
      d.b.k(param1b, param1e, param1a, param1Int, param1Device, param1PowerButton, param1c, param1a1, param1a2, param1p);
    }
    
    public static boolean j(b param1b, e param1e, Context param1Context, b5.b.a param1a, int param1Int, Device param1Device, PowerButton param1PowerButton, c param1c, q8.a<q> param1a1, q8.a<q> param1a2, p<? super String, ? super com.smartpek.data.local.models.b, q> param1p) {
      m.j(param1a, "tab");
      m.j(param1c, "commandFrom");
      m.j(param1a1, "onProgress");
      m.j(param1a2, "onError");
      m.j(param1p, "onResponse");
      return d.b.l(param1b, param1e, param1Context, param1a, param1Int, param1Device, param1PowerButton, param1c, param1a1, param1a2, param1p);
    }
    
    public static void k(b param1b) {
      d.b.n(param1b);
    }
    
    public static void l(b param1b, Context param1Context, Device param1Device, String param1String) {
      m.j(param1String, "url");
      h.b.i(param1b, param1Context, param1Device, param1String);
    }
    
    public static void m(b param1b, e param1e, Context param1Context, int param1Int, Integer param1Integer, Device param1Device, c param1c, c param1c1, boolean param1Boolean1, boolean param1Boolean2, q8.a<q> param1a, r<? super String, ? super String, ? super com.smartpek.data.local.models.b, ? super Boolean, q> param1r) {
      m.j(param1c1, "commandFrom");
      m.j(param1a, "onError");
      m.j(param1r, "onResponse");
      d.b.t(param1b, param1e, param1Context, param1Int, param1Integer, param1Device, param1c, param1c1, param1Boolean1, param1Boolean2, param1a, param1r);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c5\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */