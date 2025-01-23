package e8;

import r8.g;
import r8.m;
import w8.c;

public final class d implements Comparable<d> {
  public static final a k = new a(null);
  
  public static final d l = e.a();
  
  private final int g;
  
  private final int h;
  
  private final int i;
  
  private final int j;
  
  public d(int paramInt1, int paramInt2, int paramInt3) {
    this.g = paramInt1;
    this.h = paramInt2;
    this.i = paramInt3;
    this.j = b(paramInt1, paramInt2, paramInt3);
  }
  
  private final int b(int paramInt1, int paramInt2, int paramInt3) {
    boolean bool2 = false;
    boolean bool1 = bool2;
    bool1 = bool2;
    bool1 = bool2;
    if ((new c(0, 255)).g(paramInt1) && (new c(0, 255)).g(paramInt2) && (new c(0, 255)).g(paramInt3))
      bool1 = true; 
    if (bool1)
      return (paramInt1 << 16) + (paramInt2 << 8) + paramInt3; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Version components are out of range: ");
    stringBuilder.append(paramInt1);
    stringBuilder.append('.');
    stringBuilder.append(paramInt2);
    stringBuilder.append('.');
    stringBuilder.append(paramInt3);
    throw new IllegalArgumentException(stringBuilder.toString().toString());
  }
  
  public int a(d paramd) {
    m.j(paramd, "other");
    return this.j - paramd.j;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof d) {
      paramObject = paramObject;
    } else {
      paramObject = null;
    } 
    return (paramObject == null) ? false : ((this.j == ((d)paramObject).j));
  }
  
  public int hashCode() {
    return this.j;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.g);
    stringBuilder.append('.');
    stringBuilder.append(this.h);
    stringBuilder.append('.');
    stringBuilder.append(this.i);
    return stringBuilder.toString();
  }
  
  public static final class a {
    private a() {}
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e8\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */