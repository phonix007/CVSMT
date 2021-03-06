package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzxy extends zzxx<FieldDescriptorType, Object> {
    zzxy(int i) {
        super(i, (zzxy) null);
    }

    public final void zzsw() {
        if (!isImmutable()) {
            for (int i = 0; i < zzyj(); i++) {
                Map.Entry zzbw = zzbw(i);
                if (((zzvq) zzbw.getKey()).zzwi()) {
                    zzbw.setValue(Collections.unmodifiableList((List) zzbw.getValue()));
                }
            }
            for (Map.Entry entry : zzyk()) {
                if (((zzvq) entry.getKey()).zzwi()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzsw();
    }
}
