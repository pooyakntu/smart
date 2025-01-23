package e7;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import e8.q;
import q8.l;
import r8.m;

public final class d implements ComponentCallbacks {
  private final l<Configuration, q> g;
  
  public d(l<? super Configuration, q> paraml) {
    this.g = (l)paraml;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    m.k(paramConfiguration, "newConfig");
    this.g.invoke(paramConfiguration);
  }
  
  public void onLowMemory() {}
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e7\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */