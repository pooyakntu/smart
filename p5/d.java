package p5;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b5.b;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.ui.customviews.PowerButton;
import e8.q;
import f8.o;
import ir.am3n.pullrefreshlayout.PullRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p7.q0;
import q8.l;
import q8.p;
import q8.r;
import r8.m;
import r8.n;

@SuppressLint({"ClickableViewAccessibility"})
public final class d extends b {
  public static final a r = new a(null);
  
  private static List<d> s;
  
  public Map<Integer, View> q;
  
  private final PowerButton n0() {
    return (PowerButton)I(r4.h.g4);
  }
  
  private final void o0(int paramInt, Integer paramInteger) {
    c5.d.b.j((c5.d)this, getActivity(), O(), paramInt, paramInteger, L(), (com.smartpek.ui.customviews.c)n0(), null, new b(this), new c(this, paramInt), new d(this, paramInt), 64, null);
  }
  
  private final void q0(int paramInt) {
    c5.d.b.m((c5.d)this, getActivity(), O(), paramInt, L(), n0(), null, new e(this), new f(this, paramInt), new g(this, paramInt), 32, null);
  }
  
  private static final void r0(d paramd, View paramView) {
    m.j(paramd, "this$0");
    p0(paramd, 0, null, 2, null);
  }
  
  private static final boolean s0(d paramd, View paramView) {
    m.j(paramd, "this$0");
    paramd.q0(0);
    return true;
  }
  
  private static final boolean t0(d paramd, View paramView, MotionEvent paramMotionEvent) {
    m.j(paramd, "this$0");
    m.i(paramMotionEvent, "event");
    if (q0.a(paramMotionEvent))
      paramd.W(); 
    return false;
  }
  
  public void H() {
    this.q.clear();
  }
  
  public View I(int paramInt) {
    Map<Integer, View> map = this.q;
    View view2 = map.get(Integer.valueOf(paramInt));
    View view1 = view2;
    if (view2 == null) {
      view1 = getView();
      if (view1 != null) {
        view1 = view1.findViewById(paramInt);
        if (view1 != null) {
          map.put(Integer.valueOf(paramInt), view1);
          return view1;
        } 
      } 
      view1 = null;
    } 
    return view1;
  }
  
  public boolean Q() {
    return false;
  }
  
  public void T() {
    super.T();
  }
  
  public void U(String paramString, Integer paramInteger, com.smartpek.data.local.models.b paramb, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    o5.a.a.b(L(), n0(), paramString, paramInteger, paramb, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public boolean X(PullRefreshLayout paramPullRefreshLayout, boolean paramBoolean) {
    return c5.h.b.g((c5.h)this, (Activity)getActivity(), O(), L(), paramBoolean, null, new h(paramBoolean, this), new i(paramPullRefreshLayout, this), new j(paramPullRefreshLayout, this), 16, null);
  }
  
  public PowerButton m0() {
    return n0();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    m.j(paramLayoutInflater, "inflater");
    super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    return paramLayoutInflater.inflate(2131558505, paramViewGroup, false);
  }
  
  public void onStart() {
    super.onStart();
    Z();
  }
  
  public void onStop() {
    a0(o.d(n0()));
    super.onStop();
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {
    m.j(paramView, "view");
    super.onViewCreated(paramView, paramBundle);
    b0();
    PowerButton powerButton = n0();
    if (powerButton != null)
      com.smartpek.ui.customviews.c.s((com.smartpek.ui.customviews.c)powerButton, 0, 0, 0, 0, 0, 31, null); 
    powerButton = n0();
    if (powerButton != null)
      powerButton.setOnClickListener(new a(this)); 
    powerButton = n0();
    if (powerButton != null)
      powerButton.setOnLongClickListener(new b(this)); 
    powerButton = n0();
    if (powerButton != null)
      powerButton.setOnTouchListener(new c(this)); 
  }
  
  public static final class a {
    private a() {}
    
    public final d a(Device param1Device) {
      m.j(param1Device, "device");
      if (b() == null)
        c(new ArrayList<d>()); 
      d d = new d();
      d.c0(param1Device);
      List<d> list = b();
      if (list != null)
        list.add(d); 
      return d;
    }
    
    public final List<d> b() {
      return d.j0();
    }
    
    public final void c(List<d> param1List) {
      d.l0(param1List);
    }
  }
  
  static final class b extends n implements q8.a<q> {
    b(d param1d) {
      super(0);
    }
    
    public final void invoke() {
      PowerButton powerButton = d.k0(this.g);
      if (powerButton != null)
        com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 3, null); 
    }
  }
  
  static final class c extends n implements q8.a<q> {
    c(d param1d, int param1Int) {
      super(0);
    }
    
    public final void invoke() {
      b.V(this.g, null, Integer.valueOf(this.h), null, true, false, false, 53, null);
    }
  }
  
  static final class d extends n implements r<String, String, com.smartpek.data.local.models.b, Boolean, q> {
    d(d param1d, int param1Int) {
      super(4);
    }
    
    public final void a(String param1String1, String param1String2, com.smartpek.data.local.models.b param1b, boolean param1Boolean) {
      b.V(this.g, param1String1, Integer.valueOf(this.h), param1b, false, param1Boolean, false, 40, null);
    }
  }
  
  static final class e extends n implements q8.a<q> {
    e(d param1d) {
      super(0);
    }
    
    public final void invoke() {
      PowerButton powerButton = d.k0(this.g);
      if (powerButton != null)
        com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 3, null); 
    }
  }
  
  static final class f extends n implements q8.a<q> {
    f(d param1d, int param1Int) {
      super(0);
    }
    
    public final void invoke() {
      b.V(this.g, null, Integer.valueOf(this.h), null, true, false, false, 53, null);
    }
  }
  
  static final class g extends n implements p<String, com.smartpek.data.local.models.b, q> {
    g(d param1d, int param1Int) {
      super(2);
    }
    
    public final void a(String param1String, com.smartpek.data.local.models.b param1b) {
      m.j(param1String, "body");
      b.V(this.g, param1String, Integer.valueOf(this.h), null, false, false, false, 60, null);
    }
  }
  
  static final class h extends n implements q8.a<q> {
    h(boolean param1Boolean, d param1d) {
      super(0);
    }
    
    public final void invoke() {
      if (this.g) {
        PowerButton powerButton = d.k0(this.h);
        if (powerButton != null) {
          com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 3, null);
          return;
        } 
      } else {
        PowerButton powerButton = d.k0(this.h);
        if (powerButton != null)
          com.smartpek.ui.customviews.c.y((com.smartpek.ui.customviews.c)powerButton, false, 1, null); 
      } 
    }
  }
  
  static final class i extends n implements q8.a<q> {
    i(PullRefreshLayout param1PullRefreshLayout, d param1d) {
      super(0);
    }
    
    public final void invoke() {
      PullRefreshLayout pullRefreshLayout = this.g;
      if (pullRefreshLayout != null)
        pullRefreshLayout.q(); 
      b.V(this.h, null, null, null, true, false, true, 23, null);
    }
  }
  
  static final class j extends n implements l<String, q> {
    j(PullRefreshLayout param1PullRefreshLayout, d param1d) {
      super(1);
    }
    
    public final void a(String param1String) {
      m.j(param1String, "response");
      PullRefreshLayout pullRefreshLayout = this.g;
      if (pullRefreshLayout != null)
        pullRefreshLayout.q(); 
      b.V(this.h, param1String, null, null, false, false, true, 30, null);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p5\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */