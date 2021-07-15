package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;

@zzark
public final class zzbct {
    public static void zza(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new zzbcu(view, onGlobalLayoutListener).attach();
    }

    public static void zza(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new zzbcv(view, onScrollChangedListener).attach();
    }
}
