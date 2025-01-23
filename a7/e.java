package a7;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import y6.x;

public class e {
  private static volatile e e;
  
  private ConnectivityManager.NetworkCallback a;
  
  private ConnectivityManager b;
  
  private boolean c;
  
  private boolean d;
  
  public static e d() {
    // Byte code:
    //   0: getstatic a7/e.e : La7/e;
    //   3: ifnonnull -> 37
    //   6: ldc a7/e
    //   8: monitorenter
    //   9: getstatic a7/e.e : La7/e;
    //   12: ifnonnull -> 25
    //   15: new a7/e
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: putstatic a7/e.e : La7/e;
    //   25: ldc a7/e
    //   27: monitorexit
    //   28: goto -> 37
    //   31: astore_0
    //   32: ldc a7/e
    //   34: monitorexit
    //   35: aload_0
    //   36: athrow
    //   37: getstatic a7/e.e : La7/e;
    //   40: areturn
    // Exception table:
    //   from	to	target	type
    //   9	25	31	finally
    //   25	28	31	finally
    //   32	35	31	finally
  }
  
  public void a(ConnectivityManager.NetworkCallback paramNetworkCallback, ConnectivityManager paramConnectivityManager) {
    this.a = paramNetworkCallback;
    this.b = paramConnectivityManager;
    this.c = true;
  }
  
  public void b(Network paramNetwork) {
    ConnectivityManager connectivityManager = this.b;
    if (connectivityManager != null) {
      d.a(connectivityManager, paramNetwork);
      this.d = true;
      return;
    } 
    x.J("ConnectivityManager is null. Did you call addNetworkCallback method first?");
  }
  
  public void c() {
    if (this.a != null && this.b != null) {
      x.J("Disconnecting on Android 10+");
      this.b.unregisterNetworkCallback(this.a);
      this.a = null;
      this.c = false;
    } 
  }
  
  public void e(NetworkRequest paramNetworkRequest) {
    ConnectivityManager.NetworkCallback networkCallback = this.a;
    if (networkCallback != null) {
      ConnectivityManager connectivityManager = this.b;
      if (connectivityManager != null) {
        connectivityManager.requestNetwork(paramNetworkRequest, networkCallback);
        return;
      } 
    } 
    x.J("NetworkCallback has not been added yet. Please call addNetworkCallback method first");
  }
  
  public void f() {
    ConnectivityManager connectivityManager = this.b;
    if (connectivityManager != null) {
      d.a(connectivityManager, null);
      this.d = false;
      return;
    } 
    x.J("ConnectivityManager is null. Did you call addNetworkCallback method first?");
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a7\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */