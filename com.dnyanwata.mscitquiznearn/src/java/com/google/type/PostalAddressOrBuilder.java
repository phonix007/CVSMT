/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface PostalAddressOrBuilder
extends MessageLiteOrBuilder {
    public String getAddressLines(int var1);

    public ByteString getAddressLinesBytes(int var1);

    public int getAddressLinesCount();

    public List<String> getAddressLinesList();

    public String getAdministrativeArea();

    public ByteString getAdministrativeAreaBytes();

    public String getLanguageCode();

    public ByteString getLanguageCodeBytes();

    public String getLocality();

    public ByteString getLocalityBytes();

    public String getOrganization();

    public ByteString getOrganizationBytes();

    public String getPostalCode();

    public ByteString getPostalCodeBytes();

    public String getRecipients(int var1);

    public ByteString getRecipientsBytes(int var1);

    public int getRecipientsCount();

    public List<String> getRecipientsList();

    public String getRegionCode();

    public ByteString getRegionCodeBytes();

    public int getRevision();

    public String getSortingCode();

    public ByteString getSortingCodeBytes();

    public String getSublocality();

    public ByteString getSublocalityBytes();
}

