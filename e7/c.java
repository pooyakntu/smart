package e7;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import e8.q;
import q8.l;
import r8.m;

public final class c implements Application.ActivityLifecycleCallbacks {
  private final l<Activity, q> g;
  
  public c(l<? super Activity, q> paraml) {
    this.g = (l)paraml;
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {
    m.k(paramActivity, "activity");
    this.g.invoke(paramActivity);
  }
  
  public void onActivityDestroyed(Activity paramActivity) {
    m.k(paramActivity, "activity");
  }
  
  public void onActivityPaused(Activity paramActivity) {
    m.k(paramActivity, "activity");
  }
  
  public void onActivityResumed(Activity paramActivity) {
    m.k(paramActivity, "activity");
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {
    m.k(paramActivity, "activity");
    m.k(paramBundle, "outState");
  }
  
  public void onActivityStarted(Activity paramActivity) {
    m.k(paramActivity, "activity");
  }
  
  public void onActivityStopped(Activity paramActivity) {
    m.k(paramActivity, "activity");
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e7\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */