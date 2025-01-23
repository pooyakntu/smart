package b5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.smartpek.data.local.models.b;
import com.smartpek.ui.customviews.PowerButton;
import com.smartpek.ui.customviews.c;
import ir.am3n.pullrefreshlayout.PullRefreshLayout;
import java.util.Map;
import p7.c1;
import r4.h;
import r8.g;

@SuppressLint({"ClickableViewAccessibility"})
public final class m extends b {
  public static final a r = new a(null);
  
  public Map<Integer, View> q;
  
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
  
  public void U(String paramString, Integer paramInteger, b paramb, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {}
  
  public boolean X(PullRefreshLayout paramPullRefreshLayout, boolean paramBoolean) {
    return false;
  }
  
  public PowerButton g0() {
    return null;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    r8.m.j(paramLayoutInflater, "inflater");
    super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    return paramLayoutInflater.inflate(2131558509, paramViewGroup, false);
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {
    r8.m.j(paramView, "view");
    super.onViewCreated(paramView, paramBundle);
    AppCompatTextView appCompatTextView = (AppCompatTextView)I(h.c6);
    if (appCompatTextView == null)
      return; 
    Context context = getContext();
    if (context != null) {
      String str = c1.g(context, 2131952303);
    } else {
      context = null;
    } 
    appCompatTextView.setText((CharSequence)context);
  }
  
  public static final class a {
    private a() {}
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b5\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */