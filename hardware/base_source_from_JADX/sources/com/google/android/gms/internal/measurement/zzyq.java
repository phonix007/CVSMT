package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

final class zzyq implements ListIterator<String> {
    private ListIterator<String> zzcdm = this.zzcdo.zzcdl.listIterator(this.zzcdn);
    private final /* synthetic */ int zzcdn;
    private final /* synthetic */ zzyp zzcdo;

    zzyq(zzyp zzyp, int i) {
        this.zzcdo = zzyp;
        this.zzcdn = i;
    }

    public final boolean hasNext() {
        return this.zzcdm.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zzcdm.hasPrevious();
    }

    public final int nextIndex() {
        return this.zzcdm.nextIndex();
    }

    public final int previousIndex() {
        return this.zzcdm.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object previous() {
        return this.zzcdm.previous();
    }

    public final /* synthetic */ Object next() {
        return this.zzcdm.next();
    }
}
