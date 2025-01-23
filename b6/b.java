package b6;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import com.smartpek.App;
import e8.q;
import java.util.Locale;
import java.util.Map;
import p7.c1;
import p7.e1;
import p7.p0;
import q8.l;
import r8.m;
import r8.n;
import y4.k;

public final class b extends Fragment {
  public static final a j = new a(null);
  
  private q8.a<q> g = e.g;
  
  private q8.a<q> h = d.g;
  
  public Map<Integer, View> i;
  
  private final void N() {
    Resources resources = getResources();
    m.i(resources, "resources");
    if (m.e(c1.c(resources).getLanguage(), "fa")) {
      O(b.FARSI, false);
      return;
    } 
    O(b.ENGLISH, false);
  }
  
  private final void O(b paramb, boolean paramBoolean) {
    try {
      App.g.a("LangFrg > setLang()");
      int i = r4.h.H;
      AppCompatTextView appCompatTextView = (AppCompatTextView)I(i);
      if (appCompatTextView != null)
        appCompatTextView.clearFocus(); 
      int j = r4.h.F;
      appCompatTextView = (AppCompatTextView)I(j);
      if (appCompatTextView != null)
        appCompatTextView.clearFocus(); 
      int k = c.a[paramb.ordinal()];
      boolean bool = true;
      if (k != 1) {
        if (k == 2) {
          appCompatTextView = (AppCompatTextView)I(j);
          if (appCompatTextView != null)
            appCompatTextView.requestFocus(); 
          k k1 = (k)k.k.a(getContext());
          String str = Locale.US.getLanguage();
          m.i(str, "US.language");
          k1.r(str);
        } 
      } else {
        appCompatTextView = (AppCompatTextView)I(i);
        if (appCompatTextView != null)
          appCompatTextView.requestFocus(); 
        ((k)k.k.a(getContext())).r("fa");
      } 
      if (paramBoolean) {
        e7.b b1 = e7.b.f.b();
        Context context1 = requireContext();
        m.i(context1, "requireContext()");
        k.a a1 = k.k;
        e7.b.m(b1, context1, ((k)a1.a(getContext())).c(), null, null, 12, null);
        p0.c((Context)getActivity(), ((k)a1.a(getContext())).c());
      } 
      appCompatTextView = (AppCompatTextView)I(i);
      if (appCompatTextView != null) {
        if (paramb == b.FARSI) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        } 
        appCompatTextView.setSelected(paramBoolean);
      } 
      appCompatTextView = (AppCompatTextView)I(j);
      if (appCompatTextView != null) {
        if (paramb == b.ENGLISH) {
          paramBoolean = bool;
        } else {
          paramBoolean = false;
        } 
        appCompatTextView.setSelected(paramBoolean);
      } 
      appCompatTextView = (AppCompatTextView)I(r4.h.I6);
      if (appCompatTextView == null)
        return; 
      Context context = getContext();
      return;
    } finally {
      paramb = null;
      paramb.printStackTrace();
    } 
  }
  
  public void H() {
    this.i.clear();
  }
  
  public View I(int paramInt) {
    Map<Integer, View> map = this.i;
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
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    m.j(paramLayoutInflater, "inflater");
    App.g.a("LangFrg > onCreateView()");
    return paramLayoutInflater.inflate(2131558524, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {
    m.j(paramView, "view");
    App.g.a("LangFrg > onViewCreated()");
    super.onViewCreated(paramView, paramBundle);
    N();
    AppCompatTextView appCompatTextView = (AppCompatTextView)I(r4.h.H);
    if (appCompatTextView != null)
      e1.b((View)appCompatTextView, new f(this)); 
    appCompatTextView = (AppCompatTextView)I(r4.h.F);
    if (appCompatTextView != null)
      e1.b((View)appCompatTextView, new g(this)); 
    appCompatTextView = (AppCompatTextView)I(r4.h.D6);
    if (appCompatTextView != null)
      e1.b((View)appCompatTextView, new h(this)); 
  }
  
  public static final class a {
    private a() {}
    
    public final b a(q8.a<q> param1a1, q8.a<q> param1a2) {
      m.j(param1a1, "onLocaleChanged");
      m.j(param1a2, "next");
      b b = new b();
      b.M(b, param1a1);
      b.L(b, param1a2);
      return b;
    }
  }
  
  public enum b {
    ENGLISH, FARSI;
    
    static {
      $VALUES = $values();
    }
  }
  
  static final class d extends n implements q8.a<q> {
    public static final d g = new d();
    
    d() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class e extends n implements q8.a<q> {
    public static final e g = new e();
    
    e() {
      super(0);
    }
    
    public final void invoke() {}
  }
  
  static final class f extends n implements l<View, q> {
    f(b param1b) {
      super(1);
    }
    
    public final void a(View param1View) {
      boolean bool;
      m.j(param1View, "it");
      AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.I(r4.h.H);
      if (appCompatTextView != null && !appCompatTextView.isSelected()) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        b.P(this.g, b.b.FARSI, false, 2, null);
        b.K(this.g).invoke();
        return;
      } 
      b.J(this.g).invoke();
    }
  }
  
  static final class g extends n implements l<View, q> {
    g(b param1b) {
      super(1);
    }
    
    public final void a(View param1View) {
      boolean bool;
      m.j(param1View, "it");
      AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.I(r4.h.F);
      if (appCompatTextView != null && !appCompatTextView.isSelected()) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        b.P(this.g, b.b.ENGLISH, false, 2, null);
        b.K(this.g).invoke();
        return;
      } 
      b.J(this.g).invoke();
    }
  }
  
  static final class h extends n implements l<View, q> {
    h(b param1b) {
      super(1);
    }
    
    public final void a(View param1View) {
      m.j(param1View, "it");
      App.g.a("LangFrg > onViewCreated() > txtPrivacyPolicy onClick");
      this.g.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(v4.e.a.b())));
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b6\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */