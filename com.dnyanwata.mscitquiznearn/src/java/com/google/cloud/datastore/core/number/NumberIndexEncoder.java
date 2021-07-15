/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package com.google.cloud.datastore.core.number;

import com.google.cloud.datastore.core.number.NumberParts;
import java.util.Arrays;

public class NumberIndexEncoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final byte[] ENCODED_NAN;
    private static final byte[] ENCODED_NEGATIVE_INFINITY;
    private static final byte[] ENCODED_POSITIVE_INFINITY;
    private static final byte[] ENCODED_ZERO;
    private static final int EXP1_END = 4;
    private static final int EXP2_END = 20;
    private static final int EXP3_END = 148;
    private static final int EXP4_END = 1172;
    private static final int MAX_ENCODED_BYTES = 11;

    static {
        ENCODED_ZERO = new byte[]{-128};
        ENCODED_NAN = new byte[]{0, 96};
        ENCODED_NEGATIVE_INFINITY = new byte[]{0, -128};
        ENCODED_POSITIVE_INFINITY = new byte[]{-1};
    }

    private static byte[] copyOf(byte[] arrby) {
        return (byte[])arrby.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static DecodedNumberParts decode(byte[] arrby) {
        int n;
        int n2;
        int n3 = arrby.length;
        int n4 = 1;
        if (n3 < n4) throw new IllegalArgumentException("Invalid encoded byte array");
        int n5 = 255 & arrby[0];
        boolean bl = (n5 & 128) == 0;
        int n6 = bl ? 255 : 0;
        int n7 = n5 ^ n6;
        boolean bl2 = (n7 & 64) == 0;
        int n8 = bl2 ? 255 : 0;
        int n9 = n7 ^ n8;
        int n10 = NumberIndexEncoder.decodeMarker(n9);
        long l = 0L;
        int n11 = 3;
        if (n10 != -4) {
            if (n10 != -3 && n10 != -2 && n10 != -1) {
                if (n10 != n4) {
                    int n12;
                    int n13;
                    if (n10 != 2) {
                        if (n10 != n11) {
                            NumberParts numberParts;
                            if (n10 != 6) throw new IllegalArgumentException("Invalid encoded byte array");
                            if (bl) {
                                if (bl2) {
                                    numberParts = NumberParts.create((boolean)n4, Integer.MIN_VALUE, l);
                                    return DecodedNumberParts.create(n4, numberParts);
                                }
                                if (arrby.length < 2) throw new IllegalArgumentException("Invalid encoded byte array");
                                int n14 = 255 & arrby[n4];
                                if (n14 == 128) {
                                    numberParts = NumberParts.create((boolean)n4, Integer.MAX_VALUE, l);
                                } else {
                                    if (n14 != 96) throw new IllegalArgumentException("Invalid encoded byte array");
                                    numberParts = NumberParts.create((boolean)n4, Integer.MAX_VALUE, 1L);
                                }
                                n4 = 2;
                                return DecodedNumberParts.create(n4, numberParts);
                            }
                            if (bl2) {
                                numberParts = NumberParts.create(false, Integer.MIN_VALUE, l);
                                return DecodedNumberParts.create(n4, numberParts);
                            }
                            numberParts = NumberParts.create(false, Integer.MAX_VALUE, l);
                            return DecodedNumberParts.create(n4, numberParts);
                        }
                        if (arrby.length < n11) throw new IllegalArgumentException("Invalid encoded byte array");
                        n12 = 148 + ((n9 & 3) << 8 | n8 ^ (n6 ^ 255 & arrby[n4]));
                        n13 = n6 ^ 255 & arrby[2];
                        l |= NumberIndexEncoder.decodeTrailingSignificandByte(n13, 57);
                        n = 57;
                    } else {
                        if (arrby.length < n11) throw new IllegalArgumentException("Invalid encoded byte array");
                        int n15 = (n9 & 7) << 4;
                        int n16 = n6 ^ 255 & arrby[n4];
                        n12 = 20 + (n15 | (n8 ^ n16) >>> 4);
                        long l2 = l | (15L & (long)n16) << 60;
                        n13 = n6 ^ 255 & arrby[2];
                        l = l2 | NumberIndexEncoder.decodeTrailingSignificandByte(n13, 53);
                        n = 53;
                    }
                    int n17 = n12;
                    n7 = n13;
                    n2 = n17;
                } else {
                    if (arrby.length < 2) throw new IllegalArgumentException("Invalid encoded byte array");
                    int n18 = 4 + (n9 & 15);
                    int n19 = n6 ^ 255 & arrby[n4];
                    l |= NumberIndexEncoder.decodeTrailingSignificandByte(n19, 57);
                    n2 = n18;
                    n7 = n19;
                    n11 = 2;
                    n = 57;
                }
            } else {
                n2 = n10 + 4;
                int n20 = 64 - n2;
                l |= (long)(n7 & (126 & -1 << n2 + 1)) << n20 - 1;
                n = n20;
                n11 = 1;
            }
        } else {
            if (bl2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid encoded number ");
                stringBuilder.append(Arrays.toString((byte[])arrby));
                stringBuilder.append(": exponent negative zero is invalid");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            n2 = 0;
            n11 = 1;
            n = 64;
        }
        do {
            if ((n7 & n4) == 0) {
                if (!bl2) return DecodedNumberParts.create(n11, NumberParts.create(bl, n2, l));
                n2 = -n2;
                return DecodedNumberParts.create(n11, NumberParts.create(bl, n2, l));
            }
            if (n11 >= arrby.length) throw new IllegalArgumentException("Invalid encoded byte array");
            int n21 = n11 + 1;
            int n22 = n6 ^ 255 & arrby[n11];
            int n23 = n - 7;
            if (n23 >= 0) {
                l |= NumberIndexEncoder.decodeTrailingSignificandByte(n22, n23);
                n11 = n21;
                n7 = n22;
                n = n23;
                continue;
            }
            l |= (long)(n22 & 254) >>> -(n23 - 1);
            if ((n22 & 1) != 0) throw new IllegalArgumentException("Invalid encoded byte array: overlong sequence");
            n7 = n22;
            n11 = n21;
            n4 = 1;
            n = 0;
        } while (true);
    }

    public static double decodeDouble(byte[] arrby) {
        return NumberIndexEncoder.decode(arrby).parts().asDouble();
    }

    public static long decodeLong(byte[] arrby) {
        return NumberIndexEncoder.decode(arrby).parts().asLong();
    }

    static int decodeMarker(int n) {
        boolean bl = (n & 32) != 0;
        if (bl) {
            n ^= 255;
        }
        int n2 = 5 - (31 - Integer.numberOfLeadingZeros((int)(n & 63)));
        if (bl) {
            return n2;
        }
        return -n2;
    }

    private static long decodeTrailingSignificandByte(int n, int n2) {
        return (long)(n & 254) << n2 - 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static byte[] encode(NumberParts numberParts) {
        long l;
        int n;
        int n2;
        int n3;
        if (numberParts.isZero()) {
            return NumberIndexEncoder.copyOf(ENCODED_ZERO);
        }
        if (numberParts.isNaN()) {
            return NumberIndexEncoder.copyOf(ENCODED_NAN);
        }
        if (numberParts.isInfinite()) {
            if (numberParts.negative()) {
                return NumberIndexEncoder.copyOf(ENCODED_NEGATIVE_INFINITY);
            }
            return NumberIndexEncoder.copyOf(ENCODED_POSITIVE_INFINITY);
        }
        int n4 = numberParts.exponent();
        long l2 = numberParts.significand();
        byte[] arrby = new byte[11];
        int n5 = numberParts.negative() ? 255 : 0;
        if (n4 < 0) {
            n4 = -n4;
            n2 = 255;
        } else {
            n2 = 0;
        }
        if (n4 < 4) {
            int n6 = n4 + 1;
            int n7 = 1 << n6;
            n = n7 | 192 | n7 - 2 & (int)(l2 >>> 64 - n6);
            l = l2 << n4;
            n3 = 0;
            if (n2 != 0) {
                n ^= 126 & -1 << n6;
                n3 = 0;
            }
        } else if (n4 < 20) {
            arrby[0] = (byte)((224 | n4 - 4) ^ (n5 ^ n2 & 127));
            n = NumberIndexEncoder.topSignificandByte(l2);
            l = l2 << 7;
            n3 = 1;
        } else {
            int n8;
            if (n4 < 148) {
                int n9 = n4 - 20;
                arrby[0] = (byte)((240 | n9 >>> 4) ^ (n5 ^ n2 & 127));
                int n10 = 240 & n9 << 4 | (int)(l2 >>> 60);
                arrby[1] = (byte)(n10 ^ (n5 ^ n2 & 240));
                n8 = NumberIndexEncoder.topSignificandByte(l2 <<= 4);
            } else {
                if (n4 >= 1172) {
                    throw new IllegalStateException("unimplemented");
                }
                int n11 = n4 - 148;
                arrby[0] = (byte)((248 | n11 >>> 8) ^ (n5 ^ n2 & 127));
                arrby[1] = (byte)(n11 & 255 ^ (n5 ^ n2 & 255));
                n8 = NumberIndexEncoder.topSignificandByte(l2);
            }
            long l3 = l2 << 7;
            n = n8;
            l = l3;
            n3 = 2;
        }
        do {
            if (l == 0L) {
                int n12 = n5 ^ n;
                int n13 = n3 + 1;
                arrby[n3] = (byte)n12;
                return Arrays.copyOf((byte[])arrby, (int)n13);
            }
            int n14 = n5 ^ (n | 1);
            int n15 = n3 + 1;
            arrby[n3] = (byte)n14;
            n = NumberIndexEncoder.topSignificandByte(l);
            l <<= 7;
            n3 = n15;
        } while (true);
    }

    public static byte[] encodeDouble(double d) {
        return NumberIndexEncoder.encode(NumberParts.fromDouble(d));
    }

    public static byte[] encodeLong(long l) {
        return NumberIndexEncoder.encode(NumberParts.fromLong(l));
    }

    private static int topSignificandByte(long l) {
        return 254 & (int)(l >>> 56);
    }

    public static final class DecodedNumberParts {
        private final int bytesRead;
        private final NumberParts parts;

        private DecodedNumberParts(int n, NumberParts numberParts) {
            this.bytesRead = n;
            this.parts = numberParts;
        }

        static DecodedNumberParts create(int n, NumberParts numberParts) {
            return new DecodedNumberParts(n, numberParts);
        }

        public int bytesRead() {
            return this.bytesRead;
        }

        public NumberParts parts() {
            return this.parts;
        }
    }

}

