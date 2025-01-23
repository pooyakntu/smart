package p1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.b;
import d1.k;
import java.nio.ByteBuffer;
import java.util.List;
import x1.k;

public class c extends Drawable implements g.b, Animatable {
  private final a g;
  
  private boolean h;
  
  private boolean i;
  
  private boolean j;
  
  private boolean k = true;
  
  private int l;
  
  private int m = -1;
  
  private boolean n;
  
  private Paint o;
  
  private Rect p;
  
  private List<b> q;
  
  public c(Context paramContext, c1.a parama, k<Bitmap> paramk, int paramInt1, int paramInt2, Bitmap paramBitmap) {
    this(new a(new g(com.bumptech.glide.c.c(paramContext), parama, paramInt1, paramInt2, paramk, paramBitmap)));
  }
  
  c(a parama) {
    this.g = (a)k.d(parama);
  }
  
  private Drawable.Callback b() {
    Drawable.Callback callback;
    for (callback = getCallback(); callback instanceof Drawable; callback = ((Drawable)callback).getCallback());
    return callback;
  }
  
  private Rect d() {
    if (this.p == null)
      this.p = new Rect(); 
    return this.p;
  }
  
  private Paint h() {
    if (this.o == null)
      this.o = new Paint(2); 
    return this.o;
  }
  
  private void j() {
    List<b> list = this.q;
    if (list != null) {
      int j = list.size();
      for (int i = 0; i < j; i++)
        ((b)this.q.get(i)).b(this); 
    } 
  }
  
  private void l() {
    this.l = 0;
  }
  
  private void n() {
    k.a(this.j ^ true, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
    if (this.g.a.f() == 1) {
      invalidateSelf();
      return;
    } 
    if (!this.h) {
      this.h = true;
      this.g.a.r(this);
      invalidateSelf();
    } 
  }
  
  private void o() {
    this.h = false;
    this.g.a.s(this);
  }
  
  public void a() {
    if (b() == null) {
      stop();
      invalidateSelf();
      return;
    } 
    invalidateSelf();
    if (g() == f() - 1)
      this.l++; 
    int i = this.m;
    if (i != -1 && this.l >= i) {
      j();
      stop();
    } 
  }
  
  public ByteBuffer c() {
    return this.g.a.b();
  }
  
  public void draw(Canvas paramCanvas) {
    if (this.j)
      return; 
    if (this.n) {
      Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
      this.n = false;
    } 
    paramCanvas.drawBitmap(this.g.a.c(), null, d(), h());
  }
  
  public Bitmap e() {
    return this.g.a.e();
  }
  
  public int f() {
    return this.g.a.f();
  }
  
  public int g() {
    return this.g.a.d();
  }
  
  public Drawable.ConstantState getConstantState() {
    return this.g;
  }
  
  public int getIntrinsicHeight() {
    return this.g.a.h();
  }
  
  public int getIntrinsicWidth() {
    return this.g.a.k();
  }
  
  public int getOpacity() {
    return -2;
  }
  
  public int i() {
    return this.g.a.j();
  }
  
  public boolean isRunning() {
    return this.h;
  }
  
  public void k() {
    this.j = true;
    this.g.a.a();
  }
  
  public void m(k<Bitmap> paramk, Bitmap paramBitmap) {
    this.g.a.o(paramk, paramBitmap);
  }
  
  protected void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    this.n = true;
  }
  
  public void setAlpha(int paramInt) {
    h().setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    h().setColorFilter(paramColorFilter);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    k.a(this.j ^ true, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
    this.k = paramBoolean1;
    if (!paramBoolean1) {
      o();
    } else if (this.i) {
      n();
    } 
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void start() {
    this.i = true;
    l();
    if (this.k)
      n(); 
  }
  
  public void stop() {
    this.i = false;
    o();
  }
  
  static final class a extends Drawable.ConstantState {
    final g a;
    
    a(g param1g) {
      this.a = param1g;
    }
    
    public int getChangingConfigurations() {
      return 0;
    }
    
    public Drawable newDrawable() {
      return new c(this);
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      return newDrawable();
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p1\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */