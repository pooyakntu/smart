package p0;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.savedstate.Recreator;
import r8.g;
import r8.m;

public final class c {
  public static final a d = new a(null);
  
  private final d a;
  
  private final androidx.savedstate.a b;
  
  private boolean c;
  
  private c(d paramd) {
    this.a = paramd;
    this.b = new androidx.savedstate.a();
  }
  
  public static final c a(d paramd) {
    return d.a(paramd);
  }
  
  public final androidx.savedstate.a b() {
    return this.b;
  }
  
  public final void c() {
    boolean bool;
    Lifecycle lifecycle = this.a.getLifecycle();
    if (lifecycle.getCurrentState() == Lifecycle.State.INITIALIZED) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      lifecycle.addObserver((LifecycleObserver)new Recreator(this.a));
      this.b.e(lifecycle);
      this.c = true;
      return;
    } 
    throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
  }
  
  public final void d(Bundle paramBundle) {
    if (!this.c)
      c(); 
    Lifecycle lifecycle = this.a.getLifecycle();
    if ((lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED) ^ true) != 0) {
      this.b.f(paramBundle);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("performRestore cannot be called when owner is ");
    stringBuilder.append(lifecycle.getCurrentState());
    throw new IllegalStateException(stringBuilder.toString().toString());
  }
  
  public final void e(Bundle paramBundle) {
    m.j(paramBundle, "outBundle");
    this.b.g(paramBundle);
  }
  
  public static final class a {
    private a() {}
    
    public final c a(d param1d) {
      m.j(param1d, "owner");
      return new c(param1d, null);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p0\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */