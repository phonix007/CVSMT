/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.grpc.Context
 *  io.grpc.Context$Storage
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package io.grpc;

import io.grpc.Context;
import java.util.logging.Level;
import java.util.logging.Logger;

final class ThreadLocalContextStorage
extends Context.Storage {
    static final ThreadLocal<Context> localContext;
    private static final Logger log;

    static {
        log = Logger.getLogger((String)ThreadLocalContextStorage.class.getName());
        localContext = new ThreadLocal();
    }

    ThreadLocalContextStorage() {
    }

    public Context current() {
        Context context = (Context)localContext.get();
        if (context == null) {
            context = Context.ROOT;
        }
        return context;
    }

    public void detach(Context context, Context context2) {
        if (this.current() != context) {
            log.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (context2 != Context.ROOT) {
            localContext.set((Object)context2);
            return;
        }
        localContext.set(null);
    }

    public Context doAttach(Context context) {
        Context context2 = this.current();
        localContext.set((Object)context);
        return context2;
    }
}

