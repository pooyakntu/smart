package e;

import android.content.Context;
import android.content.Intent;
import e8.j;
import e8.n;
import f8.i;
import f8.j0;
import f8.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import r8.g;
import r8.m;
import w8.g;

public final class b extends a<String[], Map<String, Boolean>> {
  public static final a a = new a(null);
  
  public Intent d(Context paramContext, String[] paramArrayOfString) {
    m.j(paramContext, "context");
    m.j(paramArrayOfString, "input");
    return a.a(paramArrayOfString);
  }
  
  public a.a<Map<String, Boolean>> e(Context paramContext, String[] paramArrayOfString) {
    int j;
    m.j(paramContext, "context");
    m.j(paramArrayOfString, "input");
    int i = paramArrayOfString.length;
    byte b1 = 1;
    boolean bool = false;
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i != 0)
      return new a.a<Map<String, Boolean>>(j0.g()); 
    int k = paramArrayOfString.length;
    i = 0;
    while (true) {
      j = b1;
      if (i < k) {
        if (androidx.core.content.a.a(paramContext, paramArrayOfString[i]) == 0) {
          j = 1;
        } else {
          j = 0;
        } 
        if (!j) {
          j = 0;
          break;
        } 
        i++;
        continue;
      } 
      break;
    } 
    if (j) {
      LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(g.b(j0.d(paramArrayOfString.length), 16));
      j = paramArrayOfString.length;
      for (i = bool; i < j; i++) {
        j j1 = n.a(paramArrayOfString[i], Boolean.TRUE);
        linkedHashMap.put(j1.d(), j1.e());
      } 
      return new a.a(linkedHashMap);
    } 
    return null;
  }
  
  public Map<String, Boolean> f(int paramInt, Intent paramIntent) {
    if (paramInt != -1)
      return j0.g(); 
    if (paramIntent == null)
      return j0.g(); 
    String[] arrayOfString = paramIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
    int[] arrayOfInt = paramIntent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
    if (arrayOfInt == null || arrayOfString == null)
      return j0.g(); 
    ArrayList<Boolean> arrayList = new ArrayList(arrayOfInt.length);
    int i = arrayOfInt.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      boolean bool;
      if (arrayOfInt[paramInt] == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      arrayList.add(Boolean.valueOf(bool));
    } 
    return j0.n(o.m0(i.s((Object[])arrayOfString), arrayList));
  }
  
  public static final class a {
    private a() {}
    
    public final Intent a(String[] param1ArrayOfString) {
      m.j(param1ArrayOfString, "input");
      Intent intent = (new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS")).putExtra("androidx.activity.result.contract.extra.PERMISSIONS", param1ArrayOfString);
      m.i(intent, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
      return intent;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */