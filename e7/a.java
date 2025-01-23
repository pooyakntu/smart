package e7;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import androidx.appcompat.app.k;
import androidx.core.os.l;
import java.util.Locale;
import r8.m;

public final class a {
  public static final Locale a(Configuration paramConfiguration) {
    String str;
    Locale locale;
    m.k(paramConfiguration, "$this$getLocaleCompat");
    if (b(24)) {
      locale = l.a(k.a(paramConfiguration), 0);
      str = "locales.get(0)";
    } else {
      locale = ((Configuration)str).locale;
      str = "locale";
    } 
    m.f(locale, str);
    return locale;
  }
  
  public static final boolean b(int paramInt) {
    return (Build.VERSION.SDK_INT >= paramInt);
  }
  
  public static final void c(Activity paramActivity) {
    m.k(paramActivity, "$this$resetTitle");
    try {
      int i = (paramActivity.getPackageManager().getActivityInfo(paramActivity.getComponentName(), 128)).labelRes;
      if (i != 0) {
        paramActivity.setTitle(i);
        return;
      } 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      nameNotFoundException.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e7\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */