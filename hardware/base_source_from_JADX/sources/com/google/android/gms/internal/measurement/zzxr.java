package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

final class zzxr<E> extends zzuj<E> {
    private static final zzxr<Object> zzccq;
    private final List<E> zzcbd;

    public static <E> zzxr<E> zzyb() {
        return zzccq;
    }

    zzxr() {
        this(new ArrayList(10));
    }

    private zzxr(List<E> list) {
        this.zzcbd = list;
    }

    public final void add(int i, E e) {
        zzuh();
        this.zzcbd.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.zzcbd.get(i);
    }

    public final E remove(int i) {
        zzuh();
        E remove = this.zzcbd.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        zzuh();
        E e2 = this.zzcbd.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.zzcbd.size();
    }

    public final /* synthetic */ zzwd zzak(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzcbd);
            return new zzxr(arrayList);
        }
        throw new IllegalArgumentException();
    }

    static {
        zzxr<Object> zzxr = new zzxr<>();
        zzccq = zzxr;
        zzxr.zzsw();
    }
}
