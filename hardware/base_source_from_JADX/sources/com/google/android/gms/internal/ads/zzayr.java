package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager;

@TargetApi(9)
public class zzayr extends zzayp {
    public zzayr() {
        super();
    }

    public final int zzzw() {
        return 6;
    }

    public final int zzzx() {
        return 7;
    }

    public boolean zza(DownloadManager.Request request) {
        request.setShowRunningNotification(true);
        return true;
    }
}
