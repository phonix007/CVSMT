package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@zzark
final class zzbfu {
    private final ArrayList<zzpb> zzexd = new ArrayList<>();
    private long zzexe;

    zzbfu() {
    }

    /* access modifiers changed from: package-private */
    public final long zzadb() {
        Iterator<zzpb> it = this.zzexd.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> responseHeaders = it.next().getResponseHeaders();
            if (responseHeaders != null) {
                for (Map.Entry next : responseHeaders.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) next.getKey())) {
                            this.zzexe = Math.max(this.zzexe, Long.parseLong((String) ((List) next.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.zzexe;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzpb zzpb) {
        this.zzexd.add(zzpb);
    }
}
