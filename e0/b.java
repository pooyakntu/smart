package e0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public class b {
  public static final int[] A;
  
  public static final int[] B;
  
  static final byte[] C;
  
  private static final byte[] D;
  
  private static final byte[] E;
  
  private static final byte[] F;
  
  private static final byte[] G;
  
  private static final byte[] H;
  
  private static final byte[] I;
  
  private static final byte[] J;
  
  private static final byte[] K;
  
  private static final byte[] L;
  
  private static final byte[] M;
  
  private static final byte[] N;
  
  private static final byte[] O;
  
  private static final byte[] P;
  
  private static final byte[] Q;
  
  private static final byte[] R;
  
  private static final byte[] S;
  
  private static final byte[] T;
  
  private static final byte[] U;
  
  private static final byte[] V;
  
  private static SimpleDateFormat W;
  
  static final String[] X;
  
  static final int[] Y;
  
  static final byte[] Z;
  
  private static final d[] a0;
  
  private static final d[] b0;
  
  private static final d[] c0;
  
  private static final d[] d0;
  
  private static final d[] e0;
  
  private static final d f0;
  
  private static final d[] g0;
  
  private static final d[] h0;
  
  private static final d[] i0;
  
  private static final d[] j0;
  
  static final d[][] k0;
  
  private static final d[] l0;
  
  private static final d m0;
  
  private static final d n0;
  
  private static final HashMap<Integer, d>[] o0;
  
  private static final HashMap<String, d>[] p0;
  
  private static final HashSet<String> q0;
  
  private static final HashMap<Integer, Integer> r0;
  
  static final Charset s0;
  
  static final byte[] t0;
  
  private static final byte[] u0;
  
  private static final Pattern v0;
  
  private static final boolean w = Log.isLoggable("ExifInterface", 3);
  
  private static final Pattern w0;
  
  private static final List<Integer> x;
  
  private static final List<Integer> y;
  
  public static final int[] z = new int[] { 8, 8, 8 };
  
  private String a;
  
  private FileDescriptor b;
  
  private AssetManager.AssetInputStream c;
  
  private int d;
  
  private boolean e;
  
  private final HashMap<String, c>[] f;
  
  private Set<Integer> g;
  
  private ByteOrder h;
  
  private boolean i;
  
  private boolean j;
  
  private boolean k;
  
  private int l;
  
  private int m;
  
  private byte[] n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private int t;
  
  private boolean u;
  
  private boolean v;
  
  static {
    A = new int[] { 4 };
    B = new int[] { 8 };
    C = new byte[] { -1, -40, -1 };
    D = new byte[] { 102, 116, 121, 112 };
    E = new byte[] { 109, 105, 102, 49 };
    F = new byte[] { 104, 101, 105, 99 };
    G = new byte[] { 79, 76, 89, 77, 80, 0 };
    H = new byte[] { 79, 76, 89, 77, 80, 85, 83, 0, 73, 73 };
    I = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
    J = new byte[] { 101, 88, 73, 102 };
    K = new byte[] { 73, 72, 68, 82 };
    L = new byte[] { 73, 69, 78, 68 };
    M = new byte[] { 82, 73, 70, 70 };
    N = new byte[] { 87, 69, 66, 80 };
    O = new byte[] { 69, 88, 73, 70 };
    P = new byte[] { -99, 1, 42 };
    Q = "VP8X".getBytes(Charset.defaultCharset());
    R = "VP8L".getBytes(Charset.defaultCharset());
    S = "VP8 ".getBytes(Charset.defaultCharset());
    T = "ANIM".getBytes(Charset.defaultCharset());
    U = "ANMF".getBytes(Charset.defaultCharset());
    V = "XMP ".getBytes(Charset.defaultCharset());
    X = new String[] { 
        "", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", 
        "SRATIONAL", "SINGLE", "DOUBLE", "IFD" };
    Y = new int[] { 
        0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 
        8, 4, 8, 1 };
    Z = new byte[] { 65, 83, 67, 73, 73, 0, 0, 0 };
    d[] arrayOfD1 = new d[42];
    arrayOfD1[0] = new d("NewSubfileType", 254, 4);
    arrayOfD1[1] = new d("SubfileType", 255, 4);
    arrayOfD1[2] = new d("ImageWidth", 256, 3, 4);
    arrayOfD1[3] = new d("ImageLength", 257, 3, 4);
    arrayOfD1[4] = new d("BitsPerSample", 258, 3);
    arrayOfD1[5] = new d("Compression", 259, 3);
    arrayOfD1[6] = new d("PhotometricInterpretation", 262, 3);
    arrayOfD1[7] = new d("ImageDescription", 270, 2);
    arrayOfD1[8] = new d("Make", 271, 2);
    arrayOfD1[9] = new d("Model", 272, 2);
    arrayOfD1[10] = new d("StripOffsets", 273, 3, 4);
    arrayOfD1[11] = new d("Orientation", 274, 3);
    arrayOfD1[12] = new d("SamplesPerPixel", 277, 3);
    arrayOfD1[13] = new d("RowsPerStrip", 278, 3, 4);
    arrayOfD1[14] = new d("StripByteCounts", 279, 3, 4);
    arrayOfD1[15] = new d("XResolution", 282, 5);
    arrayOfD1[16] = new d("YResolution", 283, 5);
    arrayOfD1[17] = new d("PlanarConfiguration", 284, 3);
    arrayOfD1[18] = new d("ResolutionUnit", 296, 3);
    arrayOfD1[19] = new d("TransferFunction", 301, 3);
    arrayOfD1[20] = new d("Software", 305, 2);
    arrayOfD1[21] = new d("DateTime", 306, 2);
    arrayOfD1[22] = new d("Artist", 315, 2);
    arrayOfD1[23] = new d("WhitePoint", 318, 5);
    arrayOfD1[24] = new d("PrimaryChromaticities", 319, 5);
    arrayOfD1[25] = new d("SubIFDPointer", 330, 4);
    arrayOfD1[26] = new d("JPEGInterchangeFormat", 513, 4);
    arrayOfD1[27] = new d("JPEGInterchangeFormatLength", 514, 4);
    arrayOfD1[28] = new d("YCbCrCoefficients", 529, 5);
    arrayOfD1[29] = new d("YCbCrSubSampling", 530, 3);
    arrayOfD1[30] = new d("YCbCrPositioning", 531, 3);
    arrayOfD1[31] = new d("ReferenceBlackWhite", 532, 5);
    arrayOfD1[32] = new d("Copyright", 33432, 2);
    arrayOfD1[33] = new d("ExifIFDPointer", 34665, 4);
    arrayOfD1[34] = new d("GPSInfoIFDPointer", 34853, 4);
    arrayOfD1[35] = new d("SensorTopBorder", 4, 4);
    arrayOfD1[36] = new d("SensorLeftBorder", 5, 4);
    arrayOfD1[37] = new d("SensorBottomBorder", 6, 4);
    arrayOfD1[38] = new d("SensorRightBorder", 7, 4);
    arrayOfD1[39] = new d("ISO", 23, 3);
    arrayOfD1[40] = new d("JpgFromRaw", 46, 7);
    arrayOfD1[41] = new d("Xmp", 700, 1);
    a0 = arrayOfD1;
    d[] arrayOfD2 = new d[74];
    arrayOfD2[0] = new d("ExposureTime", 33434, 5);
    arrayOfD2[1] = new d("FNumber", 33437, 5);
    arrayOfD2[2] = new d("ExposureProgram", 34850, 3);
    arrayOfD2[3] = new d("SpectralSensitivity", 34852, 2);
    arrayOfD2[4] = new d("PhotographicSensitivity", 34855, 3);
    arrayOfD2[5] = new d("OECF", 34856, 7);
    arrayOfD2[6] = new d("SensitivityType", 34864, 3);
    arrayOfD2[7] = new d("StandardOutputSensitivity", 34865, 4);
    arrayOfD2[8] = new d("RecommendedExposureIndex", 34866, 4);
    arrayOfD2[9] = new d("ISOSpeed", 34867, 4);
    arrayOfD2[10] = new d("ISOSpeedLatitudeyyy", 34868, 4);
    arrayOfD2[11] = new d("ISOSpeedLatitudezzz", 34869, 4);
    arrayOfD2[12] = new d("ExifVersion", 36864, 2);
    arrayOfD2[13] = new d("DateTimeOriginal", 36867, 2);
    arrayOfD2[14] = new d("DateTimeDigitized", 36868, 2);
    arrayOfD2[15] = new d("OffsetTime", 36880, 2);
    arrayOfD2[16] = new d("OffsetTimeOriginal", 36881, 2);
    arrayOfD2[17] = new d("OffsetTimeDigitized", 36882, 2);
    arrayOfD2[18] = new d("ComponentsConfiguration", 37121, 7);
    arrayOfD2[19] = new d("CompressedBitsPerPixel", 37122, 5);
    arrayOfD2[20] = new d("ShutterSpeedValue", 37377, 10);
    arrayOfD2[21] = new d("ApertureValue", 37378, 5);
    arrayOfD2[22] = new d("BrightnessValue", 37379, 10);
    arrayOfD2[23] = new d("ExposureBiasValue", 37380, 10);
    arrayOfD2[24] = new d("MaxApertureValue", 37381, 5);
    arrayOfD2[25] = new d("SubjectDistance", 37382, 5);
    arrayOfD2[26] = new d("MeteringMode", 37383, 3);
    arrayOfD2[27] = new d("LightSource", 37384, 3);
    arrayOfD2[28] = new d("Flash", 37385, 3);
    arrayOfD2[29] = new d("FocalLength", 37386, 5);
    arrayOfD2[30] = new d("SubjectArea", 37396, 3);
    arrayOfD2[31] = new d("MakerNote", 37500, 7);
    arrayOfD2[32] = new d("UserComment", 37510, 7);
    arrayOfD2[33] = new d("SubSecTime", 37520, 2);
    arrayOfD2[34] = new d("SubSecTimeOriginal", 37521, 2);
    arrayOfD2[35] = new d("SubSecTimeDigitized", 37522, 2);
    arrayOfD2[36] = new d("FlashpixVersion", 40960, 7);
    arrayOfD2[37] = new d("ColorSpace", 40961, 3);
    arrayOfD2[38] = new d("PixelXDimension", 40962, 3, 4);
    arrayOfD2[39] = new d("PixelYDimension", 40963, 3, 4);
    arrayOfD2[40] = new d("RelatedSoundFile", 40964, 2);
    arrayOfD2[41] = new d("InteroperabilityIFDPointer", 40965, 4);
    arrayOfD2[42] = new d("FlashEnergy", 41483, 5);
    arrayOfD2[43] = new d("SpatialFrequencyResponse", 41484, 7);
    arrayOfD2[44] = new d("FocalPlaneXResolution", 41486, 5);
    arrayOfD2[45] = new d("FocalPlaneYResolution", 41487, 5);
    arrayOfD2[46] = new d("FocalPlaneResolutionUnit", 41488, 3);
    arrayOfD2[47] = new d("SubjectLocation", 41492, 3);
    arrayOfD2[48] = new d("ExposureIndex", 41493, 5);
    arrayOfD2[49] = new d("SensingMethod", 41495, 3);
    arrayOfD2[50] = new d("FileSource", 41728, 7);
    arrayOfD2[51] = new d("SceneType", 41729, 7);
    arrayOfD2[52] = new d("CFAPattern", 41730, 7);
    arrayOfD2[53] = new d("CustomRendered", 41985, 3);
    arrayOfD2[54] = new d("ExposureMode", 41986, 3);
    arrayOfD2[55] = new d("WhiteBalance", 41987, 3);
    arrayOfD2[56] = new d("DigitalZoomRatio", 41988, 5);
    arrayOfD2[57] = new d("FocalLengthIn35mmFilm", 41989, 3);
    arrayOfD2[58] = new d("SceneCaptureType", 41990, 3);
    arrayOfD2[59] = new d("GainControl", 41991, 3);
    arrayOfD2[60] = new d("Contrast", 41992, 3);
    arrayOfD2[61] = new d("Saturation", 41993, 3);
    arrayOfD2[62] = new d("Sharpness", 41994, 3);
    arrayOfD2[63] = new d("DeviceSettingDescription", 41995, 7);
    arrayOfD2[64] = new d("SubjectDistanceRange", 41996, 3);
    arrayOfD2[65] = new d("ImageUniqueID", 42016, 2);
    arrayOfD2[66] = new d("CameraOwnerName", 42032, 2);
    arrayOfD2[67] = new d("BodySerialNumber", 42033, 2);
    arrayOfD2[68] = new d("LensSpecification", 42034, 5);
    arrayOfD2[69] = new d("LensMake", 42035, 2);
    arrayOfD2[70] = new d("LensModel", 42036, 2);
    arrayOfD2[71] = new d("Gamma", 42240, 5);
    arrayOfD2[72] = new d("DNGVersion", 50706, 1);
    arrayOfD2[73] = new d("DefaultCropSize", 50720, 3, 4);
    b0 = arrayOfD2;
    d[] arrayOfD3 = new d[32];
    arrayOfD3[0] = new d("GPSVersionID", 0, 1);
    arrayOfD3[1] = new d("GPSLatitudeRef", 1, 2);
    arrayOfD3[2] = new d("GPSLatitude", 2, 5);
    arrayOfD3[3] = new d("GPSLongitudeRef", 3, 2);
    arrayOfD3[4] = new d("GPSLongitude", 4, 5);
    arrayOfD3[5] = new d("GPSAltitudeRef", 5, 1);
    arrayOfD3[6] = new d("GPSAltitude", 6, 5);
    arrayOfD3[7] = new d("GPSTimeStamp", 7, 5);
    arrayOfD3[8] = new d("GPSSatellites", 8, 2);
    arrayOfD3[9] = new d("GPSStatus", 9, 2);
    arrayOfD3[10] = new d("GPSMeasureMode", 10, 2);
    arrayOfD3[11] = new d("GPSDOP", 11, 5);
    arrayOfD3[12] = new d("GPSSpeedRef", 12, 2);
    arrayOfD3[13] = new d("GPSSpeed", 13, 5);
    arrayOfD3[14] = new d("GPSTrackRef", 14, 2);
    arrayOfD3[15] = new d("GPSTrack", 15, 5);
    arrayOfD3[16] = new d("GPSImgDirectionRef", 16, 2);
    arrayOfD3[17] = new d("GPSImgDirection", 17, 5);
    arrayOfD3[18] = new d("GPSMapDatum", 18, 2);
    arrayOfD3[19] = new d("GPSDestLatitudeRef", 19, 2);
    arrayOfD3[20] = new d("GPSDestLatitude", 20, 5);
    arrayOfD3[21] = new d("GPSDestLongitudeRef", 21, 2);
    arrayOfD3[22] = new d("GPSDestLongitude", 22, 5);
    arrayOfD3[23] = new d("GPSDestBearingRef", 23, 2);
    arrayOfD3[24] = new d("GPSDestBearing", 24, 5);
    arrayOfD3[25] = new d("GPSDestDistanceRef", 25, 2);
    arrayOfD3[26] = new d("GPSDestDistance", 26, 5);
    arrayOfD3[27] = new d("GPSProcessingMethod", 27, 7);
    arrayOfD3[28] = new d("GPSAreaInformation", 28, 7);
    arrayOfD3[29] = new d("GPSDateStamp", 29, 2);
    arrayOfD3[30] = new d("GPSDifferential", 30, 3);
    arrayOfD3[31] = new d("GPSHPositioningError", 31, 5);
    c0 = arrayOfD3;
    d[] arrayOfD4 = new d[1];
    arrayOfD4[0] = new d("InteroperabilityIndex", 1, 2);
    d0 = arrayOfD4;
    d[] arrayOfD5 = new d[37];
    arrayOfD5[0] = new d("NewSubfileType", 254, 4);
    arrayOfD5[1] = new d("SubfileType", 255, 4);
    arrayOfD5[2] = new d("ThumbnailImageWidth", 256, 3, 4);
    arrayOfD5[3] = new d("ThumbnailImageLength", 257, 3, 4);
    arrayOfD5[4] = new d("BitsPerSample", 258, 3);
    arrayOfD5[5] = new d("Compression", 259, 3);
    arrayOfD5[6] = new d("PhotometricInterpretation", 262, 3);
    arrayOfD5[7] = new d("ImageDescription", 270, 2);
    arrayOfD5[8] = new d("Make", 271, 2);
    arrayOfD5[9] = new d("Model", 272, 2);
    arrayOfD5[10] = new d("StripOffsets", 273, 3, 4);
    arrayOfD5[11] = new d("ThumbnailOrientation", 274, 3);
    arrayOfD5[12] = new d("SamplesPerPixel", 277, 3);
    arrayOfD5[13] = new d("RowsPerStrip", 278, 3, 4);
    arrayOfD5[14] = new d("StripByteCounts", 279, 3, 4);
    arrayOfD5[15] = new d("XResolution", 282, 5);
    arrayOfD5[16] = new d("YResolution", 283, 5);
    arrayOfD5[17] = new d("PlanarConfiguration", 284, 3);
    arrayOfD5[18] = new d("ResolutionUnit", 296, 3);
    arrayOfD5[19] = new d("TransferFunction", 301, 3);
    arrayOfD5[20] = new d("Software", 305, 2);
    arrayOfD5[21] = new d("DateTime", 306, 2);
    arrayOfD5[22] = new d("Artist", 315, 2);
    arrayOfD5[23] = new d("WhitePoint", 318, 5);
    arrayOfD5[24] = new d("PrimaryChromaticities", 319, 5);
    arrayOfD5[25] = new d("SubIFDPointer", 330, 4);
    arrayOfD5[26] = new d("JPEGInterchangeFormat", 513, 4);
    arrayOfD5[27] = new d("JPEGInterchangeFormatLength", 514, 4);
    arrayOfD5[28] = new d("YCbCrCoefficients", 529, 5);
    arrayOfD5[29] = new d("YCbCrSubSampling", 530, 3);
    arrayOfD5[30] = new d("YCbCrPositioning", 531, 3);
    arrayOfD5[31] = new d("ReferenceBlackWhite", 532, 5);
    arrayOfD5[32] = new d("Copyright", 33432, 2);
    arrayOfD5[33] = new d("ExifIFDPointer", 34665, 4);
    arrayOfD5[34] = new d("GPSInfoIFDPointer", 34853, 4);
    arrayOfD5[35] = new d("DNGVersion", 50706, 1);
    arrayOfD5[36] = new d("DefaultCropSize", 50720, 3, 4);
    e0 = arrayOfD5;
    f0 = new d("StripOffsets", 273, 3);
    d[] arrayOfD6 = new d[3];
    arrayOfD6[0] = new d("ThumbnailImage", 256, 7);
    arrayOfD6[1] = new d("CameraSettingsIFDPointer", 8224, 4);
    arrayOfD6[2] = new d("ImageProcessingIFDPointer", 8256, 4);
    g0 = arrayOfD6;
    d[] arrayOfD7 = new d[2];
    arrayOfD7[0] = new d("PreviewImageStart", 257, 4);
    arrayOfD7[1] = new d("PreviewImageLength", 258, 4);
    h0 = arrayOfD7;
    d[] arrayOfD8 = new d[1];
    arrayOfD8[0] = new d("AspectFrame", 4371, 3);
    i0 = arrayOfD8;
    d[] arrayOfD9 = new d[1];
    arrayOfD9[0] = new d("ColorSpace", 55, 3);
    j0 = arrayOfD9;
    d[][] arrayOfD = new d[10][];
    arrayOfD[0] = arrayOfD1;
    arrayOfD[1] = arrayOfD2;
    arrayOfD[2] = arrayOfD3;
    arrayOfD[3] = arrayOfD4;
    arrayOfD[4] = arrayOfD5;
    arrayOfD[5] = arrayOfD1;
    arrayOfD[6] = arrayOfD6;
    arrayOfD[7] = arrayOfD7;
    arrayOfD[8] = arrayOfD8;
    arrayOfD[9] = arrayOfD9;
    k0 = arrayOfD;
    l0 = new d[] { new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1) };
    m0 = new d("JPEGInterchangeFormat", 513, 4);
    n0 = new d("JPEGInterchangeFormatLength", 514, 4);
    o0 = (HashMap<Integer, d>[])new HashMap[arrayOfD.length];
    p0 = (HashMap<String, d>[])new HashMap[arrayOfD.length];
    q0 = new HashSet<String>(Arrays.asList(new String[] { "FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp" }));
    r0 = new HashMap<Integer, Integer>();
    Charset charset = Charset.forName("US-ASCII");
    s0 = charset;
    t0 = "Exif\000\000".getBytes(charset);
    u0 = "http://ns.adobe.com/xap/1.0/\000".getBytes(charset);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    W = simpleDateFormat;
    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    int i = 0;
    while (true) {
      d[][] arrayOfD10 = k0;
      if (i < arrayOfD10.length) {
        o0[i] = new HashMap<Integer, d>();
        p0[i] = new HashMap<String, d>();
        for (d d1 : arrayOfD10[i]) {
          o0[i].put(Integer.valueOf(d1.a), d1);
          p0[i].put(d1.b, d1);
        } 
        i++;
        continue;
      } 
      HashMap<Integer, Integer> hashMap = r0;
      arrayOfD2 = l0;
      hashMap.put(Integer.valueOf((arrayOfD2[0]).a), integer6);
      hashMap.put(Integer.valueOf((arrayOfD2[1]).a), integer2);
      hashMap.put(Integer.valueOf((arrayOfD2[2]).a), integer3);
      hashMap.put(Integer.valueOf((arrayOfD2[3]).a), integer1);
      hashMap.put(Integer.valueOf((arrayOfD2[4]).a), integer5);
      hashMap.put(Integer.valueOf((arrayOfD2[5]).a), integer4);
      v0 = Pattern.compile(".*[1-9].*");
      w0 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
      return;
    } 
  }
  
  public b(InputStream paramInputStream) throws IOException {
    this(paramInputStream, false);
  }
  
  private b(InputStream paramInputStream, boolean paramBoolean) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: getstatic e0/b.k0 : [[Le0/b$d;
    //   7: astore_3
    //   8: aload_0
    //   9: aload_3
    //   10: arraylength
    //   11: anewarray java/util/HashMap
    //   14: putfield f : [Ljava/util/HashMap;
    //   17: aload_0
    //   18: new java/util/HashSet
    //   21: dup
    //   22: aload_3
    //   23: arraylength
    //   24: invokespecial <init> : (I)V
    //   27: putfield g : Ljava/util/Set;
    //   30: aload_0
    //   31: getstatic java/nio/ByteOrder.BIG_ENDIAN : Ljava/nio/ByteOrder;
    //   34: putfield h : Ljava/nio/ByteOrder;
    //   37: aload_1
    //   38: ifnull -> 165
    //   41: aload_0
    //   42: aconst_null
    //   43: putfield a : Ljava/lang/String;
    //   46: iload_2
    //   47: ifeq -> 88
    //   50: new java/io/BufferedInputStream
    //   53: dup
    //   54: aload_1
    //   55: sipush #5000
    //   58: invokespecial <init> : (Ljava/io/InputStream;I)V
    //   61: astore_1
    //   62: aload_1
    //   63: invokestatic u : (Ljava/io/BufferedInputStream;)Z
    //   66: ifne -> 70
    //   69: return
    //   70: aload_0
    //   71: iconst_1
    //   72: putfield e : Z
    //   75: aload_0
    //   76: aconst_null
    //   77: putfield c : Landroid/content/res/AssetManager$AssetInputStream;
    //   80: aload_0
    //   81: aconst_null
    //   82: putfield b : Ljava/io/FileDescriptor;
    //   85: goto -> 159
    //   88: aload_1
    //   89: instanceof android/content/res/AssetManager$AssetInputStream
    //   92: ifeq -> 111
    //   95: aload_0
    //   96: aload_1
    //   97: checkcast android/content/res/AssetManager$AssetInputStream
    //   100: putfield c : Landroid/content/res/AssetManager$AssetInputStream;
    //   103: aload_0
    //   104: aconst_null
    //   105: putfield b : Ljava/io/FileDescriptor;
    //   108: goto -> 159
    //   111: aload_1
    //   112: instanceof java/io/FileInputStream
    //   115: ifeq -> 149
    //   118: aload_1
    //   119: checkcast java/io/FileInputStream
    //   122: astore_3
    //   123: aload_3
    //   124: invokevirtual getFD : ()Ljava/io/FileDescriptor;
    //   127: invokestatic B : (Ljava/io/FileDescriptor;)Z
    //   130: ifeq -> 149
    //   133: aload_0
    //   134: aconst_null
    //   135: putfield c : Landroid/content/res/AssetManager$AssetInputStream;
    //   138: aload_0
    //   139: aload_3
    //   140: invokevirtual getFD : ()Ljava/io/FileDescriptor;
    //   143: putfield b : Ljava/io/FileDescriptor;
    //   146: goto -> 159
    //   149: aload_0
    //   150: aconst_null
    //   151: putfield c : Landroid/content/res/AssetManager$AssetInputStream;
    //   154: aload_0
    //   155: aconst_null
    //   156: putfield b : Ljava/io/FileDescriptor;
    //   159: aload_0
    //   160: aload_1
    //   161: invokespecial F : (Ljava/io/InputStream;)V
    //   164: return
    //   165: new java/lang/NullPointerException
    //   168: dup
    //   169: ldc_w 'inputStream cannot be null'
    //   172: invokespecial <init> : (Ljava/lang/String;)V
    //   175: athrow
  }
  
  public b(String paramString) throws IOException {
    d[][] arrayOfD = k0;
    this.f = (HashMap<String, c>[])new HashMap[arrayOfD.length];
    this.g = new HashSet<Integer>(arrayOfD.length);
    this.h = ByteOrder.BIG_ENDIAN;
    if (paramString != null) {
      t(paramString);
      return;
    } 
    throw new NullPointerException("filename cannot be null");
  }
  
  private boolean A(byte[] paramArrayOfbyte) throws IOException {
    boolean bool = false;
    null = null;
    byte[] arrayOfByte = null;
    try {
    
    } catch (Exception exception) {
    
    } finally {
      paramArrayOfbyte = arrayOfByte;
      if (paramArrayOfbyte != null)
        paramArrayOfbyte.close(); 
    } 
    if (paramArrayOfbyte != null)
      paramArrayOfbyte.close(); 
    return false;
  }
  
  private static boolean B(FileDescriptor paramFileDescriptor) {
    try {
      Os.lseek(paramFileDescriptor, 0L, OsConstants.SEEK_CUR);
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  private boolean C(HashMap paramHashMap) throws IOException {
    c c = (c)paramHashMap.get("BitsPerSample");
    if (c != null) {
      int[] arrayOfInt1 = (int[])c.k(this.h);
      int[] arrayOfInt2 = z;
      if (Arrays.equals(arrayOfInt2, arrayOfInt1))
        return true; 
      if (this.d == 3) {
        c c1 = (c)paramHashMap.get("PhotometricInterpretation");
        if (c1 != null) {
          int i = c1.i(this.h);
          if ((i == 1 && Arrays.equals(arrayOfInt1, B)) || (i == 6 && Arrays.equals(arrayOfInt1, arrayOfInt2)))
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  private boolean D(HashMap paramHashMap) throws IOException {
    c c2 = (c)paramHashMap.get("ImageLength");
    c c1 = (c)paramHashMap.get("ImageWidth");
    if (c2 != null && c1 != null) {
      int i = c2.i(this.h);
      int j = c1.i(this.h);
      if (i <= 512 && j <= 512)
        return true; 
    } 
    return false;
  }
  
  private boolean E(byte[] paramArrayOfbyte) throws IOException {
    int i = 0;
    while (true) {
      byte[] arrayOfByte = M;
      if (i < arrayOfByte.length) {
        if (paramArrayOfbyte[i] != arrayOfByte[i])
          return false; 
        i++;
        continue;
      } 
      i = 0;
      while (true) {
        arrayOfByte = N;
        if (i < arrayOfByte.length) {
          if (paramArrayOfbyte[M.length + i + 4] != arrayOfByte[i])
            return false; 
          i++;
          continue;
        } 
        return true;
      } 
      break;
    } 
  }
  
  private void F(InputStream paramInputStream) {
    if (paramInputStream != null) {
      int i = 0;
      try {
        while (i < k0.length) {
          this.f[i] = new HashMap<String, c>();
          i++;
        } 
        InputStream inputStream = paramInputStream;
        if (!this.e) {
          inputStream = new BufferedInputStream(paramInputStream, 5000);
          this.d = j((BufferedInputStream)inputStream);
        } 
        paramInputStream = new b(inputStream);
        if (!this.e) {
          switch (this.d) {
            case 14:
              q((b)paramInputStream);
              break;
            case 13:
              l((b)paramInputStream);
              break;
            case 12:
              h((b)paramInputStream);
              break;
            case 10:
              o((b)paramInputStream);
              break;
            case 9:
              m((b)paramInputStream);
              break;
            case 7:
              k((b)paramInputStream);
              break;
            case 4:
              i((b)paramInputStream, 0, 0);
              break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
              n((b)paramInputStream);
              break;
          } 
        } else {
          p((b)paramInputStream);
        } 
        M((b)paramInputStream);
        this.u = true;
      } catch (IOException iOException) {
        this.u = false;
        boolean bool = w;
      } finally {
        a();
        if (w)
          H(); 
      } 
      return;
    } 
    throw new NullPointerException("inputstream shouldn't be null");
  }
  
  private void G(b paramb, int paramInt) throws IOException {
    ByteOrder byteOrder = I(paramb);
    this.h = byteOrder;
    paramb.x(byteOrder);
    int i = paramb.readUnsignedShort();
    int j = this.d;
    if (j == 7 || j == 10 || i == 42) {
      i = paramb.readInt();
      if (i >= 8 && i < paramInt) {
        paramInt = i - 8;
        if (paramInt > 0) {
          if (paramb.skipBytes(paramInt) == paramInt)
            return; 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Couldn't jump to first Ifd: ");
          stringBuilder2.append(paramInt);
          throw new IOException(stringBuilder2.toString());
        } 
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Invalid first Ifd offset: ");
      stringBuilder1.append(i);
      throw new IOException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid start code: ");
    stringBuilder.append(Integer.toHexString(i));
    throw new IOException(stringBuilder.toString());
  }
  
  private void H() {
    for (int i = 0; i < this.f.length; i++) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("The size of tag group[");
      stringBuilder.append(i);
      stringBuilder.append("]: ");
      stringBuilder.append(this.f[i].size());
      for (Map.Entry<String, c> entry : this.f[i].entrySet()) {
        c c = (c)entry.getValue();
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("tagName: ");
        stringBuilder1.append((String)entry.getKey());
        stringBuilder1.append(", tagType: ");
        stringBuilder1.append(c.toString());
        stringBuilder1.append(", tagValue: '");
        stringBuilder1.append(c.j(this.h));
        stringBuilder1.append("'");
      } 
    } 
  }
  
  private ByteOrder I(b paramb) throws IOException {
    short s = paramb.readShort();
    if (s != 18761) {
      if (s == 19789)
        return ByteOrder.BIG_ENDIAN; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid byte order: ");
      stringBuilder.append(Integer.toHexString(s));
      throw new IOException(stringBuilder.toString());
    } 
    return ByteOrder.LITTLE_ENDIAN;
  }
  
  private void J(byte[] paramArrayOfbyte, int paramInt) throws IOException {
    b b1 = new b(paramArrayOfbyte);
    G(b1, paramArrayOfbyte.length);
    K(b1, paramInt);
  }
  
  private void K(b paramb, int paramInt) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Ljava/util/Set;
    //   4: aload_1
    //   5: getfield j : I
    //   8: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11: invokeinterface add : (Ljava/lang/Object;)Z
    //   16: pop
    //   17: aload_1
    //   18: getfield j : I
    //   21: iconst_2
    //   22: iadd
    //   23: aload_1
    //   24: getfield i : I
    //   27: if_icmple -> 31
    //   30: return
    //   31: aload_1
    //   32: invokevirtual readShort : ()S
    //   35: istore #5
    //   37: getstatic e0/b.w : Z
    //   40: ifeq -> 69
    //   43: new java/lang/StringBuilder
    //   46: dup
    //   47: invokespecial <init> : ()V
    //   50: astore #17
    //   52: aload #17
    //   54: ldc_w 'numberOfDirectoryEntry: '
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: aload #17
    //   63: iload #5
    //   65: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload_1
    //   70: getfield j : I
    //   73: iload #5
    //   75: bipush #12
    //   77: imul
    //   78: iadd
    //   79: aload_1
    //   80: getfield i : I
    //   83: if_icmpgt -> 1496
    //   86: iload #5
    //   88: ifgt -> 92
    //   91: return
    //   92: iconst_0
    //   93: istore #6
    //   95: iload #6
    //   97: iload #5
    //   99: if_icmpge -> 1316
    //   102: aload_1
    //   103: invokevirtual readUnsignedShort : ()I
    //   106: istore #9
    //   108: aload_1
    //   109: invokevirtual readUnsignedShort : ()I
    //   112: istore #4
    //   114: aload_1
    //   115: invokevirtual readInt : ()I
    //   118: istore #8
    //   120: aload_1
    //   121: invokevirtual d : ()I
    //   124: i2l
    //   125: ldc2_w 4
    //   128: ladd
    //   129: lstore #12
    //   131: getstatic e0/b.o0 : [Ljava/util/HashMap;
    //   134: iload_2
    //   135: aaload
    //   136: iload #9
    //   138: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   141: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   144: checkcast e0/b$d
    //   147: astore #18
    //   149: getstatic e0/b.w : Z
    //   152: istore #16
    //   154: iload #16
    //   156: ifeq -> 224
    //   159: aload #18
    //   161: ifnull -> 174
    //   164: aload #18
    //   166: getfield b : Ljava/lang/String;
    //   169: astore #17
    //   171: goto -> 177
    //   174: aconst_null
    //   175: astore #17
    //   177: ldc_w 'ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d'
    //   180: iconst_5
    //   181: anewarray java/lang/Object
    //   184: dup
    //   185: iconst_0
    //   186: iload_2
    //   187: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   190: aastore
    //   191: dup
    //   192: iconst_1
    //   193: iload #9
    //   195: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   198: aastore
    //   199: dup
    //   200: iconst_2
    //   201: aload #17
    //   203: aastore
    //   204: dup
    //   205: iconst_3
    //   206: iload #4
    //   208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   211: aastore
    //   212: dup
    //   213: iconst_4
    //   214: iload #8
    //   216: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   219: aastore
    //   220: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   223: pop
    //   224: aload #18
    //   226: ifnonnull -> 263
    //   229: iload #16
    //   231: ifeq -> 260
    //   234: new java/lang/StringBuilder
    //   237: dup
    //   238: invokespecial <init> : ()V
    //   241: astore #17
    //   243: aload #17
    //   245: ldc_w 'Skip the tag entry since tag number is not defined: '
    //   248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: pop
    //   252: aload #17
    //   254: iload #9
    //   256: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   259: pop
    //   260: goto -> 472
    //   263: iload #4
    //   265: ifle -> 441
    //   268: getstatic e0/b.Y : [I
    //   271: astore #17
    //   273: iload #4
    //   275: aload #17
    //   277: arraylength
    //   278: if_icmplt -> 284
    //   281: goto -> 441
    //   284: aload #18
    //   286: iload #4
    //   288: invokevirtual a : (I)Z
    //   291: ifne -> 352
    //   294: iload #16
    //   296: ifeq -> 260
    //   299: new java/lang/StringBuilder
    //   302: dup
    //   303: invokespecial <init> : ()V
    //   306: astore #17
    //   308: aload #17
    //   310: ldc_w 'Skip the tag entry since data format ('
    //   313: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: pop
    //   317: aload #17
    //   319: getstatic e0/b.X : [Ljava/lang/String;
    //   322: iload #4
    //   324: aaload
    //   325: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   328: pop
    //   329: aload #17
    //   331: ldc_w ') is unexpected for tag: '
    //   334: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: pop
    //   338: aload #17
    //   340: aload #18
    //   342: getfield b : Ljava/lang/String;
    //   345: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: pop
    //   349: goto -> 260
    //   352: iload #4
    //   354: istore_3
    //   355: iload #4
    //   357: bipush #7
    //   359: if_icmpne -> 368
    //   362: aload #18
    //   364: getfield c : I
    //   367: istore_3
    //   368: iload #8
    //   370: i2l
    //   371: aload #17
    //   373: iload_3
    //   374: iaload
    //   375: i2l
    //   376: lmul
    //   377: lstore #10
    //   379: lload #10
    //   381: lconst_0
    //   382: lcmp
    //   383: iflt -> 404
    //   386: lload #10
    //   388: ldc2_w 2147483647
    //   391: lcmp
    //   392: ifle -> 398
    //   395: goto -> 404
    //   398: iconst_1
    //   399: istore #4
    //   401: goto -> 485
    //   404: iload #16
    //   406: ifeq -> 435
    //   409: new java/lang/StringBuilder
    //   412: dup
    //   413: invokespecial <init> : ()V
    //   416: astore #17
    //   418: aload #17
    //   420: ldc_w 'Skip the tag entry since the number of components is invalid: '
    //   423: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   426: pop
    //   427: aload #17
    //   429: iload #8
    //   431: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   434: pop
    //   435: iconst_0
    //   436: istore #4
    //   438: goto -> 485
    //   441: iload #16
    //   443: ifeq -> 472
    //   446: new java/lang/StringBuilder
    //   449: dup
    //   450: invokespecial <init> : ()V
    //   453: astore #17
    //   455: aload #17
    //   457: ldc_w 'Skip the tag entry since data format is invalid: '
    //   460: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   463: pop
    //   464: aload #17
    //   466: iload #4
    //   468: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   471: pop
    //   472: iconst_0
    //   473: istore #7
    //   475: lconst_0
    //   476: lstore #10
    //   478: iload #4
    //   480: istore_3
    //   481: iload #7
    //   483: istore #4
    //   485: iload #4
    //   487: ifne -> 499
    //   490: aload_1
    //   491: lload #12
    //   493: invokevirtual t : (J)V
    //   496: goto -> 1306
    //   499: lload #10
    //   501: ldc2_w 4
    //   504: lcmp
    //   505: ifle -> 801
    //   508: aload_1
    //   509: invokevirtual readInt : ()I
    //   512: istore #4
    //   514: iload #16
    //   516: ifeq -> 548
    //   519: new java/lang/StringBuilder
    //   522: dup
    //   523: invokespecial <init> : ()V
    //   526: astore #17
    //   528: aload #17
    //   530: ldc_w 'seek to data offset: '
    //   533: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   536: pop
    //   537: aload #17
    //   539: iload #4
    //   541: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   544: pop
    //   545: goto -> 548
    //   548: aload_0
    //   549: getfield d : I
    //   552: istore #7
    //   554: iload #7
    //   556: bipush #7
    //   558: if_icmpne -> 706
    //   561: ldc_w 'MakerNote'
    //   564: aload #18
    //   566: getfield b : Ljava/lang/String;
    //   569: invokevirtual equals : (Ljava/lang/Object;)Z
    //   572: ifeq -> 584
    //   575: aload_0
    //   576: iload #4
    //   578: putfield q : I
    //   581: goto -> 703
    //   584: iload_2
    //   585: bipush #6
    //   587: if_icmpne -> 703
    //   590: ldc_w 'ThumbnailImage'
    //   593: aload #18
    //   595: getfield b : Ljava/lang/String;
    //   598: invokevirtual equals : (Ljava/lang/Object;)Z
    //   601: ifeq -> 703
    //   604: aload_0
    //   605: iload #4
    //   607: putfield r : I
    //   610: aload_0
    //   611: iload #8
    //   613: putfield s : I
    //   616: bipush #6
    //   618: aload_0
    //   619: getfield h : Ljava/nio/ByteOrder;
    //   622: invokestatic f : (ILjava/nio/ByteOrder;)Le0/b$c;
    //   625: astore #17
    //   627: aload_0
    //   628: getfield r : I
    //   631: i2l
    //   632: aload_0
    //   633: getfield h : Ljava/nio/ByteOrder;
    //   636: invokestatic b : (JLjava/nio/ByteOrder;)Le0/b$c;
    //   639: astore #19
    //   641: aload_0
    //   642: getfield s : I
    //   645: i2l
    //   646: aload_0
    //   647: getfield h : Ljava/nio/ByteOrder;
    //   650: invokestatic b : (JLjava/nio/ByteOrder;)Le0/b$c;
    //   653: astore #20
    //   655: aload_0
    //   656: getfield f : [Ljava/util/HashMap;
    //   659: iconst_4
    //   660: aaload
    //   661: ldc_w 'Compression'
    //   664: aload #17
    //   666: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   669: pop
    //   670: aload_0
    //   671: getfield f : [Ljava/util/HashMap;
    //   674: iconst_4
    //   675: aaload
    //   676: ldc_w 'JPEGInterchangeFormat'
    //   679: aload #19
    //   681: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   684: pop
    //   685: aload_0
    //   686: getfield f : [Ljava/util/HashMap;
    //   689: iconst_4
    //   690: aaload
    //   691: ldc_w 'JPEGInterchangeFormatLength'
    //   694: aload #20
    //   696: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   699: pop
    //   700: goto -> 733
    //   703: goto -> 733
    //   706: iload #7
    //   708: bipush #10
    //   710: if_icmpne -> 733
    //   713: ldc_w 'JpgFromRaw'
    //   716: aload #18
    //   718: getfield b : Ljava/lang/String;
    //   721: invokevirtual equals : (Ljava/lang/Object;)Z
    //   724: ifeq -> 733
    //   727: aload_0
    //   728: iload #4
    //   730: putfield t : I
    //   733: iload #4
    //   735: i2l
    //   736: lstore #14
    //   738: lload #14
    //   740: lload #10
    //   742: ladd
    //   743: aload_1
    //   744: getfield i : I
    //   747: i2l
    //   748: lcmp
    //   749: ifgt -> 761
    //   752: aload_1
    //   753: lload #14
    //   755: invokevirtual t : (J)V
    //   758: goto -> 801
    //   761: iload #16
    //   763: ifeq -> 792
    //   766: new java/lang/StringBuilder
    //   769: dup
    //   770: invokespecial <init> : ()V
    //   773: astore #17
    //   775: aload #17
    //   777: ldc_w 'Skip the tag entry since data offset is invalid: '
    //   780: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   783: pop
    //   784: aload #17
    //   786: iload #4
    //   788: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   791: pop
    //   792: aload_1
    //   793: lload #12
    //   795: invokevirtual t : (J)V
    //   798: goto -> 496
    //   801: getstatic e0/b.r0 : Ljava/util/HashMap;
    //   804: iload #9
    //   806: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   809: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   812: checkcast java/lang/Integer
    //   815: astore #17
    //   817: iload #16
    //   819: ifeq -> 865
    //   822: new java/lang/StringBuilder
    //   825: dup
    //   826: invokespecial <init> : ()V
    //   829: astore #19
    //   831: aload #19
    //   833: ldc_w 'nextIfdType: '
    //   836: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   839: pop
    //   840: aload #19
    //   842: aload #17
    //   844: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   847: pop
    //   848: aload #19
    //   850: ldc_w ' byteCount: '
    //   853: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   856: pop
    //   857: aload #19
    //   859: lload #10
    //   861: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   864: pop
    //   865: aload #17
    //   867: ifnull -> 1127
    //   870: iload_3
    //   871: iconst_3
    //   872: if_icmpeq -> 931
    //   875: iload_3
    //   876: iconst_4
    //   877: if_icmpeq -> 922
    //   880: iload_3
    //   881: bipush #8
    //   883: if_icmpeq -> 914
    //   886: iload_3
    //   887: bipush #9
    //   889: if_icmpeq -> 906
    //   892: iload_3
    //   893: bipush #13
    //   895: if_icmpeq -> 906
    //   898: ldc2_w -1
    //   901: lstore #10
    //   903: goto -> 940
    //   906: aload_1
    //   907: invokevirtual readInt : ()I
    //   910: istore_3
    //   911: goto -> 936
    //   914: aload_1
    //   915: invokevirtual readShort : ()S
    //   918: istore_3
    //   919: goto -> 936
    //   922: aload_1
    //   923: invokevirtual r : ()J
    //   926: lstore #10
    //   928: goto -> 940
    //   931: aload_1
    //   932: invokevirtual readUnsignedShort : ()I
    //   935: istore_3
    //   936: iload_3
    //   937: i2l
    //   938: lstore #10
    //   940: iload #16
    //   942: ifeq -> 972
    //   945: ldc_w 'Offset: %d, tagName: %s'
    //   948: iconst_2
    //   949: anewarray java/lang/Object
    //   952: dup
    //   953: iconst_0
    //   954: lload #10
    //   956: invokestatic valueOf : (J)Ljava/lang/Long;
    //   959: aastore
    //   960: dup
    //   961: iconst_1
    //   962: aload #18
    //   964: getfield b : Ljava/lang/String;
    //   967: aastore
    //   968: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   971: pop
    //   972: lload #10
    //   974: lconst_0
    //   975: lcmp
    //   976: ifle -> 1087
    //   979: lload #10
    //   981: aload_1
    //   982: getfield i : I
    //   985: i2l
    //   986: lcmp
    //   987: ifge -> 1087
    //   990: aload_0
    //   991: getfield g : Ljava/util/Set;
    //   994: lload #10
    //   996: l2i
    //   997: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1000: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1005: ifne -> 1027
    //   1008: aload_1
    //   1009: lload #10
    //   1011: invokevirtual t : (J)V
    //   1014: aload_0
    //   1015: aload_1
    //   1016: aload #17
    //   1018: invokevirtual intValue : ()I
    //   1021: invokespecial K : (Le0/b$b;I)V
    //   1024: goto -> 1118
    //   1027: iload #16
    //   1029: ifeq -> 1118
    //   1032: new java/lang/StringBuilder
    //   1035: dup
    //   1036: invokespecial <init> : ()V
    //   1039: astore #18
    //   1041: aload #18
    //   1043: ldc_w 'Skip jump into the IFD since it has already been read: IfdType '
    //   1046: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1049: pop
    //   1050: aload #18
    //   1052: aload #17
    //   1054: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1057: pop
    //   1058: aload #18
    //   1060: ldc_w ' (at '
    //   1063: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1066: pop
    //   1067: aload #18
    //   1069: lload #10
    //   1071: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1074: pop
    //   1075: aload #18
    //   1077: ldc_w ')'
    //   1080: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1083: pop
    //   1084: goto -> 1118
    //   1087: iload #16
    //   1089: ifeq -> 1118
    //   1092: new java/lang/StringBuilder
    //   1095: dup
    //   1096: invokespecial <init> : ()V
    //   1099: astore #17
    //   1101: aload #17
    //   1103: ldc_w 'Skip jump into the IFD since its offset is invalid: '
    //   1106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1109: pop
    //   1110: aload #17
    //   1112: lload #10
    //   1114: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1117: pop
    //   1118: aload_1
    //   1119: lload #12
    //   1121: invokevirtual t : (J)V
    //   1124: goto -> 1306
    //   1127: aload_1
    //   1128: invokevirtual d : ()I
    //   1131: istore #4
    //   1133: aload_0
    //   1134: getfield p : I
    //   1137: istore #7
    //   1139: lload #10
    //   1141: l2i
    //   1142: newarray byte
    //   1144: astore #17
    //   1146: aload_1
    //   1147: aload #17
    //   1149: invokevirtual readFully : ([B)V
    //   1152: new e0/b$c
    //   1155: dup
    //   1156: iload_3
    //   1157: iload #8
    //   1159: iload #4
    //   1161: iload #7
    //   1163: iadd
    //   1164: i2l
    //   1165: aload #17
    //   1167: invokespecial <init> : (IIJ[B)V
    //   1170: astore #17
    //   1172: aload_0
    //   1173: getfield f : [Ljava/util/HashMap;
    //   1176: iload_2
    //   1177: aaload
    //   1178: aload #18
    //   1180: getfield b : Ljava/lang/String;
    //   1183: aload #17
    //   1185: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1188: pop
    //   1189: ldc_w 'DNGVersion'
    //   1192: aload #18
    //   1194: getfield b : Ljava/lang/String;
    //   1197: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1200: ifeq -> 1208
    //   1203: aload_0
    //   1204: iconst_3
    //   1205: putfield d : I
    //   1208: ldc_w 'Make'
    //   1211: aload #18
    //   1213: getfield b : Ljava/lang/String;
    //   1216: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1219: ifne -> 1236
    //   1222: ldc_w 'Model'
    //   1225: aload #18
    //   1227: getfield b : Ljava/lang/String;
    //   1230: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1233: ifeq -> 1254
    //   1236: aload #17
    //   1238: aload_0
    //   1239: getfield h : Ljava/nio/ByteOrder;
    //   1242: invokevirtual j : (Ljava/nio/ByteOrder;)Ljava/lang/String;
    //   1245: ldc_w 'PENTAX'
    //   1248: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   1251: ifne -> 1283
    //   1254: ldc_w 'Compression'
    //   1257: aload #18
    //   1259: getfield b : Ljava/lang/String;
    //   1262: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1265: ifeq -> 1289
    //   1268: aload #17
    //   1270: aload_0
    //   1271: getfield h : Ljava/nio/ByteOrder;
    //   1274: invokevirtual i : (Ljava/nio/ByteOrder;)I
    //   1277: ldc_w 65535
    //   1280: if_icmpne -> 1289
    //   1283: aload_0
    //   1284: bipush #8
    //   1286: putfield d : I
    //   1289: aload_1
    //   1290: invokevirtual d : ()I
    //   1293: i2l
    //   1294: lload #12
    //   1296: lcmp
    //   1297: ifeq -> 1306
    //   1300: aload_1
    //   1301: lload #12
    //   1303: invokevirtual t : (J)V
    //   1306: iload #6
    //   1308: iconst_1
    //   1309: iadd
    //   1310: i2s
    //   1311: istore #6
    //   1313: goto -> 95
    //   1316: aload_1
    //   1317: invokevirtual d : ()I
    //   1320: iconst_4
    //   1321: iadd
    //   1322: aload_1
    //   1323: getfield i : I
    //   1326: if_icmpgt -> 1496
    //   1329: aload_1
    //   1330: invokevirtual readInt : ()I
    //   1333: istore_2
    //   1334: getstatic e0/b.w : Z
    //   1337: istore #16
    //   1339: iload #16
    //   1341: ifeq -> 1362
    //   1344: ldc_w 'nextIfdOffset: %d'
    //   1347: iconst_1
    //   1348: anewarray java/lang/Object
    //   1351: dup
    //   1352: iconst_0
    //   1353: iload_2
    //   1354: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1357: aastore
    //   1358: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1361: pop
    //   1362: iload_2
    //   1363: i2l
    //   1364: lstore #10
    //   1366: lload #10
    //   1368: lconst_0
    //   1369: lcmp
    //   1370: ifle -> 1469
    //   1373: iload_2
    //   1374: aload_1
    //   1375: getfield i : I
    //   1378: if_icmpge -> 1469
    //   1381: aload_0
    //   1382: getfield g : Ljava/util/Set;
    //   1385: iload_2
    //   1386: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1389: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1394: ifne -> 1441
    //   1397: aload_1
    //   1398: lload #10
    //   1400: invokevirtual t : (J)V
    //   1403: aload_0
    //   1404: getfield f : [Ljava/util/HashMap;
    //   1407: iconst_4
    //   1408: aaload
    //   1409: invokevirtual isEmpty : ()Z
    //   1412: ifeq -> 1422
    //   1415: aload_0
    //   1416: aload_1
    //   1417: iconst_4
    //   1418: invokespecial K : (Le0/b$b;I)V
    //   1421: return
    //   1422: aload_0
    //   1423: getfield f : [Ljava/util/HashMap;
    //   1426: iconst_5
    //   1427: aaload
    //   1428: invokevirtual isEmpty : ()Z
    //   1431: ifeq -> 1496
    //   1434: aload_0
    //   1435: aload_1
    //   1436: iconst_5
    //   1437: invokespecial K : (Le0/b$b;I)V
    //   1440: return
    //   1441: iload #16
    //   1443: ifeq -> 1496
    //   1446: new java/lang/StringBuilder
    //   1449: dup
    //   1450: invokespecial <init> : ()V
    //   1453: astore_1
    //   1454: aload_1
    //   1455: ldc_w 'Stop reading file since re-reading an IFD may cause an infinite loop: '
    //   1458: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1461: pop
    //   1462: aload_1
    //   1463: iload_2
    //   1464: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1467: pop
    //   1468: return
    //   1469: iload #16
    //   1471: ifeq -> 1496
    //   1474: new java/lang/StringBuilder
    //   1477: dup
    //   1478: invokespecial <init> : ()V
    //   1481: astore_1
    //   1482: aload_1
    //   1483: ldc_w 'Stop reading file since a wrong offset may cause an infinite loop: '
    //   1486: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1489: pop
    //   1490: aload_1
    //   1491: iload_2
    //   1492: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1495: pop
    //   1496: return
  }
  
  private void L(b paramb, int paramInt) throws IOException {
    c c1 = this.f[paramInt].get("ImageLength");
    c c2 = this.f[paramInt].get("ImageWidth");
    if (c1 == null || c2 == null) {
      c1 = this.f[paramInt].get("JPEGInterchangeFormat");
      if (c1 != null)
        i(paramb, c1.i(this.h), paramInt); 
    } 
  }
  
  private void M(b paramb) throws IOException {
    HashMap<String, c> hashMap = this.f[4];
    c c = hashMap.get("Compression");
    if (c != null) {
      int i = c.i(this.h);
      this.o = i;
      if (i != 1)
        if (i != 6) {
          if (i != 7)
            return; 
        } else {
          r(paramb, hashMap);
          return;
        }  
      if (C(hashMap)) {
        s(paramb, hashMap);
        return;
      } 
    } else {
      this.o = 6;
      r(paramb, hashMap);
    } 
  }
  
  private static boolean N(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    if (paramArrayOfbyte1 != null) {
      if (paramArrayOfbyte2 == null)
        return false; 
      if (paramArrayOfbyte1.length < paramArrayOfbyte2.length)
        return false; 
      for (int i = 0; i < paramArrayOfbyte2.length; i++) {
        if (paramArrayOfbyte1[i] != paramArrayOfbyte2[i])
          return false; 
      } 
      return true;
    } 
    return false;
  }
  
  private void O(int paramInt1, int paramInt2) throws IOException {
    if (!this.f[paramInt1].isEmpty()) {
      if (this.f[paramInt2].isEmpty())
        return; 
      c c1 = this.f[paramInt1].get("ImageLength");
      c c2 = this.f[paramInt1].get("ImageWidth");
      c c3 = this.f[paramInt2].get("ImageLength");
      c c4 = this.f[paramInt2].get("ImageWidth");
      if (c1 != null) {
        if (c2 == null)
          return; 
        if (c3 != null) {
          if (c4 == null)
            return; 
          int i = c1.i(this.h);
          int j = c2.i(this.h);
          int k = c3.i(this.h);
          int m = c4.i(this.h);
          if (i < k && j < m) {
            HashMap<String, c>[] arrayOfHashMap = this.f;
            HashMap<String, c> hashMap = arrayOfHashMap[paramInt1];
            arrayOfHashMap[paramInt1] = arrayOfHashMap[paramInt2];
            arrayOfHashMap[paramInt2] = hashMap;
          } 
        } 
      } 
    } 
  }
  
  private void P(b paramb, int paramInt) throws IOException {
    c c1;
    c c2 = this.f[paramInt].get("DefaultCropSize");
    c c3 = this.f[paramInt].get("SensorTopBorder");
    c c4 = this.f[paramInt].get("SensorLeftBorder");
    c c5 = this.f[paramInt].get("SensorBottomBorder");
    c c6 = this.f[paramInt].get("SensorRightBorder");
    if (c2 != null) {
      c c;
      if (c2.a == 5) {
        e[] arrayOfE = (e[])c2.k(this.h);
        if (arrayOfE == null || arrayOfE.length != 2) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid crop size values. cropSize=");
          stringBuilder.append(Arrays.toString((Object[])arrayOfE));
          return;
        } 
        c1 = c.d(arrayOfE[0], this.h);
        c = c.d(arrayOfE[1], this.h);
      } else {
        int[] arrayOfInt = (int[])c.k(this.h);
        if (arrayOfInt == null || arrayOfInt.length != 2) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid crop size values. cropSize=");
          stringBuilder.append(Arrays.toString(arrayOfInt));
          return;
        } 
        c1 = c.f(arrayOfInt[0], this.h);
        c = c.f(arrayOfInt[1], this.h);
      } 
      this.f[paramInt].put("ImageWidth", c1);
      this.f[paramInt].put("ImageLength", c);
      return;
    } 
    if (c3 != null && c4 != null && c5 != null && c6 != null) {
      int i = c3.i(this.h);
      int j = c5.i(this.h);
      int k = c6.i(this.h);
      int m = c4.i(this.h);
      if (j > i && k > m) {
        c1 = c.f(j - i, this.h);
        c2 = c.f(k - m, this.h);
        this.f[paramInt].put("ImageLength", c1);
        this.f[paramInt].put("ImageWidth", c2);
        return;
      } 
    } else {
      L((b)c1, paramInt);
    } 
  }
  
  private void Q() throws IOException {
    O(0, 5);
    O(0, 4);
    O(5, 4);
    c c1 = this.f[1].get("PixelXDimension");
    c c2 = this.f[1].get("PixelYDimension");
    if (c1 != null && c2 != null) {
      this.f[0].put("ImageWidth", c1);
      this.f[0].put("ImageLength", c2);
    } 
    if (this.f[4].isEmpty() && D(this.f[5])) {
      HashMap<String, c>[] arrayOfHashMap = this.f;
      arrayOfHashMap[4] = arrayOfHashMap[5];
      arrayOfHashMap[5] = new HashMap<String, c>();
    } 
    D(this.f[4]);
  }
  
  private void a() {
    String str = e("DateTimeOriginal");
    if (str != null && e("DateTime") == null)
      this.f[0].put("DateTime", c.a(str)); 
    if (e("ImageWidth") == null)
      this.f[0].put("ImageWidth", c.b(0L, this.h)); 
    if (e("ImageLength") == null)
      this.f[0].put("ImageLength", c.b(0L, this.h)); 
    if (e("Orientation") == null)
      this.f[0].put("Orientation", c.b(0L, this.h)); 
    if (e("LightSource") == null)
      this.f[1].put("LightSource", c.b(0L, this.h)); 
  }
  
  private static String b(byte[] paramArrayOfbyte) {
    StringBuilder stringBuilder = new StringBuilder(paramArrayOfbyte.length * 2);
    for (int i = 0; i < paramArrayOfbyte.length; i++) {
      stringBuilder.append(String.format("%02x", new Object[] { Byte.valueOf(paramArrayOfbyte[i]) }));
    } 
    return stringBuilder.toString();
  }
  
  private static void c(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
        return;
      } catch (RuntimeException runtimeException) {
        throw runtimeException;
      } catch (Exception exception) {
        return;
      }  
  }
  
  private static long[] d(Object paramObject) {
    if (paramObject instanceof int[]) {
      paramObject = paramObject;
      long[] arrayOfLong = new long[paramObject.length];
      for (int i = 0; i < paramObject.length; i++)
        arrayOfLong[i] = paramObject[i]; 
      return arrayOfLong;
    } 
    return (paramObject instanceof long[]) ? (long[])paramObject : null;
  }
  
  private c g(String paramString) {
    if (paramString != null) {
      String str = paramString;
      if ("ISOSpeedRatings".equals(paramString))
        str = "PhotographicSensitivity"; 
      for (int i = 0; i < k0.length; i++) {
        c c = this.f[i].get(str);
        if (c != null)
          return c; 
      } 
      return null;
    } 
    throw new NullPointerException("tag shouldn't be null");
  }
  
  private void h(b paramb) throws IOException {
    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
    try {
      String str3;
      if (Build.VERSION.SDK_INT >= 23) {
        a.a(mediaMetadataRetriever, new a(this, paramb));
      } else {
        FileDescriptor fileDescriptor = this.b;
        if (fileDescriptor != null) {
          mediaMetadataRetriever.setDataSource(fileDescriptor);
        } else {
          String str = this.a;
          if (str != null) {
            mediaMetadataRetriever.setDataSource(str);
          } else {
            return;
          } 
        } 
      } 
      String str4 = mediaMetadataRetriever.extractMetadata(33);
      String str5 = mediaMetadataRetriever.extractMetadata(34);
      String str1 = mediaMetadataRetriever.extractMetadata(26);
      String str2 = mediaMetadataRetriever.extractMetadata(17);
      if ("yes".equals(str1)) {
        str1 = mediaMetadataRetriever.extractMetadata(29);
        str2 = mediaMetadataRetriever.extractMetadata(30);
        str3 = mediaMetadataRetriever.extractMetadata(31);
      } else if ("yes".equals(str2)) {
        str1 = mediaMetadataRetriever.extractMetadata(18);
        str2 = mediaMetadataRetriever.extractMetadata(19);
        str3 = mediaMetadataRetriever.extractMetadata(24);
      } else {
        str1 = null;
        str2 = null;
        str3 = str2;
      } 
      if (str1 != null)
        this.f[0].put("ImageWidth", c.f(Integer.parseInt(str1), this.h)); 
      if (str2 != null)
        this.f[0].put("ImageLength", c.f(Integer.parseInt(str2), this.h)); 
      if (str3 != null) {
        int i = Integer.parseInt(str3);
        if (i != 90) {
          if (i != 180) {
            if (i != 270) {
              i = 1;
            } else {
              i = 8;
            } 
          } else {
            i = 3;
          } 
        } else {
          i = 6;
        } 
        this.f[0].put("Orientation", c.f(i, this.h));
      } 
      if (str4 != null && str5 != null) {
        int i = Integer.parseInt(str4);
        int j = Integer.parseInt(str5);
        if (j > 6) {
          paramb.t(i);
          byte[] arrayOfByte = new byte[6];
          if (paramb.read(arrayOfByte) == 6) {
            j -= 6;
            if (Arrays.equals(arrayOfByte, t0)) {
              arrayOfByte = new byte[j];
              if (paramb.read(arrayOfByte) == j) {
                this.p = i + 6;
                J(arrayOfByte, 0);
              } else {
                throw new IOException("Can't read exif");
              } 
            } else {
              throw new IOException("Invalid identifier");
            } 
          } else {
            throw new IOException("Can't read identifier");
          } 
        } else {
          throw new IOException("Invalid exif length");
        } 
      } 
      if (w) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Heif meta: ");
        stringBuilder.append(str1);
        stringBuilder.append("x");
        stringBuilder.append(str2);
        stringBuilder.append(", rotation ");
        stringBuilder.append(str3);
      } 
      return;
    } finally {
      mediaMetadataRetriever.release();
    } 
  }
  
  private void i(b paramb, int paramInt1, int paramInt2) throws IOException {
    if (w) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("getJpegAttributes starting with: ");
      stringBuilder1.append(paramb);
    } 
    paramb.x(ByteOrder.BIG_ENDIAN);
    paramb.t(paramInt1);
    int i = paramb.readByte();
    if (i == -1) {
      if (paramb.readByte() == -40) {
        paramInt1 = paramInt1 + 1 + 1;
        while (true) {
          i = paramb.readByte();
          if (i == -1) {
            byte b1 = paramb.readByte();
            boolean bool = w;
            if (bool) {
              StringBuilder stringBuilder3 = new StringBuilder();
              stringBuilder3.append("Found JPEG segment indicator: ");
              stringBuilder3.append(Integer.toHexString(b1 & 0xFF));
            } 
            if (b1 != -39) {
              if (b1 == -38)
                continue; 
              int j = paramb.readUnsignedShort() - 2;
              i = paramInt1 + 1 + 1 + 2;
              if (bool) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("JPEG segment: ");
                stringBuilder3.append(Integer.toHexString(b1 & 0xFF));
                stringBuilder3.append(" (length: ");
                stringBuilder3.append(j + 2);
                stringBuilder3.append(")");
              } 
              if (j >= 0) {
                if (b1 != -31) {
                  if (b1 != -2) {
                    switch (b1) {
                      default:
                        switch (b1) {
                          default:
                            switch (b1) {
                              default:
                                switch (b1) {
                                  default:
                                    paramInt1 = j;
                                    break;
                                  case -51:
                                  case -50:
                                  case -49:
                                    break;
                                } 
                                break;
                              case -55:
                              case -54:
                              case -53:
                                break;
                            } 
                            break;
                          case -59:
                          case -58:
                          case -57:
                            break;
                        } 
                      case -64:
                      case -63:
                      case -62:
                      case -61:
                        if (paramb.skipBytes(1) == 1) {
                          this.f[paramInt2].put("ImageLength", c.b(paramb.readUnsignedShort(), this.h));
                          this.f[paramInt2].put("ImageWidth", c.b(paramb.readUnsignedShort(), this.h));
                          paramInt1 = j - 5;
                          break;
                        } 
                        throw new IOException("Invalid SOFx");
                    } 
                  } else {
                    byte[] arrayOfByte = new byte[j];
                    if (paramb.read(arrayOfByte) == j) {
                      if (e("UserComment") == null)
                        this.f[1].put("UserComment", c.a(new String(arrayOfByte, s0))); 
                      paramInt1 = i;
                    } else {
                      throw new IOException("Invalid exif");
                    } 
                    b1 = 0;
                    i = paramInt1;
                    paramInt1 = b1;
                  } 
                } else {
                  byte[] arrayOfByte1 = new byte[j];
                  paramb.readFully(arrayOfByte1);
                  int k = i + j;
                  byte[] arrayOfByte2 = t0;
                  if (N(arrayOfByte1, arrayOfByte2)) {
                    paramInt1 = arrayOfByte2.length;
                    arrayOfByte1 = Arrays.copyOfRange(arrayOfByte1, arrayOfByte2.length, j);
                    this.p = i + paramInt1;
                    J(arrayOfByte1, paramInt2);
                    paramInt1 = k;
                  } else {
                    arrayOfByte2 = u0;
                    paramInt1 = k;
                    if (N(arrayOfByte1, arrayOfByte2)) {
                      int m = arrayOfByte2.length;
                      arrayOfByte1 = Arrays.copyOfRange(arrayOfByte1, arrayOfByte2.length, j);
                      paramInt1 = k;
                      if (e("Xmp") == null) {
                        this.f[0].put("Xmp", new c(1, arrayOfByte1.length, (i + m), arrayOfByte1));
                        this.v = true;
                        paramInt1 = k;
                      } 
                    } 
                  } 
                  k = 0;
                  i = paramInt1;
                  paramInt1 = k;
                } 
                if (paramInt1 >= 0) {
                  if (paramb.skipBytes(paramInt1) == paramInt1) {
                    paramInt1 = i + paramInt1;
                    continue;
                  } 
                  throw new IOException("Invalid JPEG segment");
                } 
                throw new IOException("Invalid length");
              } 
              throw new IOException("Invalid length");
            } 
            paramb.x(this.h);
            return;
          } 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Invalid marker:");
          stringBuilder2.append(Integer.toHexString(i & 0xFF));
          throw new IOException(stringBuilder2.toString());
        } 
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Invalid marker: ");
      stringBuilder1.append(Integer.toHexString(i & 0xFF));
      throw new IOException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid marker: ");
    stringBuilder.append(Integer.toHexString(i & 0xFF));
    throw new IOException(stringBuilder.toString());
  }
  
  private int j(BufferedInputStream paramBufferedInputStream) throws IOException {
    paramBufferedInputStream.mark(5000);
    byte[] arrayOfByte = new byte[5000];
    paramBufferedInputStream.read(arrayOfByte);
    paramBufferedInputStream.reset();
    return w(arrayOfByte) ? 4 : (z(arrayOfByte) ? 9 : (v(arrayOfByte) ? 12 : (x(arrayOfByte) ? 7 : (A(arrayOfByte) ? 10 : (y(arrayOfByte) ? 13 : (E(arrayOfByte) ? 14 : 0))))));
  }
  
  private void k(b paramb) throws IOException {
    n(paramb);
    c c = this.f[1].get("MakerNote");
    if (c != null) {
      b b1 = new b(c.d);
      b1.x(this.h);
      byte[] arrayOfByte1 = G;
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
      b1.readFully(arrayOfByte2);
      b1.t(0L);
      byte[] arrayOfByte3 = H;
      byte[] arrayOfByte4 = new byte[arrayOfByte3.length];
      b1.readFully(arrayOfByte4);
      if (Arrays.equals(arrayOfByte2, arrayOfByte1)) {
        b1.t(8L);
      } else if (Arrays.equals(arrayOfByte4, arrayOfByte3)) {
        b1.t(12L);
      } 
      K(b1, 6);
      c c1 = this.f[7].get("PreviewImageStart");
      c c2 = this.f[7].get("PreviewImageLength");
      if (c1 != null && c2 != null) {
        this.f[5].put("JPEGInterchangeFormat", c1);
        this.f[5].put("JPEGInterchangeFormatLength", c2);
      } 
      c1 = this.f[8].get("AspectFrame");
      if (c1 != null) {
        int[] arrayOfInt = (int[])c1.k(this.h);
        if (arrayOfInt == null || arrayOfInt.length != 4) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid aspect frame values. frame=");
          stringBuilder.append(Arrays.toString(arrayOfInt));
          return;
        } 
        int i = arrayOfInt[2];
        int j = arrayOfInt[0];
        if (i > j) {
          int k = arrayOfInt[3];
          int m = arrayOfInt[1];
          if (k > m) {
            i = i - j + 1;
            j = k - m + 1;
            m = i;
            k = j;
            if (i < j) {
              m = i + j;
              k = m - j;
              m -= k;
            } 
            c c3 = c.f(m, this.h);
            c2 = c.f(k, this.h);
            this.f[0].put("ImageWidth", c3);
            this.f[0].put("ImageLength", c2);
            return;
          } 
        } 
      } 
    } 
  }
  
  private void l(b paramb) throws IOException {
    if (w) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("getPngAttributes starting with: ");
      stringBuilder.append(paramb);
    } 
    paramb.x(ByteOrder.BIG_ENDIAN);
    byte[] arrayOfByte = I;
    paramb.skipBytes(arrayOfByte.length);
    int i = arrayOfByte.length + 0;
    try {
      while (true) {
        int j = paramb.readInt();
        arrayOfByte = new byte[4];
        if (paramb.read(arrayOfByte) == 4) {
          i = i + 4 + 4;
          if (i != 16 || Arrays.equals(arrayOfByte, K)) {
            StringBuilder stringBuilder;
            if (Arrays.equals(arrayOfByte, L))
              return; 
            if (Arrays.equals(arrayOfByte, J)) {
              StringBuilder stringBuilder1;
              byte[] arrayOfByte1 = new byte[j];
              if (paramb.read(arrayOfByte1) == j) {
                j = paramb.readInt();
                CRC32 cRC32 = new CRC32();
                cRC32.update(arrayOfByte);
                cRC32.update(arrayOfByte1);
                if ((int)cRC32.getValue() == j) {
                  this.p = i;
                  J(arrayOfByte1, 0);
                  Q();
                  return;
                } 
                stringBuilder1 = new StringBuilder();
                stringBuilder1.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                stringBuilder1.append(j);
                stringBuilder1.append(", calculated CRC value: ");
                stringBuilder1.append(cRC32.getValue());
                throw new IOException(stringBuilder1.toString());
              } 
              stringBuilder = new StringBuilder();
              stringBuilder.append("Failed to read given length for given PNG chunk type: ");
              stringBuilder.append(b((byte[])stringBuilder1));
              throw new IOException(stringBuilder.toString());
            } 
            j += 4;
            stringBuilder.skipBytes(j);
            i += j;
            continue;
          } 
          throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
        } 
        throw new IOException("Encountered invalid length while parsing PNG chunktype");
      } 
    } catch (EOFException eOFException) {
      throw new IOException("Encountered corrupt PNG file.");
    } 
  }
  
  private void m(b paramb) throws IOException {
    paramb.skipBytes(84);
    byte[] arrayOfByte1 = new byte[4];
    byte[] arrayOfByte2 = new byte[4];
    paramb.read(arrayOfByte1);
    paramb.skipBytes(4);
    paramb.read(arrayOfByte2);
    int i = ByteBuffer.wrap(arrayOfByte1).getInt();
    int j = ByteBuffer.wrap(arrayOfByte2).getInt();
    i(paramb, i, 5);
    paramb.t(j);
    paramb.x(ByteOrder.BIG_ENDIAN);
    j = paramb.readInt();
    if (w) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("numberOfDirectoryEntry: ");
      stringBuilder.append(j);
    } 
    for (i = 0; i < j; i++) {
      StringBuilder stringBuilder;
      int k = paramb.readUnsignedShort();
      int m = paramb.readUnsignedShort();
      if (k == f0.a) {
        i = paramb.readShort();
        j = paramb.readShort();
        c c1 = c.f(i, this.h);
        c c2 = c.f(j, this.h);
        this.f[0].put("ImageLength", c1);
        this.f[0].put("ImageWidth", c2);
        if (w) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Updated to length: ");
          stringBuilder.append(i);
          stringBuilder.append(", width: ");
          stringBuilder.append(j);
        } 
        return;
      } 
      stringBuilder.skipBytes(m);
    } 
  }
  
  private void n(b paramb) throws IOException {
    G(paramb, paramb.available());
    K(paramb, 0);
    P(paramb, 0);
    P(paramb, 5);
    P(paramb, 4);
    Q();
    if (this.d == 8) {
      c c = this.f[1].get("MakerNote");
      if (c != null) {
        b b1 = new b(c.d);
        b1.x(this.h);
        b1.t(6L);
        K(b1, 9);
        c c1 = this.f[9].get("ColorSpace");
        if (c1 != null)
          this.f[1].put("ColorSpace", c1); 
      } 
    } 
  }
  
  private void o(b paramb) throws IOException {
    n(paramb);
    if ((c)this.f[0].get("JpgFromRaw") != null)
      i(paramb, this.t, 5); 
    c c1 = this.f[0].get("ISO");
    c c2 = this.f[1].get("PhotographicSensitivity");
    if (c1 != null && c2 == null)
      this.f[1].put("PhotographicSensitivity", c1); 
  }
  
  private void p(b paramb) throws IOException {
    byte[] arrayOfByte1 = t0;
    paramb.skipBytes(arrayOfByte1.length);
    byte[] arrayOfByte2 = new byte[paramb.available()];
    paramb.readFully(arrayOfByte2);
    this.p = arrayOfByte1.length;
    J(arrayOfByte2, 0);
  }
  
  private void q(b paramb) throws IOException {
    if (w) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("getWebpAttributes starting with: ");
      stringBuilder.append(paramb);
    } 
    paramb.x(ByteOrder.LITTLE_ENDIAN);
    paramb.skipBytes(M.length);
    int j = paramb.readInt() + 8;
    int i = paramb.skipBytes(N.length) + 8;
    try {
      while (true) {
        byte[] arrayOfByte = new byte[4];
        if (paramb.read(arrayOfByte) == 4) {
          StringBuilder stringBuilder;
          int k = paramb.readInt();
          int m = i + 4 + 4;
          if (Arrays.equals(O, arrayOfByte)) {
            byte[] arrayOfByte1 = new byte[k];
            if (paramb.read(arrayOfByte1) == k) {
              this.p = m;
              J(arrayOfByte1, 0);
              this.p = m;
              return;
            } 
            stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to read given length for given PNG chunk type: ");
            stringBuilder.append(b(arrayOfByte));
            throw new IOException(stringBuilder.toString());
          } 
          i = k;
          if (k % 2 == 1)
            i = k + 1; 
          k = m + i;
          if (k == j)
            return; 
          if (k <= j) {
            k = stringBuilder.skipBytes(i);
            if (k == i) {
              i = m + k;
              continue;
            } 
            throw new IOException("Encountered WebP file with invalid chunk size");
          } 
          throw new IOException("Encountered WebP file with invalid chunk size");
        } 
        throw new IOException("Encountered invalid length while parsing WebP chunktype");
      } 
    } catch (EOFException eOFException) {
      throw new IOException("Encountered corrupt WebP file.");
    } 
  }
  
  private void r(b paramb, HashMap paramHashMap) throws IOException {
    c c2 = (c)paramHashMap.get("JPEGInterchangeFormat");
    c c1 = (c)paramHashMap.get("JPEGInterchangeFormatLength");
    if (c2 != null && c1 != null) {
      int j = c2.i(this.h);
      int k = c1.i(this.h);
      int i = j;
      if (this.d == 7)
        i = j + this.q; 
      j = Math.min(k, paramb.c() - i);
      if (i > 0 && j > 0) {
        this.i = true;
        k = this.p + i;
        this.l = k;
        this.m = j;
        if (this.a == null && this.c == null && this.b == null) {
          byte[] arrayOfByte = new byte[j];
          paramb.t(k);
          paramb.readFully(arrayOfByte);
          this.n = arrayOfByte;
        } 
      } 
      if (w) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Setting thumbnail attributes with offset: ");
        stringBuilder.append(i);
        stringBuilder.append(", length: ");
        stringBuilder.append(j);
      } 
    } 
  }
  
  private void s(b paramb, HashMap paramHashMap) throws IOException {
    c c1 = (c)paramHashMap.get("StripOffsets");
    c c2 = (c)paramHashMap.get("StripByteCounts");
    if (c1 != null && c2 != null) {
      long[] arrayOfLong1 = d(c1.k(this.h));
      long[] arrayOfLong2 = d(c2.k(this.h));
      if (arrayOfLong1 != null) {
        if (arrayOfLong1.length == 0)
          return; 
        if (arrayOfLong2 != null) {
          if (arrayOfLong2.length == 0)
            return; 
          if (arrayOfLong1.length != arrayOfLong2.length)
            return; 
          int j = arrayOfLong2.length;
          long l = 0L;
          int i;
          for (i = 0; i < j; i++)
            l += arrayOfLong2[i]; 
          int m = (int)l;
          byte[] arrayOfByte = new byte[m];
          this.k = true;
          this.j = true;
          this.i = true;
          j = 0;
          int k = 0;
          i = 0;
          while (j < arrayOfLong1.length) {
            int i1 = (int)arrayOfLong1[j];
            int n = (int)arrayOfLong2[j];
            if (j < arrayOfLong1.length - 1 && (i1 + n) != arrayOfLong1[j + 1])
              this.k = false; 
            i1 -= k;
            paramb.t(i1);
            byte[] arrayOfByte1 = new byte[n];
            paramb.read(arrayOfByte1);
            k = k + i1 + n;
            System.arraycopy(arrayOfByte1, 0, arrayOfByte, i, n);
            i += n;
            j++;
          } 
          this.n = arrayOfByte;
          if (this.k) {
            this.l = (int)arrayOfLong1[0] + this.p;
            this.m = m;
          } 
        } 
      } 
    } 
  }
  
  private void t(String paramString) throws IOException {
    if (paramString != null) {
      Exception exception;
      String str = null;
      this.c = null;
      this.a = paramString;
      try {
        FileInputStream fileInputStream = new FileInputStream(paramString);
      } finally {
        exception = null;
      } 
      c((Closeable)paramString);
      throw exception;
    } 
    throw new NullPointerException("filename cannot be null");
  }
  
  private static boolean u(BufferedInputStream paramBufferedInputStream) throws IOException {
    byte[] arrayOfByte = t0;
    paramBufferedInputStream.mark(arrayOfByte.length);
    arrayOfByte = new byte[arrayOfByte.length];
    paramBufferedInputStream.read(arrayOfByte);
    paramBufferedInputStream.reset();
    int i = 0;
    while (true) {
      byte[] arrayOfByte1 = t0;
      if (i < arrayOfByte1.length) {
        if (arrayOfByte[i] != arrayOfByte1[i])
          return false; 
        i++;
        continue;
      } 
      return true;
    } 
  }
  
  private boolean v(byte[] paramArrayOfbyte) throws IOException {
    b b1;
    Exception exception = null;
    byte[] arrayOfByte2 = null;
    try {
      b b2 = new b(paramArrayOfbyte);
    } catch (Exception exception1) {
    
    } finally {
      if (b1 != null)
        b1.close(); 
    } 
    byte[] arrayOfByte1 = paramArrayOfbyte;
    boolean bool = w;
    if (paramArrayOfbyte != null)
      paramArrayOfbyte.close(); 
    return false;
  }
  
  private static boolean w(byte[] paramArrayOfbyte) throws IOException {
    int i = 0;
    while (true) {
      byte[] arrayOfByte = C;
      if (i < arrayOfByte.length) {
        if (paramArrayOfbyte[i] != arrayOfByte[i])
          return false; 
        i++;
        continue;
      } 
      return true;
    } 
  }
  
  private boolean x(byte[] paramArrayOfbyte) throws IOException {
    boolean bool = false;
    null = null;
    byte[] arrayOfByte = null;
    try {
    
    } catch (Exception exception) {
    
    } finally {
      paramArrayOfbyte = arrayOfByte;
      if (paramArrayOfbyte != null)
        paramArrayOfbyte.close(); 
    } 
    if (paramArrayOfbyte != null)
      paramArrayOfbyte.close(); 
    return false;
  }
  
  private boolean y(byte[] paramArrayOfbyte) throws IOException {
    int i = 0;
    while (true) {
      byte[] arrayOfByte = I;
      if (i < arrayOfByte.length) {
        if (paramArrayOfbyte[i] != arrayOfByte[i])
          return false; 
        i++;
        continue;
      } 
      return true;
    } 
  }
  
  private boolean z(byte[] paramArrayOfbyte) throws IOException {
    byte[] arrayOfByte = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
    for (int i = 0; i < arrayOfByte.length; i++) {
      if (paramArrayOfbyte[i] != arrayOfByte[i])
        return false; 
    } 
    return true;
  }
  
  public String e(String paramString) {
    if (paramString != null) {
      c c = g(paramString);
      if (c != null) {
        e e;
        if (!q0.contains(paramString))
          return c.j(this.h); 
        if (paramString.equals("GPSTimeStamp")) {
          int i = c.a;
          if (i != 5 && i != 10) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GPS Timestamp format is not rational. format=");
            stringBuilder.append(c.a);
            return null;
          } 
          e[] arrayOfE = (e[])c.k(this.h);
          if (arrayOfE == null || arrayOfE.length != 3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid GPS Timestamp array. array=");
            stringBuilder.append(Arrays.toString((Object[])arrayOfE));
            return null;
          } 
          e = arrayOfE[0];
          i = (int)((float)e.a / (float)e.b);
          e = arrayOfE[1];
          int j = (int)((float)e.a / (float)e.b);
          e e1 = arrayOfE[2];
          return String.format("%02d:%02d:%02d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf((int)((float)e1.a / (float)e1.b)) });
        } 
        try {
          return Double.toString(e.h(this.h));
        } catch (NumberFormatException numberFormatException) {
          return null;
        } 
      } 
      return null;
    } 
    throw new NullPointerException("tag shouldn't be null");
  }
  
  public int f(String paramString, int paramInt) {
    if (paramString != null) {
      c c = g(paramString);
      if (c == null)
        return paramInt; 
      try {
        return c.i(this.h);
      } catch (NumberFormatException numberFormatException) {
        return paramInt;
      } 
    } 
    throw new NullPointerException("tag shouldn't be null");
  }
  
  static {
    Integer integer1 = Integer.valueOf(3);
  }
  
  static {
    Integer integer2 = Integer.valueOf(1);
    Integer integer3 = Integer.valueOf(2);
    Integer integer4 = Integer.valueOf(8);
    x = Arrays.asList(new Integer[] { integer2, Integer.valueOf(6), integer1, integer4 });
    Integer integer5 = Integer.valueOf(7);
    Integer integer6 = Integer.valueOf(5);
    y = Arrays.asList(new Integer[] { integer3, integer5, Integer.valueOf(4), integer6 });
  }
  
  class a extends MediaDataSource {
    long g;
    
    a(b this$0, b.b param1b) {}
    
    public void close() throws IOException {}
    
    public long getSize() throws IOException {
      return -1L;
    }
    
    public int readAt(long param1Long, byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) throws IOException {
      if (param1Int2 == 0)
        return 0; 
      if (param1Long < 0L)
        return -1; 
      try {
        long l = this.g;
        if (l != param1Long) {
          if (l >= 0L && param1Long >= l + this.h.available())
            return -1; 
          this.h.t(param1Long);
          this.g = param1Long;
        } 
        int i = param1Int2;
        if (param1Int2 > this.h.available())
          i = this.h.available(); 
        param1Int1 = this.h.read(param1ArrayOfbyte, param1Int1, i);
        if (param1Int1 >= 0) {
          this.g += param1Int1;
          return param1Int1;
        } 
      } catch (IOException iOException) {}
      this.g = -1L;
      return -1;
    }
  }
  
  private static class b extends InputStream implements DataInput {
    private static final ByteOrder k = ByteOrder.LITTLE_ENDIAN;
    
    private static final ByteOrder l = ByteOrder.BIG_ENDIAN;
    
    private DataInputStream g;
    
    private ByteOrder h = ByteOrder.BIG_ENDIAN;
    
    final int i;
    
    int j;
    
    public b(InputStream param1InputStream) throws IOException {
      this(param1InputStream, ByteOrder.BIG_ENDIAN);
    }
    
    b(InputStream param1InputStream, ByteOrder param1ByteOrder) throws IOException {
      param1InputStream = new DataInputStream(param1InputStream);
      this.g = (DataInputStream)param1InputStream;
      int i = param1InputStream.available();
      this.i = i;
      this.j = 0;
      this.g.mark(i);
      this.h = param1ByteOrder;
    }
    
    public b(byte[] param1ArrayOfbyte) throws IOException {
      this(new ByteArrayInputStream(param1ArrayOfbyte));
    }
    
    public int available() throws IOException {
      return this.g.available();
    }
    
    public int c() {
      return this.i;
    }
    
    public int d() {
      return this.j;
    }
    
    public long r() throws IOException {
      return readInt() & 0xFFFFFFFFL;
    }
    
    public int read() throws IOException {
      this.j++;
      return this.g.read();
    }
    
    public int read(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) throws IOException {
      param1Int1 = this.g.read(param1ArrayOfbyte, param1Int1, param1Int2);
      this.j += param1Int1;
      return param1Int1;
    }
    
    public boolean readBoolean() throws IOException {
      this.j++;
      return this.g.readBoolean();
    }
    
    public byte readByte() throws IOException {
      int i = this.j + 1;
      this.j = i;
      if (i <= this.i) {
        i = this.g.read();
        if (i >= 0)
          return (byte)i; 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public char readChar() throws IOException {
      this.j += 2;
      return this.g.readChar();
    }
    
    public double readDouble() throws IOException {
      return Double.longBitsToDouble(readLong());
    }
    
    public float readFloat() throws IOException {
      return Float.intBitsToFloat(readInt());
    }
    
    public void readFully(byte[] param1ArrayOfbyte) throws IOException {
      int i = this.j + param1ArrayOfbyte.length;
      this.j = i;
      if (i <= this.i) {
        if (this.g.read(param1ArrayOfbyte, 0, param1ArrayOfbyte.length) == param1ArrayOfbyte.length)
          return; 
        throw new IOException("Couldn't read up to the length of buffer");
      } 
      throw new EOFException();
    }
    
    public void readFully(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) throws IOException {
      int i = this.j + param1Int2;
      this.j = i;
      if (i <= this.i) {
        if (this.g.read(param1ArrayOfbyte, param1Int1, param1Int2) == param1Int2)
          return; 
        throw new IOException("Couldn't read up to the length of buffer");
      } 
      throw new EOFException();
    }
    
    public int readInt() throws IOException {
      int i = this.j + 4;
      this.j = i;
      if (i <= this.i) {
        i = this.g.read();
        int j = this.g.read();
        int k = this.g.read();
        int m = this.g.read();
        if ((i | j | k | m) >= 0) {
          ByteOrder byteOrder = this.h;
          if (byteOrder == k)
            return (m << 24) + (k << 16) + (j << 8) + i; 
          if (byteOrder == l)
            return (i << 24) + (j << 16) + (k << 8) + m; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid byte order: ");
          stringBuilder.append(this.h);
          throw new IOException(stringBuilder.toString());
        } 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public String readLine() throws IOException {
      return null;
    }
    
    public long readLong() throws IOException {
      int i = this.j + 8;
      this.j = i;
      if (i <= this.i) {
        i = this.g.read();
        int j = this.g.read();
        int k = this.g.read();
        int m = this.g.read();
        int n = this.g.read();
        int i1 = this.g.read();
        int i2 = this.g.read();
        int i3 = this.g.read();
        if ((i | j | k | m | n | i1 | i2 | i3) >= 0) {
          ByteOrder byteOrder = this.h;
          if (byteOrder == k)
            return (i3 << 56L) + (i2 << 48L) + (i1 << 40L) + (n << 32L) + (m << 24L) + (k << 16L) + (j << 8L) + i; 
          if (byteOrder == l)
            return (i << 56L) + (j << 48L) + (k << 40L) + (m << 32L) + (n << 24L) + (i1 << 16L) + (i2 << 8L) + i3; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid byte order: ");
          stringBuilder.append(this.h);
          throw new IOException(stringBuilder.toString());
        } 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public short readShort() throws IOException {
      int i = this.j + 2;
      this.j = i;
      if (i <= this.i) {
        i = this.g.read();
        int j = this.g.read();
        if ((i | j) >= 0) {
          ByteOrder byteOrder = this.h;
          if (byteOrder == k)
            return (short)((j << 8) + i); 
          if (byteOrder == l)
            return (short)((i << 8) + j); 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid byte order: ");
          stringBuilder.append(this.h);
          throw new IOException(stringBuilder.toString());
        } 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public String readUTF() throws IOException {
      this.j += 2;
      return this.g.readUTF();
    }
    
    public int readUnsignedByte() throws IOException {
      this.j++;
      return this.g.readUnsignedByte();
    }
    
    public int readUnsignedShort() throws IOException {
      int i = this.j + 2;
      this.j = i;
      if (i <= this.i) {
        i = this.g.read();
        int j = this.g.read();
        if ((i | j) >= 0) {
          ByteOrder byteOrder = this.h;
          if (byteOrder == k)
            return (j << 8) + i; 
          if (byteOrder == l)
            return (i << 8) + j; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Invalid byte order: ");
          stringBuilder.append(this.h);
          throw new IOException(stringBuilder.toString());
        } 
        throw new EOFException();
      } 
      throw new EOFException();
    }
    
    public int skipBytes(int param1Int) throws IOException {
      int i = Math.min(param1Int, this.i - this.j);
      for (param1Int = 0; param1Int < i; param1Int += this.g.skipBytes(i - param1Int));
      this.j += param1Int;
      return param1Int;
    }
    
    public void t(long param1Long) throws IOException {
      int i = this.j;
      if (i > param1Long) {
        this.j = 0;
        this.g.reset();
        this.g.mark(this.i);
      } else {
        param1Long -= i;
      } 
      i = (int)param1Long;
      if (skipBytes(i) == i)
        return; 
      throw new IOException("Couldn't seek up to the byteCount");
    }
    
    public void x(ByteOrder param1ByteOrder) {
      this.h = param1ByteOrder;
    }
  }
  
  private static class c {
    public final int a;
    
    public final int b;
    
    public final long c;
    
    public final byte[] d;
    
    c(int param1Int1, int param1Int2, long param1Long, byte[] param1ArrayOfbyte) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.c = param1Long;
      this.d = param1ArrayOfbyte;
    }
    
    c(int param1Int1, int param1Int2, byte[] param1ArrayOfbyte) {
      this(param1Int1, param1Int2, -1L, param1ArrayOfbyte);
    }
    
    public static c a(String param1String) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(param1String);
      stringBuilder.append(false);
      byte[] arrayOfByte = stringBuilder.toString().getBytes(b.s0);
      return new c(2, arrayOfByte.length, arrayOfByte);
    }
    
    public static c b(long param1Long, ByteOrder param1ByteOrder) {
      return c(new long[] { param1Long }, param1ByteOrder);
    }
    
    public static c c(long[] param1ArrayOflong, ByteOrder param1ByteOrder) {
      ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[b.Y[4] * param1ArrayOflong.length]);
      byteBuffer.order(param1ByteOrder);
      int j = param1ArrayOflong.length;
      for (int i = 0; i < j; i++)
        byteBuffer.putInt((int)param1ArrayOflong[i]); 
      return new c(4, param1ArrayOflong.length, byteBuffer.array());
    }
    
    public static c d(b.e param1e, ByteOrder param1ByteOrder) {
      return e(new b.e[] { param1e }, param1ByteOrder);
    }
    
    public static c e(b.e[] param1ArrayOfe, ByteOrder param1ByteOrder) {
      ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[b.Y[5] * param1ArrayOfe.length]);
      byteBuffer.order(param1ByteOrder);
      int j = param1ArrayOfe.length;
      for (int i = 0; i < j; i++) {
        b.e e1 = param1ArrayOfe[i];
        byteBuffer.putInt((int)e1.a);
        byteBuffer.putInt((int)e1.b);
      } 
      return new c(5, param1ArrayOfe.length, byteBuffer.array());
    }
    
    public static c f(int param1Int, ByteOrder param1ByteOrder) {
      return g(new int[] { param1Int }, param1ByteOrder);
    }
    
    public static c g(int[] param1ArrayOfint, ByteOrder param1ByteOrder) {
      ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[b.Y[3] * param1ArrayOfint.length]);
      byteBuffer.order(param1ByteOrder);
      int j = param1ArrayOfint.length;
      for (int i = 0; i < j; i++)
        byteBuffer.putShort((short)param1ArrayOfint[i]); 
      return new c(3, param1ArrayOfint.length, byteBuffer.array());
    }
    
    public double h(ByteOrder param1ByteOrder) {
      Object object = k(param1ByteOrder);
      if (object != null) {
        if (object instanceof String)
          return Double.parseDouble((String)object); 
        if (object instanceof long[]) {
          object = object;
          if (object.length == 1)
            return object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        if (object instanceof int[]) {
          object = object;
          if (object.length == 1)
            return object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        if (object instanceof double[]) {
          object = object;
          if (object.length == 1)
            return object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        if (object instanceof b.e[]) {
          object = object;
          if (object.length == 1)
            return object[0].a(); 
          throw new NumberFormatException("There are more than one component");
        } 
        throw new NumberFormatException("Couldn't find a double value");
      } 
      throw new NumberFormatException("NULL can't be converted to a double value");
    }
    
    public int i(ByteOrder param1ByteOrder) {
      Object object = k(param1ByteOrder);
      if (object != null) {
        if (object instanceof String)
          return Integer.parseInt((String)object); 
        if (object instanceof long[]) {
          object = object;
          if (object.length == 1)
            return (int)object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        if (object instanceof int[]) {
          object = object;
          if (object.length == 1)
            return object[0]; 
          throw new NumberFormatException("There are more than one component");
        } 
        throw new NumberFormatException("Couldn't find a integer value");
      } 
      throw new NumberFormatException("NULL can't be converted to a integer value");
    }
    
    public String j(ByteOrder param1ByteOrder) {
      Object object = k(param1ByteOrder);
      if (object == null)
        return null; 
      if (object instanceof String)
        return (String)object; 
      StringBuilder stringBuilder = new StringBuilder();
      boolean bool = object instanceof long[];
      int j = 0;
      boolean bool1 = false;
      boolean bool2 = false;
      int i = 0;
      if (bool) {
        object = object;
        while (i < object.length) {
          stringBuilder.append(object[i]);
          j = i + 1;
          i = j;
          if (j != object.length) {
            stringBuilder.append(",");
            i = j;
          } 
        } 
        return stringBuilder.toString();
      } 
      if (object instanceof int[]) {
        object = object;
        i = j;
        while (i < object.length) {
          stringBuilder.append(object[i]);
          j = i + 1;
          i = j;
          if (j != object.length) {
            stringBuilder.append(",");
            i = j;
          } 
        } 
        return stringBuilder.toString();
      } 
      if (object instanceof double[]) {
        object = object;
        i = bool1;
        while (i < object.length) {
          stringBuilder.append(object[i]);
          j = i + 1;
          i = j;
          if (j != object.length) {
            stringBuilder.append(",");
            i = j;
          } 
        } 
        return stringBuilder.toString();
      } 
      if (object instanceof b.e[]) {
        object = object;
        i = bool2;
        while (i < object.length) {
          stringBuilder.append(((b.e)object[i]).a);
          stringBuilder.append('/');
          stringBuilder.append(((b.e)object[i]).b);
          j = i + 1;
          i = j;
          if (j != object.length) {
            stringBuilder.append(",");
            i = j;
          } 
        } 
        return stringBuilder.toString();
      } 
      return null;
    }
    
    Object k(ByteOrder param1ByteOrder) {
      // Byte code:
      //   0: aconst_null
      //   1: astore #14
      //   3: new e0/b$b
      //   6: dup
      //   7: aload_0
      //   8: getfield d : [B
      //   11: invokespecial <init> : ([B)V
      //   14: astore #13
      //   16: aload #13
      //   18: aload_1
      //   19: invokevirtual x : (Ljava/nio/ByteOrder;)V
      //   22: aload_0
      //   23: getfield a : I
      //   26: istore #12
      //   28: iconst_0
      //   29: istore_3
      //   30: iconst_0
      //   31: istore #6
      //   33: iconst_0
      //   34: istore #7
      //   36: iconst_0
      //   37: istore #8
      //   39: iconst_0
      //   40: istore #9
      //   42: iconst_0
      //   43: istore #10
      //   45: iconst_0
      //   46: istore #11
      //   48: iconst_0
      //   49: istore #4
      //   51: iconst_0
      //   52: istore_2
      //   53: iconst_1
      //   54: istore #5
      //   56: iload #12
      //   58: tableswitch default -> 764, 1 -> 589, 2 -> 465, 3 -> 425, 4 -> 385, 5 -> 332, 6 -> 589, 7 -> 465, 8 -> 292, 9 -> 252, 10 -> 197, 11 -> 157, 12 -> 120
      //   120: aload_0
      //   121: getfield b : I
      //   124: newarray double
      //   126: astore_1
      //   127: iload_2
      //   128: aload_0
      //   129: getfield b : I
      //   132: if_icmpge -> 150
      //   135: aload_1
      //   136: iload_2
      //   137: aload #13
      //   139: invokevirtual readDouble : ()D
      //   142: dastore
      //   143: iload_2
      //   144: iconst_1
      //   145: iadd
      //   146: istore_2
      //   147: goto -> 127
      //   150: aload #13
      //   152: invokevirtual close : ()V
      //   155: aload_1
      //   156: areturn
      //   157: aload_0
      //   158: getfield b : I
      //   161: newarray double
      //   163: astore_1
      //   164: iload_3
      //   165: istore_2
      //   166: iload_2
      //   167: aload_0
      //   168: getfield b : I
      //   171: if_icmpge -> 190
      //   174: aload_1
      //   175: iload_2
      //   176: aload #13
      //   178: invokevirtual readFloat : ()F
      //   181: f2d
      //   182: dastore
      //   183: iload_2
      //   184: iconst_1
      //   185: iadd
      //   186: istore_2
      //   187: goto -> 166
      //   190: aload #13
      //   192: invokevirtual close : ()V
      //   195: aload_1
      //   196: areturn
      //   197: aload_0
      //   198: getfield b : I
      //   201: anewarray e0/b$e
      //   204: astore_1
      //   205: iload #6
      //   207: istore_2
      //   208: iload_2
      //   209: aload_0
      //   210: getfield b : I
      //   213: if_icmpge -> 245
      //   216: aload_1
      //   217: iload_2
      //   218: new e0/b$e
      //   221: dup
      //   222: aload #13
      //   224: invokevirtual readInt : ()I
      //   227: i2l
      //   228: aload #13
      //   230: invokevirtual readInt : ()I
      //   233: i2l
      //   234: invokespecial <init> : (JJ)V
      //   237: aastore
      //   238: iload_2
      //   239: iconst_1
      //   240: iadd
      //   241: istore_2
      //   242: goto -> 208
      //   245: aload #13
      //   247: invokevirtual close : ()V
      //   250: aload_1
      //   251: areturn
      //   252: aload_0
      //   253: getfield b : I
      //   256: newarray int
      //   258: astore_1
      //   259: iload #7
      //   261: istore_2
      //   262: iload_2
      //   263: aload_0
      //   264: getfield b : I
      //   267: if_icmpge -> 285
      //   270: aload_1
      //   271: iload_2
      //   272: aload #13
      //   274: invokevirtual readInt : ()I
      //   277: iastore
      //   278: iload_2
      //   279: iconst_1
      //   280: iadd
      //   281: istore_2
      //   282: goto -> 262
      //   285: aload #13
      //   287: invokevirtual close : ()V
      //   290: aload_1
      //   291: areturn
      //   292: aload_0
      //   293: getfield b : I
      //   296: newarray int
      //   298: astore_1
      //   299: iload #8
      //   301: istore_2
      //   302: iload_2
      //   303: aload_0
      //   304: getfield b : I
      //   307: if_icmpge -> 325
      //   310: aload_1
      //   311: iload_2
      //   312: aload #13
      //   314: invokevirtual readShort : ()S
      //   317: iastore
      //   318: iload_2
      //   319: iconst_1
      //   320: iadd
      //   321: istore_2
      //   322: goto -> 302
      //   325: aload #13
      //   327: invokevirtual close : ()V
      //   330: aload_1
      //   331: areturn
      //   332: aload_0
      //   333: getfield b : I
      //   336: anewarray e0/b$e
      //   339: astore_1
      //   340: iload #9
      //   342: istore_2
      //   343: iload_2
      //   344: aload_0
      //   345: getfield b : I
      //   348: if_icmpge -> 378
      //   351: aload_1
      //   352: iload_2
      //   353: new e0/b$e
      //   356: dup
      //   357: aload #13
      //   359: invokevirtual r : ()J
      //   362: aload #13
      //   364: invokevirtual r : ()J
      //   367: invokespecial <init> : (JJ)V
      //   370: aastore
      //   371: iload_2
      //   372: iconst_1
      //   373: iadd
      //   374: istore_2
      //   375: goto -> 343
      //   378: aload #13
      //   380: invokevirtual close : ()V
      //   383: aload_1
      //   384: areturn
      //   385: aload_0
      //   386: getfield b : I
      //   389: newarray long
      //   391: astore_1
      //   392: iload #10
      //   394: istore_2
      //   395: iload_2
      //   396: aload_0
      //   397: getfield b : I
      //   400: if_icmpge -> 418
      //   403: aload_1
      //   404: iload_2
      //   405: aload #13
      //   407: invokevirtual r : ()J
      //   410: lastore
      //   411: iload_2
      //   412: iconst_1
      //   413: iadd
      //   414: istore_2
      //   415: goto -> 395
      //   418: aload #13
      //   420: invokevirtual close : ()V
      //   423: aload_1
      //   424: areturn
      //   425: aload_0
      //   426: getfield b : I
      //   429: newarray int
      //   431: astore_1
      //   432: iload #11
      //   434: istore_2
      //   435: iload_2
      //   436: aload_0
      //   437: getfield b : I
      //   440: if_icmpge -> 458
      //   443: aload_1
      //   444: iload_2
      //   445: aload #13
      //   447: invokevirtual readUnsignedShort : ()I
      //   450: iastore
      //   451: iload_2
      //   452: iconst_1
      //   453: iadd
      //   454: istore_2
      //   455: goto -> 435
      //   458: aload #13
      //   460: invokevirtual close : ()V
      //   463: aload_1
      //   464: areturn
      //   465: iload #4
      //   467: istore_2
      //   468: aload_0
      //   469: getfield b : I
      //   472: getstatic e0/b.Z : [B
      //   475: arraylength
      //   476: if_icmplt -> 521
      //   479: iconst_0
      //   480: istore_2
      //   481: getstatic e0/b.Z : [B
      //   484: astore_1
      //   485: iload #5
      //   487: istore_3
      //   488: iload_2
      //   489: aload_1
      //   490: arraylength
      //   491: if_icmpge -> 511
      //   494: aload_0
      //   495: getfield d : [B
      //   498: iload_2
      //   499: baload
      //   500: aload_1
      //   501: iload_2
      //   502: baload
      //   503: if_icmpeq -> 767
      //   506: iconst_0
      //   507: istore_3
      //   508: goto -> 511
      //   511: iload #4
      //   513: istore_2
      //   514: iload_3
      //   515: ifeq -> 521
      //   518: aload_1
      //   519: arraylength
      //   520: istore_2
      //   521: new java/lang/StringBuilder
      //   524: dup
      //   525: invokespecial <init> : ()V
      //   528: astore_1
      //   529: iload_2
      //   530: aload_0
      //   531: getfield b : I
      //   534: if_icmpge -> 577
      //   537: aload_0
      //   538: getfield d : [B
      //   541: iload_2
      //   542: baload
      //   543: istore_3
      //   544: iload_3
      //   545: ifne -> 551
      //   548: goto -> 577
      //   551: iload_3
      //   552: bipush #32
      //   554: if_icmplt -> 567
      //   557: aload_1
      //   558: iload_3
      //   559: i2c
      //   560: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   563: pop
      //   564: goto -> 774
      //   567: aload_1
      //   568: bipush #63
      //   570: invokevirtual append : (C)Ljava/lang/StringBuilder;
      //   573: pop
      //   574: goto -> 774
      //   577: aload_1
      //   578: invokevirtual toString : ()Ljava/lang/String;
      //   581: astore_1
      //   582: aload #13
      //   584: invokevirtual close : ()V
      //   587: aload_1
      //   588: areturn
      //   589: aload_0
      //   590: getfield d : [B
      //   593: astore_1
      //   594: aload_1
      //   595: arraylength
      //   596: iconst_1
      //   597: if_icmpne -> 639
      //   600: aload_1
      //   601: iconst_0
      //   602: baload
      //   603: istore_2
      //   604: iload_2
      //   605: iflt -> 639
      //   608: iload_2
      //   609: iconst_1
      //   610: if_icmpgt -> 639
      //   613: new java/lang/String
      //   616: dup
      //   617: iconst_1
      //   618: newarray char
      //   620: dup
      //   621: iconst_0
      //   622: iload_2
      //   623: bipush #48
      //   625: iadd
      //   626: i2c
      //   627: castore
      //   628: invokespecial <init> : ([C)V
      //   631: astore_1
      //   632: aload #13
      //   634: invokevirtual close : ()V
      //   637: aload_1
      //   638: areturn
      //   639: new java/lang/String
      //   642: dup
      //   643: aload_1
      //   644: getstatic e0/b.s0 : Ljava/nio/charset/Charset;
      //   647: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
      //   650: astore_1
      //   651: aload #13
      //   653: invokevirtual close : ()V
      //   656: aload_1
      //   657: areturn
      //   658: aload #13
      //   660: invokevirtual close : ()V
      //   663: aconst_null
      //   664: areturn
      //   665: astore_1
      //   666: goto -> 674
      //   669: astore_1
      //   670: aload #14
      //   672: astore #13
      //   674: aload #13
      //   676: ifnull -> 684
      //   679: aload #13
      //   681: invokevirtual close : ()V
      //   684: aload_1
      //   685: athrow
      //   686: aconst_null
      //   687: astore #13
      //   689: aload #13
      //   691: ifnull -> 699
      //   694: aload #13
      //   696: invokevirtual close : ()V
      //   699: aconst_null
      //   700: areturn
      //   701: astore_1
      //   702: goto -> 686
      //   705: astore_1
      //   706: goto -> 689
      //   709: astore #13
      //   711: aload_1
      //   712: areturn
      //   713: astore #13
      //   715: aload_1
      //   716: areturn
      //   717: astore #13
      //   719: aload_1
      //   720: areturn
      //   721: astore #13
      //   723: aload_1
      //   724: areturn
      //   725: astore #13
      //   727: aload_1
      //   728: areturn
      //   729: astore #13
      //   731: aload_1
      //   732: areturn
      //   733: astore #13
      //   735: aload_1
      //   736: areturn
      //   737: astore #13
      //   739: aload_1
      //   740: areturn
      //   741: astore #13
      //   743: aload_1
      //   744: areturn
      //   745: astore #13
      //   747: aload_1
      //   748: areturn
      //   749: astore #13
      //   751: aload_1
      //   752: areturn
      //   753: astore_1
      //   754: aconst_null
      //   755: areturn
      //   756: astore #13
      //   758: goto -> 684
      //   761: astore_1
      //   762: aconst_null
      //   763: areturn
      //   764: goto -> 658
      //   767: iload_2
      //   768: iconst_1
      //   769: iadd
      //   770: istore_2
      //   771: goto -> 481
      //   774: iload_2
      //   775: iconst_1
      //   776: iadd
      //   777: istore_2
      //   778: goto -> 529
      // Exception table:
      //   from	to	target	type
      //   3	16	701	java/io/IOException
      //   3	16	669	finally
      //   16	28	705	java/io/IOException
      //   16	28	665	finally
      //   120	127	705	java/io/IOException
      //   120	127	665	finally
      //   127	143	705	java/io/IOException
      //   127	143	665	finally
      //   150	155	709	java/io/IOException
      //   157	164	705	java/io/IOException
      //   157	164	665	finally
      //   166	183	705	java/io/IOException
      //   166	183	665	finally
      //   190	195	713	java/io/IOException
      //   197	205	705	java/io/IOException
      //   197	205	665	finally
      //   208	238	705	java/io/IOException
      //   208	238	665	finally
      //   245	250	717	java/io/IOException
      //   252	259	705	java/io/IOException
      //   252	259	665	finally
      //   262	278	705	java/io/IOException
      //   262	278	665	finally
      //   285	290	721	java/io/IOException
      //   292	299	705	java/io/IOException
      //   292	299	665	finally
      //   302	318	705	java/io/IOException
      //   302	318	665	finally
      //   325	330	725	java/io/IOException
      //   332	340	705	java/io/IOException
      //   332	340	665	finally
      //   343	371	705	java/io/IOException
      //   343	371	665	finally
      //   378	383	729	java/io/IOException
      //   385	392	705	java/io/IOException
      //   385	392	665	finally
      //   395	411	705	java/io/IOException
      //   395	411	665	finally
      //   418	423	733	java/io/IOException
      //   425	432	705	java/io/IOException
      //   425	432	665	finally
      //   435	451	705	java/io/IOException
      //   435	451	665	finally
      //   458	463	737	java/io/IOException
      //   468	479	705	java/io/IOException
      //   468	479	665	finally
      //   481	485	705	java/io/IOException
      //   481	485	665	finally
      //   488	506	705	java/io/IOException
      //   488	506	665	finally
      //   518	521	705	java/io/IOException
      //   518	521	665	finally
      //   521	529	705	java/io/IOException
      //   521	529	665	finally
      //   529	544	705	java/io/IOException
      //   529	544	665	finally
      //   557	564	705	java/io/IOException
      //   557	564	665	finally
      //   567	574	705	java/io/IOException
      //   567	574	665	finally
      //   577	582	705	java/io/IOException
      //   577	582	665	finally
      //   582	587	741	java/io/IOException
      //   589	600	705	java/io/IOException
      //   589	600	665	finally
      //   613	632	705	java/io/IOException
      //   613	632	665	finally
      //   632	637	745	java/io/IOException
      //   639	651	705	java/io/IOException
      //   639	651	665	finally
      //   651	656	749	java/io/IOException
      //   658	663	753	java/io/IOException
      //   679	684	756	java/io/IOException
      //   694	699	761	java/io/IOException
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("(");
      stringBuilder.append(b.X[this.a]);
      stringBuilder.append(", data length:");
      stringBuilder.append(this.d.length);
      stringBuilder.append(")");
      return stringBuilder.toString();
    }
  }
  
  static class d {
    public final int a;
    
    public final String b;
    
    public final int c;
    
    public final int d;
    
    d(String param1String, int param1Int1, int param1Int2) {
      this.b = param1String;
      this.a = param1Int1;
      this.c = param1Int2;
      this.d = -1;
    }
    
    d(String param1String, int param1Int1, int param1Int2, int param1Int3) {
      this.b = param1String;
      this.a = param1Int1;
      this.c = param1Int2;
      this.d = param1Int3;
    }
    
    boolean a(int param1Int) {
      int i = this.c;
      if (i != 7) {
        if (param1Int == 7)
          return true; 
        if (i != param1Int) {
          int j = this.d;
          return (j == param1Int) ? true : (((i == 4 || j == 4) && param1Int == 3) ? true : (((i == 9 || j == 9) && param1Int == 8) ? true : (((i == 12 || j == 12) && param1Int == 11))));
        } 
      } 
      return true;
    }
  }
  
  private static class e {
    public final long a;
    
    public final long b;
    
    e(long param1Long1, long param1Long2) {
      if (param1Long2 == 0L) {
        this.a = 0L;
        this.b = 1L;
        return;
      } 
      this.a = param1Long1;
      this.b = param1Long2;
    }
    
    public double a() {
      return this.a / this.b;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.a);
      stringBuilder.append("/");
      stringBuilder.append(this.b);
      return stringBuilder.toString();
    }
  }
}


/* Location:              C:\Users\Pooya\Desktop\smartpek\Smart-dex2jar.jar!\e0\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */