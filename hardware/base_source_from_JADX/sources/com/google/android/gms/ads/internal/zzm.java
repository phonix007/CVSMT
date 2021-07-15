package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

final class zzm implements View.OnTouchListener {
    private final /* synthetic */ zzk zzbmi;
    private final /* synthetic */ zzw zzbmj;

    zzm(zzk zzk, zzw zzw) {
        this.zzbmi = zzk;
        this.zzbmj = zzw;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.zzbmj.recordClick();
        if (this.zzbmi.zzbmg == null) {
            return false;
        }
        this.zzbmi.zzbmg.zzxr();
        return false;
    }
}
