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

public final class ChangeType
extends Enum<ChangeType>
implements Internal.EnumLite {
    private static final /* synthetic */ ChangeType[] $VALUES;
    public static final /* enum */ ChangeType ADDED;
    public static final int ADDED_VALUE = 1;
    public static final /* enum */ ChangeType CHANGE_TYPE_UNSPECIFIED;
    public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final /* enum */ ChangeType MODIFIED;
    public static final int MODIFIED_VALUE = 3;
    public static final /* enum */ ChangeType REMOVED;
    public static final int REMOVED_VALUE = 2;
    public static final /* enum */ ChangeType UNRECOGNIZED;
    private static final Internal.EnumLiteMap<ChangeType> internalValueMap;
    private final int value;

    static {
        ChangeType changeType;
        ChangeType changeType2;
        ChangeType changeType3;
        ChangeType changeType4;
        ChangeType changeType5;
        CHANGE_TYPE_UNSPECIFIED = changeType4 = new ChangeType(0);
        ADDED = changeType3 = new ChangeType(1);
        REMOVED = changeType = new ChangeType(2);
        MODIFIED = changeType5 = new ChangeType(3);
        UNRECOGNIZED = changeType2 = new ChangeType(-1);
        $VALUES = new ChangeType[]{changeType4, changeType3, changeType, changeType5, changeType2};
        internalValueMap = new Internal.EnumLiteMap<ChangeType>(){

            public ChangeType findValueByNumber(int n) {
                return ChangeType.forNumber(n);
            }
        };
    }

    private ChangeType(int n2) {
        this.value = n2;
    }

    public static ChangeType forNumber(int n) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        return null;
                    }
                    return MODIFIED;
                }
                return REMOVED;
            }
            return ADDED;
        }
        return CHANGE_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<ChangeType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ChangeTypeVerifier.INSTANCE;
    }

    @Deprecated
    public static ChangeType valueOf(int n) {
        return ChangeType.forNumber(n);
    }

    public static ChangeType valueOf(String string2) {
        return (ChangeType)Enum.valueOf(ChangeType.class, (String)string2);
    }

    public static ChangeType[] values() {
        return (ChangeType[])$VALUES.clone();
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    private static final class ChangeTypeVerifier
    implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ChangeTypeVerifier();

        private ChangeTypeVerifier() {
        }

        public boolean isInRange(int n) {
            return ChangeType.forNumber(n) != null;
        }
    }

}

