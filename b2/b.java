package b2;

import java.util.Map;

final class b extends i {
  private final String a;
  
  private final Integer b;
  
  private final h c;
  
  private final long d;
  
  private final long e;
  
  private final Map<String, String> f;
  
  private b(String paramString, Integer paramInteger, h paramh, long paramLong1, long paramLong2, Map<String, String> paramMap) {
    this.a = paramString;
    this.b = paramInteger;
    this.c = paramh;
    this.d = paramLong1;
    this.e = paramLong2;
    this.f = paramMap;
  }
  
  protected Map<String, String> c() {
    return this.f;
  }
  
  public Integer d() {
    return this.b;
  }
  
  public h e() {
    return this.c;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof i) {
      paramObject = paramObject;
      if (this.a.equals(paramObject.j())) {
        Integer integer = this.b;
        if (((integer == null) ? (paramObject.d() == null) : integer.equals(paramObject.d())) && this.c.equals(paramObject.e()) && this.d == paramObject.f() && this.e == paramObject.k() && this.f.equals(paramObject.c()))
          return true; 
      } 
      return false;
    } 
    return false;
  }
  
  public long f() {
    return this.d;
  }
  
  public int hashCode() {
    int j;
    int k = this.a.hashCode();
    Integer integer = this.b;
    if (integer == null) {
      j = 0;
    } else {
      j = integer.hashCode();
    } 
    int m = this.c.hashCode();
    long l = this.d;
    int n = (int)(l ^ l >>> 32L);
    l = this.e;
    return (((((k ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ (int)(l ^ l >>> 32L)) * 1000003 ^ this.f.hashCode();
  }
  
  public String j() {
    return this.a;
  }
  
  public long k() {
    return this.e;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("EventInternal{transportName=");
    stringBuilder.append(this.a);
    stringBuilder.append(", code=");
    stringBuilder.append(this.b);
    stringBuilder.append(", encodedPayload=");
    stringBuilder.append(this.c);
    stringBuilder.append(", eventMillis=");
    stringBuilder.append(this.d);
    stringBuilder.append(", uptimeMillis=");
    stringBuilder.append(this.e);
    stringBuilder.append(", autoMetadata=");
    stringBuilder.append(this.f);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends i.a {
    private String a;
    
    private Integer b;
    
    private h c;
    
    private Long d;
    
    private Long e;
    
    private Map<String, String> f;
    
    public i d() {
      String str2 = this.a;
      String str1 = "";
      if (str2 == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" transportName");
        str1 = stringBuilder1.toString();
      } 
      str2 = str1;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" encodedPayload");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.d == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" eventMillis");
        str1 = stringBuilder1.toString();
      } 
      str2 = str1;
      if (this.e == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" uptimeMillis");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.f == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" autoMetadata");
        str1 = stringBuilder1.toString();
      } 
      if (str1.isEmpty())
        return new b(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str1);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    protected Map<String, String> e() {
      Map<String, String> map = this.f;
      if (map != null)
        return map; 
      throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }
    
    protected i.a f(Map<String, String> param1Map) {
      if (param1Map != null) {
        this.f = param1Map;
        return this;
      } 
      throw new NullPointerException("Null autoMetadata");
    }
    
    public i.a g(Integer param1Integer) {
      this.b = param1Integer;
      return this;
    }
    
    public i.a h(h param1h) {
      if (param1h != null) {
        this.c = param1h;
        return this;
      } 
      throw new NullPointerException("Null encodedPayload");
    }
    
    public i.a i(long param1Long) {
      this.d = Long.valueOf(param1Long);
      return this;
    }
    
    public i.a j(String param1String) {
      if (param1String != null) {
        this.a = param1String;
        return this;
      } 
      throw new NullPointerException("Null transportName");
    }
    
    public i.a k(long param1Long) {
      this.e = Long.valueOf(param1Long);
      return this;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b2\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */