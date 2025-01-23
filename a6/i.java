package a6;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import b5.b;
import com.smartpek.App;
import com.smartpek.data.local.db.DB;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.utils.connection.ConnMngr;
import java.util.Map;
import p7.f0;
import r8.g;
import r8.m;
import v0.n;
import y5.f;
import y5.g;

public final class i extends Fragment {
  public static final a i = new a(null);
  
  private static i j;
  
  private b g;
  
  public Map<Integer, View> h;
  
  private final void L(Bundle paramBundle) {
    boolean bool = isHidden();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("init()  isHidden: ");
    stringBuilder.append(bool);
    n n = new n();
    n.k0(100L);
    setEnterTransition(n);
    if (f0.f(this).i0("GroupsFrg") == null)
      f0.f(this).n().u(2131362201, (Fragment)h.n.a(), "GroupsFrg").j(); 
  }
  
  public void H() {
    this.h.clear();
  }
  
  public final b K() {
    return this.g;
  }
  
  public final boolean M(boolean paramBoolean) {
    boolean bool;
    if (paramBoolean) {
      h h1 = h.n.b();
      if (h1 != null && h1.Y() == 1) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        g g = g.l.b();
        if (g != null && g.R() == 1) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool)
          return true; 
      } 
    } 
    b b1 = this.g;
    if (b1 != null && b1.Q() == true) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      return true; 
    f f = f.m.b();
    if (f != null && f.Z() == true) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      return true; 
    if (paramBoolean) {
      h h1 = h.n.b();
      if (h1 != null && h1.Y() == 1) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool)
        return true; 
    } 
    h h = h.n.b();
    if (h != null && h.d0() == true) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final void O() {
    Device device;
    DB dB = App.g.e();
    b b4 = null;
    b b3 = null;
    b b2 = b4;
    if (dB != null) {
      u4.a a1 = dB.H();
      b2 = b4;
      if (a1 != null) {
        String str;
        b4 = this.g;
        b2 = b3;
        if (b4 != null) {
          Device device1 = b4.L();
          b2 = b3;
          if (device1 != null)
            str = device1.getSsid(); 
        } 
        device = a1.d0(str);
      } 
    } 
    b3 = this.g;
    if (b3 != null)
      b3.c0(device); 
    b b1 = this.g;
    if (b1 != null)
      b1.T(); 
  }
  
  public final void P(b paramb) {
    this.g = paramb;
  }
  
  public void onAttach(Context paramContext) {
    m.j(paramContext, "context");
    super.onAttach(paramContext);
    j = this;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    m.j(paramLayoutInflater, "inflater");
    return paramLayoutInflater.inflate(2131558521, paramViewGroup, false);
  }
  
  public void onHiddenChanged(boolean paramBoolean) {
    f f;
    super.onHiddenChanged(paramBoolean);
    h.a a1 = h.n;
    h h2 = a1.b();
    if (h2 != null)
      h2.i0(paramBoolean); 
    g g = g.l.b();
    if (g != null)
      g.X(paramBoolean); 
    if (!paramBoolean) {
      ConnMngr.b b1 = ConnMngr.j;
      f = f.m.b();
      if (f != null) {
        Device device = f.X();
      } else {
        f = null;
      } 
      b1.m((Device)f);
      return;
    } 
    h h1 = f.b();
    if (h1 != null)
      h1.V(); 
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {
    m.j(paramView, "view");
    super.onViewCreated(paramView, paramBundle);
    L(paramBundle);
  }
  
  public static final class a {
    private a() {}
    
    public final i a() {
      if (b() == null)
        c(new i()); 
      i i = b();
      m.g(i);
      return i;
    }
    
    public final i b() {
      return i.I();
    }
    
    public final void c(i param1i) {
      i.J(param1i);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a6\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */