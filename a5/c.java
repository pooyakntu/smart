package a5;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.adapter.a;
import java.util.List;
import r8.m;

public final class c extends FragmentStateAdapter {
  private final List<Fragment> l;
  
  public c(e parame, List<? extends Fragment> paramList) {
    super(parame);
    this.l = (List)paramList;
  }
  
  public Fragment M(int paramInt) {
    return this.l.get(paramInt);
  }
  
  public void e0(a parama, int paramInt, List<Object> paramList) {
    m.j(parama, "holder");
    m.j(paramList, "payloads");
    super.z((RecyclerView.e0)parama, paramInt, paramList);
  }
  
  public int j() {
    return this.l.size();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a5\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */