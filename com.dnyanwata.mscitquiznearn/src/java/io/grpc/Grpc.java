/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.annotation.Annotation
 *  java.lang.annotation.Documented
 *  java.lang.annotation.Retention
 *  java.lang.annotation.RetentionPolicy
 *  java.net.SocketAddress
 *  javax.net.ssl.SSLSession
 */
package io.grpc;

import io.grpc.Attributes;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.SocketAddress;
import javax.net.ssl.SSLSession;

public final class Grpc {
    public static final Attributes.Key<SocketAddress> TRANSPORT_ATTR_LOCAL_ADDR;
    public static final Attributes.Key<SocketAddress> TRANSPORT_ATTR_REMOTE_ADDR;
    public static final Attributes.Key<SSLSession> TRANSPORT_ATTR_SSL_SESSION;

    static {
        TRANSPORT_ATTR_REMOTE_ADDR = Attributes.Key.create("remote-addr");
        TRANSPORT_ATTR_LOCAL_ADDR = Attributes.Key.create("local-addr");
        TRANSPORT_ATTR_SSL_SESSION = Attributes.Key.create("ssl-session");
    }

    private Grpc() {
    }

    @Documented
    @Retention(value=RetentionPolicy.SOURCE)
    public static @interface TransportAttr {
    }

}

