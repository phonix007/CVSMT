package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

@TargetApi(16)
public final class zzjx {
    private final String mimeType;
    public final String name;
    public final boolean zzadt;
    public final boolean zzatq;
    public final boolean zzatr;
    private final MediaCodecInfo.CodecCapabilities zzats;

    public static zzjx zzt(String str) {
        return new zzjx(str, (String) null, (MediaCodecInfo.CodecCapabilities) null, false, false);
    }

    public static zzjx zza(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new zzjx(str, str2, codecCapabilities, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005a, code lost:
        if ((com.google.android.gms.internal.ads.zzqe.SDK_INT >= 21 && r4.isFeatureSupported("secure-playback")) != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzjx(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzpo.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.name = r2
            r1.mimeType = r3
            r1.zzats = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L_0x002a
            if (r4 == 0) goto L_0x002a
            int r5 = com.google.android.gms.internal.ads.zzqe.SDK_INT
            r0 = 19
            if (r5 < r0) goto L_0x0025
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0025
            r5 = 1
            goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            if (r5 == 0) goto L_0x002a
            r5 = 1
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            r1.zzatq = r5
            r5 = 21
            if (r4 == 0) goto L_0x0044
            int r0 = com.google.android.gms.internal.ads.zzqe.SDK_INT
            if (r0 < r5) goto L_0x003f
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            r1.zzadt = r0
            if (r6 != 0) goto L_0x005e
            if (r4 == 0) goto L_0x005d
            int r6 = com.google.android.gms.internal.ads.zzqe.SDK_INT
            if (r6 < r5) goto L_0x0059
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L_0x0059
            r4 = 1
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            if (r4 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            r1.zzatr = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjx.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):void");
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzej() {
        if (this.zzats == null || this.zzats.profileLevels == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return this.zzats.profileLevels;
    }

    public final boolean zzu(String str) {
        String zzae;
        if (str == null || this.mimeType == null || (zzae = zzpt.zzae(str)) == null) {
            return true;
        }
        if (!this.mimeType.equals(zzae)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(zzae).length());
            sb.append("codec.mime ");
            sb.append(str);
            sb.append(", ");
            sb.append(zzae);
            zzv(sb.toString());
            return false;
        }
        Pair<Integer, Integer> zzw = zzkc.zzw(str);
        if (zzw == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzej()) {
            if (codecProfileLevel.profile == ((Integer) zzw.first).intValue() && codecProfileLevel.level >= ((Integer) zzw.second).intValue()) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(zzae).length());
        sb2.append("codec.profileLevel, ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(zzae);
        zzv(sb2.toString());
        return false;
    }

    @TargetApi(21)
    public final boolean zza(int i, int i2, double d) {
        if (this.zzats == null) {
            zzv("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.zzats.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzv("sizeAndRate.vCaps");
            return false;
        } else if (zza(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !zza(videoCapabilities, i2, i, d)) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.support, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d);
                zzv(sb.toString());
                return false;
            }
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            sb2.append("x");
            sb2.append(d);
            String sb3 = sb2.toString();
            String str = this.name;
            String str2 = this.mimeType;
            String str3 = zzqe.zzbic;
            StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 25 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb4.append("AssumedSupport [");
            sb4.append(sb3);
            sb4.append("] [");
            sb4.append(str);
            sb4.append(", ");
            sb4.append(str2);
            sb4.append("] [");
            sb4.append(str3);
            sb4.append("]");
            Log.d("MediaCodecInfo", sb4.toString());
            return true;
        }
    }

    @TargetApi(21)
    public final Point zzc(int i, int i2) {
        if (this.zzats == null) {
            zzv("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.zzats.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzv("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzqe.zzf(i, widthAlignment) * widthAlignment, zzqe.zzf(i2, heightAlignment) * heightAlignment);
    }

    @TargetApi(21)
    public final boolean zzam(int i) {
        if (this.zzats == null) {
            zzv("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.zzats.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzv("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder(31);
            sb.append("sampleRate.support, ");
            sb.append(i);
            zzv(sb.toString());
            return false;
        }
    }

    @TargetApi(21)
    public final boolean zzan(int i) {
        if (this.zzats == null) {
            zzv("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.zzats.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzv("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() >= i) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("channelCount.support, ");
            sb.append(i);
            zzv(sb.toString());
            return false;
        }
    }

    private final void zzv(String str) {
        String str2 = this.name;
        String str3 = this.mimeType;
        String str4 = zzqe.zzbic;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    @TargetApi(21)
    private static boolean zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }
}
