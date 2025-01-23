package p6;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.fragment.app.m;
import com.android.volley.VolleyError;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.smartpek.App;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.ui.app_update.UpdateApp;
import com.squareup.picasso.u;
import da.a0;
import e8.q;
import f8.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;
import p7.c0;
import p7.c1;
import p7.h1;
import p7.p1;
import q8.p;
import r8.g;
import r8.m;
import r8.n;
import v4.e;
import v4.f;
import y4.k;

public final class j {
  public static final a b = new a(null);
  
  private static String c = "";
  
  private static String d = "";
  
  private static int e;
  
  private static String f = "";
  
  private static String g = "";
  
  private static String h = "";
  
  private static String i = "";
  
  private static String j = "";
  
  private boolean a;
  
  private static final void x(Activity paramActivity, q8.a parama, String paramString) {
    m.j(parama, "$callback");
    try {
      JSONArray jSONArray = new JSONArray(paramString);
      return;
    } finally {
      paramActivity = null;
      paramActivity.printStackTrace();
    } 
  }
  
  private static final void y(VolleyError paramVolleyError) {
    paramVolleyError.printStackTrace();
  }
  
  public final void t(androidx.appcompat.app.d paramd, p<? super Boolean, ? super Throwable, q> paramp) {
    m.j(paramd, "activity");
    try {
    
    } finally {
      paramd = null;
      this.a = false;
      paramd.printStackTrace();
      if (paramp != null)
        paramp.invoke(null, paramd); 
    } 
  }
  
  public final void v() {
    c0.e(500, c.g);
  }
  
  @SuppressLint({"ApplySharedPref"})
  public final void w(Activity paramActivity, q8.a<q> parama) {
    m.j(parama, "callback");
    try {
      return;
    } finally {
      paramActivity = null;
      paramActivity.printStackTrace();
    } 
  }
  
  public final void z(Context paramContext, List<? extends Device> paramList) {
    try {
      m.g(paramList);
      ArrayList<String> arrayList = new ArrayList(o.s(paramList, 10));
      Iterator<? extends Device> iterator = paramList.iterator();
      while (iterator.hasNext()) {
        String str = ((Device)iterator.next()).getSsid();
        m.g(str);
        arrayList.add(m.C(str));
      } 
      f f = e.a.a();
      JsonObject jsonObject = new JsonObject();
      jsonObject.addProperty("version", "121");
      JsonArray jsonArray = new JsonArray();
      Iterator<String> iterator1 = arrayList.iterator();
      while (iterator1.hasNext())
        jsonArray.add(iterator1.next()); 
      q q = q.a;
      jsonObject.add("devices", (JsonElement)jsonArray);
      da.b b = f.c(jsonObject);
    } finally {
      paramContext = null;
    } 
  }
  
  public static final class a {
    private a() {}
    
    public final boolean a(Activity param1Activity, Device param1Device) {
      boolean bool;
      if (param1Device != null && param1Device.isDemo() == true) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        if (param1Activity != null) {
          p1.g((Context)param1Activity, param1Activity.getCurrentFocus(), null, c1.g((Context)param1Activity, 2131952263), 0, 0, null, null, Integer.valueOf(App.g.i((Context)param1Activity)), 0, 0.0F, 0, c1.g((Context)param1Activity, 2131951714), 0, new a(param1Activity), 6010, null);
          return true;
        } 
        return true;
      } 
      return false;
    }
    
    public final String b() {
      return j.c();
    }
    
    public final String c() {
      return j.d();
    }
    
    public final String d() {
      return j.e();
    }
    
    public final int e() {
      return j.f();
    }
    
    public final String f() {
      return j.g();
    }
    
    public final String g() {
      return j.h();
    }
    
    public final String h() {
      return j.i();
    }
    
    public final String i() {
      return j.j();
    }
    
