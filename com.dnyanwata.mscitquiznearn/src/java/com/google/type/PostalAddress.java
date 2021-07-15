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
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.type.PostalAddress$1
 *  com.google.type.PostalAddressOrBuilder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.ByteBuffer
 *  java.util.Collections
 *  java.util.List
 */
package com.google.type;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.type.PostalAddress;
import com.google.type.PostalAddressOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class PostalAddress
extends GeneratedMessageLite<PostalAddress, Builder>
implements PostalAddressOrBuilder {
    public static final int ADDRESS_LINES_FIELD_NUMBER = 9;
    public static final int ADMINISTRATIVE_AREA_FIELD_NUMBER = 6;
    private static final PostalAddress DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int LOCALITY_FIELD_NUMBER = 7;
    public static final int ORGANIZATION_FIELD_NUMBER = 11;
    private static volatile Parser<PostalAddress> PARSER;
    public static final int POSTAL_CODE_FIELD_NUMBER = 4;
    public static final int RECIPIENTS_FIELD_NUMBER = 10;
    public static final int REGION_CODE_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 1;
    public static final int SORTING_CODE_FIELD_NUMBER = 5;
    public static final int SUBLOCALITY_FIELD_NUMBER = 8;
    private Internal.ProtobufList<String> addressLines_ = GeneratedMessageLite.emptyProtobufList();
    private String administrativeArea_ = "";
    private String languageCode_ = "";
    private String locality_ = "";
    private String organization_ = "";
    private String postalCode_ = "";
    private Internal.ProtobufList<String> recipients_ = GeneratedMessageLite.emptyProtobufList();
    private String regionCode_ = "";
    private int revision_;
    private String sortingCode_ = "";
    private String sublocality_ = "";

    static {
        PostalAddress postalAddress;
        DEFAULT_INSTANCE = postalAddress = new PostalAddress();
        GeneratedMessageLite.registerDefaultInstance(PostalAddress.class, (GeneratedMessageLite)postalAddress);
    }

    private PostalAddress() {
    }

    private void addAddressLines(String string) {
        string.getClass();
        this.ensureAddressLinesIsMutable();
        this.addressLines_.add((Object)string);
    }

    private void addAddressLinesBytes(ByteString byteString) {
        PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
        this.ensureAddressLinesIsMutable();
        this.addressLines_.add((Object)byteString.toStringUtf8());
    }

    private void addAllAddressLines(Iterable<String> iterable) {
        this.ensureAddressLinesIsMutable();
        AbstractMessageLite.addAll(iterable, this.addressLines_);
    }

    private void addAllRecipients(Iterable<String> iterable) {
        this.ensureRecipientsIsMutable();
        AbstractMessageLite.addAll(iterable, this.recipients_);
    }

    private void addRecipients(String string) {
        string.getClass();
        this.ensureRecipientsIsMutable();
        this.recipients_.add((Object)string);
    }

    private void addRecipientsBytes(ByteString byteString) {
        PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
        this.ensureRecipientsIsMutable();
        this.recipients_.add((Object)byteString.toStringUtf8());
    }

    private void clearAddressLines() {
        this.addressLines_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearAdministrativeArea() {
        this.administrativeArea_ = PostalAddress.getDefaultInstance().getAdministrativeArea();
    }

    private void clearLanguageCode() {
        this.languageCode_ = PostalAddress.getDefaultInstance().getLanguageCode();
    }

    private void clearLocality() {
        this.locality_ = PostalAddress.getDefaultInstance().getLocality();
    }

    private void clearOrganization() {
        this.organization_ = PostalAddress.getDefaultInstance().getOrganization();
    }

    private void clearPostalCode() {
        this.postalCode_ = PostalAddress.getDefaultInstance().getPostalCode();
    }

    private void clearRecipients() {
        this.recipients_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRegionCode() {
        this.regionCode_ = PostalAddress.getDefaultInstance().getRegionCode();
    }

    private void clearRevision() {
        this.revision_ = 0;
    }

    private void clearSortingCode() {
        this.sortingCode_ = PostalAddress.getDefaultInstance().getSortingCode();
    }

    private void clearSublocality() {
        this.sublocality_ = PostalAddress.getDefaultInstance().getSublocality();
    }

    private void ensureAddressLinesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.addressLines_;
        if (!protobufList.isModifiable()) {
            this.addressLines_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    private void ensureRecipientsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.recipients_;
        if (!protobufList.isModifiable()) {
            this.recipients_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static PostalAddress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(PostalAddress postalAddress) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)postalAddress);
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PostalAddress)PostalAddress.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostalAddress)PostalAddress.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static PostalAddress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static PostalAddress parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static PostalAddress parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static PostalAddress parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static PostalAddress parseFrom(InputStream inputStream) throws IOException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static PostalAddress parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static PostalAddress parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static PostalAddress parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<PostalAddress> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAddressLines(int n, String string) {
        string.getClass();
        this.ensureAddressLinesIsMutable();
        this.addressLines_.set(n, (Object)string);
    }

    private void setAdministrativeArea(String string) {
        string.getClass();
        this.administrativeArea_ = string;
    }

    private void setAdministrativeAreaBytes(ByteString byteString) {
        PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
        this.administrativeArea_ = byteString.toStringUtf8();
    }

    private void setLanguageCode(String string) {
        string.getClass();
        this.languageCode_ = string;
    }

    private void setLanguageCodeBytes(ByteString byteString) {
        PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
        this.languageCode_ = byteString.toStringUtf8();
    }

    private void setLocality(String string) {
        string.getClass();
        this.locality_ = string;
    }

    private void setLocalityBytes(ByteString byteString) {
        PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
        this.locality_ = byteString.toStringUtf8();
    }

    private void setOrganization(String string) {
        string.getClass();
        this.organization_ = string;
    }

    private void setOrganizationBytes(ByteString byteString) {
        PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
        this.organization_ = byteString.toStringUtf8();
    }

    private void setPostalCode(String string) {
        string.getClass();
        this.postalCode_ = string;
    }

    private void setPostalCodeBytes(ByteString byteString) {
        PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
        this.postalCode_ = byteString.toStringUtf8();
    }

    private void setRecipients(int n, String string) {
        string.getClass();
        this.ensureRecipientsIsMutable();
        this.recipients_.set(n, (Object)string);
    }

    private void setRegionCode(String string) {
        string.getClass();
        this.regionCode_ = string;
    }

    private void setRegionCodeBytes(ByteString byteString) {
        PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
        this.regionCode_ = byteString.toStringUtf8();
    }

    private void setRevision(int n) {
        this.revision_ = n;
    }

    private void setSortingCode(String string) {
        string.getClass();
        this.sortingCode_ = string;
    }

    private void setSortingCodeBytes(ByteString byteString) {
        PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
        this.sortingCode_ = byteString.toStringUtf8();
    }

    private void setSublocality(String string) {
        string.getClass();
        this.sublocality_ = string;
    }

    private void setSublocalityBytes(ByteString byteString) {
        PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
        this.sublocality_ = byteString.toStringUtf8();
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
                Parser<PostalAddress> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<PostalAddress> class_ = PostalAddress.class;
                synchronized (PostalAddress.class) {
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
                Object[] arrobject = new Object[]{"revision_", "regionCode_", "languageCode_", "postalCode_", "sortingCode_", "administrativeArea_", "locality_", "sublocality_", "addressLines_", "recipients_", "organization_"};
                return PostalAddress.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u021a\n\u021a\u000b\u0208", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new PostalAddress();
    }

    public String getAddressLines(int n) {
        return (String)this.addressLines_.get(n);
    }

    public ByteString getAddressLinesBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.addressLines_.get(n)));
    }

    public int getAddressLinesCount() {
        return this.addressLines_.size();
    }

    public List<String> getAddressLinesList() {
        return this.addressLines_;
    }

    public String getAdministrativeArea() {
        return this.administrativeArea_;
    }

    public ByteString getAdministrativeAreaBytes() {
        return ByteString.copyFromUtf8((String)this.administrativeArea_);
    }

    public String getLanguageCode() {
        return this.languageCode_;
    }

    public ByteString getLanguageCodeBytes() {
        return ByteString.copyFromUtf8((String)this.languageCode_);
    }

    public String getLocality() {
        return this.locality_;
    }

    public ByteString getLocalityBytes() {
        return ByteString.copyFromUtf8((String)this.locality_);
    }

    public String getOrganization() {
        return this.organization_;
    }

    public ByteString getOrganizationBytes() {
        return ByteString.copyFromUtf8((String)this.organization_);
    }

    public String getPostalCode() {
        return this.postalCode_;
    }

    public ByteString getPostalCodeBytes() {
        return ByteString.copyFromUtf8((String)this.postalCode_);
    }

    public String getRecipients(int n) {
        return (String)this.recipients_.get(n);
    }

    public ByteString getRecipientsBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.recipients_.get(n)));
    }

    public int getRecipientsCount() {
        return this.recipients_.size();
    }

    public List<String> getRecipientsList() {
        return this.recipients_;
    }

    public String getRegionCode() {
        return this.regionCode_;
    }

    public ByteString getRegionCodeBytes() {
        return ByteString.copyFromUtf8((String)this.regionCode_);
    }

    public int getRevision() {
        return this.revision_;
    }

    public String getSortingCode() {
        return this.sortingCode_;
    }

    public ByteString getSortingCodeBytes() {
        return ByteString.copyFromUtf8((String)this.sortingCode_);
    }

    public String getSublocality() {
        return this.sublocality_;
    }

    public ByteString getSublocalityBytes() {
        return ByteString.copyFromUtf8((String)this.sublocality_);
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<PostalAddress, Builder>
    implements PostalAddressOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAddressLines(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).addAddressLines(string);
            return this;
        }

        public Builder addAddressLinesBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).addAddressLinesBytes(byteString);
            return this;
        }

        public Builder addAllAddressLines(Iterable<String> iterable) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).addAllAddressLines((Iterable<String>)iterable);
            return this;
        }

        public Builder addAllRecipients(Iterable<String> iterable) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).addAllRecipients((Iterable<String>)iterable);
            return this;
        }

        public Builder addRecipients(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).addRecipients(string);
            return this;
        }

        public Builder addRecipientsBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).addRecipientsBytes(byteString);
            return this;
        }

        public Builder clearAddressLines() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearAddressLines();
            return this;
        }

        public Builder clearAdministrativeArea() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearAdministrativeArea();
            return this;
        }

        public Builder clearLanguageCode() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearLanguageCode();
            return this;
        }

        public Builder clearLocality() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearLocality();
            return this;
        }

        public Builder clearOrganization() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearOrganization();
            return this;
        }

        public Builder clearPostalCode() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearPostalCode();
            return this;
        }

        public Builder clearRecipients() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearRecipients();
            return this;
        }

        public Builder clearRegionCode() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearRegionCode();
            return this;
        }

        public Builder clearRevision() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearRevision();
            return this;
        }

        public Builder clearSortingCode() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearSortingCode();
            return this;
        }

        public Builder clearSublocality() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearSublocality();
            return this;
        }

        public String getAddressLines(int n) {
            return ((PostalAddress)this.instance).getAddressLines(n);
        }

        public ByteString getAddressLinesBytes(int n) {
            return ((PostalAddress)this.instance).getAddressLinesBytes(n);
        }

        public int getAddressLinesCount() {
            return ((PostalAddress)this.instance).getAddressLinesCount();
        }

        public List<String> getAddressLinesList() {
            return Collections.unmodifiableList(((PostalAddress)this.instance).getAddressLinesList());
        }

        public String getAdministrativeArea() {
            return ((PostalAddress)this.instance).getAdministrativeArea();
        }

        public ByteString getAdministrativeAreaBytes() {
            return ((PostalAddress)this.instance).getAdministrativeAreaBytes();
        }

        public String getLanguageCode() {
            return ((PostalAddress)this.instance).getLanguageCode();
        }

        public ByteString getLanguageCodeBytes() {
            return ((PostalAddress)this.instance).getLanguageCodeBytes();
        }

        public String getLocality() {
            return ((PostalAddress)this.instance).getLocality();
        }

        public ByteString getLocalityBytes() {
            return ((PostalAddress)this.instance).getLocalityBytes();
        }

        public String getOrganization() {
            return ((PostalAddress)this.instance).getOrganization();
        }

        public ByteString getOrganizationBytes() {
            return ((PostalAddress)this.instance).getOrganizationBytes();
        }

        public String getPostalCode() {
            return ((PostalAddress)this.instance).getPostalCode();
        }

        public ByteString getPostalCodeBytes() {
            return ((PostalAddress)this.instance).getPostalCodeBytes();
        }

        public String getRecipients(int n) {
            return ((PostalAddress)this.instance).getRecipients(n);
        }

        public ByteString getRecipientsBytes(int n) {
            return ((PostalAddress)this.instance).getRecipientsBytes(n);
        }

        public int getRecipientsCount() {
            return ((PostalAddress)this.instance).getRecipientsCount();
        }

        public List<String> getRecipientsList() {
            return Collections.unmodifiableList(((PostalAddress)this.instance).getRecipientsList());
        }

        public String getRegionCode() {
            return ((PostalAddress)this.instance).getRegionCode();
        }

        public ByteString getRegionCodeBytes() {
            return ((PostalAddress)this.instance).getRegionCodeBytes();
        }

        public int getRevision() {
            return ((PostalAddress)this.instance).getRevision();
        }

        public String getSortingCode() {
            return ((PostalAddress)this.instance).getSortingCode();
        }

        public ByteString getSortingCodeBytes() {
            return ((PostalAddress)this.instance).getSortingCodeBytes();
        }

        public String getSublocality() {
            return ((PostalAddress)this.instance).getSublocality();
        }

        public ByteString getSublocalityBytes() {
            return ((PostalAddress)this.instance).getSublocalityBytes();
        }

        public Builder setAddressLines(int n, String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setAddressLines(n, string);
            return this;
        }

        public Builder setAdministrativeArea(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setAdministrativeArea(string);
            return this;
        }

        public Builder setAdministrativeAreaBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setAdministrativeAreaBytes(byteString);
            return this;
        }

        public Builder setLanguageCode(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setLanguageCode(string);
            return this;
        }

        public Builder setLanguageCodeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setLanguageCodeBytes(byteString);
            return this;
        }

        public Builder setLocality(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setLocality(string);
            return this;
        }

        public Builder setLocalityBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setLocalityBytes(byteString);
            return this;
        }

        public Builder setOrganization(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setOrganization(string);
            return this;
        }

        public Builder setOrganizationBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setOrganizationBytes(byteString);
            return this;
        }

        public Builder setPostalCode(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setPostalCode(string);
            return this;
        }

        public Builder setPostalCodeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setPostalCodeBytes(byteString);
            return this;
        }

        public Builder setRecipients(int n, String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setRecipients(n, string);
            return this;
        }

        public Builder setRegionCode(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setRegionCode(string);
            return this;
        }

        public Builder setRegionCodeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setRegionCodeBytes(byteString);
            return this;
        }

        public Builder setRevision(int n) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setRevision(n);
            return this;
        }

        public Builder setSortingCode(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setSortingCode(string);
            return this;
        }

        public Builder setSortingCodeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setSortingCodeBytes(byteString);
            return this;
        }

        public Builder setSublocality(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setSublocality(string);
            return this;
        }

        public Builder setSublocalityBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setSublocalityBytes(byteString);
            return this;
        }
    }

}

