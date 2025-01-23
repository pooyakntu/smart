package e5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.smartpek.ui.device.coolerctrl.auto.CoolerStep;
import e8.q;
import f8.i;
import f8.o;
import java.util.Iterator;
import p7.c0;
import p7.e1;
import q8.l;
import r8.m;
import r8.n;
import s7.f;
import s7.g;
import s7.j;

public final class d extends g<CoolerStep, e> {
  private f<CoolerStep> k;
  
  private final q8.a<q> l;
  
  public d(f<CoolerStep> paramf, q8.a<q> parama, RecyclerView paramRecyclerView) {
    super(paramRecyclerView);
    this.k = paramf;
    this.l = parama;
  }
  
  public f<CoolerStep> S() {
    return this.k;
  }
  
  public boolean b() {
    return true;
  }
  
  public boolean c() {
    return true;
  }
  
  public void d(int paramInt) {
    super.d(paramInt);
    Iterator<Object> iterator = R().iterator();
    for (paramInt = 0; iterator.hasNext(); paramInt++) {
      CoolerStep coolerStep = (CoolerStep)iterator.next();
      if (paramInt < 0)
        o.r(); 
      coolerStep = coolerStep;
      coolerStep = R().get(paramInt);
      if (coolerStep != null)
        coolerStep.setIndex(paramInt); 
    } 
    c0.l(500, new c(this));
    this.l.invoke();
  }
  
  public boolean e(int paramInt1, int paramInt2) {
    int j = 0;
    int i = c.i.c();
    if (i.r((Object[])new Integer[] { Integer.valueOf(paramInt1 + 1), Integer.valueOf(paramInt2 + 1) }, Integer.valueOf(i)))
      return false; 
    CoolerStep coolerStep = R().get(paramInt1);
    if (coolerStep != null) {
      i = coolerStep.getIndex();
    } else {
      i = 0;
    } 
    coolerStep = R().get(paramInt1);
    if (coolerStep != null) {
      CoolerStep coolerStep1 = R().get(paramInt2);
      if (coolerStep1 != null)
        j = coolerStep1.getIndex(); 
      coolerStep.setIndex(j);
    } 
    coolerStep = R().get(paramInt2);
    if (coolerStep != null)
      coolerStep.setIndex(i); 
    c0.l(500, new d(this, paramInt1, paramInt2));
    return true;
  }
  
  public void f0(e parame, int paramInt) {
    m.j(parame, "holder");
    parame.a0(R().get(paramInt), paramInt);
    View view = parame.b();
    if (view != null)
      e1.b(view, new b(this, parame, paramInt)); 
  }
  
  public e g0(ViewGroup paramViewGroup, int paramInt) {
    m.j(paramViewGroup, "parent");
    View view = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131558541, paramViewGroup, false);
    m.i(view, "from(parent.context).inf…auto_step, parent, false)");
    return new e(view);
  }
  
  public long k(int paramInt) {
    return paramInt;
  }
  
  public enum a {
    STEP_CHANGE;
    
    static {
    
    }
  }
  
  static final class b extends n implements l<View, q> {
    b(d param1d, e param1e, int param1Int) {
      super(1);
    }
    
    public final void a(View param1View) {
      m.j(param1View, "it");
      f<CoolerStep> f = this.g.S();
      if (f != null)
        f.B(this.h.q(), this.g.R().get(this.i), param1View); 
    }
  }
  
  static final class c extends n implements q8.a<q> {
    c(d param1d) {
      super(0);
    }
    
    public final void invoke() {
      d d1 = this.g;
      d1.t(0, d1.j(), d.a.STEP_CHANGE);
    }
  }
  
  static final class d extends n implements q8.a<q> {
    d(d param1d, int param1Int1, int param1Int2) {
      super(0);
    }
    
    public final void invoke() {
      d d1 = this.g;
      int i = this.h;
      d.a a1 = d.a.STEP_CHANGE;
      d1.p(i, a1);
      this.g.p(this.i, a1);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e5\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */