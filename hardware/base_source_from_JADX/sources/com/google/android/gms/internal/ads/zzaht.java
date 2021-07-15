package com.google.android.gms.internal.ads;

import android.support.p003v7.widget.ActivityChooserView;
import com.google.android.gms.common.util.VisibleForTesting;

@zzark
final class zzaht {
    private static final zzahq zzdhy = zzahq.zzto();
    private static final float zzdhz = ((Float) zzwu.zzpz().zzd(zzaan.zzcsl)).floatValue();
    private static final long zzdia = ((Long) zzwu.zzpz().zzd(zzaan.zzcsj)).longValue();
    private static final float zzdib = ((Float) zzwu.zzpz().zzd(zzaan.zzcsm)).floatValue();
    private static final long zzdic = ((Long) zzwu.zzpz().zzd(zzaan.zzcsk)).longValue();

    static boolean zztz() {
        int i;
        int zztv = zzdhy.zztv();
        int zztw = zzdhy.zztw();
        int zztu = zzdhy.zztu() + zzdhy.zztt();
        int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        if (zztv >= 16 || zzdic == 0) {
            i = zzdib != 0.0f ? ((int) (zzdib * ((float) zztv))) + 1 : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        } else {
            i = zzc(zzdic, zztv);
        }
        if (zztw > i) {
            return false;
        }
        if (zztv < 16 && zzdia != 0) {
            i2 = zzc(zzdia, zztv);
        } else if (zzdhz != 0.0f) {
            i2 = (int) (zzdhz * ((float) zztv));
        }
        if (zztu <= i2) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    private static int zzc(long j, int i) {
        return (int) ((j >>> ((i % 16) * 4)) & 15);
    }
}
