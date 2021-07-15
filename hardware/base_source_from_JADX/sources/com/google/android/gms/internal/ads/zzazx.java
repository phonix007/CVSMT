package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzazx extends zzaw {
    private final /* synthetic */ byte[] zzenb;
    private final /* synthetic */ Map zzenc;
    private final /* synthetic */ zzbax zzend;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzazx(zzazs zzazs, int i, String str, zzz zzz, zzy zzy, byte[] bArr, Map map, zzbax zzbax) {
        super(i, str, zzz, zzy);
        this.zzenb = bArr;
        this.zzenc = map;
        this.zzend = zzbax;
    }

    public final byte[] zzh() throws zza {
        return this.zzenb == null ? super.zzh() : this.zzenb;
    }

    public final Map<String, String> getHeaders() throws zza {
        return this.zzenc == null ? super.getHeaders() : this.zzenc;
    }

    /* access modifiers changed from: protected */
    public final void zzh(String str) {
        this.zzend.zzek(str);
        super.zza(str);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void zza(Object obj) {
        zza((String) obj);
    }
}
