package p4;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

class d extends b {
  private final WeakReference<ViewPropertyAnimator> b;
  
  d(View paramView) {
    this.b = new WeakReference<ViewPropertyAnimator>(paramView.animate());
  }
  
  public b b(float paramFloat) {
    ViewPropertyAnimator viewPropertyAnimator = this.b.get();
    if (viewPropertyAnimator != null)
      viewPropertyAnimator.scaleX(paramFloat); 
    return this;
  }
  
  public b c(float paramFloat) {
    ViewPropertyAnimator viewPropertyAnimator = this.b.get();
    if (viewPropertyAnimator != null)
      viewPropertyAnimator.scaleY(paramFloat); 
    return this;
  }
  
  public b d(long paramLong) {
    ViewPropertyAnimator viewPropertyAnimator = this.b.get();
    if (viewPropertyAnimator != null)
      viewPropertyAnimator.setDuration(paramLong); 
    return this;
  }
  
  public b e(Interpolator paramInterpolator) {
    ViewPropertyAnimator viewPropertyAnimator = this.b.get();
    if (viewPropertyAnimator != null)
      viewPropertyAnimator.setInterpolator((TimeInterpolator)paramInterpolator); 
    return this;
  }
  
  public b f(n4.a.a parama) {
    ViewPropertyAnimator viewPropertyAnimator = this.b.get();
    if (viewPropertyAnimator != null) {
      if (parama == null) {
        viewPropertyAnimator.setListener(null);
        return this;
      } 
      viewPropertyAnimator.setListener(new a(this, parama));
    } 
    return this;
  }
  
  class a implements Animator.AnimatorListener {
    a(d this$0, n4.a.a param1a) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a.d(null);
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.e(null);
    }
    
    public void onAnimationRepeat(Animator param1Animator) {
      this.a.b(null);
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.a.a(null);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p4\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */