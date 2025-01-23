package e5;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.bottomsheet.b;
import com.google.android.material.button.MaterialButton;
import com.smartpek.App;
import com.smartpek.ui.device.coolerctrl.auto.CoolerStep;
import e8.q;
import ir.am3n.needtool.views.A3RelativeLayout;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p7.c0;
import p7.c1;
import p7.q1;
import q8.l;
import r4.h;
import r8.g;
import r8.m;
import r8.n;
import z8.m;

@SuppressLint({"SetTextI18n"})
public final class b extends b {
  public static final a k = new a(null);
  
  private int h;
  
  private l<? super CoolerStep, q> i = b.g;
  
  public Map<Integer, View> j;
  
  private final void P(Dialog paramDialog) {
    A3RelativeLayout a3RelativeLayout;
    AppCompatTextView appCompatTextView = (AppCompatTextView)paramDialog.findViewById(h.X6);
    if (appCompatTextView != null) {
      String str1;
      StringBuilder stringBuilder;
      String[] arrayOfString = c.i.d();
      Context context = null;
      String str2 = null;
      if (arrayOfString != null) {
        str1 = arrayOfString[this.h];
      } else {
        arrayOfString = null;
      } 
      Resources resources = getResources();
      m.i(resources, "resources");
      String str3 = c1.c(resources).getLanguage();
      m.i(str3, "resources.currentLocale().language");
      if (m.N(str3, "fa", false, 2, null)) {
        context = getContext();
        if (context != null) {
          m.i(context, "context");
          str2 = c1.g(context, 2131952240);
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(" ");
        stringBuilder.append((String)arrayOfString);
        str1 = stringBuilder.toString();
      } else {
        String str;
        if (str1 != null) {
          str1 = q1.b(str1);
        } else {
          str1 = null;
        } 
        Context context3 = getContext();
        StringBuilder stringBuilder1 = stringBuilder;
        if (context3 != null) {
          m.i(context3, "context");
          String str4 = c1.g(context3, 2131952240);
          stringBuilder1 = stringBuilder;
          if (str4 != null) {
            str = str4.toLowerCase(Locale.ROOT);
            m.i(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
          } 
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append(str1);
        stringBuilder.append(" ");
        stringBuilder.append(str);
        str1 = stringBuilder.toString();
      } 
      appCompatTextView.setText(str1);
    } 
    Context context2 = requireContext();
    c.a a1 = c.i;
    List<String> list2 = a1.a();
    m.g(list2);
    ArrayAdapter arrayAdapter2 = new ArrayAdapter(context2, 2131558558, list2);
    arrayAdapter2.setDropDownViewResource(2131558557);
    Spinner spinner2 = (Spinner)paramDialog.findViewById(h.z5);
    if (spinner2 != null)
      spinner2.setAdapter((SpinnerAdapter)arrayAdapter2); 
    if (this.h >= a1.c()) {
      a3RelativeLayout = (A3RelativeLayout)paramDialog.findViewById(h.p5);
      if (a3RelativeLayout == null)
        return; 
      a3RelativeLayout.setVisibility(8);
      return;
    } 
    Context context1 = requireContext();
    List<String> list1 = a1.b();
    m.g(list1);
    ArrayAdapter arrayAdapter1 = new ArrayAdapter(context1, 2131558558, list1);
    arrayAdapter1.setDropDownViewResource(2131558557);
    Spinner spinner1 = (Spinner)a3RelativeLayout.findViewById(h.D5);
    if (spinner1 == null)
      return; 
    spinner1.setAdapter((SpinnerAdapter)arrayAdapter1);
  }
  
  private static final void Q(Dialog paramDialog, b paramb, View paramView) {
    boolean bool;
    byte b1;
    m.j(paramDialog, "$dialog");
    m.j(paramb, "this$0");
    Spinner spinner2 = (Spinner)paramDialog.findViewById(h.z5);
    if (spinner2 != null) {
      bool = spinner2.getSelectedItemPosition();
    } else {
      bool = false;
    } 
    Spinner spinner1 = (Spinner)paramDialog.findViewById(h.D5);
    if (spinner1 != null) {
      b1 = spinner1.getSelectedItemPosition();
    } else {
      b1 = -1;
    } 
    paramb.i.invoke(new CoolerStep(-1, bool, b1));
    paramb.dismissAllowingStateLoss();
  }
  
  public void M() {
    this.j.clear();
  }
  
  @SuppressLint({"RestrictedApi"})
  public void setupDialog(Dialog paramDialog, int paramInt) {
    m.j(paramDialog, "dialog");
    c0.e(1000, c.g);
    paramDialog.setContentView(2131558472);
    P(paramDialog);
    MaterialButton materialButton = (MaterialButton)paramDialog.findViewById(h.z);
    if (materialButton != null)
      materialButton.setOnClickListener(new a(paramDialog, this)); 
  }
  
  public static final class a {
    private a() {}
    
    public final b a(int param1Int, l<? super CoolerStep, q> param1l) {
      m.j(param1l, "callback");
      b b = new b();
      b.O(b, param1Int);
      b.N(b, param1l);
      return b;
    }
  }
  
  static final class b extends n implements l<CoolerStep, q> {
    public static final b g = new b();
    
    b() {
      super(1);
    }
    
    public final void a(CoolerStep param1CoolerStep) {
      m.j(param1CoolerStep, "it");
    }
  }
  
  static final class c extends n implements q8.a<q> {
    public static final c g = new c();
    
    c() {
      super(0);
    }
    
    public final void invoke() {
      App.g.r(true);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e5\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */