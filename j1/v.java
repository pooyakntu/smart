package j1;

import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import d1.e;
import d1.g;
import w1.d;

public class v<Model> implements n<Model, Model> {
  private static final v<?> a = new v();
  
  public static <T> v<T> c() {
    return (v)a;
  }
  
  public boolean a(Model paramModel) {
    return true;
  }
  
  public n.a<Model> b(Model paramModel, int paramInt1, int paramInt2, g paramg) {
    return new n.a<Model>((e)new d(paramModel), new b<Model>(paramModel));
  }
  
  public static class a<Model> implements o<Model, Model> {
    private static final a<?> a = new a();
    
    public static <T> a<T> b() {
      return (a)a;
    }
    
    public n<Model, Model> a(r param1r) {
      return v.c();
    }
  }
  
  private static class b<Model> implements d<Model> {
    private final Model g;
    
    b(Model param1Model) {
      this.g = param1Model;
    }
    
    public Class<Model> a() {
      return (Class)this.g.getClass();
    }
    
    public void b() {}
    
    public void cancel() {}
    
    public d1.a d() {
      return d1.a.LOCAL;
    }
    
    public void e(h param1h, d.a<? super Model> param1a) {
      param1a.f(this.g);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */