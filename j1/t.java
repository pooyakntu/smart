package j1;

import d1.d;
import d1.g;
import g1.b;
import java.io.File;
import java.io.InputStream;

public class t implements d<InputStream> {
  private final b a;
  
  public t(b paramb) {
    this.a = paramb;
  }
  
  public boolean c(InputStream paramInputStream, File paramFile, g paramg) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lg1/b;
    //   4: ldc 65536
    //   6: ldc [B
    //   8: invokeinterface d : (ILjava/lang/Class;)Ljava/lang/Object;
    //   13: checkcast [B
    //   16: astore #6
    //   18: aconst_null
    //   19: astore #5
    //   21: aconst_null
    //   22: astore_3
    //   23: new java/io/FileOutputStream
    //   26: dup
    //   27: aload_2
    //   28: invokespecial <init> : (Ljava/io/File;)V
    //   31: astore_2
    //   32: aload_1
    //   33: aload #6
    //   35: invokevirtual read : ([B)I
    //   38: istore #4
    //   40: iload #4
    //   42: iconst_m1
    //   43: if_icmpeq -> 58
    //   46: aload_2
    //   47: aload #6
    //   49: iconst_0
    //   50: iload #4
    //   52: invokevirtual write : ([BII)V
    //   55: goto -> 32
    //   58: aload_2
    //   59: invokevirtual close : ()V
    //   62: aload_2
    //   63: invokevirtual close : ()V
    //   66: aload_0
    //   67: getfield a : Lg1/b;
    //   70: aload #6
    //   72: invokeinterface put : (Ljava/lang/Object;)V
    //   77: iconst_1
    //   78: ireturn
    //   79: astore_1
    //   80: aload_2
    //   81: astore_3
    //   82: goto -> 124
    //   85: aload_2
    //   86: astore_1
    //   87: goto -> 94
    //   90: astore_1
    //   91: goto -> 124
    //   94: aload_1
    //   95: astore_3
    //   96: ldc 'StreamEncoder'
    //   98: iconst_3
    //   99: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   102: pop
    //   103: aload_1
    //   104: ifnull -> 111
    //   107: aload_1
    //   108: invokevirtual close : ()V
    //   111: aload_0
    //   112: getfield a : Lg1/b;
    //   115: aload #6
    //   117: invokeinterface put : (Ljava/lang/Object;)V
    //   122: iconst_0
    //   123: ireturn
    //   124: aload_3
    //   125: ifnull -> 132
    //   128: aload_3
    //   129: invokevirtual close : ()V
    //   132: aload_0
    //   133: getfield a : Lg1/b;
    //   136: aload #6
    //   138: invokeinterface put : (Ljava/lang/Object;)V
    //   143: aload_1
    //   144: athrow
    //   145: astore_1
    //   146: aload #5
    //   148: astore_1
    //   149: goto -> 94
    //   152: astore_1
    //   153: goto -> 85
    //   156: astore_1
    //   157: goto -> 66
    //   160: astore_1
    //   161: goto -> 111
    //   164: astore_2
    //   165: goto -> 132
    // Exception table:
    //   from	to	target	type
    //   23	32	145	java/io/IOException
    //   23	32	90	finally
    //   32	40	152	java/io/IOException
    //   32	40	79	finally
    //   46	55	152	java/io/IOException
    //   46	55	79	finally
    //   58	62	152	java/io/IOException
    //   58	62	79	finally
    //   62	66	156	java/io/IOException
    //   96	103	90	finally
    //   107	111	160	java/io/IOException
    //   128	132	164	java/io/IOException
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */