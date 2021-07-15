package com.google.android.gms.internal.ads;

import android.view.View;

final class zzbhx implements View.OnAttachStateChangeListener {
    private final /* synthetic */ zzawr zzeyn;
    private final /* synthetic */ zzbhu zzfay;

    zzbhx(zzbhu zzbhu, zzawr zzawr) {
        this.zzfay = zzbhu;
        this.zzeyn = zzawr;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzfay.zza(view, this.zzeyn, 10);
    }
}
