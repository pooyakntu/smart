package j1;

import com.bumptech.glide.load.data.d;
import d1.e;
import d1.g;
import java.util.Collections;
import java.util.List;
import x1.k;

public interface n<Model, Data> {
  boolean a(Model paramModel);
  
  a<Data> b(Model paramModel, int paramInt1, int paramInt2, g paramg);
  
  public static class a<Data> {
    public final e a;
    
    public final List<e> b;
    
    public final d<Data> c;
    
    public a(e param1e, d<Data> param1d) {
      this(param1e, Collections.emptyList(), param1d);
    }
    
    public a(e param1e, List<e> param1List, d<Data> param1d) {
      this.a = (e)k.d(param1e);
      this.b = (List<e>)k.d(param1List);
      this.c = (d<Data>)k.d(param1d);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\j1\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */