/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  io.grpc.Status
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.ConnectivityState;
import io.grpc.Status;

public final class ConnectivityStateInfo {
    private final ConnectivityState state;
    private final Status status;

    private ConnectivityStateInfo(ConnectivityState connectivityState, Status status) {
        this.state = (ConnectivityState)((Object)Preconditions.checkNotNull((Object)((Object)connectivityState), (Object)"state is null"));
        this.status = (Status)Preconditions.checkNotNull((Object)status, (Object)"status is null");
    }

    public static ConnectivityStateInfo forNonError(ConnectivityState connectivityState) {
        boolean bl = connectivityState != ConnectivityState.TRANSIENT_FAILURE;
        Preconditions.checkArgument((boolean)bl, (Object)"state is TRANSIENT_ERROR. Use forError() instead");
        return new ConnectivityStateInfo(connectivityState, Status.OK);
    }

    public static ConnectivityStateInfo forTransientFailure(Status status) {
        Preconditions.checkArgument((boolean)(true ^ status.isOk()), (Object)"The error status must not be OK");
        return new ConnectivityStateInfo(ConnectivityState.TRANSIENT_FAILURE, status);
    }

    public boolean equals(Object object) {
        if (!(object instanceof ConnectivityStateInfo)) {
            return false;
        }
        ConnectivityStateInfo connectivityStateInfo = (ConnectivityStateInfo)object;
        boolean bl = this.state.equals((Object)connectivityStateInfo.state);
        boolean bl2 = false;
        if (bl) {
            boolean bl3 = this.status.equals((Object)connectivityStateInfo.status);
            bl2 = false;
            if (bl3) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public ConnectivityState getState() {
        return this.state;
    }

    public Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.state.hashCode() ^ this.status.hashCode();
    }

    public String toString() {
        if (this.status.isOk()) {
            return this.state.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.state);
        stringBuilder.append("(");
        stringBuilder.append((Object)this.status);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

