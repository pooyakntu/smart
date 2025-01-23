package j1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class j implements h {
  private final Map<String, List<i>> c;
  
  private volatile Map<String, String> d;
  
  j(Map<String, List<i>> paramMap) {
    this.c = Collections.unmodifiableMap(paramMap);
  }
  
  private String b(List<i> paramList) {
    StringBuilder stringBuilder = new StringBuilder();
    int k = paramList.size();
    for (int i = 0; i < k; i++) {
      String str = ((i)paramList.get(i)).a();
      if (!TextUtils.isEmpty(str)) {
        stringBuilder.append(str);
        if (i != paramList.size() - 1)
          stringBuilder.append(','); 
      } 
    } 
    return stringBuilder.toString();
  }
  
  private Map<String, String> c() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    for (Map.Entry<String, List<i>> entry : this.c.entrySet()) {
      String str = b((List<i>)entry.getValue());
      if (!TextUtils.isEmpty(str))
        hashMap.put(entry.getKey(), str); 
    } 
    return (Map)hashMap;
  }
  
  public Map<String, String> a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Ljava/util/Map;
    //   4: ifnonnull -> 37
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield d : Ljava/util/Map;
    //   13: ifnonnull -> 27
    //   16: aload_0
    //   17: aload_0
    //   18: invokespecial c : ()Ljava/util/Map;
    //   21: invokestatic unmodifiableMap : (Ljava/util/Map;)Ljava/util/Map;
    //   24: putfield d : Ljava/util/Map;
    //   27: aload_0
    //   28: monitorexit
    //   29: goto -> 37
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    //   37: aload_0
    //   38: getfield d : Ljava/util/Map;
    //   41: areturn
    // Exception table:
    //   from	to	target	type
    //   9	27	32	finally
    //   27	29	32	finally
    //   33	35	32	finally
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof j) {
      paramObject = paramObject;
      return this.c.equals(((j)paramObject).c);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.c.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("LazyHeaders{headers=");
    stringBuilder.append(this.c);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public static final class a {
    private static final String d;
    
    private static final Map<String, List<i>> e;
    
    private boolean a = true;
    
    private Map<String, List<i>> b = e;
    
    private boolean c = true;
    
    static {
      String str = b();
      d = str;
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>(2);
      if (!TextUtils.isEmpty(str))
        hashMap.put("User-Agent", Collections.singletonList(new j.b(str))); 
      e = Collections.unmodifiableMap(hashMap);
    }
    
    static String b() {
      String str = System.getProperty("http.agent");
      if (TextUtils.isEmpty(str))
        return str; 
      int j = str.length();
      StringBuilder stringBuilder = new StringBuilder(str.length());
      for (int i = 0; i < j; i++) {
        char c = str.charAt(i);
        if ((c > '\037' || c == '\t') && c < '') {
          stringBuilder.append(c);
        } else {
          stringBuilder.append('?');
        } 
      } 
      return stringBuilder.toString();
    }
    
    public j a() {
      this.a = true;
      return new j(this.b);
    }
  }
  
  static final class b implements i {
    private final String a;
    
    b(String param1String) {
      this.a = param1String;
    }
    
    public String a() {
      return this.a;
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object instanceof b) {
        param1Object = param1Object;
        return this.a.equals(((b)param1Object).a);
      } 
      return false;
    }
    
    public int hashCode() {
      return this.a.hashCode();
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("StringHeaderFactory{value='");
      stringBuilder.append(this.a);
      stringBuilder.append('\'');
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */