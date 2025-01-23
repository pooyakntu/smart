package p6;

import android.net.Uri;
import b9.e0;
import b9.t0;
import com.google.android.gms.common.util.Base64Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.smartpek.App;
import com.smartpek.data.local.db.DB;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.data.local.db.models.Modem;
import e8.l;
import e8.q;
import f8.i;
import f8.o;
import j8.g;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONObject;
import p7.h0;
import p7.q1;
import q7.j;
import q8.l;
import q8.p;
import r8.m;
import r8.n;
import r8.x;
import r8.y;
import z8.h;
import z8.j;
import z8.m;

public final class b {
  public static final b a = new b();
  
  private static final Gson b = (new GsonBuilder()).excludeFieldsWithoutExposeAnnotation().create();
  
  public final Object b(Device paramDevice, boolean paramBoolean, j8.d<? super String> paramd) {
    return b9.f.e((g)t0.b(), new a(paramDevice, paramBoolean, null), paramd);
  }
  
  public final Object c(List<? extends Device> paramList, List<? extends Modem> paramList1, boolean paramBoolean, j8.d<? super String> paramd) {
    // Byte code:
    //   0: aload #4
    //   2: instanceof p6/b$b
    //   5: ifeq -> 47
    //   8: aload #4
    //   10: checkcast p6/b$b
    //   13: astore #6
    //   15: aload #6
    //   17: getfield i : I
    //   20: istore #5
    //   22: iload #5
    //   24: ldc -2147483648
    //   26: iand
    //   27: ifeq -> 47
    //   30: aload #6
    //   32: iload #5
    //   34: ldc -2147483648
    //   36: iadd
    //   37: putfield i : I
    //   40: aload #6
    //   42: astore #4
    //   44: goto -> 59
    //   47: new p6/b$b
    //   50: dup
    //   51: aload_0
    //   52: aload #4
    //   54: invokespecial <init> : (Lp6/b;Lj8/d;)V
    //   57: astore #4
    //   59: aload #4
    //   61: getfield g : Ljava/lang/Object;
    //   64: astore #6
    //   66: invokestatic d : ()Ljava/lang/Object;
    //   69: astore #7
    //   71: aload #4
    //   73: getfield i : I
    //   76: istore #5
    //   78: iload #5
    //   80: ifeq -> 110
    //   83: iload #5
    //   85: iconst_1
    //   86: if_icmpne -> 100
    //   89: aload #6
    //   91: invokestatic b : (Ljava/lang/Object;)V
    //   94: aload #6
    //   96: astore_1
    //   97: goto -> 158
    //   100: new java/lang/IllegalStateException
    //   103: dup
    //   104: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   106: invokespecial <init> : (Ljava/lang/String;)V
    //   109: athrow
    //   110: aload #6
    //   112: invokestatic b : (Ljava/lang/Object;)V
    //   115: invokestatic b : ()Lb9/b0;
    //   118: astore #6
    //   120: new p6/b$c
    //   123: dup
    //   124: aload_1
    //   125: aload_2
    //   126: iload_3
    //   127: aconst_null
    //   128: invokespecial <init> : (Ljava/util/List;Ljava/util/List;ZLj8/d;)V
    //   131: astore_1
    //   132: aload #4
    //   134: iconst_1
    //   135: putfield i : I
    //   138: aload #6
    //   140: aload_1
    //   141: aload #4
    //   143: invokestatic e : (Lj8/g;Lq8/p;Lj8/d;)Ljava/lang/Object;
    //   146: astore_2
    //   147: aload_2
    //   148: astore_1
    //   149: aload_2
    //   150: aload #7
    //   152: if_acmpne -> 158
    //   155: aload #7
    //   157: areturn
    //   158: aload_1
    //   159: ldc 'devices: List<Device>, m…String(2)\\n        }\\n    }'
    //   161: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   164: aload_1
    //   165: areturn
  }
  
  public final Object d(boolean paramBoolean, j8.d<? super String> paramd) {
    return b9.f.e((g)t0.b(), new d(paramBoolean, null), paramd);
  }
  
  public final Object f(Uri paramUri, j8.d<? super q> paramd) {
    return b9.f.e((g)t0.b(), new e(paramUri, null), paramd);
  }
  
  public final Object g(String paramString, j8.d<? super q> paramd) {
    Object object = b9.f.e((g)t0.b(), new f(paramString, null), paramd);
    return (object == k8.b.d()) ? object : q.a;
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.utils.ExportUtils$export$2", f = "ExportUtils.kt", l = {33}, m = "invokeSuspend")
  static final class a extends l implements p<e0, j8.d<? super String>, Object> {
    int g;
    
    a(Device param1Device, boolean param1Boolean, j8.d<? super a> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new a(this.h, this.i, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super String> param1d) {
      return ((a)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      Object object = k8.b.d();
      int i = this.g;
      if (i != 0) {
        if (i == 1) {
          l.b(param1Object);
          return param1Object;
        } 
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      } 
      l.b(param1Object);
      param1Object = b.a;
      List<? extends Device> list = o.d(this.h);
      Modem[] arrayOfModem = this.h.getModems();
      m.g(arrayOfModem);
      List<? extends Modem> list1 = i.N((Object[])arrayOfModem);
      boolean bool = this.i;
      this.g = 1;
      param1Object = param1Object.c(list, list1, bool, (j8.d<? super String>)this);
      return (param1Object == object) ? object : param1Object;
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.utils.ExportUtils", f = "ExportUtils.kt", l = {36}, m = "export")
  static final class b extends kotlin.coroutines.jvm.internal.d {
    int i;
    
    b(b param1b, j8.d<? super b> param1d) {
      super(param1d);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      this.g = param1Object;
      this.i |= Integer.MIN_VALUE;
      return this.h.c(null, null, false, (j8.d<? super String>)this);
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.utils.ExportUtils$export$4", f = "ExportUtils.kt", l = {}, m = "invokeSuspend")
  static final class c extends l implements p<e0, j8.d<? super String>, Object> {
    int g;
    
    c(List<? extends Device> param1List, List<? extends Modem> param1List1, boolean param1Boolean, j8.d<? super c> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new c(this.h, this.i, this.j, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super String> param1d) {
      return ((c)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      k8.b.d();
      if (this.g == 0) {
        l.b(param1Object);
        param1Object = new JSONObject();
        param1Object.put("version", 2);
        param1Object.put("timestamp", (new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.US)).format(new Date()));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version_name", "3.5.2");
        jSONObject.put("version_code", 121);
        jSONObject.put("database_version", 25);
        q q = q.a;
        param1Object.put("app", jSONObject);
        JSONArray jSONArray = new JSONArray();
        List<Device> list = this.h;
        ArrayList<Device> arrayList = new ArrayList();
        for (Device device : list) {
          if ((((Device)device).isDemo() ^ true) != 0)
            arrayList.add(device); 
        } 
        for (Device device : arrayList) {
          JSONObject jSONObject1 = new JSONObject(b.a().toJson(device));
          String str = jSONObject1.getString("mac");
          m.i(str, "json.getString(\"mac\")");
          jSONObject1.put("mac", m.v(str));
          str = jSONObject1.getString("mqtt_username");
          m.i(str, "json.getString(\"mqtt_username\")");
          jSONObject1.put("mqtt_username", m.v(str));
          str = jSONObject1.getString("mqtt_password");
          m.i(str, "json.getString(\"mqtt_password\")");
          jSONObject1.put("mqtt_password", m.v(str));
          jSONObject1.remove("id");
          jSONObject1.remove("state");
          jSONArray.put(jSONObject1);
        } 
        param1Object.put("devices_count", jSONArray.length());
        param1Object.put("devices", jSONArray);
        jSONArray = new JSONArray();
        for (Modem modem : this.i)
          jSONArray.put(new JSONObject(b.a().toJson(modem))); 
        param1Object.put("modems_count", jSONArray.length());
        param1Object.put("modems", jSONArray);
        if (this.j) {
          param1Object = param1Object.toString(0);
          m.i(param1Object, "export.toString(0)");
          param1Object = m.C((String)param1Object, "\n", "", false, 4, null);
          param1Object = Base64Utils.encodeUrlSafeNoPadding(m.q((new j("[^\\\\]\":\\s")).h((CharSequence)param1Object, a.g)));
          m.i(param1Object, "encodeUrlSafeNoPadding(plain.encodeToByteArray())");
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("https://smartpek.me/import?device=");
          stringBuilder.append((String)param1Object);
          return stringBuilder.toString();
        } 
        return param1Object.toString(2);
      } 
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
    
    static final class a extends n implements l<h, CharSequence> {
      public static final a g = new a();
      
      a() {
        super(1);
      }
      
      public final CharSequence a(h param2h) {
        m.j(param2h, "match");
        return q1.g(param2h.getValue(), " ", "");
      }
    }
  }
  
  static final class a extends n implements l<h, CharSequence> {
    public static final a g = new a();
    
    a() {
      super(1);
    }
    
    public final CharSequence a(h param1h) {
      m.j(param1h, "match");
      return q1.g(param1h.getValue(), " ", "");
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.utils.ExportUtils$exportAll$2", f = "ExportUtils.kt", l = {29}, m = "invokeSuspend")
  static final class d extends l implements p<e0, j8.d<? super String>, Object> {
    int g;
    
    d(boolean param1Boolean, j8.d<? super d> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new d(this.h, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super String> param1d) {
      return ((d)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      Object object = k8.b.d();
      int i = this.g;
      if (i != 0) {
        if (i == 1) {
          l.b(param1Object);
          return param1Object;
        } 
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      } 
      l.b(param1Object);
      App.a a = App.g;
      param1Object = a.e();
      m.g(param1Object);
      param1Object = param1Object.H().W();
      m.g(param1Object);
      DB dB = a.e();
      m.g(dB);
      List<? extends Modem> list = dB.K().v();
      m.g(list);
      b b = b.a;
      boolean bool = this.h;
      this.g = 1;
      param1Object = b.c((List<? extends Device>)param1Object, list, bool, (j8.d<? super String>)this);
      return (param1Object == object) ? object : param1Object;
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.utils.ExportUtils$import$2", f = "ExportUtils.kt", l = {89}, m = "invokeSuspend")
  static final class e extends l implements p<e0, j8.d<? super q>, Object> {
    int g;
    
    e(Uri param1Uri, j8.d<? super e> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new e(this.h, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super q> param1d) {
      return ((e)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      Object object = k8.b.d();
      int i = this.g;
      if (i != 0) {
        if (i == 1) {
          l.b(param1Object);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } 
      } else {
        l.b(param1Object);
        param1Object = this.h.getQueryParameter("device");
        if (param1Object != null) {
          param1Object = Base64Utils.decodeUrlSafeNoPadding((String)param1Object);
          m.i(param1Object, "decodeUrlSafeNoPadding(encoded)");
          param1Object = new String((byte[])param1Object, z8.d.b);
          b b = b.a;
          this.g = 1;
          return (b.g((String)param1Object, (j8.d<? super q>)this) == object) ? object : q.a;
        } 
        return null;
      } 
      return q.a;
    }
  }
  
  @kotlin.coroutines.jvm.internal.f(c = "com.smartpek.utils.ExportUtils$import$4", f = "ExportUtils.kt", l = {}, m = "invokeSuspend")
  static final class f extends l implements p<e0, j8.d<? super q>, Object> {
    int g;
    
    f(String param1String, j8.d<? super f> param1d) {
      super(2, param1d);
    }
    
    public final j8.d<q> create(Object param1Object, j8.d<?> param1d) {
      return (j8.d<q>)new f(this.h, (j8.d)param1d);
    }
    
    public final Object invoke(e0 param1e0, j8.d<? super q> param1d) {
      return ((f)create(param1e0, param1d)).invokeSuspend(q.a);
    }
    
    public final Object invokeSuspend(Object param1Object) {
      k8.b.d();
      if (this.g == 0) {
        l.b(param1Object);
        if (h0.b(this.h) != null) {
          param1Object = h0.b(this.h);
          m.g(param1Object);
        } else {
          param1Object = this.h.toCharArray();
          m.i(param1Object, "this as java.lang.String).toCharArray()");
          ArrayList<Character> arrayList = new ArrayList(param1Object.length);
          int i1 = param1Object.length;
          for (int n = 0; n < i1; n++)
            arrayList.add(kotlin.coroutines.jvm.internal.b.b((char)((char)param1Object[n] ^ 0x73))); 
          param1Object = h0.b(o.S(arrayList, "", null, null, 0, null, null, 62, null));
          m.g(param1Object);
        } 
        int i = param1Object.getInt("version");
        Modem[] arrayOfModem = (Modem[])b.a().fromJson(param1Object.getJSONArray("modems").toString(), Modem[].class);
        Device[] arrayOfDevice = (Device[])b.a().fromJson(param1Object.getJSONArray("devices").toString(), Device[].class);
        if (i >= 2) {
          m.i(arrayOfDevice, "devices");
          int n = arrayOfDevice.length;
          for (i = 0; i < n; i++) {
            Device device = arrayOfDevice[i];
            param1Object = device.getMac();
            if (param1Object != null) {
              param1Object = m.s((String)param1Object);
            } else {
              param1Object = null;
            } 
            device.setMac((String)param1Object);
            param1Object = device.getMqttUsername();
            if (param1Object != null) {
              param1Object = m.s((String)param1Object);
            } else {
              param1Object = null;
            } 
            device.setMqttUsername((String)param1Object);
            param1Object = device.getMqttPassword();
            if (param1Object != null) {
              param1Object = m.s((String)param1Object);
            } else {
              param1Object = null;
            } 
            device.setMqttPassword((String)param1Object);
          } 
        } 
        param1Object = App.g.e();
        m.g(param1Object);
        List list = param1Object.K().v();
        param1Object = list;
        if (list == null)
          param1Object = o.i(); 
        m.i(arrayOfModem, "modems");
        int m = arrayOfModem.length;
        for (i = 0;; i++) {
          if (i < m) {
            Modem modem = arrayOfModem[i];
            y y = new y();
            x x1 = new x();
            x x2 = new x();
            Iterator<Object> iterator = param1Object.iterator();
            int n = 0;
            int i1;
            for (i1 = 0; iterator.hasNext(); i1 = i2) {
              Modem modem1 = (Modem)iterator.next();
              if (n)
                o.r(); 
              modem1 = modem1;
              if (modem.getId() == modem1.getId())
                x2.g = true; 
              if (m.e(modem.getSsid(), modem1.getSsid())) {
                x1.g = true;
                y.g = n;
              } 
              int i2 = i1;
              if (modem.getId() == modem1.getId()) {
                i2 = i1;
                if (m.e(modem.getSsid(), modem1.getSsid()))
                  i2 = 1; 
              } 
              n++;
            } 
            Object object = param1Object;
            if (!i1) {
              Integer[] arrayOfInteger;
              if (x2.g && !x1.g) {
                int i2 = modem.getId();
                modem.setId(0);
                object = App.g.e();
                m.g(object);
                int i3 = (int)object.K().H(modem);
                m.i(arrayOfDevice, "devices");
                int i4 = arrayOfDevice.length;
                i1 = 0;
                n = 0;
                while (true) {
                  int i5 = 0;
                  object = param1Object;
                  if (i1 < i4) {
                    object = arrayOfDevice[i1].getModemsId();
                    if (object != null) {
                      int i7 = object.length;
                      int i6;
                      for (i6 = 0; i5 < i7; i6++) {
                        if (object[i5].intValue() == i2) {
                          arrayOfInteger = arrayOfDevice[n].getModemsId();
                          m.g(arrayOfInteger);
                          arrayOfInteger[i6] = kotlin.coroutines.jvm.internal.b.c(i3);
                        } 
                        i5++;
                      } 
                    } 
                    i1++;
                    n++;
                    continue;
                  } 
                  break;
                } 
              } else if (x1.g) {
                int i2 = arrayOfInteger.getId();
                int i3 = ((Modem)param1Object.get(y.g)).getId();
                m.i(arrayOfDevice, "devices");
                int i4 = arrayOfDevice.length;
                i1 = 0;
                n = 0;
                while (true) {
                  object = param1Object;
                  if (i1 < i4) {
                    arrayOfInteger = arrayOfDevice[i1].getModemsId();
                    object = param1Object;
                    if (arrayOfInteger != null) {
                      int i7 = arrayOfInteger.length;
                      int i6 = 0;
                      int i5 = 0;
                      while (true) {
                        object = param1Object;
                        if (i6 < i7) {
                          if (arrayOfInteger[i6].intValue() == i2) {
                            object = arrayOfDevice[n].getModemsId();
                            m.g(object);
                            object[i5] = kotlin.coroutines.jvm.internal.b.c(i3);
                          } 
                          i6++;
                          i5++;
                          continue;
                        } 
                        break;
                      } 
                    } 
                    i1++;
                    n++;
                    param1Object = object;
                    continue;
                  } 
                  break;
                } 
              } else {
                object = App.g.e();
                m.g(object);
                j.D((j)object.K(), arrayOfInteger, null, 2, null);
                i++;
              } 
            } 
            param1Object = object;
          } else {
            break;
          } 
        } 
        param1Object = App.g.e();
        m.g(param1Object);
        list = param1Object.H().W();
        param1Object = list;
        if (list == null)
          param1Object = o.i(); 
        m.i(arrayOfDevice, "devices");
        int k = arrayOfDevice.length;
        for (int j = 0; j < k; j++) {
          Device device = arrayOfDevice[j];
          Iterator<Object> iterator = param1Object.iterator();
          boolean bool = false;
          i = 0;
          int n = 0;
          while (iterator.hasNext()) {
            Device device1 = (Device)iterator.next();
            if (i < 0)
              o.r(); 
            device1 = device1;
            if (m.e(device.getSsid(), device1.getSsid())) {
              n = i;
              bool = true;
            } 
            i++;
          } 
          if (bool) {
            device.setId(((Device)param1Object.get(n)).getId());
            DB dB = App.g.e();
            m.g(dB);
            j.M((j)dB.H(), device, null, 2, null);
          } else {
            DB dB = App.g.e();
            m.g(dB);
            j.D((j)dB.H(), device, null, 2, null);
          } 
        } 
        return q.a;
      } 
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p6\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */