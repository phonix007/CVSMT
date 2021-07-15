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

public final class FieldBehavior
extends Enum<FieldBehavior>
implements Internal.EnumLite {
    private static final /* synthetic */ FieldBehavior[] $VALUES;
    public static final /* enum */ FieldBehavior FIELD_BEHAVIOR_UNSPECIFIED;
    public static final int FIELD_BEHAVIOR_UNSPECIFIED_VALUE = 0;
    public static final /* enum */ FieldBehavior IMMUTABLE;
    public static final int IMMUTABLE_VALUE = 5;
    public static final /* enum */ FieldBehavior INPUT_ONLY;
    public static final int INPUT_ONLY_VALUE = 4;
    public static final /* enum */ FieldBehavior OPTIONAL;
    public static final int OPTIONAL_VALUE = 1;
    public static final /* enum */ FieldBehavior OUTPUT_ONLY;
    public static final int OUTPUT_ONLY_VALUE = 3;
    public static final /* enum */ FieldBehavior REQUIRED;
    public static final int REQUIRED_VALUE = 2;
    public static final /* enum */ FieldBehavior UNRECOGNIZED;
    private static final Internal.EnumLiteMap<FieldBehavior> internalValueMap;
    private final int value;

    static {
        FieldBehavior fieldBehavior;
        FieldBehavior fieldBehavior2;
        FieldBehavior fieldBehavior3;
        FieldBehavior fieldBehavior4;
        FieldBehavior fieldBehavior5;
        FieldBehavior fieldBehavior6;
        FieldBehavior fieldBehavior7;
        FIELD_BEHAVIOR_UNSPECIFIED = fieldBehavior5 = new FieldBehavior(0);
        OPTIONAL = fieldBehavior7 = new FieldBehavior(1);
        REQUIRED = fieldBehavior3 = new FieldBehavior(2);
        OUTPUT_ONLY = fieldBehavior = new FieldBehavior(3);
        INPUT_ONLY = fieldBehavior4 = new FieldBehavior(4);
        IMMUTABLE = fieldBehavior2 = new FieldBehavior(5);
        UNRECOGNIZED = fieldBehavior6 = new FieldBehavior(-1);
        $VALUES = new FieldBehavior[]{fieldBehavior5, fieldBehavior7, fieldBehavior3, fieldBehavior, fieldBehavior4, fieldBehavior2, fieldBehavior6};
        internalValueMap = new Internal.EnumLiteMap<FieldBehavior>(){

            public FieldBehavior findValueByNumber(int n) {
                return FieldBehavior.forNumber(n);
            }
        };
    }

    private FieldBehavior(int n2) {
        this.value = n2;
    }

    public static FieldBehavior forNumber(int n) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 5) {
                                return null;
                            }
                            return IMMUTABLE;
                        }
                        return INPUT_ONLY;
                    }
                    return OUTPUT_ONLY;
                }
                return REQUIRED;
            }
            return OPTIONAL;
        }
        return FIELD_BEHAVIOR_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<FieldBehavior> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return FieldBehaviorVerifier.INSTANCE;
    }

    @Deprecated
    public static FieldBehavior valueOf(int n) {
        return FieldBehavior.forNumber(n);
    }

    public static FieldBehavior valueOf(String string2) {
        return (FieldBehavior)Enum.valueOf(FieldBehavior.class, (String)string2);
    }

    public static FieldBehavior[] values() {
        return (FieldBehavior[])$VALUES.clone();
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    private static final class FieldBehaviorVerifier
    implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new FieldBehaviorVerifier();

        private FieldBehaviorVerifier() {
        }

        public boolean isInRange(int n) {
            return FieldBehavior.forNumber(n) != null;
        }
    }

}

