package j1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import d1.e;
import d1.g;
import java.io.File;
import java.io.FileNotFoundException;
import w1.d;

public final class k implements n<Uri, File> {
  private final Context a;
  
  public k(Context paramContext) {
    this.a = paramContext;
  }
  
  public n.a<File> c(Uri paramUri, int paramInt1, int paramInt2, g paramg) {
    return new n.a<File>((e)new d(paramUri), new b(this.a, paramUri));
  }
  
  public boolean d(Uri paramUri) {
    return e1.b.b(paramUri);
  }
  
  public static final class a implements o<Uri, File> {
    private final Context a;
    
    public a(Context param1Context) {
      this.a = param1Context;
    }
    
    public n<Uri, File> a(r param1r) {
      return new k(this.a);
    }
  }
  
  private static class b implements d<File> {
    private static final String[] i = new String[] { "_data" };
    
    private final Context g;
    
    private final Uri h;
    
    b(Context param1Context, Uri param1Uri) {
      this.g = param1Context;
      this.h = param1Uri;
    }
    
    public Class<File> a() {
      return File.class;
    }
    
    public void b() {}
    
    public void cancel() {}
    
    public d1.a d() {
      return d1.a.LOCAL;
    }
    
    public void e(h param1h, d.a<? super File> param1a) {
      StringBuilder stringBuilder;
      Cursor cursor = this.g.getContentResolver().query(this.h, i, null, null, null);
      param1h = null;
      h h1 = null;
      if (cursor != null) {
        param1h = h1;
        try {
          if (cursor.moveToFirst())
            String str = cursor.getString(cursor.getColumnIndexOrThrow("_data")); 
        } finally {
          cursor.close();
        } 
      } 
      if (TextUtils.isEmpty((CharSequence)param1h)) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to find file path for: ");
        stringBuilder.append(this.h);
        param1a.c(new FileNotFoundException(stringBuilder.toString()));
        return;
      } 
      param1a.f(new File((String)stringBuilder));
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */