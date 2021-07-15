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
package com.google.logging.type;

import com.google.protobuf.Internal;

public final class LogSeverity
extends Enum<LogSeverity>
implements Internal.EnumLite {
    private static final /* synthetic */ LogSeverity[] $VALUES;
    public static final /* enum */ LogSeverity ALERT;
    public static final int ALERT_VALUE = 700;
    public static final /* enum */ LogSeverity CRITICAL;
    public static final int CRITICAL_VALUE = 600;
    public static final /* enum */ LogSeverity DEBUG;
    public static final int DEBUG_VALUE = 100;
    public static final /* enum */ LogSeverity DEFAULT;
    public static final int DEFAULT_VALUE = 0;
    public static final /* enum */ LogSeverity EMERGENCY;
    public static final int EMERGENCY_VALUE = 800;
    public static final /* enum */ LogSeverity ERROR;
    public static final int ERROR_VALUE = 500;
    public static final /* enum */ LogSeverity INFO;
    public static final int INFO_VALUE = 200;
    public static final /* enum */ LogSeverity NOTICE;
    public static final int NOTICE_VALUE = 300;
    public static final /* enum */ LogSeverity UNRECOGNIZED;
    public static final /* enum */ LogSeverity WARNING;
    public static final int WARNING_VALUE = 400;
    private static final Internal.EnumLiteMap<LogSeverity> internalValueMap;
    private final int value;

    static {
        LogSeverity logSeverity;
        LogSeverity logSeverity2;
        LogSeverity logSeverity3;
        LogSeverity logSeverity4;
        LogSeverity logSeverity5;
        LogSeverity logSeverity6;
        LogSeverity logSeverity7;
        LogSeverity logSeverity8;
        LogSeverity logSeverity9;
        LogSeverity logSeverity10;
        DEFAULT = logSeverity2 = new LogSeverity(0);
        DEBUG = logSeverity3 = new LogSeverity(100);
        INFO = logSeverity4 = new LogSeverity(200);
        NOTICE = logSeverity6 = new LogSeverity(300);
        WARNING = logSeverity8 = new LogSeverity(400);
        ERROR = logSeverity = new LogSeverity(500);
        CRITICAL = logSeverity9 = new LogSeverity(600);
        ALERT = logSeverity7 = new LogSeverity(700);
        EMERGENCY = logSeverity5 = new LogSeverity(800);
        UNRECOGNIZED = logSeverity10 = new LogSeverity(-1);
        $VALUES = new LogSeverity[]{logSeverity2, logSeverity3, logSeverity4, logSeverity6, logSeverity8, logSeverity, logSeverity9, logSeverity7, logSeverity5, logSeverity10};
        internalValueMap = new Internal.EnumLiteMap<LogSeverity>(){

            public LogSeverity findValueByNumber(int n) {
                return LogSeverity.forNumber(n);
            }
        };
    }

    private LogSeverity(int n2) {
        this.value = n2;
    }

    public static LogSeverity forNumber(int n) {
        if (n != 0) {
            if (n != 100) {
                if (n != 200) {
                    if (n != 300) {
                        if (n != 400) {
                            if (n != 500) {
                                if (n != 600) {
                                    if (n != 700) {
                                        if (n != 800) {
                                            return null;
                                        }
                                        return EMERGENCY;
                                    }
                                    return ALERT;
                                }
                                return CRITICAL;
                            }
                            return ERROR;
                        }
                        return WARNING;
                    }
                    return NOTICE;
                }
                return INFO;
            }
            return DEBUG;
        }
        return DEFAULT;
    }

    public static Internal.EnumLiteMap<LogSeverity> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return LogSeverityVerifier.INSTANCE;
    }

    @Deprecated
    public static LogSeverity valueOf(int n) {
        return LogSeverity.forNumber(n);
    }

    public static LogSeverity valueOf(String string) {
        return (LogSeverity)Enum.valueOf(LogSeverity.class, (String)string);
    }

    public static LogSeverity[] values() {
        return (LogSeverity[])$VALUES.clone();
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    private static final class LogSeverityVerifier
    implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new LogSeverityVerifier();

        private LogSeverityVerifier() {
        }

        public boolean isInRange(int n) {
            return LogSeverity.forNumber(n) != null;
        }
    }

}

