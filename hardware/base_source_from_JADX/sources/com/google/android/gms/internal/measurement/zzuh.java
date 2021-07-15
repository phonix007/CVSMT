package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzug;
import com.google.android.gms.internal.measurement.zzuh;

public abstract class zzuh<MessageType extends zzug<MessageType, BuilderType>, BuilderType extends zzuh<MessageType, BuilderType>> implements zzxf {
    /* access modifiers changed from: protected */
    public abstract BuilderType zza(MessageType messagetype);

    /* renamed from: zzuf */
    public abstract BuilderType clone();

    public final /* synthetic */ zzxf zza(zzxe zzxe) {
        if (zzwq().getClass().isInstance(zzxe)) {
            return zza((zzug) zzxe);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
