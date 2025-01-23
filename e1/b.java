package e1;

import android.net.Uri;

public final class b {
  public static boolean a(Uri paramUri) {
    return (b(paramUri) && !e(paramUri));
  }
  
  public static boolean b(Uri paramUri) {
    return (paramUri != null && "content".equals(paramUri.getScheme()) && "media".equals(paramUri.getAuthority()));
  }
  
  public static boolean c(Uri paramUri) {
    return (b(paramUri) && e(paramUri));
  }
  
  public static boolean d(int paramInt1, int paramInt2) {
    return (paramInt1 != Integer.MIN_VALUE && paramInt2 != Integer.MIN_VALUE && paramInt1 <= 512 && paramInt2 <= 384);
  }
  
  private static boolean e(Uri paramUri) {
    return paramUri.getPathSegments().contains("video");
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e1\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */