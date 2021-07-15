/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package com.onesignal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2={"Lcom/onesignal/BackgroundRunnable;", "Ljava/lang/Runnable;", "()V", "run", "", "onesignal_release"}, k=1, mv={1, 1, 16})
public class BackgroundRunnable
implements Runnable {
    public void run() {
        Thread thread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull((Object)thread, (String)"Thread.currentThread()");
        thread.setPriority(10);
    }
}

