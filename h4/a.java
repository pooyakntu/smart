package h4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import y3.c;

public class a {
  private final Context a;
  
  private final SharedPreferences b;
  
  private final c c;
  
  private boolean d;
  
  public a(Context paramContext, String paramString, c paramc) {
    paramContext = a(paramContext);
    this.a = paramContext;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("com.google.firebase.common.prefs:");
    stringBuilder.append(paramString);
    this.b = paramContext.getSharedPreferences(stringBuilder.toString(), 0);
    this.c = paramc;
    this.d = c();
  }
  
  private static Context a(Context paramContext) {
    return (Build.VERSION.SDK_INT < 24) ? paramContext : androidx.core.content.a.b(paramContext);
  }
  
  private boolean c() {
    return this.b.contains("firebase_data_collection_default_enabled") ? this.b.getBoolean("firebase_data_collection_default_enabled", true) : d();
  }
  
  private boolean d() {
    try {
      PackageManager packageManager = this.a.getPackageManager();
      if (packageManager != null) {
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128);
        if (applicationInfo != null) {
          Bundle bundle = applicationInfo.metaData;
          if (bundle != null && bundle.containsKey("firebase_data_collection_default_enabled"))
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled"); 
        } 
      } 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {}
    return true;
  }
  
  public boolean b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h4\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */