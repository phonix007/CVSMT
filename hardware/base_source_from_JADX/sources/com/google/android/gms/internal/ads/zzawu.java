package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@zzark
@TargetApi(21)
@ParametersAreNonnullByDefault
final class zzawu {
    private static final Map<String, String> zzegp;
    private final List<String> zzegq;
    private final zzawg zzegr;
    private final Context zzsp;

    zzawu(Context context, List<String> list, zzawg zzawg) {
        this.zzsp = context;
        this.zzegq = list;
        this.zzegr = zzawg;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r5 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> zzc(java.lang.String[] r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.length
            r2 = 0
            r3 = 0
        L_0x0008:
            if (r3 >= r1) goto L_0x007c
            r4 = r11[r3]
            java.util.List<java.lang.String> r5 = r10.zzegq
            java.util.Iterator r5 = r5.iterator()
        L_0x0012:
            boolean r6 = r5.hasNext()
            r7 = 1
            if (r6 == 0) goto L_0x0048
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r8 = r6.equals(r4)
            if (r8 == 0) goto L_0x0027
        L_0x0025:
            r5 = 1
            goto L_0x0049
        L_0x0027:
            java.lang.String r8 = "android.webkit.resource."
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r9 = r6.length()
            if (r9 == 0) goto L_0x003c
            java.lang.String r6 = r8.concat(r6)
            goto L_0x0041
        L_0x003c:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x0041:
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x0012
            goto L_0x0025
        L_0x0048:
            r5 = 0
        L_0x0049:
            if (r5 == 0) goto L_0x0074
            java.util.Map<java.lang.String, java.lang.String> r5 = zzegp
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x0068
            com.google.android.gms.ads.internal.zzbv.zzlf()
            android.content.Context r5 = r10.zzsp
            java.util.Map<java.lang.String, java.lang.String> r6 = zzegp
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            boolean r5 = com.google.android.gms.internal.ads.zzayh.zzn(r5, r6)
            if (r5 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r7 = 0
        L_0x0068:
            if (r7 == 0) goto L_0x006e
            r0.add(r4)
            goto L_0x0079
        L_0x006e:
            com.google.android.gms.internal.ads.zzawg r5 = r10.zzegr
            r5.zzdk(r4)
            goto L_0x0079
        L_0x0074:
            com.google.android.gms.internal.ads.zzawg r5 = r10.zzegr
            r5.zzdj(r4)
        L_0x0079:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawu.zzc(java.lang.String[]):java.util.List");
    }

    static {
        HashMap hashMap = new HashMap();
        if (PlatformVersion.isAtLeastLollipop()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        zzegp = hashMap;
    }
}
