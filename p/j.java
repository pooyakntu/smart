package p;

import java.util.ArrayList;
import java.util.Arrays;
import q.i;
import q.o;

public class j extends e implements i {
  public e[] L0 = new e[4];
  
  public int M0 = 0;
  
  public void a() {
    this.M0 = 0;
    Arrays.fill((Object[])this.L0, (Object)null);
  }
  
  public void b(e parame) {
    if (parame != this) {
      if (parame == null)
        return; 
      int k = this.M0;
      e[] arrayOfE = this.L0;
      if (k + 1 > arrayOfE.length)
        this.L0 = Arrays.<e>copyOf(arrayOfE, arrayOfE.length * 2); 
      arrayOfE = this.L0;
      k = this.M0;
      arrayOfE[k] = parame;
      this.M0 = k + 1;
    } 
  }
  
  public void c(f paramf) {}
  
  public void r1(ArrayList<o> paramArrayList, int paramInt, o paramo) {
    int m;
    byte b = 0;
    int k = 0;
    while (true) {
      m = b;
      if (k < this.M0) {
        paramo.a(this.L0[k]);
        k++;
        continue;
      } 
      break;
    } 
    while (m < this.M0) {
      i.a(this.L0[m], paramInt, paramArrayList, paramo);
      m++;
    } 
  }
  
  public int s1(int paramInt) {
    for (int k = 0; k < this.M0; k++) {
      e e1 = this.L0[k];
      if (paramInt == 0) {
        int m = e1.I0;
        if (m != -1)
          return m; 
      } 
      if (paramInt == 1) {
        int m = e1.J0;
        if (m != -1)
          return m; 
      } 
    } 
    return -1;
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */