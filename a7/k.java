package a7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiManager;
import y6.l;
import y6.x;
import z6.c;

public final class k extends BroadcastReceiver {
  private final h a;
  
  private ScanResult b;
  
  private final WifiManager c;
  
  private String d;
  
  public k(h paramh, WifiManager paramWifiManager) {
    this.a = paramh;
    this.c = paramWifiManager;
  }
  
  public static boolean e(WifiManager paramWifiManager, String paramString) {
    if (paramString != null && paramWifiManager != null && paramWifiManager.getConnectionInfo() != null && paramWifiManager.getConnectionInfo().getSSID() != null && paramWifiManager.getConnectionInfo().getIpAddress() != 0 && paramString.equals(paramWifiManager.getConnectionInfo().getSSID())) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Already connected to: ");
      stringBuilder.append(paramWifiManager.getConnectionInfo().getSSID());
      stringBuilder.append("  BSSID: ");
      stringBuilder.append(paramWifiManager.getConnectionInfo().getBSSID());
      x.J(stringBuilder.toString());
      return true;
    } 
    return false;
  }
  
  public k c(ScanResult paramScanResult, String paramString, ConnectivityManager paramConnectivityManager) {
    this.b = paramScanResult;
    return this;
  }
  
  public k d(String paramString1, String paramString2, ConnectivityManager paramConnectivityManager) {
    this.d = paramString1;
    return this;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent) {
    SupplicantState supplicantState;
    StringBuilder stringBuilder1;
    String str = paramIntent.getAction();
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("Connection Broadcast action: ");
    stringBuilder2.append(str);
    x.J(stringBuilder2.toString());
    if (c.a()) {
      if ("android.net.wifi.supplicant.STATE_CHANGE".equals(str)) {
        supplicantState = (SupplicantState)paramIntent.getParcelableExtra("newState");
        int i = paramIntent.getIntExtra("supplicantError", -1);
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Connection Broadcast state: ");
        stringBuilder1.append(supplicantState);
        x.J(stringBuilder1.toString());
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("suppl_error: ");
        stringBuilder1.append(i);
        x.J(stringBuilder1.toString());
        if (this.b == null && e(this.c, this.d))
          this.a.b(); 
        if (supplicantState == SupplicantState.DISCONNECTED && i == 1) {
          this.a.a(a.AUTHENTICATION_ERROR_OCCURRED);
          return;
        } 
      } 
    } else if ("android.net.wifi.STATE_CHANGE".equals(supplicantState)) {
      if (l.p(this.c, (String)z6.a.d(this.b).c(new i()).a())) {
        this.a.b();
        return;
      } 
    } else if ("android.net.wifi.supplicant.STATE_CHANGE".equals(supplicantState)) {
      supplicantState = (SupplicantState)stringBuilder1.getParcelableExtra("newState");
      int i = stringBuilder1.getIntExtra("supplicantError", -1);
      if (supplicantState == null) {
        this.a.a(a.COULD_NOT_CONNECT);
        return;
      } 
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Connection Broadcast state: ");
      stringBuilder1.append(supplicantState);
      x.J(stringBuilder1.toString());
      int j = a.a[supplicantState.ordinal()];
      if (j != 1 && j != 2) {
        if (j != 3)
          return; 
        if (i == 1) {
          x.J("Authentication error...");
          this.a.a(a.AUTHENTICATION_ERROR_OCCURRED);
          return;
        } 
        x.J("Disconnected. Re-attempting to connect...");
        l.v(this.c, this.b);
        return;
      } 
      if (this.b == null && e(this.c, this.d)) {
        this.a.b();
        return;
      } 
      if (l.p(this.c, (String)z6.a.d(this.b).c(new j()).a()))
        this.a.b(); 
    } 
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a7\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */