package p1;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import c1.c;
import c1.d;
import c1.e;
import com.bumptech.glide.load.ImageHeaderParser;
import d1.g;
import d1.i;
import d1.k;
import f1.c;
import g1.d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import l1.n;
import x1.g;
import x1.l;

public class a implements i<ByteBuffer, c> {
  private static final a f = new a();
  
  private static final b g = new b();
  
  private final Context a;
  
  private final List<ImageHeaderParser> b;
  
  private final b c;
  
  private final a d;
  
  private final b e;
  
  public a(Context paramContext, List<ImageHeaderParser> paramList, d paramd, g1.b paramb) {
    this(paramContext, paramList, paramd, paramb, g, f);
  }
  
  a(Context paramContext, List<ImageHeaderParser> paramList, d paramd, g1.b paramb, b paramb1, a parama) {
    this.a = paramContext.getApplicationContext();
    this.b = paramList;
    this.d = parama;
    this.e = new b(paramd, paramb);
    this.c = paramb1;
  }
  
  private e c(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, d paramd, g paramg) {
    long l = g.b();
    try {
      StringBuilder stringBuilder2;
      StringBuilder stringBuilder1;
      Bitmap.Config config;
      c c = paramd.c();
      if (c.b() <= 0 || c.c() != 0)
        return null; 
      if (paramg.c(i.a) == d1.b.PREFER_RGB_565) {
        config = Bitmap.Config.RGB_565;
      } else {
        config = Bitmap.Config.ARGB_8888;
      } 
      int j = e(c, paramInt1, paramInt2);
      c1.a a1 = this.d.a(this.e, c, (ByteBuffer)stringBuilder2, j);
      a1.e(config);
      a1.b();
      Bitmap bitmap = a1.a();
      if (bitmap == null)
        return null; 
      n n = n.c();
      return new e(new c(this.a, (c1.a)stringBuilder1, (k<Bitmap>)n, paramInt1, paramInt2, bitmap));
    } finally {
      if (Log.isLoggable("BufferGifDecoder", 2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Decoded GIF from stream in ");
        stringBuilder.append(g.a(l));
      } 
    } 
  }
  
  private static int e(c paramc, int paramInt1, int paramInt2) {
    int j = Math.min(paramc.a() / paramInt2, paramc.d() / paramInt1);
    if (j == 0) {
      j = 0;
    } else {
      j = Integer.highestOneBit(j);
    } 
    j = Math.max(1, j);
    if (Log.isLoggable("BufferGifDecoder", 2) && j > 1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Downsampling GIF, sampleSize: ");
      stringBuilder.append(j);
      stringBuilder.append(", target dimens: [");
      stringBuilder.append(paramInt1);
      stringBuilder.append("x");
      stringBuilder.append(paramInt2);
      stringBuilder.append("], actual dimens: [");
      stringBuilder.append(paramc.d());
      stringBuilder.append("x");
      stringBuilder.append(paramc.a());
      stringBuilder.append("]");
    } 
    return j;
  }
  
  public e d(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, g paramg) {
    d d = this.c.a(paramByteBuffer);
    try {
      return c(paramByteBuffer, paramInt1, paramInt2, d, paramg);
    } finally {
      this.c.b(d);
    } 
  }
  
  public boolean f(ByteBuffer paramByteBuffer, g paramg) throws IOException {
    return (!((Boolean)paramg.c(i.b)).booleanValue() && com.bumptech.glide.load.a.g(this.b, paramByteBuffer) == ImageHeaderParser.ImageType.GIF);
  }
  
  static class a {
    c1.a a(c1.a.a param1a, c param1c, ByteBuffer param1ByteBuffer, int param1Int) {
      return (c1.a)new e(param1a, param1c, param1ByteBuffer, param1Int);
    }
  }
  
  static class b {
    private final Queue<d> a = l.e(0);
    
    d a(ByteBuffer param1ByteBuffer) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield a : Ljava/util/Queue;
      //   6: invokeinterface poll : ()Ljava/lang/Object;
      //   11: checkcast c1/d
      //   14: astore_3
      //   15: aload_3
      //   16: astore_2
      //   17: aload_3
      //   18: ifnonnull -> 29
      //   21: new c1/d
      //   24: dup
      //   25: invokespecial <init> : ()V
      //   28: astore_2
      //   29: aload_2
      //   30: aload_1
      //   31: invokevirtual p : (Ljava/nio/ByteBuffer;)Lc1/d;
      //   34: astore_1
      //   35: aload_0
      //   36: monitorexit
      //   37: aload_1
      //   38: areturn
      //   39: astore_1
      //   40: aload_0
      //   41: monitorexit
      //   42: aload_1
      //   43: athrow
      // Exception table:
      //   from	to	target	type
      //   2	15	39	finally
      //   21	29	39	finally
      //   29	35	39	finally
    }
    
    void b(d param1d) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_1
      //   3: invokevirtual a : ()V
      //   6: aload_0
      //   7: getfield a : Ljava/util/Queue;
      //   10: aload_1
      //   11: invokeinterface offer : (Ljava/lang/Object;)Z
      //   16: pop
      //   17: aload_0
      //   18: monitorexit
      //   19: return
      //   20: astore_1
      //   21: aload_0
      //   22: monitorexit
      //   23: aload_1
      //   24: athrow
      // Exception table:
      //   from	to	target	type
      //   2	17	20	finally
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p1\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */