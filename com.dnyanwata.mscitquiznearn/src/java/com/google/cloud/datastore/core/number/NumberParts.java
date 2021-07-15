/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.cloud.datastore.core.number;

public final class NumberParts {
    private static final int DOUBLE_EXPONENT_BIAS = 1023;
    private static final int DOUBLE_MIN_EXPONENT = -1022;
    private static final int DOUBLE_SIGNIFICAND_BITS = 52;
    private static final long DOUBLE_SIGN_BIT = Long.MIN_VALUE;
    static final int NEGATIVE_INFINITE_EXPONENT = Integer.MIN_VALUE;
    static final int POSITIVE_INFINITE_EXPONENT = Integer.MAX_VALUE;
    static final int SIGNIFICAND_BITS = 64;
    private final int exponent;
    private final boolean negative;
    private final long significand;

    private NumberParts(boolean bl, int n, long l) {
        this.negative = bl;
        this.exponent = n;
        this.significand = l;
    }

    public static NumberParts create(boolean bl, int n, long l) {
        if (!(n != Integer.MAX_VALUE || l == 0L || bl && l == 1L)) {
            throw new IllegalArgumentException("Invalid number parts: non-normalized NaN");
        }
        return new NumberParts(bl, n, l);
    }

    private static String doubleRepresentationError() {
        return null;
    }

    public static NumberParts fromDouble(double d) {
        long l;
        long l2 = Double.doubleToLongBits((double)d);
        boolean bl = d < 0.0;
        int n = (int)(2047L & l2 >>> 52) - 1023;
        long l3 = l2 & 0xFFFFFFFFFFFFFL;
        if (n < -1022) {
            if (l3 == 0L) {
                return NumberParts.create(false, Integer.MIN_VALUE, 0L);
            }
            int n2 = Long.numberOfLeadingZeros((long)l3);
            l = (l3 & 1L << 63 - n2) << n2 + 1;
            n -= n2 - 12;
        } else {
            if (n > 1023) {
                if (l3 == 0L) {
                    if (bl) {
                        return NumberParts.create(true, Integer.MAX_VALUE, 0L);
                    }
                    return NumberParts.create(false, Integer.MAX_VALUE, 0L);
                }
                return NumberParts.create(true, Integer.MAX_VALUE, 1L);
            }
            l = l3 << 12;
        }
        return NumberParts.create(bl, n, l);
    }

    public static NumberParts fromLong(long l) {
        long l2 = l LCMP 0L;
        if (l2 == false) {
            return NumberParts.create(false, Integer.MIN_VALUE, 0L);
        }
        boolean bl = false;
        if (l2 < 0) {
            l = -l;
            bl = true;
        }
        int n = Long.numberOfLeadingZeros((long)l);
        int n2 = 63 - n;
        return NumberParts.create(bl, n2, (l & 1L << n2) << n + 1);
    }

    private String longRepresentationError() {
        if (this.isZero()) {
            return null;
        }
        if (this.isInfinite()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid encoded long ");
            stringBuilder.append((Object)this);
            stringBuilder.append(": Infinity is not a long");
            return stringBuilder.toString();
        }
        if (this.isNaN()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid encoded long ");
            stringBuilder.append((Object)this);
            stringBuilder.append(": NaN is not a long");
            return stringBuilder.toString();
        }
        if (this.exponent() == 63) {
            if (this.significand() == 0L && this.negative()) {
                return null;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid encoded long ");
            stringBuilder.append((Object)this);
            stringBuilder.append(": overflow");
            return stringBuilder.toString();
        }
        if (this.exponent() >= 0 && this.exponent() <= 63) {
            int n = Long.numberOfTrailingZeros((long)this.significand());
            if (this.exponent() < 64 - n) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid encoded long ");
                stringBuilder.append((Object)this);
                stringBuilder.append(": contains fractional part");
                return stringBuilder.toString();
            }
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid encoded long ");
        stringBuilder.append((Object)this);
        stringBuilder.append(": exponent ");
        stringBuilder.append(this.exponent());
        stringBuilder.append(" too large");
        return stringBuilder.toString();
    }

    public double asDouble() {
        String string2 = NumberParts.doubleRepresentationError();
        if (string2 == null) {
            long l;
            if (this.isZero()) {
                return 0.0;
            }
            if (this.isInfinite()) {
                if (this.negative()) {
                    return Double.NEGATIVE_INFINITY;
                }
                return Double.POSITIVE_INFINITY;
            }
            if (this.isNaN()) {
                return Double.NaN;
            }
            long l2 = this.exponent();
            long l3 = this.significand() >>> 12;
            long l4 = 0L;
            if (l2 >= -1022L) {
                l = l2 + 1023L;
            } else {
                int n = -1022 - this.exponent();
                l3 = l3 >>> n | 1L << 52 - n;
                l = l4;
            }
            long l5 = l3 | l << 52;
            if (this.negative()) {
                l4 = Long.MIN_VALUE;
            }
            return Double.longBitsToDouble((long)(l5 | l4));
        }
        throw new IllegalArgumentException(string2);
    }

    public long asLong() {
        String string2 = this.longRepresentationError();
        if (string2 == null) {
            if (this.isZero()) {
                return 0L;
            }
            if (this.exponent() == 63) {
                return Long.MIN_VALUE;
            }
            long l = this.significand() >>> 1 + (63 - this.exponent()) ^ 1L << this.exponent();
            if (this.negative()) {
                l = -l;
            }
            return l;
        }
        throw new IllegalArgumentException(string2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof NumberParts)) {
            return false;
        }
        NumberParts numberParts = (NumberParts)object;
        return this.negative == numberParts.negative && this.exponent == numberParts.exponent && this.significand == numberParts.significand;
    }

    public int exponent() {
        return this.exponent;
    }

    public int hashCode() {
        int n = 31 * (31 * this.negative + this.exponent);
        long l = this.significand;
        return n + (int)(l ^ l >>> 32);
    }

    public boolean isInfinite() {
        return this.exponent() == Integer.MAX_VALUE && this.significand() == 0L;
    }

    public boolean isNaN() {
        return this.exponent() == Integer.MAX_VALUE && this.significand() != 0L;
    }

    public boolean isZero() {
        return this.exponent() == Integer.MIN_VALUE && this.significand() == 0L;
    }

    public NumberParts negate() {
        if (!this.isZero()) {
            if (this.isNaN()) {
                return this;
            }
            return NumberParts.create(true ^ this.negative(), this.exponent(), this.significand());
        }
        return this;
    }

    public boolean negative() {
        return this.negative;
    }

    public boolean representableAsDouble() {
        return NumberParts.doubleRepresentationError() == null;
    }

    public boolean representableAsLong() {
        return this.longRepresentationError() == null;
    }

    public long significand() {
        return this.significand;
    }
}

