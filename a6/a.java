package a6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.smartpek.data.local.db.models.Group;
import com.smartpek.ui.customviews.TriStateSwitch;
import f8.o;
import p7.v;
import r4.h;
import r8.m;
import s7.f;
import s7.g;
import s7.j;

public final class a extends g<Group, b> {
  private f<Group> k;
  
  private final b l;
  
  public a(RecyclerView paramRecyclerView, f<Group> paramf, b paramb) {
    super(paramRecyclerView);
    this.k = paramf;
    this.l = paramb;
  }
  
  public f<Group> S() {
    return this.k;
  }
  
  public boolean b() {
    return true;
  }
  
  public boolean g0(Group paramGroup) {
    m.j(paramGroup, "item");
    return paramGroup.isSelected();
  }
  
  public void h0(b paramb, int paramInt) {
    m.j(paramb, "holder");
    e0(paramb, paramInt);
    ViewGroup.LayoutParams layoutParams = ((RecyclerView.e0)paramb).g.getLayoutParams();
    m.h(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
    RecyclerView.q q = (RecyclerView.q)layoutParams;
    if (paramInt == o.k(R())) {
      paramInt = 64;
    } else {
      paramInt = 6;
    } 
    ((ViewGroup.MarginLayoutParams)q).bottomMargin = v.e(paramInt);
    ((RecyclerView.e0)paramb).g.setLayoutParams((ViewGroup.LayoutParams)q);
    ((TriStateSwitch)paramb.Z(h.b6)).setOnStateChangeListener(new c(paramb, this));
  }
  
  public b i0(ViewGroup paramViewGroup, int paramInt) {
    m.j(paramViewGroup, "parent");
    View view = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131558548, paramViewGroup, false);
    m.i(view, "from(parent.context).inf…itm_group, parent, false)");
    return new b(view);
  }
  
  public enum a {
    HIDE_SWITCH_PROGRESS, SELECT_STATE_CHANGED, SORT_MODE_ACTIVE, SORT_MODE_LOCKED, UPDATE;
    
    static {
      HIDE_SWITCH_PROGRESS = new a("HIDE_SWITCH_PROGRESS", 4);
      $VALUES = $values();
    }
  }
  
  public static interface b {
    void d(int param1Int, Group param1Group);
  }
  
  public static final class c implements TriStateSwitch.a {
    c(b param1b, a param1a) {}
    
    public void a(TriStateSwitch.b param1b) {
      m.j(param1b, "state");
      int i = this.a.p();
      ((Group)this.b.R().get(i)).setPowerState(param1b);
      a.f0(this.b).d(i, this.b.R().get(i));
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a6\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */