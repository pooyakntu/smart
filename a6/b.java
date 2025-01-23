package a6;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.e1;
import androidx.recyclerview.widget.RecyclerView;
import com.smartpek.data.local.db.models.Group;
import com.smartpek.ui.customviews.TriStateSwitch;
import ir.am3n.needtool.views.A3ImageView;
import ir.am3n.needtool.views.A3RelativeLayout;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p7.c1;
import p7.e;
import p7.l;
import p7.t;
import r4.h;
import r8.m;
import s7.i;
import x5.g;

@SuppressLint({"SetTextI18n"})
public final class b extends i<Group> {
  private boolean D;
  
  public Map<Integer, View> E;
  
  public b(View paramView) {
    super(paramView);
  }
  
  public View Z(int paramInt) {
    Map<Integer, View> map = this.E;
    View view2 = map.get(Integer.valueOf(paramInt));
    View view1 = view2;
    if (view2 == null) {
      view1 = c0();
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
  
  public void a() {
    try {
      A3RelativeLayout a3RelativeLayout = (A3RelativeLayout)Z(h.N4);
    } finally {
      Exception exception = null;
    } 
  }
  
  public void a0(Group paramGroup, int paramInt) {
    m.j(paramGroup, "item");
    paramInt = h.t1;
    A3ImageView a3ImageView = (A3ImageView)Z(paramInt);
    m.i(a3ImageView, "imgDrag");
    W((View)a3ImageView);
    a3ImageView = (A3ImageView)Z(paramInt);
    if (a3ImageView != null) {
      if (g.F.g()) {
        paramInt = 0;
      } else {
        paramInt = 8;
      } 
      a3ImageView.setVisibility(paramInt);
    } 
    int j = h.N4;
    A3RelativeLayout a3RelativeLayout = (A3RelativeLayout)Z(j);
    if (a3RelativeLayout != null)
      a3RelativeLayout.setEnabled(true); 
    a3RelativeLayout = (A3RelativeLayout)Z(j);
    if (a3RelativeLayout != null) {
      if (paramGroup.isSelected()) {
        paramInt = 2131230900;
      } else {
        paramInt = 2131230898;
      } 
      a3RelativeLayout.setBackgroundResource(paramInt);
    } 
    if (t.a() - paramGroup.getCreatedTs() < 3000L && Build.VERSION.SDK_INT > 21)
      try {
        Context context = ((RecyclerView.e0)this).g.getContext();
        m.i(context, "itemView.context");
        paramInt = c1.a(context, 2131099751);
        context = ((RecyclerView.e0)this).g.getContext();
        m.i(context, "itemView.context");
        int k = c1.a(context, 2131099738);
        if ((A3RelativeLayout)Z(j) != null)
          e1.C0(Z(j), c1.d(paramInt)); 
        ValueAnimator valueAnimator = l.a.b(paramInt, k).b(new a(this));
        valueAnimator.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        valueAnimator.setStartDelay(1500L);
        valueAnimator.setDuration(3000L);
      } finally {
        a3RelativeLayout = null;
        a3RelativeLayout.printStackTrace();
      }  
    ((AppCompatTextView)Z(h.v6)).setText(paramGroup.getName());
    AppCompatTextView appCompatTextView = (AppCompatTextView)Z(h.o6);
    Context context1 = U();
    String str2 = null;
    if (context1 != null) {
      String str = c1.g(context1, 2131951923);
    } else {
      context1 = null;
    } 
    paramInt = paramGroup.getCount();
    Context context2 = U();
    String str1 = str2;
    if (context2 != null) {
      String str = c1.g(context2, 2131951837);
      str1 = str2;
      if (str != null) {
        str1 = str.toLowerCase(Locale.ROOT);
        m.i(str1, "this as java.lang.String).toLowerCase(Locale.ROOT)");
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append((String)context1);
    stringBuilder.append(" ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" ");
    stringBuilder.append(str1);
    appCompatTextView.setText(stringBuilder.toString());
    ((TriStateSwitch)Z(h.b6)).setState(paramGroup.getPowerState());
  }
  
  public View b() {
    return Z(h.N4);
  }
  
  public void b0(Group paramGroup, int paramInt, List<Object> paramList) {
    m.j(paramGroup, "item");
    m.j(paramList, "payloads");
    for (List<Object> paramList : paramList) {
      Context context;
      A3RelativeLayout a3RelativeLayout;
      A3ImageView a3ImageView;
      a.a a1 = a.a.UPDATE;
      a.a a2 = null;
      if (paramList == a1) {
        String str;
        ((AppCompatTextView)Z(h.v6)).setText(paramGroup.getName());
        AppCompatTextView appCompatTextView = (AppCompatTextView)Z(h.o6);
        context = U();
        if (context != null) {
          String str1 = c1.g(context, 2131951923);
        } else {
          context = null;
        } 
        paramInt = paramGroup.getCount();
        Context context1 = U();
        a1 = a2;
        if (context1 != null) {
          String str1 = c1.g(context1, 2131951837);
          a1 = a2;
          if (str1 != null) {
            str = str1.toLowerCase(Locale.ROOT);
            m.i(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
          } 
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)context);
        stringBuilder.append(" ");
        stringBuilder.append(paramInt);
        stringBuilder.append(" ");
        stringBuilder.append(str);
        appCompatTextView.setText(stringBuilder.toString());
        continue;
      } 
      if (context == a.a.SELECT_STATE_CHANGED) {
        a3RelativeLayout = (A3RelativeLayout)Z(h.N4);
        if (a3RelativeLayout != null) {
          if (paramGroup.isSelected()) {
            paramInt = 2131230900;
          } else {
            paramInt = 2131230898;
          } 
          a3RelativeLayout.setBackgroundResource(paramInt);
        } 
        continue;
      } 
      if (a3RelativeLayout == a.a.SORT_MODE_ACTIVE) {
        a3ImageView = (A3ImageView)Z(h.t1);
        if (a3ImageView != null) {
          m.i(a3ImageView, "imgDrag");
          e.h((View)a3ImageView, false, null, 3, null);
        } 
        g.F.h(true);
        continue;
      } 
      if (a3ImageView == a.a.SORT_MODE_LOCKED) {
        a3ImageView = (A3ImageView)Z(h.t1);
        if (a3ImageView != null) {
          m.i(a3ImageView, "imgDrag");
          e.d((View)a3ImageView, false, false, 3, null);
        } 
        g.F.h(false);
        continue;
      } 
      if (a3ImageView == a.a.HIDE_SWITCH_PROGRESS)
        ((TriStateSwitch)Z(h.b6)).b(); 
    } 
  }
  
  public void c() {
    try {
      A3RelativeLayout a3RelativeLayout = (A3RelativeLayout)Z(h.N4);
    } finally {
      Exception exception = null;
    } 
  }
  
  public View c0() {
    View view = ((RecyclerView.e0)this).g;
    m.i(view, "itemView");
    return view;
  }
  
  public final void d0(boolean paramBoolean) {
    this.D = paramBoolean;
  }
  
  public View k() {
    return Z(h.N4);
  }
  
  public static final class a implements l.c {
    a(b param1b) {}
    
    public void a(int param1Int) {
      b b1 = this.a;
      int i = h.N4;
      if ((A3RelativeLayout)b1.Z(i) != null)
        e1.C0(this.a.Z(i), c1.d(param1Int)); 
    }
    
    public void b() {
      this.a.d0(false);
      b b1 = this.a;
      int i = h.N4;
      if ((A3RelativeLayout)b1.Z(i) != null)
        e1.C0(this.a.Z(i), null); 
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a6\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */