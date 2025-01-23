package b7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class c extends BroadcastReceiver {
  private final b a;
  
  public c(b paramb) {
    this.a = paramb;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent) {
    this.a.a();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b7\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */