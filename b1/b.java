package b1;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b implements Closeable {
  private final File g;
  
  private final File h;
  
  private final File i;
  
  private final File j;
  
  private final int k;
  
  private long l;
  
  private final int m;
  
  private long n = 0L;
  
  private Writer o;
  
  private final LinkedHashMap<String, d> p = new LinkedHashMap<String, d>(0, 0.75F, true);
  
  private int q;
  
  private long r = 0L;
  
  final ThreadPoolExecutor s = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new b(null));
  
  private final Callable<Void> t = new a(this);
  
  private b(File paramFile, int paramInt1, int paramInt2, long paramLong) {
    this.g = paramFile;
    this.k = paramInt1;
    this.h = new File(paramFile, "journal");
    this.i = new File(paramFile, "journal.tmp");
    this.j = new File(paramFile, "journal.bkp");
    this.m = paramInt2;
    this.l = paramLong;
  }
  
  private static void E0(File paramFile1, File paramFile2, boolean paramBoolean) throws IOException {
    if (paramBoolean)
      W(paramFile2); 
    if (paramFile1.renameTo(paramFile2))
      return; 
    throw new IOException();
  }
  
  private void I() {
    if (this.o != null)
      return; 
    throw new IllegalStateException("cache is closed");
  }
  
  private void K0() throws IOException {
    while (this.n > this.l)
      A0((String)((Map.Entry)this.p.entrySet().iterator().next()).getKey()); 
  }
  
  @TargetApi(26)
  private static void L(Writer paramWriter) throws IOException {
    if (Build.VERSION.SDK_INT < 26) {
      paramWriter.close();
      return;
    } 
    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
    StrictMode.setThreadPolicy(a.a(new StrictMode.ThreadPolicy.Builder(threadPolicy)).build());
    try {
      paramWriter.close();
      return;
    } finally {
      StrictMode.setThreadPolicy(threadPolicy);
    } 
  }
  
  private void R(c paramc, boolean paramBoolean) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic c : (Lb1/b$c;)Lb1/b$d;
    //   6: astore #10
    //   8: aload #10
    //   10: invokestatic g : (Lb1/b$d;)Lb1/b$c;
    //   13: aload_1
    //   14: if_acmpne -> 439
    //   17: iconst_0
    //   18: istore #5
    //   20: iload #5
    //   22: istore #4
    //   24: iload_2
    //   25: ifeq -> 126
    //   28: iload #5
    //   30: istore #4
    //   32: aload #10
    //   34: invokestatic e : (Lb1/b$d;)Z
    //   37: ifne -> 126
    //   40: iconst_0
    //   41: istore_3
    //   42: iload #5
    //   44: istore #4
    //   46: iload_3
    //   47: aload_0
    //   48: getfield m : I
    //   51: if_icmpge -> 126
    //   54: aload_1
    //   55: invokestatic d : (Lb1/b$c;)[Z
    //   58: iload_3
    //   59: baload
    //   60: ifeq -> 89
    //   63: aload #10
    //   65: iload_3
    //   66: invokevirtual k : (I)Ljava/io/File;
    //   69: invokevirtual exists : ()Z
    //   72: ifne -> 82
    //   75: aload_1
    //   76: invokevirtual a : ()V
    //   79: aload_0
    //   80: monitorexit
    //   81: return
    //   82: iload_3
    //   83: iconst_1
    //   84: iadd
    //   85: istore_3
    //   86: goto -> 42
    //   89: aload_1
    //   90: invokevirtual a : ()V
    //   93: new java/lang/StringBuilder
    //   96: dup
    //   97: invokespecial <init> : ()V
    //   100: astore_1
    //   101: aload_1
    //   102: ldc 'Newly created entry didn't create value for index '
    //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload_1
    //   109: iload_3
    //   110: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: new java/lang/IllegalStateException
    //   117: dup
    //   118: aload_1
    //   119: invokevirtual toString : ()Ljava/lang/String;
    //   122: invokespecial <init> : (Ljava/lang/String;)V
    //   125: athrow
    //   126: iload #4
    //   128: aload_0
    //   129: getfield m : I
    //   132: if_icmpge -> 221
    //   135: aload #10
    //   137: iload #4
    //   139: invokevirtual k : (I)Ljava/io/File;
    //   142: astore_1
    //   143: iload_2
    //   144: ifeq -> 214
    //   147: aload_1
    //   148: invokevirtual exists : ()Z
    //   151: ifeq -> 452
    //   154: aload #10
    //   156: iload #4
    //   158: invokevirtual j : (I)Ljava/io/File;
    //   161: astore #11
    //   163: aload_1
    //   164: aload #11
    //   166: invokevirtual renameTo : (Ljava/io/File;)Z
    //   169: pop
    //   170: aload #10
    //   172: invokestatic a : (Lb1/b$d;)[J
    //   175: iload #4
    //   177: laload
    //   178: lstore #6
    //   180: aload #11
    //   182: invokevirtual length : ()J
    //   185: lstore #8
    //   187: aload #10
    //   189: invokestatic a : (Lb1/b$d;)[J
    //   192: iload #4
    //   194: lload #8
    //   196: lastore
    //   197: aload_0
    //   198: aload_0
    //   199: getfield n : J
    //   202: lload #6
    //   204: lsub
    //   205: lload #8
    //   207: ladd
    //   208: putfield n : J
    //   211: goto -> 452
    //   214: aload_1
    //   215: invokestatic W : (Ljava/io/File;)V
    //   218: goto -> 452
    //   221: aload_0
    //   222: aload_0
    //   223: getfield q : I
    //   226: iconst_1
    //   227: iadd
    //   228: putfield q : I
    //   231: aload #10
    //   233: aconst_null
    //   234: invokestatic h : (Lb1/b$d;Lb1/b$c;)Lb1/b$c;
    //   237: pop
    //   238: aload #10
    //   240: invokestatic e : (Lb1/b$d;)Z
    //   243: iload_2
    //   244: ior
    //   245: ifeq -> 341
    //   248: aload #10
    //   250: iconst_1
    //   251: invokestatic f : (Lb1/b$d;Z)Z
    //   254: pop
    //   255: aload_0
    //   256: getfield o : Ljava/io/Writer;
    //   259: ldc_w 'CLEAN'
    //   262: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   265: pop
    //   266: aload_0
    //   267: getfield o : Ljava/io/Writer;
    //   270: bipush #32
    //   272: invokevirtual append : (C)Ljava/io/Writer;
    //   275: pop
    //   276: aload_0
    //   277: getfield o : Ljava/io/Writer;
    //   280: aload #10
    //   282: invokestatic b : (Lb1/b$d;)Ljava/lang/String;
    //   285: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   288: pop
    //   289: aload_0
    //   290: getfield o : Ljava/io/Writer;
    //   293: aload #10
    //   295: invokevirtual l : ()Ljava/lang/String;
    //   298: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   301: pop
    //   302: aload_0
    //   303: getfield o : Ljava/io/Writer;
    //   306: bipush #10
    //   308: invokevirtual append : (C)Ljava/io/Writer;
    //   311: pop
    //   312: iload_2
    //   313: ifeq -> 398
    //   316: aload_0
    //   317: getfield r : J
    //   320: lstore #6
    //   322: aload_0
    //   323: lconst_1
    //   324: lload #6
    //   326: ladd
    //   327: putfield r : J
    //   330: aload #10
    //   332: lload #6
    //   334: invokestatic d : (Lb1/b$d;J)J
    //   337: pop2
    //   338: goto -> 398
    //   341: aload_0
    //   342: getfield p : Ljava/util/LinkedHashMap;
    //   345: aload #10
    //   347: invokestatic b : (Lb1/b$d;)Ljava/lang/String;
    //   350: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   353: pop
    //   354: aload_0
    //   355: getfield o : Ljava/io/Writer;
    //   358: ldc_w 'REMOVE'
    //   361: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   364: pop
    //   365: aload_0
    //   366: getfield o : Ljava/io/Writer;
    //   369: bipush #32
    //   371: invokevirtual append : (C)Ljava/io/Writer;
    //   374: pop
    //   375: aload_0
    //   376: getfield o : Ljava/io/Writer;
    //   379: aload #10
    //   381: invokestatic b : (Lb1/b$d;)Ljava/lang/String;
    //   384: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   387: pop
    //   388: aload_0
    //   389: getfield o : Ljava/io/Writer;
    //   392: bipush #10
    //   394: invokevirtual append : (C)Ljava/io/Writer;
    //   397: pop
    //   398: aload_0
    //   399: getfield o : Ljava/io/Writer;
    //   402: invokestatic c0 : (Ljava/io/Writer;)V
    //   405: aload_0
    //   406: getfield n : J
    //   409: aload_0
    //   410: getfield l : J
    //   413: lcmp
    //   414: ifgt -> 424
    //   417: aload_0
    //   418: invokespecial f0 : ()Z
    //   421: ifeq -> 436
    //   424: aload_0
    //   425: getfield s : Ljava/util/concurrent/ThreadPoolExecutor;
    //   428: aload_0
    //   429: getfield t : Ljava/util/concurrent/Callable;
    //   432: invokevirtual submit : (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   435: pop
    //   436: aload_0
    //   437: monitorexit
    //   438: return
    //   439: new java/lang/IllegalStateException
    //   442: dup
    //   443: invokespecial <init> : ()V
    //   446: athrow
    //   447: astore_1
    //   448: aload_0
    //   449: monitorexit
    //   450: aload_1
    //   451: athrow
    //   452: iload #4
    //   454: iconst_1
    //   455: iadd
    //   456: istore #4
    //   458: goto -> 126
    // Exception table:
    //   from	to	target	type
    //   2	17	447	finally
    //   32	40	447	finally
    //   46	79	447	finally
    //   89	126	447	finally
    //   126	143	447	finally
    //   147	211	447	finally
    //   214	218	447	finally
    //   221	312	447	finally
    //   316	338	447	finally
    //   341	398	447	finally
    //   398	424	447	finally
    //   424	436	447	finally
    //   439	447	447	finally
  }
  
  private static void W(File paramFile) throws IOException {
    if (paramFile.exists()) {
      if (paramFile.delete())
        return; 
      throw new IOException();
    } 
  }
  
  private c Z(String paramString, long paramLong) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial I : ()V
    //   6: aload_0
    //   7: getfield p : Ljava/util/LinkedHashMap;
    //   10: aload_1
    //   11: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   14: checkcast b1/b$d
    //   17: astore #6
    //   19: lload_2
    //   20: ldc2_w -1
    //   23: lcmp
    //   24: ifeq -> 50
    //   27: aload #6
    //   29: ifnull -> 46
    //   32: aload #6
    //   34: invokestatic c : (Lb1/b$d;)J
    //   37: lstore #4
    //   39: lload #4
    //   41: lload_2
    //   42: lcmp
    //   43: ifeq -> 50
    //   46: aload_0
    //   47: monitorexit
    //   48: aconst_null
    //   49: areturn
    //   50: aload #6
    //   52: ifnonnull -> 81
    //   55: new b1/b$d
    //   58: dup
    //   59: aload_0
    //   60: aload_1
    //   61: aconst_null
    //   62: invokespecial <init> : (Lb1/b;Ljava/lang/String;Lb1/b$a;)V
    //   65: astore #6
    //   67: aload_0
    //   68: getfield p : Ljava/util/LinkedHashMap;
    //   71: aload_1
    //   72: aload #6
    //   74: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   77: pop
    //   78: goto -> 97
    //   81: aload #6
    //   83: invokestatic g : (Lb1/b$d;)Lb1/b$c;
    //   86: astore #7
    //   88: aload #7
    //   90: ifnull -> 97
    //   93: aload_0
    //   94: monitorexit
    //   95: aconst_null
    //   96: areturn
    //   97: new b1/b$c
    //   100: dup
    //   101: aload_0
    //   102: aload #6
    //   104: aconst_null
    //   105: invokespecial <init> : (Lb1/b;Lb1/b$d;Lb1/b$a;)V
    //   108: astore #7
    //   110: aload #6
    //   112: aload #7
    //   114: invokestatic h : (Lb1/b$d;Lb1/b$c;)Lb1/b$c;
    //   117: pop
    //   118: aload_0
    //   119: getfield o : Ljava/io/Writer;
    //   122: ldc_w 'DIRTY'
    //   125: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   128: pop
    //   129: aload_0
    //   130: getfield o : Ljava/io/Writer;
    //   133: bipush #32
    //   135: invokevirtual append : (C)Ljava/io/Writer;
    //   138: pop
    //   139: aload_0
    //   140: getfield o : Ljava/io/Writer;
    //   143: aload_1
    //   144: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   147: pop
    //   148: aload_0
    //   149: getfield o : Ljava/io/Writer;
    //   152: bipush #10
    //   154: invokevirtual append : (C)Ljava/io/Writer;
    //   157: pop
    //   158: aload_0
    //   159: getfield o : Ljava/io/Writer;
    //   162: invokestatic c0 : (Ljava/io/Writer;)V
    //   165: aload_0
    //   166: monitorexit
    //   167: aload #7
    //   169: areturn
    //   170: astore_1
    //   171: aload_0
    //   172: monitorexit
    //   173: aload_1
    //   174: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	170	finally
    //   32	39	170	finally
    //   55	78	170	finally
    //   81	88	170	finally
    //   97	165	170	finally
  }
  
  @TargetApi(26)
  private static void c0(Writer paramWriter) throws IOException {
    if (Build.VERSION.SDK_INT < 26) {
      paramWriter.flush();
      return;
    } 
    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
    StrictMode.setThreadPolicy(a.a(new StrictMode.ThreadPolicy.Builder(threadPolicy)).build());
    try {
      paramWriter.flush();
      return;
    } finally {
      StrictMode.setThreadPolicy(threadPolicy);
    } 
  }
  
  private boolean f0() {
    int i = this.q;
    return (i >= 2000 && i >= this.p.size());
  }
  
  public static b o0(File paramFile, int paramInt1, int paramInt2, long paramLong) throws IOException {
    if (paramLong > 0L) {
      if (paramInt2 > 0) {
        File file = new File(paramFile, "journal.bkp");
        if (file.exists()) {
          File file1 = new File(paramFile, "journal");
          if (file1.exists()) {
            file.delete();
          } else {
            E0(file, file1, false);
          } 
        } 
        b b2 = new b(paramFile, paramInt1, paramInt2, paramLong);
        if (b2.h.exists())
          try {
            b2.r0();
            b2.p0();
            return b2;
          } catch (IOException iOException) {
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DiskLruCache ");
            stringBuilder.append(paramFile);
            stringBuilder.append(" is corrupt: ");
            stringBuilder.append(iOException.getMessage());
            stringBuilder.append(", removing");
            printStream.println(stringBuilder.toString());
            b2.T();
          }  
        paramFile.mkdirs();
        b b1 = new b(paramFile, paramInt1, paramInt2, paramLong);
        b1.x0();
        return b1;
      } 
      throw new IllegalArgumentException("valueCount <= 0");
    } 
    throw new IllegalArgumentException("maxSize <= 0");
  }
  
  private void p0() throws IOException {
    W(this.i);
    Iterator<d> iterator = this.p.values().iterator();
    while (iterator.hasNext()) {
      d d = iterator.next();
      c c = d.g(d);
      boolean bool = false;
      int i = 0;
      if (c == null) {
        while (i < this.m) {
          this.n += d.a(d)[i];
          i++;
        } 
        continue;
      } 
      d.h(d, null);
      for (i = bool; i < this.m; i++) {
        W(d.j(i));
        W(d.k(i));
      } 
      iterator.remove();
    } 
  }
  
  private void r0() throws IOException {
    c c = new c(new FileInputStream(this.h), d.a);
    try {
      String str1 = c.t();
      String str2 = c.t();
      String str5 = c.t();
      String str3 = c.t();
      String str4 = c.t();
      if ("libcore.io.DiskLruCache".equals(str1) && "1".equals(str2) && Integer.toString(this.k).equals(str5) && Integer.toString(this.m).equals(str3)) {
        boolean bool = "".equals(str4);
        if (bool) {
          int i = 0;
          try {
            while (true) {
              s0(c.t());
              i++;
            } 
          } catch (EOFException eOFException) {
            this.q = i - this.p.size();
            if (c.r()) {
              x0();
            } else {
              this.o = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.h, true), d.a));
            } 
            return;
          } 
        } 
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("unexpected journal header: [");
      stringBuilder.append((String)eOFException);
      stringBuilder.append(", ");
      stringBuilder.append(str2);
      stringBuilder.append(", ");
      stringBuilder.append(str3);
      stringBuilder.append(", ");
      stringBuilder.append(str4);
      stringBuilder.append("]");
      throw new IOException(stringBuilder.toString());
    } finally {
      d.a(c);
    } 
  }
  
  private void s0(String paramString) throws IOException {
    String[] arrayOfString;
    int i = paramString.indexOf(' ');
    if (i != -1) {
      String str;
      int j = i + 1;
      int k = paramString.indexOf(' ', j);
      if (k == -1) {
        String str1 = paramString.substring(j);
        str = str1;
        if (i == 6) {
          str = str1;
          if (paramString.startsWith("REMOVE")) {
            this.p.remove(str1);
            return;
          } 
        } 
      } else {
        str = paramString.substring(j, k);
      } 
      d d2 = this.p.get(str);
      d d1 = d2;
      if (d2 == null) {
        d1 = new d(str, null);
        this.p.put(str, d1);
      } 
      if (k != -1 && i == 5 && paramString.startsWith("CLEAN")) {
        arrayOfString = paramString.substring(k + 1).split(" ");
        d.f(d1, true);
        d.h(d1, null);
        d.i(d1, arrayOfString);
        return;
      } 
      if (k == -1 && i == 5 && arrayOfString.startsWith("DIRTY")) {
        d.h(d1, new c(d1, null));
        return;
      } 
      if (k == -1 && i == 4 && arrayOfString.startsWith("READ"))
        return; 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("unexpected journal line: ");
      stringBuilder1.append((String)arrayOfString);
      throw new IOException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("unexpected journal line: ");
    stringBuilder.append((String)arrayOfString);
    throw new IOException(stringBuilder.toString());
  }
  
  private void x0() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield o : Ljava/io/Writer;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull -> 15
    //   11: aload_1
    //   12: invokestatic L : (Ljava/io/Writer;)V
    //   15: new java/io/BufferedWriter
    //   18: dup
    //   19: new java/io/OutputStreamWriter
    //   22: dup
    //   23: new java/io/FileOutputStream
    //   26: dup
    //   27: aload_0
    //   28: getfield i : Ljava/io/File;
    //   31: invokespecial <init> : (Ljava/io/File;)V
    //   34: getstatic b1/d.a : Ljava/nio/charset/Charset;
    //   37: invokespecial <init> : (Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   40: invokespecial <init> : (Ljava/io/Writer;)V
    //   43: astore_1
    //   44: aload_1
    //   45: ldc_w 'libcore.io.DiskLruCache'
    //   48: invokevirtual write : (Ljava/lang/String;)V
    //   51: aload_1
    //   52: ldc_w '\\n'
    //   55: invokevirtual write : (Ljava/lang/String;)V
    //   58: aload_1
    //   59: ldc_w '1'
    //   62: invokevirtual write : (Ljava/lang/String;)V
    //   65: aload_1
    //   66: ldc_w '\\n'
    //   69: invokevirtual write : (Ljava/lang/String;)V
    //   72: aload_1
    //   73: aload_0
    //   74: getfield k : I
    //   77: invokestatic toString : (I)Ljava/lang/String;
    //   80: invokevirtual write : (Ljava/lang/String;)V
    //   83: aload_1
    //   84: ldc_w '\\n'
    //   87: invokevirtual write : (Ljava/lang/String;)V
    //   90: aload_1
    //   91: aload_0
    //   92: getfield m : I
    //   95: invokestatic toString : (I)Ljava/lang/String;
    //   98: invokevirtual write : (Ljava/lang/String;)V
    //   101: aload_1
    //   102: ldc_w '\\n'
    //   105: invokevirtual write : (Ljava/lang/String;)V
    //   108: aload_1
    //   109: ldc_w '\\n'
    //   112: invokevirtual write : (Ljava/lang/String;)V
    //   115: aload_0
    //   116: getfield p : Ljava/util/LinkedHashMap;
    //   119: invokevirtual values : ()Ljava/util/Collection;
    //   122: invokeinterface iterator : ()Ljava/util/Iterator;
    //   127: astore_2
    //   128: aload_2
    //   129: invokeinterface hasNext : ()Z
    //   134: ifeq -> 260
    //   137: aload_2
    //   138: invokeinterface next : ()Ljava/lang/Object;
    //   143: checkcast b1/b$d
    //   146: astore_3
    //   147: aload_3
    //   148: invokestatic g : (Lb1/b$d;)Lb1/b$c;
    //   151: ifnull -> 202
    //   154: new java/lang/StringBuilder
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: astore #4
    //   163: aload #4
    //   165: ldc_w 'DIRTY '
    //   168: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: pop
    //   172: aload #4
    //   174: aload_3
    //   175: invokestatic b : (Lb1/b$d;)Ljava/lang/String;
    //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: pop
    //   182: aload #4
    //   184: bipush #10
    //   186: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload_1
    //   191: aload #4
    //   193: invokevirtual toString : ()Ljava/lang/String;
    //   196: invokevirtual write : (Ljava/lang/String;)V
    //   199: goto -> 128
    //   202: new java/lang/StringBuilder
    //   205: dup
    //   206: invokespecial <init> : ()V
    //   209: astore #4
    //   211: aload #4
    //   213: ldc_w 'CLEAN '
    //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: aload #4
    //   222: aload_3
    //   223: invokestatic b : (Lb1/b$d;)Ljava/lang/String;
    //   226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: aload #4
    //   232: aload_3
    //   233: invokevirtual l : ()Ljava/lang/String;
    //   236: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: pop
    //   240: aload #4
    //   242: bipush #10
    //   244: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: aload_1
    //   249: aload #4
    //   251: invokevirtual toString : ()Ljava/lang/String;
    //   254: invokevirtual write : (Ljava/lang/String;)V
    //   257: goto -> 128
    //   260: aload_1
    //   261: invokestatic L : (Ljava/io/Writer;)V
    //   264: aload_0
    //   265: getfield h : Ljava/io/File;
    //   268: invokevirtual exists : ()Z
    //   271: ifeq -> 286
    //   274: aload_0
    //   275: getfield h : Ljava/io/File;
    //   278: aload_0
    //   279: getfield j : Ljava/io/File;
    //   282: iconst_1
    //   283: invokestatic E0 : (Ljava/io/File;Ljava/io/File;Z)V
    //   286: aload_0
    //   287: getfield i : Ljava/io/File;
    //   290: aload_0
    //   291: getfield h : Ljava/io/File;
    //   294: iconst_0
    //   295: invokestatic E0 : (Ljava/io/File;Ljava/io/File;Z)V
    //   298: aload_0
    //   299: getfield j : Ljava/io/File;
    //   302: invokevirtual delete : ()Z
    //   305: pop
    //   306: aload_0
    //   307: new java/io/BufferedWriter
    //   310: dup
    //   311: new java/io/OutputStreamWriter
    //   314: dup
    //   315: new java/io/FileOutputStream
    //   318: dup
    //   319: aload_0
    //   320: getfield h : Ljava/io/File;
    //   323: iconst_1
    //   324: invokespecial <init> : (Ljava/io/File;Z)V
    //   327: getstatic b1/d.a : Ljava/nio/charset/Charset;
    //   330: invokespecial <init> : (Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   333: invokespecial <init> : (Ljava/io/Writer;)V
    //   336: putfield o : Ljava/io/Writer;
    //   339: aload_0
    //   340: monitorexit
    //   341: return
    //   342: astore_2
    //   343: aload_1
    //   344: invokestatic L : (Ljava/io/Writer;)V
    //   347: aload_2
    //   348: athrow
    //   349: astore_1
    //   350: aload_0
    //   351: monitorexit
    //   352: aload_1
    //   353: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	349	finally
    //   11	15	349	finally
    //   15	44	349	finally
    //   44	128	342	finally
    //   128	199	342	finally
    //   202	257	342	finally
    //   260	286	349	finally
    //   286	339	349	finally
    //   343	349	349	finally
  }
  
  public boolean A0(String paramString) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial I : ()V
    //   6: aload_0
    //   7: getfield p : Ljava/util/LinkedHashMap;
    //   10: aload_1
    //   11: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   14: checkcast b1/b$d
    //   17: astore #4
    //   19: iconst_0
    //   20: istore_2
    //   21: aload #4
    //   23: ifnull -> 216
    //   26: aload #4
    //   28: invokestatic g : (Lb1/b$d;)Lb1/b$c;
    //   31: ifnull -> 37
    //   34: goto -> 216
    //   37: iload_2
    //   38: aload_0
    //   39: getfield m : I
    //   42: if_icmpge -> 134
    //   45: aload #4
    //   47: iload_2
    //   48: invokevirtual j : (I)Ljava/io/File;
    //   51: astore_3
    //   52: aload_3
    //   53: invokevirtual exists : ()Z
    //   56: ifeq -> 103
    //   59: aload_3
    //   60: invokevirtual delete : ()Z
    //   63: ifeq -> 69
    //   66: goto -> 103
    //   69: new java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial <init> : ()V
    //   76: astore_1
    //   77: aload_1
    //   78: ldc_w 'failed to delete '
    //   81: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: pop
    //   85: aload_1
    //   86: aload_3
    //   87: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   90: pop
    //   91: new java/io/IOException
    //   94: dup
    //   95: aload_1
    //   96: invokevirtual toString : ()Ljava/lang/String;
    //   99: invokespecial <init> : (Ljava/lang/String;)V
    //   102: athrow
    //   103: aload_0
    //   104: aload_0
    //   105: getfield n : J
    //   108: aload #4
    //   110: invokestatic a : (Lb1/b$d;)[J
    //   113: iload_2
    //   114: laload
    //   115: lsub
    //   116: putfield n : J
    //   119: aload #4
    //   121: invokestatic a : (Lb1/b$d;)[J
    //   124: iload_2
    //   125: lconst_0
    //   126: lastore
    //   127: iload_2
    //   128: iconst_1
    //   129: iadd
    //   130: istore_2
    //   131: goto -> 37
    //   134: aload_0
    //   135: aload_0
    //   136: getfield q : I
    //   139: iconst_1
    //   140: iadd
    //   141: putfield q : I
    //   144: aload_0
    //   145: getfield o : Ljava/io/Writer;
    //   148: ldc_w 'REMOVE'
    //   151: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   154: pop
    //   155: aload_0
    //   156: getfield o : Ljava/io/Writer;
    //   159: bipush #32
    //   161: invokevirtual append : (C)Ljava/io/Writer;
    //   164: pop
    //   165: aload_0
    //   166: getfield o : Ljava/io/Writer;
    //   169: aload_1
    //   170: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   173: pop
    //   174: aload_0
    //   175: getfield o : Ljava/io/Writer;
    //   178: bipush #10
    //   180: invokevirtual append : (C)Ljava/io/Writer;
    //   183: pop
    //   184: aload_0
    //   185: getfield p : Ljava/util/LinkedHashMap;
    //   188: aload_1
    //   189: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   192: pop
    //   193: aload_0
    //   194: invokespecial f0 : ()Z
    //   197: ifeq -> 212
    //   200: aload_0
    //   201: getfield s : Ljava/util/concurrent/ThreadPoolExecutor;
    //   204: aload_0
    //   205: getfield t : Ljava/util/concurrent/Callable;
    //   208: invokevirtual submit : (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   211: pop
    //   212: aload_0
    //   213: monitorexit
    //   214: iconst_1
    //   215: ireturn
    //   216: aload_0
    //   217: monitorexit
    //   218: iconst_0
    //   219: ireturn
    //   220: astore_1
    //   221: aload_0
    //   222: monitorexit
    //   223: aload_1
    //   224: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	220	finally
    //   26	34	220	finally
    //   37	66	220	finally
    //   69	103	220	finally
    //   103	127	220	finally
    //   134	212	220	finally
  }
  
  public void T() throws IOException {
    close();
    d.b(this.g);
  }
  
  public c Y(String paramString) throws IOException {
    return Z(paramString, -1L);
  }
  
  public void close() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield o : Ljava/io/Writer;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: new java/util/ArrayList
    //   17: dup
    //   18: aload_0
    //   19: getfield p : Ljava/util/LinkedHashMap;
    //   22: invokevirtual values : ()Ljava/util/Collection;
    //   25: invokespecial <init> : (Ljava/util/Collection;)V
    //   28: invokevirtual iterator : ()Ljava/util/Iterator;
    //   31: astore_1
    //   32: aload_1
    //   33: invokeinterface hasNext : ()Z
    //   38: ifeq -> 68
    //   41: aload_1
    //   42: invokeinterface next : ()Ljava/lang/Object;
    //   47: checkcast b1/b$d
    //   50: astore_2
    //   51: aload_2
    //   52: invokestatic g : (Lb1/b$d;)Lb1/b$c;
    //   55: ifnull -> 32
    //   58: aload_2
    //   59: invokestatic g : (Lb1/b$d;)Lb1/b$c;
    //   62: invokevirtual a : ()V
    //   65: goto -> 32
    //   68: aload_0
    //   69: invokespecial K0 : ()V
    //   72: aload_0
    //   73: getfield o : Ljava/io/Writer;
    //   76: invokestatic L : (Ljava/io/Writer;)V
    //   79: aload_0
    //   80: aconst_null
    //   81: putfield o : Ljava/io/Writer;
    //   84: aload_0
    //   85: monitorexit
    //   86: return
    //   87: astore_1
    //   88: aload_0
    //   89: monitorexit
    //   90: aload_1
    //   91: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	87	finally
    //   14	32	87	finally
    //   32	65	87	finally
    //   68	84	87	finally
  }
  
  public e d0(String paramString) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial I : ()V
    //   6: aload_0
    //   7: getfield p : Ljava/util/LinkedHashMap;
    //   10: aload_1
    //   11: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   14: checkcast b1/b$d
    //   17: astore #5
    //   19: aload #5
    //   21: ifnonnull -> 28
    //   24: aload_0
    //   25: monitorexit
    //   26: aconst_null
    //   27: areturn
    //   28: aload #5
    //   30: invokestatic e : (Lb1/b$d;)Z
    //   33: istore #4
    //   35: iload #4
    //   37: ifne -> 44
    //   40: aload_0
    //   41: monitorexit
    //   42: aconst_null
    //   43: areturn
    //   44: aload #5
    //   46: getfield c : [Ljava/io/File;
    //   49: astore #6
    //   51: aload #6
    //   53: arraylength
    //   54: istore_3
    //   55: iconst_0
    //   56: istore_2
    //   57: iload_2
    //   58: iload_3
    //   59: if_icmpge -> 87
    //   62: aload #6
    //   64: iload_2
    //   65: aaload
    //   66: invokevirtual exists : ()Z
    //   69: istore #4
    //   71: iload #4
    //   73: ifne -> 80
    //   76: aload_0
    //   77: monitorexit
    //   78: aconst_null
    //   79: areturn
    //   80: iload_2
    //   81: iconst_1
    //   82: iadd
    //   83: istore_2
    //   84: goto -> 57
    //   87: aload_0
    //   88: aload_0
    //   89: getfield q : I
    //   92: iconst_1
    //   93: iadd
    //   94: putfield q : I
    //   97: aload_0
    //   98: getfield o : Ljava/io/Writer;
    //   101: ldc_w 'READ'
    //   104: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   107: pop
    //   108: aload_0
    //   109: getfield o : Ljava/io/Writer;
    //   112: bipush #32
    //   114: invokevirtual append : (C)Ljava/io/Writer;
    //   117: pop
    //   118: aload_0
    //   119: getfield o : Ljava/io/Writer;
    //   122: aload_1
    //   123: invokevirtual append : (Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   126: pop
    //   127: aload_0
    //   128: getfield o : Ljava/io/Writer;
    //   131: bipush #10
    //   133: invokevirtual append : (C)Ljava/io/Writer;
    //   136: pop
    //   137: aload_0
    //   138: invokespecial f0 : ()Z
    //   141: ifeq -> 156
    //   144: aload_0
    //   145: getfield s : Ljava/util/concurrent/ThreadPoolExecutor;
    //   148: aload_0
    //   149: getfield t : Ljava/util/concurrent/Callable;
    //   152: invokevirtual submit : (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   155: pop
    //   156: new b1/b$e
    //   159: dup
    //   160: aload_0
    //   161: aload_1
    //   162: aload #5
    //   164: invokestatic c : (Lb1/b$d;)J
    //   167: aload #5
    //   169: getfield c : [Ljava/io/File;
    //   172: aload #5
    //   174: invokestatic a : (Lb1/b$d;)[J
    //   177: aconst_null
    //   178: invokespecial <init> : (Lb1/b;Ljava/lang/String;J[Ljava/io/File;[JLb1/b$a;)V
    //   181: astore_1
    //   182: aload_0
    //   183: monitorexit
    //   184: aload_1
    //   185: areturn
    //   186: astore_1
    //   187: aload_0
    //   188: monitorexit
    //   189: aload_1
    //   190: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	186	finally
    //   28	35	186	finally
    //   44	55	186	finally
    //   62	71	186	finally
    //   87	156	186	finally
    //   156	182	186	finally
  }
  
  class a implements Callable<Void> {
    a(b this$0) {}
    
    public Void a() throws Exception {
      synchronized (this.a) {
        if (b.c(this.a) == null)
          return null; 
        b.r(this.a);
        if (b.B(this.a)) {
          b.F(this.a);
          b.G(this.a, 0);
        } 
        return null;
      } 
    }
  }
  
  private static final class b implements ThreadFactory {
    private b() {}
    
    public Thread newThread(Runnable param1Runnable) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: new java/lang/Thread
      //   5: dup
      //   6: aload_1
      //   7: ldc 'glide-disk-lru-cache-thread'
      //   9: invokespecial <init> : (Ljava/lang/Runnable;Ljava/lang/String;)V
      //   12: astore_1
      //   13: aload_1
      //   14: iconst_1
      //   15: invokevirtual setPriority : (I)V
      //   18: aload_0
      //   19: monitorexit
      //   20: aload_1
      //   21: areturn
      //   22: astore_1
      //   23: aload_0
      //   24: monitorexit
      //   25: aload_1
      //   26: athrow
      // Exception table:
      //   from	to	target	type
      //   2	18	22	finally
    }
  }
  
  public final class c {
    private final b.d a;
    
    private final boolean[] b;
    
    private boolean c;
    
    private c(b this$0, b.d param1d) {
      boolean[] arrayOfBoolean;
      this.a = param1d;
      if (b.d.e(param1d)) {
        b.this = null;
      } else {
        arrayOfBoolean = new boolean[b.d(b.this)];
      } 
      this.b = arrayOfBoolean;
    }
    
    public void a() throws IOException {
      b.x(this.d, this, false);
    }
    
    public void b() {
      if (!this.c)
        try {
          a();
          return;
        } catch (IOException iOException) {
          return;
        }  
    }
    
    public void e() throws IOException {
      b.x(this.d, this, true);
      this.c = true;
    }
    
    public File f(int param1Int) throws IOException {
      synchronized (this.d) {
        if (b.d.g(this.a) == this) {
          if (!b.d.e(this.a))
            this.b[param1Int] = true; 
          File file = this.a.k(param1Int);
          b.t(this.d).mkdirs();
          return file;
        } 
        throw new IllegalStateException();
      } 
    }
  }
  
  private final class d {
    private final String a;
    
    private final long[] b;
    
    File[] c;
    
    File[] d;
    
    private boolean e;
    
    private b.c f;
    
    private long g;
    
    private d(b this$0, String param1String) {
      this.a = param1String;
      this.b = new long[b.d(b.this)];
      this.c = new File[b.d(b.this)];
      this.d = new File[b.d(b.this)];
      StringBuilder stringBuilder = new StringBuilder(param1String);
      stringBuilder.append('.');
      int j = stringBuilder.length();
      for (int i = 0; i < b.d(b.this); i++) {
        stringBuilder.append(i);
        this.c[i] = new File(b.t(b.this), stringBuilder.toString());
        stringBuilder.append(".tmp");
        this.d[i] = new File(b.t(b.this), stringBuilder.toString());
        stringBuilder.setLength(j);
      } 
    }
    
    private IOException m(String[] param1ArrayOfString) throws IOException {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("unexpected journal line: ");
      stringBuilder.append(Arrays.toString((Object[])param1ArrayOfString));
      throw new IOException(stringBuilder.toString());
    }
    
    private void n(String[] param1ArrayOfString) throws IOException {
      if (param1ArrayOfString.length == b.d(this.h)) {
        int i = 0;
        try {
          while (i < param1ArrayOfString.length) {
            this.b[i] = Long.parseLong(param1ArrayOfString[i]);
            i++;
          } 
          return;
        } catch (NumberFormatException numberFormatException) {
          throw m(param1ArrayOfString);
        } 
      } 
      throw m(param1ArrayOfString);
    }
    
    public File j(int param1Int) {
      return this.c[param1Int];
    }
    
    public File k(int param1Int) {
      return this.d[param1Int];
    }
    
    public String l() throws IOException {
      StringBuilder stringBuilder = new StringBuilder();
      for (long l : this.b) {
        stringBuilder.append(' ');
        stringBuilder.append(l);
      } 
      return stringBuilder.toString();
    }
  }
  
  public final class e {
    private final String a;
    
    private final long b;
    
    private final long[] c;
    
    private final File[] d;
    
    private e(b this$0, String param1String, long param1Long, File[] param1ArrayOfFile, long[] param1ArrayOflong) {
      this.a = param1String;
      this.b = param1Long;
      this.d = param1ArrayOfFile;
      this.c = param1ArrayOflong;
    }
    
    public File a(int param1Int) {
      return this.d[param1Int];
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b1\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */