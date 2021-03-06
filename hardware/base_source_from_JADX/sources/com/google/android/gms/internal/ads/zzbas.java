package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.zzbv;

@zzark
public final class zzbas {
    private final View mView;
    private Activity zzeoa;
    private boolean zzeob;
    private boolean zzeoc;
    private boolean zzeod;
    private ViewTreeObserver.OnGlobalLayoutListener zzeoe;
    private ViewTreeObserver.OnScrollChangedListener zzeof;

    public zzbas(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.zzeoa = activity;
        this.mView = view;
        this.zzeoe = onGlobalLayoutListener;
        this.zzeof = onScrollChangedListener;
    }

    public final void zzj(Activity activity) {
        this.zzeoa = activity;
    }

    public final void zzaam() {
        this.zzeod = true;
        if (this.zzeoc) {
            zzaao();
        }
    }

    public final void zzaan() {
        this.zzeod = false;
        zzaap();
    }

    public final void onAttachedToWindow() {
        this.zzeoc = true;
        if (this.zzeod) {
            zzaao();
        }
    }

    public final void onDetachedFromWindow() {
        this.zzeoc = false;
        zzaap();
    }

    private final void zzaao() {
        if (!this.zzeob) {
            if (this.zzeoe != null) {
                if (this.zzeoa != null) {
                    Activity activity = this.zzeoa;
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzeoe;
                    ViewTreeObserver zzk = zzk(activity);
                    if (zzk != null) {
                        zzk.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    }
                }
                zzbv.zzme();
                zzbct.zza(this.mView, this.zzeoe);
            }
            if (this.zzeof != null) {
                if (this.zzeoa != null) {
                    Activity activity2 = this.zzeoa;
                    ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.zzeof;
                    ViewTreeObserver zzk2 = zzk(activity2);
                    if (zzk2 != null) {
                        zzk2.addOnScrollChangedListener(onScrollChangedListener);
                    }
                }
                zzbv.zzme();
                zzbct.zza(this.mView, this.zzeof);
            }
            this.zzeob = true;
        }
    }

    private final void zzaap() {
        if (this.zzeoa != null && this.zzeob) {
            if (this.zzeoe != null) {
                Activity activity = this.zzeoa;
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzeoe;
                ViewTreeObserver zzk = zzk(activity);
                if (zzk != null) {
                    zzbv.zzlh().zza(zzk, onGlobalLayoutListener);
                }
            }
            if (this.zzeof != null) {
                Activity activity2 = this.zzeoa;
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.zzeof;
                ViewTreeObserver zzk2 = zzk(activity2);
                if (zzk2 != null) {
                    zzk2.removeOnScrollChangedListener(onScrollChangedListener);
                }
            }
            this.zzeob = false;
        }
    }

    private static ViewTreeObserver zzk(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }
}
