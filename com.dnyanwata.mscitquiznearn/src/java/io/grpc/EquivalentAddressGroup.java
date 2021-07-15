/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 *  java.lang.annotation.Documented
 *  java.lang.annotation.Retention
 *  java.lang.annotation.RetentionPolicy
 *  java.net.SocketAddress
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.Attributes;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class EquivalentAddressGroup {
    public static final Attributes.Key<String> ATTR_AUTHORITY_OVERRIDE = Attributes.Key.create("io.grpc.EquivalentAddressGroup.authorityOverride");
    private final List<SocketAddress> addrs;
    private final Attributes attrs;
    private final int hashCode;

    public EquivalentAddressGroup(SocketAddress socketAddress) {
        this(socketAddress, Attributes.EMPTY);
    }

    public EquivalentAddressGroup(SocketAddress socketAddress, Attributes attributes) {
        this((List<SocketAddress>)Collections.singletonList((Object)socketAddress), attributes);
    }

    public EquivalentAddressGroup(List<SocketAddress> list) {
        this(list, Attributes.EMPTY);
    }

    public EquivalentAddressGroup(List<SocketAddress> list, Attributes attributes) {
        List list2;
        Preconditions.checkArgument((boolean)(true ^ list.isEmpty()), (Object)"addrs is empty");
        this.addrs = list2 = Collections.unmodifiableList((List)new ArrayList(list));
        this.attrs = (Attributes)Preconditions.checkNotNull((Object)attributes, (Object)"attrs");
        this.hashCode = list2.hashCode();
    }

    public boolean equals(Object object) {
        if (!(object instanceof EquivalentAddressGroup)) {
            return false;
        }
        EquivalentAddressGroup equivalentAddressGroup = (EquivalentAddressGroup)object;
        if (this.addrs.size() != equivalentAddressGroup.addrs.size()) {
            return false;
        }
        for (int i = 0; i < this.addrs.size(); ++i) {
            if (((SocketAddress)this.addrs.get(i)).equals(equivalentAddressGroup.addrs.get(i))) continue;
            return false;
        }
        return this.attrs.equals(equivalentAddressGroup.attrs);
    }

    public List<SocketAddress> getAddresses() {
        return this.addrs;
    }

    public Attributes getAttributes() {
        return this.attrs;
    }

    public int hashCode() {
        return this.hashCode;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(this.addrs);
        stringBuilder.append("/");
        stringBuilder.append((Object)this.attrs);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Documented
    @Retention(value=RetentionPolicy.SOURCE)
    public static @interface Attr {
    }

}

