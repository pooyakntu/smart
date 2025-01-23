package h1;

import android.util.Log;
import b1.b;
import java.io.File;
import java.io.IOException;

public class e implements a {
  private final j a;
  
  private final File b;
  
  private final long c;
  
  private final c d = new c();
  
  private b e;
  
  @Deprecated
  protected e(File paramFile, long paramLong) {
    this.b = paramFile;
    this.c = paramLong;
    this.a = new j();
  }
  
  public static a c(File paramFile, long paramLong) {
    return new e(paramFile, paramLong);
  }
  
  private b d() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Lb1/b;
    //   6: ifnonnull -> 26
    //   9: aload_0
    //   10: aload_0
    //   11: getfield b : Ljava/io/File;
    //   14: iconst_1
    //   15: iconst_1
    //   16: aload_0
    //   17: getfield c : J
    //   20: invokestatic o0 : (Ljava/io/File;IIJ)Lb1/b;
    //   23: putfield e : Lb1/b;
    //   26: aload_0
    //   27: getfield e : Lb1/b;
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: areturn
    //   35: astore_1
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_1
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	35	finally
    //   26	31	35	finally
  }
  
  public void a(d1.e parame, a.b paramb) {
    String str = this.a.b(parame);
    this.d.a(str);
    try {
      if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Put: Obtained: ");
        stringBuilder.append(str);
        stringBuilder.append(" for for Key: ");
        stringBuilder.append(parame);
      } 
      try {
        b b1 = d();
        b.e e1 = b1.d0(str);
        if (e1 != null)
          return; 
        b.c c1 = b1.Y(str);
        if (c1 != null) {
          try {
            if (paramb.a(c1.f(0)))
              c1.e(); 
          } finally {
            c1.b();
          } 
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Had two simultaneous puts for: ");
          stringBuilder.append(str);
          throw new IllegalStateException(stringBuilder.toString());
        } 
      } catch (IOException iOException) {
        Log.isLoggable("DiskLruCacheWrapper", 5);
      } 
      return;
    } finally {
      this.d.b(str);
    } 
  }
  
  public File b(d1.e parame) {
    String str = this.a.b(parame);
    if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Get: Obtained: ");
      stringBuilder.append(str);
      stringBuilder.append(" for for Key: ");
      stringBuilder.append(parame);
    } 
    parame = null;
    try {
      File file;
      b.e e1 = d().d0(str);
      if (e1 != null)
        file = e1.a(0); 
      return file;
    } catch (IOException iOException) {
      return null;
    } 
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h1\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */