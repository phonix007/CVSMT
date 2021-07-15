package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzni {

    /* renamed from: id */
    public final int f51id;
    public final int type;
    public final List<zznp> zzbcn;
    public final List<zznm> zzbco;
    public final List<zznm> zzbcp;

    public zzni(int i, int i2, List<zznp> list, List<zznm> list2, List<zznm> list3) {
        this.f51id = i;
        this.type = i2;
        this.zzbcn = Collections.unmodifiableList(list);
        this.zzbco = Collections.unmodifiableList(list2);
        this.zzbcp = Collections.unmodifiableList(list3);
    }
}
