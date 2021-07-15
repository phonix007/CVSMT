package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class zzpu {
    public static final byte[] zzbhi = {0, 0, 0, 1};
    private static final float[] zzbhm = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzbhn = new Object();
    private static int[] zzbho = new int[10];

    public static int zzb(byte[] bArr, int i) {
        int i2;
        synchronized (zzbhn) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    if (zzbho.length <= i4) {
                        zzbho = Arrays.copyOf(zzbho, zzbho.length << 1);
                    }
                    zzbho[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = zzbho[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    public static void zzk(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b == 0) {
                    i2++;
                }
                if (b != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean zza(String str, byte b) {
        if ((!"video/avc".equals(str) || (b & 31) != 6) && (!"video/hevc".equals(str) || ((b & 126) >> 1) != 39)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzpv zzd(byte[] r19, int r20, int r21) {
        /*
            com.google.android.gms.internal.ads.zzpy r0 = new com.google.android.gms.internal.ads.zzpy
            r1 = r19
            r2 = r20
            r3 = r21
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.zzbn(r1)
            int r2 = r0.zzbj(r1)
            r3 = 16
            r0.zzbn(r3)
            int r5 = r0.zzhk()
            r4 = 3
            r6 = 0
            r7 = 1
            r8 = 100
            if (r2 == r8) goto L_0x004c
            r8 = 110(0x6e, float:1.54E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 122(0x7a, float:1.71E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 244(0xf4, float:3.42E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 44
            if (r2 == r8) goto L_0x004c
            r8 = 83
            if (r2 == r8) goto L_0x004c
            r8 = 86
            if (r2 == r8) goto L_0x004c
            r8 = 118(0x76, float:1.65E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 128(0x80, float:1.794E-43)
            if (r2 == r8) goto L_0x004c
            r8 = 138(0x8a, float:1.93E-43)
            if (r2 != r8) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r2 = 1
            r9 = 0
            goto L_0x009c
        L_0x004c:
            int r2 = r0.zzhk()
            if (r2 != r4) goto L_0x0057
            boolean r8 = r0.zzhj()
            goto L_0x0058
        L_0x0057:
            r8 = 0
        L_0x0058:
            r0.zzhk()
            r0.zzhk()
            r0.zzbn(r7)
            boolean r9 = r0.zzhj()
            if (r9 == 0) goto L_0x009b
            if (r2 == r4) goto L_0x006c
            r9 = 8
            goto L_0x006e
        L_0x006c:
            r9 = 12
        L_0x006e:
            r10 = 0
        L_0x006f:
            if (r10 >= r9) goto L_0x009b
            boolean r11 = r0.zzhj()
            if (r11 == 0) goto L_0x0098
            r11 = 6
            if (r10 >= r11) goto L_0x007d
            r11 = 16
            goto L_0x007f
        L_0x007d:
            r11 = 64
        L_0x007f:
            r12 = 0
            r13 = 8
            r14 = 8
        L_0x0084:
            if (r12 >= r11) goto L_0x0098
            if (r13 == 0) goto L_0x0091
            int r13 = r0.zzhl()
            int r13 = r13 + r14
            int r13 = r13 + 256
            int r13 = r13 % 256
        L_0x0091:
            if (r13 != 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r14 = r13
        L_0x0095:
            int r12 = r12 + 1
            goto L_0x0084
        L_0x0098:
            int r10 = r10 + 1
            goto L_0x006f
        L_0x009b:
            r9 = r8
        L_0x009c:
            int r8 = r0.zzhk()
            int r11 = r8 + 4
            int r12 = r0.zzhk()
            if (r12 != 0) goto L_0x00b1
            int r8 = r0.zzhk()
            int r8 = r8 + 4
            r13 = r8
        L_0x00af:
            r14 = 0
            goto L_0x00d3
        L_0x00b1:
            if (r12 != r7) goto L_0x00d1
            boolean r8 = r0.zzhj()
            r0.zzhl()
            r0.zzhl()
            int r10 = r0.zzhk()
            long r13 = (long) r10
            r10 = 0
        L_0x00c3:
            long r3 = (long) r10
            int r16 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r16 >= 0) goto L_0x00ce
            r0.zzhk()
            int r10 = r10 + 1
            goto L_0x00c3
        L_0x00ce:
            r14 = r8
            r13 = 0
            goto L_0x00d3
        L_0x00d1:
            r13 = 0
            goto L_0x00af
        L_0x00d3:
            r0.zzhk()
            r0.zzbn(r7)
            int r3 = r0.zzhk()
            int r3 = r3 + r7
            int r4 = r0.zzhk()
            int r4 = r4 + r7
            boolean r10 = r0.zzhj()
            r6 = 2
            int r8 = 2 - r10
            int r8 = r8 * r4
            if (r10 != 0) goto L_0x00f1
            r0.zzbn(r7)
        L_0x00f1:
            r0.zzbn(r7)
            int r3 = r3 << 4
            int r4 = r8 << 4
            boolean r8 = r0.zzhj()
            if (r8 == 0) goto L_0x012a
            int r8 = r0.zzhk()
            int r16 = r0.zzhk()
            int r17 = r0.zzhk()
            int r18 = r0.zzhk()
            if (r2 != 0) goto L_0x0113
            int r6 = r6 - r10
            r15 = 1
            goto L_0x011f
        L_0x0113:
            r15 = 3
            if (r2 != r15) goto L_0x0118
            r15 = 1
            goto L_0x0119
        L_0x0118:
            r15 = 2
        L_0x0119:
            if (r2 != r7) goto L_0x011c
            r7 = 2
        L_0x011c:
            int r6 = r6 - r10
            int r6 = r6 * r7
        L_0x011f:
            int r8 = r8 + r16
            int r8 = r8 * r15
            int r3 = r3 - r8
            int r17 = r17 + r18
            int r17 = r17 * r6
            int r4 = r4 - r17
        L_0x012a:
            r6 = r3
            r7 = r4
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = r0.zzhj()
            if (r3 == 0) goto L_0x0179
            boolean r3 = r0.zzhj()
            if (r3 == 0) goto L_0x0179
            int r1 = r0.zzbj(r1)
            r3 = 255(0xff, float:3.57E-43)
            if (r1 != r3) goto L_0x0156
            r3 = 16
            int r1 = r0.zzbj(r3)
            int r0 = r0.zzbj(r3)
            if (r1 == 0) goto L_0x0154
            if (r0 == 0) goto L_0x0154
            float r1 = (float) r1
            float r0 = (float) r0
            float r2 = r1 / r0
        L_0x0154:
            r8 = r2
            goto L_0x017b
        L_0x0156:
            float[] r0 = zzbhm
            int r0 = r0.length
            if (r1 >= r0) goto L_0x0161
            float[] r0 = zzbhm
            r0 = r0[r1]
            r8 = r0
            goto L_0x017b
        L_0x0161:
            java.lang.String r0 = "NalUnitUtil"
            r3 = 46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Unexpected aspect_ratio_idc value: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.w(r0, r1)
        L_0x0179:
            r8 = 1065353216(0x3f800000, float:1.0)
        L_0x017b:
            com.google.android.gms.internal.ads.zzpv r0 = new com.google.android.gms.internal.ads.zzpv
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpu.zzd(byte[], int, int):com.google.android.gms.internal.ads.zzpv");
    }
}