    public final void j(Context param1Context) {
      m.j(param1Context, "context");
      SharedPreferences sharedPreferences = h1.f(param1Context, "pek_config", 0, 2, null);
      a a1 = j.b;
      a1.o(h1.h(sharedPreferences, "mqtt_protocol", "wss"));
      a1.m(h1.h(sharedPreferences, "mqtt_host", "s1-smartpek.ir"));
      a1.n(h1.b(sharedPreferences, "mqtt_port", 8084));
      a1.l(h1.h(sharedPreferences, "countly_url", "https://s1-smartpek.ir:3000"));
      a1.k(h1.h(sharedPreferences, "countly_appkey", "69112784ba79380cd78a03551e5a0fcc8dc7f5ef"));
      a1.q(h1.h(sharedPreferences, "relog_url", "http://185.208.175.228:7000"));
      a1.p(h1.h(sharedPreferences, "relog_appkey", "vtkayzxv95w74eak"));
      a1.r(h1.h(sharedPreferences, "support_number", "02171057544"));
    }
    
    public final void k(String param1String) {
      m.j(param1String, "<set-?>");
      j.k(param1String);
    }
    
    public final void l(String param1String) {
      m.j(param1String, "<set-?>");
      j.l(param1String);
    }
    
    public final void m(String param1String) {
      m.j(param1String, "<set-?>");
      j.m(param1String);
    }
    
    public final void n(int param1Int) {
      j.n(param1Int);
    }
    
    public final void o(String param1String) {
      m.j(param1String, "<set-?>");
      j.o(param1String);
    }
    
    public final void p(String param1String) {
      m.j(param1String, "<set-?>");
      j.p(param1String);
    }
    
    public final void q(String param1String) {
      m.j(param1String, "<set-?>");
      j.q(param1String);
    }
    
    public final void r(String param1String) {
      m.j(param1String, "<set-?>");
      j.s(param1String);
    }
    
    static final class a extends n implements q8.a<q> {
      a(Activity param2Activity) {
        super(0);
      }
      
      public final void invoke() {
        this.g.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://smartpek.ir/shop")));
      }
    }
  }
  
  static final class a extends n implements q8.a<q> {
    a(Activity param1Activity) {
      super(0);
    }
    
    public final void invoke() {
      this.g.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://smartpek.ir/shop")));
    }
  }
  
  public static final class b implements da.d<UpdateApp> {
    b(androidx.appcompat.app.d param1d, p<? super Boolean, ? super Throwable, q> param1p, j param1j) {}
    
    public void a(da.b<UpdateApp> param1b, a0<UpdateApp> param1a0) {
      m.j(param1b, "call");
      m.j(param1a0, "response");
      try {
        if (param1a0.e()) {
          Object object = param1a0.a();
          m.g(object);
          object = object;
        } else {
          param1a0 = null;
        } 
        m.g(param1a0);
        List list = param1a0.sources((Context)this.a);
        if ((list.isEmpty() ^ true) != 0) {
          z4.c c = z4.c.l.a(list, param1a0.getForce());
          m m = this.a.getSupportFragmentManager();
          m.i(m, "activity.supportFragmentManager");
          c.show(m, "UpdateAppDialog");
          p<Boolean, Throwable, q> p1 = this.b;
          if (p1 != null)
            return; 
        } else {
          p<Boolean, Throwable, q> p1 = this.b;
          if (p1 != null)
            return; 
        } 
      } finally {
        param1a0 = null;
      } 
    }
    
    public void b(da.b<UpdateApp> param1b, Throwable param1Throwable) {
      m.j(param1b, "call");
      m.j(param1Throwable, "t");
      j.r(this.c, false);
      param1Throwable.printStackTrace();
      p<Boolean, Throwable, q> p1 = this.b;
      if (p1 != null)
        p1.invoke(null, param1Throwable); 
    }
  }
  
  static final class c extends n implements q8.a<q> {
    public static final c g = new c();
    
    c() {
      super(0);
    }
    
    public final void invoke() {
      int i = 0;
      while (true) {
        if (i < 6) {
          (new String[6])[0] = "img_en_setting.jpg";
          (new String[6])[1] = "img_en_setting_otherpermission.jpg";
          (new String[6])[2] = "img_en_setting_otherpermission_wifichange_accept.jpg";
          (new String[6])[3] = "img_fa_setting.jpg";
          (new String[6])[4] = "img_fa_setting_otherpermission.jpg";
          (new String[6])[5] = "img_fa_setting_otherpermission_wifichange_accept.jpg";
          String str = (new String[6])[i];
          u u = u.g();
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("https://smartpek.ir/app/resources/");
          stringBuilder.append(str);
          u.l(stringBuilder.toString()).f();
          try {
            Thread.sleep(1000L);
          } finally {}
          i++;
          continue;
        } 
        return;
      } 
    }
  }
  
  public static final class d implements da.d<ResponseBody> {
    d(Context param1Context) {}
    
    public void a(da.b<ResponseBody> param1b, a0<ResponseBody> param1a0) {
      m.j(param1b, "call");
      m.j(param1a0, "response");
      if (param1a0.e())
        try {
          Context context;
          Object object = param1a0.a();
          m.g(object);
          JSONObject jSONObject2 = new JSONObject(((ResponseBody)object).string());
          try {
            object = jSONObject2.getJSONObject("notification");
            ((k)k.k.a(this.a)).D(object.getInt("version"));
          } finally {
            object = null;
          } 
          JSONObject jSONObject1 = null;
          object = jSONObject1;
          if (context != null) {
            SharedPreferences sharedPreferences = h1.f(context, "pek_config", 0, 2, null);
            object = jSONObject1;
            if (sharedPreferences != null)
              object = sharedPreferences.edit(); 
          } 
          try {
            jSONObject1 = jSONObject2.getJSONObject("mqtt");
            j.a a = j.b;
            String str = jSONObject1.getString("protocol");
            m.i(str, "mqtt.getString(\"protocol\")");
            a.o(str);
            str = jSONObject1.getString("host");
            m.i(str, "mqtt.getString(\"host\")");
            a.m(str);
            a.n(jSONObject1.getInt("port"));
            if (object != null)
              object.putString("mqtt_protocol", a.f()); 
            if (object != null)
              object.putString("mqtt_host", a.d()); 
          } finally {
            jSONObject1 = null;
          } 
          try {
            JSONObject jSONObject = jSONObject2.getJSONObject("countly");
            j.a a = j.b;
            String str2 = jSONObject.getString("url");
            m.i(str2, "countly.getString(\"url\")");
            a.l(str2);
            String str1 = jSONObject.getString("key");
            m.i(str1, "countly.getString(\"key\")");
            a.k(str1);
            if (object != null)
              object.putString("countly_url", a.c()); 
          } finally {
            jSONObject1 = null;
          } 
          try {
            JSONObject jSONObject = jSONObject2.getJSONObject("relog");
            j.a a = j.b;
            String str2 = jSONObject.getString("url");
            m.i(str2, "relog.getString(\"url\")");
            a.q(str2);
            String str1 = jSONObject.getString("key");
            m.i(str1, "relog.getString(\"key\")");
            a.p(str1);
            if (object != null)
              object.putString("relog_url", a.h()); 
          } finally {
            jSONObject1 = null;
          } 
          try {
            j.a a = j.b;
            String str = jSONObject2.getString("supportNumber");
            m.i(str, "json.getString(\"supportNumber\")");
            a.r(str);
          } finally {
            jSONObject1 = null;
          } 
          return;
        } finally {
          param1a0 = null;
        }  
      b(param1b, new Error("Unknown"));
    }
    
    public void b(da.b<ResponseBody> param1b, Throwable param1Throwable) {
      m.j(param1b, "call");
      m.j(param1Throwable, "t");
      param1Throwable.printStackTrace();
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\p6\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */