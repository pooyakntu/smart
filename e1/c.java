package e1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class c implements d<InputStream> {
  private final Uri g;
  
  private final e h;
  
  private InputStream i;
  
  c(Uri paramUri, e parame) {
    this.g = paramUri;
    this.h = parame;
  }
  
  private static c c(Context paramContext, Uri paramUri, d paramd) {
    g1.b b = com.bumptech.glide.c.c(paramContext).e();
    return new c(paramUri, new e(com.bumptech.glide.c.c(paramContext).j().g(), paramd, b, paramContext.getContentResolver()));
  }
  
  public static c f(Context paramContext, Uri paramUri) {
    return c(paramContext, paramUri, new a(paramContext.getContentResolver()));
  }
  
  public static c g(Context paramContext, Uri paramUri) {
    return c(paramContext, paramUri, new b(paramContext.getContentResolver()));
  }
  
  private InputStream h() throws FileNotFoundException {
    byte b;
    g g;
    InputStream inputStream2 = this.h.d(this.g);
    if (inputStream2 != null) {
      b = this.h.a(this.g);
    } else {
      b = -1;
    } 
    InputStream inputStream1 = inputStream2;
    if (b != -1)
      g = new g(inputStream2, b); 
    return (InputStream)g;
  }
  
  public Class<InputStream> a() {
    return InputStream.class;
  }
  
  public void b() {
    InputStream inputStream = this.i;
    if (inputStream != null)
      try {
        inputStream.close();
        return;
      } catch (IOException iOException) {
        return;
      }  
  }
  
  public void cancel() {}
  
  public d1.a d() {
    return d1.a.LOCAL;
  }
  
  public void e(h paramh, d.a<? super InputStream> parama) {
    try {
      InputStream inputStream = h();
      this.i = inputStream;
      parama.f(inputStream);
      return;
    } catch (FileNotFoundException fileNotFoundException) {
      parama.c(fileNotFoundException);
      return;
    } 
  }
  
  static class a implements d {
    private static final String[] b = new String[] { "_data" };
    
    private final ContentResolver a;
    
    a(ContentResolver param1ContentResolver) {
      this.a = param1ContentResolver;
    }
    
    public Cursor a(Uri param1Uri) {
      String str = param1Uri.getLastPathSegment();
      return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[] { str }, null);
    }
  }
  
  static class b implements d {
    private static final String[] b = new String[] { "_data" };
    
    private final ContentResolver a;
    
    b(ContentResolver param1ContentResolver) {
      this.a = param1ContentResolver;
    }
    
    public Cursor a(Uri param1Uri) {
      String str = param1Uri.getLastPathSegment();
      return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[] { str }, null);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e1\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */