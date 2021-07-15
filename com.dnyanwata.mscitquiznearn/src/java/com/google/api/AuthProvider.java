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
package com.google.api;

import com.google.api.AuthProvider;
import com.google.api.AuthProviderOrBuilder;
import com.google.api.JwtLocation;
import com.google.api.JwtLocationOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class AuthProvider
extends GeneratedMessageLite<AuthProvider, Builder>
implements AuthProviderOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    private static final AuthProvider DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    public static final int JWT_LOCATIONS_FIELD_NUMBER = 6;
    private static volatile Parser<AuthProvider> PARSER;
    private String audiences_ = "";
    private String authorizationUrl_ = "";
    private String id_ = "";
    private String issuer_ = "";
    private String jwksUri_ = "";
    private Internal.ProtobufList<JwtLocation> jwtLocations_ = AuthProvider.emptyProtobufList();

    static {
        AuthProvider authProvider;
        DEFAULT_INSTANCE = authProvider = new AuthProvider();
        GeneratedMessageLite.registerDefaultInstance(AuthProvider.class, (GeneratedMessageLite)authProvider);
    }

    private AuthProvider() {
    }

    private void addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
        this.ensureJwtLocationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.jwtLocations_);
    }

    private void addJwtLocations(int n, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        this.ensureJwtLocationsIsMutable();
        this.jwtLocations_.add(n, (Object)jwtLocation);
    }

    private void addJwtLocations(JwtLocation jwtLocation) {
        jwtLocation.getClass();
        this.ensureJwtLocationsIsMutable();
        this.jwtLocations_.add((Object)jwtLocation);
    }

    private void clearAudiences() {
        this.audiences_ = AuthProvider.getDefaultInstance().getAudiences();
    }

    private void clearAuthorizationUrl() {
        this.authorizationUrl_ = AuthProvider.getDefaultInstance().getAuthorizationUrl();
    }

    private void clearId() {
        this.id_ = AuthProvider.getDefaultInstance().getId();
    }

    private void clearIssuer() {
        this.issuer_ = AuthProvider.getDefaultInstance().getIssuer();
    }

    private void clearJwksUri() {
        this.jwksUri_ = AuthProvider.getDefaultInstance().getJwksUri();
    }

    private void clearJwtLocations() {
        this.jwtLocations_ = AuthProvider.emptyProtobufList();
    }

    private void ensureJwtLocationsIsMutable() {
        Internal.ProtobufList<JwtLocation> protobufList = this.jwtLocations_;
        if (!protobufList.isModifiable()) {
            this.jwtLocations_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
    }

    public static AuthProvider getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AuthProvider authProvider) {
        return (Builder)DEFAULT_INSTANCE.createBuilder((GeneratedMessageLite)authProvider);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthProvider)AuthProvider.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider)AuthProvider.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthProvider parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static AuthProvider parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthProvider parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static AuthProvider parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthProvider parseFrom(InputStream inputStream) throws IOException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthProvider parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer);
    }

    public static AuthProvider parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteBuffer)byteBuffer, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthProvider parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static AuthProvider parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<AuthProvider> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeJwtLocations(int n) {
        this.ensureJwtLocationsIsMutable();
        this.jwtLocations_.remove(n);
    }

    private void setAudiences(String string) {
        string.getClass();
        this.audiences_ = string;
    }

    private void setAudiencesBytes(ByteString byteString) {
        AuthProvider.checkByteStringIsUtf8((ByteString)byteString);
        this.audiences_ = byteString.toStringUtf8();
    }

    private void setAuthorizationUrl(String string) {
        string.getClass();
        this.authorizationUrl_ = string;
    }

    private void setAuthorizationUrlBytes(ByteString byteString) {
        AuthProvider.checkByteStringIsUtf8((ByteString)byteString);
        this.authorizationUrl_ = byteString.toStringUtf8();
    }

    private void setId(String string) {
        string.getClass();
        this.id_ = string;
    }

    private void setIdBytes(ByteString byteString) {
        AuthProvider.checkByteStringIsUtf8((ByteString)byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setIssuer(String string) {
        string.getClass();
        this.issuer_ = string;
    }

    private void setIssuerBytes(ByteString byteString) {
        AuthProvider.checkByteStringIsUtf8((ByteString)byteString);
        this.issuer_ = byteString.toStringUtf8();
    }

    private void setJwksUri(String string) {
        string.getClass();
        this.jwksUri_ = string;
    }

    private void setJwksUriBytes(ByteString byteString) {
        AuthProvider.checkByteStringIsUtf8((ByteString)byteString);
        this.jwksUri_ = byteString.toStringUtf8();
    }

    private void setJwtLocations(int n, JwtLocation jwtLocation) {
        jwtLocation.getClass();
        this.ensureJwtLocationsIsMutable();
        this.jwtLocations_.set(n, (Object)jwtLocation);
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
                Parser<AuthProvider> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                Class<AuthProvider> class_ = AuthProvider.class;
                synchronized (AuthProvider.class) {
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
                Object[] arrobject = new Object[]{"id_", "issuer_", "jwksUri_", "audiences_", "authorizationUrl_", "jwtLocations_", JwtLocation.class};
                return AuthProvider.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)"\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u001b", (Object[])arrobject);
            }
            case 2: {
                return new Builder();
            }
            case 1: 
        }
        return new AuthProvider();
    }

    @Override
    public String getAudiences() {
        return this.audiences_;
    }

    @Override
    public ByteString getAudiencesBytes() {
        return ByteString.copyFromUtf8((String)this.audiences_);
    }

    @Override
    public String getAuthorizationUrl() {
        return this.authorizationUrl_;
    }

    @Override
    public ByteString getAuthorizationUrlBytes() {
        return ByteString.copyFromUtf8((String)this.authorizationUrl_);
    }

    @Override
    public String getId() {
        return this.id_;
    }

    @Override
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8((String)this.id_);
    }

    @Override
    public String getIssuer() {
        return this.issuer_;
    }

    @Override
    public ByteString getIssuerBytes() {
        return ByteString.copyFromUtf8((String)this.issuer_);
    }

    @Override
    public String getJwksUri() {
        return this.jwksUri_;
    }

    @Override
    public ByteString getJwksUriBytes() {
        return ByteString.copyFromUtf8((String)this.jwksUri_);
    }

    @Override
    public JwtLocation getJwtLocations(int n) {
        return (JwtLocation)this.jwtLocations_.get(n);
    }

    @Override
    public int getJwtLocationsCount() {
        return this.jwtLocations_.size();
    }

    @Override
    public List<JwtLocation> getJwtLocationsList() {
        return this.jwtLocations_;
    }

    public JwtLocationOrBuilder getJwtLocationsOrBuilder(int n) {
        return (JwtLocationOrBuilder)this.jwtLocations_.get(n);
    }

    public List<? extends JwtLocationOrBuilder> getJwtLocationsOrBuilderList() {
        return this.jwtLocations_;
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<AuthProvider, Builder>
    implements AuthProviderOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllJwtLocations(Iterable<? extends JwtLocation> iterable) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).addAllJwtLocations((Iterable<? extends JwtLocation>)iterable);
            return this;
        }

        public Builder addJwtLocations(int n, JwtLocation.Builder builder) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).addJwtLocations(n, (JwtLocation)builder.build());
            return this;
        }

        public Builder addJwtLocations(int n, JwtLocation jwtLocation) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).addJwtLocations(n, jwtLocation);
            return this;
        }

        public Builder addJwtLocations(JwtLocation.Builder builder) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).addJwtLocations((JwtLocation)builder.build());
            return this;
        }

        public Builder addJwtLocations(JwtLocation jwtLocation) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).addJwtLocations(jwtLocation);
            return this;
        }

        public Builder clearAudiences() {
            this.copyOnWrite();
            ((AuthProvider)this.instance).clearAudiences();
            return this;
        }

        public Builder clearAuthorizationUrl() {
            this.copyOnWrite();
            ((AuthProvider)this.instance).clearAuthorizationUrl();
            return this;
        }

        public Builder clearId() {
            this.copyOnWrite();
            ((AuthProvider)this.instance).clearId();
            return this;
        }

        public Builder clearIssuer() {
            this.copyOnWrite();
            ((AuthProvider)this.instance).clearIssuer();
            return this;
        }

        public Builder clearJwksUri() {
            this.copyOnWrite();
            ((AuthProvider)this.instance).clearJwksUri();
            return this;
        }

        public Builder clearJwtLocations() {
            this.copyOnWrite();
            ((AuthProvider)this.instance).clearJwtLocations();
            return this;
        }

        @Override
        public String getAudiences() {
            return ((AuthProvider)this.instance).getAudiences();
        }

        @Override
        public ByteString getAudiencesBytes() {
            return ((AuthProvider)this.instance).getAudiencesBytes();
        }

        @Override
        public String getAuthorizationUrl() {
            return ((AuthProvider)this.instance).getAuthorizationUrl();
        }

        @Override
        public ByteString getAuthorizationUrlBytes() {
            return ((AuthProvider)this.instance).getAuthorizationUrlBytes();
        }

        @Override
        public String getId() {
            return ((AuthProvider)this.instance).getId();
        }

        @Override
        public ByteString getIdBytes() {
            return ((AuthProvider)this.instance).getIdBytes();
        }

        @Override
        public String getIssuer() {
            return ((AuthProvider)this.instance).getIssuer();
        }

        @Override
        public ByteString getIssuerBytes() {
            return ((AuthProvider)this.instance).getIssuerBytes();
        }

        @Override
        public String getJwksUri() {
            return ((AuthProvider)this.instance).getJwksUri();
        }

        @Override
        public ByteString getJwksUriBytes() {
            return ((AuthProvider)this.instance).getJwksUriBytes();
        }

        @Override
        public JwtLocation getJwtLocations(int n) {
            return ((AuthProvider)this.instance).getJwtLocations(n);
        }

        @Override
        public int getJwtLocationsCount() {
            return ((AuthProvider)this.instance).getJwtLocationsCount();
        }

        @Override
        public List<JwtLocation> getJwtLocationsList() {
            return Collections.unmodifiableList(((AuthProvider)this.instance).getJwtLocationsList());
        }

        public Builder removeJwtLocations(int n) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).removeJwtLocations(n);
            return this;
        }

        public Builder setAudiences(String string) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setAudiences(string);
            return this;
        }

        public Builder setAudiencesBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setAudiencesBytes(byteString);
            return this;
        }

        public Builder setAuthorizationUrl(String string) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setAuthorizationUrl(string);
            return this;
        }

        public Builder setAuthorizationUrlBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setAuthorizationUrlBytes(byteString);
            return this;
        }

        public Builder setId(String string) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setId(string);
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setIdBytes(byteString);
            return this;
        }

        public Builder setIssuer(String string) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setIssuer(string);
            return this;
        }

        public Builder setIssuerBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setIssuerBytes(byteString);
            return this;
        }

        public Builder setJwksUri(String string) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setJwksUri(string);
            return this;
        }

        public Builder setJwksUriBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setJwksUriBytes(byteString);
            return this;
        }

        public Builder setJwtLocations(int n, JwtLocation.Builder builder) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setJwtLocations(n, (JwtLocation)builder.build());
            return this;
        }

        public Builder setJwtLocations(int n, JwtLocation jwtLocation) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setJwtLocations(n, jwtLocation);
            return this;
        }
    }

}

