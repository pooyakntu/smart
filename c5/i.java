package c5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import com.smartpek.App;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.data.local.models.DeviceType;
import com.smartpek.ui.customviews.PowerButton;
import com.smartpek.ui.timer.TimersAct;
import com.smartpek.utils.connection.ConnMngr;
import com.smartpek.utils.connection.mqtt.MqttRequest;
import e8.q;
import p6.m;
import p6.n;
import p7.c0;
import p7.c1;
import p7.p1;
import p7.s0;
import p7.t;
import p7.v1;
import p7.x1;
import q8.l;
import q8.p;
import r8.m;
import r8.n;
import y4.k;

public interface i {
  void a(long paramLong);
  
  long b();
  
  void w(androidx.fragment.app.e parame, Device paramDevice, PowerButton paramPowerButton);
  
  public static final class a {
    public static void a(i param1i, androidx.fragment.app.e param1e, Device param1Device, PowerButton param1PowerButton) {
      aa.c.d().m(a5.a.STOP_PROGRESSING);
      if (param1Device != null) {
        Double double_ = param1Device.getVersion();
      } else {
        param1i = null;
      } 
      if (m.b((Double)param1i, 0.0D)) {
        c0.l(300, new a(param1PowerButton));
        Intent intent1 = new Intent((Context)param1e, TimersAct.class);
        m.h(param1Device, "null cannot be cast to non-null type android.os.Parcelable");
        intent1.putExtra("device", (Parcelable)param1Device);
        intent1.putExtra("url", "http://192.168.2.1/");
        if (param1e != null)
          param1e.startActivity(intent1); 
        return;
      } 
      Intent intent = new Intent((Context)param1e, TimersAct.class);
      m.h(param1Device, "null cannot be cast to non-null type android.os.Parcelable");
      intent.putExtra("device", (Parcelable)param1Device);
      r6.e e1 = r6.e.UDP;
      r6.e e2 = param1Device.getConnType();
      if (f8.i.r((Object[])new r6.e[] { e1 }, e2)) {
        if (param1e != null) {
          m.l((Context)param1e, param1Device, 0, false, new b(intent, param1e, param1PowerButton), 6, null);
          return;
        } 
      } else if (param1e != null) {
        m.Y((Context)param1e, true, param1Device, MqttRequest.Companion.a(), false, null, new c(intent, param1e, param1PowerButton), new d(param1Device, param1PowerButton, param1e), 24, null);
      } 
    }
    
    public static void b(i param1i, androidx.fragment.app.e param1e, b5.b.a param1a, Device param1Device, PowerButton param1PowerButton, com.smartpek.ui.customviews.c param1c) {
      boolean bool1;
      m.j(param1a, "tab");
      App.a a1 = App.g;
      if (param1Device != null) {
        DeviceType deviceType = param1Device.getType();
      } else {
        param1c = null;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Timer > onClickTimer() ");
      stringBuilder.append(param1c);
      a1.a(stringBuilder.toString());
      boolean bool2 = true;
      if (param1Device != null && param1Device.isDemo() == true) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (!bool1 && ((k)k.k.a(param1e)).p()) {
        aa.c.d().m(a5.a.APP_IS_LOCKED);
        return;
      } 
      if (param1i.b() == 0L || t.a() - param1i.b() > 200L) {
        param1i.a(t.a() + 1000L);
        f f = new f(param1i, param1e, param1Device, param1PowerButton);
        if (param1PowerButton != null)
          com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)param1PowerButton, false, 0, 3, null); 
        if (param1Device != null && param1Device.isDemo() == true) {
          bool1 = bool2;
        } else {
          bool1 = false;
        } 
        if (!bool1) {
          ConnMngr.w(ConnMngr.j.e(param1e), param1Device, param1a, 0, false, false, false, false, null, new e(param1i, f, param1e), 252, null);
          return;
        } 
        f.invoke();
      } 
    }
    
    static final class a extends n implements q8.a<q> {
      a(PowerButton param2PowerButton) {
        super(0);
      }
      
      public final void invoke() {
        PowerButton powerButton = this.g;
        if (powerButton != null)
          com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
      }
    }
    
    static final class b extends n implements l<n, q> {
      b(Intent param2Intent, androidx.fragment.app.e param2e, PowerButton param2PowerButton) {
        super(1);
      }
      
      public final void a(n param2n) {
        c0.l(300, new a(this.i));
        if (param2n != null) {
          this.g.putExtra("url", param2n.b());
          this.h.startActivity(this.g);
          return;
        } 
        c0.q(new b(this.h));
      }
      
      static final class a extends n implements q8.a<q> {
        a(PowerButton param3PowerButton) {
          super(0);
        }
        
