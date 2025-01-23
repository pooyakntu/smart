package e6;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.e1;
import androidx.fragment.app.Fragment;
import com.android.volley.VolleyError;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import com.smartpek.App;
import com.smartpek.data.local.db.DB;
import com.smartpek.data.local.db.models.Device;
import com.smartpek.ui.setting.device.DeviceSettingAct;
import ir.am3n.needtool.views.ForceSelectableSpinner;
import java.util.Map;
import org.json.JSONObject;
import p7.c0;
import p7.c1;
import p7.h0;
import p7.q1;
import p7.v1;
import p7.x1;
import r8.a0;

@SuppressLint({"SetTextI18n"})
public final class b extends Fragment {
  public static final a o = new a(null);
  
  private String g;
  
  private Device h;
  
  private DeviceSettingAct i;
  
  private x4.h j;
  
  private String[] k;
  
  private boolean l;
  
  private boolean m;
  
  public Map<Integer, View> n;
  
  private final void T() {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   4: astore #7
    //   6: aload #7
    //   8: ldc 'resources'
    //   10: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
    //   13: aload #7
    //   15: invokestatic f : (Landroid/content/res/Resources;)Z
    //   18: istore #6
    //   20: aload_0
    //   21: getstatic r4/h.C0 : I
    //   24: invokevirtual J : (I)Landroid/view/View;
    //   27: checkcast androidx/appcompat/widget/AppCompatAutoCompleteTextView
    //   30: astore #8
    //   32: aconst_null
    //   33: astore #11
    //   35: aload #8
    //   37: ifnull -> 71
    //   40: aload_0
    //   41: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   44: astore #7
    //   46: aload #7
    //   48: ifnull -> 61
    //   51: aload #7
    //   53: invokevirtual getName : ()Ljava/lang/String;
    //   56: astore #7
    //   58: goto -> 64
    //   61: aconst_null
    //   62: astore #7
    //   64: aload #8
    //   66: aload #7
    //   68: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   71: aload_0
    //   72: getstatic r4/h.l1 : I
    //   75: invokevirtual J : (I)Landroid/view/View;
    //   78: checkcast androidx/appcompat/widget/AppCompatImageView
    //   81: astore #8
    //   83: aload_0
    //   84: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   87: astore #7
    //   89: aload #7
    //   91: ifnull -> 107
    //   94: aload #7
    //   96: invokevirtual getBackgroundColor : ()I
    //   99: invokestatic d : (I)Landroid/content/res/ColorStateList;
    //   102: astore #7
    //   104: goto -> 110
    //   107: aconst_null
    //   108: astore #7
    //   110: aload #8
    //   112: aload #7
    //   114: invokestatic c : (Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V
    //   117: aload_0
    //   118: new x4/h
    //   121: dup
    //   122: aload_0
    //   123: invokevirtual getActivity : ()Landroidx/fragment/app/e;
    //   126: new e6/b$b
    //   129: dup
    //   130: aload_0
    //   131: invokespecial <init> : (Le6/b;)V
    //   134: invokespecial <init> : (Landroid/content/Context;Lq8/l;)V
    //   137: putfield j : Lx4/h;
    //   140: aload_0
    //   141: aload_0
    //   142: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   145: ldc 2130903043
    //   147: invokevirtual getStringArray : (I)[Ljava/lang/String;
    //   150: putfield k : [Ljava/lang/String;
    //   153: aload_0
    //   154: invokevirtual requireContext : ()Landroid/content/Context;
    //   157: astore #7
    //   159: aload_0
    //   160: getfield k : [Ljava/lang/String;
    //   163: astore #8
    //   165: aload #8
    //   167: invokestatic g : (Ljava/lang/Object;)V
    //   170: new android/widget/ArrayAdapter
    //   173: dup
    //   174: aload #7
    //   176: ldc 2131558558
    //   178: aload #8
    //   180: invokespecial <init> : (Landroid/content/Context;I[Ljava/lang/Object;)V
    //   183: astore #8
    //   185: aload #8
    //   187: ldc_w 2131558557
    //   190: invokevirtual setDropDownViewResource : (I)V
    //   193: getstatic r4/h.U5 : I
    //   196: istore_1
    //   197: aload_0
    //   198: iload_1
    //   199: invokevirtual J : (I)Landroid/view/View;
    //   202: checkcast com/google/android/material/textfield/TextInputLayout
    //   205: astore #7
    //   207: aload #7
    //   209: ifnonnull -> 215
    //   212: goto -> 222
    //   215: aload #7
    //   217: iload #6
    //   219: invokevirtual setStartIconVisible : (Z)V
    //   222: aload_0
    //   223: iload_1
    //   224: invokevirtual J : (I)Landroid/view/View;
    //   227: checkcast com/google/android/material/textfield/TextInputLayout
    //   230: astore #7
    //   232: aload #7
    //   234: ifnonnull -> 240
    //   237: goto -> 249
    //   240: aload #7
    //   242: iload #6
    //   244: iconst_1
    //   245: ixor
    //   246: invokevirtual setEndIconVisible : (Z)V
    //   249: aload_0
    //   250: getstatic r4/h.i0 : I
    //   253: invokevirtual J : (I)Landroid/view/View;
    //   256: checkcast com/google/android/material/card/MaterialCardView
    //   259: astore #9
    //   261: bipush #8
    //   263: istore #4
    //   265: iconst_0
    //   266: istore_3
    //   267: aload #9
    //   269: ifnonnull -> 275
    //   272: goto -> 333
    //   275: aload_0
    //   276: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   279: astore #7
    //   281: aload #7
    //   283: ifnull -> 308
    //   286: aload #7
    //   288: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
    //   291: astore #7
    //   293: aload #7
    //   295: ifnull -> 308
    //   298: aload #7
    //   300: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
    //   303: astore #7
    //   305: goto -> 311
    //   308: aconst_null
    //   309: astore #7
    //   311: aload #7
    //   313: getstatic com/smartpek/data/local/models/j.PSH212 : Lcom/smartpek/data/local/models/j;
    //   316: if_acmpne -> 324
    //   319: iconst_0
    //   320: istore_1
    //   321: goto -> 327
    //   324: bipush #8
    //   326: istore_1
    //   327: aload #9
    //   329: iload_1
    //   330: invokevirtual setVisibility : (I)V
    //   333: getstatic r4/h.E5 : I
    //   336: istore #5
    //   338: aload_0
    //   339: iload #5
    //   341: invokevirtual J : (I)Landroid/view/View;
    //   344: checkcast ir/am3n/needtool/views/ForceSelectableSpinner
    //   347: astore #7
    //   349: aload #7
    //   351: ifnonnull -> 357
    //   354: goto -> 364
    //   357: aload #7
    //   359: aload #8
    //   361: invokevirtual setAdapter : (Landroid/widget/SpinnerAdapter;)V
    //   364: aload_0
    //   365: iload #5
    //   367: invokevirtual J : (I)Landroid/view/View;
    //   370: checkcast ir/am3n/needtool/views/ForceSelectableSpinner
    //   373: astore #7
    //   375: aload #7
    //   377: ifnull -> 429
    //   380: iload #6
    //   382: ifeq -> 394
    //   385: bipush #20
    //   387: invokestatic e : (I)I
    //   390: istore_1
    //   391: goto -> 396
    //   394: iconst_0
    //   395: istore_1
    //   396: iload #6
    //   398: ifne -> 410
    //   401: bipush #20
    //   403: invokestatic e : (I)I
    //   406: istore_2
    //   407: goto -> 412
    //   410: iconst_0
    //   411: istore_2
    //   412: aload #7
    //   414: iload_1
    //   415: aload #7
    //   417: invokevirtual getPaddingTop : ()I
    //   420: iload_2
    //   421: aload #7
    //   423: invokevirtual getPaddingBottom : ()I
    //   426: invokevirtual setPadding : (IIII)V
    //   429: aload_0
    //   430: iload #5
    //   432: invokevirtual J : (I)Landroid/view/View;
    //   435: checkcast ir/am3n/needtool/views/ForceSelectableSpinner
    //   438: astore #7
    //   440: aload #7
    //   442: ifnull -> 485
    //   445: aload_0
    //   446: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   449: astore #8
    //   451: aload #8
    //   453: ifnull -> 477
    //   456: aload #8
    //   458: invokevirtual getCtrlType : ()Ljava/lang/Integer;
    //   461: astore #8
    //   463: aload #8
    //   465: ifnull -> 477
    //   468: aload #8
    //   470: invokevirtual intValue : ()I
    //   473: istore_1
    //   474: goto -> 479
    //   477: iconst_0
    //   478: istore_1
    //   479: aload #7
    //   481: iload_1
    //   482: invokevirtual setSelection : (I)V
    //   485: aload_0
    //   486: getstatic r4/h.I0 : I
    //   489: invokevirtual J : (I)Landroid/view/View;
    //   492: checkcast com/google/android/material/textfield/TextInputEditText
    //   495: astore #8
    //   497: aload #8
    //   499: ifnull -> 541
    //   502: aload_0
    //   503: iload #5
    //   505: invokevirtual J : (I)Landroid/view/View;
    //   508: checkcast ir/am3n/needtool/views/ForceSelectableSpinner
    //   511: astore #7
    //   513: aload #7
    //   515: ifnull -> 528
    //   518: aload #7
    //   520: invokevirtual getSelectedItem : ()Ljava/lang/Object;
    //   523: astore #7
    //   525: goto -> 531
    //   528: aconst_null
    //   529: astore #7
    //   531: aload #8
    //   533: aload #7
    //   535: checkcast java/lang/String
    //   538: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   541: aload_0
    //   542: getstatic r4/h.g0 : I
    //   545: invokevirtual J : (I)Landroid/view/View;
    //   548: checkcast com/google/android/material/card/MaterialCardView
    //   551: astore #8
    //   553: aload #8
    //   555: ifnonnull -> 561
    //   558: goto -> 619
    //   561: aload_0
    //   562: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   565: astore #7
    //   567: aload #7
    //   569: ifnull -> 594
    //   572: aload #7
    //   574: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
    //   577: astore #7
    //   579: aload #7
    //   581: ifnull -> 594
    //   584: aload #7
    //   586: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
    //   589: astore #7
    //   591: goto -> 597
    //   594: aconst_null
    //   595: astore #7
    //   597: aload #7
    //   599: getstatic com/smartpek/data/local/models/j.PSH215 : Lcom/smartpek/data/local/models/j;
    //   602: if_acmpne -> 610
    //   605: iconst_0
    //   606: istore_1
    //   607: goto -> 613
    //   610: bipush #8
    //   612: istore_1
    //   613: aload #8
    //   615: iload_1
    //   616: invokevirtual setVisibility : (I)V
    //   619: aload_0
    //   620: getstatic r4/h.V4 : I
    //   623: invokevirtual J : (I)Landroid/view/View;
    //   626: checkcast ir/am3n/needtool/views/A3RelativeLayout
    //   629: astore #8
    //   631: aload #8
    //   633: ifnonnull -> 639
    //   636: goto -> 709
    //   639: getstatic com/smartpek/data/local/models/DeviceType.COOLER_CTRL_B : Lcom/smartpek/data/local/models/DeviceType;
    //   642: astore #9
    //   644: getstatic com/smartpek/data/local/models/DeviceType.COOLER_CTRL_C : Lcom/smartpek/data/local/models/DeviceType;
    //   647: astore #10
    //   649: aload_0
    //   650: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   653: astore #7
    //   655: aload #7
    //   657: ifnull -> 670
    //   660: aload #7
    //   662: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
    //   665: astore #7
    //   667: goto -> 673
    //   670: aconst_null
    //   671: astore #7
    //   673: iconst_2
    //   674: anewarray com/smartpek/data/local/models/DeviceType
    //   677: dup
    //   678: iconst_0
    //   679: aload #9
    //   681: aastore
    //   682: dup
    //   683: iconst_1
    //   684: aload #10
    //   686: aastore
    //   687: aload #7
    //   689: invokestatic r : ([Ljava/lang/Object;Ljava/lang/Object;)Z
    //   692: ifeq -> 700
    //   695: iconst_0
    //   696: istore_1
    //   697: goto -> 703
    //   700: bipush #8
    //   702: istore_1
    //   703: aload #8
    //   705: iload_1
    //   706: invokevirtual setVisibility : (I)V
    //   709: aload_0
    //   710: getstatic r4/h.T4 : I
    //   713: invokevirtual J : (I)Landroid/view/View;
    //   716: checkcast ir/am3n/needtool/views/A3RelativeLayout
    //   719: astore #7
    //   721: aload #7
    //   723: ifnonnull -> 729
    //   726: goto -> 736
    //   729: aload #7
    //   731: bipush #8
    //   733: invokevirtual setVisibility : (I)V
    //   736: aload_0
    //   737: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   740: astore #7
    //   742: aload #7
    //   744: ifnull -> 769
    //   747: aload #7
    //   749: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
    //   752: astore #7
    //   754: aload #7
    //   756: ifnull -> 769
    //   759: aload #7
    //   761: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
    //   764: astore #7
    //   766: goto -> 772
    //   769: aconst_null
    //   770: astore #7
    //   772: aload #7
    //   774: getstatic com/smartpek/data/local/models/j.PSH215 : Lcom/smartpek/data/local/models/j;
    //   777: if_acmpne -> 841
    //   780: aload_0
    //   781: getstatic r4/h.m0 : I
    //   784: invokevirtual J : (I)Landroid/view/View;
    //   787: checkcast com/google/android/material/checkbox/MaterialCheckBox
    //   790: astore #7
    //   792: aload #7
    //   794: ifnonnull -> 800
    //   797: goto -> 841
    //   800: getstatic com/smartpek/ui/setting/SettingAct.t : Lcom/smartpek/ui/setting/SettingAct$a;
    //   803: invokevirtual b : ()Lorg/json/JSONObject;
    //   806: astore #8
    //   808: aload #8
    //   810: invokestatic g : (Ljava/lang/Object;)V
    //   813: aload #8
    //   815: ldc_w 'water_pump_sync'
    //   818: invokevirtual getInt : (Ljava/lang/String;)I
    //   821: iconst_1
    //   822: if_icmpne -> 1702
    //   825: iconst_1
    //   826: istore #6
    //   828: goto -> 831
    //   831: aload #7
    //   833: iload #6
    //   835: invokevirtual setChecked : (Z)V
    //   838: goto -> 841
    //   841: getstatic com/smartpek/data/local/models/DeviceType.COOLER_CTRL_B : Lcom/smartpek/data/local/models/DeviceType;
    //   844: astore #8
    //   846: getstatic com/smartpek/data/local/models/DeviceType.COOLER_CTRL_C : Lcom/smartpek/data/local/models/DeviceType;
    //   849: astore #9
    //   851: aload_0
    //   852: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   855: astore #7
    //   857: aload #7
    //   859: ifnull -> 872
    //   862: aload #7
    //   864: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
    //   867: astore #7
    //   869: goto -> 875
    //   872: aconst_null
    //   873: astore #7
    //   875: iconst_2
    //   876: anewarray com/smartpek/data/local/models/DeviceType
    //   879: dup
    //   880: iconst_0
    //   881: aload #8
    //   883: aastore
    //   884: dup
    //   885: iconst_1
    //   886: aload #9
    //   888: aastore
    //   889: aload #7
    //   891: invokestatic r : ([Ljava/lang/Object;Ljava/lang/Object;)Z
    //   894: ifeq -> 958
    //   897: aload_0
    //   898: getstatic r4/h.K5 : I
    //   901: invokevirtual J : (I)Landroid/view/View;
    //   904: checkcast com/google/android/material/switchmaterial/SwitchMaterial
    //   907: astore #7
    //   909: aload #7
    //   911: ifnonnull -> 917
    //   914: goto -> 958
    //   917: getstatic com/smartpek/ui/setting/SettingAct.t : Lcom/smartpek/ui/setting/SettingAct$a;
    //   920: invokevirtual b : ()Lorg/json/JSONObject;
    //   923: astore #8
    //   925: aload #8
    //   927: invokestatic g : (Ljava/lang/Object;)V
    //   930: aload #8
    //   932: ldc_w 'traditional_key_mode'
    //   935: invokevirtual getInt : (Ljava/lang/String;)I
    //   938: iconst_1
    //   939: if_icmpne -> 1708
    //   942: iconst_1
    //   943: istore #6
    //   945: goto -> 948
    //   948: aload #7
    //   950: iload #6
    //   952: invokevirtual setChecked : (Z)V
    //   955: goto -> 958
    //   958: aload_0
    //   959: getstatic r4/h.j0 : I
    //   962: invokevirtual J : (I)Landroid/view/View;
    //   965: checkcast com/google/android/material/card/MaterialCardView
    //   968: astore #8
    //   970: aload #8
    //   972: ifnonnull -> 978
    //   975: goto -> 1044
    //   978: aload_0
    //   979: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   982: astore #7
    //   984: aload #7
    //   986: ifnull -> 1011
    //   989: aload #7
    //   991: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
    //   994: astore #7
    //   996: aload #7
    //   998: ifnull -> 1011
    //   1001: aload #7
    //   1003: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
    //   1006: astore #7
    //   1008: goto -> 1014
    //   1011: aconst_null
    //   1012: astore #7
    //   1014: aload #7
    //   1016: getstatic com/smartpek/data/local/models/j.PSH115 : Lcom/smartpek/data/local/models/j;
    //   1019: if_acmpne -> 1027
    //   1022: iconst_1
    //   1023: istore_1
    //   1024: goto -> 1029
    //   1027: iconst_0
    //   1028: istore_1
    //   1029: iload #4
    //   1031: istore_2
    //   1032: iload_1
    //   1033: ifeq -> 1038
    //   1036: iconst_0
    //   1037: istore_2
    //   1038: aload #8
    //   1040: iload_2
    //   1041: invokevirtual setVisibility : (I)V
    //   1044: aload_0
    //   1045: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   1048: astore #7
    //   1050: aload #7
    //   1052: ifnull -> 1077
    //   1055: aload #7
    //   1057: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
    //   1060: astore #7
    //   1062: aload #7
    //   1064: ifnull -> 1077
    //   1067: aload #7
    //   1069: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
    //   1072: astore #7
    //   1074: goto -> 1080
    //   1077: aconst_null
    //   1078: astore #7
    //   1080: aload #7
    //   1082: getstatic com/smartpek/data/local/models/j.PSH115 : Lcom/smartpek/data/local/models/j;
    //   1085: if_acmpne -> 1691
    //   1088: aload_0
    //   1089: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   1092: astore #7
    //   1094: aload #7
    //   1096: ifnull -> 1132
    //   1099: aload #7
    //   1101: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
    //   1104: astore #7
    //   1106: aload #7
    //   1108: ifnull -> 1132
    //   1111: aload #7
    //   1113: iconst_0
    //   1114: aaload
    //   1115: astore #7
    //   1117: aload #7
    //   1119: ifnull -> 1132
    //   1122: aload #7
    //   1124: invokevirtual getCustomCode : ()Ljava/lang/String;
    //   1127: astore #8
    //   1129: goto -> 1135
    //   1132: aconst_null
    //   1133: astore #8
    //   1135: aload_0
    //   1136: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   1139: astore #7
    //   1141: aload #7
    //   1143: ifnull -> 1179
    //   1146: aload #7
    //   1148: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
    //   1151: astore #7
    //   1153: aload #7
    //   1155: ifnull -> 1179
    //   1158: aload #7
    //   1160: iconst_1
    //   1161: aaload
    //   1162: astore #7
    //   1164: aload #7
    //   1166: ifnull -> 1179
    //   1169: aload #7
    //   1171: invokevirtual getCustomCode : ()Ljava/lang/String;
    //   1174: astore #9
    //   1176: goto -> 1182
    //   1179: aconst_null
    //   1180: astore #9
    //   1182: aload_0
    //   1183: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   1186: astore #7
    //   1188: aload #7
    //   1190: ifnull -> 1226
    //   1193: aload #7
    //   1195: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
    //   1198: astore #7
    //   1200: aload #7
    //   1202: ifnull -> 1226
    //   1205: aload #7
    //   1207: iconst_2
    //   1208: aaload
    //   1209: astore #7
    //   1211: aload #7
    //   1213: ifnull -> 1226
    //   1216: aload #7
    //   1218: invokevirtual getCustomCode : ()Ljava/lang/String;
    //   1221: astore #10
    //   1223: goto -> 1229
    //   1226: aconst_null
    //   1227: astore #10
    //   1229: aload_0
    //   1230: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   1233: astore #7
    //   1235: aload #7
    //   1237: ifnull -> 1273
    //   1240: aload #7
    //   1242: invokevirtual getChannels : ()[Lcom/smartpek/data/local/models/Channel;
    //   1245: astore #7
    //   1247: aload #7
    //   1249: ifnull -> 1273
    //   1252: aload #7
    //   1254: iconst_3
    //   1255: aaload
    //   1256: astore #7
    //   1258: aload #7
    //   1260: ifnull -> 1273
    //   1263: aload #7
    //   1265: invokevirtual getCustomCode : ()Ljava/lang/String;
    //   1268: astore #7
    //   1270: goto -> 1276
    //   1273: aconst_null
    //   1274: astore #7
    //   1276: aload_0
    //   1277: getstatic r4/h.S : I
    //   1280: invokevirtual J : (I)Landroid/view/View;
    //   1283: checkcast com/google/android/material/button/MaterialButton
    //   1286: astore #12
    //   1288: aload_0
    //   1289: invokevirtual getContext : ()Landroid/content/Context;
    //   1292: astore #13
    //   1294: ldc_w 2131099863
    //   1297: istore_2
    //   1298: aload #13
    //   1300: ifnull -> 1374
    //   1303: aload #8
    //   1305: ifnull -> 1322
    //   1308: aload #8
    //   1310: invokestatic a : (Ljava/lang/String;)Z
    //   1313: iconst_1
    //   1314: if_icmpne -> 1322
    //   1317: iconst_1
    //   1318: istore_1
    //   1319: goto -> 1324
    //   1322: iconst_0
    //   1323: istore_1
    //   1324: iload_1
    //   1325: ifeq -> 1356
    //   1328: new org/json/JSONObject
    //   1331: dup
    //   1332: aload #8
    //   1334: invokespecial <init> : (Ljava/lang/String;)V
    //   1337: ldc_w 'd'
    //   1340: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   1343: invokestatic c : (Ljava/lang/String;)I
    //   1346: ifeq -> 1356
    //   1349: ldc_w 2131099863
    //   1352: istore_1
    //   1353: goto -> 1360
    //   1356: ldc_w 2131099858
    //   1359: istore_1
    //   1360: aload #13
    //   1362: iload_1
    //   1363: invokestatic a : (Landroid/content/Context;I)I
    //   1366: invokestatic d : (I)Landroid/content/res/ColorStateList;
    //   1369: astore #8
    //   1371: goto -> 1377
    //   1374: aconst_null
    //   1375: astore #8
    //   1377: aload #12
    //   1379: aload #8
    //   1381: invokestatic C0 : (Landroid/view/View;Landroid/content/res/ColorStateList;)V
    //   1384: aload_0
    //   1385: getstatic r4/h.T : I
    //   1388: invokevirtual J : (I)Landroid/view/View;
    //   1391: checkcast com/google/android/material/button/MaterialButton
    //   1394: astore #12
    //   1396: aload_0
    //   1397: invokevirtual getContext : ()Landroid/content/Context;
    //   1400: astore #8
    //   1402: aload #8
    //   1404: ifnull -> 1478
    //   1407: aload #9
    //   1409: ifnull -> 1426
    //   1412: aload #9
    //   1414: invokestatic a : (Ljava/lang/String;)Z
    //   1417: iconst_1
    //   1418: if_icmpne -> 1426
    //   1421: iconst_1
    //   1422: istore_1
    //   1423: goto -> 1428
    //   1426: iconst_0
    //   1427: istore_1
    //   1428: iload_1
    //   1429: ifeq -> 1460
    //   1432: new org/json/JSONObject
    //   1435: dup
    //   1436: aload #9
    //   1438: invokespecial <init> : (Ljava/lang/String;)V
    //   1441: ldc_w 'd'
    //   1444: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   1447: invokestatic c : (Ljava/lang/String;)I
    //   1450: ifeq -> 1460
    //   1453: ldc_w 2131099863
    //   1456: istore_1
    //   1457: goto -> 1464
    //   1460: ldc_w 2131099858
    //   1463: istore_1
    //   1464: aload #8
    //   1466: iload_1
    //   1467: invokestatic a : (Landroid/content/Context;I)I
    //   1470: invokestatic d : (I)Landroid/content/res/ColorStateList;
    //   1473: astore #8
    //   1475: goto -> 1481
    //   1478: aconst_null
    //   1479: astore #8
    //   1481: aload #12
    //   1483: aload #8
    //   1485: invokestatic C0 : (Landroid/view/View;Landroid/content/res/ColorStateList;)V
    //   1488: aload_0
    //   1489: getstatic r4/h.U : I
    //   1492: invokevirtual J : (I)Landroid/view/View;
    //   1495: checkcast com/google/android/material/button/MaterialButton
    //   1498: astore #9
    //   1500: aload_0
    //   1501: invokevirtual getContext : ()Landroid/content/Context;
    //   1504: astore #8
    //   1506: aload #8
    //   1508: ifnull -> 1582
    //   1511: aload #10
    //   1513: ifnull -> 1530
    //   1516: aload #10
    //   1518: invokestatic a : (Ljava/lang/String;)Z
    //   1521: iconst_1
    //   1522: if_icmpne -> 1530
    //   1525: iconst_1
    //   1526: istore_1
    //   1527: goto -> 1532
    //   1530: iconst_0
    //   1531: istore_1
    //   1532: iload_1
    //   1533: ifeq -> 1564
    //   1536: new org/json/JSONObject
    //   1539: dup
    //   1540: aload #10
    //   1542: invokespecial <init> : (Ljava/lang/String;)V
    //   1545: ldc_w 'd'
    //   1548: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   1551: invokestatic c : (Ljava/lang/String;)I
    //   1554: ifeq -> 1564
    //   1557: ldc_w 2131099863
    //   1560: istore_1
    //   1561: goto -> 1568
    //   1564: ldc_w 2131099858
    //   1567: istore_1
    //   1568: aload #8
    //   1570: iload_1
    //   1571: invokestatic a : (Landroid/content/Context;I)I
    //   1574: invokestatic d : (I)Landroid/content/res/ColorStateList;
    //   1577: astore #8
    //   1579: goto -> 1585
    //   1582: aconst_null
    //   1583: astore #8
    //   1585: aload #9
    //   1587: aload #8
    //   1589: invokestatic C0 : (Landroid/view/View;Landroid/content/res/ColorStateList;)V
    //   1592: aload_0
    //   1593: getstatic r4/h.V : I
    //   1596: invokevirtual J : (I)Landroid/view/View;
    //   1599: checkcast com/google/android/material/button/MaterialButton
    //   1602: astore #9
    //   1604: aload_0
    //   1605: invokevirtual getContext : ()Landroid/content/Context;
    //   1608: astore #10
    //   1610: aload #11
    //   1612: astore #8
    //   1614: aload #10
    //   1616: ifnull -> 1684
    //   1619: iload_3
    //   1620: istore_1
    //   1621: aload #7
    //   1623: ifnull -> 1639
    //   1626: iload_3
    //   1627: istore_1
    //   1628: aload #7
    //   1630: invokestatic a : (Ljava/lang/String;)Z
    //   1633: iconst_1
    //   1634: if_icmpne -> 1639
    //   1637: iconst_1
    //   1638: istore_1
    //   1639: iload_1
    //   1640: ifeq -> 1669
    //   1643: new org/json/JSONObject
    //   1646: dup
    //   1647: aload #7
    //   1649: invokespecial <init> : (Ljava/lang/String;)V
    //   1652: ldc_w 'd'
    //   1655: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   1658: invokestatic c : (Ljava/lang/String;)I
    //   1661: ifeq -> 1669
    //   1664: iload_2
    //   1665: istore_1
    //   1666: goto -> 1673
    //   1669: ldc_w 2131099858
    //   1672: istore_1
    //   1673: aload #10
    //   1675: iload_1
    //   1676: invokestatic a : (Landroid/content/Context;I)I
    //   1679: invokestatic d : (I)Landroid/content/res/ColorStateList;
    //   1682: astore #8
    //   1684: aload #9
    //   1686: aload #8
    //   1688: invokestatic C0 : (Landroid/view/View;Landroid/content/res/ColorStateList;)V
    //   1691: return
    //   1692: astore #7
    //   1694: goto -> 841
    //   1697: astore #7
    //   1699: goto -> 958
    //   1702: iconst_0
    //   1703: istore #6
    //   1705: goto -> 831
    //   1708: iconst_0
    //   1709: istore #6
    //   1711: goto -> 948
    // Exception table:
    //   from	to	target	type
    //   780	792	1692	finally
    //   800	825	1692	finally
    //   831	838	1692	finally
    //   897	909	1697	finally
    //   917	942	1697	finally
    //   948	955	1697	finally
  }
  
  private static final void U(b paramb, CompoundButton paramCompoundButton, boolean paramBoolean) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
  }
  
  public void I() {
    this.n.clear();
  }
  
  public View J(int paramInt) {
    Map<Integer, View> map = this.n;
    View view2 = map.get(Integer.valueOf(paramInt));
    View view1 = view2;
    if (view2 == null) {
      view1 = getView();
      if (view1 != null) {
        view1 = view1.findViewById(paramInt);
        if (view1 != null) {
          map.put(Integer.valueOf(paramInt), view1);
          return view1;
        } 
      } 
      view1 = null;
    } 
    return view1;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    r8.m.j(paramLayoutInflater, "inflater");
    return paramLayoutInflater.inflate(2131558528, paramViewGroup, false);
  }
  
  public void onPause() {
    x4.h h1 = this.j;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (h1 != null) {
      bool1 = bool2;
      if (h1.isShowing() == true)
        bool1 = true; 
    } 
    if (bool1) {
      h1 = this.j;
      if (h1 != null)
        h1.dismiss(); 
    } 
    Context context = getContext();
    if (context != null)
      x1.c(context, getView()); 
    super.onPause();
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 'view'
    //   4: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
    //   7: aload_0
    //   8: aload_1
    //   9: aload_2
    //   10: invokespecial onViewCreated : (Landroid/view/View;Landroid/os/Bundle;)V
    //   13: aload_0
    //   14: invokespecial T : ()V
    //   17: aload_0
    //   18: getstatic r4/h.C0 : I
    //   21: invokevirtual J : (I)Landroid/view/View;
    //   24: checkcast androidx/appcompat/widget/AppCompatAutoCompleteTextView
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull -> 44
    //   32: aload_1
    //   33: new e6/b$c
    //   36: dup
    //   37: aload_0
    //   38: invokespecial <init> : (Le6/b;)V
    //   41: invokevirtual addTextChangedListener : (Landroid/text/TextWatcher;)V
    //   44: aload_0
    //   45: getstatic r4/h.m : I
    //   48: invokevirtual J : (I)Landroid/view/View;
    //   51: checkcast androidx/appcompat/widget/AppCompatImageView
    //   54: astore_1
    //   55: aload_1
    //   56: ifnull -> 71
    //   59: aload_1
    //   60: new e6/b$d
    //   63: dup
    //   64: aload_0
    //   65: invokespecial <init> : (Le6/b;)V
    //   68: invokestatic b : (Landroid/view/View;Lq8/l;)V
    //   71: aload_0
    //   72: getstatic r4/h.E5 : I
    //   75: invokevirtual J : (I)Landroid/view/View;
    //   78: checkcast ir/am3n/needtool/views/ForceSelectableSpinner
    //   81: astore_1
    //   82: aload_1
    //   83: ifnonnull -> 89
    //   86: goto -> 101
    //   89: aload_1
    //   90: new e6/b$e
    //   93: dup
    //   94: aload_0
    //   95: invokespecial <init> : (Le6/b;)V
    //   98: invokevirtual setOnItemSelectedEvenIfUnchangedListener : (Landroid/widget/AdapterView$OnItemSelectedListener;)V
    //   101: aload_0
    //   102: getstatic r4/h.K5 : I
    //   105: invokevirtual J : (I)Landroid/view/View;
    //   108: checkcast com/google/android/material/switchmaterial/SwitchMaterial
    //   111: astore_1
    //   112: aload_1
    //   113: ifnull -> 128
    //   116: aload_1
    //   117: new e6/a
    //   120: dup
    //   121: aload_0
    //   122: invokespecial <init> : (Le6/b;)V
    //   125: invokevirtual setOnCheckedChangeListener : (Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    //   128: aload_0
    //   129: getstatic r4/h.U4 : I
    //   132: invokevirtual J : (I)Landroid/view/View;
    //   135: checkcast ir/am3n/needtool/views/A3RelativeLayout
    //   138: astore_1
    //   139: aload_1
    //   140: ifnull -> 155
    //   143: aload_1
    //   144: new e6/b$j
    //   147: dup
    //   148: aload_0
    //   149: invokespecial <init> : (Le6/b;)V
    //   152: invokestatic b : (Landroid/view/View;Lq8/l;)V
    //   155: aload_0
    //   156: getfield h : Lcom/smartpek/data/local/db/models/Device;
    //   159: astore_1
    //   160: aload_1
    //   161: ifnull -> 181
    //   164: aload_1
    //   165: invokevirtual getType : ()Lcom/smartpek/data/local/models/DeviceType;
    //   168: astore_1
    //   169: aload_1
    //   170: ifnull -> 181
    //   173: aload_1
    //   174: invokevirtual getGroup : ()Lcom/smartpek/data/local/models/j;
    //   177: astore_1
    //   178: goto -> 183
    //   181: aconst_null
    //   182: astore_1
    //   183: aload_1
    //   184: getstatic com/smartpek/data/local/models/j.PSH115 : Lcom/smartpek/data/local/models/j;
    //   187: if_acmpne -> 346
    //   190: new android/os/Handler
    //   193: dup
    //   194: invokestatic getMainLooper : ()Landroid/os/Looper;
    //   197: invokespecial <init> : (Landroid/os/Looper;)V
    //   200: astore_1
    //   201: new e6/b$o
    //   204: dup
    //   205: aload_0
    //   206: new e6/b$r
    //   209: dup
    //   210: aload_0
    //   211: aload_1
    //   212: invokespecial <init> : (Le6/b;Landroid/os/Handler;)V
    //   215: bipush #10
    //   217: aload_1
    //   218: new e6/b$q
    //   221: dup
    //   222: aload_0
    //   223: invokespecial <init> : (Le6/b;)V
    //   226: new e6/b$p
    //   229: dup
    //   230: aload_0
    //   231: invokespecial <init> : (Le6/b;)V
    //   234: invokespecial <init> : (Le6/b;Le6/b$r;ILandroid/os/Handler;Lq8/q;Lq8/p;)V
    //   237: astore_1
    //   238: aload_0
    //   239: getstatic r4/h.S : I
    //   242: invokevirtual J : (I)Landroid/view/View;
    //   245: checkcast com/google/android/material/button/MaterialButton
    //   248: astore_2
    //   249: aload_2
    //   250: ifnull -> 265
    //   253: aload_2
    //   254: new e6/b$k
    //   257: dup
    //   258: aload_1
    //   259: invokespecial <init> : (Lq8/p;)V
    //   262: invokestatic b : (Landroid/view/View;Lq8/l;)V
    //   265: aload_0
    //   266: getstatic r4/h.T : I
    //   269: invokevirtual J : (I)Landroid/view/View;
    //   272: checkcast com/google/android/material/button/MaterialButton
    //   275: astore_2
    //   276: aload_2
    //   277: ifnull -> 292
    //   280: aload_2
    //   281: new e6/b$l
    //   284: dup
    //   285: aload_1
    //   286: invokespecial <init> : (Lq8/p;)V
    //   289: invokestatic b : (Landroid/view/View;Lq8/l;)V
    //   292: aload_0
    //   293: getstatic r4/h.U : I
    //   296: invokevirtual J : (I)Landroid/view/View;
    //   299: checkcast com/google/android/material/button/MaterialButton
    //   302: astore_2
    //   303: aload_2
    //   304: ifnull -> 319
    //   307: aload_2
    //   308: new e6/b$m
    //   311: dup
    //   312: aload_1
    //   313: invokespecial <init> : (Lq8/p;)V
    //   316: invokestatic b : (Landroid/view/View;Lq8/l;)V
    //   319: aload_0
    //   320: getstatic r4/h.V : I
    //   323: invokevirtual J : (I)Landroid/view/View;
    //   326: checkcast com/google/android/material/button/MaterialButton
    //   329: astore_2
    //   330: aload_2
    //   331: ifnull -> 346
    //   334: aload_2
    //   335: new e6/b$n
    //   338: dup
    //   339: aload_1
    //   340: invokespecial <init> : (Lq8/p;)V
    //   343: invokestatic b : (Landroid/view/View;Lq8/l;)V
    //   346: return
  }
  
  public static final class a {
    private a() {}
    
    public final b a(DeviceSettingAct param1DeviceSettingAct, Device param1Device, String param1String) {
      r8.m.j(param1DeviceSettingAct, "parent");
      b b = new b();
      b.P(b, param1DeviceSettingAct);
      b.O(b, param1Device);
      b.S(b, param1String);
      return b;
    }
  }
  
  static final class b extends r8.n implements q8.l<Integer, e8.q> {
    b(b param1b) {
      super(1);
    }
    
    public final void a(int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: getfield g : Le6/b;
      //   4: invokestatic K : (Le6/b;)Lx4/h;
      //   7: astore_2
      //   8: aload_2
      //   9: ifnull -> 16
      //   12: aload_2
      //   13: invokevirtual dismiss : ()V
      //   16: aload_0
      //   17: getfield g : Le6/b;
      //   20: getstatic r4/h.l1 : I
      //   23: invokevirtual J : (I)Landroid/view/View;
      //   26: checkcast androidx/appcompat/widget/AppCompatImageView
      //   29: iload_1
      //   30: invokestatic d : (I)Landroid/content/res/ColorStateList;
      //   33: invokestatic c : (Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V
      //   36: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
      //   39: astore_2
      //   40: aload_2
      //   41: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   44: astore_3
      //   45: aload_3
      //   46: invokestatic g : (Ljava/lang/Object;)V
      //   49: aload_3
      //   50: invokevirtual H : ()Lu4/a;
      //   53: astore_3
      //   54: aload_0
      //   55: getfield g : Le6/b;
      //   58: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   61: astore #4
      //   63: aload #4
      //   65: invokestatic g : (Ljava/lang/Object;)V
      //   68: aload_3
      //   69: aload #4
      //   71: invokevirtual getId : ()I
      //   74: invokevirtual z : (I)Ljava/lang/Object;
      //   77: checkcast com/smartpek/data/local/db/models/Device
      //   80: astore_3
      //   81: aload_3
      //   82: ifnull -> 135
      //   85: aload_0
      //   86: getfield g : Le6/b;
      //   89: astore #4
      //   91: aload_3
      //   92: iload_1
      //   93: invokevirtual setBackgroundColor : (I)V
      //   96: aload_2
      //   97: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   100: astore_2
      //   101: aload_2
      //   102: ifnull -> 120
      //   105: aload_2
      //   106: invokevirtual H : ()Lu4/a;
      //   109: astore_2
      //   110: aload_2
      //   111: ifnull -> 120
      //   114: aload_2
      //   115: aload_3
      //   116: invokevirtual O : (Ljava/lang/Object;)Ljava/lang/Integer;
      //   119: pop
      //   120: aload #4
      //   122: invokevirtual getActivity : ()Landroidx/fragment/app/e;
      //   125: astore_2
      //   126: aload_2
      //   127: ifnull -> 135
      //   130: aload_2
      //   131: iconst_m1
      //   132: invokevirtual setResult : (I)V
      //   135: return
      //   136: astore_2
      //   137: goto -> 36
      //   140: astore_2
      //   141: return
      // Exception table:
      //   from	to	target	type
      //   16	36	136	finally
      //   36	81	140	finally
      //   85	101	140	finally
      //   105	110	140	finally
      //   114	120	140	finally
      //   120	126	140	finally
      //   130	135	140	finally
    }
  }
  
  public static final class c implements TextWatcher {
    public c(b param1b) {}
    
    public void afterTextChanged(Editable param1Editable) {
      // Byte code:
      //   0: aload_1
      //   1: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
      //   4: invokestatic S0 : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      //   7: invokevirtual toString : ()Ljava/lang/String;
      //   10: astore #6
      //   12: aload_0
      //   13: getfield g : Le6/b;
      //   16: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   19: astore_1
      //   20: aconst_null
      //   21: astore #4
      //   23: aconst_null
      //   24: astore #5
      //   26: aload_1
      //   27: ifnull -> 38
      //   30: aload_1
      //   31: invokevirtual getName : ()Ljava/lang/String;
      //   34: astore_1
      //   35: goto -> 40
      //   38: aconst_null
      //   39: astore_1
      //   40: aload #6
      //   42: aload_1
      //   43: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
      //   46: ifne -> 562
      //   49: aload #6
      //   51: invokeinterface length : ()I
      //   56: istore_2
      //   57: iconst_0
      //   58: istore_3
      //   59: iload_2
      //   60: ifne -> 68
      //   63: iconst_1
      //   64: istore_2
      //   65: goto -> 70
      //   68: iconst_0
      //   69: istore_2
      //   70: iload_2
      //   71: ifeq -> 134
      //   74: aload_0
      //   75: getfield g : Le6/b;
      //   78: getstatic r4/h.T5 : I
      //   81: invokevirtual J : (I)Landroid/view/View;
      //   84: checkcast com/google/android/material/textfield/TextInputLayout
      //   87: astore #4
      //   89: aload #4
      //   91: ifnonnull -> 95
      //   94: return
      //   95: aload_0
      //   96: getfield g : Le6/b;
      //   99: invokevirtual getContext : ()Landroid/content/Context;
      //   102: astore #6
      //   104: aload #5
      //   106: astore_1
      //   107: aload #6
      //   109: ifnull -> 127
      //   112: aload #6
      //   114: ldc 'context'
      //   116: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
      //   119: aload #6
      //   121: ldc 2131952147
      //   123: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
      //   126: astore_1
      //   127: aload #4
      //   129: aload_1
      //   130: invokevirtual setError : (Ljava/lang/CharSequence;)V
      //   133: return
      //   134: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
      //   137: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   140: astore_1
      //   141: iload_3
      //   142: istore_2
      //   143: aload_1
      //   144: ifnull -> 317
      //   147: aload_1
      //   148: invokevirtual H : ()Lu4/a;
      //   151: astore_1
      //   152: iload_3
      //   153: istore_2
      //   154: aload_1
      //   155: ifnull -> 317
      //   158: aload_1
      //   159: invokevirtual W : ()Ljava/util/List;
      //   162: astore #5
      //   164: iload_3
      //   165: istore_2
      //   166: aload #5
      //   168: ifnull -> 317
      //   171: new java/util/ArrayList
      //   174: dup
      //   175: aload #5
      //   177: bipush #10
      //   179: invokestatic s : (Ljava/lang/Iterable;I)I
      //   182: invokespecial <init> : (I)V
      //   185: astore_1
      //   186: aload #5
      //   188: invokeinterface iterator : ()Ljava/util/Iterator;
      //   193: astore #5
      //   195: aload #5
      //   197: invokeinterface hasNext : ()Z
      //   202: ifeq -> 228
      //   205: aload_1
      //   206: aload #5
      //   208: invokeinterface next : ()Ljava/lang/Object;
      //   213: checkcast com/smartpek/data/local/db/models/Device
      //   216: invokevirtual getName : ()Ljava/lang/String;
      //   219: invokeinterface add : (Ljava/lang/Object;)Z
      //   224: pop
      //   225: goto -> 195
      //   228: new java/util/ArrayList
      //   231: dup
      //   232: invokespecial <init> : ()V
      //   235: astore #5
      //   237: aload_1
      //   238: invokeinterface iterator : ()Ljava/util/Iterator;
      //   243: astore #7
      //   245: aload #7
      //   247: invokeinterface hasNext : ()Z
      //   252: ifeq -> 309
      //   255: aload #7
      //   257: invokeinterface next : ()Ljava/lang/Object;
      //   262: astore #8
      //   264: aload #8
      //   266: checkcast java/lang/String
      //   269: astore_1
      //   270: aload_1
      //   271: ifnull -> 282
      //   274: aload_1
      //   275: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
      //   278: astore_1
      //   279: goto -> 284
      //   282: aconst_null
      //   283: astore_1
      //   284: aload_1
      //   285: aload #6
      //   287: invokestatic b : (Ljava/lang/String;)Ljava/lang/String;
      //   290: invokestatic e : (Ljava/lang/Object;Ljava/lang/Object;)Z
      //   293: ifeq -> 245
      //   296: aload #5
      //   298: aload #8
      //   300: invokeinterface add : (Ljava/lang/Object;)Z
      //   305: pop
      //   306: goto -> 245
      //   309: aload #5
      //   311: invokeinterface size : ()I
      //   316: istore_2
      //   317: iload_2
      //   318: ifle -> 381
      //   321: aload_0
      //   322: getfield g : Le6/b;
      //   325: getstatic r4/h.T5 : I
      //   328: invokevirtual J : (I)Landroid/view/View;
      //   331: checkcast com/google/android/material/textfield/TextInputLayout
      //   334: astore #5
      //   336: aload #5
      //   338: ifnonnull -> 342
      //   341: return
      //   342: aload_0
      //   343: getfield g : Le6/b;
      //   346: invokevirtual getContext : ()Landroid/content/Context;
      //   349: astore #6
      //   351: aload #4
      //   353: astore_1
      //   354: aload #6
      //   356: ifnull -> 374
      //   359: aload #6
      //   361: ldc 'context'
      //   363: invokestatic i : (Ljava/lang/Object;Ljava/lang/String;)V
      //   366: aload #6
      //   368: ldc 2131952256
      //   370: invokestatic g : (Landroid/content/Context;I)Ljava/lang/String;
      //   373: astore_1
      //   374: aload #5
      //   376: aload_1
      //   377: invokevirtual setError : (Ljava/lang/CharSequence;)V
      //   380: return
      //   381: aload_0
      //   382: getfield g : Le6/b;
      //   385: astore #5
      //   387: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
      //   390: astore #4
      //   392: aload #4
      //   394: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   397: astore_1
      //   398: aload_1
      //   399: ifnull -> 441
      //   402: aload_1
      //   403: invokevirtual H : ()Lu4/a;
      //   406: astore_1
      //   407: aload_1
      //   408: ifnull -> 441
      //   411: aload_0
      //   412: getfield g : Le6/b;
      //   415: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   418: astore #6
      //   420: aload #6
      //   422: invokestatic g : (Ljava/lang/Object;)V
      //   425: aload_1
      //   426: aload #6
      //   428: invokevirtual getId : ()I
      //   431: invokevirtual z : (I)Ljava/lang/Object;
      //   434: checkcast com/smartpek/data/local/db/models/Device
      //   437: astore_1
      //   438: goto -> 443
      //   441: aconst_null
      //   442: astore_1
      //   443: aload #5
      //   445: aload_1
      //   446: invokestatic O : (Le6/b;Lcom/smartpek/data/local/db/models/Device;)V
      //   449: aload_0
      //   450: getfield g : Le6/b;
      //   453: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   456: astore #5
      //   458: aload #5
      //   460: ifnonnull -> 466
      //   463: goto -> 503
      //   466: aload_0
      //   467: getfield g : Le6/b;
      //   470: getstatic r4/h.C0 : I
      //   473: invokevirtual J : (I)Landroid/view/View;
      //   476: checkcast androidx/appcompat/widget/AppCompatAutoCompleteTextView
      //   479: astore_1
      //   480: aload_1
      //   481: ifnull -> 492
      //   484: aload_1
      //   485: invokevirtual getText : ()Landroid/text/Editable;
      //   488: astore_1
      //   489: goto -> 494
      //   492: aconst_null
      //   493: astore_1
      //   494: aload #5
      //   496: aload_1
      //   497: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
      //   500: invokevirtual setName : (Ljava/lang/String;)V
      //   503: aload #4
      //   505: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   508: astore_1
      //   509: aload_1
      //   510: ifnull -> 545
      //   513: aload_1
      //   514: invokevirtual H : ()Lu4/a;
      //   517: astore_1
      //   518: aload_1
      //   519: ifnull -> 545
      //   522: aload_0
      //   523: getfield g : Le6/b;
      //   526: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   529: astore #4
      //   531: aload #4
      //   533: invokestatic g : (Ljava/lang/Object;)V
      //   536: aload_1
      //   537: aload #4
      //   539: aconst_null
      //   540: iconst_2
      //   541: aconst_null
      //   542: invokestatic M : (Lq7/j;Ljava/lang/Object;Landroidx/lifecycle/Observer;ILjava/lang/Object;)V
      //   545: aload_0
      //   546: getfield g : Le6/b;
      //   549: invokevirtual getActivity : ()Landroidx/fragment/app/e;
      //   552: astore_1
      //   553: aload_1
      //   554: ifnull -> 562
      //   557: aload_1
      //   558: iconst_m1
      //   559: invokevirtual setResult : (I)V
      //   562: aload_0
      //   563: getfield g : Le6/b;
      //   566: getstatic r4/h.T5 : I
      //   569: invokevirtual J : (I)Landroid/view/View;
      //   572: checkcast com/google/android/material/textfield/TextInputLayout
      //   575: astore_1
      //   576: aload_1
      //   577: ifnonnull -> 581
      //   580: return
      //   581: aload_1
      //   582: aconst_null
      //   583: invokevirtual setError : (Ljava/lang/CharSequence;)V
      //   586: return
    }
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
  }
  
  static final class d extends r8.n implements q8.l<View, e8.q> {
    d(b param1b) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      x4.h h = b.K(this.g);
      if (h != null) {
        byte b1;
        AppCompatImageView appCompatImageView = (AppCompatImageView)this.g.J(r4.h.m);
        r8.m.i(appCompatImageView, "btnBackgroundColor");
        Resources resources = this.g.getResources();
        r8.m.i(resources, "resources");
        if (c1.f(resources)) {
          b1 = 3;
        } else {
          b1 = 4;
        } 
        r7.a.k((r7.a)h, (View)appCompatImageView, 3, b1, 0, 0, false, 56, null);
      } 
    }
  }
  
  public static final class e implements AdapterView.OnItemSelectedListener {
    e(b param1b) {}
    
    private static final void d(q8.p param1p, b param1b, a0 param1a0, DialogInterface param1DialogInterface, int param1Int) {
      r8.m.j(param1p, "$action");
      r8.m.j(param1b, "this$0");
      r8.m.j(param1a0, "$dialog");
      Resources resources = param1b.getResources();
      r8.m.i(resources, "resources");
      param1p.invoke(Boolean.valueOf(c1.f(resources)), param1a0.g);
    }
    
    private static final void e(q8.p param1p, b param1b, a0 param1a0, DialogInterface param1DialogInterface, int param1Int) {
      r8.m.j(param1p, "$action");
      r8.m.j(param1b, "this$0");
      r8.m.j(param1a0, "$dialog");
      Resources resources = param1b.getResources();
      r8.m.i(resources, "resources");
      param1p.invoke(Boolean.valueOf(c1.f(resources) ^ true), param1a0.g);
    }
    
    private static final void f(a0 param1a0, DialogInterface param1DialogInterface) {
      r8.m.j(param1a0, "$dialog");
      ((AlertDialog)param1a0.g).getButton(-2).setTextColor(-3355444);
      ((AlertDialog)param1a0.g).getButton(-1).setTextColor(-3355444);
    }
    
    public void onItemSelected(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      TextInputEditText textInputEditText = (TextInputEditText)this.g.J(r4.h.I0);
      param1View = null;
      if (textInputEditText != null) {
        ForceSelectableSpinner forceSelectableSpinner = (ForceSelectableSpinner)this.g.J(r4.h.E5);
        if (forceSelectableSpinner != null) {
          object = forceSelectableSpinner.getSelectedItem();
        } else {
          forceSelectableSpinner = null;
        } 
        textInputEditText.setText((String)forceSelectableSpinner);
      } 
      if (b.M(this.g)) {
        b.Q(this.g, false);
        return;
      } 
      a a = new a(this.g, param1Int);
      if (param1Int == 0) {
        a.invoke(Boolean.TRUE, null);
        return;
      } 
      AlertDialog.Builder builder = new AlertDialog.Builder((Context)this.g.getActivity(), 2132017857);
      a0 a0 = new a0();
      Context context1 = this.g.getContext();
      if (context1 != null) {
        object = c1.g(context1, 2131952136);
      } else {
        context1 = null;
      } 
      builder.setTitle((CharSequence)context1);
      builder.setCancelable(false);
      context1 = this.g.getContext();
      if (context1 != null) {
        object = c1.g(context1, 2131952137);
      } else {
        context1 = null;
      } 
      builder.setMessage((CharSequence)context1);
      context1 = this.g.getContext();
      int i = 2131951683;
      if (context1 != null) {
        Resources resources = this.g.getResources();
        r8.m.i(resources, "resources");
        if (c1.f(resources)) {
          param1Int = 2131951683;
        } else {
          param1Int = 2131951727;
        } 
        object = c1.g(context1, param1Int);
      } else {
        context1 = null;
      } 
      builder.setNegativeButton((CharSequence)context1, new c(a, this.g, a0));
      Context context2 = this.g.getContext();
      View view = param1View;
      if (context2 != null) {
        Resources resources = this.g.getResources();
        r8.m.i(resources, "resources");
        param1Int = i;
        if (c1.f(resources))
          param1Int = 2131951727; 
        object = c1.g(context2, param1Int);
      } 
      builder.setPositiveButton((CharSequence)object, new d(a, this.g, a0));
      Object object = builder.create();
      a0.g = object;
      object.setOnShowListener(new e(a0));
      ((AlertDialog)a0.g).show();
    }
    
    public void onNothingSelected(AdapterView<?> param1AdapterView) {}
    
    static final class a extends r8.n implements q8.p<Boolean, AlertDialog, e8.q> {
      a(b param2b, int param2Int) {
        super(2);
      }
      
      public final void a(boolean param2Boolean, AlertDialog param2AlertDialog) {
        // Byte code:
        //   0: iload_1
        //   1: ifeq -> 331
        //   4: aload_2
        //   5: ifnull -> 19
        //   8: aload_2
        //   9: bipush #-2
        //   11: invokevirtual getButton : (I)Landroid/widget/Button;
        //   14: astore #4
        //   16: goto -> 22
        //   19: aconst_null
        //   20: astore #4
        //   22: aload #4
        //   24: ifnonnull -> 30
        //   27: goto -> 37
        //   30: aload #4
        //   32: bipush #8
        //   34: invokevirtual setVisibility : (I)V
        //   37: aload_2
        //   38: ifnull -> 51
        //   41: aload_2
        //   42: iconst_m1
        //   43: invokevirtual getButton : (I)Landroid/widget/Button;
        //   46: astore #4
        //   48: goto -> 54
        //   51: aconst_null
        //   52: astore #4
        //   54: aload #4
        //   56: ifnonnull -> 62
        //   59: goto -> 69
        //   62: aload #4
        //   64: bipush #8
        //   66: invokevirtual setVisibility : (I)V
        //   69: new e6/b$e$a$d
        //   72: dup
        //   73: aload_0
        //   74: getfield g : Le6/b;
        //   77: aload_0
        //   78: getfield h : I
        //   81: invokespecial <init> : (Le6/b;I)V
        //   84: astore #6
        //   86: new e6/b$e$a$c
        //   89: dup
        //   90: aload_0
        //   91: getfield g : Le6/b;
        //   94: invokespecial <init> : (Le6/b;)V
        //   97: astore #7
        //   99: aload_0
        //   100: getfield g : Le6/b;
        //   103: getstatic r4/h.x4 : I
        //   106: invokevirtual J : (I)Landroid/view/View;
        //   109: checkcast android/widget/ProgressBar
        //   112: astore #4
        //   114: aload #4
        //   116: ifnull -> 128
        //   119: aload #4
        //   121: iconst_0
        //   122: aconst_null
        //   123: iconst_3
        //   124: aconst_null
        //   125: invokestatic h : (Landroid/view/View;ZLq8/a;ILjava/lang/Object;)V
        //   128: new p6/e
        //   131: dup
        //   132: aload_0
        //   133: getfield g : Le6/b;
        //   136: invokevirtual getActivity : ()Landroidx/fragment/app/e;
        //   139: invokespecial <init> : (Landroid/content/Context;)V
        //   142: astore #4
        //   144: aload_0
        //   145: getfield g : Le6/b;
        //   148: invokestatic N : (Le6/b;)Ljava/lang/String;
        //   151: astore #5
        //   153: new java/lang/StringBuilder
        //   156: dup
        //   157: invokespecial <init> : ()V
        //   160: astore #8
        //   162: aload #8
        //   164: aload #5
        //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   169: pop
        //   170: aload #8
        //   172: ldc 'Device?'
        //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   177: pop
        //   178: aload #4
        //   180: aload #8
        //   182: invokevirtual toString : ()Ljava/lang/String;
        //   185: invokevirtual m : (Ljava/lang/String;)Lp6/e;
        //   188: astore #8
        //   190: aload_0
        //   191: getfield g : Le6/b;
        //   194: astore #4
        //   196: aload_0
        //   197: getfield h : I
        //   200: istore_3
        //   201: aload #8
        //   203: ldc 'CMD'
        //   205: ldc '2'
        //   207: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
        //   210: pop
        //   211: aload #8
        //   213: ldc 'action'
        //   215: ldc 'base'
        //   217: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
        //   220: pop
        //   221: aload #4
        //   223: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
        //   226: astore #4
        //   228: aload #4
        //   230: invokestatic g : (Ljava/lang/Object;)V
        //   233: aload #4
        //   235: invokevirtual getPassword : ()Ljava/lang/String;
        //   238: astore #4
        //   240: aload #4
        //   242: ifnull -> 264
        //   245: aload #4
        //   247: invokestatic S0 : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
        //   250: invokevirtual toString : ()Ljava/lang/String;
        //   253: astore #5
        //   255: aload #5
        //   257: astore #4
        //   259: aload #5
        //   261: ifnonnull -> 268
        //   264: ldc '123456789'
        //   266: astore #4
        //   268: aload #8
        //   270: ldc 'pass'
        //   272: aload #4
        //   274: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
        //   277: pop
        //   278: aload #8
        //   280: ldc 'type'
        //   282: iload_3
        //   283: bipush #11
        //   285: iadd
        //   286: invokestatic valueOf : (I)Ljava/lang/String;
        //   289: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
        //   292: pop
        //   293: aload #8
        //   295: new e6/b$e$a$a
        //   298: dup
        //   299: aload #6
        //   301: aload_0
        //   302: getfield g : Le6/b;
        //   305: aload #7
        //   307: aload_2
        //   308: aload #8
        //   310: aload_0
        //   311: getfield h : I
        //   314: invokespecial <init> : (Lq8/a;Le6/b;Lq8/l;Landroid/app/AlertDialog;Lp6/e;I)V
        //   317: new e6/b$e$a$b
        //   320: dup
        //   321: aload #7
        //   323: aload_2
        //   324: invokespecial <init> : (Lq8/l;Landroid/app/AlertDialog;)V
        //   327: invokevirtual i : (Lq8/l;Lq8/l;)V
        //   330: return
        //   331: aload_0
        //   332: getfield g : Le6/b;
        //   335: iconst_1
        //   336: invokestatic Q : (Le6/b;Z)V
        //   339: aload_0
        //   340: getfield g : Le6/b;
        //   343: getstatic r4/h.E5 : I
        //   346: invokevirtual J : (I)Landroid/view/View;
        //   349: checkcast ir/am3n/needtool/views/ForceSelectableSpinner
        //   352: astore #4
        //   354: aload #4
        //   356: ifnull -> 365
        //   359: aload #4
        //   361: iconst_0
        //   362: invokevirtual setSelection : (I)V
        //   365: aload_0
        //   366: getfield g : Le6/b;
        //   369: getstatic r4/h.x4 : I
        //   372: invokevirtual J : (I)Landroid/view/View;
        //   375: checkcast android/widget/ProgressBar
        //   378: astore #4
        //   380: aload #4
        //   382: ifnull -> 394
        //   385: aload #4
        //   387: iconst_0
        //   388: iconst_0
        //   389: iconst_3
        //   390: aconst_null
        //   391: invokestatic d : (Landroid/view/View;ZZILjava/lang/Object;)V
        //   394: aload_2
        //   395: ifnull -> 402
        //   398: aload_2
        //   399: invokevirtual dismiss : ()V
        //   402: return
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(q8.a<e8.q> param3a, b param3b, q8.l<? super Integer, e8.q> param3l, AlertDialog param3AlertDialog, p6.e param3e, int param3Int) {
          super(1);
        }
        
        public final void a(String param3String) {
          r8.m.j(param3String, "response");
          try {
            if (z8.m.N(param3String, "ok", false, 2, null)) {
              this.g.invoke();
            } else if (z8.m.N(param3String, "Wrong_pass", false, 2, null)) {
              v1.m(this.h, 2131951947, 0, null, 6, null);
              x5.d d = x5.d.j.a(b.L(this.h), new a(this.i, this.k, this.h, this.l, this.g));
              androidx.fragment.app.m m = this.h.getParentFragmentManager();
              r8.m.i(m, "parentFragmentManager");
              d.show(m, "AuthDeviceDialog");
            } else {
              this.i.invoke(Integer.valueOf(2131952122));
            } 
            AlertDialog alertDialog = this.j;
          } finally {
            param3String = null;
          } 
        }
        
        static final class a extends r8.n implements q8.l<String, e8.q> {
          a(q8.l<? super Integer, e8.q> param4l, p6.e param4e, b param4b, int param4Int, q8.a<e8.q> param4a) {
            super(1);
          }
          
          public final void a(String param4String) {
            if (param4String == null) {
              this.g.invoke(Integer.valueOf(2131952131));
              return;
            } 
            this.h.h("pass", param4String);
            this.h.i(new a(this.i, this.j, this.k, this.g, param4String), new b(this.g));
          }
          
          static final class a extends r8.n implements q8.l<String, e8.q> {
            a(b param5b, int param5Int, q8.a<e8.q> param5a, q8.l<? super Integer, e8.q> param5l, String param5String) {
              super(1);
            }
            
            public final void a(String param5String) {
              r8.m.j(param5String, "response");
              ForceSelectableSpinner forceSelectableSpinner = null;
              try {
                u4.a a1;
                if (z8.m.N(param5String, "ok", false, 2, null)) {
                  b.Q(this.g, true);
                  ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
                  if (forceSelectableSpinner1 != null)
                    forceSelectableSpinner1.setSelection(this.h); 
                  App.a a2 = App.g;
                  DB dB2 = a2.e();
                  forceSelectableSpinner1 = forceSelectableSpinner;
                  if (dB2 != null) {
                    u4.a a3 = dB2.H();
                    forceSelectableSpinner1 = forceSelectableSpinner;
                    if (a3 != null) {
                      device = b.L(this.g);
                      r8.m.g(device);
                      device = (Device)a3.z(device.getId());
                    } 
                  } 
                  b b1 = this.g;
                  String str = this.k;
                  b.O(b1, device);
                  Device device = b.L(b1);
                  if (device != null)
                    device.setPassword(str); 
                  DB dB1 = a2.e();
                  return;
                } 
                return;
              } finally {
                param5String = null;
                this.j.invoke(Integer.valueOf(2131952122));
              } 
            }
          }
          
          static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
            b(q8.l<? super Integer, e8.q> param5l) {
              super(1);
            }
            
            public final void a(VolleyError param5VolleyError) {
              r8.m.j(param5VolleyError, "it");
              this.g.invoke(Integer.valueOf(2131952122));
            }
          }
        }
        
        static final class a extends r8.n implements q8.l<String, e8.q> {
          a(b param4b, int param4Int, q8.a<e8.q> param4a, q8.l<? super Integer, e8.q> param4l, String param4String) {
            super(1);
          }
          
          public final void a(String param4String) {
            r8.m.j(param4String, "response");
            ForceSelectableSpinner forceSelectableSpinner = null;
            try {
              u4.a a1;
              if (z8.m.N(param4String, "ok", false, 2, null)) {
                b.Q(this.g, true);
                ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
                if (forceSelectableSpinner1 != null)
                  forceSelectableSpinner1.setSelection(this.h); 
                App.a a2 = App.g;
                DB dB2 = a2.e();
                forceSelectableSpinner1 = forceSelectableSpinner;
                if (dB2 != null) {
                  u4.a a3 = dB2.H();
                  forceSelectableSpinner1 = forceSelectableSpinner;
                  if (a3 != null) {
                    device = b.L(this.g);
                    r8.m.g(device);
                    device = (Device)a3.z(device.getId());
                  } 
                } 
                b b1 = this.g;
                String str = this.k;
                b.O(b1, device);
                Device device = b.L(b1);
                if (device != null)
                  device.setPassword(str); 
                DB dB1 = a2.e();
                return;
              } 
              return;
            } finally {
              param4String = null;
              this.j.invoke(Integer.valueOf(2131952122));
            } 
          }
        }
        
        static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
          b(q8.l<? super Integer, e8.q> param4l) {
            super(1);
          }
          
          public final void a(VolleyError param4VolleyError) {
            r8.m.j(param4VolleyError, "it");
            this.g.invoke(Integer.valueOf(2131952122));
          }
        }
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(q8.l<? super Integer, e8.q> param3l, p6.e param3e, b param3b, int param3Int, q8.a<e8.q> param3a) {
          super(1);
        }
        
        public final void a(String param3String) {
          if (param3String == null) {
            this.g.invoke(Integer.valueOf(2131952131));
            return;
          } 
          this.h.h("pass", param3String);
          this.h.i(new a(this.i, this.j, this.k, this.g, param3String), new b(this.g));
        }
        
        static final class a extends r8.n implements q8.l<String, e8.q> {
          a(b param5b, int param5Int, q8.a<e8.q> param5a, q8.l<? super Integer, e8.q> param5l, String param5String) {
            super(1);
          }
          
          public final void a(String param5String) {
            r8.m.j(param5String, "response");
            ForceSelectableSpinner forceSelectableSpinner = null;
            try {
              u4.a a1;
              if (z8.m.N(param5String, "ok", false, 2, null)) {
                b.Q(this.g, true);
                ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
                if (forceSelectableSpinner1 != null)
                  forceSelectableSpinner1.setSelection(this.h); 
                App.a a2 = App.g;
                DB dB2 = a2.e();
                forceSelectableSpinner1 = forceSelectableSpinner;
                if (dB2 != null) {
                  u4.a a3 = dB2.H();
                  forceSelectableSpinner1 = forceSelectableSpinner;
                  if (a3 != null) {
                    device = b.L(this.g);
                    r8.m.g(device);
                    device = (Device)a3.z(device.getId());
                  } 
                } 
                b b1 = this.g;
                String str = this.k;
                b.O(b1, device);
                Device device = b.L(b1);
                if (device != null)
                  device.setPassword(str); 
                DB dB1 = a2.e();
                return;
              } 
              return;
            } finally {
              param5String = null;
              this.j.invoke(Integer.valueOf(2131952122));
            } 
          }
        }
        
        static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
          b(q8.l<? super Integer, e8.q> param5l) {
            super(1);
          }
          
          public final void a(VolleyError param5VolleyError) {
            r8.m.j(param5VolleyError, "it");
            this.g.invoke(Integer.valueOf(2131952122));
          }
        }
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(b param3b, int param3Int, q8.a<e8.q> param3a, q8.l<? super Integer, e8.q> param3l, String param3String) {
          super(1);
        }
        
        public final void a(String param3String) {
          r8.m.j(param3String, "response");
          ForceSelectableSpinner forceSelectableSpinner = null;
          try {
            u4.a a1;
            if (z8.m.N(param3String, "ok", false, 2, null)) {
              b.Q(this.g, true);
              ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
              if (forceSelectableSpinner1 != null)
                forceSelectableSpinner1.setSelection(this.h); 
              App.a a2 = App.g;
              DB dB2 = a2.e();
              forceSelectableSpinner1 = forceSelectableSpinner;
              if (dB2 != null) {
                u4.a a3 = dB2.H();
                forceSelectableSpinner1 = forceSelectableSpinner;
                if (a3 != null) {
                  device = b.L(this.g);
                  r8.m.g(device);
                  device = (Device)a3.z(device.getId());
                } 
              } 
              b b1 = this.g;
              String str = this.k;
              b.O(b1, device);
              Device device = b.L(b1);
              if (device != null)
                device.setPassword(str); 
              DB dB1 = a2.e();
              return;
            } 
            return;
          } finally {
            param3String = null;
            this.j.invoke(Integer.valueOf(2131952122));
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.l<? super Integer, e8.q> param3l) {
          super(1);
        }
        
        public final void a(VolleyError param3VolleyError) {
          r8.m.j(param3VolleyError, "it");
          this.g.invoke(Integer.valueOf(2131952122));
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.l<? super Integer, e8.q> param3l, AlertDialog param3AlertDialog) {
          super(1);
        }
        
        public final void a(VolleyError param3VolleyError) {
          r8.m.j(param3VolleyError, "it");
          try {
            this.g.invoke(Integer.valueOf(2131952122));
            AlertDialog alertDialog = this.h;
            return;
          } finally {
            param3VolleyError = null;
          } 
        }
      }
      
      static final class c extends r8.n implements q8.l<Integer, e8.q> {
        c(b param3b) {
          super(1);
        }
        
        public final void a(int param3Int) {
          // Byte code:
          //   0: aload_0
          //   1: getfield g : Le6/b;
          //   4: iconst_1
          //   5: invokestatic Q : (Le6/b;Z)V
          //   8: aload_0
          //   9: getfield g : Le6/b;
          //   12: getstatic r4/h.E5 : I
          //   15: invokevirtual J : (I)Landroid/view/View;
          //   18: checkcast ir/am3n/needtool/views/ForceSelectableSpinner
          //   21: astore_3
          //   22: aload_3
          //   23: ifnull -> 66
          //   26: aload_0
          //   27: getfield g : Le6/b;
          //   30: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
          //   33: astore #4
          //   35: aload #4
          //   37: ifnull -> 108
          //   40: aload #4
          //   42: invokevirtual getCtrlType : ()Ljava/lang/Integer;
          //   45: astore #4
          //   47: aload #4
          //   49: ifnull -> 108
          //   52: aload #4
          //   54: invokevirtual intValue : ()I
          //   57: istore_2
          //   58: goto -> 61
          //   61: aload_3
          //   62: iload_2
          //   63: invokevirtual setSelection : (I)V
          //   66: aload_0
          //   67: getfield g : Le6/b;
          //   70: getstatic r4/h.x4 : I
          //   73: invokevirtual J : (I)Landroid/view/View;
          //   76: checkcast android/widget/ProgressBar
          //   79: astore_3
          //   80: aload_3
          //   81: ifnull -> 92
          //   84: aload_3
          //   85: iconst_0
          //   86: iconst_0
          //   87: iconst_3
          //   88: aconst_null
          //   89: invokestatic d : (Landroid/view/View;ZZILjava/lang/Object;)V
          //   92: aload_0
          //   93: getfield g : Le6/b;
          //   96: iload_1
          //   97: iconst_0
          //   98: aconst_null
          //   99: bipush #6
          //   101: aconst_null
          //   102: invokestatic m : (Landroidx/fragment/app/Fragment;IILjava/lang/Integer;ILjava/lang/Object;)V
          //   105: return
          //   106: astore_3
          //   107: return
          //   108: iconst_0
          //   109: istore_2
          //   110: goto -> 61
          // Exception table:
          //   from	to	target	type
          //   0	22	106	finally
          //   26	35	106	finally
          //   40	47	106	finally
          //   52	58	106	finally
          //   61	66	106	finally
          //   66	80	106	finally
          //   84	92	106	finally
          //   92	105	106	finally
        }
      }
      
      static final class d extends r8.n implements q8.a<e8.q> {
        d(b param3b, int param3Int) {
          super(0);
        }
        
        public final e8.q a() {
          // Byte code:
          //   0: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
          //   3: astore #4
          //   5: aload #4
          //   7: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
          //   10: astore_2
          //   11: aconst_null
          //   12: astore_3
          //   13: aload_2
          //   14: ifnull -> 210
          //   17: aload_2
          //   18: invokevirtual H : ()Lu4/a;
          //   21: astore_2
          //   22: aload_2
          //   23: ifnull -> 210
          //   26: aload_0
          //   27: getfield g : Le6/b;
          //   30: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
          //   33: astore #5
          //   35: aload #5
          //   37: invokestatic g : (Ljava/lang/Object;)V
          //   40: aload_2
          //   41: aload #5
          //   43: invokevirtual getId : ()I
          //   46: invokevirtual z : (I)Ljava/lang/Object;
          //   49: checkcast com/smartpek/data/local/db/models/Device
          //   52: astore_2
          //   53: goto -> 56
          //   56: aload_0
          //   57: getfield g : Le6/b;
          //   60: astore #5
          //   62: aload_0
          //   63: getfield h : I
          //   66: istore_1
          //   67: aload #5
          //   69: aload_2
          //   70: invokestatic O : (Le6/b;Lcom/smartpek/data/local/db/models/Device;)V
          //   73: aload #5
          //   75: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
          //   78: astore_2
          //   79: aload_2
          //   80: ifnonnull -> 86
          //   83: goto -> 94
          //   86: aload_2
          //   87: iload_1
          //   88: invokestatic valueOf : (I)Ljava/lang/Integer;
          //   91: invokevirtual setCtrlType : (Ljava/lang/Integer;)V
          //   94: aload #4
          //   96: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
          //   99: astore_2
          //   100: aload_2
          //   101: ifnull -> 132
          //   104: aload_2
          //   105: invokevirtual H : ()Lu4/a;
          //   108: astore_2
          //   109: aload_2
          //   110: ifnull -> 132
          //   113: aload #5
          //   115: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
          //   118: astore #4
          //   120: aload #4
          //   122: invokestatic g : (Ljava/lang/Object;)V
          //   125: aload_2
          //   126: aload #4
          //   128: invokevirtual O : (Ljava/lang/Object;)Ljava/lang/Integer;
          //   131: pop
          //   132: aload_0
          //   133: getfield g : Le6/b;
          //   136: getstatic r4/h.x4 : I
          //   139: invokevirtual J : (I)Landroid/view/View;
          //   142: checkcast android/widget/ProgressBar
          //   145: astore_2
          //   146: aload_2
          //   147: ifnull -> 158
          //   150: aload_2
          //   151: iconst_0
          //   152: iconst_0
          //   153: iconst_3
          //   154: aconst_null
          //   155: invokestatic d : (Landroid/view/View;ZZILjava/lang/Object;)V
          //   158: aload_0
          //   159: getfield g : Le6/b;
          //   162: ldc 2131951853
          //   164: iconst_0
          //   165: aconst_null
          //   166: bipush #6
          //   168: aconst_null
          //   169: invokestatic m : (Landroidx/fragment/app/Fragment;IILjava/lang/Integer;ILjava/lang/Object;)V
          //   172: aload_0
          //   173: getfield g : Le6/b;
          //   176: invokevirtual getActivity : ()Landroidx/fragment/app/e;
          //   179: astore #4
          //   181: aload_3
          //   182: astore_2
          //   183: aload #4
          //   185: ifnull -> 204
          //   188: aload #4
          //   190: iconst_m1
          //   191: invokevirtual setResult : (I)V
          //   194: getstatic e8/q.a : Le8/q;
          //   197: astore_2
          //   198: aload_2
          //   199: areturn
          //   200: getstatic e8/q.a : Le8/q;
          //   203: astore_2
          //   204: aload_2
          //   205: areturn
          //   206: astore_2
          //   207: goto -> 200
          //   210: aconst_null
          //   211: astore_2
          //   212: goto -> 56
          // Exception table:
          //   from	to	target	type
          //   0	11	206	finally
          //   17	22	206	finally
          //   26	53	206	finally
          //   56	79	206	finally
          //   86	94	206	finally
          //   94	100	206	finally
          //   104	109	206	finally
          //   113	132	206	finally
          //   132	146	206	finally
          //   150	158	206	finally
          //   158	181	206	finally
          //   188	198	206	finally
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(q8.a<e8.q> param2a, b param2b, q8.l<? super Integer, e8.q> param2l, AlertDialog param2AlertDialog, p6.e param2e, int param2Int) {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "response");
        try {
          if (z8.m.N(param2String, "ok", false, 2, null)) {
            this.g.invoke();
          } else if (z8.m.N(param2String, "Wrong_pass", false, 2, null)) {
            v1.m(this.h, 2131951947, 0, null, 6, null);
            x5.d d = x5.d.j.a(b.L(this.h), new a(this.i, this.k, this.h, this.l, this.g));
            androidx.fragment.app.m m = this.h.getParentFragmentManager();
            r8.m.i(m, "parentFragmentManager");
            d.show(m, "AuthDeviceDialog");
          } else {
            this.i.invoke(Integer.valueOf(2131952122));
          } 
          AlertDialog alertDialog = this.j;
        } finally {
          param2String = null;
        } 
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(q8.l<? super Integer, e8.q> param4l, p6.e param4e, b param4b, int param4Int, q8.a<e8.q> param4a) {
          super(1);
        }
        
        public final void a(String param4String) {
          if (param4String == null) {
            this.g.invoke(Integer.valueOf(2131952131));
            return;
          } 
          this.h.h("pass", param4String);
          this.h.i(new a(this.i, this.j, this.k, this.g, param4String), new b(this.g));
        }
        
        static final class a extends r8.n implements q8.l<String, e8.q> {
          a(b param5b, int param5Int, q8.a<e8.q> param5a, q8.l<? super Integer, e8.q> param5l, String param5String) {
            super(1);
          }
          
          public final void a(String param5String) {
            r8.m.j(param5String, "response");
            ForceSelectableSpinner forceSelectableSpinner = null;
            try {
              u4.a a1;
              if (z8.m.N(param5String, "ok", false, 2, null)) {
                b.Q(this.g, true);
                ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
                if (forceSelectableSpinner1 != null)
                  forceSelectableSpinner1.setSelection(this.h); 
                App.a a2 = App.g;
                DB dB2 = a2.e();
                forceSelectableSpinner1 = forceSelectableSpinner;
                if (dB2 != null) {
                  u4.a a3 = dB2.H();
                  forceSelectableSpinner1 = forceSelectableSpinner;
                  if (a3 != null) {
                    device = b.L(this.g);
                    r8.m.g(device);
                    device = (Device)a3.z(device.getId());
                  } 
                } 
                b b1 = this.g;
                String str = this.k;
                b.O(b1, device);
                Device device = b.L(b1);
                if (device != null)
                  device.setPassword(str); 
                DB dB1 = a2.e();
                return;
              } 
              return;
            } finally {
              param5String = null;
              this.j.invoke(Integer.valueOf(2131952122));
            } 
          }
        }
        
        static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
          b(q8.l<? super Integer, e8.q> param5l) {
            super(1);
          }
          
          public final void a(VolleyError param5VolleyError) {
            r8.m.j(param5VolleyError, "it");
            this.g.invoke(Integer.valueOf(2131952122));
          }
        }
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(b param4b, int param4Int, q8.a<e8.q> param4a, q8.l<? super Integer, e8.q> param4l, String param4String) {
          super(1);
        }
        
        public final void a(String param4String) {
          r8.m.j(param4String, "response");
          ForceSelectableSpinner forceSelectableSpinner = null;
          try {
            u4.a a1;
            if (z8.m.N(param4String, "ok", false, 2, null)) {
              b.Q(this.g, true);
              ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
              if (forceSelectableSpinner1 != null)
                forceSelectableSpinner1.setSelection(this.h); 
              App.a a2 = App.g;
              DB dB2 = a2.e();
              forceSelectableSpinner1 = forceSelectableSpinner;
              if (dB2 != null) {
                u4.a a3 = dB2.H();
                forceSelectableSpinner1 = forceSelectableSpinner;
                if (a3 != null) {
                  device = b.L(this.g);
                  r8.m.g(device);
                  device = (Device)a3.z(device.getId());
                } 
              } 
              b b1 = this.g;
              String str = this.k;
              b.O(b1, device);
              Device device = b.L(b1);
              if (device != null)
                device.setPassword(str); 
              DB dB1 = a2.e();
              return;
            } 
            return;
          } finally {
            param4String = null;
            this.j.invoke(Integer.valueOf(2131952122));
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.l<? super Integer, e8.q> param4l) {
          super(1);
        }
        
        public final void a(VolleyError param4VolleyError) {
          r8.m.j(param4VolleyError, "it");
          this.g.invoke(Integer.valueOf(2131952122));
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(q8.l<? super Integer, e8.q> param2l, p6.e param2e, b param2b, int param2Int, q8.a<e8.q> param2a) {
        super(1);
      }
      
      public final void a(String param2String) {
        if (param2String == null) {
          this.g.invoke(Integer.valueOf(2131952131));
          return;
        } 
        this.h.h("pass", param2String);
        this.h.i(new a(this.i, this.j, this.k, this.g, param2String), new b(this.g));
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(b param5b, int param5Int, q8.a<e8.q> param5a, q8.l<? super Integer, e8.q> param5l, String param5String) {
          super(1);
        }
        
        public final void a(String param5String) {
          r8.m.j(param5String, "response");
          ForceSelectableSpinner forceSelectableSpinner = null;
          try {
            u4.a a1;
            if (z8.m.N(param5String, "ok", false, 2, null)) {
              b.Q(this.g, true);
              ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
              if (forceSelectableSpinner1 != null)
                forceSelectableSpinner1.setSelection(this.h); 
              App.a a2 = App.g;
              DB dB2 = a2.e();
              forceSelectableSpinner1 = forceSelectableSpinner;
              if (dB2 != null) {
                u4.a a3 = dB2.H();
                forceSelectableSpinner1 = forceSelectableSpinner;
                if (a3 != null) {
                  device = b.L(this.g);
                  r8.m.g(device);
                  device = (Device)a3.z(device.getId());
                } 
              } 
              b b1 = this.g;
              String str = this.k;
              b.O(b1, device);
              Device device = b.L(b1);
              if (device != null)
                device.setPassword(str); 
              DB dB1 = a2.e();
              return;
            } 
            return;
          } finally {
            param5String = null;
            this.j.invoke(Integer.valueOf(2131952122));
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.l<? super Integer, e8.q> param5l) {
          super(1);
        }
        
        public final void a(VolleyError param5VolleyError) {
          r8.m.j(param5VolleyError, "it");
          this.g.invoke(Integer.valueOf(2131952122));
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(b param2b, int param2Int, q8.a<e8.q> param2a, q8.l<? super Integer, e8.q> param2l, String param2String) {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "response");
        ForceSelectableSpinner forceSelectableSpinner = null;
        try {
          u4.a a1;
          if (z8.m.N(param2String, "ok", false, 2, null)) {
            b.Q(this.g, true);
            ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
            if (forceSelectableSpinner1 != null)
              forceSelectableSpinner1.setSelection(this.h); 
            App.a a2 = App.g;
            DB dB2 = a2.e();
            forceSelectableSpinner1 = forceSelectableSpinner;
            if (dB2 != null) {
              u4.a a3 = dB2.H();
              forceSelectableSpinner1 = forceSelectableSpinner;
              if (a3 != null) {
                device = b.L(this.g);
                r8.m.g(device);
                device = (Device)a3.z(device.getId());
              } 
            } 
            b b1 = this.g;
            String str = this.k;
            b.O(b1, device);
            Device device = b.L(b1);
            if (device != null)
              device.setPassword(str); 
            DB dB1 = a2.e();
            return;
          } 
          return;
        } finally {
          param2String = null;
          this.j.invoke(Integer.valueOf(2131952122));
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.l<? super Integer, e8.q> param2l) {
        super(1);
      }
      
      public final void a(VolleyError param2VolleyError) {
        r8.m.j(param2VolleyError, "it");
        this.g.invoke(Integer.valueOf(2131952122));
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.l<? super Integer, e8.q> param2l, AlertDialog param2AlertDialog) {
        super(1);
      }
      
      public final void a(VolleyError param2VolleyError) {
        r8.m.j(param2VolleyError, "it");
        try {
          this.g.invoke(Integer.valueOf(2131952122));
          AlertDialog alertDialog = this.h;
          return;
        } finally {
          param2VolleyError = null;
        } 
      }
    }
    
    static final class c extends r8.n implements q8.l<Integer, e8.q> {
      c(b param2b) {
        super(1);
      }
      
      public final void a(int param2Int) {
        // Byte code:
        //   0: aload_0
        //   1: getfield g : Le6/b;
        //   4: iconst_1
        //   5: invokestatic Q : (Le6/b;Z)V
        //   8: aload_0
        //   9: getfield g : Le6/b;
        //   12: getstatic r4/h.E5 : I
        //   15: invokevirtual J : (I)Landroid/view/View;
        //   18: checkcast ir/am3n/needtool/views/ForceSelectableSpinner
        //   21: astore_3
        //   22: aload_3
        //   23: ifnull -> 66
        //   26: aload_0
        //   27: getfield g : Le6/b;
        //   30: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
        //   33: astore #4
        //   35: aload #4
        //   37: ifnull -> 108
        //   40: aload #4
        //   42: invokevirtual getCtrlType : ()Ljava/lang/Integer;
        //   45: astore #4
        //   47: aload #4
        //   49: ifnull -> 108
        //   52: aload #4
        //   54: invokevirtual intValue : ()I
        //   57: istore_2
        //   58: goto -> 61
        //   61: aload_3
        //   62: iload_2
        //   63: invokevirtual setSelection : (I)V
        //   66: aload_0
        //   67: getfield g : Le6/b;
        //   70: getstatic r4/h.x4 : I
        //   73: invokevirtual J : (I)Landroid/view/View;
        //   76: checkcast android/widget/ProgressBar
        //   79: astore_3
        //   80: aload_3
        //   81: ifnull -> 92
        //   84: aload_3
        //   85: iconst_0
        //   86: iconst_0
        //   87: iconst_3
        //   88: aconst_null
        //   89: invokestatic d : (Landroid/view/View;ZZILjava/lang/Object;)V
        //   92: aload_0
        //   93: getfield g : Le6/b;
        //   96: iload_1
        //   97: iconst_0
        //   98: aconst_null
        //   99: bipush #6
        //   101: aconst_null
        //   102: invokestatic m : (Landroidx/fragment/app/Fragment;IILjava/lang/Integer;ILjava/lang/Object;)V
        //   105: return
        //   106: astore_3
        //   107: return
        //   108: iconst_0
        //   109: istore_2
        //   110: goto -> 61
        // Exception table:
        //   from	to	target	type
        //   0	22	106	finally
        //   26	35	106	finally
        //   40	47	106	finally
        //   52	58	106	finally
        //   61	66	106	finally
        //   66	80	106	finally
        //   84	92	106	finally
        //   92	105	106	finally
      }
    }
    
    static final class d extends r8.n implements q8.a<e8.q> {
      d(b param2b, int param2Int) {
        super(0);
      }
      
      public final e8.q a() {
        // Byte code:
        //   0: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
        //   3: astore #4
        //   5: aload #4
        //   7: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
        //   10: astore_2
        //   11: aconst_null
        //   12: astore_3
        //   13: aload_2
        //   14: ifnull -> 210
        //   17: aload_2
        //   18: invokevirtual H : ()Lu4/a;
        //   21: astore_2
        //   22: aload_2
        //   23: ifnull -> 210
        //   26: aload_0
        //   27: getfield g : Le6/b;
        //   30: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
        //   33: astore #5
        //   35: aload #5
        //   37: invokestatic g : (Ljava/lang/Object;)V
        //   40: aload_2
        //   41: aload #5
        //   43: invokevirtual getId : ()I
        //   46: invokevirtual z : (I)Ljava/lang/Object;
        //   49: checkcast com/smartpek/data/local/db/models/Device
        //   52: astore_2
        //   53: goto -> 56
        //   56: aload_0
        //   57: getfield g : Le6/b;
        //   60: astore #5
        //   62: aload_0
        //   63: getfield h : I
        //   66: istore_1
        //   67: aload #5
        //   69: aload_2
        //   70: invokestatic O : (Le6/b;Lcom/smartpek/data/local/db/models/Device;)V
        //   73: aload #5
        //   75: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
        //   78: astore_2
        //   79: aload_2
        //   80: ifnonnull -> 86
        //   83: goto -> 94
        //   86: aload_2
        //   87: iload_1
        //   88: invokestatic valueOf : (I)Ljava/lang/Integer;
        //   91: invokevirtual setCtrlType : (Ljava/lang/Integer;)V
        //   94: aload #4
        //   96: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
        //   99: astore_2
        //   100: aload_2
        //   101: ifnull -> 132
        //   104: aload_2
        //   105: invokevirtual H : ()Lu4/a;
        //   108: astore_2
        //   109: aload_2
        //   110: ifnull -> 132
        //   113: aload #5
        //   115: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
        //   118: astore #4
        //   120: aload #4
        //   122: invokestatic g : (Ljava/lang/Object;)V
        //   125: aload_2
        //   126: aload #4
        //   128: invokevirtual O : (Ljava/lang/Object;)Ljava/lang/Integer;
        //   131: pop
        //   132: aload_0
        //   133: getfield g : Le6/b;
        //   136: getstatic r4/h.x4 : I
        //   139: invokevirtual J : (I)Landroid/view/View;
        //   142: checkcast android/widget/ProgressBar
        //   145: astore_2
        //   146: aload_2
        //   147: ifnull -> 158
        //   150: aload_2
        //   151: iconst_0
        //   152: iconst_0
        //   153: iconst_3
        //   154: aconst_null
        //   155: invokestatic d : (Landroid/view/View;ZZILjava/lang/Object;)V
        //   158: aload_0
        //   159: getfield g : Le6/b;
        //   162: ldc 2131951853
        //   164: iconst_0
        //   165: aconst_null
        //   166: bipush #6
        //   168: aconst_null
        //   169: invokestatic m : (Landroidx/fragment/app/Fragment;IILjava/lang/Integer;ILjava/lang/Object;)V
        //   172: aload_0
        //   173: getfield g : Le6/b;
        //   176: invokevirtual getActivity : ()Landroidx/fragment/app/e;
        //   179: astore #4
        //   181: aload_3
        //   182: astore_2
        //   183: aload #4
        //   185: ifnull -> 204
        //   188: aload #4
        //   190: iconst_m1
        //   191: invokevirtual setResult : (I)V
        //   194: getstatic e8/q.a : Le8/q;
        //   197: astore_2
        //   198: aload_2
        //   199: areturn
        //   200: getstatic e8/q.a : Le8/q;
        //   203: astore_2
        //   204: aload_2
        //   205: areturn
        //   206: astore_2
        //   207: goto -> 200
        //   210: aconst_null
        //   211: astore_2
        //   212: goto -> 56
        // Exception table:
        //   from	to	target	type
        //   0	11	206	finally
        //   17	22	206	finally
        //   26	53	206	finally
        //   56	79	206	finally
        //   86	94	206	finally
        //   94	100	206	finally
        //   104	109	206	finally
        //   113	132	206	finally
        //   132	146	206	finally
        //   150	158	206	finally
        //   158	181	206	finally
        //   188	198	206	finally
      }
    }
  }
  
  static final class a extends r8.n implements q8.p<Boolean, AlertDialog, e8.q> {
    a(b param1b, int param1Int) {
      super(2);
    }
    
    public final void a(boolean param1Boolean, AlertDialog param1AlertDialog) {
      // Byte code:
      //   0: iload_1
      //   1: ifeq -> 331
      //   4: aload_2
      //   5: ifnull -> 19
      //   8: aload_2
      //   9: bipush #-2
      //   11: invokevirtual getButton : (I)Landroid/widget/Button;
      //   14: astore #4
      //   16: goto -> 22
      //   19: aconst_null
      //   20: astore #4
      //   22: aload #4
      //   24: ifnonnull -> 30
      //   27: goto -> 37
      //   30: aload #4
      //   32: bipush #8
      //   34: invokevirtual setVisibility : (I)V
      //   37: aload_2
      //   38: ifnull -> 51
      //   41: aload_2
      //   42: iconst_m1
      //   43: invokevirtual getButton : (I)Landroid/widget/Button;
      //   46: astore #4
      //   48: goto -> 54
      //   51: aconst_null
      //   52: astore #4
      //   54: aload #4
      //   56: ifnonnull -> 62
      //   59: goto -> 69
      //   62: aload #4
      //   64: bipush #8
      //   66: invokevirtual setVisibility : (I)V
      //   69: new e6/b$e$a$d
      //   72: dup
      //   73: aload_0
      //   74: getfield g : Le6/b;
      //   77: aload_0
      //   78: getfield h : I
      //   81: invokespecial <init> : (Le6/b;I)V
      //   84: astore #6
      //   86: new e6/b$e$a$c
      //   89: dup
      //   90: aload_0
      //   91: getfield g : Le6/b;
      //   94: invokespecial <init> : (Le6/b;)V
      //   97: astore #7
      //   99: aload_0
      //   100: getfield g : Le6/b;
      //   103: getstatic r4/h.x4 : I
      //   106: invokevirtual J : (I)Landroid/view/View;
      //   109: checkcast android/widget/ProgressBar
      //   112: astore #4
      //   114: aload #4
      //   116: ifnull -> 128
      //   119: aload #4
      //   121: iconst_0
      //   122: aconst_null
      //   123: iconst_3
      //   124: aconst_null
      //   125: invokestatic h : (Landroid/view/View;ZLq8/a;ILjava/lang/Object;)V
      //   128: new p6/e
      //   131: dup
      //   132: aload_0
      //   133: getfield g : Le6/b;
      //   136: invokevirtual getActivity : ()Landroidx/fragment/app/e;
      //   139: invokespecial <init> : (Landroid/content/Context;)V
      //   142: astore #4
      //   144: aload_0
      //   145: getfield g : Le6/b;
      //   148: invokestatic N : (Le6/b;)Ljava/lang/String;
      //   151: astore #5
      //   153: new java/lang/StringBuilder
      //   156: dup
      //   157: invokespecial <init> : ()V
      //   160: astore #8
      //   162: aload #8
      //   164: aload #5
      //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   169: pop
      //   170: aload #8
      //   172: ldc 'Device?'
      //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   177: pop
      //   178: aload #4
      //   180: aload #8
      //   182: invokevirtual toString : ()Ljava/lang/String;
      //   185: invokevirtual m : (Ljava/lang/String;)Lp6/e;
      //   188: astore #8
      //   190: aload_0
      //   191: getfield g : Le6/b;
      //   194: astore #4
      //   196: aload_0
      //   197: getfield h : I
      //   200: istore_3
      //   201: aload #8
      //   203: ldc 'CMD'
      //   205: ldc '2'
      //   207: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
      //   210: pop
      //   211: aload #8
      //   213: ldc 'action'
      //   215: ldc 'base'
      //   217: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
      //   220: pop
      //   221: aload #4
      //   223: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   226: astore #4
      //   228: aload #4
      //   230: invokestatic g : (Ljava/lang/Object;)V
      //   233: aload #4
      //   235: invokevirtual getPassword : ()Ljava/lang/String;
      //   238: astore #4
      //   240: aload #4
      //   242: ifnull -> 264
      //   245: aload #4
      //   247: invokestatic S0 : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      //   250: invokevirtual toString : ()Ljava/lang/String;
      //   253: astore #5
      //   255: aload #5
      //   257: astore #4
      //   259: aload #5
      //   261: ifnonnull -> 268
      //   264: ldc '123456789'
      //   266: astore #4
      //   268: aload #8
      //   270: ldc 'pass'
      //   272: aload #4
      //   274: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
      //   277: pop
      //   278: aload #8
      //   280: ldc 'type'
      //   282: iload_3
      //   283: bipush #11
      //   285: iadd
      //   286: invokestatic valueOf : (I)Ljava/lang/String;
      //   289: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
      //   292: pop
      //   293: aload #8
      //   295: new e6/b$e$a$a
      //   298: dup
      //   299: aload #6
      //   301: aload_0
      //   302: getfield g : Le6/b;
      //   305: aload #7
      //   307: aload_2
      //   308: aload #8
      //   310: aload_0
      //   311: getfield h : I
      //   314: invokespecial <init> : (Lq8/a;Le6/b;Lq8/l;Landroid/app/AlertDialog;Lp6/e;I)V
      //   317: new e6/b$e$a$b
      //   320: dup
      //   321: aload #7
      //   323: aload_2
      //   324: invokespecial <init> : (Lq8/l;Landroid/app/AlertDialog;)V
      //   327: invokevirtual i : (Lq8/l;Lq8/l;)V
      //   330: return
      //   331: aload_0
      //   332: getfield g : Le6/b;
      //   335: iconst_1
      //   336: invokestatic Q : (Le6/b;Z)V
      //   339: aload_0
      //   340: getfield g : Le6/b;
      //   343: getstatic r4/h.E5 : I
      //   346: invokevirtual J : (I)Landroid/view/View;
      //   349: checkcast ir/am3n/needtool/views/ForceSelectableSpinner
      //   352: astore #4
      //   354: aload #4
      //   356: ifnull -> 365
      //   359: aload #4
      //   361: iconst_0
      //   362: invokevirtual setSelection : (I)V
      //   365: aload_0
      //   366: getfield g : Le6/b;
      //   369: getstatic r4/h.x4 : I
      //   372: invokevirtual J : (I)Landroid/view/View;
      //   375: checkcast android/widget/ProgressBar
      //   378: astore #4
      //   380: aload #4
      //   382: ifnull -> 394
      //   385: aload #4
      //   387: iconst_0
      //   388: iconst_0
      //   389: iconst_3
      //   390: aconst_null
      //   391: invokestatic d : (Landroid/view/View;ZZILjava/lang/Object;)V
      //   394: aload_2
      //   395: ifnull -> 402
      //   398: aload_2
      //   399: invokevirtual dismiss : ()V
      //   402: return
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(q8.a<e8.q> param3a, b param3b, q8.l<? super Integer, e8.q> param3l, AlertDialog param3AlertDialog, p6.e param3e, int param3Int) {
        super(1);
      }
      
      public final void a(String param3String) {
        r8.m.j(param3String, "response");
        try {
          if (z8.m.N(param3String, "ok", false, 2, null)) {
            this.g.invoke();
          } else if (z8.m.N(param3String, "Wrong_pass", false, 2, null)) {
            v1.m(this.h, 2131951947, 0, null, 6, null);
            x5.d d = x5.d.j.a(b.L(this.h), new a(this.i, this.k, this.h, this.l, this.g));
            androidx.fragment.app.m m = this.h.getParentFragmentManager();
            r8.m.i(m, "parentFragmentManager");
            d.show(m, "AuthDeviceDialog");
          } else {
            this.i.invoke(Integer.valueOf(2131952122));
          } 
          AlertDialog alertDialog = this.j;
        } finally {
          param3String = null;
        } 
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(q8.l<? super Integer, e8.q> param4l, p6.e param4e, b param4b, int param4Int, q8.a<e8.q> param4a) {
          super(1);
        }
        
        public final void a(String param4String) {
          if (param4String == null) {
            this.g.invoke(Integer.valueOf(2131952131));
            return;
          } 
          this.h.h("pass", param4String);
          this.h.i(new a(this.i, this.j, this.k, this.g, param4String), new b(this.g));
        }
        
        static final class a extends r8.n implements q8.l<String, e8.q> {
          a(b param5b, int param5Int, q8.a<e8.q> param5a, q8.l<? super Integer, e8.q> param5l, String param5String) {
            super(1);
          }
          
          public final void a(String param5String) {
            r8.m.j(param5String, "response");
            ForceSelectableSpinner forceSelectableSpinner = null;
            try {
              u4.a a1;
              if (z8.m.N(param5String, "ok", false, 2, null)) {
                b.Q(this.g, true);
                ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
                if (forceSelectableSpinner1 != null)
                  forceSelectableSpinner1.setSelection(this.h); 
                App.a a2 = App.g;
                DB dB2 = a2.e();
                forceSelectableSpinner1 = forceSelectableSpinner;
                if (dB2 != null) {
                  u4.a a3 = dB2.H();
                  forceSelectableSpinner1 = forceSelectableSpinner;
                  if (a3 != null) {
                    device = b.L(this.g);
                    r8.m.g(device);
                    device = (Device)a3.z(device.getId());
                  } 
                } 
                b b1 = this.g;
                String str = this.k;
                b.O(b1, device);
                Device device = b.L(b1);
                if (device != null)
                  device.setPassword(str); 
                DB dB1 = a2.e();
                return;
              } 
              return;
            } finally {
              param5String = null;
              this.j.invoke(Integer.valueOf(2131952122));
            } 
          }
        }
        
        static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
          b(q8.l<? super Integer, e8.q> param5l) {
            super(1);
          }
          
          public final void a(VolleyError param5VolleyError) {
            r8.m.j(param5VolleyError, "it");
            this.g.invoke(Integer.valueOf(2131952122));
          }
        }
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(b param4b, int param4Int, q8.a<e8.q> param4a, q8.l<? super Integer, e8.q> param4l, String param4String) {
          super(1);
        }
        
        public final void a(String param4String) {
          r8.m.j(param4String, "response");
          ForceSelectableSpinner forceSelectableSpinner = null;
          try {
            u4.a a1;
            if (z8.m.N(param4String, "ok", false, 2, null)) {
              b.Q(this.g, true);
              ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
              if (forceSelectableSpinner1 != null)
                forceSelectableSpinner1.setSelection(this.h); 
              App.a a2 = App.g;
              DB dB2 = a2.e();
              forceSelectableSpinner1 = forceSelectableSpinner;
              if (dB2 != null) {
                u4.a a3 = dB2.H();
                forceSelectableSpinner1 = forceSelectableSpinner;
                if (a3 != null) {
                  device = b.L(this.g);
                  r8.m.g(device);
                  device = (Device)a3.z(device.getId());
                } 
              } 
              b b1 = this.g;
              String str = this.k;
              b.O(b1, device);
              Device device = b.L(b1);
              if (device != null)
                device.setPassword(str); 
              DB dB1 = a2.e();
              return;
            } 
            return;
          } finally {
            param4String = null;
            this.j.invoke(Integer.valueOf(2131952122));
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.l<? super Integer, e8.q> param4l) {
          super(1);
        }
        
        public final void a(VolleyError param4VolleyError) {
          r8.m.j(param4VolleyError, "it");
          this.g.invoke(Integer.valueOf(2131952122));
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(q8.l<? super Integer, e8.q> param3l, p6.e param3e, b param3b, int param3Int, q8.a<e8.q> param3a) {
        super(1);
      }
      
      public final void a(String param3String) {
        if (param3String == null) {
          this.g.invoke(Integer.valueOf(2131952131));
          return;
        } 
        this.h.h("pass", param3String);
        this.h.i(new a(this.i, this.j, this.k, this.g, param3String), new b(this.g));
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(b param5b, int param5Int, q8.a<e8.q> param5a, q8.l<? super Integer, e8.q> param5l, String param5String) {
          super(1);
        }
        
        public final void a(String param5String) {
          r8.m.j(param5String, "response");
          ForceSelectableSpinner forceSelectableSpinner = null;
          try {
            u4.a a1;
            if (z8.m.N(param5String, "ok", false, 2, null)) {
              b.Q(this.g, true);
              ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
              if (forceSelectableSpinner1 != null)
                forceSelectableSpinner1.setSelection(this.h); 
              App.a a2 = App.g;
              DB dB2 = a2.e();
              forceSelectableSpinner1 = forceSelectableSpinner;
              if (dB2 != null) {
                u4.a a3 = dB2.H();
                forceSelectableSpinner1 = forceSelectableSpinner;
                if (a3 != null) {
                  device = b.L(this.g);
                  r8.m.g(device);
                  device = (Device)a3.z(device.getId());
                } 
              } 
              b b1 = this.g;
              String str = this.k;
              b.O(b1, device);
              Device device = b.L(b1);
              if (device != null)
                device.setPassword(str); 
              DB dB1 = a2.e();
              return;
            } 
            return;
          } finally {
            param5String = null;
            this.j.invoke(Integer.valueOf(2131952122));
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.l<? super Integer, e8.q> param5l) {
          super(1);
        }
        
        public final void a(VolleyError param5VolleyError) {
          r8.m.j(param5VolleyError, "it");
          this.g.invoke(Integer.valueOf(2131952122));
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(b param3b, int param3Int, q8.a<e8.q> param3a, q8.l<? super Integer, e8.q> param3l, String param3String) {
        super(1);
      }
      
      public final void a(String param3String) {
        r8.m.j(param3String, "response");
        ForceSelectableSpinner forceSelectableSpinner = null;
        try {
          u4.a a1;
          if (z8.m.N(param3String, "ok", false, 2, null)) {
            b.Q(this.g, true);
            ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
            if (forceSelectableSpinner1 != null)
              forceSelectableSpinner1.setSelection(this.h); 
            App.a a2 = App.g;
            DB dB2 = a2.e();
            forceSelectableSpinner1 = forceSelectableSpinner;
            if (dB2 != null) {
              u4.a a3 = dB2.H();
              forceSelectableSpinner1 = forceSelectableSpinner;
              if (a3 != null) {
                device = b.L(this.g);
                r8.m.g(device);
                device = (Device)a3.z(device.getId());
              } 
            } 
            b b1 = this.g;
            String str = this.k;
            b.O(b1, device);
            Device device = b.L(b1);
            if (device != null)
              device.setPassword(str); 
            DB dB1 = a2.e();
            return;
          } 
          return;
        } finally {
          param3String = null;
          this.j.invoke(Integer.valueOf(2131952122));
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.l<? super Integer, e8.q> param3l) {
        super(1);
      }
      
      public final void a(VolleyError param3VolleyError) {
        r8.m.j(param3VolleyError, "it");
        this.g.invoke(Integer.valueOf(2131952122));
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.l<? super Integer, e8.q> param3l, AlertDialog param3AlertDialog) {
        super(1);
      }
      
      public final void a(VolleyError param3VolleyError) {
        r8.m.j(param3VolleyError, "it");
        try {
          this.g.invoke(Integer.valueOf(2131952122));
          AlertDialog alertDialog = this.h;
          return;
        } finally {
          param3VolleyError = null;
        } 
      }
    }
    
    static final class c extends r8.n implements q8.l<Integer, e8.q> {
      c(b param3b) {
        super(1);
      }
      
      public final void a(int param3Int) {
        // Byte code:
        //   0: aload_0
        //   1: getfield g : Le6/b;
        //   4: iconst_1
        //   5: invokestatic Q : (Le6/b;Z)V
        //   8: aload_0
        //   9: getfield g : Le6/b;
        //   12: getstatic r4/h.E5 : I
        //   15: invokevirtual J : (I)Landroid/view/View;
        //   18: checkcast ir/am3n/needtool/views/ForceSelectableSpinner
        //   21: astore_3
        //   22: aload_3
        //   23: ifnull -> 66
        //   26: aload_0
        //   27: getfield g : Le6/b;
        //   30: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
        //   33: astore #4
        //   35: aload #4
        //   37: ifnull -> 108
        //   40: aload #4
        //   42: invokevirtual getCtrlType : ()Ljava/lang/Integer;
        //   45: astore #4
        //   47: aload #4
        //   49: ifnull -> 108
        //   52: aload #4
        //   54: invokevirtual intValue : ()I
        //   57: istore_2
        //   58: goto -> 61
        //   61: aload_3
        //   62: iload_2
        //   63: invokevirtual setSelection : (I)V
        //   66: aload_0
        //   67: getfield g : Le6/b;
        //   70: getstatic r4/h.x4 : I
        //   73: invokevirtual J : (I)Landroid/view/View;
        //   76: checkcast android/widget/ProgressBar
        //   79: astore_3
        //   80: aload_3
        //   81: ifnull -> 92
        //   84: aload_3
        //   85: iconst_0
        //   86: iconst_0
        //   87: iconst_3
        //   88: aconst_null
        //   89: invokestatic d : (Landroid/view/View;ZZILjava/lang/Object;)V
        //   92: aload_0
        //   93: getfield g : Le6/b;
        //   96: iload_1
        //   97: iconst_0
        //   98: aconst_null
        //   99: bipush #6
        //   101: aconst_null
        //   102: invokestatic m : (Landroidx/fragment/app/Fragment;IILjava/lang/Integer;ILjava/lang/Object;)V
        //   105: return
        //   106: astore_3
        //   107: return
        //   108: iconst_0
        //   109: istore_2
        //   110: goto -> 61
        // Exception table:
        //   from	to	target	type
        //   0	22	106	finally
        //   26	35	106	finally
        //   40	47	106	finally
        //   52	58	106	finally
        //   61	66	106	finally
        //   66	80	106	finally
        //   84	92	106	finally
        //   92	105	106	finally
      }
    }
    
    static final class d extends r8.n implements q8.a<e8.q> {
      d(b param3b, int param3Int) {
        super(0);
      }
      
      public final e8.q a() {
        // Byte code:
        //   0: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
        //   3: astore #4
        //   5: aload #4
        //   7: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
        //   10: astore_2
        //   11: aconst_null
        //   12: astore_3
        //   13: aload_2
        //   14: ifnull -> 210
        //   17: aload_2
        //   18: invokevirtual H : ()Lu4/a;
        //   21: astore_2
        //   22: aload_2
        //   23: ifnull -> 210
        //   26: aload_0
        //   27: getfield g : Le6/b;
        //   30: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
        //   33: astore #5
        //   35: aload #5
        //   37: invokestatic g : (Ljava/lang/Object;)V
        //   40: aload_2
        //   41: aload #5
        //   43: invokevirtual getId : ()I
        //   46: invokevirtual z : (I)Ljava/lang/Object;
        //   49: checkcast com/smartpek/data/local/db/models/Device
        //   52: astore_2
        //   53: goto -> 56
        //   56: aload_0
        //   57: getfield g : Le6/b;
        //   60: astore #5
        //   62: aload_0
        //   63: getfield h : I
        //   66: istore_1
        //   67: aload #5
        //   69: aload_2
        //   70: invokestatic O : (Le6/b;Lcom/smartpek/data/local/db/models/Device;)V
        //   73: aload #5
        //   75: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
        //   78: astore_2
        //   79: aload_2
        //   80: ifnonnull -> 86
        //   83: goto -> 94
        //   86: aload_2
        //   87: iload_1
        //   88: invokestatic valueOf : (I)Ljava/lang/Integer;
        //   91: invokevirtual setCtrlType : (Ljava/lang/Integer;)V
        //   94: aload #4
        //   96: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
        //   99: astore_2
        //   100: aload_2
        //   101: ifnull -> 132
        //   104: aload_2
        //   105: invokevirtual H : ()Lu4/a;
        //   108: astore_2
        //   109: aload_2
        //   110: ifnull -> 132
        //   113: aload #5
        //   115: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
        //   118: astore #4
        //   120: aload #4
        //   122: invokestatic g : (Ljava/lang/Object;)V
        //   125: aload_2
        //   126: aload #4
        //   128: invokevirtual O : (Ljava/lang/Object;)Ljava/lang/Integer;
        //   131: pop
        //   132: aload_0
        //   133: getfield g : Le6/b;
        //   136: getstatic r4/h.x4 : I
        //   139: invokevirtual J : (I)Landroid/view/View;
        //   142: checkcast android/widget/ProgressBar
        //   145: astore_2
        //   146: aload_2
        //   147: ifnull -> 158
        //   150: aload_2
        //   151: iconst_0
        //   152: iconst_0
        //   153: iconst_3
        //   154: aconst_null
        //   155: invokestatic d : (Landroid/view/View;ZZILjava/lang/Object;)V
        //   158: aload_0
        //   159: getfield g : Le6/b;
        //   162: ldc 2131951853
        //   164: iconst_0
        //   165: aconst_null
        //   166: bipush #6
        //   168: aconst_null
        //   169: invokestatic m : (Landroidx/fragment/app/Fragment;IILjava/lang/Integer;ILjava/lang/Object;)V
        //   172: aload_0
        //   173: getfield g : Le6/b;
        //   176: invokevirtual getActivity : ()Landroidx/fragment/app/e;
        //   179: astore #4
        //   181: aload_3
        //   182: astore_2
        //   183: aload #4
        //   185: ifnull -> 204
        //   188: aload #4
        //   190: iconst_m1
        //   191: invokevirtual setResult : (I)V
        //   194: getstatic e8/q.a : Le8/q;
        //   197: astore_2
        //   198: aload_2
        //   199: areturn
        //   200: getstatic e8/q.a : Le8/q;
        //   203: astore_2
        //   204: aload_2
        //   205: areturn
        //   206: astore_2
        //   207: goto -> 200
        //   210: aconst_null
        //   211: astore_2
        //   212: goto -> 56
        // Exception table:
        //   from	to	target	type
        //   0	11	206	finally
        //   17	22	206	finally
        //   26	53	206	finally
        //   56	79	206	finally
        //   86	94	206	finally
        //   94	100	206	finally
        //   104	109	206	finally
        //   113	132	206	finally
        //   132	146	206	finally
        //   150	158	206	finally
        //   158	181	206	finally
        //   188	198	206	finally
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(q8.a<e8.q> param1a, b param1b, q8.l<? super Integer, e8.q> param1l, AlertDialog param1AlertDialog, p6.e param1e, int param1Int) {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "response");
      try {
        if (z8.m.N(param1String, "ok", false, 2, null)) {
          this.g.invoke();
        } else if (z8.m.N(param1String, "Wrong_pass", false, 2, null)) {
          v1.m(this.h, 2131951947, 0, null, 6, null);
          x5.d d = x5.d.j.a(b.L(this.h), new a(this.i, this.k, this.h, this.l, this.g));
          androidx.fragment.app.m m = this.h.getParentFragmentManager();
          r8.m.i(m, "parentFragmentManager");
          d.show(m, "AuthDeviceDialog");
        } else {
          this.i.invoke(Integer.valueOf(2131952122));
        } 
        AlertDialog alertDialog = this.j;
      } finally {
        param1String = null;
      } 
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(q8.l<? super Integer, e8.q> param4l, p6.e param4e, b param4b, int param4Int, q8.a<e8.q> param4a) {
        super(1);
      }
      
      public final void a(String param4String) {
        if (param4String == null) {
          this.g.invoke(Integer.valueOf(2131952131));
          return;
        } 
        this.h.h("pass", param4String);
        this.h.i(new a(this.i, this.j, this.k, this.g, param4String), new b(this.g));
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(b param5b, int param5Int, q8.a<e8.q> param5a, q8.l<? super Integer, e8.q> param5l, String param5String) {
          super(1);
        }
        
        public final void a(String param5String) {
          r8.m.j(param5String, "response");
          ForceSelectableSpinner forceSelectableSpinner = null;
          try {
            u4.a a1;
            if (z8.m.N(param5String, "ok", false, 2, null)) {
              b.Q(this.g, true);
              ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
              if (forceSelectableSpinner1 != null)
                forceSelectableSpinner1.setSelection(this.h); 
              App.a a2 = App.g;
              DB dB2 = a2.e();
              forceSelectableSpinner1 = forceSelectableSpinner;
              if (dB2 != null) {
                u4.a a3 = dB2.H();
                forceSelectableSpinner1 = forceSelectableSpinner;
                if (a3 != null) {
                  device = b.L(this.g);
                  r8.m.g(device);
                  device = (Device)a3.z(device.getId());
                } 
              } 
              b b1 = this.g;
              String str = this.k;
              b.O(b1, device);
              Device device = b.L(b1);
              if (device != null)
                device.setPassword(str); 
              DB dB1 = a2.e();
              return;
            } 
            return;
          } finally {
            param5String = null;
            this.j.invoke(Integer.valueOf(2131952122));
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.l<? super Integer, e8.q> param5l) {
          super(1);
        }
        
        public final void a(VolleyError param5VolleyError) {
          r8.m.j(param5VolleyError, "it");
          this.g.invoke(Integer.valueOf(2131952122));
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(b param4b, int param4Int, q8.a<e8.q> param4a, q8.l<? super Integer, e8.q> param4l, String param4String) {
        super(1);
      }
      
      public final void a(String param4String) {
        r8.m.j(param4String, "response");
        ForceSelectableSpinner forceSelectableSpinner = null;
        try {
          u4.a a1;
          if (z8.m.N(param4String, "ok", false, 2, null)) {
            b.Q(this.g, true);
            ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
            if (forceSelectableSpinner1 != null)
              forceSelectableSpinner1.setSelection(this.h); 
            App.a a2 = App.g;
            DB dB2 = a2.e();
            forceSelectableSpinner1 = forceSelectableSpinner;
            if (dB2 != null) {
              u4.a a3 = dB2.H();
              forceSelectableSpinner1 = forceSelectableSpinner;
              if (a3 != null) {
                device = b.L(this.g);
                r8.m.g(device);
                device = (Device)a3.z(device.getId());
              } 
            } 
            b b1 = this.g;
            String str = this.k;
            b.O(b1, device);
            Device device = b.L(b1);
            if (device != null)
              device.setPassword(str); 
            DB dB1 = a2.e();
            return;
          } 
          return;
        } finally {
          param4String = null;
          this.j.invoke(Integer.valueOf(2131952122));
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.l<? super Integer, e8.q> param4l) {
        super(1);
      }
      
      public final void a(VolleyError param4VolleyError) {
        r8.m.j(param4VolleyError, "it");
        this.g.invoke(Integer.valueOf(2131952122));
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(q8.l<? super Integer, e8.q> param1l, p6.e param1e, b param1b, int param1Int, q8.a<e8.q> param1a) {
      super(1);
    }
    
    public final void a(String param1String) {
      if (param1String == null) {
        this.g.invoke(Integer.valueOf(2131952131));
        return;
      } 
      this.h.h("pass", param1String);
      this.h.i(new a(this.i, this.j, this.k, this.g, param1String), new b(this.g));
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(b param5b, int param5Int, q8.a<e8.q> param5a, q8.l<? super Integer, e8.q> param5l, String param5String) {
        super(1);
      }
      
      public final void a(String param5String) {
        r8.m.j(param5String, "response");
        ForceSelectableSpinner forceSelectableSpinner = null;
        try {
          u4.a a1;
          if (z8.m.N(param5String, "ok", false, 2, null)) {
            b.Q(this.g, true);
            ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
            if (forceSelectableSpinner1 != null)
              forceSelectableSpinner1.setSelection(this.h); 
            App.a a2 = App.g;
            DB dB2 = a2.e();
            forceSelectableSpinner1 = forceSelectableSpinner;
            if (dB2 != null) {
              u4.a a3 = dB2.H();
              forceSelectableSpinner1 = forceSelectableSpinner;
              if (a3 != null) {
                device = b.L(this.g);
                r8.m.g(device);
                device = (Device)a3.z(device.getId());
              } 
            } 
            b b1 = this.g;
            String str = this.k;
            b.O(b1, device);
            Device device = b.L(b1);
            if (device != null)
              device.setPassword(str); 
            DB dB1 = a2.e();
            return;
          } 
          return;
        } finally {
          param5String = null;
          this.j.invoke(Integer.valueOf(2131952122));
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.l<? super Integer, e8.q> param5l) {
        super(1);
      }
      
      public final void a(VolleyError param5VolleyError) {
        r8.m.j(param5VolleyError, "it");
        this.g.invoke(Integer.valueOf(2131952122));
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(b param1b, int param1Int, q8.a<e8.q> param1a, q8.l<? super Integer, e8.q> param1l, String param1String) {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "response");
      ForceSelectableSpinner forceSelectableSpinner = null;
      try {
        u4.a a1;
        if (z8.m.N(param1String, "ok", false, 2, null)) {
          b.Q(this.g, true);
          ForceSelectableSpinner forceSelectableSpinner1 = (ForceSelectableSpinner)this.g.J(r4.h.E5);
          if (forceSelectableSpinner1 != null)
            forceSelectableSpinner1.setSelection(this.h); 
          App.a a2 = App.g;
          DB dB2 = a2.e();
          forceSelectableSpinner1 = forceSelectableSpinner;
          if (dB2 != null) {
            u4.a a3 = dB2.H();
            forceSelectableSpinner1 = forceSelectableSpinner;
            if (a3 != null) {
              device = b.L(this.g);
              r8.m.g(device);
              device = (Device)a3.z(device.getId());
            } 
          } 
          b b1 = this.g;
          String str = this.k;
          b.O(b1, device);
          Device device = b.L(b1);
          if (device != null)
            device.setPassword(str); 
          DB dB1 = a2.e();
          return;
        } 
        return;
      } finally {
        param1String = null;
        this.j.invoke(Integer.valueOf(2131952122));
      } 
    }
  }
  
  static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
    b(q8.l<? super Integer, e8.q> param1l) {
      super(1);
    }
    
    public final void a(VolleyError param1VolleyError) {
      r8.m.j(param1VolleyError, "it");
      this.g.invoke(Integer.valueOf(2131952122));
    }
  }
  
  static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
    b(q8.l<? super Integer, e8.q> param1l, AlertDialog param1AlertDialog) {
      super(1);
    }
    
    public final void a(VolleyError param1VolleyError) {
      r8.m.j(param1VolleyError, "it");
      try {
        this.g.invoke(Integer.valueOf(2131952122));
        AlertDialog alertDialog = this.h;
        return;
      } finally {
        param1VolleyError = null;
      } 
    }
  }
  
  static final class c extends r8.n implements q8.l<Integer, e8.q> {
    c(b param1b) {
      super(1);
    }
    
    public final void a(int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: getfield g : Le6/b;
      //   4: iconst_1
      //   5: invokestatic Q : (Le6/b;Z)V
      //   8: aload_0
      //   9: getfield g : Le6/b;
      //   12: getstatic r4/h.E5 : I
      //   15: invokevirtual J : (I)Landroid/view/View;
      //   18: checkcast ir/am3n/needtool/views/ForceSelectableSpinner
      //   21: astore_3
      //   22: aload_3
      //   23: ifnull -> 66
      //   26: aload_0
      //   27: getfield g : Le6/b;
      //   30: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   33: astore #4
      //   35: aload #4
      //   37: ifnull -> 108
      //   40: aload #4
      //   42: invokevirtual getCtrlType : ()Ljava/lang/Integer;
      //   45: astore #4
      //   47: aload #4
      //   49: ifnull -> 108
      //   52: aload #4
      //   54: invokevirtual intValue : ()I
      //   57: istore_2
      //   58: goto -> 61
      //   61: aload_3
      //   62: iload_2
      //   63: invokevirtual setSelection : (I)V
      //   66: aload_0
      //   67: getfield g : Le6/b;
      //   70: getstatic r4/h.x4 : I
      //   73: invokevirtual J : (I)Landroid/view/View;
      //   76: checkcast android/widget/ProgressBar
      //   79: astore_3
      //   80: aload_3
      //   81: ifnull -> 92
      //   84: aload_3
      //   85: iconst_0
      //   86: iconst_0
      //   87: iconst_3
      //   88: aconst_null
      //   89: invokestatic d : (Landroid/view/View;ZZILjava/lang/Object;)V
      //   92: aload_0
      //   93: getfield g : Le6/b;
      //   96: iload_1
      //   97: iconst_0
      //   98: aconst_null
      //   99: bipush #6
      //   101: aconst_null
      //   102: invokestatic m : (Landroidx/fragment/app/Fragment;IILjava/lang/Integer;ILjava/lang/Object;)V
      //   105: return
      //   106: astore_3
      //   107: return
      //   108: iconst_0
      //   109: istore_2
      //   110: goto -> 61
      // Exception table:
      //   from	to	target	type
      //   0	22	106	finally
      //   26	35	106	finally
      //   40	47	106	finally
      //   52	58	106	finally
      //   61	66	106	finally
      //   66	80	106	finally
      //   84	92	106	finally
      //   92	105	106	finally
    }
  }
  
  static final class d extends r8.n implements q8.a<e8.q> {
    d(b param1b, int param1Int) {
      super(0);
    }
    
    public final e8.q a() {
      // Byte code:
      //   0: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
      //   3: astore #4
      //   5: aload #4
      //   7: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   10: astore_2
      //   11: aconst_null
      //   12: astore_3
      //   13: aload_2
      //   14: ifnull -> 210
      //   17: aload_2
      //   18: invokevirtual H : ()Lu4/a;
      //   21: astore_2
      //   22: aload_2
      //   23: ifnull -> 210
      //   26: aload_0
      //   27: getfield g : Le6/b;
      //   30: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   33: astore #5
      //   35: aload #5
      //   37: invokestatic g : (Ljava/lang/Object;)V
      //   40: aload_2
      //   41: aload #5
      //   43: invokevirtual getId : ()I
      //   46: invokevirtual z : (I)Ljava/lang/Object;
      //   49: checkcast com/smartpek/data/local/db/models/Device
      //   52: astore_2
      //   53: goto -> 56
      //   56: aload_0
      //   57: getfield g : Le6/b;
      //   60: astore #5
      //   62: aload_0
      //   63: getfield h : I
      //   66: istore_1
      //   67: aload #5
      //   69: aload_2
      //   70: invokestatic O : (Le6/b;Lcom/smartpek/data/local/db/models/Device;)V
      //   73: aload #5
      //   75: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   78: astore_2
      //   79: aload_2
      //   80: ifnonnull -> 86
      //   83: goto -> 94
      //   86: aload_2
      //   87: iload_1
      //   88: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   91: invokevirtual setCtrlType : (Ljava/lang/Integer;)V
      //   94: aload #4
      //   96: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   99: astore_2
      //   100: aload_2
      //   101: ifnull -> 132
      //   104: aload_2
      //   105: invokevirtual H : ()Lu4/a;
      //   108: astore_2
      //   109: aload_2
      //   110: ifnull -> 132
      //   113: aload #5
      //   115: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   118: astore #4
      //   120: aload #4
      //   122: invokestatic g : (Ljava/lang/Object;)V
      //   125: aload_2
      //   126: aload #4
      //   128: invokevirtual O : (Ljava/lang/Object;)Ljava/lang/Integer;
      //   131: pop
      //   132: aload_0
      //   133: getfield g : Le6/b;
      //   136: getstatic r4/h.x4 : I
      //   139: invokevirtual J : (I)Landroid/view/View;
      //   142: checkcast android/widget/ProgressBar
      //   145: astore_2
      //   146: aload_2
      //   147: ifnull -> 158
      //   150: aload_2
      //   151: iconst_0
      //   152: iconst_0
      //   153: iconst_3
      //   154: aconst_null
      //   155: invokestatic d : (Landroid/view/View;ZZILjava/lang/Object;)V
      //   158: aload_0
      //   159: getfield g : Le6/b;
      //   162: ldc 2131951853
      //   164: iconst_0
      //   165: aconst_null
      //   166: bipush #6
      //   168: aconst_null
      //   169: invokestatic m : (Landroidx/fragment/app/Fragment;IILjava/lang/Integer;ILjava/lang/Object;)V
      //   172: aload_0
      //   173: getfield g : Le6/b;
      //   176: invokevirtual getActivity : ()Landroidx/fragment/app/e;
      //   179: astore #4
      //   181: aload_3
      //   182: astore_2
      //   183: aload #4
      //   185: ifnull -> 204
      //   188: aload #4
      //   190: iconst_m1
      //   191: invokevirtual setResult : (I)V
      //   194: getstatic e8/q.a : Le8/q;
      //   197: astore_2
      //   198: aload_2
      //   199: areturn
      //   200: getstatic e8/q.a : Le8/q;
      //   203: astore_2
      //   204: aload_2
      //   205: areturn
      //   206: astore_2
      //   207: goto -> 200
      //   210: aconst_null
      //   211: astore_2
      //   212: goto -> 56
      // Exception table:
      //   from	to	target	type
      //   0	11	206	finally
      //   17	22	206	finally
      //   26	53	206	finally
      //   56	79	206	finally
      //   86	94	206	finally
      //   94	100	206	finally
      //   104	109	206	finally
      //   113	132	206	finally
      //   132	146	206	finally
      //   150	158	206	finally
      //   158	181	206	finally
      //   188	198	206	finally
    }
  }
  
  static final class f extends r8.n implements q8.l<String, e8.q> {
    f(q8.a<e8.q> param1a, b param1b, q8.l<? super Integer, e8.q> param1l, p6.e param1e, boolean param1Boolean) {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "response");
      try {
        if (z8.m.N(param1String, "ok", false, 2, null))
          return; 
        return;
      } finally {
        param1String = null;
        this.i.invoke(Integer.valueOf(2131951863));
      } 
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(q8.l<? super Integer, e8.q> param2l, p6.e param2e, b param2b, boolean param2Boolean, q8.a<e8.q> param2a) {
        super(1);
      }
      
      public final void a(String param2String) {
        if (param2String == null) {
          this.g.invoke(Integer.valueOf(2131952131));
          return;
        } 
        this.h.h("pass", param2String);
        this.h.i(new a(this.i, this.j, this.k, this.g, param2String), new b(this.g));
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(b param3b, boolean param3Boolean, q8.a<e8.q> param3a, q8.l<? super Integer, e8.q> param3l, String param3String) {
          super(1);
        }
        
        public final void a(String param3String) {
          r8.m.j(param3String, "response");
          String str = null;
          try {
            u4.a a1;
            if (z8.m.N(param3String, "ok", false, 2, null)) {
              b.R(this.g, true);
              ((SwitchMaterial)this.g.J(r4.h.K5)).setChecked(this.h);
              App.a a2 = App.g;
              DB dB2 = a2.e();
              param3String = str;
              if (dB2 != null) {
                u4.a a3 = dB2.H();
                param3String = str;
                if (a3 != null) {
                  device = b.L(this.g);
                  r8.m.g(device);
                  device = (Device)a3.z(device.getId());
                } 
              } 
              b b1 = this.g;
              String str1 = this.k;
              b.O(b1, device);
              Device device = b.L(b1);
              if (device != null)
                device.setPassword(str1); 
              DB dB1 = a2.e();
              return;
            } 
            return;
          } finally {
            param3String = null;
            this.j.invoke(Integer.valueOf(2131952122));
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.l<? super Integer, e8.q> param3l) {
          super(1);
        }
        
        public final void a(VolleyError param3VolleyError) {
          r8.m.j(param3VolleyError, "it");
          this.g.invoke(Integer.valueOf(2131952122));
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(b param2b, boolean param2Boolean, q8.a<e8.q> param2a, q8.l<? super Integer, e8.q> param2l, String param2String) {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "response");
        String str = null;
        try {
          u4.a a1;
          if (z8.m.N(param2String, "ok", false, 2, null)) {
            b.R(this.g, true);
            ((SwitchMaterial)this.g.J(r4.h.K5)).setChecked(this.h);
            App.a a2 = App.g;
            DB dB2 = a2.e();
            param2String = str;
            if (dB2 != null) {
              u4.a a3 = dB2.H();
              param2String = str;
              if (a3 != null) {
                device = b.L(this.g);
                r8.m.g(device);
                device = (Device)a3.z(device.getId());
              } 
            } 
            b b1 = this.g;
            String str1 = this.k;
            b.O(b1, device);
            Device device = b.L(b1);
            if (device != null)
              device.setPassword(str1); 
            DB dB1 = a2.e();
            return;
          } 
          return;
        } finally {
          param2String = null;
          this.j.invoke(Integer.valueOf(2131952122));
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.l<? super Integer, e8.q> param2l) {
        super(1);
      }
      
      public final void a(VolleyError param2VolleyError) {
        r8.m.j(param2VolleyError, "it");
        this.g.invoke(Integer.valueOf(2131952122));
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(q8.l<? super Integer, e8.q> param1l, p6.e param1e, b param1b, boolean param1Boolean, q8.a<e8.q> param1a) {
      super(1);
    }
    
    public final void a(String param1String) {
      if (param1String == null) {
        this.g.invoke(Integer.valueOf(2131952131));
        return;
      } 
      this.h.h("pass", param1String);
      this.h.i(new a(this.i, this.j, this.k, this.g, param1String), new b(this.g));
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(b param3b, boolean param3Boolean, q8.a<e8.q> param3a, q8.l<? super Integer, e8.q> param3l, String param3String) {
        super(1);
      }
      
      public final void a(String param3String) {
        r8.m.j(param3String, "response");
        String str = null;
        try {
          u4.a a1;
          if (z8.m.N(param3String, "ok", false, 2, null)) {
            b.R(this.g, true);
            ((SwitchMaterial)this.g.J(r4.h.K5)).setChecked(this.h);
            App.a a2 = App.g;
            DB dB2 = a2.e();
            param3String = str;
            if (dB2 != null) {
              u4.a a3 = dB2.H();
              param3String = str;
              if (a3 != null) {
                device = b.L(this.g);
                r8.m.g(device);
                device = (Device)a3.z(device.getId());
              } 
            } 
            b b1 = this.g;
            String str1 = this.k;
            b.O(b1, device);
            Device device = b.L(b1);
            if (device != null)
              device.setPassword(str1); 
            DB dB1 = a2.e();
            return;
          } 
          return;
        } finally {
          param3String = null;
          this.j.invoke(Integer.valueOf(2131952122));
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.l<? super Integer, e8.q> param3l) {
        super(1);
      }
      
      public final void a(VolleyError param3VolleyError) {
        r8.m.j(param3VolleyError, "it");
        this.g.invoke(Integer.valueOf(2131952122));
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(b param1b, boolean param1Boolean, q8.a<e8.q> param1a, q8.l<? super Integer, e8.q> param1l, String param1String) {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "response");
      String str = null;
      try {
        u4.a a1;
        if (z8.m.N(param1String, "ok", false, 2, null)) {
          b.R(this.g, true);
          ((SwitchMaterial)this.g.J(r4.h.K5)).setChecked(this.h);
          App.a a2 = App.g;
          DB dB2 = a2.e();
          param1String = str;
          if (dB2 != null) {
            u4.a a3 = dB2.H();
            param1String = str;
            if (a3 != null) {
              device = b.L(this.g);
              r8.m.g(device);
              device = (Device)a3.z(device.getId());
            } 
          } 
          b b1 = this.g;
          String str1 = this.k;
          b.O(b1, device);
          Device device = b.L(b1);
          if (device != null)
            device.setPassword(str1); 
          DB dB1 = a2.e();
          return;
        } 
        return;
      } finally {
        param1String = null;
        this.j.invoke(Integer.valueOf(2131952122));
      } 
    }
  }
  
  static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
    b(q8.l<? super Integer, e8.q> param1l) {
      super(1);
    }
    
    public final void a(VolleyError param1VolleyError) {
      r8.m.j(param1VolleyError, "it");
      this.g.invoke(Integer.valueOf(2131952122));
    }
  }
  
  static final class g extends r8.n implements q8.l<VolleyError, e8.q> {
    g(q8.l<? super Integer, e8.q> param1l) {
      super(1);
    }
    
    public final void a(VolleyError param1VolleyError) {
      r8.m.j(param1VolleyError, "it");
      this.g.invoke(Integer.valueOf(2131951863));
    }
  }
  
  static final class h extends r8.n implements q8.l<Integer, e8.q> {
    h(b param1b, boolean param1Boolean) {
      super(1);
    }
    
    private static final void d(b param1b) {
      r8.m.j(param1b, "this$0");
      ProgressBar progressBar = (ProgressBar)param1b.J(r4.h.t4);
      if (progressBar != null)
        p7.e.d((View)progressBar, false, false, 3, null); 
      SwitchMaterial switchMaterial = (SwitchMaterial)param1b.J(r4.h.K5);
      if (switchMaterial != null)
        p7.e.h((View)switchMaterial, false, null, 3, null); 
    }
    
    public final void c(int param1Int) {
      try {
        b b1 = this.g;
        boolean bool = true;
        b.R(b1, true);
        b1 = this.g;
        int i = r4.h.K5;
        SwitchMaterial switchMaterial = (SwitchMaterial)b1.J(i);
        if (this.h)
          bool = false; 
        switchMaterial.setChecked(bool);
        switchMaterial = (SwitchMaterial)this.g.J(i);
        if (switchMaterial != null)
          switchMaterial.postDelayed(new f(this.g), 300L); 
        return;
      } finally {
        Exception exception = null;
      } 
    }
  }
  
  static final class i extends r8.n implements q8.a<e8.q> {
    i(b param1b, int param1Int) {
      super(0);
    }
    
    private static final void d(b param1b) {
      r8.m.j(param1b, "this$0");
      ProgressBar progressBar = (ProgressBar)param1b.J(r4.h.t4);
      if (progressBar != null)
        p7.e.d((View)progressBar, false, false, 3, null); 
      SwitchMaterial switchMaterial = (SwitchMaterial)param1b.J(r4.h.K5);
      if (switchMaterial != null)
        p7.e.h((View)switchMaterial, false, null, 3, null); 
    }
    
    public final e8.q c() {
      // Byte code:
      //   0: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
      //   3: astore #4
      //   5: aload #4
      //   7: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   10: astore_2
      //   11: aconst_null
      //   12: astore_3
      //   13: aload_2
      //   14: ifnull -> 235
      //   17: aload_2
      //   18: invokevirtual H : ()Lu4/a;
      //   21: astore_2
      //   22: aload_2
      //   23: ifnull -> 235
      //   26: aload_0
      //   27: getfield g : Le6/b;
      //   30: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   33: astore #5
      //   35: aload #5
      //   37: invokestatic g : (Ljava/lang/Object;)V
      //   40: aload_2
      //   41: aload #5
      //   43: invokevirtual getId : ()I
      //   46: invokevirtual z : (I)Ljava/lang/Object;
      //   49: checkcast com/smartpek/data/local/db/models/Device
      //   52: astore_2
      //   53: goto -> 56
      //   56: aload_0
      //   57: getfield g : Le6/b;
      //   60: astore #5
      //   62: aload_0
      //   63: getfield h : I
      //   66: istore_1
      //   67: aload #5
      //   69: aload_2
      //   70: invokestatic O : (Le6/b;Lcom/smartpek/data/local/db/models/Device;)V
      //   73: aload #5
      //   75: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   78: astore_2
      //   79: aload_2
      //   80: ifnull -> 99
      //   83: aload_2
      //   84: invokevirtual getFlags : ()[Ljava/lang/Integer;
      //   87: astore_2
      //   88: aload_2
      //   89: ifnull -> 99
      //   92: aload_2
      //   93: iconst_1
      //   94: iload_1
      //   95: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   98: aastore
      //   99: aload #4
      //   101: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   104: astore_2
      //   105: aload_2
      //   106: ifnull -> 137
      //   109: aload_2
      //   110: invokevirtual H : ()Lu4/a;
      //   113: astore_2
      //   114: aload_2
      //   115: ifnull -> 137
      //   118: aload #5
      //   120: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   123: astore #4
      //   125: aload #4
      //   127: invokestatic g : (Ljava/lang/Object;)V
      //   130: aload_2
      //   131: aload #4
      //   133: invokevirtual O : (Ljava/lang/Object;)Ljava/lang/Integer;
      //   136: pop
      //   137: aload_0
      //   138: getfield g : Le6/b;
      //   141: getstatic r4/h.K5 : I
      //   144: invokevirtual J : (I)Landroid/view/View;
      //   147: checkcast com/google/android/material/switchmaterial/SwitchMaterial
      //   150: astore_2
      //   151: aload_2
      //   152: ifnull -> 174
      //   155: aload_2
      //   156: new e6/g
      //   159: dup
      //   160: aload_0
      //   161: getfield g : Le6/b;
      //   164: invokespecial <init> : (Le6/b;)V
      //   167: ldc2_w 300
      //   170: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
      //   173: pop
      //   174: aload_0
      //   175: getfield g : Le6/b;
      //   178: invokevirtual getContext : ()Landroid/content/Context;
      //   181: astore_2
      //   182: aload_2
      //   183: ifnull -> 197
      //   186: aload_2
      //   187: ldc 2131951853
      //   189: iconst_0
      //   190: aconst_null
      //   191: bipush #6
      //   193: aconst_null
      //   194: invokestatic k : (Landroid/content/Context;IILjava/lang/Integer;ILjava/lang/Object;)V
      //   197: aload_0
      //   198: getfield g : Le6/b;
      //   201: invokevirtual getActivity : ()Landroidx/fragment/app/e;
      //   204: astore #4
      //   206: aload_3
      //   207: astore_2
      //   208: aload #4
      //   210: ifnull -> 229
      //   213: aload #4
      //   215: iconst_m1
      //   216: invokevirtual setResult : (I)V
      //   219: getstatic e8/q.a : Le8/q;
      //   222: astore_2
      //   223: aload_2
      //   224: areturn
      //   225: getstatic e8/q.a : Le8/q;
      //   228: astore_2
      //   229: aload_2
      //   230: areturn
      //   231: astore_2
      //   232: goto -> 225
      //   235: aconst_null
      //   236: astore_2
      //   237: goto -> 56
      // Exception table:
      //   from	to	target	type
      //   0	11	231	finally
      //   17	22	231	finally
      //   26	53	231	finally
      //   56	79	231	finally
      //   83	88	231	finally
      //   92	99	231	finally
      //   99	105	231	finally
      //   109	114	231	finally
      //   118	137	231	finally
      //   137	151	231	finally
      //   155	174	231	finally
      //   174	182	231	finally
      //   186	197	231	finally
      //   197	206	231	finally
      //   213	223	231	finally
    }
  }
  
  static final class j extends r8.n implements q8.l<View, e8.q> {
    j(b param1b) {
      super(1);
    }
    
    public final void a(View param1View) {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(q8.a<e8.q> param2a, b param2b, q8.l<? super Integer, e8.q> param2l, p6.e param2e, boolean param2Boolean) {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "response");
        try {
          if (z8.m.N(param2String, "ok", false, 2, null))
            return; 
          return;
        } finally {
          param2String = null;
          this.i.invoke(Integer.valueOf(2131951863));
        } 
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(q8.l<? super Integer, e8.q> param3l, p6.e param3e, b param3b, boolean param3Boolean, q8.a<e8.q> param3a) {
          super(1);
        }
        
        public final void a(String param3String) {
          if (param3String == null) {
            this.g.invoke(Integer.valueOf(2131952131));
            return;
          } 
          this.h.h("pass", param3String);
          this.h.i(new a(this.i, this.j, this.k, this.g, param3String), new b(this.g));
        }
        
        static final class a extends r8.n implements q8.l<String, e8.q> {
          a(b param4b, boolean param4Boolean, q8.a<e8.q> param4a, q8.l<? super Integer, e8.q> param4l, String param4String) {
            super(1);
          }
          
          public final void a(String param4String) {
            r8.m.j(param4String, "response");
            String str = null;
            try {
              u4.a a1;
              if (z8.m.N(param4String, "ok", false, 2, null)) {
                ((MaterialCheckBox)this.g.J(r4.h.m0)).setChecked(this.h);
                App.a a2 = App.g;
                DB dB2 = a2.e();
                param4String = str;
                if (dB2 != null) {
                  u4.a a3 = dB2.H();
                  param4String = str;
                  if (a3 != null) {
                    device = b.L(this.g);
                    r8.m.g(device);
                    device = (Device)a3.z(device.getId());
                  } 
                } 
                b b1 = this.g;
                String str1 = this.k;
                b.O(b1, device);
                Device device = b.L(b1);
                if (device != null)
                  device.setPassword(str1); 
                DB dB1 = a2.e();
                return;
              } 
              return;
            } finally {
              param4String = null;
              this.j.invoke(Integer.valueOf(2131952122));
            } 
          }
        }
        
        static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
          b(q8.l<? super Integer, e8.q> param4l) {
            super(1);
          }
          
          public final void a(VolleyError param4VolleyError) {
            r8.m.j(param4VolleyError, "it");
            this.g.invoke(Integer.valueOf(2131952122));
          }
        }
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(b param3b, boolean param3Boolean, q8.a<e8.q> param3a, q8.l<? super Integer, e8.q> param3l, String param3String) {
          super(1);
        }
        
        public final void a(String param3String) {
          r8.m.j(param3String, "response");
          String str = null;
          try {
            u4.a a1;
            if (z8.m.N(param3String, "ok", false, 2, null)) {
              ((MaterialCheckBox)this.g.J(r4.h.m0)).setChecked(this.h);
              App.a a2 = App.g;
              DB dB2 = a2.e();
              param3String = str;
              if (dB2 != null) {
                u4.a a3 = dB2.H();
                param3String = str;
                if (a3 != null) {
                  device = b.L(this.g);
                  r8.m.g(device);
                  device = (Device)a3.z(device.getId());
                } 
              } 
              b b1 = this.g;
              String str1 = this.k;
              b.O(b1, device);
              Device device = b.L(b1);
              if (device != null)
                device.setPassword(str1); 
              DB dB1 = a2.e();
              return;
            } 
            return;
          } finally {
            param3String = null;
            this.j.invoke(Integer.valueOf(2131952122));
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.l<? super Integer, e8.q> param3l) {
          super(1);
        }
        
        public final void a(VolleyError param3VolleyError) {
          r8.m.j(param3VolleyError, "it");
          this.g.invoke(Integer.valueOf(2131952122));
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(q8.l<? super Integer, e8.q> param2l, p6.e param2e, b param2b, boolean param2Boolean, q8.a<e8.q> param2a) {
        super(1);
      }
      
      public final void a(String param2String) {
        if (param2String == null) {
          this.g.invoke(Integer.valueOf(2131952131));
          return;
        } 
        this.h.h("pass", param2String);
        this.h.i(new a(this.i, this.j, this.k, this.g, param2String), new b(this.g));
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(b param4b, boolean param4Boolean, q8.a<e8.q> param4a, q8.l<? super Integer, e8.q> param4l, String param4String) {
          super(1);
        }
        
        public final void a(String param4String) {
          r8.m.j(param4String, "response");
          String str = null;
          try {
            u4.a a1;
            if (z8.m.N(param4String, "ok", false, 2, null)) {
              ((MaterialCheckBox)this.g.J(r4.h.m0)).setChecked(this.h);
              App.a a2 = App.g;
              DB dB2 = a2.e();
              param4String = str;
              if (dB2 != null) {
                u4.a a3 = dB2.H();
                param4String = str;
                if (a3 != null) {
                  device = b.L(this.g);
                  r8.m.g(device);
                  device = (Device)a3.z(device.getId());
                } 
              } 
              b b1 = this.g;
              String str1 = this.k;
              b.O(b1, device);
              Device device = b.L(b1);
              if (device != null)
                device.setPassword(str1); 
              DB dB1 = a2.e();
              return;
            } 
            return;
          } finally {
            param4String = null;
            this.j.invoke(Integer.valueOf(2131952122));
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.l<? super Integer, e8.q> param4l) {
          super(1);
        }
        
        public final void a(VolleyError param4VolleyError) {
          r8.m.j(param4VolleyError, "it");
          this.g.invoke(Integer.valueOf(2131952122));
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(b param2b, boolean param2Boolean, q8.a<e8.q> param2a, q8.l<? super Integer, e8.q> param2l, String param2String) {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "response");
        String str = null;
        try {
          u4.a a1;
          if (z8.m.N(param2String, "ok", false, 2, null)) {
            ((MaterialCheckBox)this.g.J(r4.h.m0)).setChecked(this.h);
            App.a a2 = App.g;
            DB dB2 = a2.e();
            param2String = str;
            if (dB2 != null) {
              u4.a a3 = dB2.H();
              param2String = str;
              if (a3 != null) {
                device = b.L(this.g);
                r8.m.g(device);
                device = (Device)a3.z(device.getId());
              } 
            } 
            b b1 = this.g;
            String str1 = this.k;
            b.O(b1, device);
            Device device = b.L(b1);
            if (device != null)
              device.setPassword(str1); 
            DB dB1 = a2.e();
            return;
          } 
          return;
        } finally {
          param2String = null;
          this.j.invoke(Integer.valueOf(2131952122));
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.l<? super Integer, e8.q> param2l) {
        super(1);
      }
      
      public final void a(VolleyError param2VolleyError) {
        r8.m.j(param2VolleyError, "it");
        this.g.invoke(Integer.valueOf(2131952122));
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.l<? super Integer, e8.q> param2l) {
        super(1);
      }
      
      public final void a(VolleyError param2VolleyError) {
        r8.m.j(param2VolleyError, "it");
        this.g.invoke(Integer.valueOf(2131951863));
      }
    }
    
    static final class c extends r8.n implements q8.l<Integer, e8.q> {
      c(b param2b, boolean param2Boolean) {
        super(1);
      }
      
      private static final void d(b param2b) {
        r8.m.j(param2b, "this$0");
        ProgressBar progressBar = (ProgressBar)param2b.J(r4.h.s4);
        if (progressBar != null)
          p7.e.d((View)progressBar, false, false, 3, null); 
        MaterialCheckBox materialCheckBox = (MaterialCheckBox)param2b.J(r4.h.m0);
        if (materialCheckBox != null)
          p7.e.h((View)materialCheckBox, false, null, 3, null); 
      }
      
      public final void c(int param2Int) {
        try {
          boolean bool;
          b b1 = this.g;
          int i = r4.h.m0;
          MaterialCheckBox materialCheckBox = (MaterialCheckBox)b1.J(i);
          if (!this.h) {
            bool = true;
          } else {
            bool = false;
          } 
          materialCheckBox.setChecked(bool);
          materialCheckBox = (MaterialCheckBox)this.g.J(i);
          if (materialCheckBox != null)
            materialCheckBox.postDelayed(new h(this.g), 300L); 
          return;
        } finally {
          Exception exception = null;
        } 
      }
    }
    
    static final class d extends r8.n implements q8.a<e8.q> {
      d(b param2b, int param2Int) {
        super(0);
      }
      
      private static final void d(b param2b) {
        r8.m.j(param2b, "this$0");
        ProgressBar progressBar = (ProgressBar)param2b.J(r4.h.s4);
        if (progressBar != null)
          p7.e.d((View)progressBar, false, false, 3, null); 
        MaterialCheckBox materialCheckBox = (MaterialCheckBox)param2b.J(r4.h.m0);
        if (materialCheckBox != null)
          p7.e.h((View)materialCheckBox, false, null, 3, null); 
      }
      
      public final e8.q c() {
        // Byte code:
        //   0: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
        //   3: astore #4
        //   5: aload #4
        //   7: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
        //   10: astore_2
        //   11: aconst_null
        //   12: astore_3
        //   13: aload_2
        //   14: ifnull -> 56
        //   17: aload_2
        //   18: invokevirtual H : ()Lu4/a;
        //   21: astore_2
        //   22: aload_2
        //   23: ifnull -> 56
        //   26: aload_0
        //   27: getfield g : Le6/b;
        //   30: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
        //   33: astore #5
        //   35: aload #5
        //   37: invokestatic g : (Ljava/lang/Object;)V
        //   40: aload_2
        //   41: aload #5
        //   43: invokevirtual getId : ()I
        //   46: invokevirtual z : (I)Ljava/lang/Object;
        //   49: checkcast com/smartpek/data/local/db/models/Device
        //   52: astore_2
        //   53: goto -> 58
        //   56: aconst_null
        //   57: astore_2
        //   58: aload_0
        //   59: getfield g : Le6/b;
        //   62: astore #5
        //   64: aload_0
        //   65: getfield h : I
        //   68: istore_1
        //   69: aload #5
        //   71: aload_2
        //   72: invokestatic O : (Le6/b;Lcom/smartpek/data/local/db/models/Device;)V
        //   75: aload #5
        //   77: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
        //   80: astore_2
        //   81: aload_2
        //   82: ifnull -> 101
        //   85: aload_2
        //   86: invokevirtual getFlags : ()[Ljava/lang/Integer;
        //   89: astore_2
        //   90: aload_2
        //   91: ifnull -> 101
        //   94: aload_2
        //   95: iconst_0
        //   96: iload_1
        //   97: invokestatic valueOf : (I)Ljava/lang/Integer;
        //   100: aastore
        //   101: aload #4
        //   103: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
        //   106: astore_2
        //   107: aload_2
        //   108: ifnull -> 139
        //   111: aload_2
        //   112: invokevirtual H : ()Lu4/a;
        //   115: astore_2
        //   116: aload_2
        //   117: ifnull -> 139
        //   120: aload #5
        //   122: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
        //   125: astore #4
        //   127: aload #4
        //   129: invokestatic g : (Ljava/lang/Object;)V
        //   132: aload_2
        //   133: aload #4
        //   135: invokevirtual O : (Ljava/lang/Object;)Ljava/lang/Integer;
        //   138: pop
        //   139: aload_0
        //   140: getfield g : Le6/b;
        //   143: getstatic r4/h.m0 : I
        //   146: invokevirtual J : (I)Landroid/view/View;
        //   149: checkcast com/google/android/material/checkbox/MaterialCheckBox
        //   152: astore_2
        //   153: aload_2
        //   154: ifnull -> 176
        //   157: aload_2
        //   158: new e6/i
        //   161: dup
        //   162: aload_0
        //   163: getfield g : Le6/b;
        //   166: invokespecial <init> : (Le6/b;)V
        //   169: ldc2_w 300
        //   172: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
        //   175: pop
        //   176: aload_0
        //   177: getfield g : Le6/b;
        //   180: invokevirtual getContext : ()Landroid/content/Context;
        //   183: astore_2
        //   184: aload_2
        //   185: ifnull -> 199
        //   188: aload_2
        //   189: ldc 2131951853
        //   191: iconst_0
        //   192: aconst_null
        //   193: bipush #6
        //   195: aconst_null
        //   196: invokestatic k : (Landroid/content/Context;IILjava/lang/Integer;ILjava/lang/Object;)V
        //   199: aload_0
        //   200: getfield g : Le6/b;
        //   203: invokevirtual getActivity : ()Landroidx/fragment/app/e;
        //   206: astore #4
        //   208: aload_3
        //   209: astore_2
        //   210: aload #4
        //   212: ifnull -> 225
        //   215: aload #4
        //   217: iconst_m1
        //   218: invokevirtual setResult : (I)V
        //   221: getstatic e8/q.a : Le8/q;
        //   224: astore_2
        //   225: aload_2
        //   226: areturn
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(q8.a<e8.q> param1a, b param1b, q8.l<? super Integer, e8.q> param1l, p6.e param1e, boolean param1Boolean) {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "response");
      try {
        if (z8.m.N(param1String, "ok", false, 2, null))
          return; 
        return;
      } finally {
        param1String = null;
        this.i.invoke(Integer.valueOf(2131951863));
      } 
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(q8.l<? super Integer, e8.q> param3l, p6.e param3e, b param3b, boolean param3Boolean, q8.a<e8.q> param3a) {
        super(1);
      }
      
      public final void a(String param3String) {
        if (param3String == null) {
          this.g.invoke(Integer.valueOf(2131952131));
          return;
        } 
        this.h.h("pass", param3String);
        this.h.i(new a(this.i, this.j, this.k, this.g, param3String), new b(this.g));
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(b param4b, boolean param4Boolean, q8.a<e8.q> param4a, q8.l<? super Integer, e8.q> param4l, String param4String) {
          super(1);
        }
        
        public final void a(String param4String) {
          r8.m.j(param4String, "response");
          String str = null;
          try {
            u4.a a1;
            if (z8.m.N(param4String, "ok", false, 2, null)) {
              ((MaterialCheckBox)this.g.J(r4.h.m0)).setChecked(this.h);
              App.a a2 = App.g;
              DB dB2 = a2.e();
              param4String = str;
              if (dB2 != null) {
                u4.a a3 = dB2.H();
                param4String = str;
                if (a3 != null) {
                  device = b.L(this.g);
                  r8.m.g(device);
                  device = (Device)a3.z(device.getId());
                } 
              } 
              b b1 = this.g;
              String str1 = this.k;
              b.O(b1, device);
              Device device = b.L(b1);
              if (device != null)
                device.setPassword(str1); 
              DB dB1 = a2.e();
              return;
            } 
            return;
          } finally {
            param4String = null;
            this.j.invoke(Integer.valueOf(2131952122));
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.l<? super Integer, e8.q> param4l) {
          super(1);
        }
        
        public final void a(VolleyError param4VolleyError) {
          r8.m.j(param4VolleyError, "it");
          this.g.invoke(Integer.valueOf(2131952122));
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(b param3b, boolean param3Boolean, q8.a<e8.q> param3a, q8.l<? super Integer, e8.q> param3l, String param3String) {
        super(1);
      }
      
      public final void a(String param3String) {
        r8.m.j(param3String, "response");
        String str = null;
        try {
          u4.a a1;
          if (z8.m.N(param3String, "ok", false, 2, null)) {
            ((MaterialCheckBox)this.g.J(r4.h.m0)).setChecked(this.h);
            App.a a2 = App.g;
            DB dB2 = a2.e();
            param3String = str;
            if (dB2 != null) {
              u4.a a3 = dB2.H();
              param3String = str;
              if (a3 != null) {
                device = b.L(this.g);
                r8.m.g(device);
                device = (Device)a3.z(device.getId());
              } 
            } 
            b b1 = this.g;
            String str1 = this.k;
            b.O(b1, device);
            Device device = b.L(b1);
            if (device != null)
              device.setPassword(str1); 
            DB dB1 = a2.e();
            return;
          } 
          return;
        } finally {
          param3String = null;
          this.j.invoke(Integer.valueOf(2131952122));
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.l<? super Integer, e8.q> param3l) {
        super(1);
      }
      
      public final void a(VolleyError param3VolleyError) {
        r8.m.j(param3VolleyError, "it");
        this.g.invoke(Integer.valueOf(2131952122));
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(q8.l<? super Integer, e8.q> param1l, p6.e param1e, b param1b, boolean param1Boolean, q8.a<e8.q> param1a) {
      super(1);
    }
    
    public final void a(String param1String) {
      if (param1String == null) {
        this.g.invoke(Integer.valueOf(2131952131));
        return;
      } 
      this.h.h("pass", param1String);
      this.h.i(new a(this.i, this.j, this.k, this.g, param1String), new b(this.g));
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(b param4b, boolean param4Boolean, q8.a<e8.q> param4a, q8.l<? super Integer, e8.q> param4l, String param4String) {
        super(1);
      }
      
      public final void a(String param4String) {
        r8.m.j(param4String, "response");
        String str = null;
        try {
          u4.a a1;
          if (z8.m.N(param4String, "ok", false, 2, null)) {
            ((MaterialCheckBox)this.g.J(r4.h.m0)).setChecked(this.h);
            App.a a2 = App.g;
            DB dB2 = a2.e();
            param4String = str;
            if (dB2 != null) {
              u4.a a3 = dB2.H();
              param4String = str;
              if (a3 != null) {
                device = b.L(this.g);
                r8.m.g(device);
                device = (Device)a3.z(device.getId());
              } 
            } 
            b b1 = this.g;
            String str1 = this.k;
            b.O(b1, device);
            Device device = b.L(b1);
            if (device != null)
              device.setPassword(str1); 
            DB dB1 = a2.e();
            return;
          } 
          return;
        } finally {
          param4String = null;
          this.j.invoke(Integer.valueOf(2131952122));
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.l<? super Integer, e8.q> param4l) {
        super(1);
      }
      
      public final void a(VolleyError param4VolleyError) {
        r8.m.j(param4VolleyError, "it");
        this.g.invoke(Integer.valueOf(2131952122));
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(b param1b, boolean param1Boolean, q8.a<e8.q> param1a, q8.l<? super Integer, e8.q> param1l, String param1String) {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "response");
      String str = null;
      try {
        u4.a a1;
        if (z8.m.N(param1String, "ok", false, 2, null)) {
          ((MaterialCheckBox)this.g.J(r4.h.m0)).setChecked(this.h);
          App.a a2 = App.g;
          DB dB2 = a2.e();
          param1String = str;
          if (dB2 != null) {
            u4.a a3 = dB2.H();
            param1String = str;
            if (a3 != null) {
              device = b.L(this.g);
              r8.m.g(device);
              device = (Device)a3.z(device.getId());
            } 
          } 
          b b1 = this.g;
          String str1 = this.k;
          b.O(b1, device);
          Device device = b.L(b1);
          if (device != null)
            device.setPassword(str1); 
          DB dB1 = a2.e();
          return;
        } 
        return;
      } finally {
        param1String = null;
        this.j.invoke(Integer.valueOf(2131952122));
      } 
    }
  }
  
  static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
    b(q8.l<? super Integer, e8.q> param1l) {
      super(1);
    }
    
    public final void a(VolleyError param1VolleyError) {
      r8.m.j(param1VolleyError, "it");
      this.g.invoke(Integer.valueOf(2131952122));
    }
  }
  
  static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
    b(q8.l<? super Integer, e8.q> param1l) {
      super(1);
    }
    
    public final void a(VolleyError param1VolleyError) {
      r8.m.j(param1VolleyError, "it");
      this.g.invoke(Integer.valueOf(2131951863));
    }
  }
  
  static final class c extends r8.n implements q8.l<Integer, e8.q> {
    c(b param1b, boolean param1Boolean) {
      super(1);
    }
    
    private static final void d(b param1b) {
      r8.m.j(param1b, "this$0");
      ProgressBar progressBar = (ProgressBar)param1b.J(r4.h.s4);
      if (progressBar != null)
        p7.e.d((View)progressBar, false, false, 3, null); 
      MaterialCheckBox materialCheckBox = (MaterialCheckBox)param1b.J(r4.h.m0);
      if (materialCheckBox != null)
        p7.e.h((View)materialCheckBox, false, null, 3, null); 
    }
    
    public final void c(int param1Int) {
      try {
        boolean bool;
        b b1 = this.g;
        int i = r4.h.m0;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox)b1.J(i);
        if (!this.h) {
          bool = true;
        } else {
          bool = false;
        } 
        materialCheckBox.setChecked(bool);
        materialCheckBox = (MaterialCheckBox)this.g.J(i);
        if (materialCheckBox != null)
          materialCheckBox.postDelayed(new h(this.g), 300L); 
        return;
      } finally {
        Exception exception = null;
      } 
    }
  }
  
  static final class d extends r8.n implements q8.a<e8.q> {
    d(b param1b, int param1Int) {
      super(0);
    }
    
    private static final void d(b param1b) {
      r8.m.j(param1b, "this$0");
      ProgressBar progressBar = (ProgressBar)param1b.J(r4.h.s4);
      if (progressBar != null)
        p7.e.d((View)progressBar, false, false, 3, null); 
      MaterialCheckBox materialCheckBox = (MaterialCheckBox)param1b.J(r4.h.m0);
      if (materialCheckBox != null)
        p7.e.h((View)materialCheckBox, false, null, 3, null); 
    }
    
    public final e8.q c() {
      // Byte code:
      //   0: getstatic com/smartpek/App.g : Lcom/smartpek/App$a;
      //   3: astore #4
      //   5: aload #4
      //   7: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   10: astore_2
      //   11: aconst_null
      //   12: astore_3
      //   13: aload_2
      //   14: ifnull -> 56
      //   17: aload_2
      //   18: invokevirtual H : ()Lu4/a;
      //   21: astore_2
      //   22: aload_2
      //   23: ifnull -> 56
      //   26: aload_0
      //   27: getfield g : Le6/b;
      //   30: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   33: astore #5
      //   35: aload #5
      //   37: invokestatic g : (Ljava/lang/Object;)V
      //   40: aload_2
      //   41: aload #5
      //   43: invokevirtual getId : ()I
      //   46: invokevirtual z : (I)Ljava/lang/Object;
      //   49: checkcast com/smartpek/data/local/db/models/Device
      //   52: astore_2
      //   53: goto -> 58
      //   56: aconst_null
      //   57: astore_2
      //   58: aload_0
      //   59: getfield g : Le6/b;
      //   62: astore #5
      //   64: aload_0
      //   65: getfield h : I
      //   68: istore_1
      //   69: aload #5
      //   71: aload_2
      //   72: invokestatic O : (Le6/b;Lcom/smartpek/data/local/db/models/Device;)V
      //   75: aload #5
      //   77: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   80: astore_2
      //   81: aload_2
      //   82: ifnull -> 101
      //   85: aload_2
      //   86: invokevirtual getFlags : ()[Ljava/lang/Integer;
      //   89: astore_2
      //   90: aload_2
      //   91: ifnull -> 101
      //   94: aload_2
      //   95: iconst_0
      //   96: iload_1
      //   97: invokestatic valueOf : (I)Ljava/lang/Integer;
      //   100: aastore
      //   101: aload #4
      //   103: invokevirtual e : ()Lcom/smartpek/data/local/db/DB;
      //   106: astore_2
      //   107: aload_2
      //   108: ifnull -> 139
      //   111: aload_2
      //   112: invokevirtual H : ()Lu4/a;
      //   115: astore_2
      //   116: aload_2
      //   117: ifnull -> 139
      //   120: aload #5
      //   122: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   125: astore #4
      //   127: aload #4
      //   129: invokestatic g : (Ljava/lang/Object;)V
      //   132: aload_2
      //   133: aload #4
      //   135: invokevirtual O : (Ljava/lang/Object;)Ljava/lang/Integer;
      //   138: pop
      //   139: aload_0
      //   140: getfield g : Le6/b;
      //   143: getstatic r4/h.m0 : I
      //   146: invokevirtual J : (I)Landroid/view/View;
      //   149: checkcast com/google/android/material/checkbox/MaterialCheckBox
      //   152: astore_2
      //   153: aload_2
      //   154: ifnull -> 176
      //   157: aload_2
      //   158: new e6/i
      //   161: dup
      //   162: aload_0
      //   163: getfield g : Le6/b;
      //   166: invokespecial <init> : (Le6/b;)V
      //   169: ldc2_w 300
      //   172: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
      //   175: pop
      //   176: aload_0
      //   177: getfield g : Le6/b;
      //   180: invokevirtual getContext : ()Landroid/content/Context;
      //   183: astore_2
      //   184: aload_2
      //   185: ifnull -> 199
      //   188: aload_2
      //   189: ldc 2131951853
      //   191: iconst_0
      //   192: aconst_null
      //   193: bipush #6
      //   195: aconst_null
      //   196: invokestatic k : (Landroid/content/Context;IILjava/lang/Integer;ILjava/lang/Object;)V
      //   199: aload_0
      //   200: getfield g : Le6/b;
      //   203: invokevirtual getActivity : ()Landroidx/fragment/app/e;
      //   206: astore #4
      //   208: aload_3
      //   209: astore_2
      //   210: aload #4
      //   212: ifnull -> 225
      //   215: aload #4
      //   217: iconst_m1
      //   218: invokevirtual setResult : (I)V
      //   221: getstatic e8/q.a : Le8/q;
      //   224: astore_2
      //   225: aload_2
      //   226: areturn
    }
  }
  
  static final class k extends r8.n implements q8.l<View, e8.q> {
    k(q8.p<? super MaterialButton, ? super Integer, e8.q> param1p) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.invoke(param1View, Integer.valueOf(0));
    }
  }
  
  static final class l extends r8.n implements q8.l<View, e8.q> {
    l(q8.p<? super MaterialButton, ? super Integer, e8.q> param1p) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.invoke(param1View, Integer.valueOf(1));
    }
  }
  
  static final class m extends r8.n implements q8.l<View, e8.q> {
    m(q8.p<? super MaterialButton, ? super Integer, e8.q> param1p) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.invoke(param1View, Integer.valueOf(2));
    }
  }
  
  static final class n extends r8.n implements q8.l<View, e8.q> {
    n(q8.p<? super MaterialButton, ? super Integer, e8.q> param1p) {
      super(1);
    }
    
    public final void a(View param1View) {
      r8.m.j(param1View, "it");
      this.g.invoke(param1View, Integer.valueOf(3));
    }
  }
  
  static final class o extends r8.n implements q8.p<MaterialButton, Integer, e8.q> {
    o(b param1b, b.r param1r, int param1Int, Handler param1Handler, q8.q<? super Button, ? super Integer, ? super String, e8.q> param1q, q8.p<? super Integer, ? super MaterialButton, e8.q> param1p) {
      super(2);
    }
    
    public final void a(MaterialButton param1MaterialButton, int param1Int) {
      // Byte code:
      //   0: aload_1
      //   1: ldc 'btn'
      //   3: invokestatic j : (Ljava/lang/Object;Ljava/lang/String;)V
      //   6: aload_0
      //   7: getfield g : Le6/b;
      //   10: getstatic r4/h.y3 : I
      //   13: invokevirtual J : (I)Landroid/view/View;
      //   16: checkcast android/widget/LinearLayout
      //   19: astore #4
      //   21: aload #4
      //   23: ifnonnull -> 29
      //   26: goto -> 36
      //   29: aload #4
      //   31: bipush #8
      //   33: invokevirtual setVisibility : (I)V
      //   36: aload_0
      //   37: getfield h : Le6/b$r;
      //   40: aload_1
      //   41: invokevirtual getText : ()Ljava/lang/CharSequence;
      //   44: invokevirtual toString : ()Ljava/lang/String;
      //   47: invokevirtual a : (Ljava/lang/String;)V
      //   50: aload_0
      //   51: getfield h : Le6/b$r;
      //   54: aload_0
      //   55: getfield i : I
      //   58: invokevirtual b : (I)V
      //   61: aload_0
      //   62: getfield j : Landroid/os/Handler;
      //   65: aload_0
      //   66: getfield h : Le6/b$r;
      //   69: invokevirtual post : (Ljava/lang/Runnable;)Z
      //   72: pop
      //   73: new p6/e
      //   76: dup
      //   77: aload_0
      //   78: getfield g : Le6/b;
      //   81: invokevirtual getActivity : ()Landroidx/fragment/app/e;
      //   84: invokespecial <init> : (Landroid/content/Context;)V
      //   87: astore #4
      //   89: aload_0
      //   90: getfield g : Le6/b;
      //   93: invokestatic N : (Le6/b;)Ljava/lang/String;
      //   96: astore #5
      //   98: new java/lang/StringBuilder
      //   101: dup
      //   102: invokespecial <init> : ()V
      //   105: astore #6
      //   107: aload #6
      //   109: aload #5
      //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   114: pop
      //   115: aload #6
      //   117: ldc 'Device?'
      //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   122: pop
      //   123: aload #4
      //   125: aload #6
      //   127: invokevirtual toString : ()Ljava/lang/String;
      //   130: invokevirtual m : (Ljava/lang/String;)Lp6/e;
      //   133: astore #6
      //   135: aload_0
      //   136: getfield g : Le6/b;
      //   139: astore #4
      //   141: aload_0
      //   142: getfield i : I
      //   145: istore_3
      //   146: aload #6
      //   148: ldc 'CMD'
      //   150: ldc '10'
      //   152: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
      //   155: pop
      //   156: aload #4
      //   158: invokestatic L : (Le6/b;)Lcom/smartpek/data/local/db/models/Device;
      //   161: astore #4
      //   163: aload #4
      //   165: invokestatic g : (Ljava/lang/Object;)V
      //   168: aload #4
      //   170: invokevirtual getPassword : ()Ljava/lang/String;
      //   173: astore #4
      //   175: aload #4
      //   177: ifnull -> 199
      //   180: aload #4
      //   182: invokestatic S0 : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      //   185: invokevirtual toString : ()Ljava/lang/String;
      //   188: astore #5
      //   190: aload #5
      //   192: astore #4
      //   194: aload #5
      //   196: ifnonnull -> 203
      //   199: ldc '123456789'
      //   201: astore #4
      //   203: aload #6
      //   205: ldc 'pass'
      //   207: aload #4
      //   209: invokevirtual h : (Ljava/lang/String;Ljava/lang/String;)Lp6/e;
      //   212: pop
      //   213: aload #6
      //   215: iload_3
      //   216: sipush #1000
      //   219: imul
      //   220: invokevirtual n : (I)Lp6/e;
      //   223: pop
      //   224: aload #6
      //   226: new e6/b$o$a
      //   229: dup
      //   230: aload_0
      //   231: getfield j : Landroid/os/Handler;
      //   234: aload_0
      //   235: getfield h : Le6/b$r;
      //   238: aload_0
      //   239: getfield k : Lq8/q;
      //   242: aload_1
      //   243: iload_2
      //   244: aload_0
      //   245: getfield g : Le6/b;
      //   248: aload_0
      //   249: getfield l : Lq8/p;
      //   252: aload #6
      //   254: invokespecial <init> : (Landroid/os/Handler;Le6/b$r;Lq8/q;Lcom/google/android/material/button/MaterialButton;ILe6/b;Lq8/p;Lp6/e;)V
      //   257: new e6/b$o$b
      //   260: dup
      //   261: aload_0
      //   262: getfield j : Landroid/os/Handler;
      //   265: aload_0
      //   266: getfield h : Le6/b$r;
      //   269: aload_0
      //   270: getfield l : Lq8/p;
      //   273: aload_1
      //   274: invokespecial <init> : (Landroid/os/Handler;Le6/b$r;Lq8/p;Lcom/google/android/material/button/MaterialButton;)V
      //   277: invokevirtual i : (Lq8/l;Lq8/l;)V
      //   280: return
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(Handler param2Handler, b.r param2r, q8.q<? super Button, ? super Integer, ? super String, e8.q> param2q, MaterialButton param2MaterialButton, int param2Int, b param2b, q8.p<? super Integer, ? super MaterialButton, e8.q> param2p, p6.e param2e) {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "response");
        try {
          boolean bool;
          this.g.removeCallbacks(this.h);
          if (param2String.length() > 0) {
            bool = true;
          } else {
            bool = false;
          } 
          if (bool && h0.a(param2String) && q1.c((new JSONObject(param2String)).getString("d")) != 0)
            return; 
          return;
        } finally {
          param2String = null;
          this.m.invoke(Integer.valueOf(2131952122), this.j);
        } 
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(q8.p<? super Integer, ? super MaterialButton, e8.q> param3p, MaterialButton param3MaterialButton, p6.e param3e, b param3b, q8.q<? super Button, ? super Integer, ? super String, e8.q> param3q, int param3Int) {
          super(1);
        }
        
        public final void a(String param3String) {
          if (param3String == null) {
            this.g.invoke(Integer.valueOf(2131952131), this.h);
            return;
          } 
          this.i.h("pass", param3String);
          this.i.i(new a(this.j, this.k, this.h, this.l, this.g, param3String), new b(this.g, this.h));
        }
        
        static final class a extends r8.n implements q8.l<String, e8.q> {
          a(b param4b, q8.q<? super Button, ? super Integer, ? super String, e8.q> param4q, MaterialButton param4MaterialButton, int param4Int, q8.p<? super Integer, ? super MaterialButton, e8.q> param4p, String param4String) {
            super(1);
          }
          
          public final void a(String param4String) {
            r8.m.j(param4String, "response");
            try {
              boolean bool;
              if (param4String.length() > 0) {
                bool = true;
              } else {
                bool = false;
              } 
              Device device = null;
              if (bool && h0.a(param4String) && q1.c((new JSONObject(param4String)).getString("d")) != 0) {
                App.a a1 = App.g;
                DB dB2 = a1.e();
                Device device1 = device;
                if (dB2 != null) {
                  u4.a a2 = dB2.H();
                  device1 = device;
                  if (a2 != null) {
                    device1 = b.L(this.g);
                    r8.m.g(device1);
                    device1 = (Device)a2.z(device1.getId());
                  } 
                } 
                b b1 = this.g;
                String str = this.l;
                b.O(b1, device1);
                device1 = b.L(b1);
                if (device1 != null)
                  device1.setPassword(str); 
                DB dB1 = a1.e();
                return;
              } 
              return;
            } finally {
              param4String = null;
              this.k.invoke(Integer.valueOf(2131952122), this.i);
            } 
          }
        }
        
        static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
          b(q8.p<? super Integer, ? super MaterialButton, e8.q> param4p, MaterialButton param4MaterialButton) {
            super(1);
          }
          
          public final void a(VolleyError param4VolleyError) {
            r8.m.j(param4VolleyError, "it");
            this.g.invoke(Integer.valueOf(2131952122), this.h);
          }
        }
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(b param3b, q8.q<? super Button, ? super Integer, ? super String, e8.q> param3q, MaterialButton param3MaterialButton, int param3Int, q8.p<? super Integer, ? super MaterialButton, e8.q> param3p, String param3String) {
          super(1);
        }
        
        public final void a(String param3String) {
          r8.m.j(param3String, "response");
          try {
            boolean bool;
            if (param3String.length() > 0) {
              bool = true;
            } else {
              bool = false;
            } 
            Device device = null;
            if (bool && h0.a(param3String) && q1.c((new JSONObject(param3String)).getString("d")) != 0) {
              App.a a1 = App.g;
              DB dB2 = a1.e();
              Device device1 = device;
              if (dB2 != null) {
                u4.a a2 = dB2.H();
                device1 = device;
                if (a2 != null) {
                  device1 = b.L(this.g);
                  r8.m.g(device1);
                  device1 = (Device)a2.z(device1.getId());
                } 
              } 
              b b1 = this.g;
              String str = this.l;
              b.O(b1, device1);
              device1 = b.L(b1);
              if (device1 != null)
                device1.setPassword(str); 
              DB dB1 = a1.e();
              return;
            } 
            return;
          } finally {
            param3String = null;
            this.k.invoke(Integer.valueOf(2131952122), this.i);
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.p<? super Integer, ? super MaterialButton, e8.q> param3p, MaterialButton param3MaterialButton) {
          super(1);
        }
        
        public final void a(VolleyError param3VolleyError) {
          r8.m.j(param3VolleyError, "it");
          this.g.invoke(Integer.valueOf(2131952122), this.h);
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(q8.p<? super Integer, ? super MaterialButton, e8.q> param2p, MaterialButton param2MaterialButton, p6.e param2e, b param2b, q8.q<? super Button, ? super Integer, ? super String, e8.q> param2q, int param2Int) {
        super(1);
      }
      
      public final void a(String param2String) {
        if (param2String == null) {
          this.g.invoke(Integer.valueOf(2131952131), this.h);
          return;
        } 
        this.i.h("pass", param2String);
        this.i.i(new a(this.j, this.k, this.h, this.l, this.g, param2String), new b(this.g, this.h));
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(b param4b, q8.q<? super Button, ? super Integer, ? super String, e8.q> param4q, MaterialButton param4MaterialButton, int param4Int, q8.p<? super Integer, ? super MaterialButton, e8.q> param4p, String param4String) {
          super(1);
        }
        
        public final void a(String param4String) {
          r8.m.j(param4String, "response");
          try {
            boolean bool;
            if (param4String.length() > 0) {
              bool = true;
            } else {
              bool = false;
            } 
            Device device = null;
            if (bool && h0.a(param4String) && q1.c((new JSONObject(param4String)).getString("d")) != 0) {
              App.a a1 = App.g;
              DB dB2 = a1.e();
              Device device1 = device;
              if (dB2 != null) {
                u4.a a2 = dB2.H();
                device1 = device;
                if (a2 != null) {
                  device1 = b.L(this.g);
                  r8.m.g(device1);
                  device1 = (Device)a2.z(device1.getId());
                } 
              } 
              b b1 = this.g;
              String str = this.l;
              b.O(b1, device1);
              device1 = b.L(b1);
              if (device1 != null)
                device1.setPassword(str); 
              DB dB1 = a1.e();
              return;
            } 
            return;
          } finally {
            param4String = null;
            this.k.invoke(Integer.valueOf(2131952122), this.i);
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.p<? super Integer, ? super MaterialButton, e8.q> param4p, MaterialButton param4MaterialButton) {
          super(1);
        }
        
        public final void a(VolleyError param4VolleyError) {
          r8.m.j(param4VolleyError, "it");
          this.g.invoke(Integer.valueOf(2131952122), this.h);
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(b param2b, q8.q<? super Button, ? super Integer, ? super String, e8.q> param2q, MaterialButton param2MaterialButton, int param2Int, q8.p<? super Integer, ? super MaterialButton, e8.q> param2p, String param2String) {
        super(1);
      }
      
      public final void a(String param2String) {
        r8.m.j(param2String, "response");
        try {
          boolean bool;
          if (param2String.length() > 0) {
            bool = true;
          } else {
            bool = false;
          } 
          Device device = null;
          if (bool && h0.a(param2String) && q1.c((new JSONObject(param2String)).getString("d")) != 0) {
            App.a a1 = App.g;
            DB dB2 = a1.e();
            Device device1 = device;
            if (dB2 != null) {
              u4.a a2 = dB2.H();
              device1 = device;
              if (a2 != null) {
                device1 = b.L(this.g);
                r8.m.g(device1);
                device1 = (Device)a2.z(device1.getId());
              } 
            } 
            b b1 = this.g;
            String str = this.l;
            b.O(b1, device1);
            device1 = b.L(b1);
            if (device1 != null)
              device1.setPassword(str); 
            DB dB1 = a1.e();
            return;
          } 
          return;
        } finally {
          param2String = null;
          this.k.invoke(Integer.valueOf(2131952122), this.i);
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.p<? super Integer, ? super MaterialButton, e8.q> param2p, MaterialButton param2MaterialButton) {
        super(1);
      }
      
      public final void a(VolleyError param2VolleyError) {
        r8.m.j(param2VolleyError, "it");
        this.g.invoke(Integer.valueOf(2131952122), this.h);
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(Handler param2Handler, b.r param2r, q8.p<? super Integer, ? super MaterialButton, e8.q> param2p, MaterialButton param2MaterialButton) {
        super(1);
      }
      
      public final void a(VolleyError param2VolleyError) {
        r8.m.j(param2VolleyError, "it");
        this.g.removeCallbacks(this.h);
        this.i.invoke(Integer.valueOf(2131952122), this.j);
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(Handler param1Handler, b.r param1r, q8.q<? super Button, ? super Integer, ? super String, e8.q> param1q, MaterialButton param1MaterialButton, int param1Int, b param1b, q8.p<? super Integer, ? super MaterialButton, e8.q> param1p, p6.e param1e) {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "response");
      try {
        boolean bool;
        this.g.removeCallbacks(this.h);
        if (param1String.length() > 0) {
          bool = true;
        } else {
          bool = false;
        } 
        if (bool && h0.a(param1String) && q1.c((new JSONObject(param1String)).getString("d")) != 0)
          return; 
        return;
      } finally {
        param1String = null;
        this.m.invoke(Integer.valueOf(2131952122), this.j);
      } 
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(q8.p<? super Integer, ? super MaterialButton, e8.q> param3p, MaterialButton param3MaterialButton, p6.e param3e, b param3b, q8.q<? super Button, ? super Integer, ? super String, e8.q> param3q, int param3Int) {
        super(1);
      }
      
      public final void a(String param3String) {
        if (param3String == null) {
          this.g.invoke(Integer.valueOf(2131952131), this.h);
          return;
        } 
        this.i.h("pass", param3String);
        this.i.i(new a(this.j, this.k, this.h, this.l, this.g, param3String), new b(this.g, this.h));
      }
      
      static final class a extends r8.n implements q8.l<String, e8.q> {
        a(b param4b, q8.q<? super Button, ? super Integer, ? super String, e8.q> param4q, MaterialButton param4MaterialButton, int param4Int, q8.p<? super Integer, ? super MaterialButton, e8.q> param4p, String param4String) {
          super(1);
        }
        
        public final void a(String param4String) {
          r8.m.j(param4String, "response");
          try {
            boolean bool;
            if (param4String.length() > 0) {
              bool = true;
            } else {
              bool = false;
            } 
            Device device = null;
            if (bool && h0.a(param4String) && q1.c((new JSONObject(param4String)).getString("d")) != 0) {
              App.a a1 = App.g;
              DB dB2 = a1.e();
              Device device1 = device;
              if (dB2 != null) {
                u4.a a2 = dB2.H();
                device1 = device;
                if (a2 != null) {
                  device1 = b.L(this.g);
                  r8.m.g(device1);
                  device1 = (Device)a2.z(device1.getId());
                } 
              } 
              b b1 = this.g;
              String str = this.l;
              b.O(b1, device1);
              device1 = b.L(b1);
              if (device1 != null)
                device1.setPassword(str); 
              DB dB1 = a1.e();
              return;
            } 
            return;
          } finally {
            param4String = null;
            this.k.invoke(Integer.valueOf(2131952122), this.i);
          } 
        }
      }
      
      static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
        b(q8.p<? super Integer, ? super MaterialButton, e8.q> param4p, MaterialButton param4MaterialButton) {
          super(1);
        }
        
        public final void a(VolleyError param4VolleyError) {
          r8.m.j(param4VolleyError, "it");
          this.g.invoke(Integer.valueOf(2131952122), this.h);
        }
      }
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(b param3b, q8.q<? super Button, ? super Integer, ? super String, e8.q> param3q, MaterialButton param3MaterialButton, int param3Int, q8.p<? super Integer, ? super MaterialButton, e8.q> param3p, String param3String) {
        super(1);
      }
      
      public final void a(String param3String) {
        r8.m.j(param3String, "response");
        try {
          boolean bool;
          if (param3String.length() > 0) {
            bool = true;
          } else {
            bool = false;
          } 
          Device device = null;
          if (bool && h0.a(param3String) && q1.c((new JSONObject(param3String)).getString("d")) != 0) {
            App.a a1 = App.g;
            DB dB2 = a1.e();
            Device device1 = device;
            if (dB2 != null) {
              u4.a a2 = dB2.H();
              device1 = device;
              if (a2 != null) {
                device1 = b.L(this.g);
                r8.m.g(device1);
                device1 = (Device)a2.z(device1.getId());
              } 
            } 
            b b1 = this.g;
            String str = this.l;
            b.O(b1, device1);
            device1 = b.L(b1);
            if (device1 != null)
              device1.setPassword(str); 
            DB dB1 = a1.e();
            return;
          } 
          return;
        } finally {
          param3String = null;
          this.k.invoke(Integer.valueOf(2131952122), this.i);
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.p<? super Integer, ? super MaterialButton, e8.q> param3p, MaterialButton param3MaterialButton) {
        super(1);
      }
      
      public final void a(VolleyError param3VolleyError) {
        r8.m.j(param3VolleyError, "it");
        this.g.invoke(Integer.valueOf(2131952122), this.h);
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(q8.p<? super Integer, ? super MaterialButton, e8.q> param1p, MaterialButton param1MaterialButton, p6.e param1e, b param1b, q8.q<? super Button, ? super Integer, ? super String, e8.q> param1q, int param1Int) {
      super(1);
    }
    
    public final void a(String param1String) {
      if (param1String == null) {
        this.g.invoke(Integer.valueOf(2131952131), this.h);
        return;
      } 
      this.i.h("pass", param1String);
      this.i.i(new a(this.j, this.k, this.h, this.l, this.g, param1String), new b(this.g, this.h));
    }
    
    static final class a extends r8.n implements q8.l<String, e8.q> {
      a(b param4b, q8.q<? super Button, ? super Integer, ? super String, e8.q> param4q, MaterialButton param4MaterialButton, int param4Int, q8.p<? super Integer, ? super MaterialButton, e8.q> param4p, String param4String) {
        super(1);
      }
      
      public final void a(String param4String) {
        r8.m.j(param4String, "response");
        try {
          boolean bool;
          if (param4String.length() > 0) {
            bool = true;
          } else {
            bool = false;
          } 
          Device device = null;
          if (bool && h0.a(param4String) && q1.c((new JSONObject(param4String)).getString("d")) != 0) {
            App.a a1 = App.g;
            DB dB2 = a1.e();
            Device device1 = device;
            if (dB2 != null) {
              u4.a a2 = dB2.H();
              device1 = device;
              if (a2 != null) {
                device1 = b.L(this.g);
                r8.m.g(device1);
                device1 = (Device)a2.z(device1.getId());
              } 
            } 
            b b1 = this.g;
            String str = this.l;
            b.O(b1, device1);
            device1 = b.L(b1);
            if (device1 != null)
              device1.setPassword(str); 
            DB dB1 = a1.e();
            return;
          } 
          return;
        } finally {
          param4String = null;
          this.k.invoke(Integer.valueOf(2131952122), this.i);
        } 
      }
    }
    
    static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
      b(q8.p<? super Integer, ? super MaterialButton, e8.q> param4p, MaterialButton param4MaterialButton) {
        super(1);
      }
      
      public final void a(VolleyError param4VolleyError) {
        r8.m.j(param4VolleyError, "it");
        this.g.invoke(Integer.valueOf(2131952122), this.h);
      }
    }
  }
  
  static final class a extends r8.n implements q8.l<String, e8.q> {
    a(b param1b, q8.q<? super Button, ? super Integer, ? super String, e8.q> param1q, MaterialButton param1MaterialButton, int param1Int, q8.p<? super Integer, ? super MaterialButton, e8.q> param1p, String param1String) {
      super(1);
    }
    
    public final void a(String param1String) {
      r8.m.j(param1String, "response");
      try {
        boolean bool;
        if (param1String.length() > 0) {
          bool = true;
        } else {
          bool = false;
        } 
        Device device = null;
        if (bool && h0.a(param1String) && q1.c((new JSONObject(param1String)).getString("d")) != 0) {
          App.a a1 = App.g;
          DB dB2 = a1.e();
          Device device1 = device;
          if (dB2 != null) {
            u4.a a2 = dB2.H();
            device1 = device;
            if (a2 != null) {
              device1 = b.L(this.g);
              r8.m.g(device1);
              device1 = (Device)a2.z(device1.getId());
            } 
          } 
          b b1 = this.g;
          String str = this.l;
          b.O(b1, device1);
          device1 = b.L(b1);
          if (device1 != null)
            device1.setPassword(str); 
          DB dB1 = a1.e();
          return;
        } 
        return;
      } finally {
        param1String = null;
        this.k.invoke(Integer.valueOf(2131952122), this.i);
      } 
    }
  }
  
  static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
    b(q8.p<? super Integer, ? super MaterialButton, e8.q> param1p, MaterialButton param1MaterialButton) {
      super(1);
    }
    
    public final void a(VolleyError param1VolleyError) {
      r8.m.j(param1VolleyError, "it");
      this.g.invoke(Integer.valueOf(2131952122), this.h);
    }
  }
  
  static final class b extends r8.n implements q8.l<VolleyError, e8.q> {
    b(Handler param1Handler, b.r param1r, q8.p<? super Integer, ? super MaterialButton, e8.q> param1p, MaterialButton param1MaterialButton) {
      super(1);
    }
    
    public final void a(VolleyError param1VolleyError) {
      r8.m.j(param1VolleyError, "it");
      this.g.removeCallbacks(this.h);
      this.i.invoke(Integer.valueOf(2131952122), this.j);
    }
  }
  
  static final class p extends r8.n implements q8.p<Integer, MaterialButton, e8.q> {
    p(b param1b) {
      super(2);
    }
    
    public final void a(int param1Int, MaterialButton param1MaterialButton) {
      r8.m.j(param1MaterialButton, "btn");
      try {
        Context context = this.g.getContext();
        MaterialButton materialButton = null;
        if (context != null) {
          ColorStateList colorStateList = c1.d(c1.a(context, 2131099858));
        } else {
          context = null;
        } 
        e1.C0((View)param1MaterialButton, (ColorStateList)context);
        AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.J(r4.h.E6);
        if (appCompatTextView != null) {
          String str;
          Context context1 = this.g.getContext();
          param1MaterialButton = materialButton;
          if (context1 != null)
            str = c1.g(context1, param1Int); 
          appCompatTextView.setText(str);
        } 
        return;
      } finally {
        param1MaterialButton = null;
      } 
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(b param2b) {
        super(0);
      }
      
      public final void invoke() {
        LinearLayout linearLayout = (LinearLayout)this.g.J(r4.h.y3);
        if (linearLayout != null)
          linearLayout.setVisibility(0); 
        AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.J(r4.h.E6);
        if (appCompatTextView == null)
          return; 
        appCompatTextView.setVisibility(8);
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<e8.q> {
    a(b param1b) {
      super(0);
    }
    
    public final void invoke() {
      LinearLayout linearLayout = (LinearLayout)this.g.J(r4.h.y3);
      if (linearLayout != null)
        linearLayout.setVisibility(0); 
      AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.J(r4.h.E6);
      if (appCompatTextView == null)
        return; 
      appCompatTextView.setVisibility(8);
    }
  }
  
  static final class q extends r8.n implements q8.q<Button, Integer, String, e8.q> {
    q(b param1b) {
      super(3);
    }
    
    public final void a(Button param1Button, int param1Int, String param1String) {
      r8.m.j(param1Button, "btn");
      r8.m.j(param1String, "response");
      try {
        Context context = this.g.getContext();
        Button button = null;
        if (context != null) {
          ColorStateList colorStateList = c1.d(c1.a(context, 2131099863));
        } else {
          context = null;
        } 
        e1.C0((View)param1Button, (ColorStateList)context);
        AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.J(r4.h.E6);
        if (appCompatTextView != null) {
          Context context1 = this.g.getContext();
          if (context1 != null) {
            String str = c1.g(context1, 2131951853);
          } else {
            context1 = null;
          } 
          appCompatTextView.setText((CharSequence)context1);
        } 
        c0.l(2000, new a(this.g));
        Device device = b.L(this.g);
        param1Button = button;
      } finally {
        param1Button = null;
      } 
      if (param1Button != null)
        param1Button.setCustomCode(param1String); 
      DB dB = App.g.e();
      if (dB != null) {
        u4.a a = dB.H();
        if (a != null) {
          Device device = b.L(this.g);
          r8.m.g(device);
          a.O(device);
        } 
      } 
      androidx.fragment.app.e e = this.g.getActivity();
      if (e != null)
        e.setResult(-1); 
    }
    
    static final class a extends r8.n implements q8.a<e8.q> {
      a(b param2b) {
        super(0);
      }
      
      public final void invoke() {
        LinearLayout linearLayout = (LinearLayout)this.g.J(r4.h.y3);
        if (linearLayout != null)
          linearLayout.setVisibility(0); 
        AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.J(r4.h.E6);
        if (appCompatTextView == null)
          return; 
        appCompatTextView.setVisibility(8);
      }
    }
  }
  
  static final class a extends r8.n implements q8.a<e8.q> {
    a(b param1b) {
      super(0);
    }
    
    public final void invoke() {
      LinearLayout linearLayout = (LinearLayout)this.g.J(r4.h.y3);
      if (linearLayout != null)
        linearLayout.setVisibility(0); 
      AppCompatTextView appCompatTextView = (AppCompatTextView)this.g.J(r4.h.E6);
      if (appCompatTextView == null)
        return; 
      appCompatTextView.setVisibility(8);
    }
  }
  
  public static final class r implements Runnable {
    private String g = "";
    
    private int h;
    
    r(b param1b, Handler param1Handler) {}
    
    public final void a(String param1String) {
      r8.m.j(param1String, "<set-?>");
      this.g = param1String;
    }
    
    public final void b(int param1Int) {
      this.h = param1Int;
    }
    
    public void run() {
      String str;
      b b1 = this.i;
      int i = r4.h.E6;
      AppCompatTextView appCompatTextView1 = (AppCompatTextView)b1.J(i);
      if (appCompatTextView1 != null)
        appCompatTextView1.setVisibility(0); 
      AppCompatTextView appCompatTextView3 = (AppCompatTextView)this.i.J(i);
      AppCompatTextView appCompatTextView2 = null;
      if (appCompatTextView3 != null) {
        Context context1 = this.i.getContext();
        if (context1 != null) {
          str = c1.g(context1, 2131952152);
        } else {
          context1 = null;
        } 
        int k = this.h;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)context1);
        stringBuilder.append(" ");
        stringBuilder.append(k);
        appCompatTextView3.setText(stringBuilder.toString());
      } 
      int j = this.h - 1;
      this.h = j;
      if (j > 0) {
        this.j.postDelayed(this, 1000L);
        return;
      } 
      appCompatTextView3 = (AppCompatTextView)this.i.J(i);
      if (appCompatTextView3 == null)
        return; 
      Context context = this.i.getContext();
      appCompatTextView1 = appCompatTextView2;
      if (context != null)
        str = c1.g(context, 2131952152); 
      appCompatTextView3.setText(str);
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e6\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */