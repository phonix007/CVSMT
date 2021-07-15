package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzbox {
    private static long zzf(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    private static long zzg(byte[] bArr, int i, int i2) {
        return (zzf(bArr, i) >> i2) & 67108863;
    }

    private static void zza(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }

    static byte[] zze(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long zzg = zzg(bArr3, 0, 0) & 67108863;
            int i = 2;
            int i2 = 3;
            long zzg2 = zzg(bArr3, 3, 2) & 67108611;
            long zzg3 = zzg(bArr3, 6, 4) & 67092735;
            long zzg4 = zzg(bArr3, 9, 6) & 66076671;
            long zzg5 = zzg(bArr3, 12, 8) & 1048575;
            long j = zzg2 * 5;
            long j2 = zzg3 * 5;
            long j3 = zzg4 * 5;
            long j4 = zzg5 * 5;
            byte[] bArr5 = new byte[17];
            long j5 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            int i3 = 0;
            while (i3 < bArr4.length) {
                int min = Math.min(16, bArr4.length - i3);
                System.arraycopy(bArr4, i3, bArr5, 0, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, 17, (byte) 0);
                }
                long zzg6 = j9 + zzg(bArr5, 0, 0);
                long zzg7 = j5 + zzg(bArr5, i2, i);
                long zzg8 = j6 + zzg(bArr5, 6, 4);
                long zzg9 = j7 + zzg(bArr5, 9, 6);
                long zzg10 = j8 + (zzg(bArr5, 12, 8) | ((long) (bArr5[16] << 24)));
                long j10 = (zzg6 * zzg) + (zzg7 * j4) + (zzg8 * j3) + (zzg9 * j2) + (zzg10 * j);
                long j11 = (zzg6 * zzg2) + (zzg7 * zzg) + (zzg8 * j4) + (zzg9 * j3) + (zzg10 * j2) + (j10 >> 26);
                long j12 = (zzg6 * zzg3) + (zzg7 * zzg2) + (zzg8 * zzg) + (zzg9 * j4) + (zzg10 * j3) + (j11 >> 26);
                long j13 = (zzg6 * zzg4) + (zzg7 * zzg3) + (zzg8 * zzg2) + (zzg9 * zzg) + (zzg10 * j4) + (j12 >> 26);
                long j14 = (zzg6 * zzg5) + (zzg7 * zzg4) + (zzg8 * zzg3) + (zzg9 * zzg2) + (zzg10 * zzg) + (j13 >> 26);
                long j15 = (j10 & 67108863) + ((j14 >> 26) * 5);
                j5 = (j11 & 67108863) + (j15 >> 26);
                i3 += 16;
                j6 = j12 & 67108863;
                j7 = j13 & 67108863;
                j8 = j14 & 67108863;
                j9 = j15 & 67108863;
                i = 2;
                i2 = 3;
            }
            long j16 = j6 + (j5 >> 26);
            long j17 = j16 & 67108863;
            long j18 = j7 + (j16 >> 26);
            long j19 = j18 & 67108863;
            long j20 = j8 + (j18 >> 26);
            long j21 = j20 & 67108863;
            long j22 = j9 + ((j20 >> 26) * 5);
            long j23 = j22 & 67108863;
            long j24 = (j5 & 67108863) + (j22 >> 26);
            long j25 = j23 + 5;
            long j26 = j25 & 67108863;
            long j27 = (j25 >> 26) + j24;
            long j28 = j17 + (j27 >> 26);
            long j29 = j19 + (j28 >> 26);
            long j30 = j29 & 67108863;
            long j31 = (j21 + (j29 >> 26)) - 67108864;
            long j32 = j31 >> 63;
            long j33 = j23 & j32;
            long j34 = j24 & j32;
            long j35 = j17 & j32;
            long j36 = j19 & j32;
            long j37 = j21 & j32;
            long j38 = j32 ^ -1;
            long j39 = (j27 & 67108863 & j38) | j34;
            long j40 = (j28 & 67108863 & j38) | j35;
            long j41 = (j30 & j38) | j36;
            long j42 = (j31 & j38) | j37;
            long zzf = (((j39 << 26) | j33 | (j26 & j38)) & 4294967295L) + zzf(bArr3, 16);
            long j43 = zzf & 4294967295L;
            long zzf2 = (((j39 >> 6) | (j40 << 20)) & 4294967295L) + zzf(bArr3, 20) + (zzf >> 32);
            long j44 = zzf2 & 4294967295L;
            long zzf3 = (((j40 >> 12) | (j41 << 14)) & 4294967295L) + zzf(bArr3, 24) + (zzf2 >> 32);
            long j45 = zzf3 & 4294967295L;
            byte[] bArr6 = new byte[16];
            zza(bArr6, j43, 0);
            zza(bArr6, j44, 4);
            zza(bArr6, j45, 8);
            zza(bArr6, ((((j41 >> 18) | (j42 << 8)) & 4294967295L) + zzf(bArr3, 28) + (zzf3 >> 32)) & 4294967295L, 12);
            return bArr6;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
