package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;

public final class zzzv extends zzyt {
    private final VideoController.VideoLifecycleCallbacks zzwc;

    public zzzv(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zzwc = videoLifecycleCallbacks;
    }

    public final void onVideoStart() {
        this.zzwc.onVideoStart();
    }

    public final void onVideoPlay() {
        this.zzwc.onVideoPlay();
    }

    public final void onVideoPause() {
        this.zzwc.onVideoPause();
    }

    public final void onVideoEnd() {
        this.zzwc.onVideoEnd();
    }

    public final void onVideoMute(boolean z) {
        this.zzwc.onVideoMute(z);
    }
}
