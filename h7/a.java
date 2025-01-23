package h7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.viewpager.widget.ViewPager;
import r8.g;
import r8.m;

public final class a extends Fragment {
  public static final a k = new a(null);
  
  private String g = "";
  
  private String h = "";
  
  private String i = "";
  
  private String j = "";
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    m.k(paramLayoutInflater, "inflater");
    View view = paramLayoutInflater.inflate(g.b, null);
    TabHost tabHost = (TabHost)view.findViewById(16908306);
    tabHost.setup();
    Bundle bundle = getArguments();
    if (bundle != null) {
      String str2 = bundle.getString("file name", "");
      m.f(str2, "it.getString(TARGET_FILE_NAME, \"\")");
      this.g = str2;
      str2 = bundle.getString("searchHintlogcat", "");
      m.f(str2, "it.getString(SEARCH_HINT_LOGCAT, \"\")");
      this.h = str2;
      str2 = bundle.getString("searchHintfile", "");
      m.f(str2, "it.getString(SEARCH_HINT_LOGFILE, \"\")");
      this.i = str2;
      String str1 = bundle.getString("mail_logger");
      if (str1 != null) {
        m.f(str1, "address");
        this.j = str1;
      } 
    } 
    ViewPager viewPager = (ViewPager)view.findViewById(f.m);
    e e = requireActivity();
    m.f(e, "requireActivity()");
    m.f(tabHost, "mTabHost");
    m.f(viewPager, "mViewPager");
    j j = new j(e, tabHost, viewPager);
    c c = c.s.a(this.g, this.h, this.j);
    d d = d.s.a(this.g, this.i, this.j);
    TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("nameC").setIndicator("Logcat");
    m.f(tabSpec2, "mTabHost.newTabSpec(\"nam…\").setIndicator(\"Logcat\")");
    j.c(tabSpec2, (Fragment)c);
    TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("nameF").setIndicator("Logfile");
    m.f(tabSpec1, "mTabHost.newTabSpec(\"nam…).setIndicator(\"Logfile\")");
    j.c(tabSpec1, (Fragment)d);
    if (paramBundle != null)
      try {
        tabHost.setCurrentTabByTag(paramBundle.getString("tab"));
        return view;
      } catch (Exception exception) {
        return view;
      }  
    return view;
  }
  
  public static final class a {
    private a() {}
    
    public final a a(String param1String1, String param1String2, String param1String3, String param1String4) {
      m.k(param1String1, "targetFileName");
      m.k(param1String2, "searchHintLogfile");
      m.k(param1String3, "searchHintLogcat");
      m.k(param1String4, "logMail");
      a a1 = new a();
      Bundle bundle = new Bundle();
      bundle.putString("file name", param1String1);
      bundle.putString("searchHintfile", param1String2);
      bundle.putString("searchHintlogcat", param1String3);
      bundle.putString("mail_logger", param1String4);
      a1.setArguments(bundle);
      return a1;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h7\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */