package a2;

final class i extends o {
  private final o.c a;
  
  private final o.b b;
  
  private i(o.c paramc, o.b paramb) {
    this.a = paramc;
    this.b = paramb;
  }
  
  public o.b b() {
    return this.b;
  }
  
  public o.c c() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof o) {
      paramObject = paramObject;
      o.c c1 = this.a;
      if ((c1 == null) ? (paramObject.c() == null) : c1.equals(paramObject.c())) {
        o.b b1 = this.b;
        if (b1 == null) {
          if (paramObject.b() == null)
            return true; 
        } else if (b1.equals(paramObject.b())) {
          return true;
        } 
      } 
      return false;
    } 
    return false;
  }
  
  public int hashCode() {
    int j;
    o.c c1 = this.a;
    int k = 0;
    if (c1 == null) {
      j = 0;
    } else {
      j = c1.hashCode();
    } 
    o.b b1 = this.b;
    if (b1 != null)
      k = b1.hashCode(); 
    return (j ^ 0xF4243) * 1000003 ^ k;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("NetworkConnectionInfo{networkType=");
    stringBuilder.append(this.a);
    stringBuilder.append(", mobileSubtype=");
    stringBuilder.append(this.b);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  static final class b extends o.a {
    private o.c a;
    
    private o.b b;
    
    public o a() {
      return new i(this.a, this.b, null);
    }
    
    public o.a b(o.b param1b) {
      this.b = param1b;
      return this;
    }
    
    public o.a c(o.c param1c) {
      this.a = param1c;
      return this;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\a2\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */