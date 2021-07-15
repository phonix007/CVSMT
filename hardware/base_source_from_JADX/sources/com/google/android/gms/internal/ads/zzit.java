package com.google.android.gms.internal.ads;

import android.support.p000v4.media.session.PlaybackStateCompat;
import java.io.IOException;

final class zzit {
    private final zzpx zzahz = new zzpx(8);
    private int zzaky;

    public final boolean zza(zzia zzia) throws IOException, InterruptedException {
        zzia zzia2 = zzia;
        long length = zzia.getLength();
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (length != -1 && length <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = length;
        }
        int i = (int) j;
        zzia2.zza(this.zzahz.data, 0, 4);
        this.zzaky = 4;
        for (long zzhd = this.zzahz.zzhd(); zzhd != 440786851; zzhd = ((zzhd << 8) & -256) | ((long) (this.zzahz.data[0] & 255))) {
            int i2 = this.zzaky + 1;
            this.zzaky = i2;
            if (i2 == i) {
                return false;
            }
            zzia2.zza(this.zzahz.data, 0, 1);
        }
        long zzc = zzc(zzia);
        long j2 = (long) this.zzaky;
        if (zzc == Long.MIN_VALUE || (length != -1 && j2 + zzc >= length)) {
            return false;
        }
        while (true) {
            long j3 = j2 + zzc;
            if (((long) this.zzaky) < j3) {
                if (zzc(zzia) == Long.MIN_VALUE) {
                    return false;
                }
                long zzc2 = zzc(zzia);
                if (zzc2 < 0 || zzc2 > 2147483647L) {
                    return false;
                }
                if (zzc2 != 0) {
                    zzia2.zzx((int) zzc2);
                    this.zzaky = (int) (((long) this.zzaky) + zzc2);
                }
            } else if (((long) this.zzaky) == j3) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private final long zzc(zzia zzia) throws IOException, InterruptedException {
        int i = 0;
        zzia.zza(this.zzahz.data, 0, 1);
        byte b = this.zzahz.data[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (i2 ^ -1);
        zzia.zza(this.zzahz.data, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.zzahz.data[i] & 255) + (i4 << 8);
        }
        this.zzaky += i3 + 1;
        return (long) i4;
    }
}
