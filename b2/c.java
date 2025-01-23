package b2;

import z1.e;

final class c extends n {
  private final o a;
  
  private final String b;
  
  private final z1.c<?> c;
  
  private final e<?, byte[]> d;
  
  private final z1.b e;
  
  private c(o paramo, String paramString, z1.c<?> paramc, e<?, byte[]> parame, z1.b paramb) {
    this.a = paramo;
    this.b = paramString;
    this.c = paramc;
    this.d = parame;
    this.e = paramb;
  }
  
  public z1.b b() {
    return this.e;
  }
  
  z1.c<?> c() {
    return this.c;
  }
  
  e<?, byte[]> e() {
    return this.d;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof n) {
      paramObject = paramObject;
      return (this.a.equals(paramObject.f()) && this.b.equals(paramObject.g()) && this.c.equals(paramObject.c()) && this.d.equals(paramObject.e()) && this.e.equals(paramObject.b()));
    } 
    return false;
  }
  
  public o f() {
    return this.a;
  }
  
  public String g() {
    return this.b;
  }
  
  public int hashCode() {
    return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("SendRequest{transportContext=");
    stringBuilder.append(this.a);
    stringBuilder.append(", transportName=");
    stringBuilder.append(this.b);
    stringBuilder.append(", event=");
    stringBuilder.append(this.c);
    stringBuilder.append(", transformer=");
    stringBuilder.append(this.d);
    stringBuilder.append(", encoding=");
    stringBuilder.append(this.e);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends n.a {
    private o a;
    
    private String b;
    
    private z1.c<?> c;
    
    private e<?, byte[]> d;
    
    private z1.b e;
    
    public n a() {
      o o1 = this.a;
      String str1 = "";
      if (o1 == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" transportContext");
        str1 = stringBuilder1.toString();
      } 
      String str2 = str1;
      if (this.b == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" transportName");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" event");
        str1 = stringBuilder1.toString();
      } 
      str2 = str1;
      if (this.d == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" transformer");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.e == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" encoding");
        str1 = stringBuilder1.toString();
      } 
      if (str1.isEmpty())
        return new c(this.a, this.b, this.c, this.d, this.e, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str1);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    n.a b(z1.b param1b) {
      if (param1b != null) {
        this.e = param1b;
        return this;
      } 
      throw new NullPointerException("Null encoding");
    }
    
    n.a c(z1.c<?> param1c) {
      if (param1c != null) {
        this.c = param1c;
        return this;
      } 
      throw new NullPointerException("Null event");
    }
    
    n.a d(e<?, byte[]> param1e) {
      if (param1e != null) {
        this.d = param1e;
        return this;
      } 
      throw new NullPointerException("Null transformer");
    }
    
    public n.a e(o param1o) {
      if (param1o != null) {
        this.a = param1o;
        return this;
      } 
      throw new NullPointerException("Null transportContext");
    }
    
    public n.a f(String param1String) {
      if (param1String != null) {
        this.b = param1String;
        return this;
      } 
      throw new NullPointerException("Null transportName");
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b2\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */