/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  dalvik.annotation.SourceDebugExtension
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.text.StringsKt
 */
package com.onesignal.influence.domain;

import dalvik.annotation.SourceDebugExtension;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2={"Lcom/onesignal/influence/domain/OSInfluenceType;", "", "(Ljava/lang/String;I)V", "isAttributed", "", "isDirect", "isDisabled", "isIndirect", "isUnattributed", "DIRECT", "INDIRECT", "UNATTRIBUTED", "DISABLED", "Companion", "onesignal_release"}, k=1, mv={1, 1, 16})
public final class OSInfluenceType
extends Enum<OSInfluenceType> {
    private static final /* synthetic */ OSInfluenceType[] $VALUES;
    public static final Companion Companion;
    public static final /* enum */ OSInfluenceType DIRECT;
    public static final /* enum */ OSInfluenceType DISABLED;
    public static final /* enum */ OSInfluenceType INDIRECT;
    public static final /* enum */ OSInfluenceType UNATTRIBUTED;

    static {
        OSInfluenceType oSInfluenceType;
        OSInfluenceType oSInfluenceType2;
        OSInfluenceType oSInfluenceType3;
        OSInfluenceType oSInfluenceType4;
        OSInfluenceType[] arroSInfluenceType = new OSInfluenceType[4];
        DIRECT = oSInfluenceType2 = new OSInfluenceType();
        arroSInfluenceType[0] = oSInfluenceType2;
        INDIRECT = oSInfluenceType4 = new OSInfluenceType();
        arroSInfluenceType[1] = oSInfluenceType4;
        UNATTRIBUTED = oSInfluenceType3 = new OSInfluenceType();
        arroSInfluenceType[2] = oSInfluenceType3;
        DISABLED = oSInfluenceType = new OSInfluenceType();
        arroSInfluenceType[3] = oSInfluenceType;
        $VALUES = arroSInfluenceType;
        Companion = new Companion(null);
    }

    @JvmStatic
    public static final OSInfluenceType fromString(String string2) {
        return Companion.fromString(string2);
    }

    public static OSInfluenceType valueOf(String string2) {
        return (OSInfluenceType)Enum.valueOf(OSInfluenceType.class, (String)string2);
    }

    public static OSInfluenceType[] values() {
        return (OSInfluenceType[])$VALUES.clone();
    }

    public final boolean isAttributed() {
        return this.isDirect() || this.isIndirect();
        {
        }
    }

    public final boolean isDirect() {
        return this == DIRECT;
    }

    public final boolean isDisabled() {
        return this == DISABLED;
    }

    public final boolean isIndirect() {
        return this == INDIRECT;
    }

    public final boolean isUnattributed() {
        return this == UNATTRIBUTED;
    }

    @SourceDebugExtension(value="SMAP\nOSInfluenceType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OSInfluenceType.kt\ncom/onesignal/influence/domain/OSInfluenceType$Companion\n*L\n1#1,26:1\n*E\n")
    @Metadata(bv={1, 0, 3}, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2={"Lcom/onesignal/influence/domain/OSInfluenceType$Companion;", "", "()V", "fromString", "Lcom/onesignal/influence/domain/OSInfluenceType;", "value", "", "onesignal_release"}, k=1, mv={1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final OSInfluenceType fromString(String string2) {
            if (string2 != null) {
                OSInfluenceType oSInfluenceType;
                block3 : {
                    OSInfluenceType[] arroSInfluenceType = OSInfluenceType.values();
                    int n = arroSInfluenceType.length;
                    while (--n >= 0) {
                        oSInfluenceType = arroSInfluenceType[n];
                        if (!StringsKt.equals((String)oSInfluenceType.name(), (String)string2, (boolean)true)) continue;
                        break block3;
                    }
                    oSInfluenceType = null;
                }
                if (oSInfluenceType != null) {
                    return oSInfluenceType;
                }
            }
            return OSInfluenceType.UNATTRIBUTED;
        }
    }

}

