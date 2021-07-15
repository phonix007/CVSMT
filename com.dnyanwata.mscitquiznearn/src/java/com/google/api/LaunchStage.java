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
package com.google.api;

import com.google.protobuf.Internal;

public final class LaunchStage
extends Enum<LaunchStage>
implements Internal.EnumLite {
    private static final /* synthetic */ LaunchStage[] $VALUES;
    public static final /* enum */ LaunchStage ALPHA;
    public static final int ALPHA_VALUE = 2;
    public static final /* enum */ LaunchStage BETA;
    public static final int BETA_VALUE = 3;
    public static final /* enum */ LaunchStage DEPRECATED;
    public static final int DEPRECATED_VALUE = 5;
    public static final /* enum */ LaunchStage EARLY_ACCESS;
    public static final int EARLY_ACCESS_VALUE = 1;
    public static final /* enum */ LaunchStage GA;
    public static final int GA_VALUE = 4;
    public static final /* enum */ LaunchStage LAUNCH_STAGE_UNSPECIFIED;
    public static final int LAUNCH_STAGE_UNSPECIFIED_VALUE;
    public static final /* enum */ LaunchStage UNRECOGNIZED;
    private static final Internal.EnumLiteMap<LaunchStage> internalValueMap;
    private final int value;

    static {
        LaunchStage launchStage;
        LaunchStage launchStage2;
        LaunchStage launchStage3;
        LaunchStage launchStage4;
        LaunchStage launchStage5;
        LaunchStage launchStage6;
        LaunchStage launchStage7;
        LAUNCH_STAGE_UNSPECIFIED = launchStage3 = new LaunchStage(0);
        EARLY_ACCESS = launchStage6 = new LaunchStage(1);
        ALPHA = launchStage4 = new LaunchStage(2);
        BETA = launchStage = new LaunchStage(3);
        GA = launchStage7 = new LaunchStage(4);
        DEPRECATED = launchStage2 = new LaunchStage(5);
        UNRECOGNIZED = launchStage5 = new LaunchStage(-1);
        $VALUES = new LaunchStage[]{launchStage3, launchStage6, launchStage4, launchStage, launchStage7, launchStage2, launchStage5};
        internalValueMap = new Internal.EnumLiteMap<LaunchStage>(){

            public LaunchStage findValueByNumber(int n) {
                return LaunchStage.forNumber(n);
            }
        };
    }

    private LaunchStage(int n2) {
        this.value = n2;
    }

    public static LaunchStage forNumber(int n) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 5) {
                                return null;
                            }
                            return DEPRECATED;
                        }
                        return GA;
                    }
                    return BETA;
                }
                return ALPHA;
            }
            return EARLY_ACCESS;
        }
        return LAUNCH_STAGE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<LaunchStage> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return LaunchStageVerifier.INSTANCE;
    }

    @Deprecated
    public static LaunchStage valueOf(int n) {
        return LaunchStage.forNumber(n);
    }

    public static LaunchStage valueOf(String string2) {
        return (LaunchStage)Enum.valueOf(LaunchStage.class, (String)string2);
    }

    public static LaunchStage[] values() {
        return (LaunchStage[])$VALUES.clone();
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    private static final class LaunchStageVerifier
    implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new LaunchStageVerifier();

        private LaunchStageVerifier() {
        }

        public boolean isInRange(int n) {
            return LaunchStage.forNumber(n) != null;
        }
    }

}

