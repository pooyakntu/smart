package e3;

import android.content.ContentResolver;
import android.provider.Settings;

public class a {
  static {
  
  }
  
  public float a(ContentResolver paramContentResolver) {
    return Settings.Global.getFloat(paramContentResolver, "animator_duration_scale", 1.0F);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e3\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */