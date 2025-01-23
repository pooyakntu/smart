package c7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class c extends BroadcastReceiver {
  private final a a;
  
  public c(a parama) {
    this.a = parama;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent) {
    if (paramIntent.getIntExtra("wifi_state", 0) != 3)
      return; 
    this.a.a();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c7\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */