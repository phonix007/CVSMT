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

class UserStateEmail
extends UserState {
    private static final String EMAIL = "email";

    UserStateEmail(String string2, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(EMAIL);
        stringBuilder.append(string2);
        super(stringBuilder.toString(), bl);
    }

    protected void addDependFields() {
    }

    boolean isSubscribed() {
        return true;
    }

    UserState newInstance(String string2) {
        return new UserStateEmail(string2, false);
    }
}

