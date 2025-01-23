package e4;

final class a extends d {
  private final String b;
  
  private final c.a c;
  
  private final String d;
  
  private final String e;
  
  private final long f;
  
  private final long g;
  
  private final String h;
  
  private a(String paramString1, c.a parama, String paramString2, String paramString3, long paramLong1, long paramLong2, String paramString4) {
    this.b = paramString1;
    this.c = parama;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramLong1;
    this.g = paramLong2;
    this.h = paramString4;
  }
  
  public String b() {
    return this.d;
  }
  
  public long c() {
    return this.f;
  }
  
  public String d() {
    return this.b;
  }
  
  public String e() {
    return this.h;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof d) {
      paramObject = paramObject;
      String str = this.b;
      if (((str == null) ? (paramObject.d() == null) : str.equals(paramObject.d())) && this.c.equals(paramObject.g())) {
        str = this.d;
        if ((str == null) ? (paramObject.b() == null) : str.equals(paramObject.b())) {
          str = this.e;
          if (((str == null) ? (paramObject.f() == null) : str.equals(paramObject.f())) && this.f == paramObject.c() && this.g == paramObject.h()) {
            str = this.h;
            if (str == null) {
              if (paramObject.e() == null)
                return true; 
            } else if (str.equals(paramObject.e())) {
              return true;
            } 
          } 
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public String f() {
    return this.e;
  }
  
  public c.a g() {
    return this.c;
  }
  
  public long h() {
    return this.g;
  }
  
  public int hashCode() {
    int i;
    int j;
    int k;
    String str = this.b;
    int m = 0;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    } 
    int n = this.c.hashCode();
    str = this.d;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    } 
    str = this.e;
    if (str == null) {
      k = 0;
    } else {
      k = str.hashCode();
    } 
    long l = this.f;
    int i1 = (int)(l ^ l >>> 32L);
    l = this.g;
    int i2 = (int)(l ^ l >>> 32L);
    str = this.h;
    if (str != null)
      m = str.hashCode(); 
    return ((((((i ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ m;
  }
  
  public d.a n() {
    return new b(this, null);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("PersistedInstallationEntry{firebaseInstallationId=");
    stringBuilder.append(this.b);
    stringBuilder.append(", registrationStatus=");
    stringBuilder.append(this.c);
    stringBuilder.append(", authToken=");
    stringBuilder.append(this.d);
    stringBuilder.append(", refreshToken=");
    stringBuilder.append(this.e);
    stringBuilder.append(", expiresInSecs=");
    stringBuilder.append(this.f);
    stringBuilder.append(", tokenCreationEpochInSecs=");
    stringBuilder.append(this.g);
    stringBuilder.append(", fisError=");
    stringBuilder.append(this.h);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends d.a {
    private String a;
    
    private c.a b;
    
    private String c;
    
    private String d;
    
    private Long e;
    
    private Long f;
    
    private String g;
    
    b() {}
    
    private b(d param1d) {
      this.a = param1d.d();
      this.b = param1d.g();
      this.c = param1d.b();
      this.d = param1d.f();
      this.e = Long.valueOf(param1d.c());
      this.f = Long.valueOf(param1d.h());
      this.g = param1d.e();
    }
    
    public d a() {
      c.a a1 = this.b;
      String str1 = "";
      if (a1 == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" registrationStatus");
        str1 = stringBuilder1.toString();
      } 
      String str2 = str1;
      if (this.e == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" expiresInSecs");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.f == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" tokenCreationEpochInSecs");
        str1 = stringBuilder1.toString();
      } 
      if (str1.isEmpty())
        return new a(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str1);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public d.a b(String param1String) {
      this.c = param1String;
      return this;
    }
    
    public d.a c(long param1Long) {
      this.e = Long.valueOf(param1Long);
      return this;
    }
    
    public d.a d(String param1String) {
      this.a = param1String;
      return this;
    }
    
    public d.a e(String param1String) {
      this.g = param1String;
      return this;
    }
    
    public d.a f(String param1String) {
      this.d = param1String;
      return this;
    }
    
    public d.a g(c.a param1a) {
      if (param1a != null) {
        this.b = param1a;
        return this;
      } 
      throw new NullPointerException("Null registrationStatus");
    }
    
    public d.a h(long param1Long) {
      this.f = Long.valueOf(param1Long);
      return this;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e4\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */