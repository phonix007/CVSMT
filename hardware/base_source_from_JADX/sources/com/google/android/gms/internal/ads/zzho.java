package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzho extends zzhj {
    public final zzhk zzagn = new zzhk();
    public long zzago;
    private final int zzagp = 0;
    public ByteBuffer zzdd;

    public zzho(int i) {
    }

    public final void zzs(int i) throws IllegalStateException {
        if (this.zzdd == null) {
            this.zzdd = zzt(i);
            return;
        }
        int capacity = this.zzdd.capacity();
        int position = this.zzdd.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer zzt = zzt(i2);
            if (position > 0) {
                this.zzdd.position(0);
                this.zzdd.limit(position);
                zzt.put(this.zzdd);
            }
            this.zzdd = zzt;
        }
    }

    public final boolean zzdt() {
        return zzr(1073741824);
    }

    public final void clear() {
        super.clear();
        if (this.zzdd != null) {
            this.zzdd.clear();
        }
    }

    private final ByteBuffer zzt(int i) {
        int capacity = this.zzdd == null ? 0 : this.zzdd.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }
}
