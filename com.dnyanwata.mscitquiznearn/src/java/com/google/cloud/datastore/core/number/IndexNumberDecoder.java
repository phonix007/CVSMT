/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.cloud.datastore.core.number;

public class IndexNumberDecoder {
    private String doubleResultRepProblemMessage;
    private String longResultRepProblemMessage;
    private double resultAsDouble;
    private long resultAsLong;
    private int resultExponent;
    private boolean resultNegative;
    private long resultSignificand;

    public IndexNumberDecoder() {
        this.reset();
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

    private void recordNumber(boolean bl, int n, long l) {
        this.longResultRepProblemMessage = null;
        this.doubleResultRepProblemMessage = null;
        this.resultNegative = bl;
        this.resultExponent = n;
        this.resultSignificand = l;
    }

    private void updateResultDoubleState() {
        long l;
        if (this.doubleResultRepProblemMessage != null) {
            return;
        }
        this.doubleResultRepProblemMessage = "";
        int n = this.resultExponent;
        long l2 = 0L;
        if (n == Integer.MAX_VALUE) {
            if (this.resultSignificand == l2) {
                if (this.resultNegative) {
                    this.resultAsDouble = Double.NEGATIVE_INFINITY;
                    return;
                }
                this.resultAsDouble = Double.POSITIVE_INFINITY;
                return;
            }
            this.resultAsDouble = Double.NaN;
            return;
        }
        if (n == Integer.MIN_VALUE && this.resultSignificand == l2) {
            this.resultAsDouble = 0.0;
            return;
        }
        if (64 - Long.numberOfTrailingZeros((long)this.resultSignificand) > 52) {
            this.doubleResultRepProblemMessage = "Number has too many significant bits for a double.";
            return;
        }
        this.resultSignificand = l = this.resultSignificand >>> 12;
        int n2 = this.resultExponent;
        if (n2 >= -1022) {
            this.resultExponent = n2 + 1023;
        } else {
            long l3;
            int n3 = -1022 - n2;
            this.resultSignificand = l3 = l >>> n3;
            if (l3 << n3 != l) {
                this.doubleResultRepProblemMessage = "Number has too many significant bits for a subnormal double.";
            }
            this.resultSignificand = l3 | 1L << 52 - n3;
            this.resultExponent = 0;
        }
        long l4 = this.resultSignificand | (long)this.resultExponent << 52;
        if (this.resultNegative) {
            l2 = Long.MIN_VALUE;
        }
        this.resultAsDouble = Double.longBitsToDouble((long)(l4 | l2));
    }

    private void updateResultLongState() {
        if (this.longResultRepProblemMessage != null) {
            return;
        }
        this.longResultRepProblemMessage = "";
        int n = this.resultExponent;
        if (n == Integer.MAX_VALUE) {
            if (this.resultSignificand == 0L) {
                if (this.resultNegative) {
                    this.longResultRepProblemMessage = "+Infinity is not an integer.";
                    return;
                }
                this.longResultRepProblemMessage = "-Infinity is not an integer.";
                return;
            }
            this.longResultRepProblemMessage = "NaN is not an integer.";
            return;
        }
        if (n == Integer.MIN_VALUE && this.resultSignificand == 0L) {
            this.resultAsLong = 0L;
            return;
        }
        if (n < 0) {
            this.longResultRepProblemMessage = "Number is not an integer.";
            return;
        }
        if (n >= 64) {
            this.longResultRepProblemMessage = "Number is outside the long range.";
            return;
        }
        if (n == 63) {
            if (this.resultSignificand == 0L && this.resultNegative) {
                this.resultAsLong = Long.MIN_VALUE;
                return;
            }
            this.longResultRepProblemMessage = "Number is outside the long range.";
            return;
        }
        int n2 = this.resultExponent;
        int n3 = 64 - Long.numberOfTrailingZeros((long)this.resultSignificand);
        if (n2 < n3) {
            this.longResultRepProblemMessage = "Number is not an integer.";
            return;
        }
        long l = this.resultSignificand >>> 1 + (63 - n2) ^ 1L << n2;
        if (this.resultNegative) {
            l = -l;
        }
        this.resultAsLong = l;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int decode(boolean var1_1, byte[] var2_2, int var3_3) {
        block11 : {
            block9 : {
                block10 : {
                    block12 : {
                        var4_4 = var3_3 + 1;
                        var5_5 = 255 & var2_2[var3_3];
                        var6_6 = (var5_5 & 128) == 0;
                        var7_7 = var6_6 != false ? 255 : 0;
                        var8_8 = var5_5 ^ var7_7;
                        var9_9 = var6_6 ^ var1_1;
                        var10_10 = (var8_8 & 64) == 0;
                        var11_11 = var10_10 != false ? 255 : 0;
                        var12_12 = var8_8 ^ var11_11;
                        var13_13 = IndexNumberDecoder.decodeMarker(var12_12);
                        if (var13_13 == -4) break block9;
                        if (var13_13 == -3 || var13_13 == -2 || var13_13 == -1) break block10;
                        if (var13_13 == 1) break block11;
                        if (var13_13 == 2) break block12;
                        if (var13_13 != 3) {
                            if (var13_13 != 6) throw new IllegalArgumentException("Invalid encoded byte array");
                            if (var6_6) {
                                if (var10_10) {
                                    this.recordNumber(var9_9, Integer.MIN_VALUE, 0L);
                                    return var4_4 - var3_3;
                                }
                                var35_14 = var4_4 + 1;
                                var36_15 = 255 & var2_2[var4_4];
                                if (var36_15 == 128) {
                                    this.recordNumber(var9_9, Integer.MAX_VALUE, 0L);
                                } else {
                                    if (var36_15 != 96) throw new IllegalArgumentException("Invalid encoded byte array");
                                    this.recordNumber(var9_9, Integer.MAX_VALUE, 1L);
                                }
                                var4_4 = var35_14;
                                return var4_4 - var3_3;
                            }
                            if (var10_10) {
                                this.recordNumber(var9_9, Integer.MIN_VALUE, 0L);
                                return var4_4 - var3_3;
                            }
                            this.recordNumber(var9_9, Integer.MAX_VALUE, 0L);
                            return var4_4 - var3_3;
                        }
                        var31_16 = (3 & var12_12) << 8;
                        var32_17 = var4_4 + 1;
                        var33_18 = 148 + (var31_16 | var11_11 ^ (var7_7 ^ 255 & var2_2[var4_4]));
                        var34_19 = var32_17 + 1;
                        var14_20 = var7_7 ^ 255 & var2_2[var32_17];
                        var15_21 = 0L | IndexNumberDecoder.decodeTrailingSignificandByte(var14_20, 57);
                        var18_22 = 57;
                        var21_23 = var34_19;
                        var17_24 = var33_18;
                        ** GOTO lbl81
                    }
                    var26_25 = (var12_12 & 7) << 4;
                    var27_26 = var4_4 + 1;
                    var28_27 = var7_7 ^ 255 & var2_2[var4_4];
                    var17_24 = 20 + (var26_25 | (var28_27 ^ var11_11) >>> 4);
                    var29_28 = 0L | (15L & (long)var28_27) << 60;
                    var4_4 = var27_26 + 1;
                    var14_20 = var7_7 ^ 255 & var2_2[var27_26];
                    var18_22 = 53;
                    var15_21 = var29_28 | IndexNumberDecoder.decodeTrailingSignificandByte(var14_20, var18_22);
                    ** GOTO lbl82
                }
                var22_31 = var13_13 + 4;
                var23_32 = 64 - var22_31;
                var24_33 = 0L | (long)(var8_8 & (126 & -1 << var22_31 + 1)) << var23_32 - 1;
                var14_20 = var8_8;
                var17_24 = var22_31;
                var18_22 = var23_32;
                var15_21 = var24_33;
                ** GOTO lbl82
            }
            if (var10_10 != false) throw new IllegalArgumentException("Invalid encoded number: exponent negative zero is invalid");
            var14_20 = var8_8;
            var15_21 = 0L;
            var17_24 = 0;
            var18_22 = 64;
            ** GOTO lbl82
        }
        var17_24 = 4 + (var12_12 & 15);
        var19_29 = var4_4 + 1;
        var20_30 = var7_7 ^ 255 & var2_2[var4_4];
        var15_21 = 0L | IndexNumberDecoder.decodeTrailingSignificandByte(var20_30, 57);
        var18_22 = 57;
        do {
            var21_23 = var19_29;
            var14_20 = var20_30;
lbl81: // 2 sources:
            var4_4 = var21_23;
lbl82: // 4 sources:
            if ((var14_20 & 1) == 0) break;
            var19_29 = var4_4 + 1;
            var20_30 = var7_7 ^ 255 & var2_2[var4_4];
            if ((var18_22 -= 7) >= 0) {
                var15_21 |= IndexNumberDecoder.decodeTrailingSignificandByte(var20_30, var18_22);
                continue;
            }
            var15_21 |= (long)(var20_30 & 254) >>> -(var18_22 - 1);
            if ((var20_30 & 1) != 0) throw new IllegalArgumentException("Invalid encoded byte array: overlong sequence");
            var18_22 = 0;
        } while (true);
        if (var10_10) {
            var17_24 = -var17_24;
        }
        this.recordNumber(var9_9, var17_24, var15_21);
        return var4_4 - var3_3;
    }

    public boolean isResultDouble() {
        this.updateResultDoubleState();
        return this.doubleResultRepProblemMessage.isEmpty();
    }

    public boolean isResultLong() {
        this.updateResultLongState();
        return this.longResultRepProblemMessage.isEmpty();
    }

    public void reset() {
        this.longResultRepProblemMessage = "No bytes decoded.";
        this.doubleResultRepProblemMessage = "No bytes decoded.";
    }

    public double resultAsDouble() {
        this.updateResultDoubleState();
        if (this.doubleResultRepProblemMessage.isEmpty()) {
            return this.resultAsDouble;
        }
        throw new IllegalArgumentException(this.doubleResultRepProblemMessage);
    }

    public long resultAsLong() {
        this.updateResultLongState();
        if (this.longResultRepProblemMessage.isEmpty()) {
            return this.resultAsLong;
        }
        throw new IllegalArgumentException(this.longResultRepProblemMessage);
    }
}

