package p1;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c;
import d1.k;
import f1.c;
import g1.d;
import java.security.MessageDigest;
import x1.k;

public class f implements k<c> {
  private final k<Bitmap> b;
  
  public f(k<Bitmap> paramk) {
    this.b = (k<Bitmap>)k.d(paramk);
  }
  
  public void a(MessageDigest paramMessageDigest) {
    this.b.a(paramMessageDigest);
  }
  
  public c<c> b(Context paramContext, c<c> paramc, int paramInt1, int paramInt2) {
    c c2 = (c)paramc.get();
    d d = c.c(paramContext).f();
    com.bumptech.glide.load.resource.bitmap.f f1 = new com.bumptech.glide.load.resource.bitmap.f(c2.e(), d);
    c c1 = this.b.b(paramContext, (c)f1, paramInt1, paramInt2);
    if (!f1.equals(c1))
      f1.a(); 
    Bitmap bitmap = (Bitmap)c1.get();
    c2.m(this.b, bitmap);
    return paramc;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof f) {
      paramObject = paramObject;
      return this.b.equals(((f)paramObject).b);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.b.hashCode();
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p1\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */