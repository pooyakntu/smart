package j0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Deprecated
public final class a {
  private static final Object f = new Object();
  
  private static a g;
  
  private final Context a;
  
  private final HashMap<BroadcastReceiver, ArrayList<c>> b = new HashMap<BroadcastReceiver, ArrayList<c>>();
  
  private final HashMap<String, ArrayList<c>> c = new HashMap<String, ArrayList<c>>();
  
  private final ArrayList<b> d = new ArrayList<b>();
  
  private final Handler e;
  
  private a(Context paramContext) {
    this.a = paramContext;
    this.e = new a(this, paramContext.getMainLooper());
  }
  
  public static a b(Context paramContext) {
    synchronized (f) {
      if (g == null)
        g = new a(paramContext.getApplicationContext()); 
      return g;
    } 
  }
  
  void a() {
    while (true) {
      HashMap<BroadcastReceiver, ArrayList<c>> hashMap;
      b b;
      synchronized (this.b) {
        int j = this.d.size();
        if (j <= 0)
          return; 
        b[] arrayOfB = new b[j];
        this.d.toArray(arrayOfB);
        this.d.clear();
        for (int i = 0; i < j; i++) {
          b = arrayOfB[i];
          int m = b.b.size();
          for (int k = 0; k < m; k++) {
            c c = b.b.get(k);
            if (!c.d)
              c.b.onReceive(this.a, b.a); 
          } 
        } 
      } 
    } 
  }
  
  public void c(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter) {
    synchronized (this.b) {
      c c = new c(paramIntentFilter, paramBroadcastReceiver);
      ArrayList<c> arrayList2 = this.b.get(paramBroadcastReceiver);
      ArrayList<c> arrayList1 = arrayList2;
      if (arrayList2 == null) {
        arrayList1 = new ArrayList(1);
        this.b.put(paramBroadcastReceiver, arrayList1);
      } 
      arrayList1.add(c);
      for (int i = 0; i < paramIntentFilter.countActions(); i++) {
        String str = paramIntentFilter.getAction(i);
        arrayList1 = this.c.get(str);
        ArrayList<c> arrayList = arrayList1;
        if (arrayList1 == null) {
          arrayList = new ArrayList<c>(1);
          this.c.put(str, arrayList);
        } 
        arrayList.add(c);
      } 
      return;
    } 
  }
  
  public boolean d(Intent paramIntent) {
    int i;
    ArrayList<c> arrayList;
    String str1;
    String str2;
    Uri uri;
    String str3;
    Set set;
    synchronized (this.b) {
      str1 = paramIntent.getAction();
      str2 = paramIntent.resolveTypeIfNeeded(this.a.getContentResolver());
      uri = paramIntent.getData();
      str3 = paramIntent.getScheme();
      set = paramIntent.getCategories();
      if ((paramIntent.getFlags() & 0x8) != 0) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Resolving type ");
        stringBuilder1.append(str2);
        stringBuilder1.append(" scheme ");
        stringBuilder1.append(str3);
        stringBuilder1.append(" of intent ");
        stringBuilder1.append(paramIntent);
      } 
      arrayList = this.c.get(paramIntent.getAction());
      if (arrayList != null) {
        if (i) {
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append("Action list: ");
          stringBuilder1.append(arrayList);
        } 
      } else {
        return false;
      } 
    } 
    StringBuilder stringBuilder = null;
    for (int j = 0; j < arrayList.size(); j++) {
      c c = arrayList.get(j);
      if (i) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Matching against filter ");
        stringBuilder1.append(c.a);
      } 
      if (!c.c) {
        IntentFilter intentFilter = c.a;
        StringBuilder stringBuilder1 = stringBuilder;
        int k = intentFilter.match(str1, str2, str3, uri, set, "LocalBroadcastManager");
        if (k >= 0) {
          if (i) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("  Filter matched!  match=0x");
            stringBuilder.append(Integer.toHexString(k));
          } 
          if (stringBuilder1 == null) {
            ArrayList arrayList1 = new ArrayList();
          } else {
            stringBuilder = stringBuilder1;
          } 
          stringBuilder.add(c);
          c.c = true;
        } else if (i) {
          String str;
          if (k != -4) {
            if (k != -3) {
              if (k != -2) {
                if (k != -1) {
                  str = "unknown reason";
                } else {
                  str = "type";
                } 
              } else {
                str = "data";
              } 
            } else {
              str = "action";
            } 
          } else {
            str = "category";
          } 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("  Filter did not match: ");
          stringBuilder2.append(str);
        } 
      } 
    } 
    if (stringBuilder != null) {
      for (i = 0; i < stringBuilder.size(); i++)
        ((c)stringBuilder.get(i)).c = false; 
      this.d.add(new b(paramIntent, (ArrayList<c>)stringBuilder));
      if (!this.e.hasMessages(1))
        this.e.sendEmptyMessage(1); 
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_10} */
      return true;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_10} */
    return false;
  }
  
  class a extends Handler {
    a(a this$0, Looper param1Looper) {
      super(param1Looper);
    }
    
    public void handleMessage(Message param1Message) {
      if (param1Message.what != 1) {
        super.handleMessage(param1Message);
        return;
      } 
      this.a.a();
    }
  }
  
  private static final class b {
    final Intent a;
    
    final ArrayList<a.c> b;
    
    b(Intent param1Intent, ArrayList<a.c> param1ArrayList) {
      this.a = param1Intent;
      this.b = param1ArrayList;
    }
  }
  
  private static final class c {
    final IntentFilter a;
    
    final BroadcastReceiver b;
    
    boolean c;
    
    boolean d;
    
    c(IntentFilter param1IntentFilter, BroadcastReceiver param1BroadcastReceiver) {
      this.a = param1IntentFilter;
      this.b = param1BroadcastReceiver;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder(128);
      stringBuilder.append("Receiver{");
      stringBuilder.append(this.b);
      stringBuilder.append(" filter=");
      stringBuilder.append(this.a);
      if (this.d)
        stringBuilder.append(" DEAD"); 
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j0\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */