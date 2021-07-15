/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package io.grpc;

public final class ConnectivityState
extends Enum<ConnectivityState> {
    private static final /* synthetic */ ConnectivityState[] $VALUES;
    public static final /* enum */ ConnectivityState CONNECTING;
    public static final /* enum */ ConnectivityState IDLE;
    public static final /* enum */ ConnectivityState READY;
    public static final /* enum */ ConnectivityState SHUTDOWN;
    public static final /* enum */ ConnectivityState TRANSIENT_FAILURE;

    static {
        ConnectivityState connectivityState;
        ConnectivityState connectivityState2;
        ConnectivityState connectivityState3;
        ConnectivityState connectivityState4;
        ConnectivityState connectivityState5;
        CONNECTING = connectivityState2 = new ConnectivityState();
        READY = connectivityState5 = new ConnectivityState();
        TRANSIENT_FAILURE = connectivityState = new ConnectivityState();
        IDLE = connectivityState3 = new ConnectivityState();
        SHUTDOWN = connectivityState4 = new ConnectivityState();
        $VALUES = new ConnectivityState[]{connectivityState2, connectivityState5, connectivityState, connectivityState3, connectivityState4};
    }

    public static ConnectivityState valueOf(String string2) {
        return (ConnectivityState)Enum.valueOf(ConnectivityState.class, (String)string2);
    }

    public static ConnectivityState[] values() {
        return (ConnectivityState[])$VALUES.clone();
    }
}

