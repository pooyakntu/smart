package e5;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.smartpek.ui.device.coolerctrl.auto.CoolerStep;
import e8.q;
import f8.o;
import ir.am3n.needtool.views.A3Toolbar;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p7.c1;
import p7.e1;
import p7.f0;
import q8.l;
import r4.h;
import r8.g;
import r8.m;
import r8.n;

public final class c extends Fragment {
  public static final a i = new a(null);
  
  private static List<String> j;
  
  private static List<String> k;
  
  private static String[] l;
  
  private static int m = 3;
  
  private d g;
  
  public Map<Integer, View> h;
  
  private final void O() {
    String[] arrayOfString;
    Context context1 = getContext();
    Context context8 = null;
    if (context1 != null) {
      String str = c1.g(context1, 2131951851);
    } else {
      context1 = null;
    } 
    Context context3 = getContext();
    if (context3 != null) {
      String str = c1.g(context3, 2131952291);
    } else {
      context3 = null;
    } 
    Context context4 = getContext();
    if (context4 != null) {
      String str = c1.g(context4, 2131952292);
    } else {
      context4 = null;
    } 
    Context context5 = getContext();
    if (context5 != null) {
      String str = c1.g(context5, 2131952281);
    } else {
      context5 = null;
    } 
    Context context6 = getContext();
    if (context6 != null) {
      String str = c1.g(context6, 2131952297);
    } else {
      context6 = null;
    } 
    Context context7 = getContext();
    if (context7 != null) {
      String str = c1.g(context7, 2131952286);
    } else {
      context7 = null;
    } 
    j = o.n((Object[])new String[] { (String)context1, (String)context3, (String)context4, (String)context5, (String)context6, (String)context7 });
    ArrayList<Context> arrayList = new ArrayList(11);
    int i;
    for (i = 0; i < 11; i++) {
      (new Integer[11])[0] = Integer.valueOf(1);
      (new Integer[11])[1] = Integer.valueOf(2);
      (new Integer[11])[2] = Integer.valueOf(3);
      (new Integer[11])[3] = Integer.valueOf(4);
      (new Integer[11])[4] = Integer.valueOf(5);
      (new Integer[11])[5] = Integer.valueOf(7);
      (new Integer[11])[6] = Integer.valueOf(10);
      (new Integer[11])[7] = Integer.valueOf(15);
      (new Integer[11])[8] = Integer.valueOf(20);
      (new Integer[11])[9] = Integer.valueOf(25);
      (new Integer[11])[10] = Integer.valueOf(30);
      int j = (new Integer[11])[i].intValue();
      context1 = getContext();
      if (context1 != null) {
        String str = context1.getString(2131952338, new Object[] { String.valueOf(j) });
      } else {
        context1 = null;
      } 
      arrayList.add(context1);
    } 
    k = o.i0(arrayList);
    Context context2 = getContext();
    context1 = context8;
    if (context2 != null) {
      Resources resources = context2.getResources();
      context1 = context8;
      if (resources != null)
        arrayOfString = resources.getStringArray(2130903044); 
    } 
    l = arrayOfString;
    b b = new b();
    c c1 = new c(this);
    i = h.H4;
    RecyclerView recyclerView3 = (RecyclerView)I(i);
    m.i(recyclerView3, "rcl");
    this.g = new d(b, c1, recyclerView3);
    RecyclerView recyclerView2 = (RecyclerView)I(i);
    if (recyclerView2 != null)
      recyclerView2.setAdapter((RecyclerView.h)this.g); 
    A3Toolbar a3Toolbar = (A3Toolbar)I(h.Z5);
    if (a3Toolbar != null)
      a3Toolbar.setTitle(""); 
    RecyclerView recyclerView1 = (RecyclerView)I(i);
    if (recyclerView1 != null)
      recyclerView1.setVisibility(8); 
    MaterialButton materialButton = (MaterialButton)I(h.i);
    if (materialButton != null)
      materialButton.setVisibility(8); 
    LinearLayout linearLayout = (LinearLayout)I(h.o5);
    if (linearLayout == null)
      return; 
    linearLayout.setVisibility(8);
  }
  
  public void H() {
    this.h.clear();
  }
  
  public View I(int paramInt) {
    Map<Integer, View> map = this.h;
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
  
  public final void P() {
    getParentFragmentManager().Y0("CoolerAutoFrg", 1);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    m.j(paramLayoutInflater, "inflater");
    return paramLayoutInflater.inflate(2131558489, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {
    m.j(paramView, "view");
    super.onViewCreated(paramView, paramBundle);
    O();
    f0.m(paramView, new d(this));
    A3Toolbar a3Toolbar = (A3Toolbar)I(h.Z5);
    if (a3Toolbar != null)
      a3Toolbar.f(new e(this)); 
    MaterialButton materialButton = (MaterialButton)I(h.i);
    if (materialButton != null)
      e1.b((View)materialButton, new f(this)); 
  }
  
  public static final class a {
    private a() {}
    
    public final List<String> a() {
      return c.J();
    }
    
    public final List<String> b() {
      return c.L();
    }
    
    public final int c() {
      return c.M();
    }
    
    public final String[] d() {
      return c.N();
    }
  }
  
  public static final class b implements s7.f<CoolerStep> {
    public void a(int param1Int, CoolerStep param1CoolerStep, View param1View) {}
    
    public boolean b(int param1Int, CoolerStep param1CoolerStep, View param1View) {
      return true;
    }
  }
  
  static final class c extends n implements q8.a<q> {
    c(c param1c) {
      super(0);
    }
    
    public final void invoke() {
      MaterialButton materialButton = (MaterialButton)this.g.I(h.i);
      if (materialButton == null)
        return; 
      materialButton.setVisibility(0);
    }
  }
  
  static final class d extends n implements q8.a<q> {
    d(c param1c) {
      super(0);
    }
    
    public final void invoke() {
      this.g.P();
    }
  }
  
  static final class e extends n implements q8.a<q> {
    e(c param1c) {
      super(0);
    }
    
    public final void invoke() {
      this.g.P();
    }
  }
  
  static final class f extends n implements l<View, q> {
    f(c param1c) {
      super(1);
    }
    
    public final void a(View param1View) {
      byte b;
      m.j(param1View, "it");
      b.a a = b.k;
      d d = c.K(this.g);
      if (d != null) {
        b = d.j();
      } else {
        b = 0;
      } 
      a.a(b + 1, new a(this.g)).show(this.g.getParentFragmentManager(), "CoolerAddStepDialog");
    }
    
    static final class a extends n implements l<CoolerStep, q> {
      a(c param2c) {
        super(1);
      }
      
      public final void a(CoolerStep param2CoolerStep) {
        m.j(param2CoolerStep, "it");
        int i = param2CoolerStep.getIndex();
        boolean bool = false;
        if (i < 0) {
          d d = c.K(this.g);
          if (d != null) {
            i = d.j();
          } else {
            i = 0;
          } 
          param2CoolerStep.setIndex(i);
        } 
        d d2 = c.K(this.g);
        if (d2 != null)
          d2.N(param2CoolerStep); 
        d d1 = c.K(this.g);
        i = bool;
        if (d1 != null)
          i = d1.j(); 
        if (i >= c.i.c()) {
          MaterialButton materialButton = (MaterialButton)this.g.I(h.i);
          if (materialButton == null)
            return; 
          materialButton.setVisibility(8);
        } 
      }
    }
  }
  
  static final class a extends n implements l<CoolerStep, q> {
    a(c param1c) {
      super(1);
    }
    
    public final void a(CoolerStep param1CoolerStep) {
      m.j(param1CoolerStep, "it");
      int i = param1CoolerStep.getIndex();
      boolean bool = false;
      if (i < 0) {
        d d = c.K(this.g);
        if (d != null) {
          i = d.j();
        } else {
          i = 0;
        } 
        param1CoolerStep.setIndex(i);
      } 
      d d2 = c.K(this.g);
      if (d2 != null)
        d2.N(param1CoolerStep); 
      d d1 = c.K(this.g);
      i = bool;
      if (d1 != null)
        i = d1.j(); 
      if (i >= c.i.c()) {
        MaterialButton materialButton = (MaterialButton)this.g.I(h.i);
        if (materialButton == null)
          return; 
        materialButton.setVisibility(8);
      } 
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e5\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */