package a2;

import java.util.List;

final class g extends m {
  private final long a;
  
  private final long b;
  
  private final k c;
  
  private final Integer d;
  
  private final String e;
  
  private final List<l> f;
  
  private final p g;
  
  private g(long paramLong1, long paramLong2, k paramk, Integer paramInteger, String paramString, List<l> paramList, p paramp) {
    this.a = paramLong1;
    this.b = paramLong2;
    this.c = paramk;
    this.d = paramInteger;
    this.e = paramString;
    this.f = paramList;
    this.g = paramp;
  }
  
  public k b() {
    return this.c;
  }
  
  public List<l> c() {
    return this.f;
  }
  
  public Integer d() {
    return this.d;
  }
  
  public String e() {
    return this.e;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof m) {
      paramObject = paramObject;
      if (this.a == paramObject.g() && this.b == paramObject.h()) {
        k k1 = this.c;
        if ((k1 == null) ? (paramObject.b() == null) : k1.equals(paramObject.b())) {
          Integer integer = this.d;
          if ((integer == null) ? (paramObject.d() == null) : integer.equals(paramObject.d())) {
            String str = this.e;
            if ((str == null) ? (paramObject.e() == null) : str.equals(paramObject.e())) {
              List<l> list = this.f;
              if ((list == null) ? (paramObject.c() == null) : list.equals(paramObject.c())) {
                p p1 = this.g;
                if (p1 == null) {
                  if (paramObject.f() == null)
                    return true; 
                } else if (p1.equals(paramObject.f())) {
                  return true;
                } 
              } 
            } 
          } 
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public p f() {
    return this.g;
  }
  
  public long g() {
    return this.a;
  }
  
  public long h() {
    return this.b;
  }
  
  public int hashCode() {
    int i;
    int j;
    int n;
    int i1;
    long l = this.a;
    int i3 = (int)(l ^ l >>> 32L);
    l = this.b;
    int i4 = (int)(l >>> 32L ^ l);
    k k1 = this.c;
    int i2 = 0;
    if (k1 == null) {
      i = 0;
    } else {
      i = k1.hashCode();
    } 
    Integer integer = this.d;
    if (integer == null) {
      j = 0;
    } else {
      j = integer.hashCode();
    } 
    String str = this.e;
    if (str == null) {
      n = 0;
    } else {
      n = str.hashCode();
    } 
    List<l> list = this.f;
    if (list == null) {
      i1 = 0;
    } else {
      i1 = list.hashCode();
    } 
    p p1 = this.g;
    if (p1 != null)
      i2 = p1.hashCode(); 
    return ((((((i3 ^ 0xF4243) * 1000003 ^ i4) * 1000003 ^ i) * 1000003 ^ j) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("LogRequest{requestTimeMs=");
    stringBuilder.append(this.a);
    stringBuilder.append(", requestUptimeMs=");
    stringBuilder.append(this.b);
    stringBuilder.append(", clientInfo=");
    stringBuilder.append(this.c);
    stringBuilder.append(", logSource=");
    stringBuilder.append(this.d);
    stringBuilder.append(", logSourceName=");
    stringBuilder.append(this.e);
    stringBuilder.append(", logEvents=");
    stringBuilder.append(this.f);
    stringBuilder.append(", qosTier=");
    stringBuilder.append(this.g);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends m.a {
    private Long a;
    
    private Long b;
    
    private k c;
    
    private Integer d;
    
    private String e;
    
    private List<l> f;
    
    private p g;
    
    public m a() {
      Long long_ = this.a;
      String str1 = "";
      if (long_ == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" requestTimeMs");
        str1 = stringBuilder1.toString();
      } 
      String str2 = str1;
      if (this.b == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" requestUptimeMs");
        str2 = stringBuilder1.toString();
      } 
      if (str2.isEmpty())
        return new g(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str2);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public m.a b(k param1k) {
      this.c = param1k;
      return this;
    }
    
    public m.a c(List<l> param1List) {
      this.f = param1List;
      return this;
    }
    
    m.a d(Integer param1Integer) {
      this.d = param1Integer;
      return this;
    }
    
    m.a e(String param1String) {
      this.e = param1String;
      return this;
    }
    
    public m.a f(p param1p) {
      this.g = param1p;
      return this;
    }
    
    public m.a g(long param1Long) {
      this.a = Long.valueOf(param1Long);
      return this;
    }
    
    public m.a h(long param1Long) {
      this.b = Long.valueOf(param1Long);
      return this;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a2\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */