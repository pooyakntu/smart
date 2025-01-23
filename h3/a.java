package h3;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.r;
import j3.g;
import j3.k;
import j3.n;

public class a extends Drawable implements n, r {
  private b g;
  
  private a(b paramb) {
    this.g = paramb;
  }
  
  public a(k paramk) {
    this(new b(new g(paramk)));
  }
  
  public a a() {
    this.g = new b(this.g);
    return this;
  }
  
  public void draw(Canvas paramCanvas) {
    b b1 = this.g;
    if (b1.b)
      b1.a.draw(paramCanvas); 
  }
  
  public Drawable.ConstantState getConstantState() {
    return this.g;
  }
  
  public int getOpacity() {
    return this.g.a.getOpacity();
  }
  
  public boolean isStateful() {
    return true;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    this.g.a.setBounds(paramRect);
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    boolean bool1 = super.onStateChange(paramArrayOfint);
    if (this.g.a.setState(paramArrayOfint))
      bool1 = true; 
    boolean bool2 = b.f(paramArrayOfint);
    b b1 = this.g;
    if (b1.b != bool2) {
      b1.b = bool2;
      return true;
    } 
    return bool1;
  }
  
  public void setAlpha(int paramInt) {
    this.g.a.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.g.a.setColorFilter(paramColorFilter);
  }
  
  public void setShapeAppearanceModel(k paramk) {
    this.g.a.setShapeAppearanceModel(paramk);
  }
  
  public void setTint(int paramInt) {
    this.g.a.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    this.g.a.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    this.g.a.setTintMode(paramMode);
  }
  
  static final class b extends Drawable.ConstantState {
    g a;
    
    boolean b;
    
    public b(b param1b) {
      this.a = (g)param1b.a.getConstantState().newDrawable();
      this.b = param1b.b;
    }
    
    public b(g param1g) {
      this.a = param1g;
      this.b = false;
    }
    
    public a a() {
      return new a(new b(this), null);
    }
    
    public int getChangingConfigurations() {
      return 0;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h3\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */