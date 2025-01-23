package b5;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import c5.a;
import c5.c;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.data.local.db.models.Group;
import com.smartpek.data.local.models.b;
import com.smartpek.ui.customviews.PowerButton;
import com.smartpek.ui.customviews.TriStateSwitch;
import com.smartpek.ui.customviews.c;
import e8.q;
import java.util.List;
import java.util.Map;
import q8.l;
import q8.p;
import q8.r;

public abstract class a extends Fragment implements a {
  private long g;
  
  private boolean h = true;
  
  private boolean i = true;
  
  public Map<Integer, View> j;
  
  public boolean A() {
    return this.h;
  }
  
  public void E(e parame, b.a parama, int paramInt, Device paramDevice, PowerButton paramPowerButton, c paramc, q8.a<q> parama1, q8.a<q> parama2, p<? super String, ? super b, q> paramp) {
    a.a.g(this, parame, parama, paramInt, paramDevice, paramPowerButton, paramc, parama1, parama2, paramp);
  }
  
  public void G(e parame, b.a parama, int paramInt, Integer paramInteger, Device paramDevice, c paramc, c paramc1, q8.a<q> parama1, q8.a<q> parama2, r<? super String, ? super String, ? super b, ? super Boolean, q> paramr) {
    a.a.f(this, parame, parama, paramInt, paramInteger, paramDevice, paramc, paramc1, parama1, parama2, paramr);
  }
  
  public void H() {
    this.j.clear();
  }
  
  public void I(e parame, View paramView, Group paramGroup, List<? extends Device> paramList, TriStateSwitch.b paramb, l<? super List<String>, q> paraml) {
    a.a.e(this, parame, paramView, paramGroup, paramList, paramb, paraml);
  }
  
  public void a(long paramLong) {
    this.g = paramLong;
  }
  
  public long b() {
    return this.g;
  }
  
  public boolean f(e parame, Context paramContext, b.a parama, int paramInt, Device paramDevice, PowerButton paramPowerButton, c paramc, q8.a<q> parama1, q8.a<q> parama2, p<? super String, ? super b, q> paramp) {
    return a.a.h(this, parame, paramContext, parama, paramInt, paramDevice, paramPowerButton, paramc, parama1, parama2, paramp);
  }
  
  public void l(e parame, Context paramContext, int paramInt, Integer paramInteger, Device paramDevice, c paramc, c paramc1, boolean paramBoolean1, boolean paramBoolean2, q8.a<q> parama, r<? super String, ? super String, ? super b, ? super Boolean, q> paramr) {
    a.a.k(this, parame, paramContext, paramInt, paramInteger, paramDevice, paramc, paramc1, paramBoolean1, paramBoolean2, parama, paramr);
  }
  
  public void t(Context paramContext, b.a parama, int paramInt, Integer paramInteger, Device paramDevice, c paramc, c paramc1, q8.a<q> parama1, q8.a<q> parama2, r<? super String, ? super String, ? super b, ? super Boolean, q> paramr) {
    a.a.d(this, paramContext, parama, paramInt, paramInteger, paramDevice, paramc, paramc1, parama1, parama2, paramr);
  }
  
  public boolean u() {
    return this.i;
  }
  
  public void z(boolean paramBoolean) {
    this.i = paramBoolean;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\b5\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */