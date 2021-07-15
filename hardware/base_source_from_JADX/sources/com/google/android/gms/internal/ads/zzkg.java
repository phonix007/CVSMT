package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

final class zzkg implements zzkf {
    private zzkg() {
    }

    public final boolean zzes() {
        return false;
    }

    public final int getCodecCount() {
        return MediaCodecList.getCodecCount();
    }

    public final MediaCodecInfo getCodecInfoAt(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public final boolean zza(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
