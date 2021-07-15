package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

@zzark
public final class zzaza {
    private float zzdwx = 1.0f;
    private boolean zzdxd = false;

    public final synchronized void setAppVolume(float f) {
        this.zzdwx = f;
    }

    public final synchronized float zzkj() {
        if (!zzaac()) {
            return 1.0f;
        }
        return this.zzdwx;
    }

    public final synchronized void setAppMuted(boolean z) {
        this.zzdxd = z;
    }

    public final synchronized boolean zzkk() {
        return this.zzdxd;
    }

    private final synchronized boolean zzaac() {
        return this.zzdwx >= 0.0f;
    }

    public static float zzbb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }
}
