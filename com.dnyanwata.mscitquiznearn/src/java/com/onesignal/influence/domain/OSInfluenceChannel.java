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
 *  kotlin.jvm.internal.Intrinsics
 */
package com.onesignal.influence.domain;

import dalvik.annotation.SourceDebugExtension;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\n\u00a8\u0006\f"}, d2={"Lcom/onesignal/influence/domain/OSInfluenceChannel;", "", "nameValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "equalsName", "", "otherName", "toString", "IAM", "NOTIFICATION", "Companion", "onesignal_release"}, k=1, mv={1, 1, 16})
public final class OSInfluenceChannel
extends Enum<OSInfluenceChannel> {
    private static final /* synthetic */ OSInfluenceChannel[] $VALUES;
    public static final Companion Companion;
    public static final /* enum */ OSInfluenceChannel IAM;
    public static final /* enum */ OSInfluenceChannel NOTIFICATION;
    private final String nameValue;

    static {
        OSInfluenceChannel oSInfluenceChannel;
        OSInfluenceChannel oSInfluenceChannel2;
        OSInfluenceChannel[] arroSInfluenceChannel = new OSInfluenceChannel[2];
        IAM = oSInfluenceChannel = new OSInfluenceChannel("iam");
        arroSInfluenceChannel[0] = oSInfluenceChannel;
        NOTIFICATION = oSInfluenceChannel2 = new OSInfluenceChannel("notification");
        arroSInfluenceChannel[1] = oSInfluenceChannel2;
        $VALUES = arroSInfluenceChannel;
        Companion = new Companion(null);
    }

    private OSInfluenceChannel(String string3) {
        this.nameValue = string3;
    }

    @JvmStatic
    public static final OSInfluenceChannel fromString(String string2) {
        return Companion.fromString(string2);
    }

    public static OSInfluenceChannel valueOf(String string2) {
        return (OSInfluenceChannel)Enum.valueOf(OSInfluenceChannel.class, (String)string2);
    }

    public static OSInfluenceChannel[] values() {
        return (OSInfluenceChannel[])$VALUES.clone();
    }

    public final boolean equalsName(String string2) {
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"otherName");
        return Intrinsics.areEqual((Object)this.nameValue, (Object)string2);
    }

    public String toString() {
        return this.nameValue;
    }

    @SourceDebugExtension(value="SMAP\nOSInfluenceChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OSInfluenceChannel.kt\ncom/onesignal/influence/domain/OSInfluenceChannel$Companion\n*L\n1#1,18:1\n*E\n")
    @Metadata(bv={1, 0, 3}, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2={"Lcom/onesignal/influence/domain/OSInfluenceChannel$Companion;", "", "()V", "fromString", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "value", "", "onesignal_release"}, k=1, mv={1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final OSInfluenceChannel fromString(String string2) {
            if (string2 != null) {
                OSInfluenceChannel oSInfluenceChannel;
                block3 : {
                    OSInfluenceChannel[] arroSInfluenceChannel = OSInfluenceChannel.values();
                    int n = arroSInfluenceChannel.length;
                    while (--n >= 0) {
                        oSInfluenceChannel = arroSInfluenceChannel[n];
                        if (!oSInfluenceChannel.equalsName(string2)) continue;
                        break block3;
                    }
                    oSInfluenceChannel = null;
                }
                if (oSInfluenceChannel != null) {
                    return oSInfluenceChannel;
                }
            }
            return OSInfluenceChannel.NOTIFICATION;
        }
    }

}

