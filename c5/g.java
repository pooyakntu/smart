package c5;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.e;
import com.smartpek.App;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.data.local.models.DeviceType;
import com.smartpek.ui.customviews.PowerButton;
import com.smartpek.ui.setting.SettingAct;
import com.smartpek.utils.connection.ConnMngr;
import e8.q;
import f8.o;
import java.io.Serializable;
import java.util.ArrayList;
import p6.m;
import p6.n;
import p7.c0;
import p7.t;
import p7.v1;
import q8.p;
import r6.e;
import r6.f;
import r8.m;
import r8.n;
import y4.k;

public interface g {
  void a(long paramLong);
  
  long b();
  
  public static final class a {
    private static void b(g param1g, e param1e, Device param1Device, PowerButton param1PowerButton) {
      aa.c.d().m(a5.a.STOP_PROGRESSING);
      Byte byte_1 = Byte.valueOf((byte)1);
      int i = 0;
      Byte byte_2 = Byte.valueOf((byte)0);
      ArrayList<Byte> arrayList = o.e((Object[])new Byte[] { 
            byte_1, Byte.valueOf((byte)3), byte_1, byte_2, byte_2, byte_2, byte_2, byte_2, byte_2, byte_2, 
            byte_2, byte_2, byte_2, byte_2, byte_2 });
      if (param1Device != null) {
        String str = m.O(param1Device);
        if (str != null) {
          char[] arrayOfChar = str.toCharArray();
          m.i(arrayOfChar, "this as java.lang.String).toCharArray()");
          if (arrayOfChar != null) {
            int j = arrayOfChar.length;
            while (i < j) {
              arrayList.add(Byte.valueOf((byte)(arrayOfChar[i] - 48)));
              i++;
            } 
          } 
        } 
      } 
      if (param1e != null)
        m.g((Context)param1e, param1Device, arrayList, false, 0, 0L, 0, false, false, false, new a(param1e, param1Device, param1PowerButton), 508, null); 
    }
    
