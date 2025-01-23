package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
class k implements e {
  private final a a;
  
  private final i b;
  
  private final Map<String, m> c = new HashMap<String, m>();
  
  @Inject
  k(Context paramContext, i parami) {
    this(new a(paramContext), parami);
  }
  
  k(a parama, i parami) {
    this.a = parama;
    this.b = parami;
  }
  
  public m a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   12: ifeq -> 33
    //   15: aload_0
    //   16: getfield c : Ljava/util/Map;
    //   19: aload_1
    //   20: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   25: checkcast c2/m
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: areturn
    //   33: aload_0
    //   34: getfield a : Lc2/k$a;
    //   37: aload_1
    //   38: invokevirtual b : (Ljava/lang/String;)Lc2/d;
    //   41: astore_2
    //   42: aload_2
    //   43: ifnonnull -> 50
    //   46: aload_0
    //   47: monitorexit
    //   48: aconst_null
    //   49: areturn
    //   50: aload_2
    //   51: aload_0
    //   52: getfield b : Lc2/i;
    //   55: aload_1
    //   56: invokevirtual a : (Ljava/lang/String;)Lc2/h;
    //   59: invokeinterface create : (Lc2/h;)Lc2/m;
    //   64: astore_2
    //   65: aload_0
    //   66: getfield c : Ljava/util/Map;
    //   69: aload_1
    //   70: aload_2
    //   71: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   76: pop
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_2
    //   80: areturn
    //   81: astore_1
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_1
    //   85: athrow
    // Exception table:
    //   from	to	target	type
    //   2	29	81	finally
    //   33	42	81	finally
    //   50	77	81	finally
  }
  
  static class a {
    private final Context a;
    
    private Map<String, String> b = null;
    
    a(Context param1Context) {
      this.a = param1Context;
    }
    
    private Map<String, String> a(Context param1Context) {
      Bundle bundle = d(param1Context);
      if (bundle == null)
        return Collections.emptyMap(); 
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      for (String str : bundle.keySet()) {
        Object object = bundle.get(str);
        if (object instanceof String && str.startsWith("backend:")) {
          object = ((String)object).split(",", -1);
          int j = object.length;
          for (int i = 0; i < j; i++) {
            String str1 = object[i].trim();
            if (!str1.isEmpty())
              hashMap.put(str1, str.substring(8)); 
          } 
        } 
      } 
      return (Map)hashMap;
    }
    
    private Map<String, String> c() {
      if (this.b == null)
        this.b = a(this.a); 
      return this.b;
    }
    
    private static Bundle d(Context param1Context) {
      try {
        PackageManager packageManager = param1Context.getPackageManager();
        if (packageManager == null)
          return null; 
        ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(param1Context, TransportBackendDiscovery.class), 128);
        return (serviceInfo == null) ? null : serviceInfo.metaData;
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        return null;
      } 
    }
    
    d b(String param1String) {
      param1String = c().get(param1String);
      if (param1String == null)
        return null; 
      try {
        return Class.forName(param1String).<d>asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      } catch (ClassNotFoundException classNotFoundException) {
        String.format("Class %s is not found.", new Object[] { param1String });
        return null;
      } catch (IllegalAccessException illegalAccessException) {
        String.format("Could not instantiate %s.", new Object[] { param1String });
        return null;
      } catch (InstantiationException instantiationException) {
        String.format("Could not instantiate %s.", new Object[] { param1String });
        return null;
      } catch (NoSuchMethodException noSuchMethodException) {
        String.format("Could not instantiate %s", new Object[] { param1String });
        return null;
      } catch (InvocationTargetException invocationTargetException) {
        String.format("Could not instantiate %s", new Object[] { param1String });
        return null;
      } 
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c2\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */