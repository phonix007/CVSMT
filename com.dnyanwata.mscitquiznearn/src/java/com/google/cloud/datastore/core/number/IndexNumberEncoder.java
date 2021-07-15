/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.cloud.datastore.core.number;

public class IndexNumberEncoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int DOUBLE_EXPONENT_BIAS = 1023;
    static final int DOUBLE_MIN_EXPONENT = -1022;
    static final int DOUBLE_SIGNIFICAND_BITS = 52;
    static final long DOUBLE_SIGN_BIT = Long.MIN_VALUE;
    static final int EXP1_END = 4;
    static final int EXP2_END = 20;
    static final int EXP3_END = 148;
    static final int EXP4_END = 1172;
    public static final int MAX_ENCODED_BYTES = 11;
    static final int NEGATIVE_INFINITE_EXPONENT = Integer.MIN_VALUE;
    static final int POSITIVE_INFINITE_EXPONENT = Integer.MAX_VALUE;
    static final int SIGNIFICAND_BITS = 64;

    private IndexNumberEncoder() {
    }

    public static int encodeDouble(boolean bl, double d, byte[] arrby, int n) {
        long l;
        if (d == 0.0) {
            return IndexNumberEncoder.encodeZero(arrby, n);
        }
        long l2 = Double.doubleToLongBits((double)d);
        boolean bl2 = d < 0.0;
        boolean bl3 = bl2 ^ bl;
        int n2 = (int)(2047L & l2 >>> 52) - 1023;
        long l3 = l2 & 0xFFFFFFFFFFFFFL;
        if (n2 < -1022) {
            int n3 = Long.numberOfLeadingZeros((long)l3);
            l = (l3 & 1L << 63 - n3) << n3 + 1;
            n2 -= n3 - 12;
        } else {
            if (n2 > 1023) {
                if (l3 == 0L) {
                    if (bl3) {
                        int n4 = n + 1;
                        arrby[n] = 0;
                        arrby[n4] = -128;
                        return 2;
                    }
                    arrby[n] = -1;
                    return 1;
                }
                int n5 = n + 1;
                arrby[n] = 0;
                arrby[n5] = 96;
                return 2;
            }
            l = l3 << 12;
        }
        return IndexNumberEncoder.encodeNumber(bl3, n2, l, arrby, n);
    }

    public static int encodeLong(boolean bl, long l, byte[] arrby, int n) {
        long l2 = l LCMP 0L;
        if (l2 == false) {
            return IndexNumberEncoder.encodeZero(arrby, n);
        }
        if (l2 < 0) {
            bl ^= true;
            l = -l;
        }
        boolean bl2 = bl;
        int n2 = Long.numberOfLeadingZeros((long)l);
        int n3 = 63 - n2;
        return IndexNumberEncoder.encodeNumber(bl2, n3, (l & 1L << n3) << n2 + 1, arrby, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int encodeNumber(boolean bl, int n, long l, byte[] arrby, int n2) {
        int n3;
        int n4;
        long l2;
        int n5 = bl ? 255 : 0;
        int n6 = 0;
        if (n < 0) {
            n = -n;
            n6 = 255;
        }
        if (n < 4) {
            int n7 = n + 1;
            int n8 = 1 << n7;
            n4 = n8 | 192 | n8 - 2 & (int)(l >>> 64 - n7);
            l2 = l << n;
            if (n6 != 0) {
                n4 ^= 126 & -1 << n7;
            }
            n3 = n2;
        } else {
            if (n < 20) {
                int n9 = (224 | n - 4) ^ (n5 ^ n6 & 127);
                n3 = n2 + 1;
                arrby[n2] = (byte)n9;
                n4 = IndexNumberEncoder.topSignificandByte(l);
            } else if (n < 148) {
                int n10 = n - 20;
                int n11 = (240 | n10 >>> 4) ^ (n5 ^ n6 & 127);
                int n12 = n2 + 1;
                arrby[n2] = (byte)n11;
                int n13 = 240 & n10 << 4 | (int)(l >>> 60);
                int n14 = n13 ^ (n5 ^ n6 & 240);
                n3 = n12 + 1;
                arrby[n12] = (byte)n14;
                n4 = IndexNumberEncoder.topSignificandByte(l <<= 4);
            } else {
                if (n >= 1172) {
                    throw new IllegalStateException("unimplemented");
                }
                int n15 = n - 148;
                int n16 = (248 | n15 >>> 8) ^ (n5 ^ n6 & 127);
                int n17 = n2 + 1;
                arrby[n2] = (byte)n16;
                int n18 = n15 & 255 ^ (n5 ^ n6 & 255);
                n3 = n17 + 1;
                arrby[n17] = (byte)n18;
                n4 = IndexNumberEncoder.topSignificandByte(l);
            }
            l2 = l << 7;
        }
        do {
            if (l2 == 0L) {
                int n19 = n5 ^ n4;
                int n20 = n3 + 1;
                arrby[n3] = (byte)n19;
                return n20 - n2;
            }
            int n21 = n5 ^ (n4 | 1);
            int n22 = n3 + 1;
            arrby[n3] = (byte)n21;
            n4 = IndexNumberEncoder.topSignificandByte(l2);
            l2 <<= 7;
            n3 = n22;
        } while (true);
    }

    private static int encodeZero(byte[] arrby, int n) {
        arrby[n] = -128;
        return 1;
    }

    private static int topSignificandByte(long l) {
        return 254 & (int)(l >>> 56);
    }
}

