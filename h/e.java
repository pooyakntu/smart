package h;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

public class e extends b {
  private a s;
  
  private boolean t;
  
  e(a parama) {
    if (parama != null)
      h(parama); 
  }
  
  e(a parama, Resources paramResources) {
    h(new a(parama, this, paramResources));
    onStateChange(getState());
  }
  
  public void applyTheme(Resources.Theme paramTheme) {
    super.applyTheme(paramTheme);
    onStateChange(getState());
  }
  
  void h(b.d paramd) {
    super.h(paramd);
    if (paramd instanceof a)
      this.s = (a)paramd; 
  }
  
  public boolean isStateful() {
    return true;
  }
  
  a j() {
    return new a(this.s, this, null);
  }
  
  int[] k(AttributeSet paramAttributeSet) {
    int k = paramAttributeSet.getAttributeCount();
    int[] arrayOfInt = new int[k];
    int i = 0;
    int j;
    for (j = 0; i < k; j = m) {
      int n = paramAttributeSet.getAttributeNameResource(i);
      int m = j;
      if (n != 0) {
        m = j;
        if (n != 16842960) {
          m = j;
          if (n != 16843161) {
            if (paramAttributeSet.getAttributeBooleanValue(i, false)) {
              m = n;
            } else {
              m = -n;
            } 
            arrayOfInt[j] = m;
            m = j + 1;
          } 
        } 
      } 
      i++;
    } 
    return StateSet.trimStateSet(arrayOfInt, j);
  }
  
  public Drawable mutate() {
    if (!this.t && super.mutate() == this) {
      this.s.r();
      this.t = true;
    } 
    return this;
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    boolean bool = super.onStateChange(paramArrayOfint);
    int j = this.s.A(paramArrayOfint);
    int i = j;
    if (j < 0)
      i = this.s.A(StateSet.WILD_CARD); 
    return (g(i) || bool);
  }
  
  static class a extends b.d {
    int[][] J;
    
    a(a param1a, e param1e, Resources param1Resources) {
      super(param1a, param1e, param1Resources);
      if (param1a != null) {
        this.J = param1a.J;
        return;
      } 
      this.J = new int[f()][];
    }
    
    int A(int[] param1ArrayOfint) {
      int[][] arrayOfInt = this.J;
      int j = h();
      for (int i = 0; i < j; i++) {
        if (StateSet.stateSetMatches(arrayOfInt[i], param1ArrayOfint))
          return i; 
      } 
      return -1;
    }
    
    public Drawable newDrawable() {
      return new e(this, null);
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      return new e(this, param1Resources);
    }
    
    public void o(int param1Int1, int param1Int2) {
      super.o(param1Int1, param1Int2);
      int[][] arrayOfInt = new int[param1Int2][];
      System.arraycopy(this.J, 0, arrayOfInt, 0, param1Int1);
      this.J = arrayOfInt;
    }
    
    void r() {
      int[][] arrayOfInt1 = this.J;
      int[][] arrayOfInt2 = new int[arrayOfInt1.length][];
      for (int i = arrayOfInt1.length - 1; i >= 0; i--) {
        int[] arrayOfInt = this.J[i];
        if (arrayOfInt != null) {
          arrayOfInt = (int[])arrayOfInt.clone();
        } else {
          arrayOfInt = null;
        } 
        arrayOfInt2[i] = arrayOfInt;
      } 
      this.J = arrayOfInt2;
    }
    
    int z(int[] param1ArrayOfint, Drawable param1Drawable) {
      int i = a(param1Drawable);
      this.J[i] = param1ArrayOfint;
      return i;
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\h\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */