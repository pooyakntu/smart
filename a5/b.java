package a5;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.r;
import java.util.ArrayList;
import java.util.List;
import r8.m;

public final class b extends r {
  private final ArrayList<Fragment> a = new ArrayList<Fragment>();
  
  private final ArrayList<String> b = new ArrayList<String>();
  
  public b(m paramm) {
    super(paramm, 1);
  }
  
  public final void c(List<? extends Fragment> paramList, List<String> paramList1) {
    m.j(paramList, "fragments");
    m.j(paramList1, "titles");
    this.a.addAll(paramList);
    this.b.addAll(paramList1);
  }
  
  public int getCount() {
    return this.a.size();
  }
  
  public Fragment getItem(int paramInt) {
    Fragment fragment = (Fragment)this.a.get(paramInt);
    m.i(fragment, "fragments[p0]");
    return fragment;
  }
  
  public CharSequence getPageTitle(int paramInt) {
    return this.b.get(paramInt);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a5\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */