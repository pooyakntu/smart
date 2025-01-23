package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public interface a extends IInterface {
  void s(int paramInt, Bundle paramBundle) throws RemoteException;
  
  public static abstract class a extends Binder implements a {
    public a() {
      attachInterface(this, "android.support.v4.os.IResultReceiver");
    }
    
    public static a u(IBinder param1IBinder) {
      if (param1IBinder == null)
        return null; 
      IInterface iInterface = param1IBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
      return (iInterface != null && iInterface instanceof a) ? (a)iInterface : new a(param1IBinder);
    }
    
    public IBinder asBinder() {
      return (IBinder)this;
    }
    
    public boolean onTransact(int param1Int1, Parcel param1Parcel1, Parcel param1Parcel2, int param1Int2) throws RemoteException {
      if (param1Int1 >= 1 && param1Int1 <= 16777215)
        param1Parcel1.enforceInterface("android.support.v4.os.IResultReceiver"); 
      if (param1Int1 != 1598968902) {
        if (param1Int1 != 1)
          return super.onTransact(param1Int1, param1Parcel1, param1Parcel2, param1Int2); 
        s(param1Parcel1.readInt(), (Bundle)a.b.a(param1Parcel1, Bundle.CREATOR));
        return true;
      } 
      param1Parcel2.writeString("android.support.v4.os.IResultReceiver");
      return true;
    }
    
    private static class a implements a {
      private IBinder a;
      
      a(IBinder param2IBinder) {
        this.a = param2IBinder;
      }
      
      public IBinder asBinder() {
        return this.a;
      }
    }
  }
  
  private static class a implements a {
    private IBinder a;
    
    a(IBinder param1IBinder) {
      this.a = param1IBinder;
    }
    
    public IBinder asBinder() {
      return this.a;
    }
  }
  
  public static class b {
    private static <T> T b(Parcel param1Parcel, Parcelable.Creator<T> param1Creator) {
      return (T)((param1Parcel.readInt() != 0) ? param1Creator.createFromParcel(param1Parcel) : null);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */