package p;

import java.util.ArrayList;
import m.c;

public class m extends e {
  public ArrayList<e> L0 = new ArrayList<e>();
  
  public void b(e parame) {
    this.L0.add(parame);
    if (parame.K() != null)
      ((m)parame.K()).t1(parame); 
    parame.c1(this);
  }
  
  public ArrayList<e> r1() {
    return this.L0;
  }
  
  public void s1() {
    ArrayList<e> arrayList = this.L0;
    if (arrayList == null)
      return; 
    int j = arrayList.size();
    for (int i = 0; i < j; i++) {
      e e1 = this.L0.get(i);
      if (e1 instanceof m)
        ((m)e1).s1(); 
    } 
  }
  
  public void t0() {
    this.L0.clear();
    super.t0();
  }
  
  public void t1(e parame) {
    this.L0.remove(parame);
    parame.t0();
  }
  
  public void u1() {
    this.L0.clear();
  }
  
  public void w0(c paramc) {
    super.w0(paramc);
    int j = this.L0.size();
    for (int i = 0; i < j; i++)
      ((e)this.L0.get(i)).w0(paramc); 
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */