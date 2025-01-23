package b3;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class b {
  private final View a;
  
  private boolean b = false;
  
  private int c = 0;
  
  public b(a parama) {
    this.a = (View)parama;
  }
  
  private void a() {
    ViewParent viewParent = this.a.getParent();
    if (viewParent instanceof CoordinatorLayout)
      ((CoordinatorLayout)viewParent).f(this.a); 
  }
  
  public int b() {
    return this.c;
  }
  
  public boolean c() {
    return this.b;
  }
  
  public void d(Bundle paramBundle) {
    this.b = paramBundle.getBoolean("expanded", false);
    this.c = paramBundle.getInt("expandedComponentIdHint", 0);
    if (this.b)
      a(); 
  }
  
  public Bundle e() {
    Bundle bundle = new Bundle();
    bundle.putBoolean("expanded", this.b);
    bundle.putInt("expandedComponentIdHint", this.c);
    return bundle;
  }
  
  public void f(int paramInt) {
    this.c = paramInt;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b3\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */