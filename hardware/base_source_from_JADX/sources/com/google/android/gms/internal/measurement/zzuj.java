package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzuj<E> extends AbstractList<E> implements zzwd<E> {
    private boolean zzbup = true;

    zzuj() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean add(E e) {
        zzuh();
        return super.add(e);
    }

    public void add(int i, E e) {
        zzuh();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        zzuh();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        zzuh();
        return super.addAll(i, collection);
    }

    public void clear() {
        zzuh();
        super.clear();
    }

    public boolean zzug() {
        return this.zzbup;
    }

    public final void zzsw() {
        this.zzbup = false;
    }

    public E remove(int i) {
        zzuh();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        zzuh();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        zzuh();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        zzuh();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        zzuh();
        return super.set(i, e);
    }

    /* access modifiers changed from: protected */
    public final void zzuh() {
        if (!this.zzbup) {
            throw new UnsupportedOperationException();
        }
    }
}
