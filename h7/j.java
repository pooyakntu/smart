package h7;

import android.content.Context;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.r;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;
import r8.m;

public final class j extends r implements TabHost.OnTabChangeListener, ViewPager.j {
  private final Context a;
  
  private final List<Fragment> b;
  
  private final TabHost c;
  
  private final ViewPager d;
  
  public j(e parame, TabHost paramTabHost, ViewPager paramViewPager) {
    super(parame.getSupportFragmentManager());
    this.c = paramTabHost;
    this.d = paramViewPager;
    this.b = new ArrayList<Fragment>();
    this.a = (Context)parame;
    paramTabHost.setOnTabChangedListener(this);
    paramViewPager.setAdapter((androidx.viewpager.widget.a)this);
    paramViewPager.addOnPageChangeListener(this);
  }
  
  public final void c(TabHost.TabSpec paramTabSpec, Fragment paramFragment) {
    m.k(paramTabSpec, "tabSpec");
    m.k(paramFragment, "fragment");
    paramTabSpec.setContent(new a(this.a));
    this.c.addTab(paramTabSpec);
    this.b.add(paramFragment);
    notifyDataSetChanged();
  }
  
  public int getCount() {
    return this.b.size();
  }
  
  public Fragment getItem(int paramInt) {
    return this.b.get(paramInt);
  }
  
  public void onPageScrollStateChanged(int paramInt) {}
  
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {}
  
  public void onPageSelected(int paramInt) {
    TabWidget tabWidget = this.c.getTabWidget();
    m.f(tabWidget, "widget");
    int i = tabWidget.getDescendantFocusability();
    tabWidget.setDescendantFocusability(393216);
    try {
      this.c.setCurrentTab(paramInt);
    } catch (Exception exception) {}
    tabWidget.setDescendantFocusability(i);
  }
  
  public void onTabChanged(String paramString) {
    m.k(paramString, "tabId");
    int i = this.c.getCurrentTab();
    this.d.setCurrentItem(i);
  }
  
  private static final class a implements TabHost.TabContentFactory {
    private final Context a;
    
    public a(Context param1Context) {
      this.a = param1Context;
    }
    
    public View createTabContent(String param1String) {
      m.k(param1String, "tag");
      View view = new View(this.a);
      view.setMinimumWidth(0);
      view.setMinimumHeight(0);
      return view;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h7\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */