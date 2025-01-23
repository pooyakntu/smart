package h;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

public class c extends Drawable implements Drawable.Callback {
  private Drawable g;
  
  public c(Drawable paramDrawable) {
    a(paramDrawable);
  }
  
  public void a(Drawable paramDrawable) {
    Drawable drawable = this.g;
    if (drawable != null)
      drawable.setCallback(null); 
    this.g = paramDrawable;
    if (paramDrawable != null)
      paramDrawable.setCallback(this); 
  }
  
  public void draw(Canvas paramCanvas) {
    this.g.draw(paramCanvas);
  }
  
  public int getChangingConfigurations() {
    return this.g.getChangingConfigurations();
  }
  
  public Drawable getCurrent() {
    return this.g.getCurrent();
  }
  
  public int getIntrinsicHeight() {
    return this.g.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth() {
    return this.g.getIntrinsicWidth();
  }
  
  public int getMinimumHeight() {
    return this.g.getMinimumHeight();
  }
  
  public int getMinimumWidth() {
    return this.g.getMinimumWidth();
  }
  
  public int getOpacity() {
    return this.g.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect) {
    return this.g.getPadding(paramRect);
  }
  
  public int[] getState() {
    return this.g.getState();
  }
  
  public Region getTransparentRegion() {
    return this.g.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    invalidateSelf();
  }
  
  public boolean isAutoMirrored() {
    return a.h(this.g);
  }
  
  public boolean isStateful() {
    return this.g.isStateful();
  }
  
  public void jumpToCurrentState() {
    this.g.jumpToCurrentState();
  }
  
  protected void onBoundsChange(Rect paramRect) {
    this.g.setBounds(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt) {
    return this.g.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt) {
    this.g.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    a.j(this.g, paramBoolean);
  }
  
  public void setChangingConfigurations(int paramInt) {
    this.g.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.g.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean) {
    this.g.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean) {
    this.g.setFilterBitmap(paramBoolean);
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2) {
    a.k(this.g, paramFloat1, paramFloat2);
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a.l(this.g, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean setState(int[] paramArrayOfint) {
    return this.g.setState(paramArrayOfint);
  }
  
  public void setTint(int paramInt) {
    a.n(this.g, paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    a.o(this.g, paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    a.p(this.g, paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    return (super.setVisible(paramBoolean1, paramBoolean2) || this.g.setVisible(paramBoolean1, paramBoolean2));
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    unscheduleSelf(paramRunnable);
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */