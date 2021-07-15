package com.google.android.gms.internal.ads;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

final class zzaqn implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ zzaqf zzdur;
    private final /* synthetic */ WeakReference zzdus;

    zzaqn(zzaqf zzaqf, WeakReference weakReference) {
        this.zzdur = zzaqf;
        this.zzdus = weakReference;
    }

    public final void onGlobalLayout() {
        this.zzdur.zza((WeakReference<zzbgg>) this.zzdus, false);
    }
}
