package e7;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import e8.q;
import java.util.Locale;
import q8.l;
import r8.g;
import r8.m;
import r8.n;

public final class b {
  @SuppressLint({"ConstantLocale"})
  private static final Locale d;
  
  private static b e;
  
  public static final a f = new a(null);
  
  private Locale a;
  
  private final f7.a b;
  
  private final e c;
  
  static {
    Locale locale = Locale.getDefault();
    m.f(locale, "Locale.getDefault()");
    d = locale;
  }
  
  private b(f7.a parama, e parame) {
    this.b = parama;
    this.c = parame;
    this.a = d;
  }
  
  private final void e(Activity paramActivity) {
    f((Context)paramActivity);
    a.c(paramActivity);
  }
  
  private final void f(Context paramContext) {
    this.c.a(paramContext, this.b.getLocale());
  }
  
  private final void i(Context paramContext, Locale paramLocale) {
    this.b.c(paramLocale);
    this.c.a(paramContext, paramLocale);
  }
  
  private final void j(Context paramContext, Configuration paramConfiguration) {
    this.a = a.a(paramConfiguration);
    if (this.b.a()) {
      i(paramContext, this.a);
      return;
    } 
    f(paramContext);
  }
  
  public final Locale g() {
    return this.b.getLocale();
  }
  
  public final void h(Application paramApplication) {
    Locale locale;
    m.k(paramApplication, "application");
    paramApplication.registerActivityLifecycleCallbacks(new c(new b(this)));
    paramApplication.registerComponentCallbacks(new d(new c(this, paramApplication)));
    if (this.b.a()) {
      locale = this.a;
    } else {
      locale = this.b.getLocale();
    } 
    i((Context)paramApplication, locale);
  }
  
  public final void k(Context paramContext, String paramString1, String paramString2, String paramString3) {
    m.k(paramContext, "context");
    m.k(paramString1, "language");
    m.k(paramString2, "country");
    m.k(paramString3, "variant");
    l(paramContext, new Locale(paramString1, paramString2, paramString3));
  }
  
  public final void l(Context paramContext, Locale paramLocale) {
    m.k(paramContext, "context");
    m.k(paramLocale, "locale");
    this.b.b(false);
    i(paramContext, paramLocale);
  }
  
  public static final class a {
    private a() {}
    
    public final b b() {
      boolean bool;
      if (a(this) != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        b b = b.b();
        if (b == null)
          m.A("instance"); 
        return b;
      } 
      throw new IllegalStateException("Lingver should be initialized first".toString());
    }
    
    public final b c(Application param1Application, f7.a param1a) {
      boolean bool;
      m.k(param1Application, "application");
      m.k(param1a, "store");
      if (a(this) == null) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        b b = new b(param1a, new e(), null);
        b.h(param1Application);
        b.d(b);
        return b;
      } 
      throw new IllegalStateException("Already initialized".toString());
    }
    
    public final b d(Application param1Application, String param1String) {
      m.k(param1Application, "application");
      m.k(param1String, "defaultLanguage");
      return e(param1Application, new Locale(param1String));
    }
    
    public final b e(Application param1Application, Locale param1Locale) {
      m.k(param1Application, "application");
      m.k(param1Locale, "defaultLocale");
      return c(param1Application, (f7.a)new f7.b((Context)param1Application, param1Locale, null, 4, null));
    }
  }
  
  static final class b extends n implements l<Activity, q> {
    b(b param1b) {
      super(1);
    }
    
    public final void a(Activity param1Activity) {
      m.k(param1Activity, "it");
      b.a(this.g, param1Activity);
    }
  }
  
  static final class c extends n implements l<Configuration, q> {
    c(b param1b, Application param1Application) {
      super(1);
    }
    
    public final void a(Configuration param1Configuration) {
      m.k(param1Configuration, "it");
      b.c(this.g, (Context)this.h, param1Configuration);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e7\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */