package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.TimeUnit;

@zzark
public final class zzbea {
    private final Context mContext;
    private final zzbbi zzbpt;
    @Nullable
    private final zzaba zzere;
    private boolean zzeri;
    private final String zzetu;
    @Nullable
    private final zzaay zzetv;
    private final zzazo zzetw = new zzazr().zza("min_1", Double.MIN_VALUE, 1.0d).zza("1_5", 1.0d, 5.0d).zza("5_10", 5.0d, 10.0d).zza("10_20", 10.0d, 20.0d).zza("20_30", 20.0d, 30.0d).zza("30_max", 30.0d, Double.MAX_VALUE).zzaaj();
    private final long[] zzetx;
    private final String[] zzety;
    private boolean zzetz = false;
    private boolean zzeua = false;
    private boolean zzeub = false;
    private boolean zzeuc = false;
    private zzbdi zzeud;
    private boolean zzeue;
    private boolean zzeuf;
    private long zzeug = -1;

    public zzbea(Context context, zzbbi zzbbi, String str, @Nullable zzaba zzaba, @Nullable zzaay zzaay) {
        this.mContext = context;
        this.zzbpt = zzbbi;
        this.zzetu = str;
        this.zzere = zzaba;
        this.zzetv = zzaay;
        String str2 = (String) zzwu.zzpz().zzd(zzaan.zzcpa);
        if (str2 == null) {
            this.zzety = new String[0];
            this.zzetx = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.zzety = new String[split.length];
        this.zzetx = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzetx[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                zzaxz.zzc("Unable to parse frame hash target time number.", e);
                this.zzetx[i] = -1;
            }
        }
    }

    public final void zzb(zzbdi zzbdi) {
        zzaat.zza(this.zzere, this.zzetv, "vpc2");
        this.zzetz = true;
        if (this.zzere != null) {
            this.zzere.zzg("vpn", zzbdi.zzaaz());
        }
        this.zzeud = zzbdi;
    }

    public final void zzcg() {
        if (this.zzetz && !this.zzeua) {
            zzaat.zza(this.zzere, this.zzetv, "vfr2");
            this.zzeua = true;
        }
    }

    public final void onStop() {
        if (((Boolean) zzwu.zzpz().zzd(zzaan.zzcoz)).booleanValue() && !this.zzeue) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.zzetu);
            bundle.putString("player", this.zzeud.zzaaz());
            for (zzazq next : this.zzetw.zzaai()) {
                String valueOf = String.valueOf("fps_c_");
                String valueOf2 = String.valueOf(next.name);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(next.count));
                String valueOf3 = String.valueOf("fps_p_");
                String valueOf4 = String.valueOf(next.name);
                bundle.putString(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), Double.toString(next.zzems));
            }
            for (int i = 0; i < this.zzetx.length; i++) {
                String str = this.zzety[i];
                if (str != null) {
                    String valueOf5 = String.valueOf(Long.valueOf(this.zzetx[i]));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf5).length() + 3);
                    sb.append("fh_");
                    sb.append(valueOf5);
                    bundle.putString(sb.toString(), str);
                }
            }
            zzbv.zzlf().zza(this.mContext, this.zzbpt.zzdp, "gmob-apps", bundle, true);
            this.zzeue = true;
        }
    }

    public final void zzc(zzbdi zzbdi) {
        if (this.zzeub && !this.zzeuc) {
            if (zzaxz.zzza() && !this.zzeuc) {
                zzaxz.m30v("VideoMetricsMixin first frame");
            }
            zzaat.zza(this.zzere, this.zzetv, "vff2");
            this.zzeuc = true;
        }
        long nanoTime = zzbv.zzlm().nanoTime();
        if (this.zzeri && this.zzeuf && this.zzeug != -1) {
            double nanos = (double) TimeUnit.SECONDS.toNanos(1);
            double d = (double) (nanoTime - this.zzeug);
            Double.isNaN(nanos);
            Double.isNaN(d);
            this.zzetw.zza(nanos / d);
        }
        this.zzeuf = this.zzeri;
        this.zzeug = nanoTime;
        long longValue = ((Long) zzwu.zzpz().zzd(zzaan.zzcpb)).longValue();
        long currentPosition = (long) zzbdi.getCurrentPosition();
        int i = 0;
        while (i < this.zzety.length) {
            if (this.zzety[i] != null || longValue <= Math.abs(currentPosition - this.zzetx[i])) {
                zzbdi zzbdi2 = zzbdi;
                i++;
            } else {
                String[] strArr = this.zzety;
                int i2 = 8;
                Bitmap bitmap = zzbdi.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    long j3 = j;
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j3);
                        i4++;
                        j3--;
                        i2 = 8;
                    }
                    i3++;
                    j = j3;
                    i2 = 8;
                }
                strArr[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
        }
    }

    public final void zzacd() {
        this.zzeri = true;
        if (this.zzeua && !this.zzeub) {
            zzaat.zza(this.zzere, this.zzetv, "vfp2");
            this.zzeub = true;
        }
    }

    public final void zzace() {
        this.zzeri = false;
    }
}
