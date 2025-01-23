package b;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public interface a extends IInterface {
  void p(String paramString1, int paramInt, String paramString2, Notification paramNotification) throws RemoteException;
  
  public static abstract class a extends Binder implements a {
    public static a u(IBinder param1IBinder) {
      if (param1IBinder == null)
        return null; 
      IInterface iInterface = param1IBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
      return (iInterface != null && iInterface instanceof a) ? (a)iInterface : new a(param1IBinder);
    }
    
    private static class a implements a {
      private IBinder a;
      
      a(IBinder param2IBinder) {
        this.a = param2IBinder;
      }
      
      public IBinder asBinder() {
        return this.a;
      }
      
      public void p(String param2String1, int param2Int, String param2String2, Notification param2Notification) throws RemoteException {
        Parcel parcel = Parcel.obtain();
        try {
          parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
          parcel.writeString(param2String1);
          parcel.writeInt(param2Int);
          parcel.writeString(param2String2);
          a.b.a(parcel, (Parcelable)param2Notification, 0);
          this.a.transact(1, parcel, null, 1);
          return;
        } finally {
          parcel.recycle();
        } 
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
    
    public void p(String param1String1, int param1Int, String param1String2, Notification param1Notification) throws RemoteException {
      Parcel parcel = Parcel.obtain();
      try {
        parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
        parcel.writeString(param1String1);
        parcel.writeInt(param1Int);
        parcel.writeString(param1String2);
        a.b.a(parcel, (Parcelable)param1Notification, 0);
        this.a.transact(1, parcel, null, 1);
        return;
      } finally {
        parcel.recycle();
      } 
    }
  }
  
  public static class b {
    private static <T extends Parcelable> void b(Parcel param1Parcel, T param1T, int param1Int) {
      if (param1T != null) {
        param1Parcel.writeInt(1);
        param1T.writeToParcel(param1Parcel, param1Int);
        return;
      } 
      param1Parcel.writeInt(0);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */