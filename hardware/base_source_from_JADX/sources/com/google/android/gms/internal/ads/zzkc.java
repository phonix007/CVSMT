package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class zzkc {
    private static final zzjx zzavi = zzjx.zzt("OMX.google.raw.decoder");
    private static final Pattern zzavj = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<zza, List<zzjx>> zzavk = new HashMap<>();
    private static final SparseIntArray zzavl;
    private static final SparseIntArray zzavm;
    private static final Map<String, Integer> zzavn;
    private static int zzavo = -1;

    public static zzjx zzeq() {
        return zzavi;
    }

    public static zzjx zzb(String str, boolean z) throws zzke {
        List<zzjx> zzc = zzc(str, z);
        if (zzc.isEmpty()) {
            return null;
        }
        return zzc.get(0);
    }

    static final class zza {
        public final String mimeType;
        public final boolean zzatr;

        public zza(String str, boolean z) {
            this.mimeType = str;
            this.zzatr = z;
        }

        public final int hashCode() {
            return (((this.mimeType == null ? 0 : this.mimeType.hashCode()) + 31) * 31) + (this.zzatr ? 1231 : 1237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != zza.class) {
                return false;
            }
            zza zza = (zza) obj;
            return TextUtils.equals(this.mimeType, zza.mimeType) && this.zzatr == zza.zzatr;
        }
    }

    private static synchronized List<zzjx> zzc(String str, boolean z) throws zzke {
        synchronized (zzkc.class) {
            zza zza2 = new zza(str, z);
            List<zzjx> list = zzavk.get(zza2);
            if (list != null) {
                return list;
            }
            List<zzjx> zza3 = zza(zza2, zzqe.SDK_INT >= 21 ? new zzkh(z) : new zzkg());
            if (z && zza3.isEmpty() && 21 <= zzqe.SDK_INT && zzqe.SDK_INT <= 23) {
                zza3 = zza(zza2, (zzkf) new zzkg());
                if (!zza3.isEmpty()) {
                    String str2 = zza3.get(0).name;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List<zzjx> unmodifiableList = Collections.unmodifiableList(zza3);
            zzavk.put(zza2, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static int zzer() throws zzke {
        int i;
        if (zzavo == -1) {
            int i2 = 0;
            zzjx zzb = zzb("video/avc", false);
            if (zzb != null) {
                MediaCodecInfo.CodecProfileLevel[] zzej = zzb.zzej();
                int length = zzej.length;
                int i3 = 0;
                while (i2 < length) {
                    switch (zzej[i2].level) {
                        case 1:
                        case 2:
                            i = 25344;
                            break;
                        case 8:
                        case 16:
                        case 32:
                            i = 101376;
                            break;
                        case 64:
                            i = 202752;
                            break;
                        case 128:
                        case 256:
                            i = 414720;
                            break;
                        case 512:
                            i = 921600;
                            break;
                        case 1024:
                            i = 1310720;
                            break;
                        case 2048:
                        case 4096:
                            i = 2097152;
                            break;
                        case 8192:
                            i = 2228224;
                            break;
                        case 16384:
                            i = 5652480;
                            break;
                        case 32768:
                        case 65536:
                            i = 9437184;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, zzqe.SDK_INT >= 21 ? 345600 : 172800);
            }
            zzavo = i2;
        }
        return zzavo;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r3.equals("hev1") != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> zzw(java.lang.String r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r9.split(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r5) {
                case 3006243: goto L_0x0036;
                case 3006244: goto L_0x002c;
                case 3199032: goto L_0x0023;
                case 3214780: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0040
        L_0x0019:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0023:
            java.lang.String r5 = "hev1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0040
            goto L_0x0041
        L_0x002c:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 3
            goto L_0x0041
        L_0x0036:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0040
            r2 = 2
            goto L_0x0041
        L_0x0040:
            r2 = -1
        L_0x0041:
            switch(r2) {
                case 0: goto L_0x004a;
                case 1: goto L_0x004a;
                case 2: goto L_0x0045;
                case 3: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            return r0
        L_0x0045:
            android.util.Pair r9 = zza((java.lang.String) r9, (java.lang.String[]) r1)
            return r9
        L_0x004a:
            int r2 = r1.length
            r3 = 4
            if (r2 >= r3) goto L_0x006a
            java.lang.String r1 = "MediaCodecUtil"
            java.lang.String r2 = "Ignoring malformed HEVC codec string: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r3 = r9.length()
            if (r3 == 0) goto L_0x0061
            java.lang.String r9 = r2.concat(r9)
            goto L_0x0066
        L_0x0061:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r2)
        L_0x0066:
            android.util.Log.w(r1, r9)
            return r0
        L_0x006a:
            java.util.regex.Pattern r2 = zzavj
            r3 = r1[r8]
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x0094
            java.lang.String r1 = "MediaCodecUtil"
            java.lang.String r2 = "Ignoring malformed HEVC codec string: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r3 = r9.length()
            if (r3 == 0) goto L_0x008b
            java.lang.String r9 = r2.concat(r9)
            goto L_0x0090
        L_0x008b:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r2)
        L_0x0090:
            android.util.Log.w(r1, r9)
            return r0
        L_0x0094:
            java.lang.String r9 = r2.group(r8)
            java.lang.String r3 = "1"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x00a2
            r7 = 1
            goto L_0x00aa
        L_0x00a2:
            java.lang.String r3 = "2"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x00e1
        L_0x00aa:
            java.util.Map<java.lang.String, java.lang.Integer> r9 = zzavn
            r1 = r1[r6]
            java.lang.Object r9 = r9.get(r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L_0x00d7
            java.lang.String r9 = "MediaCodecUtil"
            java.lang.String r1 = "Unknown HEVC level string: "
            java.lang.String r2 = r2.group(r8)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00cd
            java.lang.String r1 = r1.concat(r2)
            goto L_0x00d3
        L_0x00cd:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x00d3:
            android.util.Log.w(r9, r1)
            return r0
        L_0x00d7:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0.<init>(r1, r9)
            return r0
        L_0x00e1:
            java.lang.String r1 = "MediaCodecUtil"
            java.lang.String r2 = "Unknown HEVC profile string: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r3 = r9.length()
            if (r3 == 0) goto L_0x00f4
            java.lang.String r9 = r2.concat(r9)
            goto L_0x00f9
        L_0x00f4:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r2)
        L_0x00f9:
            android.util.Log.w(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkc.zzw(java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b4 A[Catch:{ Exception -> 0x02a5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x029e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.google.android.gms.internal.ads.zzjx> zza(com.google.android.gms.internal.ads.zzkc.zza r16, com.google.android.gms.internal.ads.zzkf r17) throws com.google.android.gms.internal.ads.zzke {
        /*
            r1 = r16
            r2 = r17
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x02a5 }
            r3.<init>()     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r4 = r1.mimeType     // Catch:{ Exception -> 0x02a5 }
            int r5 = r17.getCodecCount()     // Catch:{ Exception -> 0x02a5 }
            boolean r6 = r17.zzes()     // Catch:{ Exception -> 0x02a5 }
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x02a4
            android.media.MediaCodecInfo r9 = r2.getCodecInfoAt(r8)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r9.isEncoder()     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            if (r6 != 0) goto L_0x0030
            java.lang.String r0 = ".secure"
            boolean r0 = r10.endsWith(r0)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0030
            goto L_0x01b1
        L_0x0030:
            int r0 = com.google.android.gms.internal.ads.zzqe.SDK_INT     // Catch:{ Exception -> 0x02a5 }
            r12 = 21
            if (r0 >= r12) goto L_0x0068
            java.lang.String r0 = "CIPAACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "CIPMP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "CIPVorbisDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "CIPAMRNBDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "AACDecoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "MP3Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0068
            goto L_0x01b1
        L_0x0068:
            int r0 = com.google.android.gms.internal.ads.zzqe.SDK_INT     // Catch:{ Exception -> 0x02a5 }
            r12 = 18
            if (r0 >= r12) goto L_0x0078
            java.lang.String r0 = "OMX.SEC.MP3.Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0078
            goto L_0x01b1
        L_0x0078:
            int r0 = com.google.android.gms.internal.ads.zzqe.SDK_INT     // Catch:{ Exception -> 0x02a5 }
            if (r0 >= r12) goto L_0x0090
            java.lang.String r0 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = "a70"
            java.lang.String r12 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0090
            goto L_0x01b1
        L_0x0090:
            int r0 = com.google.android.gms.internal.ads.zzqe.SDK_INT     // Catch:{ Exception -> 0x02a5 }
            r12 = 16
            if (r0 != r12) goto L_0x0118
            java.lang.String r0 = "OMX.qcom.audio.decoder.mp3"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = "dlxu"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "protou"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "ville"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "villeplus"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "villec2"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r13 = "gee"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6602"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6603"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6606"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C6616"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "L36h"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "SO-02E"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0118
            goto L_0x01b1
        L_0x0118:
            int r0 = com.google.android.gms.internal.ads.zzqe.SDK_INT     // Catch:{ Exception -> 0x02a5 }
            if (r0 != r12) goto L_0x014d
            java.lang.String r0 = "OMX.qcom.audio.decoder.aac"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = "C1504"
            java.lang.String r12 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C1505"
            java.lang.String r12 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C1604"
            java.lang.String r12 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = "C1605"
            java.lang.String r12 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x014d
            goto L_0x01b1
        L_0x014d:
            int r0 = com.google.android.gms.internal.ads.zzqe.SDK_INT     // Catch:{ Exception -> 0x02a5 }
            r12 = 19
            if (r0 > r12) goto L_0x0198
            java.lang.String r0 = "OMX.SEC.vp8.dec"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "samsung"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzqe.MANUFACTURER     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r13 = "d2"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r13 = "serrano"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r13 = "jflte"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r13 = "santos"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r13 = "t0"
            boolean r0 = r0.startsWith(r13)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0198
            goto L_0x01b1
        L_0x0198:
            int r0 = com.google.android.gms.internal.ads.zzqe.SDK_INT     // Catch:{ Exception -> 0x02a5 }
            if (r0 > r12) goto L_0x01af
            java.lang.String r0 = com.google.android.gms.internal.ads.zzqe.DEVICE     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r12 = "jflte"
            boolean r0 = r0.startsWith(r12)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x01af
            java.lang.String r0 = "OMX.qcom.video.decoder.vp8"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x01af
            goto L_0x01b1
        L_0x01af:
            r0 = 1
            goto L_0x01b2
        L_0x01b1:
            r0 = 0
        L_0x01b2:
            if (r0 == 0) goto L_0x029e
            java.lang.String[] r12 = r9.getSupportedTypes()     // Catch:{ Exception -> 0x02a5 }
            int r13 = r12.length     // Catch:{ Exception -> 0x02a5 }
            r14 = 0
        L_0x01ba:
            if (r14 >= r13) goto L_0x029e
            r15 = r12[r14]     // Catch:{ Exception -> 0x02a5 }
            boolean r0 = r15.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x02a5 }
            if (r0 == 0) goto L_0x0297
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r15)     // Catch:{ Exception -> 0x022c }
            boolean r11 = r2.zza(r4, r0)     // Catch:{ Exception -> 0x022c }
            int r7 = com.google.android.gms.internal.ads.zzqe.SDK_INT     // Catch:{ Exception -> 0x022c }
            r2 = 22
            if (r7 > r2) goto L_0x01f8
            java.lang.String r2 = com.google.android.gms.internal.ads.zzqe.MODEL     // Catch:{ Exception -> 0x022c }
            java.lang.String r7 = "ODROID-XU3"
            boolean r2 = r2.equals(r7)     // Catch:{ Exception -> 0x022c }
            if (r2 != 0) goto L_0x01e6
            java.lang.String r2 = com.google.android.gms.internal.ads.zzqe.MODEL     // Catch:{ Exception -> 0x022c }
            java.lang.String r7 = "Nexus 10"
            boolean r2 = r2.equals(r7)     // Catch:{ Exception -> 0x022c }
            if (r2 == 0) goto L_0x01f8
        L_0x01e6:
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x022c }
            if (r2 != 0) goto L_0x01f6
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x022c }
            if (r2 == 0) goto L_0x01f8
        L_0x01f6:
            r2 = 1
            goto L_0x01f9
        L_0x01f8:
            r2 = 0
        L_0x01f9:
            if (r6 == 0) goto L_0x0202
            boolean r7 = r1.zzatr     // Catch:{ Exception -> 0x022c }
            if (r7 == r11) goto L_0x0200
            goto L_0x0202
        L_0x0200:
            r7 = 0
            goto L_0x0209
        L_0x0202:
            if (r6 != 0) goto L_0x0212
            boolean r7 = r1.zzatr     // Catch:{ Exception -> 0x022c }
            if (r7 != 0) goto L_0x0212
            goto L_0x0200
        L_0x0209:
            com.google.android.gms.internal.ads.zzjx r0 = com.google.android.gms.internal.ads.zzjx.zza(r10, r4, r0, r2, r7)     // Catch:{ Exception -> 0x022c }
            r3.add(r0)     // Catch:{ Exception -> 0x022c }
            goto L_0x0297
        L_0x0212:
            r7 = 0
            if (r6 != 0) goto L_0x0297
            if (r11 == 0) goto L_0x0297
            java.lang.String r11 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x022c }
            java.lang.String r7 = ".secure"
            java.lang.String r7 = r11.concat(r7)     // Catch:{ Exception -> 0x022c }
            r11 = 1
            com.google.android.gms.internal.ads.zzjx r0 = com.google.android.gms.internal.ads.zzjx.zza(r7, r4, r0, r2, r11)     // Catch:{ Exception -> 0x022a }
            r3.add(r0)     // Catch:{ Exception -> 0x022a }
            return r3
        L_0x022a:
            r0 = move-exception
            goto L_0x022e
        L_0x022c:
            r0 = move-exception
            r11 = 1
        L_0x022e:
            int r2 = com.google.android.gms.internal.ads.zzqe.SDK_INT     // Catch:{ Exception -> 0x02a5 }
            r7 = 23
            if (r2 > r7) goto L_0x0260
            boolean r2 = r3.isEmpty()     // Catch:{ Exception -> 0x02a5 }
            if (r2 != 0) goto L_0x0260
            java.lang.String r0 = "MediaCodecUtil"
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x02a5 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x02a5 }
            int r2 = r2 + 46
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a5 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = "Skipping codec "
            r7.append(r2)     // Catch:{ Exception -> 0x02a5 }
            r7.append(r10)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = " (failed to query capabilities)"
            r7.append(r2)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = r7.toString()     // Catch:{ Exception -> 0x02a5 }
            android.util.Log.e(r0, r2)     // Catch:{ Exception -> 0x02a5 }
            goto L_0x0298
        L_0x0260:
            java.lang.String r1 = "MediaCodecUtil"
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x02a5 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x02a5 }
            int r2 = r2 + 25
            java.lang.String r3 = java.lang.String.valueOf(r15)     // Catch:{ Exception -> 0x02a5 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x02a5 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a5 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = "Failed to query codec "
            r3.append(r2)     // Catch:{ Exception -> 0x02a5 }
            r3.append(r10)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = " ("
            r3.append(r2)     // Catch:{ Exception -> 0x02a5 }
            r3.append(r15)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = ")"
            r3.append(r2)     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x02a5 }
            android.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x02a5 }
            throw r0     // Catch:{ Exception -> 0x02a5 }
        L_0x0297:
            r11 = 1
        L_0x0298:
            int r14 = r14 + 1
            r2 = r17
            goto L_0x01ba
        L_0x029e:
            int r8 = r8 + 1
            r2 = r17
            goto L_0x0014
        L_0x02a4:
            return r3
        L_0x02a5:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzke r1 = new com.google.android.gms.internal.ads.zzke
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkc.zza(com.google.android.gms.internal.ads.zzkc$zza, com.google.android.gms.internal.ads.zzkf):java.util.List");
    }

    private static Pair<Integer, Integer> zza(String str, String[] strArr) {
        Integer num;
        Integer num2;
        if (strArr.length < 2) {
            String valueOf = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
                num2 = valueOf2;
            } else if (strArr.length >= 3) {
                num2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                num = Integer.valueOf(Integer.parseInt(strArr[2]));
            } else {
                String valueOf3 = String.valueOf(str);
                Log.w("MediaCodecUtil", valueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf3) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
            Integer valueOf4 = Integer.valueOf(zzavl.get(num2.intValue()));
            if (valueOf4 == null) {
                String valueOf5 = String.valueOf(num2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf5).length() + 21);
                sb.append("Unknown AVC profile: ");
                sb.append(valueOf5);
                Log.w("MediaCodecUtil", sb.toString());
                return null;
            }
            Integer valueOf6 = Integer.valueOf(zzavm.get(num.intValue()));
            if (valueOf6 != null) {
                return new Pair<>(valueOf4, valueOf6);
            }
            String valueOf7 = String.valueOf(num);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf7).length() + 19);
            sb2.append("Unknown AVC level: ");
            sb2.append(valueOf7);
            Log.w("MediaCodecUtil", sb2.toString());
            return null;
        } catch (NumberFormatException unused) {
            String valueOf8 = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf8.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf8) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        zzavl = sparseIntArray;
        sparseIntArray.put(66, 1);
        zzavl.put(77, 2);
        zzavl.put(88, 4);
        zzavl.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        zzavm = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        zzavm.put(11, 4);
        zzavm.put(12, 8);
        zzavm.put(13, 16);
        zzavm.put(20, 32);
        zzavm.put(21, 64);
        zzavm.put(22, 128);
        zzavm.put(30, 256);
        zzavm.put(31, 512);
        zzavm.put(32, 1024);
        zzavm.put(40, 2048);
        zzavm.put(41, 4096);
        zzavm.put(42, 8192);
        zzavm.put(50, 16384);
        zzavm.put(51, 32768);
        zzavm.put(52, 65536);
        HashMap hashMap = new HashMap();
        zzavn = hashMap;
        hashMap.put("L30", 1);
        zzavn.put("L60", 4);
        zzavn.put("L63", 16);
        zzavn.put("L90", 64);
        zzavn.put("L93", 256);
        zzavn.put("L120", 1024);
        zzavn.put("L123", 4096);
        zzavn.put("L150", 16384);
        zzavn.put("L153", 65536);
        zzavn.put("L156", 262144);
        zzavn.put("L180", 1048576);
        zzavn.put("L183", 4194304);
        zzavn.put("L186", 16777216);
        zzavn.put("H30", 2);
        zzavn.put("H60", 8);
        zzavn.put("H63", 32);
        zzavn.put("H90", 128);
        zzavn.put("H93", 512);
        zzavn.put("H120", 2048);
        zzavn.put("H123", 8192);
        zzavn.put("H150", 32768);
        zzavn.put("H153", 131072);
        zzavn.put("H156", 524288);
        zzavn.put("H180", 2097152);
        zzavn.put("H183", 8388608);
        zzavn.put("H186", 33554432);
    }
}
