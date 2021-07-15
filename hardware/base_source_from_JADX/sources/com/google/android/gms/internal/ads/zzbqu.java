package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzbqu<FieldDescriptorType extends zzbqw<FieldDescriptorType>> {
    private static final zzbqu zzfna = new zzbqu(true);
    private final zzbtf<FieldDescriptorType, Object> zzfmx = zzbtf.zzfx(16);
    private boolean zzfmy;
    private boolean zzfmz = false;

    private zzbqu() {
    }

    private zzbqu(boolean z) {
        zzakj();
    }

    public static <T extends zzbqw<T>> zzbqu<T> zzami() {
        return zzfna;
    }

    /* access modifiers changed from: package-private */
    public final boolean isEmpty() {
        return this.zzfmx.isEmpty();
    }

    public final void zzakj() {
        if (!this.zzfmy) {
            this.zzfmx.zzakj();
            this.zzfmy = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzfmy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbqu)) {
            return false;
        }
        return this.zzfmx.equals(((zzbqu) obj).zzfmx);
    }

    public final int hashCode() {
        return this.zzfmx.hashCode();
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        if (this.zzfmz) {
            return new zzbrr(this.zzfmx.entrySet().iterator());
        }
        return this.zzfmx.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
        if (this.zzfmz) {
            return new zzbrr(this.zzfmx.zzaor().iterator());
        }
        return this.zzfmx.zzaor().iterator();
    }

    private final Object zza(FieldDescriptorType fielddescriptortype) {
        Object obj = this.zzfmx.get(fielddescriptortype);
        return obj instanceof zzbro ? zzbro.zzanm() : obj;
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zzamn()) {
            zza(fielddescriptortype.zzaml(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(fielddescriptortype.zzaml(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzbro) {
            this.zzfmz = true;
        }
        this.zzfmx.put(fielddescriptortype, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzbro) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.ads.zzbrg) == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(com.google.android.gms.internal.ads.zzbuj r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.ads.zzbrf.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.ads.zzbqv.zzfnb
            com.google.android.gms.internal.ads.zzbuo r2 = r2.zzapj()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0043
        L_0x0015:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzbsl
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzbro
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzbrg
            if (r2 == 0) goto L_0x0043
        L_0x0026:
            r1 = 1
            goto L_0x0043
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzbpu
            if (r2 != 0) goto L_0x0026
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0043
            goto L_0x0026
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            r1 = r0
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqu.zza(com.google.android.gms.internal.ads.zzbuj, java.lang.Object):void");
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzfmx.zzaop(); i++) {
            if (!zzb(this.zzfmx.zzfy(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> zzb : this.zzfmx.zzaoq()) {
            if (!zzb(zzb)) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        zzbqw zzbqw = (zzbqw) entry.getKey();
        if (zzbqw.zzamm() == zzbuo.MESSAGE) {
            if (zzbqw.zzamn()) {
                for (zzbsl isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzbsl) {
                    if (!((zzbsl) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzbro) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzbqu<FieldDescriptorType> zzbqu) {
        for (int i = 0; i < zzbqu.zzfmx.zzaop(); i++) {
            zzc(zzbqu.zzfmx.zzfy(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> zzc : zzbqu.zzfmx.zzaoq()) {
            zzc(zzc);
        }
    }

    private static Object zzt(Object obj) {
        if (obj instanceof zzbss) {
            return ((zzbss) obj).zzaoc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzc(Map.Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        zzbqw zzbqw = (zzbqw) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzbro) {
            value = zzbro.zzanm();
        }
        if (zzbqw.zzamn()) {
            Object zza = zza(zzbqw);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object zzt : (List) value) {
                ((List) zza).add(zzt(zzt));
            }
            this.zzfmx.put(zzbqw, zza);
        } else if (zzbqw.zzamm() == zzbuo.MESSAGE) {
            Object zza2 = zza(zzbqw);
            if (zza2 == null) {
                this.zzfmx.put(zzbqw, zzt(value));
                return;
            }
            if (zza2 instanceof zzbss) {
                obj = zzbqw.zza((zzbss) zza2, (zzbss) value);
            } else {
                obj = zzbqw.zza(((zzbsl) zza2).zzamt(), (zzbsl) value).zzana();
            }
            this.zzfmx.put(zzbqw, obj);
        } else {
            this.zzfmx.put(zzbqw, zzt(value));
        }
    }

    static void zza(zzbqk zzbqk, zzbuj zzbuj, int i, Object obj) throws IOException {
        if (zzbuj == zzbuj.GROUP) {
            zzbsl zzbsl = (zzbsl) obj;
            zzbrf.zzi(zzbsl);
            zzbqk.zzu(i, 3);
            zzbsl.zzb(zzbqk);
            zzbqk.zzu(i, 4);
            return;
        }
        zzbqk.zzu(i, zzbuj.zzapk());
        switch (zzbqv.zzfmd[zzbuj.ordinal()]) {
            case 1:
                zzbqk.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzbqk.zzf(((Float) obj).floatValue());
                return;
            case 3:
                zzbqk.zzay(((Long) obj).longValue());
                return;
            case 4:
                zzbqk.zzay(((Long) obj).longValue());
                return;
            case 5:
                zzbqk.zzez(((Integer) obj).intValue());
                return;
            case 6:
                zzbqk.zzba(((Long) obj).longValue());
                return;
            case 7:
                zzbqk.zzfc(((Integer) obj).intValue());
                return;
            case 8:
                zzbqk.zzbd(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzbsl) obj).zzb(zzbqk);
                return;
            case 10:
                zzbqk.zze((zzbsl) obj);
                return;
            case 11:
                if (obj instanceof zzbpu) {
                    zzbqk.zzan((zzbpu) obj);
                    return;
                } else {
                    zzbqk.zzfx((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzbpu) {
                    zzbqk.zzan((zzbpu) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzbqk.zzl(bArr, 0, bArr.length);
                return;
            case 13:
                zzbqk.zzfa(((Integer) obj).intValue());
                return;
            case 14:
                zzbqk.zzfc(((Integer) obj).intValue());
                return;
            case 15:
                zzbqk.zzba(((Long) obj).longValue());
                return;
            case 16:
                zzbqk.zzfb(((Integer) obj).intValue());
                return;
            case 17:
                zzbqk.zzaz(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzbrg) {
                    zzbqk.zzez(((zzbrg) obj).zzom());
                    return;
                } else {
                    zzbqk.zzez(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzamj() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzfmx.zzaop(); i2++) {
            Map.Entry<FieldDescriptorType, Object> zzfy = this.zzfmx.zzfy(i2);
            i += zzb((zzbqw<?>) (zzbqw) zzfy.getKey(), zzfy.getValue());
        }
        for (Map.Entry next : this.zzfmx.zzaoq()) {
            i += zzb((zzbqw<?>) (zzbqw) next.getKey(), next.getValue());
        }
        return i;
    }

    public final int zzamk() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzfmx.zzaop(); i2++) {
            i += zzd(this.zzfmx.zzfy(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> zzd : this.zzfmx.zzaoq()) {
            i += zzd(zzd);
        }
        return i;
    }

    private static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
        zzbqw zzbqw = (zzbqw) entry.getKey();
        Object value = entry.getValue();
        if (zzbqw.zzamm() != zzbuo.MESSAGE || zzbqw.zzamn() || zzbqw.zzamo()) {
            return zzb((zzbqw<?>) zzbqw, value);
        }
        if (value instanceof zzbro) {
            return zzbqk.zzb(((zzbqw) entry.getKey()).zzom(), (zzbrs) (zzbro) value);
        }
        return zzbqk.zzd(((zzbqw) entry.getKey()).zzom(), (zzbsl) value);
    }

    static int zza(zzbuj zzbuj, int i, Object obj) {
        int zzfd = zzbqk.zzfd(i);
        if (zzbuj == zzbuj.GROUP) {
            zzbrf.zzi((zzbsl) obj);
            zzfd <<= 1;
        }
        return zzfd + zzb(zzbuj, obj);
    }

    private static int zzb(zzbuj zzbuj, Object obj) {
        switch (zzbqv.zzfmd[zzbuj.ordinal()]) {
            case 1:
                return zzbqk.zzc(((Double) obj).doubleValue());
            case 2:
                return zzbqk.zzg(((Float) obj).floatValue());
            case 3:
                return zzbqk.zzbb(((Long) obj).longValue());
            case 4:
                return zzbqk.zzbc(((Long) obj).longValue());
            case 5:
                return zzbqk.zzfe(((Integer) obj).intValue());
            case 6:
                return zzbqk.zzbe(((Long) obj).longValue());
            case 7:
                return zzbqk.zzfh(((Integer) obj).intValue());
            case 8:
                return zzbqk.zzbe(((Boolean) obj).booleanValue());
            case 9:
                return zzbqk.zzg((zzbsl) obj);
            case 10:
                if (obj instanceof zzbro) {
                    return zzbqk.zza((zzbro) obj);
                }
                return zzbqk.zzf((zzbsl) obj);
            case 11:
                if (obj instanceof zzbpu) {
                    return zzbqk.zzao((zzbpu) obj);
                }
                return zzbqk.zzfy((String) obj);
            case 12:
                if (obj instanceof zzbpu) {
                    return zzbqk.zzao((zzbpu) obj);
                }
                return zzbqk.zzu((byte[]) obj);
            case 13:
                return zzbqk.zzff(((Integer) obj).intValue());
            case 14:
                return zzbqk.zzfi(((Integer) obj).intValue());
            case 15:
                return zzbqk.zzbf(((Long) obj).longValue());
            case 16:
                return zzbqk.zzfg(((Integer) obj).intValue());
            case 17:
                return zzbqk.zzbd(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzbrg) {
                    return zzbqk.zzfj(((zzbrg) obj).zzom());
                }
                return zzbqk.zzfj(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int zzb(zzbqw<?> zzbqw, Object obj) {
        zzbuj zzaml = zzbqw.zzaml();
        int zzom = zzbqw.zzom();
        if (!zzbqw.zzamn()) {
            return zza(zzaml, zzom, obj);
        }
        int i = 0;
        if (zzbqw.zzamo()) {
            for (Object zzb : (List) obj) {
                i += zzb(zzaml, zzb);
            }
            return zzbqk.zzfd(zzom) + i + zzbqk.zzfl(i);
        }
        for (Object zza : (List) obj) {
            i += zza(zzaml, zzom, zza);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzbqu zzbqu = new zzbqu();
        for (int i = 0; i < this.zzfmx.zzaop(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzfy = this.zzfmx.zzfy(i);
            zzbqu.zza((zzbqw) zzfy.getKey(), zzfy.getValue());
        }
        for (Map.Entry next : this.zzfmx.zzaoq()) {
            zzbqu.zza((zzbqw) next.getKey(), next.getValue());
        }
        zzbqu.zzfmz = this.zzfmz;
        return zzbqu;
    }
}
