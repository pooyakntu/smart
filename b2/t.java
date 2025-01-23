package b2;

import android.content.Context;
import i2.e;
import j2.r;
import j2.v;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import m2.a;
import z1.b;
import z1.g;
import z1.h;

@Singleton
public class t implements s {
  private static volatile u e;
  
  private final a a;
  
  private final a b;
  
  private final e c;
  
  private final r d;
  
  @Inject
  t(a parama1, a parama2, e parame, r paramr, v paramv) {
    this.a = parama1;
    this.b = parama2;
    this.c = parame;
    this.d = paramr;
    paramv.c();
  }
  
  private i b(n paramn) {
    return i.a().i(this.a.a()).k(this.b.a()).j(paramn.g()).h(new h(paramn.b(), paramn.d())).g(paramn.c().a()).d();
  }
  
  public static t c() {
    u u1 = e;
    if (u1 != null)
      return u1.d(); 
    throw new IllegalStateException("Not initialized!");
  }
  
  private static Set<b> d(f paramf) {
    return (paramf instanceof g) ? Collections.unmodifiableSet(((g)paramf).a()) : Collections.singleton(b.b("proto"));
  }
  
  public static void f(Context paramContext) {
    // Byte code:
    //   0: getstatic b2/t.e : Lb2/u;
    //   3: ifnonnull -> 42
    //   6: ldc b2/t
    //   8: monitorenter
    //   9: getstatic b2/t.e : Lb2/u;
    //   12: ifnonnull -> 32
    //   15: invokestatic r : ()Lb2/u$a;
    //   18: aload_0
    //   19: invokeinterface a : (Landroid/content/Context;)Lb2/u$a;
    //   24: invokeinterface build : ()Lb2/u;
    //   29: putstatic b2/t.e : Lb2/u;
    //   32: ldc b2/t
    //   34: monitorexit
    //   35: return
    //   36: astore_0
    //   37: ldc b2/t
    //   39: monitorexit
    //   40: aload_0
    //   41: athrow
    //   42: return
    // Exception table:
    //   from	to	target	type
    //   9	32	36	finally
    //   32	35	36	finally
    //   37	40	36	finally
  }
  
  public void a(n paramn, h paramh) {
    this.c.a(paramn.f().f(paramn.c().c()), b(paramn), paramh);
  }
  
  public r e() {
    return this.d;
  }
  
  public g g(f paramf) {
    return new p(d(paramf), o.a().b(paramf.getName()).c(paramf.getExtras()).a(), this);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b2\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */