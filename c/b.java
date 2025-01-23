package c;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class b implements Parcelable {
  public static final Parcelable.Creator<b> CREATOR = new a();
  
  final boolean g = false;
  
  final Handler h = null;
  
  a i;
  
  b(Parcel paramParcel) {
    this.i = a.a.u(paramParcel.readStrongBinder());
  }
  
  protected void a(int paramInt, Bundle paramBundle) {}
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield i : Lc/a;
    //   6: ifnonnull -> 21
    //   9: aload_0
    //   10: new c/b$b
    //   13: dup
    //   14: aload_0
    //   15: invokespecial <init> : (Lc/b;)V
    //   18: putfield i : Lc/a;
    //   21: aload_1
    //   22: aload_0
    //   23: getfield i : Lc/a;
    //   26: invokeinterface asBinder : ()Landroid/os/IBinder;
    //   31: invokevirtual writeStrongBinder : (Landroid/os/IBinder;)V
    //   34: aload_0
    //   35: monitorexit
    //   36: return
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   2	21	37	finally
    //   21	36	37	finally
    //   38	40	37	finally
  }
  
  class a implements Parcelable.Creator<b> {
    public b a(Parcel param1Parcel) {
      return new b(param1Parcel);
    }
    
    public b[] b(int param1Int) {
      return new b[param1Int];
    }
  }
  
  class b extends a.a {
    b(b this$0) {}
    
    public void s(int param1Int, Bundle param1Bundle) {
      b b1 = this.a;
      Handler handler = b1.h;
      if (handler != null) {
        handler.post(new b.c(b1, param1Int, param1Bundle));
        return;
      } 
      b1.a(param1Int, param1Bundle);
    }
  }
  
  class c implements Runnable {
    final int g;
    
    final Bundle h;
    
    c(b this$0, int param1Int, Bundle param1Bundle) {
      this.g = param1Int;
      this.h = param1Bundle;
    }
    
    public void run() {
      this.i.a(this.g, this.h);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */