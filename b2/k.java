package b2;

import e2.b;
import e2.d;
import java.util.concurrent.Executor;

public final class k implements b<Executor> {
  public static k a() {
    return a.a();
  }
  
  public static Executor b() {
    return (Executor)d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public Executor c() {
    return b();
  }
  
  private static final class a {
    private static final k a = new k();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b2\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */