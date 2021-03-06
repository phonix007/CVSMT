package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class zzuo extends zzuq {
    private final int limit = this.zzbux.size();
    private int position = 0;
    private final /* synthetic */ zzun zzbux;

    zzuo(zzun zzun) {
        this.zzbux = zzun;
    }

    public final boolean hasNext() {
        return this.position < this.limit;
    }

    public final byte nextByte() {
        int i = this.position;
        if (i < this.limit) {
            this.position = i + 1;
            return this.zzbux.zzam(i);
        }
        throw new NoSuchElementException();
    }
}
