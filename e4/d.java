package e4;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class d {
  public static d a = a().a();
  
  public static a a() {
    return (new a.b()).h(0L).g(c.a.ATTEMPT_MIGRATION).c(0L);
  }
  
  public abstract String b();
  
  public abstract long c();
  
  public abstract String d();
  
  public abstract String e();
  
  public abstract String f();
  
  public abstract c.a g();
  
  public abstract long h();
  
  public boolean i() {
    return (g() == c.a.REGISTER_ERROR);
  }
  
  public boolean j() {
    return (g() == c.a.NOT_GENERATED || g() == c.a.ATTEMPT_MIGRATION);
  }
  
  public boolean k() {
    return (g() == c.a.REGISTERED);
  }
  
  public boolean l() {
    return (g() == c.a.UNREGISTERED);
  }
  
  public boolean m() {
    return (g() == c.a.ATTEMPT_MIGRATION);
  }
  
  public abstract a n();
  
  public d o(String paramString, long paramLong1, long paramLong2) {
    return n().b(paramString).c(paramLong1).h(paramLong2).a();
  }
  
  public d p() {
    return n().b(null).a();
  }
  
  public d q(String paramString) {
    return n().e(paramString).g(c.a.REGISTER_ERROR).a();
  }
  
  public d r() {
    return n().g(c.a.NOT_GENERATED).a();
  }
  
  public d s(String paramString1, String paramString2, long paramLong1, String paramString3, long paramLong2) {
    return n().d(paramString1).g(c.a.REGISTERED).b(paramString3).f(paramString2).c(paramLong2).h(paramLong1).a();
  }
  
  public d t(String paramString) {
    return n().d(paramString).g(c.a.UNREGISTERED).a();
  }
  
  @Builder
  public static abstract class a {
    public abstract d a();
    
    public abstract a b(String param1String);
    
    public abstract a c(long param1Long);
    
    public abstract a d(String param1String);
    
    public abstract a e(String param1String);
    
    public abstract a f(String param1String);
    
    public abstract a g(c.a param1a);
    
    public abstract a h(long param1Long);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e4\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */