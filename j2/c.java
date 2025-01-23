package j2;

import java.util.Set;

final class c extends f.b {
  private final long a;
  
  private final long b;
  
  private final Set<f.c> c;
  
  private c(long paramLong1, long paramLong2, Set<f.c> paramSet) {
    this.a = paramLong1;
    this.b = paramLong2;
    this.c = paramSet;
  }
  
  long b() {
    return this.a;
  }
  
  Set<f.c> c() {
    return this.c;
  }
  
  long d() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof f.b) {
      paramObject = paramObject;
      return (this.a == paramObject.b() && this.b == paramObject.d() && this.c.equals(paramObject.c()));
    } 
    return false;
  }
  
  public int hashCode() {
    long l = this.a;
    int i = (int)(l ^ l >>> 32L);
    l = this.b;
    int j = (int)(l >>> 32L ^ l);
    return this.c.hashCode() ^ ((i ^ 0xF4243) * 1000003 ^ j) * 1000003;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ConfigValue{delta=");
    stringBuilder.append(this.a);
    stringBuilder.append(", maxAllowedDelay=");
    stringBuilder.append(this.b);
    stringBuilder.append(", flags=");
    stringBuilder.append(this.c);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends f.b.a {
    private Long a;
    
    private Long b;
    
    private Set<f.c> c;
    
    public f.b a() {
      Long long_ = this.a;
      String str1 = "";
      if (long_ == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        stringBuilder1.append(" delta");
        str1 = stringBuilder1.toString();
      } 
      String str2 = str1;
      if (this.b == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(" maxAllowedDelay");
        str2 = stringBuilder1.toString();
      } 
      str1 = str2;
      if (this.c == null) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str2);
        stringBuilder1.append(" flags");
        str1 = stringBuilder1.toString();
      } 
      if (str1.isEmpty())
        return new c(this.a.longValue(), this.b.longValue(), this.c, null); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing required properties:");
      stringBuilder.append(str1);
      throw new IllegalStateException(stringBuilder.toString());
    }
    
    public f.b.a b(long param1Long) {
      this.a = Long.valueOf(param1Long);
      return this;
    }
    
    public f.b.a c(Set<f.c> param1Set) {
      if (param1Set != null) {
        this.c = param1Set;
        return this;
      } 
      throw new NullPointerException("Null flags");
    }
    
    public f.b.a d(long param1Long) {
      this.b = Long.valueOf(param1Long);
      return this;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j2\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */