/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Int32Value
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Cursor;
import com.google.firestore.v1.StructuredQuery;
import com.google.protobuf.Int32Value;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface StructuredQueryOrBuilder
extends MessageLiteOrBuilder {
    public Cursor getEndAt();

    public StructuredQuery.CollectionSelector getFrom(int var1);

    public int getFromCount();

    public List<StructuredQuery.CollectionSelector> getFromList();

    public Int32Value getLimit();

    public int getOffset();

    public StructuredQuery.Order getOrderBy(int var1);

    public int getOrderByCount();

    public List<StructuredQuery.Order> getOrderByList();

    public StructuredQuery.Projection getSelect();

    public Cursor getStartAt();

    public StructuredQuery.Filter getWhere();

    public boolean hasEndAt();

    public boolean hasLimit();

    public boolean hasSelect();

    public boolean hasStartAt();

    public boolean hasWhere();
}

