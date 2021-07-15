/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$EnumLite
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.Internal$EnumVerifier
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.type;

import com.google.protobuf.Internal;

public final class DayOfWeek
extends Enum<DayOfWeek>
implements Internal.EnumLite {
    private static final /* synthetic */ DayOfWeek[] $VALUES;
    public static final /* enum */ DayOfWeek DAY_OF_WEEK_UNSPECIFIED;
    public static final int DAY_OF_WEEK_UNSPECIFIED_VALUE = 0;
    public static final /* enum */ DayOfWeek FRIDAY;
    public static final int FRIDAY_VALUE = 5;
    public static final /* enum */ DayOfWeek MONDAY;
    public static final int MONDAY_VALUE = 1;
    public static final /* enum */ DayOfWeek SATURDAY;
    public static final int SATURDAY_VALUE = 6;
    public static final /* enum */ DayOfWeek SUNDAY;
    public static final int SUNDAY_VALUE = 7;
    public static final /* enum */ DayOfWeek THURSDAY;
    public static final int THURSDAY_VALUE = 4;
    public static final /* enum */ DayOfWeek TUESDAY;
    public static final int TUESDAY_VALUE = 2;
    public static final /* enum */ DayOfWeek UNRECOGNIZED;
    public static final /* enum */ DayOfWeek WEDNESDAY;
    public static final int WEDNESDAY_VALUE = 3;
    private static final Internal.EnumLiteMap<DayOfWeek> internalValueMap;
    private final int value;

    static {
        DayOfWeek dayOfWeek;
        DayOfWeek dayOfWeek2;
        DayOfWeek dayOfWeek3;
        DayOfWeek dayOfWeek4;
        DayOfWeek dayOfWeek5;
        DayOfWeek dayOfWeek6;
        DayOfWeek dayOfWeek7;
        DayOfWeek dayOfWeek8;
        DayOfWeek dayOfWeek9;
        DAY_OF_WEEK_UNSPECIFIED = dayOfWeek5 = new DayOfWeek(0);
        MONDAY = dayOfWeek3 = new DayOfWeek(1);
        TUESDAY = dayOfWeek8 = new DayOfWeek(2);
        WEDNESDAY = dayOfWeek = new DayOfWeek(3);
        THURSDAY = dayOfWeek7 = new DayOfWeek(4);
        FRIDAY = dayOfWeek4 = new DayOfWeek(5);
        SATURDAY = dayOfWeek2 = new DayOfWeek(6);
        SUNDAY = dayOfWeek9 = new DayOfWeek(7);
        UNRECOGNIZED = dayOfWeek6 = new DayOfWeek(-1);
        $VALUES = new DayOfWeek[]{dayOfWeek5, dayOfWeek3, dayOfWeek8, dayOfWeek, dayOfWeek7, dayOfWeek4, dayOfWeek2, dayOfWeek9, dayOfWeek6};
        internalValueMap = new Internal.EnumLiteMap<DayOfWeek>(){

            public DayOfWeek findValueByNumber(int n) {
                return DayOfWeek.forNumber(n);
            }
        };
    }

    private DayOfWeek(int n2) {
        this.value = n2;
    }

    public static DayOfWeek forNumber(int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return SUNDAY;
            }
            case 6: {
                return SATURDAY;
            }
            case 5: {
                return FRIDAY;
            }
            case 4: {
                return THURSDAY;
            }
            case 3: {
                return WEDNESDAY;
            }
            case 2: {
                return TUESDAY;
            }
            case 1: {
                return MONDAY;
            }
            case 0: 
        }
        return DAY_OF_WEEK_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<DayOfWeek> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return DayOfWeekVerifier.INSTANCE;
    }

    @Deprecated
    public static DayOfWeek valueOf(int n) {
        return DayOfWeek.forNumber(n);
    }

    public static DayOfWeek valueOf(String string) {
        return (DayOfWeek)Enum.valueOf(DayOfWeek.class, (String)string);
    }

    public static DayOfWeek[] values() {
        return (DayOfWeek[])$VALUES.clone();
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    private static final class DayOfWeekVerifier
    implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new DayOfWeekVerifier();

        private DayOfWeekVerifier() {
        }

        public boolean isInRange(int n) {
            return DayOfWeek.forNumber(n) != null;
        }
    }

}

