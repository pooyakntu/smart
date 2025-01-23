package c8;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

@Deprecated
public class a extends GregorianCalendar {
  private static int[] k = new int[] { 
      31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 
      30, 31 };
  
  private static int[] l = new int[] { 
      31, 31, 31, 31, 31, 31, 30, 30, 30, 30, 
      30, 29 };
  
  private int g;
  
  private int h;
  
  private int i;
  
  private String j = "/";
  
  public a() {
    super(TimeZone.getDefault(), Locale.getDefault());
  }
  
  private String c(int paramInt) {
    if (paramInt < 9) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("0");
      stringBuilder.append(paramInt);
      return stringBuilder.toString();
    } 
    return String.valueOf(paramInt);
  }
  
  private static a j(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual e : ()I
    //   4: bipush #11
    //   6: if_icmpgt -> 312
    //   9: aload_0
    //   10: invokevirtual e : ()I
    //   13: bipush #-11
    //   15: if_icmplt -> 312
    //   18: aload_0
    //   19: aload_0
    //   20: invokevirtual f : ()I
    //   23: sipush #1600
    //   26: isub
    //   27: invokevirtual h : (I)V
    //   30: aload_0
    //   31: aload_0
    //   32: invokevirtual d : ()I
    //   35: iconst_1
    //   36: isub
    //   37: invokevirtual g : (I)V
    //   40: aload_0
    //   41: invokevirtual f : ()I
    //   44: sipush #365
    //   47: imul
    //   48: aload_0
    //   49: invokevirtual f : ()I
    //   52: iconst_3
    //   53: iadd
    //   54: iconst_4
    //   55: idiv
    //   56: i2d
    //   57: invokestatic floor : (D)D
    //   60: d2i
    //   61: iadd
    //   62: aload_0
    //   63: invokevirtual f : ()I
    //   66: bipush #99
    //   68: iadd
    //   69: bipush #100
    //   71: idiv
    //   72: i2d
    //   73: invokestatic floor : (D)D
    //   76: d2i
    //   77: isub
    //   78: aload_0
    //   79: invokevirtual f : ()I
    //   82: sipush #399
    //   85: iadd
    //   86: sipush #400
    //   89: idiv
    //   90: i2d
    //   91: invokestatic floor : (D)D
    //   94: d2i
    //   95: iadd
    //   96: istore_1
    //   97: iconst_0
    //   98: istore #4
    //   100: iconst_0
    //   101: istore_2
    //   102: iload_2
    //   103: aload_0
    //   104: invokevirtual e : ()I
    //   107: if_icmpge -> 125
    //   110: iload_1
    //   111: getstatic c8/a.k : [I
    //   114: iload_2
    //   115: iaload
    //   116: iadd
    //   117: istore_1
    //   118: iload_2
    //   119: iconst_1
    //   120: iadd
    //   121: istore_2
    //   122: goto -> 102
    //   125: iload_1
    //   126: istore_2
    //   127: aload_0
    //   128: invokevirtual e : ()I
    //   131: iconst_1
    //   132: if_icmple -> 171
    //   135: aload_0
    //   136: invokevirtual f : ()I
    //   139: iconst_4
    //   140: irem
    //   141: ifne -> 154
    //   144: aload_0
    //   145: invokevirtual f : ()I
    //   148: bipush #100
    //   150: irem
    //   151: ifne -> 167
    //   154: iload_1
    //   155: istore_2
    //   156: aload_0
    //   157: invokevirtual f : ()I
    //   160: sipush #400
    //   163: irem
    //   164: ifne -> 171
    //   167: iload_1
    //   168: iconst_1
    //   169: iadd
    //   170: istore_2
    //   171: iload_2
    //   172: aload_0
    //   173: invokevirtual d : ()I
    //   176: iadd
    //   177: bipush #79
    //   179: isub
    //   180: istore_2
    //   181: iload_2
    //   182: sipush #12053
    //   185: idiv
    //   186: i2d
    //   187: invokestatic floor : (D)D
    //   190: d2i
    //   191: istore_1
    //   192: iload_2
    //   193: sipush #12053
    //   196: irem
    //   197: istore_2
    //   198: iload_1
    //   199: bipush #33
    //   201: imul
    //   202: sipush #979
    //   205: iadd
    //   206: iload_2
    //   207: sipush #1461
    //   210: idiv
    //   211: iconst_4
    //   212: imul
    //   213: iadd
    //   214: istore #5
    //   216: iload_2
    //   217: sipush #1461
    //   220: irem
    //   221: istore #6
    //   223: iload #6
    //   225: istore_1
    //   226: iload #4
    //   228: istore_3
    //   229: iload #5
    //   231: istore_2
    //   232: iload #6
    //   234: sipush #366
    //   237: if_icmplt -> 268
    //   240: iload #6
    //   242: iconst_1
    //   243: isub
    //   244: istore_1
    //   245: iload #5
    //   247: iload_1
    //   248: sipush #365
    //   251: idiv
    //   252: i2d
    //   253: invokestatic floor : (D)D
    //   256: d2i
    //   257: iadd
    //   258: istore_2
    //   259: iload_1
    //   260: sipush #365
    //   263: irem
    //   264: istore_1
    //   265: iload #4
    //   267: istore_3
    //   268: iload_3
    //   269: bipush #11
    //   271: if_icmpge -> 299
    //   274: getstatic c8/a.l : [I
    //   277: iload_3
    //   278: iaload
    //   279: istore #4
    //   281: iload_1
    //   282: iload #4
    //   284: if_icmplt -> 299
    //   287: iload_1
    //   288: iload #4
    //   290: isub
    //   291: istore_1
    //   292: iload_3
    //   293: iconst_1
    //   294: iadd
    //   295: istore_3
    //   296: goto -> 268
    //   299: new c8/a$a
    //   302: dup
    //   303: iload_2
    //   304: iload_3
    //   305: iload_1
    //   306: iconst_1
    //   307: iadd
    //   308: invokespecial <init> : (III)V
    //   311: areturn
    //   312: new java/lang/IllegalArgumentException
    //   315: dup
    //   316: invokespecial <init> : ()V
    //   319: athrow
  }
  
  private static a l(a parama) {
    int i;
    if (parama.e() <= 11 && parama.e() >= -11) {
      parama.h(parama.f() - 979);
      parama.g(parama.d() - 1);
      j = parama.f() * 365 + parama.f() / 33 * 8 + (int)Math.floor(((parama.f() % 33 + 3) / 4));
      for (i = 0; i < parama.e(); i++)
        j += l[i]; 
      j = j + parama.d() + 79;
      i = (int)Math.floor((j / 146097)) * 400 + 1600;
      int i2 = j % 146097;
      j = i2;
      k = i;
      if (i2 >= 36525) {
        j = i2 - 1;
        k = i + (int)Math.floor((j / 36524)) * 100;
        j %= 36524;
        if (j >= 365) {
          j++;
        } else {
          i = 0;
          int i3 = k + (int)Math.floor((j / 1461)) * 4;
          int i4 = j % 1461;
          j = i4;
          k = i3;
          i2 = i;
        } 
      } 
      i = 1;
    } else {
      throw new IllegalArgumentException();
    } 
    int n = k + (int)Math.floor((j / 1461)) * 4;
    int i1 = j % 1461;
    int j = i1;
    int k = n;
    int m = i;
  }
  
  protected void a() {
    a a1 = j(new a(get(1), get(2), get(5)));
    this.g = a.a(a1);
    this.h = a.b(a1);
    this.i = a.c(a1);
  }
  
  public int d() {
    return this.i;
  }
  
  public int e() {
    return this.h + 1;
  }
  
  public boolean equals(Object paramObject) {
    return super.equals(paramObject);
  }
  
  public String g() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("");
    stringBuilder.append(c(this.g));
    stringBuilder.append(this.j);
    stringBuilder.append(c(e()));
    stringBuilder.append(this.j);
    stringBuilder.append(c(this.i));
    return stringBuilder.toString();
  }
  
  public int h() {
    return this.g;
  }
  
  public int hashCode() {
    return super.hashCode();
  }
  
  public void m(int paramInt1, int paramInt2, int paramInt3) {
    this.g = paramInt1;
    this.h = paramInt2;
    this.i = paramInt3;
    a a1 = l(new a(paramInt1, paramInt2 - 1, paramInt3));
    set(a.a(a1), a.b(a1), a.c(a1));
  }
  
  public void set(int paramInt1, int paramInt2) {
    super.set(paramInt1, paramInt2);
    a();
  }
  
  public void setTimeInMillis(long paramLong) {
    super.setTimeInMillis(paramLong);
    a();
  }
  
  public void setTimeZone(TimeZone paramTimeZone) {
    super.setTimeZone(paramTimeZone);
    a();
  }
  
  public String toString() {
    String str = super.toString();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str.substring(0, str.length() - 1));
    stringBuilder.append(",PersianDate=");
    stringBuilder.append(g());
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  static class a {
    private int a;
    
    private int b;
    
    private int c;
    
    a(int param1Int1, int param1Int2, int param1Int3) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Int3;
    }
    
    public int d() {
      return this.c;
    }
    
    public int e() {
      return this.b;
    }
    
    public int f() {
      return this.a;
    }
    
    public void g(int param1Int) {
      this.c = param1Int;
    }
    
    public void h(int param1Int) {
      this.a = param1Int;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(f());
      stringBuilder.append("/");
      stringBuilder.append(e());
      stringBuilder.append("/");
      stringBuilder.append(d());
      return stringBuilder.toString();
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c8\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */