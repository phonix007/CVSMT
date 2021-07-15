/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Object
 */
package com.google.cloud.datastore.core.number;

public final class NumberComparisonHelper {
    public static final double LONG_EXCLUSIVE_UPPER_BOUND_AS_DOUBLE = 9.223372036854776E18;
    public static final double LONG_INCLUSIVE_LOWER_BOUND_AS_DOUBLE = -9.223372036854776E18;
    public static final long MAX_SAFE_LONG = 0x20000000000000L;
    public static final long MIN_SAFE_LONG = -9007199254740992L;

    private NumberComparisonHelper() {
    }

    public static int compareLongs(long l, long l2) {
        long l3 = l LCMP l2;
        if (l3 < 0) {
            return -1;
        }
        return l3 > 0;
    }

    public static int firestoreCompareDoubleWithLong(double d, long l) {
        if (Double.isNaN((double)d)) {
            return -1;
        }
        if (d < -9.223372036854776E18) {
            return -1;
        }
        if (d >= 9.223372036854776E18) {
            return 1;
        }
        int n = NumberComparisonHelper.compareLongs((long)d, l);
        if (n != 0) {
            return n;
        }
        return NumberComparisonHelper.firestoreCompareDoubles(d, l);
    }

    public static int firestoreCompareDoubles(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        double d3 = d DCMPL d2;
        if (d3 > 0) {
            return 1;
        }
        if (d3 == false) {
            return 0;
        }
        if (!Double.isNaN((double)d2)) {
            return -1;
        }
        return !Double.isNaN((double)d);
    }
}

