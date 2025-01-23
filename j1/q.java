package j1;

import androidx.core.util.e;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import d1.e;
import d1.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import x1.k;

class q<Model, Data> implements n<Model, Data> {
  private final List<n<Model, Data>> a;
  
  private final e<List<Throwable>> b;
  
  q(List<n<Model, Data>> paramList, e<List<Throwable>> parame) {
    this.a = paramList;
    this.b = parame;
  }
  
  public boolean a(Model paramModel) {
    Iterator<n<Model, Data>> iterator = this.a.iterator();
    while (iterator.hasNext()) {
      if (((n)iterator.next()).a(paramModel))
        return true; 
    } 
    return false;
  }
  
  public n.a<Data> b(Model paramModel, int paramInt1, int paramInt2, g paramg) {
    n.a<Data> a;
    int j = this.a.size();
    ArrayList<d> arrayList = new ArrayList(j);
    Model model = null;
    int i = 0;
    e e1;
    for (e1 = null; i < j; e1 = e2) {
      n n1 = this.a.get(i);
      e e2 = e1;
      if (n1.a(paramModel)) {
        n.a a1 = n1.b(paramModel, paramInt1, paramInt2, paramg);
        e2 = e1;
        if (a1 != null) {
          e2 = a1.a;
          arrayList.add(a1.c);
        } 
      } 
      i++;
    } 
    paramModel = model;
    if (!arrayList.isEmpty()) {
      paramModel = model;
      if (e1 != null)
        a = new n.a(e1, new a((List)arrayList, this.b)); 
    } 
    return a;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("MultiModelLoader{modelLoaders=");
    stringBuilder.append(Arrays.toString(this.a.toArray()));
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  static class a<Data> implements d<Data>, d.a<Data> {
    private final List<d<Data>> g;
    
    private final e<List<Throwable>> h;
    
    private int i;
    
    private h j;
    
    private d.a<? super Data> k;
    
    private List<Throwable> l;
    
    private boolean m;
    
    a(List<d<Data>> param1List, e<List<Throwable>> param1e) {
      this.h = param1e;
      k.c(param1List);
      this.g = param1List;
      this.i = 0;
    }
    
    private void g() {
      if (this.m)
        return; 
      if (this.i < this.g.size() - 1) {
        this.i++;
        e(this.j, this.k);
        return;
      } 
      k.d(this.l);
      this.k.c((Exception)new GlideException("Fetch failed", new ArrayList<Throwable>(this.l)));
    }
    
    public Class<Data> a() {
      return ((d)this.g.get(0)).a();
    }
    
    public void b() {
      List<Throwable> list = this.l;
      if (list != null)
        this.h.a(list); 
      this.l = null;
      Iterator<d<Data>> iterator = this.g.iterator();
      while (iterator.hasNext())
        ((d)iterator.next()).b(); 
    }
    
    public void c(Exception param1Exception) {
      ((List<Exception>)k.d(this.l)).add(param1Exception);
      g();
    }
    
    public void cancel() {
      this.m = true;
      Iterator<d<Data>> iterator = this.g.iterator();
      while (iterator.hasNext())
        ((d)iterator.next()).cancel(); 
    }
    
    public d1.a d() {
      return ((d)this.g.get(0)).d();
    }
    
    public void e(h param1h, d.a<? super Data> param1a) {
      this.j = param1h;
      this.k = param1a;
      this.l = (List<Throwable>)this.h.b();
      ((d)this.g.get(this.i)).e(param1h, this);
      if (this.m)
        cancel(); 
    }
    
    public void f(Data param1Data) {
      if (param1Data != null) {
        this.k.f(param1Data);
        return;
      } 
      g();
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */