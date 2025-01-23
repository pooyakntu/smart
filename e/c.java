package e;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.a;
import r8.g;
import r8.m;

public final class c extends a<Intent, a> {
  public static final a a = new a(null);
  
  public Intent d(Context paramContext, Intent paramIntent) {
    m.j(paramContext, "context");
    m.j(paramIntent, "input");
    return paramIntent;
  }
  
  public a e(int paramInt, Intent paramIntent) {
    return new a(paramInt, paramIntent);
  }
  
  public static final class a {
    private a() {}
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */