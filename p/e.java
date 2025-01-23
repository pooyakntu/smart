package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m.c;
import m.d;
import m.i;
import q.c;
import q.l;
import q.n;
import q.p;

public class e {
  public static float K0 = 0.5F;
  
  public int A = 0;
  
  int A0;
  
  public float B = 1.0F;
  
  boolean B0;
  
  public int C = 0;
  
  boolean C0;
  
  public int D = 0;
  
  public float[] D0;
  
  public float E = 1.0F;
  
  protected e[] E0;
  
  int F = -1;
  
  protected e[] F0;
  
  float G = 1.0F;
  
  e G0;
  
  private int[] H = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
  
  e H0;
  
  private float I = 0.0F;
  
  public int I0;
  
  private boolean J = false;
  
  public int J0;
  
  private boolean K;
  
  private boolean L = false;
  
  private int M = 0;
  
  private int N = 0;
  
  public d O = new d(this, d.b.LEFT);
  
  public d P = new d(this, d.b.TOP);
  
  public d Q = new d(this, d.b.RIGHT);
  
  public d R = new d(this, d.b.BOTTOM);
  
  public d S = new d(this, d.b.BASELINE);
  
  d T = new d(this, d.b.CENTER_X);
  
  d U = new d(this, d.b.CENTER_Y);
  
  public d V;
  
  public d[] W;
  
  protected ArrayList<d> X;
  
  private boolean[] Y;
  
  public b[] Z;
  
  public boolean a = false;
  
  public e a0;
  
  public p[] b = new p[2];
  
  int b0;
  
  public c c;
  
  int c0;
  
  public c d;
  
  public float d0;
  
  public l e = null;
  
  protected int e0;
  
  public n f = null;
  
  protected int f0;
  
  public boolean[] g = new boolean[] { true, true };
  
  protected int g0;
  
  boolean h = false;
  
  int h0;
  
  private boolean i = true;
  
  int i0;
  
  private boolean j = false;
  
  protected int j0;
  
  private boolean k = true;
  
  protected int k0;
  
  private int l = -1;
  
  int l0;
  
  private int m = -1;
  
  protected int m0;
  
  public o.a n = new o.a(this);
  
  protected int n0;
  
  public String o;
  
  float o0;
  
  private boolean p = false;
  
  float p0;
  
  private boolean q = false;
  
  private Object q0;
  
  private boolean r = false;
  
  private int r0;
  
  private boolean s = false;
  
  private int s0;
  
  public int t = -1;
  
  private boolean t0;
  
  public int u = -1;
  
  private String u0;
  
  private int v = 0;
  
  private String v0;
  
  public int w = 0;
  
  boolean w0;
  
  public int x = 0;
  
  boolean x0;
  
  public int[] y = new int[2];
  
  boolean y0;
  
  public int z = 0;
  
  int z0;
  
  public e() {
    d d1 = new d(this, d.b.CENTER);
    this.V = d1;
    this.W = new d[] { this.O, this.Q, this.P, this.R, this.S, d1 };
    this.X = new ArrayList<d>();
    this.Y = new boolean[2];
    b b1 = b.FIXED;
    this.Z = new b[] { b1, b1 };
    this.a0 = null;
    this.b0 = 0;
    this.c0 = 0;
    this.d0 = 0.0F;
    this.e0 = -1;
    this.f0 = 0;
    this.g0 = 0;
    this.h0 = 0;
    this.i0 = 0;
    this.j0 = 0;
    this.k0 = 0;
    this.l0 = 0;
    float f = K0;
    this.o0 = f;
    this.p0 = f;
    this.r0 = 0;
    this.s0 = 0;
    this.t0 = false;
    this.u0 = null;
    this.v0 = null;
    this.y0 = false;
    this.z0 = 0;
    this.A0 = 0;
    this.D0 = new float[] { -1.0F, -1.0F };
    this.E0 = new e[] { null, null };
    this.F0 = new e[] { null, null };
    this.G0 = null;
    this.H0 = null;
    this.I0 = -1;
    this.J0 = -1;
    d();
  }
  
  private void P(StringBuilder paramStringBuilder, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat1, float paramFloat2) {
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :  {\n");
    y0(paramStringBuilder, "      size", paramInt1, 0);
    y0(paramStringBuilder, "      min", paramInt2, 0);
    y0(paramStringBuilder, "      max", paramInt3, 2147483647);
    y0(paramStringBuilder, "      matchMin", paramInt5, 0);
    y0(paramStringBuilder, "      matchDef", paramInt6, 0);
    x0(paramStringBuilder, "      matchPercent", paramFloat1, 1.0F);
    paramStringBuilder.append("    },\n");
  }
  
  private void Q(StringBuilder paramStringBuilder, String paramString, d paramd) {
    if (paramd.f == null)
      return; 
    paramStringBuilder.append("    ");
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" : [ '");
    paramStringBuilder.append(paramd.f);
    paramStringBuilder.append("'");
    if (paramd.h != Integer.MIN_VALUE || paramd.g != 0) {
      paramStringBuilder.append(",");
      paramStringBuilder.append(paramd.g);
      if (paramd.h != Integer.MIN_VALUE) {
        paramStringBuilder.append(",");
        paramStringBuilder.append(paramd.h);
        paramStringBuilder.append(",");
      } 
    } 
    paramStringBuilder.append(" ] ,\n");
  }
  
  private void d() {
    this.X.add(this.O);
    this.X.add(this.P);
    this.X.add(this.Q);
    this.X.add(this.R);
    this.X.add(this.T);
    this.X.add(this.U);
    this.X.add(this.V);
    this.X.add(this.S);
  }
  
  private boolean f0(int paramInt) {
    paramInt *= 2;
    d[] arrayOfD = this.W;
    d d1 = arrayOfD[paramInt];
    d d2 = d1.f;
    if (d2 != null && d2.f != d1) {
      d d3 = arrayOfD[paramInt + 1];
      d1 = d3.f;
      if (d1 != null && d1.f == d3)
        return true; 
    } 
    return false;
  }
  
  private void i(d paramd, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, i parami1, i parami2, b paramb, boolean paramBoolean5, d paramd1, d paramd2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, int paramInt5, int paramInt6, int paramInt7, int paramInt8, float paramFloat2, boolean paramBoolean11) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
  }
  
  private void x0(StringBuilder paramStringBuilder, String paramString, float paramFloat1, float paramFloat2) {
    if (paramFloat1 == paramFloat2)
      return; 
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :   ");
    paramStringBuilder.append(paramFloat1);
    paramStringBuilder.append(",\n");
  }
  
  private void y0(StringBuilder paramStringBuilder, String paramString, int paramInt1, int paramInt2) {
    if (paramInt1 == paramInt2)
      return; 
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :   ");
    paramStringBuilder.append(paramInt1);
    paramStringBuilder.append(",\n");
  }
  
  private void z0(StringBuilder paramStringBuilder, String paramString, float paramFloat, int paramInt) {
    if (paramFloat == 0.0F)
      return; 
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :  [");
    paramStringBuilder.append(paramFloat);
    paramStringBuilder.append(",");
    paramStringBuilder.append(paramInt);
    paramStringBuilder.append("");
    paramStringBuilder.append("],\n");
  }
  
  public b A() {
    return this.Z[0];
  }
  
  public void A0(int paramInt) {
    boolean bool;
    this.l0 = paramInt;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.J = bool;
  }
  
  public int B() {
    d d1 = this.O;
    int i = 0;
    if (d1 != null)
      i = 0 + d1.g; 
    d1 = this.Q;
    int j = i;
    if (d1 != null)
      j = i + d1.g; 
    return j;
  }
  
  public void B0(Object paramObject) {
    this.q0 = paramObject;
  }
  
  public int C() {
    return this.M;
  }
  
  public void C0(String paramString) {
    this.u0 = paramString;
  }
  
  public int D() {
    return this.N;
  }
  
  public void D0(String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 267
    //   4: aload_1
    //   5: invokevirtual length : ()I
    //   8: ifne -> 14
    //   11: goto -> 267
    //   14: aload_1
    //   15: invokevirtual length : ()I
    //   18: istore #9
    //   20: aload_1
    //   21: bipush #44
    //   23: invokevirtual indexOf : (I)I
    //   26: istore #10
    //   28: iconst_0
    //   29: istore #8
    //   31: iconst_0
    //   32: istore #6
    //   34: iconst_m1
    //   35: istore #7
    //   37: iload #8
    //   39: istore #5
    //   41: iload #7
    //   43: istore #4
    //   45: iload #10
    //   47: ifle -> 120
    //   50: iload #8
    //   52: istore #5
    //   54: iload #7
    //   56: istore #4
    //   58: iload #10
    //   60: iload #9
    //   62: iconst_1
    //   63: isub
    //   64: if_icmpge -> 120
    //   67: aload_1
    //   68: iconst_0
    //   69: iload #10
    //   71: invokevirtual substring : (II)Ljava/lang/String;
    //   74: astore #11
    //   76: aload #11
    //   78: ldc_w 'W'
    //   81: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   84: ifeq -> 94
    //   87: iload #6
    //   89: istore #4
    //   91: goto -> 114
    //   94: aload #11
    //   96: ldc_w 'H'
    //   99: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   102: ifeq -> 111
    //   105: iconst_1
    //   106: istore #4
    //   108: goto -> 114
    //   111: iconst_m1
    //   112: istore #4
    //   114: iload #10
    //   116: iconst_1
    //   117: iadd
    //   118: istore #5
    //   120: aload_1
    //   121: bipush #58
    //   123: invokevirtual indexOf : (I)I
    //   126: istore #6
    //   128: iload #6
    //   130: iflt -> 225
    //   133: iload #6
    //   135: iload #9
    //   137: iconst_1
    //   138: isub
    //   139: if_icmpge -> 225
    //   142: aload_1
    //   143: iload #5
    //   145: iload #6
    //   147: invokevirtual substring : (II)Ljava/lang/String;
    //   150: astore #11
    //   152: aload_1
    //   153: iload #6
    //   155: iconst_1
    //   156: iadd
    //   157: invokevirtual substring : (I)Ljava/lang/String;
    //   160: astore_1
    //   161: aload #11
    //   163: invokevirtual length : ()I
    //   166: ifle -> 247
    //   169: aload_1
    //   170: invokevirtual length : ()I
    //   173: ifle -> 247
    //   176: aload #11
    //   178: invokestatic parseFloat : (Ljava/lang/String;)F
    //   181: fstore_2
    //   182: aload_1
    //   183: invokestatic parseFloat : (Ljava/lang/String;)F
    //   186: fstore_3
    //   187: fload_2
    //   188: fconst_0
    //   189: fcmpl
    //   190: ifle -> 247
    //   193: fload_3
    //   194: fconst_0
    //   195: fcmpl
    //   196: ifle -> 247
    //   199: iload #4
    //   201: iconst_1
    //   202: if_icmpne -> 215
    //   205: fload_3
    //   206: fload_2
    //   207: fdiv
    //   208: invokestatic abs : (F)F
    //   211: fstore_2
    //   212: goto -> 249
    //   215: fload_2
    //   216: fload_3
    //   217: fdiv
    //   218: invokestatic abs : (F)F
    //   221: fstore_2
    //   222: goto -> 249
    //   225: aload_1
    //   226: iload #5
    //   228: invokevirtual substring : (I)Ljava/lang/String;
    //   231: astore_1
    //   232: aload_1
    //   233: invokevirtual length : ()I
    //   236: ifle -> 247
    //   239: aload_1
    //   240: invokestatic parseFloat : (Ljava/lang/String;)F
    //   243: fstore_2
    //   244: goto -> 249
    //   247: fconst_0
    //   248: fstore_2
    //   249: fload_2
    //   250: fconst_0
    //   251: fcmpl
    //   252: ifle -> 266
    //   255: aload_0
    //   256: fload_2
    //   257: putfield d0 : F
    //   260: aload_0
    //   261: iload #4
    //   263: putfield e0 : I
    //   266: return
    //   267: aload_0
    //   268: fconst_0
    //   269: putfield d0 : F
    //   272: return
    //   273: astore_1
    //   274: goto -> 247
    // Exception table:
    //   from	to	target	type
    //   176	187	273	java/lang/NumberFormatException
    //   205	212	273	java/lang/NumberFormatException
    //   215	222	273	java/lang/NumberFormatException
    //   239	244	273	java/lang/NumberFormatException
  }
  
  public int E(int paramInt) {
    return (paramInt == 0) ? W() : ((paramInt == 1) ? x() : 0);
  }
  
  public void E0(int paramInt) {
    if (!this.J)
      return; 
    int i = paramInt - this.l0;
    int j = this.c0;
    this.g0 = i;
    this.P.t(i);
    this.R.t(j + i);
    this.S.t(paramInt);
    this.q = true;
  }
  
  public int F() {
    return this.H[1];
  }
  
  public void F0(int paramInt1, int paramInt2) {
    if (this.p)
      return; 
    this.O.t(paramInt1);
    this.Q.t(paramInt2);
    this.f0 = paramInt1;
    this.b0 = paramInt2 - paramInt1;
    this.p = true;
  }
  
  public int G() {
    return this.H[0];
  }
  
  public void G0(int paramInt) {
    this.O.t(paramInt);
    this.f0 = paramInt;
  }
  
  public int H() {
    return this.n0;
  }
  
  public void H0(int paramInt) {
    this.P.t(paramInt);
    this.g0 = paramInt;
  }
  
  public int I() {
    return this.m0;
  }
  
  public void I0(int paramInt1, int paramInt2) {
    if (this.q)
      return; 
    this.P.t(paramInt1);
    this.R.t(paramInt2);
    this.g0 = paramInt1;
    this.c0 = paramInt2 - paramInt1;
    if (this.J)
      this.S.t(paramInt1 + this.l0); 
    this.q = true;
  }
  
  public e J(int paramInt) {
    if (paramInt == 0) {
      d d1 = this.Q;
      d d2 = d1.f;
      if (d2 != null && d2.f == d1)
        return d2.d; 
    } else if (paramInt == 1) {
      d d1 = this.R;
      d d2 = d1.f;
      if (d2 != null && d2.f == d1)
        return d2.d; 
    } 
    return null;
  }
  
  public void J0(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt3 - paramInt1;
    paramInt3 = paramInt4 - paramInt2;
    this.f0 = paramInt1;
    this.g0 = paramInt2;
    if (this.s0 == 8) {
      this.b0 = 0;
      this.c0 = 0;
      return;
    } 
    b[] arrayOfB = this.Z;
    b b1 = arrayOfB[0];
    b b2 = b.FIXED;
    paramInt1 = i;
    if (b1 == b2) {
      paramInt2 = this.b0;
      paramInt1 = i;
      if (i < paramInt2)
        paramInt1 = paramInt2; 
    } 
    paramInt2 = paramInt3;
    if (arrayOfB[1] == b2) {
      paramInt4 = this.c0;
      paramInt2 = paramInt3;
      if (paramInt3 < paramInt4)
        paramInt2 = paramInt4; 
    } 
    this.b0 = paramInt1;
    this.c0 = paramInt2;
    paramInt3 = this.n0;
    if (paramInt2 < paramInt3)
      this.c0 = paramInt3; 
    paramInt3 = this.m0;
    if (paramInt1 < paramInt3)
      this.b0 = paramInt3; 
    paramInt3 = this.A;
    if (paramInt3 > 0 && b1 == b.MATCH_CONSTRAINT)
      this.b0 = Math.min(this.b0, paramInt3); 
    paramInt3 = this.D;
    if (paramInt3 > 0 && this.Z[1] == b.MATCH_CONSTRAINT)
      this.c0 = Math.min(this.c0, paramInt3); 
    paramInt3 = this.b0;
    if (paramInt1 != paramInt3)
      this.l = paramInt3; 
    paramInt1 = this.c0;
    if (paramInt2 != paramInt1)
      this.m = paramInt1; 
  }
  
  public e K() {
    return this.a0;
  }
  
  public void K0(boolean paramBoolean) {
    this.J = paramBoolean;
  }
  
  public e L(int paramInt) {
    if (paramInt == 0) {
      d d1 = this.O;
      d d2 = d1.f;
      if (d2 != null && d2.f == d1)
        return d2.d; 
    } else if (paramInt == 1) {
      d d1 = this.P;
      d d2 = d1.f;
      if (d2 != null && d2.f == d1)
        return d2.d; 
    } 
    return null;
  }
  
  public void L0(int paramInt) {
    this.c0 = paramInt;
    int i = this.n0;
    if (paramInt < i)
      this.c0 = i; 
  }
  
  public int M() {
    return X() + this.b0;
  }
  
  public void M0(float paramFloat) {
    this.o0 = paramFloat;
  }
  
  public p N(int paramInt) {
    return (p)((paramInt == 0) ? this.e : ((paramInt == 1) ? this.f : null));
  }
  
  public void N0(int paramInt) {
    this.z0 = paramInt;
  }
  
  public void O(StringBuilder paramStringBuilder) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("  ");
    stringBuilder.append(this.o);
    stringBuilder.append(":{\n");
    paramStringBuilder.append(stringBuilder.toString());
    stringBuilder = new StringBuilder();
    stringBuilder.append("    actualWidth:");
    stringBuilder.append(this.b0);
    paramStringBuilder.append(stringBuilder.toString());
    paramStringBuilder.append("\n");
    stringBuilder = new StringBuilder();
    stringBuilder.append("    actualHeight:");
    stringBuilder.append(this.c0);
    paramStringBuilder.append(stringBuilder.toString());
    paramStringBuilder.append("\n");
    stringBuilder = new StringBuilder();
    stringBuilder.append("    actualLeft:");
    stringBuilder.append(this.f0);
    paramStringBuilder.append(stringBuilder.toString());
    paramStringBuilder.append("\n");
    stringBuilder = new StringBuilder();
    stringBuilder.append("    actualTop:");
    stringBuilder.append(this.g0);
    paramStringBuilder.append(stringBuilder.toString());
    paramStringBuilder.append("\n");
    Q(paramStringBuilder, "left", this.O);
    Q(paramStringBuilder, "top", this.P);
    Q(paramStringBuilder, "right", this.Q);
    Q(paramStringBuilder, "bottom", this.R);
    Q(paramStringBuilder, "baseline", this.S);
    Q(paramStringBuilder, "centerX", this.T);
    Q(paramStringBuilder, "centerY", this.U);
    P(paramStringBuilder, "    width", this.b0, this.m0, this.H[0], this.l, this.z, this.w, this.B, this.D0[0]);
    P(paramStringBuilder, "    height", this.c0, this.n0, this.H[1], this.m, this.C, this.x, this.E, this.D0[1]);
    z0(paramStringBuilder, "    dimensionRatio", this.d0, this.e0);
    x0(paramStringBuilder, "    horizontalBias", this.o0, K0);
    x0(paramStringBuilder, "    verticalBias", this.p0, K0);
    y0(paramStringBuilder, "    horizontalChainStyle", this.z0, 0);
    y0(paramStringBuilder, "    verticalChainStyle", this.A0, 0);
    paramStringBuilder.append("  }");
  }
  
  public void O0(int paramInt1, int paramInt2) {
    this.f0 = paramInt1;
    paramInt1 = paramInt2 - paramInt1;
    this.b0 = paramInt1;
    paramInt2 = this.m0;
    if (paramInt1 < paramInt2)
      this.b0 = paramInt2; 
  }
  
  public void P0(b paramb) {
    this.Z[0] = paramb;
  }
  
  public void Q0(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    this.w = paramInt1;
    this.z = paramInt2;
    paramInt2 = paramInt3;
    if (paramInt3 == Integer.MAX_VALUE)
      paramInt2 = 0; 
    this.A = paramInt2;
    this.B = paramFloat;
    if (paramFloat > 0.0F && paramFloat < 1.0F && paramInt1 == 0)
      this.w = 2; 
  }
  
  public float R() {
    return this.p0;
  }
  
  public void R0(float paramFloat) {
    this.D0[0] = paramFloat;
  }
  
  public int S() {
    return this.A0;
  }
  
  protected void S0(int paramInt, boolean paramBoolean) {
    this.Y[paramInt] = paramBoolean;
  }
  
  public b T() {
    return this.Z[1];
  }
  
  public void T0(boolean paramBoolean) {
    this.K = paramBoolean;
  }
  
  public int U() {
    d d1 = this.O;
    int i = 0;
    if (d1 != null)
      i = 0 + this.P.g; 
    int j = i;
    if (this.Q != null)
      j = i + this.R.g; 
    return j;
  }
  
  public void U0(boolean paramBoolean) {
    this.L = paramBoolean;
  }
  
  public int V() {
    return this.s0;
  }
  
  public void V0(int paramInt1, int paramInt2) {
    this.M = paramInt1;
    this.N = paramInt2;
    Y0(false);
  }
  
  public int W() {
    return (this.s0 == 8) ? 0 : this.b0;
  }
  
  public void W0(int paramInt) {
    this.H[1] = paramInt;
  }
  
  public int X() {
    e e1 = this.a0;
    return (e1 != null && e1 instanceof f) ? (((f)e1).S0 + this.f0) : this.f0;
  }
  
  public void X0(int paramInt) {
    this.H[0] = paramInt;
  }
  
  public int Y() {
    e e1 = this.a0;
    return (e1 != null && e1 instanceof f) ? (((f)e1).T0 + this.g0) : this.g0;
  }
  
  public void Y0(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public boolean Z() {
    return this.J;
  }
  
  public void Z0(int paramInt) {
    if (paramInt < 0) {
      this.n0 = 0;
      return;
    } 
    this.n0 = paramInt;
  }
  
  public boolean a0(int paramInt) {
    byte b1;
    byte b2;
    if (paramInt == 0) {
      if (this.O.f != null) {
        paramInt = 1;
      } else {
        paramInt = 0;
      } 
      if (this.Q.f != null) {
        b1 = 1;
      } else {
        b1 = 0;
      } 
      return (paramInt + b1 < 2);
    } 
    if (this.P.f != null) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if (this.R.f != null) {
      b1 = 1;
    } else {
      b1 = 0;
    } 
    if (this.S.f != null) {
      b2 = 1;
    } else {
      b2 = 0;
    } 
    return (paramInt + b1 + b2 < 2);
  }
  
  public void a1(int paramInt) {
    if (paramInt < 0) {
      this.m0 = 0;
      return;
    } 
    this.m0 = paramInt;
  }
  
  public boolean b0() {
    int j = this.X.size();
    for (int i = 0; i < j; i++) {
      if (((d)this.X.get(i)).m())
        return true; 
    } 
    return false;
  }
  
  public void b1(int paramInt1, int paramInt2) {
    this.f0 = paramInt1;
    this.g0 = paramInt2;
  }
  
  public boolean c0() {
    return (this.l != -1 || this.m != -1);
  }
  
  public void c1(e parame) {
    this.a0 = parame;
  }
  
  public boolean d0(int paramInt1, int paramInt2) {
    if (paramInt1 == 0) {
      d d1 = this.O.f;
      if (d1 != null && d1.n()) {
        d1 = this.Q.f;
        if (d1 != null && d1.n())
          return (this.Q.f.e() - this.Q.f() - this.O.f.e() + this.O.f() >= paramInt2); 
      } 
    } else {
      d d1 = this.P.f;
      if (d1 != null && d1.n()) {
        d1 = this.R.f;
        if (d1 != null && d1.n())
          return (this.R.f.e() - this.R.f() - this.P.f.e() + this.P.f() >= paramInt2); 
      } 
    } 
    return false;
  }
  
  public void d1(float paramFloat) {
    this.p0 = paramFloat;
  }
  
  public void e(f paramf, d paramd, HashSet<e> paramHashSet, int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      if (!paramHashSet.contains(this))
        return; 
      k.a(paramf, paramd, this);
      paramHashSet.remove(this);
      g(paramd, paramf.T1(64));
    } 
    if (paramInt == 0) {
      HashSet<d> hashSet = this.O.d();
      if (hashSet != null) {
        Iterator<d> iterator = hashSet.iterator();
        while (iterator.hasNext())
          ((d)iterator.next()).d.e(paramf, paramd, paramHashSet, paramInt, true); 
      } 
      hashSet = this.Q.d();
      if (hashSet != null) {
        Iterator<d> iterator = hashSet.iterator();
        while (iterator.hasNext())
          ((d)iterator.next()).d.e(paramf, paramd, paramHashSet, paramInt, true); 
      } 
    } else {
      HashSet<d> hashSet = this.P.d();
      if (hashSet != null) {
        Iterator<d> iterator = hashSet.iterator();
        while (iterator.hasNext())
          ((d)iterator.next()).d.e(paramf, paramd, paramHashSet, paramInt, true); 
      } 
      hashSet = this.R.d();
      if (hashSet != null) {
        Iterator<d> iterator = hashSet.iterator();
        while (iterator.hasNext())
          ((d)iterator.next()).d.e(paramf, paramd, paramHashSet, paramInt, true); 
      } 
      hashSet = this.S.d();
      if (hashSet != null) {
        Iterator<d> iterator = hashSet.iterator();
        while (true) {
          if (iterator.hasNext()) {
            e e1 = ((d)iterator.next()).d;
            try {
              e1.e(paramf, paramd, paramHashSet, paramInt, true);
            } finally {}
            continue;
          } 
          return;
        } 
      } 
    } 
  }
  
  public void e0(d.b paramb1, e parame, d.b paramb2, int paramInt1, int paramInt2) {
    o(paramb1).b(parame.o(paramb2), paramInt1, paramInt2, true);
  }
  
  public void e1(int paramInt) {
    this.A0 = paramInt;
  }
  
  boolean f() {
    return (this instanceof l || this instanceof h);
  }
  
  public void f1(int paramInt1, int paramInt2) {
    this.g0 = paramInt1;
    paramInt1 = paramInt2 - paramInt1;
    this.c0 = paramInt1;
    paramInt2 = this.n0;
    if (paramInt1 < paramInt2)
      this.c0 = paramInt2; 
  }
  
  public void g(d paramd, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield O : Lp/d;
    //   5: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   8: astore #29
    //   10: aload_1
    //   11: aload_0
    //   12: getfield Q : Lp/d;
    //   15: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   18: astore #28
    //   20: aload_1
    //   21: aload_0
    //   22: getfield P : Lp/d;
    //   25: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   28: astore #31
    //   30: aload_1
    //   31: aload_0
    //   32: getfield R : Lp/d;
    //   35: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   38: astore #30
    //   40: aload_1
    //   41: aload_0
    //   42: getfield S : Lp/d;
    //   45: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   48: astore #27
    //   50: aload_0
    //   51: getfield a0 : Lp/e;
    //   54: astore #25
    //   56: aload #25
    //   58: ifnull -> 167
    //   61: aload #25
    //   63: ifnull -> 85
    //   66: aload #25
    //   68: getfield Z : [Lp/e$b;
    //   71: iconst_0
    //   72: aaload
    //   73: getstatic p/e$b.WRAP_CONTENT : Lp/e$b;
    //   76: if_acmpne -> 85
    //   79: iconst_1
    //   80: istore #12
    //   82: goto -> 88
    //   85: iconst_0
    //   86: istore #12
    //   88: aload #25
    //   90: ifnull -> 112
    //   93: aload #25
    //   95: getfield Z : [Lp/e$b;
    //   98: iconst_1
    //   99: aaload
    //   100: getstatic p/e$b.WRAP_CONTENT : Lp/e$b;
    //   103: if_acmpne -> 112
    //   106: iconst_1
    //   107: istore #13
    //   109: goto -> 115
    //   112: iconst_0
    //   113: istore #13
    //   115: aload_0
    //   116: getfield v : I
    //   119: istore #4
    //   121: iload #4
    //   123: iconst_1
    //   124: if_icmpeq -> 160
    //   127: iload #4
    //   129: iconst_2
    //   130: if_icmpeq -> 150
    //   133: iload #4
    //   135: iconst_3
    //   136: if_icmpeq -> 167
    //   139: iload #12
    //   141: istore #14
    //   143: iload #13
    //   145: istore #12
    //   147: goto -> 173
    //   150: iload #13
    //   152: istore #12
    //   154: iconst_0
    //   155: istore #14
    //   157: goto -> 173
    //   160: iload #12
    //   162: istore #14
    //   164: goto -> 170
    //   167: iconst_0
    //   168: istore #14
    //   170: iconst_0
    //   171: istore #12
    //   173: aload_0
    //   174: getfield s0 : I
    //   177: bipush #8
    //   179: if_icmpne -> 217
    //   182: aload_0
    //   183: getfield t0 : Z
    //   186: ifne -> 217
    //   189: aload_0
    //   190: invokevirtual b0 : ()Z
    //   193: ifne -> 217
    //   196: aload_0
    //   197: getfield Y : [Z
    //   200: astore #25
    //   202: aload #25
    //   204: iconst_0
    //   205: baload
    //   206: ifne -> 217
    //   209: aload #25
    //   211: iconst_1
    //   212: baload
    //   213: ifne -> 217
    //   216: return
    //   217: aload_0
    //   218: getfield p : Z
    //   221: istore #13
    //   223: iload #13
    //   225: ifne -> 235
    //   228: aload_0
    //   229: getfield q : Z
    //   232: ifeq -> 483
    //   235: iload #13
    //   237: ifeq -> 333
    //   240: aload_1
    //   241: aload #29
    //   243: aload_0
    //   244: getfield f0 : I
    //   247: invokevirtual f : (Lm/i;I)V
    //   250: aload_1
    //   251: aload #28
    //   253: aload_0
    //   254: getfield f0 : I
    //   257: aload_0
    //   258: getfield b0 : I
    //   261: iadd
    //   262: invokevirtual f : (Lm/i;I)V
    //   265: iload #14
    //   267: ifeq -> 333
    //   270: aload_0
    //   271: getfield a0 : Lp/e;
    //   274: astore #25
    //   276: aload #25
    //   278: ifnull -> 333
    //   281: aload_0
    //   282: getfield k : Z
    //   285: ifeq -> 316
    //   288: aload #25
    //   290: checkcast p/f
    //   293: astore #25
    //   295: aload #25
    //   297: aload_0
    //   298: getfield O : Lp/d;
    //   301: invokevirtual z1 : (Lp/d;)V
    //   304: aload #25
    //   306: aload_0
    //   307: getfield Q : Lp/d;
    //   310: invokevirtual y1 : (Lp/d;)V
    //   313: goto -> 333
    //   316: aload_1
    //   317: aload_1
    //   318: aload #25
    //   320: getfield Q : Lp/d;
    //   323: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   326: aload #28
    //   328: iconst_0
    //   329: iconst_5
    //   330: invokevirtual h : (Lm/i;Lm/i;II)V
    //   333: aload_0
    //   334: getfield q : Z
    //   337: ifeq -> 458
    //   340: aload_1
    //   341: aload #31
    //   343: aload_0
    //   344: getfield g0 : I
    //   347: invokevirtual f : (Lm/i;I)V
    //   350: aload_1
    //   351: aload #30
    //   353: aload_0
    //   354: getfield g0 : I
    //   357: aload_0
    //   358: getfield c0 : I
    //   361: iadd
    //   362: invokevirtual f : (Lm/i;I)V
    //   365: aload_0
    //   366: getfield S : Lp/d;
    //   369: invokevirtual m : ()Z
    //   372: ifeq -> 390
    //   375: aload_1
    //   376: aload #27
    //   378: aload_0
    //   379: getfield g0 : I
    //   382: aload_0
    //   383: getfield l0 : I
    //   386: iadd
    //   387: invokevirtual f : (Lm/i;I)V
    //   390: iload #12
    //   392: ifeq -> 458
    //   395: aload_0
    //   396: getfield a0 : Lp/e;
    //   399: astore #25
    //   401: aload #25
    //   403: ifnull -> 458
    //   406: aload_0
    //   407: getfield k : Z
    //   410: ifeq -> 441
    //   413: aload #25
    //   415: checkcast p/f
    //   418: astore #25
    //   420: aload #25
    //   422: aload_0
    //   423: getfield P : Lp/d;
    //   426: invokevirtual E1 : (Lp/d;)V
    //   429: aload #25
    //   431: aload_0
    //   432: getfield R : Lp/d;
    //   435: invokevirtual D1 : (Lp/d;)V
    //   438: goto -> 458
    //   441: aload_1
    //   442: aload_1
    //   443: aload #25
    //   445: getfield R : Lp/d;
    //   448: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   451: aload #30
    //   453: iconst_0
    //   454: iconst_5
    //   455: invokevirtual h : (Lm/i;Lm/i;II)V
    //   458: aload_0
    //   459: getfield p : Z
    //   462: ifeq -> 483
    //   465: aload_0
    //   466: getfield q : Z
    //   469: ifeq -> 483
    //   472: aload_0
    //   473: iconst_0
    //   474: putfield p : Z
    //   477: aload_0
    //   478: iconst_0
    //   479: putfield q : Z
    //   482: return
    //   483: getstatic m/d.r : Z
    //   486: istore #13
    //   488: iload_2
    //   489: ifeq -> 737
    //   492: aload_0
    //   493: getfield e : Lq/l;
    //   496: astore #25
    //   498: aload #25
    //   500: ifnull -> 737
    //   503: aload_0
    //   504: getfield f : Lq/n;
    //   507: astore #26
    //   509: aload #26
    //   511: ifnull -> 737
    //   514: aload #25
    //   516: getfield h : Lq/f;
    //   519: astore #32
    //   521: aload #32
    //   523: getfield j : Z
    //   526: ifeq -> 737
    //   529: aload #25
    //   531: getfield i : Lq/f;
    //   534: getfield j : Z
    //   537: ifeq -> 737
    //   540: aload #26
    //   542: getfield h : Lq/f;
    //   545: getfield j : Z
    //   548: ifeq -> 737
    //   551: aload #26
    //   553: getfield i : Lq/f;
    //   556: getfield j : Z
    //   559: ifeq -> 737
    //   562: aload_1
    //   563: aload #29
    //   565: aload #32
    //   567: getfield g : I
    //   570: invokevirtual f : (Lm/i;I)V
    //   573: aload_1
    //   574: aload #28
    //   576: aload_0
    //   577: getfield e : Lq/l;
    //   580: getfield i : Lq/f;
    //   583: getfield g : I
    //   586: invokevirtual f : (Lm/i;I)V
    //   589: aload_1
    //   590: aload #31
    //   592: aload_0
    //   593: getfield f : Lq/n;
    //   596: getfield h : Lq/f;
    //   599: getfield g : I
    //   602: invokevirtual f : (Lm/i;I)V
    //   605: aload_1
    //   606: aload #30
    //   608: aload_0
    //   609: getfield f : Lq/n;
    //   612: getfield i : Lq/f;
    //   615: getfield g : I
    //   618: invokevirtual f : (Lm/i;I)V
    //   621: aload_1
    //   622: aload #27
    //   624: aload_0
    //   625: getfield f : Lq/n;
    //   628: getfield k : Lq/f;
    //   631: getfield g : I
    //   634: invokevirtual f : (Lm/i;I)V
    //   637: aload_0
    //   638: getfield a0 : Lp/e;
    //   641: ifnull -> 726
    //   644: iload #14
    //   646: ifeq -> 685
    //   649: aload_0
    //   650: getfield g : [Z
    //   653: iconst_0
    //   654: baload
    //   655: ifeq -> 685
    //   658: aload_0
    //   659: invokevirtual i0 : ()Z
    //   662: ifne -> 685
    //   665: aload_1
    //   666: aload_1
    //   667: aload_0
    //   668: getfield a0 : Lp/e;
    //   671: getfield Q : Lp/d;
    //   674: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   677: aload #28
    //   679: iconst_0
    //   680: bipush #8
    //   682: invokevirtual h : (Lm/i;Lm/i;II)V
    //   685: iload #12
    //   687: ifeq -> 726
    //   690: aload_0
    //   691: getfield g : [Z
    //   694: iconst_1
    //   695: baload
    //   696: ifeq -> 726
    //   699: aload_0
    //   700: invokevirtual k0 : ()Z
    //   703: ifne -> 726
    //   706: aload_1
    //   707: aload_1
    //   708: aload_0
    //   709: getfield a0 : Lp/e;
    //   712: getfield R : Lp/d;
    //   715: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   718: aload #30
    //   720: iconst_0
    //   721: bipush #8
    //   723: invokevirtual h : (Lm/i;Lm/i;II)V
    //   726: aload_0
    //   727: iconst_0
    //   728: putfield p : Z
    //   731: aload_0
    //   732: iconst_0
    //   733: putfield q : Z
    //   736: return
    //   737: aload_0
    //   738: getfield a0 : Lp/e;
    //   741: ifnull -> 938
    //   744: aload_0
    //   745: iconst_0
    //   746: invokespecial f0 : (I)Z
    //   749: ifeq -> 770
    //   752: aload_0
    //   753: getfield a0 : Lp/e;
    //   756: checkcast p/f
    //   759: aload_0
    //   760: iconst_0
    //   761: invokevirtual v1 : (Lp/e;I)V
    //   764: iconst_1
    //   765: istore #13
    //   767: goto -> 776
    //   770: aload_0
    //   771: invokevirtual i0 : ()Z
    //   774: istore #13
    //   776: aload_0
    //   777: iconst_1
    //   778: invokespecial f0 : (I)Z
    //   781: ifeq -> 802
    //   784: aload_0
    //   785: getfield a0 : Lp/e;
    //   788: checkcast p/f
    //   791: aload_0
    //   792: iconst_1
    //   793: invokevirtual v1 : (Lp/e;I)V
    //   796: iconst_1
    //   797: istore #15
    //   799: goto -> 808
    //   802: aload_0
    //   803: invokevirtual k0 : ()Z
    //   806: istore #15
    //   808: iload #13
    //   810: ifne -> 866
    //   813: iload #14
    //   815: ifeq -> 866
    //   818: aload_0
    //   819: getfield s0 : I
    //   822: bipush #8
    //   824: if_icmpeq -> 866
    //   827: aload_0
    //   828: getfield O : Lp/d;
    //   831: getfield f : Lp/d;
    //   834: ifnonnull -> 866
    //   837: aload_0
    //   838: getfield Q : Lp/d;
    //   841: getfield f : Lp/d;
    //   844: ifnonnull -> 866
    //   847: aload_1
    //   848: aload_1
    //   849: aload_0
    //   850: getfield a0 : Lp/e;
    //   853: getfield Q : Lp/d;
    //   856: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   859: aload #28
    //   861: iconst_0
    //   862: iconst_1
    //   863: invokevirtual h : (Lm/i;Lm/i;II)V
    //   866: iload #15
    //   868: ifne -> 931
    //   871: iload #12
    //   873: ifeq -> 931
    //   876: aload_0
    //   877: getfield s0 : I
    //   880: bipush #8
    //   882: if_icmpeq -> 931
    //   885: aload_0
    //   886: getfield P : Lp/d;
    //   889: getfield f : Lp/d;
    //   892: ifnonnull -> 931
    //   895: aload_0
    //   896: getfield R : Lp/d;
    //   899: getfield f : Lp/d;
    //   902: ifnonnull -> 931
    //   905: aload_0
    //   906: getfield S : Lp/d;
    //   909: ifnonnull -> 931
    //   912: aload_1
    //   913: aload_1
    //   914: aload_0
    //   915: getfield a0 : Lp/e;
    //   918: getfield R : Lp/d;
    //   921: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   924: aload #30
    //   926: iconst_0
    //   927: iconst_1
    //   928: invokevirtual h : (Lm/i;Lm/i;II)V
    //   931: iload #13
    //   933: istore #16
    //   935: goto -> 944
    //   938: iconst_0
    //   939: istore #15
    //   941: iconst_0
    //   942: istore #16
    //   944: aload_0
    //   945: getfield b0 : I
    //   948: istore #9
    //   950: aload_0
    //   951: getfield m0 : I
    //   954: istore #4
    //   956: iload #9
    //   958: iload #4
    //   960: if_icmpge -> 966
    //   963: goto -> 970
    //   966: iload #9
    //   968: istore #4
    //   970: aload_0
    //   971: getfield c0 : I
    //   974: istore #10
    //   976: aload_0
    //   977: getfield n0 : I
    //   980: istore #5
    //   982: iload #10
    //   984: iload #5
    //   986: if_icmpge -> 992
    //   989: goto -> 996
    //   992: iload #10
    //   994: istore #5
    //   996: aload_0
    //   997: getfield Z : [Lp/e$b;
    //   1000: astore #26
    //   1002: aload #26
    //   1004: iconst_0
    //   1005: aaload
    //   1006: astore #25
    //   1008: getstatic p/e$b.MATCH_CONSTRAINT : Lp/e$b;
    //   1011: astore #34
    //   1013: aload #25
    //   1015: aload #34
    //   1017: if_acmpeq -> 1026
    //   1020: iconst_1
    //   1021: istore #13
    //   1023: goto -> 1029
    //   1026: iconst_0
    //   1027: istore #13
    //   1029: aload #26
    //   1031: iconst_1
    //   1032: aaload
    //   1033: astore #26
    //   1035: aload #26
    //   1037: aload #34
    //   1039: if_acmpeq -> 1048
    //   1042: iconst_1
    //   1043: istore #17
    //   1045: goto -> 1051
    //   1048: iconst_0
    //   1049: istore #17
    //   1051: aload_0
    //   1052: getfield e0 : I
    //   1055: istore #11
    //   1057: aload_0
    //   1058: iload #11
    //   1060: putfield F : I
    //   1063: aload_0
    //   1064: getfield d0 : F
    //   1067: fstore_3
    //   1068: aload_0
    //   1069: fload_3
    //   1070: putfield G : F
    //   1073: aload_0
    //   1074: getfield w : I
    //   1077: istore #7
    //   1079: aload_0
    //   1080: getfield x : I
    //   1083: istore #8
    //   1085: fload_3
    //   1086: fconst_0
    //   1087: fcmpl
    //   1088: ifle -> 1359
    //   1091: aload_0
    //   1092: getfield s0 : I
    //   1095: bipush #8
    //   1097: if_icmpeq -> 1359
    //   1100: iload #7
    //   1102: istore #6
    //   1104: aload #25
    //   1106: aload #34
    //   1108: if_acmpne -> 1123
    //   1111: iload #7
    //   1113: istore #6
    //   1115: iload #7
    //   1117: ifne -> 1123
    //   1120: iconst_3
    //   1121: istore #6
    //   1123: iload #8
    //   1125: istore #7
    //   1127: aload #26
    //   1129: aload #34
    //   1131: if_acmpne -> 1146
    //   1134: iload #8
    //   1136: istore #7
    //   1138: iload #8
    //   1140: ifne -> 1146
    //   1143: iconst_3
    //   1144: istore #7
    //   1146: aload #25
    //   1148: aload #34
    //   1150: if_acmpne -> 1187
    //   1153: aload #26
    //   1155: aload #34
    //   1157: if_acmpne -> 1187
    //   1160: iload #6
    //   1162: iconst_3
    //   1163: if_icmpne -> 1187
    //   1166: iload #7
    //   1168: iconst_3
    //   1169: if_icmpne -> 1187
    //   1172: aload_0
    //   1173: iload #14
    //   1175: iload #12
    //   1177: iload #13
    //   1179: iload #17
    //   1181: invokevirtual o1 : (ZZZZ)V
    //   1184: goto -> 1329
    //   1187: aload #25
    //   1189: aload #34
    //   1191: if_acmpne -> 1244
    //   1194: iload #6
    //   1196: iconst_3
    //   1197: if_icmpne -> 1244
    //   1200: aload_0
    //   1201: iconst_0
    //   1202: putfield F : I
    //   1205: fload_3
    //   1206: iload #10
    //   1208: i2f
    //   1209: fmul
    //   1210: f2i
    //   1211: istore #8
    //   1213: aload #26
    //   1215: aload #34
    //   1217: if_acmpeq -> 1241
    //   1220: iload #7
    //   1222: istore #6
    //   1224: iload #5
    //   1226: istore #4
    //   1228: iconst_0
    //   1229: istore #13
    //   1231: iconst_4
    //   1232: istore #7
    //   1234: iload #8
    //   1236: istore #5
    //   1238: goto -> 1378
    //   1241: goto -> 1333
    //   1244: aload #26
    //   1246: aload #34
    //   1248: if_acmpne -> 1329
    //   1251: iload #7
    //   1253: iconst_3
    //   1254: if_icmpne -> 1329
    //   1257: aload_0
    //   1258: iconst_1
    //   1259: putfield F : I
    //   1262: iload #11
    //   1264: iconst_m1
    //   1265: if_icmpne -> 1275
    //   1268: aload_0
    //   1269: fconst_1
    //   1270: fload_3
    //   1271: fdiv
    //   1272: putfield G : F
    //   1275: aload_0
    //   1276: getfield G : F
    //   1279: iload #9
    //   1281: i2f
    //   1282: fmul
    //   1283: f2i
    //   1284: istore #8
    //   1286: iload #6
    //   1288: istore #9
    //   1290: aload #25
    //   1292: aload #34
    //   1294: if_acmpeq -> 1318
    //   1297: iconst_0
    //   1298: istore #13
    //   1300: iconst_4
    //   1301: istore #6
    //   1303: iload #4
    //   1305: istore #5
    //   1307: iload #8
    //   1309: istore #4
    //   1311: iload #9
    //   1313: istore #7
    //   1315: goto -> 1378
    //   1318: iload #4
    //   1320: istore #5
    //   1322: iload #8
    //   1324: istore #4
    //   1326: goto -> 1341
    //   1329: iload #4
    //   1331: istore #8
    //   1333: iload #5
    //   1335: istore #4
    //   1337: iload #8
    //   1339: istore #5
    //   1341: iload #6
    //   1343: istore #8
    //   1345: iload #7
    //   1347: istore #6
    //   1349: iconst_1
    //   1350: istore #13
    //   1352: iload #8
    //   1354: istore #7
    //   1356: goto -> 1378
    //   1359: iload #8
    //   1361: istore #6
    //   1363: iload #4
    //   1365: istore #8
    //   1367: iload #5
    //   1369: istore #4
    //   1371: iconst_0
    //   1372: istore #13
    //   1374: iload #8
    //   1376: istore #5
    //   1378: aload_0
    //   1379: getfield y : [I
    //   1382: astore #25
    //   1384: aload #25
    //   1386: iconst_0
    //   1387: iload #7
    //   1389: iastore
    //   1390: aload #25
    //   1392: iconst_1
    //   1393: iload #6
    //   1395: iastore
    //   1396: aload_0
    //   1397: iload #13
    //   1399: putfield h : Z
    //   1402: iload #13
    //   1404: ifeq -> 1430
    //   1407: aload_0
    //   1408: getfield F : I
    //   1411: istore #8
    //   1413: iload #8
    //   1415: ifeq -> 1424
    //   1418: iload #8
    //   1420: iconst_m1
    //   1421: if_icmpne -> 1430
    //   1424: iconst_1
    //   1425: istore #18
    //   1427: goto -> 1433
    //   1430: iconst_0
    //   1431: istore #18
    //   1433: iload #13
    //   1435: ifeq -> 1462
    //   1438: aload_0
    //   1439: getfield F : I
    //   1442: istore #8
    //   1444: iload #8
    //   1446: iconst_1
    //   1447: if_icmpeq -> 1456
    //   1450: iload #8
    //   1452: iconst_m1
    //   1453: if_icmpne -> 1462
    //   1456: iconst_1
    //   1457: istore #17
    //   1459: goto -> 1465
    //   1462: iconst_0
    //   1463: istore #17
    //   1465: aload_0
    //   1466: getfield Z : [Lp/e$b;
    //   1469: iconst_0
    //   1470: aaload
    //   1471: astore #25
    //   1473: getstatic p/e$b.WRAP_CONTENT : Lp/e$b;
    //   1476: astore #35
    //   1478: aload #25
    //   1480: aload #35
    //   1482: if_acmpne -> 1498
    //   1485: aload_0
    //   1486: instanceof p/f
    //   1489: ifeq -> 1498
    //   1492: iconst_1
    //   1493: istore #19
    //   1495: goto -> 1501
    //   1498: iconst_0
    //   1499: istore #19
    //   1501: iload #19
    //   1503: ifeq -> 1512
    //   1506: iconst_0
    //   1507: istore #5
    //   1509: goto -> 1512
    //   1512: aload_0
    //   1513: getfield V : Lp/d;
    //   1516: invokevirtual o : ()Z
    //   1519: iconst_1
    //   1520: ixor
    //   1521: istore #21
    //   1523: aload_0
    //   1524: getfield Y : [Z
    //   1527: astore #25
    //   1529: aload #25
    //   1531: iconst_0
    //   1532: baload
    //   1533: istore #23
    //   1535: aload #25
    //   1537: iconst_1
    //   1538: baload
    //   1539: istore #22
    //   1541: aload_0
    //   1542: getfield t : I
    //   1545: iconst_2
    //   1546: if_icmpeq -> 1880
    //   1549: aload_0
    //   1550: getfield p : Z
    //   1553: ifne -> 1880
    //   1556: iload_2
    //   1557: ifeq -> 1685
    //   1560: aload_0
    //   1561: getfield e : Lq/l;
    //   1564: astore #25
    //   1566: aload #25
    //   1568: ifnull -> 1685
    //   1571: aload #25
    //   1573: getfield h : Lq/f;
    //   1576: astore #26
    //   1578: aload #26
    //   1580: getfield j : Z
    //   1583: ifeq -> 1685
    //   1586: aload #25
    //   1588: getfield i : Lq/f;
    //   1591: getfield j : Z
    //   1594: ifne -> 1600
    //   1597: goto -> 1685
    //   1600: iload_2
    //   1601: ifeq -> 1682
    //   1604: aload_1
    //   1605: aload #29
    //   1607: aload #26
    //   1609: getfield g : I
    //   1612: invokevirtual f : (Lm/i;I)V
    //   1615: aload_1
    //   1616: aload #28
    //   1618: aload_0
    //   1619: getfield e : Lq/l;
    //   1622: getfield i : Lq/f;
    //   1625: getfield g : I
    //   1628: invokevirtual f : (Lm/i;I)V
    //   1631: aload_0
    //   1632: getfield a0 : Lp/e;
    //   1635: ifnull -> 1679
    //   1638: iload #14
    //   1640: ifeq -> 1679
    //   1643: aload_0
    //   1644: getfield g : [Z
    //   1647: iconst_0
    //   1648: baload
    //   1649: ifeq -> 1679
    //   1652: aload_0
    //   1653: invokevirtual i0 : ()Z
    //   1656: ifne -> 1679
    //   1659: aload_1
    //   1660: aload_1
    //   1661: aload_0
    //   1662: getfield a0 : Lp/e;
    //   1665: getfield Q : Lp/d;
    //   1668: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   1671: aload #28
    //   1673: iconst_0
    //   1674: bipush #8
    //   1676: invokevirtual h : (Lm/i;Lm/i;II)V
    //   1679: goto -> 1880
    //   1682: goto -> 1880
    //   1685: aload_0
    //   1686: getfield a0 : Lp/e;
    //   1689: astore #25
    //   1691: aload #25
    //   1693: ifnull -> 1710
    //   1696: aload_1
    //   1697: aload #25
    //   1699: getfield Q : Lp/d;
    //   1702: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   1705: astore #25
    //   1707: goto -> 1713
    //   1710: aconst_null
    //   1711: astore #25
    //   1713: aload_0
    //   1714: getfield a0 : Lp/e;
    //   1717: astore #26
    //   1719: aload #26
    //   1721: ifnull -> 1738
    //   1724: aload_1
    //   1725: aload #26
    //   1727: getfield O : Lp/d;
    //   1730: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   1733: astore #26
    //   1735: goto -> 1741
    //   1738: aconst_null
    //   1739: astore #26
    //   1741: aload_0
    //   1742: getfield g : [Z
    //   1745: iconst_0
    //   1746: baload
    //   1747: istore #24
    //   1749: aload_0
    //   1750: getfield Z : [Lp/e$b;
    //   1753: astore #32
    //   1755: aload #32
    //   1757: iconst_0
    //   1758: aaload
    //   1759: astore #33
    //   1761: aload_0
    //   1762: getfield O : Lp/d;
    //   1765: astore #36
    //   1767: aload_0
    //   1768: getfield Q : Lp/d;
    //   1771: astore #37
    //   1773: aload_0
    //   1774: getfield f0 : I
    //   1777: istore #8
    //   1779: aload_0
    //   1780: getfield m0 : I
    //   1783: istore #9
    //   1785: aload_0
    //   1786: getfield H : [I
    //   1789: iconst_0
    //   1790: iaload
    //   1791: istore #10
    //   1793: aload_0
    //   1794: getfield o0 : F
    //   1797: fstore_3
    //   1798: aload #32
    //   1800: iconst_1
    //   1801: aaload
    //   1802: aload #34
    //   1804: if_acmpne -> 1813
    //   1807: iconst_1
    //   1808: istore #20
    //   1810: goto -> 1816
    //   1813: iconst_0
    //   1814: istore #20
    //   1816: aload_0
    //   1817: aload_1
    //   1818: iconst_1
    //   1819: iload #14
    //   1821: iload #12
    //   1823: iload #24
    //   1825: aload #26
    //   1827: aload #25
    //   1829: aload #33
    //   1831: iload #19
    //   1833: aload #36
    //   1835: aload #37
    //   1837: iload #8
    //   1839: iload #5
    //   1841: iload #9
    //   1843: iload #10
    //   1845: fload_3
    //   1846: iload #18
    //   1848: iload #20
    //   1850: iload #16
    //   1852: iload #15
    //   1854: iload #23
    //   1856: iload #7
    //   1858: iload #6
    //   1860: aload_0
    //   1861: getfield z : I
    //   1864: aload_0
    //   1865: getfield A : I
    //   1868: aload_0
    //   1869: getfield B : F
    //   1872: iload #21
    //   1874: invokespecial i : (Lm/d;ZZZZLm/i;Lm/i;Lp/e$b;ZLp/d;Lp/d;IIIIFZZZZZIIIIFZ)V
    //   1877: goto -> 1880
    //   1880: aload #31
    //   1882: astore #26
    //   1884: aload #30
    //   1886: astore #25
    //   1888: iload #12
    //   1890: istore #19
    //   1892: aload #28
    //   1894: astore #30
    //   1896: iload_2
    //   1897: ifeq -> 2071
    //   1900: aload_0
    //   1901: astore #28
    //   1903: aload #28
    //   1905: getfield f : Lq/n;
    //   1908: astore #31
    //   1910: aload #31
    //   1912: ifnull -> 2068
    //   1915: aload #31
    //   1917: getfield h : Lq/f;
    //   1920: astore #32
    //   1922: aload #32
    //   1924: getfield j : Z
    //   1927: ifeq -> 2068
    //   1930: aload #31
    //   1932: getfield i : Lq/f;
    //   1935: getfield j : Z
    //   1938: ifeq -> 2068
    //   1941: aload #32
    //   1943: getfield g : I
    //   1946: istore #5
    //   1948: aload_1
    //   1949: astore #31
    //   1951: aload #31
    //   1953: aload #26
    //   1955: iload #5
    //   1957: invokevirtual f : (Lm/i;I)V
    //   1960: aload #28
    //   1962: getfield f : Lq/n;
    //   1965: getfield i : Lq/f;
    //   1968: getfield g : I
    //   1971: istore #5
    //   1973: aload #25
    //   1975: astore #32
    //   1977: aload #31
    //   1979: aload #32
    //   1981: iload #5
    //   1983: invokevirtual f : (Lm/i;I)V
    //   1986: aload #31
    //   1988: aload #27
    //   1990: aload #28
    //   1992: getfield f : Lq/n;
    //   1995: getfield k : Lq/f;
    //   1998: getfield g : I
    //   2001: invokevirtual f : (Lm/i;I)V
    //   2004: aload #28
    //   2006: getfield a0 : Lp/e;
    //   2009: astore #33
    //   2011: aload #33
    //   2013: ifnull -> 2062
    //   2016: iload #15
    //   2018: ifne -> 2062
    //   2021: iload #19
    //   2023: ifeq -> 2062
    //   2026: aload #28
    //   2028: getfield g : [Z
    //   2031: iconst_1
    //   2032: baload
    //   2033: ifeq -> 2059
    //   2036: aload #31
    //   2038: aload #31
    //   2040: aload #33
    //   2042: getfield R : Lp/d;
    //   2045: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   2048: aload #32
    //   2050: iconst_0
    //   2051: bipush #8
    //   2053: invokevirtual h : (Lm/i;Lm/i;II)V
    //   2056: goto -> 2062
    //   2059: goto -> 2062
    //   2062: iconst_0
    //   2063: istore #5
    //   2065: goto -> 2074
    //   2068: goto -> 2071
    //   2071: iconst_1
    //   2072: istore #5
    //   2074: aload_0
    //   2075: astore #31
    //   2077: aload_1
    //   2078: astore #32
    //   2080: aload #27
    //   2082: astore #33
    //   2084: aload #31
    //   2086: getfield u : I
    //   2089: iconst_2
    //   2090: if_icmpne -> 2099
    //   2093: iconst_0
    //   2094: istore #5
    //   2096: goto -> 2099
    //   2099: iload #5
    //   2101: ifeq -> 2515
    //   2104: aload #31
    //   2106: getfield q : Z
    //   2109: ifne -> 2515
    //   2112: aload #31
    //   2114: getfield Z : [Lp/e$b;
    //   2117: iconst_1
    //   2118: aaload
    //   2119: aload #35
    //   2121: if_acmpne -> 2137
    //   2124: aload #31
    //   2126: instanceof p/f
    //   2129: ifeq -> 2137
    //   2132: iconst_1
    //   2133: istore_2
    //   2134: goto -> 2139
    //   2137: iconst_0
    //   2138: istore_2
    //   2139: iload_2
    //   2140: ifeq -> 2146
    //   2143: iconst_0
    //   2144: istore #4
    //   2146: aload #31
    //   2148: getfield a0 : Lp/e;
    //   2151: astore #27
    //   2153: aload #27
    //   2155: ifnull -> 2173
    //   2158: aload #32
    //   2160: aload #27
    //   2162: getfield R : Lp/d;
    //   2165: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   2168: astore #27
    //   2170: goto -> 2176
    //   2173: aconst_null
    //   2174: astore #27
    //   2176: aload #31
    //   2178: getfield a0 : Lp/e;
    //   2181: astore #28
    //   2183: aload #28
    //   2185: ifnull -> 2203
    //   2188: aload #32
    //   2190: aload #28
    //   2192: getfield P : Lp/d;
    //   2195: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   2198: astore #28
    //   2200: goto -> 2206
    //   2203: aconst_null
    //   2204: astore #28
    //   2206: aload #31
    //   2208: getfield l0 : I
    //   2211: ifgt -> 2224
    //   2214: aload #31
    //   2216: getfield s0 : I
    //   2219: bipush #8
    //   2221: if_icmpne -> 2362
    //   2224: aload #31
    //   2226: getfield S : Lp/d;
    //   2229: astore #35
    //   2231: aload #35
    //   2233: getfield f : Lp/d;
    //   2236: ifnull -> 2316
    //   2239: aload #32
    //   2241: aload #33
    //   2243: aload #26
    //   2245: aload_0
    //   2246: invokevirtual p : ()I
    //   2249: bipush #8
    //   2251: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   2254: pop
    //   2255: aload #32
    //   2257: aload #33
    //   2259: aload #32
    //   2261: aload #31
    //   2263: getfield S : Lp/d;
    //   2266: getfield f : Lp/d;
    //   2269: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   2272: aload #31
    //   2274: getfield S : Lp/d;
    //   2277: invokevirtual f : ()I
    //   2280: bipush #8
    //   2282: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   2285: pop
    //   2286: iload #19
    //   2288: ifeq -> 2310
    //   2291: aload #32
    //   2293: aload #27
    //   2295: aload #32
    //   2297: aload #31
    //   2299: getfield R : Lp/d;
    //   2302: invokevirtual q : (Ljava/lang/Object;)Lm/i;
    //   2305: iconst_0
    //   2306: iconst_5
    //   2307: invokevirtual h : (Lm/i;Lm/i;II)V
    //   2310: iconst_0
    //   2311: istore #12
    //   2313: goto -> 2366
    //   2316: aload #31
    //   2318: getfield s0 : I
    //   2321: bipush #8
    //   2323: if_icmpne -> 2346
    //   2326: aload #32
    //   2328: aload #33
    //   2330: aload #26
    //   2332: aload #35
    //   2334: invokevirtual f : ()I
    //   2337: bipush #8
    //   2339: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   2342: pop
    //   2343: goto -> 2362
    //   2346: aload #32
    //   2348: aload #33
    //   2350: aload #26
    //   2352: aload_0
    //   2353: invokevirtual p : ()I
    //   2356: bipush #8
    //   2358: invokevirtual e : (Lm/i;Lm/i;II)Lm/b;
    //   2361: pop
    //   2362: iload #21
    //   2364: istore #12
    //   2366: aload #31
    //   2368: getfield g : [Z
    //   2371: iconst_1
    //   2372: baload
    //   2373: istore #20
    //   2375: aload #31
    //   2377: getfield Z : [Lp/e$b;
    //   2380: astore #32
    //   2382: aload #32
    //   2384: iconst_1
    //   2385: aaload
    //   2386: astore #33
    //   2388: aload #31
    //   2390: getfield P : Lp/d;
    //   2393: astore #35
    //   2395: aload #31
    //   2397: getfield R : Lp/d;
    //   2400: astore #36
    //   2402: aload #31
    //   2404: getfield g0 : I
    //   2407: istore #5
    //   2409: aload #31
    //   2411: getfield n0 : I
    //   2414: istore #8
    //   2416: aload #31
    //   2418: getfield H : [I
    //   2421: iconst_1
    //   2422: iaload
    //   2423: istore #9
    //   2425: aload #31
    //   2427: getfield p0 : F
    //   2430: fstore_3
    //   2431: aload #32
    //   2433: iconst_0
    //   2434: aaload
    //   2435: aload #34
    //   2437: if_acmpne -> 2446
    //   2440: iconst_1
    //   2441: istore #18
    //   2443: goto -> 2449
    //   2446: iconst_0
    //   2447: istore #18
    //   2449: aload_0
    //   2450: aload_1
    //   2451: iconst_0
    //   2452: iload #19
    //   2454: iload #14
    //   2456: iload #20
    //   2458: aload #28
    //   2460: aload #27
    //   2462: aload #33
    //   2464: iload_2
    //   2465: aload #35
    //   2467: aload #36
    //   2469: iload #5
    //   2471: iload #4
    //   2473: iload #8
    //   2475: iload #9
    //   2477: fload_3
    //   2478: iload #17
    //   2480: iload #18
    //   2482: iload #15
    //   2484: iload #16
    //   2486: iload #22
    //   2488: iload #6
    //   2490: iload #7
    //   2492: aload #31
    //   2494: getfield C : I
    //   2497: aload #31
    //   2499: getfield D : I
    //   2502: aload #31
    //   2504: getfield E : F
    //   2507: iload #12
    //   2509: invokespecial i : (Lm/d;ZZZZLm/i;Lm/i;Lp/e$b;ZLp/d;Lp/d;IIIIFZZZZZIIIIFZ)V
    //   2512: goto -> 2515
    //   2515: iload #13
    //   2517: ifeq -> 2576
    //   2520: aload_0
    //   2521: astore #27
    //   2523: aload #27
    //   2525: getfield F : I
    //   2528: iconst_1
    //   2529: if_icmpne -> 2554
    //   2532: aload_1
    //   2533: aload #25
    //   2535: aload #26
    //   2537: aload #30
    //   2539: aload #29
    //   2541: aload #27
    //   2543: getfield G : F
    //   2546: bipush #8
    //   2548: invokevirtual k : (Lm/i;Lm/i;Lm/i;Lm/i;FI)V
    //   2551: goto -> 2576
    //   2554: aload_1
    //   2555: aload #30
    //   2557: aload #29
    //   2559: aload #25
    //   2561: aload #26
    //   2563: aload #27
    //   2565: getfield G : F
    //   2568: bipush #8
    //   2570: invokevirtual k : (Lm/i;Lm/i;Lm/i;Lm/i;FI)V
    //   2573: goto -> 2576
    //   2576: aload_0
    //   2577: astore #25
    //   2579: aload #25
    //   2581: getfield V : Lp/d;
    //   2584: invokevirtual o : ()Z
    //   2587: ifeq -> 2629
    //   2590: aload_1
    //   2591: aload #25
    //   2593: aload #25
    //   2595: getfield V : Lp/d;
    //   2598: invokevirtual j : ()Lp/d;
    //   2601: invokevirtual h : ()Lp/e;
    //   2604: aload #25
    //   2606: getfield I : F
    //   2609: ldc_w 90.0
    //   2612: fadd
    //   2613: f2d
    //   2614: invokestatic toRadians : (D)D
    //   2617: d2f
    //   2618: aload #25
    //   2620: getfield V : Lp/d;
    //   2623: invokevirtual f : ()I
    //   2626: invokevirtual b : (Lp/e;Lp/e;FI)V
    //   2629: aload #25
    //   2631: iconst_0
    //   2632: putfield p : Z
    //   2635: aload #25
    //   2637: iconst_0
    //   2638: putfield q : Z
    //   2641: return
  }
  
  public boolean g0() {
    return this.r;
  }
  
  public void g1(b paramb) {
    this.Z[1] = paramb;
  }
  
  public boolean h() {
    return (this.s0 != 8);
  }
  
  public boolean h0(int paramInt) {
    return this.Y[paramInt];
  }
  
  public void h1(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    this.x = paramInt1;
    this.C = paramInt2;
    paramInt2 = paramInt3;
    if (paramInt3 == Integer.MAX_VALUE)
      paramInt2 = 0; 
    this.D = paramInt2;
    this.E = paramFloat;
    if (paramFloat > 0.0F && paramFloat < 1.0F && paramInt1 == 0)
      this.x = 2; 
  }
  
  public boolean i0() {
    d d1 = this.O;
    d d2 = d1.f;
    if (d2 == null || d2.f != d1) {
      d1 = this.Q;
      d2 = d1.f;
      if (d2 == null || d2.f != d1)
        return false; 
    } 
    return true;
  }
  
  public void i1(float paramFloat) {
    this.D0[1] = paramFloat;
  }
  
  public void j(d.b paramb1, e parame, d.b paramb2, int paramInt) {
    d d1;
    d.b b1 = d.b.CENTER;
    if (paramb1 == b1) {
      if (paramb2 == b1) {
        paramb1 = d.b.LEFT;
        d1 = o(paramb1);
        d.b b2 = d.b.RIGHT;
        d d2 = o(b2);
        d.b b3 = d.b.TOP;
        d d3 = o(b3);
        d.b b4 = d.b.BOTTOM;
        d d4 = o(b4);
        boolean bool = true;
        if ((d1 != null && d1.o()) || (d2 != null && d2.o())) {
          paramInt = 0;
        } else {
          j(paramb1, parame, paramb1, 0);
          j(b2, parame, b2, 0);
          paramInt = 1;
        } 
        if ((d3 != null && d3.o()) || (d4 != null && d4.o())) {
          bool = false;
        } else {
          j(b3, parame, b3, 0);
          j(b4, parame, b4, 0);
        } 
        if (paramInt != 0 && bool) {
          o(b1).a(parame.o(b1), 0);
          return;
        } 
        if (paramInt != 0) {
          paramb1 = d.b.CENTER_X;
          o(paramb1).a(parame.o(paramb1), 0);
          return;
        } 
        if (bool) {
          paramb1 = d.b.CENTER_Y;
          o(paramb1).a(parame.o(paramb1), 0);
          return;
        } 
      } else {
        paramb1 = d.b.LEFT;
        if (d1 == paramb1 || d1 == d.b.RIGHT) {
          j(paramb1, parame, (d.b)d1, 0);
          paramb1 = d.b.RIGHT;
          try {
            j(paramb1, parame, (d.b)d1, 0);
            o(b1).a(parame.o((d.b)d1), 0);
            return;
          } finally {}
        } 
        paramb1 = d.b.TOP;
        if (d1 == paramb1 || d1 == d.b.BOTTOM) {
          j(paramb1, parame, (d.b)d1, 0);
          j(d.b.BOTTOM, parame, (d.b)d1, 0);
          o(b1).a(parame.o((d.b)d1), 0);
          return;
        } 
      } 
    } else {
      d d2;
      d.b b2;
      d.b b3 = d.b.CENTER_X;
      if (paramb1 == b3) {
        d.b b5 = d.b.LEFT;
        if (d1 == b5 || d1 == d.b.RIGHT) {
          d2 = o(b5);
          d3 = parame.o((d.b)d1);
          d1 = o(d.b.RIGHT);
          d2.a(d3, 0);
          d1.a(d3, 0);
          o(b3).a(d3, 0);
          return;
        } 
      } 
      d.b b4 = d.b.CENTER_Y;
      if (d2 == b4) {
        d.b b5 = d.b.TOP;
        if (d1 == b5 || d1 == d.b.BOTTOM) {
          d2 = d3.o((d.b)d1);
          o(b5).a(d2, 0);
          o(d.b.BOTTOM).a(d2, 0);
          o(b4).a(d2, 0);
          return;
        } 
      } 
      if (d2 == b3 && d1 == b3) {
        b2 = d.b.LEFT;
        o(b2).a(d3.o(b2), 0);
        b2 = d.b.RIGHT;
        o(b2).a(d3.o(b2), 0);
        o(b3).a(d3.o((d.b)d1), 0);
        return;
      } 
      if (b2 == b4 && d1 == b4) {
        b2 = d.b.TOP;
        o(b2).a(d3.o(b2), 0);
        b2 = d.b.BOTTOM;
        o(b2).a(d3.o(b2), 0);
        o(b4).a(d3.o((d.b)d1), 0);
        return;
      } 
      d d4 = o(b2);
      d d3 = d3.o((d.b)d1);
      if (d4.p(d3)) {
        d d5;
        d d6;
        d.b b5 = d.b.BASELINE;
        if (b2 == b5) {
          d5 = o(d.b.TOP);
          d6 = o(d.b.BOTTOM);
          if (d5 != null)
            d5.q(); 
          if (d6 != null)
            d6.q(); 
        } else if (d5 == d.b.TOP || d5 == d.b.BOTTOM) {
          d6 = o((d.b)d6);
          if (d6 != null)
            d6.q(); 
          d6 = o(b1);
          if (d6.j() != d3)
            d6.q(); 
          d5 = o((d.b)d5).g();
          d6 = o(b4);
          if (d6.o()) {
            d5.q();
            d6.q();
          } 
        } else if (d5 == d.b.LEFT || d5 == d.b.RIGHT) {
          d6 = o(b1);
          if (d6.j() != d3)
            d6.q(); 
          d5 = o((d.b)d5).g();
          d6 = o(b3);
          if (d6.o()) {
            d5.q();
            d6.q();
          } 
        } 
        d4.a(d3, paramInt);
      } 
    } 
  }
  
  public boolean j0() {
    return this.K;
  }
  
  public void j1(int paramInt) {
    this.s0 = paramInt;
  }
  
  public void k(d paramd1, d paramd2, int paramInt) {
    if (paramd1.h() == this)
      j(paramd1.k(), paramd2.h(), paramd2.k(), paramInt); 
  }
  
  public boolean k0() {
    d d1 = this.P;
    d d2 = d1.f;
    if (d2 == null || d2.f != d1) {
      d1 = this.R;
      d2 = d1.f;
      if (d2 == null || d2.f != d1)
        return false; 
    } 
    return true;
  }
  
  public void k1(int paramInt) {
    this.b0 = paramInt;
    int i = this.m0;
    if (paramInt < i)
      this.b0 = i; 
  }
  
  public void l(e parame, float paramFloat, int paramInt) {
    d.b b1 = d.b.CENTER;
    e0(b1, parame, b1, paramInt, 0);
    this.I = paramFloat;
  }
  
  public boolean l0() {
    return this.L;
  }
  
  public void l1(int paramInt) {
    if (paramInt >= 0 && paramInt <= 3)
      this.v = paramInt; 
  }
  
  public void m(d paramd) {
    paramd.q(this.O);
    paramd.q(this.P);
    paramd.q(this.Q);
    paramd.q(this.R);
    if (this.l0 > 0)
      paramd.q(this.S); 
  }
  
  public boolean m0() {
    return (this.i && this.s0 != 8);
  }
  
  public void m1(int paramInt) {
    this.f0 = paramInt;
  }
  
  public void n() {
    if (this.e == null)
      this.e = new l(this); 
    if (this.f == null)
      this.f = new n(this); 
  }
  
  public boolean n0() {
    return (this.p || (this.O.n() && this.Q.n()));
  }
  
  public void n1(int paramInt) {
    this.g0 = paramInt;
  }
  
  public d o(d.b paramb) {
    switch (a.a[paramb.ordinal()]) {
      default:
        throw new AssertionError(paramb.name());
      case 9:
        return null;
      case 8:
        return this.U;
      case 7:
        return this.T;
      case 6:
        return this.V;
      case 5:
        return this.S;
      case 4:
        return this.R;
      case 3:
        return this.Q;
      case 2:
        return this.P;
      case 1:
        break;
    } 
    return this.O;
  }
  
  public boolean o0() {
    return (this.q || (this.P.n() && this.R.n()));
  }
  
  public void o1(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    if (this.F == -1)
      if (paramBoolean3 && !paramBoolean4) {
        this.F = 0;
      } else if (!paramBoolean3 && paramBoolean4) {
        this.F = 1;
        if (this.e0 == -1)
          this.G = 1.0F / this.G; 
      }  
    if (this.F == 0 && (!this.P.o() || !this.R.o())) {
      this.F = 1;
    } else if (this.F == 1 && (!this.O.o() || !this.Q.o())) {
      this.F = 0;
    } 
    if (this.F == -1 && (!this.P.o() || !this.R.o() || !this.O.o() || !this.Q.o()))
      if (this.P.o() && this.R.o()) {
        this.F = 0;
      } else if (this.O.o() && this.Q.o()) {
        this.G = 1.0F / this.G;
        this.F = 1;
      }  
    if (this.F == -1) {
      int i = this.z;
      if (i > 0 && this.C == 0) {
        this.F = 0;
        return;
      } 
      if (i == 0 && this.C > 0) {
        this.G = 1.0F / this.G;
        this.F = 1;
      } 
    } 
  }
  
  public int p() {
    return this.l0;
  }
  
  public boolean p0() {
    return this.s;
  }
  
  public void p1(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield e : Lq/l;
    //   5: invokevirtual k : ()Z
    //   8: iand
    //   9: istore #9
    //   11: iload_2
    //   12: aload_0
    //   13: getfield f : Lq/n;
    //   16: invokevirtual k : ()Z
    //   19: iand
    //   20: istore #8
    //   22: aload_0
    //   23: getfield e : Lq/l;
    //   26: astore #10
    //   28: aload #10
    //   30: getfield h : Lq/f;
    //   33: getfield g : I
    //   36: istore #4
    //   38: aload_0
    //   39: getfield f : Lq/n;
    //   42: astore #11
    //   44: aload #11
    //   46: getfield h : Lq/f;
    //   49: getfield g : I
    //   52: istore_3
    //   53: aload #10
    //   55: getfield i : Lq/f;
    //   58: getfield g : I
    //   61: istore #6
    //   63: aload #11
    //   65: getfield i : Lq/f;
    //   68: getfield g : I
    //   71: istore #7
    //   73: iload #6
    //   75: iload #4
    //   77: isub
    //   78: iflt -> 150
    //   81: iload #7
    //   83: iload_3
    //   84: isub
    //   85: iflt -> 150
    //   88: iload #4
    //   90: ldc_w -2147483648
    //   93: if_icmpeq -> 150
    //   96: iload #4
    //   98: ldc 2147483647
    //   100: if_icmpeq -> 150
    //   103: iload_3
    //   104: ldc_w -2147483648
    //   107: if_icmpeq -> 150
    //   110: iload_3
    //   111: ldc 2147483647
    //   113: if_icmpeq -> 150
    //   116: iload #6
    //   118: ldc_w -2147483648
    //   121: if_icmpeq -> 150
    //   124: iload #6
    //   126: ldc 2147483647
    //   128: if_icmpeq -> 150
    //   131: iload #7
    //   133: ldc_w -2147483648
    //   136: if_icmpeq -> 150
    //   139: iload #7
    //   141: istore #5
    //   143: iload #7
    //   145: ldc 2147483647
    //   147: if_icmpne -> 161
    //   150: iconst_0
    //   151: istore #6
    //   153: iconst_0
    //   154: istore #4
    //   156: iconst_0
    //   157: istore #5
    //   159: iconst_0
    //   160: istore_3
    //   161: iload #6
    //   163: iload #4
    //   165: isub
    //   166: istore #6
    //   168: iload #5
    //   170: iload_3
    //   171: isub
    //   172: istore #5
    //   174: iload #9
    //   176: ifeq -> 185
    //   179: aload_0
    //   180: iload #4
    //   182: putfield f0 : I
    //   185: iload #8
    //   187: ifeq -> 195
    //   190: aload_0
    //   191: iload_3
    //   192: putfield g0 : I
    //   195: aload_0
    //   196: getfield s0 : I
    //   199: bipush #8
    //   201: if_icmpne -> 215
    //   204: aload_0
    //   205: iconst_0
    //   206: putfield b0 : I
    //   209: aload_0
    //   210: iconst_0
    //   211: putfield c0 : I
    //   214: return
    //   215: iload #9
    //   217: ifeq -> 277
    //   220: iload #6
    //   222: istore_3
    //   223: aload_0
    //   224: getfield Z : [Lp/e$b;
    //   227: iconst_0
    //   228: aaload
    //   229: getstatic p/e$b.FIXED : Lp/e$b;
    //   232: if_acmpne -> 254
    //   235: aload_0
    //   236: getfield b0 : I
    //   239: istore #4
    //   241: iload #6
    //   243: istore_3
    //   244: iload #6
    //   246: iload #4
    //   248: if_icmpge -> 254
    //   251: iload #4
    //   253: istore_3
    //   254: aload_0
    //   255: iload_3
    //   256: putfield b0 : I
    //   259: aload_0
    //   260: getfield m0 : I
    //   263: istore #4
    //   265: iload_3
    //   266: iload #4
    //   268: if_icmpge -> 277
    //   271: aload_0
    //   272: iload #4
    //   274: putfield b0 : I
    //   277: iload #8
    //   279: ifeq -> 339
    //   282: iload #5
    //   284: istore_3
    //   285: aload_0
    //   286: getfield Z : [Lp/e$b;
    //   289: iconst_1
    //   290: aaload
    //   291: getstatic p/e$b.FIXED : Lp/e$b;
    //   294: if_acmpne -> 316
    //   297: aload_0
    //   298: getfield c0 : I
    //   301: istore #4
    //   303: iload #5
    //   305: istore_3
    //   306: iload #5
    //   308: iload #4
    //   310: if_icmpge -> 316
    //   313: iload #4
    //   315: istore_3
    //   316: aload_0
    //   317: iload_3
    //   318: putfield c0 : I
    //   321: aload_0
    //   322: getfield n0 : I
    //   325: istore #4
    //   327: iload_3
    //   328: iload #4
    //   330: if_icmpge -> 339
    //   333: aload_0
    //   334: iload #4
    //   336: putfield c0 : I
    //   339: return
  }
  
  public float q(int paramInt) {
    return (paramInt == 0) ? this.o0 : ((paramInt == 1) ? this.p0 : -1.0F);
  }
  
  public void q0() {
    this.r = true;
  }
  
  public void q1(d paramd, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield O : Lp/d;
    //   5: invokevirtual x : (Ljava/lang/Object;)I
    //   8: istore #4
    //   10: aload_1
    //   11: aload_0
    //   12: getfield P : Lp/d;
    //   15: invokevirtual x : (Ljava/lang/Object;)I
    //   18: istore #7
    //   20: aload_1
    //   21: aload_0
    //   22: getfield Q : Lp/d;
    //   25: invokevirtual x : (Ljava/lang/Object;)I
    //   28: istore #6
    //   30: aload_1
    //   31: aload_0
    //   32: getfield R : Lp/d;
    //   35: invokevirtual x : (Ljava/lang/Object;)I
    //   38: istore #8
    //   40: iload #4
    //   42: istore #5
    //   44: iload #6
    //   46: istore_3
    //   47: iload_2
    //   48: ifeq -> 123
    //   51: aload_0
    //   52: getfield e : Lq/l;
    //   55: astore #9
    //   57: iload #4
    //   59: istore #5
    //   61: iload #6
    //   63: istore_3
    //   64: aload #9
    //   66: ifnull -> 123
    //   69: aload #9
    //   71: getfield h : Lq/f;
    //   74: astore_1
    //   75: iload #4
    //   77: istore #5
    //   79: iload #6
    //   81: istore_3
    //   82: aload_1
    //   83: getfield j : Z
    //   86: ifeq -> 123
    //   89: aload #9
    //   91: getfield i : Lq/f;
    //   94: astore #9
    //   96: iload #4
    //   98: istore #5
    //   100: iload #6
    //   102: istore_3
    //   103: aload #9
    //   105: getfield j : Z
    //   108: ifeq -> 123
    //   111: aload_1
    //   112: getfield g : I
    //   115: istore #5
    //   117: aload #9
    //   119: getfield g : I
    //   122: istore_3
    //   123: iload #7
    //   125: istore #6
    //   127: iload #8
    //   129: istore #4
    //   131: iload_2
    //   132: ifeq -> 211
    //   135: aload_0
    //   136: getfield f : Lq/n;
    //   139: astore #9
    //   141: iload #7
    //   143: istore #6
    //   145: iload #8
    //   147: istore #4
    //   149: aload #9
    //   151: ifnull -> 211
    //   154: aload #9
    //   156: getfield h : Lq/f;
    //   159: astore_1
    //   160: iload #7
    //   162: istore #6
    //   164: iload #8
    //   166: istore #4
    //   168: aload_1
    //   169: getfield j : Z
    //   172: ifeq -> 211
    //   175: aload #9
    //   177: getfield i : Lq/f;
    //   180: astore #9
    //   182: iload #7
    //   184: istore #6
    //   186: iload #8
    //   188: istore #4
    //   190: aload #9
    //   192: getfield j : Z
    //   195: ifeq -> 211
    //   198: aload_1
    //   199: getfield g : I
    //   202: istore #6
    //   204: aload #9
    //   206: getfield g : I
    //   209: istore #4
    //   211: iload_3
    //   212: iload #5
    //   214: isub
    //   215: iflt -> 290
    //   218: iload #4
    //   220: iload #6
    //   222: isub
    //   223: iflt -> 290
    //   226: iload #5
    //   228: ldc_w -2147483648
    //   231: if_icmpeq -> 290
    //   234: iload #5
    //   236: ldc 2147483647
    //   238: if_icmpeq -> 290
    //   241: iload #6
    //   243: ldc_w -2147483648
    //   246: if_icmpeq -> 290
    //   249: iload #6
    //   251: ldc 2147483647
    //   253: if_icmpeq -> 290
    //   256: iload_3
    //   257: ldc_w -2147483648
    //   260: if_icmpeq -> 290
    //   263: iload_3
    //   264: ldc 2147483647
    //   266: if_icmpeq -> 290
    //   269: iload #4
    //   271: ldc_w -2147483648
    //   274: if_icmpeq -> 290
    //   277: iload_3
    //   278: istore #7
    //   280: iload #4
    //   282: istore_3
    //   283: iload #4
    //   285: ldc 2147483647
    //   287: if_icmpne -> 301
    //   290: iconst_0
    //   291: istore #5
    //   293: iconst_0
    //   294: istore_3
    //   295: iconst_0
    //   296: istore #6
    //   298: iconst_0
    //   299: istore #7
    //   301: aload_0
    //   302: iload #5
    //   304: iload #6
    //   306: iload #7
    //   308: iload_3
    //   309: invokevirtual J0 : (IIII)V
    //   312: return
  }
  
  public int r() {
    return Y() + this.c0;
  }
  
  public void r0() {
    this.s = true;
  }
  
  public Object s() {
    return this.q0;
  }
  
  public boolean s0() {
    b[] arrayOfB = this.Z;
    boolean bool2 = false;
    b b1 = arrayOfB[0];
    b b2 = b.MATCH_CONSTRAINT;
    boolean bool1 = bool2;
    if (b1 == b2) {
      bool1 = bool2;
      if (arrayOfB[1] == b2)
        bool1 = true; 
    } 
    return bool1;
  }
  
  public String t() {
    return this.u0;
  }
  
  public void t0() {
    this.O.q();
    this.P.q();
    this.Q.q();
    this.R.q();
    this.S.q();
    this.T.q();
    this.U.q();
    this.V.q();
    this.a0 = null;
    this.I = 0.0F;
    this.b0 = 0;
    this.c0 = 0;
    this.d0 = 0.0F;
    this.e0 = -1;
    this.f0 = 0;
    this.g0 = 0;
    this.j0 = 0;
    this.k0 = 0;
    this.l0 = 0;
    this.m0 = 0;
    this.n0 = 0;
    float f = K0;
    this.o0 = f;
    this.p0 = f;
    b[] arrayOfB = this.Z;
    b b1 = b.FIXED;
    arrayOfB[0] = b1;
    arrayOfB[1] = b1;
    this.q0 = null;
    this.r0 = 0;
    this.s0 = 0;
    this.v0 = null;
    this.w0 = false;
    this.x0 = false;
    this.z0 = 0;
    this.A0 = 0;
    this.B0 = false;
    this.C0 = false;
    float[] arrayOfFloat = this.D0;
    arrayOfFloat[0] = -1.0F;
    arrayOfFloat[1] = -1.0F;
    this.t = -1;
    this.u = -1;
    int[] arrayOfInt2 = this.H;
    arrayOfInt2[0] = Integer.MAX_VALUE;
    arrayOfInt2[1] = Integer.MAX_VALUE;
    this.w = 0;
    this.x = 0;
    this.B = 1.0F;
    this.E = 1.0F;
    this.A = Integer.MAX_VALUE;
    this.D = Integer.MAX_VALUE;
    this.z = 0;
    this.C = 0;
    this.h = false;
    this.F = -1;
    this.G = 1.0F;
    this.y0 = false;
    boolean[] arrayOfBoolean = this.g;
    arrayOfBoolean[0] = true;
    arrayOfBoolean[1] = true;
    this.L = false;
    arrayOfBoolean = this.Y;
    arrayOfBoolean[0] = false;
    arrayOfBoolean[1] = false;
    this.i = true;
    int[] arrayOfInt1 = this.y;
    arrayOfInt1[0] = 0;
    arrayOfInt1[1] = 0;
    this.l = -1;
    this.m = -1;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    String str1 = this.v0;
    String str2 = "";
    if (str1 != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("type: ");
      stringBuilder1.append(this.v0);
      stringBuilder1.append(" ");
      String str = stringBuilder1.toString();
    } else {
      str1 = "";
    } 
    stringBuilder.append(str1);
    str1 = str2;
    if (this.u0 != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("id: ");
      stringBuilder1.append(this.u0);
      stringBuilder1.append(" ");
      str1 = stringBuilder1.toString();
    } 
    stringBuilder.append(str1);
    stringBuilder.append("(");
    stringBuilder.append(this.f0);
    stringBuilder.append(", ");
    stringBuilder.append(this.g0);
    stringBuilder.append(") - (");
    stringBuilder.append(this.b0);
    stringBuilder.append(" x ");
    stringBuilder.append(this.c0);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public b u(int paramInt) {
    return (paramInt == 0) ? A() : ((paramInt == 1) ? T() : null);
  }
  
  public void u0() {
    e e1 = K();
    if (e1 != null && e1 instanceof f && ((f)K()).L1())
      return; 
    int j = this.X.size();
    for (int i = 0; i < j; i++)
      ((d)this.X.get(i)).q(); 
  }
  
  public float v() {
    return this.d0;
  }
  
  public void v0() {
    int i = 0;
    this.p = false;
    this.q = false;
    this.r = false;
    this.s = false;
    int j = this.X.size();
    while (i < j) {
      ((d)this.X.get(i)).r();
      i++;
    } 
  }
  
  public int w() {
    return this.e0;
  }
  
  public void w0(c paramc) {
    this.O.s(paramc);
    this.P.s(paramc);
    this.Q.s(paramc);
    this.R.s(paramc);
    this.S.s(paramc);
    this.V.s(paramc);
    this.T.s(paramc);
    this.U.s(paramc);
  }
  
  public int x() {
    return (this.s0 == 8) ? 0 : this.c0;
  }
  
  public float y() {
    return this.o0;
  }
  
  public int z() {
    return this.z0;
  }
  
  public enum b {
    FIXED, MATCH_CONSTRAINT, MATCH_PARENT, WRAP_CONTENT;
    
    static {
      b b1 = new b("FIXED", 0);
      FIXED = b1;
      b b2 = new b("WRAP_CONTENT", 1);
      WRAP_CONTENT = b2;
      b b3 = new b("MATCH_CONSTRAINT", 2);
      MATCH_CONSTRAINT = b3;
      b b4 = new b("MATCH_PARENT", 3);
      MATCH_PARENT = b4;
      $VALUES = new b[] { b1, b2, b3, b4 };
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */