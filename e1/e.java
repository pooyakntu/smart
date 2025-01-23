package e1;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import g1.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

class e {
  private static final a f = new a();
  
  private final a a;
  
  private final d b;
  
  private final b c;
  
  private final ContentResolver d;
  
  private final List<ImageHeaderParser> e;
  
  e(List<ImageHeaderParser> paramList, a parama, d paramd, b paramb, ContentResolver paramContentResolver) {
    this.a = parama;
    this.b = paramd;
    this.c = paramb;
    this.d = paramContentResolver;
    this.e = paramList;
  }
  
  e(List<ImageHeaderParser> paramList, d paramd, b paramb, ContentResolver paramContentResolver) {
    this(paramList, f, paramd, paramb, paramContentResolver);
  }
  
  private String b(Uri paramUri) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield b : Le1/d;
    //   6: aload_1
    //   7: invokeinterface a : (Landroid/net/Uri;)Landroid/database/Cursor;
    //   12: astore_3
    //   13: aload_3
    //   14: ifnull -> 48
    //   17: aload_3
    //   18: astore_2
    //   19: aload_3
    //   20: invokeinterface moveToFirst : ()Z
    //   25: ifeq -> 48
    //   28: aload_3
    //   29: astore_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokeinterface getString : (I)Ljava/lang/String;
    //   37: astore #4
    //   39: aload_3
    //   40: invokeinterface close : ()V
    //   45: aload #4
    //   47: areturn
    //   48: aload_3
    //   49: ifnull -> 58
    //   52: aload_3
    //   53: invokeinterface close : ()V
    //   58: aconst_null
    //   59: areturn
    //   60: astore_1
    //   61: goto -> 120
    //   64: aconst_null
    //   65: astore_3
    //   66: aload_3
    //   67: astore_2
    //   68: ldc 'ThumbStreamOpener'
    //   70: iconst_3
    //   71: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   74: ifeq -> 107
    //   77: aload_3
    //   78: astore_2
    //   79: new java/lang/StringBuilder
    //   82: dup
    //   83: invokespecial <init> : ()V
    //   86: astore #4
    //   88: aload_3
    //   89: astore_2
    //   90: aload #4
    //   92: ldc 'Failed to query for thumbnail for Uri: '
    //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: aload_3
    //   99: astore_2
    //   100: aload #4
    //   102: aload_1
    //   103: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload_3
    //   108: ifnull -> 117
    //   111: aload_3
    //   112: invokeinterface close : ()V
    //   117: aconst_null
    //   118: areturn
    //   119: astore_1
    //   120: aload_2
    //   121: ifnull -> 130
    //   124: aload_2
    //   125: invokeinterface close : ()V
    //   130: aload_1
    //   131: athrow
    //   132: astore_2
    //   133: goto -> 64
    //   136: astore_2
    //   137: goto -> 66
    // Exception table:
    //   from	to	target	type
    //   2	13	132	java/lang/SecurityException
    //   2	13	60	finally
    //   19	28	136	java/lang/SecurityException
    //   19	28	119	finally
    //   30	39	136	java/lang/SecurityException
    //   30	39	119	finally
    //   68	77	119	finally
    //   79	88	119	finally
    //   90	98	119	finally
    //   100	107	119	finally
  }
  
  private boolean c(File paramFile) {
    return (this.a.a(paramFile) && 0L < this.a.c(paramFile));
  }
  
  int a(Uri paramUri) {
    InputStream inputStream2 = null;
    InputStream inputStream1 = null;
    try {
      InputStream inputStream = this.d.openInputStream(paramUri);
      inputStream1 = inputStream;
      inputStream2 = inputStream;
      int i = a.b(this.e, inputStream, this.c);
      return i;
    } catch (IOException|NullPointerException iOException) {
      inputStream1 = inputStream2;
      if (Log.isLoggable("ThumbStreamOpener", 3)) {
        inputStream1 = inputStream2;
        StringBuilder stringBuilder = new StringBuilder();
        inputStream1 = inputStream2;
        stringBuilder.append("Failed to open uri: ");
        inputStream1 = inputStream2;
        stringBuilder.append(null);
      } 
      return -1;
    } finally {
      if (inputStream1 != null)
        try {
          inputStream1.close();
        } catch (IOException iOException) {} 
    } 
  }
  
  public InputStream d(Uri paramUri) throws FileNotFoundException {
    String str = b(paramUri);
    if (TextUtils.isEmpty(str))
      return null; 
    File file = this.a.b(str);
    if (!c(file))
      return null; 
    Uri uri = Uri.fromFile(file);
    try {
      return this.d.openInputStream(uri);
    } catch (NullPointerException nullPointerException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("NPE opening uri: ");
      stringBuilder.append(paramUri);
      stringBuilder.append(" -> ");
      stringBuilder.append(uri);
      throw (FileNotFoundException)(new FileNotFoundException(stringBuilder.toString())).initCause(nullPointerException);
    } 
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e1\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */