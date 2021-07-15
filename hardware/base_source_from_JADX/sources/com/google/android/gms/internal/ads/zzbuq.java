package com.google.android.gms.internal.ads;

import android.support.p003v7.widget.ActivityChooserView;
import com.apps.saiinfo.computerhardware.BuildConfig;
import java.io.IOException;

public final class zzbuq {
    private final byte[] buffer;
    private final int zzack;
    private int zzflq;
    private int zzflr = 64;
    private int zzfls = 67108864;
    private int zzflw;
    private int zzfly;
    private int zzflz = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private final int zzfwe;
    private int zzfwf;
    private int zzfwg;
    private zzbqf zzfwh;

    public static zzbuq zzq(byte[] bArr, int i, int i2) {
        return new zzbuq(bArr, 0, i2);
    }

    public final int zzaku() throws IOException {
        if (this.zzfwg == this.zzfwf) {
            this.zzfly = 0;
            return 0;
        }
        this.zzfly = zzalm();
        if (this.zzfly != 0) {
            return this.zzfly;
        }
        throw new zzbuy("Protocol message contained an invalid tag (zero).");
    }

    public final void zzeo(int i) throws zzbuy {
        if (this.zzfly != i) {
            throw new zzbuy("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzep(int i) throws IOException {
        int zzaku;
        switch (i & 7) {
            case 0:
                zzalm();
                return true;
            case 1:
                zzalr();
                zzalr();
                zzalr();
                zzalr();
                zzalr();
                zzalr();
                zzalr();
                zzalr();
                return true;
            case 2:
                zzet(zzalm());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                zzalr();
                zzalr();
                zzalr();
                zzalr();
                return true;
            default:
                throw new zzbuy("Protocol message tag had invalid wire type.");
        }
        do {
            zzaku = zzaku();
            if (zzaku == 0 || !zzep(zzaku)) {
                zzeo(((i >>> 3) << 3) | 4);
                return true;
            }
            zzaku = zzaku();
            zzeo(((i >>> 3) << 3) | 4);
            return true;
        } while (!zzep(zzaku));
        zzeo(((i >>> 3) << 3) | 4);
        return true;
    }

    public final long zzakw() throws IOException {
        return zzaln();
    }

    public final int zzakx() throws IOException {
        return zzalm();
    }

    public final boolean zzala() throws IOException {
        return zzalm() != 0;
    }

    public final String readString() throws IOException {
        int zzalm = zzalm();
        if (zzalm < 0) {
            throw zzbuy.zzapp();
        } else if (zzalm <= this.zzfwf - this.zzfwg) {
            String str = new String(this.buffer, this.zzfwg, zzalm, zzbux.UTF_8);
            this.zzfwg += zzalm;
            return str;
        } else {
            throw zzbuy.zzapo();
        }
    }

    public final void zza(zzbuz zzbuz) throws IOException {
        int zzalm = zzalm();
        if (this.zzflq < this.zzflr) {
            int zzer = zzer(zzalm);
            this.zzflq++;
            zzbuz.zza(this);
            zzeo(0);
            this.zzflq--;
            zzes(zzer);
            return;
        }
        throw new zzbuy("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final byte[] readBytes() throws IOException {
        int zzalm = zzalm();
        if (zzalm < 0) {
            throw zzbuy.zzapp();
        } else if (zzalm == 0) {
            return zzbvc.zzfxe;
        } else {
            if (zzalm <= this.zzfwf - this.zzfwg) {
                byte[] bArr = new byte[zzalm];
                System.arraycopy(this.buffer, this.zzfwg, bArr, 0, zzalm);
                this.zzfwg += zzalm;
                return bArr;
            }
            throw zzbuy.zzapo();
        }
    }

    public final int zzalm() throws IOException {
        byte zzalr = zzalr();
        if (zzalr >= 0) {
            return zzalr;
        }
        byte b = zzalr & Byte.MAX_VALUE;
        byte zzalr2 = zzalr();
        if (zzalr2 >= 0) {
            return b | (zzalr2 << 7);
        }
        byte b2 = b | ((zzalr2 & Byte.MAX_VALUE) << 7);
        byte zzalr3 = zzalr();
        if (zzalr3 >= 0) {
            return b2 | (zzalr3 << 14);
        }
        byte b3 = b2 | ((zzalr3 & Byte.MAX_VALUE) << 14);
        byte zzalr4 = zzalr();
        if (zzalr4 >= 0) {
            return b3 | (zzalr4 << 21);
        }
        byte b4 = b3 | ((zzalr4 & Byte.MAX_VALUE) << 21);
        byte zzalr5 = zzalr();
        byte b5 = b4 | (zzalr5 << 28);
        if (zzalr5 >= 0) {
            return b5;
        }
        for (int i = 0; i < 5; i++) {
            if (zzalr() >= 0) {
                return b5;
            }
        }
        throw zzbuy.zzapq();
    }

    public final long zzaln() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzalr = zzalr();
            j |= ((long) (zzalr & Byte.MAX_VALUE)) << i;
            if ((zzalr & 128) == 0) {
                return j;
            }
        }
        throw zzbuy.zzapq();
    }

    private zzbuq(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzfwe = i;
        int i3 = i2 + i;
        this.zzfwf = i3;
        this.zzack = i3;
        this.zzfwg = i;
    }

    public final <T extends zzbrd<T, ?>> T zza(zzbsw<T> zzbsw) throws IOException {
        try {
            if (this.zzfwh == null) {
                this.zzfwh = zzbqf.zzk(this.buffer, this.zzfwe, this.zzack);
            }
            int zzall = this.zzfwh.zzall();
            int i = this.zzfwg - this.zzfwe;
            if (zzall <= i) {
                this.zzfwh.zzet(i - zzall);
                this.zzfwh.zzeq(this.zzflr - this.zzflq);
                T t = (zzbrd) this.zzfwh.zza(zzbsw, zzbqq.zzame());
                zzep(this.zzfly);
                return t;
            }
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(zzall), Integer.valueOf(i)}));
        } catch (zzbrl e) {
            throw new zzbuy(BuildConfig.FLAVOR, e);
        }
    }

    public final int zzer(int i) throws zzbuy {
        if (i >= 0) {
            int i2 = i + this.zzfwg;
            int i3 = this.zzflz;
            if (i2 <= i3) {
                this.zzflz = i2;
                zzalq();
                return i3;
            }
            throw zzbuy.zzapo();
        }
        throw zzbuy.zzapp();
    }

    private final void zzalq() {
        this.zzfwf += this.zzflw;
        int i = this.zzfwf;
        if (i > this.zzflz) {
            this.zzflw = i - this.zzflz;
            this.zzfwf -= this.zzflw;
            return;
        }
        this.zzflw = 0;
    }

    public final void zzes(int i) {
        this.zzflz = i;
        zzalq();
    }

    public final int zzapl() {
        if (this.zzflz == Integer.MAX_VALUE) {
            return -1;
        }
        return this.zzflz - this.zzfwg;
    }

    public final int getPosition() {
        return this.zzfwg - this.zzfwe;
    }

    public final byte[] zzam(int i, int i2) {
        if (i2 == 0) {
            return zzbvc.zzfxe;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzfwe + i, bArr, 0, i2);
        return bArr;
    }

    public final void zzgc(int i) {
        zzan(i, this.zzfly);
    }

    /* access modifiers changed from: package-private */
    public final void zzan(int i, int i2) {
        if (i > this.zzfwg - this.zzfwe) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(this.zzfwg - this.zzfwe);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.zzfwg = this.zzfwe + i;
            this.zzfly = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private final byte zzalr() throws IOException {
        if (this.zzfwg != this.zzfwf) {
            byte[] bArr = this.buffer;
            int i = this.zzfwg;
            this.zzfwg = i + 1;
            return bArr[i];
        }
        throw zzbuy.zzapo();
    }

    private final void zzet(int i) throws IOException {
        if (i < 0) {
            throw zzbuy.zzapp();
        } else if (this.zzfwg + i > this.zzflz) {
            zzet(this.zzflz - this.zzfwg);
            throw zzbuy.zzapo();
        } else if (i <= this.zzfwf - this.zzfwg) {
            this.zzfwg += i;
        } else {
            throw zzbuy.zzapo();
        }
    }
}