        public final void invoke() {
          PowerButton powerButton = this.g;
          if (powerButton != null)
            com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
        }
      }
      
      static final class b extends n implements q8.a<q> {
        b(androidx.fragment.app.e param3e) {
          super(0);
        }
        
        public final void invoke() {
          int i;
          androidx.fragment.app.e e1 = this.g;
          View view = x1.a((Activity)e1);
          androidx.fragment.app.e e2 = this.g;
          if (s0.e((Context)e2)) {
            i = 2131952285;
          } else {
            i = 2131952122;
          } 
          p1.g((Context)e1, view, null, c1.g((Context)e2, i), 0, 48, null, null, Integer.valueOf(2131296259), 2131099850, 0.0F, 2131100550, null, 0, null, 14954, null);
        }
      }
    }
    
    static final class a extends n implements q8.a<q> {
      a(PowerButton param2PowerButton) {
        super(0);
      }
      
      public final void invoke() {
        PowerButton powerButton = this.g;
        if (powerButton != null)
          com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
      }
    }
    
    static final class b extends n implements q8.a<q> {
      b(androidx.fragment.app.e param2e) {
        super(0);
      }
      
      public final void invoke() {
        int i;
        androidx.fragment.app.e e1 = this.g;
        View view = x1.a((Activity)e1);
        androidx.fragment.app.e e2 = this.g;
        if (s0.e((Context)e2)) {
          i = 2131952285;
        } else {
          i = 2131952122;
        } 
        p1.g((Context)e1, view, null, c1.g((Context)e2, i), 0, 48, null, null, Integer.valueOf(2131296259), 2131099850, 0.0F, 2131100550, null, 0, null, 14954, null);
      }
    }
    
    static final class c extends n implements l<Object, q> {
      c(Intent param2Intent, androidx.fragment.app.e param2e, PowerButton param2PowerButton) {
        super(1);
      }
      
      public final void invoke(Object param2Object) {
        m.j(param2Object, "response");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onGetState() > ");
        stringBuilder.append(param2Object);
        aa.c.d().m(r6.e.MQTT);
        c0.q(new a(this.i));
        this.g.putExtra("url", "");
        this.h.startActivity(this.g);
      }
      
      static final class a extends n implements q8.a<q> {
        a(PowerButton param3PowerButton) {
          super(0);
        }
        
        public final void invoke() {
          PowerButton powerButton = this.g;
          if (powerButton != null)
            com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
        }
      }
    }
    
    static final class a extends n implements q8.a<q> {
      a(PowerButton param2PowerButton) {
        super(0);
      }
      
      public final void invoke() {
        PowerButton powerButton = this.g;
        if (powerButton != null)
          com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
      }
    }
    
    static final class d extends n implements l<Throwable, q> {
      d(Device param2Device, PowerButton param2PowerButton, androidx.fragment.app.e param2e) {
        super(1);
      }
      
      public final void invoke(Throwable param2Throwable) {
        m.j(param2Throwable, "it");
        aa.c.d().m(r6.e.UNKNOWN);
        c0.q(new a(this.h));
        Device.updateState$default(this.g, null, false, 0, 6, null);
        c0.q(new b(this.i));
      }
      
      static final class a extends n implements q8.a<q> {
        a(PowerButton param3PowerButton) {
          super(0);
        }
        
        public final void invoke() {
          PowerButton powerButton = this.g;
          if (powerButton != null)
            com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
        }
      }
      
      static final class b extends n implements q8.a<q> {
        b(androidx.fragment.app.e param3e) {
          super(0);
        }
        
        public final void invoke() {
          int i;
          androidx.fragment.app.e e1 = this.g;
          View view = x1.a((Activity)e1);
          androidx.fragment.app.e e2 = this.g;
          if (s0.e((Context)e2)) {
            i = 2131952285;
          } else {
            i = 2131952122;
          } 
          p1.g((Context)e1, view, null, c1.g((Context)e2, i), 0, 48, null, null, Integer.valueOf(2131296259), 2131099850, 0.0F, 2131100550, null, 0, null, 14954, null);
        }
      }
    }
    
    static final class a extends n implements q8.a<q> {
      a(PowerButton param2PowerButton) {
        super(0);
      }
      
      public final void invoke() {
        PowerButton powerButton = this.g;
        if (powerButton != null)
          com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
      }
    }
    
    static final class b extends n implements q8.a<q> {
      b(androidx.fragment.app.e param2e) {
        super(0);
      }
      
      public final void invoke() {
        int i;
        androidx.fragment.app.e e1 = this.g;
        View view = x1.a((Activity)e1);
        androidx.fragment.app.e e2 = this.g;
        if (s0.e((Context)e2)) {
          i = 2131952285;
        } else {
          i = 2131952122;
        } 
        p1.g((Context)e1, view, null, c1.g((Context)e2, i), 0, 48, null, null, Integer.valueOf(2131296259), 2131099850, 0.0F, 2131100550, null, 0, null, 14954, null);
      }
    }
    
    static final class e extends n implements p<r6.f, r6.e, q> {
      e(i param2i, q8.a<q> param2a, androidx.fragment.app.e param2e) {
        super(2);
      }
      
      public final void a(r6.f param2f, r6.e param2e) {
        m.j(param2f, "state");
        int j = b.a[param2f.ordinal()];
        if (j != 1) {
          if (j != 2 && j != 3 && j != 4)
            return; 
          this.h.invoke();
          return;
        } 
        this.g.a(t.a() + 8000L);
        c0.q(new a(this.i));
        aa.c.d().m(a5.a.CONNECTING);
      }
      
      static final class a extends n implements q8.a<q> {
        a(androidx.fragment.app.e param3e) {
          super(0);
        }
        
        public final void invoke() {
          androidx.fragment.app.e e1 = this.g;
          if (e1 != null)
            v1.k((Context)e1, 2131951793, 0, null, 6, null); 
        }
      }
    }
    
    static final class a extends n implements q8.a<q> {
      a(androidx.fragment.app.e param2e) {
        super(0);
      }
      
      public final void invoke() {
        androidx.fragment.app.e e1 = this.g;
        if (e1 != null)
          v1.k((Context)e1, 2131951793, 0, null, 6, null); 
      }
    }
    
    static final class f extends n implements q8.a<q> {
      f(i param2i, androidx.fragment.app.e param2e, Device param2Device, PowerButton param2PowerButton) {
        super(0);
      }
      
      public final void invoke() {
        this.g.a(t.a());
        aa.c.d().m(a5.a.CONNECTED);
        this.g.w(this.h, this.i, this.j);
      }
    }
  }
  
  static final class a extends n implements q8.a<q> {
    a(PowerButton param1PowerButton) {
      super(0);
    }
    
    public final void invoke() {
      PowerButton powerButton = this.g;
      if (powerButton != null)
        com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
    }
  }
  
  static final class b extends n implements l<n, q> {
    b(Intent param1Intent, androidx.fragment.app.e param1e, PowerButton param1PowerButton) {
      super(1);
    }
    
    public final void a(n param1n) {
      c0.l(300, new a(this.i));
      if (param1n != null) {
        this.g.putExtra("url", param1n.b());
        this.h.startActivity(this.g);
        return;
      } 
      c0.q(new b(this.h));
    }
    
    static final class a extends n implements q8.a<q> {
      a(PowerButton param3PowerButton) {
        super(0);
      }
      
      public final void invoke() {
        PowerButton powerButton = this.g;
        if (powerButton != null)
          com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
      }
    }
    
    static final class b extends n implements q8.a<q> {
      b(androidx.fragment.app.e param3e) {
        super(0);
      }
      
      public final void invoke() {
        int i;
        androidx.fragment.app.e e1 = this.g;
        View view = x1.a((Activity)e1);
        androidx.fragment.app.e e2 = this.g;
        if (s0.e((Context)e2)) {
          i = 2131952285;
        } else {
          i = 2131952122;
        } 
        p1.g((Context)e1, view, null, c1.g((Context)e2, i), 0, 48, null, null, Integer.valueOf(2131296259), 2131099850, 0.0F, 2131100550, null, 0, null, 14954, null);
      }
    }
  }
  
  static final class a extends n implements q8.a<q> {
    a(PowerButton param1PowerButton) {
      super(0);
    }
    
    public final void invoke() {
      PowerButton powerButton = this.g;
      if (powerButton != null)
        com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
    }
  }
  
  static final class b extends n implements q8.a<q> {
    b(androidx.fragment.app.e param1e) {
      super(0);
    }
    
    public final void invoke() {
      int i;
      androidx.fragment.app.e e1 = this.g;
      View view = x1.a((Activity)e1);
      androidx.fragment.app.e e2 = this.g;
      if (s0.e((Context)e2)) {
        i = 2131952285;
      } else {
        i = 2131952122;
      } 
      p1.g((Context)e1, view, null, c1.g((Context)e2, i), 0, 48, null, null, Integer.valueOf(2131296259), 2131099850, 0.0F, 2131100550, null, 0, null, 14954, null);
    }
  }
  
  static final class c extends n implements l<Object, q> {
    c(Intent param1Intent, androidx.fragment.app.e param1e, PowerButton param1PowerButton) {
      super(1);
    }
    
    public final void invoke(Object param1Object) {
      m.j(param1Object, "response");
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("onGetState() > ");
      stringBuilder.append(param1Object);
      aa.c.d().m(r6.e.MQTT);
      c0.q(new a(this.i));
      this.g.putExtra("url", "");
      this.h.startActivity(this.g);
    }
    
    static final class a extends n implements q8.a<q> {
      a(PowerButton param3PowerButton) {
        super(0);
      }
      
      public final void invoke() {
        PowerButton powerButton = this.g;
        if (powerButton != null)
          com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
      }
    }
  }
  
  static final class a extends n implements q8.a<q> {
    a(PowerButton param1PowerButton) {
      super(0);
    }
    
    public final void invoke() {
      PowerButton powerButton = this.g;
      if (powerButton != null)
        com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
    }
  }
  
  static final class d extends n implements l<Throwable, q> {
    d(Device param1Device, PowerButton param1PowerButton, androidx.fragment.app.e param1e) {
      super(1);
    }
    
    public final void invoke(Throwable param1Throwable) {
      m.j(param1Throwable, "it");
      aa.c.d().m(r6.e.UNKNOWN);
      c0.q(new a(this.h));
      Device.updateState$default(this.g, null, false, 0, 6, null);
      c0.q(new b(this.i));
    }
    
    static final class a extends n implements q8.a<q> {
      a(PowerButton param3PowerButton) {
        super(0);
      }
      
      public final void invoke() {
        PowerButton powerButton = this.g;
        if (powerButton != null)
          com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
      }
    }
    
    static final class b extends n implements q8.a<q> {
      b(androidx.fragment.app.e param3e) {
        super(0);
      }
      
      public final void invoke() {
        int i;
        androidx.fragment.app.e e1 = this.g;
        View view = x1.a((Activity)e1);
        androidx.fragment.app.e e2 = this.g;
        if (s0.e((Context)e2)) {
          i = 2131952285;
        } else {
          i = 2131952122;
        } 
        p1.g((Context)e1, view, null, c1.g((Context)e2, i), 0, 48, null, null, Integer.valueOf(2131296259), 2131099850, 0.0F, 2131100550, null, 0, null, 14954, null);
      }
    }
  }
  
  static final class a extends n implements q8.a<q> {
    a(PowerButton param1PowerButton) {
      super(0);
    }
    
    public final void invoke() {
      PowerButton powerButton = this.g;
      if (powerButton != null)
        com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)powerButton, false, 0, 2, null); 
    }
  }
  
  static final class b extends n implements q8.a<q> {
    b(androidx.fragment.app.e param1e) {
      super(0);
    }
    
    public final void invoke() {
      int i;
      androidx.fragment.app.e e1 = this.g;
      View view = x1.a((Activity)e1);
      androidx.fragment.app.e e2 = this.g;
      if (s0.e((Context)e2)) {
        i = 2131952285;
      } else {
        i = 2131952122;
      } 
      p1.g((Context)e1, view, null, c1.g((Context)e2, i), 0, 48, null, null, Integer.valueOf(2131296259), 2131099850, 0.0F, 2131100550, null, 0, null, 14954, null);
    }
  }
  
  static final class e extends n implements p<r6.f, r6.e, q> {
    e(i param1i, q8.a<q> param1a, androidx.fragment.app.e param1e) {
      super(2);
    }
    
    public final void a(r6.f param1f, r6.e param1e) {
      m.j(param1f, "state");
      int j = b.a[param1f.ordinal()];
      if (j != 1) {
        if (j != 2 && j != 3 && j != 4)
          return; 
        this.h.invoke();
        return;
      } 
      this.g.a(t.a() + 8000L);
      c0.q(new a(this.i));
      aa.c.d().m(a5.a.CONNECTING);
    }
    
    static final class a extends n implements q8.a<q> {
      a(androidx.fragment.app.e param3e) {
        super(0);
      }
      
      public final void invoke() {
        androidx.fragment.app.e e1 = this.g;
        if (e1 != null)
          v1.k((Context)e1, 2131951793, 0, null, 6, null); 
      }
    }
  }
  
  static final class a extends n implements q8.a<q> {
    a(androidx.fragment.app.e param1e) {
      super(0);
    }
    
    public final void invoke() {
      androidx.fragment.app.e e1 = this.g;
      if (e1 != null)
        v1.k((Context)e1, 2131951793, 0, null, 6, null); 
    }
  }
  
  static final class f extends n implements q8.a<q> {
    f(i param1i, androidx.fragment.app.e param1e, Device param1Device, PowerButton param1PowerButton) {
      super(0);
    }
    
    public final void invoke() {
      this.g.a(t.a());
      aa.c.d().m(a5.a.CONNECTED);
      this.g.w(this.h, this.i, this.j);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c5\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */