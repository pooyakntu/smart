package c1;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class e implements a {
  private static final String u = "e";
  
  private int[] a;
  
  private final int[] b = new int[256];
  
  private final a.a c;
  
  private ByteBuffer d;
  
  private byte[] e;
  
  private short[] f;
  
  private byte[] g;
  
  private byte[] h;
  
  private byte[] i;
  
  private int[] j;
  
  private int k;
  
  private c l;
  
  private Bitmap m;
  
  private boolean n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private Boolean s;
  
  private Bitmap.Config t = Bitmap.Config.ARGB_8888;
  
  public e(a.a parama) {
    this.c = parama;
    this.l = new c();
  }
  
  public e(a.a parama, c paramc, ByteBuffer paramByteBuffer, int paramInt) {
    this(parama);
    r(paramc, paramByteBuffer, paramInt);
  }
  
  private int j(int paramInt1, int paramInt2, int paramInt3) {
    int i;
    int i2 = paramInt1;
    int i1 = 0;
    int n = 0;
    int m = 0;
    int k = 0;
    int j = 0;
    while (i2 < this.p + paramInt1) {
      byte[] arrayOfByte = this.i;
      if (i2 < arrayOfByte.length && i2 < paramInt2) {
        int i5 = arrayOfByte[i2];
        int i10 = this.a[i5 & 0xFF];
        int i9 = i1;
        int i8 = n;
        int i7 = m;
        int i6 = k;
        i5 = j;
        if (i10 != 0) {
          i9 = i1 + (i10 >> 24 & 0xFF);
          i8 = n + (i10 >> 16 & 0xFF);
          i7 = m + (i10 >> 8 & 0xFF);
          i6 = k + (i10 & 0xFF);
          i5 = j + 1;
        } 
        i2++;
        i1 = i9;
        n = i8;
        m = i7;
        k = i6;
        j = i5;
      } 
    } 
    int i4 = paramInt1 + paramInt3;
    paramInt1 = i4;
    int i3 = i1;
    while (paramInt1 < this.p + i4) {
      byte[] arrayOfByte = this.i;
      if (paramInt1 < arrayOfByte.length && paramInt1 < paramInt2) {
        int i5;
        paramInt3 = arrayOfByte[paramInt1];
        int i9 = this.a[paramInt3 & 0xFF];
        int i8 = i3;
        int i7 = n;
        i2 = m;
        i1 = k;
        int i6 = j;
        if (i9 != 0) {
          i8 = i3 + (i9 >> 24 & 0xFF);
          i7 = n + (i9 >> 16 & 0xFF);
          i2 = m + (i9 >> 8 & 0xFF);
          i1 = k + (i9 & 0xFF);
          i5 = j + 1;
        } 
        paramInt1++;
        i3 = i8;
        n = i7;
        m = i2;
        k = i1;
        i = i5;
      } 
    } 
    return (i == 0) ? 0 : (i3 / i << 24 | n / i << 16 | m / i << 8 | k / i);
  }
  
  private void k(b paramb) {
    boolean bool;
    int[] arrayOfInt1 = this.j;
    int i = paramb.d;
    int i2 = this.p;
    int i1 = i / i2;
    int j = paramb.b / i2;
    int m = paramb.c / i2;
    int i3 = paramb.a / i2;
    if (this.k == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    int i4 = this.r;
    int i5 = this.q;
    byte[] arrayOfByte = this.i;
    int[] arrayOfInt2 = this.a;
    Boolean bool1 = this.s;
    byte b1 = 8;
    int k = 0;
    int n = 0;
    for (i = 1;; i = i7) {
      int i6;
      int i7;
      Boolean bool2;
      if (n < i1) {
        int i8;
        if (paramb.e) {
          if (k >= i1)
            if (++i != 2) {
              if (i != 3) {
                if (i == 4) {
                  k = 1;
                  b1 = 2;
                } 
              } else {
                k = 2;
                b1 = 4;
              } 
            } else {
              k = 4;
            }  
          i6 = k + b1;
          i8 = k;
          i7 = i;
        } else {
          i8 = n;
          i7 = i;
          i6 = k;
        } 
        k = i8 + j;
        if (i2 == 1) {
          i = 1;
        } else {
          i = 0;
        } 
        if (k < i5) {
          i8 = k * i4;
          int i9 = i8 + i3;
          k = i9 + m;
          int i10 = i8 + i4;
          i8 = k;
          if (i10 < k)
            i8 = i10; 
          i10 = n * i2 * paramb.c;
          if (i != 0) {
            k = i9;
            while (true) {
              i = j;
              bool2 = bool1;
              if (k < i8) {
                i = arrayOfInt2[arrayOfByte[i10] & 0xFF];
                if (i != 0) {
                  arrayOfInt1[k] = i;
                  bool2 = bool1;
                } else {
                  bool2 = bool1;
                  if (bool) {
                    bool2 = bool1;
                    if (bool1 == null)
                      bool2 = Boolean.TRUE; 
                  } 
                } 
                i10 += i2;
                k++;
                bool1 = bool2;
                continue;
              } 
              break;
            } 
          } else {
            int i11 = j;
            k = i9;
            i = i10;
            j = m;
            m = k;
            while (true) {
              int i12 = i;
              k = i11;
              bool2 = bool1;
              i = j;
              if (m < i8) {
                i = j(i12, (i8 - i9) * i2 + i10, paramb.c);
                if (i != 0) {
                  arrayOfInt1[m] = i;
                  bool2 = bool1;
                } else {
                  bool2 = bool1;
                  if (bool) {
                    bool2 = bool1;
                    if (bool1 == null)
                      bool2 = Boolean.TRUE; 
                  } 
                } 
                i = i12 + i2;
                m++;
                bool1 = bool2;
                continue;
              } 
              break;
            } 
            bool1 = bool2;
            n++;
            j = k;
            k = i6;
            m = i;
            i = i7;
          } 
        } else {
          bool2 = bool1;
          i = j;
        } 
        k = i;
        i = m;
      } else {
        break;
      } 
      bool1 = bool2;
      n++;
      j = k;
      k = i6;
      m = i;
    } 
    if (this.s == null) {
      boolean bool2;
      if (bool1 == null) {
        bool2 = false;
      } else {
        bool2 = bool1.booleanValue();
      } 
      this.s = Boolean.valueOf(bool2);
    } 
  }
  
  private void l(b paramb) {
    boolean bool1;
    boolean bool2;
    b b1 = paramb;
    int[] arrayOfInt1 = this.j;
    int j = b1.d;
    int m = b1.b;
    int n = b1.c;
    int i1 = b1.a;
    if (this.k == 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    int i2 = this.r;
    byte[] arrayOfByte = this.i;
    int[] arrayOfInt2 = this.a;
    int i = 0;
    int k = -1;
    while (i < j) {
      int i3 = (i + m) * i2;
      int i4 = i3 + i1;
      int i5 = i4 + n;
      int i6 = i3 + i2;
      i3 = i5;
      if (i6 < i5)
        i3 = i6; 
      i5 = paramb.c * i;
      while (i4 < i3) {
        byte b2 = arrayOfByte[i5];
        int i7 = b2 & 0xFF;
        i6 = k;
        if (i7 != k) {
          i6 = arrayOfInt2[i7];
          if (i6 != 0) {
            arrayOfInt1[i4] = i6;
            i6 = k;
          } else {
            i6 = b2;
          } 
        } 
        i5++;
        i4++;
        k = i6;
      } 
      i++;
    } 
    Boolean bool = this.s;
    if ((bool != null && bool.booleanValue()) || (this.s == null && bool1 && k != -1)) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.s = Boolean.valueOf(bool2);
  }
  
  private void m(b paramb) {
    c c1;
    e e1 = this;
    if (paramb != null)
      e1.d.position(paramb.j); 
    if (paramb == null) {
      c1 = e1.l;
      j = c1.f;
      i = c1.g;
    } else {
      j = ((b)c1).c;
      i = ((b)c1).d;
    } 
    int i11 = j * i;
    byte[] arrayOfByte1 = e1.i;
    if (arrayOfByte1 == null || arrayOfByte1.length < i11)
      e1.i = e1.c.e(i11); 
    byte[] arrayOfByte3 = e1.i;
    if (e1.f == null)
      e1.f = new short[4096]; 
    short[] arrayOfShort = e1.f;
    if (e1.g == null)
      e1.g = new byte[4096]; 
    byte[] arrayOfByte4 = e1.g;
    if (e1.h == null)
      e1.h = new byte[4097]; 
    arrayOfByte1 = e1.h;
    int i = q();
    int i12 = 1 << i;
    int n = i12 + 2;
    int i2 = i + 1;
    int i9 = (1 << i2) - 1;
    int i10 = 0;
    for (i = 0; i < i12; i++) {
      arrayOfShort[i] = 0;
      arrayOfByte4[i] = (byte)i;
    } 
    byte[] arrayOfByte2 = e1.e;
    int j = i2;
    i = n;
    int i5 = i9;
    int i4 = 0;
    int i7 = 0;
    int i1 = 0;
    int i8 = 0;
    int i3 = 0;
    int k = -1;
    int m = 0;
    int i6 = 0;
    label76: while (i10 < i11) {
      int i13 = i4;
      if (!i4) {
        i13 = p();
        if (i13 <= 0) {
          this.o = 3;
          break;
        } 
        i7 = 0;
      } 
      i8 += (arrayOfByte2[i7] & 0xFF) << i1;
      int i14 = i7 + 1;
      int i15 = i13 - 1;
      i13 = i1 + 8;
      i1 = i;
      i = k;
      i7 = m;
      k = j;
      i4 = i10;
      j = n;
      m = i1;
      n = i7;
      i1 = i13;
      while (i1 >= k) {
        int i16;
        i7 = i8 & i5;
        i8 >>= k;
        i1 -= k;
        if (i7 == i12) {
          i5 = i9;
          k = i2;
          i7 = j;
          i = -1;
          m = j;
          j = i7;
          continue;
        } 
        if (i7 == i12 + 1) {
          i13 = n;
          i16 = m;
          n = j;
          m = i;
          j = k;
          i10 = i4;
          i4 = i15;
          i7 = i14;
          i = i16;
          k = m;
          m = i13;
          continue label76;
        } 
        if (i == -1) {
          arrayOfByte3[i3] = arrayOfByte4[i7];
          i3++;
          i4++;
          i = i7;
          n = i;
          continue;
        } 
        if (i7 >= m) {
          arrayOfByte1[i6] = (byte)n;
          n = i6 + 1;
          i6 = i;
        } else {
          i10 = i7;
          n = i6;
          i6 = i10;
        } 
        while (i6 >= i12) {
          arrayOfByte1[n] = arrayOfByte4[i6];
          n++;
          i6 = arrayOfShort[i6];
        } 
        int i17 = arrayOfByte4[i6] & 0xFF;
        byte b1 = (byte)i17;
        arrayOfByte3[i3] = b1;
        i6 = n;
        while (true) {
          i3++;
          i4++;
          if (i6 > 0) {
            arrayOfByte3[i3] = arrayOfByte1[--i6];
            continue;
          } 
          i16 = m;
          i13 = k;
          i10 = i5;
          if (m < 4096) {
            arrayOfShort[m] = (short)i;
            arrayOfByte4[m] = b1;
            i = m + 1;
            i16 = i;
            i13 = k;
            i10 = i5;
            if ((i & i5) == 0) {
              i16 = i;
              i13 = k;
              i10 = i5;
              if (i < 4096) {
                i13 = k + 1;
                i10 = i5 + i;
                i16 = i;
              } 
            } 
          } 
          break;
        } 
        i = i7;
        n = i17;
        m = i16;
        k = i13;
        i5 = i10;
      } 
      i13 = i;
      i = m;
      m = n;
      n = j;
      i10 = i4;
      i4 = i15;
      i7 = i14;
      j = k;
      k = i13;
    } 
    Arrays.fill(arrayOfByte3, i3, i11, (byte)0);
  }
  
  private Bitmap o() {
    Boolean bool = this.s;
    if (bool == null || bool.booleanValue()) {
      Bitmap.Config config1 = Bitmap.Config.ARGB_8888;
      Bitmap bitmap1 = this.c.a(this.r, this.q, config1);
      bitmap1.setHasAlpha(true);
      return bitmap1;
    } 
    Bitmap.Config config = this.t;
    Bitmap bitmap = this.c.a(this.r, this.q, config);
    bitmap.setHasAlpha(true);
    return bitmap;
  }
  
  private int p() {
    int i = q();
    if (i <= 0)
      return i; 
    ByteBuffer byteBuffer = this.d;
    byteBuffer.get(this.e, 0, Math.min(i, byteBuffer.remaining()));
    return i;
  }
  
  private int q() {
    return this.d.get() & 0xFF;
  }
  
  private Bitmap s(b paramb1, b paramb2) {
    int[] arrayOfInt = this.j;
    int i = 0;
    if (paramb2 == null) {
      Bitmap bitmap1 = this.m;
      if (bitmap1 != null)
        this.c.c(bitmap1); 
      this.m = null;
      Arrays.fill(arrayOfInt, 0);
    } 
    if (paramb2 != null && paramb2.g == 3 && this.m == null)
      Arrays.fill(arrayOfInt, 0); 
    if (paramb2 != null) {
      int j = paramb2.g;
      if (j > 0)
        if (j == 2) {
          j = i;
          if (!paramb1.f) {
            c c1 = this.l;
            j = c1.l;
            if (paramb1.k != null && c1.j == paramb1.h)
              j = i; 
          } 
          i = paramb2.d;
          int k = this.p;
          int n = i / k;
          i = paramb2.b / k;
          int i1 = paramb2.c / k;
          k = paramb2.a / k;
          int i2 = this.r;
          int m = i * i2 + k;
          for (i = m; i < n * i2 + m; i += this.r) {
            for (k = i; k < i + i1; k++)
              arrayOfInt[k] = j; 
          } 
        } else if (j == 3) {
          Bitmap bitmap1 = this.m;
          if (bitmap1 != null) {
            i = this.r;
            bitmap1.getPixels(arrayOfInt, 0, i, 0, 0, i, this.q);
          } 
        }  
    } 
    m(paramb1);
    if (paramb1.e || this.p != 1) {
      k(paramb1);
    } else {
      l(paramb1);
    } 
    if (this.n) {
      i = paramb1.g;
      if (i == 0 || i == 1) {
        if (this.m == null)
          this.m = o(); 
        Bitmap bitmap1 = this.m;
        i = this.r;
        bitmap1.setPixels(arrayOfInt, 0, i, 0, 0, i, this.q);
      } 
    } 
    Bitmap bitmap = o();
    i = this.r;
    bitmap.setPixels(arrayOfInt, 0, i, 0, 0, i, this.q);
    return bitmap;
  }
  
  public Bitmap a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield l : Lc1/c;
    //   6: getfield c : I
    //   9: ifle -> 19
    //   12: aload_0
    //   13: getfield k : I
    //   16: ifge -> 77
    //   19: getstatic c1/e.u : Ljava/lang/String;
    //   22: iconst_3
    //   23: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   26: ifeq -> 72
    //   29: new java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: astore_2
    //   37: aload_2
    //   38: ldc 'Unable to decode frame, frameCount='
    //   40: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload_2
    //   45: aload_0
    //   46: getfield l : Lc1/c;
    //   49: getfield c : I
    //   52: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: aload_2
    //   57: ldc ', framePointer='
    //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: aload_2
    //   64: aload_0
    //   65: getfield k : I
    //   68: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload_0
    //   73: iconst_1
    //   74: putfield o : I
    //   77: aload_0
    //   78: getfield o : I
    //   81: istore_1
    //   82: iload_1
    //   83: iconst_1
    //   84: if_icmpeq -> 321
    //   87: iload_1
    //   88: iconst_2
    //   89: if_icmpne -> 95
    //   92: goto -> 321
    //   95: aload_0
    //   96: iconst_0
    //   97: putfield o : I
    //   100: aload_0
    //   101: getfield e : [B
    //   104: ifnonnull -> 123
    //   107: aload_0
    //   108: aload_0
    //   109: getfield c : Lc1/a$a;
    //   112: sipush #255
    //   115: invokeinterface e : (I)[B
    //   120: putfield e : [B
    //   123: aload_0
    //   124: getfield l : Lc1/c;
    //   127: getfield e : Ljava/util/List;
    //   130: aload_0
    //   131: getfield k : I
    //   134: invokeinterface get : (I)Ljava/lang/Object;
    //   139: checkcast c1/b
    //   142: astore #4
    //   144: aload_0
    //   145: getfield k : I
    //   148: iconst_1
    //   149: isub
    //   150: istore_1
    //   151: iload_1
    //   152: iflt -> 365
    //   155: aload_0
    //   156: getfield l : Lc1/c;
    //   159: getfield e : Ljava/util/List;
    //   162: iload_1
    //   163: invokeinterface get : (I)Ljava/lang/Object;
    //   168: checkcast c1/b
    //   171: astore_2
    //   172: goto -> 175
    //   175: aload #4
    //   177: getfield k : [I
    //   180: astore_3
    //   181: aload_3
    //   182: ifnull -> 188
    //   185: goto -> 196
    //   188: aload_0
    //   189: getfield l : Lc1/c;
    //   192: getfield a : [I
    //   195: astore_3
    //   196: aload_0
    //   197: aload_3
    //   198: putfield a : [I
    //   201: aload_3
    //   202: ifnonnull -> 248
    //   205: getstatic c1/e.u : Ljava/lang/String;
    //   208: iconst_3
    //   209: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   212: ifeq -> 239
    //   215: new java/lang/StringBuilder
    //   218: dup
    //   219: invokespecial <init> : ()V
    //   222: astore_2
    //   223: aload_2
    //   224: ldc 'No valid color table found for frame #'
    //   226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: aload_2
    //   231: aload_0
    //   232: getfield k : I
    //   235: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   238: pop
    //   239: aload_0
    //   240: iconst_1
    //   241: putfield o : I
    //   244: aload_0
    //   245: monitorexit
    //   246: aconst_null
    //   247: areturn
    //   248: aload #4
    //   250: getfield f : Z
    //   253: ifeq -> 309
    //   256: aload_3
    //   257: iconst_0
    //   258: aload_0
    //   259: getfield b : [I
    //   262: iconst_0
    //   263: aload_3
    //   264: arraylength
    //   265: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   268: aload_0
    //   269: getfield b : [I
    //   272: astore_3
    //   273: aload_0
    //   274: aload_3
    //   275: putfield a : [I
    //   278: aload_3
    //   279: aload #4
    //   281: getfield h : I
    //   284: iconst_0
    //   285: iastore
    //   286: aload #4
    //   288: getfield g : I
    //   291: iconst_2
    //   292: if_icmpne -> 309
    //   295: aload_0
    //   296: getfield k : I
    //   299: ifne -> 309
    //   302: aload_0
    //   303: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   306: putfield s : Ljava/lang/Boolean;
    //   309: aload_0
    //   310: aload #4
    //   312: aload_2
    //   313: invokespecial s : (Lc1/b;Lc1/b;)Landroid/graphics/Bitmap;
    //   316: astore_2
    //   317: aload_0
    //   318: monitorexit
    //   319: aload_2
    //   320: areturn
    //   321: getstatic c1/e.u : Ljava/lang/String;
    //   324: iconst_3
    //   325: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   328: ifeq -> 356
    //   331: new java/lang/StringBuilder
    //   334: dup
    //   335: invokespecial <init> : ()V
    //   338: astore_2
    //   339: aload_2
    //   340: ldc_w 'Unable to decode frame, status='
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: pop
    //   347: aload_2
    //   348: aload_0
    //   349: getfield o : I
    //   352: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   355: pop
    //   356: aload_0
    //   357: monitorexit
    //   358: aconst_null
    //   359: areturn
    //   360: astore_2
    //   361: aload_0
    //   362: monitorexit
    //   363: aload_2
    //   364: athrow
    //   365: aconst_null
    //   366: astore_2
    //   367: goto -> 175
    // Exception table:
    //   from	to	target	type
    //   2	19	360	finally
    //   19	72	360	finally
    //   72	77	360	finally
    //   77	82	360	finally
    //   95	123	360	finally
    //   123	151	360	finally
    //   155	172	360	finally
    //   175	181	360	finally
    //   188	196	360	finally
    //   196	201	360	finally
    //   205	239	360	finally
    //   239	244	360	finally
    //   248	309	360	finally
    //   309	317	360	finally
    //   321	356	360	finally
  }
  
  public void b() {
    this.k = (this.k + 1) % this.l.c;
  }
  
  public int c() {
    return this.l.c;
  }
  
  public void clear() {
    this.l = null;
    byte[] arrayOfByte2 = this.i;
    if (arrayOfByte2 != null)
      this.c.d(arrayOfByte2); 
    int[] arrayOfInt = this.j;
    if (arrayOfInt != null)
      this.c.f(arrayOfInt); 
    Bitmap bitmap = this.m;
    if (bitmap != null)
      this.c.c(bitmap); 
    this.m = null;
    this.d = null;
    this.s = null;
    byte[] arrayOfByte1 = this.e;
    if (arrayOfByte1 != null)
      this.c.d(arrayOfByte1); 
  }
  
  public int d() {
    if (this.l.c > 0) {
      int i = this.k;
      if (i >= 0)
        return n(i); 
    } 
    return 0;
  }
  
  public void e(Bitmap.Config paramConfig) {
    if (paramConfig == Bitmap.Config.ARGB_8888 || paramConfig == Bitmap.Config.RGB_565) {
      this.t = paramConfig;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unsupported format: ");
    stringBuilder.append(paramConfig);
    stringBuilder.append(", must be one of ");
    stringBuilder.append(Bitmap.Config.ARGB_8888);
    stringBuilder.append(" or ");
    stringBuilder.append(Bitmap.Config.RGB_565);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public ByteBuffer f() {
    return this.d;
  }
  
  public void g() {
    this.k = -1;
  }
  
  public int h() {
    return this.k;
  }
  
  public int i() {
    return this.d.limit() + this.i.length + this.j.length * 4;
  }
  
  public int n(int paramInt) {
    if (paramInt >= 0) {
      c c1 = this.l;
      if (paramInt < c1.c)
        return ((b)c1.e.get(paramInt)).i; 
    } 
    return -1;
  }
  
  public void r(c paramc, ByteBuffer paramByteBuffer, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_3
    //   3: ifle -> 178
    //   6: iload_3
    //   7: invokestatic highestOneBit : (I)I
    //   10: istore_3
    //   11: aload_0
    //   12: iconst_0
    //   13: putfield o : I
    //   16: aload_0
    //   17: aload_1
    //   18: putfield l : Lc1/c;
    //   21: aload_0
    //   22: iconst_m1
    //   23: putfield k : I
    //   26: aload_2
    //   27: invokevirtual asReadOnlyBuffer : ()Ljava/nio/ByteBuffer;
    //   30: astore_2
    //   31: aload_0
    //   32: aload_2
    //   33: putfield d : Ljava/nio/ByteBuffer;
    //   36: aload_2
    //   37: iconst_0
    //   38: invokevirtual position : (I)Ljava/nio/Buffer;
    //   41: pop
    //   42: aload_0
    //   43: getfield d : Ljava/nio/ByteBuffer;
    //   46: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
    //   49: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   52: pop
    //   53: aload_0
    //   54: iconst_0
    //   55: putfield n : Z
    //   58: aload_1
    //   59: getfield e : Ljava/util/List;
    //   62: invokeinterface iterator : ()Ljava/util/Iterator;
    //   67: astore_2
    //   68: aload_2
    //   69: invokeinterface hasNext : ()Z
    //   74: ifeq -> 98
    //   77: aload_2
    //   78: invokeinterface next : ()Ljava/lang/Object;
    //   83: checkcast c1/b
    //   86: getfield g : I
    //   89: iconst_3
    //   90: if_icmpne -> 68
    //   93: aload_0
    //   94: iconst_1
    //   95: putfield n : Z
    //   98: aload_0
    //   99: iload_3
    //   100: putfield p : I
    //   103: aload_1
    //   104: getfield f : I
    //   107: istore #4
    //   109: aload_0
    //   110: iload #4
    //   112: iload_3
    //   113: idiv
    //   114: putfield r : I
    //   117: aload_1
    //   118: getfield g : I
    //   121: istore #5
    //   123: aload_0
    //   124: iload #5
    //   126: iload_3
    //   127: idiv
    //   128: putfield q : I
    //   131: aload_0
    //   132: aload_0
    //   133: getfield c : Lc1/a$a;
    //   136: iload #4
    //   138: iload #5
    //   140: imul
    //   141: invokeinterface e : (I)[B
    //   146: putfield i : [B
    //   149: aload_0
    //   150: aload_0
    //   151: getfield c : Lc1/a$a;
    //   154: aload_0
    //   155: getfield r : I
    //   158: aload_0
    //   159: getfield q : I
    //   162: imul
    //   163: invokeinterface b : (I)[I
    //   168: putfield j : [I
    //   171: aload_0
    //   172: monitorexit
    //   173: return
    //   174: astore_1
    //   175: goto -> 212
    //   178: new java/lang/StringBuilder
    //   181: dup
    //   182: invokespecial <init> : ()V
    //   185: astore_1
    //   186: aload_1
    //   187: ldc_w 'Sample size must be >=0, not: '
    //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: aload_1
    //   195: iload_3
    //   196: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   199: pop
    //   200: new java/lang/IllegalArgumentException
    //   203: dup
    //   204: aload_1
    //   205: invokevirtual toString : ()Ljava/lang/String;
    //   208: invokespecial <init> : (Ljava/lang/String;)V
    //   211: athrow
    //   212: aload_0
    //   213: monitorexit
    //   214: aload_1
    //   215: athrow
    // Exception table:
    //   from	to	target	type
    //   6	68	174	finally
    //   68	98	174	finally
    //   98	171	174	finally
    //   178	212	174	finally
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c1\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */