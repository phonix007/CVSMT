package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class zzbuw implements Cloneable {
    private Object value;
    private zzbuu<?, ?> zzfwq;
    private List<zzbvb> zzfwr = new ArrayList();

    zzbuw() {
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzbvb zzbvb) throws IOException {
        if (this.zzfwr != null) {
            this.zzfwr.add(zzbvb);
        } else if (this.value instanceof zzbuz) {
            byte[] bArr = zzbvb.zzflp;
            zzbuq zzq = zzbuq.zzq(bArr, 0, bArr.length);
            int zzalm = zzq.zzalm();
            if (zzalm == bArr.length - zzbur.zzfe(zzalm)) {
                zzbuz zza = ((zzbuz) this.value).zza(zzq);
                this.zzfwq = this.zzfwq;
                this.value = zza;
                this.zzfwr = null;
                return;
            }
            throw zzbuy.zzapo();
        } else if (this.value instanceof zzbuz[]) {
            Collections.singletonList(zzbvb);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(zzbvb);
            throw new NoSuchMethodError();
        }
    }

    /* access modifiers changed from: package-private */
    public final int zzt() {
        if (this.value == null) {
            int i = 0;
            for (zzbvb next : this.zzfwr) {
                i += zzbur.zzfl(next.tag) + 0 + next.zzflp.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzbur zzbur) throws IOException {
        if (this.value == null) {
            for (zzbvb next : this.zzfwr) {
                zzbur.zzge(next.tag);
                zzbur.zzz(next.zzflp);
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbuw)) {
            return false;
        }
        zzbuw zzbuw = (zzbuw) obj;
        if (this.value == null || zzbuw.value == null) {
            if (this.zzfwr != null && zzbuw.zzfwr != null) {
                return this.zzfwr.equals(zzbuw.zzfwr);
            }
            try {
                return Arrays.equals(toByteArray(), zzbuw.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else if (this.zzfwq != zzbuw.zzfwq) {
            return false;
        } else {
            if (!this.zzfwq.zzfwl.isArray()) {
                return this.value.equals(zzbuw.value);
            }
            if (this.value instanceof byte[]) {
                return Arrays.equals((byte[]) this.value, (byte[]) zzbuw.value);
            }
            if (this.value instanceof int[]) {
                return Arrays.equals((int[]) this.value, (int[]) zzbuw.value);
            }
            if (this.value instanceof long[]) {
                return Arrays.equals((long[]) this.value, (long[]) zzbuw.value);
            }
            if (this.value instanceof float[]) {
                return Arrays.equals((float[]) this.value, (float[]) zzbuw.value);
            }
            if (this.value instanceof double[]) {
                return Arrays.equals((double[]) this.value, (double[]) zzbuw.value);
            }
            if (this.value instanceof boolean[]) {
                return Arrays.equals((boolean[]) this.value, (boolean[]) zzbuw.value);
            }
            return Arrays.deepEquals((Object[]) this.value, (Object[]) zzbuw.value);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private final byte[] toByteArray() throws IOException {
        byte[] bArr = new byte[zzt()];
        zza(zzbur.zzx(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzapn */
    public final zzbuw clone() {
        zzbuw zzbuw = new zzbuw();
        try {
            zzbuw.zzfwq = this.zzfwq;
            if (this.zzfwr == null) {
                zzbuw.zzfwr = null;
            } else {
                zzbuw.zzfwr.addAll(this.zzfwr);
            }
            if (this.value != null) {
                if (this.value instanceof zzbuz) {
                    zzbuw.value = (zzbuz) ((zzbuz) this.value).clone();
                } else if (this.value instanceof byte[]) {
                    zzbuw.value = ((byte[]) this.value).clone();
                } else {
                    int i = 0;
                    if (this.value instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.value;
                        byte[][] bArr2 = new byte[bArr.length][];
                        zzbuw.value = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.value instanceof boolean[]) {
                        zzbuw.value = ((boolean[]) this.value).clone();
                    } else if (this.value instanceof int[]) {
                        zzbuw.value = ((int[]) this.value).clone();
                    } else if (this.value instanceof long[]) {
                        zzbuw.value = ((long[]) this.value).clone();
                    } else if (this.value instanceof float[]) {
                        zzbuw.value = ((float[]) this.value).clone();
                    } else if (this.value instanceof double[]) {
                        zzbuw.value = ((double[]) this.value).clone();
                    } else if (this.value instanceof zzbuz[]) {
                        zzbuz[] zzbuzArr = (zzbuz[]) this.value;
                        zzbuz[] zzbuzArr2 = new zzbuz[zzbuzArr.length];
                        zzbuw.value = zzbuzArr2;
                        while (i < zzbuzArr.length) {
                            zzbuzArr2[i] = (zzbuz) zzbuzArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return zzbuw;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
