/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.UserState
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import com.onesignal.UserState;

class UserStateSMS
extends UserState {
    private static final String SMS = "sms";

    UserStateSMS(String string2, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(SMS);
        stringBuilder.append(string2);
        super(stringBuilder.toString(), bl);
    }

    protected void addDependFields() {
    }

    boolean isSubscribed() {
        return true;
    }

    UserState newInstance(String string2) {
        return new UserStateSMS(string2, false);
    }
}

