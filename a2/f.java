package a2;

import java.util.Arrays;

final class f extends l {
  private final long a;
  
  private final Integer b;
  
  private final long c;
  
  private final byte[] d;
  
  private final String e;
  
  private final long f;
  
  private final o g;
  
  private f(long paramLong1, Integer paramInteger, long paramLong2, byte[] paramArrayOfbyte, String paramString, long paramLong3, o paramo) {
    this.a = paramLong1;
    this.b = paramInteger;
    this.c = paramLong2;
    this.d = paramArrayOfbyte;
    this.e = paramString;
    this.f = paramLong3;
    this.g = paramo;
  }
  
  public Integer b() {
    return this.b;
  }
  
  public long c() {
    return this.a;
  }
  
  public long d() {
    return this.c;
  }
  
  public o e() {
    return this.g;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof l) {
      l l1 = (l)paramObject;
      if (this.a == l1.c()) {
        paramObject = this.b;
        if (((paramObject == null) ? (l1.b() == null) : paramObject.equals(l1.b())) && this.c == l1.d()) {
          byte[] arrayOfByte = this.d;
          if (l1 instanceof f) {
            paramObject = ((f)l1).d;
          } else {
            paramObject = l1.f();
          } 
          if (Arrays.equals(arrayOfByte, (byte[])paramObject)) {
            paramObject = this.e;
            if (((paramObject == null) ? (l1.g() == null) : paramObject.equals(l1.g())) && this.f == l1.h()) {
              paramObject = this.g;
              if (paramObject == null) {
                if (l1.e() == null)
                  return true; 
              } else if (paramObject.equals(l1.e())) {
                return true;
              } 
            } 
          } 
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public byte[] f() {
    return this.d;
  }
  
  public String g() {
    return this.e;
  }
  
  public long h() {
    return this.f;
  }
  
  public int hashCode() {
    int i;
    int j;
    long l1 = this.a;
    int m = (int)(l1 ^ l1 >>> 32L);
    Integer integer = this.b;
    int k = 0;
    if (integer == null) {
      i = 0;
    } else {
      i = integer.hashCode();
    } 
    l1 = this.c;
    int n = (int)(l1 ^ l1 >>> 32L);
    int i1 = Arrays.hashCode(this.d);
    String str = this.e;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    } 
    l1 = this.f;
    int i2 = (int)(l1 >>> 32L ^ l1);
    o o1 = this.g;
    if (o1 != null)
      k = o1.hashCode(); 
    return ((((((m ^ 0xF4243) * 1000003 ^ i) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ j) * 1000003 ^ i2) * 1000003 ^ k;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("LogEvent{eventTimeMs=");
    stringBuilder.append(this.a);
    stringBuilder.append(", eventCode=");
    stringBuilder.append(this.b);
    stringBuilder.append(", eventUptimeMs=");
    stringBuilder.append(this.c);
    stringBuilder.append(", sourceExtension=");
    stringBuilder.append(Arrays.toString(this.d));
    stringBuilder.append(", sourceExtensionJsonProto3=");
    stringBuilder.append(this.e);
    stringBuilder.append(", timezoneOffsetSeconds=");
    stringBuilder.append(this.f);
    stringBuilder.append(", networkConnectionInfo=");
    stringBuilder.append(this.g);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends l.a {
    private Long a;
    
    private Integer b;
    
    private Long c;
    
    private byte[] d;
    
    private String e;
    
    private Long f;
    
    private o g;
    
    public l a() {
      Long long_ = this.a;
      String str1 = "";
      if (long_ == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" eventTimeMs");
        str1 = stringBuilder1.toString();
      } 
      String str2 = str1;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" eventUptimeMs");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.f == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" timezoneOffsetSeconds");
        str1 = stringBuilder1.toString();
      } 
      if (str1.isEmpty())
        return new f(this.a.longValue(), this.b, this.c.longValue(), this.d, this.e, this.f.longValue(), this.g, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str1);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public l.a b(Integer param1Integer) {
      this.b = param1Integer;
      return this;
    }
    
    public l.a c(long param1Long) {
      this.a = Long.valueOf(param1Long);
      return this;
    }
    
    public l.a d(long param1Long) {
      this.c = Long.valueOf(param1Long);
      return this;
    }
    
    public l.a e(o param1o) {
      this.g = param1o;
      return this;
    }
    
    l.a f(byte[] param1ArrayOfbyte) {
      this.d = param1ArrayOfbyte;
      return this;
    }
    
    l.a g(String param1String) {
      this.e = param1String;
      return this;
    }
    
    public l.a h(long param1Long) {
      this.f = Long.valueOf(param1Long);
      return this;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a2\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */