/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package com.onesignal;

class OSThrowable {
    OSThrowable() {
    }

    static class OSMainThreadException
    extends RuntimeException {
        public OSMainThreadException(String string2) {
            super(string2);
        }
    }

}