    public static void c(g param1g, e param1e, b5.b.a param1a, Device param1Device, PowerButton param1PowerButton, com.smartpek.ui.customviews.c param1c) {
      boolean bool1;
      m.j(param1a, "tab");
      App.a a1 = App.g;
      if (param1Device != null) {
        DeviceType deviceType = param1Device.getType();
      } else {
        param1c = null;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Setting > onClickSetting() ");
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
      if (param1g.b() == 0L || t.a() - param1g.b() > 200L) {
        param1g.a(t.a() + 1000L);
        c c1 = new c(param1g, param1e, param1Device, param1PowerButton);
        if (param1PowerButton != null)
          com.smartpek.ui.customviews.c.v((com.smartpek.ui.customviews.c)param1PowerButton, false, 0, 3, null); 
        if (param1Device != null && param1Device.isDemo() == true) {
          bool1 = bool2;
        } else {
          bool1 = false;
        } 
        if (!bool1) {
          ConnMngr.w(ConnMngr.j.e(param1e), param1Device, param1a, 0, false, false, false, false, null, new b(param1g, c1, param1e), 252, null);
          return;
        } 
        c1.invoke();
      } 
    }
    
    static final class a extends n implements p<n, Throwable, q> {
      a(e param2e, Device param2Device, PowerButton param2PowerButton) {
        super(2);
      }
      
      public final void a(n param2n, Throwable param2Throwable) {
        String str;
        c0.l(300, new a(this.i));
        if (param2Throwable == null) {
          if (param2n != null)
            param2n.a(); 
          Intent intent = new Intent((Context)this.g, SettingAct.class);
          Device device1 = this.h;
          Device device2 = null;
          if (device1 != null) {
            Integer integer = Integer.valueOf(device1.getId());
          } else {
            device1 = null;
          } 
          intent.putExtra("id", (Serializable)device1);
          device1 = this.h;
          if (device1 != null) {
            str = device1.getSsid();
          } else {
            device1 = null;
          } 
          intent.putExtra("ssid", (String)device1);
          device1 = device2;
          if (param2n != null)
            str = param2n.b(); 
          intent.putExtra("url", str);
          this.g.startActivityForResult(intent, 1998);
          return;
        } 
        str.printStackTrace();
        c0.q(new b(this.g, this.h));
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
        b(e param3e, Device param3Device) {
          super(0);
        }
        
        public final void invoke() {
          // Byte code:
          //   0: aload_0
          //   1: getfield g : Landroidx/fragment/app/e;
          //   4: astore #5
          //   6: aload #5
          //   8: invokestatic a : (Landroid/app/Activity;)Landroid/view/View;
          //   11: astore #6
          //   13: aload_0
          //   14: getfield g : Landroidx/fragment/app/e;
          //   17: astore #7
          //   19: aload #7
          //   21: invokestatic e : (Landroid/content/Context;)Z
          //   24: istore_2
          //   25: aconst_null
          //   26: astore #4
          //   28: iload_2
          //   29: ifeq -> 88
          //   32: getstatic r6/e.UDP : Lr6/e;
          //   35: astore #8
          //   37: getstatic r6/e.UNKNOWN : Lr6/e;
          //   40: astore #9
          //   42: aload_0
          //   43: getfield h : Lcom/smartpek/data/local/db/models/Device;
          //   46: astore_3
          //   47: aload_3
          //   48: ifnull -> 59
          //   51: aload_3
          //   52: invokevirtual getConnType : ()Lr6/e;
          //   55: astore_3
          //   56: goto -> 61
          //   59: aconst_null
          //   60: astore_3
          //   61: iconst_2
          //   62: anewarray r6/e
          //   65: dup
          //   66: iconst_0
          //   67: aload #8
          //   69: aastore
          //   70: dup
          //   71: iconst_1
          //   72: aload #9
          //   74: aastore
          //   75: aload_3
          //   76: invokestatic r : ([Ljava/lang/Object;Ljava/lang/Object;)Z
          //   79: ifeq -> 88
          //   82: ldc 2131952285
          //   84: istore_1
          //   85: goto -> 148
          //   88: getstatic r6/e.UDP : Lr6/e;
          //   91: astore #8
          //   93: getstatic r6/e.UNKNOWN : Lr6/e;
          //   96: astore #9
          //   98: aload_0
          //   99: getfield h : Lcom/smartpek/data/local/db/models/Device;
          //   102: astore #10
          //   104: aload #4
          //   106: astore_3
          //   107: aload #10
          //   109: ifnull -> 118
          //   112: aload #10
          //   114: invokevirtual getConnType : ()Lr6/e;
          //   117: astore_3
          //   118: iconst_2
          //   119: anewarray r6/e
          //   122: dup
          //   123: iconst_0
          //   124: aload #8
          //   126: aastore
          //   127: dup
          //   128: iconst_1
          //   129: aload #9
          //   131: aastore
          //   132: aload_3
          //   133: invokestatic r : ([Ljava/lang/Object;Ljava/lang/Object;)Z
          //   136: ifeq -> 145
          //   139: ldc 2131952122
          //   141: istore_1
          //   142: goto -> 148
          //   145: ldc 2131952209
          //   147: istore_1
          //   148: aload #5
          //   150: aload #6
          //   152: aconst_null
          //   153: aload #7
          //   155: iload_1
          //   156: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
          //   159: iconst_0
          //   160: bipush #48
          //   162: aconst_null
          //   163: aconst_null
          //   164: ldc 2131296259
          //   166: invokestatic valueOf : (I)Ljava/lang/Integer;
          //   169: ldc 2131099850
          //   171: fconst_0
          //   172: ldc 2131100550
          //   174: aconst_null
          //   175: iconst_0
          //   176: aconst_null
          //   177: sipush #14954
          //   180: aconst_null
          //   181: invokestatic g : (Landroid/content/Context;Landroid/view/View;Lp7/u;Ljava/lang/String;IILp7/m1;Ljava/lang/String;Ljava/lang/Integer;IFILjava/lang/String;ILq8/a;ILjava/lang/Object;)Lcom/google/android/material/snackbar/Snackbar;
          //   184: pop
          //   185: return
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
      b(e param2e, Device param2Device) {
        super(0);
      }
      
      public final void invoke() {
        // Byte code:
        //   0: aload_0
        //   1: getfield g : Landroidx/fragment/app/e;
        //   4: astore #5
        //   6: aload #5
        //   8: invokestatic a : (Landroid/app/Activity;)Landroid/view/View;
        //   11: astore #6
        //   13: aload_0
        //   14: getfield g : Landroidx/fragment/app/e;
        //   17: astore #7
        //   19: aload #7
        //   21: invokestatic e : (Landroid/content/Context;)Z
        //   24: istore_2
        //   25: aconst_null
        //   26: astore #4
        //   28: iload_2
        //   29: ifeq -> 88
        //   32: getstatic r6/e.UDP : Lr6/e;
        //   35: astore #8
        //   37: getstatic r6/e.UNKNOWN : Lr6/e;
        //   40: astore #9
        //   42: aload_0
        //   43: getfield h : Lcom/smartpek/data/local/db/models/Device;
        //   46: astore_3
        //   47: aload_3
        //   48: ifnull -> 59
        //   51: aload_3
        //   52: invokevirtual getConnType : ()Lr6/e;
        //   55: astore_3
        //   56: goto -> 61
        //   59: aconst_null
        //   60: astore_3
        //   61: iconst_2
        //   62: anewarray r6/e
        //   65: dup
        //   66: iconst_0
        //   67: aload #8
        //   69: aastore
        //   70: dup
        //   71: iconst_1
        //   72: aload #9
        //   74: aastore
        //   75: aload_3
        //   76: invokestatic r : ([Ljava/lang/Object;Ljava/lang/Object;)Z
        //   79: ifeq -> 88
        //   82: ldc 2131952285
        //   84: istore_1
        //   85: goto -> 148
        //   88: getstatic r6/e.UDP : Lr6/e;
        //   91: astore #8
        //   93: getstatic r6/e.UNKNOWN : Lr6/e;
        //   96: astore #9
        //   98: aload_0
        //   99: getfield h : Lcom/smartpek/data/local/db/models/Device;
        //   102: astore #10
        //   104: aload #4
        //   106: astore_3
        //   107: aload #10
        //   109: ifnull -> 118
        //   112: aload #10
        //   114: invokevirtual getConnType : ()Lr6/e;
        //   117: astore_3
        //   118: iconst_2
        //   119: anewarray r6/e
        //   122: dup
        //   123: iconst_0
        //   124: aload #8
        //   126: aastore
        //   127: dup
        //   128: iconst_1
        //   129: aload #9
        //   131: aastore
        //   132: aload_3
        //   133: invokestatic r : ([Ljava/lang/Object;Ljava/lang/Object;)Z
        //   136: ifeq -> 145
        //   139: ldc 2131952122
        //   141: istore_1
        //   142: goto -> 148
        //   145: ldc 2131952209
        //   147: istore_1
        //   148: aload #5
        //   150: aload #6
        //   152: aconst_null
        //   153: aload #7
        //   155: iload_1
        //   156: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
        //   159: iconst_0
        //   160: bipush #48
        //   162: aconst_null
        //   163: aconst_null
        //   164: ldc 2131296259
        //   166: invokestatic valueOf : (I)Ljava/lang/Integer;
        //   169: ldc 2131099850
        //   171: fconst_0
        //   172: ldc 2131100550
        //   174: aconst_null
        //   175: iconst_0
        //   176: aconst_null
        //   177: sipush #14954
        //   180: aconst_null
        //   181: invokestatic g : (Landroid/content/Context;Landroid/view/View;Lp7/u;Ljava/lang/String;IILp7/m1;Ljava/lang/String;Ljava/lang/Integer;IFILjava/lang/String;ILq8/a;ILjava/lang/Object;)Lcom/google/android/material/snackbar/Snackbar;
        //   184: pop
        //   185: return
      }
    }
    
    static final class b extends n implements p<f, e, q> {
      b(g param2g, q8.a<q> param2a, e param2e) {
        super(2);
      }
      
      public final void a(f param2f, e param2e) {
        m.j(param2f, "state");
        int i = b.a[param2f.ordinal()];
        if (i != 1) {
          if (i != 2 && i != 3 && i != 4)
            return; 
          this.h.invoke();
          return;
        } 
        this.g.a(t.a() + 8000L);
        c0.q(new a(this.i));
        aa.c.d().m(a5.a.CONNECTING);
      }
      
      static final class a extends n implements q8.a<q> {
        a(e param3e) {
          super(0);
        }
        
        public final void invoke() {
          e e1 = this.g;
          if (e1 != null)
            v1.k((Context)e1, 2131951793, 0, null, 6, null); 
        }
      }
    }
    
    static final class a extends n implements q8.a<q> {
      a(e param2e) {
        super(0);
      }
      
      public final void invoke() {
        e e1 = this.g;
        if (e1 != null)
          v1.k((Context)e1, 2131951793, 0, null, 6, null); 
      }
    }
    
    static final class c extends n implements q8.a<q> {
      c(g param2g, e param2e, Device param2Device, PowerButton param2PowerButton) {
        super(0);
      }
      
      public final void invoke() {
        this.g.a(t.a());
        aa.c.d().m(a5.a.CONNECTED);
        g.a.a(this.g, this.h, this.i, this.j);
      }
    }
  }
  
  static final class a extends n implements p<n, Throwable, q> {
    a(e param1e, Device param1Device, PowerButton param1PowerButton) {
      super(2);
    }
    
    public final void a(n param1n, Throwable param1Throwable) {
      String str;
      c0.l(300, new a(this.i));
      if (param1Throwable == null) {
        if (param1n != null)
          param1n.a(); 
        Intent intent = new Intent((Context)this.g, SettingAct.class);
        Device device1 = this.h;
        Device device2 = null;
        if (device1 != null) {
          Integer integer = Integer.valueOf(device1.getId());
        } else {
          device1 = null;
        } 
        intent.putExtra("id", (Serializable)device1);
        device1 = this.h;
        if (device1 != null) {
          str = device1.getSsid();
        } else {
          device1 = null;
        } 
        intent.putExtra("ssid", (String)device1);
        device1 = device2;
        if (param1n != null)
          str = param1n.b(); 
        intent.putExtra("url", str);
        this.g.startActivityForResult(intent, 1998);
        return;
      } 
      str.printStackTrace();
      c0.q(new b(this.g, this.h));
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
      b(e param3e, Device param3Device) {
        super(0);
      }
      
      public final void invoke() {
        // Byte code:
        //   0: aload_0
        //   1: getfield g : Landroidx/fragment/app/e;
        //   4: astore #5
        //   6: aload #5
        //   8: invokestatic a : (Landroid/app/Activity;)Landroid/view/View;
        //   11: astore #6
        //   13: aload_0
        //   14: getfield g : Landroidx/fragment/app/e;
        //   17: astore #7
        //   19: aload #7
        //   21: invokestatic e : (Landroid/content/Context;)Z
        //   24: istore_2
        //   25: aconst_null
        //   26: astore #4
        //   28: iload_2
        //   29: ifeq -> 88
        //   32: getstatic r6/e.UDP : Lr6/e;
        //   35: astore #8
        //   37: getstatic r6/e.UNKNOWN : Lr6/e;
        //   40: astore #9
        //   42: aload_0
        //   43: getfield h : Lcom/smartpek/data/local/db/models/Device;
        //   46: astore_3
        //   47: aload_3
        //   48: ifnull -> 59
        //   51: aload_3
        //   52: invokevirtual getConnType : ()Lr6/e;
        //   55: astore_3
        //   56: goto -> 61
        //   59: aconst_null
        //   60: astore_3
        //   61: iconst_2
        //   62: anewarray r6/e
        //   65: dup
        //   66: iconst_0
        //   67: aload #8
        //   69: aastore
        //   70: dup
        //   71: iconst_1
        //   72: aload #9
        //   74: aastore
        //   75: aload_3
        //   76: invokestatic r : ([Ljava/lang/Object;Ljava/lang/Object;)Z
        //   79: ifeq -> 88
        //   82: ldc 2131952285
        //   84: istore_1
        //   85: goto -> 148
        //   88: getstatic r6/e.UDP : Lr6/e;
        //   91: astore #8
        //   93: getstatic r6/e.UNKNOWN : Lr6/e;
        //   96: astore #9
        //   98: aload_0
        //   99: getfield h : Lcom/smartpek/data/local/db/models/Device;
        //   102: astore #10
        //   104: aload #4
        //   106: astore_3
        //   107: aload #10
        //   109: ifnull -> 118
        //   112: aload #10
        //   114: invokevirtual getConnType : ()Lr6/e;
        //   117: astore_3
        //   118: iconst_2
        //   119: anewarray r6/e
        //   122: dup
        //   123: iconst_0
        //   124: aload #8
        //   126: aastore
        //   127: dup
        //   128: iconst_1
        //   129: aload #9
        //   131: aastore
        //   132: aload_3
        //   133: invokestatic r : ([Ljava/lang/Object;Ljava/lang/Object;)Z
        //   136: ifeq -> 145
        //   139: ldc 2131952122
        //   141: istore_1
        //   142: goto -> 148
        //   145: ldc 2131952209
        //   147: istore_1
        //   148: aload #5
        //   150: aload #6
        //   152: aconst_null
        //   153: aload #7
        //   155: iload_1
        //   156: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
        //   159: iconst_0
        //   160: bipush #48
        //   162: aconst_null
        //   163: aconst_null
        //   164: ldc 2131296259
        //   166: invokestatic valueOf : (I)Ljava/lang/Integer;
        //   169: ldc 2131099850
        //   171: fconst_0
        //   172: ldc 2131100550
        //   174: aconst_null
        //   175: iconst_0
        //   176: aconst_null
        //   177: sipush #14954
        //   180: aconst_null
        //   181: invokestatic g : (Landroid/content/Context;Landroid/view/View;Lp7/u;Ljava/lang/String;IILp7/m1;Ljava/lang/String;Ljava/lang/Integer;IFILjava/lang/String;ILq8/a;ILjava/lang/Object;)Lcom/google/android/material/snackbar/Snackbar;
        //   184: pop
        //   185: return
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
    b(e param1e, Device param1Device) {
      super(0);
    }
    
    public final void invoke() {
      // Byte code:
      //   0: aload_0
      //   1: getfield g : Landroidx/fragment/app/e;
      //   4: astore #5
      //   6: aload #5
      //   8: invokestatic a : (Landroid/app/Activity;)Landroid/view/View;
      //   11: astore #6
      //   13: aload_0
      //   14: getfield g : Landroidx/fragment/app/e;
      //   17: astore #7
      //   19: aload #7
      //   21: invokestatic e : (Landroid/content/Context;)Z
      //   24: istore_2
      //   25: aconst_null
      //   26: astore #4
      //   28: iload_2
      //   29: ifeq -> 88
      //   32: getstatic r6/e.UDP : Lr6/e;
      //   35: astore #8
      //   37: getstatic r6/e.UNKNOWN : Lr6/e;
      //   40: astore #9
      //   42: aload_0
      //   43: getfield h : Lcom/smartpek/data/local/db/models/Device;
      //   46: astore_3
      //   47: aload_3
      //   48: ifnull -> 59
      //   51: aload_3
      //   52: invokevirtual getConnType : ()Lr6/e;
      //   55: astore_3
      //   56: goto -> 61
      //   59: aconst_null
      //   60: astore_3
      //   61: iconst_2
      //   62: anewarray r6/e
      //   65: dup
      //   66: iconst_0
      //   67: aload #8
      //   69: aastore
      //   70: dup
      //   71: iconst_1
      //   72: aload #9
      //   74: aastore
      //   75: aload_3
      //   76: invokestatic r : ([Ljava/lang/Object;Ljava/lang/Object;)Z
      //   79: ifeq -> 88
      //   82: ldc 2131952285
      //   84: istore_1
      //   85: goto -> 148
      //   88: getstatic r6/e.UDP : Lr6/e;
      //   91: astore #8
      //   93: getstatic r6/e.UNKNOWN : Lr6/e;
      //   96: astore #9
      //   98: aload_0
      //   99: getfield h : Lcom/smartpek/data/local/db/models/Device;
      //   102: astore #10
      //   104: aload #4
      //   106: astore_3
      //   107: aload #10
      //   109: ifnull -> 118
      //   112: aload #10
      //   114: invokevirtual getConnType : ()Lr6/e;
      //   117: astore_3
      //   118: iconst_2
      //   119: anewarray r6/e
      //   122: dup
      //   123: iconst_0
      //   124: aload #8
      //   126: aastore
      //   127: dup
      //   128: iconst_1
      //   129: aload #9
      //   131: aastore
      //   132: aload_3
      //   133: invokestatic r : ([Ljava/lang/Object;Ljava/lang/Object;)Z
      //   136: ifeq -> 145
      //   139: ldc 2131952122
      //   141: istore_1
      //   142: goto -> 148
      //   145: ldc 2131952209
      //   147: istore_1
      //   148: aload #5
      //   150: aload #6
      //   152: aconst_null
      //   153: aload #7
      //   155: iload_1
      //   156: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
      //   159: iconst_0
      //   160: bipush #48
      //   162: aconst_null
      //   163: aconst_null
      //   164: ldc 2131296259
      //   166: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   169: ldc 2131099850
      //   171: fconst_0
      //   172: ldc 2131100550
      //   174: aconst_null
      //   175: iconst_0
      //   176: aconst_null
      //   177: sipush #14954
      //   180: aconst_null
      //   181: invokestatic g : (Landroid/content/Context;Landroid/view/View;Lp7/u;Ljava/lang/String;IILp7/m1;Ljava/lang/String;Ljava/lang/Integer;IFILjava/lang/String;ILq8/a;ILjava/lang/Object;)Lcom/google/android/material/snackbar/Snackbar;
      //   184: pop
      //   185: return
    }
  }
  
  static final class b extends n implements p<f, e, q> {
    b(g param1g, q8.a<q> param1a, e param1e) {
      super(2);
    }
    
    public final void a(f param1f, e param1e) {
      m.j(param1f, "state");
      int i = b.a[param1f.ordinal()];
      if (i != 1) {
        if (i != 2 && i != 3 && i != 4)
          return; 
        this.h.invoke();
        return;
      } 
      this.g.a(t.a() + 8000L);
      c0.q(new a(this.i));
      aa.c.d().m(a5.a.CONNECTING);
    }
    
    static final class a extends n implements q8.a<q> {
      a(e param3e) {
        super(0);
      }
      
      public final void invoke() {
        e e1 = this.g;
        if (e1 != null)
          v1.k((Context)e1, 2131951793, 0, null, 6, null); 
      }
    }
  }
  
  static final class a extends n implements q8.a<q> {
    a(e param1e) {
      super(0);
    }
    
    public final void invoke() {
      e e1 = this.g;
      if (e1 != null)
        v1.k((Context)e1, 2131951793, 0, null, 6, null); 
    }
  }
  
  static final class c extends n implements q8.a<q> {
    c(g param1g, e param1e, Device param1Device, PowerButton param1PowerButton) {
      super(0);
    }
    
    public final void invoke() {
      this.g.a(t.a());
      aa.c.d().m(a5.a.CONNECTED);
      g.a.a(this.g, this.h, this.i, this.j);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\c5\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */