package a2;

final class e extends k {
  private final k.b a;
  
  private final a b;
  
  private e(k.b paramb, a parama) {
    this.a = paramb;
    this.b = parama;
  }
  
  public a b() {
    return this.b;
  }
  
  public k.b c() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof k) {
      paramObject = paramObject;
      k.b b1 = this.a;
      if ((b1 == null) ? (paramObject.c() == null) : b1.equals(paramObject.c())) {
        a a1 = this.b;
        if (a1 == null) {
          if (paramObject.b() == null)
            return true; 
        } else if (a1.equals(paramObject.b())) {
          return true;
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public int hashCode() {
    int i;
    k.b b1 = this.a;
    int j = 0;
    if (b1 == null) {
      i = 0;
    } else {
      i = b1.hashCode();
    } 
    a a1 = this.b;
    if (a1 != null)
      j = a1.hashCode(); 
    return (i ^ 0xF4243) * 1000003 ^ j;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ClientInfo{clientType=");
    stringBuilder.append(this.a);
    stringBuilder.append(", androidClientInfo=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends k.a {
    private k.b a;
    
    private a b;
    
    public k a() {
      return new e(this.a, this.b, null);
    }
    
    public k.a b(a param1a) {
      this.b = param1a;
      return this;
    }
    
    public k.a c(k.b param1b) {
      this.a = param1b;
      return this;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a2\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */