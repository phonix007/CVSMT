/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.Int32Value
 *  com.google.protobuf.Int32Value$Builder
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$EnumLite
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.Internal$EnumVerifier
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Cursor;
import com.google.firestore.v1.StructuredQuery;
import com.google.firestore.v1.StructuredQueryOrBuilder;
import com.google.firestore.v1.Value;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class StructuredQuery
extends GeneratedMessageLite<StructuredQuery, Builder>
implements StructuredQueryOrBuilder {
    private static final StructuredQuery DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile Parser<StructuredQuery> PARSER;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private Cursor endAt_;
    private Internal.ProtobufList<CollectionSelector> from_ = StructuredQuery.emptyProtobufList();
    private Int32Value limit_;
    private int offset_;
    private Internal.ProtobufList<Order> orderBy_ = StructuredQuery.emptyProtobufList();
    private Projection select_;
    private Cursor startAt_;
    private Filter where_;

    static {
        StructuredQuery structuredQuery;
        DEFAULT_INSTANCE = structuredQuery = new StructuredQuery();
        GeneratedMessageLite.registerDefaultInstance(StructuredQuery.class, (GeneratedMessageLite)structuredQuery);
    }

    private StructuredQuery() {
    }

    private void addAllFrom(Iterable<? extends CollectionSelector> iterable) {
        this.ensureFromIsMutable();
        AbstractMessageLite.addAll(iterable, this.from_);
    }

    private void addAllOrderBy(Iterable<? extends Order> iterable) {
        this.ensureOrderByIsMutable();
        AbstractMessageLite.addAll(iterable, this.orderBy_);
    }

    private void addFrom(int n, CollectionSelector collectionSelector) {
        collectionSelector.getClass();
        this.ensureFromIsMutable();
        this.from_.add(n, (Object)collectionSelector);
    }

    private void addFrom(CollectionSelector collectionSelector) {
        collectionSelector.getClass();
        this.ensureFromIsMutable();
        this.from_.add((Object)collectionSelector);
    }

    private void addOrderBy(int n, Order order) {
        order.getClass();
        this.ensureOrderByIsMutable();
        this.orderBy_.add(n, (Object)order);
    }

    private void addOrderBy(Order order) {
        order.getClass();
        this.ensureOrderByIsMutable();
        this.orderBy_.add((Object)order);
    }

    private void clearEndAt() {
        this.endAt_ = null;
    }

    private void clearFrom() {
        this.from_ = StructuredQuery.emptyProtobufList();
    }

    private void clearLimit() {
        this.limit_ = null;
    }

    private void clearOffset() {
        this.offset_ = 0;
    }

    private void clearOrderBy() {
        this.orderBy_ = StructuredQuery.emptyProtobufList();
    }

    private void clearSelect() {
        this.select_ = null;
    }

    private void clearStartAt() {
        this.startAt_ = null;
    }

    private void clearWhere() {
        this.where_ = null;
    }

    private void ensureFromIsMutable() {
        Internal.ProtobufList<CollectionSelector> protobufList = this.from_;
        if (!protobufList.isModifiable()) {
            this.from_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureOrderByIsMutable() {
        Internal.ProtobufList<Order> protobufList = this.orderBy_;
        if (!protobufList.isModifiable()) {
            this.orderBy_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static StructuredQuery getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeEndAt(Cursor cursor) {
        cursor.getClass();
        Cursor cursor2 = this.endAt_;
        if (cursor2 != null && cursor2 != Cursor.getDefaultInstance()) {
            this.endAt_ = (Cursor)((Cursor.Builder)Cursor.newBuilder(this.endAt_).mergeFrom((GeneratedMessageLite)cursor)).buildPartial();
            return;
        }
        this.endAt_ = cursor;
    }

    private void mergeLimit(Int32Value int32Value) {
        int32Value.getClass();
        Int32Value int32Value2 = this.limit_;
        if (int32Value2 != null && int32Value2 != Int32Value.getDefaultInstance()) {
            this.limit_ = (Int32Value)((Int32Value.Builder)Int32Value.newBuilder((Int32Value)this.limit_).mergeFrom((GeneratedMessageLite)int32Value)).buildPartial();
            return;
        }
        this.limit_ = int32Value;
    }

    private void mergeSelect(Projection projection) {
        projection.getClass();
        Projection projection2 = this.select_;
        if (projection2 != null && projection2 != Projection.getDefaultInstance()) {
            this.select_ = (Projection)((Projection.Builder)Projection.newBuilder(this.select_).mergeFrom((GeneratedMessageLite)projection)).buildPartial();
            return;
        }
        this.select_ = projection;
    }

    private void mergeStartAt(Cursor cursor) {
        cursor.getClass();
        Cursor cursor2 = this.startAt_;
        if (cursor2 != null && cursor2 != Cursor.getDefaultInstance()) {
            this.startAt_ = (Cursor)((Cursor.Builder)Cursor.newBuilder(this.startAt_).mergeFrom((GeneratedMessageLite)cursor)).buildPartial();
            return;
        }
        this.startAt_ = cursor;
    }

    private void mergeWhere(Filter filter) {
        filter.getClass();
        Filter filter2 = this.where_;
        if (filter2 != null && filter2 != Filter.getDefaultInstance()) {
            this.where_ = (Filter)((Filter.Builder)Filter.newBuilder(this.where_).mergeFrom((GeneratedMessageLite)filter)).buildPartial();
            return;
        }
        this.where_ = filter;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(StructuredQuery structuredQuery) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)structuredQuery);
    }

    public static StructuredQuery parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StructuredQuery)StructuredQuery.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static StructuredQuery parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StructuredQuery)StructuredQuery.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static StructuredQuery parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static StructuredQuery parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static StructuredQuery parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static StructuredQuery parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static StructuredQuery parseFrom(InputStream inputStream) throws IOException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static StructuredQuery parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static StructuredQuery parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static StructuredQuery parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static StructuredQuery parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static StructuredQuery parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<StructuredQuery> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFrom(int n) {
        this.ensureFromIsMutable();
        this.from_.remove(n);
    }

    private void removeOrderBy(int n) {
        this.ensureOrderByIsMutable();
        this.orderBy_.remove(n);
    }

    private void setEndAt(Cursor cursor) {
        cursor.getClass();
        this.endAt_ = cursor;
    }

    private void setFrom(int n, CollectionSelector collectionSelector) {
        collectionSelector.getClass();
        this.ensureFromIsMutable();
        this.from_.set(n, (Object)collectionSelector);
    }

    private void setLimit(Int32Value int32Value) {
        int32Value.getClass();
        this.limit_ = int32Value;
    }

    private void setOffset(int n) {
        this.offset_ = n;
    }

    private void setOrderBy(int n, Order order) {
        order.getClass();
        this.ensureOrderByIsMutable();
        this.orderBy_.set(n, (Object)order);
    }

    private void setSelect(Projection projection) {
        projection.getClass();
        this.select_ = projection;
    }

    private void setStartAt(Cursor cursor) {
        cursor.getClass();
        this.startAt_ = cursor;
    }

    private void setWhere(Filter filter) {
        filter.getClass();
        this.where_ = filter;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
        switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                return null;
            }
            case 6: {
                return (byte)1;
            }
            case 5: {
                Parser<StructuredQuery> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<StructuredQuery> class_ = StructuredQuery.class;
                synchronized (StructuredQuery.class) {
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                    }
                    // ** MonitorExit[var8_5] (shouldn't be in output)
                    return defaultInstanceBasedParser;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                Object[] arrobject = new Object[]{"select_", "from_", CollectionSelector.class, "where_", "orderBy_", Order.class, "limit_", "offset_", "startAt_", "endAt_"};
                return StructuredQuery.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\t\u0004\u001b\u0005\t\u0006\u0004\u0007\t\b\t", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new StructuredQuery();
    }

    @Override
    public Cursor getEndAt() {
        Cursor cursor = this.endAt_;
        if (cursor == null) {
            cursor = Cursor.getDefaultInstance();
        }
        return cursor;
    }

    @Override
    public CollectionSelector getFrom(int n) {
        return (CollectionSelector)this.from_.get(n);
    }

    @Override
    public int getFromCount() {
        return this.from_.size();
    }

    @Override
    public List<CollectionSelector> getFromList() {
        return this.from_;
    }

    public CollectionSelectorOrBuilder getFromOrBuilder(int n) {
        return this.from_.get(n);
    }

    public List<? extends CollectionSelectorOrBuilder> getFromOrBuilderList() {
        return this.from_;
    }

    @Override
    public Int32Value getLimit() {
        Int32Value int32Value = this.limit_;
        if (int32Value == null) {
            int32Value = Int32Value.getDefaultInstance();
        }
        return int32Value;
    }

    @Override
    public int getOffset() {
        return this.offset_;
    }

    @Override
    public Order getOrderBy(int n) {
        return (Order)this.orderBy_.get(n);
    }

    @Override
    public int getOrderByCount() {
        return this.orderBy_.size();
    }

    @Override
    public List<Order> getOrderByList() {
        return this.orderBy_;
    }

    public OrderOrBuilder getOrderByOrBuilder(int n) {
        return this.orderBy_.get(n);
    }

    public List<? extends OrderOrBuilder> getOrderByOrBuilderList() {
        return this.orderBy_;
    }

    @Override
    public Projection getSelect() {
        Projection projection = this.select_;
        if (projection == null) {
            projection = Projection.getDefaultInstance();
        }
        return projection;
    }

    @Override
    public Cursor getStartAt() {
        Cursor cursor = this.startAt_;
        if (cursor == null) {
            cursor = Cursor.getDefaultInstance();
        }
        return cursor;
    }

    @Override
    public Filter getWhere() {
        Filter filter = this.where_;
        if (filter == null) {
            filter = Filter.getDefaultInstance();
        }
        return filter;
    }

    @Override
    public boolean hasEndAt() {
        return this.endAt_ != null;
    }

    @Override
    public boolean hasLimit() {
        return this.limit_ != null;
    }

    @Override
    public boolean hasSelect() {
        return this.select_ != null;
    }

    @Override
    public boolean hasStartAt() {
        return this.startAt_ != null;
    }

    @Override
    public boolean hasWhere() {
        return this.where_ != null;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<StructuredQuery, Builder>
    implements StructuredQueryOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllFrom(Iterable<? extends CollectionSelector> iterable) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addAllFrom((Iterable<? extends CollectionSelector>)iterable);
            return this;
        }

        public Builder addAllOrderBy(Iterable<? extends Order> iterable) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addAllOrderBy((Iterable<? extends Order>)iterable);
            return this;
        }

        public Builder addFrom(int n, CollectionSelector.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addFrom(n, (CollectionSelector)builder.build());
            return this;
        }

        public Builder addFrom(int n, CollectionSelector collectionSelector) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addFrom(n, collectionSelector);
            return this;
        }

        public Builder addFrom(CollectionSelector.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addFrom((CollectionSelector)builder.build());
            return this;
        }

        public Builder addFrom(CollectionSelector collectionSelector) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addFrom(collectionSelector);
            return this;
        }

        public Builder addOrderBy(int n, Order.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addOrderBy(n, (Order)builder.build());
            return this;
        }

        public Builder addOrderBy(int n, Order order) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addOrderBy(n, order);
            return this;
        }

        public Builder addOrderBy(Order.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addOrderBy((Order)builder.build());
            return this;
        }

        public Builder addOrderBy(Order order) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addOrderBy(order);
            return this;
        }

        public Builder clearEndAt() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearEndAt();
            return this;
        }

        public Builder clearFrom() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearFrom();
            return this;
        }

        public Builder clearLimit() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearLimit();
            return this;
        }

        public Builder clearOffset() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearOffset();
            return this;
        }

        public Builder clearOrderBy() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearOrderBy();
            return this;
        }

        public Builder clearSelect() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearSelect();
            return this;
        }

        public Builder clearStartAt() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearStartAt();
            return this;
        }

        public Builder clearWhere() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearWhere();
            return this;
        }

        @Override
        public Cursor getEndAt() {
            return ((StructuredQuery)this.instance).getEndAt();
        }

        @Override
        public CollectionSelector getFrom(int n) {
            return ((StructuredQuery)this.instance).getFrom(n);
        }

        @Override
        public int getFromCount() {
            return ((StructuredQuery)this.instance).getFromCount();
        }

        @Override
        public List<CollectionSelector> getFromList() {
            return Collections.unmodifiableList(((StructuredQuery)this.instance).getFromList());
        }

        @Override
        public Int32Value getLimit() {
            return ((StructuredQuery)this.instance).getLimit();
        }

        @Override
        public int getOffset() {
            return ((StructuredQuery)this.instance).getOffset();
        }

        @Override
        public Order getOrderBy(int n) {
            return ((StructuredQuery)this.instance).getOrderBy(n);
        }

        @Override
        public int getOrderByCount() {
            return ((StructuredQuery)this.instance).getOrderByCount();
        }

        @Override
        public List<Order> getOrderByList() {
            return Collections.unmodifiableList(((StructuredQuery)this.instance).getOrderByList());
        }

        @Override
        public Projection getSelect() {
            return ((StructuredQuery)this.instance).getSelect();
        }

        @Override
        public Cursor getStartAt() {
            return ((StructuredQuery)this.instance).getStartAt();
        }

        @Override
        public Filter getWhere() {
            return ((StructuredQuery)this.instance).getWhere();
        }

        @Override
        public boolean hasEndAt() {
            return ((StructuredQuery)this.instance).hasEndAt();
        }

        @Override
        public boolean hasLimit() {
            return ((StructuredQuery)this.instance).hasLimit();
        }

        @Override
        public boolean hasSelect() {
            return ((StructuredQuery)this.instance).hasSelect();
        }

        @Override
        public boolean hasStartAt() {
            return ((StructuredQuery)this.instance).hasStartAt();
        }

        @Override
        public boolean hasWhere() {
            return ((StructuredQuery)this.instance).hasWhere();
        }

        public Builder mergeEndAt(Cursor cursor) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).mergeEndAt(cursor);
            return this;
        }

        public Builder mergeLimit(Int32Value int32Value) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).mergeLimit(int32Value);
            return this;
        }

        public Builder mergeSelect(Projection projection) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).mergeSelect(projection);
            return this;
        }

        public Builder mergeStartAt(Cursor cursor) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).mergeStartAt(cursor);
            return this;
        }

        public Builder mergeWhere(Filter filter) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).mergeWhere(filter);
            return this;
        }

        public Builder removeFrom(int n) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).removeFrom(n);
            return this;
        }

        public Builder removeOrderBy(int n) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).removeOrderBy(n);
            return this;
        }

        public Builder setEndAt(Cursor.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setEndAt((Cursor)builder.build());
            return this;
        }

        public Builder setEndAt(Cursor cursor) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setEndAt(cursor);
            return this;
        }

        public Builder setFrom(int n, CollectionSelector.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setFrom(n, (CollectionSelector)builder.build());
            return this;
        }

        public Builder setFrom(int n, CollectionSelector collectionSelector) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setFrom(n, collectionSelector);
            return this;
        }

        public Builder setLimit(Int32Value.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setLimit((Int32Value)builder.build());
            return this;
        }

        public Builder setLimit(Int32Value int32Value) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setLimit(int32Value);
            return this;
        }

        public Builder setOffset(int n) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setOffset(n);
            return this;
        }

        public Builder setOrderBy(int n, Order.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setOrderBy(n, (Order)builder.build());
            return this;
        }

        public Builder setOrderBy(int n, Order order) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setOrderBy(n, order);
            return this;
        }

        public Builder setSelect(Projection.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setSelect((Projection)builder.build());
            return this;
        }

        public Builder setSelect(Projection projection) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setSelect(projection);
            return this;
        }

        public Builder setStartAt(Cursor.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setStartAt((Cursor)builder.build());
            return this;
        }

        public Builder setStartAt(Cursor cursor) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setStartAt(cursor);
            return this;
        }

        public Builder setWhere(Filter.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setWhere((Filter)builder.build());
            return this;
        }

        public Builder setWhere(Filter filter) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setWhere(filter);
            return this;
        }
    }

    public static final class CollectionSelector
    extends GeneratedMessageLite<CollectionSelector, Builder>
    implements CollectionSelectorOrBuilder {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final CollectionSelector DEFAULT_INSTANCE;
        private static volatile Parser<CollectionSelector> PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        static {
            CollectionSelector collectionSelector;
            DEFAULT_INSTANCE = collectionSelector = new CollectionSelector();
            GeneratedMessageLite.registerDefaultInstance(CollectionSelector.class, (GeneratedMessageLite)collectionSelector);
        }

        private CollectionSelector() {
        }

        private void clearAllDescendants() {
            this.allDescendants_ = false;
        }

        private void clearCollectionId() {
            this.collectionId_ = CollectionSelector.getDefaultInstance().getCollectionId();
        }

        public static CollectionSelector getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CollectionSelector collectionSelector) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)collectionSelector);
        }

        public static CollectionSelector parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CollectionSelector)CollectionSelector.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static CollectionSelector parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CollectionSelector)CollectionSelector.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CollectionSelector parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static CollectionSelector parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CollectionSelector parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static CollectionSelector parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CollectionSelector parseFrom(InputStream inputStream) throws IOException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static CollectionSelector parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CollectionSelector parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static CollectionSelector parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CollectionSelector parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static CollectionSelector parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<CollectionSelector> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAllDescendants(boolean bl) {
            this.allDescendants_ = bl;
        }

        private void setCollectionId(String string) {
            string.getClass();
            this.collectionId_ = string;
        }

        private void setCollectionIdBytes(ByteString byteString) {
            CollectionSelector.checkByteStringIsUtf8((ByteString)byteString);
            this.collectionId_ = byteString.toStringUtf8();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
            switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return (byte)1;
                }
                case 5: {
                    Parser<CollectionSelector> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<CollectionSelector> class_ = CollectionSelector.class;
                    synchronized (CollectionSelector.class) {
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                        }
                        // ** MonitorExit[var8_5] (shouldn't be in output)
                        return defaultInstanceBasedParser;
                    }
                }
                case 4: {
                    return DEFAULT_INSTANCE;
                }
                case 3: {
                    Object[] arrobject = new Object[]{"collectionId_", "allDescendants_"};
                    return CollectionSelector.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0208\u0003\u0007", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new CollectionSelector();
        }

        @Override
        public boolean getAllDescendants() {
            return this.allDescendants_;
        }

        @Override
        public String getCollectionId() {
            return this.collectionId_;
        }

        @Override
        public ByteString getCollectionIdBytes() {
            return ByteString.copyFromUtf8((String)this.collectionId_);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<CollectionSelector, Builder>
        implements CollectionSelectorOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearAllDescendants() {
                this.copyOnWrite();
                ((CollectionSelector)this.instance).clearAllDescendants();
                return this;
            }

            public Builder clearCollectionId() {
                this.copyOnWrite();
                ((CollectionSelector)this.instance).clearCollectionId();
                return this;
            }

            @Override
            public boolean getAllDescendants() {
                return ((CollectionSelector)this.instance).getAllDescendants();
            }

            @Override
            public String getCollectionId() {
                return ((CollectionSelector)this.instance).getCollectionId();
            }

            @Override
            public ByteString getCollectionIdBytes() {
                return ((CollectionSelector)this.instance).getCollectionIdBytes();
            }

            public Builder setAllDescendants(boolean bl) {
                this.copyOnWrite();
                ((CollectionSelector)this.instance).setAllDescendants(bl);
                return this;
            }

            public Builder setCollectionId(String string) {
                this.copyOnWrite();
                ((CollectionSelector)this.instance).setCollectionId(string);
                return this;
            }

            public Builder setCollectionIdBytes(ByteString byteString) {
                this.copyOnWrite();
                ((CollectionSelector)this.instance).setCollectionIdBytes(byteString);
                return this;
            }
        }

    }

    public static final class CompositeFilter
    extends GeneratedMessageLite<CompositeFilter, Builder>
    implements CompositeFilterOrBuilder {
        private static final CompositeFilter DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile Parser<CompositeFilter> PARSER;
        private Internal.ProtobufList<Filter> filters_ = CompositeFilter.emptyProtobufList();
        private int op_;

        static {
            CompositeFilter compositeFilter;
            DEFAULT_INSTANCE = compositeFilter = new CompositeFilter();
            GeneratedMessageLite.registerDefaultInstance(CompositeFilter.class, (GeneratedMessageLite)compositeFilter);
        }

        private CompositeFilter() {
        }

        private void addAllFilters(Iterable<? extends Filter> iterable) {
            this.ensureFiltersIsMutable();
            AbstractMessageLite.addAll(iterable, this.filters_);
        }

        private void addFilters(int n, Filter filter) {
            filter.getClass();
            this.ensureFiltersIsMutable();
            this.filters_.add(n, (Object)filter);
        }

        private void addFilters(Filter filter) {
            filter.getClass();
            this.ensureFiltersIsMutable();
            this.filters_.add((Object)filter);
        }

        private void clearFilters() {
            this.filters_ = CompositeFilter.emptyProtobufList();
        }

        private void clearOp() {
            this.op_ = 0;
        }

        private void ensureFiltersIsMutable() {
            Internal.ProtobufList<Filter> protobufList = this.filters_;
            if (!protobufList.isModifiable()) {
                this.filters_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static CompositeFilter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CompositeFilter compositeFilter) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)compositeFilter);
        }

        public static CompositeFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CompositeFilter)CompositeFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static CompositeFilter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CompositeFilter)CompositeFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CompositeFilter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static CompositeFilter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CompositeFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static CompositeFilter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CompositeFilter parseFrom(InputStream inputStream) throws IOException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static CompositeFilter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CompositeFilter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static CompositeFilter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CompositeFilter parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static CompositeFilter parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<CompositeFilter> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeFilters(int n) {
            this.ensureFiltersIsMutable();
            this.filters_.remove(n);
        }

        private void setFilters(int n, Filter filter) {
            filter.getClass();
            this.ensureFiltersIsMutable();
            this.filters_.set(n, (Object)filter);
        }

        private void setOp(Operator operator) {
            this.op_ = operator.getNumber();
        }

        private void setOpValue(int n) {
            this.op_ = n;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
            switch (com.google.firestore.v1.StructuredQuery$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return (byte)1;
                }
                case 5: {
                    Parser<CompositeFilter> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<CompositeFilter> class_ = CompositeFilter.class;
                    synchronized (CompositeFilter.class) {
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                        }
                        // ** MonitorExit[var8_5] (shouldn't be in output)
                        return defaultInstanceBasedParser;
                    }
                }
                case 4: {
                    return DEFAULT_INSTANCE;
                }
                case 3: {
                    Object[] arrobject = new Object[]{"op_", "filters_", Filter.class};
                    return CompositeFilter.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new CompositeFilter();
        }

        @Override
        public Filter getFilters(int n) {
            return (Filter)this.filters_.get(n);
        }

        @Override
        public int getFiltersCount() {
            return this.filters_.size();
        }

        @Override
        public List<Filter> getFiltersList() {
            return this.filters_;
        }

        public FilterOrBuilder getFiltersOrBuilder(int n) {
            return this.filters_.get(n);
        }

        public List<? extends FilterOrBuilder> getFiltersOrBuilderList() {
            return this.filters_;
        }

        @Override
        public Operator getOp() {
            Operator operator = Operator.forNumber(this.op_);
            if (operator == null) {
                operator = Operator.UNRECOGNIZED;
            }
            return operator;
        }

        @Override
        public int getOpValue() {
            return this.op_;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<CompositeFilter, Builder>
        implements CompositeFilterOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllFilters(Iterable<? extends Filter> iterable) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).addAllFilters((Iterable<? extends Filter>)iterable);
                return this;
            }

            public Builder addFilters(int n, Filter.Builder builder) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).addFilters(n, (Filter)builder.build());
                return this;
            }

            public Builder addFilters(int n, Filter filter) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).addFilters(n, filter);
                return this;
            }

            public Builder addFilters(Filter.Builder builder) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).addFilters((Filter)builder.build());
                return this;
            }

            public Builder addFilters(Filter filter) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).addFilters(filter);
                return this;
            }

            public Builder clearFilters() {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).clearFilters();
                return this;
            }

            public Builder clearOp() {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).clearOp();
                return this;
            }

            @Override
            public Filter getFilters(int n) {
                return ((CompositeFilter)this.instance).getFilters(n);
            }

            @Override
            public int getFiltersCount() {
                return ((CompositeFilter)this.instance).getFiltersCount();
            }

            @Override
            public List<Filter> getFiltersList() {
                return Collections.unmodifiableList(((CompositeFilter)this.instance).getFiltersList());
            }

            @Override
            public Operator getOp() {
                return ((CompositeFilter)this.instance).getOp();
            }

            @Override
            public int getOpValue() {
                return ((CompositeFilter)this.instance).getOpValue();
            }

            public Builder removeFilters(int n) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).removeFilters(n);
                return this;
            }

            public Builder setFilters(int n, Filter.Builder builder) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).setFilters(n, (Filter)builder.build());
                return this;
            }

            public Builder setFilters(int n, Filter filter) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).setFilters(n, filter);
                return this;
            }

            public Builder setOp(Operator operator) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).setOp(operator);
                return this;
            }

            public Builder setOpValue(int n) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).setOpValue(n);
                return this;
            }
        }

    }

    public static final class FieldFilter
    extends GeneratedMessageLite<FieldFilter, Builder>
    implements FieldFilterOrBuilder {
        private static final FieldFilter DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile Parser<FieldFilter> PARSER;
        public static final int VALUE_FIELD_NUMBER = 3;
        private FieldReference field_;
        private int op_;
        private Value value_;

        static {
            FieldFilter fieldFilter;
            DEFAULT_INSTANCE = fieldFilter = new FieldFilter();
            GeneratedMessageLite.registerDefaultInstance(FieldFilter.class, (GeneratedMessageLite)fieldFilter);
        }

        private FieldFilter() {
        }

        private void clearField() {
            this.field_ = null;
        }

        private void clearOp() {
            this.op_ = 0;
        }

        private void clearValue() {
            this.value_ = null;
        }

        public static FieldFilter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeField(FieldReference fieldReference) {
            fieldReference.getClass();
            FieldReference fieldReference2 = this.field_;
            if (fieldReference2 != null && fieldReference2 != FieldReference.getDefaultInstance()) {
                this.field_ = (FieldReference)((FieldReference.Builder)FieldReference.newBuilder(this.field_).mergeFrom((GeneratedMessageLite)fieldReference)).buildPartial();
                return;
            }
            this.field_ = fieldReference;
        }

        private void mergeValue(Value value) {
            value.getClass();
            Value value2 = this.value_;
            if (value2 != null && value2 != Value.getDefaultInstance()) {
                this.value_ = (Value)((Value.Builder)Value.newBuilder(this.value_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
                return;
            }
            this.value_ = value;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FieldFilter fieldFilter) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)fieldFilter);
        }

        public static FieldFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldFilter)FieldFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldFilter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldFilter)FieldFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldFilter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static FieldFilter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static FieldFilter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldFilter parseFrom(InputStream inputStream) throws IOException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldFilter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldFilter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static FieldFilter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldFilter parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static FieldFilter parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<FieldFilter> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setField(FieldReference fieldReference) {
            fieldReference.getClass();
            this.field_ = fieldReference;
        }

        private void setOp(Operator operator) {
            this.op_ = operator.getNumber();
        }

        private void setOpValue(int n) {
            this.op_ = n;
        }

        private void setValue(Value value) {
            value.getClass();
            this.value_ = value;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
            switch (com.google.firestore.v1.StructuredQuery$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return (byte)1;
                }
                case 5: {
                    Parser<FieldFilter> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<FieldFilter> class_ = FieldFilter.class;
                    synchronized (FieldFilter.class) {
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                        }
                        // ** MonitorExit[var8_5] (shouldn't be in output)
                        return defaultInstanceBasedParser;
                    }
                }
                case 4: {
                    return DEFAULT_INSTANCE;
                }
                case 3: {
                    Object[] arrobject = new Object[]{"field_", "op_", "value_"};
                    return FieldFilter.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new FieldFilter();
        }

        @Override
        public FieldReference getField() {
            FieldReference fieldReference = this.field_;
            if (fieldReference == null) {
                fieldReference = FieldReference.getDefaultInstance();
            }
            return fieldReference;
        }

        @Override
        public Operator getOp() {
            Operator operator = Operator.forNumber(this.op_);
            if (operator == null) {
                operator = Operator.UNRECOGNIZED;
            }
            return operator;
        }

        @Override
        public int getOpValue() {
            return this.op_;
        }

        @Override
        public Value getValue() {
            Value value = this.value_;
            if (value == null) {
                value = Value.getDefaultInstance();
            }
            return value;
        }

        @Override
        public boolean hasField() {
            return this.field_ != null;
        }

        @Override
        public boolean hasValue() {
            return this.value_ != null;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<FieldFilter, Builder>
        implements FieldFilterOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearField() {
                this.copyOnWrite();
                ((FieldFilter)this.instance).clearField();
                return this;
            }

            public Builder clearOp() {
                this.copyOnWrite();
                ((FieldFilter)this.instance).clearOp();
                return this;
            }

            public Builder clearValue() {
                this.copyOnWrite();
                ((FieldFilter)this.instance).clearValue();
                return this;
            }

            @Override
            public FieldReference getField() {
                return ((FieldFilter)this.instance).getField();
            }

            @Override
            public Operator getOp() {
                return ((FieldFilter)this.instance).getOp();
            }

            @Override
            public int getOpValue() {
                return ((FieldFilter)this.instance).getOpValue();
            }

            @Override
            public Value getValue() {
                return ((FieldFilter)this.instance).getValue();
            }

            @Override
            public boolean hasField() {
                return ((FieldFilter)this.instance).hasField();
            }

            @Override
            public boolean hasValue() {
                return ((FieldFilter)this.instance).hasValue();
            }

            public Builder mergeField(FieldReference fieldReference) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).mergeField(fieldReference);
                return this;
            }

            public Builder mergeValue(Value value) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).mergeValue(value);
                return this;
            }

            public Builder setField(FieldReference.Builder builder) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).setField((FieldReference)builder.build());
                return this;
            }

            public Builder setField(FieldReference fieldReference) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).setField(fieldReference);
                return this;
            }

            public Builder setOp(Operator operator) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).setOp(operator);
                return this;
            }

            public Builder setOpValue(int n) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).setOpValue(n);
                return this;
            }

            public Builder setValue(Value.Builder builder) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).setValue((Value)builder.build());
                return this;
            }

            public Builder setValue(Value value) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).setValue(value);
                return this;
            }
        }

    }

    public static final class FieldReference
    extends GeneratedMessageLite<FieldReference, Builder>
    implements FieldReferenceOrBuilder {
        private static final FieldReference DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile Parser<FieldReference> PARSER;
        private String fieldPath_ = "";

        static {
            FieldReference fieldReference;
            DEFAULT_INSTANCE = fieldReference = new FieldReference();
            GeneratedMessageLite.registerDefaultInstance(FieldReference.class, (GeneratedMessageLite)fieldReference);
        }

        private FieldReference() {
        }

        private void clearFieldPath() {
            this.fieldPath_ = FieldReference.getDefaultInstance().getFieldPath();
        }

        public static FieldReference getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FieldReference fieldReference) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)fieldReference);
        }

        public static FieldReference parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldReference)FieldReference.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldReference parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldReference)FieldReference.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldReference parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static FieldReference parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldReference parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static FieldReference parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldReference parseFrom(InputStream inputStream) throws IOException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldReference parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldReference parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static FieldReference parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldReference parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static FieldReference parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<FieldReference> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setFieldPath(String string) {
            string.getClass();
            this.fieldPath_ = string;
        }

        private void setFieldPathBytes(ByteString byteString) {
            FieldReference.checkByteStringIsUtf8((ByteString)byteString);
            this.fieldPath_ = byteString.toStringUtf8();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
            switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return (byte)1;
                }
                case 5: {
                    Parser<FieldReference> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<FieldReference> class_ = FieldReference.class;
                    synchronized (FieldReference.class) {
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                        }
                        // ** MonitorExit[var8_5] (shouldn't be in output)
                        return defaultInstanceBasedParser;
                    }
                }
                case 4: {
                    return DEFAULT_INSTANCE;
                }
                case 3: {
                    Object[] arrobject = new Object[]{"fieldPath_"};
                    return FieldReference.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0208", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new FieldReference();
        }

        @Override
        public String getFieldPath() {
            return this.fieldPath_;
        }

        @Override
        public ByteString getFieldPathBytes() {
            return ByteString.copyFromUtf8((String)this.fieldPath_);
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<FieldReference, Builder>
        implements FieldReferenceOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearFieldPath() {
                this.copyOnWrite();
                ((FieldReference)this.instance).clearFieldPath();
                return this;
            }

            @Override
            public String getFieldPath() {
                return ((FieldReference)this.instance).getFieldPath();
            }

            @Override
            public ByteString getFieldPathBytes() {
                return ((FieldReference)this.instance).getFieldPathBytes();
            }

            public Builder setFieldPath(String string) {
                this.copyOnWrite();
                ((FieldReference)this.instance).setFieldPath(string);
                return this;
            }

            public Builder setFieldPathBytes(ByteString byteString) {
                this.copyOnWrite();
                ((FieldReference)this.instance).setFieldPathBytes(byteString);
                return this;
            }
        }

    }

    public static final class Filter
    extends GeneratedMessageLite<Filter, Builder>
    implements FilterOrBuilder {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final Filter DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile Parser<Filter> PARSER;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        static {
            Filter filter;
            DEFAULT_INSTANCE = filter = new Filter();
            GeneratedMessageLite.registerDefaultInstance(Filter.class, (GeneratedMessageLite)filter);
        }

        private Filter() {
        }

        private void clearCompositeFilter() {
            if (this.filterTypeCase_ == 1) {
                this.filterTypeCase_ = 0;
                this.filterType_ = null;
            }
        }

        private void clearFieldFilter() {
            if (this.filterTypeCase_ == 2) {
                this.filterTypeCase_ = 0;
                this.filterType_ = null;
            }
        }

        private void clearFilterType() {
            this.filterTypeCase_ = 0;
            this.filterType_ = null;
        }

        private void clearUnaryFilter() {
            if (this.filterTypeCase_ == 3) {
                this.filterTypeCase_ = 0;
                this.filterType_ = null;
            }
        }

        public static Filter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeCompositeFilter(CompositeFilter compositeFilter) {
            compositeFilter.getClass();
            this.filterType_ = this.filterTypeCase_ == 1 && this.filterType_ != CompositeFilter.getDefaultInstance() ? ((CompositeFilter.Builder)CompositeFilter.newBuilder((CompositeFilter)this.filterType_).mergeFrom((GeneratedMessageLite)compositeFilter)).buildPartial() : compositeFilter;
            this.filterTypeCase_ = 1;
        }

        private void mergeFieldFilter(FieldFilter fieldFilter) {
            fieldFilter.getClass();
            this.filterType_ = this.filterTypeCase_ == 2 && this.filterType_ != FieldFilter.getDefaultInstance() ? ((FieldFilter.Builder)FieldFilter.newBuilder((FieldFilter)this.filterType_).mergeFrom((GeneratedMessageLite)fieldFilter)).buildPartial() : fieldFilter;
            this.filterTypeCase_ = 2;
        }

        private void mergeUnaryFilter(UnaryFilter unaryFilter) {
            unaryFilter.getClass();
            this.filterType_ = this.filterTypeCase_ == 3 && this.filterType_ != UnaryFilter.getDefaultInstance() ? ((UnaryFilter.Builder)UnaryFilter.newBuilder((UnaryFilter)this.filterType_).mergeFrom((GeneratedMessageLite)unaryFilter)).buildPartial() : unaryFilter;
            this.filterTypeCase_ = 3;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Filter filter) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)filter);
        }

        public static Filter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Filter)Filter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Filter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Filter)Filter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Filter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Filter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Filter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Filter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Filter parseFrom(InputStream inputStream) throws IOException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Filter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Filter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Filter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Filter parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Filter parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Filter> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCompositeFilter(CompositeFilter compositeFilter) {
            compositeFilter.getClass();
            this.filterType_ = compositeFilter;
            this.filterTypeCase_ = 1;
        }

        private void setFieldFilter(FieldFilter fieldFilter) {
            fieldFilter.getClass();
            this.filterType_ = fieldFilter;
            this.filterTypeCase_ = 2;
        }

        private void setUnaryFilter(UnaryFilter unaryFilter) {
            unaryFilter.getClass();
            this.filterType_ = unaryFilter;
            this.filterTypeCase_ = 3;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
            switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return (byte)1;
                }
                case 5: {
                    Parser<Filter> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<Filter> class_ = Filter.class;
                    synchronized (Filter.class) {
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                        }
                        // ** MonitorExit[var8_5] (shouldn't be in output)
                        return defaultInstanceBasedParser;
                    }
                }
                case 4: {
                    return DEFAULT_INSTANCE;
                }
                case 3: {
                    Object[] arrobject = new Object[]{"filterType_", "filterTypeCase_", CompositeFilter.class, FieldFilter.class, UnaryFilter.class};
                    return Filter.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Filter();
        }

        @Override
        public CompositeFilter getCompositeFilter() {
            if (this.filterTypeCase_ == 1) {
                return (CompositeFilter)this.filterType_;
            }
            return CompositeFilter.getDefaultInstance();
        }

        @Override
        public FieldFilter getFieldFilter() {
            if (this.filterTypeCase_ == 2) {
                return (FieldFilter)this.filterType_;
            }
            return FieldFilter.getDefaultInstance();
        }

        @Override
        public FilterTypeCase getFilterTypeCase() {
            return FilterTypeCase.forNumber(this.filterTypeCase_);
        }

        @Override
        public UnaryFilter getUnaryFilter() {
            if (this.filterTypeCase_ == 3) {
                return (UnaryFilter)this.filterType_;
            }
            return UnaryFilter.getDefaultInstance();
        }

        @Override
        public boolean hasCompositeFilter() {
            return this.filterTypeCase_ == 1;
        }

        @Override
        public boolean hasFieldFilter() {
            return this.filterTypeCase_ == 2;
        }

        @Override
        public boolean hasUnaryFilter() {
            return this.filterTypeCase_ == 3;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Filter, Builder>
        implements FilterOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearCompositeFilter() {
                this.copyOnWrite();
                ((Filter)this.instance).clearCompositeFilter();
                return this;
            }

            public Builder clearFieldFilter() {
                this.copyOnWrite();
                ((Filter)this.instance).clearFieldFilter();
                return this;
            }

            public Builder clearFilterType() {
                this.copyOnWrite();
                ((Filter)this.instance).clearFilterType();
                return this;
            }

            public Builder clearUnaryFilter() {
                this.copyOnWrite();
                ((Filter)this.instance).clearUnaryFilter();
                return this;
            }

            @Override
            public CompositeFilter getCompositeFilter() {
                return ((Filter)this.instance).getCompositeFilter();
            }

            @Override
            public FieldFilter getFieldFilter() {
                return ((Filter)this.instance).getFieldFilter();
            }

            @Override
            public FilterTypeCase getFilterTypeCase() {
                return ((Filter)this.instance).getFilterTypeCase();
            }

            @Override
            public UnaryFilter getUnaryFilter() {
                return ((Filter)this.instance).getUnaryFilter();
            }

            @Override
            public boolean hasCompositeFilter() {
                return ((Filter)this.instance).hasCompositeFilter();
            }

            @Override
            public boolean hasFieldFilter() {
                return ((Filter)this.instance).hasFieldFilter();
            }

            @Override
            public boolean hasUnaryFilter() {
                return ((Filter)this.instance).hasUnaryFilter();
            }

            public Builder mergeCompositeFilter(CompositeFilter compositeFilter) {
                this.copyOnWrite();
                ((Filter)this.instance).mergeCompositeFilter(compositeFilter);
                return this;
            }

            public Builder mergeFieldFilter(FieldFilter fieldFilter) {
                this.copyOnWrite();
                ((Filter)this.instance).mergeFieldFilter(fieldFilter);
                return this;
            }

            public Builder mergeUnaryFilter(UnaryFilter unaryFilter) {
                this.copyOnWrite();
                ((Filter)this.instance).mergeUnaryFilter(unaryFilter);
                return this;
            }

            public Builder setCompositeFilter(CompositeFilter.Builder builder) {
                this.copyOnWrite();
                ((Filter)this.instance).setCompositeFilter((CompositeFilter)builder.build());
                return this;
            }

            public Builder setCompositeFilter(CompositeFilter compositeFilter) {
                this.copyOnWrite();
                ((Filter)this.instance).setCompositeFilter(compositeFilter);
                return this;
            }

            public Builder setFieldFilter(FieldFilter.Builder builder) {
                this.copyOnWrite();
                ((Filter)this.instance).setFieldFilter((FieldFilter)builder.build());
                return this;
            }

            public Builder setFieldFilter(FieldFilter fieldFilter) {
                this.copyOnWrite();
                ((Filter)this.instance).setFieldFilter(fieldFilter);
                return this;
            }

            public Builder setUnaryFilter(UnaryFilter.Builder builder) {
                this.copyOnWrite();
                ((Filter)this.instance).setUnaryFilter((UnaryFilter)builder.build());
                return this;
            }

            public Builder setUnaryFilter(UnaryFilter unaryFilter) {
                this.copyOnWrite();
                ((Filter)this.instance).setUnaryFilter(unaryFilter);
                return this;
            }
        }

    }

    public static final class Order
    extends GeneratedMessageLite<Order, Builder>
    implements OrderOrBuilder {
        private static final Order DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile Parser<Order> PARSER;
        private int direction_;
        private FieldReference field_;

        static {
            Order order;
            DEFAULT_INSTANCE = order = new Order();
            GeneratedMessageLite.registerDefaultInstance(Order.class, (GeneratedMessageLite)order);
        }

        private Order() {
        }

        private void clearDirection() {
            this.direction_ = 0;
        }

        private void clearField() {
            this.field_ = null;
        }

        public static Order getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeField(FieldReference fieldReference) {
            fieldReference.getClass();
            FieldReference fieldReference2 = this.field_;
            if (fieldReference2 != null && fieldReference2 != FieldReference.getDefaultInstance()) {
                this.field_ = (FieldReference)((FieldReference.Builder)FieldReference.newBuilder(this.field_).mergeFrom((GeneratedMessageLite)fieldReference)).buildPartial();
                return;
            }
            this.field_ = fieldReference;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Order order) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)order);
        }

        public static Order parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Order)Order.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Order parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Order)Order.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Order parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Order parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Order parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Order parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Order parseFrom(InputStream inputStream) throws IOException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Order parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Order parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Order parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Order parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Order parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Order> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDirection(Direction direction) {
            this.direction_ = direction.getNumber();
        }

        private void setDirectionValue(int n) {
            this.direction_ = n;
        }

        private void setField(FieldReference fieldReference) {
            fieldReference.getClass();
            this.field_ = fieldReference;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
            switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return (byte)1;
                }
                case 5: {
                    Parser<Order> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<Order> class_ = Order.class;
                    synchronized (Order.class) {
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                        }
                        // ** MonitorExit[var8_5] (shouldn't be in output)
                        return defaultInstanceBasedParser;
                    }
                }
                case 4: {
                    return DEFAULT_INSTANCE;
                }
                case 3: {
                    Object[] arrobject = new Object[]{"field_", "direction_"};
                    return Order.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Order();
        }

        @Override
        public Direction getDirection() {
            Direction direction = Direction.forNumber(this.direction_);
            if (direction == null) {
                direction = Direction.UNRECOGNIZED;
            }
            return direction;
        }

        @Override
        public int getDirectionValue() {
            return this.direction_;
        }

        @Override
        public FieldReference getField() {
            FieldReference fieldReference = this.field_;
            if (fieldReference == null) {
                fieldReference = FieldReference.getDefaultInstance();
            }
            return fieldReference;
        }

        @Override
        public boolean hasField() {
            return this.field_ != null;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Order, Builder>
        implements OrderOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearDirection() {
                this.copyOnWrite();
                ((Order)this.instance).clearDirection();
                return this;
            }

            public Builder clearField() {
                this.copyOnWrite();
                ((Order)this.instance).clearField();
                return this;
            }

            @Override
            public Direction getDirection() {
                return ((Order)this.instance).getDirection();
            }

            @Override
            public int getDirectionValue() {
                return ((Order)this.instance).getDirectionValue();
            }

            @Override
            public FieldReference getField() {
                return ((Order)this.instance).getField();
            }

            @Override
            public boolean hasField() {
                return ((Order)this.instance).hasField();
            }

            public Builder mergeField(FieldReference fieldReference) {
                this.copyOnWrite();
                ((Order)this.instance).mergeField(fieldReference);
                return this;
            }

            public Builder setDirection(Direction direction) {
                this.copyOnWrite();
                ((Order)this.instance).setDirection(direction);
                return this;
            }

            public Builder setDirectionValue(int n) {
                this.copyOnWrite();
                ((Order)this.instance).setDirectionValue(n);
                return this;
            }

            public Builder setField(FieldReference.Builder builder) {
                this.copyOnWrite();
                ((Order)this.instance).setField((FieldReference)builder.build());
                return this;
            }

            public Builder setField(FieldReference fieldReference) {
                this.copyOnWrite();
                ((Order)this.instance).setField(fieldReference);
                return this;
            }
        }

    }

    public static final class Projection
    extends GeneratedMessageLite<Projection, Builder>
    implements ProjectionOrBuilder {
        private static final Projection DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile Parser<Projection> PARSER;
        private Internal.ProtobufList<FieldReference> fields_ = Projection.emptyProtobufList();

        static {
            Projection projection;
            DEFAULT_INSTANCE = projection = new Projection();
            GeneratedMessageLite.registerDefaultInstance(Projection.class, (GeneratedMessageLite)projection);
        }

        private Projection() {
        }

        private void addAllFields(Iterable<? extends FieldReference> iterable) {
            this.ensureFieldsIsMutable();
            AbstractMessageLite.addAll(iterable, this.fields_);
        }

        private void addFields(int n, FieldReference fieldReference) {
            fieldReference.getClass();
            this.ensureFieldsIsMutable();
            this.fields_.add(n, (Object)fieldReference);
        }

        private void addFields(FieldReference fieldReference) {
            fieldReference.getClass();
            this.ensureFieldsIsMutable();
            this.fields_.add((Object)fieldReference);
        }

        private void clearFields() {
            this.fields_ = Projection.emptyProtobufList();
        }

        private void ensureFieldsIsMutable() {
            Internal.ProtobufList<FieldReference> protobufList = this.fields_;
            if (!protobufList.isModifiable()) {
                this.fields_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static Projection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Projection projection) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)projection);
        }

        public static Projection parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Projection)Projection.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Projection parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Projection)Projection.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Projection parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Projection parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Projection parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Projection parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Projection parseFrom(InputStream inputStream) throws IOException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Projection parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Projection parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static Projection parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Projection parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Projection parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Projection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeFields(int n) {
            this.ensureFieldsIsMutable();
            this.fields_.remove(n);
        }

        private void setFields(int n, FieldReference fieldReference) {
            fieldReference.getClass();
            this.ensureFieldsIsMutable();
            this.fields_.set(n, (Object)fieldReference);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
            switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return (byte)1;
                }
                case 5: {
                    Parser<Projection> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<Projection> class_ = Projection.class;
                    synchronized (Projection.class) {
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                        }
                        // ** MonitorExit[var8_5] (shouldn't be in output)
                        return defaultInstanceBasedParser;
                    }
                }
                case 4: {
                    return DEFAULT_INSTANCE;
                }
                case 3: {
                    Object[] arrobject = new Object[]{"fields_", FieldReference.class};
                    return Projection.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new Projection();
        }

        @Override
        public FieldReference getFields(int n) {
            return (FieldReference)this.fields_.get(n);
        }

        @Override
        public int getFieldsCount() {
            return this.fields_.size();
        }

        @Override
        public List<FieldReference> getFieldsList() {
            return this.fields_;
        }

        public FieldReferenceOrBuilder getFieldsOrBuilder(int n) {
            return this.fields_.get(n);
        }

        public List<? extends FieldReferenceOrBuilder> getFieldsOrBuilderList() {
            return this.fields_;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Projection, Builder>
        implements ProjectionOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllFields(Iterable<? extends FieldReference> iterable) {
                this.copyOnWrite();
                ((Projection)this.instance).addAllFields((Iterable<? extends FieldReference>)iterable);
                return this;
            }

            public Builder addFields(int n, FieldReference.Builder builder) {
                this.copyOnWrite();
                ((Projection)this.instance).addFields(n, (FieldReference)builder.build());
                return this;
            }

            public Builder addFields(int n, FieldReference fieldReference) {
                this.copyOnWrite();
                ((Projection)this.instance).addFields(n, fieldReference);
                return this;
            }

            public Builder addFields(FieldReference.Builder builder) {
                this.copyOnWrite();
                ((Projection)this.instance).addFields((FieldReference)builder.build());
                return this;
            }

            public Builder addFields(FieldReference fieldReference) {
                this.copyOnWrite();
                ((Projection)this.instance).addFields(fieldReference);
                return this;
            }

            public Builder clearFields() {
                this.copyOnWrite();
                ((Projection)this.instance).clearFields();
                return this;
            }

            @Override
            public FieldReference getFields(int n) {
                return ((Projection)this.instance).getFields(n);
            }

            @Override
            public int getFieldsCount() {
                return ((Projection)this.instance).getFieldsCount();
            }

            @Override
            public List<FieldReference> getFieldsList() {
                return Collections.unmodifiableList(((Projection)this.instance).getFieldsList());
            }

            public Builder removeFields(int n) {
                this.copyOnWrite();
                ((Projection)this.instance).removeFields(n);
                return this;
            }

            public Builder setFields(int n, FieldReference.Builder builder) {
                this.copyOnWrite();
                ((Projection)this.instance).setFields(n, (FieldReference)builder.build());
                return this;
            }

            public Builder setFields(int n, FieldReference fieldReference) {
                this.copyOnWrite();
                ((Projection)this.instance).setFields(n, fieldReference);
                return this;
            }
        }

    }

    public static final class UnaryFilter
    extends GeneratedMessageLite<UnaryFilter, Builder>
    implements UnaryFilterOrBuilder {
        private static final UnaryFilter DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile Parser<UnaryFilter> PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        static {
            UnaryFilter unaryFilter;
            DEFAULT_INSTANCE = unaryFilter = new UnaryFilter();
            GeneratedMessageLite.registerDefaultInstance(UnaryFilter.class, (GeneratedMessageLite)unaryFilter);
        }

        private UnaryFilter() {
        }

        private void clearField() {
            if (this.operandTypeCase_ == 2) {
                this.operandTypeCase_ = 0;
                this.operandType_ = null;
            }
        }

        private void clearOp() {
            this.op_ = 0;
        }

        private void clearOperandType() {
            this.operandTypeCase_ = 0;
            this.operandType_ = null;
        }

        public static UnaryFilter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeField(FieldReference fieldReference) {
            fieldReference.getClass();
            this.operandType_ = this.operandTypeCase_ == 2 && this.operandType_ != FieldReference.getDefaultInstance() ? ((FieldReference.Builder)FieldReference.newBuilder((FieldReference)this.operandType_).mergeFrom((GeneratedMessageLite)fieldReference)).buildPartial() : fieldReference;
            this.operandTypeCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(UnaryFilter unaryFilter) {
            return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)unaryFilter);
        }

        public static UnaryFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UnaryFilter)UnaryFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static UnaryFilter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UnaryFilter)UnaryFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UnaryFilter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static UnaryFilter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UnaryFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static UnaryFilter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UnaryFilter parseFrom(InputStream inputStream) throws IOException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static UnaryFilter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UnaryFilter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
        }

        public static UnaryFilter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UnaryFilter parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static UnaryFilter parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<UnaryFilter> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setField(FieldReference fieldReference) {
            fieldReference.getClass();
            this.operandType_ = fieldReference;
            this.operandTypeCase_ = 2;
        }

        private void setOp(Operator operator) {
            this.op_ = operator.getNumber();
        }

        private void setOpValue(int n) {
            this.op_ = n;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
            switch (com.google.firestore.v1.StructuredQuery$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return (byte)1;
                }
                case 5: {
                    Parser<UnaryFilter> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    Class<UnaryFilter> class_ = UnaryFilter.class;
                    synchronized (UnaryFilter.class) {
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            PARSER = defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                        }
                        // ** MonitorExit[var8_5] (shouldn't be in output)
                        return defaultInstanceBasedParser;
                    }
                }
                case 4: {
                    return DEFAULT_INSTANCE;
                }
                case 3: {
                    Object[] arrobject = new Object[]{"operandType_", "operandTypeCase_", "op_", FieldReference.class};
                    return UnaryFilter.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", (Object[])arrobject);
                }
                case 2: {
                    return new Builder();
                }
                case 1: 
            }
            return new UnaryFilter();
        }

        @Override
        public FieldReference getField() {
            if (this.operandTypeCase_ == 2) {
                return (FieldReference)this.operandType_;
            }
            return FieldReference.getDefaultInstance();
        }

        @Override
        public Operator getOp() {
            Operator operator = Operator.forNumber(this.op_);
            if (operator == null) {
                operator = Operator.UNRECOGNIZED;
            }
            return operator;
        }

        @Override
        public int getOpValue() {
            return this.op_;
        }

        @Override
        public OperandTypeCase getOperandTypeCase() {
            return OperandTypeCase.forNumber(this.operandTypeCase_);
        }

        @Override
        public boolean hasField() {
            return this.operandTypeCase_ == 2;
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<UnaryFilter, Builder>
        implements UnaryFilterOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearField() {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).clearField();
                return this;
            }

            public Builder clearOp() {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).clearOp();
                return this;
            }

            public Builder clearOperandType() {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).clearOperandType();
                return this;
            }

            @Override
            public FieldReference getField() {
                return ((UnaryFilter)this.instance).getField();
            }

            @Override
            public Operator getOp() {
                return ((UnaryFilter)this.instance).getOp();
            }

            @Override
            public int getOpValue() {
                return ((UnaryFilter)this.instance).getOpValue();
            }

            @Override
            public OperandTypeCase getOperandTypeCase() {
                return ((UnaryFilter)this.instance).getOperandTypeCase();
            }

            @Override
            public boolean hasField() {
                return ((UnaryFilter)this.instance).hasField();
            }

            public Builder mergeField(FieldReference fieldReference) {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).mergeField(fieldReference);
                return this;
            }

            public Builder setField(FieldReference.Builder builder) {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).setField((FieldReference)builder.build());
                return this;
            }

            public Builder setField(FieldReference fieldReference) {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).setField(fieldReference);
                return this;
            }

            public Builder setOp(Operator operator) {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).setOp(operator);
                return this;
            }

            public Builder setOpValue(int n) {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).setOpValue(n);
                return this;
            }
        }

    }

    public static interface UnaryFilterOrBuilder
    extends MessageLiteOrBuilder {
        public FieldReference getField();

        public UnaryFilter.Operator getOp();

        public int getOpValue();

        public UnaryFilter.OperandTypeCase getOperandTypeCase();

        public boolean hasField();
    }

}

