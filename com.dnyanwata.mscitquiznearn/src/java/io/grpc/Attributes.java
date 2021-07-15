/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.base.Preconditions
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.IdentityHashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  javax.annotation.Nullable
 */
package io.grpc;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public final class Attributes {
    static final /* synthetic */ boolean $assertionsDisabled;
    public static final Attributes EMPTY = new Attributes(Collections.emptyMap());
    private final Map<Key<?>, Object> data;

    private Attributes(Map<Key<?>, Object> map) {
        this.data = map;
    }

    public static Builder newBuilder() {
        return new Builder(EMPTY);
    }

    @Deprecated
    public static Builder newBuilder(Attributes attributes) {
        Preconditions.checkNotNull((Object)attributes, (Object)"base");
        return new Builder(attributes);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (this.getClass() != object.getClass()) {
                return false;
            }
            Attributes attributes = (Attributes)object;
            if (this.data.size() != attributes.data.size()) {
                return false;
            }
            for (Map.Entry entry : this.data.entrySet()) {
                if (!attributes.data.containsKey(entry.getKey())) {
                    return false;
                }
                if (Objects.equal((Object)entry.getValue(), (Object)attributes.data.get(entry.getKey()))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @Nullable
    public <T> T get(Key<T> key) {
        return (T)this.data.get(key);
    }

    public int hashCode() {
        Iterator iterator = this.data.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Object[] arrobject = new Object[]{entry.getKey(), entry.getValue()};
            n += Objects.hashCode((Object[])arrobject);
        }
        return n;
    }

    @Deprecated
    public Set<Key<?>> keys() {
        return Collections.unmodifiableSet((Set)this.data.keySet());
    }

    Set<Key<?>> keysForTest() {
        return Collections.unmodifiableSet((Set)this.data.keySet());
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return this.data.toString();
    }

    public static final class Builder {
        static final /* synthetic */ boolean $assertionsDisabled;
        private Attributes base;
        private Map<Key<?>, Object> newdata;

        private Builder(Attributes attributes) {
            this.base = attributes;
        }

        private Map<Key<?>, Object> data(int n) {
            if (this.newdata == null) {
                this.newdata = new IdentityHashMap(n);
            }
            return this.newdata;
        }

        public Attributes build() {
            if (this.newdata != null) {
                for (Map.Entry entry : this.base.data.entrySet()) {
                    if (this.newdata.containsKey(entry.getKey())) continue;
                    this.newdata.put(entry.getKey(), entry.getValue());
                }
                this.base = new Attributes(this.newdata);
                this.newdata = null;
            }
            return this.base;
        }

        public <T> Builder discard(Key<T> key) {
            Map<Key<?>, Object> map;
            if (this.base.data.containsKey(key)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.base.data);
                identityHashMap.remove(key);
                this.base = new Attributes((Map)identityHashMap);
            }
            if ((map = this.newdata) != null) {
                map.remove(key);
            }
            return this;
        }

        public <T> Builder set(Key<T> key, T t) {
            this.data(1).put(key, t);
            return this;
        }

        public Builder setAll(Attributes attributes) {
            this.data(attributes.data.size()).putAll(attributes.data);
            return this;
        }
    }

    public static final class Key<T> {
        private final String debugString;

        private Key(String string2) {
            this.debugString = string2;
        }

        public static <T> Key<T> create(String string2) {
            return new Key<T>(string2);
        }

        @Deprecated
        public static <T> Key<T> of(String string2) {
            return new Key<T>(string2);
        }

        public String toString() {
            return this.debugString;
        }
    }

}

