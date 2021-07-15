package com.google.android.gms.internal.ads;

import android.support.p003v7.widget.ActivityChooserView;
import android.text.TextUtils;

public final class zzoh {
    public final int viewportHeight;
    public final int viewportWidth;
    public final String zzbep;
    public final String zzbeq;
    public final boolean zzber;
    public final boolean zzbes;
    public final int zzbet;
    public final int zzbeu;
    public final int zzbev;
    public final boolean zzbew;
    public final boolean zzbex;
    public final boolean zzbey;

    public zzoh() {
        this((String) null, (String) null, false, true, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, true, true, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, true);
    }

    private zzoh(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
        this.zzbep = null;
        this.zzbeq = null;
        this.zzber = false;
        this.zzbes = true;
        this.zzbet = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.zzbeu = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.zzbev = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.zzbew = true;
        this.zzbex = true;
        this.viewportWidth = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.viewportHeight = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.zzbey = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzoh zzoh = (zzoh) obj;
        return this.zzbes == zzoh.zzbes && this.zzbet == zzoh.zzbet && this.zzbeu == zzoh.zzbeu && this.zzbew == zzoh.zzbew && this.zzbex == zzoh.zzbex && this.zzbey == zzoh.zzbey && this.viewportWidth == zzoh.viewportWidth && this.viewportHeight == zzoh.viewportHeight && this.zzbev == zzoh.zzbev && TextUtils.equals((CharSequence) null, (CharSequence) null) && TextUtils.equals((CharSequence) null, (CharSequence) null);
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.zzbes ? 1 : 0)) * 31) + this.zzbet) * 31) + this.zzbeu) * 31) + this.zzbev) * 31) + (this.zzbew ? 1 : 0)) * 31) + (this.zzbex ? 1 : 0)) * 31) + (this.zzbey ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight;
    }
}
