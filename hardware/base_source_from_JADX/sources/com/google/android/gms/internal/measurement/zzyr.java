package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zzyr implements Iterator<String> {
    private final /* synthetic */ zzyp zzcdo;
    private Iterator<String> zzcdp = this.zzcdo.zzcdl.iterator();

    zzyr(zzyp zzyp) {
        this.zzcdo = zzyp;
    }

    public final boolean hasNext() {
        return this.zzcdp.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return this.zzcdp.next();
    }
}
