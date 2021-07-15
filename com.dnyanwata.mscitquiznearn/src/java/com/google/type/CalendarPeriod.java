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

public final class CalendarPeriod
extends Enum<CalendarPeriod>
implements Internal.EnumLite {
    private static final /* synthetic */ CalendarPeriod[] $VALUES;
    public static final /* enum */ CalendarPeriod CALENDAR_PERIOD_UNSPECIFIED;
    public static final int CALENDAR_PERIOD_UNSPECIFIED_VALUE = 0;
    public static final /* enum */ CalendarPeriod DAY;
    public static final int DAY_VALUE = 1;
    public static final /* enum */ CalendarPeriod FORTNIGHT;
    public static final int FORTNIGHT_VALUE = 3;
    public static final /* enum */ CalendarPeriod HALF;
    public static final int HALF_VALUE = 6;
    public static final /* enum */ CalendarPeriod MONTH;
    public static final int MONTH_VALUE = 4;
    public static final /* enum */ CalendarPeriod QUARTER;
    public static final int QUARTER_VALUE = 5;
    public static final /* enum */ CalendarPeriod UNRECOGNIZED;
    public static final /* enum */ CalendarPeriod WEEK;
    public static final int WEEK_VALUE = 2;
    public static final /* enum */ CalendarPeriod YEAR;
    public static final int YEAR_VALUE = 7;
    private static final Internal.EnumLiteMap<CalendarPeriod> internalValueMap;
    private final int value;

    static {
        CalendarPeriod calendarPeriod;
        CalendarPeriod calendarPeriod2;
        CalendarPeriod calendarPeriod3;
        CalendarPeriod calendarPeriod4;
        CalendarPeriod calendarPeriod5;
        CalendarPeriod calendarPeriod6;
        CalendarPeriod calendarPeriod7;
        CalendarPeriod calendarPeriod8;
        CalendarPeriod calendarPeriod9;
        CALENDAR_PERIOD_UNSPECIFIED = calendarPeriod6 = new CalendarPeriod(0);
        DAY = calendarPeriod2 = new CalendarPeriod(1);
        WEEK = calendarPeriod4 = new CalendarPeriod(2);
        FORTNIGHT = calendarPeriod8 = new CalendarPeriod(3);
        MONTH = calendarPeriod3 = new CalendarPeriod(4);
        QUARTER = calendarPeriod7 = new CalendarPeriod(5);
        HALF = calendarPeriod5 = new CalendarPeriod(6);
        YEAR = calendarPeriod = new CalendarPeriod(7);
        UNRECOGNIZED = calendarPeriod9 = new CalendarPeriod(-1);
        $VALUES = new CalendarPeriod[]{calendarPeriod6, calendarPeriod2, calendarPeriod4, calendarPeriod8, calendarPeriod3, calendarPeriod7, calendarPeriod5, calendarPeriod, calendarPeriod9};
        internalValueMap = new Internal.EnumLiteMap<CalendarPeriod>(){

            public CalendarPeriod findValueByNumber(int n) {
                return CalendarPeriod.forNumber(n);
            }
        };
    }

    private CalendarPeriod(int n2) {
        this.value = n2;
    }

    public static CalendarPeriod forNumber(int n) {
        switch (n) {
            default: {
                return null;
            }
            case 7: {
                return YEAR;
            }
            case 6: {
                return HALF;
            }
            case 5: {
                return QUARTER;
            }
            case 4: {
                return MONTH;
            }
            case 3: {
                return FORTNIGHT;
            }
            case 2: {
                return WEEK;
            }
            case 1: {
                return DAY;
            }
            case 0: 
        }
        return CALENDAR_PERIOD_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<CalendarPeriod> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return CalendarPeriodVerifier.INSTANCE;
    }

    @Deprecated
    public static CalendarPeriod valueOf(int n) {
        return CalendarPeriod.forNumber(n);
    }

    public static CalendarPeriod valueOf(String string) {
        return (CalendarPeriod)Enum.valueOf(CalendarPeriod.class, (String)string);
    }

    public static CalendarPeriod[] values() {
        return (CalendarPeriod[])$VALUES.clone();
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    private static final class CalendarPeriodVerifier
    implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new CalendarPeriodVerifier();

        private CalendarPeriodVerifier() {
        }

        public boolean isInRange(int n) {
            return CalendarPeriod.forNumber(n) != null;
        }
    }

}

