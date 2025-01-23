package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m.c;
import m.i;
import q.i;
import q.o;

public class d {
  private HashSet<d> a = null;
  
  private int b;
  
  private boolean c;
  
  public final e d;
  
  public final b e;
  
  public d f;
  
  public int g = 0;
  
  int h = Integer.MIN_VALUE;
  
  i i;
  
  public d(e parame, b paramb) {
    this.d = parame;
    this.e = paramb;
  }
  
  public boolean a(d paramd, int paramInt) {
    return b(paramd, paramInt, -2147483648, false);
  }
  
  public boolean b(d paramd, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramd == null) {
      q();
      return true;
    } 
    if (!paramBoolean && !p(paramd))
      return false; 
    this.f = paramd;
    if (paramd.a == null)
      paramd.a = new HashSet<d>(); 
    HashSet<d> hashSet = this.f.a;
    if (hashSet != null)
      hashSet.add(this); 
    this.g = paramInt1;
    this.h = paramInt2;
    return true;
  }
  
  public void c(int paramInt, ArrayList<o> paramArrayList, o paramo) {
    HashSet<d> hashSet = this.a;
    if (hashSet != null) {
      Iterator<d> iterator = hashSet.iterator();
      while (iterator.hasNext())
        i.a(((d)iterator.next()).d, paramInt, paramArrayList, paramo); 
    } 
  }
  
  public HashSet<d> d() {
    return this.a;
  }
  
  public int e() {
    return !this.c ? 0 : this.b;
  }
  
  public int f() {
    if (this.d.V() == 8)
      return 0; 
    if (this.h != Integer.MIN_VALUE) {
      d d1 = this.f;
      if (d1 != null && d1.d.V() == 8)
        return this.h; 
    } 
    return this.g;
  }
  
  public final d g() {
    switch (a.a[this.e.ordinal()]) {
      default:
        throw new AssertionError(this.e.name());
      case 5:
        return this.d.P;
      case 4:
        return this.d.R;
      case 3:
        return this.d.O;
      case 2:
        return this.d.Q;
      case 1:
      case 6:
      case 7:
      case 8:
      case 9:
        break;
    } 
    return null;
  }
  
  public e h() {
    return this.d;
  }
  
  public i i() {
    return this.i;
  }
  
  public d j() {
    return this.f;
  }
  
  public b k() {
    return this.e;
  }
  
  public boolean l() {
    HashSet<d> hashSet = this.a;
    if (hashSet == null)
      return false; 
    Iterator<d> iterator = hashSet.iterator();
    while (iterator.hasNext()) {
      if (((d)iterator.next()).g().o())
        return true; 
    } 
    return false;
  }
  
  public boolean m() {
    HashSet<d> hashSet = this.a;
    boolean bool = false;
    if (hashSet == null)
      return false; 
    if (hashSet.size() > 0)
      bool = true; 
    return bool;
  }
  
  public boolean n() {
    return this.c;
  }
  
  public boolean o() {
    return (this.f != null);
  }
  
  public boolean p(d paramd) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #5
    //   3: iconst_0
    //   4: istore_3
    //   5: iconst_0
    //   6: istore #4
    //   8: aload_1
    //   9: ifnonnull -> 14
    //   12: iconst_0
    //   13: ireturn
    //   14: aload_1
    //   15: invokevirtual k : ()Lp/d$b;
    //   18: astore #6
    //   20: aload_0
    //   21: getfield e : Lp/d$b;
    //   24: astore #7
    //   26: aload #6
    //   28: aload #7
    //   30: if_acmpne -> 65
    //   33: aload #7
    //   35: getstatic p/d$b.BASELINE : Lp/d$b;
    //   38: if_acmpne -> 63
    //   41: aload_1
    //   42: invokevirtual h : ()Lp/e;
    //   45: invokevirtual Z : ()Z
    //   48: ifeq -> 61
    //   51: aload_0
    //   52: invokevirtual h : ()Lp/e;
    //   55: invokevirtual Z : ()Z
    //   58: ifne -> 63
    //   61: iconst_0
    //   62: ireturn
    //   63: iconst_1
    //   64: ireturn
    //   65: getstatic p/d$a.a : [I
    //   68: aload #7
    //   70: invokevirtual ordinal : ()I
    //   73: iaload
    //   74: tableswitch default -> 124, 1 -> 281, 2 -> 222, 3 -> 222, 4 -> 163, 5 -> 163, 6 -> 141, 7 -> 139, 8 -> 139, 9 -> 139
    //   124: new java/lang/AssertionError
    //   127: dup
    //   128: aload_0
    //   129: getfield e : Lp/d$b;
    //   132: invokevirtual name : ()Ljava/lang/String;
    //   135: invokespecial <init> : (Ljava/lang/Object;)V
    //   138: athrow
    //   139: iconst_0
    //   140: ireturn
    //   141: aload #6
    //   143: getstatic p/d$b.LEFT : Lp/d$b;
    //   146: if_acmpeq -> 161
    //   149: aload #6
    //   151: getstatic p/d$b.RIGHT : Lp/d$b;
    //   154: if_acmpne -> 159
    //   157: iconst_0
    //   158: ireturn
    //   159: iconst_1
    //   160: ireturn
    //   161: iconst_0
    //   162: ireturn
    //   163: aload #6
    //   165: getstatic p/d$b.TOP : Lp/d$b;
    //   168: if_acmpeq -> 187
    //   171: aload #6
    //   173: getstatic p/d$b.BOTTOM : Lp/d$b;
    //   176: if_acmpne -> 182
    //   179: goto -> 187
    //   182: iconst_0
    //   183: istore_2
    //   184: goto -> 189
    //   187: iconst_1
    //   188: istore_2
    //   189: iload_2
    //   190: istore_3
    //   191: aload_1
    //   192: invokevirtual h : ()Lp/e;
    //   195: instanceof p/h
    //   198: ifeq -> 220
    //   201: iload_2
    //   202: ifne -> 216
    //   205: iload #4
    //   207: istore_2
    //   208: aload #6
    //   210: getstatic p/d$b.CENTER_Y : Lp/d$b;
    //   213: if_acmpne -> 218
    //   216: iconst_1
    //   217: istore_2
    //   218: iload_2
    //   219: istore_3
    //   220: iload_3
    //   221: ireturn
    //   222: aload #6
    //   224: getstatic p/d$b.LEFT : Lp/d$b;
    //   227: if_acmpeq -> 246
    //   230: aload #6
    //   232: getstatic p/d$b.RIGHT : Lp/d$b;
    //   235: if_acmpne -> 241
    //   238: goto -> 246
    //   241: iconst_0
    //   242: istore_2
    //   243: goto -> 248
    //   246: iconst_1
    //   247: istore_2
    //   248: iload_2
    //   249: istore_3
    //   250: aload_1
    //   251: invokevirtual h : ()Lp/e;
    //   254: instanceof p/h
    //   257: ifeq -> 279
    //   260: iload_2
    //   261: ifne -> 275
    //   264: iload #5
    //   266: istore_2
    //   267: aload #6
    //   269: getstatic p/d$b.CENTER_X : Lp/d$b;
    //   272: if_acmpne -> 277
    //   275: iconst_1
    //   276: istore_2
    //   277: iload_2
    //   278: istore_3
    //   279: iload_3
    //   280: ireturn
    //   281: iload_3
    //   282: istore_2
    //   283: aload #6
    //   285: getstatic p/d$b.BASELINE : Lp/d$b;
    //   288: if_acmpeq -> 313
    //   291: iload_3
    //   292: istore_2
    //   293: aload #6
    //   295: getstatic p/d$b.CENTER_X : Lp/d$b;
    //   298: if_acmpeq -> 313
    //   301: iload_3
    //   302: istore_2
    //   303: aload #6
    //   305: getstatic p/d$b.CENTER_Y : Lp/d$b;
    //   308: if_acmpeq -> 313
    //   311: iconst_1
    //   312: istore_2
    //   313: iload_2
    //   314: ireturn
  }
  
  public void q() {
    d d1 = this.f;
    if (d1 != null) {
      HashSet<d> hashSet = d1.a;
      if (hashSet != null) {
        hashSet.remove(this);
        if (this.f.a.size() == 0)
          this.f.a = null; 
      } 
    } 
    this.a = null;
    this.f = null;
    this.g = 0;
    this.h = Integer.MIN_VALUE;
    this.c = false;
    this.b = 0;
  }
  
  public void r() {
    this.c = false;
    this.b = 0;
  }
  
  public void s(c paramc) {
    i i1 = this.i;
    if (i1 == null) {
      this.i = new i(i.a.UNRESTRICTED, null);
      return;
    } 
    i1.e();
  }
  
  public void t(int paramInt) {
    this.b = paramInt;
    this.c = true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.d.t());
    stringBuilder.append(":");
    stringBuilder.append(this.e.toString());
    return stringBuilder.toString();
  }
  
  public void u(int paramInt) {
    if (o())
      this.h = paramInt; 
  }
  
  public enum b {
    BASELINE, BOTTOM, CENTER, CENTER_X, CENTER_Y, LEFT, NONE, RIGHT, TOP;
    
    static {
      b b1 = new b("NONE", 0);
      NONE = b1;
      b b2 = new b("LEFT", 1);
      LEFT = b2;
      b b3 = new b("TOP", 2);
      TOP = b3;
      b b4 = new b("RIGHT", 3);
      RIGHT = b4;
      b b5 = new b("BOTTOM", 4);
      BOTTOM = b5;
      b b6 = new b("BASELINE", 5);
      BASELINE = b6;
      b b7 = new b("CENTER", 6);
      CENTER = b7;
      b b8 = new b("CENTER_X", 7);
      CENTER_X = b8;
      b b9 = new b("CENTER_Y", 8);
      CENTER_Y = b9;
      $VALUES = new b[] { b1, b2, b3, b4, b5, b6, b7, b8, b9 };
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */