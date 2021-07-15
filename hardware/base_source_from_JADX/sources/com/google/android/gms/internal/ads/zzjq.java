package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.UUID;

public final class zzjq {
    public static byte[] zza(UUID uuid, byte[] bArr) {
        int length = bArr.length + 32;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(zziv.zzamu);
        allocate.putInt(0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        allocate.putInt(bArr.length);
        allocate.put(bArr);
        return allocate.array();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.UUID zze(byte[] r9) {
        /*
            com.google.android.gms.internal.ads.zzpx r0 = new com.google.android.gms.internal.ads.zzpx
            r0.<init>((byte[]) r9)
            int r9 = r0.limit()
            r1 = 0
            r2 = 32
            if (r9 >= r2) goto L_0x0010
        L_0x000e:
            r9 = r1
            goto L_0x007a
        L_0x0010:
            r9 = 0
            r0.setPosition(r9)
            int r2 = r0.readInt()
            int r3 = r0.zzhb()
            int r3 = r3 + 4
            if (r2 == r3) goto L_0x0021
            goto L_0x000e
        L_0x0021:
            int r2 = r0.readInt()
            int r3 = com.google.android.gms.internal.ads.zziv.zzamu
            if (r2 == r3) goto L_0x002a
            goto L_0x000e
        L_0x002a:
            int r2 = r0.readInt()
            int r2 = com.google.android.gms.internal.ads.zziv.zzaf(r2)
            r3 = 1
            if (r2 <= r3) goto L_0x004e
            java.lang.String r9 = "PsshAtomUtil"
            r0 = 37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = "Unsupported pssh version: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            android.util.Log.w(r9, r0)
            goto L_0x000e
        L_0x004e:
            java.util.UUID r4 = new java.util.UUID
            long r5 = r0.readLong()
            long r7 = r0.readLong()
            r4.<init>(r5, r7)
            if (r2 != r3) goto L_0x0066
            int r2 = r0.zzhg()
            int r2 = r2 << 4
            r0.zzbl(r2)
        L_0x0066:
            int r2 = r0.zzhg()
            int r3 = r0.zzhb()
            if (r2 == r3) goto L_0x0071
            goto L_0x000e
        L_0x0071:
            byte[] r3 = new byte[r2]
            r0.zze(r3, r9, r2)
            android.util.Pair r9 = android.util.Pair.create(r4, r3)
        L_0x007a:
            if (r9 != 0) goto L_0x007d
            return r1
        L_0x007d:
            java.lang.Object r9 = r9.first
            java.util.UUID r9 = (java.util.UUID) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjq.zze(byte[]):java.util.UUID");
    }
}
